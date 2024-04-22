def interview(lst, tot):
    if len(lst)!=8:
        return "disqualified"
    else:
        qualified=True
        for i in range(4):
            if i==0:
                if lst[i]>5 or lst[i+1]>5:
                    qualified=False
                    break
            elif i==2:
                if lst[i]>10 or lst[i+1]>10:
                    qualified=False
                    break
            elif i==4:
                if lst[i]>15 or lst[i+1]>15:
                    qualified=False
                    break
            else:
                if lst[i]>20 or lst[i+1]>20:
                    qualified=False
                    break
    if qualified==True:
        if tot<121:
            return "qualified"
        return "disqualified"
    return "disqualified"


print(interview([5, 5, 10, 10, 15, 15, 20, 20], 120))
print(interview([2, 3, 8, 6, 5, 12, 10, 18], 64))
print(interview([5, 5, 10, 10, 25, 15, 20, 20], 120))
print(interview([5, 5, 10, 10, 15, 15, 20], 120))
print(interview([5, 5, 10, 10, 15, 15, 20, 20], 130))

                