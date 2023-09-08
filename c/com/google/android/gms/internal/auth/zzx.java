package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.accounttransfer.zzq;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

public final class zzx extends GmsClient<zzac> {
    private final Bundle zzcf;

    public zzx(Context context, Looper looper, ClientSettings clientSettings, zzq zzq, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 128, clientSettings, connectionCallbacks, onConnectionFailedListener);
        if (zzq == null) {
            this.zzcf = new Bundle();
            return;
        }
        throw new NoSuchMethodError();
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService");
        return queryLocalInterface instanceof zzac ? (zzac) queryLocalInterface : new zzad(iBinder);
    }

    public final Bundle getGetServiceRequestExtraArgs() {
        return this.zzcf;
    }

    public final int getMinApkVersion() {
        return GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.accounttransfer.service.START";
    }
}
