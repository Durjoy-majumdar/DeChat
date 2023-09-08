package com.tencent.wcdb.support;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface ICancellationSignal extends IInterface {

    public static class Default implements ICancellationSignal {
        public IBinder asBinder() {
            return null;
        }

        public void cancel() {
        }
    }

    public static abstract class Stub extends Binder implements ICancellationSignal {
        private static final String DESCRIPTOR = "com.tencent.wcdb.support.ICancellationSignal";
        public static final int TRANSACTION_cancel = 1;

        public static class Proxy implements ICancellationSignal {
            public static ICancellationSignal sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public void cancel() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(1, obtain, (Parcel) null, 1) || Stub.getDefaultImpl() == null) {
                        obtain.recycle();
                    } else {
                        Stub.getDefaultImpl().cancel();
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ICancellationSignal asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ICancellationSignal)) ? new Proxy(iBinder) : (ICancellationSignal) queryLocalInterface;
        }

        public static ICancellationSignal getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(ICancellationSignal iCancellationSignal) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (iCancellationSignal == null) {
                return false;
            } else {
                Proxy.sDefaultImpl = iCancellationSignal;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                cancel();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    void cancel();
}
