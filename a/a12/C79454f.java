package a12;

import a70.C79471a;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMUncaughtExceptionHandler;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import com.tencent.tinker.loader.shareutil.ShareTinkerLog;
import com.tencent.xweb.util.WXWebReporter;
import gv3.C87400a;
import iv3.C87821a;
import iv3.C87826d;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import kk0.C88191m;
import x02.C38431f;

/* renamed from: a12.f */
public class C79454f extends C87400a {
    public C79454f(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo109430a(File file, int i) {
        super.mo109430a(file, i);
        boolean isVersionChange = MMApplicationContext.isVersionChange();
        Log.m105925i("Tinker.HotPatchReportHelper", "hp_report package check failed, error = %d", Integer.valueOf(i));
        if (isVersionChange) {
            C115669n.INSTANCE.idkeyStat(338, 170, 1, false);
        }
        switch (i) {
            case -8:
                C115669n.INSTANCE.mo175910t(338, 169, WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_DOWNLOAD_SUCCESS, false);
                return;
            case -7:
                C115669n.INSTANCE.mo175910t(338, 169, WXWebReporter.WXWEB_GET_MMKV_FROM_CALLBACK_FAILED, false);
                return;
            case -6:
                C115669n.INSTANCE.mo175910t(338, 169, WXWebReporter.WXWEB_IDKEY_X5WEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE_VIDEO, false);
                return;
            case -5:
                C115669n.INSTANCE.mo175910t(338, 169, WXWebReporter.WXWEB_IDKEY_X5WEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE, false);
                return;
            case -4:
                C115669n.INSTANCE.mo175910t(338, 169, C88191m.CTRL_INDEX, false);
                return;
            case -3:
                C115669n.INSTANCE.mo175910t(338, 169, 172, false);
                return;
            case -2:
                C115669n.INSTANCE.mo175910t(338, 107, WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD_SUCCESS, false);
                return;
            case -1:
                C115669n.INSTANCE.mo175910t(338, 169, 171, false);
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    public void mo109431b(File file, int i, long j) {
        HashMap<String, String> hashMap;
        super.mo109431b(file, i, j);
        int i2 = 0;
        if (i == 0) {
            boolean z = C87821a.m109275c(this.f253289a).f254235h;
            C115669n nVar = C115669n.INSTANCE;
            nVar.idkeyStat(338, 4, 1, false);
            if (!z) {
                nVar.idkeyStat(338, 159, 1, false);
            } else {
                Log.m105925i("Tinker.HotPatchReportHelper", "hp_report report load cost = %d", Long.valueOf(j));
                if (j < 0) {
                    Log.m105920e("Tinker.HotPatchReportHelper", "hp_report report load cost failed, invalid cost");
                } else {
                    if (z) {
                        C79450b bVar = new C79450b(C79471a.f233015c, BuildInfo.CLIENT_VERSION);
                        SharedPreferences b = bVar.mo109424b();
                        String a = bVar.mo109423a(3);
                        if (!b.contains(a)) {
                            bVar.mo109425c(3, j);
                            b.edit().putLong(a, j).commit();
                        }
                    }
                    if (j <= 500) {
                        nVar.idkeyStat(338, 177, 1, false);
                    } else if (j <= 1000) {
                        nVar.idkeyStat(338, 178, 1, false);
                    } else if (j <= 3000) {
                        nVar.idkeyStat(338, 179, 1, false);
                    } else if (j <= FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
                        nVar.idkeyStat(338, 180, 1, false);
                    } else {
                        nVar.idkeyStat(338, 181, 1, false);
                    }
                }
            }
        }
        if (!C87821a.m109275c(this.f253289a).f254235h) {
            ShareTinkerLog.m106533v("Tinker.TinkerPatchLoadReporter", "onPatchRetryLoad retry is not main process, just return", new Object[0]);
        } else {
            String absolutePath = new File(SharePatchFileUtil.getPatchTempDirectory(this.f253289a), "temp.apk").getAbsolutePath();
            if (absolutePath == null || !new File(absolutePath).exists()) {
                ShareTinkerLog.m106533v("Tinker.TinkerPatchLoadReporter", "onPatchRetryLoad patch file: %s is not exist, just return", absolutePath);
            } else {
                new C79446a(this.f253289a, new C79453e(this), 6000);
            }
        }
        Log.m105919d("Tinker.TinkerPatchLoadReporter", "onLoadResult loadcode:%d icost:%d", Integer.valueOf(i), Long.valueOf(j));
        if (i == 0) {
            Log.m105925i("Tinker.TinkerPatchLoadReporter", "onLoadResult currentVersion:%s", C87821a.m109275c(this.f253289a).f254238k.f254252a);
        }
        C87821a c = C87821a.m109275c(this.f253289a);
        C87826d dVar = c.f254238k;
        if (dVar == null || (hashMap = dVar.f254263l) == null) {
            Log.m105924i("Tinker.TinkerPatchLoadReporter", "patchCheck properties is null.");
            return;
        }
        String str = BuildInfo.CLIENT_VERSION;
        String str2 = hashMap.get("patch.client.ver");
        String str3 = c.f254238k.f254263l.get(ShareConstants.NEW_TINKER_ID);
        if (i == 0) {
            i2 = 1;
        }
        C38431f.m41870a(str, str2, str3, 1, i2);
    }

    /* renamed from: c */
    public void mo109432c(File file, int i, boolean z) {
        String str;
        int i2 = i;
        ShareTinkerLog.m106533v("Tinker.TinkerPatchLoadReporter", "patch loadReporter onLoadFileNotFound: patch file not found: %s, fileType:%d, isDirectory:%b", file.getAbsolutePath(), Integer.valueOf(i), Boolean.valueOf(z));
        if (i2 == 4) {
            new C79446a(this.f253289a, new C79452d(this), 6000);
        } else {
            mo121822j();
        }
        if (i2 == 1 && (str = C87821a.m109275c(this.f253289a).f254238k.f254252a) != null && "00000000000000000000000000000000".equals(str)) {
            ShareTinkerLog.m106533v("Tinker.TinkerPatchLoadReporter", "Roll back patch when restarting main process, restart all other process also!", new Object[0]);
            ShareTinkerInternals.killAllOtherProcess(this.f253289a);
        }
        switch (i2) {
            case 1:
                C115669n.INSTANCE.idkeyStat(338, 166, 1, false);
                return;
            case 2:
                C115669n.INSTANCE.idkeyStat(338, 167, 1, false);
                return;
            case 3:
                C115669n.INSTANCE.idkeyStat(338, 164, 1, false);
                return;
            case 4:
                C115669n.INSTANCE.idkeyStat(338, 183, 1, false);
                return;
            case 5:
                C115669n.INSTANCE.idkeyStat(338, 165, 1, false);
                return;
            case 6:
                C115669n.INSTANCE.idkeyStat(338, 187, 1, false);
                return;
            default:
                return;
        }
    }

    /* renamed from: d */
    public void mo109433d(String str, String str2, File file) {
        super.mo109433d(str, str2, file);
        C115669n.INSTANCE.idkeyStat(338, 168, 1, false);
    }

    /* renamed from: e */
    public void mo109434e(String str, String str2, File file, String str3) {
        super.mo109434e(str, str2, file, str3);
        C115669n.INSTANCE.idkeyStat(338, 5, 1, false);
    }

    /* renamed from: f */
    public void mo109435f(int i, Throwable th) {
        ShareTinkerLog.m106533v("Tinker.TinkerPatchLoadReporter", "patch loadReporter onLoadInterpret: type: %d, throwable: %s", Integer.valueOf(i), th);
        if (i == 0) {
            ShareTinkerLog.m106533v("Tinker.TinkerPatchLoadReporter", "patch loadReporter onLoadInterpret ok", new Object[0]);
        } else if (i == 1) {
            ShareTinkerLog.m106533v("Tinker.TinkerPatchLoadReporter", "patch loadReporter onLoadInterpret fail, can get instruction set from existed oat file", new Object[0]);
        } else if (i == 2) {
            ShareTinkerLog.m106533v("Tinker.TinkerPatchLoadReporter", "patch loadReporter onLoadInterpret fail, command line to interpret return error", new Object[0]);
        }
        new C79446a(this.f253289a, new C79452d(this), 6000);
        if (i == 0) {
            C115669n.INSTANCE.idkeyStat(338, 193, 1, false);
        } else if (i == 1) {
            C115669n nVar = C115669n.INSTANCE;
            nVar.idkeyStat(338, 191, 1, false);
            nVar.mo160135k("Tinker", "Tinker Exception:interpret occur instruction exception " + MMUncaughtExceptionHandler.getExceptionCauseString(th), (Map<String, Object>) null);
        } else if (i == 2) {
            C115669n nVar2 = C115669n.INSTANCE;
            nVar2.idkeyStat(338, 192, 1, false);
            nVar2.mo160135k("Tinker", "Tinker Exception:interpret occur command exception " + MMUncaughtExceptionHandler.getExceptionCauseString(th), (Map<String, Object>) null);
        }
    }

    /* renamed from: g */
    public void mo109436g(File file, int i) {
        int i2 = i;
        super.mo109436g(file, i);
        if (i2 == 3) {
            C115669n.INSTANCE.idkeyStat(338, 162, 1, false);
        } else if (i2 == 5) {
            C115669n.INSTANCE.idkeyStat(338, 163, 1, false);
        } else if (i2 == 6) {
            C115669n.INSTANCE.idkeyStat(338, 185, 1, false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo109437h(java.lang.Throwable r21, int r22) {
        /*
            r20 = this;
            r0 = r22
            super.mo109437h(r21, r22)
            r1 = 1
            r2 = -4
            if (r0 == r2) goto L_0x00a3
            r3 = -3
            if (r0 == r3) goto L_0x007c
            r3 = -2
            if (r0 == r3) goto L_0x0022
            r1 = -1
            if (r0 == r1) goto L_0x0014
            goto L_0x00af
        L_0x0014:
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 338(0x152, double:1.67E-321)
            r6 = 160(0xa0, double:7.9E-322)
            r8 = 1
            r10 = 0
            r3.idkeyStat(r4, r6, r8, r10)
            goto L_0x00af
        L_0x0022:
            java.lang.String r3 = r21.getMessage()
            java.lang.String r4 = "checkDexInstall failed"
            boolean r3 = r3.contains(r4)
            java.lang.String r4 = "Tinker.HotPatchReportHelper"
            if (r3 == 0) goto L_0x0056
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 338(0x152, double:1.67E-321)
            r8 = 189(0xbd, double:9.34E-322)
            r10 = 1
            r12 = 0
            r5.idkeyStat(r6, r8, r10, r12)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "tinker dex check fail:"
            r3.append(r5)
            java.lang.String r5 = r21.getMessage()
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            goto L_0x00b0
        L_0x0056:
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 338(0x152, double:1.67E-321)
            r8 = 161(0xa1, double:7.95E-322)
            r10 = 1
            r12 = 0
            r5.idkeyStat(r6, r8, r10, r12)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "tinker dex reflect fail:"
            r1.append(r3)
            java.lang.String r3 = r21.getMessage()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
            goto L_0x00af
        L_0x007c:
            java.lang.String r3 = r21.getMessage()
            java.lang.String r4 = "checkResInstall failed"
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x0095
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r5 = 338(0x152, double:1.67E-321)
            r7 = 190(0xbe, double:9.4E-322)
            r9 = 1
            r11 = 0
            r4.idkeyStat(r5, r7, r9, r11)
            goto L_0x00b0
        L_0x0095:
            com.tencent.mm.plugin.report.service.n r12 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r13 = 338(0x152, double:1.67E-321)
            r15 = 184(0xb8, double:9.1E-322)
            r17 = 1
            r19 = 0
            r12.idkeyStat(r13, r15, r17, r19)
            goto L_0x00af
        L_0x00a3:
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 338(0x152, double:1.67E-321)
            r6 = 188(0xbc, double:9.3E-322)
            r8 = 1
            r10 = 0
            r3.idkeyStat(r4, r6, r8, r10)
        L_0x00af:
            r1 = 0
        L_0x00b0:
            if (r1 != 0) goto L_0x00f8
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.MMUncaughtExceptionHandler.getExceptionCauseString(r21)
            if (r0 != r2) goto L_0x00df
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r2 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.checkTinkerLastUncaughtCrash(r0)
            boolean r3 = com.tencent.tinker.loader.shareutil.ShareTinkerInternals.isNullOrNil(r2)
            if (r3 != 0) goto L_0x00df
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "tinker checkSafeModeCount fail:\n"
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.io.File r0 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchLastCrashFile(r0)
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.safeDeleteFile(r0)
        L_0x00df:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Tinker Exception:load tinker occur exception "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r2 = 0
            java.lang.String r3 = "Tinker"
            r0.mo160135k(r3, r1, r2)
        L_0x00f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a12.C79454f.mo109437h(java.lang.Throwable, int):void");
    }

    /* renamed from: i */
    public void mo109438i(File file, int i) {
        int i2 = i;
        super.mo109438i(file, i);
        if (i2 == -26 || i2 == -5) {
            ShareTinkerInternals.setTinkerDisableWithSharedPreferences(this.f253289a);
            C87821a.m109275c(this.f253289a).f254237j = 0;
        }
        Log.m105924i("Tinker.HotPatchReportHelper", "hp_report try to apply hotpatch fail");
        switch (i2) {
            case -26:
                C115669n.INSTANCE.idkeyStat(338, 83, 1, false);
                return;
            case -25:
                C115669n.INSTANCE.idkeyStat(338, 82, 1, false);
                return;
            case -24:
                C115669n.INSTANCE.idkeyStat(338, 81, 1, false);
                return;
            case -23:
                C115669n.INSTANCE.idkeyStat(338, 79, 1, false);
                return;
            case -22:
                C115669n.INSTANCE.idkeyStat(338, 80, 1, false);
                return;
            case -21:
                C115669n.INSTANCE.idkeyStat(338, 77, 1, false);
                return;
            case -20:
                C115669n.INSTANCE.idkeyStat(338, 76, 1, false);
                return;
            default:
                switch (i2) {
                    case -7:
                        C115669n.INSTANCE.idkeyStat(338, 84, 1, false);
                        return;
                    case -6:
                        C115669n.INSTANCE.idkeyStat(338, 78, 1, false);
                        return;
                    case -5:
                        C115669n.INSTANCE.idkeyStat(338, 85, 1, false);
                        return;
                    case -4:
                        C115669n.INSTANCE.idkeyStat(338, 74, 1, false);
                        return;
                    case -3:
                        C115669n.INSTANCE.idkeyStat(338, 73, 1, false);
                        return;
                    case -2:
                        C115669n.INSTANCE.idkeyStat(338, 75, 1, false);
                        return;
                    case -1:
                        C115669n.INSTANCE.idkeyStat(338, 72, 1, false);
                        return;
                    default:
                        return;
                }
        }
    }
}
