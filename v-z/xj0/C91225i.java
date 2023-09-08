package xj0;

import com.hilive.mediasdk.MediaSdk;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: xj0.i */
public class C91225i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ JSONObject f261780d;

    /* renamed from: e */
    public final /* synthetic */ C91216b0 f261781e;

    /* renamed from: f */
    public final /* synthetic */ C91237o f261782f;

    /* renamed from: xj0.i$a */
    public class C91226a implements MediaSdk.MediaCallbacker {
        public C91226a() {
        }

        public void onResult(byte[] bArr) {
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                int optInt = jSONObject.optInt("errCode", 601);
                if (optInt == 0) {
                    C91225i.this.f261781e.mo123718a(0, 0, "ok", jSONObject);
                    return;
                }
                C91225i.this.f261781e.mo123718a(1, optInt, String.format("editorGetTrack failed!: errCode: %d", new Object[]{Integer.valueOf(optInt)}), jSONObject);
            } catch (JSONException e) {
                C91216b0 b0Var = C91225i.this.f261781e;
                b0Var.mo123718a(1, -1, "editorGetTrack error: " + e.getMessage(), null);
            } catch (Exception e2) {
                C91216b0 b0Var2 = C91225i.this.f261781e;
                b0Var2.mo123718a(1, -1, "editorGetTrack error: " + e2.getMessage(), null);
            }
        }
    }

    public C91225i(C91237o oVar, JSONObject jSONObject, C91216b0 b0Var) {
        this.f261782f = oVar;
        this.f261780d = jSONObject;
        this.f261781e = b0Var;
    }

    public void run() {
        try {
            Log.m105924i("MicroMsg.GameRecorderMgr", "hy: trigger editorGetTrack " + this.f261780d.toString());
            this.f261782f.f261808c.editorGetTrack(this.f261780d.toString().getBytes(), new C91226a());
        } catch (Exception e) {
            C91216b0 b0Var = this.f261781e;
            b0Var.mo123718a(1, -1, "editorGetTrack error: " + e.getMessage(), null);
        }
    }
}
