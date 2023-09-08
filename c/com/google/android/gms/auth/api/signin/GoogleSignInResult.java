package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

public class GoogleSignInResult implements Result {
    private Status mStatus;
    private GoogleSignInAccount zzen;

    public GoogleSignInResult(GoogleSignInAccount googleSignInAccount, Status status) {
        this.zzen = googleSignInAccount;
        this.mStatus = status;
    }

    public GoogleSignInAccount getSignInAccount() {
        return this.zzen;
    }

    public Status getStatus() {
        return this.mStatus;
    }

    public boolean isSuccess() {
        return this.mStatus.isSuccess();
    }
}
