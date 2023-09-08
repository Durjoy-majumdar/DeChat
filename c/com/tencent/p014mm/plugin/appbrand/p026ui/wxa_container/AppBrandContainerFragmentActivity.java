package com.tencent.p014mm.plugin.appbrand.p026ui.wxa_container;

import android.app.Activity;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84963i1;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataFragmentActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import is0.C87794b;
import java.util.ArrayList;
import java.util.Iterator;
import nj3.C76879j;
import p1042u.C90590d;
import p170ic.C87687a;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.wxa_container.AppBrandContainerFragmentActivity */
public abstract class AppBrandContainerFragmentActivity extends MMSecDataFragmentActivity implements C84963i1, C76879j.C76887m {

    /* renamed from: j */
    public View f247089j;

    /* renamed from: n */
    public ArrayList<Dialog> f247090n;

    /* renamed from: o */
    public final C90590d<C84705a> f247091o = new C90590d<>();

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.wxa_container.AppBrandContainerFragmentActivity$a */
    public interface C84705a {
        void onWindowFocusChanged(boolean z);
    }

    static {
        MMActivityController.m163188J(MMApplicationContext.getContext());
    }

    /* renamed from: N7 */
    public static void m104355N7(Activity activity, int i) {
        if (activity != null && !activity.isFinishing() && !activity.isDestroyed() && activity.getWindow() != null && Build.VERSION.SDK_INT >= 26 && !MMActivityController.m163190m()) {
            activity.getWindow().setNavigationBarColor(i);
            boolean g = C74933u4.m89770g(i);
            View decorView = activity.getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(g ? systemUiVisibility & -17 : systemUiVisibility | 16);
        }
    }

    /* renamed from: M7 */
    public final boolean mo117428M7(View view) {
        InputMethodManager inputMethodManager;
        IBinder windowToken;
        if (view == null || (inputMethodManager = (InputMethodManager) getSystemService("input_method")) == null || (windowToken = view.getWindowToken()) == null) {
            return false;
        }
        try {
            return inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
        } catch (IllegalArgumentException e) {
            Log.m105921e("MicroMsg.AppBrand.AppBrandContainerFragmentActivity", "hide VKB(View) exception %s", e);
            return false;
        }
    }

    public void addDialog(Dialog dialog) {
        if (dialog != null) {
            if (isFinishing() || isDestroyed()) {
                dialog.dismiss();
                return;
            }
            if (this.f247090n == null) {
                this.f247090n = new ArrayList<>();
            }
            this.f247090n.add(dialog);
        }
    }

    public Activity getHostActivity() {
        return this;
    }

    public Object getSystemService(String str) {
        return (getApplicationContext() == null || !"connectivity".equals(str)) ? super.getSystemService(str) : getApplicationContext().getSystemService(str);
    }

    public final void hideVKB() {
        hideVKBHavingResult();
    }

    public final boolean hideVKBHavingResult() {
        View currentFocus = getCurrentFocus();
        return currentFocus == null ? mo117428M7(this.f247089j) : mo117428M7(currentFocus);
    }

    public final boolean initNavigationSwipeBack() {
        return false;
    }

    public final boolean isSupportNavigationSwipeBack() {
        return false;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 28 && getWindow() != null) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            getWindow().setAttributes(attributes);
        }
        onCreateBeforeSetContentView();
        C87794b bVar = new C87794b(this);
        this.f247089j = bVar;
        setContentView((View) bVar);
        this.f247089j.setId(C0966R.C0970id.biv);
    }

    public void onCreateBeforeSetContentView() {
        C87687a.m109086b(this, 10);
        C87687a.m109086b(this, 1);
    }

    public void onDestroy() {
        super.onDestroy();
        ArrayList<Dialog> arrayList = this.f247090n;
        if (arrayList != null) {
            Iterator<Dialog> it = arrayList.iterator();
            while (it.hasNext()) {
                Dialog next = it.next();
                if (next != null && next.isShowing()) {
                    next.dismiss();
                }
            }
            this.f247090n.clear();
            this.f247090n = null;
        }
    }

    public void onPostDestroyed() {
        super.onPostDestroyed();
        this.f247091o.clear();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        Iterator<C84705a> it = this.f247091o.iterator();
        while (it.hasNext()) {
            it.next().onWindowFocusChanged(z);
        }
    }

    public final void showVKB() {
        MMActivityController.m163187F0(this);
    }

    public final void hideVKB(View view) {
        mo117428M7(view);
    }
}
