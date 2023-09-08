package p981ie;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

/* renamed from: ie.c */
public class C87698c implements FileFilter {
    public boolean accept(File file) {
        return Pattern.matches("cpu[0-9]+", file.getName());
    }
}
