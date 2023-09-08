package mp0;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.performance.AppBrandPerformanceManager;
import js0.C88024r;
import p1044ub.C90630c;
import p910lj.C76701a;

/* renamed from: mp0.d */
public class C88796d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C90630c f256203d;

    /* renamed from: e */
    public final /* synthetic */ Context f256204e;

    /* renamed from: mp0.d$a */
    public class C88797a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f256205d;

        public C88797a(boolean z) {
            this.f256205d = z;
        }

        public void run() {
            C76701a.makeText(C88796d.this.f256204e, this.f256205d ? C0966R.string.f7780re : C0966R.string.f7778rc, 0).show();
        }
    }

    public C88796d(C88798e eVar, C90630c cVar, Context context) {
        this.f256203d = cVar;
        this.f256204e = context;
    }

    public void run() {
        C88024r.m109572b(new C88797a(AppBrandPerformanceManager.m103493b(this.f256203d.getRuntime())));
    }
}
