package com.tencent.matrix.lifecycle.supervisor;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.tencent.matrix.lifecycle.supervisor.e */
public interface C80478e extends IInterface {

    /* renamed from: com.tencent.matrix.lifecycle.supervisor.e$a */
    public static abstract class C80479a extends Binder implements C80478e {

        /* renamed from: d */
        public static final /* synthetic */ int f235473d = 0;

        /* renamed from: com.tencent.matrix.lifecycle.supervisor.e$a$a */
        public static class C80480a implements C80478e {

            /* renamed from: d */
            public IBinder f235474d;

            public C80480a(IBinder iBinder) {
                this.f235474d = iBinder;
            }

            /* renamed from: BT */
            public String mo112002BT() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy");
                    if (!this.f235474d.transact(7, obtain, obtain2, 0)) {
                        int i = C80479a.f235473d;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: JF */
            public void mo112003JF(ProcessToken processToken) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy");
                    if (processToken != null) {
                        obtain.writeInt(1);
                        processToken.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f235474d.transact(2, obtain, obtain2, 0)) {
                        int i = C80479a.f235473d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Kj */
            public void mo112004Kj(ProcessToken[] processTokenArr, C28665d dVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy");
                    obtain.writeTypedArray(processTokenArr, 0);
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    if (!this.f235474d.transact(1, obtain, obtain2, 0)) {
                        int i = C80479a.f235473d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f235474d;
            }

            /* renamed from: ed */
            public void mo112005ed(ProcessToken processToken) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy");
                    if (processToken != null) {
                        obtain.writeInt(1);
                        processToken.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f235474d.transact(5, obtain, obtain2, 0)) {
                        int i = C80479a.f235473d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ja */
            public void mo112006ja(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy");
                    obtain.writeString(str);
                    if (!this.f235474d.transact(3, obtain, obtain2, 0)) {
                        int i = C80479a.f235473d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: st */
            public void mo112007st(ProcessToken processToken) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy");
                    if (processToken != null) {
                        obtain.writeInt(1);
                        processToken.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f235474d.transact(6, obtain, obtain2, 0)) {
                        int i = C80479a.f235473d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void ul0(ProcessToken processToken) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy");
                    if (processToken != null) {
                        obtain.writeInt(1);
                        processToken.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f235474d.transact(4, obtain, obtain2, 0)) {
                        int i = C80479a.f235473d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C80479a() {
            attachInterface(this, "com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy");
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.tencent.matrix.lifecycle.supervisor.ProcessToken} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: com.tencent.matrix.lifecycle.supervisor.ProcessToken} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: com.tencent.matrix.lifecycle.supervisor.ProcessToken} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: com.tencent.matrix.lifecycle.supervisor.ProcessToken} */
        /* JADX WARNING: type inference failed for: r0v1 */
        /* JADX WARNING: type inference failed for: r0v2, types: [com.tencent.matrix.lifecycle.supervisor.d] */
        /* JADX WARNING: type inference failed for: r0v19 */
        /* JADX WARNING: type inference failed for: r0v20 */
        /* JADX WARNING: type inference failed for: r0v21 */
        /* JADX WARNING: type inference failed for: r0v22 */
        /* JADX WARNING: type inference failed for: r0v23 */
        /* JADX WARNING: type inference failed for: r0v24 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
            /*
                r3 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                java.lang.String r2 = "com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy"
                if (r4 == r0) goto L_0x00d4
                r0 = 0
                switch(r4) {
                    case 1: goto L_0x00a3;
                    case 2: goto L_0x0087;
                    case 3: goto L_0x0076;
                    case 4: goto L_0x005a;
                    case 5: goto L_0x003e;
                    case 6: goto L_0x0022;
                    case 7: goto L_0x0011;
                    default: goto L_0x000c;
                }
            L_0x000c:
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L_0x0011:
                r5.enforceInterface(r2)
                r4 = r3
                com.tencent.matrix.lifecycle.supervisor.SupervisorService$d r4 = (com.tencent.matrix.lifecycle.supervisor.SupervisorService.C80467d) r4
                java.lang.String r4 = r4.mo112002BT()
                r6.writeNoException()
                r6.writeString(r4)
                return r1
            L_0x0022:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0034
                android.os.Parcelable$Creator<com.tencent.matrix.lifecycle.supervisor.ProcessToken> r4 = com.tencent.matrix.lifecycle.supervisor.ProcessToken.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                com.tencent.matrix.lifecycle.supervisor.ProcessToken r0 = (com.tencent.matrix.lifecycle.supervisor.ProcessToken) r0
            L_0x0034:
                r4 = r3
                com.tencent.matrix.lifecycle.supervisor.SupervisorService$d r4 = (com.tencent.matrix.lifecycle.supervisor.SupervisorService.C80467d) r4
                r4.mo112007st(r0)
                r6.writeNoException()
                return r1
            L_0x003e:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0050
                android.os.Parcelable$Creator<com.tencent.matrix.lifecycle.supervisor.ProcessToken> r4 = com.tencent.matrix.lifecycle.supervisor.ProcessToken.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                com.tencent.matrix.lifecycle.supervisor.ProcessToken r0 = (com.tencent.matrix.lifecycle.supervisor.ProcessToken) r0
            L_0x0050:
                r4 = r3
                com.tencent.matrix.lifecycle.supervisor.SupervisorService$d r4 = (com.tencent.matrix.lifecycle.supervisor.SupervisorService.C80467d) r4
                r4.mo112005ed(r0)
                r6.writeNoException()
                return r1
            L_0x005a:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x006c
                android.os.Parcelable$Creator<com.tencent.matrix.lifecycle.supervisor.ProcessToken> r4 = com.tencent.matrix.lifecycle.supervisor.ProcessToken.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                com.tencent.matrix.lifecycle.supervisor.ProcessToken r0 = (com.tencent.matrix.lifecycle.supervisor.ProcessToken) r0
            L_0x006c:
                r4 = r3
                com.tencent.matrix.lifecycle.supervisor.SupervisorService$d r4 = (com.tencent.matrix.lifecycle.supervisor.SupervisorService.C80467d) r4
                r4.ul0(r0)
                r6.writeNoException()
                return r1
            L_0x0076:
                r5.enforceInterface(r2)
                java.lang.String r4 = r5.readString()
                r5 = r3
                com.tencent.matrix.lifecycle.supervisor.SupervisorService$d r5 = (com.tencent.matrix.lifecycle.supervisor.SupervisorService.C80467d) r5
                r5.mo112006ja(r4)
                r6.writeNoException()
                return r1
            L_0x0087:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0099
                android.os.Parcelable$Creator<com.tencent.matrix.lifecycle.supervisor.ProcessToken> r4 = com.tencent.matrix.lifecycle.supervisor.ProcessToken.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                com.tencent.matrix.lifecycle.supervisor.ProcessToken r0 = (com.tencent.matrix.lifecycle.supervisor.ProcessToken) r0
            L_0x0099:
                r4 = r3
                com.tencent.matrix.lifecycle.supervisor.SupervisorService$d r4 = (com.tencent.matrix.lifecycle.supervisor.SupervisorService.C80467d) r4
                r4.mo112003JF(r0)
                r6.writeNoException()
                return r1
            L_0x00a3:
                r5.enforceInterface(r2)
                android.os.Parcelable$Creator<com.tencent.matrix.lifecycle.supervisor.ProcessToken> r4 = com.tencent.matrix.lifecycle.supervisor.ProcessToken.CREATOR
                java.lang.Object[] r4 = r5.createTypedArray(r4)
                com.tencent.matrix.lifecycle.supervisor.ProcessToken[] r4 = (com.tencent.matrix.lifecycle.supervisor.ProcessToken[]) r4
                android.os.IBinder r5 = r5.readStrongBinder()
                if (r5 != 0) goto L_0x00b5
                goto L_0x00ca
            L_0x00b5:
                java.lang.String r7 = "com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy"
                android.os.IInterface r7 = r5.queryLocalInterface(r7)
                if (r7 == 0) goto L_0x00c5
                boolean r0 = r7 instanceof com.tencent.matrix.lifecycle.supervisor.C28665d
                if (r0 == 0) goto L_0x00c5
                r0 = r7
                com.tencent.matrix.lifecycle.supervisor.d r0 = (com.tencent.matrix.lifecycle.supervisor.C28665d) r0
                goto L_0x00ca
            L_0x00c5:
                com.tencent.matrix.lifecycle.supervisor.d$a$a r0 = new com.tencent.matrix.lifecycle.supervisor.d$a$a
                r0.<init>(r5)
            L_0x00ca:
                r5 = r3
                com.tencent.matrix.lifecycle.supervisor.SupervisorService$d r5 = (com.tencent.matrix.lifecycle.supervisor.SupervisorService.C80467d) r5
                r5.mo112004Kj(r4, r0)
                r6.writeNoException()
                return r1
            L_0x00d4:
                r6.writeString(r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.lifecycle.supervisor.C80478e.C80479a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: BT */
    String mo112002BT();

    /* renamed from: JF */
    void mo112003JF(ProcessToken processToken);

    /* renamed from: Kj */
    void mo112004Kj(ProcessToken[] processTokenArr, C28665d dVar);

    /* renamed from: ed */
    void mo112005ed(ProcessToken processToken);

    /* renamed from: ja */
    void mo112006ja(String str);

    /* renamed from: st */
    void mo112007st(ProcessToken processToken);

    void ul0(ProcessToken processToken);
}
