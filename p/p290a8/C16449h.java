package p290a8;

import com.tencent.xweb.file.XVFSFile;
import java.util.regex.Pattern;
import p333e8.C20541m;
import p383t7.C22444f;

/* renamed from: a8.h */
public final class C16449h {

    /* renamed from: a */
    public static final Pattern f43909a = Pattern.compile("^NOTE(( |\t).*)?$");

    /* renamed from: b */
    public static final Pattern f43910b = Pattern.compile("^﻿?WEBVTT(( |\t).*)?$");

    /* renamed from: a */
    public static float m15278a(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    /* renamed from: b */
    public static long m15279b(String str) {
        String[] split = str.split("\\.", 2);
        long j = 0;
        for (String parseLong : split[0].split(XVFSFile.PATH_SEPARATOR)) {
            j = (j * 60) + Long.parseLong(parseLong);
        }
        return ((j * 1000) + Long.parseLong(split[1])) * 1000;
    }

    /* renamed from: c */
    public static void m15280c(C20541m mVar) {
        String d = mVar.mo32093d();
        if (d == null || !f43910b.matcher(d).matches()) {
            throw new C22444f("Expected WEBVTT. Got " + d);
        }
    }
}
