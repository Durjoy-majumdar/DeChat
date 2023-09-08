package ku0;

import com.tencent.magicbrush.p941ui.MagicBrushView;

/* renamed from: ku0.d */
public final class C88298d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C88288a f255239d;

    public C88298d(C88288a aVar) {
        this.f255239d = aVar;
    }

    public final void run() {
        try {
            MagicBrushView magicBrushView = this.f255239d.f255221v;
            if (magicBrushView != null) {
                magicBrushView.mo111629a();
            }
        } catch (Exception unused) {
        }
        this.f255239d.f255221v = null;
        this.f255239d.f255220u = null;
    }
}
