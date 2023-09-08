package com.tencent.p014mm.pluginsdk.model.app;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.pluginsdk.model.app.h0 */
public final class C72685h0 {

    /* renamed from: com.tencent.mm.pluginsdk.model.app.h0$a */
    public class C72686a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f211496d;

        public C72686a(Context context) {
            this.f211496d = context;
        }

        public void run() {
            Context context = this.f211496d;
            C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.hfl), 1).show();
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.model.app.h0$b */
    public class C72687b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f211497d;

        public C72687b(Context context) {
            this.f211497d = context;
        }

        public void run() {
            Context context = this.f211497d;
            C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.hfm), 1).show();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x013c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m85014a(android.content.Context r10, com.tencent.p014mm.pluginsdk.model.app.C44561j r11, java.lang.String r12, com.tencent.p014mm.pluginsdk.model.app.C72693u1 r13, com.tencent.p014mm.pluginsdk.model.app.C72691t1 r14, boolean r15) {
        /*
            md2.b r0 = md2.C47000b.C34548a.m40384a()
            java.lang.String r1 = "MicroMsg.AppUtil"
            r2 = 0
            if (r12 == 0) goto L_0x0152
            int r3 = r12.length()
            if (r3 != 0) goto L_0x0011
            goto L_0x0152
        L_0x0011:
            r3 = 1
            if (r11 != 0) goto L_0x001a
            java.lang.String r10 = "app does not exist"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r10)
            return r3
        L_0x001a:
            java.lang.String r4 = r11.field_packageName
            if (r4 == 0) goto L_0x0149
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0026
            goto L_0x0149
        L_0x0026:
            java.lang.String r4 = r11.field_signature
            if (r4 == 0) goto L_0x0140
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0032
            goto L_0x0140
        L_0x0032:
            java.lang.String r4 = r11.field_packageName
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r4, (java.lang.String) r12)
            if (r4 != 0) goto L_0x0056
            r13 = 2
            java.lang.Object[] r13 = new java.lang.Object[r13]
            java.lang.String r14 = r11.field_packageName
            r13[r2] = r14
            r13[r3] = r12
            java.lang.String r12 = "isAppValid, packageName is diff, src:%s,local:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r12, r13)
            r0.mo72203oG(r11)
            if (r15 == 0) goto L_0x0055
            com.tencent.mm.pluginsdk.model.app.h0$a r11 = new com.tencent.mm.pluginsdk.model.app.h0$a
            r11.<init>(r10)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r11)
        L_0x0055:
            return r2
        L_0x0056:
            com.tencent.mm.pluginsdk.model.app.t1$a r4 = com.tencent.p014mm.pluginsdk.model.app.C72691t1.C72692a.FAIL_BY_TOKEN
            android.content.pm.Signature[] r12 = com.tencent.p014mm.pluginsdk.model.app.C6647c.m6936a(r10, r12)
            if (r12 == 0) goto L_0x0061
            int r5 = r12.length
            if (r5 != 0) goto L_0x007d
        L_0x0061:
            java.lang.String r5 = "checkAppSignature get local signature failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r5)
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isAffectedByPackageVisibility(r5)
            if (r5 != 0) goto L_0x007d
            java.lang.String r12 = "checkAppSignature, SDK_INT < 30 and apk signatures is null, RESULT_FAIL_BY_LOCAL"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r12)
            if (r14 == 0) goto L_0x0118
            com.tencent.mm.pluginsdk.model.app.t1$a r12 = com.tencent.p014mm.pluginsdk.model.app.C72691t1.C72692a.FAIL_BY_LOCAL
            r14.f211511a = r12
            goto L_0x0118
        L_0x007d:
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r6 = r11.field_signature
            r5[r2] = r6
            java.lang.String r6 = "checkAppSignature server signatures:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r6, r5)
            if (r12 == 0) goto L_0x00d8
            int r5 = r12.length
            if (r5 <= 0) goto L_0x00d8
            int r5 = r12.length
            r6 = 0
        L_0x008f:
            if (r6 >= r5) goto L_0x00c1
            r7 = r12[r6]
            byte[] r7 = r7.toByteArray()
            java.lang.String r7 = p823sg.C90193h.m112878f(r7)
            java.lang.String r7 = com.tencent.p014mm.pluginsdk.model.app.C72688j0.m85019e(r7)
            java.lang.Object[] r8 = new java.lang.Object[r3]
            r8[r2] = r7
            java.lang.String r9 = "checkAppSignature local signatures:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r9, r8)
            java.lang.String r8 = r11.field_signature
            if (r8 == 0) goto L_0x00be
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x00be
            if (r14 == 0) goto L_0x00b8
            com.tencent.mm.pluginsdk.model.app.t1$a r12 = com.tencent.p014mm.pluginsdk.model.app.C72691t1.C72692a.SUCCESS
            r14.f211511a = r12
        L_0x00b8:
            java.lang.String r12 = "checkAppSignature check success by local signatures, RESULT_SUCCESS"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r12)
            goto L_0x0111
        L_0x00be:
            int r6 = r6 + 1
            goto L_0x008f
        L_0x00c1:
            java.lang.Object[] r12 = new java.lang.Object[r3]
            if (r13 == 0) goto L_0x00c7
            r5 = 1
            goto L_0x00c8
        L_0x00c7:
            r5 = 0
        L_0x00c8:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r12[r2] = r5
            java.lang.String r5 = "checkAppSignature, signature is diff, tokenData != null: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r5, r12)
            if (r14 == 0) goto L_0x00d8
            r14.f211511a = r4
            goto L_0x0118
        L_0x00d8:
            if (r13 == 0) goto L_0x0113
            boolean r12 = r13.f211524e
            if (r12 == 0) goto L_0x0113
            java.lang.String r12 = r13.f211522c
            if (r12 == 0) goto L_0x0106
            java.lang.String r12 = com.tencent.p014mm.pluginsdk.model.app.C72688j0.m85019e(r12)
            java.lang.String r13 = r11.field_signature
            if (r13 == 0) goto L_0x00fc
            boolean r12 = r13.equals(r12)
            if (r12 == 0) goto L_0x00fc
            if (r14 == 0) goto L_0x00f6
            com.tencent.mm.pluginsdk.model.app.t1$a r12 = com.tencent.p014mm.pluginsdk.model.app.C72691t1.C72692a.SUCCESS_BY_TOKEN
            r14.f211511a = r12
        L_0x00f6:
            java.lang.String r12 = "checkAppSignature check success by token signatures, RESULT_SUCCESS_BY_TOKEN"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r12)
            goto L_0x0111
        L_0x00fc:
            if (r14 == 0) goto L_0x0100
            r14.f211511a = r4
        L_0x0100:
            java.lang.String r12 = "checkAppSignature check fail by token signatures, RESULT_FAIL_BY_TOKEN"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r12)
            goto L_0x0118
        L_0x0106:
            if (r14 == 0) goto L_0x010c
            com.tencent.mm.pluginsdk.model.app.t1$a r12 = com.tencent.p014mm.pluginsdk.model.app.C72691t1.C72692a.NO_TOKEN_SIGNATURE
            r14.f211511a = r12
        L_0x010c:
            java.lang.String r12 = "checkAppSignature pass temporarily, RESULT_NO_TOKEN_SIGNATURE"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r12)
        L_0x0111:
            r2 = 1
            goto L_0x0118
        L_0x0113:
            java.lang.String r12 = "checkAppSignature check fail, no token"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r12)
        L_0x0118:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "isAppValid, checkAppSignature, result:"
            r12.append(r13)
            r12.append(r2)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r12)
            if (r2 != 0) goto L_0x013c
            r0.mo72203oG(r11)
            if (r15 == 0) goto L_0x013f
            com.tencent.mm.pluginsdk.model.app.h0$b r11 = new com.tencent.mm.pluginsdk.model.app.h0$b
            r11.<init>(r10)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r11)
            goto L_0x013f
        L_0x013c:
            r0.mo72199be(r11)
        L_0x013f:
            return r2
        L_0x0140:
            java.lang.String r10 = "isAppValid fail, local signature is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r10)
            r0.mo72203oG(r11)
            return r2
        L_0x0149:
            java.lang.String r10 = "isAppValid fail, local packageName is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r10)
            r0.mo72203oG(r11)
            return r2
        L_0x0152:
            java.lang.String r10 = "isAppValid, packageName is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r10)
            r0.mo72203oG(r11)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.model.app.C72685h0.m85014a(android.content.Context, com.tencent.mm.pluginsdk.model.app.j, java.lang.String, com.tencent.mm.pluginsdk.model.app.u1, com.tencent.mm.pluginsdk.model.app.t1, boolean):boolean");
    }
}
