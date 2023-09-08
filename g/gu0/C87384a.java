package gu0;

import android.os.Build;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import c30.C104289g;
import com.eclipsesource.mmv8.V8ScriptEvaluateRequest;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.appbrand.p942v8.C80681o;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.C83716o4;
import com.tencent.p014mm.plugin.appbrand.C84073q2;
import com.tencent.p014mm.plugin.appbrand.appcache.C81247g3;
import com.tencent.p014mm.plugin.appbrand.appcache.C81289m;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81412d0;
import com.tencent.p014mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle;
import com.tencent.p014mm.plugin.appbrand.utils.C84768n1;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import dq0.C86392b;
import fq0.C87074b;
import h81.C32735h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import js0.C88016e;
import p225rc.C48016e;
import p774zg.C91735n0;
import p963fc.C86812g;
import u24.C90599h;
import wq0.C91063e;
import wq0.C91065g;

/* renamed from: gu0.a */
public class C87384a extends C84073q2 {

    /* renamed from: gu0.a$a */
    public class C87385a extends C87388d {
        public C87385a(C91735n0 n0Var) {
            super(n0Var);
        }

        /* renamed from: e */
        public void mo112515e(int i, C80669j jVar) {
            if ((C87384a.this.f245476a.getRuntime() instanceof C86812g) && ((C86812g) C87384a.this.f245476a.getRuntime()).mo113203h1()) {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                Log.m105925i("MicroMsg.AppBrandWorkerContainerLU", "post report coverage task for appId:%s workerId:%d", C87384a.this.f245476a.getAppId(), Integer.valueOf(i));
                jVar.mo112500d("\n        ;(function() {\n            let data = (globalThis || {}).__coverage__;\n            if (typeof data === 'string' || typeof data === 'undefined') {\n                return data;\n            } else {\n                return JSON.stringify(data);\n            }\n        })();\n    ", new a$a$$a(this, jVar, countDownLatch));
                try {
                    countDownLatch.await(3, TimeUnit.SECONDS);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrandWorkerContainerLU", "post report coverage task for appId:%s workerId:%d latch await failed:%s", C87384a.this.f245476a.getAppId(), Integer.valueOf(i), e);
                } finally {
                    Log.m105925i("MicroMsg.AppBrandWorkerContainerLU", "post report coverage task for appId:%s workerId:%d latch await end", C87384a.this.f245476a.getAppId(), Integer.valueOf(i));
                }
            }
            super.mo112515e(i, jVar);
        }
    }

    public C87384a(C81925i2 i2Var) {
        super(i2Var);
    }

    /* renamed from: a */
    public void mo116723a(ArrayList<C80681o.C80687f> arrayList, String str, boolean z, String str2) {
        AppRuntimeApiPermissionBundle appRuntimeApiPermissionBundle;
        C91063e eVar;
        AppRuntimeApiPermissionBundle appRuntimeApiPermissionBundle2;
        AppRuntimeApiPermissionBundle appRuntimeApiPermissionBundle3;
        ArrayList<C80681o.C80687f> arrayList2 = arrayList;
        super.mo116723a(arrayList, str, z, str2);
        arrayList2.add(new d$$g(this.f245476a.mo114343n0() + "shared_buffer.js", C88016e.m109548e("wxa_library/shared_buffer.js"), (String) null, this.f245476a.getAppId(), this.f245476a.mo114335b0()));
        arrayList2.add(new d$$g(this.f245476a.mo114343n0() + "android.js", C88016e.m109548e("wxa_library/android.js"), (String) null, this.f245476a.getAppId(), this.f245476a.mo114335b0()));
        arrayList2.add(new d$$g(this.f245476a.mo114343n0() + "lazy_load.js", C88016e.m109548e("wxa_library/lazy_load.js"), (String) null, this.f245476a.getAppId(), this.f245476a.mo114335b0()));
        if ((C86392b.f251181b != null ? ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_enable_node_in_worker, 0) : 0) == 1 && this.f245476a.getRuntime() != null) {
            String str3 = this.f245476a.mo114343n0() + "worker_wxaData.js";
            Object[] objArr = new Object[1];
            HashMap hashMap = new HashMap();
            hashMap.put("workerWxaData", C86392b.m107057a(this.f245476a.getRuntime()));
            hashMap.put("state", this.f245476a.getRuntime().f238113K.mo122980c());
            C91065g gVar = ((C86812g) this.f245476a.getRuntime()).f251968f1;
            if (gVar == null) {
                Log.m105928w("MicroMsg.AppBrandWorkerContainerLU", "fillPermissionScripts, controller is null");
            } else {
                synchronized (gVar.f261245e) {
                    appRuntimeApiPermissionBundle = gVar.f261246f;
                }
                if (appRuntimeApiPermissionBundle != null) {
                    synchronized (gVar.f261245e) {
                        appRuntimeApiPermissionBundle2 = gVar.f261246f;
                    }
                    byte[] bArr = appRuntimeApiPermissionBundle2.f245266d;
                    synchronized (gVar.f261245e) {
                        appRuntimeApiPermissionBundle3 = gVar.f261246f;
                    }
                    byte[] bArr2 = appRuntimeApiPermissionBundle3.f245267e;
                    hashMap.put("fg", bArr);
                    hashMap.put("bg", bArr2);
                }
                synchronized (gVar.f261247g) {
                    HashMap<String, AppRuntimeApiPermissionBundle> hashMap2 = gVar.f261248h;
                    if (hashMap2 != null) {
                        if (!hashMap2.isEmpty()) {
                            eVar = new C91063e(gVar);
                        }
                    }
                    eVar = null;
                }
                C87074b.m108094d(hashMap, eVar);
            }
            C48016e.m53378d(hashMap);
            objArr[0] = new C104289g((Map) hashMap).toString();
            arrayList2.add(new d$$g(str3, String.format("var workerData = %s", objArr), (String) null, this.f245476a.getAppId(), this.f245476a.mo114335b0()));
        }
        arrayList2.add(mo116730e("WAWorker.js"));
        if (!C90599h.m113509b("wxlib", str2) && !C81289m.C81290a.m99664b(this.f245476a.getRuntime().f238149o.f239365g)) {
            arrayList2.add(new C80681o.C80687f(this.f245476a.mo114343n0() + "WASourceMap.js", C83716o4.m102758c(this.f245476a)));
            arrayList2.add(new C80681o.C80687f(this.f245476a.mo114343n0() + "sourcemapSysinfo", String.format("typeof __wxSourceMap !== 'undefined' && (__wxSourceMap.__system = 'Android %s')", new Object[]{Build.VERSION.RELEASE})));
        }
    }

    /* renamed from: b */
    public C80681o mo116724b() {
        return new C87385a(this.f245486k);
    }

    /* renamed from: e */
    public C80681o.C80687f mo116730e(String str) {
        String b = this.f245476a.mo114272k().mo113372b(str);
        V8ScriptEvaluateRequest v8ScriptEvaluateRequest = new V8ScriptEvaluateRequest();
        v8ScriptEvaluateRequest.scriptText = b;
        v8ScriptEvaluateRequest.scriptType = 3;
        Log.m105921e("MicroMsg.AppBrandWorkerContainerLU", "getCommLibScript(%s), fd is null, fallback to createTextEvalRequest", str);
        String str2 = this.f245476a.mo114343n0() + C81412d0.m99875i(str);
        v8ScriptEvaluateRequest.scriptName = str2;
        v8ScriptEvaluateRequest.cacheCategory = str;
        v8ScriptEvaluateRequest.cacheKey = ExifInterface.GPS_MEASUREMENT_INTERRUPTED + this.f245476a.mo114272k().mo113371a();
        d$$g d__g = new d$$g(str2, v8ScriptEvaluateRequest, (String) null, this.f245476a.getAppId(), this.f245476a.mo114335b0());
        d__g.f253276f = this.f245476a.mo114272k();
        return d__g;
    }

    /* renamed from: f */
    public C80681o.C80687f mo116731f(String str) {
        C80681o.C80687f fVar;
        if (!TextUtils.isEmpty(this.f245476a.mo114345p0(str))) {
            fVar = super.mo116731f(str);
        } else {
            String str2 = this.f245476a.mo114346q0() + str;
            fVar = new C80681o.C80687f(str2, C84768n1.m104428d(str, C81247g3.m99555k(this.f245476a.getRuntime(), false).openReadPartialInfo(str), str2));
        }
        return new d$$g(fVar, C83716o4.m102756a(this.f245476a.getRuntime(), str, this.f245476a.mo114346q0()), this.f245476a.getAppId(), this.f245476a.mo114335b0());
    }
}
