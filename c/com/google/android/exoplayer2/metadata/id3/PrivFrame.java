package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1883v2;
import java.util.Arrays;
import p333e8.C20551y;

public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator<PrivFrame> CREATOR = new C16953a();

    /* renamed from: e */
    public final String f45821e;

    /* renamed from: f */
    public final byte[] f45822f;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.PrivFrame$a */
    public static class C16953a implements Parcelable.Creator<PrivFrame> {
        public Object createFromParcel(Parcel parcel) {
            return new PrivFrame(parcel);
        }

        public Object[] newArray(int i) {
            return new PrivFrame[i];
        }
    }

    public PrivFrame(String str, byte[] bArr) {
        super("PRIV");
        this.f45821e = str;
        this.f45822f = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PrivFrame.class != obj.getClass()) {
            return false;
        }
        PrivFrame privFrame = (PrivFrame) obj;
        return C20551y.m22311a(this.f45821e, privFrame.f45821e) && Arrays.equals(this.f45822f, privFrame.f45822f);
    }

    public int hashCode() {
        String str = this.f45821e;
        return ((C1883v2.CTRL_INDEX + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f45822f);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f45821e);
        parcel.writeByteArray(this.f45822f);
    }

    public PrivFrame(Parcel parcel) {
        super("PRIV");
        this.f45821e = parcel.readString();
        this.f45822f = parcel.createByteArray();
    }
}
