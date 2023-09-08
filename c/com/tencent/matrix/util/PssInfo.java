package com.tencent.matrix.util;

import android.os.Build;
import android.os.Debug;
import android.os.Parcel;
import android.os.Parcelable;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONObject;
import p723vf.C118672d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, mo182094d2 = {"Lcom/tencent/matrix/util/PssInfo;", "Landroid/os/Parcelable;", "b", "matrix-android-lib_release"}, mo182095k = 1, mo182096mv = {1, 4, 2})
public final class PssInfo implements Parcelable {
    public static final Parcelable.Creator<PssInfo> CREATOR = new C80562a();

    /* renamed from: p */
    public static final C80563b f235687p = new C80563b();

    /* renamed from: d */
    public int f235688d;

    /* renamed from: e */
    public int f235689e;

    /* renamed from: f */
    public int f235690f;

    /* renamed from: g */
    public int f235691g;

    /* renamed from: h */
    public int f235692h;

    /* renamed from: i */
    public int f235693i;

    /* renamed from: j */
    public int f235694j;

    /* renamed from: n */
    public int f235695n;

    /* renamed from: o */
    public int f235696o;

    /* renamed from: com.tencent.matrix.util.PssInfo$a */
    public static final class C80562a implements Parcelable.Creator<PssInfo> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new PssInfo(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        public Object[] newArray(int i) {
            return new PssInfo[i];
        }
    }

    /* renamed from: com.tencent.matrix.util.PssInfo$b */
    public static final class C80563b {

        /* renamed from: com.tencent.matrix.util.PssInfo$b$a */
        public static final class C80564a extends C87413o implements C32227p<Map<String, ? extends String>, String, Integer> {

            /* renamed from: d */
            public static final C80564a f235697d = new C80564a();

            public C80564a() {
                super(2);
            }

            /* renamed from: a */
            public final int mo112181a(Map<String, String> map, String str) {
                C87412m.m108594g(map, "$this$getInt");
                C87412m.m108594g(str, "key");
                String str2 = map.get(str);
                if (str2 != null) {
                    return Integer.parseInt(str2);
                }
                return -1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(mo112181a((Map) obj, (String) obj2));
            }
        }

        /* renamed from: a */
        public final PssInfo mo112180a(Debug.MemoryInfo memoryInfo) {
            C87412m.m108594g(memoryInfo, "memoryInfo");
            PssInfo pssInfo = new PssInfo(0, 0, 0, 0, 0, 0, 0, 0, 0, 511, (C8480h) null);
            pssInfo.f235688d = memoryInfo.getTotalPss();
            if (Build.VERSION.SDK_INT >= 23) {
                Map<String, String> memoryStats = memoryInfo.getMemoryStats();
                C80564a aVar = C80564a.f235697d;
                pssInfo.f235689e = aVar.mo112181a(memoryStats, "summary.java-heap");
                pssInfo.f235690f = aVar.mo112181a(memoryStats, "summary.native-heap");
                pssInfo.f235694j = aVar.mo112181a(memoryStats, "summary.code");
                pssInfo.f235695n = aVar.mo112181a(memoryStats, "summary.stack");
                pssInfo.f235691g = aVar.mo112181a(memoryStats, "summary.graphics");
                pssInfo.f235696o = aVar.mo112181a(memoryStats, "summary.private-other");
                pssInfo.f235692h = aVar.mo112181a(memoryStats, "summary.system");
                pssInfo.f235693i = aVar.mo112181a(memoryStats, "summary.total-swap");
            } else {
                pssInfo.f235689e = memoryInfo.dalvikPrivateDirty;
                pssInfo.f235690f = memoryInfo.nativePrivateDirty;
                pssInfo.f235692h = (memoryInfo.getTotalPss() - memoryInfo.getTotalPrivateClean()) - memoryInfo.getTotalPrivateDirty();
            }
            return pssInfo;
        }
    }

    public PssInfo() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 511, (C8480h) null);
    }

    public PssInfo(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.f235688d = i;
        this.f235689e = i2;
        this.f235690f = i3;
        this.f235691g = i4;
        this.f235692h = i5;
        this.f235693i = i6;
        this.f235694j = i7;
        this.f235695n = i8;
        this.f235696o = i9;
    }

    /* renamed from: a */
    public final JSONObject mo112172a() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("total", this.f235688d);
            jSONObject2.put("java", this.f235689e);
            jSONObject2.put("native", this.f235690f);
            jSONObject2.put("graphic", this.f235691g);
            jSONObject2.put("system", this.f235692h);
            jSONObject2.put("swap", this.f235693i);
            jSONObject2.put("code", this.f235694j);
            jSONObject2.put("stack", this.f235695n);
            jSONObject2.put("other", this.f235696o);
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
        if (!(obj instanceof PssInfo)) {
            return false;
        }
        PssInfo pssInfo = (PssInfo) obj;
        return this.f235688d == pssInfo.f235688d && this.f235689e == pssInfo.f235689e && this.f235690f == pssInfo.f235690f && this.f235691g == pssInfo.f235691g && this.f235692h == pssInfo.f235692h && this.f235693i == pssInfo.f235693i && this.f235694j == pssInfo.f235694j && this.f235695n == pssInfo.f235695n && this.f235696o == pssInfo.f235696o;
    }

    public int hashCode() {
        return (((((((((((((((this.f235688d * 31) + this.f235689e) * 31) + this.f235690f) * 31) + this.f235691g) * 31) + this.f235692h) * 31) + this.f235693i) * 31) + this.f235694j) * 31) + this.f235695n) * 31) + this.f235696o;
    }

    public String toString() {
        String format = String.format("%-21s %-21s %-21s %-21s %-21s %-21s %-21s %-21s %-21s", Arrays.copyOf(new Object[]{"totalPss=" + this.f235688d + " K", "Java=" + this.f235689e + " K", "Native=" + this.f235690f + " K", "Graphic=" + this.f235691g + " K", "System=" + this.f235692h + " K", "Swap=" + this.f235693i + " K", "Code=" + this.f235694j + " K", "Stack=" + this.f235695n + " K", "PrivateOther=" + this.f235696o + " K"}, 9));
        C87412m.m108593f(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeInt(this.f235688d);
        parcel.writeInt(this.f235689e);
        parcel.writeInt(this.f235690f);
        parcel.writeInt(this.f235691g);
        parcel.writeInt(this.f235692h);
        parcel.writeInt(this.f235693i);
        parcel.writeInt(this.f235694j);
        parcel.writeInt(this.f235695n);
        parcel.writeInt(this.f235696o);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PssInfo(int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, gy3.C8480h r21) {
        /*
            r10 = this;
            r0 = r20
            r1 = r0 & 1
            r2 = -1
            if (r1 == 0) goto L_0x0009
            r1 = -1
            goto L_0x000a
        L_0x0009:
            r1 = r11
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = -1
            goto L_0x0011
        L_0x0010:
            r3 = r12
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = -1
            goto L_0x0018
        L_0x0017:
            r4 = r13
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = -1
            goto L_0x001f
        L_0x001e:
            r5 = r14
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = -1
            goto L_0x0026
        L_0x0025:
            r6 = r15
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002c
            r7 = -1
            goto L_0x002e
        L_0x002c:
            r7 = r16
        L_0x002e:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0034
            r8 = -1
            goto L_0x0036
        L_0x0034:
            r8 = r17
        L_0x0036:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003c
            r9 = -1
            goto L_0x003e
        L_0x003c:
            r9 = r18
        L_0x003e:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r2 = r19
        L_0x0045:
            r11 = r10
            r12 = r1
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r9
            r20 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.util.PssInfo.<init>(int, int, int, int, int, int, int, int, int, int, gy3.h):void");
    }
}
