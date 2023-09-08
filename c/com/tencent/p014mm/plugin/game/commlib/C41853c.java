package com.tencent.p014mm.plugin.game.commlib;

import com.tencent.p014mm.plugin.game.commlib.util.C41872f;
import com.tencent.p014mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import java.util.Iterator;
import java.util.LinkedList;
import lc3.C10485b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p274xx.C66446g;
import py1.C47563d1;
import py1.C47568e;
import py1.C47597i0;
import py1.C47605j1;
import py1.C47624m;
import py1.C47644o5;
import py1.C47651p5;
import py1.C47660r0;
import py1.C47671s4;
import py1.C47677t3;
import py1.C47680u;
import py1.C47687v0;

/* renamed from: com.tencent.mm.plugin.game.commlib.c */
public class C41853c {

    /* renamed from: a */
    public static GetGameCenterGlobalSettingResponse f112797a;

    /* renamed from: b */
    public static boolean f112798b;

    /* renamed from: a */
    public static boolean m45367a() {
        if (m45371e() != null) {
            C47651p5 p5Var = f112797a.WepkgControl;
            if (p5Var != null) {
                return p5Var.f127930d;
            }
            return false;
        }
        m45381o();
        return false;
    }

    /* renamed from: b */
    public static C47680u m45368b() {
        if (m45371e() != null) {
            C47605j1 j1Var = f112797a.GameLifeSetting;
            if (j1Var != null) {
                return j1Var.f127807n;
            }
            return null;
        }
        m45381o();
        return null;
    }

    /* renamed from: c */
    public static String m45369c() {
        return C41872f.m45394d() + "globalconfig";
    }

    /* renamed from: d */
    public static JSONArray m45370d() {
        C47660r0 r0Var;
        LinkedList<C47568e> linkedList;
        JSONArray jSONArray = new JSONArray();
        if (m45371e() != null) {
            r0Var = f112797a.GameCommunityInfo;
        } else {
            m45381o();
            r0Var = null;
        }
        if (!(r0Var == null || (linkedList = r0Var.f127961d) == null)) {
            Iterator<C47568e> it = linkedList.iterator();
            while (it.hasNext()) {
                C47568e next = it.next();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("appId", next.f127647d);
                    jSONObject.put("gameName", next.f127648e);
                    jSONObject.put("albumName", next.f127649f);
                    jSONObject.put("defaultTitle", next.f127650g);
                } catch (JSONException unused) {
                }
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray;
    }

    /* renamed from: e */
    public static GetGameCenterGlobalSettingResponse m45371e() {
        if (!f112798b) {
            m45381o();
        }
        return f112797a;
    }

    /* renamed from: f */
    public static C47687v0 m45372f() {
        m45371e();
        GetGameCenterGlobalSettingResponse getGameCenterGlobalSettingResponse = f112797a;
        if (getGameCenterGlobalSettingResponse != null) {
            C47687v0 v0Var = getGameCenterGlobalSettingResponse.GameDetailSetting;
            if (v0Var == null) {
                return v0Var;
            }
            Log.m105925i("MicroMsg.GameConfigManager", "getGameDetailSettingControl jumpType:%d, jumpUrl:%s", Integer.valueOf(v0Var.f128069d), v0Var.f128070e);
            return v0Var;
        }
        m45381o();
        return null;
    }

    /* renamed from: g */
    public static C47563d1 m45373g() {
        m45371e();
        GetGameCenterGlobalSettingResponse getGameCenterGlobalSettingResponse = f112797a;
        if (getGameCenterGlobalSettingResponse != null) {
            C47563d1 d1Var = getGameCenterGlobalSettingResponse.GameIndexSetting;
            if (d1Var == null) {
                return d1Var;
            }
            Log.m105925i("MicroMsg.GameConfigManager", "getGameIndexSettingControl jumpType:%d, jumpUrl:%s", Integer.valueOf(d1Var.f127633d), d1Var.f127634e);
            return d1Var;
        }
        m45381o();
        return null;
    }

    /* renamed from: h */
    public static C47624m m45374h() {
        if (m45371e() != null) {
            C47605j1 j1Var = f112797a.GameLifeSetting;
            if (j1Var != null) {
                return j1Var.f127805i;
            }
            return null;
        }
        m45381o();
        return null;
    }

    /* renamed from: i */
    public static C47605j1 m45375i() {
        if (m45371e() != null) {
            C47605j1 j1Var = f112797a.GameLifeSetting;
            if (j1Var != null) {
                return j1Var;
            }
            return null;
        }
        m45381o();
        return null;
    }

    /* renamed from: j */
    public static C47677t3 m45376j() {
        if (m45371e() != null) {
            C47677t3 t3Var = f112797a.MessageExposureStrategy;
            if (t3Var != null) {
                return t3Var;
            }
        } else {
            m45381o();
        }
        C47677t3 t3Var2 = new C47677t3();
        t3Var2.f128026d = 12;
        t3Var2.f128028f = 7200;
        t3Var2.f128027e = 300;
        t3Var2.f128029g = null;
        return t3Var2;
    }

    /* renamed from: k */
    public static boolean m45377k() {
        boolean z;
        m45371e();
        GetGameCenterGlobalSettingResponse getGameCenterGlobalSettingResponse = f112797a;
        if (getGameCenterGlobalSettingResponse != null) {
            z = getGameCenterGlobalSettingResponse.ShowEntrance;
        } else {
            m45381o();
            String loadApplicationLanguage = LocaleUtil.loadApplicationLanguage(MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0), MMApplicationContext.getContext());
            Log.m105925i("MicroMsg.GameConfigManager", "getShowEntrance, lang = %s", loadApplicationLanguage);
            String nullAs = Util.nullAs(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("HideGameCenter"), "zh_CN".equals(loadApplicationLanguage) ? "0" : "1");
            Log.m105925i("MicroMsg.GameConfigManager", "hide game center:[%s]", nullAs);
            z = nullAs.equalsIgnoreCase("0");
        }
        Log.m105924i("MicroMsg.GameConfigManager", "getShowEntrance : " + z);
        return z;
    }

    /* renamed from: l */
    public static C47671s4 m45378l() {
        if (m45371e() != null) {
            C47671s4 s4Var = f112797a.StatusBarStyle;
            if (s4Var != null) {
                Log.m105925i("MicroMsg.GameConfigManager", "getStatusBarStyle color:%s, darkModeColor:%s, style:%s", s4Var.f128001d, s4Var.f128003f, s4Var.f128002e);
            }
            return f112797a.StatusBarStyle;
        }
        m45381o();
        return null;
    }

    /* renamed from: m */
    public static int m45379m() {
        if (m45371e() != null) {
            C47644o5 o5Var = f112797a.WebViewControl;
            if (o5Var != null) {
                return o5Var.f127914d;
            }
            return 3600;
        }
        m45381o();
        return 3600;
    }

    /* renamed from: n */
    public static Boolean m45380n() {
        if (!((C66446g) C86312j.m106911c(C66446g.class)).mo61611mW()) {
            Log.m105924i("MicroMsg.GameConfigManager", "GameReddot dont show reddot! ReddotService interrupt");
            return Boolean.TRUE;
        }
        C47677t3 j = m45376j();
        if (!(j == null || j.f128029g == null)) {
            long nowSecond = Util.nowSecond();
            C47597i0 i0Var = j.f128029g;
            if (nowSecond >= i0Var.f127775d && nowSecond <= i0Var.f127776e) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.tencent.mm.vfs.p1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: com.tencent.mm.vfs.p1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: com.tencent.mm.vfs.p1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: com.tencent.mm.vfs.p1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: com.tencent.mm.vfs.p1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: com.tencent.mm.vfs.p1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: com.tencent.mm.vfs.p1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: com.tencent.mm.vfs.p1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: byte[]} */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:25|(2:51|52)|53|54) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00d5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0061 A[SYNTHETIC, Splitter:B:32:0x0061] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0069 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x006b A[SYNTHETIC, Splitter:B:39:0x006b] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d2 A[SYNTHETIC, Splitter:B:51:0x00d2] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m45381o() {
        /*
            java.lang.Class<com.tencent.mm.plugin.game.commlib.c> r0 = com.tencent.p014mm.plugin.game.commlib.C41853c.class
            monitor-enter(r0)
            com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse r1 = f112797a     // Catch:{ all -> 0x00d6 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)
            return
        L_0x0009:
            r1 = 1
            f112798b = r1     // Catch:{ all -> 0x00d6 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00d6 }
            com.tencent.mm.vfs.m1 r3 = new com.tencent.mm.vfs.m1     // Catch:{ all -> 0x00d6 }
            java.lang.String r4 = m45369c()     // Catch:{ all -> 0x00d6 }
            r3.<init>((java.lang.String) r4)     // Catch:{ all -> 0x00d6 }
            boolean r4 = r3.mo119967g()     // Catch:{ all -> 0x00d6 }
            if (r4 != 0) goto L_0x0021
            monitor-exit(r0)
            return
        L_0x0021:
            r4 = 0
            com.tencent.mm.vfs.p1 r5 = new com.tencent.mm.vfs.p1     // Catch:{ IOException -> 0x0043 }
            r5.<init>((com.tencent.p014mm.vfs.C86009m1) r3)     // Catch:{ IOException -> 0x0043 }
            long r6 = r3.mo119980r()     // Catch:{ IOException -> 0x003b, all -> 0x0037 }
            int r7 = (int) r6     // Catch:{ IOException -> 0x003b, all -> 0x0037 }
            byte[] r4 = new byte[r7]     // Catch:{ IOException -> 0x003b, all -> 0x0037 }
            r5.read(r4)     // Catch:{ IOException -> 0x003b, all -> 0x0037 }
            r5.close()     // Catch:{ IOException -> 0x0035 }
            goto L_0x0067
        L_0x0035:
            goto L_0x0067
        L_0x0037:
            r1 = move-exception
            r4 = r5
            goto L_0x00d0
        L_0x003b:
            r6 = move-exception
            r10 = r5
            r5 = r4
            r4 = r10
            goto L_0x0045
        L_0x0040:
            r1 = move-exception
            goto L_0x00d0
        L_0x0043:
            r6 = move-exception
            r5 = r4
        L_0x0045:
            java.lang.String r7 = "MicroMsg.GameConfigManager"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0040 }
            r8.<init>()     // Catch:{ all -> 0x0040 }
            java.lang.String r9 = "parseGlobalConfig: "
            r8.append(r9)     // Catch:{ all -> 0x0040 }
            java.lang.String r6 = r6.getMessage()     // Catch:{ all -> 0x0040 }
            r8.append(r6)     // Catch:{ all -> 0x0040 }
            java.lang.String r6 = r8.toString()     // Catch:{ all -> 0x0040 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r6)     // Catch:{ all -> 0x0040 }
            if (r4 == 0) goto L_0x0066
            r4.close()     // Catch:{ IOException -> 0x0065 }
            goto L_0x0066
        L_0x0065:
        L_0x0066:
            r4 = r5
        L_0x0067:
            if (r4 != 0) goto L_0x006b
            monitor-exit(r0)
            return
        L_0x006b:
            com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse r5 = new com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse     // Catch:{ OutOfMemoryError -> 0x0095, Exception -> 0x0076 }
            r5.<init>()     // Catch:{ OutOfMemoryError -> 0x0095, Exception -> 0x0076 }
            f112797a = r5     // Catch:{ OutOfMemoryError -> 0x0095, Exception -> 0x0076 }
            r5.parseFrom(r4)     // Catch:{ OutOfMemoryError -> 0x0095, Exception -> 0x0076 }
            goto L_0x00b3
        L_0x0076:
            r4 = move-exception
            java.lang.String r5 = "MicroMsg.GameConfigManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d6 }
            r6.<init>()     // Catch:{ all -> 0x00d6 }
            java.lang.String r7 = "parseGlobalConfig: gameConfigResp.parseFrom"
            r6.append(r7)     // Catch:{ all -> 0x00d6 }
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x00d6 }
            r6.append(r4)     // Catch:{ all -> 0x00d6 }
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x00d6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r4)     // Catch:{ all -> 0x00d6 }
            r3.mo119966f()     // Catch:{ all -> 0x00d6 }
            goto L_0x00b3
        L_0x0095:
            r4 = move-exception
            java.lang.String r5 = "MicroMsg.GameConfigManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d6 }
            r6.<init>()     // Catch:{ all -> 0x00d6 }
            java.lang.String r7 = "parseGlobalConfig: "
            r6.append(r7)     // Catch:{ all -> 0x00d6 }
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x00d6 }
            r6.append(r4)     // Catch:{ all -> 0x00d6 }
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x00d6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r4)     // Catch:{ all -> 0x00d6 }
            r3.mo119966f()     // Catch:{ all -> 0x00d6 }
        L_0x00b3:
            java.lang.String r3 = "MicroMsg.GameConfigManager"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d6 }
            r4.<init>()     // Catch:{ all -> 0x00d6 }
            java.lang.String r5 = "parseConfigFile, cost: "
            r4.append(r5)     // Catch:{ all -> 0x00d6 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00d6 }
            long r5 = r5 - r1
            r4.append(r5)     // Catch:{ all -> 0x00d6 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x00d6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)     // Catch:{ all -> 0x00d6 }
            monitor-exit(r0)
            return
        L_0x00d0:
            if (r4 == 0) goto L_0x00d5
            r4.close()     // Catch:{ IOException -> 0x00d5 }
        L_0x00d5:
            throw r1     // Catch:{ all -> 0x00d6 }
        L_0x00d6:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.commlib.C41853c.m45381o():void");
    }
}
