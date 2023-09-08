package u73;

import android.content.res.AssetManager;
import com.tencent.p014mm.autogen.events.WebSearchConfigEvent;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.tav.asset.Asset;
import f40.C86709a0;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import ob0.C11385n;
import ob0.C117747y;
import org.json.JSONException;
import org.json.JSONObject;
import p749xh.C66261f3;
import te3.u25;
import te3.v25;

/* renamed from: u73.s0 */
public class C78137s0 {

    /* renamed from: a */
    public static HashMap<String, C72994y1.C72995a> f228979a = new HashMap<>();

    /* renamed from: b */
    public static Map<String, JSONObject> f228980b = new HashMap();

    /* renamed from: c */
    public static C101975h0 f228981c;

    /* renamed from: d */
    public static HashMap<String, Long> f228982d;

    /* renamed from: e */
    public static String f228983e = "";

    /* renamed from: f */
    public static C11385n f228984f = new C78138a();

    /* renamed from: u73.s0$a */
    public class C78138a implements C11385n {
        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C78139b bVar;
            C78139b bVar2 = C78139b.Valid;
            Log.m105925i("MicroMsg.WebSearch.WebSearchConfigLogic", "errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str);
            if (yVar instanceof C101975h0) {
                C86709a0.m107524d().mo123470p(1948, C78137s0.f228984f);
                WebSearchConfigEvent webSearchConfigEvent = new WebSearchConfigEvent();
                if (i == 0 && i2 == 0) {
                    C101975h0 h0Var = (C101975h0) yVar;
                    v25 v25 = h0Var.f300264g;
                    u25 u25 = h0Var.f300263f;
                    Log.m105925i("MicroMsg.WebSearch.WebSearchConfigLogic", "getWebSearchConfig onSceneEnd %s", v25.f143270d);
                    String str2 = u25.f299565f;
                    try {
                        JSONObject jSONObject = new JSONObject(v25.f143270d);
                        jSONObject.put(C66261f3.COL_UPDATETIME, System.currentTimeMillis());
                        String jSONObject2 = jSONObject.toString();
                        C86709a0.m107535s().mo121142i().mo119677K(C78137s0.m94338b(str2), jSONObject2);
                        try {
                            ((HashMap) C78137s0.f228980b).put(jSONObject2, new JSONObject(jSONObject2));
                        } catch (JSONException e) {
                            Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchConfigLogic", e, "", new Object[0]);
                        }
                        bVar = bVar2;
                    } catch (JSONException unused) {
                        bVar = C78139b.Invalid;
                    }
                    if (bVar == bVar2) {
                        webSearchConfigEvent.f194103d.f194104a = 0;
                    } else {
                        webSearchConfigEvent.f194103d.f194104a = -1;
                    }
                } else {
                    webSearchConfigEvent.f194103d.f194104a = -1;
                }
                webSearchConfigEvent.publish();
            }
        }
    }

    /* renamed from: u73.s0$b */
    public enum C78139b {
        Valid,
        Expired,
        Invalid
    }

    static {
        f228979a.put("zh_CN", C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_ZH_CN_STRING);
        f228979a.put("zh_HK", C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_ZH_HK_STRING);
        f228979a.put("zh_TW", C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_ZH_TW_STRING);
        f228979a.put("en", C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_EN_STRING);
        f228979a.put(LocaleUtil.ARABIC, C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_AR_STRING);
        f228979a.put(LocaleUtil.GERMAN, C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_DE_STRING);
        f228979a.put("de_DE", C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_DE_DE_STRING);
        f228979a.put(LocaleUtil.SPANISH, C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_ES_STRING);
        f228979a.put(LocaleUtil.FRENCH, C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_FR_STRING);
        f228979a.put("he", C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_HE_STRING);
        f228979a.put("hi", C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_HI_STRING);
        f228979a.put("id", C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_ID_STRING);
        f228979a.put(LocaleUtil.INDONESIAN_NEWNAME, C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_IN_STRING);
        f228979a.put(LocaleUtil.ITALIAN, C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_IT_STRING);
        f228979a.put("iw", C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_IW_STRING);
        f228979a.put(LocaleUtil.JAPANESE, C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_JA_STRING);
        f228979a.put(LocaleUtil.KOREAN, C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_KO_STRING);
        f228979a.put(LocaleUtil.LAO, C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_LO_STRING);
        f228979a.put(LocaleUtil.MALAY, C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_MS_STRING);
        f228979a.put(LocaleUtil.MYANMAR, C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_MY_STRING);
        f228979a.put("pl", C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_PL_STRING);
        f228979a.put(LocaleUtil.PORTUGUESE, C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_PT_STRING);
        f228979a.put(LocaleUtil.RUSSIAN, C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_RU_STRING);
        f228979a.put(LocaleUtil.THAI, C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_TH_STRING);
        f228979a.put(LocaleUtil.TURKEY, C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_TR_STRING);
        f228979a.put(LocaleUtil.VIETNAMESE, C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_VI_STRING);
    }

    /* renamed from: a */
    public static String m94337a() {
        InputStream inputStream;
        AssetManager assets = MMApplicationContext.getContext().getAssets();
        String str = null;
        try {
            inputStream = assets.open("webconfig/default." + LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext()));
            try {
                str = Util.streamToString(inputStream);
            } catch (Exception e) {
                e = e;
                try {
                    Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchConfigLogic", e, e.getMessage(), new Object[0]);
                    Util.qualityClose(inputStream);
                    return str;
                } catch (Throwable th) {
                    th = th;
                    Util.qualityClose(inputStream);
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            inputStream = null;
            Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchConfigLogic", e, e.getMessage(), new Object[0]);
            Util.qualityClose(inputStream);
            return str;
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
            Util.qualityClose(inputStream);
            throw th;
        }
        Util.qualityClose(inputStream);
        return str;
    }

    /* renamed from: b */
    public static C72994y1.C72995a m94338b(String str) {
        C72994y1.C72995a aVar = f228979a.get(str);
        return aVar == null ? C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_EN_STRING : aVar;
    }

    /* renamed from: c */
    public static JSONObject m94339c(String str) {
        if (((HashMap) f228980b).containsKey(str) && ((HashMap) f228980b).get(str) != null) {
            return (JSONObject) ((HashMap) f228980b).get(str);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            ((HashMap) f228980b).put(str, jSONObject);
            return jSONObject;
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchConfigLogic", e, "", new Object[0]);
            return null;
        }
    }

    /* renamed from: d */
    public static JSONObject m94340d(String str) {
        String str2 = "";
        String currentLanguage = LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext());
        JSONObject jSONObject = null;
        try {
            String str3 = (String) C86709a0.m107535s().mo121142i().mo119685f(m94338b(currentLanguage), (Object) null);
            if (!Util.isNullOrNil(str3)) {
                jSONObject = m94339c(str3).optJSONObject("data").optJSONObject(str);
                str2 = "Config Storage";
            }
        } catch (Exception unused) {
        }
        if (jSONObject == null) {
            try {
                String a = m94337a();
                if (a != null) {
                    jSONObject = new JSONObject(a).optJSONObject("data").optJSONObject(str);
                    str2 = Asset.TAG;
                }
            } catch (Exception unused2) {
            }
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        Log.m105925i("MicroMsg.WebSearch.WebSearchConfigLogic", "getWebSearchConfigKeyObj %s %s %s", currentLanguage, str, str2);
        return jSONObject;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e A[SYNTHETIC, Splitter:B:8:0x002e] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m94341e(java.lang.String r6) {
        /*
            java.lang.String r0 = ""
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getCurrentLanguage(r1)
            r2 = 0
            f40.o r3 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x002a }
            com.tencent.mm.storage.v1 r3 = r3.mo121142i()     // Catch:{ Exception -> 0x002a }
            com.tencent.mm.storage.y1$a r4 = m94338b(r1)     // Catch:{ Exception -> 0x002a }
            java.lang.Object r3 = r3.mo119685f(r4, r2)     // Catch:{ Exception -> 0x002a }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x002a }
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)     // Catch:{ Exception -> 0x002a }
            if (r4 != 0) goto L_0x002b
            org.json.JSONObject r2 = m94339c(r3)     // Catch:{ Exception -> 0x002a }
            java.lang.String r3 = "Config Storage"
            goto L_0x002c
        L_0x002a:
        L_0x002b:
            r3 = r0
        L_0x002c:
            if (r2 != 0) goto L_0x0041
            java.lang.String r4 = m94337a()     // Catch:{ Exception -> 0x0040 }
            if (r4 == 0) goto L_0x0041
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x0040 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x0040 }
            java.lang.String r2 = "Asset"
            r3 = r2
            goto L_0x003e
        L_0x003d:
        L_0x003e:
            r2 = r5
            goto L_0x0041
        L_0x0040:
        L_0x0041:
            if (r2 != 0) goto L_0x0048
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
        L_0x0048:
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r1
            r1 = 1
            r4[r1] = r6
            r1 = 2
            r4[r1] = r3
            java.lang.String r1 = "MicroMsg.WebSearch.WebSearchConfigLogic"
            java.lang.String r3 = "getWebSearchConfigMetaKeyObj %s %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r4)
            java.lang.Object r6 = r2.opt(r6)
            if (r6 != 0) goto L_0x0062
            goto L_0x0066
        L_0x0062:
            java.lang.String r0 = r6.toString()
        L_0x0066:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u73.C78137s0.m94341e(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b2 A[RETURN] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m94342f(java.util.List<java.lang.String> r13, int r14, long r15, java.util.List<te3.C49768hy> r17, boolean r18) {
        /*
            u73.s0$b r0 = u73.C78137s0.C78139b.Valid
            java.util.HashMap<java.lang.String, java.lang.Long> r1 = f228982d
            if (r1 != 0) goto L_0x000d
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            f228982d = r1
        L_0x000d:
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getCurrentLanguage(r1)
            r2 = 2
            r3 = 3
            java.lang.String r4 = "MicroMsg.WebSearch.WebSearchConfigLogic"
            r5 = 0
            r6 = 1
            r7 = 0
            if (r18 != 0) goto L_0x00b3
            java.lang.String r8 = f228983e
            if (r8 == 0) goto L_0x002a
            boolean r8 = r8.equalsIgnoreCase(r1)
            if (r8 != 0) goto L_0x002a
            goto L_0x00b3
        L_0x002a:
            java.util.HashMap<java.lang.String, java.lang.Long> r8 = f228982d
            java.lang.Object r8 = r8.get(r1)
            java.lang.Long r8 = (java.lang.Long) r8
            if (r8 != 0) goto L_0x003a
            r8 = 0
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
        L_0x003a:
            long r9 = java.lang.System.currentTimeMillis()
            long r11 = r8.longValue()
            long r9 = r9 - r11
            r11 = 600000(0x927c0, double:2.964394E-318)
            int r8 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r8 >= 0) goto L_0x004b
            return r7
        L_0x004b:
            long r8 = java.lang.System.currentTimeMillis()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            java.util.HashMap<java.lang.String, java.lang.Long> r9 = f228982d
            r9.put(r1, r8)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r7] = r1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r14)
            r3[r6] = r8
            java.lang.Long r8 = java.lang.Long.valueOf(r15)
            r3[r2] = r8
            java.lang.String r2 = "startToRequestConfig %s %d %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r3)
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            com.tencent.mm.storage.y1$a r3 = m94338b(r1)
            java.lang.Object r2 = r2.mo119685f(r3, r5)
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)     // Catch:{ Exception -> 0x008b }
            if (r3 != 0) goto L_0x008b
            org.json.JSONObject r2 = m94339c(r2)     // Catch:{ Exception -> 0x008b }
            goto L_0x008c
        L_0x008b:
            r2 = r5
        L_0x008c:
            if (r2 != 0) goto L_0x0091
            u73.s0$b r2 = u73.C78137s0.C78139b.Invalid
            goto L_0x00b0
        L_0x0091:
            java.lang.String r3 = "updateTime"
            long r3 = r2.optLong(r3)
            java.lang.String r8 = "timevalSec"
            long r8 = r2.optLong(r8)
            r10 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r10
            long r3 = r3 + r8
            long r8 = java.lang.System.currentTimeMillis()
            int r2 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x00af
            u73.s0$b r2 = u73.C78137s0.C78139b.Expired
            goto L_0x00b0
        L_0x00af:
            r2 = r0
        L_0x00b0:
            if (r2 != r0) goto L_0x00c6
            return r7
        L_0x00b3:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r3 = f228983e
            r0[r7] = r3
            r0[r6] = r1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r18)
            r0[r2] = r3
            java.lang.String r2 = "force update cfg %s %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r0)
        L_0x00c6:
            f228983e = r1
            u73.h0 r0 = f228981c
            if (r0 == 0) goto L_0x00d7
            ob0.b0 r0 = f40.C86709a0.m107524d()
            u73.h0 r1 = f228981c
            r0.mo123458d(r1)
            f228981c = r5
        L_0x00d7:
            u73.h0 r0 = new u73.h0
            r7 = r0
            r8 = r13
            r9 = r14
            r10 = r15
            r12 = r17
            r7.<init>(r8, r9, r10, r12)
            f228981c = r0
            ob0.b0 r0 = f40.C86709a0.m107524d()
            r1 = 1948(0x79c, float:2.73E-42)
            ob0.n r2 = f228984f
            r0.mo123455a(r1, r2)
            ob0.b0 r0 = f40.C86709a0.m107524d()
            u73.h0 r1 = f228981c
            r0.mo123460f(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: u73.C78137s0.m94342f(java.util.List, int, long, java.util.List, boolean):boolean");
    }
}
