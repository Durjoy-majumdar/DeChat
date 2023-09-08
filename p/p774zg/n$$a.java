package p774zg;

import com.eclipsesource.mmv8.V8Value;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: zg.n$$a */
public final /* synthetic */ class n$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C80669j f262766d;

    /* renamed from: e */
    public final /* synthetic */ String f262767e;

    public /* synthetic */ n$$a(C80669j jVar, String str) {
        this.f262766d = jVar;
        this.f262767e = str;
    }

    public final void run() {
        C80669j jVar = this.f262766d;
        String str = this.f262767e;
        if (jVar.f236047h != null) {
            Log.m105924i(jVar.f236040a, "hangOriginConsoleOnKey, restore Inspector console");
            jVar.mo112501e().getGlobalObject().add(str, (V8Value) jVar.f236047h);
        }
    }
}
