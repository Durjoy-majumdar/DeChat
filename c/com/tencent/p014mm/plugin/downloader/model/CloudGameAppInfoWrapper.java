package com.tencent.p014mm.plugin.downloader.model;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/downloader/model/CloudGameAppInfoWrapper;", "Landroid/os/Parcelable;", "plugin-downloader_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper */
public final class CloudGameAppInfoWrapper implements Parcelable {
    public static final Parcelable.Creator<CloudGameAppInfoWrapper> CREATOR = new C40914a();

    /* renamed from: d */
    public final String f110075d;

    /* renamed from: e */
    public final String f110076e;

    /* renamed from: f */
    public final String f110077f;

    /* renamed from: g */
    public final int f110078g;

    /* renamed from: h */
    public final CloudGameAppInfo f110079h;

    /* renamed from: com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper$a */
    public static final class C40914a implements Parcelable.Creator<CloudGameAppInfoWrapper> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new CloudGameAppInfoWrapper(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), CloudGameAppInfo.CREATOR.createFromParcel(parcel));
        }

        public Object[] newArray(int i) {
            return new CloudGameAppInfoWrapper[i];
        }
    }

    public CloudGameAppInfoWrapper(String str, String str2, String str3, int i, CloudGameAppInfo cloudGameAppInfo) {
        C87412m.m108594g(cloudGameAppInfo, "appInfo");
        this.f110075d = str;
        this.f110076e = str2;
        this.f110077f = str3;
        this.f110078g = i;
        this.f110079h = cloudGameAppInfo;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloudGameAppInfoWrapper)) {
            return false;
        }
        CloudGameAppInfoWrapper cloudGameAppInfoWrapper = (CloudGameAppInfoWrapper) obj;
        return C87412m.m108589b(this.f110075d, cloudGameAppInfoWrapper.f110075d) && C87412m.m108589b(this.f110076e, cloudGameAppInfoWrapper.f110076e) && C87412m.m108589b(this.f110077f, cloudGameAppInfoWrapper.f110077f) && this.f110078g == cloudGameAppInfoWrapper.f110078g && C87412m.m108589b(this.f110079h, cloudGameAppInfoWrapper.f110079h);
    }

    public int hashCode() {
        String str = this.f110075d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f110076e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f110077f;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((((hashCode2 + i) * 31) + this.f110078g) * 31) + this.f110079h.hashCode();
    }

    public String toString() {
        return "CloudGameAppInfoWrapper(jumpUrl=" + this.f110075d + ", gameId=" + this.f110076e + ", actId=" + this.f110077f + ", scene=" + this.f110078g + ", appInfo=" + this.f110079h + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f110075d);
        parcel.writeString(this.f110076e);
        parcel.writeString(this.f110077f);
        parcel.writeInt(this.f110078g);
        this.f110079h.writeToParcel(parcel, i);
    }

    public CloudGameAppInfoWrapper() {
        this((String) null, (String) null, (String) null, 1, new CloudGameAppInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, 0, 16383, (C8480h) null));
    }
}
