package com.tencent.p014mm.appbrand.p942v8;

import com.eclipsesource.mmv8.ExecuteDetails;
import com.tencent.p014mm.appbrand.p942v8.C80669j;

/* renamed from: com.tencent.mm.appbrand.v8.l */
public class C80678l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C80669j.C80675f f236062d;

    /* renamed from: e */
    public final /* synthetic */ String f236063e;

    /* renamed from: f */
    public final /* synthetic */ String f236064f;

    /* renamed from: g */
    public final /* synthetic */ C80669j f236065g;

    public C80678l(C80669j jVar, C80669j.C80675f fVar, String str, String str2) {
        this.f236065g = jVar;
        this.f236062d = fVar;
        this.f236063e = str;
        this.f236064f = str2;
    }

    public void run() {
        String str = null;
        if (this.f236062d != null) {
            C80669j.C80676g gVar = new C80669j.C80676g();
            gVar.f236058a = System.currentTimeMillis();
            Object executeScript = this.f236065g.mo112501e().executeScript(this.f236063e, C80669j.m98366a(this.f236065g, this.f236064f), 0, gVar);
            C80669j.C80676g.m98373a(gVar);
            C80669j.C80675f fVar = this.f236062d;
            if (executeScript != null) {
                str = executeScript.toString();
            }
            fVar.mo112506a(str, gVar);
            return;
        }
        this.f236065g.mo112501e().executeVoidScript(this.f236063e, C80669j.m98366a(this.f236065g, this.f236064f), 0, (ExecuteDetails) null);
    }
}
