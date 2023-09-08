package com.google.android.search.verification.client;

import android.app.IntentService;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.GmsIntents;
import p1063x8.C91141a;

public abstract class SearchActionVerificationClientService extends IntentService {

    /* renamed from: d */
    public final boolean f234741d = (!"user".equals(Build.TYPE));

    /* renamed from: e */
    public final long f234742e = 1000;

    /* renamed from: f */
    public final Intent f234743f = new Intent("com.google.android.googlequicksearchbox.SEARCH_ACTION_VERIFICATION_SERVICE").setPackage(GmsIntents.GOOGLE_NOW_PACKAGE_NAME);

    /* renamed from: g */
    public C80192a f234744g;

    /* renamed from: h */
    public C91141a f234745h = null;

    /* renamed from: com.google.android.search.verification.client.SearchActionVerificationClientService$a */
    public class C80192a implements ServiceConnection {
        public C80192a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C91141a aVar;
            SearchActionVerificationClientService searchActionVerificationClientService = SearchActionVerificationClientService.this;
            boolean z = searchActionVerificationClientService.f234741d;
            int i = C91141a.C91142a.f261358d;
            if (iBinder == null) {
                aVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.search.verification.api.ISearchActionVerificationService");
                aVar = (queryLocalInterface == null || !(queryLocalInterface instanceof C91141a)) ? new C91141a.C91142a.C91143a(iBinder) : (C91141a) queryLocalInterface;
            }
            searchActionVerificationClientService.f234745h = aVar;
        }

        public void onServiceDisconnected(ComponentName componentName) {
            SearchActionVerificationClientService searchActionVerificationClientService = SearchActionVerificationClientService.this;
            searchActionVerificationClientService.f234745h = null;
            boolean z = searchActionVerificationClientService.f234741d;
        }
    }

    public SearchActionVerificationClientService() {
        super("SearchActionVerificationClientService");
    }

    /* renamed from: a */
    public abstract boolean mo1347a(Intent intent, boolean z, Bundle bundle);

    public final void onCreate() {
        super.onCreate();
        C80192a aVar = new C80192a();
        this.f234744g = aVar;
        bindService(this.f234743f, aVar, 1);
    }

    public final void onDestroy() {
        super.onDestroy();
        unbindService(this.f234744g);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008a A[EDGE_INSN: B:66:0x008a->B:34:0x008a ?: BREAK  
    EDGE_INSN: B:67:0x008a->B:34:0x008a ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0120  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onHandleIntent(android.content.Intent r13) {
        /*
            r12 = this;
            if (r13 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.String r0 = android.os.Build.TYPE
            java.lang.String r1 = "user"
            boolean r0 = r1.equals(r0)
            r1 = 1
            r0 = r0 ^ r1
            r2 = 2
            r3 = 0
            if (r0 != 0) goto L_0x0051
            android.content.pm.PackageManager r0 = r12.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0037 }
            java.lang.String r4 = "com.google.android.googlequicksearchbox"
            r5 = 64
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r4, r5)     // Catch:{ NameNotFoundException -> 0x0037 }
            android.content.pm.Signature[] r0 = r0.signatures     // Catch:{ NameNotFoundException -> 0x0037 }
            if (r0 == 0) goto L_0x004b
            int r4 = r0.length     // Catch:{ NameNotFoundException -> 0x0037 }
            if (r4 == r1) goto L_0x0026
            goto L_0x004b
        L_0x0026:
            r0 = r0[r3]     // Catch:{ NameNotFoundException -> 0x0037 }
            byte[] r0 = r0.toByteArray()     // Catch:{ NameNotFoundException -> 0x0037 }
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r2)     // Catch:{ NameNotFoundException -> 0x0037 }
            java.lang.String r4 = "MIIEQzCCAyugAwIBAgIJAMLgh0ZkSjCNMA0GCSqGSIb3DQEBBAUAMHQxCzAJBgNVBAYTAlVTMRMwEQYDVQQIEwpDYWxpZm9ybmlhMRYwFAYDVQQHEw1Nb3VudGFpbiBWaWV3MRQwEgYDVQQKEwtHb29nbGUgSW5jLjEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDAeFw0wODA4MjEyMzEzMzRaFw0zNjAxMDcyMzEzMzRaMHQxCzAJBgNVBAYTAlVTMRMwEQYDVQQIEwpDYWxpZm9ybmlhMRYwFAYDVQQHEw1Nb3VudGFpbiBWaWV3MRQwEgYDVQQKEwtHb29nbGUgSW5jLjEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDCCASAwDQYJKoZIhvcNAQEBBQADggENADCCAQgCggEBAKtWLgDYO6IIrgqWbxJOKdoR8qtW0I9Y4sypEwPpt1TTcvZApxsdyxMJZ2JORland2qSGT2y5b+3JKkedxiLDmpHpDsz2WCbdxgxRczfey5YZnTJ4VZbH0xqWVW/8lGmPav5xVwnIiJS6HXk+BVKZF+JcWjAsb/GEuq/eFdpuzSqeYTcfi6idkyugwfYwXFU1+5fZKUaRKYCwkkFQVfcAs1fXA5V+++FGfvjJ/CxURaSxaBvGdGDhfXE28LWuT9ozCl5xw4Yq5OGazvV24mZVSoOO0yZ31j7kYvtwYK6NeADwbSxDdJEqO4k//0zOHKrUiGYXtqw/A0LFFtqoZKFjnkCAQOjgdkwgdYwHQYDVR0OBBYEFMd9jMIhF1Ylmn/Tgt9r45jk14alMIGmBgNVHSMEgZ4wgZuAFMd9jMIhF1Ylmn/Tgt9r45jk14aloXikdjB0MQswCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNTW91bnRhaW4gVmlldzEUMBIGA1UEChMLR29vZ2xlIEluYy4xEDAOBgNVBAsTB0FuZHJvaWQxEDAOBgNVBAMTB0FuZHJvaWSCCQDC4IdGZEowjTAMBgNVHRMEBTADAQH/MA0GCSqGSIb3DQEBBAUAA4IBAQBt0lLO74UwLDYKqs6Tm8/yzKkEu116FmH4rkaymUIE0P9KaMftGlMexFlaYjzmB2OxZyl6euNXEsQH8gjwyxCUKRJNexBiGcCEyj6z+a1fuHHvkiaai+KL8W1EyNmgjmyy8AW7P+LLlkR+ho5zEHatRbM/YAnqGcFh5iZBqpknHf1SKMXFh4dd239FJ1jWYfbMDMy3NS5CTMQ2XFI1MvcyUTdZPErjQfTbQe3aDQsQcafEQPD+nqActifKZ0Np0IS9L9kR/wbNvyz6ENwPiTrjV2KRkEjH78ZMcUQXg0L3BYHJ3lc69Vs5Ddf9uUGGMYldX3WfMBEmh/9iFBDAaTCK"
            boolean r0 = r0.equals(r4)     // Catch:{ NameNotFoundException -> 0x0037 }
            goto L_0x004c
        L_0x0037:
            r0 = move-exception
            boolean r4 = r12.f234741d
            if (r4 == 0) goto L_0x004b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r0 = r0.length()
            int r0 = r0 + 34
            r4.<init>(r0)
        L_0x004b:
            r0 = 0
        L_0x004c:
            if (r0 == 0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r0 = 0
            goto L_0x0052
        L_0x0051:
            r0 = 1
        L_0x0052:
            long r4 = java.lang.System.nanoTime()
        L_0x0056:
            x8.a r6 = r12.f234745h
            if (r6 == 0) goto L_0x005c
            r6 = 1
            goto L_0x005d
        L_0x005c:
            r6 = 0
        L_0x005d:
            if (r6 != 0) goto L_0x008a
            long r6 = java.lang.System.nanoTime()
            long r6 = r6 - r4
            long r8 = r12.f234742e
            r10 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r8 * r10
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 >= 0) goto L_0x008a
            r6 = 50
            java.lang.Thread.sleep(r6)     // Catch:{ InterruptedException -> 0x0075 }
            goto L_0x0056
        L_0x0075:
            r6 = move-exception
            boolean r7 = r12.f234741d
            if (r7 == 0) goto L_0x0056
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r6 = r6.length()
            int r6 = r6 + 33
            r7.<init>(r6)
            goto L_0x0056
        L_0x008a:
            x8.a r4 = r12.f234745h
            if (r4 == 0) goto L_0x0090
            r4 = 1
            goto L_0x0091
        L_0x0090:
            r4 = 0
        L_0x0091:
            if (r4 == 0) goto L_0x0120
            java.lang.String r4 = "SearchActionVerificationClientExtraIntent"
            boolean r5 = r13.hasExtra(r4)
            if (r5 == 0) goto L_0x010c
            android.os.Parcelable r13 = r13.getParcelableExtra(r4)
            android.content.Intent r13 = (android.content.Intent) r13
            boolean r4 = r12.f234741d
            if (r4 == 0) goto L_0x00dd
            java.lang.String r4 = java.lang.String.valueOf(r13)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r4 = r4.length()
            int r4 = r4 + r1
            r5.<init>(r4)
            android.os.Bundle r4 = r13.getExtras()
            if (r4 == 0) goto L_0x00dd
            java.util.Set r5 = r4.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x00c1:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00dd
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r7[r3] = r6
            java.lang.Object r6 = r4.get(r6)
            r7[r1] = r6
            java.lang.String r6 = "\t%s: %s"
            java.lang.String.format(r6, r7)
            goto L_0x00c1
        L_0x00dd:
            x8.a r2 = r12.f234745h     // Catch:{ RemoteException -> 0x00f7 }
            r2.getVersion()     // Catch:{ RemoteException -> 0x00f7 }
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ RemoteException -> 0x00f7 }
            r2.<init>()     // Catch:{ RemoteException -> 0x00f7 }
            if (r0 == 0) goto L_0x00f2
            x8.a r0 = r12.f234745h     // Catch:{ RemoteException -> 0x00f7 }
            boolean r0 = r0.mo125212Fn(r13, r2)     // Catch:{ RemoteException -> 0x00f7 }
            if (r0 == 0) goto L_0x00f2
            goto L_0x00f3
        L_0x00f2:
            r1 = 0
        L_0x00f3:
            r12.mo1347a(r13, r1, r2)     // Catch:{ RemoteException -> 0x00f7 }
            goto L_0x012f
        L_0x00f7:
            r13 = move-exception
            java.lang.String r13 = r13.getMessage()
            java.lang.String r13 = java.lang.String.valueOf(r13)
            int r0 = r13.length()
            if (r0 == 0) goto L_0x012f
            java.lang.String r0 = "Remote exception: "
            r0.concat(r13)
            goto L_0x012f
        L_0x010c:
            boolean r0 = r12.f234741d
            if (r0 == 0) goto L_0x012f
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r13 = r13.length()
            int r13 = r13 + 28
            r0.<init>(r13)
            goto L_0x012f
        L_0x0120:
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r13 = r13.length()
            int r13 = r13 + 62
            r0.<init>(r13)
        L_0x012f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.search.verification.client.SearchActionVerificationClientService.onHandleIntent(android.content.Intent):void");
    }
}
