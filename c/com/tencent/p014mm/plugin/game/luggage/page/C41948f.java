package com.tencent.p014mm.plugin.game.luggage.page;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import androidx.appcompat.app.C103422m;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.game.commlib.util.C41864d;
import com.tencent.p014mm.plugin.game.luggage.page.GameWebPage;
import com.tencent.p014mm.plugin.game.p061ui.chat_tab.C42303o;
import com.tencent.p014mm.plugin.game.p061ui.chat_tab.GameWebTabUI;
import com.tencent.p014mm.plugin.webview.luggage.C43661n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import jy1.C46582b;
import jy1.C46591h;
import p828wa.C53118n;
import p828wa.C53133t;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.game.luggage.page.f */
public class C41948f extends GameWebPage {

    /* renamed from: F1 */
    public Map<String, GameWebPage> f112994F1 = new ConcurrentHashMap();

    /* renamed from: G1 */
    public Map<String, Integer> f112995G1 = new ConcurrentHashMap();

    /* renamed from: H1 */
    public C41953d f112996H1;

    /* renamed from: I1 */
    public FrameLayout f112997I1;

    /* renamed from: J1 */
    public View f112998J1;

    /* renamed from: K1 */
    public GameWebPage f112999K1;

    /* renamed from: L1 */
    public String f113000L1;

    /* renamed from: M1 */
    public Dialog f113001M1;

    /* renamed from: N1 */
    public MMActivity f113002N1;

    /* renamed from: O1 */
    public C41952c f113003O1;

    /* renamed from: com.tencent.mm.plugin.game.luggage.page.f$a */
    public class C41949a implements Runnable {
        public C41949a() {
        }

        public void run() {
            Dialog dialog = C41948f.this.f113001M1;
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.page.f$b */
    public class C41950b implements GameWebPage.C41941j {

        /* renamed from: a */
        public final /* synthetic */ String f113005a;

        /* renamed from: b */
        public final /* synthetic */ GameWebPage f113006b;

        /* renamed from: com.tencent.mm.plugin.game.luggage.page.f$b$a */
        public class C41951a implements Runnable {
            public C41951a() {
            }

            public void run() {
                C41950b bVar = C41950b.this;
                C41952c cVar = C41948f.this.f113003O1;
                if (cVar != null) {
                    String str = bVar.f113005a;
                    GameWebTabUI.C42277c cVar2 = (GameWebTabUI.C42277c) cVar;
                    if (str.equalsIgnoreCase(cVar2.f114335a.f114318n)) {
                        String format = String.format("javascript:(function(){ window.wgclient = window.wgclient || {}; window.wgclient.__isGameIndexPreload__= %s; })()", new Object[]{Boolean.valueOf(((Boolean) C46582b.f125488c.mo124238b(C46582b.f125486a, C46582b.f125487b[0])).booleanValue())});
                        Log.m105925i("MicroMsg.GameWebTabUI", "gamelog.setInjectJsPreloadDataCallback.tabKey:%s, jsStr_1:%s", str, format);
                        cVar2.f114335a.f112863g.mo67937p(format, (ValueCallback<String>) null);
                        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, null, C46591h.class, new C42303o(cVar2));
                    }
                }
                Object[] objArr = new Object[1];
                C41953d dVar = C41948f.this.f112996H1;
                objArr[0] = Integer.valueOf(dVar != null ? dVar.mo65839g() : 0);
                String format2 = String.format("javascript:(function(){ window.wgclient = window.wgclient || {}; window.wgclient.__gameTabHeight__= %d; })()", objArr);
                Log.m105925i("MicroMsg.GameTabWebPage", "tabKey:%s, jsStr_1:%s", C41950b.this.f113005a, format2);
                C41950b.this.f113006b.mo67937p(format2, (ValueCallback<String>) null);
                Object[] objArr2 = new Object[1];
                C41953d dVar2 = C41948f.this.f112996H1;
                objArr2[0] = dVar2 != null ? dVar2.mo65840h() : "";
                String format3 = String.format("javascript:(function(){ window.wgclient = window.wgclient || {}; window.wgclient.__gameTabInfo__= %s; })()", objArr2);
                Log.m105925i("MicroMsg.GameTabWebPage", "tabKey:%s, jsStr_2:%s", C41950b.this.f113005a, format3);
                C41950b.this.f113006b.mo67937p(format3, (ValueCallback<String>) null);
                Object[] objArr3 = new Object[1];
                C41953d dVar3 = C41948f.this.f112996H1;
                objArr3[0] = Integer.valueOf(dVar3 != null ? dVar3.mo65838f() : 0);
                String format4 = String.format("javascript:(function(){ window.wgclient = window.wgclient || {}; window.wgclient.__chatPageStyle__= %s; })()", objArr3);
                Log.m105925i("MicroMsg.GameTabWebPage", "getChatPageStyle, jsStr_3:%s", format4);
                C41950b.this.f113006b.mo67937p(format4, (ValueCallback<String>) null);
                Object[] objArr4 = new Object[1];
                C41953d dVar4 = C41948f.this.f112996H1;
                objArr4[0] = Boolean.valueOf(dVar4 != null ? dVar4.mo65834b() : false);
                String format5 = String.format("javascript:(function(){ window.wgclient = window.wgclient || {}; window.wgclient.__forceHideTab__= %s; })()", objArr4);
                Log.m105925i("MicroMsg.GameTabWebPage", "isForceHideTab: jsStr_4:%s", format5);
                C41950b.this.f113006b.mo67937p(format5, (ValueCallback<String>) null);
                Object[] objArr5 = new Object[1];
                C41953d dVar5 = C41948f.this.f112996H1;
                objArr5[0] = Boolean.valueOf(dVar5 != null ? dVar5.mo65841i() : false);
                String format6 = String.format("javascript:(function(){ window.wgclient = window.wgclient || {}; window.wgclient.__hasEntranceInfo__= %s; })()", objArr5);
                Log.m105925i("MicroMsg.GameTabWebPage", "hasEntranceInfo : jsStr_5:%s", format6);
                C41950b.this.f113006b.mo67937p(format6, (ValueCallback<String>) null);
                String format7 = String.format("javascript:(function(){ window.wgclient = window.wgclient || {}; window.wgclient.__report_session_id__=\"%s\"; })()", new Object[]{C41864d.m45385b().getString("session_id")});
                Log.m105925i("MicroMsg.GameTabWebPage", "getSessionId, jsStr_6:%s", format7);
                C41950b.this.f113006b.mo67937p(format7, (ValueCallback<String>) null);
                String format8 = String.format("javascript:(function(){ window.wgclient = window.wgclient || {}; window.wgclient.__gameNavigationBarHeight__= %d; })()", new Object[]{Integer.valueOf(C75044y4.m89991c(C41948f.this.f148196d))});
                Log.m105925i("MicroMsg.GameTabWebPage", "gameNavigationBarHeight, jsStr_6:%s", format8);
                C41950b.this.f113006b.mo67937p(format8, (ValueCallback<String>) null);
                C41950b bVar2 = C41950b.this;
                C41948f.this.mo65824h0(bVar2.f113005a, 2);
            }
        }

        public C41950b(String str, GameWebPage gameWebPage) {
            this.f113005a = str;
            this.f113006b = gameWebPage;
        }

        /* renamed from: a */
        public void mo65811a() {
            C41948f.this.f117925P.postUI(new C41951a());
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.page.f$c */
    public interface C41952c {
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.page.f$d */
    public interface C41953d {
        /* renamed from: a */
        boolean mo65833a();

        /* renamed from: b */
        boolean mo65834b();

        /* renamed from: c */
        void mo65835c(boolean z);

        /* renamed from: d */
        void mo65836d(int i);

        /* renamed from: e */
        void mo65837e(int i);

        /* renamed from: f */
        int mo65838f();

        /* renamed from: g */
        int mo65839g();

        /* renamed from: h */
        String mo65840h();

        /* renamed from: i */
        boolean mo65841i();

        /* renamed from: j */
        void mo65842j(String str);
    }

    public C41948f(C53118n nVar, C53133t tVar, Bundle bundle) {
        super(nVar, tVar, bundle);
        Context context = this.f148196d;
        if (context instanceof MMActivity) {
            this.f113002N1 = (MMActivity) context;
        }
        String string = bundle.getString("game_tab_key");
        if (!Util.isNullOrNil(string)) {
            this.f112994F1.put(string, this);
        }
        this.f112999K1 = this;
        this.f112972r1 = this;
        mo65829m0(this, string);
        C43661n0 n0Var = this.f117951u;
        if (n0Var != null) {
            n0Var.mo67958b();
        }
        this.f113000L1 = bundle.getString("game_pre_inject_data");
        this.f148261n.remove("game_pre_inject_data");
        if (this.f113001M1 == null) {
            C103422m mVar = new C103422m(this.f148196d, C0966R.style.f8486ka);
            this.f113001M1 = mVar;
            mVar.setCanceledOnTouchOutside(true);
        }
    }

    /* renamed from: a */
    public void mo65822a() {
        super.mo65822a();
        for (GameWebPage next : this.f112994F1.values()) {
            if (!(next == null || next == this)) {
                next.mo65822a();
            }
        }
        this.f112994F1.clear();
    }

    /* renamed from: c0 */
    public String mo65795c0() {
        return this.f113000L1;
    }

    /* renamed from: e */
    public void mo65797e() {
        GameWebPage gameWebPage = this.f112999K1;
        if (gameWebPage != null) {
            if (gameWebPage instanceof C41948f) {
                Log.m105925i("MicroMsg.GameTabWebPage", "GameTabWebPage onBackground, url:%s", gameWebPage.mo67941t());
                GameWebPage gameWebPage2 = this.f112999K1;
                if (gameWebPage2 == this) {
                    super.mo65797e();
                } else {
                    gameWebPage2.mo65797e();
                }
                if (this.f117954x.isShown()) {
                    mo67935U(false);
                    return;
                }
                return;
            }
            Log.m105925i("MicroMsg.GameTabWebPage", "onBackground, url:%s", gameWebPage.mo67941t());
            this.f112999K1.mo73784f();
            GameWebPage gameWebPage3 = this.f112999K1;
            if (gameWebPage3.f117954x.isShown()) {
                gameWebPage3.mo67935U(false);
            }
        }
    }

    /* renamed from: g */
    public void mo65800g() {
        Log.m105924i("MicroMsg.GameTabWebPage", "onDestroy");
        Dialog dialog = this.f113001M1;
        if (dialog != null) {
            dialog.dismiss();
            this.f113001M1 = null;
        }
        super.mo65800g();
    }

    /* renamed from: g0 */
    public void mo65823g0(String str) {
        GameWebPage gameWebPage;
        View view;
        if (!Util.isNullOrNil(str) && (gameWebPage = (GameWebPage) ((ConcurrentHashMap) this.f112994F1).get(str)) != null) {
            Log.m105925i("MicroMsg.GameTabWebPage", "switch to tab: %s", str);
            if (gameWebPage != this || (view = this.f112998J1) == null) {
                gameWebPage.f148258h.bringToFront();
                gameWebPage.mo65801h();
                GameWebPage gameWebPage2 = this.f112999K1;
                if (gameWebPage2 != gameWebPage) {
                    gameWebPage2.mo65797e();
                }
            } else {
                view.bringToFront();
            }
            this.f112999K1 = gameWebPage;
        }
    }

    /* renamed from: h */
    public void mo65801h() {
        GameWebPage gameWebPage = this.f112999K1;
        if (gameWebPage != null) {
            mo65824h0(mo65826j0(gameWebPage), 1);
            GameWebPage gameWebPage2 = this.f112999K1;
            if (gameWebPage2 instanceof C41948f) {
                Log.m105925i("MicroMsg.GameTabWebPage", "GameTabWebPage onForeground, url:%s", gameWebPage2.mo67941t());
                GameWebPage gameWebPage3 = this.f112999K1;
                if (gameWebPage3 == this) {
                    super.mo65801h();
                } else {
                    gameWebPage3.mo65801h();
                }
            } else {
                Log.m105925i("MicroMsg.GameTabWebPage", "onForeground, url:%s", gameWebPage2.mo67941t());
                this.f112999K1.mo73786i();
            }
            Dialog dialog = this.f113001M1;
            if (dialog != null) {
                dialog.show();
            }
            C119179t tVar = C119157j.f356862d;
            C41949a aVar = new C41949a();
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(aVar, 50, false);
        }
    }

    /* renamed from: h0 */
    public final void mo65824h0(String str, int i) {
        Integer num = this.f112995G1.get(str);
        if (num == null) {
            this.f112995G1.put(str, Integer.valueOf(i));
        } else {
            this.f112995G1.put(str, Integer.valueOf(i | num.intValue()));
        }
        if (!Util.isNullOrNil(str) && this.f112995G1.containsKey(str) && this.f112994F1.containsKey(str) && this.f112995G1.get(str).intValue() == 3) {
            this.f112995G1.put(str, 4);
            this.f112994F1.get(str).mo67937p("javascript:(function(){ window.__gameTabFirstShow__= 1; })()", (ValueCallback<String>) null);
            Log.m105925i("MicroMsg.GameTabWebPage", "injectTabFirstShow, tabKey:%s", str);
        }
    }

    /* renamed from: i0 */
    public void mo65825i0() {
        Log.m105924i("MicroMsg.GameTabWebPage", "computeFcp()");
        for (GameWebPage gameWebPage : ((ConcurrentHashMap) this.f112994F1).values()) {
            if (gameWebPage != null) {
                gameWebPage.mo65792a0((Runnable) null);
            }
        }
    }

    /* renamed from: j0 */
    public final String mo65826j0(GameWebPage gameWebPage) {
        if (gameWebPage == null) {
            return "";
        }
        for (Map.Entry next : this.f112994F1.entrySet()) {
            if (gameWebPage == next.getValue()) {
                return (String) next.getKey();
            }
        }
        return "";
    }

    /* renamed from: k0 */
    public void mo65827k0(String str, String str2, boolean z) {
        if (!Util.isNullOrNil(str) && !Util.isNullOrNil(str2) && !((ConcurrentHashMap) this.f112994F1).containsKey(str) && this.f112997I1 != null) {
            Log.m105925i("MicroMsg.GameTabWebPage", "insertTabHomeWeb, tabKey:%s, url:%s", str, str2);
            Bundle bundle = new Bundle();
            bundle.putAll(this.f148261n);
            bundle.putString("rawUrl", str2);
            GameWebPage gameWebPage = new GameWebPage(this.f148198f, (C53133t) null, bundle);
            C43661n0 n0Var = gameWebPage.f117951u;
            if (n0Var != null) {
                n0Var.mo67958b();
            }
            gameWebPage.f112972r1 = this;
            gameWebPage.f112973s1 = z;
            MMActivity mMActivity = this.f113002N1;
            if (mMActivity != null && mMActivity.isPaused() && z) {
                gameWebPage.f112975u1 = true;
                Log.m105925i("MicroMsg.GameTabWebPage", "mockFetchFcp, url:%s", str2);
            }
            mo65829m0(gameWebPage, str);
            this.f112997I1.addView(gameWebPage.f148258h, 0, new FrameLayout.LayoutParams(-1, -1));
            gameWebPage.mo65794c(str2, bundle);
            ((ConcurrentHashMap) this.f112994F1).put(str, gameWebPage);
        }
    }

    /* renamed from: l */
    public View mo65803l() {
        View l = super.mo65803l();
        this.f112998J1 = l;
        FrameLayout frameLayout = new FrameLayout(this.f148196d);
        this.f112997I1 = frameLayout;
        frameLayout.addView(l, new FrameLayout.LayoutParams(-1, -1));
        return this.f112997I1;
    }

    /* renamed from: l0 */
    public void mo65828l0() {
    }

    /* renamed from: m0 */
    public void mo65829m0(GameWebPage gameWebPage, String str) {
        if (gameWebPage != null && !Util.isNullOrNil(str)) {
            gameWebPage.f112955C1 = new C41950b(str, gameWebPage);
        }
    }

    /* renamed from: n0 */
    public void mo65830n0(String str) {
        if (this.f112996H1 == null) {
            return;
        }
        if (!TextUtils.equals(str, "chat")) {
            this.f112996H1.mo65842j(str);
        } else if (this.f112996H1.mo65838f() == 1) {
            mo65828l0();
        } else {
            this.f112996H1.mo65842j(str);
        }
    }
}
