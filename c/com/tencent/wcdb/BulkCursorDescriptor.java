package com.tencent.wcdb;

import android.os.Parcel;
import android.os.Parcelable;

public final class BulkCursorDescriptor implements Parcelable {
    public static final Parcelable.Creator<BulkCursorDescriptor> CREATOR = new Parcelable.Creator<BulkCursorDescriptor>() {
        public BulkCursorDescriptor createFromParcel(Parcel parcel) {
            BulkCursorDescriptor bulkCursorDescriptor = new BulkCursorDescriptor();
            bulkCursorDescriptor.readFromParcel(parcel);
            return bulkCursorDescriptor;
        }

        public BulkCursorDescriptor[] newArray(int i) {
            return new BulkCursorDescriptor[i];
        }
    };
    public String[] columnNames;
    public int count;
    public IBulkCursor cursor;
    public boolean wantsAllOnMoveCalls;
    public CursorWindow window;

    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        this.cursor = BulkCursorNative.asInterface(parcel.readStrongBinder());
        this.columnNames = readStringArray(parcel);
        this.wantsAllOnMoveCalls = parcel.readInt() != 0;
        this.count = parcel.readInt();
        if (parcel.readInt() != 0) {
            this.window = CursorWindow.CREATOR.createFromParcel(parcel);
        }
    }

    public final String[] readStringArray(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        String[] strArr = new String[readInt];
        for (int i = 0; i < readInt; i++) {
            strArr[i] = parcel.readString();
        }
        return strArr;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.cursor.asBinder());
        parcel.writeStringArray(this.columnNames);
        parcel.writeInt(this.wantsAllOnMoveCalls ? 1 : 0);
        parcel.writeInt(this.count);
        if (this.window != null) {
            parcel.writeInt(1);
            this.window.writeToParcel(parcel, i);
            return;
        }
        parcel.writeInt(0);
    }
}
