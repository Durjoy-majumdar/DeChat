package p774zg;

import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83145b0;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;

/* renamed from: zg.x */
public class C91749x implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C83145b0 f262797d;

    /* renamed from: e */
    public final /* synthetic */ C80669j f262798e;

    public C91749x(C80669j jVar, C83145b0 b0Var) {
        this.f262798e = jVar;
        this.f262797d = b0Var;
    }

    public void run() {
        boolean z;
        Iterator<C91688c0> it = this.f262798e.f236045f.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            C91688c0 next = it.next();
            if (next instanceof C91695e0) {
                ((C91695e0) next).f262689b = this.f262797d;
                z = true;
                break;
            }
        }
        if (this.f262797d != null && !z) {
            Log.m105924i("MicroMsg.J2V8.V8ContextEngine", "setConsoleCallback, inject V8DirectApiConsole");
            C91695e0 e0Var = new C91695e0();
            e0Var.mo125557b(this.f262798e);
            e0Var.f262689b = this.f262797d;
            this.f262798e.f236045f.add(e0Var);
        }
    }
}
