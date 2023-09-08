package com.tencent.p014mm.p136ui.chatting.component;

/* renamed from: com.tencent.mm.ui.chatting.component.w2 */
public class C73641w2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C73632v2 f216236d;

    public C73641w2(C73632v2 v2Var) {
        this.f216236d = v2Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00ee, code lost:
        if (((zj3.C79361h0) r0.f215752d.f193278b.mo102812a(zj3.C79361h0.class)).mo102467Y2() >= 40) goto L_0x00f2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r11 = this;
            java.lang.String r0 = "MicroMsg.HistoryMsgTongueComponent"
            java.lang.String r1 = "show animation! GoBackToHistoryMsgLayout!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.mm.ui.chatting.component.v2 r0 = r11.f216236d
            android.view.View r0 = r0.f216201e
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            r10 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r9.mo10233c(r1)
            java.lang.Object[] r2 = r9.mo10232b()
            java.lang.String r3 = "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent$2"
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
            java.lang.String r2 = "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent$2"
            java.lang.String r3 = "run"
            java.lang.String r4 = "()V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r1 = r0
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            com.tencent.mm.ui.chatting.component.v2 r0 = r11.f216236d
            r1 = 1
            r0.f216203g = r1
            ck3.b r0 = r0.f215752d
            java.lang.Class<zj3.c1> r2 = zj3.C79344c1.class
            com.tencent.mm.ui.chatting.manager.a r0 = r0.f193278b
            xi.d r0 = r0.mo102812a(r2)
            zj3.c1 r0 = (zj3.C79344c1) r0
            com.tencent.mm.ui.chatting.component.v2 r2 = r11.f216236d
            ck3.b r2 = r2.f215752d
            java.lang.Class<ak3.f> r3 = ak3.C67067f.class
            com.tencent.mm.ui.chatting.manager.a r2 = r2.f193278b
            xi.d r2 = r2.mo102812a(r3)
            ak3.f r2 = (ak3.C67067f) r2
            boolean r2 = r2.mo91072j1()
            if (r2 == 0) goto L_0x0078
            com.tencent.mm.ui.chatting.component.v2 r0 = r11.f216236d
            r1 = 4
            r0.mo102651b3(r1)
            goto L_0x0106
        L_0x0078:
            boolean r2 = r0.mo102266Q2()
            if (r2 != 0) goto L_0x0101
            boolean r2 = r0.mo102264M()
            if (r2 != 0) goto L_0x0101
            boolean r0 = r0.mo102272e1()
            if (r0 == 0) goto L_0x008c
            goto L_0x0101
        L_0x008c:
            com.tencent.mm.ui.chatting.component.v2 r0 = r11.f216236d
            ck3.b r2 = r0.f215752d
            java.lang.String r2 = r2.mo91577r()
            boolean r2 = eb0.C45628s0.m50812z(r2)
            if (r2 == 0) goto L_0x009b
            goto L_0x00f1
        L_0x009b:
            ck3.b r2 = r0.f215752d
            java.lang.String r2 = r2.mo91577r()
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85820U5(r2)
            if (r2 != 0) goto L_0x00a8
            goto L_0x00f1
        L_0x00a8:
            eb0.c r2 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r2 = r2.mo105908w()
            ck3.b r3 = r0.f215752d
            java.lang.String r3 = r3.mo91577r()
            com.tencent.mm.storage.i2 r2 = (com.tencent.p014mm.storage.C44660i2) r2
            com.tencent.mm.storage.h2 r2 = r2.mo69771j(r3)
            if (r2 == 0) goto L_0x00f1
            int r2 = r2.mo108784E2()
            r2 = r2 & r1
            if (r2 <= 0) goto L_0x00c6
            goto L_0x00f1
        L_0x00c6:
            eb0.c r2 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r2 = r2.mo105907v()
            ck3.b r3 = r0.f215752d
            java.lang.String r3 = r3.mo91577r()
            com.tencent.mm.storage.z1 r2 = r2.get(r3)
            int r2 = r2.f149512S
            if (r2 != r1) goto L_0x00f1
            ck3.b r0 = r0.f215752d
            java.lang.Class<zj3.h0> r2 = zj3.C79361h0.class
            com.tencent.mm.ui.chatting.manager.a r0 = r0.f193278b
            xi.d r0 = r0.mo102812a(r2)
            zj3.h0 r0 = (zj3.C79361h0) r0
            int r0 = r0.mo102467Y2()
            r2 = 40
            if (r0 < r2) goto L_0x00f1
            goto L_0x00f2
        L_0x00f1:
            r1 = 0
        L_0x00f2:
            if (r1 == 0) goto L_0x00fb
            com.tencent.mm.ui.chatting.component.v2 r0 = r11.f216236d
            r1 = 3
            r0.mo102651b3(r1)
            goto L_0x0106
        L_0x00fb:
            com.tencent.mm.ui.chatting.component.v2 r0 = r11.f216236d
            r0.mo102651b3(r10)
            goto L_0x0106
        L_0x0101:
            com.tencent.mm.ui.chatting.component.v2 r0 = r11.f216236d
            r0.mo102651b3(r1)
        L_0x0106:
            android.view.animation.TranslateAnimation r0 = new android.view.animation.TranslateAnimation
            com.tencent.mm.ui.chatting.component.v2 r1 = r11.f216236d
            android.view.View r1 = r1.f216201e
            int r1 = r1.getWidth()
            float r1 = (float) r1
            r2 = 0
            r0.<init>(r1, r2, r2, r2)
            r1 = 300(0x12c, double:1.48E-321)
            r0.setDuration(r1)
            com.tencent.mm.ui.chatting.component.v2 r1 = r11.f216236d
            ck3.b r1 = r1.f215752d
            android.app.Activity r1 = r1.mo91565f()
            r2 = 17432581(0x10a0005, float:2.534661E-38)
            android.view.animation.Interpolator r1 = android.view.animation.AnimationUtils.loadInterpolator(r1, r2)
            r0.setInterpolator(r1)
            com.tencent.mm.ui.chatting.component.v2 r1 = r11.f216236d
            android.view.View r1 = r1.f216201e
            r1.startAnimation(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.C73641w2.run():void");
    }
}
