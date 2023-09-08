package com.google.android.gms.auth.account;

import android.accounts.Account;
import com.google.android.gms.auth.account.WorkAccountApi;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;

final class zzj implements PendingResultUtil.ResultConverter<WorkAccountApi.AddAccountResult, Account> {
    public zzj(WorkAccountClient workAccountClient) {
    }

    public final /* synthetic */ Object convert(Result result) {
        return ((WorkAccountApi.AddAccountResult) result).getAccount();
    }
}
