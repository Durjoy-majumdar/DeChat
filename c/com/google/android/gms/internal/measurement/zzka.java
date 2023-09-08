package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.security.auth.x500.X500Principal;

public final class zzka extends zzhh {
    private static final String[] zzard = {"firebase_", "google_", "ga_"};
    private SecureRandom zzare;
    private final AtomicLong zzarf = new AtomicLong(0);
    private int zzarg;
    private Integer zzarh = null;

    public zzka(zzgl zzgl) {
        super(zzgl);
    }

    public static MessageDigest getMessageDigest(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static zzko zza(zzkn zzkn, String str) {
        for (zzko zzko : zzkn.zzata) {
            if (zzko.name.equals(str)) {
                return zzko;
            }
        }
        return null;
    }

    private static Object zza(int i, Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return zza(String.valueOf(obj), i, z);
            }
            return null;
        }
    }

    public static String zza(String str, int i, boolean z) {
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    public static String zza(String str, String[] strArr, String[] strArr2) {
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            if (zzs(str, strArr[i])) {
                return strArr2[i];
            }
        }
        return null;
    }

    private static void zza(Bundle bundle, Object obj) {
        Preconditions.checkNotNull(bundle);
        if (obj == null) {
            return;
        }
        if ((obj instanceof String) || (obj instanceof CharSequence)) {
            bundle.putLong("_el", (long) String.valueOf(obj).length());
        }
    }

    private static boolean zza(Bundle bundle, int i) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i);
        return true;
    }

    private final boolean zza(String str, String str2, int i, Object obj, boolean z) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                String valueOf = String.valueOf(obj);
                if (valueOf.codePointCount(0, valueOf.length()) > i) {
                    zzge().zzip().zzd("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                    return false;
                }
            } else if ((obj instanceof Bundle) && z) {
                return true;
            } else {
                if ((obj instanceof Parcelable[]) && z) {
                    for (Parcelable parcelable : (Parcelable[]) obj) {
                        if (!(parcelable instanceof Bundle)) {
                            zzge().zzip().zze("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str2);
                            return false;
                        }
                    }
                    return true;
                } else if (!(obj instanceof ArrayList) || !z) {
                    return false;
                } else {
                    ArrayList arrayList = (ArrayList) obj;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        if (!(obj2 instanceof Bundle)) {
                            zzge().zzip().zze("All ArrayList elements must be of type Bundle. Value type, name", obj2.getClass(), str2);
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return true;
    }

    public static boolean zza(long[] jArr, int i) {
        if (i >= (jArr.length << 6)) {
            return false;
        }
        return ((1 << (i % 64)) & jArr[i / 64]) != 0;
    }

    public static byte[] zza(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static long[] zza(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    jArr[i] = jArr[i] | (1 << i2);
                }
            }
        }
        return jArr;
    }

    public static zzko[] zza(zzko[] zzkoArr, String str, Object obj) {
        for (zzko zzko : zzkoArr) {
            if (str.equals(zzko.name)) {
                zzko.zzate = null;
                zzko.zzajf = null;
                zzko.zzarc = null;
                if (obj instanceof Long) {
                    zzko.zzate = (Long) obj;
                } else if (obj instanceof String) {
                    zzko.zzajf = (String) obj;
                } else if (obj instanceof Double) {
                    zzko.zzarc = (Double) obj;
                }
                return zzkoArr;
            }
        }
        zzko[] zzkoArr2 = new zzko[(zzkoArr.length + 1)];
        System.arraycopy(zzkoArr, 0, zzkoArr2, 0, zzkoArr.length);
        zzko zzko2 = new zzko();
        zzko2.name = str;
        if (obj instanceof Long) {
            zzko2.zzate = (Long) obj;
        } else if (obj instanceof String) {
            zzko2.zzajf = (String) obj;
        } else if (obj instanceof Double) {
            zzko2.zzarc = (Double) obj;
        }
        zzkoArr2[zzkoArr.length] = zzko2;
        return zzkoArr2;
    }

    public static Object zzb(zzkn zzkn, String str) {
        zzko zza = zza(zzkn, str);
        if (zza == null) {
            return null;
        }
        String str2 = zza.zzajf;
        if (str2 != null) {
            return str2;
        }
        Long l = zza.zzate;
        if (l != null) {
            return l;
        }
        Double d = zza.zzarc;
        if (d != null) {
            return d;
        }
        return null;
    }

    public static long zzc(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        int i = 0;
        Preconditions.checkState(bArr.length > 0);
        long j = 0;
        int length = bArr.length - 1;
        while (length >= 0 && length >= bArr.length - 8) {
            j += (((long) bArr[length]) & 255) << i;
            i += 8;
            length--;
        }
        return j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0008, code lost:
        r3 = r1.getServiceInfo(new android.content.ComponentName(r3, r4), 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean zzc(android.content.Context r3, java.lang.String r4) {
        /*
            r0 = 0
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r1 != 0) goto L_0x0008
            return r0
        L_0x0008:
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0019 }
            r2.<init>(r3, r4)     // Catch:{ NameNotFoundException -> 0x0019 }
            android.content.pm.ServiceInfo r3 = r1.getServiceInfo(r2, r0)     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r3 == 0) goto L_0x0019
            boolean r3 = r3.enabled     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r3 == 0) goto L_0x0019
            r3 = 1
            return r3
        L_0x0019:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzka.zzc(android.content.Context, java.lang.String):boolean");
    }

    public static boolean zzcc(String str) {
        Preconditions.checkNotEmpty(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    private static int zzch(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        return "_id".equals(str) ? 256 : 36;
    }

    public static boolean zzci(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean zzck(String str) {
        return str != null && str.matches("(\\+|-)?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static boolean zzcl(String str) {
        Preconditions.checkNotEmpty(str);
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case 94660:
                if (str.equals("_in")) {
                    c = 0;
                    break;
                }
                break;
            case 95025:
                if (str.equals("_ug")) {
                    c = 1;
                    break;
                }
                break;
            case 95027:
                if (str.equals("_ui")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
                return true;
            default:
                return false;
        }
    }

    public static boolean zzd(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    public static boolean zzd(zzeu zzeu, zzdz zzdz) {
        Preconditions.checkNotNull(zzeu);
        Preconditions.checkNotNull(zzdz);
        return !TextUtils.isEmpty(zzdz.zzadm);
    }

    private final boolean zze(Context context, String str) {
        zzfi zzfi;
        String str2;
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str, 64);
            if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (CertificateException e) {
            e = e;
            zzfi = zzge().zzim();
            str2 = "Error obtaining certificate";
            zzfi.zzg(str2, e);
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            e = e2;
            zzfi = zzge().zzim();
            str2 = "Package name not found";
            zzfi.zzg(str2, e);
            return true;
        }
    }

    public static Bundle[] zze(Object obj) {
        Object[] array;
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        }
        if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            array = Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else if (!(obj instanceof ArrayList)) {
            return null;
        } else {
            ArrayList arrayList = (ArrayList) obj;
            array = arrayList.toArray(new Bundle[arrayList.size()]);
        }
        return (Bundle[]) array;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0037 A[Catch:{ IOException | ClassNotFoundException -> 0x0040 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003c A[Catch:{ IOException | ClassNotFoundException -> 0x0040 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object zzf(java.lang.Object r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0032 }
            r1.<init>()     // Catch:{ all -> 0x0032 }
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0032 }
            r2.<init>(r1)     // Catch:{ all -> 0x0032 }
            r2.writeObject(r4)     // Catch:{ all -> 0x002f }
            r2.flush()     // Catch:{ all -> 0x002f }
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch:{ all -> 0x002f }
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x002f }
            byte[] r1 = r1.toByteArray()     // Catch:{ all -> 0x002f }
            r3.<init>(r1)     // Catch:{ all -> 0x002f }
            r4.<init>(r3)     // Catch:{ all -> 0x002f }
            java.lang.Object r1 = r4.readObject()     // Catch:{ all -> 0x002d }
            r2.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0040 }
            r4.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0040 }
            return r1
        L_0x002d:
            r1 = move-exception
            goto L_0x0035
        L_0x002f:
            r1 = move-exception
            r4 = r0
            goto L_0x0035
        L_0x0032:
            r1 = move-exception
            r4 = r0
            r2 = r4
        L_0x0035:
            if (r2 == 0) goto L_0x003a
            r2.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0040 }
        L_0x003a:
            if (r4 == 0) goto L_0x003f
            r4.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0040 }
        L_0x003f:
            throw r1     // Catch:{ IOException | ClassNotFoundException -> 0x0040 }
        L_0x0040:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzka.zzf(java.lang.Object):java.lang.Object");
    }

    private final boolean zzr(String str, String str2) {
        if (str2 == null) {
            zzge().zzim().zzg("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            zzge().zzim().zzg("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (Character.isLetter(codePointAt) || codePointAt == 95) {
                int length = str2.length();
                int charCount = Character.charCount(codePointAt);
                while (charCount < length) {
                    int codePointAt2 = str2.codePointAt(charCount);
                    if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                        charCount += Character.charCount(codePointAt2);
                    } else {
                        zzge().zzim().zze("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                return true;
            }
            zzge().zzim().zze("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
    }

    public static boolean zzs(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    public final Bundle zza(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str4 = uri.getQueryParameter("utm_campaign");
                str3 = uri.getQueryParameter("utm_source");
                str2 = uri.getQueryParameter("utm_medium");
                str = uri.getQueryParameter("gclid");
            } else {
                str4 = null;
                str3 = null;
                str2 = null;
                str = null;
            }
            if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString(FirebaseAnalytics.C113379b.CAMPAIGN, str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString(FirebaseAnalytics.C113379b.SOURCE, str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString(FirebaseAnalytics.C113379b.MEDIUM, str2);
            }
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("gclid", str);
            }
            String queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString(FirebaseAnalytics.C113379b.TERM, queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("content", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter(FirebaseAnalytics.C113379b.ACLID);
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString(FirebaseAnalytics.C113379b.ACLID, queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter(FirebaseAnalytics.C113379b.CP1);
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString(FirebaseAnalytics.C113379b.CP1, queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("anid", queryParameter5);
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            zzge().zzip().zzg("Install referrer url isn't a hierarchical URI", e);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        if (zza("event param", 40, r14) == false) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0128  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle zza(java.lang.String r18, android.os.Bundle r19, java.util.List<java.lang.String> r20, boolean r21, boolean r22) {
        /*
            r17 = this;
            r6 = r17
            r7 = r19
            r8 = r20
            r9 = 0
            if (r7 == 0) goto L_0x0160
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>(r7)
            java.util.Set r0 = r19.keySet()
            java.util.Iterator r11 = r0.iterator()
            r13 = 0
        L_0x0017:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x015e
            java.lang.Object r0 = r11.next()
            r14 = r0
            java.lang.String r14 = (java.lang.String) r14
            r15 = 40
            r0 = 3
            if (r8 == 0) goto L_0x0032
            boolean r1 = r8.contains(r14)
            if (r1 != 0) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r3 = 0
            goto L_0x006b
        L_0x0032:
            r1 = 14
            java.lang.String r2 = "event param"
            if (r21 == 0) goto L_0x0050
            boolean r3 = r6.zzq(r2, r14)
            if (r3 != 0) goto L_0x0040
        L_0x003e:
            r3 = 3
            goto L_0x0051
        L_0x0040:
            boolean r3 = r6.zza((java.lang.String) r2, (java.lang.String[]) r9, (java.lang.String) r14)
            if (r3 != 0) goto L_0x0049
            r3 = 14
            goto L_0x0051
        L_0x0049:
            boolean r3 = r6.zza((java.lang.String) r2, (int) r15, (java.lang.String) r14)
            if (r3 != 0) goto L_0x0050
            goto L_0x003e
        L_0x0050:
            r3 = 0
        L_0x0051:
            if (r3 != 0) goto L_0x006b
            boolean r3 = r6.zzr(r2, r14)
            if (r3 != 0) goto L_0x005b
        L_0x0059:
            r1 = 3
            goto L_0x006a
        L_0x005b:
            boolean r3 = r6.zza((java.lang.String) r2, (java.lang.String[]) r9, (java.lang.String) r14)
            if (r3 != 0) goto L_0x0062
            goto L_0x006a
        L_0x0062:
            boolean r1 = r6.zza((java.lang.String) r2, (int) r15, (java.lang.String) r14)
            if (r1 != 0) goto L_0x0069
            goto L_0x0059
        L_0x0069:
            r1 = 0
        L_0x006a:
            r3 = r1
        L_0x006b:
            java.lang.String r5 = "_ev"
            r4 = 1
            if (r3 == 0) goto L_0x0084
            boolean r1 = zza((android.os.Bundle) r10, (int) r3)
            if (r1 == 0) goto L_0x0157
            java.lang.String r1 = zza((java.lang.String) r14, (int) r15, (boolean) r4)
            r10.putString(r5, r1)
            if (r3 != r0) goto L_0x0157
            zza((android.os.Bundle) r10, (java.lang.Object) r14)
            goto L_0x0157
        L_0x0084:
            java.lang.Object r3 = r7.get(r14)
            r17.zzab()
            if (r22 == 0) goto L_0x00c2
            boolean r0 = r3 instanceof android.os.Parcelable[]
            if (r0 == 0) goto L_0x0096
            r0 = r3
            android.os.Parcelable[] r0 = (android.os.Parcelable[]) r0
            int r0 = r0.length
            goto L_0x00a1
        L_0x0096:
            boolean r0 = r3 instanceof java.util.ArrayList
            if (r0 == 0) goto L_0x00ba
            r0 = r3
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
        L_0x00a1:
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r0 <= r1) goto L_0x00ba
            com.google.android.gms.internal.measurement.zzfg r1 = r17.zzge()
            com.google.android.gms.internal.measurement.zzfi r1 = r1.zzip()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "Parameter array is too long; discarded. Value kind, name, array length"
            java.lang.String r4 = "param"
            r1.zzd(r2, r4, r14, r0)
            r0 = 0
            goto L_0x00bb
        L_0x00ba:
            r0 = 1
        L_0x00bb:
            if (r0 != 0) goto L_0x00c2
            r0 = 17
            r12 = r5
            r9 = 1
            goto L_0x0108
        L_0x00c2:
            com.google.android.gms.internal.measurement.zzef r0 = r17.zzgg()
            com.google.android.gms.internal.measurement.zzfb r1 = r17.zzfv()
            java.lang.String r1 = r1.zzah()
            boolean r0 = r0.zzaw(r1)
            if (r0 == 0) goto L_0x00da
            boolean r0 = zzci(r18)
            if (r0 != 0) goto L_0x00e0
        L_0x00da:
            boolean r0 = zzci(r14)
            if (r0 == 0) goto L_0x00f5
        L_0x00e0:
            r4 = 256(0x100, float:3.59E-43)
            java.lang.String r1 = "param"
            r0 = r17
            r2 = r14
            r16 = r3
            r3 = r4
            r9 = 1
            r4 = r16
            r12 = r5
        L_0x00ee:
            r5 = r22
            boolean r0 = r0.zza((java.lang.String) r1, (java.lang.String) r2, (int) r3, (java.lang.Object) r4, (boolean) r5)
            goto L_0x0103
        L_0x00f5:
            r16 = r3
            r12 = r5
            r9 = 1
            r3 = 100
            java.lang.String r1 = "param"
            r0 = r17
            r2 = r14
            r4 = r16
            goto L_0x00ee
        L_0x0103:
            if (r0 == 0) goto L_0x0107
            r0 = 0
            goto L_0x0108
        L_0x0107:
            r0 = 4
        L_0x0108:
            if (r0 == 0) goto L_0x0128
            boolean r1 = r12.equals(r14)
            if (r1 != 0) goto L_0x0128
            boolean r0 = zza((android.os.Bundle) r10, (int) r0)
            if (r0 == 0) goto L_0x0157
            java.lang.String r0 = zza((java.lang.String) r14, (int) r15, (boolean) r9)
            r10.putString(r12, r0)
            java.lang.Object r0 = r7.get(r14)
            zza((android.os.Bundle) r10, (java.lang.Object) r0)
            goto L_0x0157
        L_0x0125:
            r9 = 0
            goto L_0x0017
        L_0x0128:
            boolean r0 = zzcc(r14)
            if (r0 == 0) goto L_0x015b
            int r13 = r13 + 1
            r0 = 25
            if (r13 <= r0) goto L_0x015b
            com.google.android.gms.internal.measurement.zzfg r0 = r17.zzge()
            com.google.android.gms.internal.measurement.zzfi r0 = r0.zzim()
            com.google.android.gms.internal.measurement.zzfe r1 = r17.zzga()
            r2 = r18
            java.lang.String r1 = r1.zzbj(r2)
            com.google.android.gms.internal.measurement.zzfe r3 = r17.zzga()
            java.lang.String r3 = r3.zzb((android.os.Bundle) r7)
            java.lang.String r4 = "Event can't contain more than 25 params"
            r0.zze(r4, r1, r3)
            r0 = 5
            zza((android.os.Bundle) r10, (int) r0)
        L_0x0157:
            r10.remove(r14)
            goto L_0x0125
        L_0x015b:
            r2 = r18
            goto L_0x0125
        L_0x015e:
            r9 = r10
            goto L_0x0161
        L_0x0160:
            r9 = 0
        L_0x0161:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzka.zza(java.lang.String, android.os.Bundle, java.util.List, boolean, boolean):android.os.Bundle");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        zzge().zzim().log("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends android.os.Parcelable> T zza(byte[] r5, android.os.Parcelable.Creator<T> r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ ParseException -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ ParseException -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ ParseException -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ ParseException -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ ParseException -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002d
        L_0x001c:
            com.google.android.gms.internal.measurement.zzfg r5 = r4.zzge()     // Catch:{ all -> 0x001a }
            com.google.android.gms.internal.measurement.zzfi r5 = r5.zzim()     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.log(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002d:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzka.zza(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }

    public final zzeu zza(String str, Bundle bundle, String str2, long j, boolean z, boolean z2) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (zzcd(str) == 0) {
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            bundle3.putString("_o", str2);
            String str3 = str;
            return new zzeu(str3, new zzer(zzd(zza(str3, bundle3, (List<String>) CollectionUtils.listOf("_o"), false, false))), str2, j);
        }
        zzge().zzim().zzg("Invalid conditional property event name", zzga().zzbl(str));
        throw new IllegalArgumentException();
    }

    public final void zza(int i, String str, String str2, int i2) {
        zza((String) null, i, str, str2, i2);
    }

    public final void zza(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (str != null) {
                zzge().zziq().zze("Not putting event parameter. Invalid value type. name, type", zzga().zzbk(str), obj != null ? obj.getClass().getSimpleName() : null);
            }
        }
    }

    public final void zza(zzko zzko, Object obj) {
        Preconditions.checkNotNull(obj);
        zzko.zzajf = null;
        zzko.zzate = null;
        zzko.zzarc = null;
        if (obj instanceof String) {
            zzko.zzajf = (String) obj;
        } else if (obj instanceof Long) {
            zzko.zzate = (Long) obj;
        } else if (obj instanceof Double) {
            zzko.zzarc = (Double) obj;
        } else {
            zzge().zzim().zzg("Ignoring invalid (type) event param value", obj);
        }
    }

    public final void zza(zzks zzks, Object obj) {
        Preconditions.checkNotNull(obj);
        zzks.zzajf = null;
        zzks.zzate = null;
        zzks.zzarc = null;
        if (obj instanceof String) {
            zzks.zzajf = (String) obj;
        } else if (obj instanceof Long) {
            zzks.zzate = (Long) obj;
        } else if (obj instanceof Double) {
            zzks.zzarc = (Double) obj;
        } else {
            zzge().zzim().zzg("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public final void zza(String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        zza(bundle, i);
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        this.zzacw.zzfu().logEvent("auto", "_err", bundle);
    }

    public final boolean zza(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(zzbt().currentTimeMillis() - j) > j2;
    }

    public final boolean zza(String str, int i, String str2) {
        if (str2 == null) {
            zzge().zzim().zzg("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            zzge().zzim().zzd("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    public final boolean zza(String str, String[] strArr, String str2) {
        boolean z;
        boolean z2;
        if (str2 == null) {
            zzge().zzim().zzg("Name is required and can't be null. Type", str);
            return false;
        }
        Preconditions.checkNotNull(str2);
        int i = 0;
        while (true) {
            String[] strArr2 = zzard;
            if (i >= strArr2.length) {
                z = false;
                break;
            } else if (str2.startsWith(strArr2[i])) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            zzge().zzim().zze("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        }
        if (strArr != null) {
            Preconditions.checkNotNull(strArr);
            int i2 = 0;
            while (true) {
                if (i2 >= strArr.length) {
                    z2 = false;
                    break;
                } else if (zzs(str2, strArr[i2])) {
                    z2 = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                zzge().zzim().zze("Name is reserved. Type, name", str, str2);
                return false;
            }
        }
        return true;
    }

    public final byte[] zza(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            zzge().zzim().zzg("Failed to gzip content", e);
            throw e;
        }
    }

    public final /* bridge */ /* synthetic */ void zzab() {
        super.zzab();
    }

    public final byte[] zzb(zzkp zzkp) {
        try {
            int zzvm = zzkp.zzvm();
            byte[] bArr = new byte[zzvm];
            zzabw zzb = zzabw.zzb(bArr, 0, zzvm);
            zzkp.zza(zzb);
            zzb.zzve();
            return bArr;
        } catch (IOException e) {
            zzge().zzim().zzg("Data loss. Failed to serialize batch", e);
            return null;
        }
    }

    public final byte[] zzb(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            zzge().zzim().zzg("Failed to ungzip content", e);
            throw e;
        }
    }

    public final /* bridge */ /* synthetic */ Clock zzbt() {
        return super.zzbt();
    }

    public final int zzcd(String str) {
        if (!zzr("event", str)) {
            return 2;
        }
        if (!zza("event", AppMeasurement.Event.zzacx, str)) {
            return 13;
        }
        return !zza("event", 40, str) ? 2 : 0;
    }

    public final int zzce(String str) {
        if (!zzq("user property", str)) {
            return 6;
        }
        if (!zza("user property", AppMeasurement.UserProperty.zzadb, str)) {
            return 15;
        }
        return !zza("user property", 24, str) ? 6 : 0;
    }

    public final int zzcf(String str) {
        if (!zzr("user property", str)) {
            return 6;
        }
        if (!zza("user property", AppMeasurement.UserProperty.zzadb, str)) {
            return 15;
        }
        return !zza("user property", 24, str) ? 6 : 0;
    }

    public final boolean zzcg(String str) {
        if (TextUtils.isEmpty(str)) {
            zzge().zzim().log("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        Preconditions.checkNotNull(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        zzge().zzim().zzg("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", str);
        return false;
    }

    public final boolean zzcj(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return zzgg().zzhj().equals(str);
    }

    public final long zzd(Context context, String str) {
        zzab();
        Preconditions.checkNotNull(context);
        Preconditions.checkNotEmpty(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest messageDigest = getMessageDigest("MD5");
        if (messageDigest == null) {
            zzge().zzim().log("Could not get MD5 instance");
            return -1;
        }
        if (packageManager != null) {
            try {
                if (!zze(context, str)) {
                    Signature[] signatureArr = Wrappers.packageManager(context).getPackageInfo(getContext().getPackageName(), 64).signatures;
                    if (signatureArr != null && signatureArr.length > 0) {
                        return zzc(messageDigest.digest(signatureArr[0].toByteArray()));
                    }
                    zzge().zzip().log("Could not get signatures");
                    return -1;
                }
            } catch (PackageManager.NameNotFoundException e) {
                zzge().zzim().zzg("Package name not found", e);
            }
        }
        return 0;
    }

    public final Bundle zzd(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String next : bundle.keySet()) {
                Object zzh = zzh(next, bundle.get(next));
                if (zzh == null) {
                    zzge().zzip().zzg("Param value can't be null", zzga().zzbk(next));
                } else {
                    zza(bundle2, next, zzh);
                }
            }
        }
        return bundle2;
    }

    public final /* bridge */ /* synthetic */ void zzfr() {
        super.zzfr();
    }

    public final /* bridge */ /* synthetic */ void zzfs() {
        super.zzfs();
    }

    public final /* bridge */ /* synthetic */ zzdu zzft() {
        return super.zzft();
    }

    public final /* bridge */ /* synthetic */ zzhk zzfu() {
        return super.zzfu();
    }

    public final /* bridge */ /* synthetic */ zzfb zzfv() {
        return super.zzfv();
    }

    public final /* bridge */ /* synthetic */ zzeo zzfw() {
        return super.zzfw();
    }

    public final /* bridge */ /* synthetic */ zzii zzfx() {
        return super.zzfx();
    }

    public final /* bridge */ /* synthetic */ zzif zzfy() {
        return super.zzfy();
    }

    public final /* bridge */ /* synthetic */ zzfc zzfz() {
        return super.zzfz();
    }

    public final /* bridge */ /* synthetic */ zzfe zzga() {
        return super.zzga();
    }

    public final /* bridge */ /* synthetic */ zzka zzgb() {
        return super.zzgb();
    }

    public final /* bridge */ /* synthetic */ zzjh zzgc() {
        return super.zzgc();
    }

    public final /* bridge */ /* synthetic */ zzgg zzgd() {
        return super.zzgd();
    }

    public final /* bridge */ /* synthetic */ zzfg zzge() {
        return super.zzge();
    }

    public final /* bridge */ /* synthetic */ zzfr zzgf() {
        return super.zzgf();
    }

    public final /* bridge */ /* synthetic */ zzef zzgg() {
        return super.zzgg();
    }

    public final Object zzh(String str, Object obj) {
        boolean z;
        int i = 256;
        if ("_ev".equals(str)) {
            z = true;
        } else {
            if (!zzci(str)) {
                i = 100;
            }
            z = false;
        }
        return zza(i, obj, z);
    }

    public final boolean zzhf() {
        return true;
    }

    public final int zzi(String str, Object obj) {
        return "_ldl".equals(str) ? zza("user property referrer", str, zzch(str), obj, false) : zza("user property", str, zzch(str), obj, false) ? 0 : 7;
    }

    public final void zzih() {
        zzab();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                zzge().zzip().log("Utils falling back to Random for random id");
            }
        }
        this.zzarf.set(nextLong);
    }

    public final Object zzj(String str, Object obj) {
        return zza(zzch(str), obj, "_ldl".equals(str));
    }

    public final long zzlb() {
        int i = (this.zzarf.get() > 0 ? 1 : (this.zzarf.get() == 0 ? 0 : -1));
        synchronized (this.zzarf) {
            if (i == 0) {
                long nextLong = new Random(System.nanoTime() ^ zzbt().currentTimeMillis()).nextLong();
                int i2 = this.zzarg + 1;
                this.zzarg = i2;
                long j = nextLong + ((long) i2);
                return j;
            }
            this.zzarf.compareAndSet(-1, 1);
            long andIncrement = this.zzarf.getAndIncrement();
            return andIncrement;
        }
    }

    public final SecureRandom zzlc() {
        zzab();
        if (this.zzare == null) {
            this.zzare = new SecureRandom();
        }
        return this.zzare;
    }

    public final int zzld() {
        if (this.zzarh == null) {
            this.zzarh = Integer.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(getContext()) / 1000);
        }
        return this.zzarh.intValue();
    }

    public final boolean zzq(String str, String str2) {
        if (str2 == null) {
            zzge().zzim().zzg("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            zzge().zzim().zzg("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                zzge().zzim().zze("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    zzge().zzim().zze("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    public final boolean zzx(String str) {
        zzab();
        if (Wrappers.packageManager(getContext()).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        zzge().zzis().zzg("Permission not granted", str);
        return false;
    }
}
