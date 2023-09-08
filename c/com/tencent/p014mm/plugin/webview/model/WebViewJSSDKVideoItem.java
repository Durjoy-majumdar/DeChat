package com.tencent.p014mm.plugin.webview.model;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem */
public class WebViewJSSDKVideoItem extends WebViewJSSDKFileItem {
    public static final Parcelable.Creator<WebViewJSSDKVideoItem> CREATOR = new C6022a();

    /* renamed from: w */
    public int f22269w;

    /* renamed from: com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem$a */
    public class C6022a implements Parcelable.Creator<WebViewJSSDKVideoItem> {
        public Object createFromParcel(Parcel parcel) {
            return new WebViewJSSDKVideoItem(parcel);
        }

        public Object[] newArray(int i) {
            return new WebViewJSSDKVideoItem[i];
        }
    }

    public WebViewJSSDKVideoItem() {
        this.f283028n = 4;
    }

    /* renamed from: a */
    public JSONObject mo6979a() {
        JSONObject a = super.mo6979a();
        try {
            a.put("duration", this.f22269w);
        } catch (JSONException unused) {
        }
        return a;
    }

    /* renamed from: b */
    public String mo6980b() {
        return "mp4";
    }

    /* renamed from: c */
    public String mo6981c() {
        return "video";
    }

    /* renamed from: d */
    public void mo6982d(JSONObject jSONObject) {
        super.mo6982d(jSONObject);
        if (jSONObject != null) {
            this.f22269w = jSONObject.optInt("duration");
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f22269w);
    }

    public WebViewJSSDKVideoItem(Parcel parcel) {
        super(parcel);
        this.f22269w = parcel.readInt();
    }
}
