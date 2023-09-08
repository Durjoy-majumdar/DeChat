package com.tencent.p014mm.network;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.p014mm.network.C26879f;
import com.tencent.p014mm.network.C81040l;
import ee0.C31566b;
import java.util.List;
import qe3.C89619a1;

/* renamed from: com.tencent.mm.network.h */
public interface C26882h extends IInterface {

    /* renamed from: com.tencent.mm.network.h$a */
    public static abstract class C26883a extends Binder implements C26882h {

        /* renamed from: d */
        public static final /* synthetic */ int f74763d = 0;

        /* renamed from: com.tencent.mm.network.h$a$a */
        public static class C26884a implements C26882h {

            /* renamed from: d */
            public IBinder f74764d;

            public C26884a(IBinder iBinder) {
                this.f74764d = iBinder;
            }

            /* renamed from: A3 */
            public C26879f mo54136A3() {
                C26879f fVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    if (!this.f74764d.transact(3, obtain, obtain2, 0)) {
                        int i = C26883a.f74763d;
                    }
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    int i2 = C26879f.C26880a.f74761d;
                    if (readStrongBinder == null) {
                        fVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.tencent.mm.network.IAccInfo_AIDL");
                        fVar = (queryLocalInterface == null || !(queryLocalInterface instanceof C26879f)) ? new C26879f.C26880a.C26881a(readStrongBinder) : (C26879f) queryLocalInterface;
                    }
                    return fVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: B3 */
            public void mo54137B3(long j, long j2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    if (!this.f74764d.transact(29, obtain, obtain2, 0)) {
                        int i = C26883a.f74763d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: D5 */
            public void mo54138D5() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    if (!this.f74764d.transact(39, obtain, obtain2, 0)) {
                        int i = C26883a.f74763d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: E5 */
            public String[] mo54139E5(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeInt(z ? 1 : 0);
                    if (!this.f74764d.transact(7, obtain, obtain2, 0)) {
                        int i = C26883a.f74763d;
                    }
                    obtain2.readException();
                    return obtain2.createStringArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: F3 */
            public String[] mo54140F3() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    if (!this.f74764d.transact(47, obtain, obtain2, 0)) {
                        int i = C26883a.f74763d;
                    }
                    obtain2.readException();
                    return obtain2.createStringArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: H0 */
            public long mo54141H0() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    if (!this.f74764d.transact(56, obtain, obtain2, 0)) {
                        int i = C26883a.f74763d;
                    }
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: H1 */
            public void mo54142H1(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeString(str);
                    if (!this.f74764d.transact(41, obtain, obtain2, 0)) {
                        int i = C26883a.f74763d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: I4 */
            public void mo54143I4() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    if (!this.f74764d.transact(25, obtain, obtain2, 0)) {
                        int i = C26883a.f74763d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: J3 */
            public void mo54144J3(C31566b bVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    if (!this.f74764d.transact(14, obtain, obtain2, 0)) {
                        int i = C26883a.f74763d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: J4 */
            public void mo54145J4(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeInt(z ? 1 : 0);
                    if (!this.f74764d.transact(42, obtain, obtain2, 0)) {
                        int i = C26883a.f74763d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: O0 */
            public int mo54146O0(String str, int i, int i2, int i3, int i4, byte[] bArr, byte[] bArr2, C40384w wVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    obtain.writeByteArray(bArr);
                    obtain.writeByteArray(bArr2);
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    if (!this.f74764d.transact(55, obtain, obtain2, 0)) {
                        int i5 = C26883a.f74763d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: O4 */
            public void mo54147O4(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeString(str);
                    if (!this.f74764d.transact(53, obtain, obtain2, 0)) {
                        int i = C26883a.f74763d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Q */
            public void mo54148Q() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    if (!this.f74764d.transact(30, obtain, obtain2, 0)) {
                        int i = C26883a.f74763d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Q2 */
            public void mo54149Q2(C114778k kVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeStrongBinder(kVar != null ? kVar.asBinder() : null);
                    if (!this.f74764d.transact(40, obtain, obtain2, 0)) {
                        int i = C26883a.f74763d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Q4 */
            public String mo54150Q4() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    if (!this.f74764d.transact(27, obtain, obtain2, 0)) {
                        int i = C26883a.f74763d;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: S1 */
            public int mo54151S1(int[] iArr, boolean z, long j, int i, int i2, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeIntArray(iArr);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeLong(j);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    if (!this.f74764d.transact(24, obtain, obtain2, 0)) {
                        int i3 = C26883a.f74763d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: S4 */
            public String mo54152S4() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    if (!this.f74764d.transact(8, obtain, obtain2, 0)) {
                        int i = C26883a.f74763d;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: T0 */
            public void mo54153T0(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeInt(z ? 1 : 0);
                    if (!this.f74764d.transact(9, obtain, obtain2, 0)) {
                        int i = C26883a.f74763d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: T2 */
            public void mo54154T2(C40377j jVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeStrongBinder(jVar != null ? jVar.asBinder() : null);
                    if (!this.f74764d.transact(57, obtain, obtain2, 0)) {
                        int i = C26883a.f74763d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: T4 */
            public int mo54155T4(String str, boolean z, List<String> list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    if (!this.f74764d.transact(19, obtain, obtain2, 0)) {
                        int i = C26883a.f74763d;
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.readStringList(list);
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: U2 */
            public void mo54156U2(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeInt(i);
                    if (!this.f74764d.transact(2, obtain, obtain2, 0)) {
                        int i2 = C26883a.f74763d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Y5 */
            public void mo54157Y5(String str, String str2, String str3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (!this.f74764d.transact(52, obtain, obtain2, 0)) {
                        int i = C26883a.f74763d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a4 */
            public int mo54158a4(C114800v vVar, C114789o oVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    IBinder iBinder = null;
                    obtain.writeStrongBinder(vVar != null ? vVar.asBinder() : null);
                    if (oVar != null) {
                        iBinder = oVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.f74764d.transact(1, obtain, obtain2, 0)) {
                        int i = C26883a.f74763d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f74764d;
            }

            /* renamed from: b3 */
            public void mo54159b3(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeInt(z ? 1 : 0);
                    if (!this.f74764d.transact(38, obtain, obtain2, 0)) {
                        int i = C26883a.f74763d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c4 */
            public void mo54160c4() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    if (!this.f74764d.transact(48, obtain, obtain2, 0)) {
                        int i = C26883a.f74763d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d4 */
            public void mo54161d4(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeInt(z ? 1 : 0);
                    if (!this.f74764d.transact(44, obtain, obtain2, 0)) {
                        int i = C26883a.f74763d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e4 */
            public void mo54162e4(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeInt(z ? 1 : 0);
                    if (!this.f74764d.transact(43, obtain, obtain2, 0)) {
                        int i = C26883a.f74763d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e5 */
            public void mo54163e5(String[] strArr, String[] strArr2, int[] iArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeStringArray(strArr);
                    obtain.writeStringArray(strArr2);
                    obtain.writeIntArray(iArr);
                    if (!this.f74764d.transact(22, obtain, obtain2, 0)) {
                        int i = C26883a.f74763d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f0 */
            public void mo54164f0(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeString(str);
                    if (!this.f74764d.transact(15, obtain, obtain2, 0)) {
                        int i = C26883a.f74763d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g0 */
            public void mo54165g0(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeString(str);
                    if (!this.f74764d.transact(20, obtain, obtain2, 0)) {
                        int i = C26883a.f74763d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g5 */
            public int mo54166g5(String str, long j, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeString(str);
                    obtain.writeLong(j);
                    obtain.writeInt(i);
                    if (!this.f74764d.transact(54, obtain, obtain2, 0)) {
                        int i2 = C26883a.f74763d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: h1 */
            public boolean mo54167h1() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    boolean z = false;
                    if (!this.f74764d.transact(13, obtain, obtain2, 0)) {
                        int i = C26883a.f74763d;
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

            public void hi0(C81044x xVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeStrongBinder(xVar != null ? xVar.asBinder() : null);
                    if (!this.f74764d.transact(33, obtain, obtain2, 0)) {
                        int i = C26883a.f74763d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: i2 */
            public void mo54169i2(C114773i iVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeStrongBinder(iVar != null ? iVar.asBinder() : null);
                    if (!this.f74764d.transact(34, obtain, obtain2, 0)) {
                        int i = C26883a.f74763d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: i5 */
            public String[] mo54170i5(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeString(str);
                    if (!this.f74764d.transact(50, obtain, obtain2, 0)) {
                        int i = C26883a.f74763d;
                    }
                    obtain2.readException();
                    return obtain2.createStringArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: j0 */
            public void mo54171j0(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeInt(z ? 1 : 0);
                    if (!this.f74764d.transact(36, obtain, obtain2, 0)) {
                        int i = C26883a.f74763d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: j3 */
            public void mo54172j3(String str, String str2, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    if (!this.f74764d.transact(59, obtain, obtain2, 0)) {
                        int i2 = C26883a.f74763d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: k1 */
            public void mo54173k1(String[] strArr, String[] strArr2, int[] iArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeStringArray(strArr);
                    obtain.writeStringArray(strArr2);
                    obtain.writeIntArray(iArr);
                    if (!this.f74764d.transact(21, obtain, obtain2, 0)) {
                        int i = C26883a.f74763d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: l3 */
            public void mo54174l3(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeInt(z ? 1 : 0);
                    if (!this.f74764d.transact(37, obtain, obtain2, 0)) {
                        int i = C26883a.f74763d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: n1 */
            public void mo54175n1(boolean z, String str, String str2, int[] iArr, int[] iArr2, int i, int i2, String str3, String str4) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeIntArray(iArr);
                    obtain.writeIntArray(iArr2);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    if (!this.f74764d.transact(6, obtain, obtain2, 0)) {
                        int i3 = C26883a.f74763d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: n3 */
            public void mo54176n3(C89619a1 a1Var) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeStrongBinder(a1Var != null ? a1Var.asBinder() : null);
                    if (!this.f74764d.transact(5, obtain, obtain2, 0)) {
                        int i = C26883a.f74763d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: n4 */
            public void mo54177n4(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeInt(i);
                    if (!this.f74764d.transact(51, obtain, obtain2, 0)) {
                        int i2 = C26883a.f74763d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: o4 */
            public int mo54178o4() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    if (!this.f74764d.transact(49, obtain, obtain2, 0)) {
                        int i = C26883a.f74763d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: q */
            public void mo54179q() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    if (!this.f74764d.transact(31, obtain, obtain2, 0)) {
                        int i = C26883a.f74763d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: r3 */
            public void mo54180r3() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    if (!this.f74764d.transact(26, obtain, obtain2, 0)) {
                        int i = C26883a.f74763d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void reset() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    if (!this.f74764d.transact(4, obtain, obtain2, 0)) {
                        int i = C26883a.f74763d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: s5 */
            public void mo54182s5(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeString(str);
                    if (!this.f74764d.transact(45, obtain, obtain2, 0)) {
                        int i = C26883a.f74763d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: t0 */
            public void mo54183t0(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeString(str);
                    if (!this.f74764d.transact(35, obtain, obtain2, 0)) {
                        int i = C26883a.f74763d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: v5 */
            public int mo54184v5(String str, int i, long j, String str2, String str3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (!this.f74764d.transact(23, obtain, obtain2, 0)) {
                        int i2 = C26883a.f74763d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: w3 */
            public int mo54185w3(String str, List<String> list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeString(str);
                    if (!this.f74764d.transact(17, obtain, obtain2, 0)) {
                        int i = C26883a.f74763d;
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.readStringList(list);
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C81040l yu0() {
                C81040l lVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    if (!this.f74764d.transact(16, obtain, obtain2, 0)) {
                        int i = C26883a.f74763d;
                    }
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    int i2 = C81040l.C81041a.f238064d;
                    if (readStrongBinder == null) {
                        lVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.tencent.mm.network.INetworkEvent_AIDL");
                        lVar = (queryLocalInterface == null || !(queryLocalInterface instanceof C81040l)) ? new C81040l.C81041a.C81042a(readStrongBinder) : (C81040l) queryLocalInterface;
                    }
                    return lVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C26883a() {
            attachInterface(this, "com.tencent.mm.network.IDispatcher_AIDL");
        }

        /* renamed from: a */
        public static C26882h m35718a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.mm.network.IDispatcher_AIDL");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C26882h)) ? new C26884a(iBinder) : (C26882h) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX WARNING: type inference failed for: r6v0 */
        /* JADX WARNING: type inference failed for: r6v1, types: [com.tencent.mm.network.o] */
        /* JADX WARNING: type inference failed for: r6v5, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r6v6 */
        /* JADX WARNING: type inference failed for: r6v7, types: [qe3.a1] */
        /* JADX WARNING: type inference failed for: r6v15, types: [ee0.b] */
        /* JADX WARNING: type inference failed for: r6v19, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r6v20 */
        /* JADX WARNING: type inference failed for: r6v26, types: [com.tencent.mm.network.s] */
        /* JADX WARNING: type inference failed for: r6v30, types: [com.tencent.mm.network.x] */
        /* JADX WARNING: type inference failed for: r6v34, types: [com.tencent.mm.network.i] */
        /* JADX WARNING: type inference failed for: r6v38, types: [com.tencent.mm.network.k] */
        /* JADX WARNING: type inference failed for: r6v46 */
        /* JADX WARNING: type inference failed for: r6v48, types: [com.tencent.mm.network.j] */
        /* JADX WARNING: type inference failed for: r6v52, types: [com.tencent.mm.network.j] */
        /* JADX WARNING: type inference failed for: r6v56 */
        /* JADX WARNING: type inference failed for: r6v57 */
        /* JADX WARNING: type inference failed for: r6v58 */
        /* JADX WARNING: type inference failed for: r6v59 */
        /* JADX WARNING: type inference failed for: r6v60 */
        /* JADX WARNING: type inference failed for: r6v61 */
        /* JADX WARNING: type inference failed for: r6v62 */
        /* JADX WARNING: type inference failed for: r6v63 */
        /* JADX WARNING: type inference failed for: r6v64 */
        /* JADX WARNING: type inference failed for: r6v65 */
        /* JADX WARNING: type inference failed for: r6v66 */
        /* JADX WARNING: type inference failed for: r6v67 */
        /* JADX WARNING: type inference failed for: r6v68 */
        /* JADX WARNING: type inference failed for: r6v69 */
        /* JADX WARNING: type inference failed for: r6v70 */
        /* JADX WARNING: type inference failed for: r6v71 */
        /* JADX WARNING: type inference failed for: r6v72 */
        /* JADX WARNING: type inference failed for: r6v73 */
        /* JADX WARNING: type inference failed for: r6v74 */
        /* JADX WARNING: type inference failed for: r6v75 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r17, android.os.Parcel r18, android.os.Parcel r19, int r20) {
            /*
                r16 = this;
                r0 = r17
                r1 = r18
                r2 = r19
                java.lang.String r3 = "com.tencent.mm.network.IDispatcher_AIDL"
                r4 = 1
                r5 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r0 == r5) goto L_0x0627
                r5 = 0
                r6 = 0
                switch(r0) {
                    case 1: goto L_0x05f1;
                    case 2: goto L_0x05df;
                    case 3: goto L_0x05cc;
                    case 4: goto L_0x05be;
                    case 5: goto L_0x0594;
                    case 6: goto L_0x055d;
                    case 7: goto L_0x0548;
                    case 8: goto L_0x053a;
                    case 9: goto L_0x0525;
                    case 10: goto L_0x0507;
                    case 11: goto L_0x04f1;
                    case 12: goto L_0x04e3;
                    case 13: goto L_0x04d1;
                    case 14: goto L_0x04a7;
                    case 15: goto L_0x0495;
                    case 16: goto L_0x0484;
                    case 17: goto L_0x046a;
                    case 18: goto L_0x044d;
                    case 19: goto L_0x042c;
                    case 20: goto L_0x041e;
                    case 21: goto L_0x0404;
                    case 22: goto L_0x03ea;
                    case 23: goto L_0x03c4;
                    case 24: goto L_0x0395;
                    case 25: goto L_0x038b;
                    case 26: goto L_0x0381;
                    case 27: goto L_0x0373;
                    case 28: goto L_0x02ec;
                    case 29: goto L_0x02da;
                    case 30: goto L_0x02d0;
                    case 31: goto L_0x02c6;
                    case 32: goto L_0x029b;
                    case 33: goto L_0x0272;
                    case 34: goto L_0x0249;
                    case 35: goto L_0x0237;
                    case 36: goto L_0x0222;
                    case 37: goto L_0x020d;
                    case 38: goto L_0x01f8;
                    case 39: goto L_0x01ee;
                    case 40: goto L_0x01c5;
                    case 41: goto L_0x01b8;
                    case 42: goto L_0x01a7;
                    case 43: goto L_0x0196;
                    case 44: goto L_0x0185;
                    case 45: goto L_0x0177;
                    case 46: goto L_0x0161;
                    case 47: goto L_0x014f;
                    case 48: goto L_0x0145;
                    case 49: goto L_0x0137;
                    case 50: goto L_0x0121;
                    case 51: goto L_0x0113;
                    case 52: goto L_0x00fd;
                    case 53: goto L_0x00eb;
                    case 54: goto L_0x00d1;
                    case 55: goto L_0x0088;
                    case 56: goto L_0x007a;
                    case 57: goto L_0x0054;
                    case 58: goto L_0x002e;
                    case 59: goto L_0x0018;
                    default: goto L_0x0013;
                }
            L_0x0013:
                boolean r0 = super.onTransact(r17, r18, r19, r20)
                return r0
            L_0x0018:
                r1.enforceInterface(r3)
                java.lang.String r0 = r18.readString()
                java.lang.String r3 = r18.readString()
                int r1 = r18.readInt()
                com.tencent.mars.p468mm.MMLogic.setCgiDebugIP(r0, r3, r1)
                r19.writeNoException()
                return r4
            L_0x002e:
                r1.enforceInterface(r3)
                android.os.IBinder r0 = r18.readStrongBinder()
                if (r0 != 0) goto L_0x0038
                goto L_0x004d
            L_0x0038:
                java.lang.String r1 = "com.tencent.mm.network.IMMNetCommonCallback_AIDL"
                android.os.IInterface r1 = r0.queryLocalInterface(r1)
                if (r1 == 0) goto L_0x0048
                boolean r3 = r1 instanceof com.tencent.p014mm.network.C40377j
                if (r3 == 0) goto L_0x0048
                r6 = r1
                com.tencent.mm.network.j r6 = (com.tencent.p014mm.network.C40377j) r6
                goto L_0x004d
            L_0x0048:
                com.tencent.mm.network.j$a$a r6 = new com.tencent.mm.network.j$a$a
                r6.<init>(r0)
            L_0x004d:
                com.tencent.mars.p468mm.MMLogic.removeMMNetCommonCallback(r6)
                r19.writeNoException()
                return r4
            L_0x0054:
                r1.enforceInterface(r3)
                android.os.IBinder r0 = r18.readStrongBinder()
                if (r0 != 0) goto L_0x005e
                goto L_0x0073
            L_0x005e:
                java.lang.String r1 = "com.tencent.mm.network.IMMNetCommonCallback_AIDL"
                android.os.IInterface r1 = r0.queryLocalInterface(r1)
                if (r1 == 0) goto L_0x006e
                boolean r3 = r1 instanceof com.tencent.p014mm.network.C40377j
                if (r3 == 0) goto L_0x006e
                r6 = r1
                com.tencent.mm.network.j r6 = (com.tencent.p014mm.network.C40377j) r6
                goto L_0x0073
            L_0x006e:
                com.tencent.mm.network.j$a$a r6 = new com.tencent.mm.network.j$a$a
                r6.<init>(r0)
            L_0x0073:
                com.tencent.mars.p468mm.MMLogic.addMMNetCommonCallback(r6)
                r19.writeNoException()
                return r4
            L_0x007a:
                r1.enforceInterface(r3)
                long r0 = com.tencent.mars.p468mm.MMLogic.getMarsTimestamp()
                r19.writeNoException()
                r2.writeLong(r0)
                return r4
            L_0x0088:
                r1.enforceInterface(r3)
                java.lang.String r5 = r18.readString()
                int r0 = r18.readInt()
                int r7 = r18.readInt()
                int r8 = r18.readInt()
                int r9 = r18.readInt()
                byte[] r10 = r18.createByteArray()
                byte[] r11 = r18.createByteArray()
                android.os.IBinder r1 = r18.readStrongBinder()
                if (r1 != 0) goto L_0x00af
            L_0x00ad:
                r12 = r6
                goto L_0x00c5
            L_0x00af:
                java.lang.String r3 = "com.tencent.mm.network.ISpeedTestCallback_AIDL"
                android.os.IInterface r3 = r1.queryLocalInterface(r3)
                if (r3 == 0) goto L_0x00bf
                boolean r6 = r3 instanceof com.tencent.p014mm.network.C40384w
                if (r6 == 0) goto L_0x00bf
                r6 = r3
                com.tencent.mm.network.w r6 = (com.tencent.p014mm.network.C40384w) r6
                goto L_0x00ad
            L_0x00bf:
                com.tencent.mm.network.w$a$a r6 = new com.tencent.mm.network.w$a$a
                r6.<init>(r1)
                goto L_0x00ad
            L_0x00c5:
                r6 = r0
                int r0 = com.tencent.mars.p468mm.MMLogic.doLiveSpeedTest(r5, r6, r7, r8, r9, r10, r11, r12)
                r19.writeNoException()
                r2.writeInt(r0)
                return r4
            L_0x00d1:
                r1.enforceInterface(r3)
                java.lang.String r0 = r18.readString()
                long r5 = r18.readLong()
                int r1 = r18.readInt()
                int r0 = com.tencent.mars.p468mm.MMLogic.ackActionNotify(r0, r5, r1)
                r19.writeNoException()
                r2.writeInt(r0)
                return r4
            L_0x00eb:
                r1.enforceInterface(r3)
                java.lang.String r0 = r18.readString()
                r1 = r16
                com.tencent.mm.network.y r1 = (com.tencent.p014mm.network.C114803y) r1
                r1.mo54147O4(r0)
                r19.writeNoException()
                return r4
            L_0x00fd:
                r1.enforceInterface(r3)
                java.lang.String r0 = r18.readString()
                java.lang.String r3 = r18.readString()
                java.lang.String r1 = r18.readString()
                com.tencent.mars.p468mm.MMLogic.setNetIdAndIsp(r0, r3, r1)
                r19.writeNoException()
                return r4
            L_0x0113:
                r1.enforceInterface(r3)
                int r0 = r18.readInt()
                com.tencent.mars.p468mm.MMLogic.setMMtlsRegion(r0)
                r19.writeNoException()
                return r4
            L_0x0121:
                r1.enforceInterface(r3)
                java.lang.String r0 = r18.readString()
                r1 = r16
                com.tencent.mm.network.y r1 = (com.tencent.p014mm.network.C114803y) r1
                java.lang.String[] r0 = r1.mo54170i5(r0)
                r19.writeNoException()
                r2.writeStringArray(r0)
                return r4
            L_0x0137:
                r1.enforceInterface(r3)
                int r0 = com.tencent.mars.p468mm.MMLogic.getMMtlsRegion()
                r19.writeNoException()
                r2.writeInt(r0)
                return r4
            L_0x0145:
                r1.enforceInterface(r3)
                com.tencent.mars.p468mm.MMLogic.clearMMtlsForbidenHostAndPsk()
                r19.writeNoException()
                return r4
            L_0x014f:
                r1.enforceInterface(r3)
                r0 = r16
                com.tencent.mm.network.y r0 = (com.tencent.p014mm.network.C114803y) r0
                java.lang.String[] r0 = r0.mo54140F3()
                r19.writeNoException()
                r2.writeStringArray(r0)
                return r4
            L_0x0161:
                r1.enforceInterface(r3)
                java.lang.String r0 = r18.readString()
                java.lang.String r1 = r18.readString()
                r3 = r16
                com.tencent.mm.network.y r3 = (com.tencent.p014mm.network.C114803y) r3
                r3.mo174499r(r0, r1)
                r19.writeNoException()
                return r4
            L_0x0177:
                r1.enforceInterface(r3)
                java.lang.String r0 = r18.readString()
                com.tencent.mars.p468mm.MMLogic.setDebugHost(r0)
                r19.writeNoException()
                return r4
            L_0x0185:
                r1.enforceInterface(r3)
                int r0 = r18.readInt()
                if (r0 == 0) goto L_0x018f
                r5 = 1
            L_0x018f:
                com.tencent.mars.p468mm.MMLogic.switchProcessActiveState(r5)
                r19.writeNoException()
                return r4
            L_0x0196:
                r1.enforceInterface(r3)
                int r0 = r18.readInt()
                if (r0 == 0) goto L_0x01a0
                r5 = 1
            L_0x01a0:
                com.tencent.mars.p468mm.MMLogic.forceUseV6(r5)
                r19.writeNoException()
                return r4
            L_0x01a7:
                r1.enforceInterface(r3)
                int r0 = r18.readInt()
                if (r0 == 0) goto L_0x01b1
                r5 = 1
            L_0x01b1:
                com.tencent.mars.p468mm.MMLogic.reportV6Status(r5)
                r19.writeNoException()
                return r4
            L_0x01b8:
                r1.enforceInterface(r3)
                java.lang.String r0 = r18.readString()
                com.tencent.p014mm.network.C114803y.f344200A = r0
                r19.writeNoException()
                return r4
            L_0x01c5:
                r1.enforceInterface(r3)
                android.os.IBinder r0 = r18.readStrongBinder()
                if (r0 != 0) goto L_0x01cf
                goto L_0x01e4
            L_0x01cf:
                java.lang.String r1 = "com.tencent.mm.network.INetworkDiagnoseCallback_AIDL"
                android.os.IInterface r1 = r0.queryLocalInterface(r1)
                if (r1 == 0) goto L_0x01df
                boolean r3 = r1 instanceof com.tencent.p014mm.network.C114778k
                if (r3 == 0) goto L_0x01df
                r6 = r1
                com.tencent.mm.network.k r6 = (com.tencent.p014mm.network.C114778k) r6
                goto L_0x01e4
            L_0x01df:
                com.tencent.mm.network.k$a$a r6 = new com.tencent.mm.network.k$a$a
                r6.<init>(r0)
            L_0x01e4:
                r0 = r16
                com.tencent.mm.network.y r0 = (com.tencent.p014mm.network.C114803y) r0
                r0.f344219y = r6
                r19.writeNoException()
                return r4
            L_0x01ee:
                r1.enforceInterface(r3)
                com.tencent.mars.stn.StnLogic.startNetworkAnalysis()
                r19.writeNoException()
                return r4
            L_0x01f8:
                r1.enforceInterface(r3)
                int r0 = r18.readInt()
                if (r0 == 0) goto L_0x0202
                r5 = 1
            L_0x0202:
                r0 = r16
                com.tencent.mm.network.y r0 = (com.tencent.p014mm.network.C114803y) r0
                r0.mo54159b3(r5)
                r19.writeNoException()
                return r4
            L_0x020d:
                r1.enforceInterface(r3)
                int r0 = r18.readInt()
                if (r0 == 0) goto L_0x0217
                r5 = 1
            L_0x0217:
                r0 = r16
                com.tencent.mm.network.y r0 = (com.tencent.p014mm.network.C114803y) r0
                r0.mo54174l3(r5)
                r19.writeNoException()
                return r4
            L_0x0222:
                r1.enforceInterface(r3)
                int r0 = r18.readInt()
                if (r0 == 0) goto L_0x022c
                r5 = 1
            L_0x022c:
                r0 = r16
                com.tencent.mm.network.y r0 = (com.tencent.p014mm.network.C114803y) r0
                r0.mo54171j0(r5)
                r19.writeNoException()
                return r4
            L_0x0237:
                r1.enforceInterface(r3)
                java.lang.String r0 = r18.readString()
                r1 = r16
                com.tencent.mm.network.y r1 = (com.tencent.p014mm.network.C114803y) r1
                r1.mo54183t0(r0)
                r19.writeNoException()
                return r4
            L_0x0249:
                r1.enforceInterface(r3)
                android.os.IBinder r0 = r18.readStrongBinder()
                if (r0 != 0) goto L_0x0253
                goto L_0x0268
            L_0x0253:
                java.lang.String r1 = "com.tencent.mm.network.IIpxxCallback_AIDL"
                android.os.IInterface r1 = r0.queryLocalInterface(r1)
                if (r1 == 0) goto L_0x0263
                boolean r3 = r1 instanceof com.tencent.p014mm.network.C114773i
                if (r3 == 0) goto L_0x0263
                r6 = r1
                com.tencent.mm.network.i r6 = (com.tencent.p014mm.network.C114773i) r6
                goto L_0x0268
            L_0x0263:
                com.tencent.mm.network.i$a$a r6 = new com.tencent.mm.network.i$a$a
                r6.<init>(r0)
            L_0x0268:
                r0 = r16
                com.tencent.mm.network.y r0 = (com.tencent.p014mm.network.C114803y) r0
                r0.f344217w = r6
                r19.writeNoException()
                return r4
            L_0x0272:
                r1.enforceInterface(r3)
                android.os.IBinder r0 = r18.readStrongBinder()
                if (r0 != 0) goto L_0x027c
                goto L_0x0291
            L_0x027c:
                java.lang.String r1 = "com.tencent.mm.network.IWorkerCallback_AIDL"
                android.os.IInterface r1 = r0.queryLocalInterface(r1)
                if (r1 == 0) goto L_0x028c
                boolean r3 = r1 instanceof com.tencent.p014mm.network.C81044x
                if (r3 == 0) goto L_0x028c
                r6 = r1
                com.tencent.mm.network.x r6 = (com.tencent.p014mm.network.C81044x) r6
                goto L_0x0291
            L_0x028c:
                com.tencent.mm.network.x$a$a r6 = new com.tencent.mm.network.x$a$a
                r6.<init>(r0)
            L_0x0291:
                r0 = r16
                com.tencent.mm.network.y r0 = (com.tencent.p014mm.network.C114803y) r0
                r0.f344216v = r6
                r19.writeNoException()
                return r4
            L_0x029b:
                r1.enforceInterface(r3)
                android.os.IBinder r0 = r18.readStrongBinder()
                if (r0 != 0) goto L_0x02a5
                goto L_0x02ba
            L_0x02a5:
                java.lang.String r1 = "com.tencent.mm.network.IOnReportKV_AIDL"
                android.os.IInterface r1 = r0.queryLocalInterface(r1)
                if (r1 == 0) goto L_0x02b5
                boolean r3 = r1 instanceof com.tencent.p014mm.network.C114797s
                if (r3 == 0) goto L_0x02b5
                r6 = r1
                com.tencent.mm.network.s r6 = (com.tencent.p014mm.network.C114797s) r6
                goto L_0x02ba
            L_0x02b5:
                com.tencent.mm.network.r r6 = new com.tencent.mm.network.r
                r6.<init>(r0)
            L_0x02ba:
                com.tencent.mm.network.l0 r0 = com.tencent.p014mm.network.C114781l0.m161562i()
                com.tencent.mm.network.f0 r0 = r0.f344170i
                r0.f344144a = r6
                r19.writeNoException()
                return r4
            L_0x02c6:
                r1.enforceInterface(r3)
                com.tencent.mars.stn.StnLogic.stopSignalling()
                r19.writeNoException()
                return r4
            L_0x02d0:
                r1.enforceInterface(r3)
                com.tencent.mars.stn.StnLogic.keepSignalling()
                r19.writeNoException()
                return r4
            L_0x02da:
                r1.enforceInterface(r3)
                long r5 = r18.readLong()
                long r0 = r18.readLong()
                com.tencent.mars.stn.StnLogic.setSignallingStrategy(r5, r0)
                r19.writeNoException()
                return r4
            L_0x02ec:
                r1.enforceInterface(r3)
                int r0 = r18.readInt()
                byte[] r1 = r18.createByteArray()
                java.lang.Class<com.tencent.mm.network.q0> r3 = com.tencent.p014mm.network.C114793q0.class
                monitor-enter(r3)
                com.tencent.mm.network.q0 r6 = com.tencent.p014mm.network.C114793q0.f344182b     // Catch:{ all -> 0x0370 }
                if (r6 != 0) goto L_0x0305
                com.tencent.mm.network.q0 r6 = new com.tencent.mm.network.q0     // Catch:{ all -> 0x0370 }
                r6.<init>()     // Catch:{ all -> 0x0370 }
                com.tencent.p014mm.network.C114793q0.f344182b = r6     // Catch:{ all -> 0x0370 }
            L_0x0305:
                com.tencent.mm.network.q0 r6 = com.tencent.p014mm.network.C114793q0.f344182b     // Catch:{ all -> 0x0370 }
                monitor-exit(r3)
                monitor-enter(r6)
                java.util.HashMap<java.lang.Integer, com.tencent.mm.network.q0$a> r3 = r6.f344183a     // Catch:{ all -> 0x036d }
                java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x036d }
                java.lang.Object r3 = r3.get(r7)     // Catch:{ all -> 0x036d }
                com.tencent.mm.network.q0$a r3 = (com.tencent.p014mm.network.C114793q0.C114794a) r3     // Catch:{ all -> 0x036d }
                java.lang.String r7 = "MicroMsg.PostPushEventHandler"
                java.lang.String r8 = "postEvent event:%s cb:%s data:%s [%s]"
                r9 = 4
                java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ all -> 0x036d }
                java.lang.Integer r11 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x036d }
                r10[r5] = r11     // Catch:{ all -> 0x036d }
                r10[r4] = r3     // Catch:{ all -> 0x036d }
                r11 = -1
                if (r1 != 0) goto L_0x0329
                r12 = -1
                goto L_0x032a
            L_0x0329:
                int r12 = r1.length     // Catch:{ all -> 0x036d }
            L_0x032a:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x036d }
                r13 = 2
                r10[r13] = r12     // Catch:{ all -> 0x036d }
                com.tencent.mm.sdk.platformtools.MMStack r12 = com.tencent.p014mm.sdk.platformtools.Util.getStack()     // Catch:{ all -> 0x036d }
                r14 = 3
                r10[r14] = r12     // Catch:{ all -> 0x036d }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r10)     // Catch:{ all -> 0x036d }
                if (r3 != 0) goto L_0x0361
                java.lang.String r7 = "MicroMsg.PostPushEventHandler"
                java.lang.String r8 = "postEvent cb == null  event:%s cb:%s data:%s [%s]"
                java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ all -> 0x036d }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x036d }
                r9[r5] = r0     // Catch:{ all -> 0x036d }
                r9[r4] = r3     // Catch:{ all -> 0x036d }
                if (r1 != 0) goto L_0x034e
                goto L_0x034f
            L_0x034e:
                int r11 = r1.length     // Catch:{ all -> 0x036d }
            L_0x034f:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x036d }
                r9[r13] = r0     // Catch:{ all -> 0x036d }
                com.tencent.mm.sdk.platformtools.MMStack r0 = com.tencent.p014mm.sdk.platformtools.Util.getStack()     // Catch:{ all -> 0x036d }
                r9[r14] = r0     // Catch:{ all -> 0x036d }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r8, r9)     // Catch:{ all -> 0x036d }
                r0 = -3
                monitor-exit(r6)
                goto L_0x0366
            L_0x0361:
                int r0 = r3.mo174448a(r0, r1)     // Catch:{ all -> 0x036d }
                monitor-exit(r6)
            L_0x0366:
                r19.writeNoException()
                r2.writeInt(r0)
                return r4
            L_0x036d:
                r0 = move-exception
                monitor-exit(r6)
                throw r0
            L_0x0370:
                r0 = move-exception
                monitor-exit(r3)
                throw r0
            L_0x0373:
                r1.enforceInterface(r3)
                java.lang.String r0 = com.tencent.mars.p468mm.MMLogic.getIspId()
                r19.writeNoException()
                r2.writeString(r0)
                return r4
            L_0x0381:
                r1.enforceInterface(r3)
                com.tencent.mars.stn.StnLogic.makesureLongLinkConnected()
                r19.writeNoException()
                return r4
            L_0x038b:
                r1.enforceInterface(r3)
                com.tencent.p014mm.sdk.platformtools.Log.appenderFlush()
                r19.writeNoException()
                return r4
            L_0x0395:
                r1.enforceInterface(r3)
                int[] r6 = r18.createIntArray()
                int r0 = r18.readInt()
                if (r0 == 0) goto L_0x03a4
                r7 = 1
                goto L_0x03a5
            L_0x03a4:
                r7 = 0
            L_0x03a5:
                long r8 = r18.readLong()
                int r10 = r18.readInt()
                int r11 = r18.readInt()
                java.lang.String r12 = r18.readString()
                r5 = r16
                com.tencent.mm.network.y r5 = (com.tencent.p014mm.network.C114803y) r5
                int r0 = r5.mo54151S1(r6, r7, r8, r10, r11, r12)
                r19.writeNoException()
                r2.writeInt(r0)
                return r4
            L_0x03c4:
                r1.enforceInterface(r3)
                java.lang.String r6 = r18.readString()
                int r7 = r18.readInt()
                long r8 = r18.readLong()
                java.lang.String r10 = r18.readString()
                java.lang.String r11 = r18.readString()
                r5 = r16
                com.tencent.mm.network.y r5 = (com.tencent.p014mm.network.C114803y) r5
                int r0 = r5.mo54184v5(r6, r7, r8, r10, r11)
                r19.writeNoException()
                r2.writeInt(r0)
                return r4
            L_0x03ea:
                r1.enforceInterface(r3)
                java.lang.String[] r0 = r18.createStringArray()
                java.lang.String[] r3 = r18.createStringArray()
                int[] r1 = r18.createIntArray()
                r5 = r16
                com.tencent.mm.network.y r5 = (com.tencent.p014mm.network.C114803y) r5
                r5.mo54163e5(r0, r3, r1)
                r19.writeNoException()
                return r4
            L_0x0404:
                r1.enforceInterface(r3)
                java.lang.String[] r0 = r18.createStringArray()
                java.lang.String[] r3 = r18.createStringArray()
                int[] r1 = r18.createIntArray()
                r5 = r16
                com.tencent.mm.network.y r5 = (com.tencent.p014mm.network.C114803y) r5
                r5.mo54173k1(r0, r3, r1)
                r19.writeNoException()
                return r4
            L_0x041e:
                r1.enforceInterface(r3)
                java.lang.String r0 = r18.readString()
                com.tencent.mars.p468mm.MMLogic.reportFailIp(r0)
                r19.writeNoException()
                return r4
            L_0x042c:
                r1.enforceInterface(r3)
                java.lang.String r0 = r18.readString()
                int r1 = r18.readInt()
                if (r1 == 0) goto L_0x043a
                r5 = 1
            L_0x043a:
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                int r0 = com.tencent.mars.p468mm.MMLogic.getSnsIpsForSceneWithHostName(r1, r0, r5)
                r19.writeNoException()
                r2.writeInt(r0)
                r2.writeStringList(r1)
                return r4
            L_0x044d:
                r1.enforceInterface(r3)
                int r0 = r18.readInt()
                if (r0 == 0) goto L_0x0457
                r5 = 1
            L_0x0457:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                int r1 = com.tencent.mars.p468mm.MMLogic.getSnsIpsForScene(r0, r5)
                r19.writeNoException()
                r2.writeInt(r1)
                r2.writeStringList(r0)
                return r4
            L_0x046a:
                r1.enforceInterface(r3)
                java.lang.String r0 = r18.readString()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                int r0 = com.tencent.mars.p468mm.MMLogic.getHostByName(r0, r1)
                r19.writeNoException()
                r2.writeInt(r0)
                r2.writeStringList(r1)
                return r4
            L_0x0484:
                r1.enforceInterface(r3)
                com.tencent.mm.network.n0 r0 = com.tencent.p014mm.network.C114781l0.m161560g()
                r19.writeNoException()
                if (r0 == 0) goto L_0x0491
                r6 = r0
            L_0x0491:
                r2.writeStrongBinder(r6)
                return r4
            L_0x0495:
                r1.enforceInterface(r3)
                java.lang.String r0 = r18.readString()
                r1 = r16
                com.tencent.mm.network.y r1 = (com.tencent.p014mm.network.C114803y) r1
                r1.mo54164f0(r0)
                r19.writeNoException()
                return r4
            L_0x04a7:
                r1.enforceInterface(r3)
                android.os.IBinder r0 = r18.readStrongBinder()
                if (r0 != 0) goto L_0x04b1
                goto L_0x04c6
            L_0x04b1:
                java.lang.String r1 = "com.tencent.mm.network.connpool.IConnPoolMoniter_AIDL"
                android.os.IInterface r1 = r0.queryLocalInterface(r1)
                if (r1 == 0) goto L_0x04c1
                boolean r3 = r1 instanceof ee0.C31566b
                if (r3 == 0) goto L_0x04c1
                r6 = r1
                ee0.b r6 = (ee0.C31566b) r6
                goto L_0x04c6
            L_0x04c1:
                ee0.b$a$a r6 = new ee0.b$a$a
                r6.<init>(r0)
            L_0x04c6:
                r0 = r16
                com.tencent.mm.network.y r0 = (com.tencent.p014mm.network.C114803y) r0
                r0.mo54144J3(r6)
                r19.writeNoException()
                return r4
            L_0x04d1:
                r1.enforceInterface(r3)
                r0 = r16
                com.tencent.mm.network.y r0 = (com.tencent.p014mm.network.C114803y) r0
                boolean r0 = r0.mo54167h1()
                r19.writeNoException()
                r2.writeInt(r0)
                return r4
            L_0x04e3:
                r1.enforceInterface(r3)
                r0 = r16
                com.tencent.mm.network.y r0 = (com.tencent.p014mm.network.C114803y) r0
                r0.mo174493j()
                r19.writeNoException()
                return r4
            L_0x04f1:
                r1.enforceInterface(r3)
                java.lang.String r0 = r18.readString()
                java.lang.String r1 = r18.readString()
                r3 = r16
                com.tencent.mm.network.y r3 = (com.tencent.p014mm.network.C114803y) r3
                r3.mo174504w(r0, r1)
                r19.writeNoException()
                return r4
            L_0x0507:
                r1.enforceInterface(r3)
                java.lang.String r0 = r18.readString()
                java.lang.String r3 = r18.readString()
                java.lang.String r5 = r18.readString()
                java.lang.String r1 = r18.readString()
                r6 = r16
                com.tencent.mm.network.y r6 = (com.tencent.p014mm.network.C114803y) r6
                r6.mo174502u(r0, r3, r5, r1)
                r19.writeNoException()
                return r4
            L_0x0525:
                r1.enforceInterface(r3)
                int r0 = r18.readInt()
                if (r0 == 0) goto L_0x052f
                r5 = 1
            L_0x052f:
                r0 = r16
                com.tencent.mm.network.y r0 = (com.tencent.p014mm.network.C114803y) r0
                r0.mo54153T0(r5)
                r19.writeNoException()
                return r4
            L_0x053a:
                r1.enforceInterface(r3)
                java.lang.String r0 = com.tencent.mars.p468mm.MMLogic.getNetworkServerIp()
                r19.writeNoException()
                r2.writeString(r0)
                return r4
            L_0x0548:
                r1.enforceInterface(r3)
                int r0 = r18.readInt()
                if (r0 == 0) goto L_0x0552
                r5 = 1
            L_0x0552:
                java.lang.String[] r0 = com.tencent.mars.p468mm.MMLogic.getIPsString(r5)
                r19.writeNoException()
                r2.writeStringArray(r0)
                return r4
            L_0x055d:
                r1.enforceInterface(r3)
                int r0 = r18.readInt()
                if (r0 == 0) goto L_0x0568
                r7 = 1
                goto L_0x0569
            L_0x0568:
                r7 = 0
            L_0x0569:
                java.lang.String r8 = r18.readString()
                java.lang.String r9 = r18.readString()
                int[] r10 = r18.createIntArray()
                int[] r11 = r18.createIntArray()
                int r12 = r18.readInt()
                int r13 = r18.readInt()
                java.lang.String r14 = r18.readString()
                java.lang.String r15 = r18.readString()
                r6 = r16
                com.tencent.mm.network.y r6 = (com.tencent.p014mm.network.C114803y) r6
                r6.mo54175n1(r7, r8, r9, r10, r11, r12, r13, r14, r15)
                r19.writeNoException()
                return r4
            L_0x0594:
                r1.enforceInterface(r3)
                android.os.IBinder r0 = r18.readStrongBinder()
                if (r0 != 0) goto L_0x059e
                goto L_0x05b3
            L_0x059e:
                java.lang.String r1 = "com.tencent.mm.protocal.MMSyncCheckCoder_AIDL"
                android.os.IInterface r1 = r0.queryLocalInterface(r1)
                if (r1 == 0) goto L_0x05ae
                boolean r3 = r1 instanceof qe3.C89619a1
                if (r3 == 0) goto L_0x05ae
                r6 = r1
                qe3.a1 r6 = (qe3.C89619a1) r6
                goto L_0x05b3
            L_0x05ae:
                qe3.a1$a$a r6 = new qe3.a1$a$a
                r6.<init>(r0)
            L_0x05b3:
                r0 = r16
                com.tencent.mm.network.y r0 = (com.tencent.p014mm.network.C114803y) r0
                r0.mo54176n3(r6)
                r19.writeNoException()
                return r4
            L_0x05be:
                r1.enforceInterface(r3)
                r0 = r16
                com.tencent.mm.network.y r0 = (com.tencent.p014mm.network.C114803y) r0
                r0.reset()
                r19.writeNoException()
                return r4
            L_0x05cc:
                r1.enforceInterface(r3)
                r0 = r16
                com.tencent.mm.network.y r0 = (com.tencent.p014mm.network.C114803y) r0
                com.tencent.mm.network.a r0 = r0.f344208n
                r19.writeNoException()
                if (r0 == 0) goto L_0x05db
                r6 = r0
            L_0x05db:
                r2.writeStrongBinder(r6)
                return r4
            L_0x05df:
                r1.enforceInterface(r3)
                int r0 = r18.readInt()
                r1 = r16
                com.tencent.mm.network.y r1 = (com.tencent.p014mm.network.C114803y) r1
                r1.mo54156U2(r0)
                r19.writeNoException()
                return r4
            L_0x05f1:
                r1.enforceInterface(r3)
                android.os.IBinder r0 = r18.readStrongBinder()
                com.tencent.mm.network.v r0 = com.tencent.p014mm.network.C114800v.C114801a.m161583a(r0)
                android.os.IBinder r1 = r18.readStrongBinder()
                if (r1 != 0) goto L_0x0603
                goto L_0x0618
            L_0x0603:
                java.lang.String r3 = "com.tencent.mm.network.IOnGYNetEnd_AIDL"
                android.os.IInterface r3 = r1.queryLocalInterface(r3)
                if (r3 == 0) goto L_0x0613
                boolean r5 = r3 instanceof com.tencent.p014mm.network.C114789o
                if (r5 == 0) goto L_0x0613
                r6 = r3
                com.tencent.mm.network.o r6 = (com.tencent.p014mm.network.C114789o) r6
                goto L_0x0618
            L_0x0613:
                com.tencent.mm.network.o$a$a r6 = new com.tencent.mm.network.o$a$a
                r6.<init>(r1)
            L_0x0618:
                r1 = r16
                com.tencent.mm.network.y r1 = (com.tencent.p014mm.network.C114803y) r1
                int r0 = r1.mo54158a4(r0, r6)
                r19.writeNoException()
                r2.writeInt(r0)
                return r4
            L_0x0627:
                r2.writeString(r3)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.network.C26882h.C26883a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: A3 */
    C26879f mo54136A3();

    /* renamed from: B3 */
    void mo54137B3(long j, long j2);

    /* renamed from: D5 */
    void mo54138D5();

    /* renamed from: E5 */
    String[] mo54139E5(boolean z);

    /* renamed from: F3 */
    String[] mo54140F3();

    /* renamed from: H0 */
    long mo54141H0();

    /* renamed from: H1 */
    void mo54142H1(String str);

    /* renamed from: I4 */
    void mo54143I4();

    /* renamed from: J3 */
    void mo54144J3(C31566b bVar);

    /* renamed from: J4 */
    void mo54145J4(boolean z);

    /* renamed from: O0 */
    int mo54146O0(String str, int i, int i2, int i3, int i4, byte[] bArr, byte[] bArr2, C40384w wVar);

    /* renamed from: O4 */
    void mo54147O4(String str);

    /* renamed from: Q */
    void mo54148Q();

    /* renamed from: Q2 */
    void mo54149Q2(C114778k kVar);

    /* renamed from: Q4 */
    String mo54150Q4();

    /* renamed from: S1 */
    int mo54151S1(int[] iArr, boolean z, long j, int i, int i2, String str);

    /* renamed from: S4 */
    String mo54152S4();

    /* renamed from: T0 */
    void mo54153T0(boolean z);

    /* renamed from: T2 */
    void mo54154T2(C40377j jVar);

    /* renamed from: T4 */
    int mo54155T4(String str, boolean z, List<String> list);

    /* renamed from: U2 */
    void mo54156U2(int i);

    /* renamed from: Y5 */
    void mo54157Y5(String str, String str2, String str3);

    /* renamed from: a4 */
    int mo54158a4(C114800v vVar, C114789o oVar);

    /* renamed from: b3 */
    void mo54159b3(boolean z);

    /* renamed from: c4 */
    void mo54160c4();

    /* renamed from: d4 */
    void mo54161d4(boolean z);

    /* renamed from: e4 */
    void mo54162e4(boolean z);

    /* renamed from: e5 */
    void mo54163e5(String[] strArr, String[] strArr2, int[] iArr);

    /* renamed from: f0 */
    void mo54164f0(String str);

    /* renamed from: g0 */
    void mo54165g0(String str);

    /* renamed from: g5 */
    int mo54166g5(String str, long j, int i);

    /* renamed from: h1 */
    boolean mo54167h1();

    void hi0(C81044x xVar);

    /* renamed from: i2 */
    void mo54169i2(C114773i iVar);

    /* renamed from: i5 */
    String[] mo54170i5(String str);

    /* renamed from: j0 */
    void mo54171j0(boolean z);

    /* renamed from: j3 */
    void mo54172j3(String str, String str2, int i);

    /* renamed from: k1 */
    void mo54173k1(String[] strArr, String[] strArr2, int[] iArr);

    /* renamed from: l3 */
    void mo54174l3(boolean z);

    /* renamed from: n1 */
    void mo54175n1(boolean z, String str, String str2, int[] iArr, int[] iArr2, int i, int i2, String str3, String str4);

    /* renamed from: n3 */
    void mo54176n3(C89619a1 a1Var);

    /* renamed from: n4 */
    void mo54177n4(int i);

    /* renamed from: o4 */
    int mo54178o4();

    /* renamed from: q */
    void mo54179q();

    /* renamed from: r3 */
    void mo54180r3();

    void reset();

    /* renamed from: s5 */
    void mo54182s5(String str);

    /* renamed from: t0 */
    void mo54183t0(String str);

    /* renamed from: v5 */
    int mo54184v5(String str, int i, long j, String str2, String str3);

    /* renamed from: w3 */
    int mo54185w3(String str, List<String> list);

    C81040l yu0();
}
