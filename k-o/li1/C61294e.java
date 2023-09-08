package li1;

import android.content.Context;
import android.view.View;
import cl1.C54963d0;
import dl1.C58321a;
import gi1.C59463a;
import gy3.C87412m;
import ii1.C60291e;
import ni1.C61751a;
import ni1.C61753b;
import si1.C63895a;
import si1.C63896b;
import si1.C63903h;

/* renamed from: li1.e */
public final class C61294e extends C61289a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61294e(Context context, C60291e eVar, C61753b bVar) {
        super(context, eVar, bVar);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(eVar, "basePlugin");
        C87412m.m108594g(bVar, "service");
    }

    /* renamed from: h */
    public void mo85560h(int i, View view) {
        C87412m.m108594g(view, "view");
        if (view instanceof C61751a) {
            ((C61751a) view).mo86637c(((C54963d0) this.f174398c.mo87696x0(C54963d0.class)).mo75912T3() ? C58321a.NORMAL_5_9_MULTI_MODE : C58321a.NORMAL_4_MODE, mo85554b(i));
        }
    }

    /* renamed from: i */
    public View mo86269i(C59463a aVar, int i) {
        C87412m.m108594g(aVar, "data");
        return i != 1 ? i != 2 ? i != 3 ? new View(this.f174397b) : new C63895a(this.f174397b, this.f174398c, this.f174399d) : new C63903h(this.f174397b, this.f174398c, this.f174399d) : new C63896b(this.f174397b, this.f174398c, this.f174399d);
    }

    /* renamed from: m */
    public String mo86273m() {
        return "MicNormalRatioAdapter";
    }
}
