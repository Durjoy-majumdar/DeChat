package kv2;

import android.os.Build;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.waid.C30474a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import org.json.JSONObject;
import p156gj.C87203t;
import p823sg.C90193h;
import tc2.C118418g;

/* renamed from: kv2.b */
public class C34071b {
    /* renamed from: a */
    public static String m40227a(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("buildAppWaid", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        String trim = Util.nullAsNil(str).trim();
        if (TextUtils.isEmpty(trim) || TextUtils.isEmpty(str2)) {
            SnsMethodCalculate.markEndTimeMs("buildAppWaid", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            return "";
        }
        try {
            String f = C90193h.m112878f((trim.toLowerCase() + "_" + str2).getBytes("UTF-8"));
            if (!TextUtils.isEmpty(f)) {
                String str3 = "waid" + f;
                SnsMethodCalculate.markEndTimeMs("buildAppWaid", "com.tencent.mm.plugin.sns.waid.WaidHelper");
                return str3;
            }
        } catch (Throwable th) {
            Log.m105920e("ad.waid.WaidHelper", "getAppWaid, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("buildAppWaid", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        return "";
    }

    /* renamed from: b */
    public static synchronized String m40228b(String str) {
        String a;
        synchronized (C34071b.class) {
            SnsMethodCalculate.markStartTimeMs("doGetAppWaid", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            try {
                long currentTimeMillis = System.currentTimeMillis();
                a = m40227a(str, m40233g());
                Log.m105924i("ad.waid.WaidHelper", "doGetAppWaid pkg=" + str + ", appWaid=" + a + ", timeCost=" + (System.currentTimeMillis() - currentTimeMillis));
                SnsMethodCalculate.markEndTimeMs("doGetAppWaid", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            } catch (Throwable th) {
                Log.m105920e("ad.waid.WaidHelper", "doGetAppWaid exp=" + th.toString());
                SnsMethodCalculate.markEndTimeMs("doGetAppWaid", "com.tencent.mm.plugin.sns.waid.WaidHelper");
                return "";
            }
        }
        return a;
    }

    /* renamed from: c */
    public static String m40229c() {
        SnsMethodCalculate.markStartTimeMs("dumpKV", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        JSONObject jSONObject = new JSONObject();
        try {
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("ad_id_kv_pref");
            String[] allKeys = mmkv.allKeys();
            if (allKeys != null && allKeys.length > 0) {
                for (String str : allKeys) {
                    jSONObject.put(str, mmkv.getString(str, ""));
                }
            }
        } catch (Throwable th) {
            Log.m105920e("ad.waid.WaidHelper", "dumpKV exp=" + th.toString());
        }
        String jSONObject2 = jSONObject.toString();
        SnsMethodCalculate.markEndTimeMs("dumpKV", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        return jSONObject2;
    }

    /* renamed from: d */
    public static String m40230d(String str) {
        SnsMethodCalculate.markStartTimeMs("getAppWaid", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        if (TextUtils.isEmpty(str)) {
            Log.m105918d("ad.waid.WaidHelper", "getAppWaid, pkg is empty");
            SnsMethodCalculate.markEndTimeMs("getAppWaid", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            return "";
        }
        SnsMethodCalculate.markStartTimeMs("isInnerExptWaidEnable", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        boolean z = false;
        try {
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ad_waid_inner_switch, 1) > 0) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("isInnerExptWaidEnable", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        } catch (Throwable th) {
            Log.m105920e("ad.waid.WaidHelper", "isInnerExptWaidEnable, exp=" + th.toString());
            SnsMethodCalculate.markEndTimeMs("isInnerExptWaidEnable", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        }
        if (!z) {
            Log.m105928w("ad.waid.WaidHelper", "getAppWaid, isInnerExptWaidEnable==false");
            SnsMethodCalculate.markEndTimeMs("getAppWaid", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            return "";
        }
        String b = m40228b(str);
        SnsMethodCalculate.markEndTimeMs("getAppWaid", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        return b;
    }

    /* renamed from: e */
    public static String m40231e() {
        SnsMethodCalculate.markStartTimeMs("getAppWaidKey", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        StringBuilder sb = new StringBuilder();
        sb.append("appWaid_");
        String str = Build.BRAND;
        SnsMethodCalculate.markStartTimeMs("formatStr", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        String replace = Util.nullAsNil(str).replace(" ", "_");
        SnsMethodCalculate.markEndTimeMs("formatStr", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        sb.append(replace);
        sb.append("_");
        String k = C87203t.m108275k();
        SnsMethodCalculate.markStartTimeMs("formatStr", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        String replace2 = Util.nullAsNil(k).replace(" ", "_");
        SnsMethodCalculate.markEndTimeMs("formatStr", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        sb.append(replace2);
        String sb4 = sb.toString();
        SnsMethodCalculate.markEndTimeMs("getAppWaidKey", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        return sb4;
    }

    /* renamed from: f */
    public static int m40232f() {
        SnsMethodCalculate.markStartTimeMs("getKVCount", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        int i = 0;
        try {
            String[] allKeys = MultiProcessMMKV.getMMKV("ad_id_kv_pref").allKeys();
            if (allKeys != null) {
                i = allKeys.length;
            }
            SnsMethodCalculate.markEndTimeMs("getKVCount", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            return i;
        } catch (Throwable th) {
            Log.m105920e("ad.waid.WaidHelper", "getKVCount exp=" + th.toString());
            SnsMethodCalculate.markEndTimeMs("getKVCount", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            return 0;
        }
    }

    /* renamed from: g */
    public static String m40233g() {
        SnsMethodCalculate.markStartTimeMs("getRawWaid", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        try {
            String e = m40231e();
            SnsMethodCalculate.markStartTimeMs("getKVString", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            String string = MultiProcessMMKV.getMMKV("ad_id_kv_pref").getString(e, "");
            SnsMethodCalculate.markEndTimeMs("getKVString", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            String Hx = C118418g.INSTANCE.mo175797Hx();
            Log.m105924i("ad.waid.WaidHelper", "getRawWaid, key=" + e + ", wxWaid=" + Hx + ", localWaid=" + string);
            int i = 1;
            if (TextUtils.isEmpty(string) && !TextUtils.isEmpty(Hx)) {
                m40237k(e, Hx);
                String c = m40229c();
                int f = m40232f();
                Log.m105928w("ad.waid.WaidHelper", "device changed, update localWaid, key=" + e + ", kvCount=" + f);
                if (f > 1) {
                    C30474a.m39102b(c);
                }
                string = Hx;
            }
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(Hx) && !string.equals(Hx)) {
                boolean i2 = m40235i();
                Log.m105924i("ad.waid.WaidHelper", "waid Changed, key=" + e + ", localWaid=" + string + ", wxWaid=" + Hx + ", isNeedUpdate=" + i2);
                if (i2) {
                    m40237k(e, Hx);
                    string = Hx;
                }
                int f2 = m40232f();
                if (!i2) {
                    i = 0;
                }
                C30474a.m39105e(string, Hx, i, f2);
            }
            SnsMethodCalculate.markEndTimeMs("getRawWaid", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            return string;
        } catch (Throwable th) {
            Log.m105920e("ad.waid.WaidHelper", "getRawWaid exp=" + android.util.Log.getStackTraceString(th));
            SnsMethodCalculate.markEndTimeMs("getRawWaid", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            return "";
        }
    }

    /* renamed from: h */
    public static boolean m40234h() {
        SnsMethodCalculate.markStartTimeMs("isExptWaidEnable", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        boolean z = false;
        try {
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ad_waid_switch, 0) > 0) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("isExptWaidEnable", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            return z;
        } catch (Throwable th) {
            Log.m105920e("ad.waid.WaidHelper", "isExptWaidEnable, exp=" + th.toString());
            SnsMethodCalculate.markEndTimeMs("isExptWaidEnable", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            return false;
        }
    }

    /* renamed from: i */
    public static boolean m40235i() {
        SnsMethodCalculate.markStartTimeMs("isExptWaidNeedUpdate", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        boolean z = false;
        try {
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ad_waid_update_switch, 0) > 0) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("isExptWaidNeedUpdate", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            return z;
        } catch (Throwable th) {
            Log.m105920e("ad.waid.WaidHelper", "isExptWaidNeedUpdate, exp=" + th.toString());
            SnsMethodCalculate.markEndTimeMs("isExptWaidNeedUpdate", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            return false;
        }
    }

    /* renamed from: j */
    public static boolean m40236j() {
        SnsMethodCalculate.markStartTimeMs("isWxEnvInitDone", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        boolean z = C86709a0.m107528h().f251735l && C86709a0.m107523b().mo121114l();
        SnsMethodCalculate.markEndTimeMs("isWxEnvInitDone", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        return z;
    }

    /* renamed from: k */
    public static void m40237k(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("saveKVString", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        if (TextUtils.isEmpty(str)) {
            SnsMethodCalculate.markEndTimeMs("saveKVString", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            return;
        }
        String nullAsNil = Util.nullAsNil(str2);
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("ad_id_kv_pref");
        int f = m40232f();
        if (f >= 10) {
            mmkv.clear().commit();
            Log.m105920e("ad.waid.WaidHelper", "saveKVString, clearKv, kvCOunt=" + f);
        }
        mmkv.edit().putString(str, nullAsNil).commit();
        SnsMethodCalculate.markEndTimeMs("saveKVString", "com.tencent.mm.plugin.sns.waid.WaidHelper");
    }
}
