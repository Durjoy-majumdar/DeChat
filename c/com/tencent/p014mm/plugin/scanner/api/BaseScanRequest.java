package com.tencent.p014mm.plugin.scanner.api;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.scanner.api.BaseScanRequest */
public class BaseScanRequest implements Parcelable {
    public static final Parcelable.Creator<BaseScanRequest> CREATOR = new C85409a();

    /* renamed from: d */
    public boolean f248896d = false;

    /* renamed from: e */
    public boolean f248897e = false;

    /* renamed from: f */
    public boolean f248898f = false;

    /* renamed from: g */
    public boolean f248899g = true;

    /* renamed from: h */
    public boolean f248900h = true;

    /* renamed from: i */
    public Bundle f248901i;

    /* renamed from: com.tencent.mm.plugin.scanner.api.BaseScanRequest$a */
    public class C85409a implements Parcelable.Creator<BaseScanRequest> {
        public Object createFromParcel(Parcel parcel) {
            return new BaseScanRequest(parcel);
        }

        public Object[] newArray(int i) {
            return new BaseScanRequest[i];
        }
    }

    public BaseScanRequest() {
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return String.format("BaseScanRequest{hideBottomTab: %b, hideScanTips: %b, hideFlashSwitcher: %b, hideGalleryButton: %b, hideOptionMenu: %b}", new Object[]{Boolean.valueOf(this.f248896d), Boolean.valueOf(this.f248897e), Boolean.valueOf(this.f248898f), Boolean.valueOf(this.f248899g), Boolean.valueOf(this.f248900h)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f248896d ? (byte) 1 : 0);
        parcel.writeByte(this.f248897e ? (byte) 1 : 0);
        parcel.writeByte(this.f248898f ? (byte) 1 : 0);
        parcel.writeByte(this.f248899g ? (byte) 1 : 0);
        parcel.writeByte(this.f248900h ? (byte) 1 : 0);
        parcel.writeBundle(this.f248901i);
    }

    public BaseScanRequest(Parcel parcel) {
        boolean z = false;
        this.f248896d = parcel.readByte() != 0;
        this.f248897e = parcel.readByte() != 0;
        this.f248898f = parcel.readByte() != 0;
        this.f248899g = parcel.readByte() != 0;
        this.f248900h = parcel.readByte() != 0 ? true : z;
        this.f248901i = parcel.readBundle();
    }
}
