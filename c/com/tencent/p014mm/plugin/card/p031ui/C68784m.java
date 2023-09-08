package com.tencent.p014mm.plugin.card.p031ui;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.card.ui.m */
public class C68784m implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ CardGiftReceiveUI f197609d;

    public C68784m(CardGiftReceiveUI cardGiftReceiveUI) {
        this.f197609d = cardGiftReceiveUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C89779i0 i0Var = this.f197609d.f51869g;
        if (i0Var != null && i0Var.isShowing()) {
            this.f197609d.f51869g.dismiss();
        }
        if (this.f197609d.getContentView().getVisibility() == 8 || this.f197609d.getContentView().getVisibility() == 4) {
            Log.m105924i("MicroMsg.CardGiftReceiveUI", "user cancel & finish");
            this.f197609d.finish();
        }
    }
}
