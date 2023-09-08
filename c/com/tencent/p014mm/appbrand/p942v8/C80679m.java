package com.tencent.p014mm.appbrand.p942v8;

import com.eclipsesource.mmv8.ExecuteDetails;
import com.tencent.p014mm.appbrand.p942v8.C80669j;

/* renamed from: com.tencent.mm.appbrand.v8.m */
public class C80679m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C80669j.C80675f f236066d;

    /* renamed from: e */
    public final /* synthetic */ int f236067e;

    /* renamed from: f */
    public final /* synthetic */ String f236068f;

    /* renamed from: g */
    public final /* synthetic */ String f236069g;

    /* renamed from: h */
    public final /* synthetic */ String f236070h;

    /* renamed from: i */
    public final /* synthetic */ String f236071i;

    /* renamed from: j */
    public final /* synthetic */ C80669j f236072j;

    public C80679m(C80669j jVar, C80669j.C80675f fVar, int i, String str, String str2, String str3, String str4) {
        this.f236072j = jVar;
        this.f236066d = fVar;
        this.f236067e = i;
        this.f236068f = str;
        this.f236069g = str2;
        this.f236070h = str3;
        this.f236071i = str4;
    }

    public void run() {
        if (this.f236066d != null) {
            C80669j.C80676g gVar = new C80669j.C80676g();
            gVar.f236060c = this.f236067e;
            gVar.f236058a = System.currentTimeMillis();
            String str = null;
            try {
                Object executeScript = this.f236072j.mo112501e().executeScript(this.f236068f, C80669j.m98366a(this.f236072j, this.f236069g), 0, this.f236070h, this.f236071i, this.f236067e, gVar);
                C80669j.C80676g.m98373a(gVar);
                C80669j.C80675f fVar = this.f236066d;
                if (executeScript != null) {
                    str = executeScript.toString();
                }
                fVar.mo112506a(str, gVar);
            } catch (Throwable th) {
                C80669j.C80676g.m98373a(gVar);
                this.f236066d.mo112506a((String) null, gVar);
                throw th;
            }
        } else {
            this.f236072j.mo112501e().executeVoidScript(this.f236068f, C80669j.m98366a(this.f236072j, this.f236069g), 0, this.f236070h, this.f236071i, this.f236067e, (ExecuteDetails) null);
        }
    }
}
