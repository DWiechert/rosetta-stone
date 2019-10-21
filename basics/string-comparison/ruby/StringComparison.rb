s1 = ARGV[0]
s2 = ARGV[1]

if (s1 == s2) then
	puts("'#{s1}' is equal to '#{s2}' with case.");
end
if (s1.downcase == s2.downcase) then
	puts("'#{s1}' is equal to '#{s2}' without case.");
end

if (s1 < s2) then
	puts("'#{s1}' is lexically before '#{s2}'.");
end
if (s1 == s2) then
	puts("'#{s1}' is lexically equal to '#{s2}'.");
end
if (s1 > s2) then
	puts("'#{s1}' is lexically after '#{s2}'.");
end