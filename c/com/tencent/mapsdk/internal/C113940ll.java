package com.tencent.mapsdk.internal;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: com.tencent.mapsdk.internal.ll */
public class C113940ll extends C113943lp {

    /* renamed from: b */
    public String f340817b;

    /* renamed from: c */
    private String m157868c() {
        return this.f340817b;
    }

    /* renamed from: e */
    public final InputStream mo172354e(String str) {
        try {
            String file = new URL(str).getFile();
            if (!C40002he.m42805a(file)) {
                this.f340817b = file.substring(file.lastIndexOf("/") + 1).replace("%20", " ");
            }
        } catch (MalformedURLException unused) {
        }
        return super.mo172354e(str);
    }
}
