package q01;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.p014mm.plugin.cdndownloader.ipc.CDNTaskInfo;
import com.tencent.p014mm.plugin.cdndownloader.ipc.CDNTaskState;

/* renamed from: q01.a */
public interface C47731a extends IInterface {

    /* renamed from: q01.a$a */
    public static abstract class C47732a extends Binder implements C47731a {

        /* renamed from: d */
        public static final /* synthetic */ int f128247d = 0;

        /* renamed from: q01.a$a$a */
        public static class C47733a implements C47731a {

            /* renamed from: d */
            public IBinder f128248d;

            public C47733a(IBinder iBinder) {
                this.f128248d = iBinder;
            }

            /* renamed from: IC */
            public boolean mo63878IC(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadService");
                    obtain.writeString(str);
                    boolean z = false;
                    if (!this.f128248d.transact(3, obtain, obtain2, 0)) {
                        int i = C47732a.f128247d;
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

            /* renamed from: Lo */
            public void mo63879Lo(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadService");
                    obtain.writeInt(i);
                    if (!this.f128248d.transact(8, obtain, obtain2, 0)) {
                        int i2 = C47732a.f128247d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: NQ */
            public int mo63880NQ(CDNTaskInfo cDNTaskInfo) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadService");
                    if (cDNTaskInfo != null) {
                        obtain.writeInt(1);
                        cDNTaskInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f128248d.transact(1, obtain, obtain2, 0)) {
                        int i = C47732a.f128247d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: WX */
            public void mo63881WX() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadService");
                    if (!this.f128248d.transact(10, obtain, obtain2, 0)) {
                        int i = C47732a.f128247d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean Wa0(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadService");
                    obtain.writeString(str);
                    boolean z = false;
                    if (!this.f128248d.transact(4, obtain, obtain2, 0)) {
                        int i = C47732a.f128247d;
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

            /* renamed from: Wh */
            public CDNTaskState mo63883Wh(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadService");
                    obtain.writeString(str);
                    if (!this.f128248d.transact(5, obtain, obtain2, 0)) {
                        int i = C47732a.f128247d;
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? CDNTaskState.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f128248d;
            }

            /* renamed from: iF */
            public void mo63884iF() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadService");
                    if (!this.f128248d.transact(11, obtain, obtain2, 0)) {
                        int i = C47732a.f128247d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void jf0() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadService");
                    if (!this.f128248d.transact(9, obtain, obtain2, 0)) {
                        int i = C47732a.f128247d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void ko0(C47734b bVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadService");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    if (!this.f128248d.transact(6, obtain, obtain2, 0)) {
                        int i = C47732a.f128247d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int r90(CDNTaskInfo cDNTaskInfo) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadService");
                    if (cDNTaskInfo != null) {
                        obtain.writeInt(1);
                        cDNTaskInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f128248d.transact(2, obtain, obtain2, 0)) {
                        int i = C47732a.f128247d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C47732a() {
            attachInterface(this, "com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadService");
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo} */
        /* JADX WARNING: type inference failed for: r3v0 */
        /* JADX WARNING: type inference failed for: r3v7, types: [q01.b] */
        /* JADX WARNING: type inference failed for: r3v11, types: [q01.b] */
        /* JADX WARNING: type inference failed for: r3v15 */
        /* JADX WARNING: type inference failed for: r3v16 */
        /* JADX WARNING: type inference failed for: r3v17 */
        /* JADX WARNING: type inference failed for: r3v18 */
        /* JADX WARNING: type inference failed for: r3v19 */
        /* JADX WARNING: type inference failed for: r3v20 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
            /*
                r4 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                java.lang.String r2 = "com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadService"
                if (r5 == r0) goto L_0x0101
                java.lang.String r0 = "com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadServiceCallback"
                r3 = 0
                switch(r5) {
                    case 1: goto L_0x00e4;
                    case 2: goto L_0x00c7;
                    case 3: goto L_0x00b5;
                    case 4: goto L_0x00a3;
                    case 5: goto L_0x0087;
                    case 6: goto L_0x0063;
                    case 7: goto L_0x003f;
                    case 8: goto L_0x0031;
                    case 9: goto L_0x0027;
                    case 10: goto L_0x001d;
                    case 11: goto L_0x0013;
                    default: goto L_0x000e;
                }
            L_0x000e:
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x0013:
                r6.enforceInterface(r2)
                r4.mo63884iF()
                r7.writeNoException()
                return r1
            L_0x001d:
                r6.enforceInterface(r2)
                r4.mo63881WX()
                r7.writeNoException()
                return r1
            L_0x0027:
                r6.enforceInterface(r2)
                r4.jf0()
                r7.writeNoException()
                return r1
            L_0x0031:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                r4.mo63879Lo(r5)
                r7.writeNoException()
                return r1
            L_0x003f:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                if (r5 != 0) goto L_0x0049
                goto L_0x005c
            L_0x0049:
                android.os.IInterface r6 = r5.queryLocalInterface(r0)
                if (r6 == 0) goto L_0x0057
                boolean r8 = r6 instanceof q01.C47734b
                if (r8 == 0) goto L_0x0057
                r3 = r6
                q01.b r3 = (q01.C47734b) r3
                goto L_0x005c
            L_0x0057:
                q01.b$a$a r3 = new q01.b$a$a
                r3.<init>(r5)
            L_0x005c:
                r4.mo63888vP(r3)
                r7.writeNoException()
                return r1
            L_0x0063:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                if (r5 != 0) goto L_0x006d
                goto L_0x0080
            L_0x006d:
                android.os.IInterface r6 = r5.queryLocalInterface(r0)
                if (r6 == 0) goto L_0x007b
                boolean r8 = r6 instanceof q01.C47734b
                if (r8 == 0) goto L_0x007b
                r3 = r6
                q01.b r3 = (q01.C47734b) r3
                goto L_0x0080
            L_0x007b:
                q01.b$a$a r3 = new q01.b$a$a
                r3.<init>(r5)
            L_0x0080:
                r4.ko0(r3)
                r7.writeNoException()
                return r1
            L_0x0087:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskState r5 = r4.mo63883Wh(r5)
                r7.writeNoException()
                if (r5 == 0) goto L_0x009e
                r7.writeInt(r1)
                r5.writeToParcel(r7, r1)
                goto L_0x00a2
            L_0x009e:
                r5 = 0
                r7.writeInt(r5)
            L_0x00a2:
                return r1
            L_0x00a3:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                boolean r5 = r4.Wa0(r5)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x00b5:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                boolean r5 = r4.mo63878IC(r5)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x00c7:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00d9
                android.os.Parcelable$Creator<com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo> r5 = com.tencent.p014mm.plugin.cdndownloader.ipc.CDNTaskInfo.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo r3 = (com.tencent.p014mm.plugin.cdndownloader.ipc.CDNTaskInfo) r3
            L_0x00d9:
                int r5 = r4.r90(r3)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x00e4:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00f6
                android.os.Parcelable$Creator<com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo> r5 = com.tencent.p014mm.plugin.cdndownloader.ipc.CDNTaskInfo.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo r3 = (com.tencent.p014mm.plugin.cdndownloader.ipc.CDNTaskInfo) r3
            L_0x00f6:
                int r5 = r4.mo63880NQ(r3)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x0101:
                r7.writeString(r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: q01.C47731a.C47732a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: IC */
    boolean mo63878IC(String str);

    /* renamed from: Lo */
    void mo63879Lo(int i);

    /* renamed from: NQ */
    int mo63880NQ(CDNTaskInfo cDNTaskInfo);

    /* renamed from: WX */
    void mo63881WX();

    boolean Wa0(String str);

    /* renamed from: Wh */
    CDNTaskState mo63883Wh(String str);

    /* renamed from: iF */
    void mo63884iF();

    void jf0();

    void ko0(C47734b bVar);

    int r90(CDNTaskInfo cDNTaskInfo);

    /* renamed from: vP */
    void mo63888vP(C47734b bVar);
}
