package com.tencent.p014mm.plugin.ext.p043ui;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.hellhoundlib.activities.HellActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import eb0.C97625j3;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.ext.ui.RedirectToChattingByPhoneStubUI */
public class RedirectToChattingByPhoneStubUI extends HellActivity implements C11385n {

    /* renamed from: d */
    public C89779i0 f12349d = null;

    /* renamed from: com.tencent.mm.plugin.ext.ui.RedirectToChattingByPhoneStubUI$a */
    public class C2267a implements Runnable {
        public C2267a() {
        }

        public void run() {
            View currentFocus;
            IBinder windowToken;
            boolean z;
            RedirectToChattingByPhoneStubUI redirectToChattingByPhoneStubUI = RedirectToChattingByPhoneStubUI.this;
            InputMethodManager inputMethodManager = (InputMethodManager) redirectToChattingByPhoneStubUI.getSystemService("input_method");
            if (inputMethodManager != null && (currentFocus = redirectToChattingByPhoneStubUI.getCurrentFocus()) != null && (windowToken = currentFocus.getWindowToken()) != null) {
                try {
                    z = inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
                } catch (IllegalArgumentException e) {
                    Log.m105921e("MicroMsg.RedirectToChattingByPhoneStubUI", "hide VKB exception %s", e);
                    z = false;
                }
                Log.m105927v("MicroMsg.RedirectToChattingByPhoneStubUI", "hide VKB result %B", Boolean.valueOf(z));
            }
        }
    }

    public Resources getResources() {
        return (getAssets() == null || MMApplicationContext.getResources() == null) ? super.getResources() : MMApplicationContext.getResources();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f12349d = C76879j.m92723Q(this, getString(C0966R.string.a4d), "", true, false, (DialogInterface.OnCancelListener) null);
        MMHandlerThread.postToMainThreadDelayed(new C2267a(), 500);
        C97625j3.m125815e().mo123455a(106, this);
    }

    public void onDestroy() {
        super.onDestroy();
        C97625j3.m125815e().mo123470p(106, this);
        C89779i0 i0Var = this.f12349d;
        if (i0Var != null) {
            i0Var.dismiss();
            this.f12349d = null;
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        finish();
    }
}
