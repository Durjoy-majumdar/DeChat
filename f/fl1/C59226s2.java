package fl1;

import al1.C54130j;
import cj1.C54795n5;
import cl1.C55001u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import fy3.C32224a;
import gy3.C87413o;
import ij1.C60299b;
import rx3.C13598b0;
import te3.C49765hx0;
import te3.C64429ht0;

/* renamed from: fl1.s2 */
public final class C59226s2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59161f f169373d;

    /* renamed from: e */
    public final /* synthetic */ C49765hx0 f169374e;

    /* renamed from: f */
    public final /* synthetic */ C54130j f169375f;

    /* renamed from: g */
    public final /* synthetic */ C64429ht0 f169376g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59226s2(C59161f fVar, C49765hx0 hx02, C54130j jVar, C64429ht0 ht02) {
        super(0);
        this.f169373d = fVar;
        this.f169374e = hx02;
        this.f169375f = jVar;
        this.f169376g = ht02;
    }

    public Object invoke() {
        Class cls = C55001u.class;
        if (this.f169373d.f166836e.isFinishing() || this.f169373d.f166836e.isDestroyed()) {
            String str = this.f169373d.f169228i;
            Log.m105924i(str, "onRandomMicAccept: context is dead:" + this.f169373d.f166836e);
        } else {
            C60299b bVar = C60299b.f171929a;
            Log.m105924i("Finder.LinkMicTimeoutTimer", "startAcceptPkMicTimer delay:15000");
            MMHandlerThread.postToMainThreadDelayed(C60299b.f171933e, 15000);
            C54795n5 k = this.f169373d.mo83042k();
            if (k != null) {
                long j = ((C55001u) this.f169373d.mo83051g(cls)).f154420q.f182392d;
                long j2 = ((C55001u) this.f169373d.mo83051g(cls)).f154416j;
                String str2 = ((C55001u) this.f169373d.mo83051g(cls)).f154423t;
                byte[] bArr = ((C55001u) this.f169373d.mo83051g(cls)).f154417n;
                C49765hx0 hx02 = this.f169374e;
                C54130j jVar = this.f169375f;
                k.mo75723a(j, j2, str2, bArr, 1, hx02, jVar.f151997a, jVar.f152005i, jVar.f152002f, this.f169376g.f183553f, new C59224r2(this.f169373d));
            }
        }
        return C13598b0.f38549a;
    }
}
