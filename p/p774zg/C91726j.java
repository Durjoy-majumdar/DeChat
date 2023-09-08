package p774zg;

import com.eclipsesource.mmv8.SharedV8ArrayBuffer;
import com.tencent.p014mm.sdk.platformtools.Log;
import p774zg.C91728k;

/* renamed from: zg.j */
public class C91726j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C91728k.C91729a f262744d;

    public C91726j(C91728k.C91729a aVar) {
        this.f262744d = aVar;
    }

    public void run() {
        Log.m105924i("MicroMsg.SharedV8ArrayBufferMgr", "SharedBuffer do release");
        SharedV8ArrayBuffer sharedV8ArrayBuffer = this.f262744d.f262753c;
        if (sharedV8ArrayBuffer == null) {
            Log.m105924i("MicroMsg.SharedV8ArrayBufferMgr", "SharedBuffer do release mV8Buffer null");
        } else {
            sharedV8ArrayBuffer.manualRelease();
        }
    }
}
