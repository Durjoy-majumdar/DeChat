package y23;

import android.content.Intent;
import android.os.Bundle;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import kj2.C61103a;
import lh2.C109344g0;
import lh2.C99417a;
import qh2.C101198e;

/* renamed from: y23.i */
public final class C112389i extends C99417a implements C101198e {

    /* renamed from: f */
    public Intent f336504f;

    /* renamed from: g */
    public final HashMap<String, C112388h<? extends C61103a>> f336505g = new HashMap<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112389i(C101198e eVar, Intent intent) {
        super(eVar, (String) null);
        C87412m.m108594g(eVar, "status");
        C87412m.m108594g(intent, "intent");
        this.f336504f = intent;
    }

    /* renamed from: f */
    public void mo129834f(C109344g0 g0Var) {
        C87412m.m108594g(g0Var, "plugin");
    }

    public void onPause() {
        for (Map.Entry<String, C112388h<? extends C61103a>> value : this.f336505g.entrySet()) {
            ((C112388h) value.getValue()).mo14582b();
        }
    }

    public void onResume() {
        for (Map.Entry<String, C112388h<? extends C61103a>> value : this.f336505g.entrySet()) {
            ((C112388h) value.getValue()).mo14583c();
        }
    }

    /* renamed from: p */
    public void mo14585p(C101198e.C101199b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        for (Map.Entry<String, C112388h<? extends C61103a>> value : this.f336505g.entrySet()) {
            ((C112388h) value.getValue()).mo14585p(bVar, bundle);
        }
    }

    public void release() {
        this.f336505g.clear();
    }

    /* renamed from: x */
    public final void mo164105x(C112388h<? extends C61103a> hVar) {
        C87412m.m108594g(hVar, "info");
        this.f336505g.put(hVar.mo14584g(), hVar);
        hVar.mo14581a(this.f336504f);
    }

    /* renamed from: y */
    public final <T extends C112388h<? extends C61103a>> T mo164106y(String str) {
        C87412m.m108594g(str, "reportId");
        if (this.f336505g.get(str) == null) {
            return null;
        }
        T t = this.f336505g.get(str);
        C87412m.m108592e(t, "null cannot be cast to non-null type T of com.tencent.mm.plugin.vlog.ui.timelineeditor.report.TimelineEditorReportPlugin.getReportInfo");
        return (C112388h) t;
    }
}
