package com.tencent.p014mm.plugin.webview.stub;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.p014mm.plugin.webview.stub.WebViewStubService;

/* renamed from: com.tencent.mm.plugin.webview.stub.d */
public interface C43787d extends IInterface {

    /* renamed from: com.tencent.mm.plugin.webview.stub.d$a */
    public static abstract class C43788a extends Binder implements C43787d {

        /* renamed from: d */
        public static final /* synthetic */ int f118308d = 0;

        /* renamed from: com.tencent.mm.plugin.webview.stub.d$a$a */
        public static class C43789a implements C43787d {

            /* renamed from: d */
            public IBinder f118309d;

            public C43789a(IBinder iBinder) {
                this.f118309d = iBinder;
            }

            public int Dq0() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.OnSceneEnd_AIDL");
                    if (!this.f118309d.transact(2, obtain, obtain2, 0)) {
                        int i = C43788a.f118308d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int Xe0() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.OnSceneEnd_AIDL");
                    if (!this.f118309d.transact(3, obtain, obtain2, 0)) {
                        int i = C43788a.f118308d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f118309d;
            }

            public Bundle getData() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.OnSceneEnd_AIDL");
                    if (!this.f118309d.transact(5, obtain, obtain2, 0)) {
                        int i = C43788a.f118308d;
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getErrMsg() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.OnSceneEnd_AIDL");
                    if (!this.f118309d.transact(4, obtain, obtain2, 0)) {
                        int i = C43788a.f118308d;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int getType() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.OnSceneEnd_AIDL");
                    if (!this.f118309d.transact(1, obtain, obtain2, 0)) {
                        int i = C43788a.f118308d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C43788a() {
            attachInterface(this, "com.tencent.mm.plugin.webview.stub.OnSceneEnd_AIDL");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.tencent.mm.plugin.webview.stub.OnSceneEnd_AIDL");
                int i3 = ((WebViewStubService.C43780j) this).f118297e;
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.tencent.mm.plugin.webview.stub.OnSceneEnd_AIDL");
                int i4 = ((WebViewStubService.C43780j) this).f118298f;
                parcel2.writeNoException();
                parcel2.writeInt(i4);
                return true;
            } else if (i == 3) {
                parcel.enforceInterface("com.tencent.mm.plugin.webview.stub.OnSceneEnd_AIDL");
                int i5 = ((WebViewStubService.C43780j) this).f118299g;
                parcel2.writeNoException();
                parcel2.writeInt(i5);
                return true;
            } else if (i == 4) {
                parcel.enforceInterface("com.tencent.mm.plugin.webview.stub.OnSceneEnd_AIDL");
                String str = ((WebViewStubService.C43780j) this).f118300h;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            } else if (i == 5) {
                parcel.enforceInterface("com.tencent.mm.plugin.webview.stub.OnSceneEnd_AIDL");
                Bundle bundle = ((WebViewStubService.C43780j) this).f118301i;
                parcel2.writeNoException();
                if (bundle != null) {
                    parcel2.writeInt(1);
                    bundle.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.tencent.mm.plugin.webview.stub.OnSceneEnd_AIDL");
                return true;
            }
        }
    }

    int Dq0();

    int Xe0();

    Bundle getData();

    String getErrMsg();

    int getType();
}
