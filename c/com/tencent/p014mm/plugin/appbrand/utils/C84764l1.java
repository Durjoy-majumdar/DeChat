package com.tencent.p014mm.plugin.appbrand.utils;

import android.webkit.ValueCallback;
import com.tencent.p014mm.plugin.appbrand.utils.C84754j1;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.l1 */
public class C84764l1 implements ValueCallback<String> {

    /* renamed from: a */
    public final /* synthetic */ String f247179a;

    /* renamed from: b */
    public final /* synthetic */ C84754j1.C84756b f247180b;

    /* renamed from: c */
    public final /* synthetic */ long f247181c;

    public C84764l1(String str, C84754j1.C84756b bVar, long j) {
        this.f247179a = str;
        this.f247180b = bVar;
        this.f247181c = j;
    }

    public void onReceiveValue(Object obj) {
        C84754j1.m104417a(this.f247179a, this.f247180b, (String) obj, this.f247181c);
    }
}
