package p774zg;

import com.eclipsesource.mmv8.V8Value;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: zg.v */
public class C91747v implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f262792d;

    /* renamed from: e */
    public final /* synthetic */ C80669j f262793e;

    public C91747v(C80669j jVar, String str) {
        this.f262793e = jVar;
        this.f262792d = str;
    }

    public void run() {
        this.f262793e.f236041b.mo112453y(this.f262792d);
        C80669j jVar = this.f262793e;
        if (jVar.f236047h != null) {
            Log.m105924i(jVar.f236040a, "waitForDebugger, restore Inspector console");
            this.f262793e.mo112501e().getGlobalObject().add("console", (V8Value) this.f262793e.f236047h);
            this.f262793e.f236048i = false;
        }
    }
}
