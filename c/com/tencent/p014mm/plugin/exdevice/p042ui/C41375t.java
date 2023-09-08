package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.view.View;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.t */
public class C41375t implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ExdeviceLikeView f111402d;

    public C41375t(ExdeviceLikeView exdeviceLikeView) {
        this.f111402d = exdeviceLikeView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ff  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r14) {
        /*
            r13 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r14)
            java.lang.Object[] r6 = r0.toArray()
            r0.clear()
            java.lang.String r1 = "com/tencent/mm/plugin/exdevice/ui/ExdeviceLikeView$1"
            java.lang.String r2 = "android/view/View$OnClickListener"
            java.lang.String r3 = "onClick"
            java.lang.String r4 = "(Landroid/view/View;)V"
            r5 = r13
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeView r14 = r13.f111402d
            com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeView$a r14 = r14.f111139f
            java.lang.String r0 = "MicroMsg.ExdeviceLikeView"
            if (r14 == 0) goto L_0x0144
            com.tencent.mm.plugin.exdevice.ui.s0$a r14 = (com.tencent.p014mm.plugin.exdevice.p042ui.C41368s0.C41369a) r14
            com.tencent.mm.plugin.exdevice.ui.s0 r1 = com.tencent.p014mm.plugin.exdevice.p042ui.C41368s0.this
            com.tencent.mm.plugin.exdevice.ui.k1 r1 = r1.f111369i
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x00bd
            v71.d r14 = r14.f111378a
            java.lang.String r14 = r14.field_username
            com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI r1 = (com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceRankInfoUI) r1
            java.lang.String r4 = r1.f111248u
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            java.lang.String r5 = "MicroMsg.Sport.ExdeviceRankInfoUI"
            if (r4 != 0) goto L_0x00aa
            java.lang.String r4 = r1.f111248u
            java.lang.String r6 = "#"
            boolean r4 = r6.equals(r4)
            if (r4 != 0) goto L_0x00aa
            java.lang.String r4 = eb0.C75592q0.m90789s()
            boolean r14 = r4.equals(r14)
            if (r14 == 0) goto L_0x00a8
            java.lang.String r14 = "hy: is self. see who likes me"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r14)
            android.content.Intent r14 = new android.content.Intent
            java.lang.Class<com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeUI> r4 = com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceLikeUI.class
            r14.<init>(r1, r4)
            java.lang.String r4 = r1.f111247t
            java.lang.String r5 = "app_username"
            r14.putExtra(r5, r4)
            java.lang.String r4 = r1.f111248u
            java.lang.String r5 = "rank_id"
            r14.putExtra(r5, r4)
            java.lang.String r4 = "key_is_like_read_only"
            r14.putExtra(r4, r3)
            k20.a r12 = new k20.a
            r12.<init>()
            r12.mo10233c(r14)
            java.lang.Object[] r5 = r12.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI"
            java.lang.String r7 = "beforeLikeBtnClicked"
            java.lang.String r8 = "(Ljava/lang/String;I)Z"
            java.lang.String r9 = "Undefined"
            java.lang.String r10 = "startActivity"
            java.lang.String r11 = "(Landroid/content/Intent;)V"
            r4 = r1
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r14 = r12.mo10231a(r2)
            android.content.Intent r14 = (android.content.Intent) r14
            r1.startActivity(r14)
            java.lang.String r5 = "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI"
            java.lang.String r6 = "beforeLikeBtnClicked"
            java.lang.String r7 = "(Ljava/lang/String;I)Z"
            java.lang.String r8 = "Undefined"
            java.lang.String r9 = "startActivity"
            java.lang.String r10 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x00bd
        L_0x00a8:
            r14 = 0
            goto L_0x00be
        L_0x00aa:
            java.lang.String r14 = "hy: rank id is not valid.abort the event"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r14)
            r14 = 2131825312(0x7f1112a0, float:1.9283477E38)
            java.lang.String r14 = r1.getString(r14)
            android.widget.Toast r14 = p910lj.C76701a.makeText((android.content.Context) r1, (java.lang.CharSequence) r14, (int) r2)
            r14.show()
        L_0x00bd:
            r14 = 1
        L_0x00be:
            if (r14 != 0) goto L_0x0144
            com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeView r14 = r13.f111402d
            int r14 = r14.f111140g
            if (r14 != 0) goto L_0x0144
            java.lang.String r14 = "click listener is not null"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r14)
            com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeView r14 = r13.f111402d
            int r1 = r14.f111140g
            if (r1 == 0) goto L_0x00de
            if (r1 == r3) goto L_0x00dc
            r4 = 2
            if (r1 == r4) goto L_0x00df
            java.lang.String r1 = "hy: state error"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
            goto L_0x00df
        L_0x00dc:
            r4 = 0
            goto L_0x00df
        L_0x00de:
            r4 = 1
        L_0x00df:
            r14.setSelfLikeState(r4)
            com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeView r14 = r13.f111402d
            int r0 = r14.f111140g
            if (r0 != r3) goto L_0x00f9
            android.content.Context r0 = r14.f111137d
            r1 = 2130772103(0x7f010087, float:1.7147315E38)
            android.view.animation.Animation r0 = android.view.animation.AnimationUtils.loadAnimation(r0, r1)
            r0.setFillAfter(r2)
            android.widget.ImageView r14 = r14.f111142i
            r14.startAnimation(r0)
        L_0x00f9:
            com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeView r14 = r13.f111402d
            com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeView$a r0 = r14.f111139f
            if (r0 == 0) goto L_0x0149
            int r14 = r14.f111140g
            com.tencent.mm.plugin.exdevice.ui.s0$a r0 = (com.tencent.p014mm.plugin.exdevice.p042ui.C41368s0.C41369a) r0
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)
            r1[r2] = r4
            java.lang.String r2 = "MicroMsg.ExdeviceRankAdapter"
            java.lang.String r4 = "hy: like view clicked.after statae: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r1)
            com.tencent.mm.plugin.exdevice.ui.s0 r1 = com.tencent.p014mm.plugin.exdevice.p042ui.C41368s0.this
            com.tencent.mm.plugin.exdevice.ui.k1 r1 = r1.f111369i
            if (r1 == 0) goto L_0x0149
            v71.d r0 = r0.f111378a
            java.lang.String r0 = r0.field_username
            com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI r1 = (com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceRankInfoUI) r1
            u71.c r2 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.Gx0()
            java.lang.String r4 = r1.f111248u
            java.lang.String r5 = r1.f111247t
            r2.getClass()
            w71.d r2 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.Hx0()
            r2.mo73771Ow(r4, r0, r14)
            f40.g r2 = f40.C86709a0.m107529k()
            ob0.b0 r2 = r2.f251779b
            t71.m r6 = new t71.m
            r6.<init>(r0, r5, r14, r4)
            r2.mo123460f(r6)
            int r14 = r1.f111233Q
            int r14 = r14 + r3
            r1.f111233Q = r14
            goto L_0x0149
        L_0x0144:
            java.lang.String r14 = "hy: loading or has liked or consumed. abort event"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r14)
        L_0x0149:
            java.lang.String r14 = "com/tencent/mm/plugin/exdevice/ui/ExdeviceLikeView$1"
            java.lang.String r0 = "android/view/View$OnClickListener"
            java.lang.String r1 = "onClick"
            java.lang.String r2 = "(Landroid/view/View;)V"
            j20.C117292a.m165361g(r13, r14, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.p042ui.C41375t.onClick(android.view.View):void");
    }
}
