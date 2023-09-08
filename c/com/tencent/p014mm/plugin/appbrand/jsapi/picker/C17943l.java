package com.tencent.p014mm.plugin.appbrand.jsapi.picker;

import com.tencent.p014mm.plugin.appbrand.widget.picker.AppBrandMultiOptionsPicker;
import com.tencent.p014mm.plugin.appbrand.widget.picker.AppBrandMultiOptionsPickerV2;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import vt0.C22778a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.picker.l */
public class C17943l extends C17926h {

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.picker.l$a */
    public class C17944a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f49456d;

        /* renamed from: e */
        public final /* synthetic */ AppBrandMultiOptionsPicker.C104941b f49457e;

        public C17944a(int i, AppBrandMultiOptionsPicker.C104941b bVar) {
            this.f49456d = i;
            this.f49457e = bVar;
        }

        public void run() {
            Class<AppBrandMultiOptionsPicker> cls = AppBrandMultiOptionsPicker.class;
            C22778a a = C17943l.this.mo35916a(false);
            AppBrandMultiOptionsPicker appBrandMultiOptionsPicker = (AppBrandMultiOptionsPicker) ((a == null || !cls.isInstance(a.getPicker())) ? null : a.getPicker());
            if (appBrandMultiOptionsPicker == null) {
                C17943l.this.mo22194c("fail picker not exists", (Map<String, Object>) null);
                return;
            }
            appBrandMultiOptionsPicker.mo148967c(this.f49456d, this.f49457e);
            C17943l.this.mo22194c("ok", (Map<String, Object>) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.picker.l$b */
    public class C17945b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f49459d;

        /* renamed from: e */
        public final /* synthetic */ AppBrandMultiOptionsPickerV2.C18067b f49460e;

        public C17945b(int i, AppBrandMultiOptionsPickerV2.C18067b bVar) {
            this.f49459d = i;
            this.f49460e = bVar;
        }

        public void run() {
            Class<AppBrandMultiOptionsPickerV2> cls = AppBrandMultiOptionsPickerV2.class;
            C22778a a = C17943l.this.mo35916a(false);
            AppBrandMultiOptionsPickerV2 appBrandMultiOptionsPickerV2 = (AppBrandMultiOptionsPickerV2) ((a == null || !cls.isInstance(a.getPicker())) ? null : a.getPicker());
            if (appBrandMultiOptionsPickerV2 == null) {
                C17943l.this.mo22194c("fail picker not exists", (Map<String, Object>) null);
                return;
            }
            appBrandMultiOptionsPickerV2.mo22617d(this.f49459d, this.f49460e);
            C17943l.this.mo22194c("ok", (Map<String, Object>) null);
        }
    }

    public C17943l(C17946m mVar) {
    }

    /* renamed from: d */
    public void mo22187d(JSONObject jSONObject) {
        super.mo22187d(jSONObject);
    }

    /* renamed from: e */
    public void mo22188e(JSONObject jSONObject) {
        int optInt = jSONObject.optInt("column", -1);
        JSONArray optJSONArray = jSONObject.optJSONArray("array");
        if (optInt < 0 || optJSONArray == null || optJSONArray.length() < 0) {
            mo22194c("fail:invalid data", (Map<String, Object>) null);
            return;
        }
        try {
            int length = optJSONArray.length();
            String[] strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = optJSONArray.getString(i);
            }
            mo22196h(new C17944a(optInt, new AppBrandMultiOptionsPicker.C104941b(strArr, jSONObject.optInt("current", 0))));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AppBrand.JsApiUpdateMultiPickerView", e, "opt params", new Object[0]);
            mo22194c("fail:invalid data", (Map<String, Object>) null);
        }
    }

    /* renamed from: f */
    public void mo22189f(JSONObject jSONObject) {
        int optInt = jSONObject.optInt("column", -1);
        JSONArray optJSONArray = jSONObject.optJSONArray("array");
        if (optInt < 0 || optJSONArray == null || optJSONArray.length() < 0) {
            mo22194c("fail:invalid data", (Map<String, Object>) null);
            return;
        }
        try {
            int length = optJSONArray.length();
            String[] strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = optJSONArray.getString(i);
            }
            mo22196h(new C17945b(optInt, new AppBrandMultiOptionsPickerV2.C18067b(strArr, jSONObject.optInt("current", 0))));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AppBrand.JsApiUpdateMultiPickerView", e, "opt params", new Object[0]);
            mo22194c("fail:invalid data", (Map<String, Object>) null);
        }
    }
}
