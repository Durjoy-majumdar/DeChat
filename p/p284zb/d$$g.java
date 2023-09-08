package p284zb;

import org.json.JSONObject;

/* renamed from: zb.d$$g */
public final /* synthetic */ class d$$g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C91633d f262557d;

    /* renamed from: e */
    public final /* synthetic */ Runnable f262558e;

    public /* synthetic */ d$$g(C91633d dVar, Runnable runnable) {
        this.f262557d = dVar;
        this.f262558e = runnable;
    }

    public final void run() {
        C91633d dVar = this.f262557d;
        Runnable runnable = this.f262558e;
        if (dVar.f262538r == null) {
            dVar.mo120922s0("SkiaCanvas", (JSONObject) null);
        }
        if (runnable != null) {
            runnable.run();
        }
    }
}
