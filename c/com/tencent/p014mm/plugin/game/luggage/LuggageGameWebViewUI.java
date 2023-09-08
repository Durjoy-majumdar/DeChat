package com.tencent.p014mm.plugin.game.luggage;

import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.tencent.p014mm.game.report.api.GameWebPerformanceInfo;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
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
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import di3.C86312j;
import e51.C45544c;
import e51.C45547h;
import f40.C86709a0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import jy1.C46586d;
import jy1.C9544f;
import p225rc.g$$h;
import p237sp.C36754a0;
import p237sp.C48458z;
import p248ug.C52570c0;
import p763ym.C39072t;
import p828wa.C53104i;
import p828wa.C53118n;
import p828wa.C53126p;
import p828wa.C53133t;
import p828wa.C53136v;
import sw1.C48478n;
import w93.C53091f;

/* renamed from: com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI */
public class LuggageGameWebViewUI extends MMSecDataActivity implements g$$h {

    /* renamed from: i */
    public static final /* synthetic */ int f112859i = 0;

    /* renamed from: d */
    public C41946e f112860d;

    /* renamed from: e */
    public int f112861e = -1;

    /* renamed from: f */
    public boolean f112862f = true;

    /* renamed from: g */
    public C41948f f112863g;

    /* renamed from: h */
    public ConcurrentHashMap<String, View> f112864h = new ConcurrentHashMap<>();

    /* renamed from: com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI$f */
    public static class C4447f implements C80883e<Bundle, Bundle> {
        private C4447f() {
        }

        public void invoke(Object obj, C1256g gVar) {
            Bundle bundle = (Bundle) obj;
            if (bundle != null) {
                String string = bundle.getString("key_open_business_type");
                String string2 = bundle.getString("key_back_appid");
                Log.m105925i("MicroMsg.LuggageGameWebViewUI", "gamelog main process OpenBusinessViewUtil.launchBackApp businessType =%s ,appId = %s", string, string2);
                ((C39072t) C86312j.m106911c(C39072t.class)).r10(string, "", string2, 0, "");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI$a */
    public class C41885a implements C41946e.C41947a {
        public C41885a() {
        }

        /* renamed from: a */
        public boolean mo65725a() {
            C41948f.C41953d dVar;
            C41948f fVar = LuggageGameWebViewUI.this.f112863g;
            if (fVar == null || (dVar = fVar.f112996H1) == null) {
                return true;
            }
            return dVar.mo65833a();
        }

        /* renamed from: b */
        public void mo65726b() {
            C41948f.C41953d dVar;
            C41948f fVar = LuggageGameWebViewUI.this.f112863g;
            if (fVar != null && (dVar = fVar.f112996H1) != null) {
                dVar.mo65835c(false);
            }
        }

        /* renamed from: c */
        public void mo65727c() {
            C41948f.C41953d dVar;
            C41948f fVar = LuggageGameWebViewUI.this.f112863g;
            if (fVar != null && (dVar = fVar.f112996H1) != null) {
                dVar.mo65835c(true);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI$b */
    public class C41886b implements C53126p {
        public C41886b() {
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
                java.lang.String r4 = "MicroMsg.LuggageGameWebViewUI"
                java.lang.String r6 = "getPage, __Time__，time = %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r3)
                java.lang.String r3 = "minimize_secene"
                r6 = 3
                r11.putInt(r3, r6)
                java.lang.String r3 = "float_ball_key"
                java.lang.String r3 = r11.getString(r3)
                java.lang.String r6 = "float_layer_page"
                boolean r6 = r11.getBoolean(r6, r5)
                com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI r7 = com.tencent.p014mm.plugin.game.luggage.LuggageGameWebViewUI.this
                boolean r7 = r7.f112862f
                if (r7 != 0) goto L_0x0057
                if (r6 != 0) goto L_0x0057
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                if (r3 == 0) goto L_0x0057
                com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI r3 = com.tencent.p014mm.plugin.game.luggage.LuggageGameWebViewUI.this
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
                com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI r0 = com.tencent.p014mm.plugin.game.luggage.LuggageGameWebViewUI.this
                r0.f112862f = r5
            L_0x007e:
                com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI r0 = com.tencent.p014mm.plugin.game.luggage.LuggageGameWebViewUI.this
                com.tencent.mm.plugin.game.luggage.page.GameWebPage r10 = r0.mo65712J7(r11, r10)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.luggage.LuggageGameWebViewUI.C41886b.mo65728a(java.lang.String, android.os.Bundle):wa.i");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI$c */
    public class C41887c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f112867d;

        public C41887c(String str) {
            this.f112867d = str;
        }

        public void run() {
            if (!LuggageGameWebViewUI.this.isFinishing() && !LuggageGameWebViewUI.this.activityHasDestroyed()) {
                LuggageGameWebViewUI luggageGameWebViewUI = LuggageGameWebViewUI.this;
                luggageGameWebViewUI.f112860d.mo73794i(this.f112867d, luggageGameWebViewUI.getIntent().getExtras());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI$d */
    public class C41888d implements Runnable {
        public C41888d() {
        }

        public void run() {
            Intent intent = new Intent();
            intent.putExtra("from_scene", 3);
            ((C45547h) C86312j.m106911c(C45547h.class)).p30(LuggageGameWebViewUI.this, intent, (C45544c) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI$e */
    public class C41889e implements C48458z.C48459a {
        public C41889e() {
        }

        /* renamed from: a */
        public void mo65731a(String str) {
            Log.m105920e("MicroMsg.LuggageGameWebViewUI", str);
            LuggageGameWebViewUI luggageGameWebViewUI = LuggageGameWebViewUI.this;
            int i = LuggageGameWebViewUI.f112859i;
            luggageGameWebViewUI.mo65719H7();
        }

        public void onDismiss() {
            LuggageGameWebViewUI luggageGameWebViewUI = LuggageGameWebViewUI.this;
            int i = LuggageGameWebViewUI.f112859i;
            luggageGameWebViewUI.mo65719H7();
        }
    }

    /* renamed from: H7 */
    public final void mo65719H7() {
        if (!this.f112860d.mo73790e()) {
            mo65721K7();
            finish();
        }
    }

    /* renamed from: I7 */
    public C41948f mo65720I7(C53118n nVar, Bundle bundle) {
        return new C41948f(nVar, (C53133t) null, bundle);
    }

    /* renamed from: J7 */
    public GameWebPage mo65712J7(Bundle bundle, String str) {
        String string = bundle.getString("float_ball_key");
        boolean z = bundle.getBoolean("float_layer_page", false);
        if (!Util.isNullOrNil(string)) {
            return new GameWebPage(this.f112860d.f148210j, C53136v.m59532a(getContext(), Integer.valueOf(C43691z0.m47522b(string))), bundle);
        }
        if (z) {
            return new C41942a(this.f112860d.f148210j, (C53133t) null, bundle);
        }
        if (bundle.containsKey("game_tab_data")) {
            this.f112863g = mo65720I7(this.f112860d.f148210j, bundle);
            mo65722L7();
            return this.f112863g;
        }
        C53133t g = C41985r.m45639g(getContext(), str);
        return g != null ? new C41980t(this.f112860d.f148210j, g, bundle) : new GameWebPage(this.f112860d.f148210j, (C53133t) null, bundle);
    }

    /* renamed from: K7 */
    public void mo65721K7() {
    }

    /* renamed from: L7 */
    public void mo65722L7() {
    }

    /* renamed from: M7 */
    public void mo65713M7(View view) {
        setContentView(this.f112860d.f148203c);
    }

    public int getForceOrientation() {
        return this.f112861e;
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
        this.f112860d.f148206f.mo124233g(i, i2, intent);
        if (i == 10011) {
            mo65719H7();
        }
    }

    public void onBackPressed() {
        if (!C9544f.m9234b(this.f112860d.mo73788b())) {
            C48478n.C48481f fVar = C46586d.f125494a;
            if (fVar != null) {
                fVar.onCancel();
            }
            C46586d.f125494a = null;
            mo65719H7();
        } else if (C9544f.f29738d != 0) {
            ((C36754a0) C86312j.m106911c(C36754a0.class)).mo60674nx().mo62505a(this, C9544f.f29736b, C9544f.f29737c, 1, new C41889e());
        }
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        GameFloatLayerInfo gameFloatLayerInfo;
        super.onCreate(bundle);
        this.f112861e = getIntent().getIntExtra("screen_orientation", -1);
        boolean booleanExtra = getIntent().getBooleanExtra("from_shortcut", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("from_game_tab", false);
        if (!booleanExtra && !(!Util.isNullOrNil(getIntent().getStringExtra("float_ball_key"))) && !booleanExtra2) {
            overridePendingTransition(MMFragmentActivity$$c.f318648e, MMFragmentActivity$$c.f318649f);
        }
        if (getIntent().getBooleanExtra("game_from_detail_back", false)) {
            overridePendingTransition(MMFragmentActivity$$c.f318646c, MMFragmentActivity$$c.f318647d);
        }
        new ActiveMainProcessTask().mo114395c();
        Log.m105925i("MicroMsg.LuggageGameWebViewUI", "onCreate, startTime: %d, now: %d", Long.valueOf(getIntent().getLongExtra("start_activity_time", System.currentTimeMillis())), Long.valueOf(System.currentTimeMillis()));
        String stringExtra = getIntent().getStringExtra("rawUrl");
        if (Util.isNullOrNil(stringExtra)) {
            Log.m105920e("MicroMsg.LuggageGameWebViewUI", "url is null");
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
        Log.m105925i("MicroMsg.LuggageGameWebViewUI", "url: %s, __Time__， startTime: %d, gamecenterCreate: %d,startWebUI: %d, webUICreate: %d", stringExtra, Long.valueOf(b.f108365r), Long.valueOf(b.f108366s), Long.valueOf(b.f108367t), Long.valueOf(b.f108372y));
        C53091f.m59446a(stringExtra);
        C53091f.m59454i(stringExtra, System.currentTimeMillis());
        C53091f.m59455j(stringExtra, System.currentTimeMillis());
        C53091f.m59450e(stringExtra, b.f108365r);
        getWindow().setFlags(TPMediaCodecProfileLevel.HEVCMainTierLevel62, TPMediaCodecProfileLevel.HEVCMainTierLevel62);
        getWindow().setFormat(-3);
        C41946e eVar = new C41946e(this);
        this.f112860d = eVar;
        mo65713M7(eVar.f148203c);
        C41946e eVar2 = this.f112860d;
        eVar2.f112993l = new C41885a();
        eVar2.f148207g = new C41886b();
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
            this.f112860d.mo73793h(gameFloatLayerInfo.f112846d, bundle2, false);
            z = true;
        }
        if (z) {
            b.f108363p = 1;
            new Handler().postDelayed(new C41887c(stringExtra), 300);
        } else {
            this.f112860d.mo73792g(stringExtra, getIntent().getExtras());
        }
        if (getIntent().getBooleanExtra("from_download_floagt_ball_shutdown_entrance", false)) {
            new Handler().postDelayed(new C41888d(), 300);
        }
        C41864d.m45384a(this);
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
        C9544f.f29735a = false;
        C9544f.f29736b = null;
        C9544f.f29737c = null;
        WeakReference<C53104i> weakReference = C9544f.f29739e;
        if (weakReference != null) {
            weakReference.clear();
        }
        C9544f.f29739e = null;
        Log.m105924i("MicroMsg.LuggageGameWebViewUI", "onDestroy");
        C41864d.m45388e(this);
        C41903i.f112900a = null;
        C41903i.f112902c = 0;
        this.f112860d.mo73787a();
        C44478c.f120606a.clear();
        Log.m105924i("MicroMsg.LuggageGameWebViewUI", "fixInputMethodManagerLeak");
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
        if (inputMethodManager != null) {
            Log.m105924i("MicroMsg.LuggageGameWebViewUI", "fixInputMethodManagerLeak, imm");
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
                    Log.printErrStackTrace("MicroMsg.LuggageGameWebViewUI", th, "", new Object[0]);
                }
            }
        }
        System.gc();
        C41907j.m45459a();
        Bundle bundleExtra = getIntent().getBundleExtra("key_bundle_ext_data");
        if (bundleExtra != null && bundleExtra.getBoolean("key_open_by_sdk", false)) {
            Log.m105925i("MicroMsg.LuggageGameWebViewUI", "gamelog OpenBusinessViewUtil.launchBackApp businessType =%s ,appId = %s", bundleExtra.getString("key_open_business_type"), bundleExtra.getString("key_back_appid"));
            C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundleExtra, C4447f.class, (C1256g) null);
        }
    }

    public void onPause() {
        super.onPause();
        Log.m105924i("MicroMsg.LuggageGameWebViewUI", "onPause");
        hideVKB();
        C53104i b = this.f112860d.mo73788b();
        if (b != null) {
            b.mo73784f();
        }
        C41948f fVar = this.f112863g;
        if (fVar != null) {
            fVar.mo65825i0();
        }
    }

    public void onResume() {
        super.onResume();
        Log.m105924i("MicroMsg.LuggageGameWebViewUI", "onResume, time: " + System.currentTimeMillis());
        C41946e eVar = this.f112860d;
        C53104i b = eVar.mo73788b();
        if (b != null) {
            b.mo73786i();
        }
        eVar.mo67916k();
    }

    public void onWindowFocusChanged(boolean z) {
        Log.m105925i("MicroMsg.LuggageGameWebViewUI", "onWindowFocusChanged, hasFocus: %b, time: %d", Boolean.valueOf(z), Long.valueOf(System.currentTimeMillis()));
        super.onWindowFocusChanged(z);
    }

    public void setMMOrientation() {
        int i = this.f112861e;
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
