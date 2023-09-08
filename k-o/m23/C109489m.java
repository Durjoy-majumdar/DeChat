package m23;

import android.os.Bundle;
import fy3.C32226l;
import gy3.C87413o;
import qh2.C101198e;
import rx3.C13598b0;

/* renamed from: m23.m */
public final class C109489m extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C109475c f327714d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109489m(C109475c cVar) {
        super(1);
        this.f327714d = cVar;
    }

    public Object invoke(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C101198e.C62622a.m73576a(this.f327714d.f291492d, C101198e.C101199b.EDIT_HIDE_OPERATION, (Bundle) null, 2, (Object) null);
        } else {
            C101198e.C62622a.m73576a(this.f327714d.f291492d, C101198e.C101199b.EDIT_SHOW_OPERATION, (Bundle) null, 2, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
