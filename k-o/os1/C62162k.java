package os1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0;
import gy3.C87412m;
import zp3.C23555k;

/* renamed from: os1.k */
public final class C62162k extends C23555k.C23562d {

    /* renamed from: a */
    public final /* synthetic */ C62163m f176736a;

    public C62162k(C62163m mVar) {
        this.f176736a = mVar;
    }

    /* renamed from: b */
    public void mo53b(View view, long j, long j2, boolean z) {
        C87412m.m108594g(view, "view");
        this.f176736a.mo87208c3().f176757b = z;
        C2479n0 n0Var = C2479n0.f12955a;
        C2479n0.C2480a value = C2479n0.f12957c.getValue();
        if (z) {
            boolean z2 = true;
            if (value == null || !value.f12908a) {
                z2 = false;
            }
            if (z2) {
                this.f176736a.mo87216l3(value);
                return;
            }
        }
        this.f176736a.mo87211f3();
    }
}
