package lh2;

import android.os.Bundle;
import fy3.C32226l;
import gy3.C87413o;
import qh2.C101198e;
import rx3.C13598b0;

/* renamed from: lh2.f */
public final class C99430f extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C99426e f291528d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99430f(C99426e eVar) {
        super(1);
        this.f291528d = eVar;
    }

    public Object invoke(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C101198e.C62622a.m73576a(this.f291528d.f291492d, C101198e.C101199b.EDIT_VIDEO_WITH_EMOJI, (Bundle) null, 2, (Object) null);
        } else {
            C101198e.C62622a.m73576a(this.f291528d.f291492d, C101198e.C101199b.EDIT_IN_PREVIEW, (Bundle) null, 2, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
