package com.tencent.p014mm.plugin.scanner.model;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.scanner.model.C19032z0;
import com.tencent.p014mm.plugin.scanner.p101ui.BaseScanUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import nl2.C21672j;

/* renamed from: com.tencent.mm.plugin.scanner.model.a1 */
public final class C19002a1 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C19032z0 f53385d;

    /* renamed from: e */
    public final /* synthetic */ long f53386e;

    public C19002a1(C19032z0 z0Var, long j) {
        this.f53385d = z0Var;
        this.f53386e = j;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Log.m105924i("MicroMsg.ScanProductForGalleryHelper", "processGoodsImage onCancel and resumeScan");
        C19032z0 z0Var = this.f53385d;
        if (z0Var.f53516c == this.f53386e) {
            C19032z0.C19033a aVar = z0Var.f53515b;
        }
        ((BaseScanUI) z0Var.f53514a).mo24303c8();
        C21672j jVar = this.f53385d.f53518e;
    }
}
