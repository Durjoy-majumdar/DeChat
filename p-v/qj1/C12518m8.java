package qj1;

import cj1.C0639y1;
import cl1.C54991o;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveGiftSendBtn;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75592q0;
import fy3.C32224a;
import gg1.C32444a;
import gy3.C87412m;
import gy3.C87413o;
import ig1.C8916d;
import java.util.UUID;
import nk1.C11198f;
import p823sg.C90193h;
import qj1.C12360e8;
import rx3.C13598b0;
import z04.C119027c;

/* renamed from: qj1.m8 */
public final class C12518m8 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C12360e8 f35982d;

    /* renamed from: e */
    public final /* synthetic */ int f35983e;

    /* renamed from: f */
    public final /* synthetic */ boolean f35984f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12518m8(C12360e8 e8Var, int i, boolean z) {
        super(0);
        this.f35982d = e8Var;
        this.f35983e = i;
        this.f35984f = z;
    }

    public Object invoke() {
        Log.m105924i("Finder.FinderLiveGiftSendPlugin", "showGiftSendAgainLayout networkEnable:" + this.f35982d.f35599L + " batchCount:" + this.f35983e + " showSendBtn: " + this.f35984f);
        if (this.f35982d.f35599L) {
            C12360e8 e8Var = this.f35982d;
            if (e8Var.f35592E == null) {
                e8Var.f35592E = new C11198f();
            }
            C12360e8 e8Var2 = this.f35982d;
            e8Var2.f35605S = new C12666si(e8Var2);
            C12360e8 e8Var3 = this.f35982d;
            C11198f fVar = e8Var3.f35592E;
            boolean z = true;
            if (fVar != null) {
                FinderLiveGiftSendBtn finderLiveGiftSendBtn = e8Var3.f35591D;
                C11198f.C11199a aVar = e8Var3.f35590C;
                Integer valueOf = Integer.valueOf(this.f35983e);
                boolean z2 = this.f35983e > 1;
                fVar.f33025n = finderLiveGiftSendBtn;
                fVar.f33022k = z2;
                if (finderLiveGiftSendBtn != null) {
                    finderLiveGiftSendBtn.setOnTouchListener(fVar.f33026o);
                }
                fVar.f33023l = aVar;
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    fVar.f33018g = intValue;
                    fVar.f33019h = 0;
                    fVar.f33016e = intValue > 1 ? C11198f.C11201b.CONTINUOUS_CLICKING : C11198f.C11201b.SINGLE_CLICK;
                    byte[] bArr = null;
                    if ((BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.DEBUG) && 1 == C32444a.f86130c0.mo60266n().intValue()) {
                        StringBuilder sb = new StringBuilder();
                        String s = C75592q0.m90789s();
                        if (s != null) {
                            bArr = s.getBytes(C119027c.f356488a);
                            C87412m.m108593f(bArr, "this as java.lang.String).getBytes(charset)");
                        }
                        sb.append(C90193h.m112878f(bArr));
                        sb.append("_123456");
                        fVar.f33017f = sb.toString();
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        String s2 = C75592q0.m90789s();
                        if (s2 != null) {
                            bArr = s2.getBytes(C119027c.f356488a);
                            C87412m.m108593f(bArr, "this as java.lang.String).getBytes(charset)");
                        }
                        sb4.append(C90193h.m112878f(bArr));
                        sb4.append('_');
                        sb4.append(UUID.randomUUID());
                        fVar.f33017f = sb4.toString();
                    }
                    fVar.f33020i = System.currentTimeMillis();
                    fVar.f33028q.startTimer((long) fVar.f33013b);
                    fVar.f33024m = aVar != null ? ((C12360e8.C12362b) aVar).mo11288c(fVar.f33025n, valueOf.intValue(), fVar.f33016e, fVar.f33017f, valueOf.intValue(), z2) : true;
                }
            }
            C8916d d = C0639y1.f1510a.mo612d(this.f35982d.f35608r);
            if (((C54991o) this.f35982d.mo87696x0(C54991o.class)).f154258T1 < ((long) ((d != null ? (int) d.field_price : 0) * this.f35983e))) {
                z = false;
            }
            if (!this.f35984f || !z) {
                this.f35982d.mo10792g(8);
            } else {
                this.f35982d.mo10792g(0);
                this.f35982d.f35591D.mo3286c();
            }
        } else {
            Log.m105924i("Finder.FinderLiveGiftSendPlugin", "showGiftSendAgainLayout networkEnable:" + this.f35982d.f35599L);
        }
        return C13598b0.f38549a;
    }
}
