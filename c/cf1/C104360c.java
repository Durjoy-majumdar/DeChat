package cf1;

import android.view.View;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.plugin.finder.edit.FinderLiveFixRatioPhoneEditPluginLayout;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: cf1.c */
public final class C104360c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveFixRatioPhoneEditPluginLayout f309007d;

    /* renamed from: cf1.c$a */
    public static final class C0498a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C104428a f1222d;

        public C0498a(C104428a aVar) {
            this.f1222d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/edit/FinderLiveFixRatioPhoneEditPluginLayout$setLiveEditLayout$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f1222d.hide();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/edit/FinderLiveFixRatioPhoneEditPluginLayout$setLiveEditLayout$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C104360c(FinderLiveFixRatioPhoneEditPluginLayout finderLiveFixRatioPhoneEditPluginLayout) {
        this.f309007d = finderLiveFixRatioPhoneEditPluginLayout;
    }

    /* JADX WARNING: type inference failed for: r6v7, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r20) {
        /*
            r19 = this;
            r6 = r19
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r20
            r0.add(r1)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/plugin/finder/edit/FinderLiveFixRatioPhoneEditPluginLayout$setLiveEditLayout$3"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            r4 = r19
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            com.tencent.mm.plugin.finder.edit.FinderLiveFixRatioPhoneEditPluginLayout r0 = r6.f309007d
            com.tencent.mm.plugin.finder.edit.FinderLiveFixRatioPhoneEditPluginLayout$a r1 = com.tencent.p014mm.plugin.finder.edit.FinderLiveFixRatioPhoneEditPluginLayout.f312705x
            lh2.r r0 = r0.getEditPhotoWrapper()
            me3.f r0 = r0.f327415o
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.presenter.DrawingPresenter"
            gy3.C87412m.m108592e(r0, r1)
            r7 = r0
            me3.c r7 = (me3.C109612c) r7
            android.graphics.Rect r0 = new android.graphics.Rect
            com.tencent.mm.view.e r1 = r7.f328158a
            cq3.a r1 = r1.getBaseBoardView()
            android.graphics.Rect r1 = r1.getAliveRect()
            r0.<init>(r1)
            bh.b r1 = r7.mo160820d()
            boolean r1 = r1 instanceof p1093bh.C104090d
            if (r1 == 0) goto L_0x0070
            bh.b r0 = r7.mo160820d()
            bh.d r0 = (p1093bh.C104090d) r0
            r0.getClass()
            android.graphics.RectF r1 = new android.graphics.RectF
            android.graphics.Rect r2 = r0.f307922s
            r1.<init>(r2)
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
            android.graphics.Matrix r0 = r0.mo145696g()
            r0.invert(r2)
            r2.mapRect(r1)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.round(r0)
        L_0x0070:
            android.graphics.Bitmap r8 = r7.f328163f
            android.graphics.BitmapFactory$Options r11 = new android.graphics.BitmapFactory$Options
            r11.<init>()
            r1 = 1
            r11.inJustDecodeBounds = r1
            ug.r0$a r2 = r7.f328159b
            java.lang.String r2 = r2.f332927d
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFile(r2, r11)
            int r2 = r11.outHeight
            float r2 = (float) r2
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 * r3
            int r4 = r8.getHeight()
            float r4 = (float) r4
            float r2 = r2 / r4
            int r4 = r11.outWidth
            float r4 = (float) r4
            float r4 = r4 * r3
            int r5 = r8.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 <= 0) goto L_0x009e
            goto L_0x009f
        L_0x009e:
            r2 = r4
        L_0x009f:
            r4 = 0
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 != 0) goto L_0x00a6
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x00a6:
            int r5 = r7.f328169l
            if (r5 <= 0) goto L_0x00c7
            int r9 = r7.f328168k
            if (r9 <= 0) goto L_0x00c7
            float r2 = (float) r5
            float r2 = r2 * r3
            int r5 = r8.getHeight()
            float r5 = (float) r5
            float r2 = r2 / r5
            int r5 = r7.f328168k
            float r5 = (float) r5
            float r5 = r5 * r3
            int r9 = r8.getWidth()
            float r9 = (float) r9
            float r5 = r5 / r9
            int r9 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r9 <= 0) goto L_0x00c7
            r2 = r5
        L_0x00c7:
            com.tencent.mm.view.e r5 = r7.f328158a
            cq3.a r5 = r5.getBaseBoardView()
            com.tencent.mm.view.e r9 = r7.f328158a
            cq3.a r9 = r9.getBaseBoardView()
            android.graphics.Matrix r9 = r9.getMainMatrix()
            float r10 = r5.mo157329c(r9)
            android.graphics.Matrix r12 = new android.graphics.Matrix
            r12.<init>()
            r12.postScale(r2, r2, r4, r4)
            float r2 = -r10
            r12.postRotate(r2)
            com.tencent.mm.view.e r2 = r7.f328158a
            ug.r0$a r2 = r2.getConfig()
            ug.r0$b r2 = r2.f332924a
            ug.r0$b r5 = p248ug.C111164r0.C111166b.VIDEO_COVER
            r9 = 0
            if (r2 != r5) goto L_0x0104
            android.graphics.Rect r0 = new android.graphics.Rect
            int r1 = r8.getWidth()
            int r2 = r8.getHeight()
            r0.<init>(r9, r9, r1, r2)
        L_0x0101:
            r9 = r0
            goto L_0x0242
        L_0x0104:
            float r2 = r7.f328166i
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x023d
            r7.mo160822f(r8, r0)
            int r2 = r0.width()
            double r4 = (double) r2
            r13 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r4 * r13
            int r2 = r0.height()
            double r13 = (double) r2
            double r4 = r4 / r13
            float r2 = (float) r4
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r9] = r0
            int r5 = r8.getWidth()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r1] = r5
            int r1 = r8.getHeight()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5 = 2
            r4[r5] = r1
            java.lang.Float r1 = java.lang.Float.valueOf(r2)
            r9 = 3
            r4[r9] = r1
            java.lang.String r1 = "MicroMsg.DrawingPresenter"
            java.lang.String r9 = "[saveEditPhoto] clipRectF:%s w:%s h:%s ratio:%f"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r9, r4)
            double r13 = (double) r2
            float r4 = r7.f328166i
            double r5 = (double) r4
            r15 = 4588807732320345784(0x3faeb851eb851eb8, double:0.06)
            double r17 = r5 - r15
            int r9 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r9 < 0) goto L_0x0159
            double r5 = r5 + r15
            int r9 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r9 <= 0) goto L_0x021a
        L_0x0159:
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x01b7
            int r2 = r0.centerY()
            int r4 = r0.width()
            float r4 = (float) r4
            float r4 = r4 * r3
            float r5 = r7.f328166i
            float r4 = r4 / r5
            int r4 = (int) r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "clipRect.width() : "
            r5.append(r6)
            int r6 = r0.width()
            r5.append(r6)
            java.lang.String r6 = " new height:"
            r5.append(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r5)
            r5 = 2
            int r4 = r4 / r5
            int r5 = r2 - r4
            r0.top = r5
            int r2 = r2 + r4
            r0.bottom = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "top :"
            r2.append(r4)
            int r4 = r0.top
            r2.append(r4)
            java.lang.String r4 = " bottom:"
            r2.append(r4)
            int r4 = r0.bottom
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            goto L_0x021a
        L_0x01b7:
            int r2 = r0.centerX()
            int r4 = r0.height()
            float r4 = (float) r4
            float r4 = r4 * r3
            float r5 = r7.f328166i
            float r4 = r4 * r5
            int r4 = (int) r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "clipRect.height() : "
            r5.append(r6)
            int r6 = r0.height()
            r5.append(r6)
            java.lang.String r6 = " new width:"
            r5.append(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r5)
            r5 = 2
            int r4 = r4 / r5
            int r5 = r2 - r4
            r0.left = r5
            int r2 = r2 + r4
            r0.right = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "left :"
            r2.append(r4)
            int r4 = r0.left
            r2.append(r4)
            java.lang.String r4 = " right:"
            r2.append(r4)
            int r4 = r0.right
            r2.append(r4)
            java.lang.String r4 = " cropRectRatio:"
            r2.append(r4)
            float r4 = r7.f328166i
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
        L_0x021a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "ratio clipRect :"
            r2.append(r4)
            int r4 = r0.width()
            float r4 = (float) r4
            float r4 = r4 * r3
            int r3 = r0.height()
            float r3 = (float) r3
            float r4 = r4 / r3
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            goto L_0x0101
        L_0x023d:
            r7.mo160822f(r8, r0)
            goto L_0x0101
        L_0x0242:
            android.graphics.Bitmap r0 = r7.mo160825i(r8, r9, r10, r11, r12)
            com.google.android.material.bottomsheet.a r1 = new com.google.android.material.bottomsheet.a
            r2 = r19
            com.tencent.mm.plugin.finder.edit.FinderLiveFixRatioPhoneEditPluginLayout r3 = r2.f309007d
            android.content.Context r3 = r3.getContext()
            gy3.C87412m.m108591d(r3)
            r4 = 2131886332(0x7f1200fc, float:1.940724E38)
            r1.<init>(r3, r4)
            com.tencent.mm.plugin.finder.edit.FinderLiveFixRatioPhoneEditPluginLayout r3 = r2.f309007d
            android.content.Context r3 = r3.getContext()
            r4 = 2131496241(0x7f0c0d31, float:1.8616041E38)
            r5 = 0
            android.view.View r3 = android.view.View.inflate(r3, r4, r5)
            r4 = 2131306933(0x7f0929b5, float:1.823208E38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            boolean r7 = r6 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r7 == 0) goto L_0x027b
            r5 = r6
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
        L_0x027b:
            if (r5 != 0) goto L_0x027e
            goto L_0x0297
        L_0x027e:
            com.tencent.mm.plugin.finder.edit.FinderLiveFixRatioPhoneEditPluginLayout r6 = r2.f309007d
            android.content.Context r6 = r6.getContext()
            r7 = 64
            int r6 = kg3.C76577a.m92151b(r6, r7)
            com.tencent.mm.plugin.finder.edit.FinderLiveFixRatioPhoneEditPluginLayout r7 = r2.f309007d
            android.content.Context r7 = r7.getContext()
            int r7 = com.tencent.p014mm.p136ui.C75044y4.m89991c(r7)
            int r6 = r6 + r7
            r5.bottomMargin = r6
        L_0x0297:
            r5 = 2131314130(0x7f0945d2, float:1.8246676E38)
            android.view.View r5 = r3.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r6 = 2131314270(0x7f09465e, float:1.824696E38)
            android.view.View r6 = r3.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r7 = 2131314141(0x7f0945dd, float:1.8246699E38)
            android.view.View r7 = r3.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r8 = 2131314271(0x7f09465f, float:1.8246962E38)
            android.view.View r8 = r3.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r9 = 2131311279(0x7f093aaf, float:1.8240894E38)
            android.view.View r9 = r3.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            java.lang.String r10 = "tv1"
            gy3.C87412m.m108593f(r7, r10)
            er1.C7919x.m8091a(r7)
            java.lang.String r7 = "tv2"
            gy3.C87412m.m108593f(r8, r7)
            er1.C7919x.m8091a(r8)
            java.lang.String r7 = "tv3"
            gy3.C87412m.m108593f(r9, r7)
            er1.C7919x.m8091a(r9)
            er1.C7919x.m8091a(r4)
            r5.setImageBitmap(r0)
            r6.setImageBitmap(r0)
            r0 = 2131302682(0x7f09191a, float:1.8223457E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r5 = 2131304533(0x7f092055, float:1.8227211E38)
            android.view.View r5 = r3.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r6 = 2131297406(0x7f09047e, float:1.8212756E38)
            android.view.View r6 = r3.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            java.lang.Class<ir.n> r7 = p565ir.C60606n.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            ir.n r7 = (p565ir.C60606n) r7
            java.lang.String r8 = "avator"
            gy3.C87412m.m108593f(r0, r8)
            java.lang.String r8 = "nickname"
            gy3.C87412m.m108593f(r5, r8)
            java.lang.String r8 = "author"
            gy3.C87412m.m108593f(r6, r8)
            r7.vb0(r0, r5, r6)
            cf1.c$a r0 = new cf1.c$a
            r0.<init>(r1)
            r4.setOnClickListener(r0)
            r1.setContentView((android.view.View) r3)
            r1.show()
            java.lang.String r0 = "com/tencent/mm/plugin/finder/edit/FinderLiveFixRatioPhoneEditPluginLayout$setLiveEditLayout$3"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r3 = "onClick"
            java.lang.String r4 = "(Landroid/view/View;)V"
            j20.C117292a.m165361g(r2, r0, r1, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cf1.C104360c.onClick(android.view.View):void");
    }
}
