package com.tencent.p014mm.plugin.webview.stub;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.p014mm.plugin.webview.stub.WebViewStubService;

/* renamed from: com.tencent.mm.plugin.webview.stub.c */
public interface C43784c extends IInterface {

    /* renamed from: com.tencent.mm.plugin.webview.stub.c$a */
    public static abstract class C43785a extends Binder implements C43784c {

        /* renamed from: d */
        public static final /* synthetic */ int f118306d = 0;

        /* renamed from: com.tencent.mm.plugin.webview.stub.c$a$a */
        public static class C43786a implements C43784c {

            /* renamed from: d */
            public IBinder f118307d;

            public C43786a(IBinder iBinder) {
                this.f118307d = iBinder;
            }

            public IBinder asBinder() {
                return this.f118307d;
            }

            /* renamed from: eQ */
            public boolean mo68154eQ() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.FavUrl_Result_AIDL");
                    boolean z = false;
                    if (!this.f118307d.transact(1, obtain, obtain2, 0)) {
                        int i = C43785a.f118306d;
                    }
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

            public int getRet() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.FavUrl_Result_AIDL");
                    if (!this.f118307d.transact(3, obtain, obtain2, 0)) {
                        int i = C43785a.f118306d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C43785a() {
            attachInterface(this, "com.tencent.mm.plugin.webview.stub.FavUrl_Result_AIDL");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.tencent.mm.plugin.webview.stub.FavUrl_Result_AIDL");
                boolean z = ((WebViewStubService.C43782i) this).f118303e;
                parcel2.writeNoException();
                parcel2.writeInt(z ? 1 : 0);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.tencent.mm.plugin.webview.stub.FavUrl_Result_AIDL");
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            } else if (i == 3) {
                parcel.enforceInterface("com.tencent.mm.plugin.webview.stub.FavUrl_Result_AIDL");
                int i3 = ((WebViewStubService.C43782i) this).f118304f;
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            } else if (i == 4) {
                parcel.enforceInterface("com.tencent.mm.plugin.webview.stub.FavUrl_Result_AIDL");
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.tencent.mm.plugin.webview.stub.FavUrl_Result_AIDL");
                return true;
            }
        }
    }

    /* renamed from: eQ */
    boolean mo68154eQ();

    int getRet();
}
