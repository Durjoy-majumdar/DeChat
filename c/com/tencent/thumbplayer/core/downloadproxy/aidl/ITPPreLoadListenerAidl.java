package com.tencent.thumbplayer.core.downloadproxy.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface ITPPreLoadListenerAidl extends IInterface {

    public static abstract class Stub extends Binder implements ITPPreLoadListenerAidl {
        private static final String DESCRIPTOR = "com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl";
        public static final int TRANSACTION_onPrepareDownloadProgressUpdate = 3;
        public static final int TRANSACTION_onPrepareError = 2;
        public static final int TRANSACTION_onPrepareOK = 1;

        public static class Proxy implements ITPPreLoadListenerAidl {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            public void onPrepareDownloadProgressUpdate(int i, int i2, long j, long j2, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    obtain.writeString(str);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onPrepareError(int i, int i2, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onPrepareOK() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ITPPreLoadListenerAidl asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ITPPreLoadListenerAidl)) ? new Proxy(iBinder) : (ITPPreLoadListenerAidl) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onPrepareOK();
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                onPrepareError(parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                onPrepareDownloadProgressUpdate(parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    void onPrepareDownloadProgressUpdate(int i, int i2, long j, long j2, String str);

    void onPrepareError(int i, int i2, String str);

    void onPrepareOK();
}
