# Arithmetic operation functions
def add(a, b):
    return a + b

def subtract(a, b):
    return a - b

def multiply(a, b):
    return a * b

def divide(a, b):
    try:
        return a / b
    except ZeroDivisionError:
        print("float division by zero")
        return None

def power(a, b):
    return a ** b

def remainder(a, b):
    try:
        return a % b
    except ZeroDivisionError:
        print("float division by zero")
        return None

# Operation selector and input handler
def select_op(choice):
    if choice == '#':
        return -1
    elif choice in ('+', '-', '*', '/', '^', '%'):
        while True:
            a = input("Enter first number: ")
            print(a)
            if a == '$':
                return
            if a=="#":
                return -1
            try:
                a = float(a)
                break
            except ValueError:
                return

        while True:
            b = input("Enter second number: ")
            print(b)
            if b == '$':
                return
            if b=="#":
                return -1
            try:
                b = float(b)
                break
            except ValueError:
                return

        result = None
        if choice == '+':
            result = add(a, b)
        elif choice == '-':
            result = subtract(a, b)
        elif choice == '*':
            result = multiply(a, b)
        elif choice == '/':
            result = divide(a, b)
        elif choice == '^':
            result = power(a, b)
        elif choice == '%':
            result = remainder(a, b)

        print(f"{a} {choice} {b} = {result}")

    elif choice == '$':
        return
    else:
        print("Unrecognized operation")

# Main loop - do not modify
while True:
    print("Select operation.")
    print("1.Add      : +")
    print("2.Subtract : -")
    print("3.Multiply : *")
    print("4.Divide   : /")
    print("5.Power    : ^")
    print("6.Remainder: %")
    print("7.Terminate: #")
    print("8.Reset    : $")
    

    choice = input("Enter choice(+,-,*,/,^,%,#,$): ")
    print(choice)
    if select_op(choice) == -1:
        print("Done. Terminating")
        exit()