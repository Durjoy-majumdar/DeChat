package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.ads_identifier.zze;
import com.google.android.gms.internal.ads_identifier.zzf;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class AdvertisingIdClient {
    private final Context mContext;
    private BlockingServiceConnection zze;
    private zze zzf;
    private boolean zzg;
    private final Object zzh;
    private zza zzi;
    private final boolean zzj;
    private final long zzk;

    public static final class Info {
        private final String zzq;
        private final boolean zzr;

        public Info(String str, boolean z) {
            this.zzq = str;
            this.zzr = z;
        }

        public final String getId() {
            return this.zzq;
        }

        public final boolean isLimitAdTrackingEnabled() {
            return this.zzr;
        }

        public final String toString() {
            String str = this.zzq;
            boolean z = this.zzr;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    public static class zza extends Thread {
        private WeakReference<AdvertisingIdClient> zzm;
        private long zzn;
        public CountDownLatch zzo = new CountDownLatch(1);
        public boolean zzp = false;

        public zza(AdvertisingIdClient advertisingIdClient, long j) {
            this.zzm = new WeakReference<>(advertisingIdClient);
            this.zzn = j;
            start();
        }

        private final void disconnect() {
            AdvertisingIdClient advertisingIdClient = this.zzm.get();
            if (advertisingIdClient != null) {
                advertisingIdClient.finish();
                this.zzp = true;
            }
        }

        public final void run() {
            try {
                if (!this.zzo.await(this.zzn, TimeUnit.MILLISECONDS)) {
                    disconnect();
                }
            } catch (InterruptedException unused) {
                disconnect();
            }
        }
    }

    public AdvertisingIdClient(Context context) {
        this(context, 30000, false, false);
    }

    private AdvertisingIdClient(Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        this.zzh = new Object();
        Preconditions.checkNotNull(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.mContext = context;
        this.zzg = false;
        this.zzk = j;
        this.zzj = z2;
    }

    public static Info getAdvertisingIdInfo(Context context) {
        zzb zzb = new zzb(context);
        boolean z = zzb.getBoolean("gads:ad_id_app_context:enabled", false);
        float f = zzb.getFloat("gads:ad_id_app_context:ping_ratio", 0.0f);
        String string = zzb.getString("gads:ad_id_use_shared_preference:experiment_id", "");
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1, z, zzb.getBoolean("gads:ad_id_use_persistent_service:enabled", false));
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.zza(false);
            Info info = advertisingIdClient.getInfo();
            advertisingIdClient.zza(info, z, f, SystemClock.elapsedRealtime() - elapsedRealtime, string, (Throwable) null);
            advertisingIdClient.finish();
            return info;
        } catch (Throwable th) {
            advertisingIdClient.finish();
            throw th;
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(Context context) {
        zzb zzb = new zzb(context);
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1, zzb.getBoolean("gads:ad_id_app_context:enabled", false), zzb.getBoolean("com.google.android.gms.ads.identifier.service.PERSISTENT_START", false));
        try {
            advertisingIdClient.zza(false);
            return advertisingIdClient.zzb();
        } finally {
            advertisingIdClient.finish();
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
    }

    private static BlockingServiceConnection zza(Context context, boolean z) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int isGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            if (isGooglePlayServicesAvailable == 0 || isGooglePlayServicesAvailable == 2) {
                String str = z ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
                BlockingServiceConnection blockingServiceConnection = new BlockingServiceConnection();
                Intent intent = new Intent(str);
                intent.setPackage("com.google.android.gms");
                try {
                    if (ConnectionTracker.getInstance().bindService(context, intent, blockingServiceConnection, 1)) {
                        return blockingServiceConnection;
                    }
                    throw new IOException("Connection failure");
                } catch (Throwable th) {
                    throw new IOException(th);
                }
            } else {
                throw new IOException("Google Play services not available");
            }
        } catch (PackageManager.NameNotFoundException unused) {
            throw new GooglePlayServicesNotAvailableException(9);
        }
    }

    private static zze zza(Context context, BlockingServiceConnection blockingServiceConnection) {
        try {
            return zzf.zza(blockingServiceConnection.getServiceWithTimeout(10000, TimeUnit.MILLISECONDS));
        } catch (InterruptedException unused) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:5|6|7)|8|9|(1:11)|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0011 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zza() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.zzh
            monitor-enter(r0)
            com.google.android.gms.ads.identifier.AdvertisingIdClient$zza r1 = r6.zzi     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x0011
            java.util.concurrent.CountDownLatch r1 = r1.zzo     // Catch:{ all -> 0x0024 }
            r1.countDown()     // Catch:{ all -> 0x0024 }
            com.google.android.gms.ads.identifier.AdvertisingIdClient$zza r1 = r6.zzi     // Catch:{ InterruptedException -> 0x0011 }
            r1.join()     // Catch:{ InterruptedException -> 0x0011 }
        L_0x0011:
            long r1 = r6.zzk     // Catch:{ all -> 0x0024 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0022
            com.google.android.gms.ads.identifier.AdvertisingIdClient$zza r1 = new com.google.android.gms.ads.identifier.AdvertisingIdClient$zza     // Catch:{ all -> 0x0024 }
            long r2 = r6.zzk     // Catch:{ all -> 0x0024 }
            r1.<init>(r6, r2)     // Catch:{ all -> 0x0024 }
            r6.zzi = r1     // Catch:{ all -> 0x0024 }
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            return
        L_0x0024:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.zza():void");
    }

    private final void zza(boolean z) {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.zzg) {
                finish();
            }
            BlockingServiceConnection zza2 = zza(this.mContext, this.zzj);
            this.zze = zza2;
            this.zzf = zza(this.mContext, zza2);
            this.zzg = true;
            if (z) {
                zza();
            }
        }
    }

    private final boolean zza(Info info, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > ((double) f)) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String str2 = "1";
        hashMap.put("app_context", z ? str2 : "0");
        if (info != null) {
            if (!info.isLimitAdTrackingEnabled()) {
                str2 = "0";
            }
            hashMap.put("limit_ad_tracking", str2);
        }
        if (!(info == null || info.getId() == null)) {
            hashMap.put("ad_id_size", Integer.toString(info.getId().length()));
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            hashMap.put("experiment_id", str);
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j));
        new zza(this, hashMap).start();
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:39|40|41) */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0057, code lost:
        throw new java.io.IOException("Remote exception");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0050 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzb() {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.Preconditions.checkNotMainThread(r0)
            monitor-enter(r3)
            boolean r0 = r3.zzg     // Catch:{ all -> 0x0058 }
            if (r0 != 0) goto L_0x003b
            java.lang.Object r0 = r3.zzh     // Catch:{ all -> 0x0058 }
            monitor-enter(r0)     // Catch:{ all -> 0x0058 }
            com.google.android.gms.ads.identifier.AdvertisingIdClient$zza r1 = r3.zzi     // Catch:{ all -> 0x0038 }
            if (r1 == 0) goto L_0x0030
            boolean r1 = r1.zzp     // Catch:{ all -> 0x0038 }
            if (r1 == 0) goto L_0x0030
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            r0 = 0
            r3.zza(r0)     // Catch:{ Exception -> 0x0027 }
            boolean r0 = r3.zzg     // Catch:{ all -> 0x0058 }
            if (r0 == 0) goto L_0x001f
            goto L_0x003b
        L_0x001f:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0058 }
            java.lang.String r1 = "AdvertisingIdClient cannot reconnect."
            r0.<init>(r1)     // Catch:{ all -> 0x0058 }
            throw r0     // Catch:{ all -> 0x0058 }
        L_0x0027:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0058 }
            java.lang.String r2 = "AdvertisingIdClient cannot reconnect."
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0058 }
            throw r1     // Catch:{ all -> 0x0058 }
        L_0x0030:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0038 }
            java.lang.String r2 = "AdvertisingIdClient is not connected."
            r1.<init>(r2)     // Catch:{ all -> 0x0038 }
            throw r1     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            throw r1     // Catch:{ all -> 0x0058 }
        L_0x003b:
            com.google.android.gms.common.BlockingServiceConnection r0 = r3.zze     // Catch:{ all -> 0x0058 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch:{ all -> 0x0058 }
            com.google.android.gms.internal.ads_identifier.zze r0 = r3.zzf     // Catch:{ all -> 0x0058 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch:{ all -> 0x0058 }
            com.google.android.gms.internal.ads_identifier.zze r0 = r3.zzf     // Catch:{ RemoteException -> 0x0050 }
            boolean r0 = r0.zzc()     // Catch:{ RemoteException -> 0x0050 }
            monitor-exit(r3)     // Catch:{ all -> 0x0058 }
            r3.zza()
            return r0
        L_0x0050:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0058 }
            java.lang.String r1 = "Remote exception"
            r0.<init>(r1)     // Catch:{ all -> 0x0058 }
            throw r0     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0058 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.zzb():boolean");
    }

    public void finalize() {
        finish();
        super.finalize();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void finish() {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.Preconditions.checkNotMainThread(r0)
            monitor-enter(r3)
            android.content.Context r0 = r3.mContext     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0028
            com.google.android.gms.common.BlockingServiceConnection r0 = r3.zze     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x000f
            goto L_0x0028
        L_0x000f:
            boolean r0 = r3.zzg     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x001e
            com.google.android.gms.common.stats.ConnectionTracker r0 = com.google.android.gms.common.stats.ConnectionTracker.getInstance()     // Catch:{ all -> 0x001e }
            android.content.Context r1 = r3.mContext     // Catch:{ all -> 0x001e }
            com.google.android.gms.common.BlockingServiceConnection r2 = r3.zze     // Catch:{ all -> 0x001e }
            r0.unbindService(r1, r2)     // Catch:{ all -> 0x001e }
        L_0x001e:
            r0 = 0
            r3.zzg = r0     // Catch:{ all -> 0x002a }
            r0 = 0
            r3.zzf = r0     // Catch:{ all -> 0x002a }
            r3.zze = r0     // Catch:{ all -> 0x002a }
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            return
        L_0x0028:
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            return
        L_0x002a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.finish():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:39|40|41) */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0063, code lost:
        throw new java.io.IOException("Remote exception");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x005c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.ads.identifier.AdvertisingIdClient.Info getInfo() {
        /*
            r4 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.Preconditions.checkNotMainThread(r0)
            monitor-enter(r4)
            boolean r0 = r4.zzg     // Catch:{ all -> 0x0064 }
            if (r0 != 0) goto L_0x003b
            java.lang.Object r0 = r4.zzh     // Catch:{ all -> 0x0064 }
            monitor-enter(r0)     // Catch:{ all -> 0x0064 }
            com.google.android.gms.ads.identifier.AdvertisingIdClient$zza r1 = r4.zzi     // Catch:{ all -> 0x0038 }
            if (r1 == 0) goto L_0x0030
            boolean r1 = r1.zzp     // Catch:{ all -> 0x0038 }
            if (r1 == 0) goto L_0x0030
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            r0 = 0
            r4.zza(r0)     // Catch:{ Exception -> 0x0027 }
            boolean r0 = r4.zzg     // Catch:{ all -> 0x0064 }
            if (r0 == 0) goto L_0x001f
            goto L_0x003b
        L_0x001f:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0064 }
            java.lang.String r1 = "AdvertisingIdClient cannot reconnect."
            r0.<init>(r1)     // Catch:{ all -> 0x0064 }
            throw r0     // Catch:{ all -> 0x0064 }
        L_0x0027:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0064 }
            java.lang.String r2 = "AdvertisingIdClient cannot reconnect."
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0064 }
            throw r1     // Catch:{ all -> 0x0064 }
        L_0x0030:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0038 }
            java.lang.String r2 = "AdvertisingIdClient is not connected."
            r1.<init>(r2)     // Catch:{ all -> 0x0038 }
            throw r1     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            throw r1     // Catch:{ all -> 0x0064 }
        L_0x003b:
            com.google.android.gms.common.BlockingServiceConnection r0 = r4.zze     // Catch:{ all -> 0x0064 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch:{ all -> 0x0064 }
            com.google.android.gms.internal.ads_identifier.zze r0 = r4.zzf     // Catch:{ all -> 0x0064 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch:{ all -> 0x0064 }
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r0 = new com.google.android.gms.ads.identifier.AdvertisingIdClient$Info     // Catch:{ RemoteException -> 0x005c }
            com.google.android.gms.internal.ads_identifier.zze r1 = r4.zzf     // Catch:{ RemoteException -> 0x005c }
            java.lang.String r1 = r1.getId()     // Catch:{ RemoteException -> 0x005c }
            com.google.android.gms.internal.ads_identifier.zze r2 = r4.zzf     // Catch:{ RemoteException -> 0x005c }
            r3 = 1
            boolean r2 = r2.zzb(r3)     // Catch:{ RemoteException -> 0x005c }
            r0.<init>(r1, r2)     // Catch:{ RemoteException -> 0x005c }
            monitor-exit(r4)     // Catch:{ all -> 0x0064 }
            r4.zza()
            return r0
        L_0x005c:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0064 }
            java.lang.String r1 = "Remote exception"
            r0.<init>(r1)     // Catch:{ all -> 0x0064 }
            throw r0     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0064 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.getInfo():com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
    }

    public void start() {
        zza(true);
    }
}
