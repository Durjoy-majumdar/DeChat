package ao2;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: ao2.c */
public class C79617c {

    /* renamed from: a */
    public static HashMap<String, HashMap<String, String>> f233467a = new HashMap<>();

    /* renamed from: b */
    public static HashMap<String, Boolean> f233468b = new HashMap<>();

    /* renamed from: a */
    public static void m96682a(String str) {
        SnsMethodCalculate.markStartTimeMs("checkInit", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (!f233468b.containsKey(str) || !f233468b.get(str).booleanValue()) {
                HashMap hashMap = new HashMap();
                String string = MultiProcessMMKV.getMMKV("sns_ad_mmkv").getString(str, "");
                if (!TextUtils.isEmpty(string)) {
                    JSONObject jSONObject = new JSONObject(string);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String nullAsNil = Util.nullAsNil(jSONObject.optString(next));
                        if (!TextUtils.isEmpty(next)) {
                            hashMap.put(next, nullAsNil);
                        }
                    }
                }
                Log.m105924i("SnsAdLocalStoreage", "checkInit, snsId=" + str + ", value=" + string + ", cost=" + (System.currentTimeMillis() - currentTimeMillis));
                f233467a.put(str, hashMap);
                f233468b.put(str, Boolean.TRUE);
                SnsMethodCalculate.markEndTimeMs("checkInit", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
                return;
            }
            SnsMethodCalculate.markEndTimeMs("checkInit", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
        } catch (Throwable th) {
            Log.m105920e("SnsAdLocalStoreage", "checkInit, exp=" + th.toString());
        }
    }

    /* renamed from: b */
    public static void m96683b() {
        SnsMethodCalculate.markStartTimeMs("clearCache", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
        Log.m105924i("SnsAdLocalStoreage", "clearCache");
        synchronized (f233467a) {
            try {
                f233467a.clear();
                f233468b.clear();
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("clearCache", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
                    throw th;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("clearCache", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
    }

    /* renamed from: c */
    public static String m96684c(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("getAdValue", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
        try {
            if (TextUtils.isEmpty(str2)) {
                SnsMethodCalculate.markEndTimeMs("getAdValue", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
                return "";
            }
            if (TextUtils.isEmpty(str)) {
                str = "default_snsid_123456";
            }
            synchronized (f233467a) {
                m96682a(str);
                HashMap hashMap = f233467a.get(str);
                if (hashMap != null) {
                    String nullAsNil = Util.nullAsNil((String) hashMap.get(str2));
                    SnsMethodCalculate.markEndTimeMs("getAdValue", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
                    return nullAsNil;
                }
            }
        } catch (Throwable th) {
            Log.m105920e("SnsAdLocalStoreage", "getAdValue, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("getAdValue", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
        return "";
    }

    /* renamed from: d */
    public static void m96685d(String str) {
        long currentTimeMillis;
        String str2;
        SnsMethodCalculate.markStartTimeMs("saveAdKV", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
        try {
            currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = f233467a.get(str);
            SnsMethodCalculate.markStartTimeMs("mapToJsonStr", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
            str2 = "{}";
            if (hashMap == null || hashMap.size() == 0) {
                SnsMethodCalculate.markEndTimeMs("mapToJsonStr", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
            } else {
                str2 = new JSONObject(hashMap).toString();
                SnsMethodCalculate.markEndTimeMs("mapToJsonStr", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
            }
        } catch (Throwable th) {
            Log.m105920e("SnsAdLocalStoreage", "saveAdKV, exp=" + th.toString());
        }
        MultiProcessMMKV.getMMKV("sns_ad_mmkv").edit().putString(str, str2).apply();
        Log.m105924i("SnsAdLocalStoreage", "saveAdKV, snsId=" + str + ", cost=" + (System.currentTimeMillis() - currentTimeMillis) + ", value=" + str2);
        SnsMethodCalculate.markEndTimeMs("saveAdKV", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
    }

    /* renamed from: e */
    public static void m96686e(String str, String str2, String str3) {
        SnsMethodCalculate.markStartTimeMs("setAdValue", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
        try {
            if (TextUtils.isEmpty(str2)) {
                SnsMethodCalculate.markEndTimeMs("setAdValue", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
                return;
            }
            if (TextUtils.isEmpty(str)) {
                str = "default_snsid_123456";
            }
            String nullAsNil = Util.nullAsNil(str3);
            synchronized (f233467a) {
                m96682a(str);
                HashMap hashMap = f233467a.get(str);
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                hashMap.put(str2, nullAsNil);
                m96685d(str);
            }
            SnsMethodCalculate.markEndTimeMs("setAdValue", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
        } catch (Throwable th) {
            Log.m105920e("SnsAdLocalStoreage", "setAdValue, exp=" + th.toString());
        }
    }
}
