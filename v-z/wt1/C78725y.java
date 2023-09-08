package wt1;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: wt1.y */
public final class C78725y implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C78709x f230435d;

    public C78725y(C78709x xVar) {
        this.f230435d = xVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        Log.m105924i("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "showSuccessAlert, finish ui!");
        this.f230435d.getActivity().finish();
    }
}
