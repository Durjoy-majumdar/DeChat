package com.tencent.p014mm.plugin.appbrand.jsapi.picker;

import android.widget.NumberPicker;
import com.tencent.p014mm.plugin.appbrand.widget.picker.AppBrandTimePicker;
import com.tencent.p014mm.plugin.appbrand.widget.picker.AppBrandTimePickerV2;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.IXWebBroadcastListener;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import vt0.C15009n;
import vt0.C22778a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.picker.s */
public final class C17956s extends C17926h {

    /* renamed from: n */
    public int f49478n = -1;

    /* renamed from: o */
    public int f49479o = -1;

    /* renamed from: p */
    public int f49480p = Integer.MAX_VALUE;

    /* renamed from: q */
    public int f49481q = Integer.MAX_VALUE;

    /* renamed from: r */
    public int f49482r = -1;

    /* renamed from: s */
    public int f49483s = -1;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.picker.s$a */
    public class C17957a implements Runnable {
        public C17957a() {
        }

        public void run() {
            NumberPicker numberPicker;
            NumberPicker numberPicker2;
            C17956s sVar = C17956s.this;
            sVar.getClass();
            AppBrandTimePicker appBrandTimePicker = (AppBrandTimePicker) sVar.mo35917b(AppBrandTimePicker.class);
            if (appBrandTimePicker == null) {
                sVar.mo22194c("fail cant init view", (Map<String, Object>) null);
                return;
            }
            C22778a aVar = sVar.f65507d;
            int i = sVar.f49478n;
            int i2 = sVar.f49479o;
            appBrandTimePicker.f49969f = i;
            appBrandTimePicker.f49970g = i2;
            if (C15009n.m14189a(i) && (numberPicker2 = appBrandTimePicker.f49967d) != null) {
                numberPicker2.setMinValue(appBrandTimePicker.f49969f);
            }
            int i3 = sVar.f49480p;
            int i4 = sVar.f49481q;
            appBrandTimePicker.f49971h = i3;
            appBrandTimePicker.f49972i = i4;
            if (C15009n.m14189a(i3) && (numberPicker = appBrandTimePicker.f49967d) != null) {
                numberPicker.setMaxValue(appBrandTimePicker.f49971h);
            }
            int i5 = sVar.f49482r;
            int i6 = sVar.f49483s;
            if (C15009n.m14189a(i5)) {
                if (i6 >= 0 && i6 <= 59) {
                    appBrandTimePicker.setCurrentHour(Integer.valueOf(i5));
                    appBrandTimePicker.setCurrentMinute(Integer.valueOf(i6));
                }
            }
            appBrandTimePicker.mo22632a();
            aVar.setOnResultListener(new C17959t(sVar));
            aVar.mo35911i();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.picker.s$b */
    public class C17958b implements Runnable {
        public C17958b() {
        }

        public void run() {
            C17956s sVar = C17956s.this;
            AppBrandTimePickerV2 appBrandTimePickerV2 = (AppBrandTimePickerV2) sVar.mo35917b(AppBrandTimePickerV2.class);
            if (appBrandTimePickerV2 == null) {
                sVar.mo22194c("fail cant init view", (Map<String, Object>) null);
                return;
            }
            C22778a aVar = sVar.f65507d;
            appBrandTimePickerV2.setMinTime(sVar.f49478n, sVar.f49479o);
            appBrandTimePickerV2.setMaxTime(sVar.f49480p, sVar.f49481q);
            appBrandTimePickerV2.init(sVar.f49482r, sVar.f49483s);
            aVar.setOnResultListener(new C17960u(sVar));
            aVar.setHeader(sVar.f49444i);
            aVar.mo35911i();
        }
    }

    /* renamed from: j */
    public static void m18391j(C17956s sVar, boolean z, String str) {
        C22778a aVar = sVar.f65507d;
        if (aVar != null) {
            aVar.mo35910h();
        }
        if (!z) {
            sVar.mo22194c("fail cancel", (Map<String, Object>) null);
        } else if (Util.isNullOrNil(str)) {
            sVar.mo22194c("fail", (Map<String, Object>) null);
        } else {
            HashMap hashMap = new HashMap(1);
            hashMap.put("value", str);
            sVar.mo22194c("ok", hashMap);
        }
    }

    /* renamed from: d */
    public void mo22187d(JSONObject jSONObject) {
        super.mo22187d(jSONObject);
    }

    /* renamed from: e */
    public void mo22188e(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("range");
        if (optJSONObject != null) {
            String optString = optJSONObject.optString(IXWebBroadcastListener.STAGE_START);
            String optString2 = optJSONObject.optString("end");
            int[] b = C15009n.m14190b(optString);
            if (b != null) {
                this.f49478n = b[0];
                this.f49479o = b[1];
            }
            int[] b2 = C15009n.m14190b(optString2);
            if (b2 != null) {
                this.f49480p = b2[0];
                this.f49481q = b2[1];
            }
        }
        this.f49478n = Math.max(this.f49478n, 0);
        this.f49479o = Math.max(this.f49479o, 0);
        this.f49480p = Math.min(this.f49480p, 23);
        this.f49481q = Math.min(this.f49481q, 59);
        int[] b3 = C15009n.m14190b(jSONObject.optString("current"));
        if (b3 != null) {
            this.f49482r = b3[0];
            this.f49483s = b3[1];
        }
        mo22196h(new C17957a());
    }

    /* renamed from: f */
    public void mo22189f(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("range");
        if (optJSONObject != null) {
            String optString = optJSONObject.optString(IXWebBroadcastListener.STAGE_START);
            String optString2 = optJSONObject.optString("end");
            int[] b = C15009n.m14190b(optString);
            if (b != null) {
                this.f49478n = b[0];
                this.f49479o = b[1];
            }
            int[] b2 = C15009n.m14190b(optString2);
            if (b2 != null) {
                this.f49480p = b2[0];
                this.f49481q = b2[1];
            }
        }
        this.f49478n = Math.max(this.f49478n, 0);
        this.f49479o = Math.max(this.f49479o, 0);
        this.f49480p = Math.min(this.f49480p, 23);
        this.f49481q = Math.min(this.f49481q, 59);
        int[] b3 = C15009n.m14190b(jSONObject.optString("current"));
        if (b3 != null) {
            this.f49482r = b3[0];
            this.f49483s = b3[1];
        }
        mo22196h(new C17958b());
    }
}
