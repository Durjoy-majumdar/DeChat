package com.tencent.p014mm.plugin.appbrand.v8_snapshot;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.v0 */
public enum C84872v0 {
    APP("app", false, 2, (boolean) null),
    GAME("game", false, 2, (boolean) null),
    NODE("node", true);
    

    /* renamed from: f */
    public static final C84873a f247376f = null;

    /* renamed from: d */
    public final String f247381d;

    /* renamed from: e */
    public final boolean f247382e;

    /* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.v0$a */
    public static final class C84873a {
        public C84873a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C84872v0 mo117626a(String str) {
            C87412m.m108594g(str, "flatten");
            for (C84872v0 v0Var : C84872v0.values()) {
                if (C87412m.m108589b(str, v0Var.f247381d)) {
                    return v0Var;
                }
            }
            return null;
        }
    }

    /* access modifiers changed from: public */
    static {
        f247376f = new C84873a((C8480h) null);
    }

    /* access modifiers changed from: public */
    C84872v0(String str, boolean z) {
        this.f247381d = str;
        this.f247382e = z;
    }
}
