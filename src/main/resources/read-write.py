def write_new_file(contents):
    file = open("./newTestFile.txt", "w+")
    file.write(contents)
    file.close()


def main():
    file = open("C:/Projects/Java/RunPythonScriptFromJavaProcess/src/main/resources/test.txt", "r")
    if file.mode == 'r':
        contents = file.read()

    write_new_file(contents)

if __name__ == '__main__':
    main()
