package com.tencent.matrix.util;

import android.os.Parcel;
import android.os.Parcelable;
import cy3.C58003b;
import cy3.C86157m;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import p723vf.C118672d;
import p723vf.C90792o;
import rx3.C13604l;
import sx3.C36903g0;
import sx3.C90363p0;
import y04.C112354s;
import y04.C15925h;
import y04.C91365f;
import z04.C119027c;
import z04.C66725r;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, mo182094d2 = {"Lcom/tencent/matrix/util/StatusInfo;", "Landroid/os/Parcelable;", "b", "matrix-android-lib_release"}, mo182095k = 1, mo182096mv = {1, 4, 2})
public final class StatusInfo implements Parcelable {
    public static final Parcelable.Creator<StatusInfo> CREATOR = new C80565a();

    /* renamed from: o */
    public static final C80566b f235698o = new C80566b();

    /* renamed from: d */
    public final String f235699d;

    /* renamed from: e */
    public final long f235700e;

    /* renamed from: f */
    public final long f235701f;

    /* renamed from: g */
    public final long f235702g;

    /* renamed from: h */
    public final long f235703h;

    /* renamed from: i */
    public final long f235704i;

    /* renamed from: j */
    public final int f235705j;

    /* renamed from: n */
    public final int f235706n;

    /* renamed from: com.tencent.matrix.util.StatusInfo$a */
    public static final class C80565a implements Parcelable.Creator<StatusInfo> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            String readString = parcel.readString();
            if (readString == null) {
                readString = "default";
            }
            return new StatusInfo(readString, parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readInt(), parcel.readInt());
        }

        public Object[] newArray(int i) {
            return new StatusInfo[i];
        }
    }

    /* renamed from: com.tencent.matrix.util.StatusInfo$b */
    public static final class C80566b {

        /* renamed from: com.tencent.matrix.util.StatusInfo$b$a */
        public static final class C80567a extends C87413o implements C32227p<Map<String, ? extends String>, String, String> {

            /* renamed from: d */
            public static final C80567a f235707d = new C80567a();

            public C80567a() {
                super(2);
            }

            /* renamed from: a */
            public final String invoke(Map<String, String> map, String str) {
                C87412m.m108594g(map, "$this$getString");
                C87412m.m108594g(str, "key");
                String str2 = map.get(str);
                return str2 != null ? str2 : "unknown";
            }
        }

        /* renamed from: com.tencent.matrix.util.StatusInfo$b$b */
        public static final class C80568b extends C87413o implements C32227p<Map<String, ? extends String>, String, Long> {

            /* renamed from: d */
            public static final C80568b f235708d = new C80568b();

            public C80568b() {
                super(2);
            }

            /* renamed from: a */
            public final long mo112193a(Map<String, String> map, String str) {
                C87412m.m108594g(map, "$this$getInt");
                C87412m.m108594g(str, "key");
                Matcher matcher = Pattern.compile("\\d+").matcher(C80567a.f235707d.invoke(map, str));
                if (!matcher.find()) {
                    return -2;
                }
                String group = matcher.group();
                C87412m.m108593f(group, "matcher.group()");
                return Long.parseLong(group);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return Long.valueOf(mo112193a((Map) obj, (String) obj2));
            }
        }

        /* renamed from: a */
        public final StatusInfo mo112189a(int i) {
            Map map;
            Throwable th;
            int i2 = i;
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(new File("/proc/" + i2 + "/status")), C119027c.f356488a);
                BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                try {
                    C15925h<R> l = C112354s.m153289l(C86157m.m106666b(bufferedReader), C90792o.f260722d);
                    map = new LinkedHashMap();
                    C91365f.C91366a aVar = new C91365f.C91366a((C91365f) l);
                    while (aVar.mo125334a()) {
                        C13604l lVar = (C13604l) aVar.next();
                        map.put(lVar.f38555d, lVar.f38556e);
                    }
                    int size = map.size();
                    if (size == 0) {
                        map = C36903g0.f97931d;
                    } else if (size == 1) {
                        map = C90363p0.m113144c(map);
                    }
                    C58003b.m67160a(bufferedReader, (Throwable) null);
                    StatusInfo statusInfo = new StatusInfo((String) null, 0, 0, 0, 0, 0, 0, 0, 255, (C8480h) null);
                    try {
                        C80567a aVar2 = C80567a.f235707d;
                        C80568b bVar = C80568b.f235708d;
                        String b = C66725r.m78728b(aVar2.invoke(map, "State"));
                        long a = bVar.mo112193a(map, "FDSize");
                        long a2 = bVar.mo112193a(map, "VmSize");
                        long a3 = bVar.mo112193a(map, "VmRSS");
                        long a4 = bVar.mo112193a(map, "VmSwap");
                        long a5 = bVar.mo112193a(map, "Threads");
                        C80566b bVar2 = StatusInfo.f235698o;
                        return new StatusInfo(b, a, a2, a3, a4, a5, bVar2.mo112190b(i2), bVar2.mo112191c(i2));
                    } catch (Throwable th4) {
                        C118672d.m167354d("Matrix.MemoryInfoFactory", th4, "", new Object[0]);
                        return statusInfo;
                    }
                } catch (Throwable th5) {
                    Throwable th6 = th5;
                    C58003b.m67160a(bufferedReader, th);
                    throw th6;
                }
            } catch (Throwable th7) {
                C118672d.m167354d("Matrix.MemoryInfoFactory", th7, "", new Object[0]);
                map = C36903g0.f97931d;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            cy3.C58003b.m67160a(r0, r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
            throw r1;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo112190b(int r4) {
            /*
                r3 = this;
                java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0050 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0050 }
                r1.<init>()     // Catch:{ all -> 0x0050 }
                java.lang.String r2 = "/proc/"
                r1.append(r2)     // Catch:{ all -> 0x0050 }
                r1.append(r4)     // Catch:{ all -> 0x0050 }
                java.lang.String r4 = "/oom_adj"
                r1.append(r4)     // Catch:{ all -> 0x0050 }
                java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x0050 }
                r0.<init>(r4)     // Catch:{ all -> 0x0050 }
                java.nio.charset.Charset r4 = z04.C119027c.f356488a     // Catch:{ all -> 0x0050 }
                r1 = 8192(0x2000, float:1.14794E-41)
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0050 }
                r2.<init>(r0)     // Catch:{ all -> 0x0050 }
                java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x0050 }
                r0.<init>(r2, r4)     // Catch:{ all -> 0x0050 }
                boolean r4 = r0 instanceof java.io.BufferedReader     // Catch:{ all -> 0x0050 }
                if (r4 == 0) goto L_0x0030
                java.io.BufferedReader r0 = (java.io.BufferedReader) r0     // Catch:{ all -> 0x0050 }
                goto L_0x0036
            L_0x0030:
                java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ all -> 0x0050 }
                r4.<init>(r0, r1)     // Catch:{ all -> 0x0050 }
                r0 = r4
            L_0x0036:
                r4 = 0
                y04.h r1 = cy3.C86157m.m106666b(r0)     // Catch:{ all -> 0x0049 }
                java.lang.Object r1 = y04.C112354s.m153287j(r1)     // Catch:{ all -> 0x0049 }
                java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0049 }
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ all -> 0x0049 }
                cy3.C58003b.m67160a(r0, r4)     // Catch:{ all -> 0x0050 }
                goto L_0x0053
            L_0x0049:
                r4 = move-exception
                throw r4     // Catch:{ all -> 0x004b }
            L_0x004b:
                r1 = move-exception
                cy3.C58003b.m67160a(r0, r4)     // Catch:{ all -> 0x0050 }
                throw r1     // Catch:{ all -> 0x0050 }
            L_0x0050:
                r1 = 2147483647(0x7fffffff, float:NaN)
            L_0x0053:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.util.StatusInfo.C80566b.mo112190b(int):int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            cy3.C58003b.m67160a(r0, r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
            throw r1;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo112191c(int r4) {
            /*
                r3 = this;
                java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0050 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0050 }
                r1.<init>()     // Catch:{ all -> 0x0050 }
                java.lang.String r2 = "/proc/"
                r1.append(r2)     // Catch:{ all -> 0x0050 }
                r1.append(r4)     // Catch:{ all -> 0x0050 }
                java.lang.String r4 = "/oom_score_adj"
                r1.append(r4)     // Catch:{ all -> 0x0050 }
                java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x0050 }
                r0.<init>(r4)     // Catch:{ all -> 0x0050 }
                java.nio.charset.Charset r4 = z04.C119027c.f356488a     // Catch:{ all -> 0x0050 }
                r1 = 8192(0x2000, float:1.14794E-41)
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0050 }
                r2.<init>(r0)     // Catch:{ all -> 0x0050 }
                java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x0050 }
                r0.<init>(r2, r4)     // Catch:{ all -> 0x0050 }
                boolean r4 = r0 instanceof java.io.BufferedReader     // Catch:{ all -> 0x0050 }
                if (r4 == 0) goto L_0x0030
                java.io.BufferedReader r0 = (java.io.BufferedReader) r0     // Catch:{ all -> 0x0050 }
                goto L_0x0036
            L_0x0030:
                java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ all -> 0x0050 }
                r4.<init>(r0, r1)     // Catch:{ all -> 0x0050 }
                r0 = r4
            L_0x0036:
                r4 = 0
                y04.h r1 = cy3.C86157m.m106666b(r0)     // Catch:{ all -> 0x0049 }
                java.lang.Object r1 = y04.C112354s.m153287j(r1)     // Catch:{ all -> 0x0049 }
                java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0049 }
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ all -> 0x0049 }
                cy3.C58003b.m67160a(r0, r4)     // Catch:{ all -> 0x0050 }
                goto L_0x0053
            L_0x0049:
                r4 = move-exception
                throw r4     // Catch:{ all -> 0x004b }
            L_0x004b:
                r1 = move-exception
                cy3.C58003b.m67160a(r0, r4)     // Catch:{ all -> 0x0050 }
                throw r1     // Catch:{ all -> 0x0050 }
            L_0x0050:
                r1 = 2147483647(0x7fffffff, float:NaN)
            L_0x0053:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.util.StatusInfo.C80566b.mo112191c(int):int");
        }
    }

    public StatusInfo() {
        this((String) null, 0, 0, 0, 0, 0, 0, 0, 255, (C8480h) null);
    }

    public StatusInfo(String str, long j, long j2, long j3, long j4, long j5, int i, int i2) {
        C87412m.m108594g(str, "state");
        this.f235699d = str;
        this.f235700e = j;
        this.f235701f = j2;
        this.f235702g = j3;
        this.f235703h = j4;
        this.f235704i = j5;
        this.f235705j = i;
        this.f235706n = i2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatusInfo)) {
            return false;
        }
        StatusInfo statusInfo = (StatusInfo) obj;
        return C87412m.m108589b(this.f235699d, statusInfo.f235699d) && this.f235700e == statusInfo.f235700e && this.f235701f == statusInfo.f235701f && this.f235702g == statusInfo.f235702g && this.f235703h == statusInfo.f235703h && this.f235704i == statusInfo.f235704i && this.f235705j == statusInfo.f235705j && this.f235706n == statusInfo.f235706n;
    }

    public int hashCode() {
        String str = this.f235699d;
        int hashCode = str != null ? str.hashCode() : 0;
        long j = this.f235700e;
        long j2 = this.f235701f;
        long j3 = this.f235702g;
        long j4 = this.f235703h;
        long j5 = this.f235704i;
        return (((((((((((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f235705j) * 31) + this.f235706n;
    }

    public String toString() {
        String format = String.format("%-21s %-21s %-21s %-21s %-21s %-21s %-21s %-21s", Arrays.copyOf(new Object[]{"State=" + this.f235699d, "FDSize=" + this.f235700e, "VmSize=" + this.f235701f + " K", "VmRss=" + this.f235702g + " K", "VmSwap=" + this.f235703h + " K", "Threads=" + this.f235704i, "oom_adj=" + this.f235705j, "oom_score_adj=" + this.f235706n}, 8));
        C87412m.m108593f(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeString(this.f235699d);
        parcel.writeLong(this.f235700e);
        parcel.writeLong(this.f235701f);
        parcel.writeLong(this.f235702g);
        parcel.writeLong(this.f235703h);
        parcel.writeLong(this.f235704i);
        parcel.writeInt(this.f235705j);
        parcel.writeInt(this.f235706n);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ StatusInfo(java.lang.String r15, long r16, long r18, long r20, long r22, long r24, int r26, int r27, int r28, gy3.C8480h r29) {
        /*
            r14 = this;
            r0 = r28
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            java.lang.String r1 = "default"
            goto L_0x000a
        L_0x0009:
            r1 = r15
        L_0x000a:
            r2 = r0 & 2
            r3 = -1
            if (r2 == 0) goto L_0x0012
            r5 = r3
            goto L_0x0014
        L_0x0012:
            r5 = r16
        L_0x0014:
            r2 = r0 & 4
            if (r2 == 0) goto L_0x001a
            r7 = r3
            goto L_0x001c
        L_0x001a:
            r7 = r18
        L_0x001c:
            r2 = r0 & 8
            if (r2 == 0) goto L_0x0022
            r9 = r3
            goto L_0x0024
        L_0x0022:
            r9 = r20
        L_0x0024:
            r2 = r0 & 16
            if (r2 == 0) goto L_0x002a
            r11 = r3
            goto L_0x002c
        L_0x002a:
            r11 = r22
        L_0x002c:
            r2 = r0 & 32
            if (r2 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = r24
        L_0x0033:
            r2 = r0 & 64
            r13 = -1
            if (r2 == 0) goto L_0x003a
            r2 = -1
            goto L_0x003c
        L_0x003a:
            r2 = r26
        L_0x003c:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            r13 = r27
        L_0x0043:
            r15 = r14
            r16 = r1
            r17 = r5
            r19 = r7
            r21 = r9
            r23 = r11
            r25 = r3
            r27 = r2
            r28 = r13
            r15.<init>(r16, r17, r19, r21, r23, r25, r27, r28)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.util.StatusInfo.<init>(java.lang.String, long, long, long, long, long, int, int, int, gy3.h):void");
    }
}
