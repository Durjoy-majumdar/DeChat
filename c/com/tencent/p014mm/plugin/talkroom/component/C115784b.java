package com.tencent.p014mm.plugin.talkroom.component;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import sx2.C118325m;

/* renamed from: com.tencent.mm.plugin.talkroom.component.b */
public interface C115784b extends IInterface {

    /* renamed from: com.tencent.mm.plugin.talkroom.component.b$a */
    public static abstract class C115785a extends Binder implements C115784b {

        /* renamed from: d */
        public static final /* synthetic */ int f347358d = 0;

        /* renamed from: com.tencent.mm.plugin.talkroom.component.b$a$a */
        public static class C115786a implements C115784b {

            /* renamed from: d */
            public IBinder f347359d;

            public C115786a(IBinder iBinder) {
                this.f347359d = iBinder;
            }

            /* renamed from: IV */
            public void mo176152IV(int i, int i2, boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.IMemberUpdateCallback_AIDL");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(z ? 1 : 0);
                    if (!this.f347359d.transact(1, obtain, obtain2, 0)) {
                        int i3 = C115785a.f347358d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f347359d;
            }
        }

        public C115785a() {
            attachInterface(this, "com.tencent.mm.plugin.talkroom.component.IMemberUpdateCallback_AIDL");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.tencent.mm.plugin.talkroom.component.IMemberUpdateCallback_AIDL");
                ((C118325m.C118330d) this).mo176152IV(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.tencent.mm.plugin.talkroom.component.IMemberUpdateCallback_AIDL");
                return true;
            }
        }
    }

    /* renamed from: IV */
    void mo176152IV(int i, int i2, boolean z);
}
