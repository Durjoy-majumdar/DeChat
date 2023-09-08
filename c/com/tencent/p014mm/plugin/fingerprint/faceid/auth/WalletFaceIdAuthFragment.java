package com.tencent.p014mm.plugin.fingerprint.faceid.auth;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatDialogFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import rt1.C22249a;

/* renamed from: com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthFragment */
public class WalletFaceIdAuthFragment extends AppCompatDialogFragment {

    /* renamed from: d */
    public Dialog f198167d;

    public Dialog onCreateDialog(Bundle bundle) {
        WalletFaceIdDialog walletFaceIdDialog = new WalletFaceIdDialog(getActivity(), (C22249a) null, (Bundle) null);
        this.f198167d = walletFaceIdDialog;
        walletFaceIdDialog.setCancelable(false);
        return this.f198167d;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        getDialog().requestWindowFeature(1);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onPause() {
        super.onPause();
        Log.m105918d("MicroMsg.WalletFaceIdAuthFragment", "on pause");
    }

    public void onStop() {
        super.onStop();
        Log.m105918d("MicroMsg.WalletFaceIdAuthFragment", "on stop");
        Dialog dialog = this.f198167d;
        if (dialog != null) {
            dialog.dismiss();
        }
    }
}
