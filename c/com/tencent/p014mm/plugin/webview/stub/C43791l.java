package com.tencent.p014mm.plugin.webview.stub;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.p014mm.plugin.webview.stub.C43784c;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.webview.stub.l */
public interface C43791l extends IInterface {

    /* renamed from: com.tencent.mm.plugin.webview.stub.l$a */
    public static abstract class C43792a extends Binder implements C43791l {

        /* renamed from: d */
        public static final /* synthetic */ int f118310d = 0;

        /* renamed from: com.tencent.mm.plugin.webview.stub.l$a$a */
        public static class C43793a implements C43791l {

            /* renamed from: d */
            public IBinder f118311d;

            public C43793a(IBinder iBinder) {
                this.f118311d = iBinder;
            }

            /* renamed from: Bk */
            public void mo68088Bk(String str, String str2, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    if (!this.f118311d.transact(36, obtain, obtain2, 0)) {
                        int i2 = C43792a.f118310d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean Bq0(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    obtain.writeString(str);
                    boolean z = false;
                    if (!this.f118311d.transact(1, obtain, obtain2, 0)) {
                        int i = C43792a.f118310d;
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

            public void C70(String str, boolean z, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(i);
                    if (!this.f118311d.transact(32, obtain, obtain2, 0)) {
                        int i2 = C43792a.f118310d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean Cb0(String str, boolean z, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    obtain.writeString(str);
                    boolean z2 = true;
                    obtain.writeInt(z ? 1 : 0);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f118311d.transact(25, obtain, obtain2, 0)) {
                        int i = C43792a.f118310d;
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

            public void Cl0(int i, String str, String str2, String str3, int i2, int i3, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f118311d.transact(68, obtain, obtain2, 0)) {
                        int i4 = C43792a.f118310d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String Dj0(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    obtain.writeString(str);
                    if (!this.f118311d.transact(63, obtain, obtain2, 0)) {
                        int i = C43792a.f118310d;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Fu */
            public boolean mo68094Fu() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    boolean z = false;
                    if (!this.f118311d.transact(9, obtain, obtain2, 0)) {
                        int i = C43792a.f118310d;
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

            /* renamed from: Gm */
            public boolean mo68095Gm(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    obtain.writeString(str);
                    boolean z = false;
                    if (!this.f118311d.transact(5, obtain, obtain2, 0)) {
                        int i = C43792a.f118310d;
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

            /* renamed from: Hz */
            public void mo68096Hz(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    if (!this.f118311d.transact(27, obtain, obtain2, 0)) {
                        int i2 = C43792a.f118310d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean Ie0(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    obtain.writeString(str);
                    boolean z = false;
                    if (!this.f118311d.transact(3, obtain, obtain2, 0)) {
                        int i = C43792a.f118310d;
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

            /* renamed from: J8 */
            public String mo68098J8(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    if (!this.f118311d.transact(51, obtain, obtain2, 0)) {
                        int i2 = C43792a.f118310d;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Kn */
            public void mo68099Kn(String str, int[] iArr, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    obtain.writeString(str);
                    obtain.writeIntArray(iArr);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (!this.f118311d.transact(66, obtain, obtain2, 0)) {
                        int i3 = C43792a.f118310d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void Md0(Bundle bundle, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    if (!this.f118311d.transact(73, obtain, obtain2, 0)) {
                        int i2 = C43792a.f118310d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean Ms0() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    boolean z = false;
                    if (!this.f118311d.transact(65, obtain, obtain2, 0)) {
                        int i = C43792a.f118310d;
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

            public void Np0(C6107m mVar, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    obtain.writeStrongBinder(mVar != null ? mVar.asBinder() : null);
                    obtain.writeInt(i);
                    if (!this.f118311d.transact(41, obtain, obtain2, 0)) {
                        int i2 = C43792a.f118310d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Oa */
            public String mo68103Oa() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    if (!this.f118311d.transact(53, obtain, obtain2, 0)) {
                        int i = C43792a.f118310d;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Ow */
            public void mo68104Ow(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    obtain.writeInt(i);
                    if (!this.f118311d.transact(58, obtain, obtain2, 0)) {
                        int i2 = C43792a.f118310d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void Q20(int i, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f118311d.transact(76, obtain, obtain2, 0)) {
                        int i2 = C43792a.f118310d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: RN */
            public boolean mo68106RN() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    boolean z = false;
                    if (!this.f118311d.transact(22, obtain, obtain2, 0)) {
                        int i = C43792a.f118310d;
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

            /* renamed from: RT */
            public int mo68107RT() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    if (!this.f118311d.transact(54, obtain, obtain2, 0)) {
                        int i = C43792a.f118310d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: RV */
            public boolean mo68108RV(int i, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    obtain.writeInt(i);
                    boolean z = true;
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f118311d.transact(19, obtain, obtain2, 0)) {
                        int i2 = C43792a.f118310d;
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Sk */
            public void mo68109Sk(int i, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.f118311d.transact(71, obtain, obtain2, 0)) {
                        int i2 = C43792a.f118310d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Sl */
            public boolean mo68110Sl() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    boolean z = false;
                    if (!this.f118311d.transact(64, obtain, obtain2, 0)) {
                        int i = C43792a.f118310d;
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

            public void Th0(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    obtain.writeString(str);
                    if (!this.f118311d.transact(50, obtain, obtain2, 0)) {
                        int i = C43792a.f118310d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: U0 */
            public boolean mo68112U0(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    obtain.writeString(str);
                    boolean z = false;
                    if (!this.f118311d.transact(29, obtain, obtain2, 0)) {
                        int i = C43792a.f118310d;
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

            public void U30(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    obtain.writeInt(i);
                    if (!this.f118311d.transact(59, obtain, obtain2, 0)) {
                        int i2 = C43792a.f118310d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: V5 */
            public Bundle mo68114V5(int i, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f118311d.transact(69, obtain, obtain2, 0)) {
                        int i2 = C43792a.f118310d;
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean V50(String str, String str2, String str3, Bundle bundle, Bundle bundle2, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    boolean z = true;
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle2 != null) {
                        obtain.writeInt(1);
                        bundle2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    if (!this.f118311d.transact(35, obtain, obtain2, 0)) {
                        int i2 = C43792a.f118310d;
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int Wn0(int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (!this.f118311d.transact(11, obtain, obtain2, 0)) {
                        int i3 = C43792a.f118310d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Wy */
            public int mo68117Wy() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    if (!this.f118311d.transact(55, obtain, obtain2, 0)) {
                        int i = C43792a.f118310d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void Yu0(int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (!this.f118311d.transact(12, obtain, obtain2, 0)) {
                        int i3 = C43792a.f118310d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: aG */
            public C43784c mo68119aG(Bundle bundle) {
                C43784c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f118311d.transact(15, obtain, obtain2, 0)) {
                        int i = C43792a.f118310d;
                    }
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    int i2 = C43784c.C43785a.f118306d;
                    if (readStrongBinder == null) {
                        cVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.tencent.mm.plugin.webview.stub.FavUrl_Result_AIDL");
                        cVar = (queryLocalInterface == null || !(queryLocalInterface instanceof C43784c)) ? new C43784c.C43785a.C43786a(readStrongBinder) : (C43784c) queryLocalInterface;
                    }
                    return cVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: aI */
            public int mo68120aI(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    obtain.writeString(str);
                    if (!this.f118311d.transact(17, obtain, obtain2, 0)) {
                        int i = C43792a.f118310d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f118311d;
            }

            public void b00(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    obtain.writeString(str);
                    if (!this.f118311d.transact(67, obtain, obtain2, 0)) {
                        int i = C43792a.f118310d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: cU */
            public String mo68123cU(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    obtain.writeString(str);
                    if (!this.f118311d.transact(45, obtain, obtain2, 0)) {
                        int i = C43792a.f118310d;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: cg */
            public void mo68124cg(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    obtain.writeInt(i);
                    if (!this.f118311d.transact(42, obtain, obtain2, 0)) {
                        int i2 = C43792a.f118310d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d6 */
            public void mo68125d6(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    if (!this.f118311d.transact(61, obtain, obtain2, 0)) {
                        int i2 = C43792a.f118310d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: dA */
            public void mo68126dA(int i, boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    if (!this.f118311d.transact(60, obtain, obtain2, 0)) {
                        int i2 = C43792a.f118310d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: dE */
            public boolean mo68127dE(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    boolean z = true;
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f118311d.transact(16, obtain, obtain2, 0)) {
                        int i = C43792a.f118310d;
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: eO */
            public void mo68129eO(int i, List<String> list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    obtain.writeInt(i);
                    obtain.writeStringList(list);
                    if (!this.f118311d.transact(24, obtain, obtain2, 0)) {
                        int i2 = C43792a.f118310d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void favEditTag() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    if (!this.f118311d.transact(18, obtain, obtain2, 0)) {
                        int i = C43792a.f118310d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getDisplayName(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    obtain.writeString(str);
                    if (!this.f118311d.transact(2, obtain, obtain2, 0)) {
                        int i = C43792a.f118310d;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getLanguage() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    if (!this.f118311d.transact(52, obtain, obtain2, 0)) {
                        int i = C43792a.f118310d;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean gg0(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    obtain.writeString(str);
                    boolean z = false;
                    if (!this.f118311d.transact(4, obtain, obtain2, 0)) {
                        int i = C43792a.f118310d;
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

            /* renamed from: gv */
            public Bundle mo68134gv(int i, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f118311d.transact(31, obtain, obtain2, 0)) {
                        int i2 = C43792a.f118310d;
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ha */
            public void mo68135ha() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    if (!this.f118311d.transact(57, obtain, obtain2, 0)) {
                        int i = C43792a.f118310d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean isSDCardAvailable() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    boolean z = false;
                    if (!this.f118311d.transact(8, obtain, obtain2, 0)) {
                        int i = C43792a.f118310d;
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

            /* renamed from: jN */
            public void mo68137jN() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    if (!this.f118311d.transact(56, obtain, obtain2, 0)) {
                        int i = C43792a.f118310d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: jo */
            public boolean mo68138jo(long j, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    obtain.writeLong(j);
                    obtain.writeString(str);
                    boolean z = false;
                    if (!this.f118311d.transact(20, obtain, obtain2, 0)) {
                        int i = C43792a.f118310d;
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

            /* renamed from: jx */
            public Map mo68139jx() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    if (!this.f118311d.transact(48, obtain, obtain2, 0)) {
                        int i = C43792a.f118310d;
                    }
                    obtain2.readException();
                    return obtain2.readHashMap(C43793a.class.getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void kk0(Intent intent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f118311d.transact(70, obtain, obtain2, 0)) {
                        int i = C43792a.f118310d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String mf0(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    obtain.writeString(str);
                    if (!this.f118311d.transact(47, obtain, obtain2, 0)) {
                        int i = C43792a.f118310d;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: mr */
            public String mo68142mr(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    obtain.writeString(str);
                    if (!this.f118311d.transact(6, obtain, obtain2, 0)) {
                        int i = C43792a.f118310d;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: nO */
            public void mo68143nO(String str, boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    if (!this.f118311d.transact(28, obtain, obtain2, 0)) {
                        int i = C43792a.f118310d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: nP */
            public String mo68144nP(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    obtain.writeString(str);
                    if (!this.f118311d.transact(26, obtain, obtain2, 0)) {
                        int i = C43792a.f118310d;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: pG */
            public void mo68145pG(int i, Bundle bundle, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i2);
                    if (!this.f118311d.transact(14, obtain, obtain2, 0)) {
                        int i3 = C43792a.f118310d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: pa */
            public String mo68146pa(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    obtain.writeString(str);
                    if (!this.f118311d.transact(39, obtain, obtain2, 0)) {
                        int i = C43792a.f118310d;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public List<String> tf0() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    if (!this.f118311d.transact(72, obtain, obtain2, 0)) {
                        int i = C43792a.f118310d;
                    }
                    obtain2.readException();
                    return obtain2.createStringArrayList();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: uU */
            public List<String> mo68148uU() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    if (!this.f118311d.transact(23, obtain, obtain2, 0)) {
                        int i = C43792a.f118310d;
                    }
                    obtain2.readException();
                    return obtain2.createStringArrayList();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: vj */
            public Bundle mo68149vj(int i, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f118311d.transact(30, obtain, obtain2, 0)) {
                        int i2 = C43792a.f118310d;
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String xa0() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    if (!this.f118311d.transact(44, obtain, obtain2, 0)) {
                        int i = C43792a.f118310d;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: xs */
            public int mo68151xs() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    if (!this.f118311d.transact(74, obtain, obtain2, 0)) {
                        int i = C43792a.f118310d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ys */
            public boolean mo68152ys(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    obtain.writeInt(i);
                    boolean z = false;
                    if (!this.f118311d.transact(34, obtain, obtain2, 0)) {
                        int i2 = C43792a.f118310d;
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

            /* renamed from: zr */
            public void mo68153zr(String str, int i, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f118311d.transact(21, obtain, obtain2, 0)) {
                        int i2 = C43792a.f118310d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C43792a() {
            attachInterface(this, "com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        }

        /* renamed from: a */
        public static C43791l m47732a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C43791l)) ? new C43793a(iBinder) : (C43791l) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v19, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v22, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v29, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v36, resolved type: java.lang.String[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v43, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v49, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v52, resolved type: java.lang.String[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v54, resolved type: android.os.Bundle} */
        /* JADX WARNING: type inference failed for: r9v0 */
        /* JADX WARNING: type inference failed for: r9v25 */
        /* JADX WARNING: type inference failed for: r9v32, types: [com.tencent.mm.plugin.webview.stub.m] */
        /* JADX WARNING: type inference failed for: r9v38 */
        /* JADX WARNING: type inference failed for: r9v46, types: [android.content.Intent] */
        /* JADX WARNING: type inference failed for: r9v57 */
        /* JADX WARNING: type inference failed for: r9v58 */
        /* JADX WARNING: type inference failed for: r9v59 */
        /* JADX WARNING: type inference failed for: r9v60 */
        /* JADX WARNING: type inference failed for: r9v61 */
        /* JADX WARNING: type inference failed for: r9v62 */
        /* JADX WARNING: type inference failed for: r9v63 */
        /* JADX WARNING: type inference failed for: r9v64 */
        /* JADX WARNING: type inference failed for: r9v65 */
        /* JADX WARNING: type inference failed for: r9v66 */
        /* JADX WARNING: type inference failed for: r9v67 */
        /* JADX WARNING: type inference failed for: r9v68 */
        /* JADX WARNING: type inference failed for: r9v69 */
        /* JADX WARNING: type inference failed for: r9v70 */
        /* JADX WARNING: type inference failed for: r9v71 */
        /* JADX WARNING: type inference failed for: r9v72 */
        /* JADX WARNING: type inference failed for: r9v73 */
        /* JADX WARNING: type inference failed for: r9v74 */
        /* JADX WARNING: type inference failed for: r9v75 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r18, android.os.Parcel r19, android.os.Parcel r20, int r21) {
            /*
                r17 = this;
                r0 = r18
                r1 = r19
                r2 = r20
                java.lang.Class<lc3.b> r3 = lc3.C10485b.class
                r4 = 1
                r5 = 1598968902(0x5f4e5446, float:1.4867585E19)
                java.lang.String r6 = "com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL"
                if (r0 == r5) goto L_0x0805
                java.lang.String r5 = ""
                java.lang.String r7 = ";"
                r8 = 0
                r9 = 0
                switch(r0) {
                    case 1: goto L_0x07f4;
                    case 2: goto L_0x07de;
                    case 3: goto L_0x07cc;
                    case 4: goto L_0x07ba;
                    case 5: goto L_0x07a4;
                    case 6: goto L_0x078e;
                    case 7: goto L_0x0780;
                    case 8: goto L_0x076e;
                    case 9: goto L_0x0760;
                    case 10: goto L_0x0752;
                    case 11: goto L_0x0738;
                    case 12: goto L_0x0722;
                    case 13: goto L_0x06fe;
                    case 14: goto L_0x06d9;
                    case 15: goto L_0x06b6;
                    case 16: goto L_0x0695;
                    case 17: goto L_0x067f;
                    case 18: goto L_0x0671;
                    case 19: goto L_0x064c;
                    case 20: goto L_0x0632;
                    case 21: goto L_0x060d;
                    case 22: goto L_0x05ff;
                    case 23: goto L_0x05ed;
                    case 24: goto L_0x05d7;
                    case 25: goto L_0x05ab;
                    case 26: goto L_0x0595;
                    case 27: goto L_0x057f;
                    case 28: goto L_0x0566;
                    case 29: goto L_0x0550;
                    case 30: goto L_0x0522;
                    case 31: goto L_0x04fa;
                    case 32: goto L_0x04dd;
                    case 33: goto L_0x04be;
                    case 34: goto L_0x04a8;
                    case 35: goto L_0x0464;
                    case 36: goto L_0x044a;
                    case 37: goto L_0x0403;
                    case 38: goto L_0x03c0;
                    case 39: goto L_0x03aa;
                    case 40: goto L_0x037c;
                    case 41: goto L_0x034e;
                    case 42: goto L_0x033c;
                    case 43: goto L_0x0314;
                    case 44: goto L_0x0302;
                    case 45: goto L_0x02f0;
                    case 46: goto L_0x02d2;
                    case 47: goto L_0x02bc;
                    case 48: goto L_0x02aa;
                    case 49: goto L_0x029a;
                    case 50: goto L_0x0288;
                    case 51: goto L_0x026e;
                    case 52: goto L_0x025c;
                    case 53: goto L_0x024a;
                    case 54: goto L_0x0238;
                    case 55: goto L_0x0226;
                    case 56: goto L_0x0218;
                    case 57: goto L_0x020a;
                    case 58: goto L_0x01f8;
                    case 59: goto L_0x01e6;
                    case 60: goto L_0x01cd;
                    case 61: goto L_0x01b7;
                    case 62: goto L_0x01a9;
                    case 63: goto L_0x0194;
                    case 64: goto L_0x0182;
                    case 65: goto L_0x0170;
                    case 66: goto L_0x0152;
                    case 67: goto L_0x0140;
                    case 68: goto L_0x0109;
                    case 69: goto L_0x00db;
                    case 70: goto L_0x00be;
                    case 71: goto L_0x00a4;
                    case 72: goto L_0x0092;
                    case 73: goto L_0x0071;
                    case 74: goto L_0x0065;
                    case 75: goto L_0x003f;
                    case 76: goto L_0x001e;
                    default: goto L_0x0019;
                }
            L_0x0019:
                boolean r0 = super.onTransact(r18, r19, r20, r21)
                return r0
            L_0x001e:
                r1.enforceInterface(r6)
                int r0 = r19.readInt()
                int r3 = r19.readInt()
                if (r3 == 0) goto L_0x0034
                android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
                java.lang.Object r1 = r3.createFromParcel(r1)
                r9 = r1
                android.os.Bundle r9 = (android.os.Bundle) r9
            L_0x0034:
                r1 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r1 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r1
                r1.Q20(r0, r9)
                r20.writeNoException()
                return r4
            L_0x003f:
                r1.enforceInterface(r6)
                k40.a r0 = f40.C86709a0.m107533q(r3)
                lc3.b r0 = (lc3.C10485b) r0
                pj.d r0 = r0.g50()
                java.lang.String r1 = "AsyncCheckUrl"
                java.lang.String r3 = "UrlHost"
                java.lang.String r0 = r0.mo72508a(r4, r1, r3)
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r1 != 0) goto L_0x005e
                java.lang.String[] r9 = r0.split(r7)
            L_0x005e:
                r20.writeNoException()
                r2.writeStringArray(r9)
                return r4
            L_0x0065:
                r1.enforceInterface(r6)
                int r0 = ie3.C87716k.f253994a
                r20.writeNoException()
                r2.writeInt(r0)
                return r4
            L_0x0071:
                r1.enforceInterface(r6)
                int r0 = r19.readInt()
                if (r0 == 0) goto L_0x0083
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r1)
                r9 = r0
                android.os.Bundle r9 = (android.os.Bundle) r9
            L_0x0083:
                int r0 = r19.readInt()
                r1 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r1 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r1
                r1.Md0(r9, r0)
                r20.writeNoException()
                return r4
            L_0x0092:
                r1.enforceInterface(r6)
                r0 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r0 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r0
                java.util.List r0 = r0.tf0()
                r20.writeNoException()
                r2.writeStringList(r0)
                return r4
            L_0x00a4:
                r1.enforceInterface(r6)
                int r0 = r19.readInt()
                java.lang.String r3 = r19.readString()
                java.lang.String r1 = r19.readString()
                r5 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r5 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r5
                r5.mo68109Sk(r0, r3, r1)
                r20.writeNoException()
                return r4
            L_0x00be:
                r1.enforceInterface(r6)
                int r0 = r19.readInt()
                if (r0 == 0) goto L_0x00d0
                android.os.Parcelable$Creator r0 = android.content.Intent.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r1)
                r9 = r0
                android.content.Intent r9 = (android.content.Intent) r9
            L_0x00d0:
                r0 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r0 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r0
                r0.kk0(r9)
                r20.writeNoException()
                return r4
            L_0x00db:
                r1.enforceInterface(r6)
                int r0 = r19.readInt()
                int r3 = r19.readInt()
                if (r3 == 0) goto L_0x00f1
                android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
                java.lang.Object r1 = r3.createFromParcel(r1)
                r9 = r1
                android.os.Bundle r9 = (android.os.Bundle) r9
            L_0x00f1:
                r1 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r1 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r1
                android.os.Bundle r0 = r1.mo68114V5(r0, r9)
                r20.writeNoException()
                if (r0 == 0) goto L_0x0105
                r2.writeInt(r4)
                r0.writeToParcel(r2, r4)
                goto L_0x0108
            L_0x0105:
                r2.writeInt(r8)
            L_0x0108:
                return r4
            L_0x0109:
                r1.enforceInterface(r6)
                int r10 = r19.readInt()
                java.lang.String r11 = r19.readString()
                java.lang.String r12 = r19.readString()
                java.lang.String r13 = r19.readString()
                int r14 = r19.readInt()
                int r15 = r19.readInt()
                int r0 = r19.readInt()
                if (r0 == 0) goto L_0x0133
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r1)
                r9 = r0
                android.os.Bundle r9 = (android.os.Bundle) r9
            L_0x0133:
                r16 = r9
                r9 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r9 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r9
                r9.Cl0(r10, r11, r12, r13, r14, r15, r16)
                r20.writeNoException()
                return r4
            L_0x0140:
                r1.enforceInterface(r6)
                java.lang.String r0 = r19.readString()
                r1 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r1 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r1
                r1.b00(r0)
                r20.writeNoException()
                return r4
            L_0x0152:
                r1.enforceInterface(r6)
                java.lang.String r0 = r19.readString()
                int[] r3 = r19.createIntArray()
                int r5 = r19.readInt()
                int r1 = r19.readInt()
                r6 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r6 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r6
                r6.mo68099Kn(r0, r3, r5, r1)
                r20.writeNoException()
                return r4
            L_0x0170:
                r1.enforceInterface(r6)
                r0 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r0 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r0
                boolean r0 = r0.Ms0()
                r20.writeNoException()
                r2.writeInt(r0)
                return r4
            L_0x0182:
                r1.enforceInterface(r6)
                r0 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r0 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r0
                boolean r0 = r0.mo68110Sl()
                r20.writeNoException()
                r2.writeInt(r0)
                return r4
            L_0x0194:
                r1.enforceInterface(r6)
                java.lang.String r0 = r19.readString()
                r1 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r1 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r1
                r1.Dj0(r0)
                r20.writeNoException()
                r2.writeString(r5)
                return r4
            L_0x01a9:
                r1.enforceInterface(r6)
                boolean r0 = eb0.C75592q0.m90763K()
                r20.writeNoException()
                r2.writeInt(r0)
                return r4
            L_0x01b7:
                r1.enforceInterface(r6)
                java.lang.String r0 = r19.readString()
                int r1 = r19.readInt()
                r3 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r3 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r3
                r3.mo68125d6(r0, r1)
                r20.writeNoException()
                return r4
            L_0x01cd:
                r1.enforceInterface(r6)
                int r0 = r19.readInt()
                int r1 = r19.readInt()
                if (r1 == 0) goto L_0x01db
                r8 = 1
            L_0x01db:
                r1 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r1 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r1
                r1.mo68126dA(r0, r8)
                r20.writeNoException()
                return r4
            L_0x01e6:
                r1.enforceInterface(r6)
                int r0 = r19.readInt()
                r1 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r1 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r1
                r1.U30(r0)
                r20.writeNoException()
                return r4
            L_0x01f8:
                r1.enforceInterface(r6)
                int r0 = r19.readInt()
                r1 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r1 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r1
                r1.mo68104Ow(r0)
                r20.writeNoException()
                return r4
            L_0x020a:
                r1.enforceInterface(r6)
                r0 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r0 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r0
                r0.mo68135ha()
                r20.writeNoException()
                return r4
            L_0x0218:
                r1.enforceInterface(r6)
                r0 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r0 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r0
                r0.mo68137jN()
                r20.writeNoException()
                return r4
            L_0x0226:
                r1.enforceInterface(r6)
                r0 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r0 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r0
                int r0 = r0.mo68117Wy()
                r20.writeNoException()
                r2.writeInt(r0)
                return r4
            L_0x0238:
                r1.enforceInterface(r6)
                r0 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r0 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r0
                int r0 = r0.mo68107RT()
                r20.writeNoException()
                r2.writeInt(r0)
                return r4
            L_0x024a:
                r1.enforceInterface(r6)
                r0 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r0 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r0
                java.lang.String r0 = r0.mo68103Oa()
                r20.writeNoException()
                r2.writeString(r0)
                return r4
            L_0x025c:
                r1.enforceInterface(r6)
                r0 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r0 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r0
                java.lang.String r0 = r0.getLanguage()
                r20.writeNoException()
                r2.writeString(r0)
                return r4
            L_0x026e:
                r1.enforceInterface(r6)
                java.lang.String r0 = r19.readString()
                int r1 = r19.readInt()
                r3 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r3 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r3
                java.lang.String r0 = r3.mo68098J8(r0, r1)
                r20.writeNoException()
                r2.writeString(r0)
                return r4
            L_0x0288:
                r1.enforceInterface(r6)
                java.lang.String r0 = r19.readString()
                r1 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r1 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r1
                r1.Th0(r0)
                r20.writeNoException()
                return r4
            L_0x029a:
                r1.enforceInterface(r6)
                r19.readString()
                r19.readString()
                r20.writeNoException()
                r2.writeString(r5)
                return r4
            L_0x02aa:
                r1.enforceInterface(r6)
                r0 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r0 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r0
                java.util.Map r0 = r0.mo68139jx()
                r20.writeNoException()
                r2.writeMap(r0)
                return r4
            L_0x02bc:
                r1.enforceInterface(r6)
                java.lang.String r0 = r19.readString()
                r1 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r1 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r1
                java.lang.String r0 = r1.mf0(r0)
                r20.writeNoException()
                r2.writeString(r0)
                return r4
            L_0x02d2:
                r1.enforceInterface(r6)
                r0 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r0 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r0
                com.tencent.mm.plugin.webview.stub.WebViewStubService r1 = com.tencent.p014mm.plugin.webview.stub.WebViewStubService.this
                java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()
                android.content.SharedPreferences r1 = r1.getSharedPreferences(r3, r8)
                com.tencent.mm.plugin.webview.stub.WebViewStubService r0 = com.tencent.p014mm.plugin.webview.stub.WebViewStubService.this
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.loadApplicationLanguage(r1, r0)
                r20.writeNoException()
                r2.writeString(r0)
                return r4
            L_0x02f0:
                r1.enforceInterface(r6)
                java.lang.String r0 = r19.readString()
                java.lang.String r0 = com.tencent.p014mm.plugin.webview.model.C6038i2.m5918b(r0)
                r20.writeNoException()
                r2.writeString(r0)
                return r4
            L_0x0302:
                r1.enforceInterface(r6)
                r0 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r0 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r0
                java.lang.String r0 = r0.xa0()
                r20.writeNoException()
                r2.writeString(r0)
                return r4
            L_0x0314:
                r1.enforceInterface(r6)
                k40.a r0 = f40.C86709a0.m107533q(r3)
                lc3.b r0 = (lc3.C10485b) r0
                pj.d r0 = r0.g50()
                java.lang.String r1 = "WebViewConfig"
                java.lang.String r3 = "removeJavascriptInterface"
                java.lang.String r0 = r0.mo72508a(r4, r1, r3)
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r1 == 0) goto L_0x0331
                goto L_0x0335
            L_0x0331:
                java.lang.String[] r9 = r0.split(r7)
            L_0x0335:
                r20.writeNoException()
                r2.writeStringArray(r9)
                return r4
            L_0x033c:
                r1.enforceInterface(r6)
                int r0 = r19.readInt()
                r1 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r1 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r1
                r1.mo68124cg(r0)
                r20.writeNoException()
                return r4
            L_0x034e:
                r1.enforceInterface(r6)
                android.os.IBinder r0 = r19.readStrongBinder()
                if (r0 != 0) goto L_0x0358
                goto L_0x036d
            L_0x0358:
                java.lang.String r3 = "com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL"
                android.os.IInterface r3 = r0.queryLocalInterface(r3)
                if (r3 == 0) goto L_0x0368
                boolean r5 = r3 instanceof com.tencent.p014mm.plugin.webview.stub.C6107m
                if (r5 == 0) goto L_0x0368
                r9 = r3
                com.tencent.mm.plugin.webview.stub.m r9 = (com.tencent.p014mm.plugin.webview.stub.C6107m) r9
                goto L_0x036d
            L_0x0368:
                com.tencent.mm.plugin.webview.stub.m$a$a r9 = new com.tencent.mm.plugin.webview.stub.m$a$a
                r9.<init>(r0)
            L_0x036d:
                int r0 = r19.readInt()
                r1 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r1 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r1
                r1.Np0(r9, r0)
                r20.writeNoException()
                return r4
            L_0x037c:
                r1.enforceInterface(r6)
                int r0 = r19.readInt()
                int r3 = r19.readInt()
                int r1 = r19.readInt()
                r5 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r5 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r5
                android.os.Bundle r6 = new android.os.Bundle
                r6.<init>()
                java.lang.String r7 = "proxyui_expired_errtype"
                r6.putInt(r7, r0)
                java.lang.String r0 = "proxyui_expired_errcode"
                r6.putInt(r0, r3)
                com.tencent.mm.plugin.webview.stub.WebViewStubService r0 = com.tencent.p014mm.plugin.webview.stub.WebViewStubService.this
                r3 = 6
                com.tencent.p014mm.plugin.webview.stub.WebViewStubService.m47617a(r0, r3, r6, r1)
                r20.writeNoException()
                return r4
            L_0x03aa:
                r1.enforceInterface(r6)
                java.lang.String r0 = r19.readString()
                r1 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r1 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r1
                java.lang.String r0 = r1.mo68146pa(r0)
                r20.writeNoException()
                r2.writeString(r0)
                return r4
            L_0x03c0:
                r1.enforceInterface(r6)
                java.lang.String r0 = r19.readString()
                java.lang.Class<ym.l> r1 = p763ym.C79138l.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                ym.l r1 = (p763ym.C79138l) r1
                com.tencent.mm.pluginsdk.model.app.j r1 = r1.mo73990GW(r0, r8)
                if (r1 == 0) goto L_0x03ff
                java.lang.String r1 = r1.field_openId
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r1 == 0) goto L_0x03ff
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "initView trigger getappsetting, appId = "
                r1.append(r3)
                r1.append(r0)
                java.lang.String r1 = r1.toString()
                java.lang.String r3 = "MicroMsg.WebViewStubService"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
                com.tencent.mm.autogen.events.GetAppSettingEvent r1 = new com.tencent.mm.autogen.events.GetAppSettingEvent
                r1.<init>()
                com.tencent.mm.autogen.events.GetAppSettingEvent$a r3 = r1.f193638d
                r3.f193639a = r0
                r1.publish()
            L_0x03ff:
                r20.writeNoException()
                return r4
            L_0x0403:
                r1.enforceInterface(r6)
                java.lang.String r0 = r19.readString()
                int r3 = r19.readInt()
                if (r3 == 0) goto L_0x0419
                android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
                java.lang.Object r3 = r3.createFromParcel(r1)
                r9 = r3
                android.os.Bundle r9 = (android.os.Bundle) r9
            L_0x0419:
                int r1 = r19.readInt()
                r3 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r3 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r3
                android.os.Bundle r5 = new android.os.Bundle
                r5.<init>()
                com.tencent.mm.protocal.JsapiPermissionWrapper r6 = new com.tencent.mm.protocal.JsapiPermissionWrapper
                r6.<init>()
                r6.mo69440b(r9)
                java.lang.String r7 = "proxyui_perm_key"
                r5.putParcelable(r7, r6)
                java.lang.String r6 = "proxyui_username_key"
                r5.putString(r6, r0)
                java.lang.String r0 = "webview_binder_id"
                r5.putInt(r0, r1)
                com.tencent.mm.plugin.webview.stub.WebViewStubService r0 = com.tencent.p014mm.plugin.webview.stub.WebViewStubService.this
                r3 = 4
                com.tencent.p014mm.plugin.webview.stub.WebViewStubService.m47617a(r0, r3, r5, r1)
                r20.writeNoException()
                return r4
            L_0x044a:
                r1.enforceInterface(r6)
                java.lang.String r0 = r19.readString()
                java.lang.String r3 = r19.readString()
                int r1 = r19.readInt()
                r5 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r5 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r5
                r5.mo68088Bk(r0, r3, r1)
                r20.writeNoException()
                return r4
            L_0x0464:
                r1.enforceInterface(r6)
                java.lang.String r7 = r19.readString()
                java.lang.String r8 = r19.readString()
                java.lang.String r0 = r19.readString()
                int r3 = r19.readInt()
                if (r3 == 0) goto L_0x0483
                android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
                java.lang.Object r3 = r3.createFromParcel(r1)
                android.os.Bundle r3 = (android.os.Bundle) r3
                r10 = r3
                goto L_0x0484
            L_0x0483:
                r10 = r9
            L_0x0484:
                int r3 = r19.readInt()
                if (r3 == 0) goto L_0x0493
                android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
                java.lang.Object r3 = r3.createFromParcel(r1)
                r9 = r3
                android.os.Bundle r9 = (android.os.Bundle) r9
            L_0x0493:
                r11 = r9
                int r12 = r19.readInt()
                r6 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r6 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r6
                r9 = r0
                boolean r0 = r6.V50(r7, r8, r9, r10, r11, r12)
                r20.writeNoException()
                r2.writeInt(r0)
                return r4
            L_0x04a8:
                r1.enforceInterface(r6)
                int r0 = r19.readInt()
                r1 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r1 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r1
                boolean r0 = r1.mo68152ys(r0)
                r20.writeNoException()
                r2.writeInt(r0)
                return r4
            L_0x04be:
                r1.enforceInterface(r6)
                int r0 = r19.readInt()
                com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C44040v3.m48330a(r0)
                android.os.Bundle r0 = r0.mo7224r6()
                r20.writeNoException()
                if (r0 == 0) goto L_0x04d9
                r2.writeInt(r4)
                r0.writeToParcel(r2, r4)
                goto L_0x04dc
            L_0x04d9:
                r2.writeInt(r8)
            L_0x04dc:
                return r4
            L_0x04dd:
                r1.enforceInterface(r6)
                java.lang.String r0 = r19.readString()
                int r3 = r19.readInt()
                if (r3 == 0) goto L_0x04eb
                r8 = 1
            L_0x04eb:
                int r1 = r19.readInt()
                r3 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r3 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r3
                r3.C70(r0, r8, r1)
                r20.writeNoException()
                return r4
            L_0x04fa:
                r1.enforceInterface(r6)
                int r0 = r19.readInt()
                int r3 = r19.readInt()
                if (r3 == 0) goto L_0x0510
                android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
                java.lang.Object r1 = r3.createFromParcel(r1)
                r9 = r1
                android.os.Bundle r9 = (android.os.Bundle) r9
            L_0x0510:
                r1 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r1 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r1
                android.os.Bundle r0 = r1.mo68134gv(r0, r9)
                r20.writeNoException()
                r2.writeInt(r4)
                r0.writeToParcel(r2, r4)
                return r4
            L_0x0522:
                r1.enforceInterface(r6)
                int r0 = r19.readInt()
                int r3 = r19.readInt()
                if (r3 == 0) goto L_0x0538
                android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
                java.lang.Object r1 = r3.createFromParcel(r1)
                r9 = r1
                android.os.Bundle r9 = (android.os.Bundle) r9
            L_0x0538:
                r1 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r1 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r1
                android.os.Bundle r0 = r1.mo68149vj(r0, r9)
                r20.writeNoException()
                if (r0 == 0) goto L_0x054c
                r2.writeInt(r4)
                r0.writeToParcel(r2, r4)
                goto L_0x054f
            L_0x054c:
                r2.writeInt(r8)
            L_0x054f:
                return r4
            L_0x0550:
                r1.enforceInterface(r6)
                java.lang.String r0 = r19.readString()
                r1 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r1 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r1
                boolean r0 = r1.mo68112U0(r0)
                r20.writeNoException()
                r2.writeInt(r0)
                return r4
            L_0x0566:
                r1.enforceInterface(r6)
                java.lang.String r0 = r19.readString()
                int r1 = r19.readInt()
                if (r1 == 0) goto L_0x0574
                r8 = 1
            L_0x0574:
                r1 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r1 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r1
                r1.mo68143nO(r0, r8)
                r20.writeNoException()
                return r4
            L_0x057f:
                r1.enforceInterface(r6)
                java.lang.String r0 = r19.readString()
                int r1 = r19.readInt()
                r3 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r3 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r3
                r3.mo68096Hz(r0, r1)
                r20.writeNoException()
                return r4
            L_0x0595:
                r1.enforceInterface(r6)
                java.lang.String r0 = r19.readString()
                r1 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r1 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r1
                java.lang.String r0 = r1.mo68144nP(r0)
                r20.writeNoException()
                r2.writeString(r0)
                return r4
            L_0x05ab:
                r1.enforceInterface(r6)
                java.lang.String r0 = r19.readString()
                int r3 = r19.readInt()
                if (r3 == 0) goto L_0x05b9
                r8 = 1
            L_0x05b9:
                int r3 = r19.readInt()
                if (r3 == 0) goto L_0x05c8
                android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
                java.lang.Object r1 = r3.createFromParcel(r1)
                r9 = r1
                android.os.Bundle r9 = (android.os.Bundle) r9
            L_0x05c8:
                r1 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r1 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r1
                boolean r0 = r1.Cb0(r0, r8, r9)
                r20.writeNoException()
                r2.writeInt(r0)
                return r4
            L_0x05d7:
                r1.enforceInterface(r6)
                int r0 = r19.readInt()
                java.util.ArrayList r1 = r19.createStringArrayList()
                r3 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r3 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r3
                r3.mo68129eO(r0, r1)
                r20.writeNoException()
                return r4
            L_0x05ed:
                r1.enforceInterface(r6)
                r0 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r0 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r0
                java.util.List r0 = r0.mo68148uU()
                r20.writeNoException()
                r2.writeStringList(r0)
                return r4
            L_0x05ff:
                r1.enforceInterface(r6)
                boolean r0 = rb0.C47984k.m53331e()
                r20.writeNoException()
                r2.writeInt(r0)
                return r4
            L_0x060d:
                r1.enforceInterface(r6)
                java.lang.String r0 = r19.readString()
                int r3 = r19.readInt()
                int r5 = r19.readInt()
                if (r5 == 0) goto L_0x0627
                android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
                java.lang.Object r1 = r5.createFromParcel(r1)
                r9 = r1
                android.os.Bundle r9 = (android.os.Bundle) r9
            L_0x0627:
                r1 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r1 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r1
                r1.mo68153zr(r0, r3, r9)
                r20.writeNoException()
                return r4
            L_0x0632:
                r1.enforceInterface(r6)
                long r5 = r19.readLong()
                java.lang.String r0 = r19.readString()
                r1 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r1 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r1
                boolean r0 = r1.mo68138jo(r5, r0)
                r20.writeNoException()
                r2.writeInt(r0)
                return r4
            L_0x064c:
                r1.enforceInterface(r6)
                int r0 = r19.readInt()
                int r3 = r19.readInt()
                if (r3 == 0) goto L_0x0662
                android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
                java.lang.Object r1 = r3.createFromParcel(r1)
                r9 = r1
                android.os.Bundle r9 = (android.os.Bundle) r9
            L_0x0662:
                r1 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r1 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r1
                boolean r0 = r1.mo68108RV(r0, r9)
                r20.writeNoException()
                r2.writeInt(r0)
                return r4
            L_0x0671:
                r1.enforceInterface(r6)
                r0 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r0 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r0
                r0.favEditTag()
                r20.writeNoException()
                return r4
            L_0x067f:
                r1.enforceInterface(r6)
                java.lang.String r0 = r19.readString()
                r1 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r1 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r1
                int r0 = r1.mo68120aI(r0)
                r20.writeNoException()
                r2.writeInt(r0)
                return r4
            L_0x0695:
                r1.enforceInterface(r6)
                int r0 = r19.readInt()
                if (r0 == 0) goto L_0x06a7
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r1)
                r9 = r0
                android.os.Bundle r9 = (android.os.Bundle) r9
            L_0x06a7:
                r0 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r0 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r0
                boolean r0 = r0.mo68127dE(r9)
                r20.writeNoException()
                r2.writeInt(r0)
                return r4
            L_0x06b6:
                r1.enforceInterface(r6)
                int r0 = r19.readInt()
                if (r0 == 0) goto L_0x06c8
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r1)
                r9 = r0
                android.os.Bundle r9 = (android.os.Bundle) r9
            L_0x06c8:
                r0 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r0 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r0
                com.tencent.mm.plugin.webview.stub.c r0 = r0.mo68119aG(r9)
                r20.writeNoException()
                com.tencent.mm.plugin.webview.stub.c$a r0 = (com.tencent.p014mm.plugin.webview.stub.C43784c.C43785a) r0
                r2.writeStrongBinder(r0)
                return r4
            L_0x06d9:
                r1.enforceInterface(r6)
                int r0 = r19.readInt()
                int r3 = r19.readInt()
                if (r3 == 0) goto L_0x06ef
                android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
                java.lang.Object r3 = r3.createFromParcel(r1)
                r9 = r3
                android.os.Bundle r9 = (android.os.Bundle) r9
            L_0x06ef:
                int r1 = r19.readInt()
                r3 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r3 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r3
                r3.mo68145pG(r0, r9, r1)
                r20.writeNoException()
                return r4
            L_0x06fe:
                r1.enforceInterface(r6)
                int r0 = r19.readInt()
                java.lang.String r1 = r19.readString()
                f40.o r3 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r3 = r3.mo121142i()
                java.lang.Object r0 = r3.mo119684e(r0, r9)
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r1)
                r20.writeNoException()
                r2.writeString(r0)
                return r4
            L_0x0722:
                r1.enforceInterface(r6)
                int r0 = r19.readInt()
                int r1 = r19.readInt()
                r3 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r3 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r3
                r3.Yu0(r0, r1)
                r20.writeNoException()
                return r4
            L_0x0738:
                r1.enforceInterface(r6)
                int r0 = r19.readInt()
                int r1 = r19.readInt()
                r3 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r3 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r3
                int r0 = r3.Wn0(r0, r1)
                r20.writeNoException()
                r2.writeInt(r0)
                return r4
            L_0x0752:
                r1.enforceInterface(r6)
                boolean r0 = eb0.C75592q0.m90790t()
                r20.writeNoException()
                r2.writeInt(r0)
                return r4
            L_0x0760:
                r1.enforceInterface(r6)
                boolean r0 = f40.C86709a0.m107522a()
                r20.writeNoException()
                r2.writeInt(r0)
                return r4
            L_0x076e:
                r1.enforceInterface(r6)
                r0 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r0 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r0
                boolean r0 = r0.isSDCardAvailable()
                r20.writeNoException()
                r2.writeInt(r0)
                return r4
            L_0x0780:
                r1.enforceInterface(r6)
                boolean r0 = p206nj.C88955f.m111058b()
                r20.writeNoException()
                r2.writeInt(r0)
                return r4
            L_0x078e:
                r1.enforceInterface(r6)
                java.lang.String r0 = r19.readString()
                r1 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r1 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r1
                java.lang.String r0 = r1.mo68142mr(r0)
                r20.writeNoException()
                r2.writeString(r0)
                return r4
            L_0x07a4:
                r1.enforceInterface(r6)
                java.lang.String r0 = r19.readString()
                r1 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r1 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r1
                boolean r0 = r1.mo68095Gm(r0)
                r20.writeNoException()
                r2.writeInt(r0)
                return r4
            L_0x07ba:
                r1.enforceInterface(r6)
                java.lang.String r0 = r19.readString()
                boolean r0 = eb0.C45628s0.m50812z(r0)
                r20.writeNoException()
                r2.writeInt(r0)
                return r4
            L_0x07cc:
                r1.enforceInterface(r6)
                java.lang.String r0 = r19.readString()
                boolean r0 = eb0.C45628s0.m50740E(r0)
                r20.writeNoException()
                r2.writeInt(r0)
                return r4
            L_0x07de:
                r1.enforceInterface(r6)
                java.lang.String r0 = r19.readString()
                r1 = r17
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a r1 = (com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a) r1
                java.lang.String r0 = r1.getDisplayName(r0)
                r20.writeNoException()
                r2.writeString(r0)
                return r4
            L_0x07f4:
                r1.enforceInterface(r6)
                java.lang.String r0 = r19.readString()
                ke3.C88144b.m109788f(r0)
                r20.writeNoException()
                r2.writeInt(r4)
                return r4
            L_0x0805:
                r2.writeString(r6)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.stub.C43791l.C43792a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: Bk */
    void mo68088Bk(String str, String str2, int i);

    boolean Bq0(String str);

    void C70(String str, boolean z, int i);

    boolean Cb0(String str, boolean z, Bundle bundle);

    void Cl0(int i, String str, String str2, String str3, int i2, int i3, Bundle bundle);

    String Dj0(String str);

    /* renamed from: Fu */
    boolean mo68094Fu();

    /* renamed from: Gm */
    boolean mo68095Gm(String str);

    /* renamed from: Hz */
    void mo68096Hz(String str, int i);

    boolean Ie0(String str);

    /* renamed from: J8 */
    String mo68098J8(String str, int i);

    /* renamed from: Kn */
    void mo68099Kn(String str, int[] iArr, int i, int i2);

    void Md0(Bundle bundle, int i);

    boolean Ms0();

    void Np0(C6107m mVar, int i);

    /* renamed from: Oa */
    String mo68103Oa();

    /* renamed from: Ow */
    void mo68104Ow(int i);

    void Q20(int i, Bundle bundle);

    /* renamed from: RN */
    boolean mo68106RN();

    /* renamed from: RT */
    int mo68107RT();

    /* renamed from: RV */
    boolean mo68108RV(int i, Bundle bundle);

    /* renamed from: Sk */
    void mo68109Sk(int i, String str, String str2);

    /* renamed from: Sl */
    boolean mo68110Sl();

    void Th0(String str);

    /* renamed from: U0 */
    boolean mo68112U0(String str);

    void U30(int i);

    /* renamed from: V5 */
    Bundle mo68114V5(int i, Bundle bundle);

    boolean V50(String str, String str2, String str3, Bundle bundle, Bundle bundle2, int i);

    int Wn0(int i, int i2);

    /* renamed from: Wy */
    int mo68117Wy();

    void Yu0(int i, int i2);

    /* renamed from: aG */
    C43784c mo68119aG(Bundle bundle);

    /* renamed from: aI */
    int mo68120aI(String str);

    void b00(String str);

    /* renamed from: cU */
    String mo68123cU(String str);

    /* renamed from: cg */
    void mo68124cg(int i);

    /* renamed from: d6 */
    void mo68125d6(String str, int i);

    /* renamed from: dA */
    void mo68126dA(int i, boolean z);

    /* renamed from: dE */
    boolean mo68127dE(Bundle bundle);

    /* renamed from: eO */
    void mo68129eO(int i, List<String> list);

    void favEditTag();

    String getDisplayName(String str);

    String getLanguage();

    boolean gg0(String str);

    /* renamed from: gv */
    Bundle mo68134gv(int i, Bundle bundle);

    /* renamed from: ha */
    void mo68135ha();

    boolean isSDCardAvailable();

    /* renamed from: jN */
    void mo68137jN();

    /* renamed from: jo */
    boolean mo68138jo(long j, String str);

    /* renamed from: jx */
    Map mo68139jx();

    void kk0(Intent intent);

    String mf0(String str);

    /* renamed from: mr */
    String mo68142mr(String str);

    /* renamed from: nO */
    void mo68143nO(String str, boolean z);

    /* renamed from: nP */
    String mo68144nP(String str);

    /* renamed from: pG */
    void mo68145pG(int i, Bundle bundle, int i2);

    /* renamed from: pa */
    String mo68146pa(String str);

    List<String> tf0();

    /* renamed from: uU */
    List<String> mo68148uU();

    /* renamed from: vj */
    Bundle mo68149vj(int i, Bundle bundle);

    String xa0();

    /* renamed from: xs */
    int mo68151xs();

    /* renamed from: ys */
    boolean mo68152ys(int i);

    /* renamed from: zr */
    void mo68153zr(String str, int i, Bundle bundle);
}
