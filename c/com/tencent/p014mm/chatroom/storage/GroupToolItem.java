package com.tencent.p014mm.chatroom.storage;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.chatroom.storage.GroupToolItem */
public class GroupToolItem implements Parcelable {
    public static final Parcelable.Creator<GroupToolItem> CREATOR = new C28903a();

    /* renamed from: d */
    public String f79318d;

    /* renamed from: e */
    public String f79319e;

    /* renamed from: f */
    public long f79320f;

    /* renamed from: com.tencent.mm.chatroom.storage.GroupToolItem$a */
    public class C28903a implements Parcelable.Creator<GroupToolItem> {
        public Object createFromParcel(Parcel parcel) {
            return new GroupToolItem(parcel);
        }

        public Object[] newArray(int i) {
            return new GroupToolItem[i];
        }
    }

    public GroupToolItem() {
        this.f79318d = "";
        this.f79319e = "";
        this.f79320f = 0;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return obj != null && Util.isEqual(((GroupToolItem) obj).f79318d, this.f79318d);
    }

    public String toString() {
        return "GroupToolItem{username='" + this.f79318d + '\'' + ", path='" + this.f79319e + '\'' + ", updateTime=" + this.f79320f + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f79318d);
        parcel.writeString(this.f79319e);
        parcel.writeLong(this.f79320f);
    }

    public GroupToolItem(String str, String str2) {
        this.f79320f = 0;
        this.f79318d = str;
        this.f79319e = str2;
    }

    public GroupToolItem(String str, String str2, long j) {
        this.f79318d = str;
        this.f79319e = str2;
        this.f79320f = j;
    }

    public GroupToolItem(Parcel parcel) {
        this.f79318d = "";
        this.f79319e = "";
        this.f79320f = 0;
        this.f79318d = parcel.readString();
        this.f79319e = parcel.readString();
        this.f79320f = parcel.readLong();
    }
}
