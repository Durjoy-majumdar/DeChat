package com.tencent.p014mm.plugin.wallet_payu.bind.model;

import android.os.Parcel;
import android.os.Parcelable;
import dr3.C45440a;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.wallet_payu.bind.model.NetScenePayUElementQuery */
public class NetScenePayUElementQuery extends C45440a {

    /* renamed from: d */
    public String f211133d;

    /* renamed from: e */
    public PayUBankcardElement f211134e;

    /* renamed from: com.tencent.mm.plugin.wallet_payu.bind.model.NetScenePayUElementQuery$PayUBankcardElement */
    public static class PayUBankcardElement implements Parcelable {

        /* renamed from: d */
        public String f211135d = "";

        /* renamed from: e */
        public String f211136e = "";

        /* renamed from: f */
        public String f211137f = "";

        /* renamed from: g */
        public String f211138g = "";

        /* renamed from: h */
        public String f211139h = "";

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f211135d);
            parcel.writeString(this.f211136e);
            parcel.writeString(this.f211137f);
            parcel.writeString(this.f211138g);
            parcel.writeString(this.f211139h);
        }
    }

    public NetScenePayUElementQuery(String str) {
        this.f211133d = str;
        HashMap hashMap = new HashMap();
        hashMap.put("card_number", str);
        setRequestData(hashMap);
    }

    /* renamed from: j1 */
    public int mo70937j1() {
        return 22;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        PayUBankcardElement payUBankcardElement = new PayUBankcardElement();
        this.f211134e = payUBankcardElement;
        payUBankcardElement.f211135d = jSONObject.optString("bin");
        this.f211134e.f211136e = jSONObject.optString("bank_name");
        this.f211134e.f211137f = jSONObject.optString("issuer_type");
        this.f211134e.f211138g = jSONObject.optString("card_type");
        this.f211134e.f211139h = jSONObject.optString("payu_reference");
    }
}
