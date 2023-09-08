package s91;

import android.app.Activity;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1828u;
import com.tencent.p014mm.sdk.platformtools.Log;
import d91.C20449a;
import g91.C20813c;
import java.lang.ref.WeakReference;
import o91.C100312d;
import o91.C100316i;

/* renamed from: s91.n */
public final class C22350n implements C22353o {

    /* renamed from: a */
    public C22312a f63364a = new C22312a();

    /* renamed from: b */
    public C100312d f63365b = new C100312d(3, "18260", "1003");

    /* renamed from: c */
    public WeakReference<Activity> f63366c;

    /* renamed from: d */
    public final C100316i f63367d = new C22351a();

    /* renamed from: e */
    public final C22354p f63368e = new C22352b();

    /* renamed from: s91.n$a */
    public class C22351a implements C100316i {
        public C22351a() {
        }

        /* renamed from: a */
        public void mo35476a(ViewGroup viewGroup, int i) {
            C22350n nVar = C22350n.this;
            C100312d dVar = nVar.f63365b;
            nVar.getClass();
            int i2 = 2;
            if (i == 0) {
                i2 = 0;
            } else if (i == 1) {
                i2 = 1;
            } else if (i != 2) {
                i2 = -1;
            }
            dVar.mo139594p(viewGroup, i2);
        }

        /* renamed from: b */
        public void mo35477b(ViewGroup viewGroup, int i, int i2, int i3, int i4, int i5) {
            WeakReference<Activity> weakReference = C22350n.this.f63366c;
            if (weakReference != null) {
                Activity activity = weakReference.get();
                if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                    Log.printInfoStack("HABBYGE-MALI.FinderTopicMonitor", "FinderTopicMonitor, onScroll, is NULL or finishing", new Object[0]);
                } else {
                    C22350n.this.f63365b.mo139593o(activity, viewGroup, i, i2, i5);
                }
            }
        }
    }

    /* renamed from: s91.n$b */
    public class C22352b implements C22354p {
        public C22352b() {
        }

        /* renamed from: a */
        public void mo35478a(boolean z) {
            C100312d dVar = C22350n.this.f63365b;
            if (dVar != null) {
                dVar.mo139592n(z);
            }
        }
    }

    /* renamed from: a */
    public void mo35471a() {
        this.f63365b.mo139591m(3, (Activity) null);
    }

    /* renamed from: b */
    public void mo35472b() {
        this.f63365b.mo139591m(2, (Activity) null);
        WeakReference<Activity> weakReference = this.f63366c;
        if (weakReference != null) {
            weakReference.clear();
            this.f63366c = null;
        }
    }

    /* renamed from: c */
    public void mo35473c() {
        WeakReference<Activity> weakReference = this.f63366c;
        if (weakReference != null) {
            this.f63365b.mo139591m(0, weakReference.get());
        }
        this.f63364a.mo35465h(this.f63367d, this.f63368e);
    }

    /* renamed from: d */
    public void mo35474d() {
        this.f63364a.mo35466i();
        this.f63365b.mo139591m(1, (Activity) null);
    }

    /* renamed from: e */
    public void mo35486e(int i, String str, Activity activity) {
        if (!C20449a.m22052d() || !C20449a.m22050b()) {
            Log.m105920e("HABBYGE-MALI.FinderTopicMonitor", "FinderTopicMonitor, monitor, dontNeedMonitorFinder true !!");
            return;
        }
        Log.m105925i("HABBYGE-MALI.FinderTopicMonitor", "FinderTopicMonitor, monitor: %d, %s", Integer.valueOf(i), str);
        if (i == 0) {
            this.f63366c = new WeakReference<>(activity);
            C20813c.m22810a().mo32508c(712, str);
        } else if (i == 1) {
            C20813c.m22810a().mo32508c(713, str);
        } else if (i == 2) {
            C20813c.m22810a().mo32508c(C1828u.CTRL_INDEX, str);
        } else if (i == 3) {
            C20813c.m22810a().mo32508c(715, str);
        }
    }
}
