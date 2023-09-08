package androidx.lifecycle;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.C39623j;

/* renamed from: androidx.lifecycle.d0 */
public class C112978d0 extends C112982f {
    public final /* synthetic */ C112975c0 this$0;

    /* renamed from: androidx.lifecycle.d0$a */
    public class C112979a extends C112982f {
        public C112979a() {
        }

        public void onActivityPostResumed(Activity activity) {
            C112978d0.this.this$0.mo165315a();
        }

        public void onActivityPostStarted(Activity activity) {
            C112975c0 c0Var = C112978d0.this.this$0;
            int i = c0Var.f338197d + 1;
            c0Var.f338197d = i;
            if (i == 1 && c0Var.f338200g) {
                c0Var.f338202i.mo145135c(C39623j.C39625b.ON_START);
                c0Var.f338200g = false;
            }
        }
    }

    public C112978d0(C112975c0 c0Var) {
        this.this$0 = c0Var;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i = C112980e0.f338207e;
            ((C112980e0) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).f338208d = this.this$0.f338204n;
        }
    }

    public void onActivityPaused(Activity activity) {
        C112975c0 c0Var = this.this$0;
        int i = c0Var.f338198e - 1;
        c0Var.f338198e = i;
        if (i == 0) {
            c0Var.f338201h.postDelayed(c0Var.f338203j, 700);
        }
    }

    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.registerActivityLifecycleCallbacks(new C112979a());
    }

    public void onActivityStopped(Activity activity) {
        C112975c0 c0Var = this.this$0;
        int i = c0Var.f338197d - 1;
        c0Var.f338197d = i;
        if (i == 0 && c0Var.f338199f) {
            c0Var.f338202i.mo145135c(C39623j.C39625b.ON_STOP);
            c0Var.f338200g = true;
        }
    }
}
