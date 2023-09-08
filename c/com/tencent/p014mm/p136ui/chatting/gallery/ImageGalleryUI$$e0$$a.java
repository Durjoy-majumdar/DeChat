package com.tencent.p014mm.p136ui.chatting.gallery;

import com.tencent.p014mm.storage.C72963f4;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$e0$$a */
public final /* synthetic */ class ImageGalleryUI$$e0$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ImageGalleryUI$$e0 f284493d;

    /* renamed from: e */
    public final /* synthetic */ C72963f4 f284494e;

    public /* synthetic */ ImageGalleryUI$$e0$$a(ImageGalleryUI$$e0 imageGalleryUI$$e0, C72963f4 f4Var) {
        this.f284493d = imageGalleryUI$$e0;
        this.f284494e = f4Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$e0 r0 = r12.f284493d
            com.tencent.mm.storage.f4 r4 = r12.f284494e
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r1 = r0.f284504d
            r2 = 1
            if (r4 == 0) goto L_0x0056
            int r3 = com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryUI.f284337S2
            r1.getClass()
            boolean r3 = r4.mo100994f4()
            if (r3 == 0) goto L_0x0056
            java.lang.Class<rz.u> r3 = p682rz.C101491u.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            rz.u r3 = (p682rz.C101491u) r3
            java.lang.String r5 = r4.mo108765s2()
            hd0.n0 r3 = r3.mo140806Zd(r5)
            if (r3 == 0) goto L_0x004a
            int r3 = r3.f288562i
            r5 = 199(0xc7, float:2.79E-43)
            if (r3 == r5) goto L_0x004a
            if (r3 == r5) goto L_0x004a
            long r5 = r4.getMsgId()
            java.lang.String r3 = hd0.C98429r0.m127814e(r5, r2)
            r1.f284372L1 = r3
            com.tencent.mm.ui.chatting.gallery.h r3 = r1.f284432g
            com.tencent.mm.ui.base.MMViewPager r5 = r1.f284450n
            int r5 = r5.getCurrentItem()
            com.tencent.mm.ui.chatting.gallery.g r6 = r3.f284720p
            com.tencent.mm.storage.f4 r3 = r3.mo135937y(r5)
            r6.mo135825B(r3, r5)
            goto L_0x0061
        L_0x004a:
            com.tencent.mm.ui.chatting.gallery.h r3 = r1.f284432g
            com.tencent.mm.ui.base.MMViewPager r5 = r1.f284450n
            int r5 = r5.getCurrentItem()
            r3.mo135928o(r5)
            goto L_0x0061
        L_0x0056:
            com.tencent.mm.ui.chatting.gallery.h r3 = r1.f284432g
            com.tencent.mm.ui.base.MMViewPager r5 = r1.f284450n
            int r5 = r5.getCurrentItem()
            r3.mo135928o(r5)
        L_0x0061:
            if (r4 == 0) goto L_0x008d
            boolean r3 = r4.mo100983V3()
            if (r3 == 0) goto L_0x008d
            com.tencent.mm.plugin.webview.ui.tools.media.a r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.media.C44063a.f119401a
            int r5 = r1.mo135787t8()
            int r6 = r1.mo135786s8()
            r3.mo68697a(r2, r5, r6)
            s90.n r2 = com.tencent.p014mm.p136ui.chatting.gallery.C97052g.m124926n(r4)
            if (r2 == 0) goto L_0x008d
            com.tencent.mm.plugin.webview.ui.tools.media.w$a r5 = com.tencent.p014mm.plugin.webview.p128ui.tools.media.C44093w.f119445k
            r6 = 1
            r7 = 101(0x65, float:1.42E-43)
            java.lang.String r8 = r2.f133368f
            java.lang.String r9 = r2.f133366d
            r10 = 0
            com.tencent.mm.ui.chatting.gallery.s r1 = r1.f284478w
            int r11 = r1.f284965m
            r5.mo68725d(r6, r7, r8, r9, r10, r11)
        L_0x008d:
            boolean r1 = eb0.C75569c4.m90663I(r4)
            if (r1 == 0) goto L_0x00b3
            com.tencent.mm.autogen.mmdata.rpt.SpamMediaToEmojiOPStruct r1 = new com.tencent.mm.autogen.mmdata.rpt.SpamMediaToEmojiOPStruct
            r1.<init>()
            long r2 = r4.mo108774y2()
            r1.f194459d = r2
            int r2 = r4.getType()
            long r2 = (long) r2
            r1.f194460e = r2
            int r2 = eb0.C75569c4.m90678k(r4)
            long r2 = (long) r2
            r1.f194461f = r2
            r2 = 5
            r1.f194462g = r2
            r1.mo86054n()
        L_0x00b3:
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r0 = r0.f284504d
            r1 = 6
            int r2 = com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryUI.f284337S2
            r0.mo135736P7(r1)
            if (r4 == 0) goto L_0x00e0
            boolean r0 = r4.mo101016t3()
            if (r0 == 0) goto L_0x00e0
            r5 = 0
            r6 = 0
            r2 = 53
            r8 = 0
            r7 = 0
            java.lang.Class<mm.h> r0 = p606mm.C99933h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            mm.h r0 = (p606mm.C99933h) r0
            java.lang.Class<qh0.a> r9 = qh0.C62619a.class
            jg.a r10 = new jg.a
            r1 = r10
            r1.<init>(r2, r4, r5, r6, r7, r8)
            r1 = 18
            java.lang.String r2 = "album_enter_from_scene"
            r0.mo84406lr(r1, r2, r9, r10)
        L_0x00e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryUI$$e0$$a.run():void");
    }
}
