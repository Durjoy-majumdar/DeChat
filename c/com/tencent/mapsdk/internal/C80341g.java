package com.tencent.mapsdk.internal;

import java.io.InputStream;
import java.util.Properties;

/* renamed from: com.tencent.mapsdk.internal.g */
public class C80341g {

    /* renamed from: a */
    private static String f235199a;

    /* renamed from: b */
    private static String f235200b;

    /* renamed from: c */
    private static String f235201c;

    static {
        try {
            InputStream resourceAsStream = C80341g.class.getResourceAsStream("/com/qq/jce/wup/wup.properties");
            Properties properties = new Properties();
            properties.load(resourceAsStream);
            resourceAsStream.close();
            f235199a = properties.getProperty("client.info");
            f235200b = properties.getProperty("client.built");
            f235201c = properties.getProperty("client.number");
        } catch (Throwable unused) {
        }
        if (f235199a == null) {
            f235199a = "Tencent Taf";
        }
        if (f235200b == null) {
            f235200b = "unknown";
        }
        if (f235201c == null) {
            f235201c = "unknown";
        }
    }

    /* renamed from: a */
    private static String m97823a() {
        return f235199a;
    }

    /* renamed from: b */
    private static String m97824b() {
        return f235200b;
    }

    /* renamed from: c */
    private static String m97825c() {
        return f235201c;
    }

    /* renamed from: d */
    private static String m97826d() {
        StringBuilder sb = new StringBuilder();
        sb.append("Client version: " + f235199a + "\n");
        sb.append("Client built:   " + f235200b + "\n");
        sb.append("Client number:  " + f235201c + "\n");
        sb.append("OS Name:        " + System.getProperty("os.name") + "\n");
        sb.append("OS Version:     " + System.getProperty("os.version") + "\n");
        sb.append("Architecture:   " + System.getProperty("os.arch") + "\n");
        sb.append("JVM Version:    " + System.getProperty("java.runtime.version") + "\n");
        sb.append("JVM Vendor:     " + System.getProperty("java.vm.vendor") + "\n");
        return sb.toString();
    }
}
