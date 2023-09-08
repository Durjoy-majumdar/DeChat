package com.tencent.p014mm.plugin.webview.model;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.webview.model.WebViewJSSDKVoiceItem */
public class WebViewJSSDKVoiceItem extends WebViewJSSDKFileItem {
    public static final Parcelable.Creator<WebViewJSSDKVoiceItem> CREATOR = new C6023a();

    /* renamed from: com.tencent.mm.plugin.webview.model.WebViewJSSDKVoiceItem$a */
    public class C6023a implements Parcelable.Creator<WebViewJSSDKVoiceItem> {
        public Object createFromParcel(Parcel parcel) {
            return new WebViewJSSDKVoiceItem(parcel);
        }

        public Object[] newArray(int i) {
            return new WebViewJSSDKVoiceItem[i];
        }
    }

    public WebViewJSSDKVoiceItem() {
        this.f283028n = 2;
    }

    /* renamed from: b */
    public String mo6980b() {
        return "speex";
    }

    /* renamed from: c */
    public String mo6981c() {
        return "voice";
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    public WebViewJSSDKVoiceItem(Parcel parcel) {
        super(parcel);
    }
}
