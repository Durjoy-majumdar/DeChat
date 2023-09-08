package p774zg;

import com.eclipsesource.mmv8.JavaVoidCallback;
import com.eclipsesource.mmv8.V8Array;
import com.eclipsesource.mmv8.V8Object;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83145b0;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83147c0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.shareutil.SharePatchInfo;

/* renamed from: zg.e0 */
public class C91695e0 extends C91688c0 {

    /* renamed from: b */
    public C83145b0 f262689b;

    /* renamed from: c */
    public final JavaVoidCallback f262690c = new C91696a(this);

    /* renamed from: zg.e0$a */
    public class C91696a implements JavaVoidCallback {
        public C91696a(C91695e0 e0Var) {
        }

        public void invoke(V8Object v8Object, V8Array v8Array) {
        }
    }

    /* renamed from: zg.e0$b */
    public class C91697b implements JavaVoidCallback {
        public C91697b() {
        }

        public void invoke(V8Object v8Object, V8Array v8Array) {
            C91695e0.m115230d(C91695e0.this, 2, v8Array);
        }
    }

    /* renamed from: zg.e0$c */
    public class C91698c implements JavaVoidCallback {
        public C91698c() {
        }

        public void invoke(V8Object v8Object, V8Array v8Array) {
            C91695e0.m115230d(C91695e0.this, 4, v8Array);
        }
    }

    /* renamed from: zg.e0$d */
    public class C91699d implements JavaVoidCallback {
        public C91699d() {
        }

        public void invoke(V8Object v8Object, V8Array v8Array) {
            C91695e0.m115230d(C91695e0.this, 5, v8Array);
        }
    }

    /* renamed from: zg.e0$e */
    public class C91700e implements JavaVoidCallback {
        public C91700e() {
        }

        public void invoke(V8Object v8Object, V8Array v8Array) {
            String v8Array2 = v8Array.toString();
            Log.m105920e("MicroMsg.J2V8_Console", v8Array2);
            C91695e0.this.mo125559e(6, "MicroMsg.J2V8_Console", v8Array2);
            C83145b0 b0Var = C91695e0.this.f262689b;
            if (b0Var != null) {
                b0Var.mo115388a(v8Array2);
            }
        }
    }

    /* renamed from: zg.e0$f */
    public class C91701f implements JavaVoidCallback {
        public C91701f() {
        }

        public void invoke(V8Object v8Object, V8Array v8Array) {
            C91695e0.m115230d(C91695e0.this, 3, v8Array);
        }
    }

    public C91695e0() {
        super("console");
    }

    /* renamed from: d */
    public static void m115230d(C91695e0 e0Var, int i, V8Array v8Array) {
        e0Var.getClass();
        String v8Array2 = v8Array.toString();
        if (i == 2) {
            Log.m105926v("MicroMsg.J2V8_Console", v8Array2);
        } else if (i == 3) {
            Log.m105918d("MicroMsg.J2V8_Console", v8Array2);
        } else if (i == 4) {
            Log.m105924i("MicroMsg.J2V8_Console", v8Array2);
        } else if (i == 5) {
            Log.m105928w("MicroMsg.J2V8_Console", v8Array2);
        }
        C83145b0 b0Var = e0Var.f262689b;
        if (b0Var instanceof C83147c0) {
            ((C83147c0) b0Var).mo115390b(i, v8Array2);
        }
        e0Var.mo125559e(3, "MicroMsg.J2V8_Console", v8Array2);
    }

    /* renamed from: a */
    public void mo125556a() {
        this.f262689b = null;
    }

    /* renamed from: c */
    public void mo125558c(C80669j jVar, V8Object v8Object) {
        v8Object.registerJavaMethod((JavaVoidCallback) new C91697b(), "log");
        v8Object.registerJavaMethod((JavaVoidCallback) new C91698c(), "info");
        v8Object.registerJavaMethod((JavaVoidCallback) new C91699d(), "warn");
        v8Object.registerJavaMethod((JavaVoidCallback) new C91700e(), "error");
        v8Object.registerJavaMethod((JavaVoidCallback) new C91701f(), "debug");
        v8Object.registerJavaMethod(this.f262690c, "assert");
        v8Object.registerJavaMethod(this.f262690c, "count");
        v8Object.registerJavaMethod(this.f262690c, Scopes.PROFILE);
        v8Object.registerJavaMethod(this.f262690c, "profileEnd");
        v8Object.registerJavaMethod(this.f262690c, "time");
        v8Object.registerJavaMethod(this.f262690c, "timeEnd");
        v8Object.registerJavaMethod(this.f262690c, "timeStamp");
        v8Object.registerJavaMethod(this.f262690c, "takeHeapSnapshot");
        v8Object.registerJavaMethod(this.f262690c, "group");
        v8Object.registerJavaMethod(this.f262690c, "groupCollapsed");
        v8Object.registerJavaMethod(this.f262690c, "groupEnd");
        v8Object.registerJavaMethod(this.f262690c, "clear");
        v8Object.registerJavaMethod(this.f262690c, SharePatchInfo.OAT_DIR);
        v8Object.registerJavaMethod(this.f262690c, "dirxml");
        v8Object.registerJavaMethod(this.f262690c, "table");
        v8Object.registerJavaMethod(this.f262690c, "trace");
    }

    /* renamed from: e */
    public final void mo125559e(int i, String str, String str2) {
        int i2 = i;
        Log.LogImp logImp = C80669j.f236039k;
        if (logImp == null) {
            return;
        }
        if (i2 == 2) {
            logImp.logV(0, str, (String) null, (String) null, 0, 0, 0, 0, str2);
        } else if (i2 == 3) {
            logImp.logD(0, str, (String) null, (String) null, 0, 0, 0, 0, str2);
        } else if (i2 == 4) {
            logImp.logI(0, str, (String) null, (String) null, 0, 0, 0, 0, str2);
        } else if (i2 == 5) {
            logImp.logW(0, str, (String) null, (String) null, 0, 0, 0, 0, str2);
        } else if (i2 == 6) {
            logImp.logE(0, str, (String) null, (String) null, 0, 0, 0, 0, str2);
        }
    }
}
