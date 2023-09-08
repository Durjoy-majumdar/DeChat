package com.tencent.p014mm.plugin.performance.elf;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.performance.elf.ElfCheckRequest */
public class ElfCheckRequest implements Parcelable {
    public static final Parcelable.Creator<ElfCheckRequest> CREATOR = new C30341a();

    /* renamed from: d */
    public long f81889d = 0;

    /* renamed from: com.tencent.mm.plugin.performance.elf.ElfCheckRequest$a */
    public class C30341a implements Parcelable.Creator<ElfCheckRequest> {
        public Object createFromParcel(Parcel parcel) {
            return new ElfCheckRequest(parcel);
        }

        public Object[] newArray(int i) {
            return new ElfCheckRequest[i];
        }
    }

    public ElfCheckRequest() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f81889d);
    }

    public ElfCheckRequest(Parcel parcel) {
        this.f81889d = parcel.readLong();
    }
}
