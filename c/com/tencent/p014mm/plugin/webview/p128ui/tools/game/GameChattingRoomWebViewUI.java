package com.tencent.p014mm.plugin.webview.p128ui.tools.game;

import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.webview.core.C43505b0;
import com.tencent.p014mm.plugin.webview.core.C43522y;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.WebView;
import kw0.C76638d;
import wd3.C65953v0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.GameChattingRoomWebViewUI */
public class GameChattingRoomWebViewUI extends WebViewUI {

    /* renamed from: I2 */
    public String f119208I2 = "";

    /* renamed from: J2 */
    public int f119209J2 = 4;

    /* renamed from: K2 */
    public int f119210K2 = 5;

    /* renamed from: L2 */
    public final C65953v0 f119211L2 = new C44001a();

    /* renamed from: M2 */
    public final C65953v0 f119212M2 = new C44002b();

    /* renamed from: N2 */
    public C43505b0 f119213N2 = new C44003c();

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.GameChattingRoomWebViewUI$a */
    public class C44001a implements C65953v0 {
        public C44001a() {
        }

        /* renamed from: a */
        public void mo23a(boolean z, String str, int i) {
            GameChattingRoomWebViewUI gameChattingRoomWebViewUI = GameChattingRoomWebViewUI.this;
            gameChattingRoomWebViewUI.setResult(gameChattingRoomWebViewUI.f119209J2, new Intent());
            GameChattingRoomWebViewUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.GameChattingRoomWebViewUI$b */
    public class C44002b implements C65953v0 {
        public C44002b() {
        }

        /* renamed from: a */
        public void mo23a(boolean z, String str, int i) {
            Intent intent = new Intent();
            intent.putExtra("rawUrl", GameChattingRoomWebViewUI.this.f119208I2);
            GameChattingRoomWebViewUI gameChattingRoomWebViewUI = GameChattingRoomWebViewUI.this;
            gameChattingRoomWebViewUI.setResult(gameChattingRoomWebViewUI.f119210K2, intent);
            GameChattingRoomWebViewUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.GameChattingRoomWebViewUI$c */
    public class C44003c extends C43505b0 {

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.GameChattingRoomWebViewUI$c$a */
        public class C44004a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f119217d;

            public C44004a(String str) {
                this.f119217d = str;
            }

            public void run() {
                String str;
                GameChattingRoomWebViewUI gameChattingRoomWebViewUI = GameChattingRoomWebViewUI.this;
                String str2 = this.f119217d;
                gameChattingRoomWebViewUI.getClass();
                Log.m105925i("MicroMsg.GameChattingRoomWebViewUI", "url = %s", str2);
                gameChattingRoomWebViewUI.f119208I2 = str2;
                String stringExtra = gameChattingRoomWebViewUI.getIntent().getStringExtra("action");
                if (stringExtra != null) {
                    String stringExtra2 = gameChattingRoomWebViewUI.getIntent().getStringExtra("app_name");
                    if (stringExtra2 == null) {
                        str = gameChattingRoomWebViewUI.getString(C0966R.string.f7574k3);
                    } else {
                        str = gameChattingRoomWebViewUI.getString(C0966R.string.bj9, new Object[]{stringExtra2});
                    }
                    String str3 = str;
                    String string = gameChattingRoomWebViewUI.getString(C0966R.string.bjf);
                    if (stringExtra.equals("action_create")) {
                        C76638d.m92292a(gameChattingRoomWebViewUI.mController, gameChattingRoomWebViewUI.getString(C0966R.string.bw9), str3, string, gameChattingRoomWebViewUI.f119211L2, gameChattingRoomWebViewUI.f119212M2);
                    } else if (stringExtra.equals("action_join")) {
                        C76638d.m92292a(gameChattingRoomWebViewUI.mController, gameChattingRoomWebViewUI.getString(C0966R.string.fxt), str3, string, gameChattingRoomWebViewUI.f119211L2, gameChattingRoomWebViewUI.f119212M2);
                    }
                }
            }
        }

        public C44003c() {
        }

        /* renamed from: r */
        public C43505b0.C43506a mo62382r(WebView webView, String str) {
            if (Util.isNullOrNil(str)) {
                return new C43505b0.C43506a(false, false);
            }
            if (!str.toLowerCase().startsWith("weixin://jump/") && !str.toLowerCase().startsWith("weixin://scanqrcode/")) {
                return new C43505b0.C43506a(false, false);
            }
            ((C119157j) C119157j.f356862d).mo183895z(new C44004a(str));
            return new C43505b0.C43506a(true, true);
        }
    }

    /* renamed from: M7 */
    public C43522y mo63701M7() {
        C43522y M7 = super.mo63701M7();
        M7.mo67679J(this.f119213N2);
        return M7;
    }

    public void onDestroy() {
        this.f118513b1.mo67693R0(this.f119213N2);
        super.onDestroy();
    }
}
