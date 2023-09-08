package ya2;

import com.tencent.p014mm.plugin.music.p080ui.view.MarqueeLyricView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: ya2.a */
public final class C112436a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MarqueeLyricView f336672d;

    public C112436a(MarqueeLyricView marqueeLyricView) {
        this.f336672d = marqueeLyricView;
    }

    public final void run() {
        MarqueeLyricView marqueeLyricView = this.f336672d;
        marqueeLyricView.f315178t.setDuration(marqueeLyricView.f315175q);
        MarqueeLyricView marqueeLyricView2 = this.f336672d;
        marqueeLyricView2.startAnimation(marqueeLyricView2.f315178t);
        Log.m105919d("MicroMsg.MarqueeLyricView", "doFaceOut, duration:%s", Long.valueOf(this.f336672d.f315175q));
    }
}
