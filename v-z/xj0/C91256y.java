package xj0;

import com.hilive.mediasdk.MediaSdk;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import org.json.JSONException;
import org.json.JSONObject;
import xj0.C91237o;

/* renamed from: xj0.y */
public class C91256y implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f261845d;

    /* renamed from: e */
    public final /* synthetic */ C91216b0 f261846e;

    /* renamed from: f */
    public final /* synthetic */ C91237o f261847f;

    /* renamed from: xj0.y$a */
    public class C91257a implements MediaSdk.MediaCallbacker {
        public C91257a() {
        }

        public void onResult(byte[] bArr) {
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                C91237o.C91239b bVar = new C91237o.C91239b(C91256y.this.f261847f);
                bVar.f261814a = jSONObject.optLong("duration", 0);
                bVar.f261815b = jSONObject.optLong("size", 0);
                Log.m105925i("MicroMsg.GameRecorderMgr", "hy: duration is %d, size is %d", Long.valueOf(bVar.f261814a), Long.valueOf(bVar.f261815b));
                C91256y.this.f261846e.mo123718a(0, 0, "ok", bVar);
            } catch (JSONException e) {
                C91216b0 b0Var = C91256y.this.f261846e;
                b0Var.mo123718a(1, -1, "analysis error: " + e.getMessage(), null);
            } catch (Exception e2) {
                C91216b0 b0Var2 = C91256y.this.f261846e;
                b0Var2.mo123718a(1, -1, "analysis error: " + e2.getMessage(), null);
            }
        }
    }

    public C91256y(C91237o oVar, String str, C91216b0 b0Var) {
        this.f261847f = oVar;
        this.f261845d = str;
        this.f261846e = b0Var;
    }

    public void run() {
        try {
            Log.m105925i("MicroMsg.GameRecorderMgr", "hy: requestAnalyze %s", this.f261845d);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, this.f261845d);
            this.f261847f.f261808c.analysis(jSONObject.toString().getBytes(), new C91257a());
        } catch (JSONException e) {
            C91216b0 b0Var = this.f261846e;
            b0Var.mo123718a(1, -1, "analysis error: " + e.getMessage(), null);
        } catch (Exception e2) {
            C91216b0 b0Var2 = this.f261846e;
            b0Var2.mo123718a(1, -1, "analysis error: " + e2.getMessage(), null);
        }
    }
}
