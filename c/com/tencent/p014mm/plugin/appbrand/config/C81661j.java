package com.tencent.p014mm.plugin.appbrand.config;

import android.content.ContentValues;
import com.tencent.p014mm.plugin.appbrand.C84808v4;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.backgroundfetch.C81554a;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C86484b;
import f40.C86709a0;
import java.util.LinkedList;
import java.util.Locale;
import lc3.C10485b;
import org.json.JSONArray;
import org.json.JSONObject;
import wi0.C38158d;
import wi0.C90977d0;
import wi0.C90978e0;
import wi0.C90999s;

/* renamed from: com.tencent.mm.plugin.appbrand.config.j */
public final class C81661j extends C90999s {

    /* renamed from: e */
    public static volatile C81661j f239697e;

    /* renamed from: a */
    public static C81554a m100176a(String str) {
        WxaAttributes LL;
        if (C81161g2.Cx0() == null || (LL = C81161g2.Cx0().mo114000LL(str, new String[0])) == null) {
            return null;
        }
        C81554a aVar = new C81554a();
        aVar.f239178a = LL.mo113941n2().f239507a.f239531s;
        aVar.f239179b = LL.mo113941n2().f239507a.f239532t;
        aVar.f239180c = LL.mo113941n2().f239507a.f239533u;
        aVar.f239181d = LL.mo113941n2().f239507a.f239534v;
        return aVar;
    }

    /* renamed from: b */
    public static WxaProfileAttributes m100177b(String str, boolean z) {
        if (!Util.isNullOrNil(str) && C86709a0.m107522a()) {
            String[] strArr = {"appId", "username", "nickname", "signature", "brandIconURL", "dynamicInfo", "versionInfo", "appInfo", "registerSource", "bindWxaInfo"};
            C90978e0 Cx0 = C81161g2.Cx0();
            WxaAttributes mL = z ? Cx0.mo114011mL(str, strArr) : Cx0.mo114000LL(str, strArr);
            if (mL != null) {
                WxaProfileAttributes wxaProfileAttributes = new WxaProfileAttributes();
                wxaProfileAttributes.f239575d = mL.field_username;
                wxaProfileAttributes.f239576e = mL.field_appId;
                wxaProfileAttributes.f239577f = mL.field_nickname;
                wxaProfileAttributes.f239578g = mL.field_signature;
                wxaProfileAttributes.f239579h = mL.field_brandIconURL;
                wxaProfileAttributes.f239580i = mL.mo113941n2().f239508b;
                wxaProfileAttributes.f239590v = mL.mo113942o2() == null ? -1 : mL.mo113942o2().f239454f;
                if (mL.f239434U0 == null && !Util.isNullOrNil(mL.field_bindWxaInfo)) {
                    try {
                        JSONArray optJSONArray = new JSONObject(mL.field_bindWxaInfo).optJSONArray("bizEntryInfo");
                        if (optJSONArray != null) {
                            mL.f239434U0 = new LinkedList();
                            for (int i = 0; i < optJSONArray.length(); i++) {
                                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                                if (optJSONObject != null) {
                                    String optString = optJSONObject.optString("username");
                                    if (!Util.isNullOrNil(optString)) {
                                        WxaAttributes.WxaEntryInfo wxaEntryInfo = new WxaAttributes.WxaEntryInfo();
                                        wxaEntryInfo.f108666d = optString;
                                        wxaEntryInfo.f108667e = optJSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                                        wxaEntryInfo.f108669g = optJSONObject.optString("icon_url");
                                        ((LinkedList) mL.f239434U0).add(wxaEntryInfo);
                                    }
                                }
                            }
                        }
                    } catch (Exception unused) {
                        mL.f239434U0 = null;
                    }
                }
                wxaProfileAttributes.f239581j = mL.f239434U0;
                wxaProfileAttributes.f239584p = mL.mo113940m2() != null ? mL.mo113940m2().f239500p : 0;
                wxaProfileAttributes.f239585q = mL.mo113940m2() != null ? mL.mo113940m2().f239501q : 0;
                wxaProfileAttributes.f239586r = mL.mo113941n2().f239507a.f239537y;
                wxaProfileAttributes.f239591w = mL.mo113942o2() == null ? 0 : mL.mo113942o2().f239452d;
                try {
                    wxaProfileAttributes.f239582n = mL.mo113940m2().f239488d;
                    wxaProfileAttributes.f239587s = mL.mo113940m2().f239498n;
                    wxaProfileAttributes.f239588t = mL.mo113940m2().f239499o;
                } catch (NullPointerException unused2) {
                    Log.m105921e("MicroMsg.WxaAttrStorageHelper", "assembleProfileAttrs, NULL appInfo, usernameOrAppId = %s", str);
                }
                try {
                    String str2 = "";
                    if (!Util.isNullOrNil(mL.field_registerSource)) {
                        str2 = new JSONObject(mL.field_registerSource).optString("RegisterBody", str2);
                    }
                    wxaProfileAttributes.f239589u = str2;
                } catch (Exception unused3) {
                }
                return wxaProfileAttributes;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00dd  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.tencent.p014mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo m100178c(java.lang.String r23, java.lang.String r24, int r25, long r26, boolean r28, java.lang.String r29) {
        /*
            r2 = r24
            wi0.e0 r0 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Cx0()
            java.lang.String r1 = "MicroMsg.WxaAttrStorageHelper"
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x010c
            boolean r5 = r0.mo114012qq()
            if (r5 != 0) goto L_0x0014
            goto L_0x010c
        L_0x0014:
            java.lang.String r6 = "appId"
            java.lang.String r7 = "nickname"
            java.lang.String r8 = "shortNickname"
            java.lang.String r9 = "smallHeadURL"
            java.lang.String r10 = "appInfo"
            java.lang.String r11 = "versionInfo"
            java.lang.String r12 = "dynamicInfo"
            java.lang.String[] r5 = new java.lang.String[]{r6, r7, r8, r9, r10, r11, r12}
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r0 = r0.mo114000LL(r2, r5)
            if (r0 != 0) goto L_0x0031
            r5 = 0
            goto L_0x0037
        L_0x0031:
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$a r5 = r0.mo113940m2()     // Catch:{ NullPointerException -> 0x0039 }
            int r5 = r5.f239488d     // Catch:{ NullPointerException -> 0x0039 }
        L_0x0037:
            r7 = r5
            goto L_0x0043
        L_0x0039:
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r4] = r2
            java.lang.String r6 = "assembleRecentInfo, NULL appInfo, username = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r6, r5)
            r7 = 0
        L_0x0043:
            if (r0 != 0) goto L_0x0047
            r5 = 0
            goto L_0x004d
        L_0x0047:
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r5 = r0.mo113942o2()     // Catch:{ NullPointerException -> 0x004f }
            int r5 = r5.f239452d     // Catch:{ NullPointerException -> 0x004f }
        L_0x004d:
            r9 = r5
            goto L_0x0050
        L_0x004f:
            r9 = 0
        L_0x0050:
            r5 = 0
            if (r0 != 0) goto L_0x0055
            goto L_0x005d
        L_0x0055:
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$a r8 = r0.mo113940m2()     // Catch:{ NullPointerException -> 0x005c }
            long r10 = r8.f239485a     // Catch:{ NullPointerException -> 0x005c }
            goto L_0x005e
        L_0x005c:
        L_0x005d:
            r10 = r5
        L_0x005e:
            boolean r8 = com.tencent.p014mm.plugin.appbrand.appcache.C81289m.C81290a.m99664b(r25)
            if (r8 == 0) goto L_0x006f
            if (r0 != 0) goto L_0x0067
            goto L_0x006f
        L_0x0067:
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$a r8 = r0.mo113940m2()     // Catch:{ NullPointerException -> 0x006e }
            long r5 = r8.f239486b     // Catch:{ NullPointerException -> 0x006e }
            goto L_0x006f
        L_0x006e:
        L_0x006f:
            r12 = r5
            java.lang.Class<com.tencent.mm.plugin.appbrand.appusage.i0> r5 = com.tencent.p014mm.plugin.appbrand.appusage.C81500i0.class
            java.lang.Object r5 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r5)
            com.tencent.mm.plugin.appbrand.appusage.i0 r5 = (com.tencent.p014mm.plugin.appbrand.appusage.C81500i0) r5
            if (r5 != 0) goto L_0x0083
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r4] = r2
            java.lang.String r8 = "assembleRecentInfo by username(%s) but NULL starAppStorage, maybe account released"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r8, r6)
        L_0x0083:
            com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo r22 = new com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo
            java.lang.String r1 = java.lang.String.valueOf(r23)
            java.lang.String r6 = ""
            if (r0 != 0) goto L_0x008f
            r8 = r6
            goto L_0x0091
        L_0x008f:
            java.lang.String r8 = r0.field_appId
        L_0x0091:
            if (r0 != 0) goto L_0x0095
            r14 = r6
            goto L_0x0097
        L_0x0095:
            java.lang.String r14 = r0.field_nickname
        L_0x0097:
            if (r0 != 0) goto L_0x009b
            r15 = r6
            goto L_0x009d
        L_0x009b:
            java.lang.String r15 = r0.field_shortNickname
        L_0x009d:
            if (r0 != 0) goto L_0x00a0
            goto L_0x00a2
        L_0x00a0:
            java.lang.String r6 = r0.field_smallHeadURL
        L_0x00a2:
            r16 = r12
            r12 = r25
            if (r5 == 0) goto L_0x00b1
            boolean r5 = r5.mo113793bD(r2, r12)
            if (r5 == 0) goto L_0x00b1
            r18 = 1
            goto L_0x00b3
        L_0x00b1:
            r18 = 0
        L_0x00b3:
            if (r0 == 0) goto L_0x00c5
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$a r5 = r0.mo113940m2()
            if (r5 != 0) goto L_0x00bc
            goto L_0x00c5
        L_0x00bc:
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$a r5 = r0.mo113940m2()
            int r5 = r5.f239500p
            r19 = r5
            goto L_0x00c7
        L_0x00c5:
            r19 = 0
        L_0x00c7:
            if (r0 == 0) goto L_0x00d9
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$a r5 = r0.mo113940m2()
            if (r5 != 0) goto L_0x00d0
            goto L_0x00d9
        L_0x00d0:
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$a r5 = r0.mo113940m2()
            int r5 = r5.f239501q
            r20 = r5
            goto L_0x00db
        L_0x00d9:
            r20 = 0
        L_0x00db:
            if (r0 == 0) goto L_0x00ef
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$c r0 = r0.mo113941n2()
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$c$a r0 = r0.f239507a
            int r0 = r0.f239537y
            if (r0 == 0) goto L_0x00e9
            r0 = 1
            goto L_0x00ea
        L_0x00e9:
            r0 = 0
        L_0x00ea:
            if (r0 == 0) goto L_0x00ef
            r21 = 1
            goto L_0x00f1
        L_0x00ef:
            r21 = 0
        L_0x00f1:
            r0 = r22
            r2 = r24
            r3 = r8
            r4 = r14
            r5 = r15
            r8 = r25
            r12 = r16
            r14 = r18
            r15 = r26
            r17 = r19
            r18 = r20
            r19 = r28
            r20 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r14, r15, r17, r18, r19, r20, r21)
            return r22
        L_0x010c:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r4] = r2
            java.lang.String r2 = "assembleRecentInfo invalid storage with username(%s)"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.config.C81661j.m100178c(java.lang.String, java.lang.String, int, long, boolean, java.lang.String):com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo");
    }

    /* renamed from: d */
    public static AppBrandSysConfigWC m100179d(String str) {
        int i = 0;
        WxaAttributes mL = C81161g2.Cx0().mo114011mL(str, new String[0]);
        AppBrandSysConfigWC appBrandSysConfigWC = null;
        if (mL != null) {
            if (mL != null) {
                try {
                    appBrandSysConfigWC = (AppBrandSysConfigWC) C84808v4.m104487a(new C90977d0(), mL);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.WxaAttrStorageHelper", "assembleSysConfig, <init> e = %s", e);
                }
            }
            if (appBrandSysConfigWC != null) {
                appBrandSysConfigWC.f234887p0 = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("ClientBenchmarkLevel", -1);
                C38158d h1 = C81161g2.m99451h1();
                appBrandSysConfigWC.f234890x = "1".equals(h1.mo61553Lo(appBrandSysConfigWC.f261062e + "_PerformancePanelEnabled", "0"));
                appBrandSysConfigWC.f239413b1 = mL.mo113940m2() != null ? mL.mo113940m2().f239500p : 0;
                appBrandSysConfigWC.f239414c1 = mL.mo113940m2() != null ? mL.mo113940m2().f239501q : 0;
                appBrandSysConfigWC.f239416e1 = mL.mo113940m2() != null ? mL.mo113940m2().f239503s : 0;
                if (mL.mo113940m2() != null) {
                    i = mL.mo113940m2().f239504t;
                }
                appBrandSysConfigWC.f239417f1 = i;
                appBrandSysConfigWC.f239415d1 = mL.mo113941n2().f239507a.f239537y;
                appBrandSysConfigWC.f239418g1 = mL.field_passThroughInfo;
                appBrandSysConfigWC.f239419h1 = mL.field_stablePassThroughInfo;
            }
        }
        return appBrandSysConfigWC;
    }

    /* renamed from: e */
    public static String m100180e(String str) {
        WxaAttributes LL;
        if (!Util.isNullOrNil(str) && (LL = C81161g2.Cx0().mo114000LL(str, "appId")) != null) {
            return LL.field_appId;
        }
        return null;
    }

    /* renamed from: f */
    public static String m100181f(String str) {
        WxaAttributes mL;
        if (!Util.isNullOrNil(str) && (mL = C81161g2.Cx0().mo114011mL(str, "username")) != null) {
            return mL.field_username;
        }
        return null;
    }

    /* renamed from: g */
    public static C81661j m100182g() {
        if (C81161g2.Cx0() != null) {
            if (f239697e == null) {
                synchronized (C81661j.class) {
                    if (f239697e == null) {
                        f239697e = new C81661j();
                    }
                }
            }
            return f239697e;
        }
        throw new C86484b();
    }

    /* renamed from: h */
    public static void m100183h(String str) {
        if (!Util.isNullOrNil(str)) {
            C90978e0 Cx0 = C81161g2.Cx0();
            Cx0.getClass();
            if (!Util.isNullOrNil(str)) {
                ContentValues contentValues = new ContentValues(2);
                contentValues.put("syncVersion", "");
                contentValues.put("syncTimeSecond", 0L);
                Cx0.f239696d.update(Cx0.getTableName(), contentValues, String.format(Locale.US, "%s=?", new Object[]{"username"}), new String[]{str});
            }
        }
    }
}
