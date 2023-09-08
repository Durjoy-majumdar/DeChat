package ry1;

import android.widget.Button;
import com.tencent.p014mm.plugin.game.model.C42112t;
import com.tencent.p014mm.plugin.game.p061ui.GameDownloadView;
import com.tencent.p014mm.plugin.game.widget.TextProgressBar;

/* renamed from: ry1.d0 */
public class C48114d0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ GameDownloadView f128986d;

    public C48114d0(GameDownloadView gameDownloadView) {
        this.f128986d = gameDownloadView;
    }

    public void run() {
        GameDownloadView gameDownloadView = this.f128986d;
        C48122i iVar = gameDownloadView.f113847f;
        TextProgressBar textProgressBar = gameDownloadView.f113846e;
        Button button = gameDownloadView.f113845d;
        C42112t tVar = gameDownloadView.f113848g;
        iVar.mo72864b(textProgressBar, button, tVar.f113423a, tVar);
    }
}
