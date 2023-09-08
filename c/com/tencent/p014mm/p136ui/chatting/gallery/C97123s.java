package com.tencent.p014mm.p136ui.chatting.gallery;

import com.tencent.p014mm.plugin.webview.p128ui.tools.media.C44093w;
import com.tencent.p014mm.storage.C72963f4;

/* renamed from: com.tencent.mm.ui.chatting.gallery.s */
public final class C97123s extends C44093w {

    /* renamed from: l */
    public long f284964l;

    /* renamed from: m */
    public int f284965m;

    public C97123s() {
        long currentTimeMillis = System.currentTimeMillis();
        this.f284964l = currentTimeMillis;
        this.f284965m = (int) (currentTimeMillis / ((long) 1000));
    }

    /* renamed from: c */
    public final void mo136024c(C72963f4 f4Var, int i) {
        if (f4Var != null && f4Var.mo100983V3()) {
            mo68721b(C97052g.m124926n(f4Var), i, this.f284965m, 101);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
        r3 = (r3 = (r3 = r3.f284720p).mo135877h(r9)).f284849p;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo136025d(com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryUI r8, int r9, int r10) {
        /*
            r7 = this;
            java.lang.String r0 = "ui"
            gy3.C87412m.m108594g(r8, r0)
            r0 = 101(0x65, float:1.42E-43)
            r1 = 0
            if (r9 <= 0) goto L_0x0049
            com.tencent.mm.ui.chatting.gallery.h r2 = r8.f284432g
            com.tencent.mm.storage.f4 r2 = r2.mo135937y(r9)
            if (r2 == 0) goto L_0x0049
            boolean r3 = r2.mo100983V3()
            if (r3 == 0) goto L_0x0049
            s90.n r2 = com.tencent.p014mm.p136ui.chatting.gallery.C97052g.m124926n(r2)
            if (r2 == 0) goto L_0x0049
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r7.f284964l
            long r3 = r3 - r5
            int r4 = (int) r3
            r7.f119449d = r4
            com.tencent.mm.ui.chatting.gallery.h r3 = r8.f284432g
            if (r3 == 0) goto L_0x0040
            com.tencent.mm.ui.chatting.gallery.g r3 = r3.f284720p
            if (r3 == 0) goto L_0x0040
            com.tencent.mm.ui.chatting.gallery.m1 r3 = r3.mo135877h(r9)
            if (r3 == 0) goto L_0x0040
            com.tencent.mm.pluginsdk.ui.tools.r0 r3 = r3.f284849p
            if (r3 == 0) goto L_0x0040
            int r3 = r3.getCurrentPosition()
            goto L_0x0041
        L_0x0040:
            r3 = 0
        L_0x0041:
            r7.f119448c = r3
            r3 = 2
            int r4 = r7.f284965m
            r7.mo68721b(r2, r3, r4, r0)
        L_0x0049:
            if (r10 <= 0) goto L_0x0099
            r2 = 1
            if (r9 <= 0) goto L_0x0053
            com.tencent.mm.ui.chatting.gallery.s r9 = r8.f284478w
            r9.f119454i = r1
            goto L_0x0057
        L_0x0053:
            com.tencent.mm.ui.chatting.gallery.s r9 = r8.f284478w
            r9.f119454i = r2
        L_0x0057:
            com.tencent.mm.ui.chatting.gallery.h r9 = r8.f284432g
            com.tencent.mm.storage.f4 r9 = r9.mo135937y(r10)
            if (r9 == 0) goto L_0x0099
            boolean r10 = r9.mo100983V3()
            if (r10 != 0) goto L_0x0066
            goto L_0x0099
        L_0x0066:
            long r3 = java.lang.System.currentTimeMillis()
            r7.f284964l = r3
            android.content.Intent r8 = r8.getIntent()
            java.lang.String r10 = "KOpenArticleSceneFromScene"
            int r8 = r8.getIntExtra(r10, r2)
            r7.f119451f = r8
            r8 = 10000(0x2710, float:1.4013E-41)
            r7.f119452g = r8
            s90.n r8 = com.tencent.p014mm.p136ui.chatting.gallery.C97052g.m124926n(r9)
            if (r8 != 0) goto L_0x008b
            java.lang.String r8 = "MicroMsg.ImageGalleryMpVideoReport"
            java.lang.String r9 = "report17537 mpShareVideoInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r9)
            return
        L_0x008b:
            java.lang.String r9 = r8.f133375p
            boolean r9 = eb0.C45628s0.m50740E(r9)
            r7.f119453h = r9
            int r9 = r7.f284965m
            r7.mo68721b(r8, r2, r9, r0)
        L_0x0099:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.C97123s.mo136025d(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI, int, int):void");
    }
}
