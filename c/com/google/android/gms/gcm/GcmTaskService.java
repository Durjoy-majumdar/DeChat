package com.google.android.gms.gcm;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.UidVerifier;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

public abstract class GcmTaskService extends Service {
    public static final String SERVICE_ACTION_EXECUTE_TASK = "com.google.android.gms.gcm.ACTION_TASK_READY";
    public static final String SERVICE_ACTION_INITIALIZE = "com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE";
    public static final String SERVICE_PERMISSION = "com.google.android.gms.permission.BIND_NETWORK_TASK_SERVICE";
    /* access modifiers changed from: private */
    public ComponentName componentName;
    /* access modifiers changed from: private */
    public final Object lock = new Object();
    /* access modifiers changed from: private */
    public int zzt;
    private ExecutorService zzu;
    private Messenger zzv;
    /* access modifiers changed from: private */
    public GcmNetworkManager zzw;

    public class zzd extends Handler {
        public zzd(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            Messenger messenger;
            if (UidVerifier.uidHasPackageName(GcmTaskService.this, message.sendingUid, "com.google.android.gms")) {
                int i = message.what;
                if (i == 1) {
                    Bundle data = message.getData();
                    if (!data.isEmpty() && (messenger = message.replyTo) != null) {
                        String string = data.getString("tag");
                        ArrayList parcelableArrayList = data.getParcelableArrayList("triggered_uris");
                        if (!GcmTaskService.this.zzg(string)) {
                            GcmTaskService.this.zzd(new zze(string, messenger, data.getBundle("extras"), (List<Uri>) parcelableArrayList));
                        }
                    }
                } else if (i != 2) {
                    if (i != 4) {
                        new StringBuilder(String.valueOf(message).length() + 31);
                    } else {
                        GcmTaskService.this.onInitializeTasks();
                    }
                } else if (Log.isLoggable("GcmTaskService", 3)) {
                    new StringBuilder(String.valueOf(message).length() + 45);
                }
            }
        }
    }

    public class zze implements Runnable {
        private final Bundle extras;
        private final String tag;
        private final zzg zzaa;
        private final Messenger zzab;
        private final List<Uri> zzz;

        public zze(String str, IBinder iBinder, Bundle bundle, List<Uri> list) {
            zzg zzg;
            this.tag = str;
            if (iBinder == null) {
                zzg = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gcm.INetworkTaskCallback");
                zzg = queryLocalInterface instanceof zzg ? (zzg) queryLocalInterface : new zzh(iBinder);
            }
            this.zzaa = zzg;
            this.extras = bundle;
            this.zzz = list;
            this.zzab = null;
        }

        public zze(String str, Messenger messenger, Bundle bundle, List<Uri> list) {
            this.tag = str;
            this.zzab = messenger;
            this.extras = bundle;
            this.zzz = list;
            this.zzaa = null;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x005a, code lost:
            return;
         */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:32:0x00dd=Splitter:B:32:0x00dd, B:18:0x008f=Splitter:B:18:0x008f} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void zze(int r6) {
            /*
                r5 = this;
                com.google.android.gms.gcm.GcmTaskService r0 = com.google.android.gms.gcm.GcmTaskService.this
                java.lang.Object r0 = r0.lock
                monitor-enter(r0)
                com.google.android.gms.gcm.GcmTaskService r1 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ RemoteException -> 0x00cc }
                com.google.android.gms.gcm.GcmNetworkManager r1 = r1.zzw     // Catch:{ RemoteException -> 0x00cc }
                java.lang.String r2 = r5.tag     // Catch:{ RemoteException -> 0x00cc }
                com.google.android.gms.gcm.GcmTaskService r3 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ RemoteException -> 0x00cc }
                android.content.ComponentName r3 = r3.componentName     // Catch:{ RemoteException -> 0x00cc }
                java.lang.String r3 = r3.getClassName()     // Catch:{ RemoteException -> 0x00cc }
                boolean r1 = r1.zzf(r2, r3)     // Catch:{ RemoteException -> 0x00cc }
                if (r1 == 0) goto L_0x005b
                com.google.android.gms.gcm.GcmTaskService r6 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0152 }
                com.google.android.gms.gcm.GcmNetworkManager r6 = r6.zzw     // Catch:{ all -> 0x0152 }
                java.lang.String r1 = r5.tag     // Catch:{ all -> 0x0152 }
                com.google.android.gms.gcm.GcmTaskService r2 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0152 }
                android.content.ComponentName r2 = r2.componentName     // Catch:{ all -> 0x0152 }
                java.lang.String r2 = r2.getClassName()     // Catch:{ all -> 0x0152 }
                r6.zze(r1, r2)     // Catch:{ all -> 0x0152 }
                boolean r6 = r5.zzf()     // Catch:{ all -> 0x0152 }
                if (r6 != 0) goto L_0x0059
                com.google.android.gms.gcm.GcmTaskService r6 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0152 }
                com.google.android.gms.gcm.GcmNetworkManager r6 = r6.zzw     // Catch:{ all -> 0x0152 }
                com.google.android.gms.gcm.GcmTaskService r1 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0152 }
                android.content.ComponentName r1 = r1.componentName     // Catch:{ all -> 0x0152 }
                java.lang.String r1 = r1.getClassName()     // Catch:{ all -> 0x0152 }
                boolean r6 = r6.zzf(r1)     // Catch:{ all -> 0x0152 }
                if (r6 != 0) goto L_0x0059
                com.google.android.gms.gcm.GcmTaskService r6 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0152 }
                int r1 = r6.zzt     // Catch:{ all -> 0x0152 }
                r6.stopSelf(r1)     // Catch:{ all -> 0x0152 }
            L_0x0059:
                monitor-exit(r0)     // Catch:{ all -> 0x0152 }
                return
            L_0x005b:
                boolean r1 = r5.zzf()     // Catch:{ RemoteException -> 0x00cc }
                if (r1 == 0) goto L_0x008a
                android.os.Messenger r1 = r5.zzab     // Catch:{ RemoteException -> 0x00cc }
                android.os.Message r2 = android.os.Message.obtain()     // Catch:{ RemoteException -> 0x00cc }
                r3 = 3
                r2.what = r3     // Catch:{ RemoteException -> 0x00cc }
                r2.arg1 = r6     // Catch:{ RemoteException -> 0x00cc }
                android.os.Bundle r6 = new android.os.Bundle     // Catch:{ RemoteException -> 0x00cc }
                r6.<init>()     // Catch:{ RemoteException -> 0x00cc }
                java.lang.String r3 = "component"
                com.google.android.gms.gcm.GcmTaskService r4 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ RemoteException -> 0x00cc }
                android.content.ComponentName r4 = r4.componentName     // Catch:{ RemoteException -> 0x00cc }
                r6.putParcelable(r3, r4)     // Catch:{ RemoteException -> 0x00cc }
                java.lang.String r3 = "tag"
                java.lang.String r4 = r5.tag     // Catch:{ RemoteException -> 0x00cc }
                r6.putString(r3, r4)     // Catch:{ RemoteException -> 0x00cc }
                r2.setData(r6)     // Catch:{ RemoteException -> 0x00cc }
                r1.send(r2)     // Catch:{ RemoteException -> 0x00cc }
                goto L_0x008f
            L_0x008a:
                com.google.android.gms.gcm.zzg r1 = r5.zzaa     // Catch:{ RemoteException -> 0x00cc }
                r1.zzf(r6)     // Catch:{ RemoteException -> 0x00cc }
            L_0x008f:
                com.google.android.gms.gcm.GcmTaskService r6 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0152 }
                com.google.android.gms.gcm.GcmNetworkManager r6 = r6.zzw     // Catch:{ all -> 0x0152 }
                java.lang.String r1 = r5.tag     // Catch:{ all -> 0x0152 }
                com.google.android.gms.gcm.GcmTaskService r2 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0152 }
                android.content.ComponentName r2 = r2.componentName     // Catch:{ all -> 0x0152 }
                java.lang.String r2 = r2.getClassName()     // Catch:{ all -> 0x0152 }
                r6.zze(r1, r2)     // Catch:{ all -> 0x0152 }
                boolean r6 = r5.zzf()     // Catch:{ all -> 0x0152 }
                if (r6 != 0) goto L_0x0115
                com.google.android.gms.gcm.GcmTaskService r6 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0152 }
                com.google.android.gms.gcm.GcmNetworkManager r6 = r6.zzw     // Catch:{ all -> 0x0152 }
                com.google.android.gms.gcm.GcmTaskService r1 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0152 }
                android.content.ComponentName r1 = r1.componentName     // Catch:{ all -> 0x0152 }
                java.lang.String r1 = r1.getClassName()     // Catch:{ all -> 0x0152 }
                boolean r6 = r6.zzf(r1)     // Catch:{ all -> 0x0152 }
                if (r6 != 0) goto L_0x0115
                com.google.android.gms.gcm.GcmTaskService r6 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0152 }
                int r1 = r6.zzt     // Catch:{ all -> 0x0152 }
            L_0x00c6:
                r6.stopSelf(r1)     // Catch:{ all -> 0x0152 }
                goto L_0x0115
            L_0x00ca:
                r6 = move-exception
                goto L_0x0117
            L_0x00cc:
                java.lang.String r6 = "Error reporting result of operation to scheduler for "
                java.lang.String r1 = r5.tag     // Catch:{ all -> 0x00ca }
                java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00ca }
                int r2 = r1.length()     // Catch:{ all -> 0x00ca }
                if (r2 == 0) goto L_0x00dd
                r6.concat(r1)     // Catch:{ all -> 0x00ca }
            L_0x00dd:
                com.google.android.gms.gcm.GcmTaskService r6 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0152 }
                com.google.android.gms.gcm.GcmNetworkManager r6 = r6.zzw     // Catch:{ all -> 0x0152 }
                java.lang.String r1 = r5.tag     // Catch:{ all -> 0x0152 }
                com.google.android.gms.gcm.GcmTaskService r2 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0152 }
                android.content.ComponentName r2 = r2.componentName     // Catch:{ all -> 0x0152 }
                java.lang.String r2 = r2.getClassName()     // Catch:{ all -> 0x0152 }
                r6.zze(r1, r2)     // Catch:{ all -> 0x0152 }
                boolean r6 = r5.zzf()     // Catch:{ all -> 0x0152 }
                if (r6 != 0) goto L_0x0115
                com.google.android.gms.gcm.GcmTaskService r6 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0152 }
                com.google.android.gms.gcm.GcmNetworkManager r6 = r6.zzw     // Catch:{ all -> 0x0152 }
                com.google.android.gms.gcm.GcmTaskService r1 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0152 }
                android.content.ComponentName r1 = r1.componentName     // Catch:{ all -> 0x0152 }
                java.lang.String r1 = r1.getClassName()     // Catch:{ all -> 0x0152 }
                boolean r6 = r6.zzf(r1)     // Catch:{ all -> 0x0152 }
                if (r6 != 0) goto L_0x0115
                com.google.android.gms.gcm.GcmTaskService r6 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0152 }
                int r1 = r6.zzt     // Catch:{ all -> 0x0152 }
                goto L_0x00c6
            L_0x0115:
                monitor-exit(r0)     // Catch:{ all -> 0x0152 }
                return
            L_0x0117:
                com.google.android.gms.gcm.GcmTaskService r1 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0152 }
                com.google.android.gms.gcm.GcmNetworkManager r1 = r1.zzw     // Catch:{ all -> 0x0152 }
                java.lang.String r2 = r5.tag     // Catch:{ all -> 0x0152 }
                com.google.android.gms.gcm.GcmTaskService r3 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0152 }
                android.content.ComponentName r3 = r3.componentName     // Catch:{ all -> 0x0152 }
                java.lang.String r3 = r3.getClassName()     // Catch:{ all -> 0x0152 }
                r1.zze(r2, r3)     // Catch:{ all -> 0x0152 }
                boolean r1 = r5.zzf()     // Catch:{ all -> 0x0152 }
                if (r1 != 0) goto L_0x0151
                com.google.android.gms.gcm.GcmTaskService r1 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0152 }
                com.google.android.gms.gcm.GcmNetworkManager r1 = r1.zzw     // Catch:{ all -> 0x0152 }
                com.google.android.gms.gcm.GcmTaskService r2 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0152 }
                android.content.ComponentName r2 = r2.componentName     // Catch:{ all -> 0x0152 }
                java.lang.String r2 = r2.getClassName()     // Catch:{ all -> 0x0152 }
                boolean r1 = r1.zzf(r2)     // Catch:{ all -> 0x0152 }
                if (r1 != 0) goto L_0x0151
                com.google.android.gms.gcm.GcmTaskService r1 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0152 }
                int r2 = r1.zzt     // Catch:{ all -> 0x0152 }
                r1.stopSelf(r2)     // Catch:{ all -> 0x0152 }
            L_0x0151:
                throw r6     // Catch:{ all -> 0x0152 }
            L_0x0152:
                r6 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0152 }
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gcm.GcmTaskService.zze.zze(int):void");
        }

        private final boolean zzf() {
            return this.zzab != null;
        }

        public final void run() {
            zze(GcmTaskService.this.onRunTask(new TaskParams(this.tag, this.extras, this.zzz)));
        }
    }

    private final void zzd(int i) {
        synchronized (this.lock) {
            this.zzt = i;
            if (!this.zzw.zzf(this.componentName.getClassName())) {
                stopSelf(this.zzt);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void zzd(zze zze2) {
        try {
            this.zzu.execute(zze2);
        } catch (RejectedExecutionException unused) {
            zze2.zze(1);
        }
    }

    /* access modifiers changed from: private */
    public final boolean zzg(String str) {
        boolean z;
        synchronized (this.lock) {
            z = !this.zzw.zzd(str, this.componentName.getClassName());
            if (z) {
                new StringBuilder(String.valueOf(getPackageName()).length() + 44 + String.valueOf(str).length());
            }
        }
        return z;
    }

    public IBinder onBind(Intent intent) {
        if (intent == null || !PlatformVersion.isAtLeastLollipop() || !SERVICE_ACTION_EXECUTE_TASK.equals(intent.getAction())) {
            return null;
        }
        return this.zzv.getBinder();
    }

    public void onCreate() {
        super.onCreate();
        this.zzw = GcmNetworkManager.getInstance(this);
        this.zzu = Executors.newFixedThreadPool(2, new zze(this));
        this.zzv = new Messenger(new zzd(Looper.getMainLooper()));
        this.componentName = new ComponentName(this, getClass());
    }

    public void onDestroy() {
        super.onDestroy();
        List<Runnable> shutdownNow = this.zzu.shutdownNow();
        if (!shutdownNow.isEmpty()) {
            shutdownNow.size();
        }
    }

    public void onInitializeTasks() {
    }

    public abstract int onRunTask(TaskParams taskParams);

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            zzd(i2);
            return 2;
        }
        try {
            intent.setExtrasClassLoader(PendingCallback.class.getClassLoader());
            String action = intent.getAction();
            if (SERVICE_ACTION_EXECUTE_TASK.equals(action)) {
                String stringExtra = intent.getStringExtra("tag");
                Parcelable parcelableExtra = intent.getParcelableExtra("callback");
                Bundle bundleExtra = intent.getBundleExtra("extras");
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("triggered_uris");
                if (!(parcelableExtra instanceof PendingCallback)) {
                    new StringBuilder(String.valueOf(getPackageName()).length() + 47 + String.valueOf(stringExtra).length());
                    return 2;
                } else if (zzg(stringExtra)) {
                    zzd(i2);
                    return 2;
                } else {
                    zzd(new zze(stringExtra, ((PendingCallback) parcelableExtra).zzal, bundleExtra, (List<Uri>) parcelableArrayListExtra));
                }
            } else if (SERVICE_ACTION_INITIALIZE.equals(action)) {
                onInitializeTasks();
            } else {
                new StringBuilder(String.valueOf(action).length() + 37);
            }
            zzd(i2);
            return 2;
        } finally {
            zzd(i2);
        }
    }
}
