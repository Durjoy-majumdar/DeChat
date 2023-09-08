package ly1;

import android.content.Intent;
import com.tencent.p014mm.plugin.game.media.GameVideoEditorProxyUI;
import ke3.C88144b;

/* renamed from: ly1.q0 */
public class C99768q0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f292408d;

    /* renamed from: e */
    public final /* synthetic */ String f292409e;

    /* renamed from: f */
    public final /* synthetic */ GameVideoEditorProxyUI f292410f;

    public C99768q0(GameVideoEditorProxyUI gameVideoEditorProxyUI, String str, String str2) {
        this.f292410f = gameVideoEditorProxyUI;
        this.f292408d = str;
        this.f292409e = str2;
    }

    public void run() {
        GameVideoEditorProxyUI gameVideoEditorProxyUI = this.f292410f;
        String str = this.f292408d;
        String str2 = this.f292409e;
        String str3 = GameVideoEditorProxyUI.f271773w;
        String E7 = gameVideoEditorProxyUI.mo129168E7(str, str2);
        Intent intent = new Intent();
        intent.putExtra("rawUrl", E7);
        C88144b.m109795m(this.f292410f.f271774e, "webview", ".ui.tools.WebViewUI", intent, 131);
    }
}
