package com.tencent.p014mm.plugin.appbrand.debugger.console;

import android.view.WindowManager;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.console.i */
public final class C1525i extends C87413o implements C32224a<WindowManager> {

    /* renamed from: d */
    public static final C1525i f10895d = new C1525i();

    public C1525i() {
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
