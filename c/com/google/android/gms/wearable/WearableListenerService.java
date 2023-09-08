package com.google.android.gms.wearable;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.CapabilityApi;
import com.google.android.gms.wearable.ChannelApi;
import com.google.android.gms.wearable.ChannelClient;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.MessageApi;
import com.google.android.gms.wearable.internal.zzah;
import com.google.android.gms.wearable.internal.zzas;
import com.google.android.gms.wearable.internal.zzaw;
import com.google.android.gms.wearable.internal.zzen;
import com.google.android.gms.wearable.internal.zzfe;
import com.google.android.gms.wearable.internal.zzfo;
import com.google.android.gms.wearable.internal.zzi;
import com.google.android.gms.wearable.internal.zzl;
import java.util.List;

public class WearableListenerService extends Service implements CapabilityApi.CapabilityListener, ChannelApi.ChannelListener, DataApi.DataListener, MessageApi.MessageListener {
    public static final String BIND_LISTENER_INTENT_ACTION = "com.google.android.gms.wearable.BIND_LISTENER";
    /* access modifiers changed from: private */
    public ComponentName service;
    /* access modifiers changed from: private */
    public zzc zzad;
    private IBinder zzae;
    /* access modifiers changed from: private */
    public Intent zzaf;
    private Looper zzag;
    /* access modifiers changed from: private */
    public final Object zzah = new Object();
    /* access modifiers changed from: private */
    public boolean zzai;
    /* access modifiers changed from: private */
    public zzas zzaj = new zzas(new zza());

    public class zza extends ChannelClient.ChannelCallback {
        private zza() {
        }

        public final void onChannelClosed(ChannelClient.Channel channel, int i, int i2) {
            WearableListenerService.this.onChannelClosed(channel, i, i2);
        }

        public final void onChannelOpened(ChannelClient.Channel channel) {
            WearableListenerService.this.onChannelOpened(channel);
        }

        public final void onInputClosed(ChannelClient.Channel channel, int i, int i2) {
            WearableListenerService.this.onInputClosed(channel, i, i2);
        }

        public final void onOutputClosed(ChannelClient.Channel channel, int i, int i2) {
            WearableListenerService.this.onOutputClosed(channel, i, i2);
        }
    }

    public class zzb implements ServiceConnection {
        private zzb(WearableListenerService wearableListenerService) {
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public final class zzc extends Handler {
        private boolean started;
        private final zzb zzal;

        public zzc(Looper looper) {
            super(looper);
            this.zzal = new zzb();
        }

        private final synchronized void zzb() {
            if (!this.started) {
                if (Log.isLoggable("WearableLS", 2)) {
                    new StringBuilder(String.valueOf(WearableListenerService.this.service).length() + 13);
                }
                WearableListenerService wearableListenerService = WearableListenerService.this;
                wearableListenerService.bindService(wearableListenerService.zzaf, this.zzal, 1);
                this.started = true;
            }
        }

        private final synchronized void zzb(String str) {
            if (this.started) {
                if (Log.isLoggable("WearableLS", 2)) {
                    new StringBuilder(String.valueOf(str).length() + 17 + String.valueOf(WearableListenerService.this.service).length());
                }
                try {
                    WearableListenerService.this.unbindService(this.zzal);
                } catch (RuntimeException unused) {
                }
                this.started = false;
            }
        }

        public final void dispatchMessage(Message message) {
            zzb();
            try {
                super.dispatchMessage(message);
            } finally {
                if (!hasMessages(0)) {
                    zzb("dispatch");
                }
            }
        }

        public final void quit() {
            getLooper().quit();
            zzb("quit");
        }
    }

    public final class zzd extends zzen {
        private volatile int zzam;

        private zzd() {
            this.zzam = -1;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0054 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0055  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final boolean zza(java.lang.Runnable r5, java.lang.String r6, java.lang.Object r7) {
            /*
                r4 = this;
                java.lang.String r0 = "WearableLS"
                r1 = 3
                boolean r0 = android.util.Log.isLoggable(r0, r1)
                r2 = 0
                r3 = 1
                if (r0 == 0) goto L_0x0023
                java.lang.String r0 = "%s: %s %s"
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r2] = r6
                com.google.android.gms.wearable.WearableListenerService r6 = com.google.android.gms.wearable.WearableListenerService.this
                android.content.ComponentName r6 = r6.service
                java.lang.String r6 = r6.toString()
                r1[r3] = r6
                r6 = 2
                r1[r6] = r7
                java.lang.String.format(r0, r1)
            L_0x0023:
                int r6 = android.os.Binder.getCallingUid()
                int r7 = r4.zzam
                if (r6 != r7) goto L_0x002d
            L_0x002b:
                r6 = 1
                goto L_0x0052
            L_0x002d:
                com.google.android.gms.wearable.WearableListenerService r7 = com.google.android.gms.wearable.WearableListenerService.this
                com.google.android.gms.wearable.internal.zzhp r7 = com.google.android.gms.wearable.internal.zzhp.zza(r7)
                java.lang.String r0 = "com.google.android.wearable.app.cn"
                boolean r7 = r7.zze(r0)
                if (r7 == 0) goto L_0x0046
                com.google.android.gms.wearable.WearableListenerService r7 = com.google.android.gms.wearable.WearableListenerService.this
                java.lang.String r0 = "com.google.android.wearable.app.cn"
                boolean r7 = com.google.android.gms.common.util.UidVerifier.uidHasPackageName(r7, r6, r0)
                if (r7 == 0) goto L_0x0046
                goto L_0x004e
            L_0x0046:
                com.google.android.gms.wearable.WearableListenerService r7 = com.google.android.gms.wearable.WearableListenerService.this
                boolean r7 = com.google.android.gms.common.util.UidVerifier.isGooglePlayServicesUid(r7, r6)
                if (r7 == 0) goto L_0x0051
            L_0x004e:
                r4.zzam = r6
                goto L_0x002b
            L_0x0051:
                r6 = 0
            L_0x0052:
                if (r6 != 0) goto L_0x0055
                return r2
            L_0x0055:
                com.google.android.gms.wearable.WearableListenerService r6 = com.google.android.gms.wearable.WearableListenerService.this
                java.lang.Object r6 = r6.zzah
                monitor-enter(r6)
                com.google.android.gms.wearable.WearableListenerService r7 = com.google.android.gms.wearable.WearableListenerService.this     // Catch:{ all -> 0x0071 }
                boolean r7 = r7.zzai     // Catch:{ all -> 0x0071 }
                if (r7 == 0) goto L_0x0066
                monitor-exit(r6)     // Catch:{ all -> 0x0071 }
                return r2
            L_0x0066:
                com.google.android.gms.wearable.WearableListenerService r7 = com.google.android.gms.wearable.WearableListenerService.this     // Catch:{ all -> 0x0071 }
                com.google.android.gms.wearable.WearableListenerService$zzc r7 = r7.zzad     // Catch:{ all -> 0x0071 }
                r7.post(r5)     // Catch:{ all -> 0x0071 }
                monitor-exit(r6)     // Catch:{ all -> 0x0071 }
                return r3
            L_0x0071:
                r5 = move-exception
                monitor-exit(r6)     // Catch:{ all -> 0x0071 }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.WearableListenerService.zzd.zza(java.lang.Runnable, java.lang.String, java.lang.Object):boolean");
        }

        public final void onConnectedNodes(List<zzfo> list) {
            zza(new zzp(this, list), "onConnectedNodes", list);
        }

        public final void zza(DataHolder dataHolder) {
            zzl zzl = new zzl(this, dataHolder);
            try {
                String valueOf = String.valueOf(dataHolder);
                int count = dataHolder.getCount();
                StringBuilder sb = new StringBuilder(valueOf.length() + 18);
                sb.append(valueOf);
                sb.append(", rows=");
                sb.append(count);
                if (zza(zzl, "onDataItemChanged", sb.toString())) {
                }
            } finally {
                dataHolder.close();
            }
        }

        public final void zza(zzah zzah) {
            zza(new zzq(this, zzah), "onConnectedCapabilityChanged", zzah);
        }

        public final void zza(zzaw zzaw) {
            zza(new zzt(this, zzaw), "onChannelEvent", zzaw);
        }

        public final void zza(zzfe zzfe) {
            zza(new zzm(this, zzfe), "onMessageReceived", zzfe);
        }

        public final void zza(zzfo zzfo) {
            zza(new zzn(this, zzfo), "onPeerConnected", zzfo);
        }

        public final void zza(zzi zzi) {
            zza(new zzs(this, zzi), "onEntityUpdate", zzi);
        }

        public final void zza(zzl zzl) {
            zza(new zzr(this, zzl), "onNotificationReceived", zzl);
        }

        public final void zzb(zzfo zzfo) {
            zza(new zzo(this, zzfo), "onPeerDisconnected", zzfo);
        }
    }

    public Looper getLooper() {
        if (this.zzag == null) {
            HandlerThread handlerThread = new HandlerThread("WearableListenerService");
            handlerThread.start();
            this.zzag = handlerThread.getLooper();
        }
        return this.zzag;
    }

    public final IBinder onBind(Intent intent) {
        if (BIND_LISTENER_INTENT_ACTION.equals(intent.getAction())) {
            return this.zzae;
        }
        return null;
    }

    public void onCapabilityChanged(CapabilityInfo capabilityInfo) {
    }

    public void onChannelClosed(Channel channel, int i, int i2) {
    }

    public void onChannelClosed(ChannelClient.Channel channel, int i, int i2) {
    }

    public void onChannelOpened(Channel channel) {
    }

    public void onChannelOpened(ChannelClient.Channel channel) {
    }

    public void onConnectedNodes(List<Node> list) {
    }

    public void onCreate() {
        super.onCreate();
        this.service = new ComponentName(this, getClass().getName());
        if (Log.isLoggable("WearableLS", 3)) {
            new StringBuilder(String.valueOf(this.service).length() + 10);
        }
        this.zzad = new zzc(getLooper());
        Intent intent = new Intent(BIND_LISTENER_INTENT_ACTION);
        this.zzaf = intent;
        intent.setComponent(this.service);
        this.zzae = new zzd();
    }

    public void onDataChanged(DataEventBuffer dataEventBuffer) {
    }

    public void onDestroy() {
        if (Log.isLoggable("WearableLS", 3)) {
            new StringBuilder(String.valueOf(this.service).length() + 11);
        }
        synchronized (this.zzah) {
            this.zzai = true;
            zzc zzc2 = this.zzad;
            if (zzc2 != null) {
                zzc2.quit();
            } else {
                String valueOf = String.valueOf(this.service);
                StringBuilder sb = new StringBuilder(valueOf.length() + 111);
                sb.append("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            }
        }
        super.onDestroy();
    }

    public void onEntityUpdate(zzb zzb2) {
    }

    public void onInputClosed(Channel channel, int i, int i2) {
    }

    public void onInputClosed(ChannelClient.Channel channel, int i, int i2) {
    }

    public void onMessageReceived(MessageEvent messageEvent) {
    }

    public void onNotificationReceived(zzd zzd2) {
    }

    public void onOutputClosed(Channel channel, int i, int i2) {
    }

    public void onOutputClosed(ChannelClient.Channel channel, int i, int i2) {
    }

    public void onPeerConnected(Node node) {
    }

    public void onPeerDisconnected(Node node) {
    }
}
