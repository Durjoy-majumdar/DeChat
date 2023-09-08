package kb2;

import android.view.View;
import android.widget.FrameLayout;

/* renamed from: kb2.c */
public final class C60988c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C60991e f173694d;

    /* renamed from: e */
    public final /* synthetic */ FrameLayout f173695e;

    /* renamed from: f */
    public final /* synthetic */ C60995i f173696f;

    /* renamed from: g */
    public final /* synthetic */ View f173697g;

    public C60988c(C60991e eVar, FrameLayout frameLayout, C60995i iVar, View view) {
        this.f173694d = eVar;
        this.f173695e = frameLayout;
        this.f173696f = iVar;
        this.f173697g = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0079, code lost:
        if ((r1 != null && r1.f162763C == 270) != false) goto L_0x007b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r23) {
        /*
            r22 = this;
            r6 = r22
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r23
            r0.add(r1)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/plugin/mv/model/preview/MvPreviewAlbumVideoItemConvert$onBindViewHolder$2"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            r4 = r22
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            kb2.e r0 = r6.f173694d
            n03.b r0 = r0.f173702e
            n03.a r0 = r0.mo86536b()
            android.widget.FrameLayout r1 = r6.f173695e
            r1.removeAllViews()
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = -1
            r1.<init>(r2, r2)
            r2 = 17
            r1.gravity = r2
            android.widget.FrameLayout r2 = r6.f173695e
            java.lang.String r3 = "null cannot be cast to non-null type android.view.View"
            gy3.C87412m.m108592e(r0, r3)
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            r2.addView(r3, r1)
            kb2.i r1 = r6.f173696f
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r1 = r1.f173717j
            boolean r2 = r1 instanceof com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem
            r3 = 0
            if (r2 == 0) goto L_0x0052
            com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r1 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem) r1
            goto L_0x0053
        L_0x0052:
            r1 = r3
        L_0x0053:
            r2 = 0
            if (r1 == 0) goto L_0x0059
            int r4 = r1.f162768y
            goto L_0x005a
        L_0x0059:
            r4 = 0
        L_0x005a:
            if (r1 == 0) goto L_0x005f
            int r5 = r1.f162767x
            goto L_0x0060
        L_0x005f:
            r5 = 0
        L_0x0060:
            r7 = 1
            if (r1 == 0) goto L_0x006b
            int r8 = r1.f162763C
            r9 = 90
            if (r8 != r9) goto L_0x006b
            r8 = 1
            goto L_0x006c
        L_0x006b:
            r8 = 0
        L_0x006c:
            if (r8 != 0) goto L_0x007b
            if (r1 == 0) goto L_0x0078
            int r8 = r1.f162763C
            r9 = 270(0x10e, float:3.78E-43)
            if (r8 != r9) goto L_0x0078
            r8 = 1
            goto L_0x0079
        L_0x0078:
            r8 = 0
        L_0x0079:
            if (r8 == 0) goto L_0x007f
        L_0x007b:
            int r4 = r1.f162767x
            int r5 = r1.f162768y
        L_0x007f:
            r12 = r4
            r13 = r5
            d03.a r4 = new d03.a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "previewId-"
            r5.append(r8)
            kb2.i r8 = r6.f173696f
            java.lang.String r8 = r8.f173711d
            r5.append(r8)
            java.lang.String r9 = r5.toString()
            if (r1 == 0) goto L_0x009f
            java.lang.String r3 = r1.mo80159e()
        L_0x009f:
            if (r3 != 0) goto L_0x00a5
            java.lang.String r1 = ""
            r10 = r1
            goto L_0x00a6
        L_0x00a5:
            r10 = r3
        L_0x00a6:
            java.lang.String r11 = ""
            r8 = r4
            r8.<init>(r9, r10, r11, r12, r13)
            r4.f165933e = r7
            r4.f165934f = r7
            r0.mo81156b()
            r0.setMediaInfo(r4)
            r0.mo81155a()
            r0.start()
            r0.setLoop(r7)
            r0.setMute(r7)
            android.view.View r0 = r6.f173697g
            r1 = 8
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.mo10233c(r1)
            java.lang.Object[] r15 = r3.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/mv/model/preview/MvPreviewAlbumVideoItemConvert$onBindViewHolder$2"
            java.lang.String r17 = "onClick"
            java.lang.String r18 = "(Landroid/view/View;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r0
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r1 = r3.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r15 = "com/tencent/mm/plugin/mv/model/preview/MvPreviewAlbumVideoItemConvert$onBindViewHolder$2"
            java.lang.String r16 = "onClick"
            java.lang.String r17 = "(Landroid/view/View;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            java.lang.String r0 = "com/tencent/mm/plugin/mv/model/preview/MvPreviewAlbumVideoItemConvert$onBindViewHolder$2"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            j20.C117292a.m165361g(r6, r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kb2.C60988c.onClick(android.view.View):void");
    }
}
