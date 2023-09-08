package s91;

import android.app.Activity;
import android.view.ViewGroup;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import o91.C100312d;
import o91.C100316i;

/* renamed from: s91.f */
public final class C22326f implements C22353o {

    /* renamed from: a */
    public final C22312a f63308a = new C22312a();

    /* renamed from: b */
    public C100312d f63309b = new C100312d(10, "18260", "1010");

    /* renamed from: c */
    public WeakReference<Activity> f63310c;

    /* renamed from: d */
    public final C22327a f63311d;

    /* renamed from: e */
    public final C22328b f63312e;

    /* renamed from: s91.f$a */
    public static final class C22327a implements C100316i {

        /* renamed from: a */
        public final /* synthetic */ C22326f f63313a;

        public C22327a(C22326f fVar) {
            this.f63313a = fVar;
        }

        /* renamed from: a */
        public void mo35476a(ViewGroup viewGroup, int i) {
            C22326f fVar = this.f63313a;
            C100312d dVar = fVar.f63309b;
            fVar.getClass();
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
            WeakReference<Activity> weakReference = this.f63313a.f63310c;
            String str = null;
            Activity activity = weakReference != null ? weakReference.get() : null;
            if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                StringBuilder sb = new StringBuilder();
                sb.append("onScroll, is NULL or finishing: ");
                if (activity != null) {
                    str = activity.getClass().getName();
                }
                sb.append(str);
                Log.printInfoStack("HABBYGE-MALI.FinderFollowMonitor", sb.toString(), new Object[0]);
                return;
            }
            this.f63313a.f63309b.mo139593o(activity, viewGroup, i, i2, i5);
        }
    }

    /* renamed from: s91.f$b */
    public static final class C22328b implements C22354p {

        /* renamed from: a */
        public final /* synthetic */ C22326f f63314a;

        public C22328b(C22326f fVar) {
            this.f63314a = fVar;
        }

        /* renamed from: a */
        public void mo35478a(boolean z) {
            Log.m105919d("HABBYGE-MALI.FinderFollowMonitor", "scrollToPosition: %b", Boolean.valueOf(z));
            this.f63314a.f63309b.mo139592n(z);
        }
    }

    public C22326f(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f63310c = new WeakReference<>(activity);
        this.f63311d = new C22327a(this);
        this.f63312e = new C22328b(this);
    }

    /* renamed from: a */
    public void mo35471a() {
    }

    /* renamed from: b */
    public void mo35472b() {
        WeakReference<Activity> weakReference = this.f63310c;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f63310c = null;
    }

    /* renamed from: c */
    public void mo35473c() {
        Log.m105918d("HABBYGE-MALI.FinderFollowMonitor", "startMonitor");
        this.f63308a.mo35465h(this.f63311d, this.f63312e);
        WeakReference<Activity> weakReference = this.f63310c;
        if (weakReference != null) {
            this.f63309b.mo139591m(4, weakReference != null ? weakReference.get() : null);
        }
    }

    /* renamed from: d */
    public void mo35474d() {
        Log.m105918d("HABBYGE-MALI.FinderFollowMonitor", "stopMonitor");
        this.f63309b.mo139591m(5, (Activity) null);
        this.f63308a.mo35466i();
    }
}
