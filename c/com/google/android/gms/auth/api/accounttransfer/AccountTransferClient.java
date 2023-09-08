package com.google.android.gms.auth.api.accounttransfer;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.auth.zzab;
import com.google.android.gms.internal.auth.zzac;
import com.google.android.gms.internal.auth.zzae;
import com.google.android.gms.internal.auth.zzag;
import com.google.android.gms.internal.auth.zzai;
import com.google.android.gms.internal.auth.zzak;
import com.google.android.gms.internal.auth.zzv;
import com.google.android.gms.internal.auth.zzx;
import com.google.android.gms.internal.auth.zzy;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public class AccountTransferClient extends GoogleApi<zzq> {
    private static final Api.ClientKey<zzx> zzau;
    private static final Api.AbstractClientBuilder<zzx, zzq> zzav;
    private static final Api<zzq> zzaw;

    public static class zzd<T> extends zzv {
        private zze<T> zzbg;

        public zzd(zze<T> zze) {
            this.zzbg = zze;
        }

        public final void onFailure(Status status) {
            this.zzbg.zzd(status);
        }
    }

    public static abstract class zze<T> extends TaskApiCall<zzx, T> {
        private TaskCompletionSource<T> zzbh;

        private zze() {
        }

        public /* synthetic */ zze(zzf zzf) {
            this();
        }

        public /* synthetic */ void doExecute(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
            this.zzbh = taskCompletionSource;
            zzd((zzac) ((zzx) anyClient).getService());
        }

        public final void setResult(T t) {
            this.zzbh.setResult(t);
        }

        public final void zzd(Status status) {
            AccountTransferClient.zzd(this.zzbh, status);
        }

        public abstract void zzd(zzac zzac);
    }

    public static abstract class zzf extends zze<Void> {
        public zzab zzbi;

        private zzf() {
            super((zzf) null);
            this.zzbi = new zzn(this);
        }

        public /* synthetic */ zzf(zzf zzf) {
            this();
        }
    }

    static {
        Api.ClientKey<zzx> clientKey = new Api.ClientKey<>();
        zzau = clientKey;
        zzf zzf2 = new zzf();
        zzav = zzf2;
        zzaw = new Api<>("AccountTransfer.ACCOUNT_TRANSFER_API", zzf2, clientKey);
    }

    public AccountTransferClient(Activity activity) {
        super(activity, zzaw, null, new GoogleApi.Settings.Builder().setMapper(new ApiExceptionMapper()).build());
    }

    public AccountTransferClient(Context context) {
        super(context, zzaw, null, new GoogleApi.Settings.Builder().setMapper(new ApiExceptionMapper()).build());
    }

    /* access modifiers changed from: private */
    public static void zzd(TaskCompletionSource taskCompletionSource, Status status) {
        taskCompletionSource.setException(new AccountTransferException(status));
    }

    public Task<DeviceMetaData> getDeviceMetaData(String str) {
        Preconditions.checkNotNull(str);
        return doRead(new zzj(this, new zzy(str)));
    }

    public Task<Void> notifyCompletion(String str, int i) {
        Preconditions.checkNotNull(str);
        return doWrite(new zzm(this, new zzae(str, i)));
    }

    public Task<byte[]> retrieveData(String str) {
        Preconditions.checkNotNull(str);
        return doRead(new zzh(this, new zzag(str)));
    }

    public Task<Void> sendData(String str, byte[] bArr) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(bArr);
        return doWrite(new zzg(this, new zzai(str, bArr)));
    }

    public Task<Void> showUserChallenge(String str, PendingIntent pendingIntent) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(pendingIntent);
        return doWrite(new zzl(this, new zzak(str, pendingIntent)));
    }
}
