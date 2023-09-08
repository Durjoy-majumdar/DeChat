package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface IGmsServiceBroker extends IInterface {

    public static abstract class Stub extends Binder implements IGmsServiceBroker {

        public static class zza implements IGmsServiceBroker {
            private final IBinder zza;

            public zza(IBinder iBinder) {
                this.zza = iBinder;
            }

            public final IBinder asBinder() {
                return this.zza;
            }

            public final void getService(IGmsCallbacks iGmsCallbacks, GetServiceRequest getServiceRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(iGmsCallbacks != null ? iGmsCallbacks.asBinder() : null);
                    if (getServiceRequest != null) {
                        obtain.writeInt(1);
                        getServiceRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zza.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.google.android.gms.common.internal.IGmsServiceBroker");
        }

        public static IGmsServiceBroker asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IGmsServiceBroker)) ? new zza(iBinder) : (IGmsServiceBroker) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public void getLegacyService(int i, IGmsCallbacks iGmsCallbacks, int i2, String str, String str2, String[] strArr, Bundle bundle, IBinder iBinder, String str3, String str4) {
            throw new UnsupportedOperationException();
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: android.os.IBinder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.String[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: android.os.IBinder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.String[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: android.os.IBinder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.String[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: android.os.IBinder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.String[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.lang.String[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.String[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.String[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: java.lang.String[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.lang.String[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.lang.String[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: java.lang.String[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: android.os.IBinder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: java.lang.String[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: java.lang.String[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: android.os.IBinder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: java.lang.String[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: java.lang.String[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.google.android.gms.common.internal.ValidateAccountRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: com.google.android.gms.common.internal.GetServiceRequest} */
        /* JADX WARNING: type inference failed for: r4v0 */
        /* JADX WARNING: type inference failed for: r0v2 */
        /* JADX WARNING: type inference failed for: r0v4, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r0v6, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r0v8, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r0v11, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r0v14, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r9v15 */
        /* JADX WARNING: type inference failed for: r9v16 */
        /* JADX WARNING: type inference failed for: r4v9 */
        /* JADX WARNING: type inference failed for: r4v10 */
        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r16, android.os.Parcel r17, android.os.Parcel r18, int r19) {
            /*
                r15 = this;
                r11 = r15
                r1 = r16
                r0 = r17
                r2 = 16777215(0xffffff, float:2.3509886E-38)
                if (r1 <= r2) goto L_0x000f
                boolean r0 = super.onTransact(r16, r17, r18, r19)
                return r0
            L_0x000f:
                java.lang.String r2 = "com.google.android.gms.common.internal.IGmsServiceBroker"
                r0.enforceInterface(r2)
                android.os.IBinder r2 = r17.readStrongBinder()
                com.google.android.gms.common.internal.IGmsCallbacks r2 = com.google.android.gms.common.internal.IGmsCallbacks.Stub.asInterface(r2)
                r3 = 46
                r12 = 1
                r4 = 0
                if (r1 != r3) goto L_0x0036
                int r1 = r17.readInt()
                if (r1 == 0) goto L_0x0031
                android.os.Parcelable$Creator<com.google.android.gms.common.internal.GetServiceRequest> r1 = com.google.android.gms.common.internal.GetServiceRequest.CREATOR
                java.lang.Object r0 = r1.createFromParcel(r0)
                r4 = r0
                com.google.android.gms.common.internal.GetServiceRequest r4 = (com.google.android.gms.common.internal.GetServiceRequest) r4
            L_0x0031:
                r15.getService(r2, r4)
                goto L_0x0152
            L_0x0036:
                r3 = 47
                if (r1 != r3) goto L_0x004e
                int r1 = r17.readInt()
                if (r1 == 0) goto L_0x0049
                android.os.Parcelable$Creator<com.google.android.gms.common.internal.ValidateAccountRequest> r1 = com.google.android.gms.common.internal.ValidateAccountRequest.CREATOR
                java.lang.Object r0 = r1.createFromParcel(r0)
                r4 = r0
                com.google.android.gms.common.internal.ValidateAccountRequest r4 = (com.google.android.gms.common.internal.ValidateAccountRequest) r4
            L_0x0049:
                r15.validateAccount(r2, r4)
                goto L_0x0152
            L_0x004e:
                int r3 = r17.readInt()
                r5 = 4
                if (r1 == r5) goto L_0x005a
                java.lang.String r5 = r17.readString()
                goto L_0x005b
            L_0x005a:
                r5 = r4
            L_0x005b:
                if (r1 == r12) goto L_0x0120
                r6 = 2
                if (r1 == r6) goto L_0x0106
                r6 = 23
                if (r1 == r6) goto L_0x0106
                r6 = 25
                if (r1 == r6) goto L_0x0106
                r6 = 27
                if (r1 == r6) goto L_0x0106
                r6 = 30
                if (r1 == r6) goto L_0x00e5
                r6 = 34
                if (r1 == r6) goto L_0x00de
                r6 = 41
                if (r1 == r6) goto L_0x0106
                r6 = 43
                if (r1 == r6) goto L_0x0106
                r6 = 37
                if (r1 == r6) goto L_0x0106
                r6 = 38
                if (r1 == r6) goto L_0x0106
                switch(r1) {
                    case 5: goto L_0x0106;
                    case 6: goto L_0x0106;
                    case 7: goto L_0x0106;
                    case 8: goto L_0x0106;
                    case 9: goto L_0x00b3;
                    case 10: goto L_0x00a7;
                    case 11: goto L_0x0106;
                    case 12: goto L_0x0106;
                    case 13: goto L_0x0106;
                    case 14: goto L_0x0106;
                    case 15: goto L_0x0106;
                    case 16: goto L_0x0106;
                    case 17: goto L_0x0106;
                    case 18: goto L_0x0106;
                    case 19: goto L_0x0089;
                    case 20: goto L_0x00e5;
                    default: goto L_0x0087;
                }
            L_0x0087:
                goto L_0x0119
            L_0x0089:
                android.os.IBinder r6 = r17.readStrongBinder()
                int r7 = r17.readInt()
                if (r7 == 0) goto L_0x009f
                android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r7.createFromParcel(r0)
                android.os.Bundle r0 = (android.os.Bundle) r0
                r8 = r0
                r7 = r4
                r10 = r7
                goto L_0x00a2
            L_0x009f:
                r7 = r4
                r8 = r7
                r10 = r8
            L_0x00a2:
                r13 = r10
                r9 = r6
                r6 = r13
                goto L_0x0145
            L_0x00a7:
                java.lang.String r6 = r17.readString()
                java.lang.String[] r0 = r17.createStringArray()
                r7 = r0
                r8 = r4
                goto L_0x011c
            L_0x00b3:
                java.lang.String r6 = r17.readString()
                java.lang.String[] r7 = r17.createStringArray()
                java.lang.String r8 = r17.readString()
                android.os.IBinder r9 = r17.readStrongBinder()
                java.lang.String r10 = r17.readString()
                int r13 = r17.readInt()
                if (r13 == 0) goto L_0x00d9
                android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r4.createFromParcel(r0)
                android.os.Bundle r0 = (android.os.Bundle) r0
                r13 = r10
                r10 = r8
                goto L_0x013e
            L_0x00d9:
                r13 = r10
                r10 = r8
                r8 = r4
                goto L_0x0145
            L_0x00de:
                java.lang.String r0 = r17.readString()
                r6 = r0
                r7 = r4
                goto L_0x011b
            L_0x00e5:
                java.lang.String[] r6 = r17.createStringArray()
                java.lang.String r7 = r17.readString()
                int r8 = r17.readInt()
                if (r8 == 0) goto L_0x00fe
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r8.createFromParcel(r0)
                android.os.Bundle r0 = (android.os.Bundle) r0
                r8 = r0
                r9 = r4
                goto L_0x0100
            L_0x00fe:
                r8 = r4
                r9 = r8
            L_0x0100:
                r10 = r9
                r13 = r10
                r14 = r7
                r7 = r6
                r6 = r14
                goto L_0x0145
            L_0x0106:
                int r6 = r17.readInt()
                if (r6 == 0) goto L_0x0119
                android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r6.createFromParcel(r0)
                android.os.Bundle r0 = (android.os.Bundle) r0
                r8 = r0
                r6 = r4
                r7 = r6
                r9 = r7
                goto L_0x011d
            L_0x0119:
                r6 = r4
                r7 = r6
            L_0x011b:
                r8 = r7
            L_0x011c:
                r9 = r8
            L_0x011d:
                r10 = r9
                r13 = r10
                goto L_0x0145
            L_0x0120:
                java.lang.String r6 = r17.readString()
                java.lang.String[] r7 = r17.createStringArray()
                java.lang.String r8 = r17.readString()
                int r9 = r17.readInt()
                if (r9 == 0) goto L_0x0140
                android.os.Parcelable$Creator r9 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r9.createFromParcel(r0)
                android.os.Bundle r0 = (android.os.Bundle) r0
                r9 = r4
                r13 = r9
                r10 = r6
                r6 = r8
            L_0x013e:
                r8 = r0
                goto L_0x0145
            L_0x0140:
                r9 = r4
                r13 = r9
                r10 = r6
                r6 = r8
                r8 = r13
            L_0x0145:
                r0 = r15
                r1 = r16
                r4 = r5
                r5 = r6
                r6 = r7
                r7 = r8
                r8 = r9
                r9 = r10
                r10 = r13
                r0.getLegacyService(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            L_0x0152:
                r18.writeNoException()
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.IGmsServiceBroker.Stub.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }

        public void validateAccount(IGmsCallbacks iGmsCallbacks, ValidateAccountRequest validateAccountRequest) {
            throw new UnsupportedOperationException();
        }
    }

    void getService(IGmsCallbacks iGmsCallbacks, GetServiceRequest getServiceRequest);
}
