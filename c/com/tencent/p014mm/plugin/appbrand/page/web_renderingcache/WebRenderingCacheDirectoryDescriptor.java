package com.tencent.p014mm.plugin.appbrand.page.web_renderingcache;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.appbrand.page.web_renderingcache.WebRenderingCacheDirectoryDescriptor */
public class WebRenderingCacheDirectoryDescriptor implements Parcelable {
    public static final Parcelable.Creator<WebRenderingCacheDirectoryDescriptor> CREATOR = new C83965a();

    /* renamed from: d */
    public String f245118d;

    /* renamed from: com.tencent.mm.plugin.appbrand.page.web_renderingcache.WebRenderingCacheDirectoryDescriptor$a */
    public class C83965a implements Parcelable.Creator<WebRenderingCacheDirectoryDescriptor> {
        public Object createFromParcel(Parcel parcel) {
            return new WebRenderingCacheDirectoryDescriptor(parcel);
        }

        public Object[] newArray(int i) {
            return new WebRenderingCacheDirectoryDescriptor[i];
        }
    }

    public WebRenderingCacheDirectoryDescriptor() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f245118d);
    }

    public WebRenderingCacheDirectoryDescriptor(Parcel parcel) {
        this.f245118d = parcel.readString();
    }
}
