package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import p333e8.C20541m;

public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new C16963a();

    /* renamed from: d */
    public final long f45860d;

    /* renamed from: e */
    public final long f45861e;

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand$a */
    public static class C16963a implements Parcelable.Creator<TimeSignalCommand> {
        public Object createFromParcel(Parcel parcel) {
            return new TimeSignalCommand(parcel.readLong(), parcel.readLong());
        }

        public Object[] newArray(int i) {
            return new TimeSignalCommand[i];
        }
    }

    public TimeSignalCommand(long j, long j2) {
        this.f45860d = j;
        this.f45861e = j2;
    }

    /* renamed from: a */
    public static long m16656a(C20541m mVar, long j) {
        long n = (long) mVar.mo32103n();
        if ((128 & n) != 0) {
            return 8589934591L & ((((n & 1) << 32) | mVar.mo32104o()) + j);
        }
        return -9223372036854775807L;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f45860d);
        parcel.writeLong(this.f45861e);
    }
}
