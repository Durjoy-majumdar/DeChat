package t82;

import android.os.Bundle;
import gy3.C87412m;
import me3.C109612c;
import qh2.C101198e;
import z20.C112579f;

/* renamed from: t82.b */
public final class C110946b implements C109612c.C109620e {

    /* renamed from: a */
    public final /* synthetic */ C110949e f331839a;

    public C110946b(C110949e eVar) {
        this.f331839a = eVar;
    }

    /* renamed from: a */
    public boolean mo79171a(C112579f fVar) {
        C87412m.m108594g(fVar, "item");
        Bundle bundle = new Bundle();
        bundle.putCharSequence("PARAM_EDIT_TEXT_CONTENT", fVar.f337106C);
        bundle.putInt("PARAM_EDIT_TEXT_COLOR", fVar.f337110y);
        bundle.putInt("PARAM_EDIT_TEXT_COLOR_BG_INT", fVar.f337111z);
        this.f331839a.f331843e.mo14585p(C101198e.C101199b.EDIT_CHANGE_TEXT, bundle);
        return true;
    }

    /* renamed from: b */
    public void mo79172b() {
    }

    /* renamed from: c */
    public void mo79173c(Boolean bool) {
        if (bool.booleanValue()) {
            C101198e.C62622a.m73576a(this.f331839a.f331843e, C101198e.C101199b.EDIT_DELETE_ITEM, (Bundle) null, 2, (Object) null);
        } else {
            C101198e.C62622a.m73576a(this.f331839a.f331843e, C101198e.C101199b.EDIT_IN_PREVIEW, (Bundle) null, 2, (Object) null);
        }
    }
}
