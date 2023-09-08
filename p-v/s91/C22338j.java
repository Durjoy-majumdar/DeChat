package s91;

import android.app.Activity;
import android.view.ViewGroup;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import o91.C100312d;
import o91.C100316i;

/* renamed from: s91.j */
public final class C22338j implements C22353o {

    /* renamed from: a */
    public final C22312a f63336a = new C22312a();

    /* renamed from: b */
    public C100312d f63337b = new C100312d(12, "18260", "1012");

    /* renamed from: c */
    public WeakReference<Activity> f63338c;

    /* renamed from: d */
    public final C22339a f63339d;

    /* renamed from: e */
    public final C22340b f63340e;

    /* renamed from: s91.j$a */
    public static final class C22339a implements C100316i {

        /* renamed from: a */
        public final /* synthetic */ C22338j f63341a;

        public C22339a(C22338j jVar) {
            this.f63341a = jVar;
        }

        /* renamed from: a */
        public void mo35476a(ViewGroup viewGroup, int i) {
            C22338j jVar = this.f63341a;
            C100312d dVar = jVar.f63337b;
            jVar.getClass();
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
            WeakReference<Activity> weakReference = this.f63341a.f63338c;
            Activity activity = weakReference != null ? weakReference.get() : null;
            if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                Log.printInfoStack("HABBYGE-MALI.FinderMachineMonitor", "onScroll, is NULL or finishing", new Object[0]);
            } else {
                this.f63341a.f63337b.mo139593o(activity, viewGroup, i, i2, i5);
            }
        }
    }

    /* renamed from: s91.j$b */
    public static final class C22340b implements C22354p {

        /* renamed from: a */
        public final /* synthetic */ C22338j f63342a;

        public C22340b(C22338j jVar) {
            this.f63342a = jVar;
        }

        /* renamed from: a */
        public void mo35478a(boolean z) {
            Log.m105919d("HABBYGE-MALI.FinderMachineMonitor", "scrollToPosition: %b", Boolean.valueOf(z));
            this.f63342a.f63337b.mo139592n(z);
        }
    }

    public C22338j(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f63338c = new WeakReference<>(activity);
        this.f63339d = new C22339a(this);
        this.f63340e = new C22340b(this);
    }

    /* renamed from: a */
    public void mo35471a() {
    }

    /* renamed from: b */
    public void mo35472b() {
        WeakReference<Activity> weakReference = this.f63338c;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f63338c = null;
    }

    /* renamed from: c */
    public void mo35473c() {
        Log.m105918d("HABBYGE-MALI.FinderMachineMonitor", "startMonitor...");
        this.f63336a.mo35465h(this.f63339d, this.f63340e);
        WeakReference<Activity> weakReference = this.f63338c;
        if (weakReference != null) {
            this.f63337b.mo139591m(4, weakReference != null ? weakReference.get() : null);
        }
    }

    /* renamed from: d */
    public void mo35474d() {
        Log.m105918d("HABBYGE-MALI.FinderMachineMonitor", "stopMonitor...");
        this.f63336a.mo35466i();
        this.f63337b.mo139591m(5, (Activity) null);
    }
}
