package xj0;

import com.hilive.mediasdk.MediaSdk;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: xj0.l */
public class C91231l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ JSONObject f261792d;

    /* renamed from: e */
    public final /* synthetic */ C91216b0 f261793e;

    /* renamed from: f */
    public final /* synthetic */ C91237o f261794f;

    /* renamed from: xj0.l$a */
    public class C91232a implements MediaSdk.MediaCallbacker {
        public C91232a() {
        }

        public void onResult(byte[] bArr) {
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                int optInt = jSONObject.optInt("errCode", 601);
                if (optInt == 0) {
                    C91231l.this.f261793e.mo123718a(0, 0, "ok", jSONObject);
                    return;
                }
                C91231l.this.f261793e.mo123718a(1, optInt, String.format("editorRemoveTrack failed!: errCode: %d", new Object[]{Integer.valueOf(optInt)}), jSONObject);
            } catch (JSONException e) {
                C91216b0 b0Var = C91231l.this.f261793e;
                b0Var.mo123718a(1, -1, "editorRemoveTrack error: " + e.getMessage(), null);
            } catch (Exception e2) {
                C91216b0 b0Var2 = C91231l.this.f261793e;
                b0Var2.mo123718a(1, -1, "editorRemoveTrack error: " + e2.getMessage(), null);
            }
        }
    }

    public C91231l(C91237o oVar, JSONObject jSONObject, C91216b0 b0Var) {
        this.f261794f = oVar;
        this.f261792d = jSONObject;
        this.f261793e = b0Var;
    }

    public void run() {
        try {
            Log.m105924i("MicroMsg.GameRecorderMgr", "hy: trigger editorRemoveTrack " + this.f261792d.toString());
            this.f261794f.f261808c.editorDelTrack(this.f261792d.toString().getBytes(), new C91232a());
        } catch (Exception e) {
            C91216b0 b0Var = this.f261793e;
            b0Var.mo123718a(1, -1, "editorRemoveTrack error: " + e.getMessage(), null);
        }
    }
}
