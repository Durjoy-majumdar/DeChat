package com.tencent.p014mm.p136ui.chatting.component;

/* renamed from: com.tencent.mm.ui.chatting.component.x3 */
public class C73652x3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C73642w3 f216255d;

    public C73652x3(C73642w3 w3Var) {
        this.f216255d = w3Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00d5, code lost:
        if (((zj3.C79361h0) r0.f215752d.f193278b.mo102812a(zj3.C79361h0.class)).mo102467Y2() >= 40) goto L_0x00d9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r11 = this;
            java.lang.String r0 = "MicroMsg.QuoteMsgTongueComponent"
            java.lang.String r1 = "show animation! GoBackToHistoryMsgLayout!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.mm.ui.chatting.component.w3 r0 = r11.f216255d
            android.view.View r0 = r0.f216237e
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            r10 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r9.mo10233c(r1)
            java.lang.Object[] r2 = r9.mo10232b()
            java.lang.String r3 = "com/tencent/mm/ui/chatting/component/QuoteMsgTongueComponent$2"
            java.lang.String r4 = "run"
            java.lang.String r5 = "()V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r1 = r0
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r9.mo10231a(r10)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r2 = "com/tencent/mm/ui/chatting/component/QuoteMsgTongueComponent$2"
            java.lang.String r3 = "run"
            java.lang.String r4 = "()V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r1 = r0
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            com.tencent.mm.ui.chatting.component.w3 r0 = r11.f216255d
            r0.getClass()
            com.tencent.mm.ui.chatting.component.w3 r0 = r11.f216255d
            ck3.b r0 = r0.f215752d
            java.lang.Class<zj3.c1> r1 = zj3.C79344c1.class
            com.tencent.mm.ui.chatting.manager.a r0 = r0.f193278b
            xi.d r0 = r0.mo102812a(r1)
            zj3.c1 r0 = (zj3.C79344c1) r0
            boolean r1 = r0.mo102266Q2()
            r2 = 1
            if (r1 != 0) goto L_0x00e8
            boolean r1 = r0.mo102264M()
            if (r1 != 0) goto L_0x00e8
            boolean r0 = r0.mo102272e1()
            if (r0 == 0) goto L_0x0073
            goto L_0x00e8
        L_0x0073:
            com.tencent.mm.ui.chatting.component.w3 r0 = r11.f216255d
            ck3.b r1 = r0.f215752d
            java.lang.String r1 = r1.mo91577r()
            boolean r1 = eb0.C45628s0.m50812z(r1)
            if (r1 == 0) goto L_0x0082
            goto L_0x00d8
        L_0x0082:
            ck3.b r1 = r0.f215752d
            java.lang.String r1 = r1.mo91577r()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85820U5(r1)
            if (r1 != 0) goto L_0x008f
            goto L_0x00d8
        L_0x008f:
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r1 = r1.mo105908w()
            ck3.b r3 = r0.f215752d
            java.lang.String r3 = r3.mo91577r()
            com.tencent.mm.storage.i2 r1 = (com.tencent.p014mm.storage.C44660i2) r1
            com.tencent.mm.storage.h2 r1 = r1.mo69771j(r3)
            if (r1 == 0) goto L_0x00d8
            int r1 = r1.mo108784E2()
            r1 = r1 & r2
            if (r1 <= 0) goto L_0x00ad
            goto L_0x00d8
        L_0x00ad:
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r1 = r1.mo105907v()
            ck3.b r3 = r0.f215752d
            java.lang.String r3 = r3.mo91577r()
            com.tencent.mm.storage.z1 r1 = r1.get(r3)
            int r1 = r1.f149512S
            if (r1 != r2) goto L_0x00d8
            ck3.b r0 = r0.f215752d
            java.lang.Class<zj3.h0> r1 = zj3.C79361h0.class
            com.tencent.mm.ui.chatting.manager.a r0 = r0.f193278b
            xi.d r0 = r0.mo102812a(r1)
            zj3.h0 r0 = (zj3.C79361h0) r0
            int r0 = r0.mo102467Y2()
            r1 = 40
            if (r0 < r1) goto L_0x00d8
            goto L_0x00d9
        L_0x00d8:
            r2 = 0
        L_0x00d9:
            if (r2 == 0) goto L_0x00e2
            com.tencent.mm.ui.chatting.component.w3 r0 = r11.f216255d
            r1 = 3
            r0.mo102666Y5(r1)
            goto L_0x00ed
        L_0x00e2:
            com.tencent.mm.ui.chatting.component.w3 r0 = r11.f216255d
            r0.mo102666Y5(r10)
            goto L_0x00ed
        L_0x00e8:
            com.tencent.mm.ui.chatting.component.w3 r0 = r11.f216255d
            r0.mo102666Y5(r2)
        L_0x00ed:
            android.view.animation.TranslateAnimation r0 = new android.view.animation.TranslateAnimation
            com.tencent.mm.ui.chatting.component.w3 r1 = r11.f216255d
            android.view.View r1 = r1.f216237e
            int r1 = r1.getWidth()
            float r1 = (float) r1
            r2 = 0
            r0.<init>(r1, r2, r2, r2)
            r1 = 300(0x12c, double:1.48E-321)
            r0.setDuration(r1)
            com.tencent.mm.ui.chatting.component.w3 r1 = r11.f216255d
            ck3.b r1 = r1.f215752d
            android.app.Activity r1 = r1.mo91565f()
            r2 = 17432581(0x10a0005, float:2.534661E-38)
            android.view.animation.Interpolator r1 = android.view.animation.AnimationUtils.loadInterpolator(r1, r2)
            r0.setInterpolator(r1)
            com.tencent.mm.ui.chatting.component.w3 r1 = r11.f216255d
            android.view.View r1 = r1.f216237e
            r1.startAnimation(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.C73652x3.run():void");
    }
}
