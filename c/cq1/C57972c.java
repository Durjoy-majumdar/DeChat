package cq1;

import android.view.MotionEvent;
import android.view.View;
import gy3.C87412m;
import jq3.C60897k;
import jq3.C9493c;

/* renamed from: cq1.c */
public final class C57972c implements C60897k<C57974g> {

    /* renamed from: a */
    public final /* synthetic */ C57963b f165883a;

    public C57972c(C57963b bVar) {
        this.f165883a = bVar;
    }

    /* renamed from: a */
    public boolean mo2039a(View view, C9493c cVar, int i) {
        C60897k.C9501a.m9192a(this, view, (C57974g) cVar, i);
        return false;
    }

    /* renamed from: b */
    public boolean mo2040b(View view, MotionEvent motionEvent, C9493c cVar, int i) {
        C60897k.C9501a.m9193b(this, view, motionEvent, (C57974g) cVar, i);
        return false;
    }

    /* renamed from: c */
    public void mo2041c(View view, C9493c cVar, int i) {
        C57974g gVar = (C57974g) cVar;
        C87412m.m108594g(view, "itemView");
        C87412m.m108594g(gVar, "data");
        if (gVar.f165886f != 4) {
            String M = this.f165883a.mo77762M(gVar.f165885e);
            C57963b bVar = this.f165883a;
            String username = gVar.f165885e.getUsername();
            C87412m.m108593f(username, "data.contact.username");
            bVar.dismiss();
            bVar.f165868t.mo64632a(M, username);
        }
    }
}
