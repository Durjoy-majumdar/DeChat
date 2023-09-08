package com.google.android.gms.wearable.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.CapabilityApi;
import com.google.android.gms.wearable.ChannelApi;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.MessageApi;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.WearableStatusCodes;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public final class zzhg extends GmsClient<zzep> {
    private final ExecutorService zzew;
    private final zzer<Object> zzex;
    private final zzer<Object> zzey;
    private final zzer<ChannelApi.ChannelListener> zzez;
    private final zzer<DataApi.DataListener> zzfa;
    private final zzer<MessageApi.MessageListener> zzfb;
    private final zzer<Object> zzfc;
    private final zzer<Object> zzfd;
    private final zzer<CapabilityApi.CapabilityListener> zzfe;
    private final zzhp zzff;

    public zzhg(Context context, Looper looper, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, ClientSettings clientSettings) {
        this(context, looper, connectionCallbacks, onConnectionFailedListener, clientSettings, Executors.newCachedThreadPool(), zzhp.zza(context));
    }

    private zzhg(Context context, Looper looper, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, ClientSettings clientSettings, ExecutorService executorService, zzhp zzhp) {
        super(context, looper, 14, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zzex = new zzer<>();
        this.zzey = new zzer<>();
        this.zzez = new zzer<>();
        this.zzfa = new zzer<>();
        this.zzfb = new zzer<>();
        this.zzfc = new zzer<>();
        this.zzfd = new zzer<>();
        this.zzfe = new zzer<>();
        this.zzew = (ExecutorService) Preconditions.checkNotNull(executorService);
        this.zzff = zzhp;
    }

    public final void connect(BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        if (!requiresGooglePlayServices()) {
            try {
                Bundle bundle = getContext().getPackageManager().getApplicationInfo("com.google.android.wearable.app.cn", 128).metaData;
                if ((bundle != null ? bundle.getInt("com.google.android.wearable.api.version", 0) : 0) < GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE) {
                    Context context = getContext();
                    Context context2 = getContext();
                    Intent intent = new Intent("com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR").setPackage("com.google.android.wearable.app.cn");
                    if (context2.getPackageManager().resolveActivity(intent, 65536) == null) {
                        intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.wearable.app.cn").build());
                    }
                    triggerNotAvailable(connectionProgressReportCallbacks, 6, PendingIntent.getActivity(context, 0, intent, 0));
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                triggerNotAvailable(connectionProgressReportCallbacks, 16, (PendingIntent) null);
                return;
            }
        }
        super.connect(connectionProgressReportCallbacks);
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        return queryLocalInterface instanceof zzep ? (zzep) queryLocalInterface : new zzeq(iBinder);
    }

    public final int getMinApkVersion() {
        return GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.wearable.BIND";
    }

    public final String getStartServicePackage() {
        return this.zzff.zze("com.google.android.wearable.app.cn") ? "com.google.android.wearable.app.cn" : "com.google.android.gms";
    }

    public final void onPostInitHandler(int i, IBinder iBinder, Bundle bundle, int i2) {
        Log.isLoggable("WearableClient", 2);
        if (i == 0) {
            this.zzex.zza(iBinder);
            this.zzey.zza(iBinder);
            this.zzez.zza(iBinder);
            this.zzfa.zza(iBinder);
            this.zzfb.zza(iBinder);
            this.zzfc.zza(iBinder);
            this.zzfd.zza(iBinder);
            this.zzfe.zza(iBinder);
        }
        super.onPostInitHandler(i, iBinder, bundle, i2);
    }

    public final boolean requiresGooglePlayServices() {
        return !this.zzff.zze("com.google.android.wearable.app.cn");
    }

    public final void zza(BaseImplementation.ResultHolder<DataApi.GetFdForAssetResult> resultHolder, Asset asset) {
        ((zzep) getService()).zza((zzek) new zzgx(resultHolder), asset);
    }

    public final void zza(BaseImplementation.ResultHolder<Status> resultHolder, CapabilityApi.CapabilityListener capabilityListener) {
        this.zzfe.zza(this, resultHolder, capabilityListener);
    }

    public final void zza(BaseImplementation.ResultHolder<Status> resultHolder, CapabilityApi.CapabilityListener capabilityListener, ListenerHolder<CapabilityApi.CapabilityListener> listenerHolder, IntentFilter[] intentFilterArr) {
        this.zzfe.zza(this, resultHolder, capabilityListener, zzhk.zzd(listenerHolder, intentFilterArr));
    }

    public final void zza(BaseImplementation.ResultHolder<Status> resultHolder, ChannelApi.ChannelListener channelListener, ListenerHolder<ChannelApi.ChannelListener> listenerHolder, String str, IntentFilter[] intentFilterArr) {
        if (str == null) {
            this.zzez.zza(this, resultHolder, channelListener, zzhk.zzc(listenerHolder, intentFilterArr));
            return;
        }
        this.zzez.zza(this, resultHolder, new zzgc(str, channelListener), zzhk.zza(listenerHolder, str, intentFilterArr));
    }

    public final void zza(BaseImplementation.ResultHolder<Status> resultHolder, ChannelApi.ChannelListener channelListener, String str) {
        if (str == null) {
            this.zzez.zza(this, resultHolder, channelListener);
            return;
        }
        this.zzez.zza(this, resultHolder, new zzgc(str, channelListener));
    }

    public final void zza(BaseImplementation.ResultHolder<Status> resultHolder, DataApi.DataListener dataListener) {
        this.zzfa.zza(this, resultHolder, dataListener);
    }

    public final void zza(BaseImplementation.ResultHolder<Status> resultHolder, DataApi.DataListener dataListener, ListenerHolder<DataApi.DataListener> listenerHolder, IntentFilter[] intentFilterArr) {
        this.zzfa.zza(this, resultHolder, dataListener, zzhk.zza(listenerHolder, intentFilterArr));
    }

    public final void zza(BaseImplementation.ResultHolder<Status> resultHolder, MessageApi.MessageListener messageListener) {
        this.zzfb.zza(this, resultHolder, messageListener);
    }

    public final void zza(BaseImplementation.ResultHolder<Status> resultHolder, MessageApi.MessageListener messageListener, ListenerHolder<MessageApi.MessageListener> listenerHolder, IntentFilter[] intentFilterArr) {
        this.zzfb.zza(this, resultHolder, messageListener, zzhk.zzb(listenerHolder, intentFilterArr));
    }

    public final void zza(BaseImplementation.ResultHolder<DataApi.DataItemResult> resultHolder, PutDataRequest putDataRequest) {
        for (Map.Entry<String, Asset> value : putDataRequest.getAssets().entrySet()) {
            Asset asset = (Asset) value.getValue();
            if (asset.getData() == null && asset.getDigest() == null && asset.getFd() == null && asset.getUri() == null) {
                String valueOf = String.valueOf(putDataRequest.getUri());
                String valueOf2 = String.valueOf(asset);
                StringBuilder sb = new StringBuilder(valueOf.length() + 33 + valueOf2.length());
                sb.append("Put for ");
                sb.append(valueOf);
                sb.append(" contains invalid asset: ");
                sb.append(valueOf2);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        PutDataRequest zza = PutDataRequest.zza(putDataRequest.getUri());
        zza.setData(putDataRequest.getData());
        if (putDataRequest.isUrgent()) {
            zza.setUrgent();
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : putDataRequest.getAssets().entrySet()) {
            Asset asset2 = (Asset) next.getValue();
            if (asset2.getData() != null) {
                try {
                    ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                    if (Log.isLoggable("WearableClient", 3)) {
                        new StringBuilder(String.valueOf(asset2).length() + 61 + String.valueOf(createPipe[0]).length() + String.valueOf(createPipe[1]).length());
                    }
                    zza.putAsset((String) next.getKey(), Asset.createFromFd(createPipe[0]));
                    FutureTask futureTask = new FutureTask(new zzhh(this, createPipe[1], asset2.getData()));
                    arrayList.add(futureTask);
                    this.zzew.submit(futureTask);
                } catch (IOException e) {
                    String valueOf3 = String.valueOf(putDataRequest);
                    StringBuilder sb4 = new StringBuilder(valueOf3.length() + 60);
                    sb4.append("Unable to create ParcelFileDescriptor for asset in request: ");
                    sb4.append(valueOf3);
                    throw new IllegalStateException(sb4.toString(), e);
                }
            } else if (asset2.getUri() != null) {
                try {
                    zza.putAsset((String) next.getKey(), Asset.createFromFd(getContext().getContentResolver().openFileDescriptor(asset2.getUri(), "r")));
                } catch (FileNotFoundException unused) {
                    new zzhb(resultHolder, arrayList).zza(new zzfu(WearableStatusCodes.ASSET_UNAVAILABLE, (zzdd) null));
                    new StringBuilder(String.valueOf(asset2.getUri()).length() + 28);
                    return;
                }
            } else {
                zza.putAsset((String) next.getKey(), asset2);
            }
        }
        ((zzep) getService()).zza((zzek) new zzhb(resultHolder, arrayList), zza);
    }

    public final void zza(BaseImplementation.ResultHolder<Status> resultHolder, String str, Uri uri, long j, long j2) {
        try {
            ExecutorService executorService = this.zzew;
            Preconditions.checkNotNull(resultHolder);
            Preconditions.checkNotNull(str);
            Preconditions.checkNotNull(uri);
            Preconditions.checkArgument(j >= 0, "startOffset is negative: %s", Long.valueOf(j));
            Preconditions.checkArgument(j2 >= -1, "invalid length: %s", Long.valueOf(j2));
            executorService.execute(new zzhj(this, uri, resultHolder, str, j, j2));
        } catch (RuntimeException e) {
            BaseImplementation.ResultHolder<Status> resultHolder2 = resultHolder;
            resultHolder.setFailedResult(new Status(8));
            throw e;
        }
    }

    public final void zza(BaseImplementation.ResultHolder<Status> resultHolder, String str, Uri uri, boolean z) {
        try {
            ExecutorService executorService = this.zzew;
            Preconditions.checkNotNull(resultHolder);
            Preconditions.checkNotNull(str);
            Preconditions.checkNotNull(uri);
            executorService.execute(new zzhi(this, uri, resultHolder, z, str));
        } catch (RuntimeException e) {
            resultHolder.setFailedResult(new Status(8));
            throw e;
        }
    }
}
