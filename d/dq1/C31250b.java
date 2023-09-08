package dq1;

import android.app.Activity;
import er1.C58741j5;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import nj3.C76879j;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: dq1.b */
public final class C31250b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Activity f83716d;

    /* renamed from: dq1.b$a */
    public static final class C31251a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Activity f83717d;

        /* renamed from: e */
        public final /* synthetic */ String f83718e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31251a(Activity activity, String str) {
            super(0);
            this.f83717d = activity;
            this.f83718e = str;
        }

        public Object invoke() {
            Activity activity = this.f83717d;
            C87412m.m108591d(activity);
            C76879j.m92748s(activity, this.f83718e, "嗯");
            return C13598b0.f38549a;
        }
    }

    public C31250b(Activity activity) {
        this.f83716d = activity;
    }

    public final void run() {
        C61926c.m72668M(new C31251a(this.f83716d, C58741j5.f168184a.mo83728b()));
    }
}
