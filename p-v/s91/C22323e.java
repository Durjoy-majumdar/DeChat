package s91;

import android.app.Activity;
import android.view.ViewGroup;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.common.TMAssistantDownloadSDKErrorCode;
import g91.C20813c;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import o91.C100312d;
import o91.C100316i;

/* renamed from: s91.e */
public final class C22323e implements C22353o {

    /* renamed from: a */
    public final C22312a f63301a = new C22312a();

    /* renamed from: b */
    public C100312d f63302b = new C100312d(8, "18260", "1008");

    /* renamed from: c */
    public WeakReference<Activity> f63303c;

    /* renamed from: d */
    public final C22324a f63304d = new C22324a(this);

    /* renamed from: e */
    public final C22325b f63305e = new C22325b(this);

    /* renamed from: s91.e$a */
    public static final class C22324a implements C100316i {

        /* renamed from: a */
        public final /* synthetic */ C22323e f63306a;

        public C22324a(C22323e eVar) {
            this.f63306a = eVar;
        }

        /* renamed from: a */
        public void mo35476a(ViewGroup viewGroup, int i) {
            C22323e eVar = this.f63306a;
            C100312d dVar = eVar.f63302b;
            eVar.getClass();
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
            WeakReference<Activity> weakReference = this.f63306a.f63303c;
            Activity activity = weakReference != null ? weakReference.get() : null;
            if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                Log.printInfoStack("HABBYGE-MALI.FinderFeedRelMonitor", "onScroll, is NULL or finishing", new Object[0]);
            } else {
                this.f63306a.f63302b.mo139593o(activity, viewGroup, i, i2, i5);
            }
        }
    }

    /* renamed from: s91.e$b */
    public static final class C22325b implements C22354p {

        /* renamed from: a */
        public final /* synthetic */ C22323e f63307a;

        public C22325b(C22323e eVar) {
            this.f63307a = eVar;
        }

        /* renamed from: a */
        public void mo35478a(boolean z) {
            this.f63307a.f63302b.mo139592n(z);
        }
    }

    /* renamed from: a */
    public void mo35471a() {
        this.f63302b.mo139591m(3, (Activity) null);
    }

    /* renamed from: b */
    public void mo35472b() {
        this.f63302b.mo139591m(2, (Activity) null);
        WeakReference<Activity> weakReference = this.f63303c;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f63303c = null;
    }

    /* renamed from: c */
    public void mo35473c() {
        WeakReference<Activity> weakReference = this.f63303c;
        if (weakReference != null) {
            this.f63302b.mo139591m(0, weakReference != null ? weakReference.get() : null);
        }
        this.f63301a.mo35465h(this.f63304d, this.f63305e);
    }

    /* renamed from: d */
    public void mo35474d() {
        this.f63301a.mo35466i();
        this.f63302b.mo139591m(1, (Activity) null);
    }

    /* renamed from: e */
    public final void mo35480e(int i, String str, Activity activity) {
        C87412m.m108594g(str, "aName");
        Log.m105925i("HABBYGE-MALI.FinderFeedRelMonitor", "monitor: %d, %s", Integer.valueOf(i), str);
        if (i == 0) {
            if (activity != null) {
                this.f63303c = new WeakReference<>(activity);
            }
            C20813c.m22810a().mo32508c(728, str);
        } else if (i == 1) {
            C20813c.m22810a().mo32508c(729, str);
        } else if (i == 2) {
            C20813c.m22810a().mo32508c(TMAssistantDownloadSDKErrorCode.DownloadSDKErrorCode_SPACE_NOT_ENOUGH, str);
        } else if (i == 3) {
            C20813c.m22810a().mo32508c(731, str);
        }
    }
}
