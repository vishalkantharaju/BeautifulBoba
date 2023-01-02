import pandas as pd, numpy as np, bs4, requests
from selenium import webdriver
from textblob import TextBlob

def hasNum(input):
    for num in (0, 1, 2, 3, 4, 5, 6, 7, 8, 9):
        if str(num) in input:
            return True
    return False
#
menuItems = []
allLines = []
html = requests.get("https://gongchausa.com/our-tea/").text
Soup = bs4.BeautifulSoup(html, "html.parser")
Text = Soup.getText()
menu = pd.DataFrame()
item = []
for line in Text.split("\n"):
    if line != "":
        #if "free" in line.lower():
        if hasNum(line):
            item.append(line)
        else:
            if len(item) == 4:
                menuItems.append(item)
            allLines.append(item)
            item = []
            item.append(line)
df = pd.DataFrame(columns=("Drink", "Medium Cost", "Large Cost", "Calories"))
for line in menuItems:
    line[1] = float(line[1][1:])
    line[2] = float(line[2][1:])
    df.loc[len(df.index)] = line
df1 = df
# with pd.ExcelWriter("Boba Prices.xlsx") as writer:
#     df.to_excel(writer, sheet_name='GongCha')

# https://www.tapiocahouseaustin.com/drink-menu
menuItems = []
allLines = []
html = requests.get("https://www.tapiocahouseaustin.com/drink-menu").text
Soup = bs4.BeautifulSoup(html, "html.parser")
Text = Soup.getText()
menu = pd.DataFrame()
item = []
tempLine = ""
temp = False
temp1 = False
for line in Text.split("\n"):
    if line != "":
        if temp:
            tempLine = line
            temp1 = True
            temp = False
        elif temp1:
            for word in tempLine.split(", "):
                item = []
                if word == '$5.50 ':
                    item.append("Egg Coffee")
                    item.append(word)
                else:
                    item.append(word)
                    item.append(line)
                menuItems.append(item)
            temp1 = False
        elif ("Milk Tea" in line and ("$3" not in line)) or "Classic Tea" in line or \
                "Slushie/Smoothie"\
                in line or ("Coffee" in line and "Tapioca" not in line and "Coffees" not in line):
            temp = True;
df = pd.DataFrame(columns=("Drink", "Cost"))
for line in menuItems:
    line[1] = float(line[1][1:])
    # line[2] = float(line[2][1:])
    df.loc[len(df.index)] = line

#

# https://www.grubhub.com/food/moge_tee/menu

menuItems = []
allLines = []
driverPath = '/path/to/chromedriver'
driver = webdriver.Chrome(driverPath)
url = "https://order.online/store/tsaocaa-ut-austin-austin-24458825/?hideModal=true&pickup=true"
driver.get(url)
html = driver.execute_script('return document.body.innerHTML')
# html = requests.get("https://order.online/store/tsaocaa-ut-austin-austin-24458825/?hideModal=true&pickup=true").text
Soup = bs4.BeautifulSoup(html, "html.parser")
Text = Soup.getText()
menu = pd.DataFrame()
# print(Text)
# print(type(Text))
item = []
bool = False
read = ""
name = ""
looking = False
count = 0
# for char in Text.split(""):
# print(Text)
for index in range(0, len(Text)):
    char = Text[index]
    # print(char)
    read = read + char
    if bool:
        if char == '/':
            name = read[0:(len(read) - 1)]
            read = ""
        elif char == '$':
            read = ""
            looking = True
            count = 4
        elif looking:
            count = count - 1
            if count == 0:
                item = []
                if name.find("Add") != -1:
                    name = name[3:]
                item.append(name)
                item.append(read)
                menuItems.append(item)
                # print(item)
                name = ""
                read = ""
                looking = False
        elif char == '.':
            if read[len(read) - 2] != 'w':
                read = ""
        if char > u'\u4e00' and char < u'\u9fff':
            if len(read) > 3:
                name = read[0:(len(read) - 1)]
            read = ""
    elif read.find("Brown") != -1:
        bool = True
        read = "Brown"
# print(menuItems)
df2 = pd.DataFrame(columns=("Drink", "Cost"))
for line in menuItems:
    # line[1] = float(line[1][1:])
#     line[2] = float(line[2][1:])
    df2.loc[len(df2.index)] = line

with pd.ExcelWriter("Boba_Prices.xlsx") as writer:
    df.to_excel(writer, sheet_name='TapiocaHouse')
    df1.to_excel(writer, sheet_name='GongCha')
    df2.to_excel(writer, sheet_name='Tsaocaa')