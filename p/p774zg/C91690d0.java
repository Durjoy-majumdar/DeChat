package p774zg;

import com.eclipsesource.mmv8.JavaCallback;
import com.eclipsesource.mmv8.JavaVoidCallback;
import com.eclipsesource.mmv8.V8Array;
import com.eclipsesource.mmv8.V8ArrayBuffer;
import com.eclipsesource.mmv8.V8Object;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.nio.ByteBuffer;

/* renamed from: zg.d0 */
public class C91690d0 extends C91688c0 {

    /* renamed from: b */
    public C91694e f262684b;

    /* renamed from: zg.d0$a */
    public class C91691a implements JavaCallback {
        public C91691a() {
        }

        public Object invoke(V8Object v8Object, V8Array v8Array) {
            Integer valueOf = Integer.valueOf(C91690d0.this.f262684b.generateId());
            Log.m105919d("V8DirectApiBuffer", "generateId:%d", valueOf);
            return valueOf;
        }
    }

    /* renamed from: zg.d0$b */
    public class C91692b implements JavaCallback {

        /* renamed from: a */
        public final /* synthetic */ C80669j f262686a;

        public C91692b(C80669j jVar) {
            this.f262686a = jVar;
        }

        public Object invoke(V8Object v8Object, V8Array v8Array) {
            if (v8Array.length() < 1 || v8Array.getType(0) != 1) {
                Log.m105928w("V8DirectApiBuffer", "getNativeBuffer invalid parameters");
                return null;
            }
            Log.m105919d("V8DirectApiBuffer", "getNativeBuffer, id:%d", Integer.valueOf(v8Array.getInteger(0)));
            ByteBuffer buffer = C91690d0.this.f262684b.getBuffer(v8Array.getInteger(0), false);
            if (buffer != null) {
                return this.f262686a.mo112501e().newV8ArrayBuffer(buffer);
            }
            Log.m105928w("V8DirectApiBuffer", "getNativeBuffer bb null");
            return null;
        }
    }

    /* renamed from: zg.d0$c */
    public class C91693c implements JavaVoidCallback {
        public C91693c() {
        }

        public void invoke(V8Object v8Object, V8Array v8Array) {
            if (v8Array.length() >= 2 && v8Array.getType(0) == 1 && v8Array.getType(1) == 10) {
                Log.m105919d("V8DirectApiBuffer", "setNativeBuffer, id:%d", Integer.valueOf(v8Array.getInteger(0)));
                V8ArrayBuffer v8ArrayBuffer = (V8ArrayBuffer) v8Array.get(1);
                if (v8ArrayBuffer != null) {
                    C91690d0.this.f262684b.setBuffer(v8Array.getInteger(0), v8ArrayBuffer.getBackingStore());
                    v8ArrayBuffer.release();
                    return;
                }
                Log.m105928w("V8DirectApiBuffer", "setNativeBuffer buffer null");
                return;
            }
            Log.m105928w("V8DirectApiBuffer", "setNativeBuffer invalid parameters");
        }
    }

    public C91690d0(C91694e eVar) {
        this.f262684b = eVar;
    }

    /* renamed from: a */
    public void mo125556a() {
    }

    /* renamed from: c */
    public void mo125558c(C80669j jVar, V8Object v8Object) {
        v8Object.registerJavaMethod((JavaCallback) new C91691a(), "getNativeBufferId");
        v8Object.registerJavaMethod((JavaCallback) new C91692b(jVar), "getNativeBuffer");
        v8Object.registerJavaMethod((JavaVoidCallback) new C91693c(), "setNativeBuffer");
    }
}
