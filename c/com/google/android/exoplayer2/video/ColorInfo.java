package com.google.android.exoplayer2.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1883v2;
import java.util.Arrays;

public final class ColorInfo implements Parcelable {
    public static final Parcelable.Creator<ColorInfo> CREATOR = new C113374a();

    /* renamed from: d */
    public final int f339181d;

    /* renamed from: e */
    public final int f339182e;

    /* renamed from: f */
    public final int f339183f;

    /* renamed from: g */
    public final byte[] f339184g;

    /* renamed from: h */
    public int f339185h;

    /* renamed from: com.google.android.exoplayer2.video.ColorInfo$a */
    public static class C113374a implements Parcelable.Creator<ColorInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new ColorInfo(parcel);
        }

        public Object[] newArray(int i) {
            return new ColorInfo[0];
        }
    }

    public ColorInfo(int i, int i2, int i3, byte[] bArr) {
        this.f339181d = i;
        this.f339182e = i2;
        this.f339183f = i3;
        this.f339184g = bArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ColorInfo.class == obj.getClass()) {
            ColorInfo colorInfo = (ColorInfo) obj;
            return this.f339181d == colorInfo.f339181d && this.f339182e == colorInfo.f339182e && this.f339183f == colorInfo.f339183f && Arrays.equals(this.f339184g, colorInfo.f339184g);
        }
    }

    public int hashCode() {
        if (this.f339185h == 0) {
            this.f339185h = ((((((C1883v2.CTRL_INDEX + this.f339181d) * 31) + this.f339182e) * 31) + this.f339183f) * 31) + Arrays.hashCode(this.f339184g);
        }
        return this.f339185h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(this.f339181d);
        sb.append(", ");
        sb.append(this.f339182e);
        sb.append(", ");
        sb.append(this.f339183f);
        sb.append(", ");
        sb.append(this.f339184g != null);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f339181d);
        parcel.writeInt(this.f339182e);
        parcel.writeInt(this.f339183f);
        parcel.writeInt(this.f339184g != null ? 1 : 0);
        byte[] bArr = this.f339184g;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    public ColorInfo(Parcel parcel) {
        this.f339181d = parcel.readInt();
        this.f339182e = parcel.readInt();
        this.f339183f = parcel.readInt();
        this.f339184g = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }
}
