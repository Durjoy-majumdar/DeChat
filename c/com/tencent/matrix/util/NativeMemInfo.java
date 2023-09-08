package com.tencent.matrix.util;

import android.os.Debug;
import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Arrays;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/matrix/util/NativeMemInfo;", "Landroid/os/Parcelable;", "CREATOR", "a", "matrix-android-lib_release"}, mo182095k = 1, mo182096mv = {1, 4, 2})
public final class NativeMemInfo implements Parcelable {
    public static final C80560a CREATOR = new C80560a((C8480h) null);

    /* renamed from: d */
    public final long f235679d;

    /* renamed from: e */
    public final long f235680e;

    /* renamed from: f */
    public final long f235681f;

    /* renamed from: com.tencent.matrix.util.NativeMemInfo$a */
    public static final class C80560a implements Parcelable.Creator<NativeMemInfo> {
        public C80560a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new NativeMemInfo(parcel.readLong(), parcel.readLong(), parcel.readLong());
        }

        public Object[] newArray(int i) {
            return new NativeMemInfo[i];
        }
    }

    public NativeMemInfo() {
        this(0, 0, 0, 7, (C8480h) null);
    }

    public NativeMemInfo(long j, long j2, long j3) {
        this.f235679d = j;
        this.f235680e = j2;
        this.f235681f = j3;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativeMemInfo)) {
            return false;
        }
        NativeMemInfo nativeMemInfo = (NativeMemInfo) obj;
        return this.f235679d == nativeMemInfo.f235679d && this.f235680e == nativeMemInfo.f235680e && this.f235681f == nativeMemInfo.f235681f;
    }

    public int hashCode() {
        long j = this.f235679d;
        long j2 = this.f235680e;
        long j3 = this.f235681f;
        return (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        String format = String.format("%-21s %-21s %-21s", Arrays.copyOf(new Object[]{"Used=" + this.f235681f + " B", "Recycled=" + this.f235680e + " B", "HeapSize=" + this.f235679d + " B"}, 3));
        C87412m.m108593f(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeLong(this.f235679d);
        parcel.writeLong(this.f235680e);
        parcel.writeLong(this.f235681f);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NativeMemInfo(long j, long j2, long j3, int i, C8480h hVar) {
        this((i & 1) != 0 ? Debug.getNativeHeapSize() : j, (i & 2) != 0 ? Debug.getNativeHeapFreeSize() : j2, (i & 4) != 0 ? Debug.getNativeHeapAllocatedSize() : j3);
    }
}
