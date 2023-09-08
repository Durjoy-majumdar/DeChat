package sq0;

import com.tencent.p014mm.plugin.appbrand.page.C83820i0;
import hr0.C87584b;
import p224ra.C89909e;
import p963fc.C86812g;

/* renamed from: sq0.a */
public final class C90327a extends C90329c<C86812g> {
    /* renamed from: c */
    public final void mo124558c(C86812g gVar, int i) {
        C90337g t;
        C87584b bVar;
        C83820i0 currentPage = gVar.mo113042Z().getCurrentPage();
        if (currentPage != null && (t = currentPage.mo116307t(C90339i.WITH_CONFIRM_DIALOG)) != null && (bVar = (C87584b) C89909e.m112439d(C87584b.class, true)) != null) {
            Object[] objArr = new Object[5];
            objArr[0] = gVar.f238147j;
            objArr[1] = Long.valueOf(System.currentTimeMillis());
            C83820i0 currentPage2 = gVar.mo113042Z().getCurrentPage();
            String currentUrl = currentPage2 != null ? currentPage2.getCurrentUrl() : null;
            String str = "";
            if (currentUrl == null) {
                currentUrl = str;
            }
            objArr[2] = currentUrl;
            objArr[3] = Integer.valueOf(i);
            if (i == 1) {
                str = t.f259318a;
            }
            objArr[4] = str;
            bVar.mo121691h(19169, objArr);
        }
    }
}
