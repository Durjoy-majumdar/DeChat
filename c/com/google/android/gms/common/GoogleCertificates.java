package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.ICertData;
import com.google.android.gms.common.internal.IGoogleCertificatesApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.tencent.kinda.framework.app.KindaConfigCacheStg;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

final class GoogleCertificates {
    private static volatile IGoogleCertificatesApi zzax;
    private static final Object zzay = new Object();
    private static Context zzaz;
    private static Set<ICertData> zzba;
    private static Set<ICertData> zzbb;

    public static abstract class CertData extends ICertData.Stub {
        private int zzbc;

        public CertData(byte[] bArr) {
            Preconditions.checkArgument(bArr.length == 25);
            this.zzbc = Arrays.hashCode(bArr);
        }

        public static byte[] zzd(String str) {
            try {
                return str.getBytes(KindaConfigCacheStg.SAVE_CHARSET);
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }

        public boolean equals(Object obj) {
            IObjectWrapper bytesWrapped;
            if (obj != null && (obj instanceof ICertData)) {
                try {
                    ICertData iCertData = (ICertData) obj;
                    if (iCertData.getHashCode() != hashCode() || (bytesWrapped = iCertData.getBytesWrapped()) == null) {
                        return false;
                    }
                    return Arrays.equals(getBytes(), (byte[]) ObjectWrapper.unwrap(bytesWrapped));
                } catch (RemoteException unused) {
                }
            }
            return false;
        }

        public abstract byte[] getBytes();

        public IObjectWrapper getBytesWrapped() {
            return ObjectWrapper.wrap(getBytes());
        }

        public int getHashCode() {
            return hashCode();
        }

        public int hashCode() {
            return this.zzbc;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void init(android.content.Context r2) {
        /*
            java.lang.Class<com.google.android.gms.common.GoogleCertificates> r0 = com.google.android.gms.common.GoogleCertificates.class
            monitor-enter(r0)
            android.content.Context r1 = zzaz     // Catch:{ all -> 0x0013 }
            if (r1 != 0) goto L_0x0011
            if (r2 == 0) goto L_0x0011
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0013 }
            zzaz = r2     // Catch:{ all -> 0x0013 }
            monitor-exit(r0)
            return
        L_0x0011:
            monitor-exit(r0)
            return
        L_0x0013:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleCertificates.init(android.content.Context):void");
    }

    public static zzg zza(String str, CertData certData, boolean z) {
        String str2;
        try {
            zzc();
            Preconditions.checkNotNull(zzaz);
            try {
                if (zzax.isGoogleOrPlatformSigned(new GoogleCertificatesQuery(str, certData, z), ObjectWrapper.wrap(zzaz.getPackageManager()))) {
                    return zzg.zzg();
                }
                boolean z2 = true;
                if (z || !zza(str, certData, true).zzbl) {
                    z2 = false;
                }
                return zzg.zza(str, certData, z, z2);
            } catch (RemoteException e) {
                e = e;
                str2 = "module call";
                return zzg.zza(str2, e);
            }
        } catch (DynamiteModule.LoadingException e2) {
            e = e2;
            str2 = "module init";
            return zzg.zza(str2, e);
        }
    }

    private static Set<ICertData> zza(IBinder[] iBinderArr) {
        HashSet hashSet = new HashSet(r0);
        for (IBinder asInterface : iBinderArr) {
            ICertData asInterface2 = ICertData.Stub.asInterface(asInterface);
            if (asInterface2 != null) {
                hashSet.add(asInterface2);
            }
        }
        return hashSet;
    }

    private static void zzc() {
        if (zzax == null) {
            Preconditions.checkNotNull(zzaz);
            synchronized (zzay) {
                if (zzax == null) {
                    zzax = IGoogleCertificatesApi.Stub.asInterface(DynamiteModule.load(zzaz, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.googlecertificates").instantiate("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:19|20|21|22) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:23|24|25|26) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r1 = java.util.Collections.emptySet();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002d, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r1 = java.util.Collections.emptySet();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0033, code lost:
        return r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0028 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x002e */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:19:0x0028=Splitter:B:19:0x0028, B:23:0x002e=Splitter:B:23:0x002e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.util.Set<com.google.android.gms.common.internal.ICertData> zzd() {
        /*
            java.lang.Class<com.google.android.gms.common.GoogleCertificates> r0 = com.google.android.gms.common.GoogleCertificates.class
            monitor-enter(r0)
            java.util.Set<com.google.android.gms.common.internal.ICertData> r1 = zzba     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)
            return r1
        L_0x0009:
            zzc()     // Catch:{ LoadingException -> 0x002e }
            com.google.android.gms.common.internal.IGoogleCertificatesApi r1 = zzax     // Catch:{ RemoteException -> 0x0028 }
            com.google.android.gms.dynamic.IObjectWrapper r1 = r1.getGoogleCertificates()     // Catch:{ RemoteException -> 0x0028 }
            if (r1 != 0) goto L_0x001a
            java.util.Set r1 = java.util.Collections.emptySet()     // Catch:{ RemoteException -> 0x0028 }
            monitor-exit(r0)
            return r1
        L_0x001a:
            java.lang.Object r1 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r1)     // Catch:{ RemoteException -> 0x0028 }
            android.os.IBinder[] r1 = (android.os.IBinder[]) r1     // Catch:{ RemoteException -> 0x0028 }
            java.util.Set r1 = zza(r1)     // Catch:{ RemoteException -> 0x0028 }
            zzba = r1     // Catch:{ RemoteException -> 0x0028 }
            monitor-exit(r0)
            return r1
        L_0x0028:
            java.util.Set r1 = java.util.Collections.emptySet()     // Catch:{ all -> 0x0034 }
            monitor-exit(r0)
            return r1
        L_0x002e:
            java.util.Set r1 = java.util.Collections.emptySet()     // Catch:{ all -> 0x0034 }
            monitor-exit(r0)
            return r1
        L_0x0034:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleCertificates.zzd():java.util.Set");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:19|20|21|22) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:23|24|25|26) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r1 = java.util.Collections.emptySet();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002d, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r1 = java.util.Collections.emptySet();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0033, code lost:
        return r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0028 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x002e */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:19:0x0028=Splitter:B:19:0x0028, B:23:0x002e=Splitter:B:23:0x002e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.util.Set<com.google.android.gms.common.internal.ICertData> zze() {
        /*
            java.lang.Class<com.google.android.gms.common.GoogleCertificates> r0 = com.google.android.gms.common.GoogleCertificates.class
            monitor-enter(r0)
            java.util.Set<com.google.android.gms.common.internal.ICertData> r1 = zzbb     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)
            return r1
        L_0x0009:
            zzc()     // Catch:{ LoadingException -> 0x002e }
            com.google.android.gms.common.internal.IGoogleCertificatesApi r1 = zzax     // Catch:{ RemoteException -> 0x0028 }
            com.google.android.gms.dynamic.IObjectWrapper r1 = r1.getGoogleReleaseCertificates()     // Catch:{ RemoteException -> 0x0028 }
            if (r1 != 0) goto L_0x001a
            java.util.Set r1 = java.util.Collections.emptySet()     // Catch:{ RemoteException -> 0x0028 }
            monitor-exit(r0)
            return r1
        L_0x001a:
            java.lang.Object r1 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r1)     // Catch:{ RemoteException -> 0x0028 }
            android.os.IBinder[] r1 = (android.os.IBinder[]) r1     // Catch:{ RemoteException -> 0x0028 }
            java.util.Set r1 = zza(r1)     // Catch:{ RemoteException -> 0x0028 }
            zzbb = r1     // Catch:{ RemoteException -> 0x0028 }
            monitor-exit(r0)
            return r1
        L_0x0028:
            java.util.Set r1 = java.util.Collections.emptySet()     // Catch:{ all -> 0x0034 }
            monitor-exit(r0)
            return r1
        L_0x002e:
            java.util.Set r1 = java.util.Collections.emptySet()     // Catch:{ all -> 0x0034 }
            monitor-exit(r0)
            return r1
        L_0x0034:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleCertificates.zze():java.util.Set");
    }
}
