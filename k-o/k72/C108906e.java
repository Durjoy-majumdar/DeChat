package k72;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: k72.e */
public class C108906e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C108907f f326228d;

    public C108906e(C108907f fVar) {
        this.f326228d = fVar;
    }

    public void run() {
        if (this.f326228d.f326234f != null) {
            Log.m105924i("MicroMsg.MMSightRemuxMediaCodecDecoder", "delay to stop decoder");
            try {
                this.f326228d.f326234f.mo148223z();
                this.f326228d.f326234f.mo148214p();
                this.f326228d.f326234f = null;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.MMSightRemuxMediaCodecDecoder", e, "delay to stop decoder error: %s", e.getMessage());
            }
        }
    }
}
