package l23;

import android.os.Bundle;
import fy3.C32226l;
import gy3.C87413o;
import qh2.C101198e;
import rx3.C13598b0;

/* renamed from: l23.e */
public final class C109181e extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C109154a f326901d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109181e(C109154a aVar) {
        super(1);
        this.f326901d = aVar;
    }

    public Object invoke(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            C101198e eVar = this.f326901d.f291492d;
            C101198e.C101199b bVar = C101198e.C101199b.EDIT_COMPOSITION_DURATION_CUT;
            Bundle bundle = new Bundle();
            bundle.putBoolean("EDIT_VLOG_TRACK_CROP_CONFIRM", this.f326901d.f326843u);
            C13598b0 b0Var = C13598b0.f38549a;
            eVar.mo14585p(bVar, bundle);
        }
        return C13598b0.f38549a;
    }
}
