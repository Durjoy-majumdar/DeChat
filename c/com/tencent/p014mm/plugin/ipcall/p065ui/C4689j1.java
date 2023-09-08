package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.j1 */
public class C4689j1 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ IPCallShareCouponUI f19677d;

    public C4689j1(IPCallShareCouponUI iPCallShareCouponUI) {
        this.f19677d = iPCallShareCouponUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        try {
            this.f19677d.finish();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.IPCallShareCouponUI", "IPCallShareCouponUI error: %s", e.getMessage());
        }
    }
}
