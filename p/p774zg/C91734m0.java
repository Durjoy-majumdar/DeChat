package p774zg;

import com.eclipsesource.mmv8.V8Array;
import com.eclipsesource.mmv8.V8Function;
import com.eclipsesource.mmv8.V8ScriptException;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.appbrand.p942v8.C80681o;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: zg.m0 */
public class C91734m0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C80669j f262763d;

    /* renamed from: e */
    public final /* synthetic */ String f262764e;

    /* renamed from: f */
    public final /* synthetic */ C80681o f262765f;

    public C91734m0(C80681o oVar, C80669j jVar, String str) {
        this.f262765f = oVar;
        this.f262763d = jVar;
        this.f262764e = str;
    }

    public void run() {
        C80681o oVar = this.f262765f;
        C80669j jVar = this.f262763d;
        String str = this.f262764e;
        oVar.getClass();
        if (jVar.mo112501e().getType("onmessage") == 7) {
            try {
                V8Function v8Function = (V8Function) jVar.mo112501e().get("onmessage");
                V8Array newV8Array = jVar.mo112501e().newV8Array();
                newV8Array.push(str);
                v8Function.call(jVar.mo112501e().getGlobalObject(), newV8Array);
                v8Function.release();
                newV8Array.release();
            } catch (V8ScriptException e) {
                Log.printErrStackTrace("MicroMsg.V8EngineWorkerManager", e, "hy: js exception in worker!", new Object[0]);
                oVar.mo112517g(jVar, e.getMessage(), e.getJSStackTrace());
            }
        }
    }
}
