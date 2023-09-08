package com.tencent.p014mm.plugin.game.commlib.util;

import android.util.Base64;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.HashSet;
import py1.C47647p1;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.game.commlib.util.c */
public final class C41862c {

    /* renamed from: c */
    public static final C41863a f112806c = new C41863a((C8480h) null);

    /* renamed from: d */
    public static volatile C41862c f112807d;

    /* renamed from: a */
    public String f112808a;

    /* renamed from: b */
    public long f112809b = System.currentTimeMillis();

    /* renamed from: com.tencent.mm.plugin.game.commlib.util.c$a */
    public static final class C41863a {
        public C41863a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C41862c mo65644a() {
            if (C41862c.f112807d == null) {
                synchronized (C41862c.class) {
                    if (C41862c.f112807d == null) {
                        C41862c.f112807d = new C41862c();
                    } else {
                        C41862c.f112806c.mo65645b();
                    }
                    C13598b0 b0Var = C13598b0.f38549a;
                }
            } else {
                mo65645b();
            }
            C41862c cVar = C41862c.f112807d;
            if (cVar != null) {
                return cVar;
            }
            C87412m.m108603p("instance");
            throw null;
        }

        /* renamed from: b */
        public final void mo65645b() {
            if (C41862c.f112807d == null) {
                synchronized (C41862c.class) {
                    if (C41862c.f112807d == null) {
                        C41862c.f112807d = new C41862c();
                        return;
                    }
                    C13598b0 b0Var = C13598b0.f38549a;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            C41862c cVar = C41862c.f112807d;
            if (cVar == null) {
                C87412m.m108603p("instance");
                throw null;
            } else if (currentTimeMillis - cVar.f112809b <= 300000 || ((HashSet) C41864d.f112812c).size() != 0) {
                C41862c cVar2 = C41862c.f112807d;
                if (cVar2 != null) {
                    cVar2.f112809b = System.currentTimeMillis();
                } else {
                    C87412m.m108603p("instance");
                    throw null;
                }
            } else {
                C47647p1 p1Var = new C47647p1();
                p1Var.f127920d = C86709a0.m107523b().mo121110g();
                p1Var.f127921e = System.currentTimeMillis();
                C41862c cVar3 = C41862c.f112807d;
                if (cVar3 != null) {
                    cVar3.f112809b = p1Var.f127921e;
                    C41862c cVar4 = C41862c.f112807d;
                    if (cVar4 != null) {
                        String encodeToString = Base64.encodeToString(p1Var.toByteArray(), 2);
                        C87412m.m108593f(encodeToString, "encodeToString(\n        …NO_WRAP\n                )");
                        cVar4.f112808a = encodeToString;
                        return;
                    }
                    C87412m.m108603p("instance");
                    throw null;
                }
                C87412m.m108603p("instance");
                throw null;
            }
        }
    }

    public C41862c() {
        C47647p1 p1Var = new C47647p1();
        p1Var.f127920d = C86709a0.m107523b().mo121110g();
        p1Var.f127921e = this.f112809b;
        String encodeToString = Base64.encodeToString(p1Var.toByteArray(), 2);
        C87412m.m108593f(encodeToString, "encodeToString(\n        … Base64.NO_WRAP\n        )");
        this.f112808a = encodeToString;
    }
}
