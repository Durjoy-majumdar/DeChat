package com.tencent.p014mm.sdk.trafficcard;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Map;

/* renamed from: com.tencent.mm.sdk.trafficcard.ITencentSmartcardOpenService */
public interface ITencentSmartcardOpenService extends IInterface {

    /* renamed from: com.tencent.mm.sdk.trafficcard.ITencentSmartcardOpenService$Default */
    public static class Default implements ITencentSmartcardOpenService {
        public IBinder asBinder() {
            return null;
        }

        public String checkIssueConditions(Map map) {
            return null;
        }

        public String checkServiceStatus(Map map) {
            return null;
        }

        public String deleteCard(Map map) {
            return null;
        }

        public String doAction(String str, Map map) {
            return null;
        }

        public String issueCard(Map map) {
            return null;
        }

        public String preIssueCard(Map map) {
            return null;
        }

        public String queryCplc() {
            return null;
        }

        public String queryTrafficCardInfo(String str, int i) {
            return null;
        }

        public String recharge(Map map) {
            return null;
        }

        public String startSetDefault(Map map) {
            return null;
        }
    }

    /* renamed from: com.tencent.mm.sdk.trafficcard.ITencentSmartcardOpenService$Stub */
    public static abstract class Stub extends Binder implements ITencentSmartcardOpenService {
        private static final String DESCRIPTOR = "com.tencent.mm.sdk.trafficcard.ITencentSmartcardOpenService";
        public static final int TRANSACTION_checkIssueConditions = 9;
        public static final int TRANSACTION_checkServiceStatus = 7;
        public static final int TRANSACTION_deleteCard = 6;
        public static final int TRANSACTION_doAction = 10;
        public static final int TRANSACTION_issueCard = 3;
        public static final int TRANSACTION_preIssueCard = 2;
        public static final int TRANSACTION_queryCplc = 1;
        public static final int TRANSACTION_queryTrafficCardInfo = 5;
        public static final int TRANSACTION_recharge = 4;
        public static final int TRANSACTION_startSetDefault = 8;

        /* renamed from: com.tencent.mm.sdk.trafficcard.ITencentSmartcardOpenService$Stub$Proxy */
        public static class Proxy implements ITencentSmartcardOpenService {
            public static ITencentSmartcardOpenService sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String checkIssueConditions(Map map) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeMap(map);
                    if (!this.mRemote.transact(9, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().checkIssueConditions(map);
                    }
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String checkServiceStatus(Map map) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeMap(map);
                    if (!this.mRemote.transact(7, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().checkServiceStatus(map);
                    }
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String deleteCard(Map map) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeMap(map);
                    if (!this.mRemote.transact(6, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().deleteCard(map);
                    }
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String doAction(String str, Map map) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeMap(map);
                    if (!this.mRemote.transact(10, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().doAction(str, map);
                    }
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            public String issueCard(Map map) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeMap(map);
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().issueCard(map);
                    }
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String preIssueCard(Map map) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeMap(map);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().preIssueCard(map);
                    }
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String queryCplc() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().queryCplc();
                    }
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String queryTrafficCardInfo(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().queryTrafficCardInfo(str, i);
                    }
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String recharge(Map map) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeMap(map);
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().recharge(map);
                    }
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String startSetDefault(Map map) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeMap(map);
                    if (!this.mRemote.transact(8, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().startSetDefault(map);
                    }
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ITencentSmartcardOpenService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ITencentSmartcardOpenService)) ? new Proxy(iBinder) : (ITencentSmartcardOpenService) queryLocalInterface;
        }

        public static ITencentSmartcardOpenService getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(ITencentSmartcardOpenService iTencentSmartcardOpenService) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (iTencentSmartcardOpenService == null) {
                return false;
            } else {
                Proxy.sDefaultImpl = iTencentSmartcardOpenService;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface(DESCRIPTOR);
                        String queryCplc = queryCplc();
                        parcel2.writeNoException();
                        parcel2.writeString(queryCplc);
                        return true;
                    case 2:
                        parcel.enforceInterface(DESCRIPTOR);
                        String preIssueCard = preIssueCard(parcel.readHashMap(getClass().getClassLoader()));
                        parcel2.writeNoException();
                        parcel2.writeString(preIssueCard);
                        return true;
                    case 3:
                        parcel.enforceInterface(DESCRIPTOR);
                        String issueCard = issueCard(parcel.readHashMap(getClass().getClassLoader()));
                        parcel2.writeNoException();
                        parcel2.writeString(issueCard);
                        return true;
                    case 4:
                        parcel.enforceInterface(DESCRIPTOR);
                        String recharge = recharge(parcel.readHashMap(getClass().getClassLoader()));
                        parcel2.writeNoException();
                        parcel2.writeString(recharge);
                        return true;
                    case 5:
                        parcel.enforceInterface(DESCRIPTOR);
                        String queryTrafficCardInfo = queryTrafficCardInfo(parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeString(queryTrafficCardInfo);
                        return true;
                    case 6:
                        parcel.enforceInterface(DESCRIPTOR);
                        String deleteCard = deleteCard(parcel.readHashMap(getClass().getClassLoader()));
                        parcel2.writeNoException();
                        parcel2.writeString(deleteCard);
                        return true;
                    case 7:
                        parcel.enforceInterface(DESCRIPTOR);
                        String checkServiceStatus = checkServiceStatus(parcel.readHashMap(getClass().getClassLoader()));
                        parcel2.writeNoException();
                        parcel2.writeString(checkServiceStatus);
                        return true;
                    case 8:
                        parcel.enforceInterface(DESCRIPTOR);
                        String startSetDefault = startSetDefault(parcel.readHashMap(getClass().getClassLoader()));
                        parcel2.writeNoException();
                        parcel2.writeString(startSetDefault);
                        return true;
                    case 9:
                        parcel.enforceInterface(DESCRIPTOR);
                        String checkIssueConditions = checkIssueConditions(parcel.readHashMap(getClass().getClassLoader()));
                        parcel2.writeNoException();
                        parcel2.writeString(checkIssueConditions);
                        return true;
                    case 10:
                        parcel.enforceInterface(DESCRIPTOR);
                        String doAction = doAction(parcel.readString(), parcel.readHashMap(getClass().getClassLoader()));
                        parcel2.writeNoException();
                        parcel2.writeString(doAction);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    String checkIssueConditions(Map map);

    String checkServiceStatus(Map map);

    String deleteCard(Map map);

    String doAction(String str, Map map);

    String issueCard(Map map);

    String preIssueCard(Map map);

    String queryCplc();

    String queryTrafficCardInfo(String str, int i);

    String recharge(Map map);

    String startSetDefault(Map map);
}
