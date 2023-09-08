package com.tencent.p014mm.network;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import qe3.C118180j;
import qe3.C118181k;

/* renamed from: com.tencent.mm.network.v */
public interface C114800v extends IInterface {

    /* renamed from: com.tencent.mm.network.v$a */
    public static abstract class C114801a extends Binder implements C114800v {

        /* renamed from: d */
        public static final /* synthetic */ int f344198d = 0;

        /* renamed from: com.tencent.mm.network.v$a$a */
        public static class C114802a implements C114800v {

            /* renamed from: d */
            public IBinder f344199d;

            public C114802a(IBinder iBinder) {
                this.f344199d = iBinder;
            }

            /* renamed from: FG */
            public void mo174463FG(C114783m mVar, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
                    obtain.writeStrongBinder(mVar != null ? mVar.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (!this.f344199d.transact(5, obtain, obtain2, 0)) {
                        int i3 = C114801a.f344198d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: YQ */
            public void mo174464YQ(C114783m mVar, int i, int i2, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
                    obtain.writeStrongBinder(mVar != null ? mVar.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    if (!this.f344199d.transact(10, obtain, obtain2, 0)) {
                        int i3 = C114801a.f344198d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f344199d;
            }

            public boolean getIsLongPolling() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
                    boolean z = false;
                    if (!this.f344199d.transact(16, obtain, obtain2, 0)) {
                        int i = C114801a.f344198d;
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

            public boolean getIsUserCmd() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
                    boolean z = false;
                    if (!this.f344199d.transact(7, obtain, obtain2, 0)) {
                        int i = C114801a.f344198d;
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

            public int getLongPollingTimeout() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
                    if (!this.f344199d.transact(18, obtain, obtain2, 0)) {
                        int i = C114801a.f344198d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int getNewExtFlags() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
                    if (!this.f344199d.transact(19, obtain, obtain2, 0)) {
                        int i = C114801a.f344198d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int getOptions() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
                    if (!this.f344199d.transact(8, obtain, obtain2, 0)) {
                        int i = C114801a.f344198d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C118180j getReqObj() {
                C118180j jVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
                    if (!this.f344199d.transact(4, obtain, obtain2, 0)) {
                        int i = C114801a.f344198d;
                    }
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    int i2 = C118180j.C101128a.f296023d;
                    if (readStrongBinder == null) {
                        jVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
                        jVar = (queryLocalInterface == null || !(queryLocalInterface instanceof C118180j)) ? new C118180j.C101128a.C101129a(readStrongBinder) : (C118180j) queryLocalInterface;
                    }
                    return jVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C118181k getRespObj() {
                C118181k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
                    if (!this.f344199d.transact(3, obtain, obtain2, 0)) {
                        int i = C114801a.f344198d;
                    }
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    int i2 = C118181k.C118182a.f353303d;
                    if (readStrongBinder == null) {
                        kVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
                        kVar = (queryLocalInterface == null || !(queryLocalInterface instanceof C118181k)) ? new C118181k.C118182a.C118183a(readStrongBinder) : (C118181k) queryLocalInterface;
                    }
                    return kVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int getTimeOut() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
                    if (!this.f344199d.transact(13, obtain, obtain2, 0)) {
                        int i = C114801a.f344198d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public byte[] getTransHeader() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
                    if (!this.f344199d.transact(20, obtain, obtain2, 0)) {
                        int i = C114801a.f344198d;
                    }
                    obtain2.readException();
                    return obtain2.createByteArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int getType() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
                    if (!this.f344199d.transact(1, obtain, obtain2, 0)) {
                        int i = C114801a.f344198d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getUri() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
                    if (!this.f344199d.transact(2, obtain, obtain2, 0)) {
                        int i = C114801a.f344198d;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String h30() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
                    if (!this.f344199d.transact(22, obtain, obtain2, 0)) {
                        int i = C114801a.f344198d;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean isSingleSession() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
                    boolean z = false;
                    if (!this.f344199d.transact(14, obtain, obtain2, 0)) {
                        int i = C114801a.f344198d;
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

            /* renamed from: kD */
            public void mo174478kD(C26879f fVar, C114783m mVar, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
                    IBinder iBinder = null;
                    obtain.writeStrongBinder(fVar != null ? fVar.asBinder() : null);
                    if (mVar != null) {
                        iBinder = mVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (!this.f344199d.transact(11, obtain, obtain2, 0)) {
                        int i3 = C114801a.f344198d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: o8 */
            public int mo174479o8() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
                    if (!this.f344199d.transact(6, obtain, obtain2, 0)) {
                        int i = C114801a.f344198d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String pr0() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
                    if (!this.f344199d.transact(21, obtain, obtain2, 0)) {
                        int i = C114801a.f344198d;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setEncryptAlgo(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
                    obtain.writeInt(i);
                    if (!this.f344199d.transact(23, obtain, obtain2, 0)) {
                        int i2 = C114801a.f344198d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setReqHost(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
                    obtain.writeString(str);
                    if (!this.f344199d.transact(25, obtain, obtain2, 0)) {
                        int i = C114801a.f344198d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setSingleSession(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
                    obtain.writeInt(z ? 1 : 0);
                    if (!this.f344199d.transact(15, obtain, obtain2, 0)) {
                        int i = C114801a.f344198d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: uw */
            public boolean mo174484uw() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
                    boolean z = false;
                    if (!this.f344199d.transact(17, obtain, obtain2, 0)) {
                        int i = C114801a.f344198d;
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

            /* renamed from: zy */
            public int mo174485zy() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
                    if (!this.f344199d.transact(12, obtain, obtain2, 0)) {
                        int i = C114801a.f344198d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C114801a() {
            attachInterface(this, "com.tencent.mm.network.IReqResp_AIDL");
        }

        /* renamed from: a */
        public static C114800v m161583a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.mm.network.IReqResp_AIDL");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C114800v)) ? new C114802a(iBinder) : (C114800v) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX WARNING: type inference failed for: r1v1 */
        /* JADX WARNING: type inference failed for: r1v2, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r1v5, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r1v11, types: [com.tencent.mm.network.f] */
        /* JADX WARNING: type inference failed for: r1v16 */
        /* JADX WARNING: type inference failed for: r1v17 */
        /* JADX WARNING: type inference failed for: r1v18 */
        /* JADX WARNING: type inference failed for: r1v19 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
            /*
                r3 = this;
                r0 = 1
                r1 = 1598968902(0x5f4e5446, float:1.4867585E19)
                java.lang.String r2 = "com.tencent.mm.network.IReqResp_AIDL"
                if (r4 == r1) goto L_0x0220
                r1 = 0
                switch(r4) {
                    case 1: goto L_0x020f;
                    case 2: goto L_0x01fe;
                    case 3: goto L_0x01ea;
                    case 4: goto L_0x01d6;
                    case 5: goto L_0x01b9;
                    case 6: goto L_0x01a8;
                    case 7: goto L_0x0197;
                    case 8: goto L_0x0186;
                    case 9: goto L_0x0173;
                    case 10: goto L_0x0152;
                    case 11: goto L_0x0119;
                    case 12: goto L_0x0108;
                    case 13: goto L_0x00f7;
                    case 14: goto L_0x00e6;
                    case 15: goto L_0x00d0;
                    case 16: goto L_0x00bf;
                    case 17: goto L_0x00ae;
                    case 18: goto L_0x009d;
                    case 19: goto L_0x008c;
                    case 20: goto L_0x007b;
                    case 21: goto L_0x006a;
                    case 22: goto L_0x0059;
                    case 23: goto L_0x0048;
                    case 24: goto L_0x0035;
                    case 25: goto L_0x0024;
                    case 26: goto L_0x0011;
                    default: goto L_0x000c;
                }
            L_0x000c:
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L_0x0011:
                r5.enforceInterface(r2)
                r4 = r3
                ob0.j0 r4 = (ob0.C117739j0) r4
                com.tencent.mm.network.u r4 = r4.f352092e
                java.lang.String r4 = r4.getReqHost()
                r6.writeNoException()
                r6.writeString(r4)
                return r0
            L_0x0024:
                r5.enforceInterface(r2)
                java.lang.String r4 = r5.readString()
                r5 = r3
                ob0.j0 r5 = (ob0.C117739j0) r5
                r5.setReqHost(r4)
                r6.writeNoException()
                return r0
            L_0x0035:
                r5.enforceInterface(r2)
                r4 = r3
                ob0.j0 r4 = (ob0.C117739j0) r4
                com.tencent.mm.network.u r4 = r4.f352092e
                int r4 = r4.getEncryptAlgo()
                r6.writeNoException()
                r6.writeInt(r4)
                return r0
            L_0x0048:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                r5 = r3
                ob0.j0 r5 = (ob0.C117739j0) r5
                r5.setEncryptAlgo(r4)
                r6.writeNoException()
                return r0
            L_0x0059:
                r5.enforceInterface(r2)
                r4 = r3
                ob0.j0 r4 = (ob0.C117739j0) r4
                java.lang.String r4 = r4.h30()
                r6.writeNoException()
                r6.writeString(r4)
                return r0
            L_0x006a:
                r5.enforceInterface(r2)
                r4 = r3
                ob0.j0 r4 = (ob0.C117739j0) r4
                java.lang.String r4 = r4.pr0()
                r6.writeNoException()
                r6.writeString(r4)
                return r0
            L_0x007b:
                r5.enforceInterface(r2)
                r4 = r3
                ob0.j0 r4 = (ob0.C117739j0) r4
                byte[] r4 = r4.getTransHeader()
                r6.writeNoException()
                r6.writeByteArray(r4)
                return r0
            L_0x008c:
                r5.enforceInterface(r2)
                r4 = r3
                ob0.j0 r4 = (ob0.C117739j0) r4
                int r4 = r4.getNewExtFlags()
                r6.writeNoException()
                r6.writeInt(r4)
                return r0
            L_0x009d:
                r5.enforceInterface(r2)
                r4 = r3
                ob0.j0 r4 = (ob0.C117739j0) r4
                int r4 = r4.getLongPollingTimeout()
                r6.writeNoException()
                r6.writeInt(r4)
                return r0
            L_0x00ae:
                r5.enforceInterface(r2)
                r4 = r3
                ob0.j0 r4 = (ob0.C117739j0) r4
                boolean r4 = r4.mo174484uw()
                r6.writeNoException()
                r6.writeInt(r4)
                return r0
            L_0x00bf:
                r5.enforceInterface(r2)
                r4 = r3
                ob0.j0 r4 = (ob0.C117739j0) r4
                boolean r4 = r4.getIsLongPolling()
                r6.writeNoException()
                r6.writeInt(r4)
                return r0
            L_0x00d0:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x00db
                r4 = 1
                goto L_0x00dc
            L_0x00db:
                r4 = 0
            L_0x00dc:
                r5 = r3
                ob0.j0 r5 = (ob0.C117739j0) r5
                r5.setSingleSession(r4)
                r6.writeNoException()
                return r0
            L_0x00e6:
                r5.enforceInterface(r2)
                r4 = r3
                ob0.j0 r4 = (ob0.C117739j0) r4
                boolean r4 = r4.isSingleSession()
                r6.writeNoException()
                r6.writeInt(r4)
                return r0
            L_0x00f7:
                r5.enforceInterface(r2)
                r4 = r3
                ob0.j0 r4 = (ob0.C117739j0) r4
                int r4 = r4.getTimeOut()
                r6.writeNoException()
                r6.writeInt(r4)
                return r0
            L_0x0108:
                r5.enforceInterface(r2)
                r4 = r3
                ob0.j0 r4 = (ob0.C117739j0) r4
                int r4 = r4.mo174485zy()
                r6.writeNoException()
                r6.writeInt(r4)
                return r0
            L_0x0119:
                r5.enforceInterface(r2)
                android.os.IBinder r4 = r5.readStrongBinder()
                if (r4 != 0) goto L_0x0123
                goto L_0x0138
            L_0x0123:
                java.lang.String r7 = "com.tencent.mm.network.IAccInfo_AIDL"
                android.os.IInterface r7 = r4.queryLocalInterface(r7)
                if (r7 == 0) goto L_0x0133
                boolean r1 = r7 instanceof com.tencent.p014mm.network.C26879f
                if (r1 == 0) goto L_0x0133
                r1 = r7
                com.tencent.mm.network.f r1 = (com.tencent.p014mm.network.C26879f) r1
                goto L_0x0138
            L_0x0133:
                com.tencent.mm.network.f$a$a r1 = new com.tencent.mm.network.f$a$a
                r1.<init>(r4)
            L_0x0138:
                android.os.IBinder r4 = r5.readStrongBinder()
                com.tencent.mm.network.m r4 = com.tencent.p014mm.network.C114783m.C114784a.m161566a(r4)
                int r7 = r5.readInt()
                int r5 = r5.readInt()
                r2 = r3
                ob0.j0 r2 = (ob0.C117739j0) r2
                r2.mo174478kD(r1, r4, r7, r5)
                r6.writeNoException()
                return r0
            L_0x0152:
                r5.enforceInterface(r2)
                android.os.IBinder r4 = r5.readStrongBinder()
                com.tencent.mm.network.m r4 = com.tencent.p014mm.network.C114783m.C114784a.m161566a(r4)
                int r7 = r5.readInt()
                int r1 = r5.readInt()
                java.lang.String r5 = r5.readString()
                r2 = r3
                ob0.j0 r2 = (ob0.C117739j0) r2
                r2.mo174464YQ(r4, r7, r1, r5)
                r6.writeNoException()
                return r0
            L_0x0173:
                r5.enforceInterface(r2)
                java.lang.String r4 = r5.readString()
                r5 = r3
                ob0.j0 r5 = (ob0.C117739j0) r5
                com.tencent.mm.network.u r5 = r5.f352092e
                r5.setConnectionInfo(r4)
                r6.writeNoException()
                return r0
            L_0x0186:
                r5.enforceInterface(r2)
                r4 = r3
                ob0.j0 r4 = (ob0.C117739j0) r4
                int r4 = r4.getOptions()
                r6.writeNoException()
                r6.writeInt(r4)
                return r0
            L_0x0197:
                r5.enforceInterface(r2)
                r4 = r3
                ob0.j0 r4 = (ob0.C117739j0) r4
                boolean r4 = r4.getIsUserCmd()
                r6.writeNoException()
                r6.writeInt(r4)
                return r0
            L_0x01a8:
                r5.enforceInterface(r2)
                r4 = r3
                ob0.j0 r4 = (ob0.C117739j0) r4
                int r4 = r4.mo174479o8()
                r6.writeNoException()
                r6.writeInt(r4)
                return r0
            L_0x01b9:
                r5.enforceInterface(r2)
                android.os.IBinder r4 = r5.readStrongBinder()
                com.tencent.mm.network.m r4 = com.tencent.p014mm.network.C114783m.C114784a.m161566a(r4)
                int r7 = r5.readInt()
                int r5 = r5.readInt()
                r1 = r3
                ob0.j0 r1 = (ob0.C117739j0) r1
                r1.mo174463FG(r4, r7, r5)
                r6.writeNoException()
                return r0
            L_0x01d6:
                r5.enforceInterface(r2)
                r4 = r3
                ob0.j0 r4 = (ob0.C117739j0) r4
                qe3.j r4 = r4.f352093f
                r6.writeNoException()
                if (r4 == 0) goto L_0x01e6
                r1 = r4
                qe3.j$a r1 = (qe3.C118180j.C101128a) r1
            L_0x01e6:
                r6.writeStrongBinder(r1)
                return r0
            L_0x01ea:
                r5.enforceInterface(r2)
                r4 = r3
                ob0.j0 r4 = (ob0.C117739j0) r4
                qe3.k r4 = r4.f352094g
                r6.writeNoException()
                if (r4 == 0) goto L_0x01fa
                r1 = r4
                qe3.k$a r1 = (qe3.C118181k.C118182a) r1
            L_0x01fa:
                r6.writeStrongBinder(r1)
                return r0
            L_0x01fe:
                r5.enforceInterface(r2)
                r4 = r3
                ob0.j0 r4 = (ob0.C117739j0) r4
                java.lang.String r4 = r4.getUri()
                r6.writeNoException()
                r6.writeString(r4)
                return r0
            L_0x020f:
                r5.enforceInterface(r2)
                r4 = r3
                ob0.j0 r4 = (ob0.C117739j0) r4
                int r4 = r4.getType()
                r6.writeNoException()
                r6.writeInt(r4)
                return r0
            L_0x0220:
                r6.writeString(r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.network.C114800v.C114801a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: FG */
    void mo174463FG(C114783m mVar, int i, int i2);

    /* renamed from: YQ */
    void mo174464YQ(C114783m mVar, int i, int i2, String str);

    boolean getIsLongPolling();

    boolean getIsUserCmd();

    int getLongPollingTimeout();

    int getNewExtFlags();

    int getOptions();

    C118180j getReqObj();

    C118181k getRespObj();

    int getTimeOut();

    byte[] getTransHeader();

    int getType();

    String getUri();

    String h30();

    boolean isSingleSession();

    /* renamed from: kD */
    void mo174478kD(C26879f fVar, C114783m mVar, int i, int i2);

    /* renamed from: o8 */
    int mo174479o8();

    String pr0();

    void setEncryptAlgo(int i);

    void setReqHost(String str);

    void setSingleSession(boolean z);

    /* renamed from: uw */
    boolean mo174484uw();

    /* renamed from: zy */
    int mo174485zy();
}
