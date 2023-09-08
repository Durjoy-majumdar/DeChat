package com.tencent.mars.smc;

import android.os.Parcel;
import android.os.Parcelable;

public class IDKey implements Parcelable {
    public static final Parcelable.Creator<IDKey> CREATOR = new Parcelable.Creator<IDKey>() {
        public IDKey createFromParcel(Parcel parcel) {
            return new IDKey(parcel);
        }

        public IDKey[] newArray(int i) {
            return new IDKey[i];
        }
    };

    /* renamed from: id */
    private long f235232id;
    private long key;
    private long value;

    public IDKey(int i, int i2, int i3) {
        this.f235232id = (long) i;
        this.key = (long) i2;
        this.value = (long) i3;
    }

    public long GetID() {
        return this.f235232id;
    }

    public long GetKey() {
        return this.key;
    }

    public long GetValue() {
        return this.value;
    }

    public void SetID(int i) {
        this.f235232id = (long) i;
    }

    public void SetKey(int i) {
        this.key = (long) i;
    }

    public void SetValue(long j) {
        this.value = j;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f235232id);
        parcel.writeLong(this.key);
        parcel.writeLong(this.value);
    }

    public IDKey(long j, long j2, long j3) {
        this.f235232id = j;
        this.key = j2;
        this.value = j3;
    }

    public IDKey() {
        this.f235232id = 0;
        this.key = 0;
        this.value = 0;
    }

    public IDKey(Parcel parcel) {
        this.f235232id = parcel.readLong();
        this.key = parcel.readLong();
        this.value = parcel.readLong();
    }
}
