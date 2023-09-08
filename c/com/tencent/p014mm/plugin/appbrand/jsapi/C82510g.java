package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.webkit.ValueCallback;
import androidx.lifecycle.C0125s;
import b34.C79664a;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81461w;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1807j0;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83176n;
import com.tencent.p014mm.plugin.appbrand.utils.C84782s1;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import eu3.C58834h;
import eu3.C97749e;
import fu3.C116901a;
import gt0.C87375o0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import k40.C88078d;
import k40.C88080e;
import org.json.JSONObject;
import p1038ta.C90383b;
import p224ra.C12964b;
import p224ra.C36266d;
import p224ra.C89909e;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.g */
public abstract class C82510g implements C82381f {

    /* renamed from: d */
    public final Object f241582d = new byte[0];

    /* renamed from: e */
    public C83165i f241583e;

    /* renamed from: f */
    public C82865o f241584f = mo114839G();

    /* renamed from: g */
    public C116901a f241585g;

    /* renamed from: h */
    public final Map<String, C82870p> f241586h = new ConcurrentHashMap();

    /* renamed from: i */
    public final AtomicBoolean f241587i = new AtomicBoolean(false);

    /* renamed from: j */
    public volatile C82381f.C82384c f241588j;

    /* renamed from: n */
    public C81415h0 f241589n = new C81461w();

    /* renamed from: o */
    public final ConcurrentLinkedDeque<C1727m> f241590o = new ConcurrentLinkedDeque<>();

    /* renamed from: p */
    public final LinkedHashSet<C82835n> f241591p = new LinkedHashSet<>();

    /* renamed from: q */
    public final C88078d f241592q = new C88078d();

    /* renamed from: r */
    public boolean f241593r;

    /* renamed from: s */
    public final SparseArray<C40482o> f241594s = new SparseArray<>(5);

    /* renamed from: t */
    public C82381f.C82382a f241595t = new C82511a();

    /* renamed from: u */
    public boolean f241596u = false;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.g$a */
    public class C82511a implements C82381f.C82382a {
        public C82511a() {
        }

        /* renamed from: b */
        public boolean mo114784b(String str, C40482o oVar) {
            return C82510g.this.isRunning();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.g$b */
    public class C82512b implements C90383b.C90384a {
        public C82512b() {
        }

        /* renamed from: a */
        public <T extends C36266d> void mo114852a(Class<T> cls, T t) {
        }

        /* renamed from: b */
        public <T extends C12964b> void mo114853b(Class<T> cls, T t) {
            if (cls == null || t == null) {
                Log.m105929w("MicroMsg.AppBrandComponentImpl", "registerCustomize failed, clazz(%s) or customize(%s) is null.", cls, t);
                return;
            }
            C88078d dVar = C82510g.this.f241592q;
            dVar.getClass();
            dVar.mo122504a(cls, new C88080e(t));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.g$c */
    public class C82513c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C82870p f241599d;

        /* renamed from: e */
        public final /* synthetic */ String f241600e;

        /* renamed from: f */
        public final /* synthetic */ String f241601f;

        /* renamed from: g */
        public final /* synthetic */ int f241602g;

        /* renamed from: h */
        public final /* synthetic */ C40482o f241603h;

        public C82513c(C82870p pVar, String str, String str2, int i, C40482o oVar) {
            this.f241599d = pVar;
            this.f241600e = str;
            this.f241601f = str2;
            this.f241602g = i;
            this.f241603h = oVar;
        }

        public void run() {
            C82510g gVar = C82510g.this;
            gVar.mo114843N(this.f241599d, this.f241600e, this.f241601f, this.f241602g, this.f241603h, gVar.mo114840K().getLooper());
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.g$d */
    public class C82514d extends C82639m0 {

        /* renamed from: b */
        public final /* synthetic */ String f241605b;

        /* renamed from: c */
        public final /* synthetic */ C82870p f241606c;

        /* renamed from: d */
        public final /* synthetic */ String f241607d;

        /* renamed from: e */
        public final /* synthetic */ int f241608e;

        /* renamed from: f */
        public final /* synthetic */ C40482o f241609f;

        /* renamed from: g */
        public final /* synthetic */ Looper f241610g;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.g$d$a */
        public class C82515a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C82639m0 f241612d;

            public C82515a(C82514d dVar, C82639m0 m0Var) {
                this.f241612d = m0Var;
            }

            public void run() {
                this.f241612d.proceed();
            }
        }

        public C82514d(String str, C82870p pVar, String str2, int i, C40482o oVar, Looper looper) {
            this.f241605b = str;
            this.f241606c = pVar;
            this.f241607d = str2;
            this.f241608e = i;
            this.f241609f = oVar;
            this.f241610g = looper;
        }

        /* renamed from: a */
        public void mo114785a(String str) {
            if (TextUtils.isEmpty(this.f241799a) && !TextUtils.isEmpty(str)) {
                this.f241799a = str;
                C82510g gVar = C82510g.this;
                int i = this.f241608e;
                C40482o oVar = this.f241609f;
                if (oVar == null) {
                    oVar = gVar.getJsRuntime();
                }
                gVar.mo114838E(i, str, oVar);
            }
        }

        public void proceed() {
            String str;
            if (this.f241606c.mo114779e().equals(C1807j0.NAME)) {
                Log.m105924i("MicroMsg.AppBrandComponentImpl", "proceed requestPersonalPay  TextUtils.isEmpty(getResult()):" + String.valueOf(TextUtils.isEmpty(this.f241799a)));
            }
            if (TextUtils.isEmpty(this.f241799a)) {
                Looper looper = this.f241610g;
                if (looper == null || looper == Looper.myLooper()) {
                    boolean b = C82510g.this.mo109648b(this.f241606c.mo114779e(), this.f241609f);
                    if (!b) {
                        Log.m105921e("MicroMsg.AppBrandComponentImpl", "invoke handler.proceed() log[%s] api[%s], callbackId[%d], component not running", C82510g.this.mo114327C(), this.f241606c, Integer.valueOf(this.f241608e));
                    }
                    if (b) {
                        try {
                            JSONObject D = C82510g.m101278D(C82510g.this, this.f241605b);
                            if (this.f241606c.mo114779e().equals(C1807j0.NAME)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("invokeImpl requestPersonalPay data==null:");
                                sb.append(String.valueOf(D == null));
                                Log.m105924i("MicroMsg.AppBrandComponentImpl", sb.toString());
                            }
                            JSONObject jSONObject = null;
                            try {
                                if (!TextUtils.isEmpty(this.f241607d)) {
                                    jSONObject = C82510g.m101278D(C82510g.this, this.f241607d.trim());
                                }
                                str = D == null ? this.f241606c.mo115109j("fail:invalid data") : C82510g.this.mo114846R(this.f241606c, D, jSONObject, this.f241608e, this.f241609f);
                                C82510g gVar = C82510g.this;
                                C82870p pVar = this.f241606c;
                                String str2 = this.f241605b;
                                String str3 = this.f241607d;
                                int i = this.f241608e;
                                C82381f.C82384c cVar = gVar.f241588j;
                                if (cVar != null) {
                                    cVar.mo114217a(pVar, str2, str3, i, str);
                                }
                            } catch (OutOfMemoryError e) {
                                Log.m105921e("MicroMsg.AppBrandComponentImpl", "invokeImpl() parsePrivateDataStr, api[%s], privateData.length[%d]", this.f241606c.mo114779e(), Integer.valueOf(Util.nullAsNil(this.f241607d).length()));
                                throw e;
                            }
                        } catch (OutOfMemoryError e2) {
                            Log.m105921e("MicroMsg.AppBrandComponentImpl", "invokeImpl() parseDataStr oom, api[%s], data_length[%d]", this.f241606c.mo114779e(), Integer.valueOf(Util.nullAsNil(this.f241605b).length()));
                            throw e2;
                        }
                    } else {
                        str = this.f241606c.mo115109j("fail:interrupted");
                    }
                    if (!TextUtils.isEmpty(str)) {
                        this.f241799a = str;
                        C82510g gVar2 = C82510g.this;
                        int i2 = this.f241608e;
                        C40482o oVar = this.f241609f;
                        if (oVar == null) {
                            oVar = gVar2.getJsRuntime();
                        }
                        gVar2.mo114838E(i2, str, oVar);
                        return;
                    }
                    return;
                }
                new Handler(this.f241610g).post(new C82515a(this, this));
            }
        }
    }

    public C82510g() {
        C82512b bVar = new C82512b();
        C90383b.C90385b bVar2 = C90383b.f259396a;
        if (bVar2 != null) {
            bVar2.mo113343b(bVar);
        }
        this.f241593r = BuildInfo.DEBUG;
    }

    /* renamed from: D */
    public static JSONObject m101278D(C82510g gVar, String str) {
        gVar.getClass();
        if (TextUtils.isEmpty(str)) {
            return new JSONObject();
        }
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.AppBrandComponentImpl", e.getMessage());
            return null;
        }
    }

    /* renamed from: C */
    public String mo114327C() {
        return "";
    }

    /* renamed from: E */
    public void mo114838E(int i, String str, C40482o oVar) {
        C40482o oVar2;
        if (oVar == null) {
            synchronized (this.f241594s) {
                int indexOfKey = this.f241594s.indexOfKey(i);
                if (indexOfKey >= 0) {
                    oVar2 = this.f241594s.valueAt(indexOfKey);
                    this.f241594s.removeAt(indexOfKey);
                } else {
                    oVar2 = null;
                }
            }
            oVar = oVar2 != null ? oVar2 : getJsRuntime();
        }
        if (oVar == null) {
            Log.m105921e("MicroMsg.AppBrandComponentImpl", "callback but get NULL JsRuntime, callbackId:%d", Integer.valueOf(i));
        } else if (!mo109648b((String) null, oVar)) {
            Log.m105921e("MicroMsg.AppBrandComponentImpl", "callback but destroyed, callbackId %d", Integer.valueOf(i));
        } else {
            Log.m105919d("MicroMsg.AppBrandComponentImpl", "callbackId: %d, data size: %d", Integer.valueOf(i), Integer.valueOf(Util.nullAsNil(str).length()));
            if (Util.isNullOrNil(str)) {
                str = "{}";
            }
            C83176n nVar = oVar instanceof C83165i ? (C83176n) ((C83165i) oVar).mo63321n0(C83176n.class) : null;
            if (nVar != null) {
                nVar.mo115402X0(i, str);
            } else {
                oVar.evaluateJavascript(String.format(Locale.US, "typeof %s !== 'undefined' && %s.invokeCallbackHandler(%d, %s)", new Object[]{"WeixinJSCoreAndroid", "WeixinJSCoreAndroid", Integer.valueOf(i), str}), (ValueCallback<String>) null);
            }
            C82381f.C82384c cVar = this.f241588j;
            if (cVar != null) {
                cVar.mo114218b(i, str);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: F */
    public void mo114329F() {
        C83165i iVar;
        C116901a aVar = this.f241585g;
        if (aVar != null) {
            aVar.removeCallbacksAndMessages((Object) null);
            this.f241585g.getLooper().quit();
        }
        try {
            C82865o oVar = this.f241584f;
            if (oVar != null) {
                oVar.f242310a = null;
            }
            this.f241584f = null;
            ((ConcurrentHashMap) this.f241586h).clear();
            this.f241588j = C83058w6.f242801a;
            this.f241595t = C82516g0.f241613a;
            synchronized (this.f241582d) {
                iVar = this.f241583e;
                this.f241583e = null;
            }
            if (iVar != null) {
                iVar.destroy();
            }
        } catch (Throwable th) {
            this.f241584f = null;
            throw th;
        }
    }

    /* renamed from: G */
    public C82865o mo114839G() {
        return new C82865o(this);
    }

    /* renamed from: H */
    public abstract Map<String, C82870p> mo114330H();

    /* renamed from: J */
    public abstract C83165i mo114092J();

    /* renamed from: K */
    public final C116901a mo114840K() {
        if (this.f241585g == null) {
            int i = C58834h.f168432b;
            HandlerThread a = C97749e.m126093a("AppBrandAsyncJSThread", 5);
            a.start();
            this.f241585g = new MMHandler(a.getLooper());
        }
        return this.f241585g;
    }

    /* renamed from: L */
    public final void mo114841L() {
        if (!this.f241587i.getAndSet(true)) {
            Map<String, C82870p> H = mo114330H();
            if (H == null) {
                Log.m105920e("MicroMsg.AppBrandComponentImpl", "!! get NULL jsApiPool when createJsApiPool() called, make sure your logic !!");
            } else {
                ((ConcurrentHashMap) this.f241586h).putAll(H);
            }
        }
    }

    /* renamed from: M */
    public final void mo114842M() {
        synchronized (this.f241582d) {
            if (this.f241583e == null) {
                C83165i J = mo114092J();
                this.f241583e = J;
                J.addJavascriptInterface(this.f241584f, "WeixinJSCore");
                if (!TextUtils.isEmpty("(function (global) {\n        if (!Object.assign) {\n            Object.defineProperty(Object, \"assign\", {\n                enumerable: false,\n                configurable: true,\n                writable: true,\n                value: function (target, firstSource) {\n                    \"use strict\";\n                    if (target === undefined || target === null)\n                        throw new TypeError(\"Cannot convert first argument to object\");\n                    var to = Object(target);\n                    for (var i = 1; i < arguments.length; i++) {\n                        var nextSource = arguments[i];\n                        if (nextSource === undefined || nextSource === null) continue;\n                        var keysArray = Object.keys(Object(nextSource));\n                        for (var nextIndex = 0, len = keysArray.length; nextIndex < len; nextIndex++) {\n                            var nextKey = keysArray[nextIndex];\n                            var desc = Object.getOwnPropertyDescriptor(nextSource, nextKey);\n                            if (desc !== undefined && desc.enumerable) to[nextKey] = nextSource[nextKey];\n                        }\n                    }\n                    return to;\n                }\n            });\n        }\n})(this);")) {
                    this.f241583e.evaluateJavascript("(function (global) {\n        if (!Object.assign) {\n            Object.defineProperty(Object, \"assign\", {\n                enumerable: false,\n                configurable: true,\n                writable: true,\n                value: function (target, firstSource) {\n                    \"use strict\";\n                    if (target === undefined || target === null)\n                        throw new TypeError(\"Cannot convert first argument to object\");\n                    var to = Object(target);\n                    for (var i = 1; i < arguments.length; i++) {\n                        var nextSource = arguments[i];\n                        if (nextSource === undefined || nextSource === null) continue;\n                        var keysArray = Object.keys(Object(nextSource));\n                        for (var nextIndex = 0, len = keysArray.length; nextIndex < len; nextIndex++) {\n                            var nextKey = keysArray[nextIndex];\n                            var desc = Object.getOwnPropertyDescriptor(nextSource, nextKey);\n                            if (desc !== undefined && desc.enumerable) to[nextKey] = nextSource[nextKey];\n                        }\n                    }\n                    return to;\n                }\n            });\n        }\n})(this);", (ValueCallback<String>) null);
                }
                mo114849U();
            }
        }
    }

    /* renamed from: N */
    public final String mo114843N(C82870p pVar, String str, String str2, int i, C40482o oVar, Looper looper) {
        boolean z = true;
        if (!mo109648b(pVar.mo114779e(), oVar)) {
            Log.m105921e("MicroMsg.AppBrandComponentImpl", "invoke log[%s] api[%s], callbackId[%d], component not running", mo114327C(), pVar.mo114779e(), Integer.valueOf(i));
            return mo114847S(pVar.mo114779e(), "fail:interrupted");
        }
        if (pVar.mo114779e().equals(C1807j0.NAME)) {
            Log.m105924i("MicroMsg.AppBrandComponentImpl", "invoke requestPersonalPay 2");
        }
        C82514d dVar = new C82514d(str, pVar, str2, i, oVar, looper);
        C82381f.C82384c cVar = this.f241588j;
        if (cVar == null || !cVar.mo114220d(pVar, str, str2, i, dVar)) {
            z = false;
        }
        if (!z) {
            dVar.proceed();
        }
        return !TextUtils.isEmpty(dVar.f241799a) ? dVar.f241799a : "";
    }

    /* renamed from: O */
    public final String mo114844O(String str, String str2, String str3, int i) {
        return mo114845P(str, str2, str3, i, false, (C40482o) null);
    }

    /* renamed from: P */
    public String mo114845P(String str, String str2, String str3, int i, boolean z, C40482o oVar) {
        boolean z2;
        String str4 = str;
        int i2 = i;
        C40482o oVar2 = oVar;
        String str5 = "";
        C82870p pVar = (C82870p) ((ConcurrentHashMap) this.f241586h).get(str4);
        int i3 = 0;
        if (pVar == null) {
            mo109647a(i2, mo114847S(str4, "fail:not supported"));
            Log.m105921e("MicroMsg.AppBrandComponentImpl", "invokeHandler, api: %s not support", str4);
            return "fail:not supported";
        }
        if (str4.equals(C1807j0.NAME)) {
            Log.m105924i("MicroMsg.AppBrandComponentImpl", "invoke requestPersonalPay");
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean z3 = pVar instanceof C82268c;
        Log.m105919d("MicroMsg.AppBrandComponentImpl", "invokeHandler[start] tag: %s, api:%s, async:%b", mo114327C(), str4, Boolean.valueOf(z3));
        C83165i jsRuntime = oVar2 == null ? getJsRuntime() : oVar2;
        if (z3) {
            if (oVar2 != null) {
                synchronized (this.f241594s) {
                    this.f241594s.put(i2, oVar2);
                }
            }
            if (!((C82268c) pVar).mo1769t()) {
                if (z) {
                    if (!this.f241596u) {
                        Class<Looper> cls = Looper.class;
                        try {
                            ThreadLocal threadLocal = (ThreadLocal) new C79664a(cls, cls).mo109794f("sThreadLocal");
                            if (threadLocal.get() == null) {
                                threadLocal.set(mo114840K().getLooper());
                            }
                            this.f241596u = true;
                            Log.m105924i("MicroMsg.AppBrandComponentImpl", "[+] hookLooper succeed");
                        } catch (Throwable th) {
                            if (this.f241596u) {
                                Log.m105924i("MicroMsg.AppBrandComponentImpl", "[+] hookLooper succeed");
                            }
                            throw th;
                        }
                    }
                    z2 = true;
                    if (z2) {
                        mo114843N(pVar, str2, str3, i, jsRuntime, mo114840K().getLooper());
                    }
                }
                C116901a K = mo114840K();
                C82513c cVar = r1;
                C82513c cVar2 = new C82513c(pVar, str2, str3, i, jsRuntime);
                K.post(cVar);
            } else if (z) {
                Log.m105920e("MicroMsg.AppBrandComponentImpl", "hy: should be called in js thread but called in async thread");
                return "";
            } else {
                mo114843N(pVar, str2, str3, i, jsRuntime, (Looper) null);
                str5 = "";
            }
        } else if (z) {
            Log.m105920e("MicroMsg.AppBrandComponentImpl", "hy: is sync but called in async thread");
            return "";
        } else {
            str5 = mo114843N(pVar, str2, str3, i, jsRuntime, (Looper) null);
        }
        Object[] objArr = new Object[4];
        objArr[0] = mo114327C();
        objArr[1] = str4;
        if (str2 != null) {
            i3 = str2.length();
        }
        objArr[2] = Integer.valueOf(i3);
        objArr[3] = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
        Log.m105919d("MicroMsg.AppBrandComponentImpl", "invokeHandler[end] tag: %s, api: %s, data size: %d, time: %d", objArr);
        return str5;
    }

    /* renamed from: R */
    public String mo114846R(C82870p pVar, JSONObject jSONObject, JSONObject jSONObject2, int i, C40482o oVar) {
        try {
            if (pVar instanceof C82016a0) {
                return pVar.mo114532h() ? ((C82016a0) pVar).mo114482u(this, jSONObject, oVar) : ((C82016a0) pVar).mo1731t(this, jSONObject);
            }
            if (!(pVar instanceof C82268c)) {
                return "";
            }
            String T = mo114848T(pVar, jSONObject);
            if (T == null) {
                if (pVar instanceof C82366d) {
                    ((C82366d) pVar).mo114544c(new C83125x6(oVar, this, jSONObject, jSONObject2, i));
                } else if (pVar.mo114532h()) {
                    ((C82268c) pVar).mo114531v(this, jSONObject, i, oVar);
                } else {
                    ((C82268c) pVar).mo1505u(this, jSONObject, i);
                }
            }
            return T;
        } catch (ClassCastException e) {
            Log.printErrStackTrace("MicroMsg.AppBrandComponentImpl", e, e.getMessage(), new Object[0]);
            return pVar.mo115109j("fail:internal error invalid js component");
        } catch (Throwable th) {
            Log.m105921e("MicroMsg.AppBrandComponentImpl", "invokeTheJsApi with name[%s], get exception %s", pVar, th);
            throw th;
        }
    }

    /* renamed from: S */
    public String mo114847S(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("errMsg", str + XVFSFile.PATH_SEPARATOR + str2);
        return new JSONObject(hashMap).toString();
    }

    /* renamed from: T */
    public final String mo114848T(C82870p pVar, JSONObject jSONObject) {
        if (C84782s1.m104462c(getJsRuntime(), pVar, jSONObject, (C84782s1.C84783a) mo109671p(C84782s1.C84783a.class)) == C84782s1.C84784b.FAIL_SIZE_EXCEED_LIMIT) {
            return pVar.mo115109j("fail:convert native buffer parameter fail. native buffer exceed size limit.");
        }
        return null;
    }

    /* renamed from: U */
    public void mo114849U() {
    }

    /* renamed from: V */
    public final <T extends C12964b> void mo114850V(Class<T> cls, T t) {
        C88078d dVar = this.f241592q;
        dVar.getClass();
        dVar.mo122504a(cls, new C88080e(t));
    }

    /* renamed from: a */
    public void mo109647a(int i, String str) {
        mo114838E(i, str, (C40482o) null);
    }

    /* renamed from: b */
    public final boolean mo109648b(String str, C40482o oVar) {
        if (oVar == null) {
            oVar = getJsRuntime();
        }
        C82381f.C82382a aVar = this.f241595t;
        if (aVar != null) {
            return aVar.mo114784b(str, oVar);
        }
        return true;
    }

    /* renamed from: d */
    public void mo109650d(String str, String str2) {
        mo109652f(str, str2, 0);
    }

    /* renamed from: e */
    public void mo109651e(String str, String str2, int[] iArr) {
        mo109652f(str, str2, getComponentId());
    }

    /* renamed from: f */
    public void mo109652f(String str, String str2, int i) {
        C82381f.C82382a aVar = this.f241595t;
        if (aVar != null ? aVar.mo114784b(str, getJsRuntime()) : true) {
            C83133y6.m101968a(getJsRuntime(), str, str2, i);
        }
    }

    public final C116901a getAsyncHandler() {
        return mo114840K();
    }

    public int getComponentId() {
        return hashCode();
    }

    public C87375o0 getDialogContainer() {
        Log.m105920e("MicroMsg.AppBrandComponentImpl", "getDialogContainer return dummy impl");
        return C87375o0.f253226t0;
    }

    public C81415h0 getFileSystem() {
        Log.m105920e("MicroMsg.AppBrandComponentImpl", "getFileSystem return dummy impl");
        return this.f241589n;
    }

    public C82381f.C82384c getInterceptor() {
        return this.f241588j;
    }

    public final C83165i getJsRuntime() {
        C83165i iVar;
        synchronized (this.f241582d) {
            iVar = this.f241583e;
        }
        return iVar;
    }

    public /* synthetic */ C0125s getLifecycleOwner() {
        return null;
    }

    /* renamed from: h */
    public <T extends C82835n> T mo109666h(Class<T> cls) {
        if (cls == null) {
            return null;
        }
        synchronized (this.f241591p) {
            Iterator<C82835n> it = this.f241591p.iterator();
            while (it.hasNext()) {
                T t = (C82835n) it.next();
                if (cls.isInstance(t)) {
                    return t;
                }
            }
            return null;
        }
    }

    /* renamed from: l */
    public <T extends C12964b> T mo109668l(Class<T> cls) {
        if (cls == null) {
            return null;
        }
        T t = (C12964b) this.f241592q.mo122505b(cls);
        if (t != null || (t = C89909e.m112436a(cls)) == null || cls.isAssignableFrom(t.getClass())) {
            return t;
        }
        return null;
    }

    /* renamed from: n */
    public void mo109669n(C82919r2 r2Var, int[] iArr) {
        mo109651e(r2Var.mo114779e(), r2Var.mo115160j(), iArr);
    }

    /* renamed from: o */
    public void mo109670o(Runnable runnable, long j) {
        if (runnable != null) {
            if (j < 0) {
                j = 0;
            }
            MMHandlerThread.postToMainThreadDelayed(runnable, j);
        }
    }

    /* renamed from: p */
    public <T extends C1727m> T mo109671p(Class<T> cls) {
        T t;
        Iterator<C1727m> descendingIterator = this.f241590o.descendingIterator();
        while (true) {
            if (!descendingIterator.hasNext()) {
                t = null;
                break;
            }
            t = (C1727m) descendingIterator.next();
            if (cls.isInstance(t)) {
                break;
            }
        }
        if (t != null) {
            return t;
        }
        try {
            T t2 = (C1727m) new C79664a(cls, cls).mo109790c().f233575b;
            if (t2 != null) {
                try {
                    this.f241590o.add(t2);
                } catch (Exception unused) {
                    t = t2;
                }
            }
            return t2;
        } catch (Exception unused2) {
            Log.m105921e("MicroMsg.AppBrandComponentImpl", "Make sure %s has default constructor", cls.getName());
            return t;
        }
    }

    /* renamed from: s */
    public boolean mo109672s(C82835n nVar) {
        if (nVar == null) {
            return false;
        }
        synchronized (this.f241591p) {
            this.f241591p.add(nVar);
        }
        return true;
    }

    /* renamed from: t */
    public void mo109673t(Runnable runnable) {
        if (runnable != null) {
            MMHandlerThread.postToMainThread(runnable);
        }
    }

    /* renamed from: u */
    public final boolean mo114851u() {
        return this.f241593r;
    }

    /* renamed from: v */
    public C82870p mo109675v(String str) {
        return (C82870p) ((ConcurrentHashMap) this.f241586h).get(str);
    }

    /* renamed from: w */
    public void mo109676w(C82919r2 r2Var) {
        r2Var.mo115161k(this).mo115158h();
    }
}
