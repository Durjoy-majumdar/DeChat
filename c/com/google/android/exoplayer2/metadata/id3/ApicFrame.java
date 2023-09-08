package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1883v2;
import java.util.Arrays;
import p333e8.C20551y;

public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new C16949a();

    /* renamed from: e */
    public final String f45808e;

    /* renamed from: f */
    public final String f45809f;

    /* renamed from: g */
    public final int f45810g;

    /* renamed from: h */
    public final byte[] f45811h;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.ApicFrame$a */
    public static class C16949a implements Parcelable.Creator<ApicFrame> {
        public Object createFromParcel(Parcel parcel) {
            return new ApicFrame(parcel);
        }

        public Object[] newArray(int i) {
            return new ApicFrame[i];
        }
    }

    public ApicFrame(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f45808e = str;
        this.f45809f = str2;
        this.f45810g = i;
        this.f45811h = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ApicFrame.class != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        return this.f45810g == apicFrame.f45810g && C20551y.m22311a(this.f45808e, apicFrame.f45808e) && C20551y.m22311a(this.f45809f, apicFrame.f45809f) && Arrays.equals(this.f45811h, apicFrame.f45811h);
    }

    public int hashCode() {
        int i = (C1883v2.CTRL_INDEX + this.f45810g) * 31;
        String str = this.f45808e;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f45809f;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + Arrays.hashCode(this.f45811h);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f45808e);
        parcel.writeString(this.f45809f);
        parcel.writeInt(this.f45810g);
        parcel.writeByteArray(this.f45811h);
    }

    public ApicFrame(Parcel parcel) {
        super("APIC");
        this.f45808e = parcel.readString();
        this.f45809f = parcel.readString();
        this.f45810g = parcel.readInt();
        this.f45811h = parcel.createByteArray();
    }
}
