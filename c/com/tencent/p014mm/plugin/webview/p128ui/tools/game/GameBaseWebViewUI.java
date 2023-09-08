package com.tencent.p014mm.plugin.webview.p128ui.tools.game;

import android.os.Bundle;
import android.os.RemoteException;
import com.tencent.p014mm.plugin.webview.core.C43519u;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import com.tencent.p014mm.plugin.webview.stub.C43791l;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.GameBaseWebViewUI */
public class GameBaseWebViewUI extends WebViewUI {

    /* renamed from: I2 */
    public C44019a f119204I2;

    /* renamed from: J2 */
    public C44030b f119205J2 = new C43999a();

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.GameBaseWebViewUI$a */
    public class C43999a extends C44030b {
        public C43999a() {
        }

        /* renamed from: b */
        public void mo65810b(Bundle bundle) {
            try {
                C43791l lVar = GameBaseWebViewUI.this.f118511a1;
                if (lVar != null && bundle != null) {
                    lVar.mo68114V5(96, bundle);
                }
            } catch (RemoteException unused) {
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.GameBaseWebViewUI$b */
    public class C44000b extends C43519u {
        public C44000b() {
        }
    }

    /* renamed from: N7 */
    public boolean mo68245N7() {
        return true;
    }

    /* renamed from: m9 */
    public void mo68295m9(Bundle bundle) {
        this.f119205J2.f119298f.mo68641d(bundle);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public void onDestroy() {
        this.f119205J2.f119298f.mo68638a();
        C44019a aVar = this.f119204I2;
        if (aVar != null) {
            aVar.mo68617b();
        }
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        this.f119205J2.f119298f.mo68640c();
        C44019a aVar = this.f119204I2;
        if (aVar != null) {
            aVar.f119273o.f119298f.mo68640c();
            aVar.f119269k.f108347I += System.currentTimeMillis() - aVar.f119271m;
            aVar.f119271m = System.currentTimeMillis();
        }
    }

    public void onResume() {
        this.f119205J2.f119298f.mo68642e();
        C44019a aVar = this.f119204I2;
        if (aVar != null) {
            aVar.f119273o.f119298f.mo68642e();
            aVar.f119271m = System.currentTimeMillis();
        }
        super.onResume();
    }
}
