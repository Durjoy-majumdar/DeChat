package com.tencent.p014mm.plugin.talkroom.component;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.tencent.mm.plugin.talkroom.component.c */
public interface C115787c extends IInterface {

    /* renamed from: com.tencent.mm.plugin.talkroom.component.c$a */
    public static abstract class C115788a extends Binder implements C115787c {

        /* renamed from: d */
        public static final /* synthetic */ int f347360d = 0;

        /* renamed from: com.tencent.mm.plugin.talkroom.component.c$a$a */
        public static class C115789a implements C115787c {

            /* renamed from: d */
            public IBinder f347361d;

            public C115789a(IBinder iBinder) {
                this.f347361d = iBinder;
            }

            /* renamed from: R5 */
            public int mo176156R5() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.IMicRecoder_AIDL");
                    if (!this.f347361d.transact(4, obtain, obtain2, 0)) {
                        int i = C115788a.f347360d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: YC */
            public void mo176157YC() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.IMicRecoder_AIDL");
                    if (!this.f347361d.transact(2, obtain, obtain2, 0)) {
                        int i = C115788a.f347360d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void al0() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.IMicRecoder_AIDL");
                    if (!this.f347361d.transact(1, obtain, obtain2, 0)) {
                        int i = C115788a.f347360d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f347361d;
            }

            public void release() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.IMicRecoder_AIDL");
                    if (!this.f347361d.transact(3, obtain, obtain2, 0)) {
                        int i = C115788a.f347360d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void start() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.IMicRecoder_AIDL");
                    if (!this.f347361d.transact(5, obtain, obtain2, 0)) {
                        int i = C115788a.f347360d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C115788a() {
            attachInterface(this, "com.tencent.mm.plugin.talkroom.component.IMicRecoder_AIDL");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.tencent.mm.plugin.talkroom.component.IMicRecoder_AIDL");
                ((C115793e) this).al0();
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.tencent.mm.plugin.talkroom.component.IMicRecoder_AIDL");
                ((C115793e) this).mo176157YC();
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface("com.tencent.mm.plugin.talkroom.component.IMicRecoder_AIDL");
                ((C115793e) this).al0();
                parcel2.writeNoException();
                return true;
            } else if (i == 4) {
                parcel.enforceInterface("com.tencent.mm.plugin.talkroom.component.IMicRecoder_AIDL");
                int R5 = ((C115793e) this).mo176156R5();
                parcel2.writeNoException();
                parcel2.writeInt(R5);
                return true;
            } else if (i == 5) {
                parcel.enforceInterface("com.tencent.mm.plugin.talkroom.component.IMicRecoder_AIDL");
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.tencent.mm.plugin.talkroom.component.IMicRecoder_AIDL");
                return true;
            }
        }
    }

    /* renamed from: R5 */
    int mo176156R5();

    /* renamed from: YC */
    void mo176157YC();

    void al0();

    void release();

    void start();
}
