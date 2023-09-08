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

/* renamed from: com.tencent.mm.plugin.finder.service.m0 */
public final class C56291m0 implements C60208v1.C60209a {

    /* renamed from: a */
    public final /* synthetic */ String f160874a;

    /* renamed from: b */
    public final /* synthetic */ C8479f0<String> f160875b;

    /* renamed from: c */
    public final /* synthetic */ C75597w2.C31525a f160876c;

    /* renamed from: com.tencent.mm.plugin.finder.service.m0$a */
    public static final class C56292a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60187m5 f160877d;

        /* renamed from: e */
        public final /* synthetic */ String f160878e;

        /* renamed from: f */
        public final /* synthetic */ C8479f0<String> f160879f;

        /* renamed from: g */
        public final /* synthetic */ C75597w2.C31525a f160880g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56292a(C60187m5 m5Var, String str, C8479f0<String> f0Var, C75597w2.C31525a aVar) {
            super(0);
            this.f160877d = m5Var;
            this.f160878e = str;
            this.f160879f = f0Var;
            this.f160880g = aVar;
        }

        public Object invoke() {
            C60187m5 m5Var = this.f160877d;
            boolean isValid = m5Var != null ? m5Var.isValid() : false;
            Log.m105924i("Finder.GetContactInterceptor", "[getFinderMsgAliasContact] callback! succ=" + isValid + ", username=" + this.f160878e + " talker=" + ((String) this.f160879f.f27484d));
            C75597w2.C31525a aVar = this.f160880g;
            if (aVar != null) {
                aVar.mo1109a(this.f160878e, isValid);
            }
            return C13598b0.f38549a;
        }
    }

    public C56291m0(String str, C8479f0<String> f0Var, C75597w2.C31525a aVar) {
        this.f160874a = str;
        this.f160875b = f0Var;
        this.f160876c = aVar;
    }

    /* renamed from: a */
    public final void mo78737a(C60187m5 m5Var) {
        C61926c.m72668M(new C56292a(m5Var, this.f160874a, this.f160875b, this.f160876c));
    }
}
