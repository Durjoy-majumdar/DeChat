package l23;

import android.os.Bundle;
import fy3.C32226l;
import gy3.C87413o;
import qh2.C101198e;
import rx3.C13598b0;

/* renamed from: l23.r */
public final class C99317r extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C99310q f291232d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99317r(C99310q qVar) {
        super(1);
        this.f291232d = qVar;
    }

    public Object invoke(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putInt("EDIT_CROP_VIDEO_CURRENT_TIME_INT", (int) this.f291232d.f291223q);
            this.f291232d.f291214e.mo14585p(C101198e.C101199b.EDIT_VIDEO_SEEK, bundle);
        }
        return C13598b0.f38549a;
    }
}
