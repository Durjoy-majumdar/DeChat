package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new C16960a();

    /* renamed from: d */
    public final List<C16962c> f45846d;

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$a */
    public static class C16960a implements Parcelable.Creator<SpliceScheduleCommand> {
        public Object createFromParcel(Parcel parcel) {
            return new SpliceScheduleCommand(parcel, (C16960a) null);
        }

        public Object[] newArray(int i) {
            return new SpliceScheduleCommand[i];
        }
    }

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$b */
    public static final class C16961b {

        /* renamed from: a */
        public final int f45847a;

        /* renamed from: b */
        public final long f45848b;

        public C16961b(int i, long j) {
            this.f45847a = i;
            this.f45848b = j;
        }
    }

    public SpliceScheduleCommand(List<C16962c> list) {
        this.f45846d = Collections.unmodifiableList(list);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int size = this.f45846d.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            C16962c cVar = this.f45846d.get(i2);
            parcel.writeLong(cVar.f45849a);
            parcel.writeByte(cVar.f45850b ? (byte) 1 : 0);
            parcel.writeByte(cVar.f45851c ? (byte) 1 : 0);
            parcel.writeByte(cVar.f45852d ? (byte) 1 : 0);
            int size2 = cVar.f45854f.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                C16961b bVar = cVar.f45854f.get(i3);
                parcel.writeInt(bVar.f45847a);
                parcel.writeLong(bVar.f45848b);
            }
            parcel.writeLong(cVar.f45853e);
            parcel.writeByte(cVar.f45855g ? (byte) 1 : 0);
            parcel.writeLong(cVar.f45856h);
            parcel.writeInt(cVar.f45857i);
            parcel.writeInt(cVar.f45858j);
            parcel.writeInt(cVar.f45859k);
        }
    }

    public SpliceScheduleCommand(Parcel parcel, C16960a aVar) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new C16962c(parcel));
        }
        this.f45846d = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$c */
    public static final class C16962c {

        /* renamed from: a */
        public final long f45849a;

        /* renamed from: b */
        public final boolean f45850b;

        /* renamed from: c */
        public final boolean f45851c;

        /* renamed from: d */
        public final boolean f45852d;

        /* renamed from: e */
        public final long f45853e;

        /* renamed from: f */
        public final List<C16961b> f45854f;

        /* renamed from: g */
        public final boolean f45855g;

        /* renamed from: h */
        public final long f45856h;

        /* renamed from: i */
        public final int f45857i;

        /* renamed from: j */
        public final int f45858j;

        /* renamed from: k */
        public final int f45859k;

        public C16962c(long j, boolean z, boolean z2, boolean z3, List<C16961b> list, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.f45849a = j;
            this.f45850b = z;
            this.f45851c = z2;
            this.f45852d = z3;
            this.f45854f = Collections.unmodifiableList(list);
            this.f45853e = j2;
            this.f45855g = z4;
            this.f45856h = j3;
            this.f45857i = i;
            this.f45858j = i2;
            this.f45859k = i3;
        }

        public C16962c(Parcel parcel) {
            this.f45849a = parcel.readLong();
            boolean z = false;
            this.f45850b = parcel.readByte() == 1;
            this.f45851c = parcel.readByte() == 1;
            this.f45852d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                arrayList.add(new C16961b(parcel.readInt(), parcel.readLong()));
            }
            this.f45854f = Collections.unmodifiableList(arrayList);
            this.f45853e = parcel.readLong();
            this.f45855g = parcel.readByte() == 1 ? true : z;
            this.f45856h = parcel.readLong();
            this.f45857i = parcel.readInt();
            this.f45858j = parcel.readInt();
            this.f45859k = parcel.readInt();
        }
    }
}
