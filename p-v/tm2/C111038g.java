package tm2;

import android.content.Intent;
import co3.C113370c;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.autogen.mmdata.rpt.VASPerformanceStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import java.util.Set;
import p606mm.C99933h;
import sx3.C110818d0;
import sx3.C110826x0;
import sx3.C22415w0;
import te3.lp4;
import tf3.C37073p;
import xn3.C112162a;
import z04.C112551y;

/* renamed from: tm2.g */
public final class C111038g implements C112162a {

    /* renamed from: b */
    public static final C111038g f332519b = new C111038g();

    /* renamed from: c */
    public static Boolean f332520c;

    /* renamed from: d */
    public static final C113370c f332521d = new C111039a();

    /* renamed from: e */
    public static final Set<String> f332522e = C110826x0.m151017e("com.tencent.mm.plugin.setting.ui.setting.SettingsUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsAccountInfoUI", "com.tencent.mm.plugin.voiceprint.ui.SettingsVoicePrintUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsMoreSafeUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsSpecialSceneNotificationUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsActiveTimeUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsChattingUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsChattingBackgroundUI", "com.tencent.mm.plugin.backup.backupui.BackupChooseBackupModeUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsPrivacyUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsAddMeUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsSnsPrivacyUI", "com.tencent.mm.plugin.topstory.ui.home.TopStorySettingUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsPermissionIndexUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI", "com.tencent.mm.plugin.setting.ui.setting.SettingDarkMode", "com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsAboutCamera", "com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsPluginsUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsNetStatUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI");

    /* renamed from: f */
    public static final Set<String> f332523f = C110826x0.m151015c("com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsModifyNameUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalMoreUI", "com.tencent.mm.plugin.subapp.ui.pluginapp.AddMoreFriendsUI", "com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsAccountInfoUI", "com.tencent.mm.plugin.voiceprint.ui.SettingsVoicePrintUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsMoreSafeUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsSpecialSceneNotificationUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsActiveTimeUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsChattingUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsChattingBackgroundUI", "com.tencent.mm.plugin.backup.backupui.BackupChooseBackupModeUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsPrivacyUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsAddMeUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsSnsPrivacyUI", "com.tencent.mm.plugin.topstory.ui.home.TopStorySettingUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsPermissionIndexUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI", "com.tencent.mm.plugin.setting.ui.setting.SettingDarkMode", "com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsAboutCamera", "com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsPluginsUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsNetStatUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI", "com.tencent.mm.plugin.appbrand.ui.privacy.manage.LuggagePrivacyManageUI");

    /* renamed from: g */
    public static final Set<String> f332524g = C22415w0.m26092a("com.tencent.mm.plugin.profile.ui.ContactInfoUI");

    /* renamed from: tm2.g$a */
    public static final class C111039a implements C113370c {
        /* JADX WARNING: Removed duplicated region for block: B:15:0x003d A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x003e  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00c3  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo146069a(android.content.Intent r9, android.content.Context r10, boolean r11) {
            /*
                r8 = this;
                java.lang.String r0 = "context"
                gy3.C87412m.m108594g(r10, r0)
                if (r9 != 0) goto L_0x0008
                return
            L_0x0008:
                java.lang.Class r0 = r10.getClass()
                java.lang.String r0 = r0.getName()
                android.content.ComponentName r1 = r9.getComponent()
                java.lang.String r2 = ""
                if (r1 == 0) goto L_0x001e
                java.lang.String r1 = r1.getClassName()
                if (r1 != 0) goto L_0x001f
            L_0x001e:
                r1 = r2
            L_0x001f:
                tm2.g r3 = tm2.C111038g.f332519b
                r3.getClass()
                java.util.Set<java.lang.String> r4 = tm2.C111038g.f332522e
                boolean r0 = sx3.C110818d0.m150903D(r4, r0)
                r5 = 0
                r6 = 1
                if (r0 != 0) goto L_0x003a
                r3.getClass()
                boolean r0 = sx3.C110818d0.m150903D(r4, r1)
                if (r0 == 0) goto L_0x0038
                goto L_0x003a
            L_0x0038:
                r0 = 0
                goto L_0x003b
            L_0x003a:
                r0 = 1
            L_0x003b:
                if (r0 != 0) goto L_0x003e
                return
            L_0x003e:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "stepStartActivity() called with: intent = "
                r0.append(r1)
                r0.append(r9)
                java.lang.String r1 = ", context = "
                r0.append(r1)
                r0.append(r10)
                java.lang.String r1 = ", isStartVAS = "
                r0.append(r1)
                r0.append(r11)
                java.lang.String r11 = r0.toString()
                java.lang.String r0 = "MicroMsg.VAS.WxVAS"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r11)
                long r0 = java.lang.System.currentTimeMillis()
                java.lang.String r11 = java.lang.String.valueOf(r0)
                java.lang.String r7 = "MicroMsg.VAS.reportId"
                r9.putExtra(r7, r11)
                te3.lp4 r7 = new te3.lp4
                r7.<init>()
                r7.f332177n = r0
                java.lang.Class r0 = r10.getClass()
                java.lang.String r0 = r0.getName()
                r7.f332170d = r0
                android.content.ComponentName r9 = r9.getComponent()
                if (r9 == 0) goto L_0x0091
                java.lang.String r9 = r9.getClassName()
                if (r9 != 0) goto L_0x0090
                goto L_0x0091
            L_0x0090:
                r2 = r9
            L_0x0091:
                r7.f332171e = r2
                java.lang.String r9 = r7.f332170d
                r3.getClass()
                boolean r9 = sx3.C110818d0.m150903D(r4, r9)
                if (r9 == 0) goto L_0x00b5
                boolean r9 = r10 instanceof com.tencent.p014mm.p136ui.vas.VASActivity
                if (r9 == 0) goto L_0x00a5
                com.tencent.mm.ui.vas.VASActivity r10 = (com.tencent.p014mm.p136ui.vas.VASActivity) r10
                goto L_0x00a6
            L_0x00a5:
                r10 = 0
            L_0x00a6:
                if (r10 == 0) goto L_0x00b0
                boolean r9 = r10.isVASValid()
                if (r9 != r6) goto L_0x00b0
                r9 = 1
                goto L_0x00b1
            L_0x00b0:
                r9 = 0
            L_0x00b1:
                if (r9 == 0) goto L_0x00b5
                r9 = 1
                goto L_0x00b6
            L_0x00b5:
                r9 = 0
            L_0x00b6:
                r7.f332172f = r9
                java.lang.String r9 = r7.f332171e
                r3.getClass()
                boolean r9 = sx3.C110818d0.m150903D(r4, r9)
                if (r9 == 0) goto L_0x00d3
                com.tencent.mm.ui.vas.VASActivity$a r9 = com.tencent.p014mm.p136ui.vas.VASActivity.Companion
                r9.getClass()
                xn3.a r9 = com.tencent.p014mm.p136ui.vas.VASActivity.vasController
                boolean r9 = r9.mo162725d()
                if (r9 == 0) goto L_0x00d3
                r5 = 1
            L_0x00d3:
                r7.f332173g = r5
                r8.mo162727f(r7, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: tm2.C111038g.C111039a.mo146069a(android.content.Intent, android.content.Context, boolean):void");
        }

        /* renamed from: b */
        public void mo146070b(Intent intent) {
            String str;
            if (intent == null || (str = intent.getStringExtra("MicroMsg.VAS.reportId")) == null) {
                str = "";
            }
            if (!C112551y.m153811k(str)) {
                Log.m105918d("MicroMsg.VAS.WxVAS", "stepOnAnimEnd() called with: intent = " + intent);
                lp4 e = mo162726e(str);
                if (e != null) {
                    long currentTimeMillis = System.currentTimeMillis() - e.f332177n;
                    if (currentTimeMillis > 0) {
                        e.f332176j = currentTimeMillis;
                    }
                    VASPerformanceStruct vASPerformanceStruct = new VASPerformanceStruct();
                    vASPerformanceStruct.f310332d = vASPerformanceStruct.mo86045b("SrcPageName", e.f332170d, true);
                    vASPerformanceStruct.f310333e = vASPerformanceStruct.mo86045b("DestPageName", e.f332171e, true);
                    vASPerformanceStruct.f310334f = e.f332172f;
                    vASPerformanceStruct.f310335g = e.f332173g;
                    vASPerformanceStruct.f310336h = e.f332174h;
                    vASPerformanceStruct.f310337i = e.f332175i;
                    vASPerformanceStruct.f310338j = e.f332176j;
                    vASPerformanceStruct.mo86054n();
                    C111038g.f332519b.getClass();
                    if (Log.getLogLevel() <= 1) {
                        String q = vASPerformanceStruct.mo1006q();
                        C87412m.m108593f(q, "struct.toShowString()");
                        Log.m105925i("MicroMsg.VAS.WxVAS", "report%s %s", Integer.valueOf(vASPerformanceStruct.mo1004j()), C112551y.m153814n(q, APLogFileUtil.SEPARATOR_LINE, " ", false));
                    }
                    try {
                        ((C99933h) C86312j.m106911c(C99933h.class)).mo84405cn(15, "vasReport" + str);
                    } catch (Throwable unused) {
                    }
                    if (intent != null) {
                        intent.removeExtra("MicroMsg.VAS.reportId");
                    }
                }
            }
        }

        /* renamed from: c */
        public void mo146071c(Intent intent, long j) {
            String str;
            if (intent == null || (str = intent.getStringExtra("MicroMsg.VAS.reportId")) == null) {
                str = "";
            }
            if (!C112551y.m153811k(str)) {
                Log.m105918d("MicroMsg.VAS.WxVAS", "stepOnAnimStart() called with: intent = " + intent + ", timeStamp = " + j);
                lp4 e = mo162726e(str);
                if (e != null) {
                    long j2 = j - e.f332177n;
                    if (j2 > 0) {
                        e.f332175i = j2;
                    }
                    mo162727f(e, str);
                }
            }
        }

        /* renamed from: d */
        public void mo146072d(Intent intent) {
            String str;
            if (intent == null || (str = intent.getStringExtra("MicroMsg.VAS.reportId")) == null) {
                str = "";
            }
            if (!C112551y.m153811k(str)) {
                Log.m105918d("MicroMsg.VAS.WxVAS", "stepOnCreate() called with: intent = " + intent);
                lp4 e = mo162726e(str);
                if (e != null) {
                    long currentTimeMillis = System.currentTimeMillis() - e.f332177n;
                    if (currentTimeMillis > 0) {
                        e.f332174h = currentTimeMillis;
                    }
                    mo162727f(e, str);
                }
            }
        }

        /* renamed from: e */
        public final lp4 mo162726e(String str) {
            C87412m.m108594g(str, "id");
            try {
                return (lp4) ((C99933h) C86312j.m106911c(C99933h.class)).mo84402PX(15, "vasReport" + str);
            } catch (Throwable unused) {
                return null;
            }
        }

        /* renamed from: f */
        public final void mo162727f(lp4 lp4, String str) {
            C87412m.m108594g(lp4, "reportData");
            C87412m.m108594g(str, "id");
            try {
                ((C99933h) C86312j.m106911c(C99933h.class)).mo84407yo(15, "vasReport" + str, lp4);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo162722a(boolean z) {
        f332520c = Boolean.valueOf(z);
    }

    /* renamed from: b */
    public boolean mo162723b(String str) {
        return C110818d0.m150903D(f332524g, str);
    }

    /* renamed from: c */
    public boolean mo162724c(String str) {
        return C110818d0.m150903D(f332523f, str);
    }

    /* renamed from: d */
    public boolean mo162725d() {
        Boolean bool = f332520c;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = ((C32735h) C86312j.m106911c(C32735h.class)).mo58782dM(new C37073p()) == 1;
        f332520c = Boolean.valueOf(z);
        return z;
    }
}
