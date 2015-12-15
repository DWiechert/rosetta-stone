import sys

def main():
    i1 = sys.argv[1]
    i2 = sys.argv[2]
    if i1 < i2: print('%s is less than %s.' % (i1, i2))
    if i1 == i2: print('%s is equal to %s.' % (i1, i2))
    if i1 > i2: print('%s is greather than %s.' % (i1, i2))

if __name__ == "__main__":
    main()
