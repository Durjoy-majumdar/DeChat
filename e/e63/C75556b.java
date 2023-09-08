package e63;

import android.content.Context;
import android.content.SharedPreferences;
import b63.C67183e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75592q0;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p823sg.C90193h;
import yq3.C79147d;

/* renamed from: e63.b */
public class C75556b {

    /* renamed from: a */
    public static final String f221973a = C79147d.m95779a();

    /* renamed from: b */
    public static Map<String, String> f221974b = null;

    /* renamed from: a */
    public static String m90591a(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.WalletBankLogoStorage", "getStoragePath: but url is null");
            return null;
        }
        return String.format("%s/%s", new Object[]{f221973a, C90193h.m112878f(str.getBytes())});
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b2 A[SYNTHETIC, Splitter:B:32:0x00b2] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d1 A[SYNTHETIC, Splitter:B:42:0x00d1] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static b63.C67183e m90592b(android.content.Context r13, java.lang.String r14) {
        /*
            java.util.Map<java.lang.String, java.lang.String> r0 = f221974b
            java.lang.String r1 = ""
            r2 = 1
            java.lang.String r3 = "MicroMsg.WalletBankLogoStorage"
            r4 = 0
            if (r0 != 0) goto L_0x0018
            m90594d()
            java.util.Map<java.lang.String, java.lang.String> r0 = f221974b
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r14)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x004b
        L_0x0018:
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r14)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x004b
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r4] = r14
            java.lang.String r5 = "can not get from bankLogoCache %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r0)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r5 = "bank_logo"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r5, r4)
            java.lang.String r0 = r0.getString(r14, r1)
            if (r0 == 0) goto L_0x004b
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r4] = r14
            java.lang.String r6 = "get from sp %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r6, r5)
            java.util.Map<java.lang.String, java.lang.String> r5 = f221974b
            java.util.HashMap r5 = (java.util.HashMap) r5
            r5.put(r14, r0)
        L_0x004b:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r6 = 0
            if (r5 == 0) goto L_0x00dc
            f40.C86709a0.m107528h()
            f40.o r5 = f40.C86709a0.m107535s()
            boolean r5 = r5.mo121147n()
            if (r5 == 0) goto L_0x007a
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            r5.add(r14)
            v53.f r7 = new v53.f
            r7.<init>(r5)
            f40.C86709a0.m107528h()
            f40.g r5 = f40.C86709a0.m107529k()
            ob0.b0 r5 = r5.mo121127b()
            r5.mo123460f(r7)
        L_0x007a:
            java.lang.String r5 = "config/bank_logo.xml"
            java.lang.String r7 = "close"
            android.content.res.AssetManager r13 = r13.getAssets()     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
            java.io.InputStream r13 = r13.open(r5)     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
            int r5 = r13.available()     // Catch:{ Exception -> 0x00a3 }
            byte[] r5 = new byte[r5]     // Catch:{ Exception -> 0x00a3 }
            r13.read(r5)     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r8 = "UTF-8"
            java.lang.String r5 = org.apache.http.util.EncodingUtils.getString(r5, r8)     // Catch:{ Exception -> 0x00a3 }
            r13.close()     // Catch:{ Exception -> 0x0099 }
            goto L_0x00bd
        L_0x0099:
            r13 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r13, r7, r8)
            goto L_0x00bd
        L_0x00a0:
            r14 = move-exception
            r6 = r13
            goto L_0x00cf
        L_0x00a3:
            r5 = move-exception
            goto L_0x00a9
        L_0x00a5:
            r14 = move-exception
            goto L_0x00cf
        L_0x00a7:
            r5 = move-exception
            r13 = r6
        L_0x00a9:
            java.lang.String r8 = "getFromAssets"
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ all -> 0x00a0 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r5, r8, r9)     // Catch:{ all -> 0x00a0 }
            if (r13 == 0) goto L_0x00bc
            r13.close()     // Catch:{ Exception -> 0x00b6 }
            goto L_0x00bc
        L_0x00b6:
            r13 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r13, r7, r5)
        L_0x00bc:
            r5 = r1
        L_0x00bd:
            m90595e(r5)
            java.util.Map<java.lang.String, java.lang.String> r13 = f221974b
            if (r13 == 0) goto L_0x00cd
            java.util.HashMap r13 = (java.util.HashMap) r13
            java.lang.Object r13 = r13.get(r14)
            r0 = r13
            java.lang.String r0 = (java.lang.String) r0
        L_0x00cd:
            r13 = 1
            goto L_0x00dd
        L_0x00cf:
            if (r6 == 0) goto L_0x00db
            r6.close()     // Catch:{ Exception -> 0x00d5 }
            goto L_0x00db
        L_0x00d5:
            r13 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r13, r7, r0)
        L_0x00db:
            throw r14
        L_0x00dc:
            r13 = 0
        L_0x00dd:
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r14 != 0) goto L_0x013b
            b63.e r14 = new b63.e
            r14.<init>()
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0135 }
            r5.<init>(r0)     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r0 = "timestamp"
            r7 = 0
            long r7 = r5.optLong(r0, r7)     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r0 = "logo2x_url"
            java.lang.String r0 = r5.getString(r0)     // Catch:{ JSONException -> 0x0135 }
            r14.f192875a = r0     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r0 = "bg2x_url"
            java.lang.String r0 = r5.getString(r0)     // Catch:{ JSONException -> 0x0135 }
            r14.f192876b = r0     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r0 = "wl2x_url"
            java.lang.String r0 = r5.getString(r0)     // Catch:{ JSONException -> 0x0135 }
            r14.f192877c = r0     // Catch:{ JSONException -> 0x0135 }
            if (r13 != 0) goto L_0x0121
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x0135 }
            r11 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 / r11
            long r9 = r9 - r7
            r7 = 7200(0x1c20, double:3.5573E-320)
            int r13 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r13 <= 0) goto L_0x0120
            goto L_0x0121
        L_0x0120:
            r2 = 0
        L_0x0121:
            r14.f192881g = r2     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r13 = r14.f192875a     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r13 = m90591a(r13)     // Catch:{ JSONException -> 0x0135 }
            r14.f192878d = r13     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r13 = "bank_name_pinyin"
            java.lang.String r13 = r5.optString(r13, r1)     // Catch:{ JSONException -> 0x0135 }
            r14.f192882h = r13     // Catch:{ JSONException -> 0x0135 }
            r6 = r14
            goto L_0x013b
        L_0x0135:
            r13 = move-exception
            java.lang.Object[] r14 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r13, r1, r14)
        L_0x013b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e63.C75556b.m90592b(android.content.Context, java.lang.String):b63.e");
    }

    /* renamed from: c */
    public static C67183e m90593c(Context context, String str, boolean z) {
        if (!z) {
            return m90592b(context, str);
        }
        if (!"CITIC_CREDIT".equals(str)) {
            return null;
        }
        C67183e eVar = new C67183e();
        eVar.f192879e = C0966R.C0969drawable.cez;
        eVar.f192880f = C0966R.C0969drawable.f357421cf1;
        C67183e b = m90592b(context, str);
        if (b == null) {
            return eVar;
        }
        eVar.f192875a = b.f192875a;
        return eVar;
    }

    /* renamed from: d */
    public static void m90594d() {
        f221974b = new HashMap();
        for (Map.Entry next : MMApplicationContext.getContext().getSharedPreferences("bank_logo", 0).getAll().entrySet()) {
            f221974b.put((String) next.getKey(), (String) next.getValue());
        }
    }

    /* renamed from: e */
    public static boolean m90595e(String str) {
        try {
            if (f221974b == null) {
                f221974b = new HashMap();
            }
            Log.m105918d("MicroMsg.WalletBankLogoStorage", "bank logo:" + str);
            SharedPreferences.Editor edit = MMApplicationContext.getContext().getSharedPreferences("bank_logo", 0).edit();
            JSONArray jSONArray = new JSONObject(str).getJSONArray("bank_urls_list");
            int length = jSONArray.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String optString = C75592q0.m90763K() ? jSONObject.optString("bank_desc") : jSONObject.optString("bank_type");
                String jSONObject2 = jSONObject.toString();
                if (Util.isNullOrNil(optString)) {
                    break;
                } else if (Util.isNullOrNil(jSONObject2)) {
                    break;
                } else {
                    edit.putString(optString, jSONObject2);
                    f221974b.put(optString, jSONObject2);
                    i++;
                }
            }
            edit.commit();
            Log.m105918d("MicroMsg.WalletBankLogoStorage", "update BankLogo config file. success!");
            return true;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.WalletBankLogoStorage", "parse band logo error. %s", e.getMessage());
            Log.printErrStackTrace("MicroMsg.WalletBankLogoStorage", e, "", new Object[0]);
            return false;
        }
    }
}
