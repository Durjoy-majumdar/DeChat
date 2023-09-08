package com.tencent.p014mm.plugin.appbrand.jsapi.picker;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.plugin.appbrand.widget.picker.AppBrandMultiOptionsPicker;
import com.tencent.p014mm.plugin.appbrand.widget.picker.AppBrandMultiOptionsPickerV2;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;
import vt0.C22784g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.picker.j */
public final class C17929j extends C17918a {
    private static final int CTRL_INDEX = 257;
    private static final String NAME = "showMultiPickerView";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.picker.j$b */
    public static final class C17931b extends C82919r2 {
        private static final int CTRL_INDEX = 259;
        private static final String NAME = "onMultiPickerViewChange";

        public C17931b(C17930a aVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.picker.j$c */
    public final class C17932c extends C17926h implements Runnable {

        /* renamed from: n */
        public final AtomicReference<AppBrandMultiOptionsPicker.C104941b[]> f49446n = new AtomicReference<>();

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.picker.j$c$a */
        public class C17933a implements Runnable {
            public C17933a() {
            }

            public void run() {
                C17932c.this.mo22197i();
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.picker.j$c$b */
        public class C17934b implements Runnable {
            public C17934b() {
            }

            public void run() {
                C17932c.this.mo22197i();
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.picker.j$c$c */
        public class C17935c implements C22784g.C22787c<int[]> {
            public C17935c() {
            }

            /* renamed from: a */
            public void mo22193a(boolean z, Object obj) {
                int[] iArr = (int[]) obj;
                C17932c.this.f65507d.mo35910h();
                if (!z) {
                    C17932c.this.mo22194c("fail cancel", (Map<String, Object>) null);
                } else if (iArr == null || iArr.length <= 0) {
                    C17932c.this.mo22194c("fail error result", (Map<String, Object>) null);
                } else {
                    JSONArray jSONArray = new JSONArray();
                    for (int put : iArr) {
                        jSONArray.put(put);
                    }
                    HashMap hashMap = new HashMap(1);
                    hashMap.put("current", jSONArray);
                    C17932c.this.mo22194c("ok", hashMap);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.picker.j$c$d */
        public class C17936d implements C22784g.C22788d<int[]> {
            public C17936d() {
            }

            /* renamed from: a */
            public void mo22201a(Object obj) {
                int[] iArr = (int[]) obj;
                int i = iArr[0];
                int i2 = iArr[1];
                C82520h hVar = null;
                C17931b bVar = new C17931b((C17930a) null);
                HashMap hashMap = new HashMap(2);
                hashMap.put("errMsg", "ok");
                hashMap.put("column", Integer.valueOf(i));
                hashMap.put("current", Integer.valueOf(i2));
                bVar.mo115165o(hashMap);
                WeakReference<C82520h> weakReference = C17932c.this.f49441f;
                if (weakReference != null) {
                    hVar = weakReference.get();
                }
                if (hVar != null) {
                    bVar.mo115161k(hVar);
                    bVar.mo115158h();
                }
            }
        }

        public C17932c(C17929j jVar, C17930a aVar) {
        }

        /* renamed from: d */
        public void mo22187d(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            super.mo22187d(jSONObject);
            JSONArray optJSONArray = jSONObject2.optJSONArray("array");
            JSONArray optJSONArray2 = jSONObject2.optJSONArray("current");
            if (optJSONArray == null || optJSONArray2 == null || optJSONArray.length() != optJSONArray2.length()) {
                mo22194c("fail:invalid data", (Map<String, Object>) null);
            } else if (optJSONArray.length() <= 0) {
                mo22194c("ok", (Map<String, Object>) null);
                Log.m105924i("MicroMsg.JsApiShowMultiPickerView", "showMultiPickerView , empty range (one-dimensional)");
                mo22196h(new C17933a());
            } else {
                try {
                    AppBrandMultiOptionsPicker.C104941b[] bVarArr = new AppBrandMultiOptionsPicker.C104941b[optJSONArray.length()];
                    boolean z = true;
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONArray jSONArray = optJSONArray.getJSONArray(i);
                        int i2 = optJSONArray2.getInt(i);
                        int length = jSONArray.length();
                        String[] strArr = new String[length];
                        for (int i3 = 0; i3 < length; i3++) {
                            strArr[i3] = jSONArray.getString(i3);
                        }
                        bVarArr[i] = new AppBrandMultiOptionsPicker.C104941b(strArr, i2);
                        z &= jSONArray.length() <= 0;
                    }
                    if (z) {
                        mo22194c("ok", (Map<String, Object>) null);
                        Log.m105924i("MicroMsg.JsApiShowMultiPickerView", "showMultiPickerView , empty range (multi-dimensional)");
                        mo22196h(new C17934b());
                        return;
                    }
                    this.f49446n.set(bVarArr);
                    mo22196h(this);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.JsApiShowMultiPickerView", e, "opt params", new Object[0]);
                    mo22194c("fail:invalid data", (Map<String, Object>) null);
                }
            }
        }

        /* renamed from: e */
        public void mo22188e(JSONObject jSONObject) {
        }

        /* renamed from: f */
        public void mo22189f(JSONObject jSONObject) {
        }

        public void run() {
            AppBrandMultiOptionsPicker appBrandMultiOptionsPicker = (AppBrandMultiOptionsPicker) mo35917b(AppBrandMultiOptionsPicker.class);
            if (appBrandMultiOptionsPicker == null) {
                mo22194c("fail cant init view", (Map<String, Object>) null);
                return;
            }
            AppBrandMultiOptionsPicker.C104941b[] bVarArr = this.f49446n.get();
            if (bVarArr == null || bVarArr.length <= 0) {
                mo22194c("fail error data", (Map<String, Object>) null);
                return;
            }
            appBrandMultiOptionsPicker.mo148965a(bVarArr);
            this.f65507d.setOnResultListener(new C17935c());
            this.f65507d.setOnValueUpdateListener(new C17936d());
            this.f65507d.mo35911i();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.picker.j$d */
    public final class C17937d extends C17926h implements Runnable {

        /* renamed from: n */
        public final AtomicReference<AppBrandMultiOptionsPickerV2.C18067b[]> f49451n = new AtomicReference<>();

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.picker.j$d$a */
        public class C17938a implements Runnable {
            public C17938a() {
            }

            public void run() {
                C17937d.this.mo22197i();
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.picker.j$d$b */
        public class C17939b implements Runnable {
            public C17939b() {
            }

            public void run() {
                C17937d.this.mo22197i();
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.picker.j$d$c */
        public class C17940c implements C22784g.C22787c<int[]> {
            public C17940c() {
            }

            /* renamed from: a */
            public void mo22193a(boolean z, Object obj) {
                int[] iArr = (int[]) obj;
                C17937d.this.f65507d.mo35910h();
                if (!z) {
                    C17937d.this.mo22194c("fail cancel", (Map<String, Object>) null);
                } else if (iArr == null || iArr.length <= 0) {
                    C17937d.this.mo22194c("fail error result", (Map<String, Object>) null);
                } else {
                    JSONArray jSONArray = new JSONArray();
                    for (int put : iArr) {
                        jSONArray.put(put);
                    }
                    HashMap hashMap = new HashMap(1);
                    hashMap.put("current", jSONArray);
                    C17937d.this.mo22194c("ok", hashMap);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.picker.j$d$d */
        public class C17941d implements C22784g.C22788d<int[]> {
            public C17941d() {
            }

            /* renamed from: a */
            public void mo22201a(Object obj) {
                int[] iArr = (int[]) obj;
                int i = iArr[0];
                int i2 = iArr[1];
                C82520h hVar = null;
                C17931b bVar = new C17931b((C17930a) null);
                HashMap hashMap = new HashMap(2);
                hashMap.put("errMsg", "ok");
                hashMap.put("column", Integer.valueOf(i));
                hashMap.put("current", Integer.valueOf(i2));
                bVar.mo115165o(hashMap);
                WeakReference<C82520h> weakReference = C17937d.this.f49441f;
                if (weakReference != null) {
                    hVar = weakReference.get();
                }
                if (hVar != null) {
                    bVar.mo115161k(hVar);
                    bVar.mo115158h();
                }
            }
        }

        public C17937d(C17929j jVar, C17930a aVar) {
        }

        /* renamed from: d */
        public void mo22187d(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            super.mo22187d(jSONObject);
            JSONArray optJSONArray = jSONObject2.optJSONArray("array");
            JSONArray optJSONArray2 = jSONObject2.optJSONArray("current");
            if (optJSONArray == null || optJSONArray2 == null || optJSONArray.length() != optJSONArray2.length()) {
                mo22194c("fail:invalid data", (Map<String, Object>) null);
            } else if (optJSONArray.length() <= 0) {
                mo22194c("ok", (Map<String, Object>) null);
                Log.m105924i("MicroMsg.JsApiShowMultiPickerView", "showMultiPickerView , empty range (one-dimensional)");
                mo22196h(new C17938a());
            } else {
                try {
                    AppBrandMultiOptionsPickerV2.C18067b[] bVarArr = new AppBrandMultiOptionsPickerV2.C18067b[optJSONArray.length()];
                    boolean z = true;
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONArray jSONArray = optJSONArray.getJSONArray(i);
                        int i2 = optJSONArray2.getInt(i);
                        int length = jSONArray.length();
                        String[] strArr = new String[length];
                        for (int i3 = 0; i3 < length; i3++) {
                            strArr[i3] = jSONArray.getString(i3);
                        }
                        bVarArr[i] = new AppBrandMultiOptionsPickerV2.C18067b(strArr, i2);
                        z &= jSONArray.length() <= 0;
                    }
                    if (z) {
                        mo22194c("ok", (Map<String, Object>) null);
                        Log.m105924i("MicroMsg.JsApiShowMultiPickerView", "showMultiPickerView , empty range (multi-dimensional)");
                        mo22196h(new C17939b());
                        return;
                    }
                    this.f49451n.set(bVarArr);
                    mo22196h(this);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.JsApiShowMultiPickerView", e, "opt params", new Object[0]);
                    mo22194c("fail:invalid data", (Map<String, Object>) null);
                }
            }
        }

        /* renamed from: e */
        public void mo22188e(JSONObject jSONObject) {
        }

        /* renamed from: f */
        public void mo22189f(JSONObject jSONObject) {
        }

        public void run() {
            AppBrandMultiOptionsPickerV2 appBrandMultiOptionsPickerV2 = (AppBrandMultiOptionsPickerV2) mo35917b(AppBrandMultiOptionsPickerV2.class);
            if (appBrandMultiOptionsPickerV2 == null) {
                mo22194c("fail cant init view", (Map<String, Object>) null);
                return;
            }
            AppBrandMultiOptionsPickerV2.C18067b[] bVarArr = this.f49451n.get();
            if (bVarArr == null || bVarArr.length <= 0) {
                mo22194c("fail error data", (Map<String, Object>) null);
                return;
            }
            appBrandMultiOptionsPickerV2.mo22614a(bVarArr);
            this.f65507d.setOnResultListener(new C17940c());
            this.f65507d.setOnValueUpdateListener(new C17941d());
            this.f65507d.setHeader(this.f49444i);
            this.f65507d.mo35911i();
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82520h hVar = (C82520h) fVar;
        if (this.f49423g) {
            new C17937d(this, (C17930a) null).mo22195g(this, hVar, jSONObject, i, this.f49423g);
            return;
        }
        new C17932c(this, (C17930a) null).mo22195g(this, hVar, jSONObject, i, this.f49423g);
    }
}
