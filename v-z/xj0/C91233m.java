package xj0;

import com.hilive.mediasdk.MediaSdk;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: xj0.m */
public class C91233m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ JSONObject f261796d;

    /* renamed from: e */
    public final /* synthetic */ C91216b0 f261797e;

    /* renamed from: f */
    public final /* synthetic */ C91237o f261798f;

    /* renamed from: xj0.m$a */
    public class C91234a implements MediaSdk.MediaCallbacker {
        public C91234a() {
        }

        public void onResult(byte[] bArr) {
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                int optInt = jSONObject.optInt("errCode", 601);
                if (optInt == 0) {
                    C91233m.this.f261797e.mo123718a(0, 0, "ok", jSONObject);
                    return;
                }
                C91233m.this.f261797e.mo123718a(1, optInt, String.format("editorExport failed!: errCode: %d", new Object[]{Integer.valueOf(optInt)}), jSONObject);
            } catch (JSONException e) {
                C91216b0 b0Var = C91233m.this.f261797e;
                b0Var.mo123718a(1, -1, "editorExport error: " + e.getMessage(), null);
            } catch (Exception e2) {
                C91216b0 b0Var2 = C91233m.this.f261797e;
                b0Var2.mo123718a(1, -1, "editorExport error: " + e2.getMessage(), null);
            }
        }
    }

    public C91233m(C91237o oVar, JSONObject jSONObject, C91216b0 b0Var) {
        this.f261798f = oVar;
        this.f261796d = jSONObject;
        this.f261797e = b0Var;
    }

    public void run() {
        try {
            Log.m105924i("MicroMsg.GameRecorderMgr", "hy: trigger editorExport " + this.f261796d.toString());
            this.f261798f.f261808c.editorExport(this.f261796d.toString().getBytes(), new C91234a());
        } catch (Exception e) {
            C91216b0 b0Var = this.f261797e;
            b0Var.mo123718a(1, -1, "editorExport error: " + e.getMessage(), null);
        }
    }
}
