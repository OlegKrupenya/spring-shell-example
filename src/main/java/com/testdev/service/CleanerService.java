package com.testdev.service;

import org.springframework.stereotype.Service;

import java.io.File;
import java.util.Arrays;

/**
 * @author Oleg Krupenya
 */
@Service
public class CleanerService {
    public void clean(String path) {
        File dir = new File(path);
        removeFiles(dir);
    }

    private void removeFiles(File file) {
        if (file == null) {
            return;
        }
        File[] files = file.listFiles();
        if (files != null) {
            Arrays.stream(files).forEach(this::removeFiles);
        }
        if (!file.isDirectory() || file.isDirectory() && file.listFiles() != null && file.listFiles().length == 0) {
            file.delete();
        }
    }
}
