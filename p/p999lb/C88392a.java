package p999lb;

import android.graphics.Rect;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84574p4;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84710x4;
import gy3.C87412m;

/* renamed from: lb.a */
public class C88392a extends C84710x4 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88392a(AppBrandRuntime appBrandRuntime) {
        super(appBrandRuntime);
        C87412m.m108594g(appBrandRuntime, "rt");
    }

    /* renamed from: ha */
    public int mo117256ha(C81925i2 i2Var) {
        C87412m.m108594g(i2Var, "service");
        int ha = super.mo117256ha(i2Var);
        if (ha > 0) {
            return ha;
        }
        Rect safeAreaInsets = i2Var.f240292z.getSafeAreaInsets();
        return Math.max(ha, safeAreaInsets != null ? safeAreaInsets.top : 0);
    }

    public C84574p4.C84575a q80() {
        return new C84574p4.C84575a(0, super.q80().f246778b + mo117439a(C0966R.dimen.f4085r0), mo117439a(C0966R.dimen.f4056q2) + mo117439a(C0966R.dimen.f4084qz), 0);
    }
}
