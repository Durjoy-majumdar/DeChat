package xx0;

import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40716j0;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40744p;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40789z;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: xx0.g */
public final class C53465g extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ int f150382d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53465g(int i) {
        super(0);
        this.f150382d = i;
    }

    public Object invoke() {
        MultiProcessMMKV g = C40716j0.m43979g();
        C53458b bVar = C53458b.f150358a;
        int i = this.f150382d;
        C40744p.m44017c(g, "_tmpl_download_time_" + i);
        C40789z.m44095k(this.f150382d);
        return C13598b0.f38549a;
    }
}
