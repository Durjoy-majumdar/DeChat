package com.tencent.p014mm.plugin.lite;

import java.util.HashSet;

/* renamed from: com.tencent.mm.plugin.lite.b */
public class C56830b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f162854d;

    /* renamed from: e */
    public final /* synthetic */ int f162855e;

    /* renamed from: f */
    public final /* synthetic */ String f162856f;

    /* renamed from: g */
    public final /* synthetic */ String f162857g;

    /* renamed from: h */
    public final /* synthetic */ C56832d f162858h;

    public C56830b(C56832d dVar, long j, int i, String str, String str2) {
        this.f162858h = dVar;
        this.f162854d = j;
        this.f162855e = i;
        this.f162856f = str;
        this.f162857g = str2;
    }

    public void run() {
        String format = String.format("%d_%d", new Object[]{Long.valueOf(this.f162854d), Integer.valueOf(this.f162855e)});
        ((HashSet) this.f162858h.f162864a).add(format);
        if (this.f162858h.f162866c.mo80259b(this.f162854d, this.f162856f, this.f162857g, this.f162855e)) {
            ((HashSet) this.f162858h.f162864a).remove(format);
        } else if (((HashSet) this.f162858h.f162864a).contains(format)) {
            ((HashSet) this.f162858h.f162864a).remove(format);
            LiteAppCenter.storeSendResult(this.f162858h.f162865b, this.f162854d, this.f162855e, "json", "null");
        }
    }
}
