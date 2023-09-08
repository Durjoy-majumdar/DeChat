package p658q1;

import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import p190l1.C109118y;
import p246u1.C111078m;
import p246u1.C111079n;
import p410k0.C108793e;
import p631o1.C109847j0;
import p631o1.C109849k0;
import p631o1.C109852m0;
import p631o1.C109865q0;
import p631o1.C109866r;
import p631o1.C61917g0;
import p721v0.C65503j;
import p868x0.C111982h;
import rx3.C13604l;

/* renamed from: q1.j$$m */
public final class j$$m extends C87413o implements C32227p<C65503j.C65506c, C110311s, C110311s> {

    /* renamed from: d */
    public final /* synthetic */ C110301j f329944d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j$$m(C110301j jVar) {
        super(2);
        this.f329944d = jVar;
    }

    public Object invoke(Object obj, Object obj2) {
        int i;
        C65503j.C65506c cVar = (C65503j.C65506c) obj;
        C110311s sVar = (C110311s) obj2;
        C87412m.m108594g(cVar, "mod");
        C87412m.m108594g(sVar, "toWrap");
        if (cVar instanceof C109865q0) {
            ((C109865q0) cVar).mo145576c0(this.f329944d);
        }
        T[] tArr = sVar.f329986y;
        if (cVar instanceof C111982h) {
            T dVar = new C110285d(sVar, (C111982h) cVar);
            dVar.f329963f = tArr[0];
            tArr[0] = dVar;
        }
        if (cVar instanceof C109118y) {
            T g0Var = new C110296g0(sVar, (C109118y) cVar);
            g0Var.f329963f = tArr[1];
            tArr[1] = g0Var;
        }
        if (cVar instanceof C111079n) {
            T mVar = new C111078m(sVar, (C111079n) cVar);
            mVar.f329963f = tArr[2];
            tArr[2] = mVar;
        }
        if (cVar instanceof C109852m0) {
            T j0Var = new C110302j0(sVar, cVar);
            j0Var.f329963f = tArr[3];
            tArr[3] = j0Var;
        }
        if (cVar instanceof C61917g0) {
            C110301j jVar = this.f329944d;
            C108793e<C13604l<C110311s, C61917g0>> eVar = jVar.f329906U;
            if (eVar == null) {
                C108793e<C13604l<C110311s, C61917g0>> eVar2 = new C108793e<>(new C13604l[16], 0);
                jVar.f329906U = eVar2;
                eVar = eVar2;
            }
            eVar.mo159860b(new C13604l(sVar, cVar));
        }
        C110324v vVar = sVar;
        if (cVar instanceof C109866r) {
            C110301j jVar2 = this.f329944d;
            C109866r rVar = (C109866r) cVar;
            C110324v vVar2 = null;
            if (!jVar2.f329921p.mo159867i()) {
                C108793e<C110324v> eVar3 = jVar2.f329921p;
                int i2 = eVar3.f325786f;
                int i3 = -1;
                if (i2 > 0) {
                    i = i2 - 1;
                    T[] tArr2 = eVar3.f325784d;
                    while (true) {
                        C110324v vVar3 = (C110324v) tArr2[i];
                        if (vVar3.f330028J && vVar3.f330027I == rVar) {
                            break;
                        }
                        i--;
                        if (i < 0) {
                            break;
                        }
                    }
                } else {
                    i = -1;
                }
                if (i < 0) {
                    C108793e<C110324v> eVar4 = jVar2.f329921p;
                    int i4 = eVar4.f325786f;
                    if (i4 > 0) {
                        int i5 = i4 - 1;
                        T[] tArr3 = eVar4.f325784d;
                        while (true) {
                            if (!(!((C110324v) tArr3[i5]).f330028J)) {
                                i5--;
                                if (i5 < 0) {
                                    break;
                                }
                            } else {
                                i3 = i5;
                                break;
                            }
                        }
                    }
                    i = i3;
                }
                if (i >= 0) {
                    vVar2 = jVar2.f329921p.mo159871m(i);
                    vVar2.getClass();
                    vVar2.f330027I = rVar;
                    vVar2.f330026H = sVar;
                }
            }
            C110324v vVar4 = vVar2 == null ? new C110324v(sVar, rVar) : vVar2;
            vVar4.mo161778c1();
            vVar = vVar4;
        }
        T[] tArr4 = vVar.f329986y;
        if (cVar instanceof C109847j0) {
            T j0Var2 = new C110302j0(vVar, cVar);
            j0Var2.f329963f = tArr4[4];
            tArr4[4] = j0Var2;
        }
        if (cVar instanceof C109849k0) {
            T j0Var3 = new C110302j0(vVar, cVar);
            j0Var3.f329963f = tArr4[5];
            tArr4[5] = j0Var3;
        }
        return vVar;
    }
}
