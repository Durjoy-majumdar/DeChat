package p658q1;

import fy3.C32224a;
import gy3.C87413o;
import p410k0.C108793e;
import rx3.C13598b0;

/* renamed from: q1.j$$k */
public final class j$$k extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C110301j f329942d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j$$k(C110301j jVar) {
        super(0);
        this.f329942d = jVar;
    }

    public Object invoke() {
        C110301j jVar = this.f329942d;
        int i = 0;
        jVar.f329890D = 0;
        C108793e<C110301j> u = jVar.mo161726u();
        int i2 = u.f325786f;
        if (i2 > 0) {
            T[] tArr = u.f325784d;
            int i3 = 0;
            do {
                C110301j jVar2 = (C110301j) tArr[i3];
                jVar2.f329889C = jVar2.f329888B;
                jVar2.f329888B = Integer.MAX_VALUE;
                jVar2.f329931z.f329953d = false;
                if (jVar2.f329891E == j$$i.InLayoutBlock) {
                    jVar2.f329891E = j$$i.NotUsed;
                }
                i3++;
            } while (i3 < i2);
        }
        this.f329942d.f329895I.mo161741G0().mo145549b();
        C108793e<C110301j> u2 = this.f329942d.mo161726u();
        C110301j jVar3 = this.f329942d;
        int i4 = u2.f325786f;
        if (i4 > 0) {
            T[] tArr2 = u2.f325784d;
            do {
                C110301j jVar4 = (C110301j) tArr2[i];
                if (jVar4.f329889C != jVar4.f329888B) {
                    jVar3.mo161707H();
                    jVar3.mo161729x();
                    if (jVar4.f329888B == Integer.MAX_VALUE) {
                        jVar4.mo161704D();
                    }
                }
                C110307o oVar = jVar4.f329931z;
                oVar.f329954e = oVar.f329953d;
                i++;
            } while (i < i4);
        }
        return C13598b0.f38549a;
    }
}
