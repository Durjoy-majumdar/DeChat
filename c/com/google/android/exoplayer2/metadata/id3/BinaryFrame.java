package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1883v2;
import java.util.Arrays;

public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator<BinaryFrame> CREATOR = new C16950a();

    /* renamed from: e */
    public final byte[] f45812e;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.BinaryFrame$a */
    public static class C16950a implements Parcelable.Creator<BinaryFrame> {
        public Object createFromParcel(Parcel parcel) {
            return new BinaryFrame(parcel);
        }

        public Object[] newArray(int i) {
            return new BinaryFrame[i];
        }
    }

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.f45812e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BinaryFrame.class != obj.getClass()) {
            return false;
        }
        BinaryFrame binaryFrame = (BinaryFrame) obj;
        return this.f45820d.equals(binaryFrame.f45820d) && Arrays.equals(this.f45812e, binaryFrame.f45812e);
    }

    public int hashCode() {
        return ((C1883v2.CTRL_INDEX + this.f45820d.hashCode()) * 31) + Arrays.hashCode(this.f45812e);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f45820d);
        parcel.writeByteArray(this.f45812e);
    }

    public BinaryFrame(Parcel parcel) {
        super(parcel.readString());
        this.f45812e = parcel.createByteArray();
    }
}
