package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import bd2.C79690d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.modelsimple.C1302b0;
import com.tencent.p014mm.p136ui.MMAppMgr;
import com.tencent.p014mm.p136ui.base.preference.IconPreference;
import com.tencent.p014mm.p136ui.base.preference.IconSummaryPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.tools.C45081s1;
import com.tencent.p014mm.plugin.lite.api.C115477b;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.newtips.NormalIconNewTipPreference;
import com.tencent.p014mm.plugin.newtips.model.C115631n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.setting.p102ui.widget.PrivacyUpdatePreference;
import com.tencent.p014mm.pluginsdk.platformtools.C85623c;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMEntryLock;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams;
import di3.C86312j;
import f40.C75681p0;
import f40.C86709a0;
import f40.C86737h0;
import gc2.C116945b;
import gy3.C87412m;
import h81.C32735h;
import j20.C117292a;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C9556a;
import ke3.C88144b;
import l20.C21388a;
import lg3.C88504k;
import m13.C88689b;
import m13.C88690c;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import p244tt.C14088e;
import p271xn.C15865p;
import p271xn.C91296j;
import p271xn.C91298n;
import p327ct.C30914c;
import p617mz.C76813e;
import p617mz.C88861c;
import p617mz.C88862d;
import p620nm.C89013r;
import pj3.C47511g;
import qe3.C89625d;
import rx3.C36570n;
import te3.C90430p93;
import te3.tg4;
import tm2.C14049d;
import tw0.C90585h;
import zt3.C119157j;

@C86737h0
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI */
public class SettingsAboutMicroMsgUI extends MMPreference implements C11385n {

    /* renamed from: w */
    public static final /* synthetic */ int f248965w = 0;

    /* renamed from: d */
    public C47511g f248966d;

    /* renamed from: e */
    public String f248967e;

    /* renamed from: f */
    public boolean f248968f = false;

    /* renamed from: g */
    public boolean f248969g = false;

    /* renamed from: h */
    public boolean f248970h = false;

    /* renamed from: i */
    public C90585h f248971i;

    /* renamed from: j */
    public long f248972j = 0;

    /* renamed from: n */
    public boolean f248973n = false;

    /* renamed from: o */
    public boolean f248974o = false;

    /* renamed from: p */
    public ProgressDialog f248975p;

    /* renamed from: q */
    public MTimerHandler f248976q;

    /* renamed from: r */
    public C11385n f248977r = null;

    /* renamed from: s */
    public C88690c f248978s = new C85422c();

    /* renamed from: t */
    public boolean f248979t = false;

    /* renamed from: u */
    public boolean f248980u = false;

    /* renamed from: v */
    public boolean f248981v = false;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI$a */
    public class C85420a implements MenuItem.OnMenuItemClickListener {
        public C85420a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsAboutMicroMsgUI.this.hideVKB();
            SettingsAboutMicroMsgUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI$b */
    public class C85421b implements Runnable {
        public C85421b() {
        }

        public void run() {
            SettingsAboutMicroMsgUI settingsAboutMicroMsgUI = SettingsAboutMicroMsgUI.this;
            int i = SettingsAboutMicroMsgUI.f248965w;
            settingsAboutMicroMsgUI.mo118775J7(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI$c */
    public class C85422c implements C88690c {
        public C85422c() {
        }

        /* renamed from: a */
        public void mo118779a(boolean z, C90585h hVar) {
            if (z) {
                SettingsAboutMicroMsgUI settingsAboutMicroMsgUI = SettingsAboutMicroMsgUI.this;
                int i = SettingsAboutMicroMsgUI.f248965w;
                settingsAboutMicroMsgUI.mo118775J7(false);
            }
        }
    }

    /* renamed from: H7 */
    public static void m105429H7(SettingsAboutMicroMsgUI settingsAboutMicroMsgUI) {
        settingsAboutMicroMsgUI.getClass();
        C89137b0 d = C86709a0.m107524d();
        C85439e1 e1Var = new C85439e1(settingsAboutMicroMsgUI);
        settingsAboutMicroMsgUI.f248977r = e1Var;
        d.mo123455a(255, e1Var);
        C1302b0 b0Var = new C1302b0(2);
        b0Var.f10416f = 1;
        C86709a0.m107524d().mo123460f(b0Var);
        MTimerHandler mTimerHandler = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C85441f1(settingsAboutMicroMsgUI, b0Var), false);
        settingsAboutMicroMsgUI.f248976q = mTimerHandler;
        mTimerHandler.startTimer(3000);
        settingsAboutMicroMsgUI.f248975p = C76879j.m92723Q(settingsAboutMicroMsgUI.getContext(), settingsAboutMicroMsgUI.getString(C0966R.string.a3h), settingsAboutMicroMsgUI.getString(C0966R.string.lmv), true, false, new C85442g1(settingsAboutMicroMsgUI, b0Var));
    }

    /* renamed from: I7 */
    public static void m105430I7(SettingsAboutMicroMsgUI settingsAboutMicroMsgUI) {
        settingsAboutMicroMsgUI.getClass();
        MMEntryLock.unlock("welcome_page_show");
        C75681p0.m90934a(settingsAboutMicroMsgUI, true);
        C14049d.m13402a().mo93150TO();
        ((MMNotification) ((C79690d) C86312j.m106911c(C79690d.class)).mo109806kA()).mo93209g();
        C85623c.C85624a aVar = C85623c.f249568a;
        AppCompatActivity context = settingsAboutMicroMsgUI.getContext();
        ((C89013r.C89016c) aVar).getClass();
        MMAppMgr.m85985e(context, true);
        settingsAboutMicroMsgUI.finish();
    }

    /* renamed from: J7 */
    public final void mo118775J7(boolean z) {
        Class cls = C30914c.class;
        Class cls2 = C88689b.class;
        C47511g preferenceScreen = getPreferenceScreen();
        this.f248966d = preferenceScreen;
        preferenceScreen.removeAll();
        this.f248966d.mo72520b(C0966R.xml.f8951c8);
        SettingsAboutMMHeaderPreference settingsAboutMMHeaderPreference = (SettingsAboutMMHeaderPreference) this.f248966d.mo72519a("settings_about_mm_header");
        int i = C89625d.f257841g;
        String formatVersion = (i < 671088896 || i > 671089151) ? ChannelUtil.formatVersion(getContext(), C89625d.f257841g) : "8.0.1";
        if (C89625d.f257845k || BuildInfo.IS_FLAVOR_BLUE) {
            formatVersion = formatVersion + " " + C88504k.m110376b(this);
        }
        settingsAboutMMHeaderPreference.f205658J = formatVersion;
        if (LocaleUtil.isSimplifiedChineseAppLang()) {
            NormalIconNewTipPreference normalIconNewTipPreference = (NormalIconNewTipPreference) this.f248966d.mo72519a("settings_update");
            int nullAsNil = Util.nullAsNil((Integer) C86709a0.m107535s().mo121142i().mo119684e(12304, (Object) null));
            if (nullAsNil < 1) {
                C116945b.yx0().mo175770k(normalIconNewTipPreference);
            }
            normalIconNewTipPreference.mo96254e0(this.f248966d);
            normalIconNewTipPreference.mo96252c0();
            if (!normalIconNewTipPreference.mo64138m(nullAsNil > 0)) {
                if (nullAsNil > 0) {
                    normalIconNewTipPreference.mo101936T(0);
                    String str = "" + nullAsNil;
                    int b = C45081s1.m49933b(getContext(), nullAsNil);
                    normalIconNewTipPreference.f215054P = str;
                    normalIconNewTipPreference.f215055Q = b;
                    normalIconNewTipPreference.mo64136k(C115631n.MMNEWTIPS_SHOWTYPE_COUNTER, true);
                } else {
                    normalIconNewTipPreference.mo101936T(8);
                    normalIconNewTipPreference.f215054P = "";
                    normalIconNewTipPreference.f215055Q = -1;
                }
            }
        }
        C116945b.yx0().mo175770k((PrivacyUpdatePreference) this.f248966d.mo72519a("privacy_update"));
        if (z) {
            this.f248966d.mo72531o("funtion_update");
        } else if (((C88689b) C86312j.m106911c(cls2)).mo122746bQ()) {
            IconPreference iconPreference = (IconPreference) this.f248966d.mo72519a("funtion_check_update");
            SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("UpdaterConfigSharedPreferences", 0);
            C87412m.m108593f(sharedPreferences, "getContext().getSharedPr…me, Context.MODE_PRIVATE)");
            String formatVersion2 = ChannelUtil.formatVersion((Context) null, sharedPreferences.getInt("KeyTinkerPatchVersion", 0));
            SharedPreferences sharedPreferences2 = MMApplicationContext.getContext().getSharedPreferences("UpdaterConfigSharedPreferences", 0);
            C87412m.m108593f(sharedPreferences2, "getContext().getSharedPr…me, Context.MODE_PRIVATE)");
            Log.m105925i("MicroMsg.SettingsAboutMicroMsgUI", "updateUpdate，versionTmp = %s, version = %s， UpdaterConfig.INSTANCE.getUpdaterSharePreference().getInt(ConstantsUpdater.KeyTinkerPatchVersion, 0) = %s, ConstantsProtocal.CLIENT_VERSION = %s", formatVersion2, formatVersion, Integer.valueOf(sharedPreferences2.getInt("KeyTinkerPatchVersion", 0)), Integer.valueOf(C89625d.f257841g));
            if (Util.isNullOrNil(formatVersion2) || Util.isNullOrNil(formatVersion) || formatVersion2.equals(formatVersion) || formatVersion2.equals("0.0")) {
                iconPreference.mo7741E("");
            } else {
                C90585h hVar = this.f248971i;
                if (hVar == null || hVar.mo118353j() != 2) {
                    iconPreference.mo7741E(formatVersion2);
                } else {
                    iconPreference.mo7741E("");
                }
            }
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_update_patch_force_noshow_new_flag, 0) == 1) {
                iconPreference.mo101936T(8);
                iconPreference.mo7741E("");
            } else {
                C90585h hVar2 = this.f248971i;
                if (hVar2 == null || hVar2.mo118353j() != 2) {
                    iconPreference.mo101936T(0);
                    iconPreference.f215054P = getString(C0966R.string.f360088a12);
                    iconPreference.f215055Q = C0966R.C0969drawable.ake;
                } else {
                    iconPreference.mo101936T(8);
                }
            }
            C90585h hVar3 = this.f248971i;
            if (hVar3 != null) {
                Log.m105925i("MicroMsg.SettingsAboutMicroMsgUI", "updateUpdate response= %s", hVar3);
            }
            this.f248966d.mo72531o("funtion_update");
        } else if (((C88689b) C86312j.m106911c(cls2)).Lv0()) {
            IconSummaryPreference iconSummaryPreference = (IconSummaryPreference) this.f248966d.mo72519a("funtion_update");
            iconSummaryPreference.f24254L = 0;
            iconSummaryPreference.f24252J = getString(C0966R.string.f360088a12);
            iconSummaryPreference.f24253K = C0966R.C0969drawable.ake;
            iconSummaryPreference.f24258Q = 0;
            TextView textView = iconSummaryPreference.f24262U;
            if (textView != null) {
                textView.setVisibility(0);
            }
            this.f248966d.mo72531o("funtion_check_update");
        } else {
            this.f248966d.mo72531o("funtion_update");
        }
        if (!LocaleUtil.isSimplifiedChineseAppLang()) {
            this.f248966d.mo72529n("settings_report", true);
        }
        C85623c.f249568a.getClass();
        this.f248966d.mo72529n("funtion_about_wechat", true);
        if (!Util.isNullOrNil((String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CROWDTEST_APPLY_LINK_STRING, (Object) null))) {
            IconPreference iconPreference2 = (IconPreference) this.f248966d.mo72519a("funtion_crowdtest_update");
            if (((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33494b(262157, 266263)) {
                iconPreference2.mo96250V(0);
            }
        } else {
            this.f248966d.mo72531o("funtion_crowdtest_update");
        }
        if (!BuildInfo.IS_FLAVOR_BLUE) {
            this.f248966d.mo72529n("funtion_about_flavor_blue", true);
            this.f248966d.mo72529n("funtion_invite_flavor_blue", true);
        } else {
            IconPreference iconPreference3 = (IconPreference) this.f248966d.mo72519a("funtion_about_flavor_blue");
            if (((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33494b(262164, 266270)) {
                iconPreference3.mo96250V(0);
            }
        }
        if (WeChatBrands.Business.Entries.MeSetAboutIntros.banned()) {
            this.f248966d.mo72531o("settings_update");
        }
        this.f248966d.notifyDataSetChanged();
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0263  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getBottomView() {
        /*
            r19 = this;
            r1 = r19
            java.lang.Class<ny.h> r0 = p629ny.C76979h.class
            androidx.appcompat.app.AppCompatActivity r2 = r19.getContext()
            android.view.LayoutInflater r2 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r2)
            r3 = 2131497412(0x7f0c11c4, float:1.8618416E38)
            r4 = 0
            android.view.View r2 = r2.inflate(r3, r4)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r3 = 2131315061(0x7f094975, float:1.8248565E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r5 = 2131315059(0x7f094973, float:1.824856E38)
            android.view.View r5 = r2.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r6 = 2131315060(0x7f094974, float:1.8248563E38)
            android.view.View r6 = r2.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r7 = 2131306019(0x7f092623, float:1.8230225E38)
            android.view.View r7 = r2.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r8 = 2131315058(0x7f094972, float:1.8248559E38)
            android.view.View r8 = r2.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r9 = 2131300465(0x7f091071, float:1.821896E38)
            android.view.View r9 = r2.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            androidx.appcompat.app.AppCompatActivity r10 = r19.getContext()
            r11 = 2131165652(0x7f0701d4, float:1.7945527E38)
            int r10 = kg3.C76577a.m92155f(r10, r11)
            float r10 = (float) r10
            androidx.appcompat.app.AppCompatActivity r12 = r19.getContext()
            float r12 = kg3.C76577a.m92161l(r12)
            float r10 = r10 * r12
            r12 = 0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            r3.setTextSize(r12, r10)
            androidx.appcompat.app.AppCompatActivity r10 = r19.getContext()
            int r10 = kg3.C76577a.m92155f(r10, r11)
            float r10 = (float) r10
            androidx.appcompat.app.AppCompatActivity r14 = r19.getContext()
            float r14 = kg3.C76577a.m92161l(r14)
            float r10 = r10 * r14
            r5.setTextSize(r12, r10)
            androidx.appcompat.app.AppCompatActivity r10 = r19.getContext()
            int r10 = kg3.C76577a.m92155f(r10, r11)
            float r10 = (float) r10
            androidx.appcompat.app.AppCompatActivity r14 = r19.getContext()
            float r14 = kg3.C76577a.m92161l(r14)
            float r10 = r10 * r14
            r6.setTextSize(r12, r10)
            androidx.appcompat.app.AppCompatActivity r10 = r19.getContext()
            int r10 = kg3.C76577a.m92155f(r10, r11)
            float r10 = (float) r10
            androidx.appcompat.app.AppCompatActivity r14 = r19.getContext()
            float r14 = kg3.C76577a.m92161l(r14)
            float r10 = r10 * r14
            r7.setTextSize(r12, r10)
            androidx.appcompat.app.AppCompatActivity r10 = r19.getContext()
            int r10 = kg3.C76577a.m92155f(r10, r11)
            float r10 = (float) r10
            androidx.appcompat.app.AppCompatActivity r14 = r19.getContext()
            float r14 = kg3.C76577a.m92161l(r14)
            float r10 = r10 * r14
            r8.setTextSize(r12, r10)
            androidx.appcompat.app.AppCompatActivity r10 = r19.getContext()
            int r10 = kg3.C76577a.m92155f(r10, r11)
            float r10 = (float) r10
            androidx.appcompat.app.AppCompatActivity r11 = r19.getContext()
            float r11 = kg3.C76577a.m92161l(r11)
            float r10 = r10 * r11
            r9.setTextSize(r12, r10)
            f40.o r10 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r10 = r10.mo121142i()
            r11 = 274436(0x43004, float:3.84567E-40)
            java.lang.String r14 = ""
            java.lang.Object r10 = r10.mo119684e(r11, r14)
            java.lang.String r10 = r10.toString()
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r11 == 0) goto L_0x00f7
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getCurrentCountryCode()
        L_0x00f7:
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r11 != 0) goto L_0x0104
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isAllAlpha(r10)
            if (r11 != 0) goto L_0x0104
            r10 = r14
        L_0x0104:
            java.lang.String r11 = "cn"
            boolean r11 = r10.equalsIgnoreCase(r11)
            r4 = 2
            r15 = 1
            if (r11 == 0) goto L_0x0187
            r6.setVisibility(r12)
            java.lang.Class<h81.h> r11 = h81.C32735h.class
            di3.d r11 = di3.C86312j.m106911c(r11)
            h81.h r11 = (h81.C32735h) r11
            h81.h$c r12 = h81.C32735h.C32737c.clicfg_about_mm_kf_phone_num_config
            int r11 = r11.mo58779Qe(r12, r15)
            if (r11 == r15) goto L_0x013e
            if (r11 == r4) goto L_0x0136
            r12 = 3
            if (r11 == r12) goto L_0x012e
            r11 = 0
            r1.f248979t = r11
            r1.f248980u = r11
            r1.f248981v = r11
            goto L_0x0145
        L_0x012e:
            r11 = 0
            r1.f248979t = r15
            r1.f248980u = r15
            r1.f248981v = r15
            goto L_0x0145
        L_0x0136:
            r11 = 0
            r1.f248979t = r15
            r1.f248980u = r15
            r1.f248981v = r11
            goto L_0x0145
        L_0x013e:
            r11 = 0
            r1.f248979t = r15
            r1.f248980u = r11
            r1.f248981v = r11
        L_0x0145:
            boolean r12 = r1.f248979t
            if (r12 != 0) goto L_0x014a
            goto L_0x0187
        L_0x014a:
            r7.setVisibility(r11)
            r11 = 2131831352(0x7f112a38, float:1.9295727E38)
            r7.setText(r11)
            boolean r12 = r1.f248980u
            if (r12 != 0) goto L_0x015b
            boolean r12 = r1.f248981v
            if (r12 == 0) goto L_0x0187
        L_0x015b:
            android.text.SpannableString r12 = new android.text.SpannableString
            java.lang.CharSequence r4 = r7.getText()
            r12.<init>(r4)
            com.tencent.mm.plugin.setting.ui.setting.z0 r4 = new com.tencent.mm.plugin.setting.ui.setting.z0
            r18 = r2
            r2 = 0
            r4.<init>(r1, r15, r2)
            java.lang.String r2 = r1.getString(r11)
            int r2 = r2.length()
            r11 = 17
            r15 = 0
            r12.setSpan(r4, r15, r2, r11)
            r7.setText(r12)
            di3.d r2 = di3.C86312j.m106911c(r0)
            ny.h r2 = (p629ny.C76979h) r2
            r2.mo107056S3(r7, r12)
            goto L_0x0189
        L_0x0187:
            r18 = r2
        L_0x0189:
            r2 = 2131831949(0x7f112c8d, float:1.9296938E38)
            r4 = 5
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()
            r11 = 0
            r4[r11] = r7
            r7 = 1
            r4[r7] = r10
            java.lang.String r12 = "setting"
            r15 = 2
            r4[r15] = r12
            r12 = 3
            r4[r12] = r13
            r12 = 4
            r4[r12] = r13
            java.lang.String r2 = r1.getString(r2, r4)
            r4 = 2131831947(0x7f112c8b, float:1.9296934E38)
            java.lang.Object[] r12 = new java.lang.Object[r15]
            java.lang.String r13 = "aboutpage"
            r12[r11] = r13
            r12[r7] = r10
            java.lang.String r4 = r1.getString(r4, r12)
            r12 = 2131838237(0x7f11451d, float:1.9309692E38)
            java.lang.Object[] r13 = new java.lang.Object[r15]
            java.lang.String r16 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()
            r13[r11] = r16
            r13[r7] = r10
            java.lang.String r12 = r1.getString(r12, r13)
            java.lang.Object[] r13 = new java.lang.Object[r15]
            java.lang.String r17 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()
            r13[r11] = r17
            r13[r7] = r10
            r7 = 2131831940(0x7f112c84, float:1.929692E38)
            java.lang.String r7 = r1.getString(r7, r13)
            java.lang.Object[] r13 = new java.lang.Object[r15]
            r13[r11] = r12
            r12 = 2131831943(0x7f112c87, float:1.9296926E38)
            java.lang.String r12 = r1.getString(r12)
            r11 = 1
            r13[r11] = r12
            java.lang.String r12 = "<a href='%s'>%s</a>"
            java.lang.String r13 = java.lang.String.format(r12, r13)
            r3.setText(r13)
            java.lang.Object[] r13 = new java.lang.Object[r15]
            r16 = 0
            r13[r16] = r2
            r2 = 2131834130(0x7f113512, float:1.9301362E38)
            java.lang.String r2 = r1.getString(r2)
            r13[r11] = r2
            java.lang.String r2 = java.lang.String.format(r12, r13)
            r5.setText(r2)
            java.lang.Object[] r2 = new java.lang.Object[r15]
            r2[r16] = r4
            r4 = 2131834131(0x7f113513, float:1.9301364E38)
            java.lang.String r4 = r1.getString(r4)
            r2[r11] = r4
            java.lang.String r2 = java.lang.String.format(r12, r2)
            r6.setText(r2)
            java.lang.Object[] r2 = new java.lang.Object[r15]
            r2[r16] = r7
            r4 = 2131831939(0x7f112c83, float:1.9296918E38)
            java.lang.String r4 = r1.getString(r4)
            r2[r11] = r4
            java.lang.String r2 = java.lang.String.format(r12, r2)
            r8.setText(r2)
            di3.d r2 = di3.C86312j.m106911c(r0)
            ny.h r2 = (p629ny.C76979h) r2
            r2.mo107079pD(r3, r11)
            di3.d r2 = di3.C86312j.m106911c(r0)
            ny.h r2 = (p629ny.C76979h) r2
            r2.mo107079pD(r5, r11)
            di3.d r2 = di3.C86312j.m106911c(r0)
            ny.h r2 = (p629ny.C76979h) r2
            r2.mo107079pD(r8, r11)
            di3.d r0 = di3.C86312j.m106911c(r0)
            ny.h r0 = (p629ny.C76979h) r0
            r0.mo107079pD(r6, r11)
            java.lang.String r0 = "KR"
            boolean r0 = r10.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x025f
            r2 = 0
            r8.setVisibility(r2)
        L_0x025f:
            vl3.c r0 = vl3.C102226d.f301013a
            if (r0 == 0) goto L_0x0290
            com.tencent.mm.smiley.p0 r0 = com.tencent.p014mm.smiley.C96963p0.wx0()
            r0.getClass()
            android.text.InputFilter[] r0 = r9.getFilters()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r0.length
            r4 = 0
        L_0x0275:
            if (r4 >= r3) goto L_0x0284
            r5 = r0[r4]
            boolean r6 = r5 instanceof ql3.C101206a
            if (r6 == 0) goto L_0x027e
            goto L_0x0281
        L_0x027e:
            r2.add(r5)
        L_0x0281:
            int r4 = r4 + 1
            goto L_0x0275
        L_0x0284:
            r3 = 0
            android.text.InputFilter[] r0 = new android.text.InputFilter[r3]
            java.lang.Object[] r0 = r2.toArray(r0)
            android.text.InputFilter[] r0 = (android.text.InputFilter[]) r0
            r9.setFilters(r0)
        L_0x0290:
            r2 = 2022(0x7e6, float:2.833E-42)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.TIME     // Catch:{ Exception -> 0x02c2 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x02c2 }
            if (r0 != 0) goto L_0x02c0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.TIME     // Catch:{ Exception -> 0x02c2 }
            java.lang.String r3 = "null"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x02c2 }
            if (r0 != 0) goto L_0x02c0
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x02c2 }
            java.lang.String r3 = "yyyy-MM-dd HH:mm:ss"
            r0.<init>(r3)     // Catch:{ Exception -> 0x02c2 }
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.BuildInfo.TIME     // Catch:{ Exception -> 0x02c2 }
            java.util.Date r0 = r0.parse(r3)     // Catch:{ Exception -> 0x02c2 }
            java.util.Calendar r3 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x02c2 }
            r3.setTime(r0)     // Catch:{ Exception -> 0x02c2 }
            r4 = 1
            int r0 = r3.get(r4)     // Catch:{ Exception -> 0x02c2 }
            r2 = r0
        L_0x02c0:
            r3 = 0
            goto L_0x02cb
        L_0x02c2:
            r0 = move-exception
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = "MicroMsg.SettingsAboutMicroMsgUI"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r14, r4)
        L_0x02cb:
            android.content.res.Resources r0 = r18.getResources()
            r4 = 2131821444(0x7f110384, float:1.9275631E38)
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5[r3] = r2
            java.lang.String r0 = r0.getString(r4, r5)
            r9.setText(r0)
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsAboutMicroMsgUI.getBottomView():android.view.View");
    }

    public int getResourceId() {
        return C0966R.xml.f8951c8;
    }

    public void initView() {
        setMMTitle("");
        setActionbarColor(getContext().getResources().getColor(C0966R.color.f2929c));
        setNavigationbarColor(getContext().getResources().getColor(C0966R.color.f2929c));
        setBackGroundColorResource(C0966R.color.al6);
        setBackBtn(new C85420a());
        if (getListView() != null) {
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3743cv);
            getListView().setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
            getListView().setBackgroundColor(getContext().getResources().getColor(C0966R.color.f2929c));
        }
        if (((C88689b) C86312j.m106911c(C88689b.class)).mo122746bQ()) {
            this.f248968f = true;
        }
    }

    public void onCreate(Bundle bundle) {
        Class cls = C88689b.class;
        super.onCreate(bundle);
        hideActionbarLine();
        initView();
        C86709a0.m107524d().mo123455a(3899, this);
        ((C88689b) C86312j.m106911c(cls)).Hk0(this.f248978s);
        String x9 = ((C88689b) C86312j.m106911c(cls)).mo122767x9(true);
        this.f248967e = x9;
        if (!Util.isNullOrNil(x9)) {
            C115669n.INSTANCE.idkeyStat(1429, 32, 1, false);
        }
        ((C88689b) C86312j.m106911c(cls)).mo122761qt(false, true, true);
        if (getIntent().getBooleanExtra("mmdiff_udpate_maunal_cgi", false)) {
            Log.m105924i("MicroMsg.SettingsAboutMicroMsgUI", "start. manualCheckUpdate");
            if (((C88689b) C86312j.m106911c(cls)).mo122748eJ()) {
                ((C88689b) C86312j.m106911c(cls)).mo122753gD(0, this);
            }
        }
        mo118775J7(true);
        this.f248972j = System.currentTimeMillis();
        Log.m105924i("MicroMsg.SettingsAboutMicroMsgUI", "");
        if (((C88689b) C86312j.m106911c(cls)).mo122748eJ()) {
            String El0 = ((C88689b) C86312j.m106911c(cls)).El0();
            String ef02 = ((C88689b) C86312j.m106911c(cls)).ef0();
            Log.m105925i("MicroMsg.SettingsAboutMicroMsgUI", "NetSceneManualCheckWxUpdate，basePatchId = %s, tinkerPatchId = %s.", El0, ef02);
            LinkedList<C90430p93> en = ((C88689b) C86312j.m106911c(cls)).mo122751en();
            Iterator<C90430p93> it = en.iterator();
            while (it.hasNext()) {
                C90430p93 next = it.next();
                Log.m105925i("MicroMsg.SettingsAboutMicroMsgUI", "NetSceneManualCheckWxUpdate，item.key = %s, item.value = %s, item.op = %s, item.values = %s.", next.f259737d, next.f259738e, next.f259739f, next.f259740g);
            }
            C86709a0.m107524d().mo123460f((C117747y) ((C88862d) C86312j.m106911c(C88862d.class)).o10(El0, ef02, en, 4));
        }
    }

    public void onDestroy() {
        Class cls = C88689b.class;
        ((C88689b) C86312j.m106911c(cls)).mo122749eN(this.f248978s);
        C86709a0.m107524d().mo123470p(3899, this);
        if (this.f248970h) {
            Log.m105924i("MicroMsg.SettingsAboutMicroMsgUI", "clear red dot for maunal when it has clicked.");
            ((C88689b) C86312j.m106911c(cls)).mo122745Zt(true);
        }
        ((PrivacyUpdatePreference) this.f248966d.mo72519a("privacy_update")).getClass();
        if (PrivacyUpdatePreference.f205996P) {
            PrivacyUpdatePreference.f205996P = false;
        }
        super.onDestroy();
    }

    public void onPageEnterAnimEnd() {
        super.onPageEnterAnimEnd();
        if (this.f248973n) {
            mo118775J7(false);
        } else {
            this.f248973n = true;
        }
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        boolean z;
        String str;
        Class cls = C30914c.class;
        Class cls2 = C76813e.class;
        Class cls3 = C14088e.class;
        Class cls4 = C91298n.class;
        Class cls5 = C88689b.class;
        String str2 = preference.f121285r;
        Log.m105924i("MicroMsg.SettingsAboutMicroMsgUI", str2 + " item has been clicked!");
        if (str2.equals("settings_update")) {
            if (LocaleUtil.isSimplifiedChineseAppLang()) {
                C116945b.yx0().mo175762a(39);
                String string = getString(C0966R.string.f361332j01, new Object[]{Integer.valueOf(C86709a0.m107523b().mo121110g()), Integer.valueOf(Util.nullAsNil((Integer) C86709a0.m107535s().mo121142i().mo119684e(12304, (Object) null)))});
                if (string != null) {
                    C86709a0.m107535s().mo121142i().mo119676J(12304, 0);
                    if (((C14088e) C86312j.m106911c(cls3)).mo13530uu("wxalite2ceddca8b296458a527661862c5664b2")) {
                        if (((C14088e) C86312j.m106911c(cls3)).mo13509NR("wxalite2ceddca8b296458a527661862c5664b2") == null) {
                            if (((C14088e) C86312j.m106911c(cls3)).mo13512Tg() == null) {
                                ((C14088e) C86312j.m106911c(cls3)).Mk0();
                            }
                            ((C14088e) C86312j.m106911c(cls3)).u50("wxalite2ceddca8b296458a527661862c5664b2", (C115477b) null);
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putString("appId", "wxalite2ceddca8b296458a527661862c5664b2");
                            Log.m105924i("MicroMsg.SettingsAboutMicroMsgUI", "open liteapp:wxalite2ceddca8b296458a527661862c5664b2,page:");
                            ((C14088e) C86312j.m106911c(cls3)).mo13510OP(getContext(), bundle, true, false, new C85434c1(this));
                        }
                    }
                    Intent intent = new Intent();
                    intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, getString(C0966R.string.f361331j00));
                    intent.putExtra("rawUrl", string);
                    intent.putExtra("showShare", false);
                    C88144b.m109791i(getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                }
                return true;
            }
            if (((C14088e) C86312j.m106911c(cls3)).mo13530uu("wxalite2ceddca8b296458a527661862c5664b2")) {
                if (((C14088e) C86312j.m106911c(cls3)).mo13509NR("wxalite2ceddca8b296458a527661862c5664b2") == null) {
                    if (((C14088e) C86312j.m106911c(cls3)).mo13512Tg() == null) {
                        ((C14088e) C86312j.m106911c(cls3)).Mk0();
                    }
                    ((C14088e) C86312j.m106911c(cls3)).u50("wxalite2ceddca8b296458a527661862c5664b2", (C115477b) null);
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("appId", "wxalite2ceddca8b296458a527661862c5664b2");
                    Log.m105924i("MicroMsg.SettingsAboutMicroMsgUI", "open liteapp:wxalite2ceddca8b296458a527661862c5664b2,page:");
                    ((C14088e) C86312j.m106911c(cls3)).mo13510OP(getContext(), bundle2, true, false, new C85443h1(this));
                    return true;
                }
            }
            String string2 = getString(C0966R.string.isl, new Object[]{LocaleUtil.getApplicationLanguage(), Integer.valueOf(C89625d.f257841g)});
            Intent intent2 = new Intent();
            intent2.putExtra("rawUrl", string2);
            intent2.putExtra("showShare", false);
            intent2.putExtra("show_bottom", false);
            C88144b.m109791i(getContext(), "webview", ".ui.tools.WebViewUI", intent2, (Bundle) null);
            return true;
        } else if (str2.equals("funtion_update")) {
            C115669n nVar = C115669n.INSTANCE;
            nVar.idkeyStat(405, 16, 1, true);
            Log.m105925i("MicroMsg.SettingsAboutMicroMsgUI", "funtion_update, click, webViewUrl = %s", this.f248967e);
            if (Util.isNullOrNil(this.f248967e)) {
                Intent intent3 = new Intent();
                intent3.putExtra("showShare", true);
                intent3.putExtra("show_bottom", false);
                if (((C88689b) C86312j.m106911c(cls5)).Lv0()) {
                    str = getString(C0966R.string.ism, new Object[]{LocaleUtil.getApplicationLanguage(), Integer.valueOf(((C88689b) C86312j.m106911c(cls5)).Qo0()), 1});
                    intent3.putExtra("showShare", false);
                } else {
                    str = "";
                }
                intent3.putExtra("rawUrl", str);
                C88144b.m109791i(getContext(), "webview", ".ui.tools.WebViewUI", intent3, (Bundle) null);
                ((C88689b) C86312j.m106911c(cls5)).Z80();
                return true;
            }
            String str3 = this.f248967e;
            nVar.idkeyStat(1429, 31, 1, false);
            Intent intent4 = new Intent();
            intent4.putExtra("rawUrl", str3);
            C88144b.m109791i(MMApplicationContext.getContext(), "webview", ".ui.tools.WebViewUI", intent4, (Bundle) null);
            return true;
        } else {
            if (str2.equals("funtion_check_update")) {
                if (!this.f248969g) {
                    Log.m105924i("MicroMsg.SettingsAboutMicroMsgUI", "onClick cgi no hasFinishCgi callback");
                }
                C115669n.INSTANCE.idkeyStat(405, 17, 1, true);
                ((C15865p) C86312j.m106911c(C15865p.class)).mo14313Dn(2);
                C90585h hVar = this.f248971i;
                if (hVar != null && !Util.isNullOrNil(hVar.mo118347e())) {
                    boolean ya = ((C88689b) C86312j.m106911c(cls5)).mo122770ya(getContext(), this.f248971i.mo118347e());
                    Log.m105925i("MicroMsg.SettingsAboutMicroMsgUI", "funtion_check_update, checkAndShowInstallPatchDialogm success = %s, response.newApkMd5 = %s, ", Boolean.valueOf(ya), this.f248971i.mo118347e());
                    if (ya) {
                        return true;
                    }
                }
                if (((C76813e) C86312j.m106911c(cls2)).mo10946NP(getContext())) {
                    ((C76813e) C86312j.m106911c(cls2)).t00(getContext());
                    return true;
                }
                boolean LP = ((C88689b) C86312j.m106911c(cls5)).mo122737LP();
                Log.m105925i("MicroMsg.SettingsAboutMicroMsgUI", "funtion_check_update, isHashApkToInstall = %s.", Boolean.valueOf(LP));
                this.f248970h = true;
                if (LP) {
                    if (this.f248968f) {
                        ((C91298n) C86312j.m106911c(cls4)).mo125105XF(107, 4);
                    }
                    ((C91298n) C86312j.m106911c(cls4)).mo125105XF(105, 4);
                    ((C88689b) C86312j.m106911c(cls5)).mo122759nd();
                    return true;
                } else if (((C88689b) C86312j.m106911c(cls5)).mo122748eJ()) {
                    Log.m105925i("MicroMsg.SettingsAboutMicroMsgUI", "response = %s.", this.f248971i);
                    if (this.f248971i != null) {
                        ((C91298n) C86312j.m106911c(cls4)).mo125105XF(TPReportParams.LIVE_STEP_PLAY, this.f248971i.mo118353j());
                    }
                    if (this.f248971i == null) {
                        ((C88689b) C86312j.m106911c(cls5)).mo122753gD(0, this);
                    } else {
                        ((C88689b) C86312j.m106911c(cls5)).mo122742Xu(this.f248971i, 0, true);
                    }
                    if (this.f248968f) {
                        ((C91298n) C86312j.m106911c(cls4)).mo125105XF(108, 4);
                    }
                    ((C91298n) C86312j.m106911c(cls4)).mo125105XF(106, 4);
                    return true;
                }
            } else if (str2.equals("funtion_about_wechat")) {
                Intent intent5 = new Intent();
                intent5.putExtra("from_about", true);
                C88144b.m109791i(this, "whatsnew", ".ui.WhatsNewUI", intent5, (Bundle) null);
                return true;
            } else if (str2.equals("settings_report")) {
                Intent intent6 = new Intent();
                intent6.putExtra("showShare", false);
                intent6.putExtra("show_feedback", false);
                intent6.putExtra("rawUrl", HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmi) + "/security/readtemplate?t=complaints/index");
                C88144b.m109791i(getContext(), "webview", ".ui.tools.WebViewUI", intent6, (Bundle) null);
                return true;
            } else if (str2.equals("settings_quit_wechat")) {
                C76879j.m92739j(getContext(), C0966R.string.gmh, C0966R.string.gmg, C0966R.string.a4h, C0966R.string.f360090a14, new C85435d1(this), (DialogInterface.OnClickListener) null);
                return true;
            } else if (str2.equals("funtion_crowdtest_update")) {
                ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33499h(262157, 266263);
                Intent intent7 = new Intent();
                intent7.putExtra("rawUrl", (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CROWDTEST_APPLY_LINK_STRING, (Object) null));
                intent7.putExtra("showShare", false);
                intent7.putExtra("show_bottom", false);
                C88144b.m109791i(getContext(), "webview", ".ui.tools.WebViewUI", intent7, (Bundle) null);
                return true;
            } else if (str2.equals("funtion_about_flavor_blue")) {
                ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33499h(262164, 266270);
                ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33507p(262164, false);
                AppCompatActivity context = getContext();
                Intent intent8 = new Intent(this, SettingsAboutMicroMsgFlavorBlue.class);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent8);
                AppCompatActivity appCompatActivity = context;
                C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutMicroMsgUI", "showFlavorBlueActivity", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutMicroMsgUI", "showFlavorBlueActivity", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (str2.equals("funtion_invite_flavor_blue")) {
                Intent intent9 = new Intent();
                intent9.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, getString(C0966R.string.f4k));
                intent9.putExtra("rawUrl", "https://mp.weixin.qq.com/wxawap/devwxsubscribe#wechat_redirect");
                intent9.putExtra("showShare", false);
                intent9.putExtra("show_bottom", false);
                C88144b.m109791i(getContext(), "webview", ".ui.tools.WebViewUI", intent9, (Bundle) null);
            } else if (str2.equals("privacy_update")) {
                PrivacyUpdatePreference privacyUpdatePreference = (PrivacyUpdatePreference) gVar.mo72519a("privacy_update");
                privacyUpdatePreference.getClass();
                PrivacyUpdatePreference.f205996P = true;
                ImageView imageView = (ImageView) ((C36570n) privacyUpdatePreference.f206001N).getValue();
                if (imageView != null) {
                    imageView.setVisibility(PrivacyUpdatePreference.f205996P ? 8 : 0);
                }
                tg4 tg4 = privacyUpdatePreference.f205999L;
                if (tg4 != null) {
                    Intent intent10 = new Intent();
                    intent10.putExtra("rawUrl", tg4.f354448t);
                    z = false;
                    intent10.putExtra("showShare", false);
                    C88144b.m109791i(privacyUpdatePreference.f121274d, "webview", ".ui.tools.WebViewUI", intent10, (Bundle) null);
                } else {
                    z = false;
                }
                C116945b.yx0().mo175762a(42);
                return z;
            }
            return false;
        }
    }

    public void onResume() {
        super.onResume();
        if (!this.f248974o) {
            this.f248974o = true;
        } else {
            mo118775J7(false);
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        boolean z;
        int i3;
        Class cls = C88689b.class;
        if (yVar instanceof C88861c) {
            Log.m105924i("MicroMsg.SettingsAboutMicroMsgUI", "onscenend, cgi cost time = " + (System.currentTimeMillis() - this.f248972j));
            C90585h F0 = ((C88861c) yVar).mo123254F0();
            C90585h UL = ((C91296j) C86312j.m106911c(C91296j.class)).mo125097UL();
            if (UL == null || !((C88689b) C86312j.m106911c(cls)).C10(UL)) {
                Log.m105924i("MicroMsg.SettingsAboutMicroMsgUI", "no use hardcode respone");
            } else {
                Log.m105924i("MicroMsg.SettingsAboutMicroMsgUI", "hardcode respone");
                F0 = UL;
            }
            if (F0 != null) {
                F0.mo118351h(false);
            }
            C90585h XJ = ((C88862d) C86312j.m106911c(C88862d.class)).mo123108XJ(F0, false);
            if (XJ == null || !((C88689b) C86312j.m106911c(cls)).C10(XJ)) {
                Log.m105924i("MicroMsg.SettingsAboutMicroMsgUI", "no use x key patch respone");
            } else {
                C115669n.INSTANCE.idkeyStat(1429, 39, 1, false);
                Log.m105924i("MicroMsg.SettingsAboutMicroMsgUI", "use x key patch respone");
                ((C91298n) C86312j.m106911c(C91298n.class)).mo125105XF(262, 4);
                F0 = XJ;
            }
            if (F0 == null || !F0.mo118342a() || !F0.mo118345d() || F0.mo118343b() || F0.mo118348f()) {
                Log.m105924i("MicroMsg.SettingsAboutMicroMsgUI", "not handle response");
                z = false;
            } else {
                z = true;
            }
            Log.m105924i("MicroMsg.SettingsAboutMicroMsgUI", "onscenend, respense ok = " + (System.currentTimeMillis() - this.f248972j));
            Log.m105925i("MicroMsg.SettingsAboutMicroMsgUI", "onSceneEnd, hasUpdatePatch = %s, response = %s.", Boolean.valueOf(z), F0);
            this.f248969g = true;
            boolean NP = ((C76813e) C86312j.m106911c(C76813e.class)).mo10946NP(this);
            if (z) {
                this.f248971i = F0;
                Log.m105925i("MicroMsg.SettingsAboutMicroMsgUI", "TinkerSyncResponse packageType:%d", Integer.valueOf(F0.mo118353j()));
                if (F0.mo118353j() == 2 || F0.mo118353j() == 3 || F0.mo118353j() == 4) {
                    try {
                        i3 = Integer.decode(F0.getClientVersion()).intValue();
                    } catch (Exception unused) {
                        i3 = 0;
                    }
                    int k702 = ((C88689b) C86312j.m106911c(cls)).k70();
                    Log.m105925i("MicroMsg.SettingsAboutMicroMsgUI", "save update client version %s %d, XkeyBaseMinApkVersion = %s", F0.getClientVersion(), Integer.valueOf(i3), Integer.valueOf(k702));
                    if (i3 <= 0 || i3 < k702) {
                        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("UpdaterConfigSharedPreferences", 0);
                        C87412m.m108593f(sharedPreferences, "getContext().getSharedPr…me, Context.MODE_PRIVATE)");
                        sharedPreferences.edit().putInt("RedCheckManualUpdaterTab", 0).apply();
                        this.f248968f = false;
                    } else {
                        SharedPreferences sharedPreferences2 = MMApplicationContext.getContext().getSharedPreferences("UpdaterConfigSharedPreferences", 0);
                        C87412m.m108593f(sharedPreferences2, "getContext().getSharedPr…me, Context.MODE_PRIVATE)");
                        sharedPreferences2.edit().putInt("KeyTinkerPatchVersion", i3).putInt("RedCheckManualUpdaterTab", 1).apply();
                        this.f248968f = true;
                    }
                }
            } else if (NP) {
                this.f248968f = ((C88689b) C86312j.m106911c(cls)).mo122746bQ();
                SharedPreferences sharedPreferences3 = MMApplicationContext.getContext().getSharedPreferences("UpdaterConfigSharedPreferences", 0);
                C87412m.m108593f(sharedPreferences3, "getContext().getSharedPr…me, Context.MODE_PRIVATE)");
                sharedPreferences3.edit().putInt("RedCheckManualUpdaterTab", 1).apply();
            } else {
                this.f248968f = false;
                ((C88689b) C86312j.m106911c(cls)).mo122745Zt(true);
            }
            ((C119157j) C119157j.f356862d).mo183895z(new C85421b());
        }
    }

    public Boolean showBottomMask() {
        return Boolean.TRUE;
    }
}
