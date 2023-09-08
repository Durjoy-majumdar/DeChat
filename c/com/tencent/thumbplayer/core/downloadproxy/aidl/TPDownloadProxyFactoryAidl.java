package com.tencent.thumbplayer.core.downloadproxy.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl;

public interface TPDownloadProxyFactoryAidl extends IInterface {

    public static abstract class Stub extends Binder implements TPDownloadProxyFactoryAidl {
        private static final String DESCRIPTOR = "com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl";
        public static final int TRANSACTION_getNativeVersion = 4;
        public static final int TRANSACTION_getTPDownloadProxy = 1;
        public static final int TRANSACTION_isReadyForDownload = 3;
        public static final int TRANSACTION_isReadyForPlay = 2;

        public static class Proxy implements TPDownloadProxyFactoryAidl {
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

            public String getNativeVersion() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public ITPDownloadProxyAidl getTPDownloadProxy(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return ITPDownloadProxyAidl.Stub.asInterface(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean isReadyForDownload() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z = false;
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean isReadyForPlay() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z = false;
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static TPDownloadProxyFactoryAidl asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof TPDownloadProxyFactoryAidl)) ? new Proxy(iBinder) : (TPDownloadProxyFactoryAidl) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                ITPDownloadProxyAidl tPDownloadProxy = getTPDownloadProxy(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(tPDownloadProxy != null ? tPDownloadProxy.asBinder() : null);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                boolean isReadyForPlay = isReadyForPlay();
                parcel2.writeNoException();
                parcel2.writeInt(isReadyForPlay ? 1 : 0);
                return true;
            } else if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                boolean isReadyForDownload = isReadyForDownload();
                parcel2.writeNoException();
                parcel2.writeInt(isReadyForDownload ? 1 : 0);
                return true;
            } else if (i == 4) {
                parcel.enforceInterface(DESCRIPTOR);
                String nativeVersion = getNativeVersion();
                parcel2.writeNoException();
                parcel2.writeString(nativeVersion);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    String getNativeVersion();

    ITPDownloadProxyAidl getTPDownloadProxy(int i);

    boolean isReadyForDownload();

    boolean isReadyForPlay();
}
