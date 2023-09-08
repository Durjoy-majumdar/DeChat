package p774zg;

import com.eclipsesource.mmv8.MultiContextV8;
import zt3.C119157j;

/* renamed from: zg.y */
public class C91750y implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f262799d;

    /* renamed from: e */
    public final /* synthetic */ C91683a0 f262800e;

    public C91750y(C91683a0 a0Var, String str) {
        this.f262800e = a0Var;
        this.f262799d = str;
    }

    public void run() {
        MultiContextV8 multiContextV8 = this.f262800e.f262676a;
        if (multiContextV8 != null) {
            multiContextV8.waitForDebugger(this.f262799d);
            C91683a0 a0Var = this.f262800e;
            if (a0Var.f262678c == null) {
                a0Var.f262678c = ((C119157j) C119157j.f356862d).mo183872c(new C91686b0(a0Var), 2000, 2000);
                return;
            }
            return;
        }
        throw new IllegalStateException("V8DebuggerHelper v8 null");
    }
}
