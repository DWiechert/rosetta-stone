import sys

def main():
    print('%s arguments were provided:' % (len(sys.argv) - 1))
    for x in sys.argv[1:]:
        print(x)

if __name__ == "__main__":
    main()
