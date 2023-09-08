package p774zg;

import com.eclipsesource.mmv8.JavaCallback;
import com.eclipsesource.mmv8.SharedV8ArrayBuffer;
import com.eclipsesource.mmv8.V8Array;
import com.eclipsesource.mmv8.V8ArrayBuffer;
import com.eclipsesource.mmv8.V8Object;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Locale;
import p774zg.C91728k;

/* renamed from: zg.f0 */
public class C91703f0 extends C91688c0 {

    /* renamed from: b */
    public final C91689d f262696b;

    /* renamed from: c */
    public final C91687c f262697c;

    /* renamed from: zg.f0$a */
    public class C91704a implements JavaCallback {
        public C91704a() {
        }

        public Object invoke(V8Object v8Object, V8Array v8Array) {
            if (v8Array.length() < 1 || v8Array.getType(0) != 1) {
                Log.m105928w("MicroMsg.V8DirectApiSharedBuffer", "get invalid parameters");
                return null;
            }
            int integer = v8Array.getInteger(0);
            Log.m105925i("MicroMsg.V8DirectApiSharedBuffer", "get, id:%d", Integer.valueOf(integer));
            C91728k kVar = (C91728k) C91703f0.this.f262696b;
            if (!((HashMap) kVar.f262749b).containsKey(Integer.valueOf(integer))) {
                Log.m105929w("MicroMsg.SharedV8ArrayBufferMgr", "get: id %d not exist", Integer.valueOf(integer));
                return null;
            }
            C91728k.C91729a aVar = (C91728k.C91729a) ((HashMap) kVar.f262749b).get(Integer.valueOf(integer));
            if (aVar.f262753c == null) {
                aVar.f262753c = aVar.f262751a.mo112501e().newSharedV8ArrayBuffer(aVar.f262752b);
            }
            return aVar.f262753c;
        }
    }

    /* renamed from: zg.f0$b */
    public class C91705b implements JavaCallback {

        /* renamed from: a */
        public final /* synthetic */ C80669j f262699a;

        public C91705b(C80669j jVar) {
            this.f262699a = jVar;
        }

        public Object invoke(V8Object v8Object, V8Array v8Array) {
            C91708g gVar = null;
            if (v8Array.length() >= 2 && v8Array.getType(0) == 10 && v8Array.getType(1) == 4) {
                V8ArrayBuffer v8ArrayBuffer = (V8ArrayBuffer) v8Array.get(0);
                String string = v8Array.getString(1);
                C91687c cVar = C91703f0.this.f262697c;
                C80669j jVar = this.f262699a;
                C87412m.m108594g(string, "mode");
                Locale locale = Locale.ROOT;
                String lowerCase = string.toLowerCase(locale);
                C87412m.m108593f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (C87412m.m108589b(lowerCase, "r")) {
                    gVar = C91708g.R;
                } else {
                    String lowerCase2 = string.toLowerCase(locale);
                    C87412m.m108593f(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    if (C87412m.m108589b(lowerCase2, "rw")) {
                        gVar = C91708g.RW;
                    }
                }
                C91714h hVar = (C91714h) cVar;
                hVar.getClass();
                C87412m.m108594g(jVar, "v8");
                C87412m.m108594g(v8ArrayBuffer, "v8ArrayBuffer");
                int incrementAndGet = hVar.f262715b.incrementAndGet();
                Integer valueOf = Integer.valueOf(incrementAndGet);
                ((HashMap) hVar.f262714a).put(valueOf, new C91716i(jVar, v8ArrayBuffer, gVar));
                Log.m105924i("MicroMsg.ShareBufferTracerManager", "trace[" + incrementAndGet + ']');
                Log.m105925i("MicroMsg.V8DirectApiSharedBuffer", "trace, traceId:%d", Integer.valueOf(incrementAndGet));
                return Integer.valueOf(incrementAndGet);
            }
            Log.m105928w("MicroMsg.V8DirectApiSharedBuffer", "get invalid parameters");
            return null;
        }
    }

    /* renamed from: zg.f0$c */
    public class C91706c implements JavaCallback {
        public C91706c() {
        }

        public Object invoke(V8Object v8Object, V8Array v8Array) {
            if (v8Array.length() < 1 || v8Array.getType(0) != 1) {
                Log.m105928w("MicroMsg.V8DirectApiSharedBuffer", "get invalid parameters");
                return null;
            }
            int integer = v8Array.getInteger(0);
            ((C91714h) C91703f0.this.f262697c).mo125562b(integer);
            Log.m105925i("MicroMsg.V8DirectApiSharedBuffer", "untrace, bufferId:%d", Integer.valueOf(integer));
            return null;
        }
    }

    /* renamed from: zg.f0$d */
    public class C91707d implements JavaCallback {
        public C91707d() {
        }

        public Object invoke(V8Object v8Object, V8Array v8Array) {
            SharedV8ArrayBuffer sharedV8ArrayBuffer;
            if (v8Array.length() < 1 || v8Array.getType(0) != 1) {
                Log.m105928w("MicroMsg.V8DirectApiSharedBuffer", "get invalid parameters");
                return null;
            }
            C91716i a = ((C91714h) C91703f0.this.f262697c).mo125561a(v8Array.getInteger(0));
            if (a == null) {
                return null;
            }
            if (a.f262718a == null) {
                if (a.f262720c != C91708g.R || a.f262719b.isReadOnly()) {
                    sharedV8ArrayBuffer = a.f262721d.mo112501e().newSharedV8ArrayBuffer(a.f262719b);
                } else {
                    ByteBuffer asReadOnlyBuffer = a.f262719b.asReadOnlyBuffer();
                    C87412m.m108593f(asReadOnlyBuffer, "mByteBuffer.asReadOnlyBuffer()");
                    a.f262719b = asReadOnlyBuffer;
                    sharedV8ArrayBuffer = a.f262721d.mo112501e().newSharedV8ArrayBuffer(a.f262719b.asReadOnlyBuffer());
                }
                a.f262718a = sharedV8ArrayBuffer;
            }
            V8ArrayBuffer v8ArrayBuffer = a.f262718a;
            C87412m.m108591d(v8ArrayBuffer);
            return v8ArrayBuffer;
        }
    }

    public C91703f0(C91689d dVar, C91687c cVar) {
        super("WeixinArrayBuffer");
        this.f262696b = dVar;
        this.f262697c = cVar;
    }

    /* renamed from: a */
    public void mo125556a() {
        C91714h hVar = (C91714h) this.f262697c;
        hVar.getClass();
        Log.m105924i("MicroMsg.ShareBufferTracerManager", "untraceAll");
        ((HashMap) hVar.f262714a).clear();
    }

    /* renamed from: c */
    public void mo125558c(C80669j jVar, V8Object v8Object) {
        v8Object.registerJavaMethod((JavaCallback) new C91704a(), "get");
        v8Object.registerJavaMethod((JavaCallback) new C91705b(jVar), "trace");
        v8Object.registerJavaMethod((JavaCallback) new C91706c(), "untrace");
        v8Object.registerJavaMethod((JavaCallback) new C91707d(), "getTraceBuffer");
    }
}
