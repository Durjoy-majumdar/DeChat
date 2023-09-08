package s91;

import android.app.Activity;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.appbrand.jsapi.C83135z1;
import com.tencent.p014mm.sdk.platformtools.Log;
import g91.C20813c;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import o91.C100312d;
import o91.C100316i;

/* renamed from: s91.h */
public final class C22332h implements C22353o {

    /* renamed from: a */
    public final C22312a f63322a = new C22312a();

    /* renamed from: b */
    public C100312d f63323b = new C100312d(13, "18260", "1013");

    /* renamed from: c */
    public WeakReference<Activity> f63324c;

    /* renamed from: d */
    public final C22333a f63325d = new C22333a(this);

    /* renamed from: e */
    public final C22334b f63326e = new C22334b(this);

    /* renamed from: s91.h$a */
    public static final class C22333a implements C100316i {

        /* renamed from: a */
        public final /* synthetic */ C22332h f63327a;

        public C22333a(C22332h hVar) {
            this.f63327a = hVar;
        }

        /* renamed from: a */
        public void mo35476a(ViewGroup viewGroup, int i) {
            C22332h hVar = this.f63327a;
            C100312d dVar = hVar.f63323b;
            hVar.getClass();
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
            WeakReference<Activity> weakReference = this.f63327a.f63324c;
            Activity activity = weakReference != null ? weakReference.get() : null;
            if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                Log.printInfoStack("HABBYGE-MALI.FinderLbsMonitor", "onScroll, is NULL or finishing", new Object[0]);
            } else {
                this.f63327a.f63323b.mo139593o(activity, viewGroup, i, i2, i5);
            }
        }
    }

    /* renamed from: s91.h$b */
    public static final class C22334b implements C22354p {

        /* renamed from: a */
        public final /* synthetic */ C22332h f63328a;

        public C22334b(C22332h hVar) {
            this.f63328a = hVar;
        }

        /* renamed from: a */
        public void mo35478a(boolean z) {
            this.f63328a.f63323b.mo139592n(z);
        }
    }

    /* renamed from: a */
    public void mo35471a() {
        this.f63323b.mo139591m(3, (Activity) null);
    }

    /* renamed from: b */
    public void mo35472b() {
        this.f63323b.mo139591m(2, (Activity) null);
        WeakReference<Activity> weakReference = this.f63324c;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f63324c = null;
    }

    /* renamed from: c */
    public void mo35473c() {
        WeakReference<Activity> weakReference = this.f63324c;
        if (weakReference != null) {
            this.f63323b.mo139591m(0, weakReference != null ? weakReference.get() : null);
        }
        this.f63322a.mo35465h(this.f63325d, this.f63326e);
    }

    /* renamed from: d */
    public void mo35474d() {
        this.f63322a.mo35466i();
        this.f63323b.mo139591m(1, (Activity) null);
    }

    /* renamed from: e */
    public final void mo35481e(int i, String str, Activity activity) {
        C87412m.m108594g(str, "aName");
        Log.m105925i("HABBYGE-MALI.FinderLbsMonitor", "monitor: %d, %s", Integer.valueOf(i), str);
        if (i == 0) {
            if (activity != null) {
                this.f63324c = new WeakReference<>(activity);
            }
            C20813c.m22810a().mo32508c(744, str);
        } else if (i == 1) {
            C20813c.m22810a().mo32508c(745, str);
        } else if (i == 2) {
            C20813c.m22810a().mo32508c(746, str);
        } else if (i == 3) {
            C20813c.m22810a().mo32508c(C83135z1.CTRL_INDEX, str);
        }
    }
}
