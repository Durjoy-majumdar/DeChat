package hy0;

import com.tencent.p014mm.plugin.brandservice.p028ui.widget.MPExoVideoWrapper;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import gy3.C87412m;

/* renamed from: hy0.n */
public final class C98570n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MPExoVideoWrapper f289014d;

    public C98570n(MPExoVideoWrapper mPExoVideoWrapper) {
        this.f289014d = mPExoVideoWrapper;
    }

    public final void run() {
        C96814a.C57541b bVar = this.f289014d.f51523t;
        if (bVar != null) {
            C87412m.m108591d(bVar);
            bVar.mo22957I3("", "", Boolean.FALSE);
        }
    }
}
