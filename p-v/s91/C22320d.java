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
import ro0.C90067a;
import ro0.C90068b;

/* renamed from: s91.d */
public final class C22320d implements C22353o {

    /* renamed from: a */
    public final C22312a f63294a = new C22312a();

    /* renamed from: b */
    public C100312d f63295b = new C100312d(9, "18260", "1009");

    /* renamed from: c */
    public WeakReference<Activity> f63296c;

    /* renamed from: d */
    public final C22321a f63297d = new C22321a(this);

    /* renamed from: e */
    public final C22322b f63298e = new C22322b(this);

    /* renamed from: s91.d$a */
    public static final class C22321a implements C100316i {

        /* renamed from: a */
        public final /* synthetic */ C22320d f63299a;

        public C22321a(C22320d dVar) {
            this.f63299a = dVar;
        }

        /* renamed from: a */
        public void mo35476a(ViewGroup viewGroup, int i) {
            C22320d dVar = this.f63299a;
            C100312d dVar2 = dVar.f63295b;
            dVar.getClass();
            int i2 = 2;
            if (i == 0) {
                i2 = 0;
            } else if (i == 1) {
                i2 = 1;
            } else if (i != 2) {
                i2 = -1;
            }
            dVar2.mo139594p(viewGroup, i2);
        }

        /* renamed from: b */
        public void mo35477b(ViewGroup viewGroup, int i, int i2, int i3, int i4, int i5) {
            WeakReference<Activity> weakReference = this.f63299a.f63296c;
            Activity activity = weakReference != null ? weakReference.get() : null;
            if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                Log.printInfoStack("HABBYGE-MALI.FinderFavMonitor", "onScroll, is NULL or finishing", new Object[0]);
            } else {
                this.f63299a.f63295b.mo139593o(activity, viewGroup, i, i2, i5);
            }
        }
    }

    /* renamed from: s91.d$b */
    public static final class C22322b implements C22354p {

        /* renamed from: a */
        public final /* synthetic */ C22320d f63300a;

        public C22322b(C22320d dVar) {
            this.f63300a = dVar;
        }

        /* renamed from: a */
        public void mo35478a(boolean z) {
            this.f63300a.f63295b.mo139592n(z);
        }
    }

    /* renamed from: a */
    public void mo35471a() {
        this.f63295b.mo139591m(3, (Activity) null);
    }

    /* renamed from: b */
    public void mo35472b() {
        this.f63295b.mo139591m(2, (Activity) null);
        WeakReference<Activity> weakReference = this.f63296c;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f63296c = null;
    }

    /* renamed from: c */
    public void mo35473c() {
        WeakReference<Activity> weakReference = this.f63296c;
        if (weakReference != null) {
            this.f63295b.mo139591m(0, weakReference != null ? weakReference.get() : null);
        }
        this.f63294a.mo35465h(this.f63297d, this.f63298e);
    }

    /* renamed from: d */
    public void mo35474d() {
        this.f63294a.mo35466i();
        this.f63295b.mo139591m(1, (Activity) null);
    }

    /* renamed from: e */
    public final void mo35479e(int i, String str, Activity activity) {
        C87412m.m108594g(str, "aName");
        Log.m105925i("HABBYGE-MALI.FinderFavMonitor", "monitor: %d, %s", Integer.valueOf(i), str);
        if (i == 0) {
            if (activity != null) {
                this.f63296c = new WeakReference<>(activity);
            }
            C20813c.m22810a().mo32508c(TMAssistantDownloadSDKErrorCode.DownloadSDKErrorCode_CLIENT_PROTOCOL_EXCEPTION, str);
        } else if (i == 1) {
            C20813c.m22810a().mo32508c(733, str);
        } else if (i == 2) {
            C20813c.m22810a().mo32508c(C90067a.CTRL_INDEX, str);
        } else if (i == 3) {
            C20813c.m22810a().mo32508c(C90068b.CTRL_INDEX, str);
        }
    }
}
