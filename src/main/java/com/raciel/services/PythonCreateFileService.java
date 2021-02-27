package com.raciel.services;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class PythonCreateFileService {

    public String createNewFile() throws IOException, InterruptedException {
        ProcessBuilder pb = new ProcessBuilder("C:/Program Files/python.exe", "C:/Projects/Java/RunPythonScriptFromJavaProcess/src/main/python/read-write.py");
        pb.redirectErrorStream(true);

        Process process = pb.start();

        int statusCode = process.waitFor();

        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        StringBuilder builder = new StringBuilder();
        String line = null;
        while ( (line = reader.readLine()) != null) {
            builder.append(line);
            builder.append(System.getProperty("line.separator"));
        }
        String result = builder.toString();

        return result;
    }
}
