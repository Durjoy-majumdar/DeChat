package com.google.android.gms.common.stats;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.google.android.gms.common.util.ClientLibraryUtils;
import java.util.Collections;
import java.util.List;

public class ConnectionTracker {
    private static final Object zztm = new Object();
    private static volatile ConnectionTracker zzyg;
    private static boolean zzyh;
    private final List<String> zzyi;
    private final List<String> zzyj;
    private final List<String> zzyk;
    private final List<String> zzyl;

    private ConnectionTracker() {
        List<String> list = Collections.EMPTY_LIST;
        this.zzyi = list;
        this.zzyj = list;
        this.zzyk = list;
        this.zzyl = list;
    }

    public static ConnectionTracker getInstance() {
        if (zzyg == null) {
            synchronized (zztm) {
                if (zzyg == null) {
                    zzyg = new ConnectionTracker();
                }
            }
        }
        return zzyg;
    }

    private static boolean zza(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, boolean z) {
        if (z) {
            ComponentName component = intent.getComponent();
            if (component == null ? false : ClientLibraryUtils.isPackageStopped(context, component.getPackageName())) {
                return false;
            }
        }
        return context.bindService(intent, serviceConnection, i);
    }

    public boolean bindService(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return bindService(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    public boolean bindService(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        return zza(context, str, intent, serviceConnection, i, true);
    }

    public boolean bindServiceAllowStoppedPackages(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        return zza(context, str, intent, serviceConnection, i, false);
    }

    public void logConnectService(Context context, ServiceConnection serviceConnection, String str, Intent intent) {
    }

    public void logDisconnectService(Context context, ServiceConnection serviceConnection) {
    }

    public void logStartService(Service service, int i) {
    }

    public void logStopService(Service service, int i) {
    }

    public void unbindService(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
    }
}
