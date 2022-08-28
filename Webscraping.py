import pandas as pd, numpy as np, bs4, requests

def hasNum(input):
    for num in (0, 1, 2, 3, 4, 5, 6, 7, 8, 9):
        if str(num) in input:
            return True
    return False
menuItems = []
allLines = []
html = requests.get("https://gongchausa.com/our-tea/").text
Soup = bs4.BeautifulSoup(html, "html.parser")
Text = Soup.getText()
menu = pd.DataFrame()
print(type(Text))
item = []
for line in Text.split("\n"):
    if line != "":
        #if "free" in line.lower():
        print(line)
        if hasNum(line):
            item.append(line)
        else:
            if len(item) == 4:
                menuItems.append(item)
            allLines.append(item)
            item = []
            item.append(line)

df = pd.DataFrame(columns=("Tea", "Medium Cost", "Large Cost", "Calories"))
for line in menuItems:
    line[1] = float(line[1][1:])
    line[2] = float(line[2][1:])
    df.loc[len(df.index)] = line

with pd.ExcelWriter("Boba Prices.xlsx") as writer:  
    df.to_excel(writer, sheet_name='GongCha')

