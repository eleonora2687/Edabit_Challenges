# Longest Alternating Substring

# Given a string of digits, return the longest substring with alternating odd/even or even/odd digits. If two or more substrings have the same length, return the substring that occurs first.


def longest_substring(digits):
	max_len = 0
	ans = ''
	for i in range(len(digits)):
		temp = digits[i]
		for x in range(i+1, len(digits)):
			if int(digits[x])%2 != int(digits[x-1])%2:
				temp += digits[x]
			else:
				break
		if len(temp) > max_len:
			max_len = len(temp)
			ans = temp
	return ans

print(longest_substring("844929328912985315632725682153"))
print(longest_substring("769697538272129475593767931733"))
print(longest_substring("937948289456111258444958189244"))
print(longest_substring("736237766362158694825822899262"))
print(longest_substring("369715978955362655737322836233"))
print(longest_substring("345724969853525333273796592356"))
print(longest_substring("548915548581127334254139969136"))
print(longest_substring("417922164857852157775176959188"))
print(longest_substring("251346385699223913113161144327"))
print(longest_substring("483563951878576456268539849244"))
print(longest_substring("853667717122615664748443484823"))
print(longest_substring("398785511683322662883368457392"))
print(longest_substring("368293545763611759335443678239"))
print(longest_substring("775195358448494712934755311372"))
print(longest_substring("646113733929969155976523363762"))
print(longest_substring("575337321726324966478369152265"))
print(longest_substring("754388489999793138912431545258"))
print(longest_substring("198644286258141856918653955964"))
print(longest_substring("643349187319779695864213682274"))
print(longest_substring("919331281193713636178478295857"))
print(longest_substring("2846286484444288886666448822244466688822247"))
