package com.tencent.liteav.audio.earmonitor.p938a.p939a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* renamed from: com.tencent.liteav.audio.earmonitor.a.a.a */
public interface C80197a extends IInterface {
    /* renamed from: a */
    List mo111197a();

    /* renamed from: a */
    void mo111198a(String str, String str2);

    /* renamed from: a */
    boolean mo111199a(int i);

    /* renamed from: com.tencent.liteav.audio.earmonitor.a.a.a$a */
    public static abstract class C80198a extends Binder implements C80197a {
        /* renamed from: a */
        public static C80197a m97539a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.multimedia.audioengine.IHwAudioEngine");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C80197a)) ? new C80199a(iBinder) : (C80197a) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.huawei.multimedia.audioengine.IHwAudioEngine");
                List a = mo111197a();
                parcel2.writeNoException();
                parcel2.writeList(a);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.huawei.multimedia.audioengine.IHwAudioEngine");
                boolean a2 = mo111199a(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(a2 ? 1 : 0);
                return true;
            } else if (i == 3) {
                parcel.enforceInterface("com.huawei.multimedia.audioengine.IHwAudioEngine");
                mo111198a(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.huawei.multimedia.audioengine.IHwAudioEngine");
                return true;
            }
        }

        /* renamed from: com.tencent.liteav.audio.earmonitor.a.a.a$a$a */
        public static class C80199a implements C80197a {

            /* renamed from: a */
            private IBinder f234747a;

            public C80199a(IBinder iBinder) {
                this.f234747a = iBinder;
            }

            /* renamed from: a */
            public final List mo111197a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.multimedia.audioengine.IHwAudioEngine");
                    this.f234747a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readArrayList(C80199a.class.getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f234747a;
            }

            /* renamed from: a */
            public final boolean mo111199a(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.multimedia.audioengine.IHwAudioEngine");
                    obtain.writeInt(i);
                    boolean z = false;
                    this.f234747a.transact(2, obtain, obtain2, 0);
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

            /* renamed from: a */
            public final void mo111198a(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.multimedia.audioengine.IHwAudioEngine");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f234747a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
