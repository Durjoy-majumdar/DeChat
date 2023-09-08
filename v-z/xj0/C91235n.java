package xj0;

import com.hilive.mediasdk.MediaSdk;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: xj0.n */
public class C91235n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ JSONObject f261800d;

    /* renamed from: e */
    public final /* synthetic */ C91216b0 f261801e;

    /* renamed from: f */
    public final /* synthetic */ C91237o f261802f;

    /* renamed from: xj0.n$a */
    public class C91236a implements MediaSdk.MediaCallbacker {
        public C91236a() {
        }

        public void onResult(byte[] bArr) {
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                int optInt = jSONObject.optInt("errCode", 601);
                if (optInt == 0) {
                    C91235n.this.f261801e.mo123718a(0, 0, "ok", jSONObject);
                    return;
                }
                C91235n.this.f261801e.mo123718a(1, optInt, String.format("editorRemove failed!: errCode: %d", new Object[]{Integer.valueOf(optInt)}), jSONObject);
            } catch (JSONException e) {
                C91216b0 b0Var = C91235n.this.f261801e;
                b0Var.mo123718a(1, -1, "editorRemove error: " + e.getMessage(), null);
            } catch (Exception e2) {
                C91216b0 b0Var2 = C91235n.this.f261801e;
                b0Var2.mo123718a(1, -1, "editorRemove error: " + e2.getMessage(), null);
            }
        }
    }

    public C91235n(C91237o oVar, JSONObject jSONObject, C91216b0 b0Var) {
        this.f261802f = oVar;
        this.f261800d = jSONObject;
        this.f261801e = b0Var;
    }

    public void run() {
        try {
            Log.m105924i("MicroMsg.GameRecorderMgr", "hy: trigger editorRemove " + this.f261800d.toString());
            this.f261802f.f261808c.editorRemove(this.f261800d.toString().getBytes(), new C91236a());
        } catch (Exception e) {
            C91216b0 b0Var = this.f261801e;
            b0Var.mo123718a(1, -1, "editorRemove error: " + e.getMessage(), null);
        }
    }
}
