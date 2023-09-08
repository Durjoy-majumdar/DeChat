package p774zg;

import com.eclipsesource.mmv8.MultiContextV8;
import com.tencent.p014mm.appbrand.p942v8.IJSRuntime;
import java.util.concurrent.Future;

/* renamed from: zg.a0 */
public class C91683a0 {

    /* renamed from: a */
    public final MultiContextV8 f262676a;

    /* renamed from: b */
    public final IJSRuntime f262677b;

    /* renamed from: c */
    public Future<?> f262678c;

    /* renamed from: d */
    public final Runnable f262679d = new C91684a();

    /* renamed from: zg.a0$a */
    public class C91684a implements Runnable {
        public C91684a() {
        }

        public void run() {
            C91683a0.this.f262676a.debuggerMessageLoop();
        }
    }

    public C91683a0(MultiContextV8 multiContextV8, IJSRuntime iJSRuntime) {
        this.f262676a = multiContextV8;
        this.f262677b = iJSRuntime;
    }
}
