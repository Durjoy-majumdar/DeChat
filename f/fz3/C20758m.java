package fz3;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import d04.C24442a;
import gy3.C87412m;
import java.util.Collection;
import java.util.Map;
import sx3.C110818d0;
import ty3.C26336h;
import vz3.C22826c;
import vz3.C22830f;
import wy3.C26436b;

/* renamed from: fz3.m */
public final class C20758m {

    /* renamed from: a */
    public static final C20758m f58648a = new C20758m();

    /* renamed from: a */
    public final boolean mo32447a(C26436b bVar) {
        C87412m.m108594g(bVar, "callableMemberDescriptor");
        Map<C22826c, C22830f> map = C20750j.f58640a;
        if (!C20750j.f58643d.contains(bVar.getName())) {
            return false;
        }
        if (C110818d0.m150903D(C20750j.f58642c, C24442a.m30536c(bVar)) && bVar.mo52639h().isEmpty()) {
            return true;
        }
        if (!C26336h.m33824A(bVar)) {
            return false;
        }
        Collection<? extends C26436b> e = bVar.mo52633e();
        C87412m.m108593f(e, "overriddenDescriptors");
        if (e.isEmpty()) {
            return false;
        }
        for (C26436b bVar2 : e) {
            C20758m mVar = f58648a;
            C87412m.m108593f(bVar2, LocaleUtil.ITALIAN);
            if (mVar.mo32447a(bVar2)) {
                return true;
            }
        }
        return false;
    }
}
