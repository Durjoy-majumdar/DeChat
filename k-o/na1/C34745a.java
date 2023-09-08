package na1;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.expt.resource.MMResReporter;
import com.tencent.p014mm.sdk.platformtools.Log;
import xq3.C38806a;

/* renamed from: na1.a */
public final class C34745a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Activity f93402d;

    /* renamed from: e */
    public final /* synthetic */ long f93403e;

    /* renamed from: f */
    public final /* synthetic */ int f93404f;

    /* renamed from: na1.a$a */
    public static final class C34746a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f93405d;

        /* renamed from: e */
        public final /* synthetic */ Activity f93406e;

        /* renamed from: f */
        public final /* synthetic */ int f93407f;

        public C34746a(long j, Activity activity, int i) {
            this.f93405d = j;
            this.f93406e = activity;
            this.f93407f = i;
        }

        public final void run() {
            long nanoTime = System.nanoTime() - this.f93405d;
            float f = ((float) nanoTime) / ((float) 1000000);
            Log.m105924i("ActivityStartReportHelper", "oncreate costMs:" + f + " costNs:" + nanoTime + " act:" + this.f93406e.getClass().getName());
            MMResReporter mMResReporter = MMResReporter.f80989a;
            MMResReporter.f80991c.add(new MMResReporter.C29898a(this.f93406e.getClass().getName(), nanoTime, this.f93407f, -1));
            Activity activity = this.f93406e;
            if (activity instanceof MMFragmentActivity) {
                C38806a aVar = ((MMFragmentActivity) activity).inflateXMLInfo;
                long j = (long) f;
                aVar.f104642b = j;
                if (j != 0 && Log.isDebug()) {
                    Log.m105918d("InflateXMLInfo", "printInfoBeforeStart " + aVar.mo61776b());
                }
            }
        }
    }

    public C34745a(Activity activity, long j, int i) {
        this.f93402d = activity;
        this.f93403e = j;
        this.f93404f = i;
    }

    public final void run() {
        Window window;
        View decorView;
        Activity activity = this.f93402d;
        if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            decorView.post(new C34746a(this.f93403e, this.f93402d, this.f93404f));
        }
    }
}
