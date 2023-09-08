package com.tencent.p014mm.mj_template.sns.compose.widget;

import android.content.Context;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.b */
public final class C40340b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Context f108424d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40340b(Context context) {
        super(0);
        this.f108424d = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ef, code lost:
        if (r12 >= r0) goto L_0x00f8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r20 = this;
            com.tencent.mm.autogen.mmdata.rpt.MaasRecommendReportStruct r0 = ja0.C24789f.f70695b
            r1 = 1
            r0.f69532m = r1
            r2 = r20
            android.content.Context r5 = r2.f108424d
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r5, r0)
            hi2.b r0 = hi2.C46072b.f124220a
            java.lang.String r3 = "com.tencent.phoenix"
            java.lang.String r4 = "A24DC0755072F64C480DC06DCD3412BF"
            boolean r6 = r0.mo71508b(r5, r3, r4)
            k21.c$a r7 = k21.C60960c.f173618a
            if (r6 == 0) goto L_0x001e
            r8 = 1
            goto L_0x001f
        L_0x001e:
            r8 = 2
        L_0x001f:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "SnsTemplate"
            java.lang.String r10 = "installMiaojian"
            r7.mo85926j(r9, r10, r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            java.lang.String r10 = "moreAction"
            r7.mo85926j(r9, r10, r8)
            java.lang.Class<h81.h> r7 = h81.C32735h.class
            di3.d r8 = di3.C86312j.m106911c(r7)
            h81.h r8 = (h81.C32735h) r8
            h81.h$c r9 = h81.C32735h.C32737c.clicfg_sns_maas_with_res_to_miaojian
            boolean r8 = r8.mo58784wf(r9, r1)
            java.lang.String r9 = "MicroMsg.Maas.Utils"
            r10 = 0
            r11 = 0
            if (r8 == 0) goto L_0x00f2
            r0.getClass()
            java.lang.String r8 = "MicroMsg.CheckDownloadUtil"
            r12 = -1
            android.content.pm.PackageManager r13 = r5.getPackageManager()     // Catch:{ Exception -> 0x00b7 }
            r14 = 64
            android.content.pm.PackageInfo r3 = r13.getPackageInfo(r3, r14)     // Catch:{ Exception -> 0x00b7 }
            if (r3 == 0) goto L_0x00b1
            java.lang.String r13 = "MD5"
            java.security.MessageDigest r13 = java.security.MessageDigest.getInstance(r13)     // Catch:{ Exception -> 0x00b7 }
            android.content.pm.Signature[] r14 = r3.signatures     // Catch:{ Exception -> 0x00b7 }
            java.lang.String r15 = "packageInfo.signatures"
            gy3.C87412m.m108593f(r14, r15)     // Catch:{ Exception -> 0x00b7 }
            java.lang.Object r14 = sx3.C110823p.m150982H(r14, r11)     // Catch:{ Exception -> 0x00b7 }
            android.content.pm.Signature r14 = (android.content.pm.Signature) r14     // Catch:{ Exception -> 0x00b7 }
            if (r14 == 0) goto L_0x0073
            byte[] r14 = r14.toByteArray()     // Catch:{ Exception -> 0x00b7 }
            goto L_0x0074
        L_0x0073:
            r14 = r10
        L_0x0074:
            if (r14 != 0) goto L_0x0078
            byte[] r14 = new byte[r11]     // Catch:{ Exception -> 0x00b7 }
        L_0x0078:
            r13.update(r14)     // Catch:{ Exception -> 0x00b7 }
            byte[] r14 = r13.digest()     // Catch:{ Exception -> 0x00b7 }
            java.lang.String r14 = r0.mo71507a(r14)     // Catch:{ Exception -> 0x00b7 }
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r14, (java.lang.String) r4)     // Catch:{ Exception -> 0x00b7 }
            if (r14 == 0) goto L_0x008c
            int r12 = r3.versionCode     // Catch:{ Exception -> 0x00b7 }
            goto L_0x00c5
        L_0x008c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b7 }
            r3.<init>()     // Catch:{ Exception -> 0x00b7 }
            java.lang.String r14 = "dig not match "
            r3.append(r14)     // Catch:{ Exception -> 0x00b7 }
            byte[] r13 = r13.digest()     // Catch:{ Exception -> 0x00b7 }
            java.lang.String r0 = r0.mo71507a(r13)     // Catch:{ Exception -> 0x00b7 }
            r3.append(r0)     // Catch:{ Exception -> 0x00b7 }
            java.lang.String r0 = ", "
            r3.append(r0)     // Catch:{ Exception -> 0x00b7 }
            r3.append(r4)     // Catch:{ Exception -> 0x00b7 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x00b7 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)     // Catch:{ Exception -> 0x00b7 }
            goto L_0x00c5
        L_0x00b1:
            java.lang.String r0 = "get package info error"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)     // Catch:{ Exception -> 0x00b7 }
            goto L_0x00c5
        L_0x00b7:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r0 = r0.getMessage()
            r3[r11] = r0
            java.lang.String r0 = "checkAppVersion com.tencent.phoenix Exception: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r8, r0, r3)
        L_0x00c5:
            di3.d r0 = di3.C86312j.m106911c(r7)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r3 = h81.C32735h.C32737c.clicfg_sns_maas_with_res_to_miaojian_min_version
            r4 = 102(0x66, float:1.43E-43)
            int r0 = r0.mo58779Qe(r3, r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "appVersion "
            r3.append(r4)
            r3.append(r12)
            java.lang.String r4 = ", configVersion "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r3)
            if (r12 < r0) goto L_0x00f7
            goto L_0x00f8
        L_0x00f2:
            java.lang.String r0 = "with res switch is false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
        L_0x00f7:
            r1 = 0
        L_0x00f8:
            if (r1 == 0) goto L_0x014a
            boolean r0 = r5 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r0 == 0) goto L_0x0102
            r0 = r5
            com.tencent.mm.ui.MMActivity r0 = (com.tencent.p014mm.p136ui.MMActivity) r0
            goto L_0x0103
        L_0x0102:
            r0 = r10
        L_0x0103:
            if (r0 == 0) goto L_0x0135
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L_0x0135
            java.lang.String r1 = "Template_Media_List"
            java.util.ArrayList r11 = r0.getParcelableArrayListExtra(r1)
            if (r11 == 0) goto L_0x0135
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            na0.e r17 = na0.C100108e.f293259d
            r18 = 30
            r19 = 0
            java.lang.String r12 = ","
            java.lang.String r0 = sx3.C110818d0.m150921S(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            java.nio.charset.Charset r1 = z04.C119027c.f356488a
            byte[] r0 = r0.getBytes(r1)
            java.lang.String r1 = "this as java.lang.String).getBytes(charset)"
            gy3.C87412m.m108593f(r0, r1)
            r1 = 8
            java.lang.String r10 = android.util.Base64.encodeToString(r0, r1)
        L_0x0135:
            ea0.a r3 = ea0.C45580a.f123293a
            na0.c r7 = new na0.c
            r7.<init>(r5, r6, r10)
            na0.d r8 = na0.C47214d.f126773d
            java.lang.String r0 = "resultFail"
            gy3.C87412m.m108594g(r8, r0)
            r6 = 1
            java.lang.String r4 = "scene_miaojian"
            r3.mo71107e(r4, r5, r6, r7, r8)
            goto L_0x0178
        L_0x014a:
            if (r6 == 0) goto L_0x0153
            r0 = 2131821507(0x7f1103c3, float:1.927576E38)
            r4 = 2131821507(0x7f1103c3, float:1.927576E38)
            goto L_0x0154
        L_0x0153:
            r4 = 0
        L_0x0154:
            if (r6 == 0) goto L_0x015a
            r0 = 2131821704(0x7f110488, float:1.9276159E38)
            goto L_0x015d
        L_0x015a:
            r0 = 2131831452(0x7f112a9c, float:1.929593E38)
        L_0x015d:
            if (r6 == 0) goto L_0x0163
            r1 = 2131821617(0x7f110431, float:1.9275982E38)
            goto L_0x0166
        L_0x0163:
            r1 = 2131831045(0x7f112905, float:1.9295104E38)
        L_0x0166:
            r7 = 2131821426(0x7f110372, float:1.9275595E38)
            na0.f r8 = new na0.f
            java.lang.String r3 = ""
            r8.<init>(r6, r3, r5)
            na0.g r9 = na0.C47216g.f126777d
            r3 = r5
            r5 = r0
            r6 = r1
            nj3.C76879j.m92739j(r3, r4, r5, r6, r7, r8, r9)
        L_0x0178:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.mj_template.sns.compose.widget.C40340b.invoke():java.lang.Object");
    }
}
