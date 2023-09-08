package ek0;

import android.app.Activity;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.address.AddressSelectorContract;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import di3.C86312j;
import gy3.C87412m;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: ek0.h */
public final class C7727h extends C82268c<C81879g> {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "showAddressPickerView";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        ArrayList arrayList;
        C81879g gVar = (C81879g) fVar;
        C87412m.m108594g(gVar, "env");
        C87412m.m108594g(jSONObject, "data");
        Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(gVar.getContext());
        if (castActivityOrNull == null) {
            gVar.mo109647a(i, mo115109j("fail:internal error invalid android context"));
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("current");
        if (optJSONArray != null) {
            arrayList = new ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                arrayList.add(optJSONArray.optString(i2, "undefined"));
            }
        } else {
            arrayList = null;
        }
        try {
            AddressSelectorContract addressSelectorContract = (AddressSelectorContract) C86312j.m106911c(AddressSelectorContract.class);
            AddressSelectorContract.C1582a a = AddressSelectorContract.C1582a.f11052e.mo1619a(jSONObject.optString("mode"));
            if (a == null) {
                a = AddressSelectorContract.C1582a.REGION;
            }
            addressSelectorContract.mu0(castActivityOrNull, new AddressSelectorContract.SelectRequest(a, arrayList, true), new C7725f(gVar, i, this), new C7726g(gVar, i, this));
        } catch (Exception e) {
            Log.m105920e("MicroMsg.JsApiShowAddressPickerView", "invoke appId:" + gVar.getAppId() + ", callbackId:" + i + ", get exception:" + e);
            StringBuilder sb = new StringBuilder();
            sb.append("fail ");
            sb.append(e);
            gVar.mo109647a(i, mo115109j(sb.toString()));
        }
    }
}
