package com.tencent.p014mm.plugin.wallet_core.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.wallet_core.model.C72193b;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.wallet_core.model.BindCardOrder */
public class BindCardOrder implements Parcelable {
    public static final Parcelable.Creator<BindCardOrder> CREATOR = new C72174a();

    /* renamed from: d */
    public String f209468d = "";

    /* renamed from: e */
    public String f209469e = "";

    /* renamed from: f */
    public String f209470f = "";

    /* renamed from: g */
    public int f209471g;

    /* renamed from: h */
    public String f209472h;

    /* renamed from: i */
    public String f209473i = "";

    /* renamed from: j */
    public String f209474j = "";

    /* renamed from: n */
    public String f209475n = "";

    /* renamed from: o */
    public int f209476o;

    /* renamed from: p */
    public int f209477p;

    /* renamed from: q */
    public C72193b f209478q;

    /* renamed from: r */
    public C72193b.C72194a f209479r;

    /* renamed from: s */
    public C72193b.C72195b f209480s;

    /* renamed from: com.tencent.mm.plugin.wallet_core.model.BindCardOrder$a */
    public class C72174a implements Parcelable.Creator<BindCardOrder> {
        public Object createFromParcel(Parcel parcel) {
            return new BindCardOrder(parcel);
        }

        public Object[] newArray(int i) {
            return new BindCardOrder[i];
        }
    }

    public BindCardOrder() {
    }

    /* renamed from: a */
    public void mo99402a(JSONObject jSONObject) {
        String jSONObject2 = jSONObject == null ? "" : jSONObject.toString();
        this.f209468d = jSONObject2;
        Log.m105925i("MicroMsg.BindCardOrder", "feed json %s", jSONObject2);
        try {
            jSONObject.optInt("show_bind_succ_page", 0);
            this.f209469e = jSONObject.optString("bind_succ_btn_wording", "");
            this.f209470f = jSONObject.optString("bind_succ_remind_wording", "");
            this.f209471g = jSONObject.optInt("jump_type", 0);
            this.f209475n = jSONObject.optString("bind_serial");
            JSONObject optJSONObject = jSONObject.optJSONObject("activity_info");
            C72193b bVar = new C72193b();
            this.f209478q = bVar;
            if (optJSONObject != null) {
                bVar.mo99478a(optJSONObject);
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("h5_info");
            if (optJSONObject2 != null) {
                C72193b.C72194a aVar = new C72193b.C72194a();
                this.f209479r = aVar;
                aVar.mo99479a(optJSONObject2);
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("native_info");
            if (optJSONObject3 != null) {
                C72193b.C72194a aVar2 = new C72193b.C72194a();
                this.f209479r = aVar2;
                aVar2.mo99479a(optJSONObject3);
            }
            JSONObject optJSONObject4 = jSONObject.optJSONObject("tinyapp_info");
            if (optJSONObject4 != null) {
                C72193b.C72195b bVar2 = new C72193b.C72195b();
                this.f209480s = bVar2;
                bVar2.mo99480a(optJSONObject4);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BindCardOrder", e, "", new Object[0]);
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f209468d);
    }

    public BindCardOrder(Parcel parcel) {
        this.f209468d = parcel.readString();
        try {
            mo99402a(new JSONObject(this.f209468d));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BindCardOrder", e, "", new Object[0]);
        }
    }
}
