package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;
import p333e8.C20551y;
import p396x6.C22994b;

public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new C16946a();

    /* renamed from: d */
    public final SchemeData[] f45792d;

    /* renamed from: e */
    public int f45793e;

    /* renamed from: f */
    public final int f45794f;

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new C16945a();

        /* renamed from: d */
        public int f45795d;

        /* renamed from: e */
        public final UUID f45796e;

        /* renamed from: f */
        public final String f45797f;

        /* renamed from: g */
        public final String f45798g;

        /* renamed from: h */
        public final byte[] f45799h;

        /* renamed from: i */
        public final boolean f45800i;

        /* renamed from: com.google.android.exoplayer2.drm.DrmInitData$SchemeData$a */
        public static class C16945a implements Parcelable.Creator<SchemeData> {
            public Object createFromParcel(Parcel parcel) {
                return new SchemeData(parcel);
            }

            public Object[] newArray(int i) {
                return new SchemeData[i];
            }
        }

        public SchemeData(UUID uuid, String str, String str2, byte[] bArr) {
            this(uuid, str, str2, bArr, false);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            return this.f45798g.equals(schemeData.f45798g) && C20551y.m22311a(this.f45796e, schemeData.f45796e) && C20551y.m22311a(this.f45797f, schemeData.f45797f) && Arrays.equals(this.f45799h, schemeData.f45799h);
        }

        public int hashCode() {
            if (this.f45795d == 0) {
                int hashCode = this.f45796e.hashCode() * 31;
                String str = this.f45797f;
                this.f45795d = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f45798g.hashCode()) * 31) + Arrays.hashCode(this.f45799h);
            }
            return this.f45795d;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f45796e.getMostSignificantBits());
            parcel.writeLong(this.f45796e.getLeastSignificantBits());
            parcel.writeString(this.f45797f);
            parcel.writeString(this.f45798g);
            parcel.writeByteArray(this.f45799h);
            parcel.writeByte(this.f45800i ? (byte) 1 : 0);
        }

        public SchemeData(UUID uuid, String str, String str2, byte[] bArr, boolean z) {
            uuid.getClass();
            this.f45796e = uuid;
            this.f45797f = str;
            str2.getClass();
            this.f45798g = str2;
            bArr.getClass();
            this.f45799h = bArr;
            this.f45800i = z;
        }

        public SchemeData(Parcel parcel) {
            this.f45796e = new UUID(parcel.readLong(), parcel.readLong());
            this.f45797f = parcel.readString();
            this.f45798g = parcel.readString();
            this.f45799h = parcel.createByteArray();
            this.f45800i = parcel.readByte() != 0;
        }
    }

    /* renamed from: com.google.android.exoplayer2.drm.DrmInitData$a */
    public static class C16946a implements Parcelable.Creator<DrmInitData> {
        public Object createFromParcel(Parcel parcel) {
            return new DrmInitData(parcel);
        }

        public Object[] newArray(int i) {
            return new DrmInitData[i];
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: com.google.android.exoplayer2.drm.DrmInitData$SchemeData[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DrmInitData(boolean r4, com.google.android.exoplayer2.drm.DrmInitData.SchemeData... r5) {
        /*
            r3 = this;
            r3.<init>()
            if (r4 == 0) goto L_0x000c
            java.lang.Object r4 = r5.clone()
            r5 = r4
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r5 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData[]) r5
        L_0x000c:
            java.util.Arrays.sort(r5, r3)
            r4 = 1
        L_0x0010:
            int r0 = r5.length
            if (r4 >= r0) goto L_0x0041
            int r0 = r4 + -1
            r0 = r5[r0]
            java.util.UUID r0 = r0.f45796e
            r1 = r5[r4]
            java.util.UUID r1 = r1.f45796e
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0026
            int r4 = r4 + 1
            goto L_0x0010
        L_0x0026:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Duplicate data for uuid: "
            r1.append(r2)
            r4 = r5[r4]
            java.util.UUID r4 = r4.f45796e
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L_0x0041:
            r3.f45792d = r5
            int r4 = r5.length
            r3.f45794f = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DrmInitData.<init>(boolean, com.google.android.exoplayer2.drm.DrmInitData$SchemeData[]):void");
    }

    /* renamed from: a */
    public DrmInitData mo18404a(String str) {
        boolean z;
        SchemeData[] schemeDataArr = this.f45792d;
        int length = schemeDataArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else if (!C20551y.m22311a(schemeDataArr[i].f45797f, str)) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            return this;
        }
        int length2 = this.f45792d.length;
        SchemeData[] schemeDataArr2 = new SchemeData[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            SchemeData schemeData = this.f45792d[i2];
            if (!C20551y.m22311a(schemeData.f45797f, str)) {
                schemeData = new SchemeData(schemeData.f45796e, str, schemeData.f45798g, schemeData.f45799h, schemeData.f45800i);
            }
            schemeDataArr2[i2] = schemeData;
        }
        return new DrmInitData(true, schemeDataArr2);
    }

    public int compare(Object obj, Object obj2) {
        SchemeData schemeData = (SchemeData) obj;
        SchemeData schemeData2 = (SchemeData) obj2;
        UUID uuid = C22994b.f66071b;
        return uuid.equals(schemeData.f45796e) ? uuid.equals(schemeData2.f45796e) ? 0 : 1 : schemeData.f45796e.compareTo(schemeData2.f45796e);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DrmInitData.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f45792d, ((DrmInitData) obj).f45792d);
    }

    public int hashCode() {
        if (this.f45793e == 0) {
            this.f45793e = Arrays.hashCode(this.f45792d);
        }
        return this.f45793e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f45792d, 0);
    }

    public DrmInitData(Parcel parcel) {
        SchemeData[] schemeDataArr = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        this.f45792d = schemeDataArr;
        this.f45794f = schemeDataArr.length;
    }
}
