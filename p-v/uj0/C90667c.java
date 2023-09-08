package uj0;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import te3.d65;

/* renamed from: uj0.c */
public class C90667c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f260485d;

    /* renamed from: e */
    public final /* synthetic */ String f260486e;

    /* renamed from: f */
    public final /* synthetic */ C90668d f260487f;

    public C90667c(C90668d dVar, int i, String str) {
        this.f260487f = dVar;
        this.f260485d = i;
        this.f260486e = str;
    }

    public void run() {
        try {
            if (!this.f260487f.mo124813e()) {
                Log.m105928w("MicroMsg.WAGameCanvasSecurityGuard", "hy: game extension is null. stop");
                return;
            }
            C90668d dVar = this.f260487f;
            d65 d65 = dVar.f260488a;
            if (d65 != null) {
                if (d65.f182636d) {
                    if (!C90668d.m113651a(dVar)) {
                        Log.m105928w("MicroMsg.WAGameCanvasSecurityGuard", "hy: network not match!");
                        return;
                    }
                    Bitmap bitmap = null;
                    if (this.f260485d <= 0) {
                        bitmap = this.f260487f.mo124812d().mo111245L() != null ? this.f260487f.mo124812d().mo111245L() : this.f260487f.mo124812d().mo111251c().getMagicBrush().f235098n.mo123494c();
                    } else if (this.f260487f.mo124811c().mo116520A1() != null) {
                        bitmap = this.f260487f.mo124811c().mo116520A1().getWebView().getBitmap();
                    } else {
                        Log.m105920e("MicroMsg.WAGameCanvasSecurityGuard", "hy: current html webview is null!!");
                    }
                    if (bitmap != null) {
                        C90668d.m113652b(this.f260487f, this.f260486e, bitmap);
                        return;
                    } else {
                        Log.m105920e("MicroMsg.WAGameCanvasSecurityGuard", "hy: current screen capture is null!!");
                        return;
                    }
                }
            }
            Log.m105928w("MicroMsg.WAGameCanvasSecurityGuard", "hy: no server config or should not do sample!");
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.WAGameCanvasSecurityGuard", th, "hy: exception when trigger event", new Object[0]);
        }
    }
}
