package com.tencent.p014mm.app;

import java.util.LinkedList;
import p261wl.C15510f;
import p261wl.C38166b;
import p261wl.C38172g;

/* renamed from: com.tencent.mm.app.c */
public class C114658c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f343497d;

    /* renamed from: e */
    public final /* synthetic */ AppForegroundDelegate f343498e;

    /* renamed from: com.tencent.mm.app.c$a */
    public class C114659a implements C38172g<C114661d0> {
        public C114659a() {
        }

        public boolean invoke(C15510f fVar) {
            C114661d0 d0Var = (C114661d0) fVar;
            if (d0Var.getHandler() != null) {
                d0Var.getHandler().post(new c$a$$a(d0Var, C114658c.this.f343497d));
                return false;
            }
            d0Var.onAppBackground(C114658c.this.f343497d);
            return false;
        }
    }

    public C114658c(AppForegroundDelegate appForegroundDelegate, String str) {
        this.f343498e = appForegroundDelegate;
        this.f343497d = str;
    }

    public void run() {
        LinkedList<C114668z> linkedList;
        synchronized (this.f343498e.f343452i) {
            linkedList = new LinkedList<>(this.f343498e.f343452i);
        }
        for (C114668z onAppBackground : linkedList) {
            onAppBackground.onAppBackground(this.f343497d);
        }
        C38166b.m41755b(C114661d0.class, new C114659a());
    }
}
