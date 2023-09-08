package com.google.android.exoplayer2;

import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.video.ColorInfo;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1883v2;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p333e8.C20551y;

public final class Format implements Parcelable {
    public static final Parcelable.Creator<Format> CREATOR = new C16944a();

    /* renamed from: A */
    public final int f45765A;

    /* renamed from: B */
    public final int f45766B;

    /* renamed from: C */
    public final long f45767C;

    /* renamed from: D */
    public final int f45768D;

    /* renamed from: E */
    public final String f45769E;

    /* renamed from: F */
    public final int f45770F;

    /* renamed from: G */
    public int f45771G;

    /* renamed from: d */
    public final String f45772d;

    /* renamed from: e */
    public final int f45773e;

    /* renamed from: f */
    public final String f45774f;

    /* renamed from: g */
    public final Metadata f45775g;

    /* renamed from: h */
    public final String f45776h;

    /* renamed from: i */
    public final String f45777i;

    /* renamed from: j */
    public final int f45778j;

    /* renamed from: n */
    public final List<byte[]> f45779n;

    /* renamed from: o */
    public final DrmInitData f45780o;

    /* renamed from: p */
    public final int f45781p;

    /* renamed from: q */
    public final int f45782q;

    /* renamed from: r */
    public final float f45783r;

    /* renamed from: s */
    public final int f45784s;

    /* renamed from: t */
    public final float f45785t;

    /* renamed from: u */
    public final int f45786u;

    /* renamed from: v */
    public final byte[] f45787v;

    /* renamed from: w */
    public final ColorInfo f45788w;

    /* renamed from: x */
    public final int f45789x;

    /* renamed from: y */
    public final int f45790y;

    /* renamed from: z */
    public final int f45791z;

    /* renamed from: com.google.android.exoplayer2.Format$a */
    public static class C16944a implements Parcelable.Creator<Format> {
        public Object createFromParcel(Parcel parcel) {
            return new Format(parcel);
        }

        public Object[] newArray(int i) {
            return new Format[i];
        }
    }

    public Format(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, ColorInfo colorInfo, int i7, int i8, int i9, int i15, int i16, int i17, String str5, int i18, long j, List<byte[]> list, DrmInitData drmInitData, Metadata metadata) {
        this.f45772d = str;
        this.f45776h = str2;
        this.f45777i = str3;
        this.f45774f = str4;
        this.f45773e = i;
        this.f45778j = i2;
        this.f45781p = i3;
        this.f45782q = i4;
        this.f45783r = f;
        this.f45784s = i5;
        this.f45785t = f2;
        this.f45787v = bArr;
        this.f45786u = i6;
        this.f45788w = colorInfo;
        this.f45789x = i7;
        this.f45790y = i8;
        this.f45791z = i9;
        this.f45765A = i15;
        this.f45766B = i16;
        this.f45768D = i17;
        this.f45769E = str5;
        this.f45770F = i18;
        this.f45767C = j;
        this.f45779n = list == null ? Collections.emptyList() : list;
        this.f45780o = drmInitData;
        this.f45775g = metadata;
    }

    /* renamed from: a */
    public static Format m16640a(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, List<byte[]> list, DrmInitData drmInitData, int i8, String str4, Metadata metadata) {
        return new Format(str, (String) null, str2, str3, i, i2, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (ColorInfo) null, i3, i4, i5, i6, i7, i8, str4, -1, MAlarmHandler.NEXT_FIRE_INTERVAL, list, drmInitData, metadata);
    }

    /* renamed from: b */
    public static Format m16641b(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, List<byte[]> list, DrmInitData drmInitData, int i6, String str4) {
        return m16640a(str, str2, str3, i, i2, i3, i4, i5, -1, -1, list, drmInitData, i6, str4, (Metadata) null);
    }

    /* renamed from: c */
    public static Format m16642c(String str, String str2, String str3, int i, int i2, int i3, int i4, List<byte[]> list, DrmInitData drmInitData, int i5, String str4) {
        return m16641b(str, str2, str3, i, i2, i3, i4, -1, list, drmInitData, i5, str4);
    }

    /* renamed from: d */
    public static Format m16643d(String str, String str2, String str3, int i, List<byte[]> list, String str4, DrmInitData drmInitData) {
        return new Format(str, (String) null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (ColorInfo) null, -1, -1, -1, -1, -1, 0, str4, -1, MAlarmHandler.NEXT_FIRE_INTERVAL, list, drmInitData, (Metadata) null);
    }

    /* renamed from: e */
    public static Format m16644e(String str, String str2, long j) {
        return new Format(str, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (ColorInfo) null, -1, -1, -1, -1, -1, 0, (String) null, -1, j, (List<byte[]>) null, (DrmInitData) null, (Metadata) null);
    }

    /* renamed from: f */
    public static Format m16645f(String str, String str2, String str3, int i, DrmInitData drmInitData) {
        return new Format(str, (String) null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (ColorInfo) null, -1, -1, -1, -1, -1, 0, (String) null, -1, MAlarmHandler.NEXT_FIRE_INTERVAL, (List<byte[]>) null, drmInitData, (Metadata) null);
    }

    /* renamed from: g */
    public static Format m16646g(String str, String str2, String str3, String str4, int i, int i2, String str5, int i3) {
        return new Format(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (ColorInfo) null, -1, -1, -1, -1, -1, i2, str5, i3, MAlarmHandler.NEXT_FIRE_INTERVAL, (List<byte[]>) null, (DrmInitData) null, (Metadata) null);
    }

    /* renamed from: h */
    public static Format m16647h(String str, String str2, int i, String str3, DrmInitData drmInitData) {
        return m16648i(str, str2, (String) null, -1, i, str3, -1, drmInitData, MAlarmHandler.NEXT_FIRE_INTERVAL, Collections.emptyList());
    }

    /* renamed from: i */
    public static Format m16648i(String str, String str2, String str3, int i, int i2, String str4, int i3, DrmInitData drmInitData, long j, List<byte[]> list) {
        return new Format(str, (String) null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (ColorInfo) null, -1, -1, -1, -1, -1, i2, str4, i3, j, list, drmInitData, (Metadata) null);
    }

    /* renamed from: j */
    public static Format m16649j(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, DrmInitData drmInitData) {
        return m16650m(str, str2, str3, i, i2, i3, i4, f, list, i5, f2, (byte[]) null, -1, (ColorInfo) null, drmInitData);
    }

    /* renamed from: m */
    public static Format m16650m(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, byte[] bArr, int i6, ColorInfo colorInfo, DrmInitData drmInitData) {
        return new Format(str, (String) null, str2, str3, i, i2, i3, i4, f, i5, f2, bArr, i6, colorInfo, -1, -1, -1, -1, -1, 0, (String) null, -1, MAlarmHandler.NEXT_FIRE_INTERVAL, list, drmInitData, (Metadata) null);
    }

    /* renamed from: q */
    public static void m16651q(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* renamed from: t */
    public static String m16652t(Format format) {
        if (format == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append(format.f45772d);
        sb.append(", mimeType=");
        sb.append(format.f45777i);
        if (format.f45773e != -1) {
            sb.append(", bitrate=");
            sb.append(format.f45773e);
        }
        if (!(format.f45781p == -1 || format.f45782q == -1)) {
            sb.append(", res=");
            sb.append(format.f45781p);
            sb.append("x");
            sb.append(format.f45782q);
        }
        if (format.f45783r != -1.0f) {
            sb.append(", fps=");
            sb.append(format.f45783r);
        }
        if (format.f45789x != -1) {
            sb.append(", channels=");
            sb.append(format.f45789x);
        }
        if (format.f45790y != -1) {
            sb.append(", sample_rate=");
            sb.append(format.f45790y);
        }
        if (format.f45769E != null) {
            sb.append(", language=");
            sb.append(format.f45769E);
        }
        return sb.toString();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Format.class == obj.getClass()) {
            Format format = (Format) obj;
            if (this.f45773e == format.f45773e && this.f45778j == format.f45778j && this.f45781p == format.f45781p && this.f45782q == format.f45782q && this.f45783r == format.f45783r && this.f45784s == format.f45784s && this.f45785t == format.f45785t && this.f45786u == format.f45786u && this.f45789x == format.f45789x && this.f45790y == format.f45790y && this.f45791z == format.f45791z && this.f45765A == format.f45765A && this.f45766B == format.f45766B && this.f45767C == format.f45767C && this.f45768D == format.f45768D && C20551y.m22311a(this.f45772d, format.f45772d) && C20551y.m22311a(this.f45769E, format.f45769E) && this.f45770F == format.f45770F && C20551y.m22311a(this.f45776h, format.f45776h) && C20551y.m22311a(this.f45777i, format.f45777i) && C20551y.m22311a(this.f45774f, format.f45774f) && C20551y.m22311a(this.f45780o, format.f45780o) && C20551y.m22311a(this.f45775g, format.f45775g) && C20551y.m22311a(this.f45788w, format.f45788w) && Arrays.equals(this.f45787v, format.f45787v) && this.f45779n.size() == format.f45779n.size()) {
                for (int i = 0; i < this.f45779n.size(); i++) {
                    if (!Arrays.equals(this.f45779n.get(i), format.f45779n.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f45771G == 0) {
            String str = this.f45772d;
            int i = 0;
            int hashCode = (C1883v2.CTRL_INDEX + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f45776h;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f45777i;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f45774f;
            int hashCode4 = (((((((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f45773e) * 31) + this.f45781p) * 31) + this.f45782q) * 31) + this.f45789x) * 31) + this.f45790y) * 31;
            String str5 = this.f45769E;
            int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f45770F) * 31;
            DrmInitData drmInitData = this.f45780o;
            int hashCode6 = (hashCode5 + (drmInitData == null ? 0 : drmInitData.hashCode())) * 31;
            Metadata metadata = this.f45775g;
            if (metadata != null) {
                i = metadata.hashCode();
            }
            this.f45771G = hashCode6 + i;
        }
        return this.f45771G;
    }

    /* renamed from: o */
    public final MediaFormat mo18398o() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.f45777i);
        String str = this.f45769E;
        if (str != null) {
            mediaFormat.setString(FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, str);
        }
        m16651q(mediaFormat, "max-input-size", this.f45778j);
        m16651q(mediaFormat, "width", this.f45781p);
        m16651q(mediaFormat, "height", this.f45782q);
        float f = this.f45783r;
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
        m16651q(mediaFormat, "rotation-degrees", this.f45784s);
        m16651q(mediaFormat, "channel-count", this.f45789x);
        m16651q(mediaFormat, "sample-rate", this.f45790y);
        m16651q(mediaFormat, "encoder-delay", this.f45765A);
        m16651q(mediaFormat, "encoder-padding", this.f45766B);
        for (int i = 0; i < this.f45779n.size(); i++) {
            mediaFormat.setByteBuffer("csd-" + i, ByteBuffer.wrap(this.f45779n.get(i)));
        }
        ColorInfo colorInfo = this.f45788w;
        if (colorInfo != null) {
            m16651q(mediaFormat, "color-transfer", colorInfo.f339183f);
            m16651q(mediaFormat, "color-standard", colorInfo.f339181d);
            m16651q(mediaFormat, "color-range", colorInfo.f339182e);
            byte[] bArr = colorInfo.f339184g;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    /* renamed from: p */
    public int mo18399p() {
        int i;
        int i2 = this.f45781p;
        if (i2 == -1 || (i = this.f45782q) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public String toString() {
        return "Format(" + this.f45772d + ", " + this.f45776h + ", " + this.f45777i + ", " + this.f45773e + ", " + this.f45769E + ", [" + this.f45781p + ", " + this.f45782q + ", " + this.f45783r + "], [" + this.f45789x + ", " + this.f45790y + "])";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f45772d);
        parcel.writeString(this.f45776h);
        parcel.writeString(this.f45777i);
        parcel.writeString(this.f45774f);
        parcel.writeInt(this.f45773e);
        parcel.writeInt(this.f45778j);
        parcel.writeInt(this.f45781p);
        parcel.writeInt(this.f45782q);
        parcel.writeFloat(this.f45783r);
        parcel.writeInt(this.f45784s);
        parcel.writeFloat(this.f45785t);
        parcel.writeInt(this.f45787v != null ? 1 : 0);
        byte[] bArr = this.f45787v;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f45786u);
        parcel.writeParcelable(this.f45788w, i);
        parcel.writeInt(this.f45789x);
        parcel.writeInt(this.f45790y);
        parcel.writeInt(this.f45791z);
        parcel.writeInt(this.f45765A);
        parcel.writeInt(this.f45766B);
        parcel.writeInt(this.f45768D);
        parcel.writeString(this.f45769E);
        parcel.writeInt(this.f45770F);
        parcel.writeLong(this.f45767C);
        int size = this.f45779n.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray(this.f45779n.get(i2));
        }
        parcel.writeParcelable(this.f45780o, 0);
        parcel.writeParcelable(this.f45775g, 0);
    }

    public Format(Parcel parcel) {
        this.f45772d = parcel.readString();
        this.f45776h = parcel.readString();
        this.f45777i = parcel.readString();
        this.f45774f = parcel.readString();
        this.f45773e = parcel.readInt();
        this.f45778j = parcel.readInt();
        this.f45781p = parcel.readInt();
        this.f45782q = parcel.readInt();
        this.f45783r = parcel.readFloat();
        this.f45784s = parcel.readInt();
        this.f45785t = parcel.readFloat();
        this.f45787v = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.f45786u = parcel.readInt();
        this.f45788w = (ColorInfo) parcel.readParcelable(ColorInfo.class.getClassLoader());
        this.f45789x = parcel.readInt();
        this.f45790y = parcel.readInt();
        this.f45791z = parcel.readInt();
        this.f45765A = parcel.readInt();
        this.f45766B = parcel.readInt();
        this.f45768D = parcel.readInt();
        this.f45769E = parcel.readString();
        this.f45770F = parcel.readInt();
        this.f45767C = parcel.readLong();
        int readInt = parcel.readInt();
        this.f45779n = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f45779n.add(parcel.createByteArray());
        }
        this.f45780o = (DrmInitData) parcel.readParcelable(DrmInitData.class.getClassLoader());
        this.f45775g = (Metadata) parcel.readParcelable(Metadata.class.getClassLoader());
    }
}
