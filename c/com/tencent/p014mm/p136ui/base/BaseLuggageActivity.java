package com.tencent.p014mm.p136ui.base;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.BaseActivity;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import nj3.C88997i;
import p156gj.C87203t;
import p225rc.C89916g;
import p225rc.g$$h;

/* renamed from: com.tencent.mm.ui.base.BaseLuggageActivity */
public class BaseLuggageActivity extends BaseActivity implements g$$h {

    /* renamed from: A */
    public volatile LayoutInflater f249925A = null;

    /* renamed from: z */
    public final Object f249926z = new byte[0];

    /* renamed from: M7 */
    public final boolean mo119726M7(String str) {
        String k = C87203t.m108275k();
        String str2 = Build.DEVICE;
        if (k == null && str2 == null) {
            return false;
        }
        if ((k == null || str == null) ? false : Util.isEqual(k.toLowerCase(), str.toLowerCase())) {
            return true;
        }
        return (str2 == null || str == null) ? false : Util.isEqual(str2.toLowerCase(), str.toLowerCase());
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6399ds;
    }

    public LayoutInflater getLayoutInflater() {
        if (this.f249925A == null) {
            synchronized (this.f249926z) {
                if (this.f249925A == null) {
                    this.f249925A = C88997i.f256584a.mo113346a(this);
                }
            }
        }
        return this.f249925A;
    }

    public Resources getResources() {
        return MMApplicationContext.getResources();
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return super.getSystemService(str);
        }
        if (this.f249925A == null) {
            synchronized (this.f249926z) {
                if (this.f249925A == null) {
                    this.f249925A = C88997i.f256584a.mo113346a(this);
                }
            }
        }
        return this.f249925A;
    }

    public void hideActionbarLine() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().mo91089G(0.0f);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C89916g.m112446a(this).mo124233g(i, i2, intent);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        C89916g.m112446a(this).mo124234h(i, strArr, iArr);
    }

    public void setNavigationbarColor(int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            if (!(mo119726M7("y83a") || mo119726M7("y83") || mo119726M7("v1732a") || mo119726M7("v1732t"))) {
                getWindow().setNavigationBarColor(i);
                boolean g = C74933u4.m89770g(i);
                View decorView = getWindow().getDecorView();
                int systemUiVisibility = decorView.getSystemUiVisibility();
                decorView.setSystemUiVisibility(g ? systemUiVisibility & -17 : systemUiVisibility | 16);
            }
        }
    }

    public void setRequestedOrientation(int i) {
        try {
            super.setRequestedOrientation(i);
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.BaseLuggageActivity", th, "AndroidOSafety.safety uncaught", new Object[0]);
        }
    }
}
