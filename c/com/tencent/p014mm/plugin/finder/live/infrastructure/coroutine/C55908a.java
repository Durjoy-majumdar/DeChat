package com.tencent.p014mm.plugin.finder.live.infrastructure.coroutine;

import a14.C0000n0;
import a14.C0002w;
import a14.C53872d1;
import a14.C53884f2;
import a14.C53896h0;
import a14.C53922m0;
import a14.C53959v2;
import a14.C53973z1;
import androidx.lifecycle.C0125s;
import f14.C58901s;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import jp3.C46566c;
import jp3.C9486a;
import o40.C61926c;
import rx3.C13598b0;
import wx3.C66212f;

/* renamed from: com.tencent.mm.plugin.finder.live.infrastructure.coroutine.a */
public class C55908a implements C0000n0 {

    /* renamed from: d */
    public final C0125s f159310d;

    /* renamed from: e */
    public final String f159311e;

    /* renamed from: f */
    public final C66212f f159312f;

    /* renamed from: g */
    public final C46566c<C9486a> f159313g;

    /* renamed from: com.tencent.mm.plugin.finder.live.infrastructure.coroutine.a$a */
    public static final class C55909a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C55908a f159314d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55909a(C55908a aVar) {
            super(0);
            this.f159314d = aVar;
        }

        public Object invoke() {
            this.f159314d.f159310d.getLifecycle().addObserver(new LiveScope$1$1(this.f159314d));
            return C13598b0.f38549a;
        }
    }

    public C55908a(C0125s sVar, String str) {
        C87412m.m108594g(sVar, "lifecycleOwner");
        this.f159310d = sVar;
        this.f159311e = str;
        C0002w a = C53959v2.m60598a((C53973z1) null, 1, (Object) null);
        C53896h0 h0Var = C53872d1.f151117a;
        this.f159312f = ((C53884f2) a).plus(C58901s.f168555a).plus(new C53922m0(str == null ? "LiveScope" : str));
        this.f159313g = new C46566c<>();
        C61926c.m72668M(new C55909a(this));
    }

    public C66212f getCoroutineContext() {
        return this.f159312f;
    }
}
