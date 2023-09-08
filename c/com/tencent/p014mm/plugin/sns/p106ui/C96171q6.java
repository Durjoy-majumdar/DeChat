package com.tencent.p014mm.plugin.sns.p106ui;

import ad0.C91998s;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import nj3.C11184p0;

/* renamed from: com.tencent.mm.plugin.sns.ui.q6 */
public class C96171q6 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C91998s f280951d;

    /* renamed from: e */
    public final /* synthetic */ SnsTimeLineUI f280952e;

    /* renamed from: com.tencent.mm.plugin.sns.ui.q6$a */
    public class C96172a implements Runnable {
        public C96172a() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$67$1");
            C96171q6.this.f280952e.finish();
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$67$1");
        }
    }

    public C96171q6(SnsTimeLineUI snsTimeLineUI, C91998s sVar) {
        this.f280952e = snsTimeLineUI;
        this.f280951d = sVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x019a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMMMenuItemSelected(android.view.MenuItem r27, int r28) {
        /*
            r26 = this;
            r7 = r26
            java.lang.Class<ht1.t1> r0 = ht1.C60200t1.class
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r8 = r27
            r1.add(r8)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r28)
            r1.add(r2)
            java.lang.Object[] r6 = r1.toArray()
            r1.clear()
            java.lang.String r1 = "com/tencent/mm/plugin/sns/ui/SnsTimeLineUI$67"
            java.lang.String r2 = "com/tencent/mm/plugin/sns/ui/SnsTimeLineUI$com/tencent/mm/ui/base/MMMenuListener$OnMMMenuItemSelectedListener"
            java.lang.String r3 = "onMMMenuItemSelected"
            java.lang.String r4 = "(Landroid/view/MenuItem;I)V"
            r5 = r26
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = "onMMMenuItemSelected"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$67"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            int r3 = r27.getItemId()
            r4 = 1
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI"
            if (r3 == r4) goto L_0x0231
            r6 = 2131824803(0x7f1110a3, float:1.9282444E38)
            r8 = 3
            java.lang.String r9 = "access$6100"
            if (r3 == r8) goto L_0x01cb
            r10 = 4
            if (r3 == r10) goto L_0x0114
            r11 = 5
            if (r3 == r11) goto L_0x0100
            r12 = 6
            if (r3 == r12) goto L_0x006a
            r0 = 7
            if (r3 == r0) goto L_0x0051
            goto L_0x0242
        L_0x0051:
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r0 = r7.f280952e
            com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122314x8(r0)
            java.lang.String r0 = vr2.C102236a0.m134754l()
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r3 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            com.tencent.mm.autogen.mmdata.rpt.SecondCutShareSnsStruct r3 = r3.mo131340A()
            java.lang.String r5 = "MonmentSessionId"
            java.lang.String r0 = r3.mo86045b(r5, r0, r4)
            r3.f265826g = r0
            goto L_0x0242
        L_0x006a:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            int r13 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122310m8()
            if (r13 != r4) goto L_0x0091
            java.lang.String r10 = "key_finder_post_router"
            r3.putExtra(r10, r12)
            java.lang.String r10 = "key_finder_sns_post_type"
            r3.putExtra(r10, r4)
            di3.d r0 = di3.C86312j.m106911c(r0)
            ht1.t1 r0 = (ht1.C60200t1) r0
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r4 = r7.f280952e
            androidx.appcompat.app.AppCompatActivity r4 = r4.getContext()
            r0.mo76837c0(r4, r3)
            goto L_0x00b9
        L_0x0091:
            di3.d r12 = di3.C86312j.m106911c(r0)
            ht1.t1 r12 = (ht1.C60200t1) r12
            r13 = 44
            r12.mo76842e7(r10, r11, r13, r3)
            java.lang.String r10 = "key_form_sns"
            r3.putExtra(r10, r4)
            di3.d r0 = di3.C86312j.m106911c(r0)
            ht1.t1 r0 = (ht1.C60200t1) r0
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r4 = r7.f280952e
            androidx.appcompat.app.AppCompatActivity r4 = r4.getContext()
            r0.Hm0(r4, r3)
            com.tencent.mm.plugin.sns.ui.q6$a r0 = new com.tencent.mm.plugin.sns.ui.q6$a
            r0.<init>()
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
        L_0x00b9:
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r10 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            r11 = 1
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r0 = r7.f280952e
            java.lang.String r12 = r0.getString(r6)
            r13 = 3
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r0 = r7.f280952e
            int r14 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122309l8(r0)
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r0 = r7.f280952e
            long r15 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122308k8(r0)
            int r17 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122310m8()
            r10.mo131354O(r11, r12, r13, r14, r15, r17)
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r18 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            r19 = 2
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r0 = r7.f280952e
            java.lang.String r20 = r0.getString(r6)
            r21 = 0
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r0 = r7.f280952e
            int r22 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122309l8(r0)
            long r23 = eb0.C31543z5.m39453c()
            int r25 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122310m8()
            r18.mo131354O(r19, r20, r21, r22, r23, r25)
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r0 = r7.f280952e
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r5)
            r0.mo132945A8(r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r5)
            goto L_0x0242
        L_0x0100:
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r0 = r7.f280952e
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$a1 r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122306i8(r0)
            r0.mo132961a(r10)
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r0 = r7.f280952e
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$a1 r3 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122306i8(r0)
            com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122307j8(r0, r3)
            goto L_0x0242
        L_0x0114:
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r0 = r7.f280952e
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$a1 r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122306i8(r0)
            r0.mo132961a(r8)
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r0 = r7.f280952e
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$a1 r3 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122306i8(r0)
            com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122307j8(r0, r3)
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r8 = r7.f280952e
            java.lang.String r3 = "access$6200"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r5)
            r8.getClass()
            java.lang.String r6 = "handleGoWeishi"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r5)
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$z0 r9 = new com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$z0
            r0 = 0
            r9.<init>(r8, r0)
            int r0 = com.tencent.p014mm.plugin.sns.model.C5431p1.f21134a
            java.lang.String r10 = "checkWeishiInstalled"
            java.lang.String r11 = "com.tencent.mm.plugin.sns.model.SnsLogic"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r11)
            r12 = 0
            android.content.pm.PackageManager r0 = r8.getPackageManager()     // Catch:{ Exception -> 0x0176 }
            java.lang.String r13 = "com.tencent.weishi"
            r14 = 64
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r13, r14)     // Catch:{ Exception -> 0x0176 }
            if (r0 == 0) goto L_0x0186
            android.content.pm.Signature[] r0 = r0.signatures     // Catch:{ Exception -> 0x0176 }
            r0 = r0[r12]     // Catch:{ Exception -> 0x0176 }
            byte[] r0 = r0.toByteArray()     // Catch:{ Exception -> 0x0176 }
            java.lang.String r13 = "MD5"
            java.security.MessageDigest r13 = java.security.MessageDigest.getInstance(r13)     // Catch:{ Exception -> 0x0176 }
            r13.update(r0)     // Catch:{ Exception -> 0x0176 }
            byte[] r0 = r13.digest()     // Catch:{ Exception -> 0x0176 }
            java.lang.String r0 = ft3.C45807d.m51084a(r0)     // Catch:{ Exception -> 0x0176 }
            java.lang.String r13 = "2A281593D71DF33374E6124E9106DF08"
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r0, (java.lang.String) r13)     // Catch:{ Exception -> 0x0176 }
            if (r0 == 0) goto L_0x0186
            r0 = 1
            goto L_0x0187
        L_0x0176:
            r0 = move-exception
            java.lang.Object[] r13 = new java.lang.Object[r4]
            java.lang.String r0 = r0.getMessage()
            r13[r12] = r0
            java.lang.String r0 = "MicroMsg.SnsLogic"
            java.lang.String r14 = "checkWeishiInstalled Exception: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r14, r13)
        L_0x0186:
            r0 = 0
        L_0x0187:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)
            r10 = 2
            if (r0 == 0) goto L_0x019a
            r0 = 2131821525(0x7f1103d5, float:1.9275796E38)
            r9.f278812a = r0
            r9.f278813b = r10
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$a1 r0 = r8.f278668Z
            r0.mo132963c(r4)
            goto L_0x01a6
        L_0x019a:
            r0 = 2131821524(0x7f1103d4, float:1.9275794E38)
            r9.f278812a = r0
            r9.f278813b = r12
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$a1 r0 = r8.f278668Z
            r0.mo132963c(r10)
        L_0x01a6:
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$a1 r0 = r8.f278668Z
            r8.mo132946D8(r0)
            int r0 = r9.f278812a
            r10 = 2131821704(0x7f110488, float:1.9276159E38)
            r11 = 2131821617(0x7f110431, float:1.9275982E38)
            r12 = 2131821426(0x7f110372, float:1.9275595E38)
            com.tencent.mm.plugin.sns.ui.s6 r13 = new com.tencent.mm.plugin.sns.ui.s6
            r13.<init>(r8, r9)
            com.tencent.mm.plugin.sns.ui.t6 r14 = new com.tencent.mm.plugin.sns.ui.t6
            r14.<init>(r8)
            r9 = r0
            nj3.C76879j.m92739j(r8, r9, r10, r11, r12, r13, r14)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r5)
            goto L_0x0242
        L_0x01cb:
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r0 = r7.f280952e
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$a1 r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122306i8(r0)
            r0.mo132961a(r4)
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r0 = r7.f280952e
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$a1 r3 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122306i8(r0)
            com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122307j8(r0, r3)
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r0 = r7.f280952e
            r0.getClass()
            java.lang.String r3 = "doCpatureMMSight"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r5)
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122311q8(r0, r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r5)
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r0 = r7.f280952e
            long r10 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122308k8(r0)
            r12 = 0
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x0225
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r14 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            r15 = 1
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r0 = r7.f280952e
            java.lang.String r16 = r0.getString(r6)
            r17 = 1
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r0 = r7.f280952e
            int r18 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122309l8(r0)
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r0 = r7.f280952e
            long r19 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122308k8(r0)
            int r21 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122310m8()
            r14.mo131354O(r15, r16, r17, r18, r19, r21)
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r0 = r7.f280952e
            java.lang.String r3 = "access$5802"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r5)
            r0.f278652R1 = r12
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r5)
        L_0x0225:
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r0 = r7.f280952e
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r5)
            r0.mo132945A8(r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r5)
            goto L_0x0242
        L_0x0231:
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r0 = r7.f280952e
            ad0.s r3 = r7.f280951d
            java.lang.Boolean r4 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.f278611T1
            java.lang.String r4 = "access$5500"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            r0.mo132959y8(r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
        L_0x0242:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            java.lang.String r0 = "com/tencent/mm/plugin/sns/ui/SnsTimeLineUI$67"
            java.lang.String r2 = "com/tencent/mm/plugin/sns/ui/SnsTimeLineUI$com/tencent/mm/ui/base/MMMenuListener$OnMMMenuItemSelectedListener"
            java.lang.String r3 = "(Landroid/view/MenuItem;I)V"
            j20.C117292a.m165361g(r7, r0, r2, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.C96171q6.onMMMenuItemSelected(android.view.MenuItem, int):void");
    }
}
