package com.tencent.p014mm.app;

import java.util.LinkedList;
import p261wl.C15510f;
import p261wl.C38166b;
import p261wl.C38172g;

/* renamed from: com.tencent.mm.app.b */
public class C114655b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f343492d;

    /* renamed from: e */
    public final /* synthetic */ AppForegroundDelegate f343493e;

    /* renamed from: com.tencent.mm.app.b$a */
    public class C114656a implements C38172g<C114661d0> {
        public C114656a() {
        }

        public boolean invoke(C15510f fVar) {
            C114661d0 d0Var = (C114661d0) fVar;
            if (d0Var.getHandler() != null) {
                d0Var.getHandler().post(new b$a$$a(d0Var, C114655b.this.f343492d));
                return false;
            }
            d0Var.onAppForeground(C114655b.this.f343492d);
            return false;
        }
    }

    public C114655b(AppForegroundDelegate appForegroundDelegate, String str) {
        this.f343493e = appForegroundDelegate;
        this.f343492d = str;
    }

    public void run() {
        LinkedList<C114668z> linkedList;
        synchronized (this.f343493e.f343452i) {
            linkedList = new LinkedList<>(this.f343493e.f343452i);
        }
        for (C114668z onAppForeground : linkedList) {
            onAppForeground.onAppForeground(this.f343492d);
        }
        C38166b.m41755b(C114661d0.class, new C114656a());
    }
}
