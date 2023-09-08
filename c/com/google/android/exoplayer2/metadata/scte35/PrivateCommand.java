package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;

public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new C16956a();

    /* renamed from: d */
    public final long f45827d;

    /* renamed from: e */
    public final long f45828e;

    /* renamed from: f */
    public final byte[] f45829f;

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.PrivateCommand$a */
    public static class C16956a implements Parcelable.Creator<PrivateCommand> {
        public Object createFromParcel(Parcel parcel) {
            return new PrivateCommand(parcel, (C16956a) null);
        }

        public Object[] newArray(int i) {
            return new PrivateCommand[i];
        }
    }

    public PrivateCommand(long j, byte[] bArr, long j2) {
        this.f45827d = j2;
        this.f45828e = j;
        this.f45829f = bArr;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f45827d);
        parcel.writeLong(this.f45828e);
        parcel.writeInt(this.f45829f.length);
        parcel.writeByteArray(this.f45829f);
    }

    public PrivateCommand(Parcel parcel, C16956a aVar) {
        this.f45827d = parcel.readLong();
        this.f45828e = parcel.readLong();
        byte[] bArr = new byte[parcel.readInt()];
        this.f45829f = bArr;
        parcel.readByteArray(bArr);
    }
}
