package com.tencent.p014mm.plugin.finder.service;

import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75597w2;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87413o;
import ht1.C60187m5;
import ht1.C60208v1;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.service.k0 */
public final class C56287k0 implements C60208v1.C60209a {

    /* renamed from: a */
    public final /* synthetic */ String f160860a;

    /* renamed from: b */
    public final /* synthetic */ C8479f0<String> f160861b;

    /* renamed from: c */
    public final /* synthetic */ C75597w2.C31525a f160862c;

    /* renamed from: com.tencent.mm.plugin.finder.service.k0$a */
    public static final class C56288a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60187m5 f160863d;

        /* renamed from: e */
        public final /* synthetic */ String f160864e;

        /* renamed from: f */
        public final /* synthetic */ C8479f0<String> f160865f;

        /* renamed from: g */
        public final /* synthetic */ C75597w2.C31525a f160866g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56288a(C60187m5 m5Var, String str, C8479f0<String> f0Var, C75597w2.C31525a aVar) {
            super(0);
            this.f160863d = m5Var;
            this.f160864e = str;
            this.f160865f = f0Var;
            this.f160866g = aVar;
        }

        public Object invoke() {
            C60187m5 m5Var = this.f160863d;
            boolean isValid = m5Var != null ? m5Var.isValid() : false;
            Log.m105924i("Finder.GetContactInterceptor", "[getFinderContact] callback! succ=" + isValid + ", username=" + this.f160864e + " talker=" + ((String) this.f160865f.f27484d));
            C75597w2.C31525a aVar = this.f160866g;
            if (aVar != null) {
                aVar.mo1109a(this.f160864e, isValid);
            }
            return C13598b0.f38549a;
        }
    }

    public C56287k0(String str, C8479f0<String> f0Var, C75597w2.C31525a aVar) {
        this.f160860a = str;
        this.f160861b = f0Var;
        this.f160862c = aVar;
    }

    /* renamed from: a */
    public final void mo78737a(C60187m5 m5Var) {
        C61926c.m72668M(new C56288a(m5Var, this.f160860a, this.f160861b, this.f160862c));
    }
}
