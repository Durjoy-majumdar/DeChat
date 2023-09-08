package com.tencent.p014mm.plugin.appbrand;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84686v0;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.f4 */
public class C81834f4 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntimeWC f240101d;

    public C81834f4(AppBrandRuntimeWC appBrandRuntimeWC) {
        this.f240101d = appBrandRuntimeWC;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            Bitmap a = C81692d4.m100243a(this.f240101d);
            AppBrandRuntimeWC appBrandRuntimeWC = this.f240101d;
            ThreadLocal<Boolean> threadLocal = C84686v0.f247051a;
            if (!(appBrandRuntimeWC == null || a == null)) {
                if (!a.isRecycled()) {
                    C84686v0.f247052b.put(appBrandRuntimeWC, a);
                }
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AppBrand.RuntimeRestartHelper", "showRestartPromptForCommLibUpdated takeSnapshot appId[%s], e[%s]", this.f240101d.f238147j, e);
        }
        this.f240101d.mo113015J0((AppBrandInitConfig) null, "CommLibUpdated");
    }
}
