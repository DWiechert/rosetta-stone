import sys

def main():
    s1 = sys.argv[1]
    s2 = sys.argv[2]
    if s1 == s2: print('\'%s\' is equal to \'%s\' with case.' % (s1, s2))
    if s1.lower() == s2.lower(): print('\'%s\' is equal to \'%s\' without case.' % (s1, s2))
    if s1 < s2: print('\'%s\' is lexically before \'%s\'.' % (s1, s2))
    if s1 == s2: print('\'%s\' is lexically equal to \'%s\'.' % (s1, s2))
    if s1 > s2: print('\'%s\' is lexically after \'%s\'.' % (s1, s2))

if __name__ == "__main__":
    main()
