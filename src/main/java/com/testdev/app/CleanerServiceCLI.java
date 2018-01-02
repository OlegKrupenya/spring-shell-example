package com.testdev.app;

import com.testdev.service.CleanerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.core.CommandMarker;
import org.springframework.shell.core.annotation.CliCommand;
import org.springframework.shell.core.annotation.CliOption;
import org.springframework.stereotype.Component;

@Component
public class CleanerServiceCLI implements CommandMarker {

    @Autowired
    private CleanerService service;

    @CliCommand(value = { "clean" })
    public String webSave(
            @CliOption(key = "path") String path) {
        service.clean(path);
        return "Done.";
    }
}