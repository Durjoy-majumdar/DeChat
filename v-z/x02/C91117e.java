package x02;

import android.text.TextUtils;
import b12.C79645d;
import com.tencent.p014mm.plugin.p064hp.util.TinkerSyncResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.internal.ConstValue;
import di3.C86312j;
import h81.C32735h;
import java.util.Map;
import org.json.JSONObject;
import qe3.C89625d;
import tw0.C90585h;
import yc3.C38992a;

/* renamed from: x02.e */
public class C91117e implements C38992a {

    /* renamed from: a */
    public static String f261309a = "000";

    /* renamed from: b */
    public static final String[] f261310b = {"clicfg_tinker_patch_pkg_update_params_0", "clicfg_tinker_patch_pkg_update_params_1", "clicfg_tinker_patch_pkg_update_params_2", "clicfg_tinker_patch_pkg_update_params_3", "clicfg_tinker_patch_pkg_update_params_4", "clicfg_tinker_patch_pkg_update_params_5", "clicfg_tinker_patch_pkg_update_params_6", "clicfg_tinker_patch_pkg_update_params_7", "clicfg_tinker_patch_pkg_update_params_8", "clicfg_tinker_patch_pkg_update_params_9", "clicfg_tinker_patch_pkg_update_params_10", "clicfg_tinker_patch_pkg_update_params_11", "clicfg_tinker_patch_pkg_update_params_12", "clicfg_tinker_patch_pkg_update_params_13", "clicfg_tinker_patch_pkg_update_params_14", "clicfg_tinker_patch_pkg_update_params_15"};

    /* renamed from: c */
    public static final String[] f261311c = {"clicfg_mmdiff_patch_pkg_update_params", "clicfg_mmdiff_patch_pkg_update_params_0", "clicfg_mmdiff_patch_pkg_update_params_1", "clicfg_mmdiff_patch_pkg_update_params_2", "clicfg_mmdiff_patch_pkg_update_params_3", "clicfg_mmdiff_patch_pkg_update_params_4", "clicfg_mmdiff_patch_pkg_update_params_5", "clicfg_mmdiff_patch_pkg_update_params_6", "clicfg_mmdiff_patch_pkg_update_params_7", "clicfg_mmdiff_patch_pkg_update_params_8", "clicfg_mmdiff_patch_pkg_update_params_9", "clicfg_mmdiff_patch_pkg_update_params_10", "clicfg_mmdiff_patch_pkg_update_params_11", "clicfg_mmdiff_patch_pkg_update_params_12", "clicfg_mmdiff_patch_pkg_update_params_13", "clicfg_mmdiff_patch_pkg_update_params_14", "clicfg_mmdiff_patch_pkg_update_params_15"};

    /* renamed from: b */
    public static boolean m114297b(C90585h hVar) {
        if (hVar == null || !hVar.mo118342a() || !hVar.mo118345d() || hVar.mo118343b() || hVar.mo118348f()) {
            Log.m105925i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "checkTinkerSyncResponseVaild, no, response = %s", hVar);
            return false;
        }
        Log.m105925i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "checkTinkerSyncResponseVaild, yes, response = %s", hVar);
        return true;
    }

    /* renamed from: c */
    public static void m114298c(TinkerSyncResponse tinkerSyncResponse) {
        if (tinkerSyncResponse != null) {
            Map<String, String> map = C79645d.f233530a;
            boolean z = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_upgrade_force_user_boot_md5_update, 1) == 1;
            Log.m105925i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "isForceUserBootMd5 = %s.", Boolean.valueOf(z));
            if (!z && tinkerSyncResponse.mo118353j() == 4) {
                if (!Util.isNullOrNil(tinkerSyncResponse.f248343i)) {
                    if (tinkerSyncResponse.f248343i.length() > 8) {
                        String str = tinkerSyncResponse.f248343i;
                        String substring = str.substring(str.length() - 8, tinkerSyncResponse.f248343i.length());
                        if (!Util.isNullOrNil(substring)) {
                            f261309a = substring;
                        }
                    } else {
                        String str2 = tinkerSyncResponse.f248343i;
                        if (!Util.isNullOrNil(str2)) {
                            f261309a = str2;
                        }
                    }
                }
                Log.m105924i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "before commandNewApkMd5HardCode, response.newApkMd5 = " + tinkerSyncResponse.f248346o + ", response.oldApkMd5 = " + tinkerSyncResponse.f248347p + ", stack: " + Util.getStack() + ", NEW_APK_MD5_SUFFIX = " + f261309a + ", response.fileMd5 = " + tinkerSyncResponse.f248343i);
                String g = C79645d.m96731g(C79645d.m96733i(MMApplicationContext.getContext()));
                StringBuilder sb = new StringBuilder();
                sb.append(g);
                sb.append(f261309a);
                tinkerSyncResponse.f248346o = sb.toString();
                tinkerSyncResponse.f248347p = g;
                Log.m105924i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "after commandNewApkMd5HardCode, response.newApkMd5 = " + tinkerSyncResponse.f248346o + ", response.oldApkMd5 = " + tinkerSyncResponse.f248347p);
            }
        }
    }

    /* renamed from: d */
    public static int m114299d(JSONObject jSONObject) {
        if (jSONObject == null) {
            return 0;
        }
        try {
            String optString = jSONObject.optString(ConstValue.INIT_CONFIG_KEY_CLIENT_VERSION, "");
            if (!Util.isNullOrNil(optString)) {
                return Integer.parseInt(optString.substring(2), 16);
            }
            return 0;
        } catch (Exception unused) {
            Log.m105921e("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "getJsonClientVersion, targetTinkerJson = %s", jSONObject);
            return 0;
        }
    }

    /* renamed from: e */
    public static int m114300e() {
        int i;
        if (C89625d.f257843i) {
            Log.m105925i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "is GP version: %s", Integer.valueOf(C89625d.f257841g));
            return 0;
        }
        try {
            String Y60 = ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_full_pkg_update_default_params, "");
            if (Util.isNullOrNil(Y60)) {
                Log.m105924i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "tabConfig = null.");
                return 0;
            }
            JSONObject jSONObject = new JSONObject(Y60);
            int parseInt = Integer.parseInt(jSONObject.getString("minBaseApk").substring(2), 16);
            try {
                int i2 = C89625d.f257841g;
                String string = jSONObject.getString("updateWebviewUrl");
                Log.m105925i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "minBaseApk = %s, updateWebviewUrl = %s.", Integer.valueOf(parseInt), string);
                if (parseInt <= i2 || Util.isNullOrNil(string)) {
                    return 0;
                }
                return parseInt;
            } catch (Exception e) {
                Exception exc = e;
                i = parseInt;
                e = exc;
                Log.m105929w("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "parse tabconfig failed: %s", e.getMessage());
                return i;
            }
        } catch (Exception e2) {
            e = e2;
            i = 0;
            Log.m105929w("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "parse tabconfig failed: %s", e.getMessage());
            return i;
        }
    }

    /* renamed from: f */
    public static JSONObject m114301f(String str) {
        JSONObject jSONObject;
        Exception e;
        JSONObject jSONObject2;
        Exception e2;
        Class cls = C32735h.class;
        JSONObject jSONObject3 = null;
        JSONObject jSONObject4 = null;
        int i = 0;
        while (true) {
            String[] strArr = f261311c;
            if (i >= 17) {
                break;
            }
            try {
                String F5 = ((C32735h) C86312j.m106911c(cls)).mo58776F5(strArr[i], "");
                if (!TextUtils.isEmpty(F5)) {
                    Log.m105925i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "tabConfigMMDIFF = %s", F5);
                    jSONObject2 = new JSONObject(F5);
                    if (str.equals(jSONObject2.getString("oldApkMd5"))) {
                        try {
                            Log.m105924i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "mmdiff use this json");
                            jSONObject4 = jSONObject2;
                            break;
                        } catch (Exception e3) {
                            e2 = e3;
                        }
                    } else {
                        continue;
                    }
                }
            } catch (Exception e4) {
                jSONObject2 = jSONObject4;
                e2 = e4;
                Log.m105921e("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "getXpatchTargetJson, get mmdif json, e = %s", e2);
                jSONObject4 = jSONObject2;
                i++;
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            String[] strArr2 = f261310b;
            if (i2 >= 16) {
                break;
            }
            try {
                String F52 = ((C32735h) C86312j.m106911c(cls)).mo58776F5(strArr2[i2], "");
                if (!TextUtils.isEmpty(F52)) {
                    Log.m105925i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "tabConfigTinker = %s", F52);
                    jSONObject = new JSONObject(F52);
                    if (str.equals(jSONObject.getString("oldApkMd5"))) {
                        try {
                            Log.m105924i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "tinker use this json");
                            jSONObject3 = jSONObject;
                            break;
                        } catch (Exception e5) {
                            e = e5;
                        }
                    } else {
                        continue;
                    }
                }
            } catch (Exception e6) {
                jSONObject = jSONObject3;
                e = e6;
                Log.m105921e("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "getXpatchTargetJson, get tinker json, e = %s", e);
                jSONObject3 = jSONObject;
                i2++;
            }
            i2++;
        }
        if (m114299d(jSONObject3) >= m114299d(jSONObject4)) {
            jSONObject4 = jSONObject3;
        }
        Log.m105925i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "getXpatchTargetJson, final targetJson = %s", jSONObject4);
        return jSONObject4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0133 A[RETURN] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.tencent.p014mm.plugin.p064hp.util.TinkerSyncResponse m114302g() {
        /*
            java.lang.String r0 = "isShowDialog"
            java.lang.String r1 = "isShowRedot"
            java.lang.String r2 = "isShowNotification"
            java.lang.String r3 = "packageType"
            java.lang.String r4 = "clientVersion"
            java.lang.String r5 = "MicroMsg.Tinker.HdiffBootsCommand.HdiffApk"
            boolean r6 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            r7 = 0
            r8 = 1
            if (r6 != 0) goto L_0x0031
            boolean r6 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
            if (r6 != 0) goto L_0x0025
            boolean r6 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r6 != 0) goto L_0x0025
            int r6 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION_INT
            r9 = 788529167(0x2f00000f, float:1.1641553E-10)
            if (r6 != r9) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r6 = 0
            goto L_0x0026
        L_0x0025:
            r6 = 1
        L_0x0026:
            if (r6 != 0) goto L_0x0031
            boolean r6 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            if (r6 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r6 = 0
            goto L_0x0032
        L_0x0031:
            r6 = 1
        L_0x0032:
            r9 = 0
            if (r6 == 0) goto L_0x0133
            bp3.p r6 = bp3.C79758p.f233760a
            bp3.f r10 = bp3.C104160f.RepairerConfig_Updater_MMdiffCgi_String
            java.lang.String r11 = ""
            java.lang.String r6 = r6.mo109884g(r10, r11)
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r10 == 0) goto L_0x0046
            return r9
        L_0x0046:
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ Exception -> 0x011c }
            r10.<init>(r6)     // Catch:{ Exception -> 0x011c }
            r10.getString(r4)     // Catch:{ Exception -> 0x011c }
            te3.u93 r11 = new te3.u93     // Catch:{ Exception -> 0x011c }
            r11.<init>()     // Catch:{ Exception -> 0x011c }
            te3.yt3 r12 = new te3.yt3     // Catch:{ Exception -> 0x011c }
            r12.<init>()     // Catch:{ Exception -> 0x011c }
            r11.f259857i = r12     // Catch:{ Exception -> 0x011c }
            r12 = 2
            r11.f259853e = r12     // Catch:{ Exception -> 0x011c }
            r11.f259856h = r8     // Catch:{ Exception -> 0x011c }
            r12 = 4
            int r13 = r10.optInt(r3, r12)     // Catch:{ Exception -> 0x011c }
            r11.f259855g = r13     // Catch:{ Exception -> 0x011c }
            java.lang.String r13 = "patchId"
            java.lang.String r13 = r10.getString(r13)     // Catch:{ Exception -> 0x011c }
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)     // Catch:{ Exception -> 0x011c }
            if (r14 != 0) goto L_0x0076
            r11.f259852d = r13     // Catch:{ Exception -> 0x011c }
            goto L_0x007b
        L_0x0076:
            java.lang.String r13 = "hardcode patchid, patchid can not null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r13)     // Catch:{ Exception -> 0x011c }
        L_0x007b:
            te3.yt3 r13 = r11.f259857i     // Catch:{ Exception -> 0x011c }
            java.lang.String r14 = "fileSize"
            int r14 = r10.getInt(r14)     // Catch:{ Exception -> 0x011c }
            r13.f259950n = r14     // Catch:{ Exception -> 0x011c }
            te3.yt3 r13 = r11.f259857i     // Catch:{ Exception -> 0x011c }
            java.lang.String r14 = "cdnUrl"
            java.lang.String r14 = r10.getString(r14)     // Catch:{ Exception -> 0x011c }
            r13.f259945f = r14     // Catch:{ Exception -> 0x011c }
            te3.yt3 r13 = r11.f259857i     // Catch:{ Exception -> 0x011c }
            java.lang.String r14 = "fileMd5"
            java.lang.String r14 = r10.getString(r14)     // Catch:{ Exception -> 0x011c }
            r13.f259943d = r14     // Catch:{ Exception -> 0x011c }
            boolean r13 = r6.contains(r2)     // Catch:{ Exception -> 0x011c }
            if (r13 == 0) goto L_0x00a5
            int r2 = r10.optInt(r2, r8)     // Catch:{ Exception -> 0x011c }
            if (r2 != r8) goto L_0x00a7
        L_0x00a5:
            r2 = 1
            goto L_0x00a8
        L_0x00a7:
            r2 = 0
        L_0x00a8:
            boolean r13 = r6.contains(r1)     // Catch:{ Exception -> 0x011c }
            if (r13 == 0) goto L_0x00b4
            int r1 = r10.optInt(r1, r8)     // Catch:{ Exception -> 0x011c }
            if (r1 != r8) goto L_0x00b6
        L_0x00b4:
            r1 = 1
            goto L_0x00b7
        L_0x00b6:
            r1 = 0
        L_0x00b7:
            boolean r6 = r6.contains(r0)     // Catch:{ Exception -> 0x011c }
            if (r6 == 0) goto L_0x00c4
            int r0 = r10.optInt(r0, r7)     // Catch:{ Exception -> 0x011c }
            if (r0 != r8) goto L_0x00c4
            r7 = 1
        L_0x00c4:
            com.tencent.mm.plugin.hp.util.TinkerSyncResponse r0 = new com.tencent.mm.plugin.hp.util.TinkerSyncResponse     // Catch:{ Exception -> 0x011c }
            r0.<init>((te3.C90441u93) r11)     // Catch:{ Exception -> 0x011c }
            java.lang.String r4 = r10.getString(r4)     // Catch:{ Exception -> 0x0118 }
            r0.f248349r = r4     // Catch:{ Exception -> 0x0118 }
            int r3 = r10.optInt(r3, r12)     // Catch:{ Exception -> 0x0118 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0118 }
            r0.f248340f = r3     // Catch:{ Exception -> 0x0118 }
            r0.f248355x = r2     // Catch:{ Exception -> 0x0118 }
            r0.f248356y = r1     // Catch:{ Exception -> 0x0118 }
            r0.f248357z = r7     // Catch:{ Exception -> 0x0118 }
            java.lang.String r1 = "showDialogIntervalTime"
            r2 = 6
            int r1 = r10.optInt(r1, r2)     // Catch:{ Exception -> 0x0118 }
            r0.f248336B = r1     // Catch:{ Exception -> 0x0118 }
            java.lang.String r1 = "showDialogMaxTimes"
            r2 = 3
            int r1 = r10.optInt(r1, r2)     // Catch:{ Exception -> 0x0118 }
            r0.f248337C = r1     // Catch:{ Exception -> 0x0118 }
            java.lang.String r1 = "newApkMd5"
            java.lang.String r1 = r10.getString(r1)     // Catch:{ Exception -> 0x0118 }
            r0.f248346o = r1     // Catch:{ Exception -> 0x0118 }
            java.lang.String r1 = "oldApkMd5"
            java.lang.String r1 = r10.getString(r1)     // Catch:{ Exception -> 0x0118 }
            r0.f248347p = r1     // Catch:{ Exception -> 0x0118 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0118 }
            r1.<init>()     // Catch:{ Exception -> 0x0118 }
            java.lang.String r2 = "hardcode，respone = %s"
            r1.append(r2)     // Catch:{ Exception -> 0x0118 }
            r1.append(r0)     // Catch:{ Exception -> 0x0118 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0118 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)     // Catch:{ Exception -> 0x0118 }
            goto L_0x0132
        L_0x0118:
            r1 = move-exception
            r9 = r0
            r0 = r1
            goto L_0x011d
        L_0x011c:
            r0 = move-exception
        L_0x011d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "hardCodeMMdiffResponeForTest e = "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            r0 = r9
        L_0x0132:
            return r0
        L_0x0133:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: x02.C91117e.m114302g():com.tencent.mm.plugin.hp.util.TinkerSyncResponse");
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x026d A[Catch:{ Exception -> 0x02f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02e9  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static tw0.C90585h m114303h(tw0.C90585h r27, boolean r28) {
        /*
            r0 = r27
            r1 = r28
            java.lang.Class<h81.h> r2 = h81.C32735h.class
            java.lang.String r3 = "oldApkMd5"
            java.lang.String r4 = "fileSize"
            java.lang.String r5 = "fileMd5"
            java.lang.String r6 = "cdnUrl"
            java.lang.String r7 = "clientVersion"
            java.lang.String r8 = "packageType"
            java.util.Map<java.lang.String, java.lang.String> r9 = b12.C79645d.f233530a
            di3.d r9 = di3.C86312j.m106911c(r2)
            h81.h r9 = (h81.C32735h) r9
            h81.h$c r10 = h81.C32735h.C32737c.clicfg_upgrade_force_stop_xpatch_all_update
            r11 = 0
            int r9 = r9.mo58779Qe(r10, r11)
            r10 = 1
            if (r9 != r10) goto L_0x0027
            r9 = 1
            goto L_0x0028
        L_0x0027:
            r9 = 0
        L_0x0028:
            java.lang.String r12 = "MicroMsg.Tinker.HdiffBootsCommand.HdiffApk"
            r13 = 0
            if (r9 == 0) goto L_0x0033
            java.lang.String r0 = "hardCodeXkeyMMdiffResponeForReddot, isForceStopTinkerXpatchAllMerge."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            return r13
        L_0x0033:
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x032c }
            java.lang.String r9 = b12.C79645d.m96733i(r9)     // Catch:{ Exception -> 0x032c }
            java.lang.String r14 = b12.C79645d.m96731g(r9)     // Catch:{ Exception -> 0x032c }
            java.lang.String r15 = "hardCodeXkeyMMdiffResponeForReddot, baseApkMD5 = %s, baseApkPath = %s."
            r13 = 2
            java.lang.Object[] r10 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x032c }
            r10[r11] = r14     // Catch:{ Exception -> 0x032c }
            r16 = 1
            r10[r16] = r9     // Catch:{ Exception -> 0x032c }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r15, r10)     // Catch:{ Exception -> 0x032c }
            org.json.JSONObject r9 = m114301f(r14)     // Catch:{ Exception -> 0x032c }
            if (r9 != 0) goto L_0x005a
            java.lang.String r0 = "hardCodeXkeyMMdiffResponeForReddot, json is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)     // Catch:{ Exception -> 0x032c }
            r1 = 0
            return r1
        L_0x005a:
            int r10 = r9.getInt(r8)     // Catch:{ Exception -> 0x030b }
            di3.d r15 = di3.C86312j.m106911c(r2)     // Catch:{ Exception -> 0x032c }
            h81.h r15 = (h81.C32735h) r15     // Catch:{ Exception -> 0x032c }
            h81.h$c r13 = h81.C32735h.C32737c.clicfg_upgrade_force_stop_tinker_xpatch_auto_update     // Catch:{ Exception -> 0x032c }
            int r13 = r15.mo58779Qe(r13, r11)     // Catch:{ Exception -> 0x032c }
            r15 = 1
            if (r13 != r15) goto L_0x006f
            r13 = 1
            goto L_0x0070
        L_0x006f:
            r13 = 0
        L_0x0070:
            java.lang.String r15 = "isForceStopTinkerXpatchAutoMerge = %s, isAuto = %s, packageType = %s."
            r11 = 3
            r19 = r8
            java.lang.Object[] r8 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x032c }
            java.lang.Boolean r20 = java.lang.Boolean.valueOf(r13)     // Catch:{ Exception -> 0x032c }
            r18 = 0
            r8[r18] = r20     // Catch:{ Exception -> 0x032c }
            java.lang.Boolean r20 = java.lang.Boolean.valueOf(r28)     // Catch:{ Exception -> 0x032c }
            r16 = 1
            r8[r16] = r20     // Catch:{ Exception -> 0x032c }
            java.lang.Integer r20 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x032c }
            r11 = 2
            r8[r11] = r20     // Catch:{ Exception -> 0x032c }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r15, r8)     // Catch:{ Exception -> 0x032c }
            java.lang.String r8 = "isForceStopTinkerXpatchMaunalMerge false."
            if (r1 == 0) goto L_0x009e
            if (r10 != r11) goto L_0x009e
            if (r13 == 0) goto L_0x009e
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r8)     // Catch:{ Exception -> 0x032c }
            r1 = 0
            return r1
        L_0x009e:
            di3.d r11 = di3.C86312j.m106911c(r2)     // Catch:{ Exception -> 0x032c }
            h81.h r11 = (h81.C32735h) r11     // Catch:{ Exception -> 0x032c }
            h81.h$c r13 = h81.C32735h.C32737c.clicfg_upgrade_force_stop_tinker_xpatch_maunal_update     // Catch:{ Exception -> 0x032c }
            r15 = 0
            int r11 = r11.mo58779Qe(r13, r15)     // Catch:{ Exception -> 0x032c }
            r15 = 1
            if (r11 != r15) goto L_0x00b0
            r11 = 1
            goto L_0x00b1
        L_0x00b0:
            r11 = 0
        L_0x00b1:
            java.lang.String r15 = "isForceStopTinkerXpatchMaunalMerge = %s, isAuto = %s, packageType = %s."
            r20 = r14
            r0 = 3
            java.lang.Object[] r14 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x032c }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)     // Catch:{ Exception -> 0x032c }
            r11 = 0
            r14[r11] = r0     // Catch:{ Exception -> 0x032c }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r28)     // Catch:{ Exception -> 0x032c }
            r11 = 1
            r14[r11] = r0     // Catch:{ Exception -> 0x032c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x032c }
            r11 = 2
            r14[r11] = r0     // Catch:{ Exception -> 0x032c }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r15, r14)     // Catch:{ Exception -> 0x032c }
            if (r1 != 0) goto L_0x00ec
            if (r10 != r11) goto L_0x00ec
            di3.d r0 = di3.C86312j.m106911c(r2)     // Catch:{ Exception -> 0x032c }
            h81.h r0 = (h81.C32735h) r0     // Catch:{ Exception -> 0x032c }
            r11 = 0
            int r0 = r0.mo58779Qe(r13, r11)     // Catch:{ Exception -> 0x032c }
            r11 = 1
            if (r0 != r11) goto L_0x00e4
            r0 = 1
            goto L_0x00e5
        L_0x00e4:
            r0 = 0
        L_0x00e5:
            if (r0 == 0) goto L_0x00ec
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r8)     // Catch:{ Exception -> 0x032c }
            r1 = 0
            return r1
        L_0x00ec:
            if (r1 == 0) goto L_0x00ff
            java.lang.String r0 = "isAutoPatchUpdateEnable"
            r8 = 0
            int r0 = r9.optInt(r0, r8)     // Catch:{ Exception -> 0x032c }
            r8 = 1
            if (r0 == r8) goto L_0x00ff
            java.lang.String r0 = "isAutoPatchUpdateEnable false."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)     // Catch:{ Exception -> 0x032c }
            r1 = 0
            return r1
        L_0x00ff:
            java.lang.String r0 = r9.getString(r7)     // Catch:{ Exception -> 0x032c }
            java.lang.String r8 = r9.getString(r6)     // Catch:{ Exception -> 0x032c }
            java.lang.String r11 = r9.getString(r5)     // Catch:{ Exception -> 0x032c }
            int r13 = r9.getInt(r4)     // Catch:{ Exception -> 0x032c }
            java.lang.String r14 = r9.getString(r3)     // Catch:{ Exception -> 0x032c }
            java.lang.String r15 = "hardCodeXkeyMMdiffResponeForReddot，x patch reddot, clientVersion = %s, cdnUrl = %s, fileMd5 = %s, fileSize = %s, oldApkMd5 = %s, baseApkMD5 = %s, baseApkMD5.equals(oldApkMd5)? = %s, BuildInfo.CLIENT_VERSION = %s"
            r22 = r3
            r3 = 8
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x032c }
            r18 = 0
            r3[r18] = r0     // Catch:{ Exception -> 0x032c }
            r16 = 1
            r3[r16] = r8     // Catch:{ Exception -> 0x032c }
            r17 = 2
            r3[r17] = r11     // Catch:{ Exception -> 0x032c }
            java.lang.Integer r23 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x032c }
            r21 = 3
            r3[r21] = r23     // Catch:{ Exception -> 0x032c }
            r23 = r5
            r5 = 4
            r3[r5] = r14     // Catch:{ Exception -> 0x032c }
            r24 = 5
            r3[r24] = r20     // Catch:{ Exception -> 0x032c }
            r5 = r20
            boolean r20 = r5.equals(r14)     // Catch:{ Exception -> 0x032c }
            java.lang.Boolean r20 = java.lang.Boolean.valueOf(r20)     // Catch:{ Exception -> 0x032c }
            r25 = r6
            r6 = 6
            r3[r6] = r20     // Catch:{ Exception -> 0x032c }
            r20 = 7
            java.lang.String r26 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION     // Catch:{ Exception -> 0x032c }
            r3[r20] = r26     // Catch:{ Exception -> 0x032c }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r15, r3)     // Catch:{ Exception -> 0x032c }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x032c }
            if (r3 != 0) goto L_0x0309
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)     // Catch:{ Exception -> 0x032c }
            if (r3 != 0) goto L_0x0309
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)     // Catch:{ Exception -> 0x032c }
            if (r3 != 0) goto L_0x0309
            if (r13 == 0) goto L_0x0309
            boolean r3 = r5.equals(r14)     // Catch:{ Exception -> 0x032c }
            if (r3 != 0) goto L_0x016c
            goto L_0x0309
        L_0x016c:
            int r3 = m114300e()     // Catch:{ Exception -> 0x032c }
            r5 = 2
            java.lang.String r8 = r0.substring(r5)     // Catch:{ Exception -> 0x032c }
            r5 = 16
            int r5 = java.lang.Integer.parseInt(r8, r5)     // Catch:{ Exception -> 0x032c }
            int r8 = qe3.C89625d.f257841g     // Catch:{ Exception -> 0x032c }
            r11 = r27
            boolean r13 = r11 instanceof com.tencent.p014mm.plugin.p064hp.util.TinkerSyncResponse     // Catch:{ Exception -> 0x032c }
            if (r13 == 0) goto L_0x01a1
            r13 = r11
            com.tencent.mm.plugin.hp.util.TinkerSyncResponse r13 = (com.tencent.p014mm.plugin.p064hp.util.TinkerSyncResponse) r13     // Catch:{ Exception -> 0x018d }
            java.lang.String r13 = r13.f248349r     // Catch:{ Exception -> 0x018d }
            int r13 = b12.C79645d.m96741q(r13)     // Catch:{ Exception -> 0x018d }
            goto L_0x018e
        L_0x018d:
            r13 = 0
        L_0x018e:
            java.lang.String r14 = "hardCodeXkeyMMdiffResponeForReddot x patch redot, currentResponse.clientVersion = %s, xkey clientVersion = %s."
            r15 = 2
            java.lang.Object[] r6 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x032c }
            com.tencent.mm.plugin.hp.util.TinkerSyncResponse r11 = (com.tencent.p014mm.plugin.p064hp.util.TinkerSyncResponse) r11     // Catch:{ Exception -> 0x032c }
            java.lang.String r11 = r11.f248349r     // Catch:{ Exception -> 0x032c }
            r15 = 0
            r6[r15] = r11     // Catch:{ Exception -> 0x032c }
            r11 = 1
            r6[r11] = r0     // Catch:{ Exception -> 0x032c }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r14, r6)     // Catch:{ Exception -> 0x032c }
            goto L_0x01a2
        L_0x01a1:
            r13 = 0
        L_0x01a2:
            di3.d r0 = di3.C86312j.m106911c(r2)     // Catch:{ Exception -> 0x032c }
            h81.h r0 = (h81.C32735h) r0     // Catch:{ Exception -> 0x032c }
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_upgrade_force_tinker_xpatch_importantest     // Catch:{ Exception -> 0x032c }
            r6 = 0
            int r0 = r0.mo58779Qe(r2, r6)     // Catch:{ Exception -> 0x032c }
            r2 = 1
            if (r0 != r2) goto L_0x01b4
            r0 = 1
            goto L_0x01b5
        L_0x01b4:
            r0 = 0
        L_0x01b5:
            java.lang.String r2 = "hardCodeXkeyMMdiffResponeForReddot x patch redot, xKeyTargetApk = %s, mmdiffTargetVersion = %s, currentApkClientVersionCode = %s, tinkerPatchVersion = %s."
            r6 = 4
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x032c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x032c }
            r14 = 0
            r11[r14] = r6     // Catch:{ Exception -> 0x032c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x032c }
            r14 = 1
            r11[r14] = r6     // Catch:{ Exception -> 0x032c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x032c }
            r14 = 2
            r11[r14] = r6     // Catch:{ Exception -> 0x032c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x032c }
            r14 = 3
            r11[r14] = r6     // Catch:{ Exception -> 0x032c }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r2, r11)     // Catch:{ Exception -> 0x032c }
            java.lang.String r2 = "less than versioncode， mmdiffTargetVersion <= currentApkClientVersionCode = %s, less than x redot， mmdiffTargetVersion < xKeyTargetApk  = %s, less than boot config，mmdiffTargetVersion <= tinkerPatchVersion = %s."
            java.lang.Object[] r6 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x032c }
            if (r5 > r8) goto L_0x01e1
            r11 = 1
            goto L_0x01e2
        L_0x01e1:
            r11 = 0
        L_0x01e2:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch:{ Exception -> 0x032c }
            r14 = 0
            r6[r14] = r11     // Catch:{ Exception -> 0x032c }
            if (r5 >= r3) goto L_0x01ed
            r11 = 1
            goto L_0x01ee
        L_0x01ed:
            r11 = 0
        L_0x01ee:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch:{ Exception -> 0x032c }
            r14 = 1
            r6[r14] = r11     // Catch:{ Exception -> 0x032c }
            if (r5 > r13) goto L_0x01f9
            r11 = 1
            goto L_0x01fa
        L_0x01f9:
            r11 = 0
        L_0x01fa:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch:{ Exception -> 0x032c }
            r14 = 2
            r6[r14] = r11     // Catch:{ Exception -> 0x032c }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r2, r6)     // Catch:{ Exception -> 0x032c }
            if (r5 <= r8) goto L_0x020a
            if (r1 != 0) goto L_0x021a
            if (r5 >= r3) goto L_0x021a
        L_0x020a:
            java.lang.String r2 = "use x patch to be repsone."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r2)     // Catch:{ Exception -> 0x032c }
            r2 = 2
            if (r10 != r2) goto L_0x0216
            if (r0 == 0) goto L_0x0216
            goto L_0x021a
        L_0x0216:
            if (r5 > r13) goto L_0x021a
            r2 = 0
            return r2
        L_0x021a:
            r0 = 4
            if (r10 != r0) goto L_0x023f
            java.lang.String r0 = "isShowNotification"
            r2 = 1
            int r0 = r9.optInt(r0, r2)     // Catch:{ Exception -> 0x032c }
            if (r0 != r2) goto L_0x0228
            r0 = 1
            goto L_0x0229
        L_0x0228:
            r0 = 0
        L_0x0229:
            java.lang.String r3 = "isShowRedot"
            int r3 = r9.optInt(r3, r2)     // Catch:{ Exception -> 0x032c }
            if (r3 != r2) goto L_0x0233
            r3 = 1
            goto L_0x0234
        L_0x0233:
            r3 = 0
        L_0x0234:
            java.lang.String r5 = "isShowDialog"
            r6 = 0
            int r5 = r9.optInt(r5, r6)     // Catch:{ Exception -> 0x032c }
            if (r5 != r2) goto L_0x0241
            r11 = 1
            goto L_0x0242
        L_0x023f:
            r0 = 1
            r3 = 1
        L_0x0241:
            r11 = 0
        L_0x0242:
            r9.getString(r7)     // Catch:{ Exception -> 0x02f1 }
            te3.u93 r2 = new te3.u93     // Catch:{ Exception -> 0x02f1 }
            r2.<init>()     // Catch:{ Exception -> 0x02f1 }
            te3.yt3 r5 = new te3.yt3     // Catch:{ Exception -> 0x02f1 }
            r5.<init>()     // Catch:{ Exception -> 0x02f1 }
            r2.f259857i = r5     // Catch:{ Exception -> 0x02f1 }
            r5 = 2
            r2.f259853e = r5     // Catch:{ Exception -> 0x02f1 }
            r5 = 1
            r2.f259856h = r5     // Catch:{ Exception -> 0x02f1 }
            r5 = r19
            r6 = 4
            int r8 = r9.optInt(r5, r6)     // Catch:{ Exception -> 0x02f1 }
            r2.f259855g = r8     // Catch:{ Exception -> 0x02f1 }
            java.lang.String r6 = "patchId"
            java.lang.String r6 = r9.getString(r6)     // Catch:{ Exception -> 0x02f1 }
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)     // Catch:{ Exception -> 0x02f1 }
            if (r8 != 0) goto L_0x02e9
            r2.f259852d = r6     // Catch:{ Exception -> 0x02f1 }
            te3.yt3 r6 = r2.f259857i     // Catch:{ Exception -> 0x02f1 }
            int r4 = r9.getInt(r4)     // Catch:{ Exception -> 0x02f1 }
            r6.f259950n = r4     // Catch:{ Exception -> 0x02f1 }
            te3.yt3 r4 = r2.f259857i     // Catch:{ Exception -> 0x02f1 }
            r6 = r25
            java.lang.String r6 = r9.getString(r6)     // Catch:{ Exception -> 0x02f1 }
            r4.f259945f = r6     // Catch:{ Exception -> 0x02f1 }
            te3.yt3 r4 = r2.f259857i     // Catch:{ Exception -> 0x02f1 }
            r6 = r23
            java.lang.String r6 = r9.getString(r6)     // Catch:{ Exception -> 0x02f1 }
            r4.f259943d = r6     // Catch:{ Exception -> 0x02f1 }
            com.tencent.mm.plugin.hp.util.TinkerSyncResponse r4 = new com.tencent.mm.plugin.hp.util.TinkerSyncResponse     // Catch:{ Exception -> 0x02f1 }
            r4.<init>((te3.C90441u93) r2)     // Catch:{ Exception -> 0x02f1 }
            java.lang.String r2 = r9.getString(r7)     // Catch:{ Exception -> 0x02e6 }
            r4.f248349r = r2     // Catch:{ Exception -> 0x02e6 }
            r2 = -1
            int r2 = r9.optInt(r5, r2)     // Catch:{ Exception -> 0x02e6 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x02e6 }
            r4.f248340f = r2     // Catch:{ Exception -> 0x02e6 }
            java.lang.String r2 = "newApkMd5"
            java.lang.String r2 = r9.getString(r2)     // Catch:{ Exception -> 0x02e6 }
            r4.f248346o = r2     // Catch:{ Exception -> 0x02e6 }
            r2 = r22
            java.lang.String r2 = r9.getString(r2)     // Catch:{ Exception -> 0x02e6 }
            r4.f248347p = r2     // Catch:{ Exception -> 0x02e6 }
            r4.f248353v = r1     // Catch:{ Exception -> 0x02e6 }
            r4.f248355x = r0     // Catch:{ Exception -> 0x02e6 }
            r4.f248356y = r3     // Catch:{ Exception -> 0x02e6 }
            r4.f248357z = r11     // Catch:{ Exception -> 0x02e6 }
            r0 = 4
            if (r10 != r0) goto L_0x02d0
            java.lang.String r0 = "showDialogIntervalTime"
            r1 = 6
            int r0 = r9.optInt(r0, r1)     // Catch:{ Exception -> 0x02e6 }
            r4.f248336B = r0     // Catch:{ Exception -> 0x02e6 }
            java.lang.String r0 = "showDialogMaxTimes"
            r1 = 1
            int r0 = r9.optInt(r0, r1)     // Catch:{ Exception -> 0x02e6 }
            r4.f248337C = r0     // Catch:{ Exception -> 0x02e6 }
        L_0x02d0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02e6 }
            r0.<init>()     // Catch:{ Exception -> 0x02e6 }
            java.lang.String r1 = "use x patch to be respone = %s"
            r0.append(r1)     // Catch:{ Exception -> 0x02e6 }
            r0.append(r4)     // Catch:{ Exception -> 0x02e6 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02e6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)     // Catch:{ Exception -> 0x02e6 }
            goto L_0x0308
        L_0x02e6:
            r0 = move-exception
            r13 = r4
            goto L_0x02f3
        L_0x02e9:
            java.lang.String r0 = "x key patch patchid， patchid can not null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)     // Catch:{ Exception -> 0x02f1 }
            r1 = 0
            return r1
        L_0x02f1:
            r0 = move-exception
            r13 = 0
        L_0x02f3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "hardCodeXkeyMMdiffResponeForReddot，x patch redot, e = "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            r4 = r13
        L_0x0308:
            return r4
        L_0x0309:
            r1 = 0
            return r1
        L_0x030b:
            r0 = move-exception
            r1 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x032c }
            r0.<init>()     // Catch:{ Exception -> 0x032c }
            java.lang.String r2 = "e = "
            r0.append(r2)     // Catch:{ Exception -> 0x032c }
            r0.append(r1)     // Catch:{ Exception -> 0x032c }
            java.lang.String r1 = ", packageType = "
            r0.append(r1)     // Catch:{ Exception -> 0x032c }
            r1 = 0
            r0.append(r1)     // Catch:{ Exception -> 0x032c }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x032c }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)     // Catch:{ Exception -> 0x032c }
            r1 = 0
            return r1
        L_0x032c:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = r0.getMessage()
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "hardCodeXkeyMMdiffResponeForReddot x patch redot, parse tabconfig failed: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r0, r1)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x02.C91117e.m114303h(tw0.h, boolean):tw0.h");
    }
}
