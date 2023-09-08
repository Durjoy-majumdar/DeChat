package com.tencent.p014mm.framework.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import b73.C28273c;
import b73.C67213b;
import bp3.C104160f;
import bp3.C79758p;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.kinda.framework.C67448R;
import com.tencent.kinda.framework.animate.KindaAnimatorWatch;
import com.tencent.kinda.framework.app.MainFragment;
import com.tencent.kinda.framework.module.impl.KindaCacheServiceImpl;
import com.tencent.kinda.framework.widget.base.BaseFrActivity;
import com.tencent.kinda.framework.widget.base.BaseFragment;
import com.tencent.kinda.framework.widget.base.FrLifeController;
import com.tencent.kinda.framework.widget.base.IEventFragment;
import com.tencent.kinda.framework.widget.tools.ActivityController;
import com.tencent.kinda.framework.widget.tools.ConstantsKinda;
import com.tencent.kinda.gen.VoidBoolStringI32StringCallback;
import com.tencent.kinda.gen.VoidCallback;
import com.tencent.p014mm.autogen.events.KindaActivityPauseEvent;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.C85927s;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import com.tenpay.android.wechat.MyKeyboardWindow;
import com.tenpay.android.wechat.TenpaySecureEditText;
import di3.C86312j;
import h81.C32735h;
import iw3.C117281a;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kg3.C76577a;
import nj3.C88989a;
import p10.C77054a;
import rv3.C118245h;
import tc2.C118418g;
import uv3.C118614d;
import uv3.C118615e;
import vo3.C90852c;

@C88989a(7)
@C90852c(0)
@C85927s.C85929b
/* renamed from: com.tencent.mm.framework.app.UIPageFragmentActivity */
public class UIPageFragmentActivity extends BaseFrActivity implements IEventFragment, C7020t0 {

    /* renamed from: u */
    public static final /* synthetic */ int f195305u = 0;

    /* renamed from: d */
    public boolean f195306d = true;

    /* renamed from: e */
    public boolean f195307e;

    /* renamed from: f */
    public FrLifeController f195308f;

    /* renamed from: g */
    public VoidBoolStringI32StringCallback f195309g = null;

    /* renamed from: h */
    public VoidCallback f195310h = null;

    /* renamed from: i */
    public KindaCacheServiceImpl f195311i = new KindaCacheServiceImpl();

    /* renamed from: j */
    public boolean f195312j;

    /* renamed from: n */
    public boolean f195313n;

    /* renamed from: o */
    public KeyboardHeightProvider f195314o;

    /* renamed from: p */
    public int f195315p = 0;

    /* renamed from: q */
    public boolean f195316q = false;

    /* renamed from: r */
    public AtomicInteger f195317r = new AtomicInteger(5);

    /* renamed from: s */
    public HashMap<Integer, C68049b> f195318s = new HashMap<>();

    /* renamed from: t */
    public boolean f195319t = false;

    /* renamed from: com.tencent.mm.framework.app.UIPageFragmentActivity$a */
    public class C68048a implements BaseFrActivity.IWalletTenpayKBStateCallBackListener {
        public C68048a() {
        }

        public void onCallBackKinda(boolean z, float f, BaseFragment baseFragment) {
            if (baseFragment == null) {
                baseFragment = UIPageFragmentActivity.this.f195308f.getCurrent();
            }
            float c = f <= 0.0f ? 230.0f : (float) C76577a.m92152c(UIPageFragmentActivity.this.getContext(), (int) f);
            if (baseFragment != null) {
                boolean z2 = false;
                if (z) {
                    baseFragment.onKeyboardShow(true, (int) c);
                    UIPageFragmentActivity uIPageFragmentActivity = UIPageFragmentActivity.this;
                    if (!uIPageFragmentActivity.f195316q) {
                        MyKeyboardWindow keyboard = uIPageFragmentActivity.getKeyboard();
                        TenpaySecureEditText tenpaySecureEditText = uIPageFragmentActivity.getTenpaySecureEditText();
                        if (keyboard == null || tenpaySecureEditText == null) {
                            Log.m105924i("MicroMsg.UIPageFragmentActivity", "Keyboard or EditText not found");
                        } else {
                            C68050c cVar = new C68050c((C68048a) null);
                            keyboard.setOnTouchListener(cVar);
                            C118418g.INSTANCE.mo175784Ak(new C68051a(uIPageFragmentActivity, cVar));
                            tenpaySecureEditText.setOnPasswdInputListener(new C77054a(uIPageFragmentActivity, tenpaySecureEditText));
                            z2 = true;
                        }
                        uIPageFragmentActivity.f195316q = z2;
                        return;
                    }
                    return;
                }
                baseFragment.onKeyboardShow(false, (int) c);
            }
        }
    }

    /* renamed from: com.tencent.mm.framework.app.UIPageFragmentActivity$b */
    public interface C68049b {
        void handle(int i, Intent intent);
    }

    /* renamed from: com.tencent.mm.framework.app.UIPageFragmentActivity$c */
    public static class C68050c implements MyKeyboardWindow.OnTouchListener {

        /* renamed from: a */
        public C118614d f195321a;

        /* renamed from: b */
        public C118615e f195322b;

        public C68050c(C68048a aVar) {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            C118614d dVar = this.f195321a;
            if (dVar == null) {
                return false;
            }
            C118615e eVar = this.f195322b;
            C117281a.C117283c cVar = (C117281a.C117283c) dVar;
            if (eVar == null || motionEvent == null) {
                return false;
            }
            C117281a.this.getClass();
            String valueOf = String.valueOf(eVar.hashCode());
            if (!((HashMap) C117281a.this.f351140a).containsKey(valueOf)) {
                return false;
            }
            C118245h.m166799a("TuringTouch", "[method: onTouch ] " + motionEvent.getAction());
            C117281a.m165348a(C117281a.this, valueOf, motionEvent);
            return false;
        }
    }

    /* renamed from: H7 */
    public void mo93519H7(Bundle bundle) {
        if (bundle != null) {
            BaseFragment resolveFragment = ActivityController.resolveFragment(bundle);
            if (resolveFragment instanceof MainFragment) {
                this.f195306d = false;
            }
            if (resolveFragment != null) {
                boolean z = bundle.getBoolean(ConstantsKinda.INTENT_WEBVIEW, false);
                boolean z2 = bundle.getBoolean(ConstantsKinda.INTENT_TINYAPP, false);
                if (z && (resolveFragment instanceof MainFragment)) {
                    KindaAnimatorWatch.didViewCreated(resolveFragment.hashCode());
                    this.f195308f.startWebViewUIPage(bundle, (MainFragment) resolveFragment);
                } else if (!z2 || !(resolveFragment instanceof MainFragment)) {
                    this.f195308f.addFragment(resolveFragment);
                } else {
                    KindaAnimatorWatch.didViewCreated(resolveFragment.hashCode());
                    this.f195308f.startTinyAppUIPage(bundle, (MainFragment) resolveFragment);
                }
            } else {
                super.onBackPressed();
            }
        }
    }

    /* renamed from: I7 */
    public boolean mo93520I7() {
        FrLifeController frLifeController = this.f195308f;
        if (frLifeController == null) {
            Log.m105924i("MicroMsg.UIPageFragmentActivity", "shouldFinish, controller is null!");
        } else {
            Log.m105925i("MicroMsg.UIPageFragmentActivity", "shouldFinish, fragment size: ", Integer.valueOf(frLifeController.getFragmentListSize()));
        }
        FrLifeController frLifeController2 = this.f195308f;
        return frLifeController2 != null && frLifeController2.getFragmentListSize() == 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0052 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0053 A[LOOP:0: B:13:0x0053->B:21:0x0053, LOOP_START] */
    /* renamed from: Q1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo531Q1(int r6, boolean r7) {
        /*
            r5 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "MicroMsg.UIPageFragmentActivity"
            java.lang.String r3 = "onKeyboardHeightChanged %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r3, r0)
            com.tencent.kinda.framework.widget.base.FrLifeController r0 = r5.f195308f
            java.util.List r0 = r0.getFragmentList()
            int r3 = r0.size()
            java.util.ListIterator r0 = r0.listIterator(r3)
            if (r6 <= 0) goto L_0x0036
            int r3 = r5.f195315p
            if (r3 > 0) goto L_0x0036
            r5.f195315p = r6
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r3[r2] = r4
            java.lang.String r4 = "show keyboard %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r3)
            r1 = 1
            goto L_0x004f
        L_0x0036:
            if (r6 > 0) goto L_0x004e
            int r3 = r5.f195315p
            if (r3 <= 0) goto L_0x004e
            r5.f195315p = r6
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r3[r2] = r4
            java.lang.String r4 = "hide keyboard %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r3)
            r1 = 1
            r3 = 0
            goto L_0x0050
        L_0x004e:
            r1 = 0
        L_0x004f:
            r3 = 1
        L_0x0050:
            if (r1 != 0) goto L_0x0053
            return
        L_0x0053:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L_0x007e
            java.lang.Object r1 = r0.previous()
            com.tencent.kinda.framework.widget.base.BaseFragment r1 = (com.tencent.kinda.framework.widget.base.BaseFragment) r1
            boolean r4 = r1 instanceof com.tencent.kinda.framework.widget.base.BaseFragment
            if (r4 != 0) goto L_0x0064
            goto L_0x0053
        L_0x0064:
            if (r3 == 0) goto L_0x0072
            androidx.appcompat.app.AppCompatActivity r4 = r5.getContext()
            int r4 = kg3.C76577a.m92152c(r4, r6)
            r1.onKeyboardShow(r7, r4)
            goto L_0x0053
        L_0x0072:
            androidx.appcompat.app.AppCompatActivity r4 = r5.getContext()
            int r4 = kg3.C76577a.m92152c(r4, r6)
            r1.onKeyboardShow(r2, r4)
            goto L_0x0053
        L_0x007e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.framework.app.UIPageFragmentActivity.mo531Q1(int, boolean):void");
    }

    public boolean addFragment(BaseFragment baseFragment) {
        Log.m105924i("MicroMsg.UIPageFragmentActivity", "addFragment: " + baseFragment);
        if (baseFragment instanceof MainFragment) {
            this.f195306d = false;
        }
        return this.f195308f.addFragment(baseFragment);
    }

    public boolean convertActivityFromTranslucent() {
        return false;
    }

    public void finish() {
        super.finish();
        Log.m105924i("MicroMsg.UIPageFragmentActivity", "finish onlyModal:" + this.f195306d);
        if (this.f195306d) {
            super.overridePendingTransition(0, 0);
            return;
        }
        int intExtra = getIntent().getIntExtra(ConstantsKinda.INTENT_EXIT_ANIMATION, -1);
        if (intExtra != -1) {
            overridePendingTransition(0, intExtra);
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C67448R.C67450layout.b_s;
    }

    public Object getSystemService(String str) {
        if (!this.f195319t || str == null || !str.equals(FirebaseAnalytics.C113379b.LOCATION)) {
            return super.getSystemService(str);
        }
        return null;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Boolean bool;
        super.onActivityResult(i, i2, intent);
        Log.m105924i("MicroMsg.UIPageFragmentActivity", "onActivityResult requestCode: " + i + ", resultCode: " + i2 + ", data: " + intent);
        boolean z = true;
        if (i != 4 || intent == null) {
            FrLifeController frLifeController = this.f195308f;
            if (frLifeController == null || !frLifeController.processCallback(i) || !mo93520I7()) {
                z = false;
            } else {
                finish();
                return;
            }
        } else {
            int intExtra = intent.getIntExtra("err_code", 0);
            int intExtra2 = intent.getIntExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
            int intExtra3 = intent.getIntExtra("countFace", 0);
            long longExtra = intent.getLongExtra("totalTime", 0);
            int intExtra4 = intent.getIntExtra("err_type", 6);
            Log.m105924i("MicroMsg.UIPageFragmentActivity", "errCode： " + intExtra);
            Log.m105924i("MicroMsg.UIPageFragmentActivity", "scene： " + intExtra2);
            Log.m105924i("MicroMsg.UIPageFragmentActivity", "countFace： " + intExtra3);
            Log.m105924i("MicroMsg.UIPageFragmentActivity", "totalTime： " + longExtra);
            Log.m105924i("MicroMsg.UIPageFragmentActivity", "errorType： " + intExtra4);
            boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_face_check_cross_switch, false);
            boolean z2 = C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Pay_FaceCheckCross_Int, 0) == 1;
            Log.m105925i("MicroMsg.UIPageFragmentActivity", "isOpenFaceCrossSwitch: %s, %s", Boolean.valueOf(wf), Boolean.valueOf(z2));
            if (z2) {
                wf = true;
            }
            if (wf) {
                attachOnlyActivity();
            }
            if (i2 == -1) {
                Log.m105924i("MicroMsg.UIPageFragmentActivity", "resultCode：RESULT_OK");
                if (!(this.f195309g == null || intent.getExtras() == null)) {
                    this.f195309g.call(false, intent.getExtras().getString(XWalkReaderBasePlugin.PARAM_KEY_TOKEN), intExtra, "");
                    this.f195309g = null;
                }
            } else {
                if (!(this.f195309g == null || intent.getExtras() == null)) {
                    String string = intent.getExtras().getString("click_other_verify_btn");
                    boolean z3 = !Util.isNullOrNil(string) && string.equalsIgnoreCase("yes");
                    Log.m105925i("MicroMsg.UIPageFragmentActivity", "isClickOtherVerify: %s", string);
                    if (z3) {
                        Log.m105924i("MicroMsg.UIPageFragmentActivity", "check face failed, click other verify");
                        this.f195309g.call(true, "", intExtra, "");
                        this.f195309g = null;
                    }
                }
                if (i2 == 0) {
                    Log.m105924i("MicroMsg.UIPageFragmentActivity", "resultCode：RESULT_CANCELED");
                    VoidCallback voidCallback = this.f195310h;
                    if (voidCallback != null) {
                        voidCallback.call();
                        this.f195310h = null;
                    }
                }
            }
        }
        FrLifeController frLifeController2 = this.f195308f;
        if (frLifeController2 != null && frLifeController2.getFragmentListSize() <= 0) {
            finish();
        } else if (!z) {
            C68049b bVar = this.f195318s.get(Integer.valueOf(i));
            if (bVar != null) {
                bVar.handle(i2, intent);
                bool = Boolean.TRUE;
            } else {
                bool = Boolean.FALSE;
            }
            bool.booleanValue();
        }
    }

    public void onBackPressed() {
        Log.m105924i("MicroMsg.UIPageFragmentActivity", "onBackPressed");
        if (!this.f195308f.getCurrent().onBackPressed()) {
            popFragment();
        }
    }

    public void onCreate(Bundle bundle) {
        boolean z = false;
        this.f195312j = getIntent().getBooleanExtra(ConstantsKinda.CHEEK_WALLET_LOCK, false);
        Log.m105919d("MicroMsg.UIPageFragmentActivity", "MainFragmentActivity oncreate %s", this);
        C115669n.INSTANCE.mo175911u(782, 37);
        this.f195313n = C85875k4.m106211z();
        Log.m105925i("MicroMsg.UIPageFragmentActivity", "isDarkMode:%s", Boolean.valueOf(C85875k4.m106211z()));
        this.f195308f = new FrLifeController(this);
        this.f195307e = getIntent().getBooleanExtra("key_support_swipe_back", true);
        supportRequestWindowFeature(109);
        super.onCreate(bundle);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        hideTitleView();
        getController().mo177105z0(0);
        if (this.f195311i != null) {
            Log.m105924i("MicroMsg.UIPageFragmentActivity", "force kindaShowingDialog is false");
            this.f195311i.setBool("kindaShowingDialog", false, 0);
        }
        if (this.f195312j) {
            z = ((C28273c) C86312j.m106911c(C28273c.class)).mo55895Jf().mo91354h(this, (C67213b.C67214b) null);
        }
        if (!z) {
            mo93519H7(getIntent().getBundleExtra(ConstantsKinda.INTENT_BUNDLE));
        }
        setTenpayKBStateCallBackListener(new C68048a());
        KeyboardHeightProvider keyboardHeightProvider = new KeyboardHeightProvider(getContext());
        this.f195314o = keyboardHeightProvider;
        keyboardHeightProvider.f220015b = this;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f195308f.onActivityDestroy();
        C115669n.INSTANCE.mo175911u(782, 44);
        C118418g.INSTANCE.mo175817ev(false);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.m105924i("MicroMsg.UIPageFragmentActivity", "onNewIntent");
    }

    public void onPause() {
        Log.m105924i("MicroMsg.UIPageFragmentActivity", "onPause");
        super.onPause();
        C115669n.INSTANCE.mo175911u(782, 42);
        new KindaActivityPauseEvent().publish();
        KeyboardHeightProvider keyboardHeightProvider = this.f195314o;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104021d();
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        boolean z = bundle.getBoolean("key_dark_mode_state");
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_kinda_darkmode_change_adaptation, true);
        Log.m105925i("MicroMsg.UIPageFragmentActivity", "onRestoreInstanceState，lastDarkMode:%s  nowDarkMode:%s,svgconfig:%s", Boolean.valueOf(z), Boolean.valueOf(C85875k4.m106211z()), Boolean.valueOf(wf));
        if (wf && (z ^ C85875k4.m106211z())) {
            finish();
        }
        super.onRestoreInstanceState(bundle);
    }

    public void onResume() {
        Log.m105924i("MicroMsg.UIPageFragmentActivity", "onResume");
        super.onResume();
        C115669n.INSTANCE.mo175911u(782, 40);
        FrLifeController frLifeController = this.f195308f;
        if (frLifeController == null || !frLifeController.processCallback(3) || !mo93520I7()) {
            TenpaySecureEditText.setSalt(C75228t.m90271t());
        } else {
            finish();
        }
        KeyboardHeightProvider keyboardHeightProvider = this.f195314o;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104022e();
        }
        this.f195308f.setTinyCallbackTag(true);
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("key_dark_mode_state", this.f195313n);
        Log.m105925i("MicroMsg.UIPageFragmentActivity", "onSaveInstanceState，isDarkMode:%s", Boolean.valueOf(this.f195313n));
        super.onSaveInstanceState(bundle);
    }

    public void onSwipe(float f) {
        Log.m105925i("MicroMsg.UIPageFragmentActivity", "onSwipe %s", Float.valueOf(f));
        super.onSwipe(f);
    }

    public void onSwipeBack() {
        Log.m105919d("MicroMsg.UIPageFragmentActivity", "onSwipeBack onSwipeBack %s %s", Boolean.valueOf(this.f195307e), this);
        if (this.f195307e) {
            super.onSwipeBack();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        KeyboardHeightProvider keyboardHeightProvider = this.f195314o;
        if (keyboardHeightProvider != null && z) {
            keyboardHeightProvider.mo104022e();
        }
    }

    public boolean popFragment() {
        if (this.f195308f.popFragment()) {
            Log.m105924i("MicroMsg.UIPageFragmentActivity", "popFragment, There is still Fragment, and UIPageFragmentActivity hold.");
            return true;
        }
        Log.m105924i("MicroMsg.UIPageFragmentActivity", "popFragment, finish the UIPageFragmentActivity.");
        finish();
        return false;
    }

    public boolean removeModal(BaseFragment baseFragment) {
        if (this.f195308f.removeModal(baseFragment)) {
            Log.m105924i("MicroMsg.UIPageFragmentActivity", "removeModal, There is still Fragment, and UIPageFragmentActivity hold.");
            return true;
        }
        Log.m105925i("MicroMsg.UIPageFragmentActivity", "removeModal, hasOpenH5OrTinyApp: %b, kindaShowingDialog: %b", Boolean.valueOf(this.f195308f.hasOpenH5OrTinyApp()), Boolean.valueOf(this.f195311i.getBool("kindaShowingDialog")));
        if (!this.f195308f.hasOpenH5OrTinyApp() && !this.f195311i.getBool("kindaShowingDialog")) {
            Log.m105924i("MicroMsg.UIPageFragmentActivity", "removeModal, finish the UIPageFragmentActivity.");
            finish();
        }
        return false;
    }

    public BaseFragment topShowFragment() {
        FrLifeController frLifeController = this.f195308f;
        if (frLifeController == null) {
            return null;
        }
        return BaseFrActivity.topShowFragmentOf(frLifeController.getFragmentList());
    }
}
