package com.tencent.p014mm.plugin.appbrand.jsapi.picker;

import com.tencent.p014mm.plugin.appbrand.widget.picker.AppBrandOptionsPicker;
import com.tencent.p014mm.plugin.appbrand.widget.picker.AppBrandOptionsPickerV3;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import vt0.C22778a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.picker.n */
public final class C17947n extends C17926h {

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.picker.n$a */
    public class C17948a implements Runnable {
        public C17948a() {
        }

        public void run() {
            C17947n.this.mo22197i();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.picker.n$b */
    public class C17949b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String[] f49463d;

        /* renamed from: e */
        public final /* synthetic */ int f49464e;

        public C17949b(String[] strArr, int i) {
            this.f49463d = strArr;
            this.f49464e = i;
        }

        public void run() {
            C17947n nVar = C17947n.this;
            String[] strArr = this.f49463d;
            int i = this.f49464e;
            nVar.getClass();
            AppBrandOptionsPicker appBrandOptionsPicker = (AppBrandOptionsPicker) nVar.mo35917b(AppBrandOptionsPicker.class);
            if (appBrandOptionsPicker == null) {
                nVar.mo22194c("fail cant init view", (Map<String, Object>) null);
                return;
            }
            C22778a aVar = nVar.f65507d;
            aVar.post(new C17954q(nVar, aVar));
            appBrandOptionsPicker.setOptionsArray(strArr);
            appBrandOptionsPicker.setValue(i);
            aVar.setOnResultListener(new C17955r(nVar, aVar, appBrandOptionsPicker));
            aVar.mo35911i();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.picker.n$c */
    public class C17950c implements Runnable {
        public C17950c() {
        }

        public void run() {
            C17947n.this.mo22197i();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.picker.n$d */
    public class C17951d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String[] f49467d;

        /* renamed from: e */
        public final /* synthetic */ int f49468e;

        public C17951d(String[] strArr, int i) {
            this.f49467d = strArr;
            this.f49468e = i;
        }

        public void run() {
            C17947n nVar = C17947n.this;
            String[] strArr = this.f49467d;
            int i = this.f49468e;
            AppBrandOptionsPickerV3 appBrandOptionsPickerV3 = (AppBrandOptionsPickerV3) nVar.mo35917b(AppBrandOptionsPickerV3.class);
            if (appBrandOptionsPickerV3 == null) {
                nVar.mo22194c("fail cant init view", (Map<String, Object>) null);
                return;
            }
            C22778a aVar = nVar.f65507d;
            aVar.post(new C17952o(nVar, aVar));
            appBrandOptionsPickerV3.f49964h = i;
            appBrandOptionsPickerV3.mo22630b();
            appBrandOptionsPickerV3.f49960d = strArr;
            appBrandOptionsPickerV3.f49961e.mo35386g(Arrays.asList(strArr));
            aVar.setOnResultListener(new C17953p(nVar, aVar, appBrandOptionsPickerV3));
            aVar.setHeader(nVar.f49444i);
            aVar.mo35911i();
        }
    }

    /* renamed from: d */
    public void mo22187d(JSONObject jSONObject) {
        super.mo22187d(jSONObject);
    }

    /* renamed from: e */
    public void mo22188e(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("array");
        int optInt = jSONObject.optInt("current", 0);
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            Log.m105924i("MicroMsg.AppBrand.JsApi.OptionsPickerHandler", "showPickerView as selector, empty range");
            mo22194c("ok", (Map<String, Object>) null);
            mo22196h(new C17948a());
            return;
        }
        String[] strArr = new String[optJSONArray.length()];
        int i = 0;
        while (i < optJSONArray.length()) {
            try {
                strArr[i] = optJSONArray.getString(i);
                i++;
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrand.JsApi.OptionsPickerHandler", "opt data.array, exp = %s", Util.stackTraceToString(e));
                mo22194c("fail", (Map<String, Object>) null);
                return;
            }
        }
        mo22196h(new C17949b(strArr, optInt));
    }

    /* renamed from: f */
    public void mo22189f(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("array");
        int optInt = jSONObject.optInt("current", 0);
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            Log.m105924i("MicroMsg.AppBrand.JsApi.OptionsPickerHandler", "showPickerView as selector, empty range");
            mo22194c("ok", (Map<String, Object>) null);
            mo22196h(new C17950c());
            return;
        }
        String[] strArr = new String[optJSONArray.length()];
        int i = 0;
        while (i < optJSONArray.length()) {
            try {
                strArr[i] = optJSONArray.getString(i);
                i++;
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrand.JsApi.OptionsPickerHandler", "opt data.array, exp = %s", Util.stackTraceToString(e));
                mo22194c("fail", (Map<String, Object>) null);
                return;
            }
        }
        mo22196h(new C17951d(strArr, optInt));
    }
}
