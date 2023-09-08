package qh2;

import com.tencent.p014mm.plugin.recordvideo.plugin.parent.BaseEditVideoPluginLayout;
import qo3.C89779i0;

/* renamed from: qh2.a */
public final class C110396a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ BaseEditVideoPluginLayout f330262d;

    public C110396a(BaseEditVideoPluginLayout baseEditVideoPluginLayout) {
        this.f330262d = baseEditVideoPluginLayout;
    }

    public final void run() {
        C89779i0 i0Var = this.f330262d.f272955D;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        this.f330262d.f272955D = null;
    }
}
