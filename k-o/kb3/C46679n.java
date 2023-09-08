package kb3;

import android.os.PowerManager;
import android.webkit.ValueCallback;
import com.tencent.p014mm.plugin.game.commlib.util.C41859a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.WebView;

/* renamed from: kb3.n */
public class C46679n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WebView f125669d;

    /* renamed from: e */
    public final /* synthetic */ C46677m f125670e;

    public C46679n(C46677m mVar, WebView webView) {
        this.f125670e = mVar;
        this.f125669d = webView;
    }

    public void run() {
        if (this.f125669d != null) {
            C46677m mVar = this.f125670e;
            String format = String.format("javascript:(function() {window.__usewepkg__=%s;})();", new Object[]{String.valueOf(mVar.mo71926e(mVar.f125648a))});
            Log.m105925i("MicroMsg.Wepkg.WePkgPlugin", "__usewepkg__: %s", format);
            this.f125669d.evaluateJavascript(format, (ValueCallback<String>) null);
            Object[] objArr = new Object[1];
            PowerManager powerManager = (PowerManager) MMApplicationContext.getContext().getSystemService("power");
            objArr[0] = String.valueOf(powerManager != null ? powerManager.isPowerSaveMode() : false);
            String format2 = String.format("javascript:(function() {window.__lowPowerMode__=%s;})();", objArr);
            Log.m105925i("MicroMsg.Wepkg.WePkgPlugin", "__lowPowerMode__: %s", format2);
            this.f125669d.evaluateJavascript(format2, (ValueCallback<String>) null);
            String format3 = String.format("javascript:(function() {window.__lowPower__=%s;})();", new Object[]{String.valueOf(C41859a.f112804a)});
            Log.m105925i("MicroMsg.Wepkg.WePkgPlugin", "__lowPower__: %s", format3);
            this.f125669d.evaluateJavascript(format3, (ValueCallback<String>) null);
            String format4 = String.format("javascript:(function() {window.__game_center_preload__=%s;})();", new Object[]{String.valueOf(this.f125670e.f125667t)});
            Log.m105925i("MicroMsg.Wepkg.WePkgPlugin", "__game_center_preload__: %s", format4);
            this.f125669d.evaluateJavascript(format4, (ValueCallback<String>) null);
            String format5 = String.format("javascript:(function() {window.__is_game_center_preload_page__=%s;})();", new Object[]{String.valueOf(this.f125670e.f125667t)});
            Log.m105925i("MicroMsg.Wepkg.WePkgPlugin", "__is_game_center_preload_page__: %s", format5);
            this.f125669d.evaluateJavascript(format5, (ValueCallback<String>) null);
            return;
        }
        Log.m105924i("MicroMsg.Wepkg.WePkgPlugin", "injectGameJs, webview == null");
    }
}
