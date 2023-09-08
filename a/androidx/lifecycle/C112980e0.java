package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.C39623j;

/* renamed from: androidx.lifecycle.e0 */
public class C112980e0 extends Fragment {

    /* renamed from: e */
    public static final /* synthetic */ int f338207e = 0;

    /* renamed from: d */
    public C103758a f338208d;

    /* renamed from: androidx.lifecycle.e0$a */
    public interface C103758a {
    }

    /* renamed from: androidx.lifecycle.e0$b */
    public static class C112981b implements Application.ActivityLifecycleCallbacks {
        public static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new C112981b());
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            C112980e0.m154617a(activity, C39623j.C39625b.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            C112980e0.m154617a(activity, C39623j.C39625b.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            C112980e0.m154617a(activity, C39623j.C39625b.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            C112980e0.m154617a(activity, C39623j.C39625b.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            C112980e0.m154617a(activity, C39623j.C39625b.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            C112980e0.m154617a(activity, C39623j.C39625b.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: a */
    public static void m154617a(Activity activity, C39623j.C39625b bVar) {
        if (activity instanceof C112987v) {
            ((C112987v) activity).getLifecycle().mo145135c(bVar);
        } else if (activity instanceof C0125s) {
            C39623j lifecycle = ((C0125s) activity).getLifecycle();
            if (lifecycle instanceof C103766u) {
                ((C103766u) lifecycle).mo145135c(bVar);
            }
        }
    }

    /* renamed from: c */
    public static void m154618c(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            C112981b.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new C112980e0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* renamed from: b */
    public final void mo165323b(C39623j.C39625b bVar) {
        if (Build.VERSION.SDK_INT < 29) {
            m154617a(getActivity(), bVar);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        mo165323b(C39623j.C39625b.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        mo165323b(C39623j.C39625b.ON_DESTROY);
        this.f338208d = null;
    }

    public void onPause() {
        super.onPause();
        mo165323b(C39623j.C39625b.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        C103758a aVar = this.f338208d;
        if (aVar != null) {
            C112975c0.this.mo165315a();
        }
        mo165323b(C39623j.C39625b.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        C103758a aVar = this.f338208d;
        if (aVar != null) {
            C112975c0 c0Var = C112975c0.this;
            int i = c0Var.f338197d + 1;
            c0Var.f338197d = i;
            if (i == 1 && c0Var.f338200g) {
                c0Var.f338202i.mo145135c(C39623j.C39625b.ON_START);
                c0Var.f338200g = false;
            }
        }
        mo165323b(C39623j.C39625b.ON_START);
    }

    public void onStop() {
        super.onStop();
        mo165323b(C39623j.C39625b.ON_STOP);
    }
}
