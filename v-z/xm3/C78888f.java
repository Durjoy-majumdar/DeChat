package xm3;

import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import java.util.List;
import tm3.C78068v;

/* renamed from: xm3.f */
public final class C78888f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C78899g f231744d;

    /* renamed from: e */
    public final /* synthetic */ List<String> f231745e;

    public C78888f(C78899g gVar, List<String> list) {
        this.f231744d = gVar;
        this.f231745e = list;
    }

    public final void run() {
        UIStateCenter e3 = this.f231744d.mo14599e3();
        if (e3 != null) {
            e3.dispatch(new C78068v(this.f231745e, -1));
        }
    }
}
