package com.tencent.liteav.audio.earmonitor.p938a.p939a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.tencent.liteav.audio.earmonitor.a.a.b */
public interface C113436b extends IInterface {
    /* renamed from: a */
    int mo169914a(String str, int i);

    /* renamed from: a */
    int mo169915a(boolean z);

    /* renamed from: a */
    void mo169916a(String str);

    /* renamed from: a */
    boolean mo169917a();

    /* renamed from: b */
    int mo169918b();

    /* renamed from: com.tencent.liteav.audio.earmonitor.a.a.b$a */
    public static abstract class C113437a extends Binder implements C113436b {
        /* renamed from: a */
        public static C113436b m155301a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C113436b)) ? new C113438a(iBinder) : (C113436b) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature");
                boolean a = mo169917a();
                parcel2.writeNoException();
                parcel2.writeInt(a ? 1 : 0);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature");
                int a2 = mo169915a(parcel.readInt() != 0);
                parcel2.writeNoException();
                parcel2.writeInt(a2);
                return true;
            } else if (i == 3) {
                parcel.enforceInterface("com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature");
                int b = mo169918b();
                parcel2.writeNoException();
                parcel2.writeInt(b);
                return true;
            } else if (i == 4) {
                parcel.enforceInterface("com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature");
                int a3 = mo169914a(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(a3);
                return true;
            } else if (i == 5) {
                parcel.enforceInterface("com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature");
                mo169916a(parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature");
                return true;
            }
        }

        /* renamed from: com.tencent.liteav.audio.earmonitor.a.a.b$a$a */
        public static class C113438a implements C113436b {

            /* renamed from: a */
            private IBinder f339479a;

            public C113438a(IBinder iBinder) {
                this.f339479a = iBinder;
            }

            /* renamed from: a */
            public final boolean mo169917a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature");
                    boolean z = false;
                    this.f339479a.transact(1, obtain, obtain2, 0);
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

            public final IBinder asBinder() {
                return this.f339479a;
            }

            /* renamed from: b */
            public final int mo169918b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature");
                    this.f339479a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final int mo169915a(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature");
                    obtain.writeInt(z ? 1 : 0);
                    this.f339479a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final int mo169914a(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f339479a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo169916a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature");
                    obtain.writeString(str);
                    this.f339479a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
