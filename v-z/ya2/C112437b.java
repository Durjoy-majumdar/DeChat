package ya2;

import com.tencent.p014mm.plugin.music.p080ui.view.MarqueeLyricView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: ya2.b */
public final class C112437b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MarqueeLyricView f336673d;

    public C112437b(MarqueeLyricView marqueeLyricView) {
        this.f336673d = marqueeLyricView;
    }

    public final void run() {
        Log.m105919d("MicroMsg.MarqueeLyricView", "scrollTask, mStartX:%s, mDistance:%s, mDuration:%s", Integer.valueOf(this.f336673d.f315171j), Integer.valueOf(this.f336673d.f315172n), Integer.valueOf(this.f336673d.f315173o));
        MarqueeLyricView marqueeLyricView = this.f336673d;
        marqueeLyricView.f315168g.startScroll(marqueeLyricView.f315171j, 0, marqueeLyricView.f315172n, 0, marqueeLyricView.f315173o);
        this.f336673d.invalidate();
    }
}
