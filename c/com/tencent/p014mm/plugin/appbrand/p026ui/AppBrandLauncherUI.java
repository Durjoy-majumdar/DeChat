package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import c00.C0405n;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.hellhoundlib.fragments.HellAndroidXFragment;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.C40573v2;
import com.tencent.p014mm.plugin.appbrand.appusage.C81478e0;
import com.tencent.p014mm.plugin.appbrand.appusage.C81481f0;
import com.tencent.p014mm.plugin.appbrand.p026ui.recents.RecentsFolderActivityContext;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di0.C86299o;
import di3.C86312j;
import es0.C7931z;
import f40.C86737h0;
import gy3.C87412m;
import java.util.Set;
import kb0.C9575d;
import kr0.C76630x0;
import qe3.C89625d;
import zr0.C91931a;

@C86737h0
/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI */
public final class AppBrandLauncherUI extends MMActivity implements C91931a {

    /* renamed from: i */
    public static int f246382i = MMApplicationContext.getContext().getResources().getColor(C0966R.color.a7_);

    /* renamed from: d */
    public int f246383d = -1;

    /* renamed from: e */
    public boolean f246384e;

    /* renamed from: f */
    public RecentsFolderActivityContext f246385f;

    /* renamed from: g */
    public boolean f246386g = false;

    /* renamed from: h */
    public C81481f0.C81485d f246387h;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI$Fragment */
    public static abstract class Fragment extends HellAndroidXFragment {

        /* renamed from: d */
        public final MMHandler f246388d = new MMHandler(Looper.getMainLooper());

        /* renamed from: e */
        public int f246389e;

        /* renamed from: f */
        public String f246390f;

        /* renamed from: g */
        public View f246391g;

        /* renamed from: K */
        public void mo117064K(Intent intent, int i) {
        }

        /* renamed from: L */
        public void mo117065L() {
        }

        /* renamed from: M */
        public final void mo117066M(Runnable runnable) {
            if (runnable != null) {
                this.f246388d.post(runnable);
            }
        }

        /* renamed from: N */
        public final void mo117067N(Runnable runnable) {
            FragmentActivity activity = getActivity();
            if (activity != null && !activity.isDestroyed()) {
                activity.runOnUiThread(runnable);
            }
        }

        /* renamed from: O */
        public void mo117068O(int i) {
            this.f246389e = i;
        }

        public abstract int getLayoutId();

        public abstract void initView();

        public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            if (getLayoutId() < 0) {
                this.f246391g = new FrameLayout(viewGroup.getContext());
            } else {
                this.f246391g = layoutInflater.inflate(getLayoutId(), (ViewGroup) null);
            }
            initView();
            return this.f246391g;
        }

        public void onDestroy() {
            super.onDestroy();
            this.f246388d.removeCallbacksAndMessages((Object) null);
        }
    }

    static {
        int i = C40573v2.f108972a;
    }

    /* renamed from: A2 */
    public void mo117057A2(boolean z) {
        C81481f0.C81485d dVar;
        RecentsFolderActivityContext recentsFolderActivityContext = this.f246385f;
        if (recentsFolderActivityContext != null) {
            recentsFolderActivityContext.mo117057A2(z);
        }
        if (z && (dVar = this.f246387h) != null) {
            dVar.f239081a[4] = "1";
        }
    }

    /* renamed from: H7 */
    public final Fragment mo117060H7() {
        androidx.fragment.app.Fragment findFragmentById = super.getSupportFragmentManager().findFragmentById(16908290);
        if (findFragmentById == null || !(findFragmentById instanceof Fragment)) {
            return null;
        }
        return (Fragment) findFragmentById;
    }

    /* renamed from: I7 */
    public final void mo117061I7() {
        AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
        appBrandStatObject.f245533f = 1112;
        finish();
        overridePendingTransition(0, 0);
        C86299o oVar = new C86299o();
        if (C89625d.f257841g < 654314752) {
            String format = String.format("?showOrderEntrance=%d", new Object[]{1});
            oVar.f250934f = format;
            Log.m105925i("MicroMsg.AppBrandLauncherUI", "openFakeNativeRecommendUI, enterPath:%s", format);
        } else {
            C7931z zVar = new C7931z(1, (int[]) null);
            oVar.f250937i = zVar;
            Log.m105925i("MicroMsg.AppBrandLauncherUI", "openFakeNativeRecommendUI, wechatNativeExtraData=%s", zVar.mo3693a());
        }
        MultiProcessMMKV singleMMKV = MultiProcessMMKV.getSingleMMKV("AppBrandLauncherUIForceEntryConfig");
        C87412m.m108593f(singleMMKV, "getSingleMMKV(\"AppBrandL…ncherUIForceEntryConfig\")");
        String string = singleMMKV.getString("KEY_FORCE_WE_USE_FAKE_NATIVE_APPID", (String) null);
        if (string == null) {
            string = "wxb6d22f922f37b35a";
        }
        oVar.f250929a = "wxb6d22f922f37b35a".equals(string) ? "gh_b489f391e008@app" : "gh_9bd4ec2ab601@app";
        oVar.f250930b = string;
        MultiProcessMMKV singleMMKV2 = MultiProcessMMKV.getSingleMMKV("AppBrandLauncherUIForceEntryConfig");
        C87412m.m108593f(singleMMKV2, "getSingleMMKV(\"AppBrandL…ncherUIForceEntryConfig\")");
        oVar.f250931c = singleMMKV2.getBoolean("KEY_FORCE_FAKE_NATIVE_DEBUG", false) ? 1 : 0;
        oVar.f250932d = 0;
        oVar.f250939k = appBrandStatObject.f245533f;
        ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(MMApplicationContext.getContext(), oVar);
        this.f246386g = true;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (isFinishing()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getLayoutId() {
        return -1;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f246383d = i;
        if (i2 == -1 && i == 1) {
            String stringExtra = intent.getStringExtra("key_session_id");
            int intExtra = intent.getIntExtra("ftsbizscene", 0);
            Log.m105925i("MicroMsg.AppBrandLauncherUI", "onActivityResult oreh report weAppSearchClickStream(13929) statSessionId:%s, StatKeyWordId:%s", stringExtra, C9575d.f29814a);
            C115669n.INSTANCE.mo160131h(13929, stringExtra, C9575d.f29814a, 2, Integer.valueOf(intExtra));
        }
    }

    public void onBackPressed() {
        finish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0145, code lost:
        if ((com.tencent.p014mm.plugin.appbrand.app.C1510o.f10864a.mo1516a().getInt(".sysmsg.UpdateWxaUserSwitchNotify.DiscoveryEntranceUseFake", 0) == 1) != false) goto L_0x0147;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r26) {
        /*
            r25 = this;
            r6 = r25
            java.lang.Class<ky2.i> r7 = ky2.C10432i.class
            super.onCreate(r26)
            android.content.Intent r0 = r25.getIntent()
            if (r0 != 0) goto L_0x0011
            r25.finish()
            return
        L_0x0011:
            boolean r0 = com.tencent.p014mm.plugin.appbrand.appusage.C81508l.m100001c()
            if (r0 != 0) goto L_0x001b
            r25.finish()
            return
        L_0x001b:
            androidx.lifecycle.j r0 = r25.getLifecycle()
            com.tencent.mm.plugin.appbrand.report.n r1 = com.tencent.p014mm.plugin.appbrand.report.C84175n.f245826d
            com.tencent.mm.plugin.appbrand.report.AppBrandLauncherDesktopReporter r1 = r1.mo116851a(r6)
            r0.addObserver(r1)
            android.content.Intent r0 = r25.getIntent()
            r1 = -1
            java.lang.String r2 = "extra_enter_scene"
            r0.getIntExtra(r2, r1)
            android.content.Intent r0 = r25.getIntent()
            java.lang.String r1 = "extra_show_recents_from_task_bar"
            r8 = 0
            boolean r9 = r0.getBooleanExtra(r1, r8)
            r10 = 1
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
            r0[r8] = r1
            java.lang.String r11 = "MicroMsg.AppBrandLauncherUI"
            java.lang.String r1 = "onCreate showRecentListTagOnTop:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r1, r0)
            java.lang.String r0 = "AppBrandLauncherUIForceEntryConfig"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getSingleMMKV(r0)
            java.lang.String r2 = "getSingleMMKV(\"AppBrandL…ncherUIForceEntryConfig\")"
            gy3.C87412m.m108593f(r1, r2)
            java.lang.String r3 = "KEY_FORCE_WE_USE_FAKE_NATIVE"
            boolean r1 = r1.getBoolean(r3, r8)
            if (r1 == 0) goto L_0x006b
            if (r9 != 0) goto L_0x006b
            java.lang.String r0 = "onCreate isForceOpenWeUseFakeNative=TRUE"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            r25.mo117061I7()
            return
        L_0x006b:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getSingleMMKV(r0)
            gy3.C87412m.m108593f(r0, r2)
            java.lang.String r1 = "KEY_FORCE_NATIVE_LAUNCHER"
            boolean r12 = r0.getBoolean(r1, r8)
            android.content.Intent r0 = r25.getIntent()
            java.lang.String r1 = "extra_show_recommend"
            boolean r0 = r0.getBooleanExtra(r1, r8)
            r6.f246384e = r0
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_APP_BRAND_RECOMMEND_DATA_STATE_INT_SYNC
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            java.lang.Object r0 = r0.mo119685f(r1, r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 != r10) goto L_0x00a0
            r13 = 1
            goto L_0x00a1
        L_0x00a0:
            r13 = 0
        L_0x00a1:
            com.tencent.mm.plugin.appbrand.ui.m0 r0 = new com.tencent.mm.plugin.appbrand.ui.m0
            r0.<init>(r6)
            r6.setTitleBarDoubleClickListener(r0)
            android.content.res.Resources r0 = r25.getResources()
            r1 = 2131821085(0x7f11021d, float:1.9274903E38)
            java.lang.String r0 = r0.getString(r1)
            r6.setMMTitle((java.lang.String) r0)
            com.tencent.mm.plugin.appbrand.ui.n0 r0 = new com.tencent.mm.plugin.appbrand.ui.n0
            r0.<init>(r6)
            r1 = 2131755023(0x7f10000f, float:1.9140914E38)
            r6.setBackBtn(r0, r1)
            di3.d r0 = di3.C86312j.m106911c(r7)
            ky2.i r0 = (ky2.C10432i) r0
            boolean r0 = r0.mo10750e()
            r0 = r0 ^ r10
            if (r0 == 0) goto L_0x00e5
            r1 = 0
            r2 = 2131838050(0x7f114462, float:1.9309312E38)
            r3 = 2131755027(0x7f100013, float:1.9140922E38)
            com.tencent.mm.plugin.appbrand.ui.o0 r4 = new com.tencent.mm.plugin.appbrand.ui.o0
            r4.<init>(r6)
            com.tencent.mm.plugin.appbrand.ui.p0 r5 = new com.tencent.mm.plugin.appbrand.ui.p0
            r5.<init>(r6)
            r0 = r25
            r0.addIconOptionMenu((int) r1, (int) r2, (int) r3, (android.view.MenuItem.OnMenuItemClickListener) r4, (android.view.View.OnLongClickListener) r5)
        L_0x00e5:
            r0 = 2131838048(0x7f114460, float:1.9309308E38)
            r1 = 2131755026(0x7f100012, float:1.914092E38)
            com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI$$a r2 = new com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI$$a
            r2.<init>(r6)
            r6.addIconOptionMenu((int) r10, (int) r0, (int) r1, (android.view.MenuItem.OnMenuItemClickListener) r2)
            androidx.appcompat.app.AppCompatActivity r0 = r25.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131101246(0x7f06063e, float:1.7814896E38)
            int r0 = r0.getColor(r1)
            f246382i = r0
            r6.setActionbarColor(r0)
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r6.findViewById(r0)
            int r1 = f246382i
            r0.setBackgroundColor(r1)
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]
            boolean r2 = r6.f246384e
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1[r8] = r2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r13)
            r1[r10] = r2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r12)
            r3 = 2
            r1[r3] = r2
            java.lang.String r2 = "mShowRecommend:%b, recommendDataState:%b, isForceOpenNativeLauncherUI:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r2, r1)
            boolean r1 = r6.f246384e
            if (r1 != 0) goto L_0x0147
            com.tencent.mm.plugin.appbrand.app.o r1 = com.tencent.p014mm.plugin.appbrand.app.C1510o.f10864a
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = r1.mo1516a()
            java.lang.String r2 = ".sysmsg.UpdateWxaUserSwitchNotify.DiscoveryEntranceUseFake"
            int r1 = r1.getInt(r2, r8)
            if (r1 != r10) goto L_0x0144
            r1 = 1
            goto L_0x0145
        L_0x0144:
            r1 = 0
        L_0x0145:
            if (r1 == 0) goto L_0x014f
        L_0x0147:
            if (r12 != 0) goto L_0x014f
            if (r9 != 0) goto L_0x014f
            r25.mo117061I7()
            return
        L_0x014f:
            androidx.lifecycle.j r1 = r25.getLifecycle()
            com.tencent.mm.plugin.appbrand.ui.recents.RecentsFolderActivityContext r2 = new com.tencent.mm.plugin.appbrand.ui.recents.RecentsFolderActivityContext
            r2.<init>(r6)
            r6.f246385f = r2
            r1.addObserver(r2)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 465(0x1d1, double:2.297E-321)
            r14 = 0
            r16 = 1
            r18 = 0
            r11 = r1
            r11.idkeyStat(r12, r14, r16, r18)
            di3.d r2 = di3.C86312j.m106911c(r7)
            ky2.i r2 = (ky2.C10432i) r2
            boolean r2 = r2.mo10750e()
            r2 = r2 ^ r10
            java.lang.String r4 = "MicroMsg.AppBrandSearchLogic"
            r5 = 4
            if (r2 != 0) goto L_0x0181
            java.lang.String r2 = "do not need to update search input hint, shouldShowSearchEntrance is false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            goto L_0x01f0
        L_0x0181:
            long r13 = java.lang.System.currentTimeMillis()
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WXA_SEARCH_INPUT_HINT_UPDATE_TIME_LONG_SYNC
            r9 = 0
            java.lang.Object r2 = r2.mo119685f(r7, r9)
            if (r2 == 0) goto L_0x01a1
            boolean r7 = r2 instanceof java.lang.Long
            if (r7 == 0) goto L_0x01a1
            java.lang.Long r2 = (java.lang.Long) r2
            long r15 = r2.longValue()
            goto L_0x01a3
        L_0x01a1:
            r15 = 0
        L_0x01a3:
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r2 = r2.getLanguage()
            f40.o r7 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r7 = r7.mo121142i()
            com.tencent.mm.storage.y1$a r11 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WXA_SEARCH_INPUT_HINT_LANG_STRING_SYNC
            java.lang.Object r7 = r7.mo119685f(r11, r9)
            long r11 = r13 - r15
            r19 = 3600000(0x36ee80, double:1.7786363E-317)
            int r9 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1))
            if (r9 >= 0) goto L_0x01ca
            if (r7 == 0) goto L_0x01ca
            boolean r9 = r7.equals(r2)
            if (r9 != 0) goto L_0x01d8
        L_0x01ca:
            f40.g r9 = f40.C86709a0.m107529k()
            ob0.b0 r9 = r9.f251779b
            rp0.b r11 = new rp0.b
            r11.<init>()
            r9.mo123460f(r11)
        L_0x01d8:
            java.lang.Object[] r9 = new java.lang.Object[r5]
            r9[r8] = r7
            r9[r10] = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r15)
            r9[r3] = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r13)
            r9[r0] = r2
            java.lang.String r2 = "tryToUpdateSearchInputHint, lang(o : %s, c : %s), lastUpdateTime(o : %s, c : %s)"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r4, r2, r9)
        L_0x01f0:
            java.lang.Class<s00.f> r2 = s00.C90110f.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            s00.f r2 = (s00.C90110f) r2
            r2.mo124152cj()
            boolean r2 = com.tencent.p014mm.plugin.appbrand.appusage.C81481f0.m99955a()
            if (r2 == 0) goto L_0x0208
            com.tencent.mm.plugin.appbrand.appusage.f0$d r2 = new com.tencent.mm.plugin.appbrand.appusage.f0$d
            r2.<init>()
            r6.f246387h = r2
        L_0x0208:
            boolean r2 = f40.C86709a0.m107522a()
            java.lang.String r4 = ""
            if (r2 != 0) goto L_0x0211
            goto L_0x0254
        L_0x0211:
            boolean r2 = com.tencent.p014mm.plugin.appbrand.appusage.C81481f0.m99955a()
            if (r2 == 0) goto L_0x0254
            r11 = 0
            com.tencent.p014mm.plugin.appbrand.appusage.C81481f0.m99957c(r8, r11)
            com.tencent.p014mm.plugin.appbrand.appusage.C81481f0.m99956b(r8, r11, r11)
            com.tencent.mm.plugin.appbrand.appusage.f0$e r19 = com.tencent.p014mm.plugin.appbrand.appusage.C81481f0.C81486e.f239082a
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_NEW_XML_MSG_ID_STRING
            java.lang.Object r2 = r2.mo119685f(r7, r4)
            r20 = r2
            java.lang.String r20 = (java.lang.String) r20
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_NEW_XML_PUSH_TIME_LONG
            java.lang.Long r9 = java.lang.Long.valueOf(r11)
            java.lang.Object r2 = r2.mo119685f(r7, r9)
            java.lang.Long r2 = (java.lang.Long) r2
            long r21 = r2.longValue()
            int r24 = r19.mo113784a()
            r23 = 2
            r19.mo113785b(r20, r21, r23, r24)
        L_0x0254:
            boolean r2 = f40.C86709a0.m107522a()
            if (r2 != 0) goto L_0x025b
            goto L_0x0298
        L_0x025b:
            boolean r2 = com.tencent.p014mm.plugin.appbrand.appusage.C81508l.m100002d()
            if (r2 == 0) goto L_0x0289
            r2 = 5
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            r2[r8] = r7
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r4)
            r2[r10] = r4
            r7 = 0
            java.lang.Long r4 = java.lang.Long.valueOf(r7)
            r2[r3] = r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r0] = r3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r2[r5] = r0
            r0 = 14112(0x3720, float:1.9775E-41)
            r1.mo160131h(r0, r2)
        L_0x0289:
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_APP_BRAND_ENTRANCE_SHOW_NEW_BOOLEAN
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.mo119677K(r1, r2)
        L_0x0298:
            java.lang.Class<l31.e> r0 = l31.C61212e.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            l31.e r0 = (l31.C61212e) r0
            o31.b r1 = o31.C11345b.AppBrandLauncherUI
            l31.e r0 = r0.mo86178qr(r6, r1)
            o31.a r1 = o31.C76986a.MiniProgramList
            r0.mo86179qs(r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandLauncherUI.onCreate(android.os.Bundle):void");
    }

    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        getWindow().setSoftInputMode(3);
    }

    public void onDestroy() {
        super.onDestroy();
        Set<Object> set = C81478e0.f239071d;
        C81481f0.C81485d dVar = this.f246387h;
        if (dVar != null) {
            dVar.getClass();
            C115669n.INSTANCE.mo160131h(14113, dVar.f239081a);
            this.f246387h = null;
        }
        try {
            ((ViewGroup) getContentView()).removeAllViews();
        } catch (Exception unused) {
        }
    }

    public void onResume() {
        int i = this.f246383d;
        if (i > 0) {
            int i2 = 4;
            if (i == 1) {
                i2 = 7;
            } else if (i == 2) {
                i2 = 6;
            } else if (i == 3) {
                i2 = 9;
            } else if (i == 4) {
                i2 = 12;
            }
            this.f246383d = 0;
            Fragment fragment = (Fragment) super.getSupportFragmentManager().findFragmentById(16908290);
            if (fragment != null) {
                fragment.mo117068O(i2);
            }
        }
        super.onResume();
        ((C0405n) C86312j.m106911c(C0405n.class)).mo278ce();
    }

    public void onStop() {
        super.onStop();
        if (this.f246386g) {
            finish();
            overridePendingTransition(0, 0);
        }
    }

    public void setTitle(CharSequence charSequence) {
        setMMTitle(charSequence);
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
        Fragment H7 = mo117060H7();
        if (H7 != null) {
            H7.mo117064K(intent, i);
        }
    }

    public void setTitle(int i) {
        setMMTitle(i);
    }
}
