package com.google.android.gms.iid;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.common.util.AndroidUtilsLight;
import java.io.IOException;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p1042u.C111055b;

@Deprecated
public class InstanceID {
    public static final String ERROR_MAIN_THREAD = "MAIN_THREAD";
    public static final String ERROR_MISSING_INSTANCEID_SERVICE = "MISSING_INSTANCEID_SERVICE";
    public static final String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";
    public static final String ERROR_TIMEOUT = "TIMEOUT";
    private static Map<String, InstanceID> zzbq = new C111055b();
    private static long zzbr = TimeUnit.DAYS.toSeconds(7);
    private static zzak zzbs;
    private static zzaf zzbt;
    private static String zzbu;
    private String zzbv = "";
    private Context zzk;

    private InstanceID(Context context, String str) {
        this.zzk = context.getApplicationContext();
        this.zzbv = str;
    }

    @Deprecated
    public static InstanceID getInstance(Context context) {
        return getInstance(context, (Bundle) null);
    }

    public static synchronized InstanceID getInstance(Context context, Bundle bundle) {
        InstanceID instanceID;
        synchronized (InstanceID.class) {
            String string = bundle == null ? "" : bundle.getString("subtype");
            if (string == null) {
                string = "";
            }
            Context applicationContext = context.getApplicationContext();
            if (zzbs == null) {
                new StringBuilder(String.valueOf(applicationContext.getPackageName()).length() + 73);
                zzbs = new zzak(applicationContext);
                zzbt = new zzaf(applicationContext);
            }
            zzbu = Integer.toString(zzg(applicationContext));
            instanceID = zzbq.get(string);
            if (instanceID == null) {
                instanceID = new InstanceID(applicationContext, string);
                zzbq.put(string, instanceID);
            }
        }
        return instanceID;
    }

    private final KeyPair getKeyPair() {
        return zzbs.zzj(this.zzbv).getKeyPair();
    }

    public static String zzd(KeyPair keyPair) {
        try {
            byte[] digest = MessageDigest.getInstance(AndroidUtilsLight.DIGEST_ALGORITHM_SHA1).digest(keyPair.getPublic().getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static int zzg(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            new StringBuilder(String.valueOf(e).length() + 38);
            return 0;
        }
    }

    public static String zzh(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            new StringBuilder(String.valueOf(e).length() + 38);
            return null;
        }
    }

    public static zzak zzn() {
        return zzbs;
    }

    @Deprecated
    public void deleteInstanceID() {
        zzd("*", "*", (Bundle) null);
        zzm();
    }

    @Deprecated
    public void deleteToken(String str, String str2) {
        zzd(str, str2, (Bundle) null);
    }

    @Deprecated
    public long getCreationTime() {
        return zzbs.zzj(this.zzbv).getCreationTime();
    }

    @Deprecated
    public String getId() {
        return zzd(getKeyPair());
    }

    public String getSubtype() {
        return this.zzbv;
    }

    @Deprecated
    public String getToken(String str, String str2) {
        return getToken(str, str2, (Bundle) null);
    }

    @Deprecated
    public String getToken(String str, String str2, Bundle bundle) {
        String str3;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            String str4 = null;
            String str5 = zzbs.get("appVersion");
            boolean z = true;
            if (!(str5 == null || !str5.equals(zzbu) || (str3 = zzbs.get("lastToken")) == null)) {
                if ((System.currentTimeMillis() / 1000) - Long.valueOf(Long.parseLong(str3)).longValue() <= zzbr) {
                    z = false;
                }
            }
            if (!z) {
                str4 = zzbs.zze(this.zzbv, str, str2);
            }
            if (str4 != null) {
                return str4;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            String zze = zze(str, str2, bundle);
            if (zze != null) {
                zzbs.zzd(this.zzbv, str, str2, zze, zzbu);
            }
            return zze;
        }
        throw new IOException("MAIN_THREAD");
    }

    public final void zzd(String str, String str2, Bundle bundle) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            zzbs.zzf(this.zzbv, str, str2);
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("sender", str);
            if (str2 != null) {
                bundle.putString("scope", str2);
            }
            bundle.putString("subscription", str);
            bundle.putString("delete", "1");
            bundle.putString("X-delete", "1");
            bundle.putString("subtype", "".equals(this.zzbv) ? str : this.zzbv);
            if (!"".equals(this.zzbv)) {
                str = this.zzbv;
            }
            bundle.putString("X-subtype", str);
            zzaf.zzi(zzbt.zzd(bundle, getKeyPair()));
            return;
        }
        throw new IOException("MAIN_THREAD");
    }

    public final String zze(String str, String str2, Bundle bundle) {
        if (str2 != null) {
            bundle.putString("scope", str2);
        }
        bundle.putString("sender", str);
        String str3 = "".equals(this.zzbv) ? str : this.zzbv;
        if (!bundle.containsKey("legacy.register")) {
            bundle.putString("subscription", str);
            bundle.putString("subtype", str3);
            bundle.putString("X-subscription", str);
            bundle.putString("X-subtype", str3);
        }
        String zzi = zzaf.zzi(zzbt.zzd(bundle, getKeyPair()));
        if (!"RST".equals(zzi) && !zzi.startsWith("RST|")) {
            return zzi;
        }
        InstanceIDListenerService.zzd(this.zzk, zzbs);
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    public final void zzm() {
        zzbs.zzk(this.zzbv);
    }
}
