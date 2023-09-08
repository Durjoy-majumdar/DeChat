package xb3;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.lang.ref.WeakReference;

/* renamed from: xb3.g */
public final class C15634g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WeakReference<Activity> f42261d;

    /* renamed from: e */
    public final /* synthetic */ WeakReference<View> f42262e;

    /* renamed from: f */
    public final /* synthetic */ Integer f42263f;

    /* renamed from: g */
    public final /* synthetic */ String f42264g;

    public C15634g(WeakReference<Activity> weakReference, WeakReference<View> weakReference2, Integer num, String str) {
        this.f42261d = weakReference;
        this.f42262e = weakReference2;
        this.f42263f = num;
        this.f42264g = str;
    }

    public final void run() {
        Integer num;
        int intValue;
        try {
            Activity activity = this.f42261d.get();
            if (activity != null) {
                View view = this.f42262e.get();
                if (activity.isFinishing()) {
                    return;
                }
                if (!activity.isDestroyed()) {
                    if (!(view != null || (num = this.f42263f) == null || (intValue = num.intValue()) == 0)) {
                        view = activity.findViewById(intValue);
                    }
                    if (view == null) {
                        String str = this.f42264g;
                        if (activity.getWindow().getDecorView() instanceof ViewGroup) {
                            View decorView = activity.getWindow().getDecorView();
                            C87412m.m108592e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                            C87412m.m108594g(str, "tag");
                            view = C15632d.m14634a((ViewGroup) decorView, C0966R.C0970id.f359572m92, str, 0);
                        }
                    }
                    if (view == null) {
                        Log.m105928w("MicroMsg.WcPayReport|WcPayBtnDisabledReport", "not find targetview: " + this.f42264g);
                        return;
                    }
                    String str2 = this.f42264g;
                    C87412m.m108594g(str2, "resId");
                    ((MMFragmentActivity) activity).addDispatchedTouchListener(new C15633f(activity.getClass().getSimpleName() + '-' + str2, view));
                    Log.m105918d("MicroMsg.WcPayReport|WcPayBtnDisabledReport", "set touch listener");
                }
            }
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.WcPayReport|WcPayBtnDisabledReport", th, "", new Object[0]);
        }
    }
}
