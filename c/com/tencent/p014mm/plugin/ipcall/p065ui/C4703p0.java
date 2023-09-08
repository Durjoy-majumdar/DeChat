package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C97625j3;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.p0 */
public class C4703p0 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ IPCallPackageUI f19693d;

    public C4703p0(IPCallPackageUI iPCallPackageUI) {
        this.f19693d = iPCallPackageUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        try {
            if (this.f19693d.f19495i != null) {
                C97625j3.m125815e().mo123458d(this.f19693d.f19495i);
            }
            this.f19693d.finish();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.IPCallPackageUI", "cancel getPackageProductListNetScene error: %s", e.getMessage());
        }
    }
}
