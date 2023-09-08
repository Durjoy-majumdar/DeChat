package p349j9;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Map;

/* renamed from: j9.a */
public interface C21196a extends IInterface {

    /* renamed from: j9.a$a */
    public static abstract class C21197a extends Binder implements C21196a {

        /* renamed from: d */
        public static final /* synthetic */ int f59967d = 0;

        /* renamed from: j9.a$a$a */
        public static class C21198a implements C21196a {

            /* renamed from: d */
            public IBinder f59968d;

            public C21198a(IBinder iBinder) {
                this.f59968d = iBinder;
            }

            public IBinder asBinder() {
                return this.f59968d;
            }

            public String checkIssueConditions(Map map) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.nfc.sdk.service.IHwTransitOpenService");
                    obtain.writeMap(map);
                    if (!this.f59968d.transact(10, obtain, obtain2, 0)) {
                        int i = C21197a.f59967d;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String checkServiceStatus(Map map) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.nfc.sdk.service.IHwTransitOpenService");
                    obtain.writeMap(map);
                    if (!this.f59968d.transact(8, obtain, obtain2, 0)) {
                        int i = C21197a.f59967d;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String deleteCard(Map map) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.nfc.sdk.service.IHwTransitOpenService");
                    obtain.writeMap(map);
                    if (!this.f59968d.transact(7, obtain, obtain2, 0)) {
                        int i = C21197a.f59967d;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String issueCard(Map map) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.nfc.sdk.service.IHwTransitOpenService");
                    obtain.writeMap(map);
                    if (!this.f59968d.transact(4, obtain, obtain2, 0)) {
                        int i = C21197a.f59967d;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String preIssueCard(Map map) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.nfc.sdk.service.IHwTransitOpenService");
                    obtain.writeMap(map);
                    if (!this.f59968d.transact(3, obtain, obtain2, 0)) {
                        int i = C21197a.f59967d;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String queryCplc() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.nfc.sdk.service.IHwTransitOpenService");
                    if (!this.f59968d.transact(2, obtain, obtain2, 0)) {
                        int i = C21197a.f59967d;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String queryTrafficCardInfo(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.nfc.sdk.service.IHwTransitOpenService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    if (!this.f59968d.transact(6, obtain, obtain2, 0)) {
                        int i2 = C21197a.f59967d;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String recharge(Map map) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.nfc.sdk.service.IHwTransitOpenService");
                    obtain.writeMap(map);
                    if (!this.f59968d.transact(5, obtain, obtain2, 0)) {
                        int i = C21197a.f59967d;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String startSetDefault(Map map) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.nfc.sdk.service.IHwTransitOpenService");
                    obtain.writeMap(map);
                    if (!this.f59968d.transact(9, obtain, obtain2, 0)) {
                        int i = C21197a.f59967d;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }

    String checkIssueConditions(Map map);

    String checkServiceStatus(Map map);

    String deleteCard(Map map);

    String issueCard(Map map);

    String preIssueCard(Map map);

    String queryCplc();

    String queryTrafficCardInfo(String str, int i);

    String recharge(Map map);

    String startSetDefault(Map map);
}
