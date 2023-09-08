package com.tencent.matrix.util;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Arrays;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/matrix/util/JavaMemInfo;", "Landroid/os/Parcelable;", "CREATOR", "a", "matrix-android-lib_release"}, mo182095k = 1, mo182096mv = {1, 4, 2})
public final class JavaMemInfo implements Parcelable {
    public static final C80557a CREATOR = new C80557a((C8480h) null);

    /* renamed from: d */
    public final long f235663d;

    /* renamed from: e */
    public final long f235664e;

    /* renamed from: f */
    public final long f235665f;

    /* renamed from: g */
    public final long f235666g;

    /* renamed from: h */
    public final int f235667h;

    /* renamed from: i */
    public final int f235668i;

    /* renamed from: com.tencent.matrix.util.JavaMemInfo$a */
    public static final class C80557a implements Parcelable.Creator<JavaMemInfo> {
        public C80557a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new JavaMemInfo(parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readInt(), parcel.readInt());
        }

        public Object[] newArray(int i) {
            return new JavaMemInfo[i];
        }
    }

    public JavaMemInfo() {
        this(0, 0, 0, 0, 0, 0, 63, (C8480h) null);
    }

    public JavaMemInfo(long j, long j2, long j3, long j4, int i, int i2) {
        this.f235663d = j;
        this.f235664e = j2;
        this.f235665f = j3;
        this.f235666g = j4;
        this.f235667h = i;
        this.f235668i = i2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JavaMemInfo)) {
            return false;
        }
        JavaMemInfo javaMemInfo = (JavaMemInfo) obj;
        return this.f235663d == javaMemInfo.f235663d && this.f235664e == javaMemInfo.f235664e && this.f235665f == javaMemInfo.f235665f && this.f235666g == javaMemInfo.f235666g && this.f235667h == javaMemInfo.f235667h && this.f235668i == javaMemInfo.f235668i;
    }

    public int hashCode() {
        long j = this.f235663d;
        long j2 = this.f235664e;
        long j3 = this.f235665f;
        long j4 = this.f235666g;
        return (((((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.f235667h) * 31) + this.f235668i;
    }

    public String toString() {
        String format = String.format("%-21s %-21s %-21s %-21s %-21s %-21s", Arrays.copyOf(new Object[]{"Used=" + this.f235665f + " B", "Recycled=" + this.f235664e + " B", "HeapSize=" + this.f235663d + " B", "Max=" + this.f235666g + " B", "MemClass:" + this.f235667h + " M", "LargeMemClass=" + this.f235668i + " M"}, 6));
        C87412m.m108593f(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeLong(this.f235663d);
        parcel.writeLong(this.f235664e);
        parcel.writeLong(this.f235665f);
        parcel.writeLong(this.f235666g);
        parcel.writeInt(this.f235667h);
        parcel.writeInt(this.f235668i);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public JavaMemInfo(long r11, long r13, long r15, long r17, int r19, int r20, int r21, gy3.C8480h r22) {
        /*
            r10 = this;
            r0 = r21 & 1
            if (r0 == 0) goto L_0x000d
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            long r0 = r0.totalMemory()
            goto L_0x000e
        L_0x000d:
            r0 = r11
        L_0x000e:
            r2 = r21 & 2
            if (r2 == 0) goto L_0x001b
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()
            long r2 = r2.freeMemory()
            goto L_0x001c
        L_0x001b:
            r2 = r13
        L_0x001c:
            r4 = r21 & 4
            if (r4 == 0) goto L_0x0023
            long r4 = r0 - r2
            goto L_0x0024
        L_0x0023:
            r4 = r15
        L_0x0024:
            r6 = r21 & 8
            if (r6 == 0) goto L_0x0031
            java.lang.Runtime r6 = java.lang.Runtime.getRuntime()
            long r6 = r6.maxMemory()
            goto L_0x0033
        L_0x0031:
            r6 = r17
        L_0x0033:
            r8 = r21 & 16
            if (r8 == 0) goto L_0x003c
            android.app.ActivityManager r8 = p723vf.C90782f.f260693a
            int r8 = p723vf.C90782f.f260694b
            goto L_0x003e
        L_0x003c:
            r8 = r19
        L_0x003e:
            r9 = r21 & 32
            if (r9 == 0) goto L_0x0047
            android.app.ActivityManager r9 = p723vf.C90782f.f260693a
            int r9 = p723vf.C90782f.f260695c
            goto L_0x0049
        L_0x0047:
            r9 = r20
        L_0x0049:
            r11 = r10
            r12 = r0
            r14 = r2
            r16 = r4
            r18 = r6
            r20 = r8
            r21 = r9
            r11.<init>(r12, r14, r16, r18, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.util.JavaMemInfo.<init>(long, long, long, long, int, int, int, gy3.h):void");
    }
}
