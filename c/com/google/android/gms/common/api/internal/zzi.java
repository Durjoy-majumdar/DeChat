package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import com.tencent.xweb.file.XVFSFile;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class zzi extends zzk {
    private final SparseArray<zza> zzed = new SparseArray<>();

    public class zza implements GoogleApiClient.OnConnectionFailedListener {
        public final int zzee;
        public final GoogleApiClient zzef;
        public final GoogleApiClient.OnConnectionFailedListener zzeg;

        public zza(int i, GoogleApiClient googleApiClient, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            this.zzee = i;
            this.zzef = googleApiClient;
            this.zzeg = onConnectionFailedListener;
            googleApiClient.registerConnectionFailedListener(this);
        }

        public final void onConnectionFailed(ConnectionResult connectionResult) {
            new StringBuilder(String.valueOf(connectionResult).length() + 27);
            zzi.this.zzb(connectionResult, this.zzee);
        }
    }

    private zzi(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.mLifecycleFragment.addCallback("AutoManageHelper", this);
    }

    public static zzi zza(LifecycleActivity lifecycleActivity) {
        LifecycleFragment fragment = LifecycleCallback.getFragment(lifecycleActivity);
        zzi zzi = (zzi) fragment.getCallbackOrNull("AutoManageHelper", zzi.class);
        return zzi != null ? zzi : new zzi(fragment);
    }

    private final zza zzd(int i) {
        if (this.zzed.size() <= i) {
            return null;
        }
        SparseArray<zza> sparseArray = this.zzed;
        return sparseArray.get(sparseArray.keyAt(i));
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.zzed.size(); i++) {
            zza zzd = zzd(i);
            if (zzd != null) {
                printWriter.append(str).append("GoogleApiClient #").print(zzd.zzee);
                printWriter.println(XVFSFile.PATH_SEPARATOR);
                zzd.zzef.dump(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        new StringBuilder(String.valueOf(this.zzed).length() + 14);
        if (this.zzer.get() == null) {
            for (int i = 0; i < this.zzed.size(); i++) {
                zza zzd = zzd(i);
                if (zzd != null) {
                    zzd.zzef.connect();
                }
            }
        }
    }

    public void onStop() {
        super.onStop();
        for (int i = 0; i < this.zzed.size(); i++) {
            zza zzd = zzd(i);
            if (zzd != null) {
                zzd.zzef.disconnect();
            }
        }
    }

    public final void zza(int i, GoogleApiClient googleApiClient, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.checkNotNull(googleApiClient, "GoogleApiClient instance cannot be null");
        boolean z = this.zzed.indexOfKey(i) < 0;
        StringBuilder sb = new StringBuilder(54);
        sb.append("Already managing a GoogleApiClient with id ");
        sb.append(i);
        Preconditions.checkState(z, sb.toString());
        zzl zzl = this.zzer.get();
        new StringBuilder(String.valueOf(zzl).length() + 49);
        this.zzed.put(i, new zza(i, googleApiClient, onConnectionFailedListener));
        if (this.mStarted && zzl == null) {
            new StringBuilder(String.valueOf(googleApiClient).length() + 11);
            googleApiClient.connect();
        }
    }

    public final void zza(ConnectionResult connectionResult, int i) {
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        zza zza2 = this.zzed.get(i);
        if (zza2 != null) {
            zzc(i);
            GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = zza2.zzeg;
            if (onConnectionFailedListener != null) {
                onConnectionFailedListener.onConnectionFailed(connectionResult);
            }
        }
    }

    public final void zzc(int i) {
        zza zza2 = this.zzed.get(i);
        this.zzed.remove(i);
        if (zza2 != null) {
            zza2.zzef.unregisterConnectionFailedListener(zza2);
            zza2.zzef.disconnect();
        }
    }

    public final void zzr() {
        for (int i = 0; i < this.zzed.size(); i++) {
            zza zzd = zzd(i);
            if (zzd != null) {
                zzd.zzef.connect();
            }
        }
    }
}
