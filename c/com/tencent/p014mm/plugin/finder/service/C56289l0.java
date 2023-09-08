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

/* renamed from: com.tencent.mm.plugin.finder.service.l0 */
public final class C56289l0 implements C60208v1.C60209a {

    /* renamed from: a */
    public final /* synthetic */ String f160867a;

    /* renamed from: b */
    public final /* synthetic */ C8479f0<String> f160868b;

    /* renamed from: c */
    public final /* synthetic */ C75597w2.C31525a f160869c;

    /* renamed from: com.tencent.mm.plugin.finder.service.l0$a */
    public static final class C56290a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60187m5 f160870d;

        /* renamed from: e */
        public final /* synthetic */ String f160871e;

        /* renamed from: f */
        public final /* synthetic */ C8479f0<String> f160872f;

        /* renamed from: g */
        public final /* synthetic */ C75597w2.C31525a f160873g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56290a(C60187m5 m5Var, String str, C8479f0<String> f0Var, C75597w2.C31525a aVar) {
            super(0);
            this.f160870d = m5Var;
            this.f160871e = str;
            this.f160872f = f0Var;
            this.f160873g = aVar;
        }

        public Object invoke() {
            C60187m5 m5Var = this.f160870d;
            boolean isValid = m5Var != null ? m5Var.isValid() : false;
            Log.m105924i("Finder.GetContactInterceptor", "[getFinderStrangerContact] callback! succ=" + isValid + ", username=" + this.f160871e + " talker=" + ((String) this.f160872f.f27484d));
            C75597w2.C31525a aVar = this.f160873g;
            if (aVar != null) {
                aVar.mo1109a(this.f160871e, isValid);
            }
            return C13598b0.f38549a;
        }
    }

    public C56289l0(String str, C8479f0<String> f0Var, C75597w2.C31525a aVar) {
        this.f160867a = str;
        this.f160868b = f0Var;
        this.f160869c = aVar;
    }

    /* renamed from: a */
    public final void mo78737a(C60187m5 m5Var) {
        C61926c.m72668M(new C56290a(m5Var, this.f160867a, this.f160868b, this.f160869c));
    }
}
