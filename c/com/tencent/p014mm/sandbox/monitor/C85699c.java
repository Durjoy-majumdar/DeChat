package com.tencent.p014mm.sandbox.monitor;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.tencent.mm.sandbox.monitor.c */
public class C85699c implements FilenameFilter {
    public boolean accept(File file, String str) {
        return str.endsWith(".crashlog");
    }
}
