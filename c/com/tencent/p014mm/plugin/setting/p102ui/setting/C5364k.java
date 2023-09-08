package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.k */
public final class C5364k implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ColorfulSelfQRCodeUI f21007d;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.k$a */
    public static final class C5365a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C5380o f21008d;

        public C5365a(C5380o oVar) {
            this.f21008d = oVar;
        }

        public final void run() {
            this.f21008d.mo6353e3();
        }
    }

    public C5364k(ColorfulSelfQRCodeUI colorfulSelfQRCodeUI) {
        this.f21007d = colorfulSelfQRCodeUI;
    }

    /* JADX WARNING: type inference failed for: r10v12, types: [lx.v] */
    /* JADX WARNING: type inference failed for: r10v15, types: [lx.v] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r9, int r10) {
        /*
            r8 = this;
            java.lang.Class<com.tencent.mm.plugin.setting.ui.setting.o> r9 = com.tencent.p014mm.plugin.setting.p102ui.setting.C5380o.class
            bl3.r r10 = bl3.C39818r.f106831a
            com.tencent.mm.plugin.setting.ui.setting.ColorfulSelfQRCodeUI r0 = r8.f21007d
            bl3.r$a r0 = r10.mo62444c(r0)
            androidx.lifecycle.i0 r0 = r0.mo75002a(r9)
            com.tencent.mm.plugin.setting.ui.setting.o r0 = (com.tencent.p014mm.plugin.setting.p102ui.setting.C5380o) r0
            int r0 = r0.mo6356i3()
            com.tencent.mm.autogen.mmdata.rpt.NewPersionalQRCodeReportStruct r1 = new com.tencent.mm.autogen.mmdata.rpt.NewPersionalQRCodeReportStruct
            r1.<init>()
            r2 = 32
            long r2 = (long) r2
            r1.f10019d = r2
            long r2 = eb0.C31543z5.m39453c()
            r1.f10020e = r2
            long r2 = (long) r0
            r1.f10021f = r2
            r1.mo86054n()
            com.tencent.mm.plugin.setting.ui.setting.ColorfulSelfQRCodeUI r0 = r8.f21007d
            bl3.r$a r10 = r10.mo62444c(r0)
            androidx.lifecycle.i0 r9 = r10.mo75002a(r9)
            com.tencent.mm.plugin.setting.ui.setting.o r9 = (com.tencent.p014mm.plugin.setting.p102ui.setting.C5380o) r9
            int r10 = r9.mo6355g3()
            r0 = 2
            java.lang.Class<lx.e0> r1 = p200lx.C46896e0.class
            java.util.List<java.lang.Integer> r2 = com.tencent.p014mm.plugin.setting.p102ui.setting.C5380o.f21029A
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            boolean r2 = r2.contains(r3)
            java.lang.String r3 = "createQRCode return null!"
            java.lang.String r4 = "MicroMsg.Setting.ColorfulSelfQRCodeUIC"
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L_0x0073
            boolean r2 = r9.f21033d
            if (r2 != 0) goto L_0x0054
            goto L_0x0073
        L_0x0054:
            di3.d r10 = di3.C86312j.m106911c(r1)
            lx.e0 r10 = (p200lx.C46896e0) r10
            java.lang.String r1 = r9.f21040n
            r2 = 994(0x3e2, float:1.393E-42)
            lx.v r10 = r10.mo71988dU(r1, r2, r0)
            boolean r0 = r10 instanceof ob0.C117747y
            if (r0 == 0) goto L_0x0069
            r5 = r10
            ob0.y r5 = (ob0.C117747y) r5
        L_0x0069:
            if (r5 != 0) goto L_0x006f
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r3)
            goto L_0x00c3
        L_0x006f:
            r9.mo6352d3(r5)
            goto L_0x0095
        L_0x0073:
            di3.d r1 = di3.C86312j.m106911c(r1)
            lx.e0 r1 = (p200lx.C46896e0) r1
            java.lang.String r2 = r9.f21040n
            hn2.i r7 = hn2.C8619i.f27728a
            java.lang.String r7 = r7.mo9493e(r10)
            lx.v r10 = r1.et0(r2, r10, r0, r7)
            boolean r0 = r10 instanceof ob0.C117747y
            if (r0 == 0) goto L_0x008c
            r5 = r10
            ob0.y r5 = (ob0.C117747y) r5
        L_0x008c:
            if (r5 != 0) goto L_0x0092
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r3)
            goto L_0x00c3
        L_0x0092:
            r9.mo6352d3(r5)
        L_0x0095:
            qo3.i0 r10 = r9.f21041o
            r0 = 1
            if (r10 == 0) goto L_0x00a1
            boolean r10 = r10.isShowing()
            if (r10 != r0) goto L_0x00a1
            goto L_0x00a2
        L_0x00a1:
            r0 = 0
        L_0x00a2:
            if (r0 != 0) goto L_0x00c3
            boolean r10 = r9.f21044r
            if (r10 == 0) goto L_0x00c3
            android.app.Activity r0 = r9.getContext()
            r10 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r1 = r9.getString(r10)
            r10 = 2131834300(0x7f1135bc, float:1.9301706E38)
            java.lang.String r2 = r9.getString(r10)
            r3 = 1
            r4 = 1
            r5 = 0
            qo3.i0 r10 = nj3.C76879j.m92723Q(r0, r1, r2, r3, r4, r5)
            r9.f21041o = r10
        L_0x00c3:
            zt3.t r10 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.setting.ui.setting.k$a r0 = new com.tencent.mm.plugin.setting.ui.setting.k$a
            r0.<init>(r9)
            r1 = 300(0x12c, double:1.48E-321)
            zt3.j r10 = (zt3.C119157j) r10
            r10.getClass()
            r10.mo183892w(r0, r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.setting.p102ui.setting.C5364k.onClick(android.content.DialogInterface, int):void");
    }
}
