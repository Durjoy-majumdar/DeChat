package com.tencent.p014mm.plugin.talkroom.component;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.tencent.mm.plugin.talkroom.component.d */
public interface C115790d extends IInterface {

    /* renamed from: com.tencent.mm.plugin.talkroom.component.d$a */
    public static abstract class C115791a extends Binder implements C115790d {

        /* renamed from: d */
        public static final /* synthetic */ int f347362d = 0;

        /* renamed from: com.tencent.mm.plugin.talkroom.component.d$a$a */
        public static class C115792a implements C115790d {

            /* renamed from: d */
            public IBinder f347363d;

            public C115792a(IBinder iBinder) {
                this.f347363d = iBinder;
            }

            /* renamed from: R5 */
            public int mo176164R5() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.ITalkRoomPlayer_AIDL");
                    if (!this.f347363d.transact(4, obtain, obtain2, 0)) {
                        int i = C115791a.f347362d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: W */
            public void mo176165W() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.ITalkRoomPlayer_AIDL");
                    if (!this.f347363d.transact(1, obtain, obtain2, 0)) {
                        int i = C115791a.f347362d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Z */
            public void mo176166Z() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.ITalkRoomPlayer_AIDL");
                    if (!this.f347363d.transact(2, obtain, obtain2, 0)) {
                        int i = C115791a.f347362d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f347363d;
            }

            public void release() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.ITalkRoomPlayer_AIDL");
                    if (!this.f347363d.transact(3, obtain, obtain2, 0)) {
                        int i = C115791a.f347362d;
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
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.ITalkRoomPlayer_AIDL");
                    if (!this.f347363d.transact(5, obtain, obtain2, 0)) {
                        int i = C115791a.f347362d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C115791a() {
            attachInterface(this, "com.tencent.mm.plugin.talkroom.component.ITalkRoomPlayer_AIDL");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.tencent.mm.plugin.talkroom.component.ITalkRoomPlayer_AIDL");
                ((C115803g) this).mo176165W();
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.tencent.mm.plugin.talkroom.component.ITalkRoomPlayer_AIDL");
                ((C115803g) this).mo176166Z();
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface("com.tencent.mm.plugin.talkroom.component.ITalkRoomPlayer_AIDL");
                ((C115803g) this).release();
                parcel2.writeNoException();
                return true;
            } else if (i == 4) {
                parcel.enforceInterface("com.tencent.mm.plugin.talkroom.component.ITalkRoomPlayer_AIDL");
                int R5 = ((C115803g) this).mo176164R5();
                parcel2.writeNoException();
                parcel2.writeInt(R5);
                return true;
            } else if (i == 5) {
                parcel.enforceInterface("com.tencent.mm.plugin.talkroom.component.ITalkRoomPlayer_AIDL");
                ((C115803g) this).start();
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.tencent.mm.plugin.talkroom.component.ITalkRoomPlayer_AIDL");
                return true;
            }
        }
    }

    /* renamed from: R5 */
    int mo176164R5();

    /* renamed from: W */
    void mo176165W();

    /* renamed from: Z */
    void mo176166Z();

    void release();

    void start();
}
