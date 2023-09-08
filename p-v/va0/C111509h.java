package va0;

import android.graphics.drawable.Drawable;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import p1104d1.C106969c;
import p175j0.C108504h;
import p267x.C111897d1;
import p436a1.C103274x;
import p631o1.C109836f;
import p721v0.C111294a;
import p721v0.C65503j;
import rx3.C13598b0;
import rx3.C13605o;
import ua0.C111148c;

/* renamed from: va0.h */
public final class C111509h extends C87413o implements C32228q<String, C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C13605o<Drawable, Integer, Integer> f333863d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111509h(C13605o<? extends Drawable, Integer, Integer> oVar) {
        super(3);
        this.f333863d = oVar;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        C108504h hVar = (C108504h) obj2;
        int intValue = ((Number) obj3).intValue();
        C87412m.m108594g(str, "str");
        if ((intValue & 14) == 0) {
            intValue |= hVar.mo51619x(str) ? 4 : 2;
        }
        if ((intValue & 91) != 18 || !hVar.mo51575a()) {
            C13605o<Drawable, Integer, Integer> oVar = this.f333863d;
            hVar.mo51557H(-492369756);
            Object q = hVar.mo51606q();
            int i = C108504h.f324828a;
            if (q == C108504h.C60656a.f172772a) {
                A a = oVar.f38557d;
                C87412m.m108591d(a);
                q = C111148c.m151602a((Drawable) a);
                hVar.mo51553F(q);
            }
            hVar.mo51565P();
            C111897d1.m152617a((C106969c) q, str, (C65503j) null, (C111294a) null, (C109836f) null, 0.0f, (C103274x) null, hVar, ((intValue << 3) & 112) | 8, 124);
        } else {
            hVar.mo51581d();
        }
        return C13598b0.f38549a;
    }
}
