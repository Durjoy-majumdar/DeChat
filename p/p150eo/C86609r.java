package p150eo;

import com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor;
import di3.C86312j;

/* renamed from: eo.r */
public final class C86609r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f251569d;

    public C86609r(int i) {
        this.f251569d = i;
    }

    public final void run() {
        ((IMagicBrushMonitor) C86312j.m106911c(IMagicBrushMonitor.class)).Ov0(IMagicBrushMonitor.Key.MagicBrandCreateScene.name(), this.f251569d, (String) null);
    }
}
