package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.CookieManager;
import java.util.Map;

public class l$$r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Map f130074d;

    /* renamed from: e */
    public final /* synthetic */ String f130075e;

    /* renamed from: f */
    public final /* synthetic */ String f130076f;

    /* renamed from: g */
    public final /* synthetic */ C48590l f130077g;

    public l$$r(C48590l lVar, Map map, String str, String str2) {
        this.f130077g = lVar;
        this.f130074d = map;
        this.f130075e = str;
        this.f130076f = str2;
    }

    public void run() {
        try {
            Map map = this.f130074d;
            if (!(map == null || map.size() == 0)) {
                for (String str : this.f130074d.keySet()) {
                    CookieManager instance = CookieManager.getInstance();
                    String domin = Util.getDomin(this.f130075e);
                    instance.setCookie(domin, str + "=" + ((String) this.f130074d.get(str)));
                }
                CookieManager.getInstance().setCookie(Util.getDomin(this.f130075e), "httponly");
                CookieManager.getInstance().flush();
                Log.m105925i("MicroMsg.JsApiHandler", "cookies:%s", CookieManager.getInstance().getCookie(Util.getDomin(this.f130075e)));
            }
            this.f130077g.f129996a.evaluateJavascript(String.format("javascript:(function(){ window.getA8KeyUrl='%s'; })()", new Object[]{this.f130075e}), (ValueCallback<String>) null);
            this.f130077g.f129996a.evaluateJavascript("javascript:(function(){ window.isWeixinCached=true; })()", (ValueCallback<String>) null);
            C48590l lVar = this.f130077g;
            if (lVar.f130003h) {
                lVar.f129996a.evaluateJavascript(this.f130076f, (ValueCallback<String>) null);
                this.f130077g.f129992L = null;
                this.f130077g.f129993M = 0;
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onGetA8KeyUrl fail, ex = %s", e.getMessage());
        }
    }
}
