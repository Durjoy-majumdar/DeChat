package com.tencent.p014mm.plugin.webview.p128ui.tools.game;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.api.GameWebPerformanceInfo;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.game.commlib.C41853c;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.core.C43505b0;
import com.tencent.p014mm.plugin.webview.core.C43519u;
import com.tencent.p014mm.plugin.webview.core.C43522y;
import com.tencent.p014mm.plugin.webview.core.C43558z;
import com.tencent.p014mm.plugin.webview.model.C43704h2;
import com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI$$j0;
import com.tencent.p014mm.plugin.webview.p128ui.tools.game.GameBaseWebViewUI;
import com.tencent.p014mm.plugin.webview.p128ui.tools.game.menu.GameMenuImageButton;
import com.tencent.p014mm.plugin.webview.p128ui.tools.game.menu.GameMenuView;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.MovingImageButton;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.WebViewSearchContentInputFooter;
import com.tencent.p014mm.plugin.webview.stub.C43791l;
import com.tencent.p014mm.plugin.wepkg.event.C44477b;
import com.tencent.p014mm.plugin.wepkg.model.WepkgVersion;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.WebChromeClient;
import com.tencent.xweb.WebResourceRequest;
import com.tencent.xweb.WebResourceResponse;
import com.tencent.xweb.WebView;
import di3.C86312j;
import f40.C86709a0;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k00.C46630b;
import k00.C46633d;
import k00.C9550c;
import kb3.C46665a;
import kb3.C46677m;
import ke3.C88144b;
import l31.C61212e;
import nj3.C76874e0;
import o31.C11345b;
import o31.C76986a;
import p168i6.C8850b;
import p206nj.C11171e;
import p206nj.C117627q;
import p248ug.C52570c0;
import p385u2.C111105a;
import py1.C47671s4;
import t83.C13851h1;
import t83.C48590l;
import t83.C48611v0;
import te3.C50187kw2;
import u10.C52415a;
import w93.C15055c;
import w93.C15056d;
import w93.C53091f;
import w93.C53093g;
import x93.C53299a;
import x93.C53301c;
import x93.C53302d;
import x93.C53303e;
import x93.C53306f;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI */
public class GameWebViewUI extends GameBaseWebViewUI implements C15056d {

    /* renamed from: a3 */
    public static final /* synthetic */ int f119222a3 = 0;

    /* renamed from: K2 */
    public C9550c f119223K2;

    /* renamed from: L2 */
    public String f119224L2 = null;

    /* renamed from: M2 */
    public Map<Integer, C50187kw2> f119225M2 = new HashMap();

    /* renamed from: N2 */
    public String f119226N2;

    /* renamed from: O2 */
    public GameMenuImageButton f119227O2;

    /* renamed from: P2 */
    public boolean f119228P2;

    /* renamed from: Q2 */
    public boolean f119229Q2;

    /* renamed from: R2 */
    public GameWebPerformanceInfo f119230R2;

    /* renamed from: S2 */
    public long f119231S2;

    /* renamed from: T2 */
    public C53091f f119232T2;

    /* renamed from: U2 */
    public ViewGroup f119233U2;

    /* renamed from: V2 */
    public boolean f119234V2 = false;

    /* renamed from: W2 */
    public Object f119235W2 = new Object();

    /* renamed from: X2 */
    public C44015h f119236X2 = new C44015h((C44006a) null);

    /* renamed from: Y2 */
    public boolean f119237Y2 = false;

    /* renamed from: Z2 */
    public boolean f119238Z2 = false;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI$a */
    public class C44006a extends C44477b {

        /* renamed from: a */
        public final /* synthetic */ String f119239a;

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI$a$a */
        public class C44007a implements Runnable {
            public C44007a() {
            }

            public void run() {
                GameWebViewUI gameWebViewUI = GameWebViewUI.this;
                if (gameWebViewUI.f119234V2) {
                    synchronized (gameWebViewUI.f119235W2) {
                        if (gameWebViewUI.f118579y != null && gameWebViewUI.f119234V2) {
                            FrameLayout frameLayout = new FrameLayout(gameWebViewUI);
                            gameWebViewUI.f119233U2 = frameLayout;
                            frameLayout.setClickable(true);
                            gameWebViewUI.f118579y.addView(gameWebViewUI.f119233U2, new FrameLayout.LayoutParams(-1, -1));
                            gameWebViewUI.f119233U2.addView(LayoutInflater.from(gameWebViewUI).inflate(C0966R.C0971layout.f359861b80, gameWebViewUI.f118579y, false), new FrameLayout.LayoutParams(-2, -2, 17));
                        }
                    }
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI$a$b */
        public class C44008b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ boolean f119242d;

            public C44008b(boolean z) {
                this.f119242d = z;
            }

            public void run() {
                ViewGroup viewGroup;
                GameWebViewUI gameWebViewUI = GameWebViewUI.this;
                if (gameWebViewUI.f119234V2) {
                    gameWebViewUI.f119234V2 = false;
                    synchronized (gameWebViewUI.f119235W2) {
                        FrameLayout frameLayout = gameWebViewUI.f118579y;
                        if (!(frameLayout == null || (viewGroup = gameWebViewUI.f119233U2) == null)) {
                            frameLayout.removeView(viewGroup);
                        }
                    }
                    if (this.f119242d) {
                        GameWebViewUI.this.f118523f.stopLoading();
                        C44006a aVar = C44006a.this;
                        GameWebViewUI gameWebViewUI2 = GameWebViewUI.this;
                        ((C46677m) gameWebViewUI2.f119223K2).mo71927f(aVar.f119239a, !gameWebViewUI2.f119229Q2, false);
                        C44006a aVar2 = C44006a.this;
                        GameWebViewUI.this.mo68248O8(aVar2.f119239a, (Map<String, String>) null, false);
                    }
                }
            }
        }

        public C44006a(String str) {
            this.f119239a = str;
        }

        /* renamed from: a */
        public void mo65875a(String str) {
            GameWebViewUI gameWebViewUI = GameWebViewUI.this;
            if (!gameWebViewUI.f119234V2) {
                gameWebViewUI.f119234V2 = true;
                gameWebViewUI.f118501W1.postDelayed(new C44007a(), 1000);
            }
        }

        /* renamed from: b */
        public void mo65876b(boolean z) {
            GameWebViewUI gameWebViewUI = GameWebViewUI.this;
            int i = GameWebViewUI.f119222a3;
            gameWebViewUI.f118501W1.post(new C44008b(z));
        }

        /* renamed from: c */
        public void mo65877c() {
            Log.m105924i("MicroMsg.Wepkg.GameWebViewUI", "onReload");
            GameWebViewUI gameWebViewUI = GameWebViewUI.this;
            gameWebViewUI.f119238Z2 = true;
            if (gameWebViewUI.f119237Y2) {
                gameWebViewUI.f119237Y2 = false;
                gameWebViewUI.f119238Z2 = false;
                MMHandlerThread.postToMainThreadDelayed(new C53093g(gameWebViewUI), 100);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI$b */
    public class C44009b implements C53302d {
        public C44009b() {
        }

        /* renamed from: a */
        public void mo68612a(MenuItem menuItem) {
            C53303e.C53305b bVar;
            C50187kw2 kw22 = (C50187kw2) ((HashMap) GameWebViewUI.this.f119225M2).get(Integer.valueOf(menuItem.getItemId()));
            if (kw22 != null) {
                int i = kw22.f137072g;
                Iterator<Map.Entry<C53303e.C53305b, Integer>> it = C53303e.C53305b.f148889f.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        bVar = C53303e.C53305b.HVGAME_MENU_ACTION_DEFAULT;
                        break;
                    }
                    Map.Entry next = it.next();
                    if (((Integer) next.getValue()).intValue() == i) {
                        bVar = (C53303e.C53305b) next.getKey();
                        break;
                    }
                }
                switch (bVar.ordinal()) {
                    case 1:
                        Intent intent = new Intent();
                        intent.putExtra("rawUrl", kw22.f137073h);
                        C88144b.m109791i(GameWebViewUI.this.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                        return;
                    case 2:
                        C43704h2.C43708d c = GameWebViewUI.this.f118459E1.mo68007c();
                        c.mo68018b(GameWebViewUI.this.mo6901n0(), 32, 1);
                        c.mo68017a();
                        if (!GameWebViewUI.this.mo68306s9()) {
                            GameWebViewUI.this.finish();
                            return;
                        }
                        return;
                    case 3:
                        String stringExtra = GameWebViewUI.this.getIntent().getStringExtra("KPublisherId");
                        String stringExtra2 = GameWebViewUI.this.getIntent().getStringExtra("KAppId");
                        String stringExtra3 = GameWebViewUI.this.getIntent().getStringExtra("srcUsername");
                        C43704h2.C43708d c2 = GameWebViewUI.this.f118459E1.mo68007c();
                        c2.mo68018b(GameWebViewUI.this.mo6901n0(), 1, 1, stringExtra, stringExtra2, stringExtra3);
                        c2.mo68017a();
                        GameWebViewUI.this.mo68280f9(0);
                        return;
                    case 4:
                        C43704h2.C43708d c3 = GameWebViewUI.this.f118459E1.mo68007c();
                        c3.mo68018b(GameWebViewUI.this.mo6901n0(), 3, 1);
                        c3.mo68017a();
                        C115669n.INSTANCE.idkeyStat(157, 6, 1, false);
                        GameWebViewUI.this.f118465H1.mo68586v();
                        return;
                    case 5:
                        C43704h2.C43708d c4 = GameWebViewUI.this.f118459E1.mo68007c();
                        c4.mo68018b(GameWebViewUI.this.mo6901n0(), 10, 1);
                        c4.mo68017a();
                        MMWebView mMWebView = GameWebViewUI.this.f118523f;
                        if (mMWebView != null) {
                            mMWebView.reload();
                            return;
                        }
                        return;
                    case 6:
                        C43704h2.C43708d c5 = GameWebViewUI.this.f118459E1.mo68007c();
                        c5.mo68018b(GameWebViewUI.this.mo6901n0(), 31, 1);
                        c5.mo68017a();
                        GameWebViewUI.this.f118465H1.mo68579o();
                        return;
                    case 7:
                        C43704h2.C43708d c6 = GameWebViewUI.this.f118459E1.mo68007c();
                        c6.mo68018b(GameWebViewUI.this.mo6901n0(), 11, 1);
                        c6.mo68017a();
                        GameWebViewUI.this.f118465H1.mo68583s((String) null);
                        return;
                    case 8:
                        C48590l lVar = GameWebViewUI.this.f118508Z;
                        if (lVar != null) {
                            int i2 = kw22.f137069d;
                            if (!lVar.f130003h) {
                                Log.m105920e("MicroMsg.JsApiHandler", "not ready");
                                return;
                            }
                            Log.m105924i("MicroMsg.JsApiHandler", "onCustomGameMenuClicked");
                            HashMap hashMap = new HashMap();
                            hashMap.put("itemId", Integer.valueOf(i2));
                            MMHandlerThread.postToMainThread(new C48611v0(lVar, C13851h1.C13852a.m13143c("onCustomGameMenuClicked", hashMap, lVar.f130011p, lVar.f130012q)));
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI$c */
    public class C44010c implements C53301c {
        public C44010c() {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            C76874e0 e0Var2;
            C115669n.INSTANCE.idkeyStat(480, 0, 1, false);
            GameWebViewUI gameWebViewUI = GameWebViewUI.this;
            int i = GameWebViewUI.f119222a3;
            gameWebViewUI.getClass();
            try {
                List<C50187kw2> list = C53299a.f148887a;
                new Bundle().putString("game_hv_menu_appid", gameWebViewUI.f119226N2);
                ((HashMap) gameWebViewUI.f119225M2).clear();
                for (C50187kw2 next : list) {
                    ((HashMap) gameWebViewUI.f119225M2).put(Integer.valueOf(next.f137069d), next);
                }
                e0Var2 = C53303e.m59727a(gameWebViewUI, list);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.Wepkg.GameWebViewUI", "get cache hv game menu fail! exception:%s", e.getMessage());
                e0Var2 = null;
            }
            if (e0Var2 != null) {
                ((ArrayList) e0Var.f224704d).addAll(e0Var2.f224704d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI$d */
    public class C44011d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C53306f f119246d;

        public C44011d(C53306f fVar) {
            this.f119246d = fVar;
        }

        public void run() {
            if (GameWebViewUI.this.isFinishing() || GameWebViewUI.this.f118577x1) {
                Log.m105924i("MicroMsg.Wepkg.GameWebViewUI", "tryShow bottom sheet failed, the activity has been destroyed.");
            } else {
                this.f119246d.mo73933c();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI$e */
    public class C44012e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C53306f f119248d;

        public C44012e(C53306f fVar) {
            this.f119248d = fVar;
        }

        public void run() {
            if (GameWebViewUI.this.isFinishing() || GameWebViewUI.this.f118577x1) {
                Log.m105924i("MicroMsg.Wepkg.GameWebViewUI", "tryShow bottom sheet failed, the activity has been destroyed.");
            } else {
                this.f119248d.mo73933c();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI$f */
    public class C44013f implements GameMenuImageButton.C44033b {
        public C44013f() {
        }

        /* renamed from: a */
        public void mo65815a() {
            GameWebViewUI.this.mo68318w9();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI$g */
    public class C44014g extends WebViewUI$$j0 {
        public C44014g() {
            super(GameWebViewUI.this);
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            C9550c cVar = GameWebViewUI.this.f119223K2;
            if (cVar != null) {
                ((C46677m) cVar).mo71928g(consoleMessage);
            }
            return super.onConsoleMessage(consoleMessage);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI$h */
    public class C44015h extends C43505b0 {

        /* renamed from: c */
        public C44016a f119252c = new C44016a((C44006a) null);

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI$h$a */
        public class C44016a extends GameBaseWebViewUI.C44000b {
            public C44016a(C44006a aVar) {
                super();
            }

            /* renamed from: c */
            public void mo64753c(WebView webView, String str) {
                GameWebPerformanceInfo gameWebPerformanceInfo = GameWebViewUI.this.f119230R2;
                if (gameWebPerformanceInfo.f108344F == 0) {
                    gameWebPerformanceInfo.f108344F = System.currentTimeMillis();
                }
                C53091f fVar = GameWebViewUI.this.f119232T2;
                if (fVar.f148169e == 0) {
                    fVar.f148169e = System.currentTimeMillis();
                }
                ProgressBar progressBar = GameWebViewUI.this.f118550p;
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                }
                ((C46677m) GameWebViewUI.this.f119223K2).mo71930i(webView, str);
                GameBaseWebViewUI.this.f119205J2.f119298f.mo68639b();
            }

            /* renamed from: d */
            public void mo62156d(WebView webView, String str) {
                GameWebPerformanceInfo gameWebPerformanceInfo = GameWebViewUI.this.f119230R2;
                if (gameWebPerformanceInfo.f108343E == 0) {
                    gameWebPerformanceInfo.f108343E = System.currentTimeMillis();
                }
                C53091f fVar = GameWebViewUI.this.f119232T2;
                if (fVar.f148168d == 0) {
                    fVar.f148168d = System.currentTimeMillis();
                }
                ((C46677m) GameWebViewUI.this.f119223K2).mo71931j(webView, str);
            }

            /* renamed from: e */
            public void mo64754e(WebView webView, int i, String str, String str2) {
                GameWebViewUI gameWebViewUI = GameWebViewUI.this;
                int i2 = GameWebViewUI.f119222a3;
                ProgressBar progressBar = gameWebViewUI.f118550p;
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI$h$b */
        public class C44017b extends C43558z {
            public C44017b(C44006a aVar) {
            }

            /* renamed from: a */
            public void mo67848a(int i, String str) {
                GameWebPerformanceInfo gameWebPerformanceInfo = GameWebViewUI.this.f119230R2;
                if (gameWebPerformanceInfo.f108346H == 0) {
                    gameWebPerformanceInfo.f108346H = System.currentTimeMillis();
                }
                C53091f fVar = GameWebViewUI.this.f119232T2;
                if (fVar.f148171g == 0) {
                    fVar.f148171g = System.currentTimeMillis();
                }
                GameWebViewUI gameWebViewUI = GameWebViewUI.this;
                gameWebViewUI.f119237Y2 = true;
                if (gameWebViewUI.f119238Z2) {
                    gameWebViewUI.f119237Y2 = false;
                    gameWebViewUI.f119238Z2 = false;
                    MMHandlerThread.postToMainThreadDelayed(new C53093g(gameWebViewUI), 100);
                }
            }

            /* renamed from: c */
            public void mo67849c(int i, String str) {
                GameWebPerformanceInfo gameWebPerformanceInfo = GameWebViewUI.this.f119230R2;
                if (gameWebPerformanceInfo.f108345G == 0) {
                    gameWebPerformanceInfo.f108345G = System.currentTimeMillis();
                }
                C53091f fVar = GameWebViewUI.this.f119232T2;
                if (fVar.f148170f == 0) {
                    fVar.f148170f = System.currentTimeMillis();
                }
            }
        }

        public C44015h(C44006a aVar) {
        }

        /* renamed from: b */
        public C43519u mo67776b() {
            return this.f119252c;
        }

        /* renamed from: d */
        public C43558z mo63687d() {
            return new C44017b((C44006a) null);
        }

        /* renamed from: f */
        public WebResourceResponse mo62378f(WebView webView, WebResourceRequest webResourceRequest) {
            if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
                return null;
            }
            return ((C46677m) GameWebViewUI.this.f119223K2).mo71932k(webView, webResourceRequest.getUrl().toString(), webResourceRequest);
        }
    }

    public GameWebViewUI() {
        new HashMap();
    }

    /* renamed from: A8 */
    public void mo68223A8() {
        super.mo68223A8();
        String stringExtra = getIntent().getStringExtra("game_hv_menu_appid");
        this.f119226N2 = stringExtra;
        if (this.f118450B && !Util.isNullOrNil(stringExtra)) {
            MovingImageButton movingImageButton = this.f118583z;
            if (movingImageButton != null) {
                movingImageButton.setVisibility(8);
            }
            this.f119227O2.mo68643a(this.f118575x, new C44013f());
        }
    }

    /* renamed from: B8 */
    public void mo68225B8(boolean z) {
        super.mo68225B8(z);
        mo68251P7(false);
    }

    /* renamed from: C3 */
    public Map<Integer, Object> mo14074C3() {
        HashMap hashMap = new HashMap();
        C53091f c = C53091f.m59448c(mo6901n0());
        if (c != null) {
            hashMap.put(30, Long.valueOf(c.f148167c - c.f148166b));
            hashMap.put(31, Long.valueOf(c.f148168d - c.f148166b));
            hashMap.put(32, Long.valueOf(c.f148169e - c.f148168d));
            hashMap.put(33, Long.valueOf(c.f148171g - c.f148170f));
            hashMap.put(34, Long.valueOf(c.f148173i - c.f148172h));
            hashMap.put(45, Long.valueOf(c.f148174j));
        }
        hashMap.put(49, 0);
        return hashMap;
    }

    /* renamed from: I9 */
    public String mo68606I9() {
        return (hashCode() & Integer.MAX_VALUE) + "_" + (mo6901n0().hashCode() & Integer.MAX_VALUE);
    }

    /* renamed from: J9 */
    public C9550c mo68607J9() {
        return this.f119223K2;
    }

    /* renamed from: K9 */
    public void mo68608K9() {
        this.f119232T2.f148172h = System.currentTimeMillis();
        this.f119230R2.f108362o = 1;
    }

    /* renamed from: L9 */
    public void mo68609L9() {
        this.f119232T2.f148173i = System.currentTimeMillis();
    }

    /* renamed from: M7 */
    public C43522y mo63701M7() {
        C43522y M7 = super.mo63701M7();
        M7.mo67679J(this.f119236X2);
        return M7;
    }

    /* renamed from: O8 */
    public void mo68248O8(String str, Map<String, String> map, boolean z) {
        GameWebPerformanceInfo gameWebPerformanceInfo = this.f119230R2;
        if (gameWebPerformanceInfo.f108342D == 0) {
            gameWebPerformanceInfo.f108342D = System.currentTimeMillis();
        }
        WepkgVersion wepkgVersion = ((C46677m) this.f119223K2).f125653f;
        if (wepkgVersion == null || !wepkgVersion.f120655h) {
            super.mo68248O8(str, map, false);
        } else {
            super.mo68248O8(str, map, z);
        }
    }

    /* renamed from: S7 */
    public boolean mo63702S7() {
        getIntent().putExtra("minimize_secene", 2);
        return true;
    }

    /* renamed from: a9 */
    public void mo63385a9() {
        C47671s4 l;
        int i;
        super.mo63385a9();
        this.f119228P2 = true;
        if ((this.f118555q1 == null && this.f118552p1 == 0) && (l = C41853c.m45378l()) != null && !Util.isNullOrNil(l.f128001d) && !Util.isNullOrNil(l.f128003f)) {
            try {
                if (C85875k4.m106211z()) {
                    this.f118552p1 = Color.parseColor(l.f128003f);
                } else {
                    this.f118552p1 = Color.parseColor(l.f128001d);
                }
            } catch (IllegalArgumentException e) {
                Log.m105920e("MicroMsg.Wepkg.GameWebViewUI", "parse color: " + e.getMessage());
            }
            this.f118555q1 = l.f128002e;
            if (!C11171e.m11046c(21) || (i = this.f118552p1) == 0) {
                mo68299o9(mo63387d8());
            } else {
                setActionbarColor(i);
            }
            mo68225B8(true);
        }
        Intent intent = getIntent();
        if (intent != null && intent.getBooleanExtra("game_check_float", false)) {
            int intExtra = intent.getIntExtra("game_sourceScene", 0);
            String stringExtra = intent.getStringExtra("game_transparent_float_url");
            this.f119224L2 = stringExtra;
            if (Util.isNullOrNil(stringExtra)) {
                Intent intent2 = new Intent();
                intent2.putExtra("game_check_float", true);
                intent2.putExtra("game_sourceScene", intExtra);
                C88144b.m109791i(this, "game", ".ui.GameCenterUI", intent2, (Bundle) null);
                return;
            }
            try {
                Bundle bundle = new Bundle();
                bundle.putInt("game_sourceScene", intExtra);
                C43791l lVar = this.f118511a1;
                if (lVar != null) {
                    lVar.mo68114V5(91, bundle);
                }
                if (this.f119204I2 == null) {
                    this.f119204I2 = new C44019a(this, this.f118579y, this.f119224L2);
                }
                this.f119204I2.mo68616a(this.f119224L2);
                this.f119224L2 = null;
            } catch (RemoteException unused) {
            }
        }
    }

    public void addIconOptionMenu(int i, int i2, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        if (this.f119228P2) {
            super.addIconOptionMenu(i, i2, onMenuItemClickListener);
        }
    }

    public int getLayoutId() {
        this.f119230R2.f108339A = System.currentTimeMillis();
        return C0966R.C0971layout.cht;
    }

    public void initView() {
        super.initView();
        new ColorDrawable(C111105a.m151500b(this, C0966R.color.f3014ca));
        new ColorDrawable(C111105a.m151500b(this, C0966R.color.f3014ca));
        this.f119230R2.f108340B = System.currentTimeMillis();
        this.f119232T2.f148167c = System.currentTimeMillis();
    }

    /* renamed from: o8 */
    public synchronized WebChromeClient mo68298o8() {
        if (this.f118485R0 == null) {
            this.f118485R0 = new C44014g();
        }
        return this.f118485R0;
    }

    public void onCreate(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("rawUrl");
        if (((C52570c0) C86709a0.m107533q(C52570c0.class)).mo58182e()) {
            stringExtra = "https://mp.weixin.qq.com/mp/readtemplate?t=appmsg/childmode";
            getIntent().putExtra("rawUrl", stringExtra);
        }
        if (!Util.isNullOrNil(stringExtra)) {
            String queryParameter = Uri.parse(stringExtra).getQueryParameter("nav_color");
            if (!Util.isNullOrNil(queryParameter)) {
                try {
                    getIntent().putExtra("customize_status_bar_color", Color.parseColor("#" + queryParameter));
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        Log.m105925i("MicroMsg.Wepkg.GameWebViewUI", "rawUrl rid:%s, pkgId:%s", C46633d.m51937b(stringExtra), C46633d.m51936a(stringExtra));
        if (getIntent().getLongExtra("gamecenterui_createtime", 0) > 0) {
            this.f119230R2 = GameWebPerformanceInfo.m43446b(stringExtra);
        } else {
            this.f119230R2 = GameWebPerformanceInfo.m43445a(stringExtra);
        }
        GameWebPerformanceInfo gameWebPerformanceInfo = this.f119230R2;
        gameWebPerformanceInfo.f108354d = stringExtra;
        gameWebPerformanceInfo.f108355e = mo68606I9();
        this.f119230R2.f108366s = getIntent().getLongExtra("gamecenterui_createtime", 0);
        this.f119230R2.f108367t = getIntent().getLongExtra("start_activity_time", System.currentTimeMillis());
        this.f119230R2.f108365r = getIntent().getLongExtra("start_time", this.f119230R2.f108367t);
        this.f119230R2.f108372y = System.currentTimeMillis();
        GameWebPerformanceInfo gameWebPerformanceInfo2 = this.f119230R2;
        gameWebPerformanceInfo2.f108359i = 1;
        Log.m105925i("MicroMsg.Wepkg.GameWebViewUI", "onCreate, startTime: %d, gameCenterUICreate: %d, startWebUI: %d,webUICreate: %d", Long.valueOf(gameWebPerformanceInfo2.f108365r), Long.valueOf(this.f119230R2.f108366s), Long.valueOf(this.f119230R2.f108367t), Long.valueOf(this.f119230R2.f108372y));
        C53091f a = C53091f.m59446a(stringExtra);
        this.f119232T2 = a;
        a.f148166b = System.currentTimeMillis();
        this.f119223K2 = ((C46630b) C86312j.m106911c(C46630b.class)).Pl0();
        super.onCreate(bundle);
        MMWebView mMWebView = this.f118523f;
        if (mMWebView != null) {
            mMWebView.getSettings().setForceDarkBehavior(1);
        }
        Intent intent = getIntent();
        if (intent != null && intent.getBooleanExtra("disable_progress_bar", false)) {
            this.f118535j.f55817j = false;
            ProgressBar progressBar = this.f118550p;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
        }
        ((C46677m) this.f119223K2).f125659l = new C44006a(stringExtra);
        boolean booleanExtra = getIntent().getBooleanExtra("open_game_float", false);
        this.f119229Q2 = booleanExtra;
        if (((C46677m) this.f119223K2).mo71927f(stringExtra, !booleanExtra, false)) {
            Log.m105924i("MicroMsg.Wepkg.GameWebViewUI", "current page use wepkg");
            ProgressBar progressBar2 = this.f118550p;
            if (progressBar2 != null) {
                progressBar2.setVisibility(0);
            }
        }
        this.f119227O2 = new GameMenuImageButton(getContext());
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.GameWebViewUI).mo86179qs(this, C76986a.Game);
    }

    public void onDestroy() {
        this.f118513b1.mo67693R0(this.f119236X2);
        this.f118513b1.mo67723h(this.f119236X2.f119252c);
        super.onDestroy();
        ((C46677m) this.f119223K2).mo71929h(this.f119229Q2);
        this.f119230R2.f108348J = System.currentTimeMillis();
        C52415a.m58668a().mo62983e(this.f119230R2);
        GameWebPerformanceInfo gameWebPerformanceInfo = (GameWebPerformanceInfo) ((HashMap) GameWebPerformanceInfo.f108338Q).remove(mo6901n0());
        C15055c.m14224b(mo68606I9(), this);
        C53091f remove = C53091f.f148164t.remove(mo6901n0());
    }

    public void onPause() {
        super.onPause();
        this.f119230R2.f108347I += System.currentTimeMillis() - this.f119231S2;
    }

    public void onResume() {
        super.onResume();
        if (this.f119230R2.f108373z == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            Log.m105924i("MicroMsg.Wepkg.GameWebViewUI", "onResume: " + currentTimeMillis);
            this.f119230R2.f108373z = currentTimeMillis;
        }
        this.f119231S2 = System.currentTimeMillis();
    }

    /* renamed from: r1 */
    public Map<Integer, Object> mo14075r1() {
        HashMap hashMap = new HashMap();
        hashMap.put(21, mo68606I9());
        hashMap.put(22, NetStatusUtil.getFormatedNetType(MMApplicationContext.getContext()));
        hashMap.put(23, String.valueOf(C8850b.m8679b(MMApplicationContext.getContext())));
        String n0 = mo6901n0();
        try {
            hashMap.put(24, C117627q.m165909b(Util.nullAsNil(n0), "UTF-8"));
        } catch (UnsupportedEncodingException unused) {
        }
        hashMap.put(25, Boolean.valueOf(((C46677m) this.f119223K2).mo71926e(n0)));
        hashMap.put(26, 0);
        hashMap.put(27, 0);
        WepkgVersion wepkgVersion = ((C46677m) this.f119223K2).f125653f;
        hashMap.put(28, wepkgVersion != null ? wepkgVersion.f120653f : "");
        ((C46677m) this.f119223K2).getClass();
        hashMap.put(29, C46665a.m51972a());
        return hashMap;
    }

    public void setMMOrientation() {
        if (getForceOrientation() == -1) {
            boolean z = getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 4).getBoolean("settings_landscape_mode", false);
            this.landscapeMode = z;
            if (z) {
                setRequestedOrientation(2);
            } else {
                setRequestedOrientation(1);
            }
        } else {
            setRequestedOrientation(getForceOrientation());
        }
    }

    /* renamed from: v8 */
    public void mo68315v8(Bundle bundle) {
        super.mo68315v8(bundle);
    }

    /* renamed from: w9 */
    public void mo68318w9() {
        C43977g1 g1Var = this.f118465H1;
        if (g1Var.f119140m) {
            g1Var.mo68590z();
        }
        GameMenuImageButton gameMenuImageButton = this.f119227O2;
        if (gameMenuImageButton == null || !gameMenuImageButton.f119301e) {
            super.mo68318w9();
            return;
        }
        C53306f fVar = new C53306f(getContext());
        C44009b bVar = new C44009b();
        GameMenuView gameMenuView = fVar.f148896h;
        if (gameMenuView != null) {
            gameMenuView.setGameMenuItemSelectedListener(bVar);
        }
        fVar.f148894f = new C44010c();
        if (this.f118450B) {
            fVar.f148901p = true;
            fVar.f148902q = true;
        } else {
            fVar.f148901p = false;
            fVar.f148902q = false;
        }
        WebViewSearchContentInputFooter webViewSearchContentInputFooter = this.f118464H;
        if (webViewSearchContentInputFooter == null || !webViewSearchContentInputFooter.isShown()) {
            hideVKB();
            MMHandlerThread.postToMainThreadDelayed(new C44012e(fVar), 100);
            return;
        }
        this.f118464H.mo68915a();
        MMHandlerThread.postToMainThreadDelayed(new C44011d(fVar), 100);
    }

    /* renamed from: x9 */
    public int mo68320x9() {
        return super.mo68320x9();
    }
}
