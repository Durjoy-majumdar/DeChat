package com.tencent.tmassistantsdk.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo;
import java.util.Map;

public interface ITMAssistantDownloadSDKServiceInterface extends IInterface {

    public static class Default implements ITMAssistantDownloadSDKServiceInterface {
        public IBinder asBinder() {
            return null;
        }

        public void cancelDownloadTask(String str, String str2) {
        }

        public TMAssistantDownloadTaskInfo getDownloadTaskInfo(String str, String str2) {
            return null;
        }

        public int getServiceVersion() {
            return 0;
        }

        public boolean isAllDownloadFinished() {
            return false;
        }

        public void pauseDownloadTask(String str, String str2) {
        }

        public void registerDownloadTaskCallback(String str, ITMAssistantDownloadSDKServiceCallback iTMAssistantDownloadSDKServiceCallback) {
        }

        public void setServiceSetingIsDownloadWifiOnly(boolean z) {
        }

        public void setServiceSetingIsTaskAutoResume(boolean z) {
        }

        public void setServiceSetingMaxTaskNum(int i) {
        }

        public int startDownloadTask(String str, String str2, String str3, long j, int i, String str4, String str5, Map map) {
            return 0;
        }

        public void unregisterDownloadTaskCallback(String str, ITMAssistantDownloadSDKServiceCallback iTMAssistantDownloadSDKServiceCallback) {
        }
    }

    public static abstract class Stub extends Binder implements ITMAssistantDownloadSDKServiceInterface {
        private static final String DESCRIPTOR = "com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface";
        public static final int TRANSACTION_cancelDownloadTask = 9;
        public static final int TRANSACTION_getDownloadTaskInfo = 6;
        public static final int TRANSACTION_getServiceVersion = 1;
        public static final int TRANSACTION_isAllDownloadFinished = 5;
        public static final int TRANSACTION_pauseDownloadTask = 8;
        public static final int TRANSACTION_registerDownloadTaskCallback = 10;
        public static final int TRANSACTION_setServiceSetingIsDownloadWifiOnly = 3;
        public static final int TRANSACTION_setServiceSetingIsTaskAutoResume = 2;
        public static final int TRANSACTION_setServiceSetingMaxTaskNum = 4;
        public static final int TRANSACTION_startDownloadTask = 7;
        public static final int TRANSACTION_unregisterDownloadTaskCallback = 11;

        public static class Proxy implements ITMAssistantDownloadSDKServiceInterface {
            public static ITMAssistantDownloadSDKServiceInterface sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public void cancelDownloadTask(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (this.mRemote.transact(9, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().cancelDownloadTask(str, str2);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public TMAssistantDownloadTaskInfo getDownloadTaskInfo(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.mRemote.transact(6, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getDownloadTaskInfo(str, str2);
                    }
                    obtain2.readException();
                    TMAssistantDownloadTaskInfo createFromParcel = obtain2.readInt() != 0 ? TMAssistantDownloadTaskInfo.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return createFromParcel;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            public int getServiceVersion() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getServiceVersion();
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.recycle();
                    obtain.recycle();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean isAllDownloadFinished() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z = false;
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isAllDownloadFinished();
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void pauseDownloadTask(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (this.mRemote.transact(8, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().pauseDownloadTask(str, str2);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void registerDownloadTaskCallback(String str, ITMAssistantDownloadSDKServiceCallback iTMAssistantDownloadSDKServiceCallback) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iTMAssistantDownloadSDKServiceCallback != null ? iTMAssistantDownloadSDKServiceCallback.asBinder() : null);
                    if (this.mRemote.transact(10, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().registerDownloadTaskCallback(str, iTMAssistantDownloadSDKServiceCallback);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setServiceSetingIsDownloadWifiOnly(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(z ? 1 : 0);
                    if (this.mRemote.transact(3, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().setServiceSetingIsDownloadWifiOnly(z);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setServiceSetingIsTaskAutoResume(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(z ? 1 : 0);
                    if (this.mRemote.transact(2, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().setServiceSetingIsTaskAutoResume(z);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setServiceSetingMaxTaskNum(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (this.mRemote.transact(4, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().setServiceSetingMaxTaskNum(i);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int startDownloadTask(String str, String str2, String str3, long j, int i, String str4, String str5, Map map) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeLong(j);
                    obtain.writeInt(i);
                    obtain.writeString(str4);
                    obtain.writeString(str5);
                    obtain.writeMap(map);
                    try {
                        if (this.mRemote.transact(7, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                            obtain2.readException();
                            int readInt = obtain2.readInt();
                            obtain2.recycle();
                            obtain.recycle();
                            return readInt;
                        }
                        int startDownloadTask = Stub.getDefaultImpl().startDownloadTask(str, str2, str3, j, i, str4, str5, map);
                        obtain2.recycle();
                        obtain.recycle();
                        return startDownloadTask;
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

            public void unregisterDownloadTaskCallback(String str, ITMAssistantDownloadSDKServiceCallback iTMAssistantDownloadSDKServiceCallback) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iTMAssistantDownloadSDKServiceCallback != null ? iTMAssistantDownloadSDKServiceCallback.asBinder() : null);
                    if (this.mRemote.transact(11, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().unregisterDownloadTaskCallback(str, iTMAssistantDownloadSDKServiceCallback);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ITMAssistantDownloadSDKServiceInterface asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ITMAssistantDownloadSDKServiceInterface)) ? new Proxy(iBinder) : (ITMAssistantDownloadSDKServiceInterface) queryLocalInterface;
        }

        public static ITMAssistantDownloadSDKServiceInterface getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(ITMAssistantDownloadSDKServiceInterface iTMAssistantDownloadSDKServiceInterface) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (iTMAssistantDownloadSDKServiceInterface == null) {
                return false;
            } else {
                Proxy.sDefaultImpl = iTMAssistantDownloadSDKServiceInterface;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3 = i;
            Parcel parcel3 = parcel;
            Parcel parcel4 = parcel2;
            if (i3 != 1598968902) {
                boolean z = false;
                switch (i3) {
                    case 1:
                        parcel3.enforceInterface(DESCRIPTOR);
                        int serviceVersion = getServiceVersion();
                        parcel2.writeNoException();
                        parcel4.writeInt(serviceVersion);
                        return true;
                    case 2:
                        parcel3.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        setServiceSetingIsTaskAutoResume(z);
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel3.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        setServiceSetingIsDownloadWifiOnly(z);
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel3.enforceInterface(DESCRIPTOR);
                        setServiceSetingMaxTaskNum(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel3.enforceInterface(DESCRIPTOR);
                        boolean isAllDownloadFinished = isAllDownloadFinished();
                        parcel2.writeNoException();
                        parcel4.writeInt(isAllDownloadFinished ? 1 : 0);
                        return true;
                    case 6:
                        parcel3.enforceInterface(DESCRIPTOR);
                        TMAssistantDownloadTaskInfo downloadTaskInfo = getDownloadTaskInfo(parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        if (downloadTaskInfo != null) {
                            parcel4.writeInt(1);
                            downloadTaskInfo.writeToParcel(parcel4, 1);
                        } else {
                            parcel4.writeInt(0);
                        }
                        return true;
                    case 7:
                        parcel3.enforceInterface(DESCRIPTOR);
                        int startDownloadTask = startDownloadTask(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel3.readHashMap(getClass().getClassLoader()));
                        parcel2.writeNoException();
                        parcel4.writeInt(startDownloadTask);
                        return true;
                    case 8:
                        parcel3.enforceInterface(DESCRIPTOR);
                        pauseDownloadTask(parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        parcel3.enforceInterface(DESCRIPTOR);
                        cancelDownloadTask(parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 10:
                        parcel3.enforceInterface(DESCRIPTOR);
                        registerDownloadTaskCallback(parcel.readString(), ITMAssistantDownloadSDKServiceCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 11:
                        parcel3.enforceInterface(DESCRIPTOR);
                        unregisterDownloadTaskCallback(parcel.readString(), ITMAssistantDownloadSDKServiceCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel4.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    void cancelDownloadTask(String str, String str2);

    TMAssistantDownloadTaskInfo getDownloadTaskInfo(String str, String str2);

    int getServiceVersion();

    boolean isAllDownloadFinished();

    void pauseDownloadTask(String str, String str2);

    void registerDownloadTaskCallback(String str, ITMAssistantDownloadSDKServiceCallback iTMAssistantDownloadSDKServiceCallback);

    void setServiceSetingIsDownloadWifiOnly(boolean z);

    void setServiceSetingIsTaskAutoResume(boolean z);

    void setServiceSetingMaxTaskNum(int i);

    int startDownloadTask(String str, String str2, String str3, long j, int i, String str4, String str5, Map map);

    void unregisterDownloadTaskCallback(String str, ITMAssistantDownloadSDKServiceCallback iTMAssistantDownloadSDKServiceCallback);
}
