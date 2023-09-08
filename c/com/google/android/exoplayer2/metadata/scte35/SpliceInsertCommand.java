package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new C16957a();

    /* renamed from: d */
    public final long f45830d;

    /* renamed from: e */
    public final boolean f45831e;

    /* renamed from: f */
    public final boolean f45832f;

    /* renamed from: g */
    public final boolean f45833g;

    /* renamed from: h */
    public final boolean f45834h;

    /* renamed from: i */
    public final long f45835i;

    /* renamed from: j */
    public final long f45836j;

    /* renamed from: n */
    public final List<C16958b> f45837n;

    /* renamed from: o */
    public final boolean f45838o;

    /* renamed from: p */
    public final long f45839p;

    /* renamed from: q */
    public final int f45840q;

    /* renamed from: r */
    public final int f45841r;

    /* renamed from: s */
    public final int f45842s;

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand$a */
    public static class C16957a implements Parcelable.Creator<SpliceInsertCommand> {
        public Object createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel, (C16957a) null);
        }

        public Object[] newArray(int i) {
            return new SpliceInsertCommand[i];
        }
    }

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand$b */
    public static final class C16958b {

        /* renamed from: a */
        public final int f45843a;

        /* renamed from: b */
        public final long f45844b;

        /* renamed from: c */
        public final long f45845c;

        public C16958b(int i, long j, long j2) {
            this.f45843a = i;
            this.f45844b = j;
            this.f45845c = j2;
        }
    }

    public SpliceInsertCommand(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<C16958b> list, boolean z5, long j4, int i, int i2, int i3) {
        this.f45830d = j;
        this.f45831e = z;
        this.f45832f = z2;
        this.f45833g = z3;
        this.f45834h = z4;
        this.f45835i = j2;
        this.f45836j = j3;
        this.f45837n = Collections.unmodifiableList(list);
        this.f45838o = z5;
        this.f45839p = j4;
        this.f45840q = i;
        this.f45841r = i2;
        this.f45842s = i3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f45830d);
        parcel.writeByte(this.f45831e ? (byte) 1 : 0);
        parcel.writeByte(this.f45832f ? (byte) 1 : 0);
        parcel.writeByte(this.f45833g ? (byte) 1 : 0);
        parcel.writeByte(this.f45834h ? (byte) 1 : 0);
        parcel.writeLong(this.f45835i);
        parcel.writeLong(this.f45836j);
        int size = this.f45837n.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            C16958b bVar = this.f45837n.get(i2);
            parcel.writeInt(bVar.f45843a);
            parcel.writeLong(bVar.f45844b);
            parcel.writeLong(bVar.f45845c);
        }
        parcel.writeByte(this.f45838o ? (byte) 1 : 0);
        parcel.writeLong(this.f45839p);
        parcel.writeInt(this.f45840q);
        parcel.writeInt(this.f45841r);
        parcel.writeInt(this.f45842s);
    }

    public SpliceInsertCommand(Parcel parcel, C16957a aVar) {
        this.f45830d = parcel.readLong();
        boolean z = false;
        this.f45831e = parcel.readByte() == 1;
        this.f45832f = parcel.readByte() == 1;
        this.f45833g = parcel.readByte() == 1;
        this.f45834h = parcel.readByte() == 1;
        this.f45835i = parcel.readLong();
        this.f45836j = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new C16958b(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f45837n = Collections.unmodifiableList(arrayList);
        this.f45838o = parcel.readByte() == 1 ? true : z;
        this.f45839p = parcel.readLong();
        this.f45840q = parcel.readInt();
        this.f45841r = parcel.readInt();
        this.f45842s = parcel.readInt();
    }
}
