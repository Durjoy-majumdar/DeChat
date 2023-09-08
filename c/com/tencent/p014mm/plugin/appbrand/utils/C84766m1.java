package com.tencent.p014mm.plugin.appbrand.utils;

import android.webkit.ValueCallback;
import com.tencent.p014mm.plugin.appbrand.utils.C84754j1;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.m1 */
public class C84766m1 implements ValueCallback<String> {

    /* renamed from: a */
    public final /* synthetic */ String f247182a;

    /* renamed from: b */
    public final /* synthetic */ C84754j1.C84756b f247183b;

    /* renamed from: c */
    public final /* synthetic */ long f247184c;

    public C84766m1(String str, C84754j1.C84756b bVar, long j) {
        this.f247182a = str;
        this.f247183b = bVar;
        this.f247184c = j;
    }

    public void onReceiveValue(Object obj) {
        C84754j1.m104417a(this.f247182a, this.f247183b, (String) obj, this.f247184c);
    }
}
