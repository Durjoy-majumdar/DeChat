package com.tencent.p014mm.plugin.appbrand;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.MiniProgramNavigationBackResult */
public class MiniProgramNavigationBackResult implements Parcelable {
    public static final Parcelable.Creator<MiniProgramNavigationBackResult> CREATOR = new C81099a();

    /* renamed from: f */
    public static final MiniProgramNavigationBackResult f238360f = new MiniProgramNavigationBackResult();

    /* renamed from: d */
    public JSONObject f238361d;

    /* renamed from: e */
    public JSONObject f238362e;

    /* renamed from: com.tencent.mm.plugin.appbrand.MiniProgramNavigationBackResult$a */
    public class C81099a implements Parcelable.Creator<MiniProgramNavigationBackResult> {
        public Object createFromParcel(Parcel parcel) {
            return new MiniProgramNavigationBackResult(parcel, (C81099a) null);
        }

        public Object[] newArray(int i) {
            return new MiniProgramNavigationBackResult[i];
        }
    }

    public MiniProgramNavigationBackResult() {
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "MiniProgramNavigationBackResult{extraData=" + this.f238361d + ", privateData=" + this.f238362e + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.f238361d;
        String str = null;
        parcel.writeString(jSONObject == null ? null : jSONObject.toString());
        JSONObject jSONObject2 = this.f238362e;
        if (jSONObject2 != null) {
            str = jSONObject2.toString();
        }
        parcel.writeString(str);
    }

    public MiniProgramNavigationBackResult(Parcel parcel, C81099a aVar) {
        try {
            this.f238361d = new JSONObject(Util.nullAs(parcel.readString(), "{}"));
            this.f238362e = new JSONObject(Util.nullAs(parcel.readString(), "{}"));
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.AppBrand.MiniProgramNavigationBackResult", "readFromParcel, ex = %s", e);
        }
    }
}
