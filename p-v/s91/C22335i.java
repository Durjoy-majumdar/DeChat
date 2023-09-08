package s91;

import android.app.Activity;
import android.view.ViewGroup;
import com.tencent.p014mm.sdk.platformtools.Log;
import d91.C20449a;
import g91.C20813c;
import java.lang.ref.WeakReference;
import o91.C100312d;
import o91.C100316i;

/* renamed from: s91.i */
public final class C22335i implements C22353o {

    /* renamed from: a */
    public final C22312a f63329a = new C22312a();

    /* renamed from: b */
    public final C100312d f63330b = new C100312d(4, "18260", "1004");

    /* renamed from: c */
    public WeakReference<Activity> f63331c;

    /* renamed from: d */
    public final C100316i f63332d = new C22336a();

    /* renamed from: e */
    public final C22354p f63333e = new C22337b();

    /* renamed from: s91.i$a */
    public class C22336a implements C100316i {
        public C22336a() {
        }

        /* renamed from: a */
        public void mo35476a(ViewGroup viewGroup, int i) {
            C22335i iVar = C22335i.this;
            C100312d dVar = iVar.f63330b;
            iVar.getClass();
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
            WeakReference<Activity> weakReference = C22335i.this.f63331c;
            if (weakReference != null) {
                Activity activity = weakReference.get();
                if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                    Log.printInfoStack("HABBYGE-MALI.FinderLikeMonitor", "FinderLikeMonitor, onScroll, is NULL or finishing", new Object[0]);
                } else {
                    C22335i.this.f63330b.mo139593o(activity, viewGroup, i, i2, i5);
                }
            }
        }
    }

    /* renamed from: s91.i$b */
    public class C22337b implements C22354p {
        public C22337b() {
        }

        /* renamed from: a */
        public void mo35478a(boolean z) {
            C100312d dVar = C22335i.this.f63330b;
            if (dVar != null) {
                dVar.mo139592n(z);
            }
        }
    }

    /* renamed from: a */
    public void mo35471a() {
        this.f63330b.mo139591m(3, (Activity) null);
    }

    /* renamed from: b */
    public void mo35472b() {
        this.f63330b.mo139591m(2, (Activity) null);
        WeakReference<Activity> weakReference = this.f63331c;
        if (weakReference != null) {
            weakReference.clear();
            this.f63331c = null;
        }
    }

    /* renamed from: c */
    public void mo35473c() {
        WeakReference<Activity> weakReference = this.f63331c;
        if (weakReference != null) {
            this.f63330b.mo139591m(0, weakReference.get());
        }
        this.f63329a.mo35465h(this.f63332d, this.f63333e);
    }

    /* renamed from: d */
    public void mo35474d() {
        this.f63329a.mo35466i();
        this.f63330b.mo139591m(1, (Activity) null);
    }

    /* renamed from: e */
    public void mo35482e(int i, String str, Activity activity) {
        if (!C20449a.m22052d() || !C20449a.m22050b()) {
            Log.m105920e("HABBYGE-MALI.FinderLikeMonitor", "FinderLikeMonitor, monitor, dontNeedMonitorFinder true !!");
            return;
        }
        Log.m105925i("HABBYGE-MALI.FinderLikeMonitor", "FinderLikeMonitor, monitor: %d, %s", Integer.valueOf(i), str);
        if (i == 0) {
            this.f63331c = new WeakReference<>(activity);
            C20813c.m22810a().mo32508c(724, str);
        } else if (i == 1) {
            C20813c.m22810a().mo32508c(725, str);
        } else if (i == 2) {
            C20813c.m22810a().mo32508c(726, str);
        } else if (i == 3) {
            C20813c.m22810a().mo32508c(727, str);
        }
    }
}
