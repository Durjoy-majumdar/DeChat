package os1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0;
import gy3.C87412m;
import zp3.C23555k;

/* renamed from: os1.i */
public final class C62160i extends C23555k.C23562d {

    /* renamed from: a */
    public final /* synthetic */ C62163m f176734a;

    public C62160i(C62163m mVar) {
        this.f176734a = mVar;
    }

    /* renamed from: b */
    public void mo53b(View view, long j, long j2, boolean z) {
        C87412m.m108594g(view, "view");
        this.f176734a.mo87208c3().f176761f = z;
        C2479n0 n0Var = C2479n0.f12955a;
        C2479n0.C2480a value = C2479n0.f12951H.getValue();
        if (z) {
            boolean z2 = true;
            if (value == null || !value.f12908a) {
                z2 = false;
            }
            if (z2) {
                this.f176734a.mo87215k3(value);
                return;
            }
        }
        this.f176734a.mo87210e3();
    }
}
