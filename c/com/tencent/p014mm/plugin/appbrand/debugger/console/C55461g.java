package com.tencent.p014mm.plugin.appbrand.debugger.console;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.console.g */
public final class C55461g implements View.OnTouchListener {

    /* renamed from: d */
    public final int f158030d;

    /* renamed from: e */
    public final PointF f158031e = new PointF();

    /* renamed from: f */
    public boolean f158032f;

    /* renamed from: g */
    public final /* synthetic */ C68595k f158033g;

    /* renamed from: h */
    public final /* synthetic */ C55463j f158034h;

    public C55461g(C68595k kVar, C55463j jVar) {
        this.f158033g = kVar;
        this.f158034h = jVar;
        this.f158030d = ViewConfiguration.get(kVar.getContext()).getScaledTouchSlop();
    }

    /* renamed from: a */
    public final boolean mo76976a(MotionEvent motionEvent) {
        return Math.abs(motionEvent.getRawX() - this.f158031e.x) > ((float) this.f158030d) || Math.abs(motionEvent.getRawY() - this.f158031e.y) > ((float) this.f158030d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003c, code lost:
        if (r0 != 3) goto L_0x0138;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r9)
            r0.add(r10)
            java.lang.Object[] r6 = r0.toArray()
            r0.clear()
            java.lang.String r1 = "com/tencent/mm/plugin/appbrand/debugger/console/ConsolePrintControlFloatWindow$view$2$1$2"
            java.lang.String r2 = "android/view/View$OnTouchListener"
            java.lang.String r3 = "onTouch"
            java.lang.String r4 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r5 = r8
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            r9 = 1
            if (r10 != 0) goto L_0x002f
            r0 = 1
            java.lang.String r2 = "com/tencent/mm/plugin/appbrand/debugger/console/ConsolePrintControlFloatWindow$view$2$1$2"
            java.lang.String r3 = "android/view/View$OnTouchListener"
            java.lang.String r4 = "onTouch"
            java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r1 = r8
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r9
        L_0x002f:
            int r0 = r10.getAction()
            r1 = 0
            if (r0 == 0) goto L_0x0126
            if (r0 == r9) goto L_0x010c
            r2 = 2
            if (r0 == r2) goto L_0x0040
            r2 = 3
            if (r0 == r2) goto L_0x010c
            goto L_0x0138
        L_0x0040:
            boolean r0 = r8.f158032f
            if (r0 != 0) goto L_0x004c
            boolean r0 = r8.mo76976a(r10)
            if (r0 == 0) goto L_0x004c
            r8.f158032f = r9
        L_0x004c:
            boolean r9 = r8.f158032f
            if (r9 == 0) goto L_0x0138
            com.tencent.mm.plugin.appbrand.debugger.console.j r9 = r8.f158034h
            rx3.g r9 = r9.f158041f
            rx3.n r9 = (rx3.C36570n) r9
            java.lang.Object r9 = r9.getValue()
            android.view.WindowManager$LayoutParams r9 = (android.view.WindowManager.LayoutParams) r9
            float r0 = r10.getRawX()
            com.tencent.mm.plugin.appbrand.debugger.console.k r3 = r8.f158033g
            int r3 = r3.getWidth()
            int r3 = r3 / r2
            float r3 = (float) r3
            float r0 = r0 - r3
            r3 = 0
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 >= 0) goto L_0x006f
            r0 = 0
        L_0x006f:
            com.tencent.mm.plugin.appbrand.debugger.console.j r3 = r8.f158034h
            android.graphics.Point r3 = com.tencent.p014mm.plugin.appbrand.debugger.console.C55463j.m63109a(r3)
            int r3 = r3.x
            float r3 = (float) r3
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 <= 0) goto L_0x007d
            r0 = r3
        L_0x007d:
            int r0 = (int) r0
            r9.x = r0
            float r10 = r10.getRawY()
            com.tencent.mm.plugin.appbrand.debugger.console.k r0 = r8.f158033g
            int r0 = r0.getHeight()
            int r0 = r0 / r2
            float r0 = (float) r0
            float r10 = r10 - r0
            com.tencent.mm.plugin.appbrand.debugger.console.j r0 = r8.f158034h
            rx3.g r0 = r0.f158039d
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            float r0 = (float) r0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x00a3
            r10 = r0
        L_0x00a3:
            com.tencent.mm.plugin.appbrand.debugger.console.j r0 = r8.f158034h
            android.graphics.Point r0 = com.tencent.p014mm.plugin.appbrand.debugger.console.C55463j.m63109a(r0)
            int r0 = r0.y
            com.tencent.mm.plugin.appbrand.debugger.console.j r2 = r8.f158034h
            rx3.g r2 = r2.f158039d
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r0 = r0 - r2
            float r0 = (float) r0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x00c2
            r10 = r0
        L_0x00c2:
            int r10 = (int) r10
            r9.y = r10
            com.tencent.mm.plugin.appbrand.debugger.console.j r9 = r8.f158034h
            r9.getClass()
            java.lang.String r10 = "MicroMsg.AppBrand.ConsolePrintControlFloatWindow"
            java.lang.String r0 = "updatePosition"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            boolean r0 = r9.f158042g
            if (r0 != 0) goto L_0x00d7
            goto L_0x0138
        L_0x00d7:
            rx3.g r0 = r9.f158037b     // Catch:{ Exception -> 0x00f5 }
            rx3.n r0 = (rx3.C36570n) r0     // Catch:{ Exception -> 0x00f5 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ Exception -> 0x00f5 }
            android.view.WindowManager r0 = (android.view.WindowManager) r0     // Catch:{ Exception -> 0x00f5 }
            if (r0 == 0) goto L_0x0138
            android.view.View r2 = r9.mo76978b()     // Catch:{ Exception -> 0x00f5 }
            rx3.g r9 = r9.f158041f     // Catch:{ Exception -> 0x00f5 }
            rx3.n r9 = (rx3.C36570n) r9     // Catch:{ Exception -> 0x00f5 }
            java.lang.Object r9 = r9.getValue()     // Catch:{ Exception -> 0x00f5 }
            android.view.WindowManager$LayoutParams r9 = (android.view.WindowManager.LayoutParams) r9     // Catch:{ Exception -> 0x00f5 }
            r0.updateViewLayout(r2, r9)     // Catch:{ Exception -> 0x00f5 }
            goto L_0x0138
        L_0x00f5:
            r9 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "updatePosition, updateViewLayout fail since "
            r0.append(r2)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r9)
            goto L_0x0138
        L_0x010c:
            boolean r0 = r8.f158032f
            if (r0 != 0) goto L_0x0116
            boolean r10 = r8.mo76976a(r10)
            if (r10 == 0) goto L_0x0138
        L_0x0116:
            r8.f158032f = r1
            r2 = 1
            java.lang.String r4 = "com/tencent/mm/plugin/appbrand/debugger/console/ConsolePrintControlFloatWindow$view$2$1$2"
            java.lang.String r5 = "android/view/View$OnTouchListener"
            java.lang.String r6 = "onTouch"
            java.lang.String r7 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r3 = r8
            j20.C117292a.m165362h(r2, r3, r4, r5, r6, r7)
            return r9
        L_0x0126:
            r8.f158032f = r1
            android.graphics.PointF r9 = r8.f158031e
            float r0 = r10.getRawX()
            r9.x = r0
            android.graphics.PointF r9 = r8.f158031e
            float r10 = r10.getRawY()
            r9.y = r10
        L_0x0138:
            r2 = 0
            java.lang.String r4 = "com/tencent/mm/plugin/appbrand/debugger/console/ConsolePrintControlFloatWindow$view$2$1$2"
            java.lang.String r5 = "android/view/View$OnTouchListener"
            java.lang.String r6 = "onTouch"
            java.lang.String r7 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r3 = r8
            j20.C117292a.m165362h(r2, r3, r4, r5, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.debugger.console.C55461g.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
