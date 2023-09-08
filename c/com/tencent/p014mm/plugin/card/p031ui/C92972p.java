package com.tencent.p014mm.plugin.card.p031ui;

import android.widget.ProgressBar;
import com.tencent.p014mm.p136ui.widget.MMPinProgressBtn;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.card.ui.p */
public class C92972p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CardGiftVideoUI f267779d;

    public C92972p(CardGiftVideoUI cardGiftVideoUI) {
        this.f267779d = cardGiftVideoUI;
    }

    public void run() {
        Log.m105918d("MicroMsg.CardGiftVideoUI", "hide loading.");
        ProgressBar progressBar = this.f267779d.f267756p;
        if (!(progressBar == null || progressBar.getVisibility() == 8)) {
            this.f267779d.f267756p.setVisibility(8);
        }
        MMPinProgressBtn mMPinProgressBtn = this.f267779d.f267757q;
        if (mMPinProgressBtn != null && mMPinProgressBtn.getVisibility() != 8) {
            this.f267779d.f267757q.setVisibility(8);
        }
    }
}
