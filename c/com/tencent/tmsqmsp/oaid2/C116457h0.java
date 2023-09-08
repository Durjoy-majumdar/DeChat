package com.tencent.tmsqmsp.oaid2;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.tencent.tmsqmsp.oaid2.C116453g0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.tencent.tmsqmsp.oaid2.h0 */
public class C116457h0 {

    /* renamed from: f */
    public static final C116457h0 f349375f = new C116457h0();

    /* renamed from: a */
    public C116453g0 f349376a;

    /* renamed from: b */
    public String f349377b;

    /* renamed from: c */
    public String f349378c;

    /* renamed from: d */
    public final Object f349379d = new Object();

    /* renamed from: e */
    public ServiceConnection f349380e = new C116458a();

    /* renamed from: com.tencent.tmsqmsp.oaid2.h0$a */
    public class C116458a implements ServiceConnection {
        public C116458a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C116457h0.this.f349376a = C116453g0.C116454a.m164163a(iBinder);
            synchronized (C116457h0.this.f349379d) {
                C116457h0.this.f349379d.notify();
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C116457h0.this.f349376a = null;
        }
    }

    /* renamed from: a */
    public boolean mo179895a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 0);
            if (Build.VERSION.SDK_INT >= 28) {
                if (packageInfo == null) {
                    return false;
                }
                if (packageInfo.getLongVersionCode() < 1) {
                    return false;
                }
            } else if (packageInfo == null || packageInfo.versionCode <= 0) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public final String mo179896b(Context context, String str) {
        Signature[] signatureArr;
        if (TextUtils.isEmpty(this.f349377b)) {
            this.f349377b = context.getPackageName();
        }
        if (TextUtils.isEmpty(this.f349378c)) {
            String str2 = null;
            try {
                signatureArr = context.getPackageManager().getPackageInfo(this.f349377b, 64).signatures;
            } catch (PackageManager.NameNotFoundException unused) {
                signatureArr = null;
            }
            if (signatureArr != null && signatureArr.length > 0) {
                byte[] byteArray = signatureArr[0].toByteArray();
                try {
                    MessageDigest instance = MessageDigest.getInstance(AndroidUtilsLight.DIGEST_ALGORITHM_SHA1);
                    if (instance != null) {
                        byte[] digest = instance.digest(byteArray);
                        StringBuilder sb = new StringBuilder();
                        for (byte b : digest) {
                            sb.append(Integer.toHexString((b & ExifInterface.MARKER) | 256).substring(1, 3));
                        }
                        str2 = sb.toString();
                    }
                } catch (NoSuchAlgorithmException unused2) {
                }
            }
            this.f349378c = str2;
        }
        String a = ((C116453g0.C116454a.C116455a) this.f349376a).mo179891a(this.f349377b, this.f349378c, str);
        return TextUtils.isEmpty(a) ? "" : a;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003b */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo179894a(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch:{ all -> 0x005a }
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x005a }
            if (r0 == r1) goto L_0x0052
            com.tencent.tmsqmsp.oaid2.g0 r0 = r4.f349376a     // Catch:{ all -> 0x005a }
            if (r0 != 0) goto L_0x0049
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x005a }
            r0.<init>()     // Catch:{ all -> 0x005a }
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch:{ all -> 0x005a }
            java.lang.String r2 = "com.heytap.openid"
            java.lang.String r3 = "com.heytap.openid.IdentifyService"
            r1.<init>(r2, r3)     // Catch:{ all -> 0x005a }
            r0.setComponent(r1)     // Catch:{ all -> 0x005a }
            java.lang.String r1 = "action.com.heytap.openid.OPEN_ID_SERVICE"
            r0.setAction(r1)     // Catch:{ all -> 0x005a }
            android.content.ServiceConnection r1 = r4.f349380e     // Catch:{ all -> 0x005a }
            r2 = 1
            boolean r0 = r5.bindService(r0, r1, r2)     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x003f
            java.lang.Object r0 = r4.f349379d     // Catch:{ all -> 0x005a }
            monitor-enter(r0)     // Catch:{ all -> 0x005a }
            java.lang.Object r1 = r4.f349379d     // Catch:{ InterruptedException -> 0x003b }
            r2 = 3000(0xbb8, double:1.482E-320)
            r1.wait(r2)     // Catch:{ InterruptedException -> 0x003b }
            goto L_0x003b
        L_0x0039:
            r5 = move-exception
            goto L_0x003d
        L_0x003b:
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            goto L_0x003f
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            throw r5     // Catch:{ all -> 0x005a }
        L_0x003f:
            com.tencent.tmsqmsp.oaid2.g0 r0 = r4.f349376a     // Catch:{ all -> 0x005a }
            if (r0 != 0) goto L_0x0044
            goto L_0x004e
        L_0x0044:
            java.lang.String r5 = r4.mo179896b(r5, r6)     // Catch:{ Exception -> 0x004e }
            goto L_0x0050
        L_0x0049:
            java.lang.String r5 = r4.mo179896b(r5, r6)     // Catch:{ Exception -> 0x004e }
            goto L_0x0050
        L_0x004e:
            java.lang.String r5 = ""
        L_0x0050:
            monitor-exit(r4)     // Catch:{ all -> 0x005a }
            return r5
        L_0x0052:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x005a }
            java.lang.String r6 = "Cannot run on MainThread"
            r5.<init>(r6)     // Catch:{ all -> 0x005a }
            throw r5     // Catch:{ all -> 0x005a }
        L_0x005a:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x005a }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmsqmsp.oaid2.C116457h0.mo179894a(android.content.Context, java.lang.String):java.lang.String");
    }
}
