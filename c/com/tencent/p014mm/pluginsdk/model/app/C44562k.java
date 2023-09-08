package com.tencent.p014mm.pluginsdk.model.app;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import p763ym.C79138l;

/* renamed from: com.tencent.mm.pluginsdk.model.app.k */
public class C44562k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C79138l.C53540a f120845d;

    /* renamed from: e */
    public final /* synthetic */ String f120846e;

    /* renamed from: f */
    public final /* synthetic */ String f120847f;

    public C44562k(C79138l.C53540a aVar, String str, String str2) {
        this.f120845d = aVar;
        this.f120846e = str;
        this.f120847f = str2;
    }

    public void run() {
        MultiProcessMMKV singleMMKV = MultiProcessMMKV.getSingleMMKV("key_open_sdk_pkg");
        if (singleMMKV == null) {
            this.f120845d.mo74207a((C44561j) null);
            return;
        }
        singleMMKV.encode(this.f120846e, this.f120847f);
        this.f120845d.mo74207a(C44565l.m48990j(this.f120846e, true));
    }
}
