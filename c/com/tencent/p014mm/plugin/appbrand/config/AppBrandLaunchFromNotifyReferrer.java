package com.tencent.p014mm.plugin.appbrand.config;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.appbrand.config.AppBrandLaunchFromNotifyReferrer */
public final class AppBrandLaunchFromNotifyReferrer implements Parcelable {
    public static final Parcelable.Creator<AppBrandLaunchFromNotifyReferrer> CREATOR = new C68590a();

    /* renamed from: d */
    public String f197021d;

    /* renamed from: e */
    public int f197022e;

    /* renamed from: f */
    public int f197023f;

    /* renamed from: g */
    public String f197024g;

    /* renamed from: h */
    public String f197025h;

    /* renamed from: i */
    public int f197026i;

    /* renamed from: j */
    public String f197027j;

    /* renamed from: com.tencent.mm.plugin.appbrand.config.AppBrandLaunchFromNotifyReferrer$a */
    public class C68590a implements Parcelable.Creator<AppBrandLaunchFromNotifyReferrer> {
        public Object createFromParcel(Parcel parcel) {
            return new AppBrandLaunchFromNotifyReferrer(parcel, (C68590a) null);
        }

        public Object[] newArray(int i) {
            return new AppBrandLaunchFromNotifyReferrer[i];
        }
    }

    public AppBrandLaunchFromNotifyReferrer() {
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "AppBrandLaunchFromNotifyReferrer{appId=" + this.f197021d + ", uin='" + this.f197022e + '\'' + ", readscene='" + this.f197023f + '\'' + ", appbrandPushMsgId='" + this.f197024g + '\'' + ", content='" + this.f197025h + '\'' + ", opLocation='" + this.f197026i + '\'' + ", reportSessionId='" + this.f197027j + '\'' + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f197021d);
        parcel.writeInt(this.f197022e);
        parcel.writeInt(this.f197023f);
        parcel.writeString(this.f197024g);
        parcel.writeString(this.f197025h);
        parcel.writeInt(this.f197026i);
        parcel.writeString(this.f197027j);
    }

    public AppBrandLaunchFromNotifyReferrer(Parcel parcel, C68590a aVar) {
        this.f197021d = parcel.readString();
        this.f197022e = parcel.readInt();
        this.f197023f = parcel.readInt();
        this.f197024g = parcel.readString();
        this.f197025h = parcel.readString();
        this.f197026i = parcel.readInt();
        this.f197027j = parcel.readString();
    }
}
