package com.tencent.tmassistantsdk.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface ITMAssistantDownloadSDKServiceCallback extends IInterface {

    public static class Default implements ITMAssistantDownloadSDKServiceCallback {
        public void OnDownloadSDKServiceTaskProgressChanged(String str, String str2, long j, long j2) {
        }

        public void OnDownloadSDKServiceTaskStateChanged(String str, String str2, int i, int i2, String str3, boolean z, boolean z2) {
        }

        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements ITMAssistantDownloadSDKServiceCallback {
        private static final String DESCRIPTOR = "com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback";
        public static final int TRANSACTION_OnDownloadSDKServiceTaskProgressChanged = 2;
        public static final int TRANSACTION_OnDownloadSDKServiceTaskStateChanged = 1;

        public static class Proxy implements ITMAssistantDownloadSDKServiceCallback {
            public static ITMAssistantDownloadSDKServiceCallback sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public void OnDownloadSDKServiceTaskProgressChanged(String str, String str2, long j, long j2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    String str3 = str;
                    obtain.writeString(str);
                    String str4 = str2;
                    obtain.writeString(str2);
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    try {
                        if (this.mRemote.transact(2, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                            obtain2.readException();
                            obtain2.recycle();
                            obtain.recycle();
                            return;
                        }
                        Stub.getDefaultImpl().OnDownloadSDKServiceTaskProgressChanged(str, str2, j, j2);
                        obtain2.recycle();
                        obtain.recycle();
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public void OnDownloadSDKServiceTaskStateChanged(String str, String str2, int i, int i2, String str3, boolean z, boolean z2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    String str4 = str;
                    obtain.writeString(str);
                    String str5 = str2;
                    obtain.writeString(str2);
                    int i3 = i;
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str3);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(z2 ? 1 : 0);
                    try {
                        if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                            obtain2.readException();
                            obtain2.recycle();
                            obtain.recycle();
                            return;
                        }
                        Stub.getDefaultImpl().OnDownloadSDKServiceTaskStateChanged(str, str2, i, i2, str3, z, z2);
                        obtain2.recycle();
                        obtain.recycle();
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ITMAssistantDownloadSDKServiceCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ITMAssistantDownloadSDKServiceCallback)) ? new Proxy(iBinder) : (ITMAssistantDownloadSDKServiceCallback) queryLocalInterface;
        }

        public static ITMAssistantDownloadSDKServiceCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(ITMAssistantDownloadSDKServiceCallback iTMAssistantDownloadSDKServiceCallback) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (iTMAssistantDownloadSDKServiceCallback == null) {
                return false;
            } else {
                Proxy.sDefaultImpl = iTMAssistantDownloadSDKServiceCallback;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3 = i;
            Parcel parcel3 = parcel;
            if (i3 == 1) {
                Parcel parcel4 = parcel2;
                parcel3.enforceInterface(DESCRIPTOR);
                OnDownloadSDKServiceTaskStateChanged(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            } else if (i3 == 2) {
                Parcel parcel5 = parcel2;
                parcel3.enforceInterface(DESCRIPTOR);
                OnDownloadSDKServiceTaskProgressChanged(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong());
                parcel2.writeNoException();
                return true;
            } else if (i3 != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    void OnDownloadSDKServiceTaskProgressChanged(String str, String str2, long j, long j2);

    void OnDownloadSDKServiceTaskStateChanged(String str, String str2, int i, int i2, String str3, boolean z, boolean z2);
}
