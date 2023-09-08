package h41;

import android.view.View;
import j20.C21152b;
import m41.C117536f;
import u24.C90599h;

public class b$$r implements C21152b {

    /* renamed from: a */
    public final /* synthetic */ C117067b f350803a;

    public b$$r(C117067b bVar) {
        this.f350803a = bVar;
    }

    /* renamed from: a */
    public void mo33108a(String str, String str2, String str3, String str4, String str5, Object obj, Object[] objArr) {
        if (obj != null && (obj instanceof View) && C90599h.m113509b(str4, "setAlpha")) {
            this.f350803a.f350767t = ((View) obj).getAlpha();
        } else if (obj != null && (obj instanceof View) && C90599h.m113509b(str4, "setVisibility")) {
            this.f350803a.f350768u = ((View) obj).getVisibility();
        }
    }

    /* renamed from: b */
    public void mo33109b(String str, String str2, String str3, String str4, String str5, Object obj, Object obj2) {
        if (obj == null || !(obj instanceof View) || !C90599h.m113509b(str4, "setAlpha")) {
            if (obj != null && (obj instanceof View) && C90599h.m113509b(str4, "setVisibility")) {
                int visibility = ((View) obj).getVisibility();
                C117067b bVar = this.f350803a;
                if (visibility != bVar.f350768u) {
                    bVar.getClass();
                    C117536f.m165802d(new b$$a(bVar), 300);
                }
            }
        } else if (Math.abs(((View) obj).getAlpha() - this.f350803a.f350767t) > 2.0E-9f) {
            C117067b bVar2 = this.f350803a;
            bVar2.getClass();
            C117536f.m165802d(new b$$k(bVar2), 300);
        }
    }
}
