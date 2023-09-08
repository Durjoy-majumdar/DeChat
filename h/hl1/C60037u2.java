package hl1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import o40.C61926c;
import qj1.C62927ph;
import qj1.C62938qb;
import qj1.C62964rb;
import rx3.C13598b0;
import rx3.C36570n;

/* renamed from: hl1.u2 */
public final class C60037u2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59988k f171348d;

    /* renamed from: e */
    public final /* synthetic */ int f171349e;

    /* renamed from: f */
    public final /* synthetic */ int f171350f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60037u2(C59988k kVar, int i, int i2) {
        super(0);
        this.f171348d = kVar;
        this.f171349e = i;
        this.f171350f = i2;
    }

    public Object invoke() {
        C59988k kVar = this.f171348d;
        int i = kVar.f171189T1;
        int i2 = this.f171349e;
        if (!(i == i2 && kVar.f171192U1 == this.f171350f)) {
            kVar.f171189T1 = i2;
            kVar.f171192U1 = this.f171350f;
            C62927ph phVar = (C62927ph) ((C36570n) kVar.f171150B1).getValue();
            if (phVar != null) {
                int i3 = this.f171349e;
                int i4 = this.f171350f;
                if (!(phVar.f178561r == i3 && phVar.f178562s == i4)) {
                    String str = phVar.f178560q;
                    Log.m105924i(str, "checkBgmPlayStatus curBgmPlayingId:" + phVar.f178561r + " newMusicId:" + i3 + ", curPlayStatus:" + phVar.f178562s + ", playStatus:" + i4);
                    phVar.f178561r = i3;
                    phVar.f178562s = i4;
                    if (i3 == 0 || i4 == 0) {
                        phVar.mo10792g(8);
                    } else {
                        phVar.mo10792g(0);
                    }
                }
            }
            C62938qb qbVar = this.f171348d.f171152C1;
            if (qbVar != null) {
                C61926c.m72668M(new C62964rb(qbVar, this.f171349e));
            }
        }
        return C13598b0.f38549a;
    }
}
