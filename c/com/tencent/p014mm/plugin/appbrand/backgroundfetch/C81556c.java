package com.tencent.p014mm.plugin.appbrand.backgroundfetch;

import java.util.HashMap;

/* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.c */
public class C81556c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f239182d;

    /* renamed from: e */
    public final /* synthetic */ String f239183e;

    public C81556c(String str, String str2) {
        this.f239182d = str;
        this.f239183e = str2;
    }

    public void run() {
        HashMap hashMap = new HashMap();
        hashMap.put(this.f239182d, this.f239183e);
        C81557d.m100043a(hashMap, new C81562p());
    }
}
