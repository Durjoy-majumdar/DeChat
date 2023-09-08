package com.tencent.p014mm.sandbox.monitor;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.tencent.mm.sandbox.monitor.b */
public class C85698b implements FilenameFilter {
    public boolean accept(File file, String str) {
        return str.endsWith(".crashlog") || str.endsWith(".preventcrashlog");
    }
}
