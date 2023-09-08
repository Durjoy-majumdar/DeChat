package m23;

import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import qh2.C101198e;
import rx3.C13598b0;

/* renamed from: m23.l */
public final class C109488l extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C109475c f327713d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109488l(C109475c cVar) {
        super(1);
        this.f327713d = cVar;
    }

    public Object invoke(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            this.f327713d.mo160709A().f327718g.mo104021d();
            C109490n A = this.f327713d.mo160709A();
            Object systemService = A.getContext().getSystemService("input_method");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(A.getWindowToken(), 0);
            C101198e.C62622a.m73576a(this.f327713d.f291492d, C101198e.C101199b.EDIT_CROP_VIDEO_RESUME, (Bundle) null, 2, (Object) null);
            C101198e.C62622a.m73576a(this.f327713d.f291492d, C101198e.C101199b.EDIT_SHOW_OPERATION, (Bundle) null, 2, (Object) null);
        } else {
            C101198e.C62622a.m73576a(this.f327713d.f291492d, C101198e.C101199b.EDIT_HIDE_OPERATION, (Bundle) null, 2, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
