package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;

public final class SpliceNullCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceNullCommand> CREATOR = new C16959a();

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand$a */
    public static class C16959a implements Parcelable.Creator<SpliceNullCommand> {
        public Object createFromParcel(Parcel parcel) {
            return new SpliceNullCommand();
        }

        public Object[] newArray(int i) {
            return new SpliceNullCommand[i];
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
    }
}
