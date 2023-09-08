package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1883v2;
import java.util.Arrays;
import p333e8.C20551y;

public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new C16952a();

    /* renamed from: e */
    public final String f45816e;

    /* renamed from: f */
    public final String f45817f;

    /* renamed from: g */
    public final String f45818g;

    /* renamed from: h */
    public final byte[] f45819h;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.GeobFrame$a */
    public static class C16952a implements Parcelable.Creator<GeobFrame> {
        public Object createFromParcel(Parcel parcel) {
            return new GeobFrame(parcel);
        }

        public Object[] newArray(int i) {
            return new GeobFrame[i];
        }
    }

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f45816e = str;
        this.f45817f = str2;
        this.f45818g = str3;
        this.f45819h = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GeobFrame.class != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        return C20551y.m22311a(this.f45816e, geobFrame.f45816e) && C20551y.m22311a(this.f45817f, geobFrame.f45817f) && C20551y.m22311a(this.f45818g, geobFrame.f45818g) && Arrays.equals(this.f45819h, geobFrame.f45819h);
    }

    public int hashCode() {
        String str = this.f45816e;
        int i = 0;
        int hashCode = (C1883v2.CTRL_INDEX + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f45817f;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f45818g;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + Arrays.hashCode(this.f45819h);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f45816e);
        parcel.writeString(this.f45817f);
        parcel.writeString(this.f45818g);
        parcel.writeByteArray(this.f45819h);
    }

    public GeobFrame(Parcel parcel) {
        super("GEOB");
        this.f45816e = parcel.readString();
        this.f45817f = parcel.readString();
        this.f45818g = parcel.readString();
        this.f45819h = parcel.createByteArray();
    }
}
