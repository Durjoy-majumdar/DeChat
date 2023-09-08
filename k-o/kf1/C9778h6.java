package kf1;

import cm1.C0716c;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import gy3.C87412m;
import ho1.C8644q;
import rx3.C36570n;
import te3.C49980je1;
import te3.C50382mc1;
import te3.C50521nc1;
import te3.C51692vg1;
import up1.C14269a0;
import up1.C14270b0;
import up1.C14362s;

/* renamed from: kf1.h6 */
public final class C9778h6 {

    /* renamed from: a */
    public static final C9778h6 f30304a = new C9778h6();

    /* renamed from: a */
    public final C0716c mo10380a(C49980je1 je12) {
        C87412m.m108594g(je12, "lbsSection");
        C50382mc1 mc12 = new C50382mc1();
        mc12.f137948d = 1;
        mc12.f137950f = je12;
        return mo10381b(mc12);
    }

    /* renamed from: b */
    public final C0716c mo10381b(C50382mc1 mc12) {
        C14269a0 a0Var = new C14269a0(mc12);
        C50382mc1 mc13 = a0Var.f39806a;
        int i = mc13.f137948d;
        int i2 = 0;
        if (i == 1) {
            C49980je1 je12 = mc13.f137950f;
            if (je12 == null) {
                je12 = new C49980je1();
            }
            C14362s sVar = new C14362s(je12);
            a0Var.f39807b = sVar;
            a0Var.f39808c = null;
            a0Var.f39809d = null;
            a0Var.f39811f = sVar.mo13668c().f136849g + 1000;
            long longValue = ((Number) ((C36570n) sVar.f39921c).getValue()).longValue();
            C14362s sVar2 = a0Var.f39807b;
            if (sVar2 != null) {
                i2 = sVar2.hashCode();
            }
            a0Var.f39812g = longValue + ((long) i2);
        } else if (i == 2) {
            a0Var.f39807b = null;
            FinderItem.C56324a aVar = FinderItem.Companion;
            FinderObject finderObject = mc13.f137951g;
            if (finderObject == null) {
                finderObject = new FinderObject();
            }
            FinderItem a = aVar.mo79056a(finderObject, 0);
            a0Var.f39808c = a;
            a0Var.f39809d = null;
            a0Var.f39811f = a.getMediaType();
            a0Var.f39812g = a.getId();
        } else if (i == 3) {
            a0Var.f39807b = null;
            a0Var.f39808c = null;
            C50521nc1 nc12 = mc13.f137949e;
            if (nc12 == null) {
                nc12 = new C50521nc1();
            }
            C14270b0 b0Var = new C14270b0(nc12);
            a0Var.f39809d = b0Var;
            a0Var.f39811f = b0Var.f39813a.f138528d;
            a0Var.f39812g = ((Number) ((C36570n) b0Var.f39814b).getValue()).longValue();
        } else if (i == 4) {
            a0Var.f39807b = null;
            a0Var.f39808c = null;
            a0Var.f39809d = null;
            C51692vg1 vg12 = mc13.f137952h;
            if (vg12 == null) {
                vg12 = new C51692vg1();
            }
            a0Var.f39810e = new C8644q(vg12);
            a0Var.f39811f = 3000;
        } else {
            a0Var.f39807b = null;
            a0Var.f39808c = null;
            a0Var.f39809d = null;
            a0Var.f39811f = 10000;
            a0Var.f39812g = -1;
        }
        return new C0716c(a0Var);
    }
}
