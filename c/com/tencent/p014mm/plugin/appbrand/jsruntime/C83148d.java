package com.tencent.p014mm.plugin.appbrand.jsruntime;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import com.eclipsesource.mmv8.Releasable;
import com.eclipsesource.mmv8.V8ScriptEvaluateRequest;
import com.eclipsesource.mmv8.V8Value;
import com.tencent.p014mm.appbrand.commonjni.AppBrandJsBridgeBinding;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.appbrand.p942v8.C80678l;
import com.tencent.p014mm.appbrand.p942v8.C80679m;
import com.tencent.p014mm.appbrand.p942v8.IJSRuntime;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83176n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import p774zg.C91687c;
import p774zg.C91708g;
import p774zg.C91714h;
import p774zg.C91716i;
import p774zg.C91726j;
import p774zg.C91728k;
import p774zg.C91741q;
import p774zg.C91742r;
import p774zg.C91744s;
import p774zg.C91745t;
import p774zg.C91746u;
import p774zg.C91747v;
import p774zg.C91748w;
import p774zg.n$$a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsruntime.d */
public abstract class C83148d implements C40480g, C83170k, C83186v, C83181q, C83176n, C83187w, C83172l, C83183s, C83184t {

    /* renamed from: d */
    public C83143a0 f242949d;

    /* renamed from: e */
    public AppBrandJsBridgeBinding f242950e;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsruntime.d$a */
    public class C83149a implements C80669j.C80675f {

        /* renamed from: a */
        public final /* synthetic */ ValueCallback f242951a;

        public C83149a(C83148d dVar, ValueCallback valueCallback) {
            this.f242951a = valueCallback;
        }

        /* renamed from: a */
        public void mo112506a(String str, C80669j.C80676g gVar) {
            this.f242951a.onReceiveValue(str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsruntime.d$b */
    public class C83150b implements C80669j.C80675f {

        /* renamed from: a */
        public final /* synthetic */ ValueCallback f242952a;

        public C83150b(C83148d dVar, ValueCallback valueCallback) {
            this.f242952a = valueCallback;
        }

        /* renamed from: a */
        public void mo112506a(String str, C80669j.C80676g gVar) {
            this.f242952a.onReceiveValue(str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsruntime.d$c */
    public class C83151c implements C80669j.C80675f {

        /* renamed from: a */
        public final /* synthetic */ ValueCallback f242953a;

        public C83151c(C83148d dVar, ValueCallback valueCallback) {
            this.f242953a = valueCallback;
        }

        /* renamed from: a */
        public void mo112506a(String str, C80669j.C80676g gVar) {
            this.f242953a.onReceiveValue(str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsruntime.d$d */
    public class C83152d implements Runnable {
        public C83152d() {
        }

        public void run() {
            AppBrandJsBridgeBinding appBrandJsBridgeBinding = C83148d.this.f242950e;
            if (appBrandJsBridgeBinding != null) {
                appBrandJsBridgeBinding.destroyRuntime();
                C83148d.this.f242950e = null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsruntime.d$e */
    public class C83153e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f242955d;

        /* renamed from: e */
        public final /* synthetic */ String f242956e;

        public C83153e(int i, String str) {
            this.f242955d = i;
            this.f242956e = str;
        }

        public void run() {
            C83148d dVar = C83148d.this;
            if (dVar.f242950e == null) {
                dVar.f242950e = new AppBrandJsBridgeBinding();
                Log.m105925i("MicroMsg.AppBrandJ2V8Context", "nativeCreateRuntime triggered by invokeCallbackHandler callbackId[%d]", Integer.valueOf(this.f242955d));
                C83148d dVar2 = C83148d.this;
                dVar2.f242950e.createRuntime(dVar2.mo115417m(), C83148d.this.mo115393J0());
            }
            C83148d.this.f242950e.invokeCallbackHandler(this.f242955d, this.f242956e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsruntime.d$f */
    public class C83154f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C83176n.C83177a f242958d;

        /* renamed from: e */
        public final /* synthetic */ String f242959e;

        /* renamed from: f */
        public final /* synthetic */ String f242960f;

        /* renamed from: g */
        public final /* synthetic */ int f242961g;

        /* renamed from: h */
        public final /* synthetic */ String f242962h;

        public C83154f(C83176n.C83177a aVar, String str, String str2, int i, String str3) {
            this.f242958d = aVar;
            this.f242959e = str;
            this.f242960f = str2;
            this.f242961g = i;
            this.f242962h = str3;
        }

        public void run() {
            C83176n.C83178b bVar = this.f242958d != null ? new C83176n.C83178b() : null;
            if (bVar != null) {
                bVar.f242986a = System.currentTimeMillis();
            }
            C83148d dVar = C83148d.this;
            if (dVar.f242950e == null) {
                dVar.f242950e = new AppBrandJsBridgeBinding();
                Log.m105924i("MicroMsg.AppBrandJ2V8Context", "nativeCreateRuntime triggered by subscribeHandler");
                C83148d dVar2 = C83148d.this;
                dVar2.f242950e.createRuntime(dVar2.mo115417m(), C83148d.this.mo115393J0());
            }
            C83148d.this.f242950e.subscribeHandler(Util.nullAsNil(this.f242959e), Util.nullAsNil(this.f242960f), this.f242961g, Util.nullAsNil(this.f242962h));
            if (bVar != null) {
                bVar.f242987b = System.currentTimeMillis();
                C81925i2.C81926a aVar = (C81925i2.C81926a) this.f242958d;
                aVar.getClass();
                Log.m105925i("MicroMsg.AppBrandService", "injectConfig end by AddonDirectEvaluation, cost=%dms, hash=%d", Long.valueOf(bVar.f242987b - bVar.f242986a), Integer.valueOf(C81925i2.this.hashCode()));
                C81925i2 i2Var = C81925i2.this;
                C81925i2.C81929d dVar3 = new C81925i2.C81929d((C81925i2.C81926a) null);
                i2Var.f240288G = dVar3;
                dVar3.f240300a = aVar.f240293a;
                dVar3.f240301b = bVar.f242986a;
                dVar3.f240302c = bVar.f242987b;
                dVar3.f240303d = bVar;
            }
        }
    }

    /* renamed from: C0 */
    public void mo115391C0(C83143a0 a0Var) {
        this.f242949d = a0Var;
    }

    /* renamed from: G */
    public void mo115392G(String str, String str2, ValueCallback<String> valueCallback) {
        C80669j u1 = mo115381u1();
        u1.f236041b.mo112450v(new C91748w(u1, str, str2));
    }

    /* renamed from: J */
    public void mo63256J(C40480g gVar, String str) {
        if (gVar instanceof C83148d) {
            C80669j u1 = mo115381u1();
            u1.f236041b.mo112450v(new C91742r(u1, str, ((C83148d) gVar).mo115381u1()));
            return;
        }
        Object[] objArr = new Object[1];
        objArr[0] = gVar == null ? null : gVar.getClass().getName();
        Log.m105921e("MicroMsg.AppBrandJ2V8Context", "shareObject with unsupported implementation %s", objArr);
    }

    /* renamed from: J0 */
    public long mo115393J0() {
        return mo115381u1().mo112501e().getPtr();
    }

    /* renamed from: K */
    public void mo63257K(String str, ValueCallback<Object> valueCallback) {
        C80669j u1 = mo115381u1();
        u1.f236041b.mo112450v(new C91744s(u1, str, valueCallback));
    }

    /* renamed from: K0 */
    public C83143a0 mo115394K0() {
        return this.f242949d;
    }

    /* renamed from: L0 */
    public void mo63258L0(Object obj) {
        C80669j u1 = mo115381u1();
        u1.getClass();
        if (obj instanceof Releasable) {
            u1.f236041b.mo112450v(new C91746u(u1, obj));
        }
    }

    /* renamed from: O */
    public void mo115395O(ArrayList<V8ScriptEvaluateRequest> arrayList, String str, C80669j.C80675f fVar) {
        mo115381u1().mo112498b(arrayList, str, fVar);
    }

    /* renamed from: P0 */
    public void mo63303P0(URL url, String str, String str2, int i, String str3, ValueCallback<String> valueCallback) {
        C83151c cVar;
        ValueCallback<String> valueCallback2 = valueCallback;
        String str4 = null;
        if (valueCallback2 == null) {
            cVar = null;
        } else {
            cVar = new C83151c(this, valueCallback2);
        }
        C80669j u1 = mo115381u1();
        if (url != null) {
            str4 = url.toString();
        }
        u1.f236041b.mo112450v(new C80679m(u1, cVar, i, str3, str4, str, str2));
    }

    /* renamed from: Q0 */
    public int mo115396Q0(int i) {
        C91728k kVar = (C91728k) mo115381u1().f236043d;
        int addAndGet = kVar.f262748a.addAndGet(1);
        C91728k.C91729a aVar = new C91728k.C91729a(i, kVar.f262750c);
        ((HashMap) kVar.f262749b).put(Integer.valueOf(addAndGet), aVar);
        Log.m105925i("MicroMsg.SharedV8ArrayBufferMgr", "create capacity:%d, id:%d", Integer.valueOf(i), Integer.valueOf(addAndGet));
        return addAndGet;
    }

    /* renamed from: R */
    public void mo115397R(URL url, String str, String str2, int i, String str3, C80669j.C80675f fVar) {
        C80669j u1 = mo115381u1();
        u1.f236041b.mo112450v(new C80679m(u1, fVar, i, str3, url == null ? null : url.toString(), str, str2));
    }

    /* renamed from: R0 */
    public void mo63304R0(URL url, String str, ValueCallback<String> valueCallback) {
        if (url == null) {
            evaluateJavascript(str, valueCallback);
            return;
        }
        C83150b bVar = valueCallback == null ? null : new C83150b(this, valueCallback);
        C80669j u1 = mo115381u1();
        u1.f236041b.mo112450v(new C80678l(u1, bVar, str, url.toString()));
    }

    /* renamed from: S */
    public ByteBuffer mo115398S(int i) {
        C91728k kVar = (C91728k) mo115381u1().f236043d;
        if (!((HashMap) kVar.f262749b).containsKey(Integer.valueOf(i))) {
            Log.m105929w("MicroMsg.SharedV8ArrayBufferMgr", "getBackingStore: id %d not exist", Integer.valueOf(i));
            return null;
        }
        return ((C91728k.C91729a) ((HashMap) kVar.f262749b).get(Integer.valueOf(i))).f262752b;
    }

    /* renamed from: T0 */
    public void mo115399T0(String str) {
        C80669j u1 = mo115381u1();
        u1.f236041b.mo112450v(new n$$a(u1, str));
    }

    /* renamed from: U */
    public void mo115400U(int i) {
        ((C91714h) mo115381u1().f236044e).mo125562b(i);
    }

    /* renamed from: U0 */
    public void mo115401U0(int i, ByteBuffer byteBuffer) {
        mo115381u1().f236042c.setBuffer(i, byteBuffer);
    }

    /* renamed from: X0 */
    public final void mo115402X0(int i, String str) {
        mo115380t1().mo112450v(new C83153e(i, str));
    }

    /* renamed from: Y0 */
    public ByteBuffer mo115403Y0(int i) {
        C91716i a = ((C91714h) mo115381u1().f236044e).mo125561a(i);
        if (a == null) {
            return null;
        }
        return a.f262719b;
    }

    /* renamed from: Z */
    public int mo115404Z() {
        return mo115381u1().f236042c.generateId();
    }

    /* renamed from: a */
    public void mo115405a() {
        mo115380t1().mo112435a();
    }

    public void addJavascriptInterface(Object obj, String str) {
        C80669j u1 = mo115381u1();
        Class<JavascriptInterface> cls = JavascriptInterface.class;
        u1.getClass();
        if (!TextUtils.isEmpty(str)) {
            u1.f236041b.mo112450v(new C91741q(u1, obj, str, cls));
        }
    }

    /* renamed from: b1 */
    public boolean mo115406b1() {
        return mo115381u1().f236048i;
    }

    public void bufferStoreBindTo(long j, long j2) {
        mo115381u1().f236042c.bufferStoreBindTo(j, j2);
    }

    /* renamed from: d */
    public boolean mo115408d() {
        return mo115380t1().mo112436d();
    }

    /* renamed from: d1 */
    public int mo115409d1(ByteBuffer byteBuffer, C91708g gVar) {
        C91687c cVar = mo115381u1().f236044e;
        C80669j u1 = mo115381u1();
        C91714h hVar = (C91714h) cVar;
        hVar.getClass();
        C87412m.m108594g(u1, "v8");
        C87412m.m108594g(byteBuffer, "byteBuffer");
        int incrementAndGet = hVar.f262715b.incrementAndGet();
        Integer valueOf = Integer.valueOf(incrementAndGet);
        ((HashMap) hVar.f262714a).put(valueOf, new C91716i(u1, byteBuffer, gVar));
        Log.m105924i("MicroMsg.ShareBufferTracerManager", "trace[" + incrementAndGet + ']');
        return incrementAndGet;
    }

    public void destroy() {
        mo115380t1().mo112450v(new C83152d());
        mo115381u1().mo112499c();
    }

    /* renamed from: e */
    public String mo115410e() {
        return mo115380t1().mo112437e();
    }

    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        mo115381u1().mo112500d(str, valueCallback == null ? null : new C83149a(this, valueCallback));
    }

    /* renamed from: g */
    public void mo115411g(boolean z) {
        mo115380t1().mo112438g(z);
    }

    /* renamed from: h */
    public void mo115412h() {
        mo115380t1().mo112440h();
    }

    /* renamed from: h0 */
    public final void mo115413h0(String str, String str2, int i, String str3) {
        mo115418m1(str, str2, i, str3, (C83176n.C83177a) null);
    }

    /* renamed from: j */
    public long mo115414j() {
        return mo115380t1().mo112442j();
    }

    /* renamed from: j1 */
    public void mo115415j1(int i) {
        C91728k kVar = (C91728k) mo115381u1().f236043d;
        if (!((HashMap) kVar.f262749b).containsKey(Integer.valueOf(i))) {
            Log.m105929w("MicroMsg.SharedV8ArrayBufferMgr", "destroy: id %d not exist", Integer.valueOf(i));
            return;
        }
        Log.m105925i("MicroMsg.SharedV8ArrayBufferMgr", "destroy id:%d", Integer.valueOf(i));
        C91728k.C91729a aVar = (C91728k.C91729a) ((HashMap) kVar.f262749b).get(Integer.valueOf(i));
        aVar.f262751a.f236041b.mo112450v(new C91726j(aVar));
        ((HashMap) kVar.f262749b).remove(Integer.valueOf(i));
    }

    /* renamed from: k0 */
    public void mo63261k0(String str, Object obj) {
        C80669j u1 = mo115381u1();
        u1.getClass();
        if (obj instanceof V8Value) {
            u1.f236041b.mo112450v(new C91745t(u1, str, obj));
        }
    }

    /* renamed from: k1 */
    public ByteBuffer mo115416k1(int i, boolean z) {
        return mo115381u1().f236042c.getBuffer(i, z);
    }

    /* renamed from: m */
    public long mo115417m() {
        return mo115380t1().mo112443m();
    }

    /* renamed from: m1 */
    public final void mo115418m1(String str, String str2, int i, String str3, C83176n.C83177a aVar) {
        mo115380t1().mo112450v(new C83154f(aVar, str, str2, i, str3));
    }

    /* renamed from: n0 */
    public <T extends C40481j> T mo63321n0(Class<T> cls) {
        if (cls.isInstance(this)) {
            return this;
        }
        return null;
    }

    /* renamed from: p */
    public void mo115419p(Runnable runnable, boolean z) {
        mo115380t1().mo112434E(runnable, 0, z);
    }

    public void pause() {
        mo115380t1().pause();
    }

    public void post(Runnable runnable) {
        mo115419p(runnable, false);
    }

    /* renamed from: q */
    public boolean mo115422q() {
        return mo115380t1().mo112441i();
    }

    /* renamed from: q0 */
    public void mo115423q0(Runnable runnable) {
        if (mo115422q()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    /* renamed from: r */
    public void mo115424r() {
        mo115380t1().mo112446r();
    }

    public void releaseDirectByteBuffer(ByteBuffer byteBuffer) {
        mo115381u1().f236042c.releaseDirectByteBuffer(byteBuffer);
    }

    public void resume() {
        mo115380t1().resume();
    }

    /* renamed from: s1 */
    public void mo115426s1(String str) {
        C80669j u1 = mo115381u1();
        u1.f236041b.mo112450v(new C91747v(u1, str));
    }

    public boolean supportBufferStoreBindTo() {
        return mo115381u1().f236042c.supportBufferStoreBindTo();
    }

    /* renamed from: t */
    public void mo115428t(int i) {
        mo115380t1().mo112448t(i);
    }

    /* renamed from: t1 */
    public abstract IJSRuntime mo115380t1();

    /* renamed from: u1 */
    public abstract C80669j mo115381u1();
}
