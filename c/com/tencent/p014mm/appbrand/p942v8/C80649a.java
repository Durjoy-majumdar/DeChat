package com.tencent.p014mm.appbrand.p942v8;

import android.os.Process;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.camera.core.FocusMeteringAction;
import com.eclipsesource.mmv8.MultiContextV8;
import com.eclipsesource.mmv8.V8Context;
import com.eclipsesource.mmv8.V8ScriptException;
import com.eclipsesource.mmv8.snapshot.CreateSnapshotResult;
import com.eclipsesource.mmv8.utils.MemoryManager;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.appbrand.p942v8.IJSRuntime;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83164h;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import junit.framework.Assert;
import p774zg.C91683a0;
import p774zg.C91694e;
import p774zg.C91727j0;
import p774zg.C91743r0;
import p774zg.C91750y;
import p774zg.C91751z;
import p774zg.a$$a;

/* renamed from: com.tencent.mm.appbrand.v8.a */
public abstract class C80649a implements IJSRuntime {

    /* renamed from: w */
    public static final AtomicInteger f235990w = new AtomicInteger(0);

    /* renamed from: x */
    public static Runnable f235991x = new C80650a();

    /* renamed from: a */
    public MultiContextV8 f235992a;

    /* renamed from: b */
    public C80656d f235993b;

    /* renamed from: c */
    public CountDownLatch f235994c;

    /* renamed from: d */
    public MemoryManager f235995d;

    /* renamed from: e */
    public C91743r0 f235996e;

    /* renamed from: f */
    public C91694e f235997f;

    /* renamed from: g */
    public String f235998g = "RuntimeLooper";

    /* renamed from: h */
    public String f235999h;

    /* renamed from: i */
    public byte[] f236000i;

    /* renamed from: j */
    public String f236001j;

    /* renamed from: k */
    public boolean f236002k;

    /* renamed from: l */
    public int f236003l = CreateSnapshotResult.Success.INVALID_CONTEXT_INDEX;

    /* renamed from: m */
    public boolean f236004m;

    /* renamed from: n */
    public boolean f236005n;

    /* renamed from: o */
    public volatile int f236006o = -1;

    /* renamed from: p */
    public final boolean f236007p;

    /* renamed from: q */
    public final boolean f236008q;

    /* renamed from: r */
    public int f236009r = 0;

    /* renamed from: s */
    public final SparseArray<C83164h> f236010s;

    /* renamed from: t */
    public final ConcurrentLinkedQueue<Runnable> f236011t;

    /* renamed from: u */
    public final IJSRuntime.Config f236012u;

    /* renamed from: v */
    public final boolean[] f236013v = new boolean[1];

    /* renamed from: com.tencent.mm.appbrand.v8.a$a */
    public class C80650a implements Runnable {
        public void run() {
        }
    }

    /* renamed from: com.tencent.mm.appbrand.v8.a$b */
    public class C80651b implements C80669j.C80674e {

        /* renamed from: a */
        public final /* synthetic */ int f236014a;

        public C80651b(int i) {
            this.f236014a = i;
        }

        /* renamed from: a */
        public V8Context mo112475a() {
            MultiContextV8 multiContextV8 = C80649a.this.f235992a;
            if (multiContextV8 != null) {
                return multiContextV8.createContext(this.f236014a);
            }
            throw new IllegalStateException("createContext mV8 not ready!");
        }
    }

    /* renamed from: com.tencent.mm.appbrand.v8.a$c */
    public class C80652c implements C80669j.C80674e {

        /* renamed from: a */
        public final /* synthetic */ int f236016a;

        /* renamed from: b */
        public final /* synthetic */ int f236017b;

        public C80652c(int i, int i2) {
            this.f236016a = i;
            this.f236017b = i2;
        }

        /* renamed from: a */
        public V8Context mo112475a() {
            MultiContextV8 multiContextV8 = C80649a.this.f235992a;
            if (multiContextV8 != null) {
                return multiContextV8.createContextFromSnapshot(this.f236016a, this.f236017b);
            }
            throw new IllegalStateException("createContext mV8 not ready!");
        }
    }

    public C80649a(IJSRuntime.Config config) {
        if (config != null) {
            if (!TextUtils.isEmpty(config.f235973a)) {
                config.f235973a = C86013q1.m106448i(config.f235973a, true);
            }
            this.f235999h = config.f235973a;
            this.f236000i = config.f235976d;
            this.f236001j = config.f235974b;
            this.f236002k = config.f235975c;
            this.f236003l = config.f235977e;
            this.f236007p = config.useNativeBufferJNI();
            this.f236005n = config.f235980h;
            this.f236008q = config.f235981i;
            this.f235997f = config.f235987o;
            if (!Util.isNullOrNil(config.f235983k)) {
                this.f235998g = config.f235983k;
            }
            this.f236004m = config.f235985m;
        } else {
            this.f236007p = false;
            this.f236008q = false;
        }
        this.f236012u = config == null ? new IJSRuntime.Config() : config;
        Object[] objArr = new Object[3];
        objArr[0] = Boolean.valueOf(this.f236007p);
        objArr[1] = Boolean.valueOf(this.f236008q);
        objArr[2] = config != null ? config.toString() : "";
        Log.m105925i("MicroMsg.AbstractJSRuntime", "<init> hy: use native buffer: %b, hasGlobalTimer: %b, config: %s", objArr);
        this.f236010s = new SparseArray<>();
        this.f236011t = new ConcurrentLinkedQueue<>();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f235994c = new CountDownLatch(1);
        Log.m105924i("MicroMsg.AbstractJSRuntime", "startLooper");
        new C80653b(this, String.format(Locale.US, "JS%s#%d", new Object[]{this.f235998g, Integer.valueOf(f235990w.getAndIncrement())}), countDownLatch).start();
        try {
            countDownLatch.await(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Log.m105925i("MicroMsg.AbstractJSRuntime", "init latch.await InterruptedException:%s", e);
        }
    }

    /* renamed from: A */
    public final void mo112430A(int i, C83164h hVar) {
        if (this.f236006o < 0) {
            Log.m105921e("MicroMsg.AbstractJSRuntime", "setJsExceptionHandler after destroyed, JsRuntime[%d] stack=%s", Integer.valueOf(hashCode()), android.util.Log.getStackTraceString(new Throwable()));
            return;
        }
        Log.m105925i("MicroMsg.AbstractJSRuntime", "setJsExceptionHandler contextId[%d] JsRuntime[%d] JSThread.id[%d], currentThread.id[%d]", Integer.valueOf(i), Integer.valueOf(hashCode()), Integer.valueOf(this.f236006o), Long.valueOf(Thread.currentThread().getId()));
        synchronized (this.f236010s) {
            this.f236010s.put(i, hVar);
        }
    }

    /* renamed from: B */
    public C80669j mo112431B(int i, int i2) {
        return new C80669j(this, mo112469c(), new C80652c(i, i2));
    }

    /* renamed from: C */
    public C80669j mo112432C(int i) {
        Log.m105925i("MicroMsg.AbstractJSRuntime", "createMainContext, contextTag: %d, mainContextSnapshotIndex: %d", Integer.valueOf(i), Integer.valueOf(this.f236003l));
        int i2 = CreateSnapshotResult.Success.INVALID_CONTEXT_INDEX;
        int i3 = this.f236003l;
        return i2 != i3 ? mo112431B(i, i3) : mo112451w(i);
    }

    /* renamed from: D */
    public void mo112433D(Runnable runnable, long j) {
        mo112434E(runnable, j, false);
    }

    /* renamed from: E */
    public void mo112434E(Runnable runnable, long j, boolean z) {
        mo112470f();
        this.f235993b.mo112478b(runnable, j, z);
    }

    /* renamed from: a */
    public void mo112435a() {
        this.f235993b.mo112477a();
    }

    /* renamed from: b */
    public abstract void mo112468b();

    /* renamed from: c */
    public C91694e mo112469c() {
        if (this.f235997f == null) {
            if (this.f236007p) {
                Log.m105924i("MicroMsg.AbstractJSRuntime", "hy: start load native buffer jni");
                this.f235997f = new NativeBufferJNI();
            } else {
                this.f235997f = new C91727j0();
            }
        }
        return this.f235997f;
    }

    /* renamed from: d */
    public boolean mo112436d() {
        return this.f235993b.mo112480d();
    }

    /* renamed from: e */
    public String mo112437e() {
        return this.f235993b.mo112481e();
    }

    /* renamed from: f */
    public final void mo112470f() {
        if (this.f235993b == null && this.f235994c != null) {
            Log.m105924i("MicroMsg.AbstractJSRuntime", "scheduleToJSThread but looper null");
            try {
                this.f235994c.await(30000, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                Log.m105925i("MicroMsg.AbstractJSRuntime", "scheduleToJSThread latch.await InterruptedException:%s", e);
            }
            Log.m105924i("MicroMsg.AbstractJSRuntime", "scheduleToJSThread but looper assigned");
        }
        if (this.f235993b == null) {
            f235991x.run();
            if (this.f235993b == null) {
                throw new IllegalStateException("JSRuntime not ready!");
            }
        }
    }

    /* renamed from: g */
    public void mo112438g(boolean z) {
        this.f235993b.mo112483g(z);
    }

    public IJSRuntime.Config getConfig() {
        return this.f236012u;
    }

    /* renamed from: h */
    public void mo112440h() {
        this.f235993b.mo112484h(new a$$a(this), true);
    }

    /* renamed from: i */
    public boolean mo112441i() {
        return this.f235993b.mo112485i();
    }

    /* renamed from: j */
    public long mo112442j() {
        return this.f235992a.getUVLoopPtr();
    }

    /* renamed from: k */
    public abstract C80656d mo112471k();

    /* renamed from: l */
    public abstract MultiContextV8 mo112472l();

    /* renamed from: m */
    public long mo112443m() {
        return this.f235992a.getIsolatePtr();
    }

    /* renamed from: n */
    public final void mo112473n(V8ScriptException v8ScriptException) {
        C83164h hVar;
        synchronized (this.f236010s) {
            hVar = this.f236010s.get(v8ScriptException.getContextTag());
        }
        if (hVar != null) {
            hVar.mo69211a(v8ScriptException.getJSMessage(), v8ScriptException.getJSStackTrace());
            return;
        }
        Log.m105929w("MicroMsg.AbstractJSRuntime", "publishJSException jsHandler null %s", v8ScriptException);
    }

    public void pause() {
        this.f235993b.pause();
    }

    public void quit() {
        Log.m105925i("MicroMsg.AbstractJSRuntime", "quit() JsRuntime[%d]", Integer.valueOf(hashCode()));
        this.f235993b.quit();
        this.f236006o = -1;
    }

    /* renamed from: r */
    public void mo112446r() {
        MultiContextV8 multiContextV8 = this.f235992a;
        if (multiContextV8 != null) {
            multiContextV8.markSnapshotNotNeed();
        }
    }

    public void resume() {
        this.f235993b.resume();
    }

    /* renamed from: t */
    public void mo112448t(int i) {
        int i2 = this.f236006o;
        if (i2 > 0) {
            try {
                Process.setThreadPriority(i2, i);
                Log.m105919d("MicroMsg.AbstractJSRuntime", "setThreadPriority priority=%d tid=%d", Integer.valueOf(i), Integer.valueOf(i2));
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AbstractJSRuntime", e, "setThreadPriority priority=%d tid=%d", Integer.valueOf(i), Integer.valueOf(i2));
            }
        }
    }

    /* renamed from: u */
    public final void mo112449u(int i) {
        Assert.assertTrue(i >= 0);
        this.f236009r = i;
        MultiContextV8 multiContextV8 = this.f235992a;
        if (multiContextV8 != null) {
            multiContextV8.setMinimalCodeLength(i);
        }
    }

    /* renamed from: v */
    public void mo112450v(Runnable runnable) {
        mo112454z(runnable, false);
    }

    /* renamed from: w */
    public C80669j mo112451w(int i) {
        return new C80669j(this, mo112469c(), new C80651b(i));
    }

    /* renamed from: x */
    public void mo112452x(Runnable runnable) {
        this.f236011t.add(runnable);
    }

    /* renamed from: y */
    public void mo112453y(String str) {
        C91683a0 a0Var = new C91683a0(this.f235992a, this);
        mo112450v(new C91750y(a0Var, str));
        mo112452x(new C91751z(a0Var));
    }

    /* renamed from: z */
    public void mo112454z(Runnable runnable, boolean z) {
        mo112470f();
        this.f235993b.mo112484h(runnable, z);
    }
}
