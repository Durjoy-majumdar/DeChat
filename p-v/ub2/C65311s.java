package ub2;

import android.app.ProgressDialog;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMVCardChooseView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: ub2.s */
public final class C65311s implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MusicMVCardChooseView f187982d;

    public C65311s(MusicMVCardChooseView musicMVCardChooseView) {
        this.f187982d = musicMVCardChooseView;
    }

    public final void run() {
        ProgressDialog progressDialog;
        Log.m105918d("MicroMsg.Mv.MusicMVCardChooseView", "onCreate, post delay, dialog show.");
        if (MusicMVCardChooseView.C57081b.SKIP != this.f187982d.f163473Q0 && (progressDialog = this.f187982d.f163505x0) != null) {
            progressDialog.show();
        }
    }
}
