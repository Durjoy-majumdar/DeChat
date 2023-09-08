package p774zg;

import com.eclipsesource.mmv8.V8Array;
import com.eclipsesource.mmv8.V8Function;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.sdk.platformtools.Log;
import p774zg.C91709g0;

/* renamed from: zg.h0 */
public class C91715h0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ V8Function f262716d;

    /* renamed from: e */
    public final /* synthetic */ C80669j f262717e;

    public C91715h0(C91709g0.C91713d dVar, V8Function v8Function, C80669j jVar) {
        this.f262716d = v8Function;
        this.f262717e = jVar;
    }

    public void run() {
        if (!this.f262716d.isReleased()) {
            Log.m105918d("MicroMsg.V8DirectApiSharedBufferLock", "hy: trigger task call");
            this.f262716d.call(this.f262717e.mo112501e().getGlobalObject(), (V8Array) null);
            this.f262716d.release();
            return;
        }
        Log.m105928w("MicroMsg.V8DirectApiSharedBufferLock", "hy: called a released task");
    }
}
