package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.internal.auth.zzk;
import com.google.android.gms.tasks.Task;

public class WorkAccountClient extends GoogleApi<Api.ApiOptions.NoOptions> {
    private final WorkAccountApi zzae = new zzk();

    public WorkAccountClient(Activity activity) {
        super(activity, WorkAccount.API, null, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public WorkAccountClient(Context context) {
        super(context, WorkAccount.API, null, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public Task<Account> addWorkAccount(String str) {
        return PendingResultUtil.toTask(this.zzae.addWorkAccount(asGoogleApiClient(), str), new zzj(this));
    }

    public Task<Void> removeWorkAccount(Account account) {
        return PendingResultUtil.toVoidTask(this.zzae.removeWorkAccount(asGoogleApiClient(), account));
    }

    public Task<Void> setWorkAuthenticatorEnabled(boolean z) {
        return PendingResultUtil.toVoidTask(this.zzae.setWorkAuthenticatorEnabledWithResult(asGoogleApiClient(), z));
    }
}
