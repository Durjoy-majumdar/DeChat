package com.tencent.wework.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.tencent.wework.api.IWWAPI;
import com.tencent.wework.api.model.BaseMessage;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WWAPIImpl implements IWWAPI {

    /* renamed from: d */
    public static final /* synthetic */ int f285788d = 0;

    /* renamed from: a */
    public Context f285789a;

    /* renamed from: b */
    public Map<String, Object> f285790b = new HashMap();

    /* renamed from: c */
    public SharedPreferences f285791c;

    static {
        new ArrayList<String>() {
            {
                add("com.tencent.weworklocal");
                add("com.tencent.wework");
                add("com.tencent.wwgovernment");
            }
        };
        new ArrayList<String>() {
            {
                add("com.tencent.wework");
            }
        };
    }

    public WWAPIImpl(Context context) {
        new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                try {
                    WWAPIImpl wWAPIImpl = WWAPIImpl.this;
                    int i = WWAPIImpl.f285788d;
                    wWAPIImpl.getClass();
                    intent.getScheme();
                    throw null;
                } catch (Throwable unused) {
                }
            }
        };
        this.f285791c = null;
        this.f285789a = context;
        this.f285791c = context.getSharedPreferences("wxwork_wwapi_store", 0);
    }

    /* renamed from: f */
    public static String m125313f(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.reset();
            instance.update(bArr);
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder(digest.length * 2);
            for (byte b : digest) {
                sb.append(Integer.toHexString((b & 240) >>> 4));
                sb.append(Integer.toHexString(b & 15));
            }
            return sb.toString().toUpperCase();
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    /* renamed from: a */
    public boolean mo136603a(BaseMessage baseMessage, IWWAPI.WWAppType wWAppType) {
        return false;
    }

    /* renamed from: b */
    public String mo136604b(IWWAPI.WWAppType wWAppType) {
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001a A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo136605c() {
        /*
            r4 = this;
            java.lang.String r0 = "com.tencent.wework"
            r1 = 0
            android.content.Context r2 = r4.f285789a     // Catch:{ all -> 0x0015 }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ all -> 0x0015 }
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r0 = r2.getPackageInfo(r0, r3)     // Catch:{ all -> 0x0015 }
            if (r0 != 0) goto L_0x0012
            goto L_0x0015
        L_0x0012:
            int r0 = r0.versionCode     // Catch:{ all -> 0x0015 }
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            r2 = 20104(0x4e88, float:2.8172E-41)
            if (r0 <= r2) goto L_0x001b
            r1 = 1
        L_0x001b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wework.api.WWAPIImpl.mo136605c():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001a A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo136606d() {
        /*
            r4 = this;
            java.lang.String r0 = "com.tencent.wework"
            r1 = 0
            android.content.Context r2 = r4.f285789a     // Catch:{ all -> 0x0015 }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ all -> 0x0015 }
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r0 = r2.getPackageInfo(r0, r3)     // Catch:{ all -> 0x0015 }
            if (r0 != 0) goto L_0x0012
            goto L_0x0015
        L_0x0012:
            int r0 = r0.versionCode     // Catch:{ all -> 0x0015 }
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            r2 = 20104(0x4e88, float:2.8172E-41)
            if (r0 < r2) goto L_0x001b
            r1 = 1
        L_0x001b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wework.api.WWAPIImpl.mo136606d():boolean");
    }

    /* renamed from: e */
    public boolean mo136607e(IWWAPI.WWAppType wWAppType) {
        return false;
    }

    /* renamed from: g */
    public boolean mo136608g(String str) {
        String str2;
        try {
            str2 = m125313f(this.f285789a.getPackageManager().getPackageInfo(str, 64).signatures[0].toByteArray());
        } catch (Throwable unused) {
            str2 = "";
        }
        return "011A40266C8C75D181DDD8E4DDC50075".equals(str2);
    }
}
