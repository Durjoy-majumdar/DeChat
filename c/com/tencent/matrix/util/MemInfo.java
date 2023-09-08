package com.tencent.matrix.util;

import android.app.ActivityManager;
import android.app.Application;
import android.os.Debug;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import com.tencent.matrix.util.PssInfo;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import p723vf.C118672d;
import p723vf.C90776b;
import p723vf.C90782f;
import p761yd.C91441c;
import sx3.C110823p;
import z04.C112551y;
import z04.C66725r;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, mo182094d2 = {"Lcom/tencent/matrix/util/MemInfo;", "Landroid/os/Parcelable;", "b", "matrix-android-lib_release"}, mo182095k = 1, mo182096mv = {1, 4, 2})
public final class MemInfo implements Parcelable {
    public static final Parcelable.Creator<MemInfo> CREATOR = new C80558a();

    /* renamed from: p */
    public static final C80559b f235669p = new C80559b();

    /* renamed from: d */
    public long f235670d;

    /* renamed from: e */
    public ProcessInfo f235671e;

    /* renamed from: f */
    public StatusInfo f235672f;

    /* renamed from: g */
    public JavaMemInfo f235673g;

    /* renamed from: h */
    public NativeMemInfo f235674h;

    /* renamed from: i */
    public SystemInfo f235675i;

    /* renamed from: j */
    public PssInfo f235676j;

    /* renamed from: n */
    public PssInfo f235677n;

    /* renamed from: o */
    public C90776b f235678o;

    /* renamed from: com.tencent.matrix.util.MemInfo$a */
    public static final class C80558a implements Parcelable.Creator<MemInfo> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            MemInfo memInfo = new MemInfo((ProcessInfo) parcel.readParcelable(ProcessInfo.class.getClassLoader()), (StatusInfo) parcel.readParcelable(StatusInfo.class.getClassLoader()), (JavaMemInfo) parcel.readParcelable(JavaMemInfo.class.getClassLoader()), (NativeMemInfo) parcel.readParcelable(NativeMemInfo.class.getClassLoader()), (SystemInfo) parcel.readParcelable(SystemInfo.class.getClassLoader()), (PssInfo) parcel.readParcelable(PssInfo.class.getClassLoader()), (PssInfo) parcel.readParcelable(PssInfo.class.getClassLoader()), (C90776b) null);
            memInfo.f235670d = parcel.readLong();
            return memInfo;
        }

        public Object[] newArray(int i) {
            return new MemInfo[i];
        }
    }

    /* renamed from: com.tencent.matrix.util.MemInfo$b */
    public static final class C80559b {
        /* renamed from: a */
        public final MemInfo[] mo112156a() {
            MemInfo[] memInfoArr;
            long currentTimeMillis = System.currentTimeMillis();
            ActivityManager activityManager = C90782f.f260693a;
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            ArrayList arrayList = new ArrayList();
            if (runningAppProcesses == null) {
                C118672d.m167352b("Matrix.MemoryInfoFactory", "ERROR: activityManager.runningAppProcesses - no running process", new Object[0]);
                memInfoArr = new MemInfo[0];
            } else {
                C118672d.m167351a("Matrix.MemoryInfoFactory", "processInfoList[" + runningAppProcesses + ']', new Object[0]);
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                SystemInfo systemInfo = new SystemInfo(memoryInfo.totalMem, memoryInfo.availMem, memoryInfo.lowMemory, memoryInfo.threshold);
                int size = runningAppProcesses.size();
                for (int i = 0; i < size; i++) {
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = runningAppProcesses.get(i);
                    C91441c d = C91441c.m114730d();
                    C87412m.m108593f(d, "Matrix.with()");
                    Application application = d.f262168b;
                    C87412m.m108593f(application, "Matrix.with().application");
                    String packageName = application.getPackageName();
                    if (Process.myUid() == runningAppProcessInfo.uid && !TextUtils.isEmpty(runningAppProcessInfo.processName)) {
                        String str = runningAppProcessInfo.processName;
                        C87412m.m108593f(str, "processInfo.processName");
                        C87412m.m108593f(packageName, "pkgName");
                        if (C112551y.m153819s(str, packageName, false)) {
                            int i2 = runningAppProcessInfo.pid;
                            String str2 = runningAppProcessInfo.processName;
                            C87412m.m108593f(str2, "processInfo.processName");
                            MemInfo memInfo = r9;
                            MemInfo memInfo2 = new MemInfo(new ProcessInfo(i2, str2, (String) null, false, false, 28, (C8480h) null), (StatusInfo) null, (JavaMemInfo) null, (NativeMemInfo) null, systemInfo, new PssInfo(0, 0, 0, 0, 0, 0, 0, 0, 0, 511, (C8480h) null), new PssInfo(0, 0, 0, 0, 0, 0, 0, 0, 0, 511, (C8480h) null), (C90776b) null, 128, (C8480h) null);
                            arrayList.add(memInfo);
                        }
                    }
                    C118672d.m167352b("Matrix.MemoryInfoFactory", "info with uid [" + runningAppProcessInfo.uid + "] & process name [" + runningAppProcessInfo.processName + "] is not current app [" + Process.myUid() + "][" + packageName + ']', new Object[0]);
                }
                Object[] array = arrayList.toArray(new MemInfo[0]);
                if (array != null) {
                    memInfoArr = (MemInfo[]) array;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            ActivityManager activityManager2 = C90782f.f260693a;
            ActivityManager activityManager3 = C90782f.f260693a;
            int[] iArr = new int[memInfoArr.length];
            int length = memInfoArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i4 < length) {
                ProcessInfo processInfo = memInfoArr[i4].f235671e;
                C87412m.m108591d(processInfo);
                iArr[i3] = processInfo.f235682d;
                i4++;
                i3++;
            }
            Debug.MemoryInfo[] processMemoryInfo = activityManager3.getProcessMemoryInfo(iArr);
            if (processMemoryInfo != null) {
                int length2 = memInfoArr.length;
                for (int i5 = 0; i5 < length2; i5++) {
                    Debug.MemoryInfo memoryInfo2 = processMemoryInfo[i5];
                    if (memoryInfo2 == null) {
                        memInfoArr[i5].f235676j = new PssInfo(0, 0, 0, 0, 0, 0, 0, 0, 0);
                    } else {
                        MemInfo memInfo3 = memInfoArr[i5];
                        PssInfo.C80563b bVar = PssInfo.f235687p;
                        C87412m.m108593f(memoryInfo2, "pidMemInfoArray[i]");
                        memInfo3.f235676j = bVar.mo112180a(memoryInfo2);
                    }
                }
            }
            C118672d.m167353c("Matrix.MemoryInfoFactory", "getAllProcessPss cost: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
            return memInfoArr;
        }

        /* renamed from: b */
        public final MemInfo mo112157b() {
            long currentTimeMillis = System.currentTimeMillis();
            PssInfo.C80563b bVar = PssInfo.f235687p;
            bVar.getClass();
            ActivityManager activityManager = C90782f.f260693a;
            Integer[] numArr = {Integer.valueOf(Process.myPid())};
            int[] iArr = new int[1];
            for (int i = 0; i < 1; i++) {
                iArr[i] = numArr[i].intValue();
            }
            Debug.MemoryInfo[] processMemoryInfo = activityManager.getProcessMemoryInfo(iArr);
            C87412m.m108593f(processMemoryInfo, "MemInfoFactory.activityM…ss.myPid()).toIntArray())");
            Debug.MemoryInfo memoryInfo = (Debug.MemoryInfo) C110823p.m150978D(processMemoryInfo);
            PssInfo a = memoryInfo != null ? bVar.mo112180a(memoryInfo) : new PssInfo(0, 0, 0, 0, 0, 0, 0, 0, 0, 511, (C8480h) null);
            PssInfo.C80563b bVar2 = PssInfo.f235687p;
            bVar2.getClass();
            Debug.MemoryInfo memoryInfo2 = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo2);
            MemInfo memInfo = new MemInfo((ProcessInfo) null, (StatusInfo) null, (JavaMemInfo) null, (NativeMemInfo) null, (SystemInfo) null, a, bVar2.mo112180a(memoryInfo2), (C90776b) null, 159, (C8480h) null);
            memInfo.f235670d = System.currentTimeMillis() - currentTimeMillis;
            return memInfo;
        }
    }

    public MemInfo() {
        this((ProcessInfo) null, (StatusInfo) null, (JavaMemInfo) null, (NativeMemInfo) null, (SystemInfo) null, (PssInfo) null, (PssInfo) null, (C90776b) null, 255, (C8480h) null);
    }

    public MemInfo(ProcessInfo processInfo, StatusInfo statusInfo, JavaMemInfo javaMemInfo, NativeMemInfo nativeMemInfo, SystemInfo systemInfo, PssInfo pssInfo, PssInfo pssInfo2, C90776b bVar) {
        this.f235671e = processInfo;
        this.f235672f = statusInfo;
        this.f235673g = javaMemInfo;
        this.f235674h = nativeMemInfo;
        this.f235675i = systemInfo;
        this.f235676j = pssInfo;
        this.f235677n = pssInfo2;
        this.f235678o = bVar;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemInfo)) {
            return false;
        }
        MemInfo memInfo = (MemInfo) obj;
        return C87412m.m108589b(this.f235671e, memInfo.f235671e) && C87412m.m108589b(this.f235672f, memInfo.f235672f) && C87412m.m108589b(this.f235673g, memInfo.f235673g) && C87412m.m108589b(this.f235674h, memInfo.f235674h) && C87412m.m108589b(this.f235675i, memInfo.f235675i) && C87412m.m108589b(this.f235676j, memInfo.f235676j) && C87412m.m108589b(this.f235677n, memInfo.f235677n) && C87412m.m108589b(this.f235678o, memInfo.f235678o);
    }

    public int hashCode() {
        ProcessInfo processInfo = this.f235671e;
        int i = 0;
        int hashCode = (processInfo != null ? processInfo.hashCode() : 0) * 31;
        StatusInfo statusInfo = this.f235672f;
        int hashCode2 = (hashCode + (statusInfo != null ? statusInfo.hashCode() : 0)) * 31;
        JavaMemInfo javaMemInfo = this.f235673g;
        int hashCode3 = (hashCode2 + (javaMemInfo != null ? javaMemInfo.hashCode() : 0)) * 31;
        NativeMemInfo nativeMemInfo = this.f235674h;
        int hashCode4 = (hashCode3 + (nativeMemInfo != null ? nativeMemInfo.hashCode() : 0)) * 31;
        SystemInfo systemInfo = this.f235675i;
        int hashCode5 = (hashCode4 + (systemInfo != null ? systemInfo.hashCode() : 0)) * 31;
        PssInfo pssInfo = this.f235676j;
        int hashCode6 = (hashCode5 + (pssInfo != null ? pssInfo.hashCode() : 0)) * 31;
        PssInfo pssInfo2 = this.f235677n;
        int hashCode7 = (hashCode6 + (pssInfo2 != null ? pssInfo2.hashCode() : 0)) * 31;
        C90776b bVar = this.f235678o;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "\n";
        sb.append(str);
        sb.append(C66725r.m78728b("\n                |>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> MemInfo <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n                |> Process   : " + this.f235671e + "\n                |> Status    : " + this.f235672f + "\n                |> SystemInfo: " + this.f235675i + "\n                |> Java      : " + this.f235673g + "\n                |> Native    : " + this.f235674h + "\n                |> Dbg-Pss   : " + this.f235677n + "\n                |> AMS-Pss   : " + this.f235676j + "\n                |> FgService : " + this.f235678o + "\n                |>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n            "));
        if (this.f235670d > 0) {
            str = str + "| cost : " + this.f235670d;
        }
        sb.append(str);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeParcelable(this.f235671e, i);
        parcel.writeParcelable(this.f235672f, i);
        parcel.writeParcelable(this.f235673g, i);
        parcel.writeParcelable(this.f235674h, i);
        parcel.writeParcelable(this.f235675i, i);
        parcel.writeParcelable(this.f235676j, i);
        parcel.writeParcelable(this.f235677n, i);
        parcel.writeLong(this.f235670d);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MemInfo(com.tencent.matrix.util.ProcessInfo r18, com.tencent.matrix.util.StatusInfo r19, com.tencent.matrix.util.JavaMemInfo r20, com.tencent.matrix.util.NativeMemInfo r21, com.tencent.matrix.util.SystemInfo r22, com.tencent.matrix.util.PssInfo r23, com.tencent.matrix.util.PssInfo r24, p723vf.C90776b r25, int r26, gy3.C8480h r27) {
        /*
            r17 = this;
            r0 = r26
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0015
            com.tencent.matrix.util.ProcessInfo r1 = new com.tencent.matrix.util.ProcessInfo
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 31
            r9 = 0
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0017
        L_0x0015:
            r1 = r18
        L_0x0017:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0026
            com.tencent.matrix.util.StatusInfo$b r2 = com.tencent.matrix.util.StatusInfo.f235698o
            int r3 = android.os.Process.myPid()
            com.tencent.matrix.util.StatusInfo r2 = r2.mo112189a(r3)
            goto L_0x0028
        L_0x0026:
            r2 = r19
        L_0x0028:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0041
            com.tencent.matrix.util.JavaMemInfo r3 = new com.tencent.matrix.util.JavaMemInfo
            r5 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 63
            r16 = 0
            r4 = r3
            r4.<init>(r5, r7, r9, r11, r13, r14, r15, r16)
            goto L_0x0043
        L_0x0041:
            r3 = r20
        L_0x0043:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0056
            com.tencent.matrix.util.NativeMemInfo r4 = new com.tencent.matrix.util.NativeMemInfo
            r6 = 0
            r8 = 0
            r10 = 0
            r12 = 7
            r13 = 0
            r5 = r4
            r5.<init>(r6, r8, r10, r12, r13)
            goto L_0x0058
        L_0x0056:
            r4 = r21
        L_0x0058:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x0075
            android.app.ActivityManager$MemoryInfo r5 = new android.app.ActivityManager$MemoryInfo
            r5.<init>()
            android.app.ActivityManager r6 = p723vf.C90782f.f260693a
            r6.getMemoryInfo(r5)
            com.tencent.matrix.util.SystemInfo r6 = new com.tencent.matrix.util.SystemInfo
            long r8 = r5.totalMem
            long r10 = r5.availMem
            boolean r12 = r5.lowMemory
            long r13 = r5.threshold
            r7 = r6
            r7.<init>(r8, r10, r12, r13)
            goto L_0x0077
        L_0x0075:
            r6 = r22
        L_0x0077:
            r5 = r0 & 32
            r7 = 0
            if (r5 == 0) goto L_0x007e
            r5 = r7
            goto L_0x0080
        L_0x007e:
            r5 = r23
        L_0x0080:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0086
            r8 = r7
            goto L_0x0088
        L_0x0086:
            r8 = r24
        L_0x0088:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0093
            vf.b r0 = new vf.b
            r9 = 1
            r0.<init>(r7, r9, r7)
            goto L_0x0095
        L_0x0093:
            r0 = r25
        L_0x0095:
            r18 = r17
            r19 = r1
            r20 = r2
            r21 = r3
            r22 = r4
            r23 = r6
            r24 = r5
            r25 = r8
            r26 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.util.MemInfo.<init>(com.tencent.matrix.util.ProcessInfo, com.tencent.matrix.util.StatusInfo, com.tencent.matrix.util.JavaMemInfo, com.tencent.matrix.util.NativeMemInfo, com.tencent.matrix.util.SystemInfo, com.tencent.matrix.util.PssInfo, com.tencent.matrix.util.PssInfo, vf.b, int, gy3.h):void");
    }
}
