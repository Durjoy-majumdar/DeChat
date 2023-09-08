package xj0;

import com.hilive.mediasdk.MediaSdk;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: xj0.h */
public class C91223h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ JSONObject f261776d;

    /* renamed from: e */
    public final /* synthetic */ C91216b0 f261777e;

    /* renamed from: f */
    public final /* synthetic */ C91237o f261778f;

    /* renamed from: xj0.h$a */
    public class C91224a implements MediaSdk.MediaCallbacker {
        public C91224a() {
        }

        public void onResult(byte[] bArr) {
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                int optInt = jSONObject.optInt("errCode", 601);
                if (optInt == 0) {
                    C91223h.this.f261777e.mo123718a(0, 0, "ok", jSONObject);
                    return;
                }
                C91223h.this.f261777e.mo123718a(1, optInt, String.format("editorCreate failed!: errCode: %d", new Object[]{Integer.valueOf(optInt)}), jSONObject);
            } catch (JSONException e) {
                C91216b0 b0Var = C91223h.this.f261777e;
                b0Var.mo123718a(1, -1, "editorCreate error: " + e.getMessage(), null);
            } catch (Exception e2) {
                C91216b0 b0Var2 = C91223h.this.f261777e;
                b0Var2.mo123718a(1, -1, "editorCreate error: " + e2.getMessage(), null);
            }
        }
    }

    public C91223h(C91237o oVar, JSONObject jSONObject, C91216b0 b0Var) {
        this.f261778f = oVar;
        this.f261776d = jSONObject;
        this.f261777e = b0Var;
    }

    public void run() {
        try {
            Log.m105924i("MicroMsg.GameRecorderMgr", "hy: trigger editorCreate " + this.f261776d.toString());
            this.f261778f.f261808c.editorCreate(this.f261776d.toString().getBytes(), new C91224a());
        } catch (Exception e) {
            C91216b0 b0Var = this.f261777e;
            b0Var.mo123718a(1, -1, "editorCreate error: " + e.getMessage(), null);
        }
    }
}
