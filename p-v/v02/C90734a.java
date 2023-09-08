package v02;

import b12.C79645d;
import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.autogen.events.UpgradeConfigEvent;
import com.tencent.p014mm.plugin.p064hp.util.TinkerSyncResponse;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import eb0.C31543z5;
import f40.C86709a0;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: v02.a */
public class C90734a {

    /* renamed from: a */
    public static long f260610a = 10485760;

    /* renamed from: b */
    public static AtomicBoolean f260611b = new AtomicBoolean(false);

    /* renamed from: c */
    public static long f260612c = 0;

    /* renamed from: d */
    public static boolean f260613d = false;

    /* renamed from: a */
    public static void m113784a(String str, a$$d a__d) {
        Log.m105924i("MicroMsg.Tinker.CTinkerInstaller", "buildOldDeltaFriendFile, filePath = " + str);
        C86709a0.m107525e().postToWorker(new a$$c(a__d, str));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0037 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m113785b() {
        /*
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0024
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
            if (r0 != 0) goto L_0x0018
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r0 != 0) goto L_0x0018
            int r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION_INT
            r3 = 788529167(0x2f00000f, float:1.1641553E-10)
            if (r0 != r3) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            r0 = 0
            goto L_0x0019
        L_0x0018:
            r0 = 1
        L_0x0019:
            if (r0 != 0) goto L_0x0024
            boolean r0 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            if (r0 == 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r0 = 0
            goto L_0x0025
        L_0x0024:
            r0 = 1
        L_0x0025:
            if (r0 != 0) goto L_0x0037
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r3 = h81.C32735h.C32737c.clicfg_local_wechat_repair_entrance_flag_and
            int r0 = r0.mo58779Qe(r3, r1)
            if (r0 != r2) goto L_0x0038
        L_0x0037:
            r1 = 1
        L_0x0038:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v02.C90734a.m113785b():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ec, code lost:
        if (b12.C79645d.m96738n(r8) != false) goto L_0x00fb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d4 A[Catch:{ Exception -> 0x0066, all -> 0x0063 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e6 A[Catch:{ Exception -> 0x0066, all -> 0x0063 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m113786c(android.content.Context r39, java.lang.String r40, com.tencent.p014mm.plugin.p064hp.util.TinkerSyncResponse r41) {
        /*
            r0 = r40
            r1 = r41
            java.lang.String r2 = "\n, hDiffPathTmp: "
            java.lang.String r3 = "\n, oldApk: "
            java.lang.String r4 = ", size: "
            java.lang.String r5 = "MicroMsg.Tinker.CTinkerInstaller"
            java.lang.Integer r6 = r1.f248340f
            int r6 = r6.intValue()
            r7 = 0
            r8 = 1
            r9 = 4
            if (r9 != r6) goto L_0x0019
            r6 = 1
            goto L_0x001a
        L_0x0019:
            r6 = 0
        L_0x001a:
            java.lang.Integer r9 = r1.f248340f
            int r9 = r9.intValue()
            r10 = 3
            if (r10 != r9) goto L_0x0025
            r9 = 1
            goto L_0x0026
        L_0x0025:
            r9 = 0
        L_0x0026:
            java.lang.String r11 = r1.f248346o     // Catch:{ Exception -> 0x0066 }
            java.lang.String r11 = b12.C79645d.m96736l(r11)     // Catch:{ Exception -> 0x0066 }
            if (r6 == 0) goto L_0x0217
            java.lang.String r15 = r1.f248346o     // Catch:{ Exception -> 0x0066 }
            java.lang.String r17 = b12.C79645d.m96733i(r39)     // Catch:{ Exception -> 0x0066 }
            boolean r18 = m113785b()     // Catch:{ Exception -> 0x0066 }
            if (r18 == 0) goto L_0x0069
            boolean r18 = v02.C90737d.m113795c()     // Catch:{ Exception -> 0x0066 }
            if (r18 == 0) goto L_0x0051
            android.content.Context r14 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0066 }
            java.lang.String r12 = "download ok"
            android.widget.Toast r12 = p910lj.C76701a.makeText((android.content.Context) r14, (java.lang.CharSequence) r12, (int) r8)     // Catch:{ Exception -> 0x0066 }
            r12.show()     // Catch:{ Exception -> 0x0066 }
            java.lang.String r12 = "/storage/emulated/0/Android/data/com.tencent.mm/MicroMsg/Download/tmp/old.apk"
            r17 = r12
        L_0x0051:
            bp3.p r12 = bp3.C79758p.f233760a     // Catch:{ Exception -> 0x0066 }
            bp3.f r13 = bp3.C104160f.RepairerConfig_Updater_HdiffMOCKPATCHPATH_Int     // Catch:{ Exception -> 0x0066 }
            int r12 = r12.mo109882e(r13, r7)     // Catch:{ Exception -> 0x0066 }
            if (r12 != r8) goto L_0x005d
            r12 = 1
            goto L_0x005e
        L_0x005d:
            r12 = 0
        L_0x005e:
            if (r12 == 0) goto L_0x0069
            java.lang.String r12 = "/storage/emulated/0/Android/data/com.tencent.mm/MicroMsg/WebNetFile/tmp_test.patch"
            goto L_0x006a
        L_0x0063:
            r0 = move-exception
            goto L_0x037e
        L_0x0066:
            r0 = move-exception
            goto L_0x0367
        L_0x0069:
            r12 = r0
        L_0x006a:
            r13 = r17
            java.io.File r14 = new java.io.File     // Catch:{ Exception -> 0x0066 }
            r14.<init>(r12)     // Catch:{ Exception -> 0x0066 }
            r19 = r9
            long r8 = r14.length()     // Catch:{ Exception -> 0x0066 }
            java.lang.String r0 = m113787d(r40)     // Catch:{ Exception -> 0x0066 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0066 }
            r14.<init>()     // Catch:{ Exception -> 0x0066 }
            java.lang.String r7 = "start HdiffApk newApkPath: "
            r14.append(r7)     // Catch:{ Exception -> 0x0066 }
            r14.append(r11)     // Catch:{ Exception -> 0x0066 }
            r14.append(r4)     // Catch:{ Exception -> 0x0066 }
            java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x0066 }
            r7.<init>(r11)     // Catch:{ Exception -> 0x0066 }
            r21 = r11
            long r10 = r7.length()     // Catch:{ Exception -> 0x0066 }
            r14.append(r10)     // Catch:{ Exception -> 0x0066 }
            r14.append(r3)     // Catch:{ Exception -> 0x0066 }
            r14.append(r13)     // Catch:{ Exception -> 0x0066 }
            r14.append(r4)     // Catch:{ Exception -> 0x0066 }
            java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x0066 }
            r7.<init>(r13)     // Catch:{ Exception -> 0x0066 }
            long r10 = r7.length()     // Catch:{ Exception -> 0x0066 }
            r14.append(r10)     // Catch:{ Exception -> 0x0066 }
            r14.append(r2)     // Catch:{ Exception -> 0x0066 }
            r14.append(r12)     // Catch:{ Exception -> 0x0066 }
            r14.append(r4)     // Catch:{ Exception -> 0x0066 }
            r14.append(r8)     // Catch:{ Exception -> 0x0066 }
            java.lang.String r7 = "\n, UpdateUtil.getCurrentApkPath(context): "
            r14.append(r7)     // Catch:{ Exception -> 0x0066 }
            java.lang.String r7 = b12.C79645d.m96733i(r39)     // Catch:{ Exception -> 0x0066 }
            r14.append(r7)     // Catch:{ Exception -> 0x0066 }
            java.lang.String r7 = r14.toString()     // Catch:{ Exception -> 0x0066 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r7)     // Catch:{ Exception -> 0x0066 }
            boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106450k(r21)     // Catch:{ Exception -> 0x0066 }
            if (r7 == 0) goto L_0x00e6
            java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x0066 }
            r8 = r21
            r7.<init>(r8)     // Catch:{ Exception -> 0x0066 }
            long r9 = r7.length()     // Catch:{ Exception -> 0x0066 }
            r21 = 0
            int r7 = (r9 > r21 ? 1 : (r9 == r21 ? 0 : -1))
            if (r7 == 0) goto L_0x00ee
            goto L_0x00e8
        L_0x00e6:
            r8 = r21
        L_0x00e8:
            boolean r7 = b12.C79645d.m96738n(r8)     // Catch:{ Exception -> 0x0066 }
            if (r7 != 0) goto L_0x00fb
        L_0x00ee:
            java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x0066 }
            r7.<init>(r8)     // Catch:{ Exception -> 0x0066 }
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.safeDeleteFile(r7)     // Catch:{ Exception -> 0x0066 }
            java.lang.String r7 = "newApkPath is exists but size = 0."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r7)     // Catch:{ Exception -> 0x0066 }
        L_0x00fb:
            boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106450k(r8)     // Catch:{ Exception -> 0x0066 }
            if (r7 != 0) goto L_0x01bf
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0066 }
            java.lang.String r7 = r1.f248346o     // Catch:{ Exception -> 0x0066 }
            int r0 = v02.C90737d.m113796d(r13, r12, r8, r0, r7)     // Catch:{ Exception -> 0x0066 }
            long r29 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0066 }
            if (r0 != 0) goto L_0x012c
            r21 = 106(0x6a, float:1.49E-43)
            long r23 = r29 - r9
            r25 = 1
            r27 = 2
            r22 = r0
            v02.C90737d.m113804l(r21, r22, r23, r25, r27)     // Catch:{ Exception -> 0x0066 }
            com.tencent.mm.plugin.report.service.n r31 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x0066 }
            r32 = 614(0x266, double:3.034E-321)
            r34 = 106(0x6a, double:5.24E-322)
            r36 = 1
            r38 = 0
            r31.idkeyStat(r32, r34, r36, r38)     // Catch:{ Exception -> 0x0066 }
            goto L_0x0146
        L_0x012c:
            r21 = 105(0x69, float:1.47E-43)
            long r23 = r29 - r9
            r25 = 1
            r27 = 2
            r22 = r0
            v02.C90737d.m113804l(r21, r22, r23, r25, r27)     // Catch:{ Exception -> 0x0066 }
            com.tencent.mm.plugin.report.service.n r31 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x0066 }
            r32 = 614(0x266, double:3.034E-321)
            r34 = 105(0x69, double:5.2E-322)
            r36 = 1
            r38 = 0
            r31.idkeyStat(r32, r34, r36, r38)     // Catch:{ Exception -> 0x0066 }
        L_0x0146:
            java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x0066 }
            r7.<init>(r12)     // Catch:{ Exception -> 0x0066 }
            boolean r7 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.safeDeleteFile(r7)     // Catch:{ Exception -> 0x0066 }
            java.lang.String r11 = "HdiffAPk, merge apk use :%d second retCode:%d, deleteDownloadPatch:%s"
            r14 = 3
            java.lang.Object[] r14 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x0066 }
            long r29 = r29 - r9
            r9 = 1000(0x3e8, double:4.94E-321)
            long r29 = r29 / r9
            java.lang.Long r9 = java.lang.Long.valueOf(r29)     // Catch:{ Exception -> 0x0066 }
            r10 = 0
            r14[r10] = r9     // Catch:{ Exception -> 0x0066 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0066 }
            r10 = 1
            r14[r10] = r9     // Catch:{ Exception -> 0x0066 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ Exception -> 0x0066 }
            r9 = 2
            r14[r9] = r7     // Catch:{ Exception -> 0x0066 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r11, r14)     // Catch:{ Exception -> 0x0066 }
            if (r0 != 0) goto L_0x0195
            v02.C90737d.m113797e()     // Catch:{ Exception -> 0x0066 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0066 }
            r7.<init>()     // Catch:{ Exception -> 0x0066 }
            java.lang.String r9 = "HdiffApk oldApkMd5 = "
            r7.append(r9)     // Catch:{ Exception -> 0x0066 }
            java.lang.String r9 = r1.f248347p     // Catch:{ Exception -> 0x0066 }
            r7.append(r9)     // Catch:{ Exception -> 0x0066 }
            java.lang.String r9 = ", newApkMd5 = "
            r7.append(r9)     // Catch:{ Exception -> 0x0066 }
            r7.append(r15)     // Catch:{ Exception -> 0x0066 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0066 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r7)     // Catch:{ Exception -> 0x0066 }
        L_0x0195:
            boolean r7 = b12.C79645d.m96738n(r8)     // Catch:{ Exception -> 0x0066 }
            if (r7 != 0) goto L_0x01bd
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x0066 }
            r0.<init>(r8)     // Catch:{ Exception -> 0x0066 }
            boolean r0 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.safeDeleteFile(r0)     // Catch:{ Exception -> 0x0066 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0066 }
            r7.<init>()     // Catch:{ Exception -> 0x0066 }
            java.lang.String r9 = "delNewApkPath = "
            r7.append(r9)     // Catch:{ Exception -> 0x0066 }
            r7.append(r0)     // Catch:{ Exception -> 0x0066 }
            java.lang.String r0 = r7.toString()     // Catch:{ Exception -> 0x0066 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)     // Catch:{ Exception -> 0x0066 }
            r0 = -201(0xffffffffffffff37, float:NaN)
            r15 = -201(0xffffffffffffff37, float:NaN)
            goto L_0x01c1
        L_0x01bd:
            r15 = r0
            goto L_0x01c1
        L_0x01bf:
            r15 = -101(0xffffffffffffff9b, float:NaN)
        L_0x01c1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0066 }
            r0.<init>()     // Catch:{ Exception -> 0x0066 }
            java.lang.String r7 = "end HdiffApk newApkPath: "
            r0.append(r7)     // Catch:{ Exception -> 0x0066 }
            r0.append(r8)     // Catch:{ Exception -> 0x0066 }
            r0.append(r4)     // Catch:{ Exception -> 0x0066 }
            java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x0066 }
            r7.<init>(r8)     // Catch:{ Exception -> 0x0066 }
            long r9 = r7.length()     // Catch:{ Exception -> 0x0066 }
            r0.append(r9)     // Catch:{ Exception -> 0x0066 }
            r0.append(r3)     // Catch:{ Exception -> 0x0066 }
            r0.append(r13)     // Catch:{ Exception -> 0x0066 }
            r0.append(r4)     // Catch:{ Exception -> 0x0066 }
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x0066 }
            r3.<init>(r13)     // Catch:{ Exception -> 0x0066 }
            long r9 = r3.length()     // Catch:{ Exception -> 0x0066 }
            r0.append(r9)     // Catch:{ Exception -> 0x0066 }
            r0.append(r2)     // Catch:{ Exception -> 0x0066 }
            r0.append(r12)     // Catch:{ Exception -> 0x0066 }
            r0.append(r4)     // Catch:{ Exception -> 0x0066 }
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0066 }
            r2.<init>(r12)     // Catch:{ Exception -> 0x0066 }
            long r2 = r2.length()     // Catch:{ Exception -> 0x0066 }
            r0.append(r2)     // Catch:{ Exception -> 0x0066 }
            java.lang.String r2 = "\n, retCode: "
            r0.append(r2)     // Catch:{ Exception -> 0x0066 }
            r0.append(r15)     // Catch:{ Exception -> 0x0066 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0066 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)     // Catch:{ Exception -> 0x0066 }
            goto L_0x0275
        L_0x0217:
            r19 = r9
            r8 = r11
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r8)     // Catch:{ Exception -> 0x0066 }
            if (r2 != 0) goto L_0x0273
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0066 }
            java.lang.String r4 = b12.C79645d.m96733i(r39)     // Catch:{ Exception -> 0x0066 }
            java.lang.String r7 = r1.f248346o     // Catch:{ Exception -> 0x0066 }
            int r4 = v02.C90736c.m113791a(r4, r0, r8, r7)     // Catch:{ Exception -> 0x0066 }
            java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x0066 }
            r7.<init>(r0)     // Catch:{ Exception -> 0x0066 }
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.safeDeleteFile(r7)     // Catch:{ Exception -> 0x0066 }
            long r20 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0066 }
            if (r4 != 0) goto L_0x0249
            r9 = 206(0xce, float:2.89E-43)
            long r11 = r20 - r2
            r13 = 1
            r15 = 1
            r10 = r4
            v02.C90737d.m113804l(r9, r10, r11, r13, r15)     // Catch:{ Exception -> 0x0066 }
            goto L_0x0255
        L_0x0249:
            r9 = 205(0xcd, float:2.87E-43)
            long r11 = r20 - r2
            r13 = 1
            r15 = 1
            r10 = r4
            v02.C90737d.m113804l(r9, r10, r11, r13, r15)     // Catch:{ Exception -> 0x0066 }
        L_0x0255:
            java.lang.String r0 = "merge apk use :%d second retCode:%d"
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0066 }
            long r20 = r20 - r2
            r2 = 1000(0x3e8, double:4.94E-321)
            long r20 = r20 / r2
            java.lang.Long r2 = java.lang.Long.valueOf(r20)     // Catch:{ Exception -> 0x0066 }
            r3 = 0
            r7[r3] = r2     // Catch:{ Exception -> 0x0066 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0066 }
            r3 = 1
            r7[r3] = r2     // Catch:{ Exception -> 0x0066 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r7)     // Catch:{ Exception -> 0x0066 }
            r15 = r4
            goto L_0x0275
        L_0x0273:
            r15 = -101(0xffffffffffffff9b, float:NaN)
        L_0x0275:
            if (r15 != 0) goto L_0x0335
            boolean r0 = p1054vg.C90793a.m113860a(r8)     // Catch:{ Exception -> 0x0066 }
            if (r6 == 0) goto L_0x0289
            if (r0 == 0) goto L_0x0287
            boolean r0 = b12.C79645d.m96738n(r8)     // Catch:{ Exception -> 0x0066 }
            if (r0 == 0) goto L_0x0287
            r10 = 1
            goto L_0x0288
        L_0x0287:
            r10 = 0
        L_0x0288:
            r0 = r10
        L_0x0289:
            java.lang.String r2 = "start write dialog info， HdiffApk checkApk:%s"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0066 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0066 }
            r7 = 0
            r3[r7] = r4     // Catch:{ Exception -> 0x0066 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r3)     // Catch:{ Exception -> 0x0066 }
            if (r0 == 0) goto L_0x032f
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0066 }
            java.lang.String r2 = r41.mo118352i()     // Catch:{ Exception -> 0x0066 }
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)     // Catch:{ Exception -> 0x0066 }
            if (r2 == 0) goto L_0x02b1
            r2 = 2131838203(0x7f1144fb, float:1.9309623E38)
            java.lang.String r2 = r0.getString(r2)     // Catch:{ Exception -> 0x0066 }
            goto L_0x02b5
        L_0x02b1:
            java.lang.String r2 = r41.mo118352i()     // Catch:{ Exception -> 0x0066 }
        L_0x02b5:
            te3.rg4 r3 = new te3.rg4     // Catch:{ Exception -> 0x0066 }
            r3.<init>()     // Catch:{ Exception -> 0x0066 }
            java.lang.String r4 = r1.f248344j     // Catch:{ Exception -> 0x0066 }
            r3.f259796d = r4     // Catch:{ Exception -> 0x0066 }
            r4 = 2131830389(0x7f112675, float:1.9293774E38)
            java.lang.String r4 = r0.getString(r4)     // Catch:{ Exception -> 0x0066 }
            r3.f259801i = r4     // Catch:{ Exception -> 0x0066 }
            r4 = 2131831453(0x7f112a9d, float:1.9295932E38)
            java.lang.String r4 = r0.getString(r4)     // Catch:{ Exception -> 0x0066 }
            r3.f259803n = r4     // Catch:{ Exception -> 0x0066 }
            r4 = 2131838184(0x7f1144e8, float:1.9309584E38)
            java.lang.String r0 = r0.getString(r4)     // Catch:{ Exception -> 0x0066 }
            r3.f259804o = r0     // Catch:{ Exception -> 0x0066 }
            java.lang.String r0 = r1.f248346o     // Catch:{ Exception -> 0x0066 }
            r3.f259799g = r0     // Catch:{ Exception -> 0x0066 }
            java.lang.String r0 = r1.f248347p     // Catch:{ Exception -> 0x0066 }
            r3.f259800h = r0     // Catch:{ Exception -> 0x0066 }
            int r0 = r1.f248345n     // Catch:{ Exception -> 0x0066 }
            r3.f259798f = r0     // Catch:{ Exception -> 0x0066 }
            java.lang.String r0 = r1.f248342h     // Catch:{ Exception -> 0x0066 }
            r3.f259805p = r0     // Catch:{ Exception -> 0x0066 }
            int r0 = r41.mo118353j()     // Catch:{ Exception -> 0x0066 }
            r3.f259809t = r0     // Catch:{ Exception -> 0x0066 }
            java.lang.String r0 = r1.f248343i     // Catch:{ Exception -> 0x0066 }
            r3.f259806q = r0     // Catch:{ Exception -> 0x0066 }
            int r0 = r1.f248348q     // Catch:{ Exception -> 0x0066 }
            r3.f259807r = r0     // Catch:{ Exception -> 0x0066 }
            r3.f259797e = r8     // Catch:{ Exception -> 0x0066 }
            r3.f259802j = r2     // Catch:{ Exception -> 0x0066 }
            int r0 = r41.mo118354m()     // Catch:{ Exception -> 0x0066 }
            r3.f259808s = r0     // Catch:{ Exception -> 0x0066 }
            b12.C79645d.m96725a(r3, r1)     // Catch:{ Exception -> 0x0066 }
            b12.C79645d.m96744t(r3)     // Catch:{ Exception -> 0x0066 }
            if (r19 == 0) goto L_0x0316
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x0066 }
            r8 = 614(0x266, double:3.034E-321)
            r10 = 58
            r12 = 1
            r14 = 0
            r7.idkeyStat(r8, r10, r12, r14)     // Catch:{ Exception -> 0x0066 }
            goto L_0x0329
        L_0x0316:
            if (r6 == 0) goto L_0x0329
            r0 = 125(0x7d, float:1.75E-43)
            v02.C90737d.m113803k(r0)     // Catch:{ Exception -> 0x0066 }
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x0066 }
            r7 = 614(0x266, double:3.034E-321)
            r9 = 125(0x7d, double:6.2E-322)
            r11 = 1
            r13 = 0
            r6.idkeyStat(r7, r9, r11, r13)     // Catch:{ Exception -> 0x0066 }
        L_0x0329:
            java.lang.String r0 = "boots download success."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)     // Catch:{ Exception -> 0x0066 }
            goto L_0x033a
        L_0x032f:
            java.lang.String r0 = "md5 is no equal."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)     // Catch:{ Exception -> 0x0066 }
            goto L_0x033a
        L_0x0335:
            java.lang.String r0 = "merge apk failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)     // Catch:{ Exception -> 0x0066 }
        L_0x033a:
            if (r19 == 0) goto L_0x037d
            r0 = -2
            if (r15 == r0) goto L_0x0355
            r0 = -1
            if (r15 == r0) goto L_0x0343
            goto L_0x037d
        L_0x0343:
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x0066 }
            r7 = 614(0x266, double:3.034E-321)
            r9 = 52
            r11 = 1
            r13 = 0
            r6.idkeyStat(r7, r9, r11, r13)     // Catch:{ Exception -> 0x0066 }
            java.lang.String r0 = "boots download failed sdcard full."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r0)     // Catch:{ Exception -> 0x0066 }
            goto L_0x037d
        L_0x0355:
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x0066 }
            r7 = 614(0x266, double:3.034E-321)
            r9 = 53
            r11 = 1
            r13 = 0
            r6.idkeyStat(r7, r9, r11, r13)     // Catch:{ Exception -> 0x0066 }
            java.lang.String r0 = "boots download failed apk md5 no equal."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r0)     // Catch:{ Exception -> 0x0066 }
            goto L_0x037d
        L_0x0367:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0063 }
            r1.<init>()     // Catch:{ all -> 0x0063 }
            java.lang.String r2 = "onReceiveUpgradeDiff = "
            r1.append(r2)     // Catch:{ all -> 0x0063 }
            r1.append(r0)     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0063 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)     // Catch:{ all -> 0x0063 }
            r15 = -10001(0xffffffffffffd8ef, float:NaN)
        L_0x037d:
            return r15
        L_0x037e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v02.C90734a.m113786c(android.content.Context, java.lang.String, com.tencent.mm.plugin.hp.util.TinkerSyncResponse):int");
    }

    /* renamed from: d */
    public static String m113787d(String str) {
        String parent = new File(str).getParent();
        String str2 = File.separator;
        if (!parent.endsWith(str2)) {
            parent = parent + str2;
        }
        String str3 = parent + "deltaFriendlyOldFile";
        Log.m105924i("MicroMsg.Tinker.CTinkerInstaller", "hdiffApk, getDeltaFriendlyOldFilePath, deltaFriendlyOldFilePath = " + str3);
        return str3;
    }

    /* renamed from: e */
    public static void m113788e(String str, int i, int i2) {
        Log.m105925i("MicroMsg.Tinker.CTinkerInstaller", "notifyExptKeyChange [%s]", str);
        UpgradeConfigEvent upgradeConfigEvent = new UpgradeConfigEvent();
        UpgradeConfigEvent.C80743a aVar = upgradeConfigEvent.f236294d;
        aVar.f236295a = str;
        aVar.f236296b = i;
        aVar.f236297c = i2;
        upgradeConfigEvent.publish();
    }

    /* renamed from: f */
    public static int m113789f(String str, TinkerSyncResponse tinkerSyncResponse) {
        int i;
        String str2 = str;
        TinkerSyncResponse tinkerSyncResponse2 = tinkerSyncResponse;
        try {
            Log.m105925i("MicroMsg.Tinker.CTinkerInstaller", "HdiffApk onDownloadFinish, TinkerSyncResponse = %s.", tinkerSyncResponse2);
            String str3 = tinkerSyncResponse2.f248346o;
            String l = C79645d.m96736l(str3);
            File file = new File(C86013q1.m106448i(str2, false));
            String i2 = C79645d.m96733i(MMApplicationContext.getContext());
            String absolutePath = file.getAbsolutePath();
            if (m113785b() && C90737d.m113795c()) {
                i2 = "/storage/emulated/0/Android/data/com.tencent.mm/MicroMsg/Download/tmp/old.apk";
            }
            if (m113785b()) {
                if (C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Updater_HdiffMOCKPATCHPATH_Int, 0) == 1) {
                    absolutePath = "/storage/emulated/0/Android/data/com.tencent.mm/MicroMsg/WebNetFile/tmp_test.patch";
                }
            }
            String d = m113787d(str);
            Log.m105924i("MicroMsg.Tinker.CTinkerInstaller", "HdiffApk newApkMd5: " + str3 + "\n, patchFile = " + file + ", size = " + file.length() + "\n, savePath = " + str2 + ", size = " + new File(str2).length() + "\n, hDiffPath = " + absolutePath + ", size = " + new File(absolutePath).length() + "\n, oldPath = " + i2 + ", size = " + new File(i2).length() + "\n, UpdateUtil.getCurrentApkPath(context): " + C79645d.m96733i(MMApplicationContext.getContext()) + "\n, deltaFriendOldFilePath = " + d);
            if (!C86013q1.m106450k(file.getAbsolutePath()) || file.length() <= 0) {
                C90737d.m113803k(113);
                C115669n.INSTANCE.idkeyStat(614, 113, 1, false);
                Log.m105920e("MicroMsg.Tinker.CTinkerInstaller", "HdiffApk patch is not exists.");
                return -7;
            }
            C90737d.m113803k(112);
            C115669n nVar = C115669n.INSTANCE;
            nVar.idkeyStat(614, 112, 1, false);
            if ((C86013q1.m106450k(l) && new File(l).length() == 0) || !C79645d.m96738n(l)) {
                SharePatchFileUtil.safeDeleteFile(new File(l));
                Log.m105928w("MicroMsg.Tinker.CTinkerInstaller", "HdiffApk newApkPath is exists but size = 0.");
            }
            long c = C31543z5.m39453c();
            i = C90737d.m113796d(i2, absolutePath, l, d, tinkerSyncResponse2.f248346o);
            long c2 = (C31543z5.m39453c() - c) / 1000;
            Log.m105925i("MicroMsg.Tinker.CTinkerInstaller", "HdiffApk merge h diff costTime: %s, hDiffPath :%s, newApkPath: %s, retCode: %s.", Long.valueOf(c2), absolutePath, l, Integer.valueOf(i));
            if (i == 0) {
                C90737d.m113804l(106, i, c2, 2, 2);
                nVar.idkeyStat(614, 106, 1, false);
            } else {
                nVar.idkeyStat(614, 105, 1, false);
                C90737d.m113804l(105, i, c2, 2, 2);
            }
            if (i == 0) {
                String str4 = "";
                try {
                    str4 = C86013q1.m106456q(i2);
                } catch (Exception e) {
                    Log.m105925i("MicroMsg.Tinker.CTinkerInstaller", "HdiffApk Exception = %s", e);
                }
                C90737d.m113797e();
                Log.m105925i("MicroMsg.Tinker.CTinkerInstaller", "HdiffApk oldApkMd5 = %s, response.oldApkMd5 = %s.", str4, tinkerSyncResponse2.f248347p);
            }
            if (!C79645d.m96738n(l)) {
                i = -201;
                boolean safeDeleteFile = SharePatchFileUtil.safeDeleteFile(new File(l));
                Log.m105924i("MicroMsg.Tinker.CTinkerInstaller", "HdiffApk deleteNewApkPath = " + safeDeleteFile);
            }
            boolean safeDeleteFile2 = SharePatchFileUtil.safeDeleteFile(new File(absolutePath));
            Log.m105924i("MicroMsg.Tinker.CTinkerInstaller", "HdiffApk deletehDiffPath = " + safeDeleteFile2);
            return i;
        } catch (Exception e2) {
            i = -10003;
            Log.m105925i("MicroMsg.Tinker.CTinkerInstaller", "HdiffApk e = %s", e2);
        } catch (Throwable th) {
            throw th;
        }
    }
}
