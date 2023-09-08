package xk1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;
import xk1.C66297d2;

/* renamed from: xk1.a0 */
public final class C66287a0 implements C66297d2.C15724d {

    /* renamed from: a */
    public final /* synthetic */ C66355w f190829a;

    /* renamed from: xk1.a0$a */
    public static final class C66288a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66355w f190830d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66288a(C66355w wVar) {
            super(0);
            this.f190830d = wVar;
        }

        public Object invoke() {
            Log.m105924i(this.f190830d.f191025d, "postBtn set enabled");
            this.f190830d.mo90462k3().setEnabled(true);
            return C13598b0.f38549a;
        }
    }

    public C66287a0(C66355w wVar) {
        this.f190829a = wVar;
    }

    public void onChange() {
        C61926c.m72668M(new C66288a(this.f190829a));
    }
}
