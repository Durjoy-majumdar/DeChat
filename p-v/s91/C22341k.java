package s91;

import android.app.Activity;
import android.view.ViewGroup;
import com.tencent.p014mm.sdk.platformtools.Log;
import d91.C20449a;
import g91.C20813c;
import java.lang.ref.WeakReference;
import o91.C100312d;
import o91.C100316i;

/* renamed from: s91.k */
public final class C22341k implements C22353o {

    /* renamed from: a */
    public C22312a f63343a = new C22312a();

    /* renamed from: b */
    public C100312d f63344b = new C100312d(2, "18260", "1002");

    /* renamed from: c */
    public WeakReference<Activity> f63345c;

    /* renamed from: d */
    public final C100316i f63346d = new C22342a();

    /* renamed from: e */
    public final C22354p f63347e = new C22343b();

    /* renamed from: s91.k$a */
    public class C22342a implements C100316i {
        public C22342a() {
        }

        /* renamed from: a */
        public void mo35476a(ViewGroup viewGroup, int i) {
            C22341k kVar = C22341k.this;
            C100312d dVar = kVar.f63344b;
            kVar.getClass();
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
            WeakReference<Activity> weakReference = C22341k.this.f63345c;
            if (weakReference != null) {
                Activity activity = weakReference.get();
                if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                    Log.printInfoStack("HABBYGE-MALI.FinderProfileMonitor", "FinderProfileMonitor, onScroll, is NULL or finishing", new Object[0]);
                } else {
                    C22341k.this.f63344b.mo139593o(activity, viewGroup, i, i2, i5);
                }
            }
        }
    }

    /* renamed from: s91.k$b */
    public class C22343b implements C22354p {
        public C22343b() {
        }

        /* renamed from: a */
        public void mo35478a(boolean z) {
            C100312d dVar = C22341k.this.f63344b;
            if (dVar != null) {
                dVar.mo139592n(z);
            }
        }
    }

    /* renamed from: a */
    public void mo35471a() {
        Log.m105918d("HABBYGE-MALI.FinderProfileMonitor", "report...");
        this.f63344b.mo139591m(3, (Activity) null);
    }

    /* renamed from: b */
    public void mo35472b() {
        Log.m105918d("HABBYGE-MALI.FinderProfileMonitor", "free...");
        this.f63344b.mo139591m(2, (Activity) null);
        WeakReference<Activity> weakReference = this.f63345c;
        if (weakReference != null) {
            weakReference.clear();
            this.f63345c = null;
        }
    }

    /* renamed from: c */
    public void mo35473c() {
        Log.m105918d("HABBYGE-MALI.FinderProfileMonitor", "startMonitor...");
        WeakReference<Activity> weakReference = this.f63345c;
        if (weakReference != null) {
            this.f63344b.mo139591m(0, weakReference.get());
        }
        this.f63343a.mo35465h(this.f63346d, this.f63347e);
    }

    /* renamed from: d */
    public void mo35474d() {
        Log.m105918d("HABBYGE-MALI.FinderProfileMonitor", "stopMonitor...");
        this.f63343a.mo35466i();
        this.f63344b.mo139591m(1, (Activity) null);
    }

    /* renamed from: e */
    public void mo35483e(int i, String str, Activity activity) {
        if (!C20449a.m22052d() || !C20449a.m22050b()) {
            Log.m105920e("HABBYGE-MALI.FinderProfileMonitor", "FinderProfileMonitor, monitor, dontNeedMonitorFinder true !!");
            return;
        }
        Log.m105925i("HABBYGE-MALI.FinderProfileMonitor", "FinderProfileMonitor, monitor: %d, %s", Integer.valueOf(i), str);
        if (i == 0) {
            this.f63345c = new WeakReference<>(activity);
            C20813c.m22810a().mo32508c(708, str);
        } else if (i == 1) {
            C20813c.m22810a().mo32508c(709, str);
        } else if (i == 2) {
            C20813c.m22810a().mo32508c(710, str);
        } else if (i == 3) {
            C20813c.m22810a().mo32508c(711, str);
        }
    }
}
