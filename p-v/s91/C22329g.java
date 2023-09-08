package s91;

import android.app.Activity;
import android.view.ViewGroup;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import o91.C100312d;
import o91.C100316i;

/* renamed from: s91.g */
public final class C22329g implements C22353o {

    /* renamed from: a */
    public final C22312a f63315a = new C22312a();

    /* renamed from: b */
    public C100312d f63316b = new C100312d(11, "18260", "1011");

    /* renamed from: c */
    public WeakReference<Activity> f63317c;

    /* renamed from: d */
    public final C22330a f63318d;

    /* renamed from: e */
    public final C22331b f63319e;

    /* renamed from: s91.g$a */
    public static final class C22330a implements C100316i {

        /* renamed from: a */
        public final /* synthetic */ C22329g f63320a;

        public C22330a(C22329g gVar) {
            this.f63320a = gVar;
        }

        /* renamed from: a */
        public void mo35476a(ViewGroup viewGroup, int i) {
            C22329g gVar = this.f63320a;
            C100312d dVar = gVar.f63316b;
            gVar.getClass();
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
            WeakReference<Activity> weakReference = this.f63320a.f63317c;
            Activity activity = weakReference != null ? weakReference.get() : null;
            if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                Log.printInfoStack("HABBYGE-MALI.FinderFriendMonitor", "onScroll, is NULL or finishing", new Object[0]);
            } else {
                this.f63320a.f63316b.mo139593o(activity, viewGroup, i, i2, i5);
            }
        }
    }

    /* renamed from: s91.g$b */
    public static final class C22331b implements C22354p {

        /* renamed from: a */
        public final /* synthetic */ C22329g f63321a;

        public C22331b(C22329g gVar) {
            this.f63321a = gVar;
        }

        /* renamed from: a */
        public void mo35478a(boolean z) {
            Log.m105919d("HABBYGE-MALI.FinderFriendMonitor", "scrollToPosition: %b", Boolean.valueOf(z));
            this.f63321a.f63316b.mo139592n(z);
        }
    }

    public C22329g(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f63317c = new WeakReference<>(activity);
        this.f63318d = new C22330a(this);
        this.f63319e = new C22331b(this);
    }

    /* renamed from: a */
    public void mo35471a() {
    }

    /* renamed from: b */
    public void mo35472b() {
        WeakReference<Activity> weakReference = this.f63317c;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f63317c = null;
    }

    /* renamed from: c */
    public void mo35473c() {
        Log.m105918d("HABBYGE-MALI.FinderFriendMonitor", "startMonitor...");
        this.f63315a.mo35465h(this.f63318d, this.f63319e);
        WeakReference<Activity> weakReference = this.f63317c;
        if (weakReference != null) {
            this.f63316b.mo139591m(4, weakReference != null ? weakReference.get() : null);
        }
    }

    /* renamed from: d */
    public void mo35474d() {
        Log.m105918d("HABBYGE-MALI.FinderFriendMonitor", "stopMonitor...");
        this.f63315a.mo35466i();
        this.f63316b.mo139591m(5, (Activity) null);
    }
}
