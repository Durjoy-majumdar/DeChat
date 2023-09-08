package com.tencent.p014mm.plugin.webview.stub;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.tencent.mm.plugin.webview.stub.m */
public interface C6107m extends IInterface {

    /* renamed from: com.tencent.mm.plugin.webview.stub.m$a */
    public static abstract class C6108a extends Binder implements C6107m {

        /* renamed from: d */
        public static final /* synthetic */ int f22477d = 0;

        /* renamed from: com.tencent.mm.plugin.webview.stub.m$a$a */
        public static class C6109a implements C6107m {

            /* renamed from: d */
            public IBinder f22478d;

            public C6109a(IBinder iBinder) {
                this.f22478d = iBinder;
            }

            /* renamed from: B7 */
            public void mo7025B7(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
                    obtain.writeString(str);
                    if (!this.f22478d.transact(15, obtain, obtain2, 0)) {
                        int i = C6108a.f22477d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void Ef0() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
                    if (!this.f22478d.transact(13, obtain, obtain2, 0)) {
                        int i = C6108a.f22477d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: F7 */
            public int mo7027F7() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
                    if (!this.f22478d.transact(9, obtain, obtain2, 0)) {
                        int i = C6108a.f22477d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Gb */
            public void mo7028Gb(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.f22478d.transact(16, obtain, obtain2, 0)) {
                        int i = C6108a.f22477d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Ni */
            public String mo7029Ni() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
                    if (!this.f22478d.transact(5, obtain, obtain2, 0)) {
                        int i = C6108a.f22477d;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: US */
            public void mo7030US(String str, String str2, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (!this.f22478d.transact(18, obtain, obtain2, 0)) {
                        int i3 = C6108a.f22477d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: V5 */
            public Bundle mo7031V5(int i, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f22478d.transact(19, obtain, obtain2, 0)) {
                        int i2 = C6108a.f22477d;
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: XB */
            public void mo7032XB(int i, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f22478d.transact(12, obtain, obtain2, 0)) {
                        int i2 = C6108a.f22477d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean Zu0(String str, String str2, Bundle bundle, boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    boolean z2 = true;
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(z ? 1 : 0);
                    if (!this.f22478d.transact(4, obtain, obtain2, 0)) {
                        int i = C6108a.f22477d;
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z2 = false;
                    }
                    return z2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f22478d;
            }

            public boolean callback(int i, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
                    obtain.writeInt(i);
                    boolean z = true;
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f22478d.transact(2, obtain, obtain2, 0)) {
                        int i2 = C6108a.f22477d;
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    if (obtain2.readInt() != 0) {
                        bundle.readFromParcel(obtain2);
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public void mo7036d(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f22478d.transact(14, obtain, obtain2, 0)) {
                        int i = C6108a.f22477d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e3 */
            public String mo7037e3() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
                    if (!this.f22478d.transact(7, obtain, obtain2, 0)) {
                        int i = C6108a.f22477d;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean fq0(C43787d dVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    boolean z = false;
                    if (!this.f22478d.transact(3, obtain, obtain2, 0)) {
                        int i = C6108a.f22477d;
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

            public String getCurrentUrl() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
                    if (!this.f22478d.transact(6, obtain, obtain2, 0)) {
                        int i = C6108a.f22477d;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: hb */
            public boolean mo7040hb(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
                    obtain.writeInt(i);
                    boolean z = false;
                    if (!this.f22478d.transact(1, obtain, obtain2, 0)) {
                        int i2 = C6108a.f22477d;
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

            /* renamed from: mC */
            public void mo7041mC(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f22478d.transact(20, obtain, obtain2, 0)) {
                        int i = C6108a.f22477d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public Bundle q10(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.f22478d.transact(23, obtain, obtain2, 0)) {
                        int i = C6108a.f22477d;
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: uP */
            public void mo7043uP() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
                    if (!this.f22478d.transact(17, obtain, obtain2, 0)) {
                        int i = C6108a.f22477d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: xf */
            public void mo7044xf(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
                    obtain.writeInt(z ? 1 : 0);
                    if (!this.f22478d.transact(21, obtain, obtain2, 0)) {
                        int i = C6108a.f22477d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: xx */
            public void mo7045xx(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.f22478d.transact(22, obtain, obtain2, 0)) {
                        int i = C6108a.f22477d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String ya0() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
                    if (!this.f22478d.transact(8, obtain, obtain2, 0)) {
                        int i = C6108a.f22477d;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C6108a() {
            attachInterface(this, "com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: android.os.Bundle} */
        /* JADX WARNING: type inference failed for: r3v0 */
        /* JADX WARNING: type inference failed for: r3v4, types: [com.tencent.mm.plugin.webview.stub.d] */
        /* JADX WARNING: type inference failed for: r3v23 */
        /* JADX WARNING: type inference failed for: r3v24 */
        /* JADX WARNING: type inference failed for: r3v25 */
        /* JADX WARNING: type inference failed for: r3v26 */
        /* JADX WARNING: type inference failed for: r3v27 */
        /* JADX WARNING: type inference failed for: r3v28 */
        /* JADX WARNING: type inference failed for: r3v29 */
        /* JADX WARNING: type inference failed for: r3v30 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
            /*
                r4 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                java.lang.String r2 = "com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL"
                if (r5 == r0) goto L_0x0218
                r0 = 0
                r3 = 0
                switch(r5) {
                    case 1: goto L_0x0206;
                    case 2: goto L_0x01d9;
                    case 3: goto L_0x01af;
                    case 4: goto L_0x0183;
                    case 5: goto L_0x0175;
                    case 6: goto L_0x0167;
                    case 7: goto L_0x0159;
                    case 8: goto L_0x014b;
                    case 9: goto L_0x013d;
                    case 10: goto L_0x012c;
                    case 11: goto L_0x011b;
                    case 12: goto L_0x00fe;
                    case 13: goto L_0x00f4;
                    case 14: goto L_0x00db;
                    case 15: goto L_0x00cd;
                    case 16: goto L_0x00bb;
                    case 17: goto L_0x00b1;
                    case 18: goto L_0x0097;
                    case 19: goto L_0x006d;
                    case 20: goto L_0x0054;
                    case 21: goto L_0x0043;
                    case 22: goto L_0x0031;
                    case 23: goto L_0x0012;
                    default: goto L_0x000d;
                }
            L_0x000d:
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x0012:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                java.lang.String r6 = r6.readString()
                android.os.Bundle r5 = r4.q10(r5, r6)
                r7.writeNoException()
                if (r5 == 0) goto L_0x002d
                r7.writeInt(r1)
                r5.writeToParcel(r7, r1)
                goto L_0x0030
            L_0x002d:
                r7.writeInt(r0)
            L_0x0030:
                return r1
            L_0x0031:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                java.lang.String r6 = r6.readString()
                r4.mo7045xx(r5, r6)
                r7.writeNoException()
                return r1
            L_0x0043:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x004d
                r0 = 1
            L_0x004d:
                r4.mo7044xf(r0)
                r7.writeNoException()
                return r1
            L_0x0054:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0066
                android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x0066:
                r4.mo7041mC(r3)
                r7.writeNoException()
                return r1
            L_0x006d:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0083
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x0083:
                android.os.Bundle r5 = r4.mo7031V5(r5, r3)
                r7.writeNoException()
                if (r5 == 0) goto L_0x0093
                r7.writeInt(r1)
                r5.writeToParcel(r7, r1)
                goto L_0x0096
            L_0x0093:
                r7.writeInt(r0)
            L_0x0096:
                return r1
            L_0x0097:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                java.lang.String r8 = r6.readString()
                int r0 = r6.readInt()
                int r6 = r6.readInt()
                r4.mo7030US(r5, r8, r0, r6)
                r7.writeNoException()
                return r1
            L_0x00b1:
                r6.enforceInterface(r2)
                r4.mo7043uP()
                r7.writeNoException()
                return r1
            L_0x00bb:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                java.lang.String r6 = r6.readString()
                r4.mo7028Gb(r5, r6)
                r7.writeNoException()
                return r1
            L_0x00cd:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                r4.mo7025B7(r5)
                r7.writeNoException()
                return r1
            L_0x00db:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00ed
                android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x00ed:
                r4.mo7036d(r3)
                r7.writeNoException()
                return r1
            L_0x00f4:
                r6.enforceInterface(r2)
                r4.Ef0()
                r7.writeNoException()
                return r1
            L_0x00fe:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0114
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x0114:
                r4.mo7032XB(r5, r3)
                r7.writeNoException()
                return r1
            L_0x011b:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0125
                r0 = 1
            L_0x0125:
                r4.mo7062kn(r0)
                r7.writeNoException()
                return r1
            L_0x012c:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0136
                r0 = 1
            L_0x0136:
                r4.mo7061es(r0)
                r7.writeNoException()
                return r1
            L_0x013d:
                r6.enforceInterface(r2)
                int r5 = r4.mo7027F7()
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x014b:
                r6.enforceInterface(r2)
                java.lang.String r5 = r4.ya0()
                r7.writeNoException()
                r7.writeString(r5)
                return r1
            L_0x0159:
                r6.enforceInterface(r2)
                java.lang.String r5 = r4.mo7037e3()
                r7.writeNoException()
                r7.writeString(r5)
                return r1
            L_0x0167:
                r6.enforceInterface(r2)
                java.lang.String r5 = r4.getCurrentUrl()
                r7.writeNoException()
                r7.writeString(r5)
                return r1
            L_0x0175:
                r6.enforceInterface(r2)
                java.lang.String r5 = r4.mo7029Ni()
                r7.writeNoException()
                r7.writeString(r5)
                return r1
            L_0x0183:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                java.lang.String r8 = r6.readString()
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x019d
                android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
                java.lang.Object r2 = r2.createFromParcel(r6)
                r3 = r2
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x019d:
                int r6 = r6.readInt()
                if (r6 == 0) goto L_0x01a4
                r0 = 1
            L_0x01a4:
                boolean r5 = r4.Zu0(r5, r8, r3, r0)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x01af:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                if (r5 != 0) goto L_0x01b9
                goto L_0x01ce
            L_0x01b9:
                java.lang.String r6 = "com.tencent.mm.plugin.webview.stub.OnSceneEnd_AIDL"
                android.os.IInterface r6 = r5.queryLocalInterface(r6)
                if (r6 == 0) goto L_0x01c9
                boolean r8 = r6 instanceof com.tencent.p014mm.plugin.webview.stub.C43787d
                if (r8 == 0) goto L_0x01c9
                r3 = r6
                com.tencent.mm.plugin.webview.stub.d r3 = (com.tencent.p014mm.plugin.webview.stub.C43787d) r3
                goto L_0x01ce
            L_0x01c9:
                com.tencent.mm.plugin.webview.stub.d$a$a r3 = new com.tencent.mm.plugin.webview.stub.d$a$a
                r3.<init>(r5)
            L_0x01ce:
                boolean r5 = r4.fq0(r3)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x01d9:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x01ef
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x01ef:
                boolean r5 = r4.callback(r5, r3)
                r7.writeNoException()
                r7.writeInt(r5)
                if (r3 == 0) goto L_0x0202
                r7.writeInt(r1)
                r3.writeToParcel(r7, r1)
                goto L_0x0205
            L_0x0202:
                r7.writeInt(r0)
            L_0x0205:
                return r1
            L_0x0206:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                boolean r5 = r4.mo7040hb(r5)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x0218:
                r7.writeString(r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.stub.C6107m.C6108a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: B7 */
    void mo7025B7(String str);

    void Ef0();

    /* renamed from: F7 */
    int mo7027F7();

    /* renamed from: Gb */
    void mo7028Gb(String str, String str2);

    /* renamed from: Ni */
    String mo7029Ni();

    /* renamed from: US */
    void mo7030US(String str, String str2, int i, int i2);

    /* renamed from: V5 */
    Bundle mo7031V5(int i, Bundle bundle);

    /* renamed from: XB */
    void mo7032XB(int i, Bundle bundle);

    boolean Zu0(String str, String str2, Bundle bundle, boolean z);

    boolean callback(int i, Bundle bundle);

    /* renamed from: d */
    void mo7036d(Bundle bundle);

    /* renamed from: e3 */
    String mo7037e3();

    /* renamed from: es */
    void mo7061es(boolean z);

    boolean fq0(C43787d dVar);

    String getCurrentUrl();

    /* renamed from: hb */
    boolean mo7040hb(int i);

    /* renamed from: kn */
    void mo7062kn(boolean z);

    /* renamed from: mC */
    void mo7041mC(Bundle bundle);

    Bundle q10(String str, String str2);

    /* renamed from: uP */
    void mo7043uP();

    /* renamed from: xf */
    void mo7044xf(boolean z);

    /* renamed from: xx */
    void mo7045xx(String str, String str2);

    String ya0();
}
