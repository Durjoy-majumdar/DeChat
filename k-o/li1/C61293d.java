package li1;

import android.content.Context;
import android.view.View;
import dl1.C58321a;
import gi1.C59463a;
import gy3.C87412m;
import ni1.C61751a;
import ni1.C61753b;
import qi1.C62623a;
import qi1.C62624b;
import qi1.C62625c;
import qj1.C62660c;
import si1.C63907i;

/* renamed from: li1.d */
public final class C61293d extends C61289a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61293d(Context context, C62660c cVar, C61753b bVar) {
        super(context, cVar, bVar);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(cVar, "basePlugin");
        C87412m.m108594g(bVar, "service");
    }

    /* renamed from: h */
    public void mo85560h(int i, View view) {
        C87412m.m108594g(view, "view");
        if (view instanceof C61751a) {
            ((C61751a) view).mo86637c(C58321a.GRAB_9_MODE, mo85554b(i));
        }
    }

    /* renamed from: i */
    public View mo86269i(C59463a aVar, int i) {
        C87412m.m108594g(aVar, "data");
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? new View(this.f174397b) : new C63907i(this.f174397b, this.f174399d) : new C62623a(this.f174397b, this.f174398c, this.f174399d) : new C62625c(this.f174397b, this.f174398c, this.f174399d) : new C62624b(this.f174397b, this.f174398c, this.f174399d);
    }

    /* renamed from: m */
    public String mo86273m() {
        return "MicNormalRatioAdapter";
    }
}
