package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.z0 */
public class C4738z0 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ IPCallShareCouponCardUI f19752d;

    public C4738z0(IPCallShareCouponCardUI iPCallShareCouponCardUI) {
        this.f19752d = iPCallShareCouponCardUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        try {
            this.f19752d.finish();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.IPCallShareCouponCardUI", "loadFromSystemAddressBook error: %s", e.getMessage());
        }
    }
}
