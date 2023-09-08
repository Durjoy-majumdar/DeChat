package com.tencent.p014mm.plugin.appbrand.debugger.console;

import android.os.Build;
import android.view.WindowManager;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.console.m */
public final class C55464m extends C87413o implements C32224a<WindowManager.LayoutParams> {

    /* renamed from: d */
    public static final C55464m f158043d = new C55464m();

    public C55464m() {
        super(0);
    }

    public Object invoke() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.type = Build.VERSION.SDK_INT >= 26 ? 2038 : 2002;
        layoutParams.format = 1;
        layoutParams.packageName = MMApplicationContext.getContext().getPackageName();
        layoutParams.flags = 196904;
        layoutParams.width = -1;
        layoutParams.height = -1;
        return layoutParams;
    }
}
