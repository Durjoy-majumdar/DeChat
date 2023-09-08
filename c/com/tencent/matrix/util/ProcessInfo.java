package com.tencent.matrix.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Arrays;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/matrix/util/ProcessInfo;", "Landroid/os/Parcelable;", "CREATOR", "a", "matrix-android-lib_release"}, mo182095k = 1, mo182096mv = {1, 4, 2})
public final class ProcessInfo implements Parcelable {
    public static final C80561a CREATOR = new C80561a((C8480h) null);

    /* renamed from: d */
    public final int f235682d;

    /* renamed from: e */
    public final String f235683e;

    /* renamed from: f */
    public final String f235684f;

    /* renamed from: g */
    public final boolean f235685g;

    /* renamed from: h */
    public final boolean f235686h;

    /* renamed from: com.tencent.matrix.util.ProcessInfo$a */
    public static final class C80561a implements Parcelable.Creator<ProcessInfo> {
        public C80561a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String str = readString != null ? readString : "default";
            String readString2 = parcel.readString();
            byte b = (byte) 0;
            return new ProcessInfo(readInt, str, readString2 != null ? readString2 : "default", parcel.readByte() != b, parcel.readByte() != b);
        }

        public Object[] newArray(int i) {
            return new ProcessInfo[i];
        }
    }

    public ProcessInfo() {
        this(0, (String) null, (String) null, false, false, 31, (C8480h) null);
    }

    public ProcessInfo(int i, String str, String str2, boolean z, boolean z2) {
        C87412m.m108594g(str, "name");
        C87412m.m108594g(str2, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f235682d = i;
        this.f235683e = str;
        this.f235684f = str2;
        this.f235685g = z;
        this.f235686h = z2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProcessInfo)) {
            return false;
        }
        ProcessInfo processInfo = (ProcessInfo) obj;
        return this.f235682d == processInfo.f235682d && C87412m.m108589b(this.f235683e, processInfo.f235683e) && C87412m.m108589b(this.f235684f, processInfo.f235684f) && this.f235685g == processInfo.f235685g && this.f235686h == processInfo.f235686h;
    }

    public int hashCode() {
        int i = this.f235682d * 31;
        String str = this.f235683e;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f235684f;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int i3 = (hashCode + i2) * 31;
        boolean z = this.f235685g;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i4 = (i3 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f235686h;
        if (!z3) {
            z2 = z3;
        }
        return i4 + (z2 ? 1 : 0);
    }

    public String toString() {
        String format = String.format("%-21s\t%-21s %-21s %-21s %-21s", Arrays.copyOf(new Object[]{this.f235683e, "Activity=" + this.f235684f, "AppForeground=" + this.f235686h, "ProcessForeground=" + this.f235685g, "Pid=" + this.f235682d}, 5));
        C87412m.m108593f(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeInt(this.f235682d);
        parcel.writeString(this.f235683e);
        parcel.writeString(this.f235684f);
        parcel.writeByte(this.f235685g ? (byte) 1 : 0);
        parcel.writeByte(this.f235686h ? (byte) 1 : 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ProcessInfo(int r4, java.lang.String r5, java.lang.String r6, boolean r7, boolean r8, int r9, gy3.C8480h r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0008
            int r4 = android.os.Process.myPid()
        L_0x0008:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x0020
            yd.c r5 = p761yd.C91441c.m114730d()
            java.lang.String r10 = "Matrix.with()"
            gy3.C87412m.m108593f(r5, r10)
            android.app.Application r5 = r5.f262168b
            java.lang.String r5 = p723vf.C90779e.m113846a(r5)
            java.lang.String r10 = "MatrixUtil.getProcessNam…atrix.with().application)"
            gy3.C87412m.m108593f(r5, r10)
        L_0x0020:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0032
            com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner r5 = com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner.f235399x
            r5.getClass()
            java.lang.String r5 = com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner.f235392q
            r6 = 46
            java.lang.String r6 = z04.C112550d0.m153793c0(r5, r6, r5)
        L_0x0032:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L_0x003d
            com.tencent.matrix.lifecycle.owners.ProcessUIStartedStateOwner r5 = com.tencent.matrix.lifecycle.owners.ProcessUIStartedStateOwner.INSTANCE
            boolean r7 = r5.active()
        L_0x003d:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L_0x004d
            com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor r5 = com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor.f235421k
            r5.getClass()
            com.tencent.matrix.lifecycle.IForegroundStatefulOwner r5 = com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor.f235417g
            boolean r8 = r5.active()
        L_0x004d:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.util.ProcessInfo.<init>(int, java.lang.String, java.lang.String, boolean, boolean, int, gy3.h):void");
    }
}
