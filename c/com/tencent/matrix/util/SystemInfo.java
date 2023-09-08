package com.tencent.matrix.util;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import java.util.Arrays;
import kotlin.Metadata;
import org.json.JSONObject;
import p723vf.C118672d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/matrix/util/SystemInfo;", "Landroid/os/Parcelable;", "matrix-android-lib_release"}, mo182095k = 1, mo182096mv = {1, 4, 2})
public final class SystemInfo implements Parcelable {
    public static final Parcelable.Creator<SystemInfo> CREATOR = new C80569a();

    /* renamed from: d */
    public final long f235709d;

    /* renamed from: e */
    public final long f235710e;

    /* renamed from: f */
    public final boolean f235711f;

    /* renamed from: g */
    public final long f235712g;

    /* renamed from: com.tencent.matrix.util.SystemInfo$a */
    public static final class C80569a implements Parcelable.Creator<SystemInfo> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            boolean z = false;
            if (parcel.readByte() != ((byte) 0)) {
                z = true;
            }
            return new SystemInfo(readLong, readLong2, z, parcel.readLong());
        }

        public Object[] newArray(int i) {
            return new SystemInfo[i];
        }
    }

    public SystemInfo(long j, long j2, boolean z, long j3) {
        this.f235709d = j;
        this.f235710e = j2;
        this.f235711f = z;
        this.f235712g = j3;
    }

    /* renamed from: a */
    public final JSONObject mo112194a() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("totalMemByte", this.f235709d);
            jSONObject2.put("availMemByte", this.f235710e);
            jSONObject2.put("lowMem", this.f235711f);
            jSONObject2.put("threshold", this.f235712g);
            return jSONObject2;
        } catch (Throwable th) {
            C118672d.m167354d("Matrix.MemoryInfoFactory", th, "", new Object[0]);
            return jSONObject;
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SystemInfo)) {
            return false;
        }
        SystemInfo systemInfo = (SystemInfo) obj;
        return this.f235709d == systemInfo.f235709d && this.f235710e == systemInfo.f235710e && this.f235711f == systemInfo.f235711f && this.f235712g == systemInfo.f235712g;
    }

    public int hashCode() {
        long j = this.f235709d;
        long j2 = this.f235710e;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        boolean z = this.f235711f;
        if (z) {
            z = true;
        }
        long j3 = this.f235712g;
        return ((i + (z ? 1 : 0)) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        String format = String.format("%-21s %-21s %-21s %-21s", Arrays.copyOf(new Object[]{"totalMem=" + this.f235709d + " B", "availMem=" + this.f235710e + " B", "lowMemory=" + this.f235711f, "threshold=" + this.f235712g + " B"}, 4));
        C87412m.m108593f(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeLong(this.f235709d);
        parcel.writeLong(this.f235710e);
        parcel.writeByte(this.f235711f ? (byte) 1 : 0);
        parcel.writeLong(this.f235712g);
    }

    public SystemInfo() {
        this(-1, -1, false, -1);
    }
}
