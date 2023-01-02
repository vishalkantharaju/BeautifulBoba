import pandas as pd

xlsx = pd.ExcelFile("Boba_Prices1.xlsx")
sheetNames = xlsx.sheet_names
# cols = ['Name', 'Min Price', 'Max Price', 'Rating', 'Dairy Free', 'Caffeine Free']
# results = {'Name': [], 'Min Price': [], 'Max Price': [], 'Rating': [], 'Dairy Free': [],
#            'Caffeine Free': []}
p = open("final.txt", "x")
for stri in sheetNames:
    # results[cols[0]].append(str)
    p.write(stri)
    p.write("|")
    curSheet = pd.read_excel(xlsx, stri)
    prices = curSheet.iloc[:,2]
    min = 100000
    max = 0
    for i in prices:
        if i > max:
            max = i
        if i < min:
            min = i
    # results[cols[1]].append(min)
    p.write(str(min))
    p.write("|")
    # results[cols[2]].append(max)
    p.write(str(max))
    p.write("|")
    # results[cols[3]].append(curSheet.iloc[:,3][0])
    p.write(str(curSheet.iloc[:,3][0]))
    p.write("|")
    # results[cols[4]].append(curSheet.iloc[:,4][0])
    p.write(str(curSheet.iloc[:,4][0]))
    p.write("|")
    # results[cols[5]].append(curSheet.iloc[:,5][0])
    p.write(str(curSheet.iloc[:,5][0]))
    p.write("|")
    # print(prices)
    p.write("\n")


print("success")
# print(results)
