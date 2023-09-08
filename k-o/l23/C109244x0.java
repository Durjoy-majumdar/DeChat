package l23;

import android.os.Bundle;
import fy3.C32226l;
import gy3.C87413o;
import qh2.C101198e;
import rx3.C13598b0;

/* renamed from: l23.x0 */
public final class C109244x0 extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C109235u0 f327069d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109244x0(C109235u0 u0Var) {
        super(1);
        this.f327069d = u0Var;
    }

    public Object invoke(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putLong("EDIT_VLOG_TRACK_CROP_START", this.f327069d.f327054u);
            bundle.putLong("EDIT_VLOG_TRAKC_CROP_END", this.f327069d.f327055v);
            bundle.putBoolean("EDIT_VLOG_TRACK_CROP_CONFIRM", this.f327069d.f327050q);
            bundle.putBoolean("EDIT_VLOG_TRACK_CROP_CHANGE", false);
            bundle.putInt("EDIT_TRACK_DURATION_CUT_COUNT", this.f327069d.mo160476x().getCutCnt());
            bundle.putInt("EDIT_TRACK_DURATION_SCROLL_COUNT", this.f327069d.mo160476x().getDragCnt());
            this.f327069d.f291492d.mo14585p(C101198e.C101199b.EDIT_VLOG_TRACK_CROP, bundle);
        }
        return C13598b0.f38549a;
    }
}
