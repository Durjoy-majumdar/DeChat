package xj0;

import com.hilive.mediasdk.MediaSdk;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: xj0.j */
public class C91227j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ JSONObject f261784d;

    /* renamed from: e */
    public final /* synthetic */ C91216b0 f261785e;

    /* renamed from: f */
    public final /* synthetic */ C91237o f261786f;

    /* renamed from: xj0.j$a */
    public class C91228a implements MediaSdk.MediaCallbacker {
        public C91228a() {
        }

        public void onResult(byte[] bArr) {
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                int optInt = jSONObject.optInt("errCode", 601);
                if (optInt == 0) {
                    C91227j.this.f261785e.mo123718a(0, 0, "ok", jSONObject);
                    return;
                }
                C91227j.this.f261785e.mo123718a(1, optInt, String.format("editorCreateTrack failed!: errCode: %d", new Object[]{Integer.valueOf(optInt)}), jSONObject);
            } catch (JSONException e) {
                C91216b0 b0Var = C91227j.this.f261785e;
                b0Var.mo123718a(1, -1, "editorCreateTrack error: " + e.getMessage(), null);
            } catch (Exception e2) {
                C91216b0 b0Var2 = C91227j.this.f261785e;
                b0Var2.mo123718a(1, -1, "editorCreateTrack error: " + e2.getMessage(), null);
            }
        }
    }

    public C91227j(C91237o oVar, JSONObject jSONObject, C91216b0 b0Var) {
        this.f261786f = oVar;
        this.f261784d = jSONObject;
        this.f261785e = b0Var;
    }

    public void run() {
        try {
            Log.m105924i("MicroMsg.GameRecorderMgr", "hy: trigger editorCreateTrack " + this.f261784d.toString());
            this.f261786f.f261808c.editorAddTrack(this.f261784d.toString().getBytes(), new C91228a());
        } catch (Exception e) {
            C91216b0 b0Var = this.f261785e;
            b0Var.mo123718a(1, -1, "editorCreateTrack error: " + e.getMessage(), null);
        }
    }
}
