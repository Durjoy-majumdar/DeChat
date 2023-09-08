package v02;

import android.content.Context;
import p210o.C11323a;
import te3.rg4;

public final /* synthetic */ class a$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f260614d;

    /* renamed from: e */
    public final /* synthetic */ String f260615e;

    /* renamed from: f */
    public final /* synthetic */ rg4 f260616f;

    /* renamed from: g */
    public final /* synthetic */ C11323a f260617g;

    public /* synthetic */ a$$a(Context context, String str, rg4 rg4, C11323a aVar) {
        this.f260614d = context;
        this.f260615e = str;
        this.f260616f = rg4;
        this.f260617g = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0150  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r18 = this;
            r0 = r18
            android.content.Context r1 = r0.f260614d
            java.lang.String r2 = r0.f260615e
            te3.rg4 r3 = r0.f260616f
            o.a r4 = r0.f260617g
            java.lang.String r5 = r3.f259799g
            java.lang.String r5 = b12.C79645d.m96736l(r5)
            java.lang.Class<mz.e> r6 = p617mz.C76813e.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            mz.e r6 = (p617mz.C76813e) r6
            java.lang.String r6 = r6.kt0()
            boolean r7 = v02.C90734a.m113785b()
            r8 = 0
            r9 = 1
            if (r7 == 0) goto L_0x0036
            bp3.p r7 = bp3.C79758p.f233760a
            bp3.f r10 = bp3.C104160f.RepairerConfig_Updater_HdiffMOCKPATCHPATH_Int
            int r7 = r7.mo109882e(r10, r8)
            if (r7 != r9) goto L_0x0030
            r7 = 1
            goto L_0x0031
        L_0x0030:
            r7 = 0
        L_0x0031:
            if (r7 == 0) goto L_0x0036
            java.lang.String r7 = "/storage/emulated/0/Android/data/com.tencent.mm/MicroMsg/WebNetFile/tmp_test.patch"
            goto L_0x0037
        L_0x0036:
            r7 = r2
        L_0x0037:
            java.io.File r10 = new java.io.File
            r10.<init>(r7)
            long r10 = r10.length()
            java.lang.String r2 = v02.C90734a.m113787d(r2)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "start HdiffApk newApkPath: "
            r12.append(r13)
            r12.append(r5)
            java.lang.String r13 = ", size: "
            r12.append(r13)
            java.io.File r14 = new java.io.File
            r14.<init>(r5)
            long r14 = r14.length()
            r12.append(r14)
            java.lang.String r14 = "\n, oldApk: "
            r12.append(r14)
            r12.append(r6)
            r12.append(r13)
            java.io.File r15 = new java.io.File
            r15.<init>(r6)
            long r8 = r15.length()
            r12.append(r8)
            java.lang.String r8 = "\n, hDiffPathTmp: "
            r12.append(r8)
            r12.append(r7)
            r12.append(r13)
            r12.append(r10)
            java.lang.String r9 = "\n, UpdateUtil.getCurrentApkPath(context): "
            r12.append(r9)
            java.lang.String r1 = b12.C79645d.m96733i(r1)
            r12.append(r1)
            java.lang.String r1 = r12.toString()
            java.lang.String r9 = "MicroMsg.Tinker.CTinkerInstaller"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r5)
            if (r1 == 0) goto L_0x00b2
            java.io.File r1 = new java.io.File
            r1.<init>(r5)
            long r10 = r1.length()
            r16 = 0
            int r1 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r1 == 0) goto L_0x00b8
        L_0x00b2:
            boolean r1 = b12.C79645d.m96738n(r5)
            if (r1 != 0) goto L_0x00c5
        L_0x00b8:
            java.io.File r1 = new java.io.File
            r1.<init>(r5)
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.safeDeleteFile(r1)
            java.lang.String r1 = "newApkPath is exists but size = 0."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r1)
        L_0x00c5:
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r5)
            if (r1 != 0) goto L_0x0150
            long r10 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = r3.f259799g
            int r1 = v02.C90737d.m113796d(r6, r7, r5, r2, r1)
            long r16 = java.lang.System.currentTimeMillis()
            java.io.File r2 = new java.io.File
            r2.<init>(r7)
            boolean r2 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.safeDeleteFile(r2)
            r12 = 3
            java.lang.Object[] r12 = new java.lang.Object[r12]
            long r16 = r16 - r10
            r10 = 1000(0x3e8, double:4.94E-321)
            long r16 = r16 / r10
            java.lang.Long r10 = java.lang.Long.valueOf(r16)
            r11 = 0
            r12[r11] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            r11 = 1
            r12[r11] = r10
            r10 = 2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r12[r10] = r2
            java.lang.String r2 = "HdiffAPk, merge apk use :%d second retCode:%d, deleteDownloadPatch:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r2, r12)
            if (r1 != 0) goto L_0x012a
            v02.C90737d.m113797e()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r10 = "HdiffApk oldApkMd5 = "
            r2.append(r10)
            java.lang.String r10 = r3.f259800h
            r2.append(r10)
            java.lang.String r10 = ", newApkMd5 = "
            r2.append(r10)
            java.lang.String r3 = r3.f259799g
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)
        L_0x012a:
            boolean r2 = b12.C79645d.m96738n(r5)
            if (r2 != 0) goto L_0x0152
            r1 = -201(0xffffffffffffff37, float:NaN)
            java.io.File r2 = new java.io.File
            r2.<init>(r5)
            boolean r2 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.safeDeleteFile(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r10 = "delNewApkPath = "
            r3.append(r10)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)
            goto L_0x0152
        L_0x0150:
            r1 = -101(0xffffffffffffff9b, float:NaN)
        L_0x0152:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "end HdiffApk newApkPath: "
            r2.append(r3)
            r2.append(r5)
            r2.append(r13)
            java.io.File r3 = new java.io.File
            r3.<init>(r5)
            long r10 = r3.length()
            r2.append(r10)
            r2.append(r14)
            r2.append(r6)
            r2.append(r13)
            java.io.File r3 = new java.io.File
            r3.<init>(r6)
            long r5 = r3.length()
            r2.append(r5)
            r2.append(r8)
            r2.append(r7)
            r2.append(r13)
            java.io.File r3 = new java.io.File
            r3.<init>(r7)
            long r5 = r3.length()
            r2.append(r5)
            java.lang.String r3 = "\n, retCode: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)
            zt3.t r2 = zt3.C119157j.f356862d
            v02.a$$b r3 = new v02.a$$b
            r3.<init>(r4, r1)
            zt3.j r2 = (zt3.C119157j) r2
            r2.mo183895z(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v02.a$$a.run():void");
    }
}
