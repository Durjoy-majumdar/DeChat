package com.tencent.p014mm.plugin.appbrand.debugger.console;

import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.console.d */
public final class C55459d extends C87413o implements C32224a<Point> {

    /* renamed from: d */
    public final /* synthetic */ C55463j f158028d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55459d(C55463j jVar) {
        super(0);
        this.f158028d = jVar;
    }

    public Object invoke() {
        Display defaultDisplay;
        Point point = new Point();
        WindowManager windowManager = (WindowManager) ((C36570n) this.f158028d.f158037b).getValue();
        if (!(windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null)) {
            defaultDisplay.getRealSize(point);
        }
        return point;
    }
}
