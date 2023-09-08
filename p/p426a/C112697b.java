package p426a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: a.b */
public abstract class C112697b extends Binder implements IInterface {
    public C112697b() {
        attachInterface(this, "android.support.customtabs.ICustomTabsService");
    }

    public IBinder asBinder() {
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: android.net.Uri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: android.os.Bundle} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v21 */
    /* JADX WARNING: type inference failed for: r2v22 */
    /* JADX WARNING: type inference failed for: r2v23 */
    /* JADX WARNING: type inference failed for: r2v24 */
    /* JADX WARNING: type inference failed for: r2v25 */
    /* JADX WARNING: type inference failed for: r2v26 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTransact(int r6, android.os.Parcel r7, android.os.Parcel r8, int r9) {
        /*
            r5 = this;
            r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
            r1 = 1
            if (r6 == r0) goto L_0x01c2
            r0 = 0
            r2 = 0
            switch(r6) {
                case 2: goto L_0x01a9;
                case 3: goto L_0x0164;
                case 4: goto L_0x011d;
                case 5: goto L_0x00ec;
                case 6: goto L_0x00bb;
                case 7: goto L_0x008a;
                case 8: goto L_0x0055;
                case 9: goto L_0x0010;
                default: goto L_0x000b;
            }
        L_0x000b:
            boolean r6 = super.onTransact(r6, r7, r8, r9)
            return r6
        L_0x0010:
            java.lang.String r6 = "android.support.customtabs.ICustomTabsService"
            r7.enforceInterface(r6)
            android.os.IBinder r6 = r7.readStrongBinder()
            a.a r6 = p426a.C112694a.C112695a.m154098a(r6)
            int r9 = r7.readInt()
            int r0 = r7.readInt()
            if (r0 == 0) goto L_0x0030
            android.os.Parcelable$Creator r0 = android.net.Uri.CREATOR
            java.lang.Object r0 = r0.createFromParcel(r7)
            android.net.Uri r0 = (android.net.Uri) r0
            goto L_0x0031
        L_0x0030:
            r0 = r2
        L_0x0031:
            int r3 = r7.readInt()
            if (r3 == 0) goto L_0x0040
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            java.lang.Object r7 = r2.createFromParcel(r7)
            r2 = r7
            android.os.Bundle r2 = (android.os.Bundle) r2
        L_0x0040:
            r7 = r5
            androidx.browser.customtabs.CustomTabsService$a r7 = (androidx.browser.customtabs.CustomTabsService.C112854a) r7
            androidx.browser.customtabs.CustomTabsService r7 = androidx.browser.customtabs.CustomTabsService.this
            p.a r3 = new p.a
            r3.<init>(r6)
            boolean r6 = r7.mo164697g(r3, r9, r0, r2)
            r8.writeNoException()
            r8.writeInt(r6)
            return r1
        L_0x0055:
            java.lang.String r6 = "android.support.customtabs.ICustomTabsService"
            r7.enforceInterface(r6)
            android.os.IBinder r6 = r7.readStrongBinder()
            a.a r6 = p426a.C112694a.C112695a.m154098a(r6)
            java.lang.String r9 = r7.readString()
            int r0 = r7.readInt()
            if (r0 == 0) goto L_0x0075
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            java.lang.Object r7 = r0.createFromParcel(r7)
            r2 = r7
            android.os.Bundle r2 = (android.os.Bundle) r2
        L_0x0075:
            r7 = r5
            androidx.browser.customtabs.CustomTabsService$a r7 = (androidx.browser.customtabs.CustomTabsService.C112854a) r7
            androidx.browser.customtabs.CustomTabsService r7 = androidx.browser.customtabs.CustomTabsService.this
            p.a r0 = new p.a
            r0.<init>(r6)
            int r6 = r7.mo164694d(r0, r9, r2)
            r8.writeNoException()
            r8.writeInt(r6)
            return r1
        L_0x008a:
            java.lang.String r6 = "android.support.customtabs.ICustomTabsService"
            r7.enforceInterface(r6)
            android.os.IBinder r6 = r7.readStrongBinder()
            a.a r6 = p426a.C112694a.C112695a.m154098a(r6)
            int r9 = r7.readInt()
            if (r9 == 0) goto L_0x00a6
            android.os.Parcelable$Creator r9 = android.net.Uri.CREATOR
            java.lang.Object r7 = r9.createFromParcel(r7)
            r2 = r7
            android.net.Uri r2 = (android.net.Uri) r2
        L_0x00a6:
            r7 = r5
            androidx.browser.customtabs.CustomTabsService$a r7 = (androidx.browser.customtabs.CustomTabsService.C112854a) r7
            androidx.browser.customtabs.CustomTabsService r7 = androidx.browser.customtabs.CustomTabsService.this
            p.a r9 = new p.a
            r9.<init>(r6)
            boolean r6 = r7.mo164695e(r9, r2)
            r8.writeNoException()
            r8.writeInt(r6)
            return r1
        L_0x00bb:
            java.lang.String r6 = "android.support.customtabs.ICustomTabsService"
            r7.enforceInterface(r6)
            android.os.IBinder r6 = r7.readStrongBinder()
            a.a r6 = p426a.C112694a.C112695a.m154098a(r6)
            int r9 = r7.readInt()
            if (r9 == 0) goto L_0x00d7
            android.os.Parcelable$Creator r9 = android.os.Bundle.CREATOR
            java.lang.Object r7 = r9.createFromParcel(r7)
            r2 = r7
            android.os.Bundle r2 = (android.os.Bundle) r2
        L_0x00d7:
            r7 = r5
            androidx.browser.customtabs.CustomTabsService$a r7 = (androidx.browser.customtabs.CustomTabsService.C112854a) r7
            androidx.browser.customtabs.CustomTabsService r7 = androidx.browser.customtabs.CustomTabsService.this
            p.a r9 = new p.a
            r9.<init>(r6)
            boolean r6 = r7.mo164696f(r9, r2)
            r8.writeNoException()
            r8.writeInt(r6)
            return r1
        L_0x00ec:
            java.lang.String r6 = "android.support.customtabs.ICustomTabsService"
            r7.enforceInterface(r6)
            java.lang.String r6 = r7.readString()
            int r9 = r7.readInt()
            if (r9 == 0) goto L_0x0104
            android.os.Parcelable$Creator r9 = android.os.Bundle.CREATOR
            java.lang.Object r7 = r9.createFromParcel(r7)
            r2 = r7
            android.os.Bundle r2 = (android.os.Bundle) r2
        L_0x0104:
            r7 = r5
            androidx.browser.customtabs.CustomTabsService$a r7 = (androidx.browser.customtabs.CustomTabsService.C112854a) r7
            androidx.browser.customtabs.CustomTabsService r7 = androidx.browser.customtabs.CustomTabsService.this
            android.os.Bundle r6 = r7.mo164691a(r6, r2)
            r8.writeNoException()
            if (r6 == 0) goto L_0x0119
            r8.writeInt(r1)
            r6.writeToParcel(r8, r1)
            goto L_0x011c
        L_0x0119:
            r8.writeInt(r0)
        L_0x011c:
            return r1
        L_0x011d:
            java.lang.String r6 = "android.support.customtabs.ICustomTabsService"
            r7.enforceInterface(r6)
            android.os.IBinder r6 = r7.readStrongBinder()
            a.a r6 = p426a.C112694a.C112695a.m154098a(r6)
            int r9 = r7.readInt()
            if (r9 == 0) goto L_0x0139
            android.os.Parcelable$Creator r9 = android.net.Uri.CREATOR
            java.lang.Object r9 = r9.createFromParcel(r7)
            android.net.Uri r9 = (android.net.Uri) r9
            goto L_0x013a
        L_0x0139:
            r9 = r2
        L_0x013a:
            int r0 = r7.readInt()
            if (r0 == 0) goto L_0x0149
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            java.lang.Object r0 = r0.createFromParcel(r7)
            r2 = r0
            android.os.Bundle r2 = (android.os.Bundle) r2
        L_0x0149:
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            java.util.ArrayList r7 = r7.createTypedArrayList(r0)
            r0 = r5
            androidx.browser.customtabs.CustomTabsService$a r0 = (androidx.browser.customtabs.CustomTabsService.C112854a) r0
            androidx.browser.customtabs.CustomTabsService r0 = androidx.browser.customtabs.CustomTabsService.this
            p.a r3 = new p.a
            r3.<init>(r6)
            boolean r6 = r0.mo164692b(r3, r9, r2, r7)
            r8.writeNoException()
            r8.writeInt(r6)
            return r1
        L_0x0164:
            java.lang.String r6 = "android.support.customtabs.ICustomTabsService"
            r7.enforceInterface(r6)
            android.os.IBinder r6 = r7.readStrongBinder()
            a.a r6 = p426a.C112694a.C112695a.m154098a(r6)
            r7 = r5
            androidx.browser.customtabs.CustomTabsService$a r7 = (androidx.browser.customtabs.CustomTabsService.C112854a) r7
            p.a r9 = new p.a
            r9.<init>(r6)
            androidx.browser.customtabs.a r2 = new androidx.browser.customtabs.a     // Catch:{ RemoteException -> 0x01a2 }
            r2.<init>(r7, r9)     // Catch:{ RemoteException -> 0x01a2 }
            androidx.browser.customtabs.CustomTabsService r3 = androidx.browser.customtabs.CustomTabsService.this     // Catch:{ RemoteException -> 0x01a2 }
            java.util.Map<android.os.IBinder, android.os.IBinder$DeathRecipient> r3 = r3.f337879d     // Catch:{ RemoteException -> 0x01a2 }
            monitor-enter(r3)     // Catch:{ RemoteException -> 0x01a2 }
            android.os.IBinder r4 = r6.asBinder()     // Catch:{ all -> 0x019f }
            r4.linkToDeath(r2, r0)     // Catch:{ all -> 0x019f }
            androidx.browser.customtabs.CustomTabsService r4 = androidx.browser.customtabs.CustomTabsService.this     // Catch:{ all -> 0x019f }
            java.util.Map<android.os.IBinder, android.os.IBinder$DeathRecipient> r4 = r4.f337879d     // Catch:{ all -> 0x019f }
            android.os.IBinder r6 = r6.asBinder()     // Catch:{ all -> 0x019f }
            u.i r4 = (p1042u.C111059i) r4     // Catch:{ all -> 0x019f }
            r4.put(r6, r2)     // Catch:{ all -> 0x019f }
            monitor-exit(r3)     // Catch:{ all -> 0x019f }
            androidx.browser.customtabs.CustomTabsService r6 = androidx.browser.customtabs.CustomTabsService.this     // Catch:{ RemoteException -> 0x01a2 }
            boolean r0 = r6.mo164693c(r9)     // Catch:{ RemoteException -> 0x01a2 }
            goto L_0x01a2
        L_0x019f:
            r6 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x019f }
            throw r6     // Catch:{ RemoteException -> 0x01a2 }
        L_0x01a2:
            r8.writeNoException()
            r8.writeInt(r0)
            return r1
        L_0x01a9:
            java.lang.String r6 = "android.support.customtabs.ICustomTabsService"
            r7.enforceInterface(r6)
            long r6 = r7.readLong()
            r9 = r5
            androidx.browser.customtabs.CustomTabsService$a r9 = (androidx.browser.customtabs.CustomTabsService.C112854a) r9
            androidx.browser.customtabs.CustomTabsService r9 = androidx.browser.customtabs.CustomTabsService.this
            boolean r6 = r9.mo164698h(r6)
            r8.writeNoException()
            r8.writeInt(r6)
            return r1
        L_0x01c2:
            java.lang.String r6 = "android.support.customtabs.ICustomTabsService"
            r8.writeString(r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p426a.C112697b.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
