package p20;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: p20.a */
public interface C89305a extends IInterface {

    /* renamed from: p20.a$a */
    public static abstract class C89306a extends Binder implements C89305a {

        /* renamed from: d */
        public static final /* synthetic */ int f257262d = 0;

        /* renamed from: p20.a$a$a */
        public static class C89307a implements C89305a {

            /* renamed from: d */
            public IBinder f257263d;

            public C89307a(IBinder iBinder) {
                this.f257263d = iBinder;
            }

            /* renamed from: CP */
            public void mo112672CP(Bundle bundle, String str, C89308b bVar) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.ipcinvoker.aidl.AIDL_IPCInvokeBridge");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    if (!this.f257263d.transact(1, obtain, (Parcel) null, 1)) {
                        int i = C89306a.f257262d;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f257263d;
            }

            /* renamed from: jg */
            public Bundle mo112673jg(Bundle bundle, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.ipcinvoker.aidl.AIDL_IPCInvokeBridge");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (!this.f257263d.transact(2, obtain, obtain2, 0)) {
                        int i = C89306a.f257262d;
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C89306a() {
            attachInterface(this, "com.tencent.mm.ipcinvoker.aidl.AIDL_IPCInvokeBridge");
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: android.os.Bundle} */
        /* JADX WARNING: type inference failed for: r0v0 */
        /* JADX WARNING: type inference failed for: r0v1, types: [p20.b] */
        /* JADX WARNING: type inference failed for: r0v9 */
        /* JADX WARNING: type inference failed for: r0v10 */
        /* JADX WARNING: type inference failed for: r0v11 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
            /*
                r4 = this;
                r0 = 0
                r1 = 1
                java.lang.String r2 = "com.tencent.mm.ipcinvoker.aidl.AIDL_IPCInvokeBridge"
                if (r5 == r1) goto L_0x0045
                r3 = 2
                if (r5 == r3) goto L_0x0017
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r5 == r0) goto L_0x0013
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x0013:
                r7.writeString(r2)
                return r1
            L_0x0017:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0029
                android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r0 = r5
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0029:
                java.lang.String r5 = r6.readString()
                r6 = r4
                com.tencent.mm.ipcinvoker.BaseIPCService$a r6 = (com.tencent.p014mm.ipcinvoker.BaseIPCService.C80877a) r6
                android.os.Bundle r5 = r6.mo112673jg(r0, r5)
                r7.writeNoException()
                if (r5 == 0) goto L_0x0040
                r7.writeInt(r1)
                r5.writeToParcel(r7, r1)
                goto L_0x0044
            L_0x0040:
                r5 = 0
                r7.writeInt(r5)
            L_0x0044:
                return r1
            L_0x0045:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0057
                android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.os.Bundle r5 = (android.os.Bundle) r5
                goto L_0x0058
            L_0x0057:
                r5 = r0
            L_0x0058:
                java.lang.String r7 = r6.readString()
                android.os.IBinder r6 = r6.readStrongBinder()
                if (r6 != 0) goto L_0x0063
                goto L_0x0078
            L_0x0063:
                java.lang.String r8 = "com.tencent.mm.ipcinvoker.aidl.AIDL_IPCInvokeCallback"
                android.os.IInterface r8 = r6.queryLocalInterface(r8)
                if (r8 == 0) goto L_0x0073
                boolean r0 = r8 instanceof p20.C89308b
                if (r0 == 0) goto L_0x0073
                r0 = r8
                p20.b r0 = (p20.C89308b) r0
                goto L_0x0078
            L_0x0073:
                p20.b$a$a r0 = new p20.b$a$a
                r0.<init>(r6)
            L_0x0078:
                r6 = r4
                com.tencent.mm.ipcinvoker.BaseIPCService$a r6 = (com.tencent.p014mm.ipcinvoker.BaseIPCService.C80877a) r6
                r6.mo112672CP(r5, r7, r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p20.C89305a.C89306a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: CP */
    void mo112672CP(Bundle bundle, String str, C89308b bVar);

    /* renamed from: jg */
    Bundle mo112673jg(Bundle bundle, String str);
}
