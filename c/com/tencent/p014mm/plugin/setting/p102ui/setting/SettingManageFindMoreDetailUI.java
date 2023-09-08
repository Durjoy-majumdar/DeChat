package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Intent;
import android.view.MenuItem;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.DiscoverViewEntranceSettingStruct;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32226l;
import g62.C32330n;
import g62.C8233m;
import gt1.C20838b;
import gy3.C87412m;
import gy3.C87413o;
import hn2.C20974j;
import in2.C21121f;
import in2.C9208d;
import in2.C9212e;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kr0.C76630x0;
import na3.C88908g;
import p274xx.C15907f;
import rx3.C13598b0;
import tc0.C77884m;
import tc0.C77885p;
import te3.C52185yy2;
import te3.C64266br1;
import u73.C14135q;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/SettingManageFindMoreDetailUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "plugin-setting_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI */
public final class SettingManageFindMoreDetailUI extends MMSecDataActivity {

    /* renamed from: w */
    public static final /* synthetic */ int f53904w = 0;

    /* renamed from: d */
    public boolean f53905d;

    /* renamed from: e */
    public boolean f53906e;

    /* renamed from: f */
    public boolean f53907f;

    /* renamed from: g */
    public long f53908g;

    /* renamed from: h */
    public long f53909h;

    /* renamed from: i */
    public Map<Long, Long> f53910i = new LinkedHashMap();

    /* renamed from: j */
    public Map<Integer, Integer> f53911j = new LinkedHashMap();

    /* renamed from: n */
    public Map<Integer, Integer> f53912n = new LinkedHashMap();

    /* renamed from: o */
    public Map<Integer, Integer> f53913o = new LinkedHashMap();

    /* renamed from: p */
    public int f53914p;

    /* renamed from: q */
    public boolean f53915q;

    /* renamed from: r */
    public boolean f53916r = true;

    /* renamed from: s */
    public boolean f53917s;

    /* renamed from: t */
    public boolean f53918t;

    /* renamed from: u */
    public String f53919u = "";

    /* renamed from: v */
    public int f53920v;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI$a */
    public static final class C19150a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ SettingManageFindMoreDetailUI f53921d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19150a(SettingManageFindMoreDetailUI settingManageFindMoreDetailUI) {
            super(1);
            this.f53921d = settingManageFindMoreDetailUI;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0085, code lost:
            if (r2.equals("settings_finder_live_switch") == false) goto L_0x0117;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0089, code lost:
            r10 = 32;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x009d, code lost:
            if (r10 != 8) goto L_0x00bb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x009f, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.SettingManageFindMoreDetailUI", "onFinderReddotChange isEnable=%s", java.lang.Boolean.valueOf(r15));
            ((ht1.C60200t1) di3.C86312j.m106911c(r1)).Nt0().mo77251W5(r15);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bd, code lost:
            if (r10 != 32) goto L_0x00db;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bf, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.SettingManageFindMoreDetailUI", "onLiveReddotChange isEnable=%s", java.lang.Boolean.valueOf(r15));
            ((ht1.C60200t1) di3.C86312j.m106911c(r1)).Nt0().mo77260c6(r15);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00dd, code lost:
            if (r10 != 8192) goto L_0x0114;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00df, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.SettingManageFindMoreDetailUI", "onNearByReddotChange isEnable=%s", java.lang.Boolean.valueOf(r15));
            ((ht1.C60200t1) di3.C86312j.m106911c(r1)).Nt0().mo77249U5(r15);
            com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE.mo160131h(22479, java.lang.Long.valueOf(eb0.C31543z5.m39453c()), java.lang.Integer.valueOf(r15 ? 1 : 0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0114, code lost:
            r0.mo24556L7(r15, r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0035, code lost:
            if (r2.equals("settings_finder_live_above_look_switch") == false) goto L_0x0117;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Boolean r15 = (java.lang.Boolean) r15
                boolean r15 = r15.booleanValue()
                com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI r0 = r14.f53921d
                java.lang.Class<ht1.t1> r1 = ht1.C60200t1.class
                java.lang.String r2 = r0.f53919u
                java.lang.String r3 = "settings_nearby_live_friend_switch"
                boolean r2 = gy3.C87412m.m108589b(r2, r3)
                r3 = 32
                r5 = 8192(0x2000, double:4.0474E-320)
                if (r2 == 0) goto L_0x0021
                r0.mo24556L7(r15, r5)
                r0.mo24556L7(r15, r3)
                goto L_0x0117
            L_0x0021:
                java.lang.String r2 = r0.f53919u
                int r7 = r2.hashCode()
                r8 = 8
                switch(r7) {
                    case -1961952687: goto L_0x008b;
                    case -1671198486: goto L_0x007e;
                    case -1347941704: goto L_0x0070;
                    case -1196275249: goto L_0x0062;
                    case -954031656: goto L_0x0055;
                    case -774892169: goto L_0x0047;
                    case -748916219: goto L_0x0039;
                    case 1732258748: goto L_0x002e;
                    default: goto L_0x002c;
                }
            L_0x002c:
                goto L_0x0117
            L_0x002e:
                java.lang.String r7 = "settings_finder_live_above_look_switch"
                boolean r2 = r2.equals(r7)
                if (r2 != 0) goto L_0x0089
                goto L_0x0117
            L_0x0039:
                java.lang.String r7 = "settings_game_switch"
                boolean r2 = r2.equals(r7)
                if (r2 != 0) goto L_0x0044
                goto L_0x0117
            L_0x0044:
                r10 = 2048(0x800, double:1.0118E-320)
                goto L_0x0097
            L_0x0047:
                java.lang.String r7 = "settings_sns_switch"
                boolean r2 = r2.equals(r7)
                if (r2 != 0) goto L_0x0052
                goto L_0x0117
            L_0x0052:
                r10 = 2
                goto L_0x0097
            L_0x0055:
                java.lang.String r7 = "settings_nearby_switch"
                boolean r2 = r2.equals(r7)
                if (r2 != 0) goto L_0x0060
                goto L_0x0117
            L_0x0060:
                r10 = r5
                goto L_0x0097
            L_0x0062:
                java.lang.String r7 = "settings_shopping_switch"
                boolean r2 = r2.equals(r7)
                if (r2 != 0) goto L_0x006d
                goto L_0x0117
            L_0x006d:
                r10 = 512(0x200, double:2.53E-321)
                goto L_0x0097
            L_0x0070:
                java.lang.String r7 = "settings_look_switch"
                boolean r2 = r2.equals(r7)
                if (r2 != 0) goto L_0x007b
                goto L_0x0117
            L_0x007b:
                r10 = 128(0x80, double:6.32E-322)
                goto L_0x0097
            L_0x007e:
                java.lang.String r7 = "settings_finder_live_switch"
                boolean r2 = r2.equals(r7)
                if (r2 != 0) goto L_0x0089
                goto L_0x0117
            L_0x0089:
                r10 = r3
                goto L_0x0097
            L_0x008b:
                java.lang.String r7 = "settings_finder_switch"
                boolean r2 = r2.equals(r7)
                if (r2 != 0) goto L_0x0096
                goto L_0x0117
            L_0x0096:
                r10 = r8
            L_0x0097:
                java.lang.String r2 = "MicroMsg.SettingManageFindMoreDetailUI"
                r7 = 0
                r12 = 1
                int r13 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                if (r13 != 0) goto L_0x00bb
                java.lang.Object[] r3 = new java.lang.Object[r12]
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r15)
                r3[r7] = r4
                java.lang.String r4 = "onFinderReddotChange isEnable=%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r3)
                di3.d r1 = di3.C86312j.m106911c(r1)
                ht1.t1 r1 = (ht1.C60200t1) r1
                ht1.b4 r1 = r1.Nt0()
                r1.mo77251W5(r15)
                goto L_0x0114
            L_0x00bb:
                int r8 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
                if (r8 != 0) goto L_0x00db
                java.lang.Object[] r3 = new java.lang.Object[r12]
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r15)
                r3[r7] = r4
                java.lang.String r4 = "onLiveReddotChange isEnable=%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r3)
                di3.d r1 = di3.C86312j.m106911c(r1)
                ht1.t1 r1 = (ht1.C60200t1) r1
                ht1.b4 r1 = r1.Nt0()
                r1.mo77260c6(r15)
                goto L_0x0114
            L_0x00db:
                int r3 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
                if (r3 != 0) goto L_0x0114
                java.lang.Object[] r3 = new java.lang.Object[r12]
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r15)
                r3[r7] = r4
                java.lang.String r4 = "onNearByReddotChange isEnable=%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r3)
                di3.d r1 = di3.C86312j.m106911c(r1)
                ht1.t1 r1 = (ht1.C60200t1) r1
                ht1.b4 r1 = r1.Nt0()
                r1.mo77249U5(r15)
                com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                long r3 = eb0.C31543z5.m39453c()
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                r2[r7] = r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
                r2[r12] = r3
                r3 = 22479(0x57cf, float:3.15E-41)
                r1.mo160131h(r3, r2)
            L_0x0114:
                r0.mo24556L7(r15, r10)
            L_0x0117:
                com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI r0 = r14.f53921d
                r0.f53906e = r15
                rx3.b0 r15 = rx3.C13598b0.f38549a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.setting.p102ui.setting.SettingManageFindMoreDetailUI.C19150a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI$b */
    public static final class C19151b extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ SettingManageFindMoreDetailUI f53922d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19151b(SettingManageFindMoreDetailUI settingManageFindMoreDetailUI) {
            super(1);
            this.f53922d = settingManageFindMoreDetailUI;
        }

        public Object invoke(Object obj) {
            int i;
            char c;
            String str;
            SettingManageFindMoreDetailUI settingManageFindMoreDetailUI;
            boolean z;
            int i2;
            String str2;
            SettingManageFindMoreDetailUI settingManageFindMoreDetailUI2;
            int i3;
            String str3;
            SettingManageFindMoreDetailUI settingManageFindMoreDetailUI3;
            SettingManageFindMoreDetailUI settingManageFindMoreDetailUI4;
            int i4;
            String str4;
            SettingManageFindMoreDetailUI settingManageFindMoreDetailUI5;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            Class cls = C9208d.class;
            SettingManageFindMoreDetailUI settingManageFindMoreDetailUI6 = this.f53922d;
            settingManageFindMoreDetailUI6.f53905d = booleanValue;
            String str5 = settingManageFindMoreDetailUI6.f53919u;
            int i5 = 0;
            if (C87412m.m108589b(str5, "settings_sns_switch")) {
                settingManageFindMoreDetailUI6.mo24558N7(booleanValue, 32768);
                str = "MicroMsg.SettingManageFindMoreDetailUI";
                settingManageFindMoreDetailUI = settingManageFindMoreDetailUI6;
            } else if (C87412m.m108589b(str5, "settings_scan_switch")) {
                settingManageFindMoreDetailUI6.mo24557M7(booleanValue, 1048576, 49);
                str = "MicroMsg.SettingManageFindMoreDetailUI";
                settingManageFindMoreDetailUI = settingManageFindMoreDetailUI6;
                i5 = 1;
            } else {
                int i6 = 11;
                if (C87412m.m108589b(str5, "settings_search_switch")) {
                    boolean z2 = settingManageFindMoreDetailUI6.f53915q;
                    if (z2 && settingManageFindMoreDetailUI6.f53918t && booleanValue) {
                        C20974j.m23155i(settingManageFindMoreDetailUI6, 2097152, new C19184l0(settingManageFindMoreDetailUI6, booleanValue), new C19186m0(booleanValue, settingManageFindMoreDetailUI6), 2, false);
                        str2 = "MicroMsg.SettingManageFindMoreDetailUI";
                        settingManageFindMoreDetailUI2 = settingManageFindMoreDetailUI6;
                        i = 1;
                        c = 0;
                        i6 = -1;
                        i2 = i6;
                        i5 = i2;
                        z = false;
                        Object[] objArr = new Object[i];
                        objArr[c] = Boolean.valueOf(z);
                        Log.m105921e(str, "needShowCloseSwitchDilaogTips = %s", objArr);
                        settingManageFindMoreDetailUI.f53913o.put(Integer.valueOf(i5), Integer.valueOf(booleanValue ? 1 : 0));
                        SettingManageFindMoreDetailUI settingManageFindMoreDetailUI7 = this.f53922d;
                        C87412m.m108594g(settingManageFindMoreDetailUI7, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                        C39818r rVar = C39818r.f106831a;
                        C39622i0 a = rVar.mo62444c(settingManageFindMoreDetailUI7).mo75002a(cls);
                        C87412m.m108593f(a, "UICProvider.of(activity)…stControlUIC::class.java)");
                        boolean z3 = booleanValue ^ i;
                        ((C9208d) a).mo10016j3("ITEM_KEY_IS_NOTIFY", z3);
                        SettingManageFindMoreDetailUI settingManageFindMoreDetailUI8 = this.f53922d;
                        C87412m.m108594g(settingManageFindMoreDetailUI8, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                        C39622i0 a2 = rVar.mo62444c(settingManageFindMoreDetailUI8).mo75002a(cls);
                        C87412m.m108593f(a2, "UICProvider.of(activity)…stControlUIC::class.java)");
                        ((C9208d) a2).mo10016j3("ITEM_KEY_IS_SHOW_NEARBY", z3);
                        return C13598b0.f38549a;
                    } else if (!z2 || !settingManageFindMoreDetailUI6.f53918t || booleanValue) {
                        String str6 = "MicroMsg.SettingManageFindMoreDetailUI";
                        SettingManageFindMoreDetailUI settingManageFindMoreDetailUI9 = settingManageFindMoreDetailUI6;
                        if (!booleanValue) {
                            ((C14135q) C86312j.m106911c(C14135q.class)).eq0(settingManageFindMoreDetailUI9, new C19195u0(false, settingManageFindMoreDetailUI9, booleanValue));
                        } else {
                            settingManageFindMoreDetailUI9.mo24557M7(booleanValue, 2097152, 50);
                        }
                        settingManageFindMoreDetailUI2 = settingManageFindMoreDetailUI9;
                        str2 = str6;
                        i2 = 3;
                        i = 1;
                        c = 0;
                        i5 = i2;
                        z = false;
                        Object[] objArr2 = new Object[i];
                        objArr2[c] = Boolean.valueOf(z);
                        Log.m105921e(str, "needShowCloseSwitchDilaogTips = %s", objArr2);
                        if (!z && i5 >= 0) {
                            settingManageFindMoreDetailUI.f53913o.put(Integer.valueOf(i5), Integer.valueOf(booleanValue ? 1 : 0));
                        }
                        SettingManageFindMoreDetailUI settingManageFindMoreDetailUI72 = this.f53922d;
                        C87412m.m108594g(settingManageFindMoreDetailUI72, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                        C39818r rVar2 = C39818r.f106831a;
                        C39622i0 a3 = rVar2.mo62444c(settingManageFindMoreDetailUI72).mo75002a(cls);
                        C87412m.m108593f(a3, "UICProvider.of(activity)…stControlUIC::class.java)");
                        boolean z34 = booleanValue ^ i;
                        ((C9208d) a3).mo10016j3("ITEM_KEY_IS_NOTIFY", z34);
                        SettingManageFindMoreDetailUI settingManageFindMoreDetailUI82 = this.f53922d;
                        C87412m.m108594g(settingManageFindMoreDetailUI82, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                        C39622i0 a25 = rVar2.mo62444c(settingManageFindMoreDetailUI82).mo75002a(cls);
                        C87412m.m108593f(a25, "UICProvider.of(activity)…stControlUIC::class.java)");
                        ((C9208d) a25).mo10016j3("ITEM_KEY_IS_SHOW_NEARBY", z34);
                        return C13598b0.f38549a;
                    } else {
                        String string = settingManageFindMoreDetailUI6.getContext().getResources().getString(C0966R.string.n5_);
                        C87412m.m108593f(string, "context.resources.getStr…s_close_dlg_bottom_title)");
                        String string2 = settingManageFindMoreDetailUI6.getContext().getResources().getString(C0966R.string.n59);
                        C87412m.m108593f(string2, "context.resources.getStr…es_close_dlg_bottom_tips)");
                        settingManageFindMoreDetailUI6.mo24554J7(booleanValue, 3, string, string2, (C15907f.C15908a) null);
                        settingManageFindMoreDetailUI3 = settingManageFindMoreDetailUI6;
                        str3 = "MicroMsg.SettingManageFindMoreDetailUI";
                        i3 = 3;
                        i = 1;
                        c = 0;
                    }
                } else {
                    String str7 = "MicroMsg.SettingManageFindMoreDetailUI";
                    SettingManageFindMoreDetailUI settingManageFindMoreDetailUI10 = settingManageFindMoreDetailUI6;
                    if (C87412m.m108589b(str5, "settings_shopping_switch")) {
                        i6 = 6;
                        settingManageFindMoreDetailUI10.mo24557M7(booleanValue, 4194304, 51);
                    } else {
                        long j = 0;
                        if (C87412m.m108589b(str5, "settings_game_switch")) {
                            i6 = 7;
                            settingManageFindMoreDetailUI10.mo24557M7(booleanValue, 8388608, 52);
                            C115669n.INSTANCE.idkeyStat(848, booleanValue ? 0 : 1, 1, false);
                        } else {
                            if (C87412m.m108589b(str5, "settings_miniprogram_switch")) {
                                boolean z4 = settingManageFindMoreDetailUI10.f53915q;
                                if (!z4 || !settingManageFindMoreDetailUI10.f53918t || !booleanValue) {
                                    SettingManageFindMoreDetailUI settingManageFindMoreDetailUI11 = settingManageFindMoreDetailUI10;
                                    String str8 = str7;
                                    c = 0;
                                    if (!z4 || !settingManageFindMoreDetailUI11.f53918t || booleanValue) {
                                        str7 = str8;
                                        settingManageFindMoreDetailUI4 = settingManageFindMoreDetailUI11;
                                        i = 1;
                                        i4 = 8;
                                        settingManageFindMoreDetailUI4.mo24557M7(booleanValue, 16777216, 53);
                                        if (!booleanValue) {
                                            ((C76630x0) C86312j.m106911c(C76630x0.class)).mo0();
                                        }
                                        settingManageFindMoreDetailUI2 = settingManageFindMoreDetailUI4;
                                        str2 = str7;
                                        i2 = i6;
                                        i5 = i2;
                                        z = false;
                                        Object[] objArr22 = new Object[i];
                                        objArr22[c] = Boolean.valueOf(z);
                                        Log.m105921e(str, "needShowCloseSwitchDilaogTips = %s", objArr22);
                                        settingManageFindMoreDetailUI.f53913o.put(Integer.valueOf(i5), Integer.valueOf(booleanValue ? 1 : 0));
                                        SettingManageFindMoreDetailUI settingManageFindMoreDetailUI722 = this.f53922d;
                                        C87412m.m108594g(settingManageFindMoreDetailUI722, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                                        C39818r rVar22 = C39818r.f106831a;
                                        C39622i0 a35 = rVar22.mo62444c(settingManageFindMoreDetailUI722).mo75002a(cls);
                                        C87412m.m108593f(a35, "UICProvider.of(activity)…stControlUIC::class.java)");
                                        boolean z342 = booleanValue ^ i;
                                        ((C9208d) a35).mo10016j3("ITEM_KEY_IS_NOTIFY", z342);
                                        SettingManageFindMoreDetailUI settingManageFindMoreDetailUI822 = this.f53922d;
                                        C87412m.m108594g(settingManageFindMoreDetailUI822, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                                        C39622i0 a252 = rVar22.mo62444c(settingManageFindMoreDetailUI822).mo75002a(cls);
                                        C87412m.m108593f(a252, "UICProvider.of(activity)…stControlUIC::class.java)");
                                        ((C9208d) a252).mo10016j3("ITEM_KEY_IS_SHOW_NEARBY", z342);
                                        return C13598b0.f38549a;
                                    }
                                    i4 = 8;
                                    String string3 = settingManageFindMoreDetailUI11.getContext().getResources().getString(C0966R.string.mid);
                                    C87412m.m108593f(string3, "context.resources.getStr…s_close_dlg_bottom_title)");
                                    String string4 = settingManageFindMoreDetailUI11.getContext().getResources().getString(C0966R.string.mic);
                                    C87412m.m108593f(string4, "context.resources.getStr…es_close_dlg_bottom_tips)");
                                    str4 = str8;
                                    i = 1;
                                    settingManageFindMoreDetailUI5 = settingManageFindMoreDetailUI11;
                                    settingManageFindMoreDetailUI11.mo24554J7(booleanValue, 8, string3, string4, new C19190p0());
                                } else {
                                    c = 0;
                                    C20974j.m23155i(settingManageFindMoreDetailUI10, 16777216, new C19188n0(settingManageFindMoreDetailUI10, booleanValue), new C19189o0(booleanValue, settingManageFindMoreDetailUI10), 2, false);
                                    str2 = str7;
                                    settingManageFindMoreDetailUI2 = settingManageFindMoreDetailUI10;
                                    i = 1;
                                    i6 = -1;
                                    i2 = i6;
                                    i5 = i2;
                                    z = false;
                                    Object[] objArr222 = new Object[i];
                                    objArr222[c] = Boolean.valueOf(z);
                                    Log.m105921e(str, "needShowCloseSwitchDilaogTips = %s", objArr222);
                                    settingManageFindMoreDetailUI.f53913o.put(Integer.valueOf(i5), Integer.valueOf(booleanValue ? 1 : 0));
                                    SettingManageFindMoreDetailUI settingManageFindMoreDetailUI7222 = this.f53922d;
                                    C87412m.m108594g(settingManageFindMoreDetailUI7222, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                                    C39818r rVar222 = C39818r.f106831a;
                                    C39622i0 a352 = rVar222.mo62444c(settingManageFindMoreDetailUI7222).mo75002a(cls);
                                    C87412m.m108593f(a352, "UICProvider.of(activity)…stControlUIC::class.java)");
                                    boolean z3422 = booleanValue ^ i;
                                    ((C9208d) a352).mo10016j3("ITEM_KEY_IS_NOTIFY", z3422);
                                    SettingManageFindMoreDetailUI settingManageFindMoreDetailUI8222 = this.f53922d;
                                    C87412m.m108594g(settingManageFindMoreDetailUI8222, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                                    C39622i0 a2522 = rVar222.mo62444c(settingManageFindMoreDetailUI8222).mo75002a(cls);
                                    C87412m.m108593f(a2522, "UICProvider.of(activity)…stControlUIC::class.java)");
                                    ((C9208d) a2522).mo10016j3("ITEM_KEY_IS_SHOW_NEARBY", z3422);
                                    return C13598b0.f38549a;
                                }
                            } else {
                                settingManageFindMoreDetailUI4 = settingManageFindMoreDetailUI10;
                                i = 1;
                                c = 0;
                                if (C87412m.m108589b(str5, "settings_wechatout_switch")) {
                                    i4 = 9;
                                    settingManageFindMoreDetailUI4.mo24557M7(booleanValue, 33554432, 54);
                                } else if (C87412m.m108589b(str5, "settings_shake_switch")) {
                                    i4 = 2;
                                    settingManageFindMoreDetailUI4.mo24558N7(booleanValue, 256);
                                } else if (C87412m.m108589b(str5, "settings_nearby_switch")) {
                                    i4 = 4;
                                    settingManageFindMoreDetailUI4.mo24558N7(booleanValue, 512);
                                } else if (C87412m.m108589b(str5, "settings_nearby_live_friend_switch")) {
                                    settingManageFindMoreDetailUI4.mo24557M7(booleanValue, 70368744177664L, 61);
                                    if (booleanValue) {
                                        j = 1;
                                    }
                                    DiscoverViewEntranceSettingStruct discoverViewEntranceSettingStruct = new DiscoverViewEntranceSettingStruct();
                                    discoverViewEntranceSettingStruct.f48274d = 12;
                                    discoverViewEntranceSettingStruct.f48275e = j;
                                    discoverViewEntranceSettingStruct.f48276f = 1;
                                    discoverViewEntranceSettingStruct.mo86054n();
                                    Log.m105924i("FindMoreSettingReport", "reportSwitch " + discoverViewEntranceSettingStruct.mo1006q());
                                    i4 = 5;
                                } else if (C87412m.m108589b(str5, "settings_look_switch")) {
                                    i4 = 10;
                                    boolean z5 = settingManageFindMoreDetailUI4.f53915q;
                                    if (!z5 || !settingManageFindMoreDetailUI4.f53918t || !booleanValue) {
                                        SettingManageFindMoreDetailUI settingManageFindMoreDetailUI12 = settingManageFindMoreDetailUI4;
                                        String str9 = str7;
                                        if (settingManageFindMoreDetailUI12.f53916r || !z5 || !settingManageFindMoreDetailUI12.f53918t || booleanValue) {
                                            str7 = str9;
                                            settingManageFindMoreDetailUI4 = settingManageFindMoreDetailUI12;
                                            i = 1;
                                            settingManageFindMoreDetailUI4.mo24555K7(booleanValue);
                                        } else {
                                            String string5 = settingManageFindMoreDetailUI12.getContext().getResources().getString(C0966R.string.mdj);
                                            C87412m.m108593f(string5, "context.resources.getStr…s_close_dlg_bottom_title)");
                                            String string6 = settingManageFindMoreDetailUI12.getContext().getResources().getString(C0966R.string.mdi);
                                            C87412m.m108593f(string6, "context.resources.getStr…es_close_dlg_bottom_tips)");
                                            str4 = str9;
                                            i = 1;
                                            settingManageFindMoreDetailUI5 = settingManageFindMoreDetailUI12;
                                            settingManageFindMoreDetailUI12.mo24554J7(booleanValue, 10, string5, string6, (C15907f.C15908a) null);
                                        }
                                    } else {
                                        C20974j.m23155i(settingManageFindMoreDetailUI4, 67108864, new C19191q0(settingManageFindMoreDetailUI4, booleanValue), new C19192r0(booleanValue, settingManageFindMoreDetailUI4), 2, false);
                                        str7 = str7;
                                        settingManageFindMoreDetailUI4 = settingManageFindMoreDetailUI4;
                                        i = 1;
                                    }
                                } else {
                                    if (C87412m.m108589b(str5, "settings_finder_switch")) {
                                        boolean z6 = settingManageFindMoreDetailUI4.f53915q;
                                        if (!z6 || !settingManageFindMoreDetailUI4.f53918t || !booleanValue) {
                                            SettingManageFindMoreDetailUI settingManageFindMoreDetailUI13 = settingManageFindMoreDetailUI4;
                                            String str10 = str7;
                                            if (!z6 || !settingManageFindMoreDetailUI13.f53918t || booleanValue) {
                                                str2 = str10;
                                                settingManageFindMoreDetailUI2 = settingManageFindMoreDetailUI13;
                                                i = 1;
                                                settingManageFindMoreDetailUI2.mo24557M7(booleanValue, 34359738368L, 57);
                                            } else {
                                                String string7 = settingManageFindMoreDetailUI13.getContext().getResources().getString(C0966R.string.n58);
                                                C87412m.m108593f(string7, "context.resources.getStr…s_close_dlg_bottom_title)");
                                                String string8 = settingManageFindMoreDetailUI13.getContext().getResources().getString(C0966R.string.n57);
                                                C87412m.m108593f(string8, "context.resources.getStr…es_close_dlg_bottom_tips)");
                                                str3 = str10;
                                                i = 1;
                                                String str11 = string8;
                                                settingManageFindMoreDetailUI3 = settingManageFindMoreDetailUI13;
                                                settingManageFindMoreDetailUI13.mo24554J7(booleanValue, 11, string7, str11, (C15907f.C15908a) null);
                                                i3 = i6;
                                            }
                                        } else {
                                            SettingManageFindMoreDetailUI settingManageFindMoreDetailUI14 = settingManageFindMoreDetailUI4;
                                            C20974j.m23155i(settingManageFindMoreDetailUI4, 34359738368L, new C19193s0(settingManageFindMoreDetailUI4, booleanValue), new C19194t0(booleanValue, settingManageFindMoreDetailUI4), 2, false);
                                            str2 = str7;
                                            settingManageFindMoreDetailUI2 = settingManageFindMoreDetailUI14;
                                            i = 1;
                                        }
                                    } else {
                                        settingManageFindMoreDetailUI2 = settingManageFindMoreDetailUI4;
                                        str2 = str7;
                                        if (C87412m.m108589b(str5, ((C20838b) C86312j.m106911c(C20838b.class)).Fl0())) {
                                            if (WeChatBrands.Business.Entries.MeSetDiscoveryFinderLive.checkAvailable(settingManageFindMoreDetailUI2)) {
                                                settingManageFindMoreDetailUI2.mo24557M7(booleanValue, 9007199254740992L, 65);
                                                Log.m105924i(str2, "switch finderlive 65");
                                                if (booleanValue) {
                                                    j = 1;
                                                }
                                                DiscoverViewEntranceSettingStruct discoverViewEntranceSettingStruct2 = new DiscoverViewEntranceSettingStruct();
                                                discoverViewEntranceSettingStruct2.f48274d = 14;
                                                discoverViewEntranceSettingStruct2.f48275e = j;
                                                discoverViewEntranceSettingStruct2.f48276f = 1;
                                                discoverViewEntranceSettingStruct2.mo86054n();
                                                Log.m105924i("FindMoreSettingReport", "reportSwitch " + discoverViewEntranceSettingStruct2.mo1006q());
                                                i6 = 13;
                                            }
                                            SettingManageFindMoreDetailUI settingManageFindMoreDetailUI72222 = this.f53922d;
                                            C87412m.m108594g(settingManageFindMoreDetailUI72222, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                                            C39818r rVar2222 = C39818r.f106831a;
                                            C39622i0 a3522 = rVar2222.mo62444c(settingManageFindMoreDetailUI72222).mo75002a(cls);
                                            C87412m.m108593f(a3522, "UICProvider.of(activity)…stControlUIC::class.java)");
                                            boolean z34222 = booleanValue ^ i;
                                            ((C9208d) a3522).mo10016j3("ITEM_KEY_IS_NOTIFY", z34222);
                                            SettingManageFindMoreDetailUI settingManageFindMoreDetailUI82222 = this.f53922d;
                                            C87412m.m108594g(settingManageFindMoreDetailUI82222, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                                            C39622i0 a25222 = rVar2222.mo62444c(settingManageFindMoreDetailUI82222).mo75002a(cls);
                                            C87412m.m108593f(a25222, "UICProvider.of(activity)…stControlUIC::class.java)");
                                            ((C9208d) a25222).mo10016j3("ITEM_KEY_IS_SHOW_NEARBY", z34222);
                                            return C13598b0.f38549a;
                                        }
                                        i6 = -1;
                                    }
                                    i2 = i6;
                                    i5 = i2;
                                    z = false;
                                    Object[] objArr2222 = new Object[i];
                                    objArr2222[c] = Boolean.valueOf(z);
                                    Log.m105921e(str, "needShowCloseSwitchDilaogTips = %s", objArr2222);
                                    settingManageFindMoreDetailUI.f53913o.put(Integer.valueOf(i5), Integer.valueOf(booleanValue ? 1 : 0));
                                    SettingManageFindMoreDetailUI settingManageFindMoreDetailUI722222 = this.f53922d;
                                    C87412m.m108594g(settingManageFindMoreDetailUI722222, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                                    C39818r rVar22222 = C39818r.f106831a;
                                    C39622i0 a35222 = rVar22222.mo62444c(settingManageFindMoreDetailUI722222).mo75002a(cls);
                                    C87412m.m108593f(a35222, "UICProvider.of(activity)…stControlUIC::class.java)");
                                    boolean z342222 = booleanValue ^ i;
                                    ((C9208d) a35222).mo10016j3("ITEM_KEY_IS_NOTIFY", z342222);
                                    SettingManageFindMoreDetailUI settingManageFindMoreDetailUI822222 = this.f53922d;
                                    C87412m.m108594g(settingManageFindMoreDetailUI822222, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                                    C39622i0 a252222 = rVar22222.mo62444c(settingManageFindMoreDetailUI822222).mo75002a(cls);
                                    C87412m.m108593f(a252222, "UICProvider.of(activity)…stControlUIC::class.java)");
                                    ((C9208d) a252222).mo10016j3("ITEM_KEY_IS_SHOW_NEARBY", z342222);
                                    return C13598b0.f38549a;
                                }
                                settingManageFindMoreDetailUI2 = settingManageFindMoreDetailUI4;
                                str2 = str7;
                                i2 = i6;
                                i5 = i2;
                                z = false;
                                Object[] objArr22222 = new Object[i];
                                objArr22222[c] = Boolean.valueOf(z);
                                Log.m105921e(str, "needShowCloseSwitchDilaogTips = %s", objArr22222);
                                settingManageFindMoreDetailUI.f53913o.put(Integer.valueOf(i5), Integer.valueOf(booleanValue ? 1 : 0));
                                SettingManageFindMoreDetailUI settingManageFindMoreDetailUI7222222 = this.f53922d;
                                C87412m.m108594g(settingManageFindMoreDetailUI7222222, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                                C39818r rVar222222 = C39818r.f106831a;
                                C39622i0 a352222 = rVar222222.mo62444c(settingManageFindMoreDetailUI7222222).mo75002a(cls);
                                C87412m.m108593f(a352222, "UICProvider.of(activity)…stControlUIC::class.java)");
                                boolean z3422222 = booleanValue ^ i;
                                ((C9208d) a352222).mo10016j3("ITEM_KEY_IS_NOTIFY", z3422222);
                                SettingManageFindMoreDetailUI settingManageFindMoreDetailUI8222222 = this.f53922d;
                                C87412m.m108594g(settingManageFindMoreDetailUI8222222, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                                C39622i0 a2522222 = rVar222222.mo62444c(settingManageFindMoreDetailUI8222222).mo75002a(cls);
                                C87412m.m108593f(a2522222, "UICProvider.of(activity)…stControlUIC::class.java)");
                                ((C9208d) a2522222).mo10016j3("ITEM_KEY_IS_SHOW_NEARBY", z3422222);
                                return C13598b0.f38549a;
                            }
                            settingManageFindMoreDetailUI3 = settingManageFindMoreDetailUI5;
                            str3 = str4;
                            i3 = i6;
                        }
                    }
                    settingManageFindMoreDetailUI2 = settingManageFindMoreDetailUI10;
                    str2 = str7;
                    i = 1;
                    c = 0;
                    i2 = i6;
                    i5 = i2;
                    z = false;
                    Object[] objArr222222 = new Object[i];
                    objArr222222[c] = Boolean.valueOf(z);
                    Log.m105921e(str, "needShowCloseSwitchDilaogTips = %s", objArr222222);
                    settingManageFindMoreDetailUI.f53913o.put(Integer.valueOf(i5), Integer.valueOf(booleanValue ? 1 : 0));
                    SettingManageFindMoreDetailUI settingManageFindMoreDetailUI72222222 = this.f53922d;
                    C87412m.m108594g(settingManageFindMoreDetailUI72222222, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                    C39818r rVar2222222 = C39818r.f106831a;
                    C39622i0 a3522222 = rVar2222222.mo62444c(settingManageFindMoreDetailUI72222222).mo75002a(cls);
                    C87412m.m108593f(a3522222, "UICProvider.of(activity)…stControlUIC::class.java)");
                    boolean z34222222 = booleanValue ^ i;
                    ((C9208d) a3522222).mo10016j3("ITEM_KEY_IS_NOTIFY", z34222222);
                    SettingManageFindMoreDetailUI settingManageFindMoreDetailUI82222222 = this.f53922d;
                    C87412m.m108594g(settingManageFindMoreDetailUI82222222, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                    C39622i0 a25222222 = rVar2222222.mo62444c(settingManageFindMoreDetailUI82222222).mo75002a(cls);
                    C87412m.m108593f(a25222222, "UICProvider.of(activity)…stControlUIC::class.java)");
                    ((C9208d) a25222222).mo10016j3("ITEM_KEY_IS_SHOW_NEARBY", z34222222);
                    return C13598b0.f38549a;
                }
                i5 = i3;
                z = true;
                Object[] objArr2222222 = new Object[i];
                objArr2222222[c] = Boolean.valueOf(z);
                Log.m105921e(str, "needShowCloseSwitchDilaogTips = %s", objArr2222222);
                settingManageFindMoreDetailUI.f53913o.put(Integer.valueOf(i5), Integer.valueOf(booleanValue ? 1 : 0));
                SettingManageFindMoreDetailUI settingManageFindMoreDetailUI722222222 = this.f53922d;
                C87412m.m108594g(settingManageFindMoreDetailUI722222222, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                C39818r rVar22222222 = C39818r.f106831a;
                C39622i0 a35222222 = rVar22222222.mo62444c(settingManageFindMoreDetailUI722222222).mo75002a(cls);
                C87412m.m108593f(a35222222, "UICProvider.of(activity)…stControlUIC::class.java)");
                boolean z342222222 = booleanValue ^ i;
                ((C9208d) a35222222).mo10016j3("ITEM_KEY_IS_NOTIFY", z342222222);
                SettingManageFindMoreDetailUI settingManageFindMoreDetailUI822222222 = this.f53922d;
                C87412m.m108594g(settingManageFindMoreDetailUI822222222, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                C39622i0 a252222222 = rVar22222222.mo62444c(settingManageFindMoreDetailUI822222222).mo75002a(cls);
                C87412m.m108593f(a252222222, "UICProvider.of(activity)…stControlUIC::class.java)");
                ((C9208d) a252222222).mo10016j3("ITEM_KEY_IS_SHOW_NEARBY", z342222222);
                return C13598b0.f38549a;
            }
            z = false;
            i = 1;
            c = 0;
            Object[] objArr22222222 = new Object[i];
            objArr22222222[c] = Boolean.valueOf(z);
            Log.m105921e(str, "needShowCloseSwitchDilaogTips = %s", objArr22222222);
            settingManageFindMoreDetailUI.f53913o.put(Integer.valueOf(i5), Integer.valueOf(booleanValue ? 1 : 0));
            SettingManageFindMoreDetailUI settingManageFindMoreDetailUI7222222222 = this.f53922d;
            C87412m.m108594g(settingManageFindMoreDetailUI7222222222, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C39818r rVar222222222 = C39818r.f106831a;
            C39622i0 a352222222 = rVar222222222.mo62444c(settingManageFindMoreDetailUI7222222222).mo75002a(cls);
            C87412m.m108593f(a352222222, "UICProvider.of(activity)…stControlUIC::class.java)");
            boolean z3422222222 = booleanValue ^ i;
            ((C9208d) a352222222).mo10016j3("ITEM_KEY_IS_NOTIFY", z3422222222);
            SettingManageFindMoreDetailUI settingManageFindMoreDetailUI8222222222 = this.f53922d;
            C87412m.m108594g(settingManageFindMoreDetailUI8222222222, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C39622i0 a2522222222 = rVar222222222.mo62444c(settingManageFindMoreDetailUI8222222222).mo75002a(cls);
            C87412m.m108593f(a2522222222, "UICProvider.of(activity)…stControlUIC::class.java)");
            ((C9208d) a2522222222).mo10016j3("ITEM_KEY_IS_SHOW_NEARBY", z3422222222);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI$c */
    public static final class C19152c implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ SettingManageFindMoreDetailUI f53923d;

        public C19152c(SettingManageFindMoreDetailUI settingManageFindMoreDetailUI) {
            this.f53923d = settingManageFindMoreDetailUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f53923d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI$d */
    public static final class C19153d implements C15907f.C15908a {

        /* renamed from: a */
        public final /* synthetic */ boolean f53924a;

        /* renamed from: b */
        public final /* synthetic */ int f53925b;

        /* renamed from: c */
        public final /* synthetic */ SettingManageFindMoreDetailUI f53926c;

        /* renamed from: d */
        public final /* synthetic */ C15907f.C15908a f53927d;

        public C19153d(boolean z, int i, SettingManageFindMoreDetailUI settingManageFindMoreDetailUI, C15907f.C15908a aVar) {
            this.f53924a = z;
            this.f53925b = i;
            this.f53926c = settingManageFindMoreDetailUI;
            this.f53927d = aVar;
        }

        /* renamed from: a */
        public void mo9404a() {
            SettingManageFindMoreDetailUI settingManageFindMoreDetailUI = this.f53926c;
            C87412m.m108594g(settingManageFindMoreDetailUI, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C39622i0 a = C39818r.f106831a.mo62444c(settingManageFindMoreDetailUI).mo75002a(C9208d.class);
            C87412m.m108593f(a, "UICProvider.of(activity)…stControlUIC::class.java)");
            C9212e i3 = ((C9208d) a).mo10015i3("ITEM_KEY_IS_SHOW");
            C21121f fVar = i3 instanceof C21121f ? (C21121f) i3 : null;
            if (fVar != null) {
                fVar.mo32902d(!this.f53924a);
            }
            C15907f.C15908a aVar = this.f53927d;
            if (aVar != null) {
                aVar.mo9404a();
            }
        }

        public void onSuccess() {
            Log.m105918d("MicroMsg.SettingManageFindMoreDetailUI", "switchDiscoveryLooks checkPref.isChecked() = " + this.f53924a + ", entrance = " + this.f53925b);
            int i = this.f53925b;
            if (i == 3) {
                SettingManageFindMoreDetailUI settingManageFindMoreDetailUI = this.f53926c;
                boolean z = this.f53924a;
                if (!z) {
                    settingManageFindMoreDetailUI.getClass();
                    ((C14135q) C86312j.m106911c(C14135q.class)).eq0(settingManageFindMoreDetailUI, new C19195u0(false, settingManageFindMoreDetailUI, z));
                } else {
                    settingManageFindMoreDetailUI.mo24557M7(z, 2097152, 50);
                }
            } else if (i == 10) {
                SettingManageFindMoreDetailUI settingManageFindMoreDetailUI2 = this.f53926c;
                boolean z2 = this.f53924a;
                int i2 = SettingManageFindMoreDetailUI.f53904w;
                settingManageFindMoreDetailUI2.mo24555K7(z2);
            } else if (i == 11) {
                this.f53926c.mo24557M7(this.f53924a, 34359738368L, 57);
            } else if (i == 8) {
                SettingManageFindMoreDetailUI settingManageFindMoreDetailUI3 = this.f53926c;
                boolean z3 = this.f53924a;
                int i3 = SettingManageFindMoreDetailUI.f53904w;
                settingManageFindMoreDetailUI3.mo24557M7(z3, 16777216, 53);
            }
            SettingManageFindMoreDetailUI settingManageFindMoreDetailUI4 = this.f53926c;
            boolean z4 = this.f53924a;
            int i4 = this.f53925b;
            int i5 = SettingManageFindMoreDetailUI.f53904w;
            if (i4 >= 0) {
                settingManageFindMoreDetailUI4.f53913o.put(Integer.valueOf(i4), Integer.valueOf(z4 ? 1 : 0));
            } else {
                settingManageFindMoreDetailUI4.getClass();
            }
            C15907f.C15908a aVar = this.f53927d;
            if (aVar != null) {
                aVar.onSuccess();
            }
        }
    }

    /* renamed from: H7 */
    public final C21121f mo24552H7() {
        C21121f fVar = new C21121f("ITEM_KEY_IS_NOTIFY", this.f53906e);
        String string = MMApplicationContext.getContext().getString(C0966R.string.f8191ti);
        C87412m.m108593f(string, "getContext()\n           …nage_findmoreui_tip_desc)");
        fVar.f59720i = string;
        fVar.mo32903e();
        fVar.f59719h = new C19150a(this);
        fVar.mo32903e();
        return fVar;
    }

    /* renamed from: I7 */
    public final C21121f mo24553I7() {
        C21121f fVar = new C21121f("ITEM_KEY_IS_SHOW", this.f53905d);
        String string = MMApplicationContext.getContext().getString(C0966R.string.f8190tg);
        C87412m.m108593f(string, "getContext()\n           …age_findmoreui_show_desc)");
        fVar.f59720i = string;
        fVar.mo32903e();
        fVar.f59719h = new C19151b(this);
        fVar.mo32903e();
        return fVar;
    }

    /* renamed from: J7 */
    public final void mo24554J7(boolean z, int i, String str, String str2, C15907f.C15908a aVar) {
        if (Util.isNullOrNil(str)) {
            str = getContext().getResources().getString(C0966R.string.mdj);
        }
        if (Util.isNullOrNil(str2)) {
            str2 = getContext().getResources().getString(C0966R.string.mdi);
        }
        C20974j.m23153g(this, str, str2, "", new C19153d(z, i, this, aVar));
    }

    /* renamed from: K7 */
    public final void mo24555K7(boolean z) {
        ((C88908g) C86312j.m106911c(C88908g.class)).o20("labs_browse", z);
        this.f53908g = z ? this.f53908g & -67108865 : this.f53908g | 67108864;
    }

    /* renamed from: L7 */
    public final void mo24556L7(boolean z, long j) {
        Log.m105924i("MicroMsg.SettingManageFindMoreDetailUI", "switch ext change : open = " + z + " item value = " + j);
        this.f53909h = z ? this.f53909h & (~j) : this.f53909h | j;
        this.f53910i.put(Long.valueOf(j), Long.valueOf(z ? 0 : j));
    }

    /* renamed from: M7 */
    public final void mo24557M7(boolean z, long j, int i) {
        Log.m105924i("MicroMsg.SettingManageFindMoreDetailUI", "switch ext change : open = " + z + " item value = " + j + " functionId = " + i);
        this.f53908g = z ? (~j) & this.f53908g : j | this.f53908g;
        this.f53911j.put(Integer.valueOf(i), Integer.valueOf(z ? 1 : 2));
    }

    /* renamed from: N7 */
    public final void mo24558N7(boolean z, int i) {
        Log.m105925i("MicroMsg.SettingManageFindMoreDetailUI", "switch plugin flag, open %s, flag %d", Boolean.valueOf(z), Integer.valueOf(i));
        this.f53914p = !z ? this.f53914p | i : this.f53914p & (~i);
    }

    public void finish() {
        Intent intent = new Intent(getIntent());
        intent.putExtra("is_show_in_findmore", this.f53905d);
        intent.putExtra("is_new_notify", this.f53906e);
        intent.putExtra("is_show_nearby", this.f53907f);
        C13598b0 b0Var = C13598b0.f38549a;
        setResult(-1, intent);
        super.finish();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f7211xf;
    }

    public boolean isContentAtTop() {
        return !((WxRecyclerView) findViewById(C0966R.C0970id.olv)).canScrollVertically(-1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x02ea, code lost:
        if (((ky2.C10432i) di3.C86312j.m106911c(ky2.C10432i.class)).mo10750e() != false) goto L_0x02ec;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r20) {
        /*
            r19 = this;
            r0 = r19
            super.onCreate(r20)
            android.content.Intent r1 = r19.getIntent()
            java.lang.String r2 = "perf_key"
            java.lang.String r1 = r1.getStringExtra(r2)
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x0015
            r1 = r2
        L_0x0015:
            r0.f53919u = r1
            java.util.Map<java.lang.String, java.lang.Integer> r3 = hn2.C20991q.f59432a
            java.util.Map<java.lang.String, java.lang.Integer> r3 = hn2.C20991q.f59432a
            java.lang.Object r1 = r3.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r3 = 0
            if (r1 == 0) goto L_0x0029
            int r1 = r1.intValue()
            goto L_0x002a
        L_0x0029:
            r1 = 0
        L_0x002a:
            r0.f53920v = r1
            java.lang.Class<lc3.b> r1 = lc3.C10485b.class
            k40.a r1 = f40.C86709a0.m107533q(r1)
            lc3.b r1 = (lc3.C10485b) r1
            pj.f r1 = r1.vh0()
            java.lang.String r4 = "ExtFunctionSwitchEntry"
            int r1 = r1.mo107404b(r4, r3)
            r4 = 1
            if (r1 != r4) goto L_0x0043
            r1 = 1
            goto L_0x0044
        L_0x0043:
            r1 = 0
        L_0x0044:
            r0.f53918t = r1
            java.lang.Boolean r1 = eb0.C75592q0.m90762J()
            java.lang.String r5 = "isOverseaNewUser()"
            gy3.C87412m.m108593f(r1, r5)
            boolean r1 = r1.booleanValue()
            r0.f53917s = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "onCreate isShowWechatUserDialog = "
            r1.append(r5)
            boolean r5 = r0.f53918t
            r1.append(r5)
            java.lang.String r5 = "， isOverseaNewUser = "
            r1.append(r5)
            boolean r5 = r0.f53917s
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = "MicroMsg.SettingManageFindMoreDetailUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
            boolean r1 = eb0.C45628s0.m50756U()
            r0.f53915q = r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getCurrentLanguage(r19)
            java.lang.String r6 = "zh_CN"
            boolean r6 = gy3.C87412m.m108589b(r6, r1)
            if (r6 != 0) goto L_0x009b
            java.lang.String r6 = "zh_HK"
            boolean r6 = gy3.C87412m.m108589b(r6, r1)
            if (r6 != 0) goto L_0x009b
            java.lang.String r6 = "zh_TW"
            gy3.C87412m.m108589b(r6, r1)
        L_0x009b:
            long r6 = eb0.C75592q0.m90781k()
            r0.f53908g = r6
            int r1 = eb0.C75592q0.m90785o()
            r0.f53914p = r1
            long r6 = eb0.C75592q0.m90779i()
            r0.f53909h = r6
            android.content.Intent r1 = r19.getIntent()
            java.lang.String r6 = "is_show_in_findmore"
            boolean r1 = r1.getBooleanExtra(r6, r3)
            r0.f53905d = r1
            android.content.Intent r1 = r19.getIntent()
            java.lang.String r6 = "is_new_notify"
            boolean r1 = r1.getBooleanExtra(r6, r3)
            r0.f53906e = r1
            android.content.Intent r1 = r19.getIntent()
            java.lang.String r6 = "is_show_nearby"
            boolean r1 = r1.getBooleanExtra(r6, r3)
            r0.f53907f = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "onCreate isShowInFindMore = "
            r1.append(r6)
            boolean r6 = r0.f53905d
            r1.append(r6)
            java.lang.String r6 = " isNewNotify = "
            r1.append(r6)
            boolean r6 = r0.f53906e
            r1.append(r6)
            java.lang.String r6 = " isShowNearby = "
            r1.append(r6)
            boolean r6 = r0.f53907f
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
            r0.setMMTitle((java.lang.String) r2)
            android.content.res.Resources r1 = r19.getResources()
            r6 = 2131101833(0x7f060889, float:1.7816087E38)
            int r1 = r1.getColor(r6)
            r0.setActionbarColor(r1)
            android.view.Window r1 = r19.getWindow()
            android.content.res.Resources r6 = r19.getResources()
            r7 = 2131101688(0x7f0607f8, float:1.7815793E38)
            int r6 = r6.getColor(r7)
            r1.setStatusBarColor(r6)
            r1 = 2131313313(0x7f0942a1, float:1.824502E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            android.content.Intent r6 = r19.getIntent()
            r7 = 2131099810(0x7f0600a2, float:1.7811984E38)
            java.lang.String r8 = "perf_icon_res"
            int r6 = r6.getIntExtra(r8, r7)
            r1.setImageResource(r6)
            android.content.Intent r6 = r19.getIntent()
            java.lang.String r7 = "perf_icon_color"
            int r6 = r6.getIntExtra(r7, r3)
            android.graphics.PorterDuff$Mode r7 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r1.setColorFilter(r6, r7)
            r1 = 2131313314(0x7f0942a2, float:1.8245021E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.content.Intent r6 = r19.getIntent()
            java.lang.String r7 = "perf_title"
            java.lang.String r6 = r6.getStringExtra(r7)
            if (r6 == 0) goto L_0x0160
            r2 = r6
        L_0x0160:
            r1.setText(r2)
            com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI$c r1 = new com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI$c
            r1.<init>(r0)
            r0.setBackBtn(r1)
            java.lang.Class<in2.d> r1 = in2.C9208d.class
            int r2 = r0.f53920v
            java.lang.String r6 = "ITEM_KEY_IS_SHOW_NEARBY"
            java.lang.String r7 = "UICProvider.of(activity)…stControlUIC::class.java)"
            r8 = 0
            if (r2 == r4) goto L_0x030f
            r9 = 2
            if (r2 == r9) goto L_0x030f
            switch(r2) {
                case 4: goto L_0x030f;
                case 8: goto L_0x02fd;
                case 16: goto L_0x02fd;
                case 32: goto L_0x030f;
                case 64: goto L_0x02fd;
                case 128: goto L_0x0180;
                case 256: goto L_0x0180;
                case 512: goto L_0x030f;
                case 1024: goto L_0x030f;
                case 2048: goto L_0x02fd;
                case 4096: goto L_0x02fd;
                default: goto L_0x017c;
            }
        L_0x017c:
            sx3.f0 r2 = sx3.C64186f0.f181907d
            goto L_0x0335
        L_0x0180:
            in2.a[] r2 = new in2.C9205a[r9]
            in2.a r10 = new in2.a
            r10.<init>(r8, r4, r8)
            in2.f r11 = r19.mo24553I7()
            r10.mo10010b(r11)
            int r11 = r0.f53920v
            java.util.List<java.lang.Integer> r12 = hn2.C20991q.f59433b
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            boolean r11 = r12.contains(r11)
            if (r11 == 0) goto L_0x01a3
            in2.f r11 = r19.mo24552H7()
            r10.mo10010b(r11)
        L_0x01a3:
            rx3.b0 r11 = rx3.C13598b0.f38549a
            r2[r3] = r10
            in2.a r10 = new in2.a
            r10.<init>(r8, r4, r8)
            in2.f r11 = new in2.f
            boolean r12 = r0.f53907f
            r11.<init>(r6, r12)
            android.content.Context r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r13 = 2131836059(0x7f113c9b, float:1.9305274E38)
            java.lang.String r12 = r12.getString(r13)
            java.lang.String r13 = "getContext()\n           …e_findmoreui_nearby_desc)"
            gy3.C87412m.m108593f(r12, r13)
            r11.f59720i = r12
            r11.mo32903e()
            com.tencent.mm.plugin.setting.ui.setting.k0 r12 = new com.tencent.mm.plugin.setting.ui.setting.k0
            r12.<init>(r0)
            r11.f59719h = r12
            r11.mo32903e()
            java.lang.Class<ht1.t1> r12 = ht1.C60200t1.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            ht1.t1 r12 = (ht1.C60200t1) r12
            ht1.z4 r12 = r12.mo76861l7()
            boolean r12 = r12.mo83760G5()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r4)
            if (r12 == 0) goto L_0x02ec
            r14 = 70368744177664(0x400000000000, double:3.4766779039175E-310)
            long r8 = r0.f53908g
            long r8 = r8 & r14
            r14 = 0
            int r16 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r16 == 0) goto L_0x01f8
            r8 = 1
            goto L_0x01f9
        L_0x01f8:
            r8 = 0
        L_0x01f9:
            r8 = r8 ^ r4
            r16 = 512(0x200, double:2.53E-321)
            int r9 = r0.f53914p
            r18 = r13
            long r12 = (long) r9
            long r12 = r12 & r16
            int r9 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r9 != 0) goto L_0x0209
            r9 = 1
            goto L_0x020a
        L_0x0209:
            r9 = 0
        L_0x020a:
            r12 = 2
            java.lang.Object[] r12 = new java.lang.Object[r12]
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r8)
            r12[r3] = r13
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r9)
            r12[r4] = r13
            java.lang.String r13 = "openNearbyLiveFriends:%s openNearbyLiveFriendsPerson:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r13, r12)
            r5 = 5
            if (r8 == 0) goto L_0x022f
            java.util.Map<java.lang.Integer, java.lang.Integer> r8 = r0.f53912n
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r12 = r18
            r8.put(r5, r12)
            r5 = 0
            goto L_0x023f
        L_0x022f:
            r12 = r18
            java.util.Map<java.lang.Integer, java.lang.Integer> r8 = r0.f53912n
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            r8.put(r5, r13)
            r5 = 1
        L_0x023f:
            r8 = 4
            java.lang.String r13 = "ITEM_KEY_IS_SHOW"
            if (r9 == 0) goto L_0x026e
            bl3.r r9 = bl3.C39818r.f106831a
            bl3.r$a r9 = r9.mo62444c(r0)
            androidx.lifecycle.i0 r9 = r9.mo75002a(r1)
            gy3.C87412m.m108593f(r9, r7)
            in2.d r9 = (in2.C9208d) r9
            in2.e r9 = r9.mo10015i3(r13)
            boolean r14 = r9 instanceof in2.C21121f
            if (r14 == 0) goto L_0x025e
            in2.f r9 = (in2.C21121f) r9
            goto L_0x025f
        L_0x025e:
            r9 = 0
        L_0x025f:
            if (r9 == 0) goto L_0x0264
            r9.mo32902d(r4)
        L_0x0264:
            java.util.Map<java.lang.Integer, java.lang.Integer> r9 = r0.f53912n
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9.put(r8, r12)
            goto L_0x029b
        L_0x026e:
            bl3.r r9 = bl3.C39818r.f106831a
            bl3.r$a r9 = r9.mo62444c(r0)
            androidx.lifecycle.i0 r9 = r9.mo75002a(r1)
            gy3.C87412m.m108593f(r9, r7)
            in2.d r9 = (in2.C9208d) r9
            in2.e r9 = r9.mo10015i3(r13)
            boolean r12 = r9 instanceof in2.C21121f
            if (r12 == 0) goto L_0x0288
            in2.f r9 = (in2.C21121f) r9
            goto L_0x0289
        L_0x0288:
            r9 = 0
        L_0x0289:
            if (r9 == 0) goto L_0x028e
            r9.mo32902d(r3)
        L_0x028e:
            java.util.Map<java.lang.Integer, java.lang.Integer> r9 = r0.f53912n
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
            r9.put(r8, r12)
        L_0x029b:
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r8 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.MeSetDiscoveryNearbyLiveFriendsPerson
            boolean r9 = r8.restricted()
            if (r9 == 0) goto L_0x02de
            boolean r8 = r8.banned()
            if (r8 == 0) goto L_0x02bc
            bl3.r r3 = bl3.C39818r.f106831a
            bl3.r$a r3 = r3.mo62444c(r0)
            androidx.lifecycle.i0 r3 = r3.mo75002a(r1)
            gy3.C87412m.m108593f(r3, r7)
            in2.d r3 = (in2.C9208d) r3
            r3.mo10016j3(r6, r4)
            goto L_0x02de
        L_0x02bc:
            bl3.r r8 = bl3.C39818r.f106831a
            bl3.r$a r8 = r8.mo62444c(r0)
            androidx.lifecycle.i0 r8 = r8.mo75002a(r1)
            gy3.C87412m.m108593f(r8, r7)
            in2.d r8 = (in2.C9208d) r8
            in2.e r8 = r8.mo10015i3(r13)
            boolean r9 = r8 instanceof in2.C21121f
            if (r9 == 0) goto L_0x02d6
            in2.f r8 = (in2.C21121f) r8
            goto L_0x02d7
        L_0x02d6:
            r8 = 0
        L_0x02d7:
            if (r8 == 0) goto L_0x02de
            r8.f59721j = r3
            r8.mo32903e()
        L_0x02de:
            java.lang.Class<ky2.i> r3 = ky2.C10432i.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            ky2.i r3 = (ky2.C10432i) r3
            boolean r3 = r3.mo10750e()
            if (r3 == 0) goto L_0x02ed
        L_0x02ec:
            r5 = 1
        L_0x02ed:
            r3 = r5 ^ 1
            if (r3 != 0) goto L_0x02f3
            r11.f28964d = r4
        L_0x02f3:
            r10.mo10010b(r11)
            r2[r4] = r10
            java.util.List r2 = sx3.C64197v.m75537f(r2)
            goto L_0x0335
        L_0x02fd:
            in2.a r2 = new in2.a
            r3 = 0
            r2.<init>(r3, r4, r3)
            in2.f r3 = r19.mo24553I7()
            r2.mo10010b(r3)
            java.util.List r2 = sx3.C26236u.m33719b(r2)
            goto L_0x0335
        L_0x030f:
            r3 = r8
            in2.a r2 = new in2.a
            r2.<init>(r3, r4, r3)
            in2.f r3 = r19.mo24553I7()
            r2.mo10010b(r3)
            int r3 = r0.f53920v
            java.util.List<java.lang.Integer> r5 = hn2.C20991q.f59433b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = r5.contains(r3)
            if (r3 == 0) goto L_0x0331
            in2.f r3 = r19.mo24552H7()
            r2.mo10010b(r3)
        L_0x0331:
            java.util.List r2 = sx3.C26236u.m33719b(r2)
        L_0x0335:
            java.util.Iterator r2 = r2.iterator()
        L_0x0339:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0358
            java.lang.Object r3 = r2.next()
            in2.a r3 = (in2.C9205a) r3
            bl3.r r5 = bl3.C39818r.f106831a
            bl3.r$a r5 = r5.mo62444c(r0)
            androidx.lifecycle.i0 r5 = r5.mo75002a(r1)
            gy3.C87412m.m108593f(r5, r7)
            in2.d r5 = (in2.C9208d) r5
            r5.mo10014g3(r3)
            goto L_0x0339
        L_0x0358:
            bl3.r r2 = bl3.C39818r.f106831a
            bl3.r$a r3 = r2.mo62444c(r0)
            androidx.lifecycle.i0 r3 = r3.mo75002a(r1)
            gy3.C87412m.m108593f(r3, r7)
            in2.d r3 = (in2.C9208d) r3
            boolean r5 = r0.f53905d
            r5 = r5 ^ r4
            java.lang.String r8 = "ITEM_KEY_IS_NOTIFY"
            r3.mo10016j3(r8, r5)
            bl3.r$a r2 = r2.mo62444c(r0)
            androidx.lifecycle.i0 r1 = r2.mo75002a(r1)
            gy3.C87412m.m108593f(r1, r7)
            in2.d r1 = (in2.C9208d) r1
            boolean r2 = r0.f53905d
            r2 = r2 ^ r4
            r1.mo10016j3(r6, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.setting.p102ui.setting.SettingManageFindMoreDetailUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        Class cls = C75700k0.class;
        Log.m105924i("MicroMsg.SettingManageFindMoreDetailUI", "oplog extstatus:" + this.f53908g + ",pluginFlag:" + this.f53914p + ",discoveryCtrlFlag:" + this.f53909h);
        C86709a0.m107535s().mo121142i().mo119676J(147457, Long.valueOf(this.f53908g));
        C86709a0.m107535s().mo121142i().mo119676J(34, Integer.valueOf(this.f53914p));
        C86709a0.m107535s().mo121142i().mo119676J(147458, Long.valueOf(this.f53909h));
        for (Map.Entry entry : ((LinkedHashMap) this.f53911j).entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            int intValue2 = ((Number) entry.getValue()).intValue();
            C64266br1 br12 = new C64266br1();
            br12.f182324d = intValue;
            br12.f182325e = intValue2;
            ((C77885p) ((C75700k0) C86709a0.m107533q(cls)).mo96100XW()).mo107993q(new C32330n(23, br12));
            Log.m105924i("MicroMsg.SettingManageFindMoreDetailUI", "switch  " + intValue + ' ' + intValue2);
        }
        ((LinkedHashMap) this.f53911j).clear();
        for (Map.Entry entry2 : ((LinkedHashMap) this.f53910i).entrySet()) {
            long longValue = ((Number) entry2.getKey()).longValue();
            long longValue2 = ((Number) entry2.getValue()).longValue();
            C52185yy2 yy22 = new C52185yy2();
            yy22.f145577d = longValue;
            yy22.f145578e = longValue2;
            ((C77885p) ((C75700k0) C86709a0.m107533q(cls)).mo96100XW()).mo107993q(new C32330n(75, yy22));
            Log.m105924i("MicroMsg.SettingManageFindMoreDetailUI", "switchDiscoveryState switch " + longValue + ' ' + longValue2);
        }
        ((LinkedHashMap) this.f53910i).clear();
        C8233m XW = ((C75700k0) C86709a0.m107533q(cls)).mo96100XW();
        C77884m mVar = r2;
        C77884m mVar2 = new C77884m(2048, "", "", 0, "", "", "", 0, 0, 0, "", "", "", this.f53914p, "", 0, "", 0);
        ((C77885p) XW).mo107993q(mVar);
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_SNS_ENTRY_SWITCH_INT;
        for (Number intValue3 : ((LinkedHashMap) this.f53913o).keySet()) {
            int intValue4 = intValue3.intValue();
            if (this.f53912n.containsKey(Integer.valueOf(intValue4))) {
                if (((LinkedHashMap) this.f53912n).get(Integer.valueOf(intValue4)) != ((LinkedHashMap) this.f53913o).get(Integer.valueOf(intValue4))) {
                    C115669n.INSTANCE.mo160131h(15185, Integer.valueOf(intValue4), ((LinkedHashMap) this.f53913o).get(Integer.valueOf(intValue4)), 1);
                    if (intValue4 == 0) {
                        Integer num = (Integer) ((LinkedHashMap) this.f53913o).get(Integer.valueOf(intValue4));
                        if (num != null && num.intValue() == 0) {
                            C86709a0.m107535s().mo121142i().mo119677K(aVar, -1);
                        } else {
                            Integer num2 = (Integer) ((LinkedHashMap) this.f53913o).get(Integer.valueOf(intValue4));
                            if (num2 != null && num2.intValue() == 1) {
                                C86709a0.m107535s().mo121142i().mo119677K(aVar, 1);
                            }
                        }
                    }
                }
            }
        }
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(C9208d.class);
        hashSet.add(C71133a.class);
    }
}
