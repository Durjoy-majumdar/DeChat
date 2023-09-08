package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;

final class zzm implements Runnable {
    private final zzl zzev;
    public final /* synthetic */ zzk zzew;

    public zzm(zzk zzk, zzl zzl) {
        this.zzew = zzk;
        this.zzev = zzl;
    }

    public final void run() {
        if (this.zzew.mStarted) {
            ConnectionResult connectionResult = this.zzev.getConnectionResult();
            if (connectionResult.hasResolution()) {
                zzk zzk = this.zzew;
                zzk.mLifecycleFragment.startActivityForResult(GoogleApiActivity.zza(zzk.getActivity(), connectionResult.getResolution(), this.zzev.zzu(), false), 1);
            } else if (this.zzew.zzdg.isUserResolvableError(connectionResult.getErrorCode())) {
                zzk zzk2 = this.zzew;
                zzk2.zzdg.showErrorDialogFragment(zzk2.getActivity(), this.zzew.mLifecycleFragment, connectionResult.getErrorCode(), 2, this.zzew);
            } else if (connectionResult.getErrorCode() == 18) {
                zzk zzk3 = this.zzew;
                Dialog showUpdatingDialog = zzk3.zzdg.showUpdatingDialog(zzk3.getActivity(), this.zzew);
                zzk zzk4 = this.zzew;
                zzk4.zzdg.registerCallbackOnUpdate(zzk4.getActivity().getApplicationContext(), new zzn(this, showUpdatingDialog));
            } else {
                this.zzew.zza(connectionResult, this.zzev.zzu());
            }
        }
    }
}
