package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import qo3.C77390c0;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.u0 */
public final class C84678u0 extends C77390c0 {

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.u0$a */
    public class C84679a implements Runnable {
        public C84679a() {
        }

        public void run() {
            C84678u0.super.dismiss();
        }
    }

    public C84678u0(Context context, int i) {
        super(context, i);
    }

    public void dismiss() {
        if (MMHandlerThread.isMainThread()) {
            super.dismiss();
        } else {
            MMHandlerThread.postToMainThread(new C84679a());
        }
    }
}
