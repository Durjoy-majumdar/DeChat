package xj0;

import com.hilive.mediasdk.MediaSdk;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: xj0.k */
public class C91229k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ JSONObject f261788d;

    /* renamed from: e */
    public final /* synthetic */ C91216b0 f261789e;

    /* renamed from: f */
    public final /* synthetic */ C91237o f261790f;

    /* renamed from: xj0.k$a */
    public class C91230a implements MediaSdk.MediaCallbacker {
        public C91230a() {
        }

        public void onResult(byte[] bArr) {
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                int optInt = jSONObject.optInt("errCode", 601);
                if (optInt == 0) {
                    C91229k.this.f261789e.mo123718a(0, 0, "ok", jSONObject);
                    return;
                }
                C91229k.this.f261789e.mo123718a(1, optInt, String.format("editorUpdateTrack failed!: errCode: %d", new Object[]{Integer.valueOf(optInt)}), jSONObject);
            } catch (JSONException e) {
                C91216b0 b0Var = C91229k.this.f261789e;
                b0Var.mo123718a(1, -1, "editorUpdateTrack error: " + e.getMessage(), null);
            } catch (Exception e2) {
                C91216b0 b0Var2 = C91229k.this.f261789e;
                b0Var2.mo123718a(1, -1, "editorUpdateTrack error: " + e2.getMessage(), null);
            }
        }
    }

    public C91229k(C91237o oVar, JSONObject jSONObject, C91216b0 b0Var) {
        this.f261790f = oVar;
        this.f261788d = jSONObject;
        this.f261789e = b0Var;
    }

    public void run() {
        try {
            Log.m105924i("MicroMsg.GameRecorderMgr", "hy: trigger editorUpdateTrack " + this.f261788d.toString());
            this.f261790f.f261808c.editorUpdateTrack(this.f261788d.toString().getBytes(), new C91230a());
        } catch (Exception e) {
            C91216b0 b0Var = this.f261789e;
            b0Var.mo123718a(1, -1, "editorUpdateTrack error: " + e.getMessage(), null);
        }
    }
}
