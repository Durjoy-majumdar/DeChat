package com.tencent.p014mm.plugin.talkroom.component;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.tencent.mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL */
public interface ILiveConEngineCallback_AIDL extends IInterface {

    /* renamed from: com.tencent.mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL$a */
    public static abstract class C115779a extends Binder implements ILiveConEngineCallback_AIDL {

        /* renamed from: d */
        public static final /* synthetic */ int f347354d = 0;

        /* renamed from: com.tencent.mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL$a$a */
        public static class C115780a implements ILiveConEngineCallback_AIDL {

            /* renamed from: d */
            public IBinder f347355d;

            public C115780a(IBinder iBinder) {
                this.f347355d = iBinder;
            }

            public IBinder asBinder() {
                return this.f347355d;
            }

            public void keep_OnError(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL");
                    obtain.writeInt(i);
                    if (!this.f347355d.transact(2, obtain, obtain2, 0)) {
                        int i2 = C115779a.f347354d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void keep_OnOpenSuccess() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL");
                    if (!this.f347355d.transact(1, obtain, obtain2, 0)) {
                        int i = C115779a.f347354d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C115779a() {
            attachInterface(this, "com.tencent.mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL");
        }

        public IBinder asBinder() {
            return this;
        }

        public abstract /* synthetic */ void keep_OnError(int i);

        public abstract /* synthetic */ void keep_OnOpenSuccess();

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.tencent.mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL");
                keep_OnOpenSuccess();
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.tencent.mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL");
                keep_OnError(parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.tencent.mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL");
                return true;
            }
        }
    }

    void keep_OnError(int i);

    void keep_OnOpenSuccess();
}
