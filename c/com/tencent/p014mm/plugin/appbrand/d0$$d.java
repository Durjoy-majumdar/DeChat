package com.tencent.p014mm.plugin.appbrand;

import lp3.C88631d;
import mp3.C88819d;
import nr3.C89059e;

/* renamed from: com.tencent.mm.plugin.appbrand.d0$$d */
public class d0$$d extends C89059e<Void> {

    /* renamed from: B */
    public final /* synthetic */ String f239753B;

    /* renamed from: C */
    public final /* synthetic */ C81688d0 f239754C;

    /* renamed from: com.tencent.mm.plugin.appbrand.d0$$d$a */
    public class C81689a implements C88631d.C88632b {

        /* renamed from: a */
        public final /* synthetic */ C88631d.C88632b f239755a;

        /* renamed from: b */
        public final /* synthetic */ C89059e f239756b;

        public C81689a(C88631d.C88632b bVar, C89059e eVar) {
            this.f239755a = bVar;
            this.f239756b = eVar;
        }

        /* renamed from: a */
        public void mo1772a(Object obj) {
            this.f239755a.mo1772a(obj);
            d0$$d.this.f239754C.f239736b.mo1963B7(this.f239756b);
        }
    }

    public d0$$d(C81688d0 d0Var, String str) {
        this.f239754C = d0Var;
        this.f239753B = str;
    }

    /* renamed from: a */
    public synchronized C88631d mo114038a(C88631d.C88632b bVar) {
        mo114039c(C88819d.current(), bVar);
        return this;
    }

    /* renamed from: c */
    public synchronized C88631d mo114039c(C88819d dVar, C88631d.C88632b bVar) {
        super.mo114039c(dVar, new C81689a(bVar, this));
        return this;
    }

    public void dead() {
        this.f239754C.mo114031f("pipeline(%s) will be stopped", this.f239753B);
        mo123069i(true);
    }
}
