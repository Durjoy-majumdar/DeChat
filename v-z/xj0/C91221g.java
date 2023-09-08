package xj0;

import com.hilive.mediasdk.MediaSdk;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: xj0.g */
public class C91221g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ JSONObject f261772d;

    /* renamed from: e */
    public final /* synthetic */ C91216b0 f261773e;

    /* renamed from: f */
    public final /* synthetic */ C91237o f261774f;

    /* renamed from: xj0.g$a */
    public class C91222a implements MediaSdk.MediaCallbacker {
        public C91222a() {
        }

        public void onResult(byte[] bArr) {
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                int optInt = jSONObject.optInt("errCode", 601);
                if (optInt == 0) {
                    C91221g.this.f261773e.mo123718a(0, 0, "ok", jSONObject);
                    return;
                }
                C91221g.this.f261773e.mo123718a(1, optInt, String.format("remux failed!: errCode: %d", new Object[]{Integer.valueOf(optInt)}), jSONObject);
            } catch (JSONException e) {
                C91216b0 b0Var = C91221g.this.f261773e;
                b0Var.mo123718a(1, -1, "remux error: " + e.getMessage(), new JSONObject());
            } catch (Exception e2) {
                C91216b0 b0Var2 = C91221g.this.f261773e;
                b0Var2.mo123718a(1, -1, "remux error: " + e2.getMessage(), new JSONObject());
            }
        }
    }

    public C91221g(C91237o oVar, JSONObject jSONObject, C91216b0 b0Var) {
        this.f261774f = oVar;
        this.f261772d = jSONObject;
        this.f261773e = b0Var;
    }

    public void run() {
        try {
            Log.m105924i("MicroMsg.GameRecorderMgr", "hy: trigger remux " + this.f261772d.toString());
            this.f261774f.f261808c.remux(this.f261772d.toString().getBytes(), new C91222a());
        } catch (Exception e) {
            C91216b0 b0Var = this.f261773e;
            b0Var.mo123718a(1, -1, "remux error: " + e.getMessage(), new JSONObject());
        }
    }
}
