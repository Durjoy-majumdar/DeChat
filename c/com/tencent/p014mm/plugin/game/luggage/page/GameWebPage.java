package com.tencent.p014mm.plugin.game.luggage.page;

import a93.C39517b;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.BizFinderLineStatusChangedEvent;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.game.report.api.GameWebPerformanceInfo;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C40319a0;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.game.commlib.C41853c;
import com.tencent.p014mm.plugin.game.commlib.util.C41864d;
import com.tencent.p014mm.plugin.game.luggage.C41900d;
import com.tencent.p014mm.plugin.game.luggage.C41903i;
import com.tencent.p014mm.plugin.game.luggage.C41930n;
import com.tencent.p014mm.plugin.game.luggage.C41932o;
import com.tencent.p014mm.plugin.game.luggage.report.PageTimeReport27743;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.plugin.webview.luggage.C43626k0;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.C43661n0;
import com.tencent.p014mm.plugin.webview.luggage.C43691z0;
import com.tencent.p014mm.plugin.webview.luggage.ipc.ActiveMainProcessTask;
import com.tencent.p014mm.plugin.webview.p128ui.tools.game.C44030b;
import com.tencent.p014mm.plugin.webview.p128ui.tools.game.menu.GameMenuImageButton;
import com.tencent.p014mm.plugin.wepkg.model.WepkgVersion;
import com.tencent.p014mm.pointers.PBool;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import di3.C86312j;
import ex0.C45695b;
import ex0.C45696d;
import f40.C86709a0;
import gy3.C87412m;
import h81.C32735h;
import hy1.C46135a;
import hy1.C46137b;
import hy1.C8834c;
import in3.C46279a;
import in3.C87763b;
import j20.C117292a;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import js0.C88016e;
import k20.C60958c;
import k20.C9556a;
import kb3.C46665a;
import kb3.C46677m;
import kb3.C46679n;
import kj2.C117407d;
import ky1.C46803a;
import ky1.C46810d;
import ky1.C46811e;
import ky1.C46814i;
import org.json.JSONException;
import org.json.JSONObject;
import p168i6.C8850b;
import p206nj.C117627q;
import p385u2.C111105a;
import p828wa.C53106j;
import p828wa.C53118n;
import p828wa.C53133t;
import p829xa.C53311a;
import py1.C47671s4;
import rx3.C13598b0;
import u10.C52415a;
import w93.C15056d;
import w93.C53091f;
import y10.C15928a;
import z04.C112551y;
import z04.C66731x;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.game.luggage.page.GameWebPage */
public class GameWebPage extends C43658n implements C15056d {

    /* renamed from: E1 */
    public static final /* synthetic */ int f112952E1 = 0;

    /* renamed from: A1 */
    public boolean f112953A1 = false;

    /* renamed from: B1 */
    public long f112954B1 = 0;

    /* renamed from: C1 */
    public C41941j f112955C1;

    /* renamed from: D1 */
    public C45695b f112956D1 = null;

    /* renamed from: c1 */
    public View f112957c1;

    /* renamed from: d1 */
    public GameMenuImageButton f112958d1;

    /* renamed from: e1 */
    public boolean f112959e1 = false;

    /* renamed from: f1 */
    public boolean f112960f1 = false;

    /* renamed from: g1 */
    public boolean f112961g1 = false;

    /* renamed from: h1 */
    public boolean f112962h1 = false;

    /* renamed from: i1 */
    public C44030b f112963i1 = new C41934b(this);

    /* renamed from: j1 */
    public GameWebPerformanceInfo f112964j1;

    /* renamed from: k1 */
    public long f112965k1;

    /* renamed from: l1 */
    public C53091f f112966l1;

    /* renamed from: m1 */
    public long f112967m1 = 0;

    /* renamed from: n1 */
    public Map<String, C41943b> f112968n1 = new HashMap();

    /* renamed from: o1 */
    public ViewGroup f112969o1;

    /* renamed from: p1 */
    public boolean f112970p1;

    /* renamed from: q1 */
    public boolean f112971q1 = false;

    /* renamed from: r1 */
    public C41948f f112972r1;

    /* renamed from: s1 */
    public boolean f112973s1 = false;

    /* renamed from: t1 */
    public boolean f112974t1 = true;

    /* renamed from: u1 */
    public boolean f112975u1 = false;

    /* renamed from: v1 */
    public long f112976v1 = 0;

    /* renamed from: w1 */
    public long f112977w1 = 0;

    /* renamed from: x1 */
    public long f112978x1 = 0;

    /* renamed from: y1 */
    public IListener f112979y1 = null;

    /* renamed from: z1 */
    public String f112980z1;

    /* renamed from: com.tencent.mm.plugin.game.luggage.page.GameWebPage$h */
    public class C4563h implements Runnable {
        public C4563h() {
        }

        public void run() {
            View view = GameWebPage.this.f112957c1;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/luggage/page/GameWebPage$8", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/game/luggage/page/GameWebPage$8", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.page.GameWebPage$BizFinderLineStatusChangedEventListenerImpl */
    public static class BizFinderLineStatusChangedEventListenerImpl extends IListener<BizFinderLineStatusChangedEvent> {

        /* renamed from: d */
        public WeakReference<C41954g> f112981d;

        public BizFinderLineStatusChangedEventListenerImpl(C41954g gVar) {
            super(C40008f.f107254d);
            this.f112981d = new WeakReference<>(gVar);
            this.__eventId = -1230141771;
        }

        public boolean callback(IEvent iEvent) {
            BizFinderLineStatusChangedEvent bizFinderLineStatusChangedEvent = (BizFinderLineStatusChangedEvent) iEvent;
            WeakReference<C41954g> weakReference = this.f112981d;
            if (weakReference == null || weakReference.get() == null) {
                return false;
            }
            Log.m105924i("MicroMsg.GameWebPage", "callback");
            C41954g gVar = this.f112981d.get();
            gVar.getClass();
            gVar.post(new C41960i(gVar));
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.page.GameWebPage$a */
    public class C41933a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f112982d;

        public C41933a(int i) {
            this.f112982d = i;
        }

        public void run() {
            String format = String.format("javascript:(function(){ window.wgclient = window.wgclient || {}; window.wgclient.__currentFontSize__= %d; })()", new Object[]{Integer.valueOf(this.f112982d)});
            Log.m105925i("MicroMsg.GameWebPage", "initFontSize, fontSize:%s", format);
            GameWebPage.this.mo67937p(format, (ValueCallback<String>) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.page.GameWebPage$b */
    public class C41934b extends C44030b {
        public C41934b(GameWebPage gameWebPage) {
        }

        /* renamed from: b */
        public void mo65810b(Bundle bundle) {
            C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, C8834c.class, (C1256g) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.page.GameWebPage$c */
    public class C41935c implements C41941j {
        public C41935c() {
        }

        /* renamed from: a */
        public void mo65811a() {
            String format = String.format("javascript:(function(){ window.wgclient = window.wgclient || {}; window.wgclient.__report_session_id__=\"%s\"; })()", new Object[]{C41864d.m45385b().getString("session_id")});
            Log.m105925i("MicroMsg.GameWebPage", "getSessionId, jsStr_6:%s", format);
            GameWebPage.this.mo67937p(format, (ValueCallback<String>) null);
            String format2 = String.format("javascript:(function(){ window.wgclient = window.wgclient || {}; window.wgclient.__gameNavigationBarHeight__= %d; })()", new Object[]{Integer.valueOf(C75044y4.m89991c(GameWebPage.this.f148196d))});
            Log.m105925i("MicroMsg.GameWebPage", "gameNavigationBarHeight, jsStr_6:%s", format2);
            GameWebPage.this.mo67937p(format2, (ValueCallback<String>) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.page.GameWebPage$d */
    public class C41936d implements Runnable {
        public C41936d() {
        }

        public void run() {
            GameWebPage.m45514W(GameWebPage.this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.page.GameWebPage$e */
    public class C41937e implements Runnable {
        public C41937e() {
        }

        public void run() {
            GameWebPage gameWebPage = GameWebPage.this;
            gameWebPage.getClass();
            gameWebPage.f117947q.evaluateJavascript(C88016e.m109548e("game_performance.js"), new C41979s(gameWebPage, System.currentTimeMillis()));
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.page.GameWebPage$f */
    public class C41938f implements ValueCallback<String> {

        /* renamed from: a */
        public final /* synthetic */ Runnable f112987a;

        public C41938f(Runnable runnable) {
            this.f112987a = runnable;
        }

        public void onReceiveValue(Object obj) {
            String str = (String) obj;
            try {
                GameWebPage.this.f112976v1 = (long) Double.parseDouble(str);
            } catch (NumberFormatException unused) {
                GameWebPage.this.f112976v1 = 0;
            }
            Log.m105925i("MicroMsg.GameWebPage", "FCP_Content:%s, FCP_Value:%d", str, Long.valueOf(GameWebPage.this.f112976v1));
            Runnable runnable = this.f112987a;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.page.GameWebPage$g */
    public class C41939g implements GameMenuImageButton.C44033b {
        public C41939g() {
        }

        /* renamed from: a */
        public void mo65815a() {
            GameWebPage.this.mo65789T();
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.page.GameWebPage$i */
    public class C41940i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f112990d;

        /* renamed from: e */
        public final /* synthetic */ Bundle f112991e;

        public C41940i(String str, Bundle bundle) {
            this.f112990d = str;
            this.f112991e = bundle;
        }

        public void run() {
            GameWebPage.super.mo65794c(this.f112990d, this.f112991e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.page.GameWebPage$j */
    public interface C41941j {
        /* renamed from: a */
        void mo65811a();
    }

    public GameWebPage(C53118n nVar, C53133t tVar, Bundle bundle) {
        super(nVar, tVar, bundle);
        Log.m105925i("MicroMsg.GameWebPage", "initWebPageEnd, __Time__， time: %d", Long.valueOf(System.currentTimeMillis()));
        String string = bundle.getString("rawUrl");
        GameWebPerformanceInfo b = GameWebPerformanceInfo.m43446b(string);
        this.f112964j1 = b;
        b.f108355e = mo65796d0();
        this.f112964j1.f108340B = System.currentTimeMillis();
        this.f112966l1 = mo65798e0(string);
        String string2 = this.f148261n.getString("rawUrl");
        if (!Util.isNullOrNil(string2)) {
            Uri parse = Uri.parse(string2);
            String queryParameter = C85875k4.m106211z() ? parse.getQueryParameter("darkmode_nav_color") : parse.getQueryParameter("nav_color");
            if (!Util.isNullOrNil(queryParameter)) {
                try {
                    this.f148261n.putInt("customize_status_bar_color", Color.parseColor("#" + queryParameter));
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        String host = Util.getHost(string);
        if (host != null && host.equals(WeChatHosts.domainString(C0966R.string.flk))) {
            this.f148259i.f148230e = C53311a.f148909a;
        }
        mo65799f0().f125659l = new C41974p(this);
        ((C41962j) this.f148259i.mo73819g()).setRawUrl(string);
        C39517b bVar = this.f117947q;
        if (bVar != null) {
            bVar.evaluateJavascript(";(function(){return window.devicePixelRatio})();", new C41900d());
        }
        this.f117947q.addJavascriptInterface(new C46814i(C43626k0.m47359a(this)), "WxGameJsCoreNative");
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_game_create_jscore_android, false)) {
            LinkedList<C46803a> linkedList = C46803a.f125929j;
            synchronized (C46803a.class) {
                C46803a peek = C46803a.f125929j.peek();
                if (peek != null) {
                    C46803a.C46807c cVar = peek.f125932h;
                    if (cVar != C46803a.C46807c.destroyed) {
                        if (cVar == C46803a.C46807c.stopped) {
                            peek.f125932h = C46803a.C46807c.inited;
                            peek.f125930f.mo72031a(new C46810d(peek, "onResume"));
                        }
                    }
                }
                Log.m105924i("MicroMsg.GameJsCore", "create new");
                C46803a.f125929j.addFirst(new C46803a());
            }
            mo65793b0("created", C43626k0.m47359a(this), string);
        }
        this.f112955C1 = new C41935c();
    }

    /* renamed from: W */
    public static void m45514W(GameWebPage gameWebPage) {
        gameWebPage.getClass();
        Log.m105925i("MicroMsg.GameWebPage", "continueBackground, __Time__, time: %d", Long.valueOf(System.currentTimeMillis()));
        int indexOf = C53106j.this.f148204d.indexOf(gameWebPage);
        if (indexOf <= 1 || !(C53106j.this.f148204d.get(indexOf - 1) instanceof C41942a)) {
            super.mo65797e();
            gameWebPage.f112977w1 += System.currentTimeMillis() - gameWebPage.f112978x1;
            gameWebPage.f112978x1 = System.currentTimeMillis();
            for (C41943b e : ((HashMap) gameWebPage.f112968n1).values()) {
                e.mo65797e();
            }
            gameWebPage.mo65793b0("background", C43626k0.m47359a(gameWebPage), (String) null);
        }
    }

    /* renamed from: B */
    public boolean mo65778B(String str) {
        C41962j jVar = (C41962j) this.f117947q;
        Log.m105919d("MicroMsg.GameWebCoreImpl", "isWebCacheUrl, hasLoadWePkg: %b", Boolean.valueOf(jVar.f113035C));
        if (!jVar.f113035C) {
            jVar.f113034B.mo71927f(str, true, false);
            jVar.f113035C = true;
        }
        return jVar.f113034B.mo71926e(str);
    }

    /* renamed from: C */
    public void mo65779C(String str) {
        super.mo65779C(str);
        GameWebPerformanceInfo gameWebPerformanceInfo = this.f112964j1;
        if (gameWebPerformanceInfo.f108342D == 0) {
            gameWebPerformanceInfo.f108342D = System.currentTimeMillis();
        }
    }

    /* renamed from: C3 */
    public Map<Integer, Object> mo14074C3() {
        HashMap hashMap = new HashMap();
        C53091f c = C53091f.m59448c(mo67941t());
        if (c != null) {
            hashMap.put(30, Long.valueOf(c.f148167c - c.f148166b));
            hashMap.put(31, Long.valueOf(c.f148168d - c.f148166b));
            hashMap.put(32, Long.valueOf(c.f148169e - c.f148168d));
            hashMap.put(33, Long.valueOf(c.f148171g - c.f148170f));
            hashMap.put(34, Long.valueOf(c.f148173i - c.f148172h));
            hashMap.put(45, Long.valueOf(c.f148174j));
            hashMap.put(50, Long.valueOf(c.f148175k));
            hashMap.put(38, Long.valueOf(c.f148176l));
            hashMap.put(39, Long.valueOf(c.f148177m));
            hashMap.put(40, Long.valueOf(c.f148178n));
            hashMap.put(41, Long.valueOf(c.f148179o));
            hashMap.put(42, Long.valueOf(c.f148180p));
            hashMap.put(43, Long.valueOf(c.f148181q));
            hashMap.put(44, Long.valueOf(c.f148182r));
            hashMap.put(51, Long.valueOf(System.currentTimeMillis()));
            hashMap.put(52, Long.valueOf(c.f148183s));
        }
        C46677m f0 = mo65799f0();
        if (!f0.f125651d) {
            f0.f125664q = null;
        }
        hashMap.put(49, Integer.valueOf(Util.isNullOrNil(f0.f125664q) ^ true ? 1 : 0));
        hashMap.put(53, Integer.valueOf(this.f112974t1 ? 1 : 0));
        hashMap.put(54, Integer.valueOf(this.f112973s1 ? 1 : 0));
        hashMap.put(55, Long.valueOf(this.f112976v1));
        hashMap.put(56, Long.valueOf(this.f112977w1));
        return hashMap;
    }

    /* renamed from: G */
    public void mo65780G(String str) {
        C53091f fVar = this.f112966l1;
        if (fVar.f148170f == 0) {
            fVar.f148170f = System.currentTimeMillis();
        }
    }

    /* renamed from: H */
    public void mo65781H(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        Log.m105925i("MicroMsg.GameWebPage", "onUrlLoadingFinished, url = %s, __Time__, time = %d", str, Long.valueOf(currentTimeMillis));
        super.mo65781H(str);
        GameWebPerformanceInfo gameWebPerformanceInfo = this.f112964j1;
        if (gameWebPerformanceInfo.f108344F == 0) {
            gameWebPerformanceInfo.f108344F = currentTimeMillis;
        }
        C53091f fVar = this.f112966l1;
        if (fVar.f148169e == 0) {
            fVar.f148169e = currentTimeMillis;
        }
        try {
            if (!this.f112959e1) {
                this.f112959e1 = true;
                C52415a.m58668a().mo62980b(7, URLEncoder.encode(mo67941t()), "", currentTimeMillis - this.f112966l1.f148165a);
            }
        } catch (Exception unused) {
        }
        C40319a0.m43495c(true, new C41930n(this.f148259i, this.f117928R));
        this.f112963i1.f119298f.mo68639b();
    }

    /* renamed from: I */
    public void mo65782I(String str) {
        C41941j jVar = this.f112955C1;
        if (jVar != null) {
            jVar.mo65811a();
        }
        this.f117925P.postUI(new C41977q(this));
        C46677m f0 = mo65799f0();
        C39517b bVar = this.f117947q;
        f0.getClass();
        MMHandlerThread.postToMainThread(new C46679n(f0, bVar));
        long currentTimeMillis = System.currentTimeMillis();
        Log.m105925i("MicroMsg.GameWebPage", "onUrlLoadingStarted, url = %s, __Time__, time = %d", str, Long.valueOf(currentTimeMillis));
        super.mo65782I(str);
        GameWebPerformanceInfo gameWebPerformanceInfo = this.f112964j1;
        if (gameWebPerformanceInfo.f108343E == 0) {
            gameWebPerformanceInfo.f108343E = currentTimeMillis;
        }
        C53091f fVar = this.f112966l1;
        if (fVar.f148168d == 0) {
            fVar.f148168d = currentTimeMillis;
        }
        String host = Util.getHost(str);
        if (host == null || !host.equals(WeChatHosts.domainString(C0966R.string.flk))) {
            this.f148259i.f148230e = this.f117924N;
        } else {
            this.f148259i.f148230e = C53311a.f148909a;
        }
        C44030b bVar2 = C44030b.this;
        bVar2.f119297e = null;
        bVar2.f119294b = 0;
        bVar2.f119295c = 0;
        bVar2.f119296d = 0;
    }

    /* renamed from: J */
    public void mo65783J(int i, String str, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        Log.m105925i("MicroMsg.GameWebPage", "onReceivedError, errorCode: %d, description: %s, failingUrl: %s , time: %d", Integer.valueOf(i), str, str2, Long.valueOf(currentTimeMillis));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errcode", i);
            jSONObject.put("errurl", str2);
            C52415a.m58668a().mo62980b(8, URLEncoder.encode(mo67941t()), URLEncoder.encode(jSONObject.toString()), currentTimeMillis - this.f112966l1.f148165a);
        } catch (Exception unused) {
        }
    }

    /* renamed from: K */
    public void mo65784K(String str, String str2, Map<String, String> map) {
        super.mo65784K(str, str2, map);
        Log.m105924i("MicroMsg.GameWebPage", "onUrlForceRedirect reqUrl = " + str);
        if (!this.f112953A1) {
            this.f112953A1 = true;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("uia", 1000);
                jSONObject.put("pid", "000");
                jSONObject.put("url", str);
            } catch (JSONException unused) {
            }
            C40314g.m43484c(this.f117950t.getContext(), 36, 0, 0, 56, 0, jSONObject.toString());
        }
    }

    /* renamed from: L */
    public void mo65785L(String str, String str2, Map<String, String> map) {
        super.mo65785L(str, str2, map);
        C41962j jVar = (C41962j) this.f148259i.mo73819g();
        jVar.f113037E = str2;
        jVar.f113038F = map;
        if (Util.isNullOrNil(str2)) {
            Log.m105924i("MicroMsg.LuggageGameUinKeyHolder", "setFullUrlAndHeaders, fullUrl is null");
        } else if (!Uri.parse(str2).getHost().equals(WeChatHosts.domainString(C0966R.string.flk))) {
            Log.m105924i("MicroMsg.LuggageGameUinKeyHolder", "setFullUrlAndHeaders, host is not wxgame");
        } else {
            C41903i.f112900a = str2;
            C41903i.f112901b = map;
            C41903i.f112902c = System.currentTimeMillis() / 1000;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (str.equals(mo67941t())) {
            Log.m105925i("MicroMsg.GameWebPage", "getA8Key end, __Time__, time: %d", Long.valueOf(currentTimeMillis));
            this.f112964j1.f108346H = currentTimeMillis;
        }
        GameWebPerformanceInfo gameWebPerformanceInfo = this.f112964j1;
        if (gameWebPerformanceInfo.f108342D == 0) {
            gameWebPerformanceInfo.f108342D = currentTimeMillis;
        }
        C53091f fVar = this.f112966l1;
        if (fVar.f148171g == 0) {
            fVar.f148171g = System.currentTimeMillis();
        }
        C39517b bVar = this.f117947q;
        if (Util.isNullOrNil(str2) || bVar == null) {
            Log.m105920e("MicroMsg.LuggageGetA8KeyUtil", "url is null");
        } else {
            C40319a0.m43495c(true, new C41932o(str2, map, bVar));
        }
        C40319a0.m43495c(true, new C41930n(this.f148259i, str2));
        this.f112961g1 = true;
    }

    /* renamed from: M */
    public void mo65786M() {
        super.mo65786M();
        C41948f fVar = this.f112972r1;
        if (fVar != null) {
            String j0 = fVar.mo65826j0(fVar.f112999K1);
            if (!Util.isNullOrNil(j0)) {
                ((ConcurrentHashMap) fVar.f112995G1).remove(j0);
                fVar.mo65824h0(j0, 1);
            }
        }
    }

    /* renamed from: P */
    public void mo65787P(boolean z) {
        super.mo65787P(z);
        if (!this.f148261n.getBoolean("show_full_screen", false)) {
            return;
        }
        if (!Util.isNullOrNil(this.f148261n.getString("game_hv_menu_appid"))) {
            if (this.f112958d1 == null) {
                GameMenuImageButton gameMenuImageButton = new GameMenuImageButton(this.f148196d);
                this.f112958d1 = gameMenuImageButton;
                gameMenuImageButton.mo68643a(this.f117949s, new C41939g());
            }
            this.f117911A.setVisibility(8);
            return;
        }
        this.f117911A.setVisibility(0);
    }

    /* renamed from: S */
    public void mo65788S() {
        mo67933N(new C4563h());
    }

    /* renamed from: T */
    public void mo65789T() {
        this.f117951u.mo65849k();
    }

    /* renamed from: V */
    public boolean mo65790V(String str) {
        if (str.equals(mo67941t())) {
            GameWebPerformanceInfo gameWebPerformanceInfo = this.f112964j1;
            if (gameWebPerformanceInfo.f108345G == 0) {
                gameWebPerformanceInfo.f108345G = System.currentTimeMillis();
                Log.m105925i("MicroMsg.GameWebPage", "startGetA8Key, url: %s, time: %d", str, Long.valueOf(this.f112964j1.f108345G));
            }
        }
        return super.mo65790V(str);
    }

    /* renamed from: Z */
    public final void mo65791Z() {
        Class cls = C45696d.class;
        if (!Util.isNullOrNil(this.f112980z1) && ((C45696d) C86709a0.m107533q(cls)).ou0()) {
            ((C45696d) C86709a0.m107533q(cls)).mo70974T2();
            String str = this.f112980z1;
            if (Util.isNullOrNil(str)) {
                Log.m105924i("MicroMsg.GameWebPage", "startCheck fail bizUserName is null");
                return;
            }
            if (this.f112956D1 == null) {
                this.f112956D1 = ((C45696d) C86709a0.m107533q(cls)).F60(9);
            }
            this.f112956D1.mo69386a(str);
        }
    }

    /* renamed from: a0 */
    public void mo65792a0(Runnable runnable) {
        if (!this.f112975u1) {
            this.f112975u1 = true;
            this.f117947q.evaluateJavascript("window.performance.getEntriesByName('first-contentful-paint')[0].startTime", new C41938f(runnable));
        } else if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: b0 */
    public final void mo65793b0(String str, String str2, String str3) {
        if (C46803a.m52100d() != null) {
            C46803a d = C46803a.m52100d();
            d.getClass();
            Log.m105925i("MicroMsg.GameJsCore", "onPageLifeChanged, state:[%s], pageId:[%s], url:[%s]", str, str2, str3);
            d.f125930f.mo72031a(new C46811e(d, str, str3, str2));
        }
    }

    /* renamed from: c */
    public void mo65794c(String str, Bundle bundle) {
        Log.m105925i("MicroMsg.GameWebPage", "load url, __Time__, time: %d", Long.valueOf(System.currentTimeMillis()));
        C53091f fVar = this.f112966l1;
        if (fVar.f148167c == 0) {
            fVar.f148167c = System.currentTimeMillis();
        }
        C41940i iVar = new C41940i(str, bundle);
        if (C80907o.m98784g(MMApplicationContext.getMainProcessName())) {
            Log.m105924i("MicroMsg.GameWebPage", "activeIpcTask, service is alive");
            iVar.run();
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        PBool pBool = new PBool();
        ActiveMainProcessTask activeMainProcessTask = new ActiveMainProcessTask();
        activeMainProcessTask.f117841f = new C41969l(this, currentTimeMillis, activeMainProcessTask, pBool, iVar, str);
        activeMainProcessTask.mo114395c();
        ((C119157j) C119157j.f356862d).mo183878i(new C41970m(this, pBool, iVar), 1000);
    }

    /* renamed from: c0 */
    public String mo65795c0() {
        return this.f148261n.getString("game_pre_inject_data");
    }

    /* renamed from: d0 */
    public String mo65796d0() {
        return (hashCode() & Integer.MAX_VALUE) + "_" + (mo67941t().hashCode() & Integer.MAX_VALUE);
    }

    /* renamed from: e */
    public void mo65797e() {
        Long f;
        ArrayList<C46137b> arrayList;
        boolean z = true;
        Log.m105925i("MicroMsg.GameWebPage", "onBackground, __Time__, time: %d", Long.valueOf(System.currentTimeMillis()));
        IListener iListener = this.f112979y1;
        if (iListener != null) {
            iListener.dead();
            this.f112979y1 = null;
        }
        C45695b bVar = this.f112956D1;
        if (bVar != null) {
            bVar.stopCheck();
        }
        int hashCode = hashCode();
        HashMap<Integer, ArrayList<C46137b>> hashMap = C46135a.f124317b;
        if (!(hashMap == null || hashMap.isEmpty()) && (arrayList = hashMap.get(Integer.valueOf(hashCode))) != null) {
            for (C46137b bVar2 : arrayList) {
                if (bVar2.f124329k) {
                    bVar2.f124328j = Util.currentTicks();
                }
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f117940X) {
            this.f112964j1.f108347I += currentTimeMillis - this.f112965k1;
            this.f112963i1.f119298f.mo68640c();
        }
        if (!this.f112974t1 && currentTimeMillis - this.f112954B1 > 1000) {
            int i = (int) ((currentTimeMillis - this.f112965k1) / 1000);
            String v = mo67943v();
            long j = (long) this.f117939W0;
            PageTimeReport27743 pageTimeReport27743 = PageTimeReport27743.f113093a;
            if (v == null || v.length() == 0) {
                Log.m105920e("MicroMsg.GamePageTimeReport", "gamelog.report, 27743 ,  error url isNullOrEmpty");
            } else {
                String queryParameter = Uri.parse(v).getQueryParameter(TPDownloadProxyEnum.USER_SSID);
                long longValue = (queryParameter == null || (f = C66731x.m78732f(queryParameter)) == null) ? 0 : f.longValue();
                String str = PageTimeReport27743.f113096d.get(v);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("a8keyScene", j);
                    if (str != null) {
                        if (str.length() != 0) {
                            z = false;
                        }
                    }
                    if (!z) {
                        jSONObject.put("ext", str);
                    }
                } catch (JSONException unused) {
                }
                PageTimeReport27743.f113093a.mo65887a(i, 0, longValue, v, C15928a.m14857d(jSONObject.toString()));
            }
            this.f112954B1 = currentTimeMillis;
        }
        mo65792a0(new C41936d());
    }

    /* renamed from: e0 */
    public C53091f mo65798e0(String str) {
        return C53091f.m59447b(str);
    }

    /* renamed from: f0 */
    public C46677m mo65799f0() {
        return ((C41962j) this.f117947q).getWePkgPlugin();
    }

    /* renamed from: g */
    public void mo65800g() {
        String str;
        Log.m105925i("MicroMsg.GameWebPage", "onDestroy, __Time__, time: %d", Long.valueOf(System.currentTimeMillis()));
        super.mo65800g();
        int hashCode = hashCode();
        HashMap<Integer, ArrayList<C46137b>> hashMap = C46135a.f124317b;
        if (!(hashMap == null || hashMap.isEmpty())) {
            ArrayList<C46137b> remove = hashMap.remove(Integer.valueOf(hashCode));
            if (remove != null) {
                for (C46137b bVar : remove) {
                    String str2 = bVar.f124323e;
                    if (str2 == null || str2.length() == 0) {
                        str = bVar.f124322d;
                    } else if (bVar.f124328j != 0) {
                        str = C112551y.m153816p(bVar.f124322d, bVar.f124323e, String.valueOf(bVar.f124326h + (bVar.f124327i ? Util.currentTicks() - bVar.f124328j : (Util.currentTicks() - bVar.f124328j) / 1000)), false, 4, (Object) null);
                    } else {
                        str = C112551y.m153816p(bVar.f124322d, bVar.f124323e, String.valueOf(bVar.f124326h), false, 4, (Object) null);
                    }
                    Log.m105924i("MicroMsg.GamePageTimeReport", "gamelog.report, logId = " + bVar.f124320b + ", reportContent = " + str);
                    C117407d.INSTANCE.kvStat(bVar.f124320b, str);
                }
            }
            C46135a.f124318c.dead();
        }
        this.f112963i1.f119298f.mo68638a();
        this.f112964j1.f108348J = System.currentTimeMillis();
        if (!this.f148261n.getBoolean("from_bag", false)) {
            C52415a a = C52415a.m58668a();
            if (a != null) {
                a.mo62983e(this.f112964j1);
            }
            try {
                if (!this.f112960f1) {
                    this.f112960f1 = true;
                    JSONObject jSONObject = new JSONObject();
                    long j = this.f112967m1;
                    if (j == 0) {
                        jSONObject.put("render_duration", 0);
                    } else {
                        jSONObject.put("render_duration", j - this.f112966l1.f148165a);
                    }
                    C52415a.m58668a().mo62980b(9, URLEncoder.encode(mo67941t()), URLEncoder.encode(jSONObject.toString()), System.currentTimeMillis() - this.f112966l1.f148165a);
                }
            } catch (Exception unused) {
            }
        }
        GameWebPerformanceInfo gameWebPerformanceInfo = (GameWebPerformanceInfo) ((HashMap) GameWebPerformanceInfo.f108338Q).remove(mo67941t());
        Collection<C41943b> values = ((HashMap) this.f112968n1).values();
        if (values != null && values.size() > 0) {
            for (C41943b g : values) {
                g.mo65800g();
            }
            if (this.f117917G.mo160080e()) {
                MultiTaskInfo multiTaskInfo = this.f117917G.f326418a;
                C43691z0.m47521a(multiTaskInfo != null ? multiTaskInfo.field_id : null);
            }
        }
        mo65793b0("destroyed", C43626k0.m47359a(this), (String) null);
    }

    /* renamed from: h */
    public void mo65801h() {
        String str;
        Log.m105925i("MicroMsg.GameWebPage", "onForeground, __Time__, time: %d", Long.valueOf(System.currentTimeMillis()));
        C43661n0 n0Var = this.f117951u;
        if ((n0Var instanceof C41954g) && this.f112979y1 == null) {
            BizFinderLineStatusChangedEventListenerImpl bizFinderLineStatusChangedEventListenerImpl = new BizFinderLineStatusChangedEventListenerImpl((C41954g) n0Var);
            this.f112979y1 = bizFinderLineStatusChangedEventListenerImpl;
            bizFinderLineStatusChangedEventListenerImpl.alive();
        }
        int hashCode = hashCode();
        HashMap<Integer, ArrayList<C46137b>> hashMap = C46135a.f124317b;
        if (!(hashMap == null || hashMap.isEmpty())) {
            ArrayList arrayList = hashMap.get(Integer.valueOf(hashCode));
            Iterator it = arrayList != null ? arrayList.iterator() : null;
            if (it != null) {
                while (it.hasNext()) {
                    Object next = it.next();
                    C87412m.m108593f(next, "iterator.next()");
                    C46137b bVar = (C46137b) next;
                    if (bVar.f124329k) {
                        String str2 = bVar.f124323e;
                        if (str2 == null || str2.length() == 0) {
                            str = bVar.f124322d;
                        } else {
                            str = C112551y.m153816p(bVar.f124322d, bVar.f124323e, String.valueOf(bVar.f124326h + (bVar.f124327i ? Util.currentTicks() - bVar.f124328j : (Util.currentTicks() - bVar.f124328j) / 1000)), false, 4, (Object) null);
                        }
                        Log.m105924i("MicroMsg.GamePageTimeReport", "gamelog.report, logId = " + bVar.f124320b + ", reportContent = " + str);
                        C117407d.INSTANCE.kvStat(bVar.f124320b, str);
                        synchronized (C46135a.f124316a) {
                            it.remove();
                            C13598b0 b0Var = C13598b0.f38549a;
                        }
                    }
                }
            }
        }
        mo65791Z();
        GameWebPerformanceInfo gameWebPerformanceInfo = this.f112964j1;
        if (gameWebPerformanceInfo.f108373z == 0) {
            gameWebPerformanceInfo.f108373z = System.currentTimeMillis();
        }
        this.f112965k1 = System.currentTimeMillis();
        this.f112963i1.f119298f.mo68642e();
        super.mo65801h();
        this.f112978x1 = System.currentTimeMillis();
        for (C41943b h : this.f112968n1.values()) {
            h.mo65801h();
        }
        mo65793b0("foreground", C43626k0.m47359a(this), (String) null);
        this.f112974t1 = false;
    }

    /* renamed from: j */
    public void mo65802j() {
        if (this.f117940X) {
            this.f112977w1 += System.currentTimeMillis() - this.f112978x1;
        }
        mo65792a0(new C41937e());
    }

    /* renamed from: l */
    public View mo65803l() {
        View l = super.mo65803l();
        View inflate = LayoutInflater.from(this.f148196d).inflate(C0966R.C0971layout.f359814ax2, this.f117912B, false);
        this.f112957c1 = inflate;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = inflate;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/luggage/page/GameWebPage", "initContentView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/game/luggage/page/GameWebPage", "initContentView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f117912B.addView(this.f112957c1, new FrameLayout.LayoutParams(-2, -2, 17));
        Log.m105925i("MicroMsg.GameWebPage", "create vie end, time: %d", Long.valueOf(System.currentTimeMillis()));
        return l;
    }

    /* renamed from: n */
    public View mo65804n() {
        C41954g gVar = new C41954g(this);
        this.f117951u = gVar;
        return gVar;
    }

    /* renamed from: r1 */
    public Map<Integer, Object> mo14075r1() {
        HashMap hashMap = new HashMap();
        hashMap.put(21, mo65796d0());
        hashMap.put(22, NetStatusUtil.getFormatedNetType(MMApplicationContext.getContext()));
        hashMap.put(23, String.valueOf(C8850b.m8679b(MMApplicationContext.getContext())));
        String t = mo67941t();
        try {
            hashMap.put(24, C117627q.m165909b(Util.nullAsNil(t), "UTF-8"));
        } catch (UnsupportedEncodingException unused) {
        }
        hashMap.put(25, Integer.valueOf(mo65778B(t) ? 1 : 0));
        hashMap.put(26, 1);
        if (this instanceof C41980t) {
            hashMap.put(27, 1);
        } else {
            hashMap.put(27, 0);
        }
        WepkgVersion wepkgVersion = mo65799f0().f125653f;
        hashMap.put(28, wepkgVersion != null ? wepkgVersion.f120653f : "");
        mo65799f0().getClass();
        hashMap.put(29, C46665a.m51972a());
        return hashMap;
    }

    /* renamed from: w */
    public boolean mo65805w(int i) {
        C53311a aVar = this.f148259i.f148230e;
        C53311a aVar2 = aVar == null ? C53311a.f148909a : aVar;
        C53311a aVar3 = C53311a.f148909a;
        if (aVar2 == aVar3) {
            return true;
        }
        if (aVar == null) {
            aVar = aVar3;
        }
        if (aVar == C53311a.f148910b) {
            return false;
        }
        return super.mo65805w(i);
    }

    /* renamed from: x */
    public void mo65806x() {
        View view = this.f112957c1;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/luggage/page/GameWebPage", "hideLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/game/luggage/page/GameWebPage", "hideLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: y */
    public void mo65807y() {
        C47671s4 l;
        if (!this.f117934U) {
            int i = this.f148261n.getInt("customize_status_bar_color");
            this.f117936V = i;
            if (i == 0 && (l = C41853c.m45378l()) != null && !Util.isNullOrNil(l.f128001d) && !Util.isNullOrNil(l.f128003f)) {
                try {
                    if (C85875k4.m106211z()) {
                        this.f117936V = Color.parseColor(l.f128003f);
                    } else {
                        this.f117936V = Color.parseColor(l.f128001d);
                    }
                } catch (IllegalArgumentException e) {
                    Log.m105920e("MicroMsg.GameWebPage", "parse color: " + e.getMessage());
                }
                if (this.f117936V == 0) {
                    this.f117936V = C111105a.m151500b(this.f148196d, C0966R.color.f3008c5);
                }
            }
        }
        if (!this.f112962h1) {
            this.f112962h1 = true;
            mo67934O();
        }
        C43661n0 n0Var = this.f117951u;
        Integer num = n0Var.f117988C;
        if (num != null) {
            C87763b bVar = n0Var.f117991d;
            bVar.f254108u = null;
            C46279a.m51577a(bVar, num.intValue(), !n0Var.f117989D);
        }
    }

    /* renamed from: z */
    public int mo65808z() {
        int z = super.mo65808z();
        this.f117925P.postUI(new C41933a(z));
        return z;
    }
}
