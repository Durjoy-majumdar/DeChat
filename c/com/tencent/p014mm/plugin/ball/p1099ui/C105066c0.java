package com.tencent.p014mm.plugin.ball.p1099ui;

import android.view.ViewGroup;
import com.tencent.p014mm.plugin.ball.view.FloatIndicatorView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.ball.ui.c0 */
public class C105066c0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C105062b0 f311840d;

    public C105066c0(C105062b0 b0Var) {
        this.f311840d = b0Var;
    }

    public void run() {
        FloatIndicatorView floatIndicatorView = this.f311840d.f311832b;
        if (floatIndicatorView != null) {
            try {
                if (floatIndicatorView.getParent() != null) {
                    ((ViewGroup) this.f311840d.f311832b.getParent()).removeView(this.f311840d.f311832b);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.FloatIndicatorController", e, "detachFloatIndicatorView exception:%s", e);
            }
        }
    }
}
