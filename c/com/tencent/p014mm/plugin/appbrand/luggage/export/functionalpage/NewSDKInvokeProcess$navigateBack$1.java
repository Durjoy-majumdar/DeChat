package com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import wt0.C78650e;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.NewSDKInvokeProcess$navigateBack$1 */
public final class NewSDKInvokeProcess$navigateBack$1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ NewSDKInvokeProcess f197141d;

    public NewSDKInvokeProcess$navigateBack$1(NewSDKInvokeProcess newSDKInvokeProcess) {
        this.f197141d = newSDKInvokeProcess;
    }

    public final void run() {
        C39623j lifecycle;
        Activity R = this.f197141d.f244075a.mo113026R();
        if (R != null) {
            C78650e eVar = new C78650e(R, true);
            eVar.mo108614a(R.getString(C0966R.string.ln6));
            View findViewById = eVar.getContentView().findViewById(C0966R.C0970id.i7j);
            if (findViewById != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/prompt/AppBrandPopupToast", "setLoading", "(Z)Lcom/tencent/mm/plugin/appbrand/widget/prompt/AppBrandPopupToast;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById, "com/tencent/mm/plugin/appbrand/widget/prompt/AppBrandPopupToast", "setLoading", "(Z)Lcom/tencent/mm/plugin/appbrand/widget/prompt/AppBrandPopupToast;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            ImageView imageView = eVar.f230351h;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            AppCompatActivity appCompatActivity = R instanceof AppCompatActivity ? (AppCompatActivity) R : null;
            if (!(appCompatActivity == null || (lifecycle = appCompatActivity.getLifecycle()) == null)) {
                lifecycle.addObserver(new NewSDKInvokeProcess$navigateBack$1$1$1(eVar));
            }
            eVar.mo108615b(MAlarmHandler.NEXT_FIRE_INTERVAL);
        }
    }
}
