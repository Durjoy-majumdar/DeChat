package tt1;

import com.tencent.p014mm.plugin.fingerprint.FingerPrintAuth;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.wallet_core.model.C7088m0;
import org.json.JSONException;
import org.json.JSONObject;
import ot3.C21889m;
import p156gj.C87203t;
import st1.C77761h0;
import st1.C77770n;
import tt3.C22550a;

/* renamed from: tt1.c */
public class C78089c {

    /* renamed from: a */
    public int f228884a = -1;

    /* renamed from: b */
    public int f228885b = 0;

    /* renamed from: c */
    public String f228886c;

    /* renamed from: d */
    public String f228887d;

    /* renamed from: e */
    public String f228888e;

    /* renamed from: f */
    public String f228889f;

    /* renamed from: a */
    public static C78089c m94236a(String str, int i, int i2, int i3, int i4) {
        C78089c cVar = new C78089c();
        cVar.f228884a = i;
        cVar.f228885b = i2;
        cVar.f228886c = FingerPrintAuth.genPayFPEncrypt(C77770n.m93839a(MMApplicationContext.getContext()), C77770n.m93840b(), C87203t.m108273i(), String.valueOf(i2), C7088m0.m7307a(), str, C87203t.m108275k());
        cVar.f228887d = FingerPrintAuth.genOpenFPSign(C77770n.m93839a(MMApplicationContext.getContext()), C77770n.m93840b(), C87203t.m108273i(), cVar.f228886c);
        return cVar;
    }

    /* renamed from: b */
    public static C78089c m94237b(C22550a aVar) {
        C77761h0 h0Var = C77761h0.IML;
        C78089c cVar = new C78089c();
        if (aVar.mo34909a()) {
            C21889m mVar = (C21889m) aVar.f64864c;
            if (mVar != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("json", mVar.f61899j);
                    jSONObject.put("signature", mVar.f61900k);
                    String str = mVar.f61899j;
                    cVar.f228888e = str;
                    String str2 = mVar.f61900k;
                    cVar.f228889f = str2;
                    h0Var.f226593g = mVar;
                    cVar.f228884a = 0;
                    Log.m105925i("MicroMsg.BiometricPayAuthenticationResult", "soter authen result: %s, sign: %s", str, str2);
                } catch (JSONException e) {
                    Log.printErrStackTrace("MicroMsg.BiometricPayAuthenticationResult", e, "", new Object[0]);
                    cVar.f228884a = 3000;
                }
            } else {
                Log.m105920e("MicroMsg.BiometricPayAuthenticationResult", "signature result is null");
                cVar.f228884a = 3000;
            }
        } else {
            int i = aVar.f61886a;
            if (i == 1007 || i == 1027 || i == 1018) {
                Log.m105924i("MicroMsg.BiometricPayAuthenticationResult", "init error, maybe key invalid. remove former key and give suggestion");
                cVar.f228884a = 2007;
                h0Var.f226592f = true;
            } else if (i == 1021 || i == 1022) {
                Log.m105924i("MicroMsg.BiometricPayAuthenticationResult", "too many trial");
                cVar.f228884a = 10308;
            } else if (i == 1020) {
                Log.m105924i("MicroMsg.BiometricPayAuthenticationResult", "user cancelled");
                cVar.f228884a = 2000;
            } else if (i == 1023) {
                Log.m105920e("MicroMsg.BiometricPayAuthenticationResult", "add authenticate task failed");
                cVar.f228884a = 2009;
            } else if (i == 1029) {
                Log.m105920e("MicroMsg.BiometricPayAuthenticationResult", "clicked negative button");
                cVar.f228884a = 2010;
            } else {
                cVar.f228884a = 2005;
            }
        }
        return cVar;
    }
}
