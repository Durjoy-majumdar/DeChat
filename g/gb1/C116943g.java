package gb1;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: gb1.g */
public class C116943g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C116934e f350429d;

    public C116943g(C116934e eVar) {
        this.f350429d = eVar;
    }

    public void run() {
        synchronized (this.f350429d.f350412r) {
            if (!this.f350429d.f350406l) {
                Log.m105928w("MicroMsg.NumberFaceMotion", "hy: not triggered symbol. auto start");
                C116934e eVar = this.f350429d;
                eVar.f350406l = true;
                C116934e.m164974k(eVar);
            } else {
                Log.m105924i("MicroMsg.NumberFaceMotion", "hy: user already start. do nothing");
            }
        }
    }
}
