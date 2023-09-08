package bq1;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Looper;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Future;
import o40.C61926c;
import rx3.C13598b0;
import zt3.C119157j;

/* renamed from: bq1.b */
public final class C54534b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d */
    public static final C54534b f152890d = new C54534b();

    /* renamed from: e */
    public static MMHandler f152891e = new MMHandler(Looper.getMainLooper());

    /* renamed from: f */
    public static Runnable f152892f;

    /* renamed from: g */
    public static Future<?> f152893g;

    /* renamed from: h */
    public static Future<?> f152894h;

    /* renamed from: i */
    public static final ArrayList<C54533a> f152895i = new ArrayList<>();

    /* renamed from: j */
    public static final HashSet<String> f152896j = new HashSet<>();

    /* renamed from: n */
    public static volatile boolean f152897n;

    /* renamed from: o */
    public static C32224a<C13598b0> f152898o;

    /* renamed from: bq1.b$a */
    public static final class C54535a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f152899d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54535a(String str) {
            super(0);
            this.f152899d = str;
        }

        public Object invoke() {
            if (C54534b.f152897n) {
                ArrayList<C54533a> arrayList = C54534b.f152895i;
                String str = this.f152899d;
                C87412m.m108593f(str, "name");
                Iterator<C54533a> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().mo75396a(str);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: bq1.b$b */
    public static final class C54536b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f152900d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54536b(String str) {
            super(0);
            this.f152900d = str;
        }

        public Object invoke() {
            if (!C54534b.f152897n) {
                ArrayList<C54533a> arrayList = C54534b.f152895i;
                String str = this.f152900d;
                C87412m.m108593f(str, "name");
                Iterator<C54533a> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().mo75397b(str);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: bq1.b$c */
    public static final class C54537c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f152901d;

        public C54537c(C32224a aVar) {
            this.f152901d = aVar;
        }

        public final /* synthetic */ void run() {
            this.f152901d.invoke();
        }
    }

    /* renamed from: a */
    public final Future<?> mo75398a(C32224a<C13598b0> aVar, long j, String str) {
        C115669n.INSTANCE.mo175911u(1808, 0);
        if (j < 0) {
            Log.m105924i("MicroMsg.FinderLifecycleCallback", str + " return for delayMs:" + j);
            return null;
        }
        Log.m105924i("MicroMsg.FinderLifecycleCallback", str + " delayMs:" + j);
        return ((C119157j) C119157j.f356862d).mo183878i(new C54537c(aVar), j);
    }

    /* renamed from: b */
    public final String mo75399b(Activity activity) {
        return activity.getClass().getName() + '_' + activity.hashCode();
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C87412m.m108594g(activity, "p0");
    }

    public void onActivityDestroyed(Activity activity) {
        C87412m.m108594g(activity, "p0");
    }

    public void onActivityPaused(Activity activity) {
        C87412m.m108594g(activity, "p0");
    }

    public void onActivityResumed(Activity activity) {
        C87412m.m108594g(activity, "p0");
        Log.m105918d("MicroMsg.FinderLifecycleCallback", "onActivityResumed: " + mo75399b(activity));
        String simpleName = activity.getClass().getSimpleName();
        C54534b bVar = f152890d;
        if (!(activity instanceof MMFinderUI)) {
            activity = null;
        }
        if (activity != null) {
            f152896j.add(bVar.mo75399b(activity));
            if (!f152897n) {
                f152897n = true;
                ((C119157j) C119157j.f356862d).mo183894y("FINDER-BG");
                f152898o = null;
                C61926c.m72660E("FINDER-FG", false, new C54535a(simpleName));
            }
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C87412m.m108594g(activity, "p0");
        C87412m.m108594g(bundle, "p1");
    }

    public void onActivityStarted(Activity activity) {
        C87412m.m108594g(activity, "p0");
    }

    public void onActivityStopped(Activity activity) {
        C87412m.m108594g(activity, "p0");
        Log.m105918d("MicroMsg.FinderLifecycleCallback", "onActivityStopped: " + mo75399b(activity));
        HashSet<String> hashSet = f152896j;
        hashSet.remove(mo75399b(activity));
        String simpleName = activity.getClass().getSimpleName();
        if (f152897n && hashSet.isEmpty()) {
            f152897n = false;
            C54536b bVar = new C54536b(simpleName);
            f152898o = bVar;
            C61926c.m72662G("FINDER-BG", false, bVar, 600);
        }
    }
}
