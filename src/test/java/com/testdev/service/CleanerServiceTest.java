package com.testdev.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Oleg Krupenya
 */
public class CleanerServiceTest {
    private CleanerService service;

    @Before
    public void setUp() {
        this.service = new CleanerService();
    }

    @After
    public void tearDown() {
        this.service = null;
    }

    @Test
    public void shouldRemove() {
        this.service.clean("D:\\dev\\projects\\testdata");
    }
}
