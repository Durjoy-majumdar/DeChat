package com.tencent.p014mm.plugin.appbrand.debugger.console;

import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.console.c */
public final class C55458c extends C87413o implements C32224a<WindowManager.LayoutParams> {

    /* renamed from: d */
    public final /* synthetic */ C55463j f158027d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55458c(C55463j jVar) {
        super(0);
        this.f158027d = jVar;
    }

    public Object invoke() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        C55463j jVar = this.f158027d;
        layoutParams.type = Build.VERSION.SDK_INT >= 26 ? 2038 : 2002;
        layoutParams.format = 1;
        layoutParams.packageName = MMApplicationContext.getContext().getPackageName();
        layoutParams.flags = 196904;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.gravity = 51;
        Point point = new Point(jVar.mo76978b().getMinimumWidth(), jVar.mo76978b().getMinimumHeight());
        layoutParams.x = C55463j.m63109a(jVar).x - point.x;
        layoutParams.y = (C55463j.m63109a(jVar).y - point.y) - ((Number) ((C36570n) jVar.f158039d).getValue()).intValue();
        Log.m105924i("MicroMsg.AppBrand.ConsolePrintControlFloatWindow", "init#layoutParams, screenSize: " + C55463j.m63109a(jVar) + ", guestedViewSize: " + point + ", x: " + layoutParams.x + ", y: " + layoutParams.y);
        return layoutParams;
    }
}
