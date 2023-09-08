package v23;

import android.os.Bundle;
import fy3.C32226l;
import gy3.C87413o;
import qh2.C101198e;
import rx3.C13598b0;

/* renamed from: v23.e */
public final class C111347e extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C111333a f333354d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111347e(C111333a aVar) {
        super(1);
        this.f333354d = aVar;
    }

    public Object invoke(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            C101198e eVar = this.f333354d.f291492d;
            C101198e.C101199b bVar = C101198e.C101199b.EDIT_COMPOSITION_DURATION_CUT;
            Bundle bundle = new Bundle();
            bundle.putBoolean("EDIT_VLOG_TRACK_CROP_CONFIRM", this.f333354d.f333337w);
            C13598b0 b0Var = C13598b0.f38549a;
            eVar.mo14585p(bVar, bundle);
        }
        return C13598b0.f38549a;
    }
}
