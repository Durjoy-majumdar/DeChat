package com.tencent.p014mm.appbrand.p942v8;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.eclipsesource.mmv8.V8ScriptEvaluateRequest;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.appbrand.p942v8.IJSRuntime;
import com.tencent.p014mm.plugin.appbrand.C84073q2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82510g;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83170k;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import p774zg.C91694e;
import p774zg.C91735n0;

/* renamed from: com.tencent.mm.appbrand.v8.o */
public class C80681o {

    /* renamed from: a */
    public final AtomicInteger f236075a = new AtomicInteger(mo112521k());

    /* renamed from: b */
    public final ConcurrentHashMap<Integer, C80669j> f236076b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public C91735n0 f236077c;

    /* renamed from: d */
    public String f236078d;

    /* renamed from: e */
    public C91694e f236079e = new C80685d();

    /* renamed from: com.tencent.mm.appbrand.v8.o$a */
    public class C80682a implements C80669j.C80675f {

        /* renamed from: a */
        public final /* synthetic */ C80688g f236080a;

        /* renamed from: b */
        public final /* synthetic */ long f236081b;

        public C80682a(C80681o oVar, C80688g gVar, long j) {
            this.f236080a = gVar;
            this.f236081b = j;
        }

        /* renamed from: a */
        public void mo112506a(String str, C80669j.C80676g gVar) {
            C80688g gVar2 = this.f236080a;
            if (gVar2 != null) {
                ((C84073q2.C84074a) gVar2).mo116736a(System.currentTimeMillis() - this.f236081b);
            }
        }
    }

    /* renamed from: com.tencent.mm.appbrand.v8.o$b */
    public class C80683b implements C40482o {

        /* renamed from: d */
        public final /* synthetic */ WeakReference f236082d;

        public C80683b(WeakReference weakReference) {
            this.f236082d = weakReference;
        }

        public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
            C80681o.this.mo112512b((C80669j) this.f236082d.get(), str, valueCallback);
        }
    }

    /* renamed from: com.tencent.mm.appbrand.v8.o$c */
    public class C80684c implements C80669j.C80675f {

        /* renamed from: a */
        public final /* synthetic */ ValueCallback f236084a;

        public C80684c(C80681o oVar, ValueCallback valueCallback) {
            this.f236084a = valueCallback;
        }

        /* renamed from: a */
        public void mo112506a(String str, C80669j.C80676g gVar) {
            this.f236084a.onReceiveValue(str);
        }
    }

    /* renamed from: com.tencent.mm.appbrand.v8.o$d */
    public class C80685d implements C91694e {
        public C80685d() {
        }

        public void bufferStoreBindTo(long j, long j2) {
            C83170k kVar = C84073q2.this.f245477b;
            if (kVar != null) {
                kVar.bufferStoreBindTo(j, j2);
            }
        }

        public int generateId() {
            C83170k kVar = C84073q2.this.f245477b;
            if (kVar != null) {
                return kVar.mo115404Z();
            }
            return 0;
        }

        public ByteBuffer getBuffer(int i, boolean z) {
            C83170k kVar = C84073q2.this.f245477b;
            if (kVar != null) {
                return kVar.mo115416k1(i, false);
            }
            return null;
        }

        public void releaseDirectByteBuffer(ByteBuffer byteBuffer) {
        }

        public void setBuffer(int i, ByteBuffer byteBuffer) {
            C83170k kVar = C84073q2.this.f245477b;
            if (kVar != null) {
                kVar.mo115401U0(i, byteBuffer);
            }
        }

        public boolean supportBufferStoreBindTo() {
            C83170k kVar = C84073q2.this.f245477b;
            if (kVar != null) {
                return kVar.supportBufferStoreBindTo();
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.appbrand.v8.o$e */
    public enum C80686e {
        USER,
        f236087e
    }

    /* renamed from: com.tencent.mm.appbrand.v8.o$f */
    public static class C80687f {

        /* renamed from: a */
        public final String f236089a;

        /* renamed from: b */
        public final V8ScriptEvaluateRequest f236090b;

        public C80687f(String str, String str2) {
            this(str, str2, "", "");
        }

        /* renamed from: a */
        public boolean mo112522a() {
            V8ScriptEvaluateRequest v8ScriptEvaluateRequest = this.f236090b;
            if (v8ScriptEvaluateRequest == null) {
                return false;
            }
            return 3 != v8ScriptEvaluateRequest.scriptType || !TextUtils.isEmpty(v8ScriptEvaluateRequest.scriptText);
        }

        public C80687f(String str, String str2, String str3, String str4) {
            this.f236089a = str;
            V8ScriptEvaluateRequest v8ScriptEvaluateRequest = new V8ScriptEvaluateRequest();
            this.f236090b = v8ScriptEvaluateRequest;
            v8ScriptEvaluateRequest.scriptType = 3;
            v8ScriptEvaluateRequest.scriptText = str2;
            v8ScriptEvaluateRequest.cacheCategory = str3;
            v8ScriptEvaluateRequest.cacheKey = str4;
        }

        public C80687f(String str, V8ScriptEvaluateRequest v8ScriptEvaluateRequest) {
            this.f236089a = str;
            this.f236090b = v8ScriptEvaluateRequest;
        }
    }

    /* renamed from: com.tencent.mm.appbrand.v8.o$g */
    public interface C80688g {
    }

    public C80681o(C91735n0 n0Var) {
        this.f236077c = n0Var;
    }

    /* renamed from: a */
    public void mo112511a(C80669j jVar, ArrayList<C80687f> arrayList, C80688g gVar) {
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null) {
            Iterator<C80687f> it = arrayList.iterator();
            while (it.hasNext()) {
                C80687f next = it.next();
                if (next != null && next.mo112522a()) {
                    arrayList2.add(next);
                }
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (gVar != null) {
            ((C84073q2.C84074a) gVar).f245487a = System.currentTimeMillis();
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            arrayList3.add(((C80687f) it4.next()).f236090b);
        }
        jVar.mo112498b(arrayList3, this.f236078d, new C80682a(this, gVar, currentTimeMillis));
    }

    /* renamed from: b */
    public void mo112512b(C80669j jVar, String str, ValueCallback<String> valueCallback) {
        if (jVar == null) {
            Log.m105928w("MicroMsg.V8EngineWorkerManager", "hy: engine context released");
        } else if (valueCallback != null) {
            jVar.mo112500d(str, new C80684c(this, valueCallback));
        } else {
            jVar.mo112500d(str, (C80669j.C80675f) null);
        }
    }

    /* renamed from: c */
    public void mo112513c(Context context, int i, C82510g gVar, List<String> list, boolean z) {
        Log.m105920e("MicroMsg.V8EngineWorkerManager", "hy: not support bind native in nano case");
    }

    /* renamed from: d */
    public C40482o mo112514d(int i, WeakReference<C80669j> weakReference) {
        return new C80683b(weakReference);
    }

    /* renamed from: e */
    public void mo112515e(int i, C80669j jVar) {
        jVar.mo112499c();
        jVar.f236041b.quit();
    }

    /* renamed from: f */
    public void mo112516f() {
        for (Map.Entry next : this.f236076b.entrySet()) {
            mo112515e(((Integer) next.getKey()).intValue(), (C80669j) next.getValue());
        }
    }

    /* renamed from: g */
    public final void mo112517g(C80669j jVar, String str, String str2) {
        Log.m105921e("MicroMsg.V8EngineWorkerManager", "handleException(%s), stackTrace : %s", str, str2);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(StateEvent.Name.MESSAGE, str);
            jSONObject.put("stack", str2);
        } catch (JSONException e) {
            Log.m105920e("MicroMsg.V8EngineWorkerManager", android.util.Log.getStackTraceString(e));
        }
        jVar.mo112500d(String.format("WeixinWorker.errorHandler(%s)", new Object[]{jSONObject}), (C80669j.C80675f) null);
    }

    /* renamed from: h */
    public void mo112518h() {
    }

    /* renamed from: i */
    public void mo112519i(ArrayList<C80687f> arrayList, C83165i iVar, C82510g gVar) {
        Log.m105928w("MicroMsg.V8EngineWorkerManager", "hy: do noting in base worker manager");
    }

    /* renamed from: j */
    public IJSRuntime.Config mo112520j(C82510g gVar) {
        IJSRuntime.Config config = new IJSRuntime.Config();
        config.f235978f = "1";
        config.f235979g = true;
        config.f235981i = true;
        config.f235982j = true;
        config.f235986n = new WeakReference<>(gVar);
        config.f235987o = this.f236079e;
        return config;
    }

    /* renamed from: k */
    public int mo112521k() {
        return 0;
    }
}
