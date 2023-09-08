package com.google.android.gms.auth.api.accounttransfer;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.auth.zzw;
import com.google.android.gms.internal.auth.zzx;

public final class AccountTransfer {
    public static final String ACTION_ACCOUNT_EXPORT_DATA_AVAILABLE = "com.google.android.gms.auth.ACCOUNT_EXPORT_DATA_AVAILABLE";
    public static final String ACTION_ACCOUNT_IMPORT_DATA_AVAILABLE = "com.google.android.gms.auth.ACCOUNT_IMPORT_DATA_AVAILABLE";
    public static final String ACTION_START_ACCOUNT_EXPORT = "com.google.android.gms.auth.START_ACCOUNT_EXPORT";
    public static final String KEY_EXTRA_ACCOUNT_TYPE = "key_extra_account_type";
    private static final Api.ClientKey<zzx> zzau;
    private static final Api.AbstractClientBuilder<zzx, zzq> zzav;
    private static final Api<zzq> zzaw;
    @Deprecated
    private static final zze zzax = new zzw();
    private static final zzt zzay = new zzw();

    /* JADX WARNING: type inference failed for: r0v1, types: [com.google.android.gms.internal.auth.zzw, com.google.android.gms.auth.api.accounttransfer.zze] */
    /* JADX WARNING: type inference failed for: r0v2, types: [com.google.android.gms.auth.api.accounttransfer.zzt, com.google.android.gms.internal.auth.zzw] */
    static {
        Api.ClientKey<zzx> clientKey = new Api.ClientKey<>();
        zzau = clientKey;
        zzd zzd = new zzd();
        zzav = zzd;
        zzaw = new Api<>("AccountTransfer.ACCOUNT_TRANSFER_API", zzd, clientKey);
    }

    private AccountTransfer() {
    }

    public static AccountTransferClient getAccountTransferClient(Activity activity) {
        return new AccountTransferClient(activity);
    }

    public static AccountTransferClient getAccountTransferClient(Context context) {
        return new AccountTransferClient(context);
    }
}
