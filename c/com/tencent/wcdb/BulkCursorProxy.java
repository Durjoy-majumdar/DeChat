package com.tencent.wcdb;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

final class BulkCursorProxy implements IBulkCursor {
    private Bundle mExtras = null;
    private IBinder mRemote;

    public BulkCursorProxy(IBinder iBinder) {
        this.mRemote = iBinder;
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public void close() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IBulkCursor.descriptor);
            this.mRemote.transact(7, obtain, obtain2, 0);
            DatabaseUtils.readExceptionFromParcel(obtain2);
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    public void deactivate() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IBulkCursor.descriptor);
            this.mRemote.transact(2, obtain, obtain2, 0);
            DatabaseUtils.readExceptionFromParcel(obtain2);
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    public Bundle getExtras() {
        if (this.mExtras == null) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken(IBulkCursor.descriptor);
                this.mRemote.transact(5, obtain, obtain2, 0);
                DatabaseUtils.readExceptionFromParcel(obtain2);
                this.mExtras = obtain2.readBundle(BulkCursorProxy.class.getClassLoader());
            } finally {
                obtain.recycle();
                obtain2.recycle();
            }
        }
        return this.mExtras;
    }

    public CursorWindow getWindow(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IBulkCursor.descriptor);
            obtain.writeInt(i);
            this.mRemote.transact(1, obtain, obtain2, 0);
            DatabaseUtils.readExceptionFromParcel(obtain2);
            CursorWindow cursorWindow = null;
            if (obtain2.readInt() == 1) {
                cursorWindow = CursorWindow.newFromParcel(obtain2);
            }
            return cursorWindow;
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    public void onMove(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IBulkCursor.descriptor);
            obtain.writeInt(i);
            this.mRemote.transact(4, obtain, obtain2, 0);
            DatabaseUtils.readExceptionFromParcel(obtain2);
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    public int requery(IContentObserver iContentObserver) {
        int i;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IBulkCursor.descriptor);
            obtain.writeStrongInterface(iContentObserver);
            boolean transact = this.mRemote.transact(3, obtain, obtain2, 0);
            DatabaseUtils.readExceptionFromParcel(obtain2);
            if (!transact) {
                i = -1;
            } else {
                i = obtain2.readInt();
                this.mExtras = obtain2.readBundle(BulkCursorProxy.class.getClassLoader());
            }
            return i;
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    public Bundle respond(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IBulkCursor.descriptor);
            obtain.writeBundle(bundle);
            this.mRemote.transact(6, obtain, obtain2, 0);
            DatabaseUtils.readExceptionFromParcel(obtain2);
            return obtain2.readBundle(BulkCursorProxy.class.getClassLoader());
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
