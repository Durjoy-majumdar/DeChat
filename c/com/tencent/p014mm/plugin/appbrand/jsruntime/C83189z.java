package com.tencent.p014mm.plugin.appbrand.jsruntime;

import fy3.C32224a;
import gy3.C87413o;
import oa1.C117731d;
import p224ra.C89909e;
import p774zg.C91702f;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.appbrand.jsruntime.z */
public final class C83189z implements C91702f {

    /* renamed from: d */
    public static final C13601g f242989d = C36568h.m40985a(C83190a.f242990d);

    /* renamed from: com.tencent.mm.plugin.appbrand.jsruntime.z$a */
    public static final class C83190a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C83190a f242990d = new C83190a();

        public C83190a() {
            super(0);
        }

        public Object invoke() {
            return Boolean.valueOf(C117731d.m166007c().mo182445g("clicfg_android_lock_create_node_js", false, true));
        }
    }

    static {
        C83189z zVar = new C83189z();
        C89909e.m112440e(C91702f.class, zVar);
    }

    /* renamed from: uY */
    public boolean mo115438uY() {
        return ((Boolean) ((C36570n) f242989d).getValue()).booleanValue();
    }
}
