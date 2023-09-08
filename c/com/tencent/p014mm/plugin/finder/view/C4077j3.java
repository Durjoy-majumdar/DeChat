package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import androidx.appcompat.app.C103422m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.view.j3 */
public final class C4077j3 {

    /* renamed from: a */
    public static final C4077j3 f18208a = new C4077j3();

    /* renamed from: com.tencent.mm.plugin.finder.view.j3$a */
    public static final class C4078a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C103422m f18209d;

        public C4078a(C103422m mVar) {
            this.f18209d = mVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderLiveNoticeSuccessDialog$show$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f18209d.dismiss();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderLiveNoticeSuccessDialog$show$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ac  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.p014mm.plugin.finder.view.notice.NoticeGetCouponView mo4972a(android.content.Context r19, java.lang.String r20, long r21, te3.C51559uk1 r23, fy3.C32224a<rx3.C13598b0> r24) {
        /*
            r18 = this;
            r0 = r19
            r1 = r20
            r2 = r23
            java.lang.String r3 = "ctx"
            gy3.C87412m.m108594g(r0, r3)
            r3 = 0
            if (r2 != 0) goto L_0x000f
            return r3
        L_0x000f:
            int r4 = r2.f142896g
            r5 = 1
            if (r4 == r5) goto L_0x0015
            return r3
        L_0x0015:
            androidx.appcompat.app.m r4 = new androidx.appcompat.app.m
            r4.<init>(r0)
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r19)
            r7 = 2131495106(0x7f0c08c2, float:1.861374E38)
            android.view.View r3 = r6.inflate(r7, r3)
            r6 = 2131310425(0x7f093759, float:1.8239162E38)
            android.view.View r6 = r3.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r7 = 2131315892(0x7f094cb4, float:1.825025E38)
            android.view.View r7 = r3.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r8 = 2131299709(0x7f090d7d, float:1.8217427E38)
            android.view.View r8 = r3.findViewById(r8)
            com.tencent.mm.ui.widget.imageview.WeImageView r8 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r8
            r9 = 2131300507(0x7f09109b, float:1.8219046E38)
            android.view.View r9 = r3.findViewById(r9)
            com.tencent.mm.plugin.finder.view.notice.NoticeGetCouponView r9 = (com.tencent.p014mm.plugin.finder.view.notice.NoticeGetCouponView) r9
            r10 = 0
            if (r1 == 0) goto L_0x0059
            int r11 = r20.length()
            if (r11 <= 0) goto L_0x0054
            r11 = 1
            goto L_0x0055
        L_0x0054:
            r11 = 0
        L_0x0055:
            if (r11 != r5) goto L_0x0059
            r11 = 1
            goto L_0x005a
        L_0x0059:
            r11 = 0
        L_0x005a:
            if (r11 == 0) goto L_0x0063
            r6.setText(r1)
            r6.setVisibility(r10)
            goto L_0x0068
        L_0x0063:
            r1 = 8
            r6.setVisibility(r1)
        L_0x0068:
            er1.j4 r11 = er1.C58739j4.f168176a
            r14 = 0
            r15 = 0
            r16 = 6
            r17 = 0
            r12 = r21
            java.lang.String r1 = er1.C58739j4.m68254u(r11, r12, r14, r15, r16, r17)
            android.content.res.Resources r0 = r19.getResources()
            r6 = 2131826421(0x7f1116f5, float:1.9285726E38)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r10] = r1
            java.lang.String r0 = r0.getString(r6, r5)
            r7.setText(r0)
            com.tencent.mm.plugin.finder.view.j3$a r0 = new com.tencent.mm.plugin.finder.view.j3$a
            r0.<init>(r4)
            r8.setOnClickListener(r0)
            r0 = r24
            r9.mo5015a(r2, r0)
            r4.setContentView((android.view.View) r3)
            android.view.Window r0 = r4.getWindow()
            if (r0 == 0) goto L_0x00a6
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
            r1.<init>(r10)
            r0.setBackgroundDrawable(r1)
        L_0x00a6:
            android.view.Window r0 = r4.getWindow()
            if (r0 == 0) goto L_0x00b1
            r1 = 16
            r0.setGravity(r1)
        L_0x00b1:
            r4.show()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.C4077j3.mo4972a(android.content.Context, java.lang.String, long, te3.uk1, fy3.a):com.tencent.mm.plugin.finder.view.notice.NoticeGetCouponView");
    }
}
