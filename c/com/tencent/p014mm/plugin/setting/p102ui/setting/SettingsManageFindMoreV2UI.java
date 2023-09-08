package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.IconPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75592q0;
import gt1.C20838b;
import gy3.C87412m;
import hn2.C20991q;
import java.util.LinkedHashMap;
import java.util.Map;
import kg3.C76577a;
import kotlin.Metadata;
import p274xx.C66446g;
import pj3.C47511g;
import zl3.C79397a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/SettingsManageFindMoreV2UI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-setting_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreV2UI */
public final class SettingsManageFindMoreV2UI extends MMPreference {

    /* renamed from: d */
    public long f53958d;

    /* renamed from: e */
    public int f53959e;

    /* renamed from: f */
    public long f53960f;

    /* renamed from: g */
    public Map<Integer, Integer> f53961g = new LinkedHashMap();

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreV2UI$b */
    public static final class C19164b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ SettingsManageFindMoreV2UI f53962d;

        public C19164b(SettingsManageFindMoreV2UI settingsManageFindMoreV2UI) {
            this.f53962d = settingsManageFindMoreV2UI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f53962d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreV2UI$a */
    public static final class C19165a implements IconPreference.C73231a {

        /* renamed from: a */
        public final /* synthetic */ IconPreference f53963a;

        public C19165a(IconPreference iconPreference) {
            this.f53963a = iconPreference;
        }

        /* renamed from: a */
        public final void mo24587a(View view) {
            TextView textView = (TextView) view.findViewById(16908304);
            if (textView != null) {
                IconPreference iconPreference = this.f53963a;
                textView.setTextSize(0, ((float) C76577a.m92155f(iconPreference.f121274d, C0966R.dimen.f3635t)) * C76577a.m92161l(iconPreference.f121274d));
                textView.setGravity(8388613);
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
            TextView textView2 = (TextView) view.findViewById(16908310);
            if (textView2 != null) {
                IconPreference iconPreference2 = this.f53963a;
                textView2.setTextSize(0, ((float) C76577a.m92155f(iconPreference2.f121274d, C0966R.dimen.f3635t)) * C76577a.m92161l(iconPreference2.f121274d));
                textView2.setMaxLines(1);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreV2UI$c */
    public static final class C19166c implements Preference.C44715b {

        /* renamed from: a */
        public final /* synthetic */ WeChatBrands.Business.Entries f53964a;

        public C19166c(WeChatBrands.Business.Entries entries) {
            this.f53964a = entries;
        }

        /* renamed from: a */
        public final boolean mo24588a(Preference preference) {
            return this.f53964a.checkAvailable(preference.f121274d);
        }
    }

    /* renamed from: H7 */
    public final int mo24578H7(boolean z, int i) {
        return z ? i | 2 : i & -3;
    }

    /* renamed from: I7 */
    public final void mo24579I7(IconPreference iconPreference) {
        iconPreference.f215085k1 = new C19165a(iconPreference);
    }

    /* renamed from: J7 */
    public final boolean mo24580J7(long j) {
        return (j & this.f53958d) != 0;
    }

    /* renamed from: K7 */
    public final boolean mo24581K7(int i, int i2) {
        return (i & i2) == i2;
    }

    /* renamed from: L7 */
    public final boolean mo24582L7(long j) {
        return (this.f53960f & j) == j;
    }

    /* renamed from: M7 */
    public final boolean mo24583M7(long j) {
        return (j & ((long) this.f53959e)) == 0;
    }

    /* renamed from: N7 */
    public final void mo24584N7(WeChatBrands.Business.Entries entries, String str) {
        if (!entries.restricted()) {
            return;
        }
        if (entries.banned()) {
            getPreferenceScreen().mo72529n(str, true);
            return;
        }
        Preference a = getPreferenceScreen().mo72519a(str);
        C87412m.m108592e(a, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.IconPreference");
        IconPreference iconPreference = (IconPreference) a;
        iconPreference.f215082h1 = true;
        iconPreference.f121276f = new C19166c(entries);
    }

    /* renamed from: O7 */
    public final void mo24585O7(IconPreference iconPreference, int i) {
        boolean z;
        boolean z2;
        StringBuilder sb;
        boolean K7;
        String str = "";
        if (i == 0) {
            try {
                iconPreference.mo7741E(str);
                sb = new StringBuilder();
                sb.append("updatePreference  IS_SHOW = ");
                sb.append(!mo24581K7(i, 1));
                sb.append(" IS_NOTIFY = ");
                K7 = mo24581K7(i, 2);
            } catch (Throwable th) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("updatePreference  IS_SHOW = ");
                sb4.append(!mo24581K7(i, 1));
                sb4.append(" IS_NOTIFY = ");
                sb4.append(!mo24581K7(i, 2));
                sb4.append(" IS_SHOW_NEARBY = ");
                sb4.append(!mo24581K7(i, 4));
                Log.m105924i("MicroMsg.SettingsFindMoreV2UI", sb4.toString());
                iconPreference.mo69925c().putInt("perf_extra_flag", i);
                throw th;
            }
        } else if (mo24581K7(i, 1)) {
            iconPreference.mo7741E(getString(C0966R.string.f8188ta));
            sb = new StringBuilder();
            sb.append("updatePreference  IS_SHOW = ");
            sb.append(!mo24581K7(i, 1));
            sb.append(" IS_NOTIFY = ");
            K7 = mo24581K7(i, 2);
        } else {
            boolean z3 = false;
            if (mo24581K7(i, 2)) {
                Map<String, Integer> map = C20991q.f59432a;
                String str2 = iconPreference.f121285r;
                C87412m.m108593f(str2, "preference.key");
                Integer num = C20991q.f59432a.get(str2);
                if (num != null) {
                    z2 = C20991q.f59433b.contains(Integer.valueOf(num.intValue()));
                } else {
                    z2 = false;
                }
                if (z2) {
                    str = getString(C0966R.string.f8189tc);
                    C87412m.m108593f(str, "getString(R.string.setti…anage_findmoreui_not_tip)");
                }
            }
            if (mo24581K7(i, 4)) {
                Map<String, Integer> map2 = C20991q.f59432a;
                String str3 = iconPreference.f121285r;
                C87412m.m108593f(str3, "preference.key");
                Integer num2 = C20991q.f59432a.get(str3);
                if (num2 != null) {
                    z = C20991q.f59434c.contains(Integer.valueOf(num2.intValue()));
                } else {
                    z = false;
                }
                if (z) {
                    if (str.length() > 0) {
                        z3 = true;
                    }
                    if (z3) {
                        str = str + 10;
                    }
                    str = str + getString(C0966R.string.f8187t_);
                }
            }
            iconPreference.mo7741E(str);
            StringBuilder sb5 = new StringBuilder();
            sb5.append("updatePreference  IS_SHOW = ");
            sb5.append(!mo24581K7(i, 1));
            sb5.append(" IS_NOTIFY = ");
            sb5.append(!mo24581K7(i, 2));
            sb5.append(" IS_SHOW_NEARBY = ");
            sb5.append(!mo24581K7(i, 4));
            Log.m105924i("MicroMsg.SettingsFindMoreV2UI", sb5.toString());
            iconPreference.mo69925c().putInt("perf_extra_flag", i);
            return;
        }
        sb.append(!K7);
        sb.append(" IS_SHOW_NEARBY = ");
        sb.append(!mo24581K7(i, 4));
        Log.m105924i("MicroMsg.SettingsFindMoreV2UI", sb.toString());
        iconPreference.mo69925c().putInt("perf_extra_flag", i);
    }

    public void finish() {
        super.finish();
    }

    public int getHeaderResourceId() {
        return C0966R.C0971layout.f7206wt;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f7207x5;
    }

    public int getResourceId() {
        return C45628s0.m50756U() ? C0966R.xml.f8960j : C0966R.xml.f8958h;
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x05c2  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x05d1  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x05ff A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x065e  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0660  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0671  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x06a2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x036a  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0440  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x04b8  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x04ba  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0506  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0516  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initView() {
        /*
            r17 = this;
            r0 = r17
            java.lang.Class<ht1.t1> r1 = ht1.C60200t1.class
            java.lang.Class<ky2.i> r2 = ky2.C10432i.class
            com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreV2UI$b r3 = new com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreV2UI$b
            r3.<init>(r0)
            r0.setBackBtn(r3)
            pj3.g r3 = r17.getPreferenceScreen()
            java.lang.String r4 = "settings_sns_switch"
            com.tencent.mm.ui.base.preference.Preference r3 = r3.mo72519a(r4)
            java.lang.String r4 = "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.IconPreference"
            gy3.C87412m.m108592e(r3, r4)
            com.tencent.mm.ui.base.preference.IconPreference r3 = (com.tencent.p014mm.p136ui.base.preference.IconPreference) r3
            r5 = 0
            r3.f121290w = r5
            r0.mo24579I7(r3)
            r6 = 32768(0x8000, double:1.61895E-319)
            boolean r6 = r0.mo24583M7(r6)
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r6)
            r8[r5] = r9
            java.lang.String r9 = "MicroMsg.SettingsFindMoreV2UI"
            java.lang.String r10 = "openSns %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r10, r8)
            if (r6 == 0) goto L_0x0050
            java.util.Map<java.lang.Integer, java.lang.Integer> r6 = r0.f53961g
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            r6.put(r8, r10)
            r6 = 0
            goto L_0x005e
        L_0x0050:
            java.util.Map<java.lang.Integer, java.lang.Integer> r6 = r0.f53961g
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            r6.put(r8, r10)
            r6 = 1
        L_0x005e:
            r10 = 2
            boolean r8 = r0.mo24582L7(r10)
            int r6 = r0.mo24578H7(r8, r6)
            r0.mo24585O7(r3, r6)
            di3.d r3 = di3.C86312j.m106911c(r1)
            ht1.t1 r3 = (ht1.C60200t1) r3
            boolean r3 = r3.mo76873sF()
            java.lang.Object[] r6 = new java.lang.Object[r7]
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            r6[r5] = r8
            java.lang.String r8 = "showFinder %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r8, r6)
            di3.d r6 = di3.C86312j.m106911c(r2)
            ky2.i r6 = (ky2.C10432i) r6
            boolean r6 = r6.mo10750e()
            r8 = 2
            if (r6 == 0) goto L_0x009e
            di3.d r6 = di3.C86312j.m106911c(r2)
            ky2.i r6 = (ky2.C10432i) r6
            int r6 = r6.mo10740Mn()
            if (r6 != r8) goto L_0x009e
            r6 = 1
            goto L_0x009f
        L_0x009e:
            r6 = 0
        L_0x009f:
            java.lang.String r10 = "settings_finder_switch"
            if (r3 == 0) goto L_0x00f6
            if (r6 == 0) goto L_0x00a7
            goto L_0x00f6
        L_0x00a7:
            pj3.g r3 = r17.getPreferenceScreen()
            com.tencent.mm.ui.base.preference.Preference r3 = r3.mo72519a(r10)
            gy3.C87412m.m108592e(r3, r4)
            com.tencent.mm.ui.base.preference.IconPreference r3 = (com.tencent.p014mm.p136ui.base.preference.IconPreference) r3
            r3.f121290w = r5
            r0.mo24579I7(r3)
            r11 = 34359738368(0x800000000, double:1.69759663277E-313)
            boolean r6 = r0.mo24580J7(r11)
            r11 = 11
            if (r6 == 0) goto L_0x00d5
            java.util.Map<java.lang.Integer, java.lang.Integer> r6 = r0.f53961g
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            r6.put(r11, r12)
            r6 = 1
            goto L_0x00e3
        L_0x00d5:
            java.util.Map<java.lang.Integer, java.lang.Integer> r6 = r0.f53961g
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            r6.put(r11, r12)
            r6 = 0
        L_0x00e3:
            r11 = 8
            boolean r11 = r0.mo24582L7(r11)
            int r6 = r0.mo24578H7(r11, r6)
            r0.mo24585O7(r3, r6)
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r3 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.MeSetDiscoveryChannels
            r0.mo24584N7(r3, r10)
            goto L_0x00fd
        L_0x00f6:
            pj3.g r3 = r17.getPreferenceScreen()
            r3.mo72529n(r10, r7)
        L_0x00fd:
            java.lang.Class<gt1.b> r3 = gt1.C20838b.class
            di3.d r6 = di3.C86312j.m106911c(r1)
            ht1.t1 r6 = (ht1.C60200t1) r6
            ht1.z4 r6 = r6.mo76861l7()
            boolean r6 = r6.mo83772S5()
            java.lang.Object[] r10 = new java.lang.Object[r7]
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r6)
            r10[r5] = r11
            java.lang.String r11 = "showFinderLiveEntry %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r11, r10)
            di3.d r10 = di3.C86312j.m106911c(r3)
            gt1.b r10 = (gt1.C20838b) r10
            boolean r10 = r10.mo32539RP()
            java.lang.String r11 = "settings_finder_live_switch"
            java.lang.String r12 = "settings_finder_live_above_look_switch"
            if (r10 == 0) goto L_0x0135
            pj3.g r10 = r17.getPreferenceScreen()
            r10.mo72529n(r11, r7)
            goto L_0x013c
        L_0x0135:
            pj3.g r10 = r17.getPreferenceScreen()
            r10.mo72529n(r12, r7)
        L_0x013c:
            di3.d r10 = di3.C86312j.m106911c(r2)
            ky2.i r10 = (ky2.C10432i) r10
            boolean r10 = r10.mo10750e()
            if (r6 == 0) goto L_0x01ab
            if (r10 == 0) goto L_0x014b
            goto L_0x01ab
        L_0x014b:
            pj3.g r6 = r17.getPreferenceScreen()
            di3.d r10 = di3.C86312j.m106911c(r3)
            gt1.b r10 = (gt1.C20838b) r10
            java.lang.String r10 = r10.Fl0()
            com.tencent.mm.ui.base.preference.Preference r6 = r6.mo72519a(r10)
            gy3.C87412m.m108592e(r6, r4)
            com.tencent.mm.ui.base.preference.IconPreference r6 = (com.tencent.p014mm.p136ui.base.preference.IconPreference) r6
            r6.f121290w = r5
            r0.mo24579I7(r6)
            r10 = 9007199254740992(0x20000000000000, double:4.450147717014403E-308)
            boolean r10 = r0.mo24580J7(r10)
            r11 = 13
            if (r10 == 0) goto L_0x0180
            java.util.Map<java.lang.Integer, java.lang.Integer> r10 = r0.f53961g
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            r10.put(r11, r12)
            r10 = 1
            goto L_0x018e
        L_0x0180:
            java.util.Map<java.lang.Integer, java.lang.Integer> r10 = r0.f53961g
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            r10.put(r11, r12)
            r10 = 0
        L_0x018e:
            r11 = 32
            boolean r11 = r0.mo24582L7(r11)
            int r10 = r0.mo24578H7(r11, r10)
            r0.mo24585O7(r6, r10)
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r6 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.MeSetDiscoveryFinderLive
            di3.d r3 = di3.C86312j.m106911c(r3)
            gt1.b r3 = (gt1.C20838b) r3
            java.lang.String r3 = r3.Fl0()
            r0.mo24584N7(r6, r3)
            goto L_0x01b9
        L_0x01ab:
            pj3.g r3 = r17.getPreferenceScreen()
            r3.mo72529n(r11, r7)
            pj3.g r3 = r17.getPreferenceScreen()
            r3.mo72529n(r12, r7)
        L_0x01b9:
            pj3.g r3 = r17.getPreferenceScreen()
            java.lang.String r6 = "settings_scan_switch"
            com.tencent.mm.ui.base.preference.Preference r3 = r3.mo72519a(r6)
            gy3.C87412m.m108592e(r3, r4)
            com.tencent.mm.ui.base.preference.IconPreference r3 = (com.tencent.p014mm.p136ui.base.preference.IconPreference) r3
            r3.f121290w = r5
            r0.mo24579I7(r3)
            r10 = 1048576(0x100000, double:5.180654E-318)
            boolean r10 = r0.mo24580J7(r10)
            if (r10 == 0) goto L_0x01e6
            java.util.Map<java.lang.Integer, java.lang.Integer> r10 = r0.f53961g
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            r10.put(r11, r12)
            r10 = 1
            goto L_0x01f4
        L_0x01e6:
            java.util.Map<java.lang.Integer, java.lang.Integer> r10 = r0.f53961g
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            r10.put(r11, r12)
            r10 = 0
        L_0x01f4:
            r0.mo24585O7(r3, r10)
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r3 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.GlobalScan
            r0.mo24584N7(r3, r6)
            pj3.g r3 = r17.getPreferenceScreen()
            java.lang.String r6 = "settings_shake_switch"
            com.tencent.mm.ui.base.preference.Preference r3 = r3.mo72519a(r6)
            gy3.C87412m.m108592e(r3, r4)
            com.tencent.mm.ui.base.preference.IconPreference r3 = (com.tencent.p014mm.p136ui.base.preference.IconPreference) r3
            r3.f121290w = r5
            r0.mo24579I7(r3)
            r10 = 256(0x100, double:1.265E-321)
            boolean r6 = r0.mo24583M7(r10)
            java.lang.Object[] r10 = new java.lang.Object[r7]
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r6)
            r10[r5] = r11
            java.lang.String r11 = "openShake %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r11, r10)
            if (r6 == 0) goto L_0x0236
            java.util.Map<java.lang.Integer, java.lang.Integer> r6 = r0.f53961g
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            r6.put(r10, r11)
            r6 = 0
            goto L_0x0244
        L_0x0236:
            java.util.Map<java.lang.Integer, java.lang.Integer> r6 = r0.f53961g
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r5)
            r6.put(r10, r11)
            r6 = 1
        L_0x0244:
            r0.mo24585O7(r3, r6)
            pj3.g r3 = r17.getPreferenceScreen()
            java.lang.String r6 = "settings_look_switch"
            com.tencent.mm.ui.base.preference.Preference r3 = r3.mo72519a(r6)
            gy3.C87412m.m108592e(r3, r4)
            com.tencent.mm.ui.base.preference.IconPreference r3 = (com.tencent.p014mm.p136ui.base.preference.IconPreference) r3
            r3.f121290w = r5
            r0.mo24579I7(r3)
            r10 = 67108864(0x4000000, double:3.31561842E-316)
            boolean r10 = r0.mo24580J7(r10)
            r10 = r10 ^ r7
            f40.o r11 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r11 = r11.mo121142i()
            r12 = 274436(0x43004, float:3.84567E-40)
            r13 = 0
            java.lang.Object r11 = r11.mo119684e(r12, r13)
            java.lang.String r12 = "null cannot be cast to non-null type kotlin.String"
            gy3.C87412m.m108592e(r11, r12)
            java.lang.String r11 = (java.lang.String) r11
            boolean r11 = nc0.C76850a.m92639k(r11)
            if (r11 == 0) goto L_0x0291
            pj3.g r10 = r17.getPreferenceScreen()
            r10.mo72529n(r6, r7)
            java.lang.String r10 = "european user"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            r10 = 0
            r11 = 0
            goto L_0x0292
        L_0x0291:
            r11 = 1
        L_0x0292:
            di3.d r12 = di3.C86312j.m106911c(r2)
            ky2.i r12 = (ky2.C10432i) r12
            boolean r12 = r12.mo10750e()
            r13 = 3
            java.lang.Object[] r14 = new java.lang.Object[r13]
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r11)
            r14[r5] = r15
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r10)
            r14[r7] = r15
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r12)
            r14[r8] = r15
            java.lang.String r15 = "isInExperiment %s ,openLook %s, isTeenMode:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r15, r14)
            r14 = 10
            if (r11 == 0) goto L_0x02cc
            if (r10 == 0) goto L_0x02cc
            if (r12 != 0) goto L_0x02cc
            java.util.Map<java.lang.Integer, java.lang.Integer> r10 = r0.f53961g
            java.lang.Integer r11 = java.lang.Integer.valueOf(r14)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            r10.put(r11, r12)
            goto L_0x02ee
        L_0x02cc:
            if (r11 == 0) goto L_0x02e7
            if (r12 == 0) goto L_0x02d1
            goto L_0x02e7
        L_0x02d1:
            pj3.g r10 = r17.getPreferenceScreen()
            r10.mo72529n(r6, r5)
            java.util.Map<java.lang.Integer, java.lang.Integer> r10 = r0.f53961g
            java.lang.Integer r11 = java.lang.Integer.valueOf(r14)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            r10.put(r11, r12)
            r10 = 1
            goto L_0x02ef
        L_0x02e7:
            pj3.g r10 = r17.getPreferenceScreen()
            r10.mo72529n(r6, r7)
        L_0x02ee:
            r10 = 0
        L_0x02ef:
            r11 = 128(0x80, double:6.32E-322)
            boolean r11 = r0.mo24582L7(r11)
            int r10 = r0.mo24578H7(r11, r10)
            r0.mo24585O7(r3, r10)
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r3 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.MeSetDiscoveryLooks
            r0.mo24584N7(r3, r6)
            pj3.g r3 = r17.getPreferenceScreen()
            java.lang.String r6 = "settings_search_switch"
            com.tencent.mm.ui.base.preference.Preference r3 = r3.mo72519a(r6)
            gy3.C87412m.m108592e(r3, r4)
            com.tencent.mm.ui.base.preference.IconPreference r3 = (com.tencent.p014mm.p136ui.base.preference.IconPreference) r3
            r3.f121290w = r5
            r0.mo24579I7(r3)
            r10 = 2097152(0x200000, double:1.0361308E-317)
            boolean r10 = r0.mo24580J7(r10)
            if (r10 == 0) goto L_0x032e
            java.util.Map<java.lang.Integer, java.lang.Integer> r10 = r0.f53961g
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            r10.put(r11, r12)
            r10 = 1
            goto L_0x033c
        L_0x032e:
            java.util.Map<java.lang.Integer, java.lang.Integer> r10 = r0.f53961g
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            r10.put(r11, r12)
            r10 = 0
        L_0x033c:
            r0.mo24585O7(r3, r10)
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r3 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.MeSetDiscoverySearch
            r0.mo24584N7(r3, r6)
            di3.d r3 = di3.C86312j.m106911c(r1)
            ht1.t1 r3 = (ht1.C60200t1) r3
            ht1.z4 r3 = r3.mo76861l7()
            boolean r3 = r3.mo83760G5()
            r6 = 4
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            java.lang.String r11 = "settings_nearby_switch"
            java.lang.String r12 = "settings_nearby_live_friend_switch"
            java.lang.Integer r13 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r7)
            r15 = r9
            r8 = 512(0x200, double:2.53E-321)
            if (r3 == 0) goto L_0x0440
            pj3.g r3 = r17.getPreferenceScreen()
            r3.mo72529n(r11, r7)
            pj3.g r3 = r17.getPreferenceScreen()
            com.tencent.mm.ui.base.preference.Preference r3 = r3.mo72519a(r12)
            gy3.C87412m.m108592e(r3, r4)
            com.tencent.mm.ui.base.preference.IconPreference r3 = (com.tencent.p014mm.p136ui.base.preference.IconPreference) r3
            r3.f121290w = r5
            r0.mo24579I7(r3)
            di3.d r1 = di3.C86312j.m106911c(r1)
            ht1.t1 r1 = (ht1.C60200t1) r1
            ht1.z4 r1 = r1.mo76861l7()
            boolean r1 = r1.mo83772S5()
            if (r1 == 0) goto L_0x03a6
            androidx.appcompat.app.AppCompatActivity r1 = r17.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r11 = 2131825954(0x7f111522, float:1.9284779E38)
            java.lang.String r1 = r1.getString(r11)
            r3.mo69924H(r1)
            goto L_0x03b8
        L_0x03a6:
            androidx.appcompat.app.AppCompatActivity r1 = r17.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r11 = 2131833460(0x7f113274, float:1.9300003E38)
            java.lang.String r1 = r1.getString(r11)
            r3.mo69924H(r1)
        L_0x03b8:
            r5 = 70368744177664(0x400000000000, double:3.4766779039175E-310)
            boolean r5 = r0.mo24580J7(r5)
            r5 = r5 ^ r7
            boolean r6 = r0.mo24583M7(r8)
            java.lang.Object[] r11 = new java.lang.Object[r7]
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r5)
            r1 = 0
            r11[r1] = r16
            java.lang.String r8 = "openNearbyLiveFriends:%s"
            r9 = r15
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r8, r11)
            java.lang.String r8 = "settings_nearby_live_friend_person_switch"
            r11 = 5
            if (r5 == 0) goto L_0x03ee
            java.util.Map<java.lang.Integer, java.lang.Integer> r5 = r0.f53961g
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r5.put(r11, r14)
            pj3.g r5 = r17.getPreferenceScreen()
            r5.mo72529n(r8, r1)
            r5 = 0
            goto L_0x03ff
        L_0x03ee:
            java.util.Map<java.lang.Integer, java.lang.Integer> r5 = r0.f53961g
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r5.put(r11, r13)
            pj3.g r5 = r17.getPreferenceScreen()
            r5.mo72529n(r8, r7)
            r5 = 1
        L_0x03ff:
            if (r6 == 0) goto L_0x0409
            r5 = r5 & -5
            java.util.Map<java.lang.Integer, java.lang.Integer> r6 = r0.f53961g
            r6.put(r10, r14)
            goto L_0x0410
        L_0x0409:
            r6 = 4
            r5 = r5 | r6
            java.util.Map<java.lang.Integer, java.lang.Integer> r6 = r0.f53961g
            r6.put(r10, r13)
        L_0x0410:
            r10 = 8192(0x2000, double:4.0474E-320)
            boolean r6 = r0.mo24582L7(r10)
            int r5 = r0.mo24578H7(r6, r5)
            r0.mo24585O7(r3, r5)
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r3 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.MeSetDiscoveryNearbyLiveFriends
            r0.mo24584N7(r3, r12)
            di3.d r3 = di3.C86312j.m106911c(r2)
            ky2.i r3 = (ky2.C10432i) r3
            boolean r3 = r3.mo10750e()
            if (r3 == 0) goto L_0x0437
            pj3.g r3 = r17.getPreferenceScreen()
            r3.mo72529n(r12, r7)
            goto L_0x04ac
        L_0x0437:
            pj3.g r3 = r17.getPreferenceScreen()
            r1 = 0
            r3.mo72529n(r12, r1)
            goto L_0x04ac
        L_0x0440:
            r9 = r15
            r1 = 0
            pj3.g r3 = r17.getPreferenceScreen()
            r3.mo72529n(r12, r7)
            pj3.g r3 = r17.getPreferenceScreen()
            com.tencent.mm.ui.base.preference.Preference r3 = r3.mo72519a(r11)
            gy3.C87412m.m108592e(r3, r4)
            com.tencent.mm.ui.base.preference.IconPreference r3 = (com.tencent.p014mm.p136ui.base.preference.IconPreference) r3
            r3.f121290w = r1
            r0.mo24579I7(r3)
            r5 = 512(0x200, double:2.53E-321)
            boolean r8 = r0.mo24583M7(r5)
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r8)
            r5[r1] = r6
            java.lang.String r6 = "openNearby %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r6, r5)
            if (r8 == 0) goto L_0x0478
            java.util.Map<java.lang.Integer, java.lang.Integer> r5 = r0.f53961g
            r5.put(r10, r14)
            r5 = 0
            goto L_0x047e
        L_0x0478:
            java.util.Map<java.lang.Integer, java.lang.Integer> r5 = r0.f53961g
            r5.put(r10, r13)
            r5 = 1
        L_0x047e:
            r12 = 8192(0x2000, double:4.0474E-320)
            boolean r6 = r0.mo24582L7(r12)
            int r5 = r0.mo24578H7(r6, r5)
            r0.mo24585O7(r3, r5)
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r3 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.MeSetDiscoveryNearby
            r0.mo24584N7(r3, r11)
            di3.d r3 = di3.C86312j.m106911c(r2)
            ky2.i r3 = (ky2.C10432i) r3
            boolean r3 = r3.mo10750e()
            if (r3 == 0) goto L_0x04a4
            pj3.g r3 = r17.getPreferenceScreen()
            r3.mo72529n(r11, r7)
            goto L_0x04ac
        L_0x04a4:
            pj3.g r3 = r17.getPreferenceScreen()
            r1 = 0
            r3.mo72529n(r11, r1)
        L_0x04ac:
            com.tencent.mm.pluginsdk.platformtools.d$a r3 = com.tencent.p014mm.pluginsdk.platformtools.C96796d.m124292a()
            if (r3 == 0) goto L_0x04ba
            boolean r3 = r3.mo134444UX()
            if (r3 == 0) goto L_0x04ba
            r3 = 1
            goto L_0x04bb
        L_0x04ba:
            r3 = 0
        L_0x04bb:
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            r1 = 0
            r5[r1] = r6
            java.lang.String r6 = "showShopping %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r6, r5)
            di3.d r5 = di3.C86312j.m106911c(r2)
            ky2.i r5 = (ky2.C10432i) r5
            boolean r5 = r5.mo10750e()
            pj3.g r6 = r17.getPreferenceScreen()
            java.lang.String r8 = "settings_shopping_switch"
            com.tencent.mm.ui.base.preference.Preference r6 = r6.mo72519a(r8)
            gy3.C87412m.m108592e(r6, r4)
            com.tencent.mm.ui.base.preference.IconPreference r6 = (com.tencent.p014mm.p136ui.base.preference.IconPreference) r6
            r6.f121290w = r1
            r0.mo24579I7(r6)
            if (r3 == 0) goto L_0x04f5
            if (r5 != 0) goto L_0x04f5
            pj3.g r3 = r17.getPreferenceScreen()
            r3.mo72529n(r8, r1)
            goto L_0x04fc
        L_0x04f5:
            pj3.g r3 = r17.getPreferenceScreen()
            r3.mo72529n(r8, r7)
        L_0x04fc:
            r10 = 4194304(0x400000, double:2.0722615E-317)
            boolean r3 = r0.mo24580J7(r10)
            r5 = 6
            if (r3 == 0) goto L_0x0516
            java.util.Map<java.lang.Integer, java.lang.Integer> r3 = r0.f53961g
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            r3.put(r5, r10)
            r3 = 1
            goto L_0x0524
        L_0x0516:
            java.util.Map<java.lang.Integer, java.lang.Integer> r3 = r0.f53961g
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            r3.put(r5, r10)
            r3 = 0
        L_0x0524:
            r10 = 512(0x200, double:2.53E-321)
            boolean r5 = r0.mo24582L7(r10)
            int r3 = r0.mo24578H7(r5, r3)
            r0.mo24585O7(r6, r3)
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r3 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.MeSetDiscoveryShop
            r0.mo24584N7(r3, r8)
            sw1.m r3 = sw1.C48477m.C13789a.m13091a()
            pj3.g r5 = r17.getPreferenceScreen()
            java.lang.String r6 = "settings_game_switch"
            com.tencent.mm.ui.base.preference.Preference r5 = r5.mo72519a(r6)
            gy3.C87412m.m108592e(r5, r4)
            com.tencent.mm.ui.base.preference.IconPreference r5 = (com.tencent.p014mm.p136ui.base.preference.IconPreference) r5
            r1 = 0
            r5.f121290w = r1
            r0.mo24579I7(r5)
            di3.d r8 = di3.C86312j.m106911c(r2)
            ky2.i r8 = (ky2.C10432i) r8
            boolean r8 = r8.mo10750e()
            if (r3 == 0) goto L_0x058c
            boolean r3 = r3.ju0(r0)
            if (r3 == 0) goto L_0x058c
            if (r8 != 0) goto L_0x058c
            r10 = 8388608(0x800000, double:4.144523E-317)
            boolean r3 = r0.mo24580J7(r10)
            r8 = 7
            if (r3 == 0) goto L_0x057e
            java.util.Map<java.lang.Integer, java.lang.Integer> r3 = r0.f53961g
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r1 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            r3.put(r8, r10)
            r3 = 1
            goto L_0x0594
        L_0x057e:
            java.util.Map<java.lang.Integer, java.lang.Integer> r3 = r0.f53961g
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            r3.put(r8, r10)
            goto L_0x0593
        L_0x058c:
            pj3.g r3 = r17.getPreferenceScreen()
            r3.mo72529n(r6, r7)
        L_0x0593:
            r3 = 0
        L_0x0594:
            r10 = 2048(0x800, double:1.0118E-320)
            boolean r8 = r0.mo24582L7(r10)
            int r3 = r0.mo24578H7(r8, r3)
            r0.mo24585O7(r5, r3)
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r3 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.MeSetDiscoveryGame
            r0.mo24584N7(r3, r6)
            com.tencent.mm.autogen.events.ShouldShowAppBrandEntranceInFindMoreEvent r3 = new com.tencent.mm.autogen.events.ShouldShowAppBrandEntranceInFindMoreEvent
            r3.<init>()
            com.tencent.mm.autogen.events.ShouldShowAppBrandEntranceInFindMoreEvent$a r5 = r3.f236288d
            r5.f236290a = r7
            r3.publish()
            com.tencent.mm.autogen.events.ShouldShowAppBrandEntranceInFindMoreEvent$b r3 = r3.f236289e
            boolean r3 = r3.f236291a
            di3.d r5 = di3.C86312j.m106911c(r2)
            ky2.i r5 = (ky2.C10432i) r5
            boolean r5 = r5.mo10750e()
            if (r5 == 0) goto L_0x05d1
            di3.d r2 = di3.C86312j.m106911c(r2)
            ky2.i r2 = (ky2.C10432i) r2
            int r2 = r2.mo10740Mn()
            r5 = 2
            if (r2 != r5) goto L_0x05d2
            r2 = 1
            goto L_0x05d3
        L_0x05d1:
            r5 = 2
        L_0x05d2:
            r2 = 0
        L_0x05d3:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            r1 = 0
            r5[r1] = r6
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            r5[r7] = r6
            java.lang.String r6 = "shouldShowMiniProgram %s, isTeenModeAndNotAccessRight:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r6, r5)
            pj3.g r5 = r17.getPreferenceScreen()
            java.lang.String r6 = "settings_miniprogram_switch"
            com.tencent.mm.ui.base.preference.Preference r5 = r5.mo72519a(r6)
            gy3.C87412m.m108592e(r5, r4)
            com.tencent.mm.ui.base.preference.IconPreference r5 = (com.tencent.p014mm.p136ui.base.preference.IconPreference) r5
            r5.f121290w = r1
            r0.mo24579I7(r5)
            if (r3 == 0) goto L_0x0629
            if (r2 != 0) goto L_0x0629
            r2 = 16777216(0x1000000, double:8.289046E-317)
            boolean r2 = r0.mo24580J7(r2)
            r3 = 8
            if (r2 == 0) goto L_0x061b
            java.util.Map<java.lang.Integer, java.lang.Integer> r2 = r0.f53961g
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            r2.put(r3, r8)
            r2 = 1
            goto L_0x0631
        L_0x061b:
            java.util.Map<java.lang.Integer, java.lang.Integer> r2 = r0.f53961g
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r2.put(r3, r8)
            goto L_0x0630
        L_0x0629:
            pj3.g r2 = r17.getPreferenceScreen()
            r2.mo72529n(r6, r7)
        L_0x0630:
            r2 = 0
        L_0x0631:
            r0.mo24585O7(r5, r2)
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r2 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.MeSetDiscoveryAppbrand
            r0.mo24584N7(r2, r6)
            pj3.g r2 = r17.getPreferenceScreen()
            java.lang.String r3 = "settings_wechatout_switch"
            com.tencent.mm.ui.base.preference.Preference r2 = r2.mo72519a(r3)
            gy3.C87412m.m108592e(r2, r4)
            com.tencent.mm.ui.base.preference.IconPreference r2 = (com.tencent.p014mm.p136ui.base.preference.IconPreference) r2
            java.lang.Class<lc3.b> r4 = lc3.C10485b.class
            k40.a r4 = f40.C86709a0.m107533q(r4)
            lc3.b r4 = (lc3.C10485b) r4
            pj.f r4 = r4.vh0()
            java.lang.String r5 = "WCOEntranceSwitch"
            r1 = 0
            int r4 = r4.mo107404b(r5, r1)
            if (r4 <= 0) goto L_0x0660
            r4 = 1
            goto L_0x0661
        L_0x0660:
            r4 = 0
        L_0x0661:
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            r5[r1] = r6
            java.lang.String r6 = "showWeChatOut %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r6, r5)
            if (r4 == 0) goto L_0x06a2
            r2.f121290w = r1
            r0.mo24579I7(r2)
            r4 = 33554432(0x2000000, double:1.6578092E-316)
            boolean r4 = r0.mo24580J7(r4)
            r5 = 9
            if (r4 == 0) goto L_0x0690
            java.util.Map<java.lang.Integer, java.lang.Integer> r4 = r0.f53961g
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.put(r5, r1)
            r5 = 1
            goto L_0x069e
        L_0x0690:
            java.util.Map<java.lang.Integer, java.lang.Integer> r4 = r0.f53961g
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r4.put(r5, r6)
            r5 = 0
        L_0x069e:
            r0.mo24585O7(r2, r5)
            goto L_0x06a9
        L_0x06a2:
            pj3.g r1 = r17.getPreferenceScreen()
            r1.mo72529n(r3, r7)
        L_0x06a9:
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r1 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.MeSetDiscoveryWeChatOut
            r0.mo24584N7(r1, r3)
            pj3.g r1 = r17.getPreferenceScreen()
            com.tencent.mm.ui.base.preference.PreferenceCustomHeightCategory r2 = new com.tencent.mm.ui.base.preference.PreferenceCustomHeightCategory
            androidx.appcompat.app.AppCompatActivity r3 = r17.getContext()
            r2.<init>(r3)
            androidx.appcompat.app.AppCompatActivity r3 = r17.getContext()
            r4 = 1111490560(0x42400000, float:48.0)
            int r3 = zp3.C79406f.m96347a(r3, r4)
            r2.f24274J = r3
            r1.mo72527k(r2)
            pj3.g r1 = r17.getPreferenceScreen()
            r1.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsManageFindMoreV2UI.initView():void");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        int i3 = 1;
        if (i == 1 && i2 == -1 && intent != null) {
            if (intent.getBooleanExtra("is_show_in_findmore", false)) {
                i3 = 0;
            }
            if (!intent.getBooleanExtra("is_new_notify", false)) {
                i3 |= 2;
            }
            if (!intent.getBooleanExtra("is_show_nearby", false)) {
                i3 |= 4;
            }
            Preference a = getPreferenceScreen().mo72519a(intent.getStringExtra("perf_key"));
            IconPreference iconPreference = a instanceof IconPreference ? (IconPreference) a : null;
            if (iconPreference != null) {
                mo24585O7(iconPreference, i3);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getContext().getResources().getColor(C0966R.color.al6));
        hideActionbarLine();
        setMMTitle("");
        this.mController.mo177105z0(getResources().getColor(C0966R.color.al6));
        this.f53958d = C75592q0.m90781k();
        this.f53959e = C75592q0.m90785o();
        this.f53960f = C75592q0.m90779i();
        Log.m105925i("MicroMsg.SettingsFindMoreV2UI", "onCreate extStatus %d, pluginFlag %d, discoveryCtrlFlag %d", Long.valueOf(this.f53958d), Integer.valueOf(this.f53959e), Long.valueOf(this.f53960f));
        initView();
        ((C66446g) C86312j.m106911c(C66446g.class)).mo61609f(true);
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        C87412m.m108594g(preference, "pref");
        String str = preference.f121285r;
        if (C87412m.m108589b(str, "settings_scan_switch")) {
            if (!WeChatBrands.Business.Entries.GlobalScan.checkAvailable(this)) {
                return true;
            }
        } else if (C87412m.m108589b(str, "settings_search_switch")) {
            if (!WeChatBrands.Business.Entries.MeSetDiscoverySearch.checkAvailable(this)) {
                return true;
            }
        } else if (C87412m.m108589b(str, "settings_shopping_switch")) {
            if (!WeChatBrands.Business.Entries.MeSetDiscoveryShop.checkAvailable(this)) {
                return true;
            }
        } else if (C87412m.m108589b(str, "settings_game_switch")) {
            if (!WeChatBrands.Business.Entries.MeSetDiscoveryGame.checkAvailable(this)) {
                return true;
            }
        } else if (C87412m.m108589b(str, "settings_miniprogram_switch")) {
            if (!WeChatBrands.Business.Entries.MeSetDiscoveryAppbrand.checkAvailable(this)) {
                return true;
            }
        } else if (C87412m.m108589b(str, "settings_wechatout_switch")) {
            if (!WeChatBrands.Business.Entries.MeSetDiscoveryWeChatOut.checkAvailable(this)) {
                return true;
            }
        } else if (C87412m.m108589b(str, "settings_shake_switch")) {
            if (!WeChatBrands.Business.Entries.MeSetDiscoveryShake.checkAvailable(this)) {
                return true;
            }
        } else if (C87412m.m108589b(str, "settings_nearby_switch")) {
            if (!WeChatBrands.Business.Entries.MeSetDiscoveryNearby.checkAvailable(this)) {
                return true;
            }
        } else if (C87412m.m108589b(str, "settings_nearby_live_friend_switch")) {
            if (!WeChatBrands.Business.Entries.MeSetDiscoveryNearbyLiveFriends.checkAvailable(this)) {
                return true;
            }
        } else if (C87412m.m108589b(str, "settings_look_switch")) {
            if (!WeChatBrands.Business.Entries.MeSetDiscoveryLooks.checkAvailable(this)) {
                return true;
            }
        } else if (C87412m.m108589b(str, "settings_finder_switch")) {
            if (!WeChatBrands.Business.Entries.MeSetDiscoveryChannels.checkAvailable(this)) {
                return true;
            }
        } else if (C87412m.m108589b(str, ((C20838b) C86312j.m106911c(C20838b.class)).Fl0()) && !WeChatBrands.Business.Entries.MeSetDiscoveryFinderLive.checkAvailable(this)) {
            return true;
        }
        IconPreference iconPreference = preference instanceof IconPreference ? (IconPreference) preference : null;
        if (iconPreference != null) {
            int i = iconPreference.mo69925c().getInt("perf_extra_flag");
            Intent intent = new Intent();
            intent.putExtra("perf_key", iconPreference.f121285r);
            intent.putExtra("perf_title", iconPreference.f121279i);
            intent.putExtra("perf_icon_res", iconPreference.f121282o);
            intent.putExtra("perf_icon_color", iconPreference.f121283p);
            intent.putExtra("is_show_in_findmore", !mo24581K7(i, 1));
            intent.putExtra("is_new_notify", !mo24581K7(i, 2));
            intent.putExtra("is_show_nearby", !mo24581K7(i, 4));
            StringBuilder sb = new StringBuilder();
            sb.append("startHalfActivity  INTENT_PERF_IS_SHOW = ");
            sb.append(!mo24581K7(i, 1));
            sb.append(" INTENT_PERF_IS_NOTIFY = ");
            sb.append(!mo24581K7(i, 2));
            sb.append(" INTENT_PERF_IS_SHOW_NEARBY = ");
            sb.append(!mo24581K7(i, 4));
            Log.m105924i("MicroMsg.SettingsFindMoreV2UI", sb.toString());
            C79397a.C79398a aVar = new C79397a.C79398a();
            aVar.f232918a.f232909a = getContext();
            aVar.mo109373c(intent);
            aVar.mo109372b(SettingHalfSceenDialogFragment.class);
            aVar.mo109371a("com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI");
            aVar.f232918a.f232914f = 1;
            aVar.mo109374d();
        }
        return true;
    }

    public void onResume() {
        super.onResume();
        this.f53958d = C75592q0.m90781k();
        this.f53959e = C75592q0.m90785o();
        this.f53960f = C75592q0.m90779i();
    }
}
