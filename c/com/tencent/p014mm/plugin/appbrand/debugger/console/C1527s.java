package com.tencent.p014mm.plugin.appbrand.debugger.console;

import android.view.WindowManager;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.console.s */
public final class C1527s extends C87413o implements C32224a<WindowManager> {

    /* renamed from: d */
    public static final C1527s f10897d = new C1527s();

    public C1527s() {
        super(0);
    }

    public Object invoke() {
        Object systemService = MMApplicationContext.getContext().getSystemService("window");
        if (systemService instanceof WindowManager) {
            return (WindowManager) systemService;
        }
        return null;
    }
}
