package com.tencent.p014mm.flutter.p837ui;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import p172io.flutter.embedding.android.FlutterActivityLaunchConfigs;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/flutter/ui/FlutterPageStyle;", "Landroid/os/Parcelable;", "mm_foundation_release"}, mo182095k = 1, mo182096mv = {1, 6, 0})
/* renamed from: com.tencent.mm.flutter.ui.FlutterPageStyle */
public final class FlutterPageStyle implements Parcelable {
    public static final Parcelable.Creator<FlutterPageStyle> CREATOR = new C104626a();

    /* renamed from: d */
    public int f310668d;

    /* renamed from: e */
    public int f310669e;

    /* renamed from: f */
    public FlutterActivityLaunchConfigs.BackgroundMode f310670f;

    /* renamed from: g */
    public boolean f310671g;

    /* renamed from: h */
    public boolean f310672h;

    /* renamed from: i */
    public boolean f310673i;

    /* renamed from: j */
    public Integer f310674j;

    /* renamed from: n */
    public int f310675n;

    /* renamed from: o */
    public boolean f310676o;

    /* renamed from: p */
    public boolean f310677p;

    /* renamed from: com.tencent.mm.flutter.ui.FlutterPageStyle$a */
    public static final class C104626a implements Parcelable.Creator<FlutterPageStyle> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new FlutterPageStyle(parcel.readInt(), parcel.readInt(), FlutterActivityLaunchConfigs.BackgroundMode.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        public Object[] newArray(int i) {
            return new FlutterPageStyle[i];
        }
    }

    public FlutterPageStyle() {
        this(0, 0, (FlutterActivityLaunchConfigs.BackgroundMode) null, false, false, false, (Integer) null, 0, false, false, 1023, (C8480h) null);
    }

    public FlutterPageStyle(int i, int i2, FlutterActivityLaunchConfigs.BackgroundMode backgroundMode, boolean z, boolean z2, boolean z3, Integer num, int i3, boolean z4, boolean z5) {
        C87412m.m108594g(backgroundMode, "backgroundMode");
        this.f310668d = i;
        this.f310669e = i2;
        this.f310670f = backgroundMode;
        this.f310671g = z;
        this.f310672h = z2;
        this.f310673i = z3;
        this.f310674j = num;
        this.f310675n = i3;
        this.f310676o = z4;
        this.f310677p = z5;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        C87412m.m108594g(parcel, "out");
        parcel.writeInt(this.f310668d);
        parcel.writeInt(this.f310669e);
        parcel.writeString(this.f310670f.name());
        parcel.writeInt(this.f310671g ? 1 : 0);
        parcel.writeInt(this.f310672h ? 1 : 0);
        parcel.writeInt(this.f310673i ? 1 : 0);
        Integer num = this.f310674j;
        if (num == null) {
            i2 = 0;
        } else {
            parcel.writeInt(1);
            i2 = num.intValue();
        }
        parcel.writeInt(i2);
        parcel.writeInt(this.f310675n);
        parcel.writeInt(this.f310676o ? 1 : 0);
        parcel.writeInt(this.f310677p ? 1 : 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ FlutterPageStyle(int r12, int r13, p172io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode r14, boolean r15, boolean r16, boolean r17, java.lang.Integer r18, int r19, boolean r20, boolean r21, int r22, gy3.C8480h r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = 0
            goto L_0x000a
        L_0x0009:
            r1 = r12
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0011
        L_0x0010:
            r3 = r13
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            io.flutter.embedding.android.FlutterActivityLaunchConfigs$BackgroundMode r4 = p172io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.transparent
            goto L_0x0019
        L_0x0018:
            r4 = r14
        L_0x0019:
            r5 = r0 & 8
            r6 = 1
            if (r5 == 0) goto L_0x0020
            r5 = 1
            goto L_0x0021
        L_0x0020:
            r5 = r15
        L_0x0021:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x0027
            r7 = 1
            goto L_0x0029
        L_0x0027:
            r7 = r16
        L_0x0029:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x002f
            r8 = 1
            goto L_0x0031
        L_0x002f:
            r8 = r17
        L_0x0031:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x0037
            r9 = 0
            goto L_0x0039
        L_0x0037:
            r9 = r18
        L_0x0039:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x003e
            goto L_0x0040
        L_0x003e:
            r2 = r19
        L_0x0040:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0046
            r10 = 1
            goto L_0x0048
        L_0x0046:
            r10 = r20
        L_0x0048:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            r6 = r21
        L_0x004f:
            r12 = r11
            r13 = r1
            r14 = r3
            r15 = r4
            r16 = r5
            r17 = r7
            r18 = r8
            r19 = r9
            r20 = r2
            r21 = r10
            r22 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.flutter.p837ui.FlutterPageStyle.<init>(int, int, io.flutter.embedding.android.FlutterActivityLaunchConfigs$BackgroundMode, boolean, boolean, boolean, java.lang.Integer, int, boolean, boolean, int, gy3.h):void");
    }
}
