package v23;

import android.os.Bundle;
import fy3.C32226l;
import gy3.C87413o;
import qh2.C101198e;
import rx3.C13598b0;

/* renamed from: v23.w */
public final class C111378w extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C111369t f333433d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111378w(C111369t tVar) {
        super(1);
        this.f333433d = tVar;
    }

    public Object invoke(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putLong("EDIT_VLOG_TRACK_CROP_START", this.f333433d.f333420s);
            bundle.putLong("EDIT_VLOG_TRAKC_CROP_END", this.f333433d.f333421t);
            bundle.putBoolean("EDIT_VLOG_TRACK_CROP_CHANGE", true);
            this.f333433d.f291492d.mo14585p(C101198e.C101199b.EDIT_VLOG_TRACK_CROP, bundle);
        }
        return C13598b0.f38549a;
    }
}
