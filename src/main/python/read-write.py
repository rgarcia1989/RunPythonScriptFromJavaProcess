def write_new_file(contents):
    file = open("./newTestFile.txt", "w+")
    file.write(contents)
    file.close()


def main():
    print("Hello World! We are about to read a file and create a new one from its content.")

    file = open("C:/Projects/Java/RunPythonScriptFromJavaProcess/src/main/resources/test.txt", "r")
    if file.mode == 'r':
        contents = file.read()
        print("File content is the following: \n" + contents)

    write_new_file(contents)
    print("New file created!")


# add a function to throw some error condition

if __name__ == '__main__':
    main()