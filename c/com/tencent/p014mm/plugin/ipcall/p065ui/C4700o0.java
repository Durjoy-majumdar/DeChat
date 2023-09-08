package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C97625j3;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.o0 */
public class C4700o0 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ IPCallMyGiftCardUI f19690d;

    public C4700o0(IPCallMyGiftCardUI iPCallMyGiftCardUI) {
        this.f19690d = iPCallMyGiftCardUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        try {
            if (this.f19690d.f19482h != null) {
                C97625j3.m125815e().mo123458d(this.f19690d.f19482h);
            }
            this.f19690d.finish();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.IPCallMyGiftCardUI", "cancel getProductListScene error: %s", e.getMessage());
        }
    }
}
