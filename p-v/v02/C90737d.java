package v02;

import a70.C112760b;
import b12.C79645d;
import bp3.C104160f;
import bp3.C79758p;
import com.tencent.mapsdk.internal.C0947jz;
import com.tencent.p014mm.autogen.mmdata.rpt.UpgradeBootStageDetailReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.UpgradeBootStatusReportStruct;
import com.tencent.p014mm.plugin.appbrand.jsapi.JsApiUploadWeRunData;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tplayer.plugins.ITPEventID;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import java.io.File;
import te3.C64828xf2;
import zn0.C91797a;
import zn0.C91802b;
import zn0.C91803c;
import zn0.C91807d;
import zn0.C91810e;

/* renamed from: v02.d */
public class C90737d {
    /* renamed from: a */
    public static void m113793a() {
        Iterable<C86001b0> t = C86013q1.m106459t(C112760b.m154224c0(), false);
        if (t != null) {
            for (C86001b0 next : t) {
                String str = next.f250472b;
                if (str.startsWith("mm_patch") && str.endsWith("tmp")) {
                    next.mo119954a();
                }
            }
        }
    }

    /* renamed from: b */
    public static boolean m113794b(String str, int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        try {
            File file = new File(str);
            Log.m105924i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "newApk.size = " + file.length());
            z = SharePatchFileUtil.safeDeleteFile(file);
            Log.m105924i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "合成失败，不保留文件，防止出现检测文件存在就去安装，因为现在没有md5了, deleteDownloadPatch = " + z);
            return z;
        } catch (Exception unused) {
            Log.m105924i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "deleteDownloadPatch = " + z);
            return z;
        }
    }

    /* renamed from: c */
    public static boolean m113795c() {
        return C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Updater_HdiffMOCKOLDAPK_Int, 0) == 1;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:43:0x0160=Splitter:B:43:0x0160, B:48:0x0184=Splitter:B:48:0x0184} */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m113796d(java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33) {
        /*
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r32
            java.lang.String r4 = ".HdiffApk merge apk failed."
            java.io.File r5 = new java.io.File
            r5.<init>(r3)
            java.lang.String r6 = "deleteOldDeltaPatch = "
            java.lang.String r7 = "MicroMsg.Tinker.MergeHDiffApk.HdiffApk"
            if (r0 == 0) goto L_0x01d1
            if (r1 == 0) goto L_0x01d1
            if (r2 == 0) goto L_0x01d1
            r8 = -1
            r9 = 0
            java.lang.String r10 = com.tencent.p014mm.vfs.C86013q1.m106458s(r31)     // Catch:{ OutOfMemoryError -> 0x0183, Exception -> 0x015f }
            com.tencent.p014mm.vfs.C86013q1.m106461v(r10)     // Catch:{ OutOfMemoryError -> 0x0183, Exception -> 0x015f }
            java.io.File r10 = new java.io.File     // Catch:{ OutOfMemoryError -> 0x0183, Exception -> 0x015f }
            r10.<init>(r0)     // Catch:{ OutOfMemoryError -> 0x0183, Exception -> 0x015f }
            java.io.File r0 = new java.io.File     // Catch:{ OutOfMemoryError -> 0x0183, Exception -> 0x015f }
            r0.<init>(r2)     // Catch:{ OutOfMemoryError -> 0x0183, Exception -> 0x015f }
            java.io.File r11 = new java.io.File     // Catch:{ OutOfMemoryError -> 0x0183, Exception -> 0x015f }
            r11.<init>(r1)     // Catch:{ OutOfMemoryError -> 0x0183, Exception -> 0x015f }
            java.io.File r1 = new java.io.File     // Catch:{ OutOfMemoryError -> 0x0183, Exception -> 0x015f }
            r1.<init>(r3)     // Catch:{ OutOfMemoryError -> 0x0183, Exception -> 0x015f }
            r0.deleteOnExit()     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
            com.tencent.p014mm.vfs.C86013q1.m106444e(r31)     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
            boolean r3 = r10.exists()     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
            r5 = 2
            r12 = 1
            if (r3 == 0) goto L_0x00f0
            boolean r3 = r11.exists()     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
            if (r3 == 0) goto L_0x00f0
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
            boolean r3 = r1.exists()     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
            if (r3 == 0) goto L_0x0059
            int r0 = ff0.C86864a.m107871b(r10, r11, r0, r1)     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
            goto L_0x005e
        L_0x0059:
            r3 = 0
            int r0 = ff0.C86864a.m107871b(r10, r11, r0, r3)     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
        L_0x005e:
            long r15 = java.lang.System.currentTimeMillis()     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
            long r15 = r15 - r13
            r13 = 1000(0x3e8, double:4.94E-321)
            long r13 = r15 / r13
            long r10 = r11.length()     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
            m113799g(r13, r10)     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
            m113798f(r0)     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
            java.lang.String r3 = "MicroMsg.HdiffApk:statusCode = %d， stayTime= %d"
            java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
            r10[r9] = r11     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
            java.lang.Long r11 = java.lang.Long.valueOf(r13)     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
            r10[r12] = r11     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r3, r10)     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
            r3 = 303(0x12f, float:4.25E-43)
            if (r0 != r3) goto L_0x00a0
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106447h(r31)     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
            r10.<init>()     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
            java.lang.String r11 = "HdiffApk happen check crc error, deleteNewApkFile, delete? success = "
            r10.append(r11)     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
            r10.append(r3)     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
            java.lang.String r3 = r10.toString()     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r3)     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
        L_0x00a0:
            if (r0 == 0) goto L_0x00c4
            java.lang.String r3 = "MicroMsg.MergePatchApk:merge failed in patchLessMemory()"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r3)     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
            m113793a()
            m113794b(r2, r0)
            boolean r1 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.safeDeleteFile(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            return r0
        L_0x00c4:
            java.lang.String r0 = com.tencent.p014mm.vfs.C86013q1.m106456q(r31)     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
            java.lang.String r3 = "HdiffApk response.newApkMd5:%s file md5:%s"
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
            r5[r9] = r33     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
            r5[r12] = r0     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r3, r5)     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
            m113793a()
            m113794b(r2, r9)
            boolean r0 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.safeDeleteFile(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            return r9
        L_0x00f0:
            boolean r3 = r11.exists()     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
            if (r3 != 0) goto L_0x0104
            com.tencent.mm.plugin.report.service.n r13 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
            r14 = 614(0x266, double:3.034E-321)
            r16 = 174(0xae, double:8.6E-322)
            r18 = 1
            r20 = 0
            r13.idkeyStat(r14, r16, r18, r20)     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
            goto L_0x0111
        L_0x0104:
            com.tencent.mm.plugin.report.service.n r21 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
            r22 = 614(0x266, double:3.034E-321)
            r24 = 175(0xaf, double:8.65E-322)
            r26 = 1
            r28 = 0
            r21.idkeyStat(r22, r24, r26, r28)     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
        L_0x0111:
            java.lang.String r3 = "MicroMsg.MergePatchApk:.HdiffApk file not found in merge(): oldFile.exists()=%s , newFile.exists()=%s , patch.exists()=%s "
            r13 = 3
            java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
            boolean r10 = r10.exists()     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
            r13[r9] = r10     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
            boolean r0 = r0.exists()     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
            r13[r12] = r0     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
            boolean r0 = r11.exists()     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
            r13[r5] = r0     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r3, r13)     // Catch:{ OutOfMemoryError -> 0x015a, Exception -> 0x0157, all -> 0x0154 }
            m113793a()
            m113794b(r2, r8)
            boolean r0 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.safeDeleteFile(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            return r8
        L_0x0154:
            r0 = move-exception
            r5 = r1
            goto L_0x01b4
        L_0x0157:
            r0 = move-exception
            r5 = r1
            goto L_0x0160
        L_0x015a:
            r0 = move-exception
            r5 = r1
            goto L_0x0184
        L_0x015d:
            r0 = move-exception
            goto L_0x01b4
        L_0x015f:
            r0 = move-exception
        L_0x0160:
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ all -> 0x015d }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r4, r1)     // Catch:{ all -> 0x015d }
            r0 = -4
            m113793a()
            m113794b(r2, r8)
            boolean r1 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.safeDeleteFile(r5)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            return r0
        L_0x0183:
            r0 = move-exception
        L_0x0184:
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x015d }
            r11 = 614(0x266, double:3.034E-321)
            r13 = 201(0xc9, double:9.93E-322)
            r15 = 1
            r17 = 0
            r10.idkeyStat(r11, r13, r15, r17)     // Catch:{ all -> 0x015d }
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ all -> 0x015d }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r4, r1)     // Catch:{ all -> 0x015d }
            r0 = -6
            m113793a()
            m113794b(r2, r8)
            boolean r1 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.safeDeleteFile(r5)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            return r0
        L_0x01b4:
            m113793a()
            m113794b(r2, r8)
            boolean r1 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.safeDeleteFile(r5)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            throw r0
        L_0x01d1:
            r0 = -5
            m113794b(r2, r0)
            boolean r1 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.safeDeleteFile(r5)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v02.C90737d.m113796d(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):int");
    }

    /* renamed from: e */
    public static void m113797e() {
        try {
            String string = MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).getString("update_old_delata_file_head_infor_tmp", "");
            String string2 = MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).getString("update_old_delata_file_tmp", "");
            if (!Util.isNullOrNil(string)) {
                if (C86013q1.m106447h(string)) {
                    Log.m105924i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "removeUnUseFile, headinfo_file = " + string);
                    MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putString("update_old_delata_file_head_infor_tmp", "");
                }
            }
            if (!Util.isNullOrNil(string) && C86013q1.m106447h(string2)) {
                Log.m105924i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "removeUnUseFile, headinfo_file = " + string2);
                MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putString("update_old_delata_file_tmp", "");
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    public static void m113798f(int i) {
        int i2 = i;
        Log.m105925i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog statusCode = %s.", Integer.valueOf(i));
        if (i2 != 0) {
            C115669n.INSTANCE.idkeyStat(614, 150, 1, false);
            Log.m105924i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = common error");
        }
        if (i2 == 0) {
            Log.m105924i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_SUCCESS");
        } else if (i2 == 101) {
            Log.m105924i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_VIRTUAL_IN_BEGIN_ERROR");
            C115669n.INSTANCE.idkeyStat(614, 190, 1, false);
        } else if (i2 != 102) {
            switch (i2) {
                case 301:
                    Log.m105924i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_OPENREAD_ERROR");
                    C115669n.INSTANCE.idkeyStat(614, 151, 1, false);
                    return;
                case 302:
                    Log.m105924i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_OPENWRITE_ERROR");
                    C115669n.INSTANCE.idkeyStat(614, 152, 1, false);
                    return;
                case 303:
                    Log.m105924i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_OPENWRITE_ERROR");
                    C115669n.INSTANCE.idkeyStat(614, 153, 1, false);
                    return;
                case 304:
                    Log.m105924i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_CLOSEFILE_ERROR");
                    C115669n.INSTANCE.idkeyStat(614, 154, 1, false);
                    return;
                case ITPEventID.RICH_MEDIA_SYNCHRONIZER_DESELECT_DONE:
                    Log.m105924i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_MEM_ERROR");
                    C115669n.INSTANCE.idkeyStat(614, 155, 1, false);
                    return;
                case ITPEventID.RICH_MEDIA_SYNCHRONIZER_RESET:
                    Log.m105924i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_HDIFFINFO_ERROR");
                    C115669n.INSTANCE.idkeyStat(614, 156, 1, false);
                    return;
                case ITPEventID.RICH_MEDIA_SYNCHRONIZER_RELEASE:
                    Log.m105924i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_COMPRESSTYPE_ERROR");
                    C115669n.INSTANCE.idkeyStat(614, 157, 1, false);
                    return;
                case ITPEventID.RICH_MEDIA_SYNCHRONIZER_ON_ERROR:
                    Log.m105924i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_ZIPPATCH_ERROR");
                    C115669n.INSTANCE.idkeyStat(614, 158, 1, false);
                    return;
                case ITPEventID.RICH_MEDIA_SYNCHRONIZER_SET_URL:
                    Log.m105924i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_ZIPDIFFINFO_ERROR");
                    C115669n.INSTANCE.idkeyStat(614, 159, 1, false);
                    return;
                case 310:
                    Log.m105924i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_OLDDECOMPRESS_ERROR");
                    C115669n.INSTANCE.idkeyStat(614, 160, 1, false);
                    return;
                case 311:
                    Log.m105924i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_OLDSTREAM_ERROR");
                    C115669n.INSTANCE.idkeyStat(614, 161, 1, false);
                    return;
                case 312:
                    Log.m105924i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_NEWSTREAM_ERROR");
                    C115669n.INSTANCE.idkeyStat(614, 162, 1, false);
                    return;
                case 313:
                    Log.m105924i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_FILE_OPENREAD_ERROR_INPUT_OPEN");
                    C115669n.INSTANCE.idkeyStat(614, 163, 1, false);
                    return;
                case C91807d.CTRL_INDEX /*314*/:
                    Log.m105924i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_FILE_OPENREAD_ERROR_OPEN_STREAM");
                    C115669n.INSTANCE.idkeyStat(614, 164, 1, false);
                    return;
                case C91810e.CTRL_INDEX /*315*/:
                    Log.m105924i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_OPENREAD_ERROR_OLDZIPPATH");
                    C115669n.INSTANCE.idkeyStat(614, 165, 1, false);
                    return;
                case C91797a.CTRL_INDEX /*316*/:
                    Log.m105924i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_OPENREAD_ERROR_OLDZIP_STREAM");
                    C115669n.INSTANCE.idkeyStat(614, 166, 1, false);
                    return;
                case C91803c.CTRL_INDEX /*317*/:
                    Log.m105924i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_OPENREAD_ERROR_NEW_ZIP_RESULT");
                    C115669n.INSTANCE.idkeyStat(614, 167, 1, false);
                    return;
                case C91802b.CTRL_INDEX /*318*/:
                    Log.m105924i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_OLDDATA_ERROR_CESIZE");
                    C115669n.INSTANCE.idkeyStat(614, 168, 1, false);
                    return;
                case 319:
                    Log.m105924i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_OLDDATA_ERROR_OLDCRC");
                    C115669n.INSTANCE.idkeyStat(614, 169, 1, false);
                    return;
                case C0947jz.f2205e:
                    Log.m105924i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_OLDDATA_ERROR_STREAMSIZE");
                    C115669n.INSTANCE.idkeyStat(614, 170, 1, false);
                    return;
                case 321:
                    Log.m105924i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_HPATCH_ERROR");
                    C115669n.INSTANCE.idkeyStat(614, 171, 1, false);
                    return;
                case 322:
                    Log.m105924i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_CHECKCRC_ERROR");
                    C115669n.INSTANCE.idkeyStat(614, 172, 1, false);
                    return;
                case JsApiUploadWeRunData.CTRL_INDEX:
                    Log.m105924i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_CHECKCRC_STREAM_ERROR");
                    C115669n.INSTANCE.idkeyStat(614, 173, 1, false);
                    return;
                default:
                    Log.m105924i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = others");
                    C115669n.INSTANCE.idkeyStat(614, 192, 1, false);
                    return;
            }
        } else {
            Log.m105924i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_VIRTUAL_IN_END_ERROR");
            C115669n.INSTANCE.idkeyStat(614, 191, 1, false);
        }
    }

    /* renamed from: g */
    public static void m113799g(long j, long j2) {
        if (j <= 5) {
            C115669n.INSTANCE.idkeyStat(614, 131, 1, false);
        } else if (j <= 10) {
            C115669n.INSTANCE.idkeyStat(614, 132, 1, false);
        } else if (j <= 20) {
            C115669n.INSTANCE.idkeyStat(614, 133, 1, false);
        } else if (j <= 40) {
            C115669n.INSTANCE.idkeyStat(614, 134, 1, false);
        } else {
            C115669n.INSTANCE.idkeyStat(614, 135, 1, false);
        }
    }

    /* renamed from: h */
    public static void m113800h(int i, int i2) {
        m113802j(i, i2, 0, 0, 0, 0);
    }

    /* renamed from: i */
    public static void m113801i(int i, int i2, int i3) {
        m113802j(i, i2, i3, 0, 0, 0);
    }

    /* renamed from: j */
    public static void m113802j(int i, int i2, int i3, int i4, int i5, int i6) {
        try {
            UpgradeBootStageDetailReportStruct upgradeBootStageDetailReportStruct = new UpgradeBootStageDetailReportStruct();
            upgradeBootStageDetailReportStruct.f236402d = (long) i;
            upgradeBootStageDetailReportStruct.f236404f = (long) i2;
            long j = (long) i6;
            upgradeBootStageDetailReportStruct.f236405g = j;
            upgradeBootStageDetailReportStruct.f236406h = (long) i4;
            upgradeBootStageDetailReportStruct.f236410l = (long) i5;
            upgradeBootStageDetailReportStruct.f236403e = (long) C79645d.f233535f;
            if (i == 3) {
                upgradeBootStageDetailReportStruct.f236407i = j;
                upgradeBootStageDetailReportStruct.f236408j = (long) (i6 + i4);
            }
            upgradeBootStageDetailReportStruct.f236409k = (long) i3;
            upgradeBootStageDetailReportStruct.mo86054n();
            Log.m105924i("MicroMsg.Tinker.MergeHrepotDiffApk", "report logbuffer(25395) : " + upgradeBootStageDetailReportStruct.mo1006q());
        } catch (Exception e) {
            Log.m105920e("MicroMsg.Tinker.MergeHrepotDiffApk", "report logbuffer(25395), error = " + e);
        }
    }

    /* renamed from: k */
    public static void m113803k(int i) {
        m113804l(i, -100, 0, -1, 1);
    }

    /* renamed from: l */
    public static void m113804l(int i, int i2, long j, long j2, long j3) {
        long j4 = j;
        try {
            C64828xf2 k = C79645d.m96735k();
            long j5 = k != null ? (k.f186299i - k.f186298h) / 1000 : 0;
            UpgradeBootStatusReportStruct upgradeBootStatusReportStruct = new UpgradeBootStatusReportStruct();
            upgradeBootStatusReportStruct.f236412e = (long) i;
            upgradeBootStatusReportStruct.f236411d = j3;
            upgradeBootStatusReportStruct.f236413f = (long) i2;
            upgradeBootStatusReportStruct.f236414g = j4;
            upgradeBootStatusReportStruct.f236416i = j5;
            upgradeBootStatusReportStruct.f236417j = j5 + j4;
            upgradeBootStatusReportStruct.f236415h = j2;
            if (j4 > 0 && k != null) {
                upgradeBootStatusReportStruct.f236418k = (System.currentTimeMillis() - k.f186298h) / 1000;
            }
            upgradeBootStatusReportStruct.mo86054n();
            Log.m105924i("MicroMsg.Tinker.MergeHrepotDiffApk", "report logbuffer(23550) : " + upgradeBootStatusReportStruct.mo1006q());
        } catch (Exception e) {
            Log.m105920e("MicroMsg.Tinker.MergeHrepotDiffApk", "report logbuffer(23550), error = " + e);
        }
    }
}
