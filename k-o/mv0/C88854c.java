package mv0;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: mv0.c */
public class C88854c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ byte[] f256298d;

    /* renamed from: e */
    public final /* synthetic */ C88850b f256299e;

    public C88854c(C88850b bVar, byte[] bArr) {
        this.f256299e = bVar;
        this.f256298d = bArr;
    }

    public void run() {
        try {
            synchronized (this.f256299e.f256285g) {
                this.f256299e.f256284f.write(this.f256298d);
                this.f256299e.f256284f.flush();
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.BakOldJavaEngine", "send_error %s", e);
            this.f256299e.mo123239e();
            C88850b bVar = this.f256299e;
            bVar.mo123238d(true, 0, 10008, ("send_error " + e).getBytes());
        }
    }
}
