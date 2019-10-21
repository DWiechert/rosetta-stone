i1 = ARGV[0].to_i
i2 = ARGV[1].to_i

if (i1 < i2) then
  puts "#{i1} is less than #{i2}."
elsif (i1 == i2)
  puts "#{i1} is equal to #{i2}."
else
  puts "#{i1} is greater than #{i2}."
end
