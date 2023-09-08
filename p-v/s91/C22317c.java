package s91;

import android.app.Activity;
import android.view.ViewGroup;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tavkit.component.TAVExporter;
import d91.C20449a;
import g91.C20813c;
import java.lang.ref.WeakReference;
import o91.C100312d;
import o91.C100316i;

/* renamed from: s91.c */
public final class C22317c implements C22353o {

    /* renamed from: a */
    public C22312a f63287a = new C22312a();

    /* renamed from: b */
    public C100312d f63288b = new C100312d(6, "18260", "1006");

    /* renamed from: c */
    public WeakReference<Activity> f63289c;

    /* renamed from: d */
    public final C100316i f63290d = new C22318a();

    /* renamed from: e */
    public final C22354p f63291e = new C22319b();

    /* renamed from: s91.c$a */
    public class C22318a implements C100316i {
        public C22318a() {
        }

        /* renamed from: a */
        public void mo35476a(ViewGroup viewGroup, int i) {
            C22317c cVar = C22317c.this;
            C100312d dVar = cVar.f63288b;
            cVar.getClass();
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
            WeakReference<Activity> weakReference = C22317c.this.f63289c;
            if (weakReference != null) {
                Activity activity = weakReference.get();
                if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                    Log.printInfoStack("HABBYGE-MALI.FinderDetailMonitor", "FinderDetailMonitor, onScroll, is NULL or finishing", new Object[0]);
                } else {
                    C22317c.this.f63288b.mo139593o(activity, viewGroup, i, i2, i5);
                }
            }
        }
    }

    /* renamed from: s91.c$b */
    public class C22319b implements C22354p {
        public C22319b() {
        }

        /* renamed from: a */
        public void mo35478a(boolean z) {
            C100312d dVar = C22317c.this.f63288b;
            if (dVar != null) {
                dVar.mo139592n(z);
            }
        }
    }

    /* renamed from: a */
    public void mo35471a() {
        this.f63288b.mo139591m(3, (Activity) null);
    }

    /* renamed from: b */
    public void mo35472b() {
        this.f63288b.mo139591m(2, (Activity) null);
        WeakReference<Activity> weakReference = this.f63289c;
        if (weakReference != null) {
            weakReference.clear();
            this.f63289c = null;
        }
    }

    /* renamed from: c */
    public void mo35473c() {
        WeakReference<Activity> weakReference = this.f63289c;
        if (weakReference != null) {
            this.f63288b.mo139591m(0, weakReference.get());
        }
        this.f63287a.mo35465h(this.f63290d, this.f63291e);
    }

    /* renamed from: d */
    public void mo35474d() {
        this.f63287a.mo35466i();
        this.f63288b.mo139591m(1, (Activity) null);
    }

    /* renamed from: e */
    public void mo35475e(int i, String str, Activity activity) {
        if (!C20449a.m22052d() || !C20449a.m22050b()) {
            Log.m105920e("HABBYGE-MALI.FinderDetailMonitor", "FinderDetailMonitor, monitor, dontNeedMonitorFinder true !!");
            return;
        }
        Log.m105925i("HABBYGE-MALI.FinderDetailMonitor", "FinderDetailMonitor, monitor: %d, %s", Integer.valueOf(i), str);
        if (i == 0) {
            this.f63289c = new WeakReference<>(activity);
            C20813c.m22810a().mo32508c(TAVExporter.VIDEO_EXPORT_WIDTH, str);
        } else if (i == 1) {
            C20813c.m22810a().mo32508c(721, str);
        } else if (i == 2) {
            C20813c.m22810a().mo32508c(722, str);
        } else if (i == 3) {
            C20813c.m22810a().mo32508c(723, str);
        }
    }
}
