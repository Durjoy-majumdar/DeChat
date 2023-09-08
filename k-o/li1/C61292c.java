package li1;

import android.content.Context;
import android.view.View;
import dl1.C58321a;
import gi1.C59463a;
import gy3.C87412m;
import ii1.C60291e;
import kg3.C76577a;
import ni1.C61751a;
import ni1.C61753b;
import ri1.C63437a;
import ri1.C63438b;
import ri1.C63439c;
import si1.C63907i;

/* renamed from: li1.c */
public final class C61292c extends C61289a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61292c(Context context, C60291e eVar, C61753b bVar) {
        super(context, eVar, bVar);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(eVar, "basePlugin");
        C87412m.m108594g(bVar, "service");
    }

    /* renamed from: h */
    public void mo85560h(int i, View view) {
        C87412m.m108594g(view, "view");
        if (view instanceof C61751a) {
            ((C61751a) view).mo86637c(C58321a.GRAB_FOCUS_9_MODE, mo85554b(i));
        }
    }

    /* renamed from: i */
    public View mo86269i(C59463a aVar, int i) {
        C87412m.m108594g(aVar, "data");
        if (i == 1) {
            return new C63438b(this.f174397b, this.f174398c, this.f174399d);
        }
        if (i == 2) {
            return new C63439c(this.f174397b, this.f174398c, this.f174399d);
        }
        if (i == 3) {
            return new C63437a(this.f174397b, this.f174398c, this.f174399d);
        }
        if (i != 4) {
            return new View(this.f174397b);
        }
        C63907i iVar = new C63907i(this.f174397b, this.f174399d);
        iVar.mo88692h(C76577a.m92151b(iVar.getContext(), 24), 12.0f);
        return iVar;
    }

    /* renamed from: m */
    public String mo86273m() {
        return "MicFocusRatioAdapter";
    }
}
