package w93;

import com.tencent.p014mm.plugin.webview.p128ui.tools.game.GameWebViewUI;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: w93.g */
public class C53093g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ GameWebViewUI f148184d;

    public C53093g(GameWebViewUI gameWebViewUI) {
        this.f148184d = gameWebViewUI;
    }

    public void run() {
        GameWebViewUI gameWebViewUI = this.f148184d;
        int i = GameWebViewUI.f119222a3;
        if (gameWebViewUI.f118523f != null) {
            Log.m105925i("MicroMsg.Wepkg.GameWebViewUI", "home page, reload url:%s from net", gameWebViewUI.f118564t1);
            this.f148184d.f118523f.stopLoading();
            GameWebViewUI gameWebViewUI2 = this.f148184d;
            gameWebViewUI2.f118523f.loadUrl(gameWebViewUI2.f118564t1);
        }
    }
}
