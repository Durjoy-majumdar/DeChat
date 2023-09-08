package com.tencent.p014mm.plugin.game.luggage;

import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.tencent.p014mm.game.report.api.GameWebPerformanceInfo;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$c;
import com.tencent.p014mm.plugin.game.commlib.util.C41864d;
import com.tencent.p014mm.plugin.game.luggage.page.C41942a;
import com.tencent.p014mm.plugin.game.luggage.page.C41946e;
import com.tencent.p014mm.plugin.game.luggage.page.C41948f;
import com.tencent.p014mm.plugin.game.luggage.page.C41980t;
import com.tencent.p014mm.plugin.game.luggage.page.GameWebPage;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.plugin.webview.luggage.C43691z0;
import com.tencent.p014mm.plugin.webview.luggage.ipc.ActiveMainProcessTask;
import com.tencent.p014mm.plugin.wepkg.event.C44478c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import di3.C86312j;
import e51.C45544c;
import e51.C45547h;
import f40.C86709a0;
import java.lang.reflect.Field;
import p225rc.g$$h;
import p248ug.C52570c0;
import p828wa.C53104i;
import p828wa.C53126p;
import p828wa.C53133t;
import p828wa.C53136v;
import w93.C53091f;

/* renamed from: com.tencent.mm.plugin.game.luggage.MMLuggageGameWebViewUI */
public class MMLuggageGameWebViewUI extends MMSecDataActivity implements g$$h {

    /* renamed from: d */
    public C41946e f112880d;

    /* renamed from: e */
    public int f112881e = -1;

    /* renamed from: f */
    public boolean f112882f = true;

    /* renamed from: g */
    public C41948f f112883g;

    /* renamed from: com.tencent.mm.plugin.game.luggage.MMLuggageGameWebViewUI$a */
    public class C41895a implements C41946e.C41947a {
        public C41895a() {
        }

        /* renamed from: a */
        public boolean mo65725a() {
            C41948f.C41953d dVar;
            C41948f fVar = MMLuggageGameWebViewUI.this.f112883g;
            if (fVar == null || (dVar = fVar.f112996H1) == null) {
                return true;
            }
            return dVar.mo65833a();
        }

        /* renamed from: b */
        public void mo65726b() {
            C41948f.C41953d dVar;
            C41948f fVar = MMLuggageGameWebViewUI.this.f112883g;
            if (fVar != null && (dVar = fVar.f112996H1) != null) {
                dVar.mo65835c(false);
            }
        }

        /* renamed from: c */
        public void mo65727c() {
            C41948f.C41953d dVar;
            C41948f fVar = MMLuggageGameWebViewUI.this.f112883g;
            if (fVar != null && (dVar = fVar.f112996H1) != null) {
                dVar.mo65835c(true);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.MMLuggageGameWebViewUI$b */
    public class C41896b implements C53126p {
        public C41896b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0063  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x007a  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public p828wa.C53104i mo65728a(java.lang.String r10, android.os.Bundle r11) {
            /*
                r9 = this;
                long r0 = java.lang.System.currentTimeMillis()
                r2 = 1
                java.lang.Object[] r3 = new java.lang.Object[r2]
                java.lang.Long r4 = java.lang.Long.valueOf(r0)
                r5 = 0
                r3[r5] = r4
                java.lang.String r4 = "MicroMsg.MMLuggageGameWebViewUI"
                java.lang.String r6 = "getPage, __Time__，time = %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r3)
                java.lang.String r3 = "minimize_secene"
                r6 = 3
                r11.putInt(r3, r6)
                java.lang.String r3 = "float_ball_key"
                java.lang.String r3 = r11.getString(r3)
                java.lang.String r6 = "float_layer_page"
                boolean r6 = r11.getBoolean(r6, r5)
                com.tencent.mm.plugin.game.luggage.MMLuggageGameWebViewUI r7 = com.tencent.p014mm.plugin.game.luggage.MMLuggageGameWebViewUI.this
                boolean r7 = r7.f112882f
                if (r7 != 0) goto L_0x0057
                if (r6 != 0) goto L_0x0057
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                if (r3 == 0) goto L_0x0057
                com.tencent.mm.plugin.game.luggage.MMLuggageGameWebViewUI r3 = com.tencent.p014mm.plugin.game.luggage.MMLuggageGameWebViewUI.this
                r3.getClass()
                wa.t r3 = com.tencent.p014mm.plugin.game.luggage.C41985r.m45635c(r10)
                if (r3 == 0) goto L_0x0042
                r3 = 1
                goto L_0x0043
            L_0x0042:
                r3 = 0
            L_0x0043:
                if (r3 == 0) goto L_0x0046
                goto L_0x0057
            L_0x0046:
                w93.C53091f.m59446a(r10)
                w93.C53091f.m59454i(r10, r0)
                w93.C53091f.m59455j(r10, r0)
                w93.C53091f.m59450e(r10, r0)
                com.tencent.mm.game.report.api.GameWebPerformanceInfo r3 = com.tencent.p014mm.game.report.api.GameWebPerformanceInfo.m43445a(r10)
                goto L_0x005b
            L_0x0057:
                com.tencent.mm.game.report.api.GameWebPerformanceInfo r3 = com.tencent.p014mm.game.report.api.GameWebPerformanceInfo.m43446b(r10)
            L_0x005b:
                java.lang.String r7 = r3.f108354d
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
                if (r7 == 0) goto L_0x0076
                java.lang.Object[] r7 = new java.lang.Object[r2]
                r7[r5] = r10
                java.lang.String r8 = "new page, url: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r8, r7)
                r3.f108354d = r10
                r3.f108372y = r0
                r3.f108367t = r0
                r3.f108365r = r0
                r3.f108356f = r2
            L_0x0076:
                r3.f108339A = r0
                if (r6 != 0) goto L_0x007e
                com.tencent.mm.plugin.game.luggage.MMLuggageGameWebViewUI r0 = com.tencent.p014mm.plugin.game.luggage.MMLuggageGameWebViewUI.this
                r0.f112882f = r5
            L_0x007e:
                com.tencent.mm.plugin.game.luggage.MMLuggageGameWebViewUI r0 = com.tencent.p014mm.plugin.game.luggage.MMLuggageGameWebViewUI.this
                com.tencent.mm.plugin.game.luggage.page.GameWebPage r10 = r0.mo65733H7(r11, r10)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.luggage.MMLuggageGameWebViewUI.C41896b.mo65728a(java.lang.String, android.os.Bundle):wa.i");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.MMLuggageGameWebViewUI$c */
    public class C41897c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f112886d;

        public C41897c(String str) {
            this.f112886d = str;
        }

        public void run() {
            if (!MMLuggageGameWebViewUI.this.isFinishing() && !MMLuggageGameWebViewUI.this.activityHasDestroyed()) {
                MMLuggageGameWebViewUI mMLuggageGameWebViewUI = MMLuggageGameWebViewUI.this;
                mMLuggageGameWebViewUI.f112880d.mo73794i(this.f112886d, mMLuggageGameWebViewUI.getIntent().getExtras());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.MMLuggageGameWebViewUI$d */
    public class C41898d implements Runnable {
        public C41898d() {
        }

        public void run() {
            Intent intent = new Intent();
            intent.putExtra("from_scene", 3);
            ((C45547h) C86312j.m106911c(C45547h.class)).p30(MMLuggageGameWebViewUI.this, intent, (C45544c) null);
        }
    }

    /* renamed from: H7 */
    public GameWebPage mo65733H7(Bundle bundle, String str) {
        String string = bundle.getString("float_ball_key");
        boolean z = bundle.getBoolean("float_layer_page", false);
        if (!Util.isNullOrNil(string)) {
            return new GameWebPage(this.f112880d.f148210j, C53136v.m59532a(getContext(), Integer.valueOf(C43691z0.m47522b(string))), bundle);
        }
        if (z) {
            return new C41942a(this.f112880d.f148210j, (C53133t) null, bundle);
        }
        if (bundle.containsKey("game_tab_data")) {
            this.f112883g = new C41948f(this.f112880d.f148210j, (C53133t) null, bundle);
            mo65740J7();
            return this.f112883g;
        }
        C53133t g = C41985r.m45639g(getContext(), str);
        return g != null ? new C41980t(this.f112880d.f148210j, g, bundle) : new GameWebPage(this.f112880d.f148210j, (C53133t) null, bundle);
    }

    /* renamed from: I7 */
    public void mo65739I7() {
    }

    /* renamed from: J7 */
    public void mo65740J7() {
    }

    /* renamed from: K7 */
    public void mo65734K7(View view) {
        setContentView(this.f112880d.f148203c);
    }

    public int getForceOrientation() {
        return this.f112881e;
    }

    public int getLayoutId() {
        return -1;
    }

    public void initSwipeBack() {
        fixStatusbar(false);
        super.initSwipeBack();
    }

    public boolean noActionBar() {
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f112880d.f148206f.mo124233g(i, i2, intent);
    }

    public void onBackPressed() {
        if (!this.f112880d.mo73790e()) {
            mo65739I7();
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        GameFloatLayerInfo gameFloatLayerInfo;
        super.onCreate(bundle);
        this.f112881e = getIntent().getIntExtra("screen_orientation", -1);
        boolean booleanExtra = getIntent().getBooleanExtra("from_shortcut", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("from_game_tab", false);
        if (!booleanExtra && !(!Util.isNullOrNil(getIntent().getStringExtra("float_ball_key"))) && !booleanExtra2) {
            overridePendingTransition(MMFragmentActivity$$c.f318648e, MMFragmentActivity$$c.f318649f);
        }
        if (getIntent().getBooleanExtra("game_from_detail_back", false)) {
            overridePendingTransition(MMFragmentActivity$$c.f318646c, MMFragmentActivity$$c.f318647d);
        }
        new ActiveMainProcessTask().mo114395c();
        Log.m105925i("MicroMsg.MMLuggageGameWebViewUI", "onCreate, startTime: %d, now: %d", Long.valueOf(getIntent().getLongExtra("start_activity_time", System.currentTimeMillis())), Long.valueOf(System.currentTimeMillis()));
        String stringExtra = getIntent().getStringExtra("rawUrl");
        if (Util.isNullOrNil(stringExtra)) {
            Log.m105920e("MicroMsg.MMLuggageGameWebViewUI", "url is null");
            return;
        }
        if (((C52570c0) C86709a0.m107533q(C52570c0.class)).mo58182e()) {
            stringExtra = "https://mp.weixin.qq.com/mp/readtemplate?t=appmsg/childmode";
            getIntent().putExtra("rawUrl", stringExtra);
        }
        GameWebPerformanceInfo b = GameWebPerformanceInfo.m43446b(stringExtra);
        b.f108354d = stringExtra;
        b.f108366s = getIntent().getLongExtra("gamecenterui_createtime", 0);
        b.f108367t = getIntent().getLongExtra("start_activity_time", System.currentTimeMillis());
        b.f108365r = getIntent().getLongExtra("start_time", b.f108367t);
        b.f108372y = System.currentTimeMillis();
        b.f108356f = 1;
        b.f108359i = 1;
        Log.m105925i("MicroMsg.MMLuggageGameWebViewUI", "url: %s, __Time__， startTime: %d, gamecenterCreate: %d,startWebUI: %d, webUICreate: %d", stringExtra, Long.valueOf(b.f108365r), Long.valueOf(b.f108366s), Long.valueOf(b.f108367t), Long.valueOf(b.f108372y));
        C53091f.m59446a(stringExtra);
        C53091f.m59454i(stringExtra, System.currentTimeMillis());
        C53091f.m59455j(stringExtra, System.currentTimeMillis());
        C53091f.m59450e(stringExtra, b.f108365r);
        C41864d.m45384a(this);
        getWindow().setFlags(TPMediaCodecProfileLevel.HEVCMainTierLevel62, TPMediaCodecProfileLevel.HEVCMainTierLevel62);
        getWindow().setFormat(-3);
        C41946e eVar = new C41946e(this);
        this.f112880d = eVar;
        mo65734K7(eVar.f148203c);
        C41946e eVar2 = this.f112880d;
        eVar2.f112993l = new C41895a();
        eVar2.f148207g = new C41896b();
        GameWebViewLaunchParams gameWebViewLaunchParams = (GameWebViewLaunchParams) getIntent().getParcelableExtra("launchParams");
        if (gameWebViewLaunchParams == null || (gameFloatLayerInfo = gameWebViewLaunchParams.f112849d) == null) {
            z = false;
        } else {
            GameWebPerformanceInfo b2 = GameWebPerformanceInfo.m43446b(gameFloatLayerInfo.f112846d);
            b2.f108354d = gameFloatLayerInfo.f112846d;
            b2.f108366s = getIntent().getLongExtra("gamecenterui_createtime", 0);
            b2.f108367t = getIntent().getLongExtra("start_activity_time", System.currentTimeMillis());
            b2.f108365r = getIntent().getLongExtra("start_time", b2.f108367t);
            b2.f108372y = System.currentTimeMillis();
            b2.f108356f = 1;
            b2.f108359i = 1;
            C53091f.m59454i(gameFloatLayerInfo.f112846d, System.currentTimeMillis());
            Bundle bundle2 = new Bundle();
            bundle2.putString("rawUrl", gameFloatLayerInfo.f112846d);
            bundle2.putBoolean("show_full_screen", gameFloatLayerInfo.f112847e);
            bundle2.putInt("screen_orientation", gameFloatLayerInfo.f112848f);
            bundle2.putBoolean("float_layer_page", true);
            bundle2.putBoolean("needAnimation", false);
            bundle2.putInt("customize_status_bar_color", getIntent().getIntExtra("customize_status_bar_color", 0));
            bundle2.putString("customize_status_bar_color", getIntent().getStringExtra("status_bar_style"));
            this.f112880d.mo73793h(gameFloatLayerInfo.f112846d, bundle2, false);
            z = true;
        }
        if (z) {
            b.f108363p = 1;
            new Handler().postDelayed(new C41897c(stringExtra), 300);
        } else {
            this.f112880d.mo73792g(stringExtra, getIntent().getExtras());
        }
        if (getIntent().getBooleanExtra("from_download_floagt_ball_shutdown_entrance", false)) {
            new Handler().postDelayed(new C41898d(), 300);
        }
        C41907j.f112910a.getAndIncrement();
    }

    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        supportRequestWindowFeature(10);
        supportRequestWindowFeature(1);
        supportRequestWindowFeature(9);
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105924i("MicroMsg.MMLuggageGameWebViewUI", "onDestroy");
        C41864d.m45388e(this);
        C41903i.f112900a = null;
        C41903i.f112902c = 0;
        this.f112880d.mo73787a();
        C44478c.f120606a.clear();
        Log.m105924i("MicroMsg.MMLuggageGameWebViewUI", "fixInputMethodManagerLeak");
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
        if (inputMethodManager != null) {
            Log.m105924i("MicroMsg.MMLuggageGameWebViewUI", "fixInputMethodManagerLeak, imm");
            String[] strArr = {"mCurRootView", "mServedView", "mNextServedView"};
            for (int i = 0; i < 3; i++) {
                try {
                    Field declaredField = inputMethodManager.getClass().getDeclaredField(strArr[i]);
                    if (!declaredField.isAccessible()) {
                        declaredField.setAccessible(true);
                    }
                    Object obj = declaredField.get(inputMethodManager);
                    if (obj != null && (obj instanceof View)) {
                        View view = (View) obj;
                        if (!(view.getContext() instanceof ContextWrapper)) {
                            if (view.getContext() != this) {
                                break;
                            }
                            declaredField.set(inputMethodManager, (Object) null);
                        } else if (((ContextWrapper) view.getContext()).getBaseContext() == this) {
                            declaredField.set(inputMethodManager, (Object) null);
                        }
                    }
                } catch (Throwable th) {
                    Log.printErrStackTrace("MicroMsg.MMLuggageGameWebViewUI", th, "", new Object[0]);
                }
            }
        }
        System.gc();
        C41907j.m45459a();
    }

    public void onPause() {
        super.onPause();
        Log.m105924i("MicroMsg.MMLuggageGameWebViewUI", "onPause");
        hideVKB();
        C53104i b = this.f112880d.mo73788b();
        if (b != null) {
            b.mo73784f();
        }
        C41948f fVar = this.f112883g;
        if (fVar != null) {
            fVar.mo65825i0();
        }
    }

    public void onResume() {
        super.onResume();
        Log.m105924i("MicroMsg.MMLuggageGameWebViewUI", "onResume, time: " + System.currentTimeMillis());
        C41946e eVar = this.f112880d;
        C53104i b = eVar.mo73788b();
        if (b != null) {
            b.mo73786i();
        }
        eVar.mo67916k();
    }

    public void onWindowFocusChanged(boolean z) {
        Log.m105925i("MicroMsg.MMLuggageGameWebViewUI", "onWindowFocusChanged, hasFocus: %b, time: %d", Boolean.valueOf(z), Long.valueOf(System.currentTimeMillis()));
        super.onWindowFocusChanged(z);
    }

    public void setMMOrientation() {
        int i = this.f112881e;
        if (i != -1) {
            setRequestedOrientation(i);
            return;
        }
        boolean z = getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 4).getBoolean("settings_landscape_mode", false);
        this.landscapeMode = z;
        if (z) {
            setRequestedOrientation(-1);
        } else {
            setRequestedOrientation(1);
        }
    }

    public boolean supportNavigationSwipeBack() {
        return !getIntent().getBooleanExtra("disable_game_page_swipe", false);
    }
}
