package com.tencent.p014mm.plugin.appbrand.p026ui;

import al3.C0086a;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import android.preference.Preference;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;
import com.tencent.luggage.sdk.processes.C80249b;
import com.tencent.luggage.sdk.processes.LuggageServiceType;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.C80936x;
import com.tencent.p014mm.ipcinvoker.C80937y;
import com.tencent.p014mm.plugin.appbrand.app.C1510o;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import com.tencent.p014mm.plugin.appbrand.appcache.C81352s2;
import com.tencent.p014mm.plugin.appbrand.debugger.console.C81720v;
import com.tencent.p014mm.plugin.appbrand.debugger.console.C81724w;
import com.tencent.p014mm.plugin.appbrand.launching.C83316f1;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84684v;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.plugin.appbrand.task.preload.C84327g;
import com.tencent.p014mm.plugin.appbrand.utils.C2039g2;
import com.tencent.p014mm.plugin.appbrand.utils.C84781r1;
import com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84840f0;
import com.tencent.p014mm.plugin.appbrand.widget.actionbar.AppBrandCapsuleFrameLayoutWithHotspot;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.weui.base.preference.CheckBoxPreference;
import com.tencent.weui.base.preference.WeUIPreference;
import com.tencent.xweb.XWebSdk;
import di0.C86299o;
import di3.C86312j;
import fy3.C32226l;
import gy3.C24564k0;
import gy3.C87412m;
import gy3.C87413o;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kr0.C76630x0;
import kr0.C88266d;
import kr0.C88273g1;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import p1032sc.C90160a;
import p1032sc.C90161b;
import p1032sc.C90165c;
import p170ic.C87690d;
import p176jc.C87919d;
import p385u2.C111105a;
import p819pc.C47454d;
import p910lj.C76701a;
import qo3.C77389a;
import qo3.C77398g;
import qo3.C77407n;
import qw3.C89853a;
import qw3.C89854b;
import rx3.C13598b0;
import rx3.C13604l;
import rx3.C36570n;
import sx3.C36907w;
import sx3.C77813z;
import ux3.C65486b;
import wi0.C90989n;
import z04.C112550d0;
import z04.C112551y;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/AppBrandDebugUI;", "Lcom/tencent/weui/base/preference/WeUIPreference;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI */
public final class AppBrandDebugUI extends WeUIPreference {

    /* renamed from: E */
    public static final /* synthetic */ int f246301E = 0;

    /* renamed from: D */
    public final HashMap<String, C32226l<Preference, C13598b0>> f246302D = new HashMap<>();

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$a */
    public static final class C84358a extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ AppBrandDebugUI f246303d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C84358a(AppBrandDebugUI appBrandDebugUI) {
            super(1);
            this.f246303d = appBrandDebugUI;
        }

        /* JADX WARNING: type inference failed for: r0v11, types: [android.preference.Preference] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r5) {
            /*
                r4 = this;
                com.tencent.weui.base.preference.CheckBoxPreference r5 = (com.tencent.weui.base.preference.CheckBoxPreference) r5
                java.lang.String r0 = "it"
                gy3.C87412m.m108594g(r5, r0)
                boolean r0 = r5.mo8242b()
                r1 = 0
                if (r0 == 0) goto L_0x0060
                com.tencent.p014mm.plugin.appbrand.p026ui.C84566n2.m104157f(r1)
                r0 = 1
                com.tencent.p014mm.plugin.appbrand.p026ui.C84566n2.m104158g(r0)
                com.tencent.p014mm.plugin.appbrand.p026ui.C84566n2.m104155d(r1)
                com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI r2 = r4.f246303d
                com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandDebugUI.m103985N7(r2, r5, r0)
                com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI r5 = r4.f246303d
                qw3.b r0 = r5.f250544z
                java.lang.String r2 = "pref_key_enable_single_task_dispatch"
                android.preference.Preference r0 = r0.mo124137b(r2)
                boolean r2 = r0 instanceof com.tencent.weui.base.preference.CheckBoxPreference
                r3 = 0
                if (r2 == 0) goto L_0x0030
                com.tencent.weui.base.preference.CheckBoxPreference r0 = (com.tencent.weui.base.preference.CheckBoxPreference) r0
                goto L_0x0031
            L_0x0030:
                r0 = r3
            L_0x0031:
                com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandDebugUI.m103985N7(r5, r0, r1)
                com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI r5 = r4.f246303d
                qw3.b r0 = r5.f250544z
                java.lang.String r2 = "pref_key_appbrand_runtime_run_in_mm_process"
                android.preference.Preference r0 = r0.mo124137b(r2)
                boolean r2 = r0 instanceof com.tencent.weui.base.preference.CheckBoxPreference
                if (r2 == 0) goto L_0x0046
                com.tencent.weui.base.preference.CheckBoxPreference r0 = (com.tencent.weui.base.preference.CheckBoxPreference) r0
                goto L_0x0047
            L_0x0046:
                r0 = r3
            L_0x0047:
                com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandDebugUI.m103985N7(r5, r0, r1)
                com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI r5 = r4.f246303d
                qw3.b r0 = r5.f250544z
                java.lang.String r2 = "pref_key_enable_legacy_tasks_dispatch"
                android.preference.Preference r0 = r0.mo124137b(r2)
                boolean r2 = r0 instanceof com.tencent.weui.base.preference.CheckBoxPreference
                if (r2 == 0) goto L_0x005c
                r3 = r0
                com.tencent.weui.base.preference.CheckBoxPreference r3 = (com.tencent.weui.base.preference.CheckBoxPreference) r3
            L_0x005c:
                com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandDebugUI.m103985N7(r5, r3, r1)
                goto L_0x0068
            L_0x0060:
                com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI r0 = r4.f246303d
                com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandDebugUI.m103985N7(r0, r5, r1)
                com.tencent.p014mm.plugin.appbrand.p026ui.C84566n2.m104158g(r1)
            L_0x0068:
                rx3.b0 r5 = rx3.C13598b0.f38549a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandDebugUI.C84358a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$a0 */
    public static final class C84359a0 extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84359a0 f246304d = new C84359a0();

        public C84359a0() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            C84684v.C84685a aVar = C84684v.Companion;
            boolean b = checkBoxPreference.mo8242b();
            aVar.getClass();
            C84684v.forceCenterInside$delegate.mo124239c(aVar, C84684v.C84685a.f247050a[0], Boolean.valueOf(b));
            C84781r1 r1Var = C84781r1.f247203a;
            boolean b2 = checkBoxPreference.mo8242b();
            r1Var.getClass();
            C84781r1.f247205c.mo124239c(r1Var, C84781r1.f247204b[0], Boolean.valueOf(b2));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$a1 */
    public static final class C84360a1 extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ AppBrandDebugUI f246305d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C84360a1(AppBrandDebugUI appBrandDebugUI) {
            super(1);
            this.f246305d = appBrandDebugUI;
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            AppBrandDebugUI appBrandDebugUI = this.f246305d;
            boolean z = !checkBoxPreference.mo8242b();
            int i = C81352s2.f238828a;
            if (z != MultiProcessMMKV.getMMKV("__appbrand_comm_lib__prefs").getBoolean("disable_develop_lib", false)) {
                MultiProcessMMKV.getMMKV("__appbrand_comm_lib__prefs").putBoolean("disable_develop_lib", z).commit();
                C77389a aVar = new C77389a();
                aVar.f225660q = "重启微信使内置基础库更改生效";
                aVar.f225663t = "重启";
                aVar.f225620C = new C84484b0(appBrandDebugUI);
                aVar.f225664u = C0086a.m38a(appBrandDebugUI).getString(C0966R.string.f7926wf);
                aVar.f225668y = false;
                C77398g gVar = new C77398g(appBrandDebugUI, C0966R.style.a66);
                gVar.mo107525e(aVar);
                gVar.show();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$b */
    public static final class C84361b extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84361b f246306d = new C84361b();

        public C84361b() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            checkBoxPreference.f25005d = ((Boolean) C87919d.f254460d.mo124238b(C87919d.f254457a, C87919d.f254458b[0])).booleanValue();
            checkBoxPreference.mo8243c(8);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$b0 */
    public static final class C84362b0 extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84362b0 f246307d = new C84362b0();

        public C84362b0() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            checkBoxPreference.f25005d = C84684v.Companion.mo117404a();
            checkBoxPreference.mo8243c(8);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$b1 */
    public static final class C84363b1 extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84363b1 f246308d = new C84363b1();

        public C84363b1() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            C88266d dVar = C88266d.f255124a;
            dVar.getClass();
            checkBoxPreference.f25005d = ((Boolean) C88266d.f255126c.mo124238b(dVar, C88266d.f255125b[0])).booleanValue();
            checkBoxPreference.mo8243c(8);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$c */
    public static final class C84364c extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84364c f246309d = new C84364c();

        public C84364c() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            C87919d.f254460d.mo124239c(C87919d.f254457a, C87919d.f254458b[0], Boolean.valueOf(checkBoxPreference.mo8242b()));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$c0 */
    public static final class C84365c0 extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84365c0 f246310d = new C84365c0();

        public C84365c0() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            C84684v.C84685a aVar = C84684v.Companion;
            boolean b = checkBoxPreference.mo8242b();
            aVar.getClass();
            C84684v.forceNotCenterInside$delegate.mo124239c(aVar, C84684v.C84685a.f247050a[1], Boolean.valueOf(b));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$c1 */
    public static final class C84366c1 extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84366c1 f246311d = new C84366c1();

        public C84366c1() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            checkBoxPreference.f25005d = AppBrandCapsuleFrameLayoutWithHotspot.f247509g.mo117726a();
            checkBoxPreference.mo8243c(8);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$d */
    public static final class C84367d extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84367d f246312d = new C84367d();

        public C84367d() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            checkBoxPreference.f25005d = !C84566n2.m104160i() && !C84566n2.m104161j() && !C84566n2.m104162k();
            checkBoxPreference.mo8243c(8);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$d0 */
    public static final class C84368d0 extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84368d0 f246313d = new C84368d0();

        public C84368d0() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            checkBoxPreference.f25005d = Integer.MAX_VALUE != C81720v.f239837b;
            checkBoxPreference.mo8243c(8);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$d1 */
    public static final class C84369d1 extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84369d1 f246314d = new C84369d1();

        public C84369d1() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            C88266d dVar = C88266d.f255124a;
            boolean b = checkBoxPreference.mo8242b();
            dVar.getClass();
            C88266d.f255126c.mo124239c(dVar, C88266d.f255125b[0], Boolean.valueOf(b));
            MultiProcessMMKV.getMMKV("_devtools_processor_command").putBoolean("debugger", b);
            if (checkBoxPreference.mo8242b()) {
                C84327g.m103945b(true);
                C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) "为避免多实例干扰, 已自动关闭预载, 重启微信生效", 0).show();
            }
            checkBoxPreference.mo8244e(checkBoxPreference.mo8242b());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$e */
    public static final class C84370e extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ AppBrandDebugUI f246315d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C84370e(AppBrandDebugUI appBrandDebugUI) {
            super(1);
            this.f246315d = appBrandDebugUI;
        }

        /* JADX WARNING: type inference failed for: r0v14, types: [android.preference.Preference] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r6) {
            /*
                r5 = this;
                com.tencent.weui.base.preference.CheckBoxPreference r6 = (com.tencent.weui.base.preference.CheckBoxPreference) r6
                java.lang.String r0 = "it"
                gy3.C87412m.m108594g(r6, r0)
                boolean r0 = r6.mo8242b()
                r1 = 0
                if (r0 == 0) goto L_0x006f
                java.lang.Boolean r0 = com.tencent.p014mm.plugin.appbrand.p026ui.C84566n2.f246763a
                com.tencent.mm.plugin.appbrand.app.o r0 = com.tencent.p014mm.plugin.appbrand.app.C1510o.f10864a
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = r0.mo1516a()
                if (r0 == 0) goto L_0x0026
                java.lang.String r2 = "enable_single_task_dispatch"
                java.lang.String r3 = "enable_three_proc_tasks_dispatch"
                java.lang.String r4 = "pref_key_run_in_mm_strategy_mmkv_config"
                java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4}
                r0.removeValuesForKeys(r2)
            L_0x0026:
                com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI r0 = r5.f246315d
                r2 = 1
                com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandDebugUI.m103985N7(r0, r6, r2)
                com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI r6 = r5.f246315d
                qw3.b r0 = r6.f250544z
                java.lang.String r2 = "pref_key_enable_single_task_dispatch"
                android.preference.Preference r0 = r0.mo124137b(r2)
                boolean r2 = r0 instanceof com.tencent.weui.base.preference.CheckBoxPreference
                r3 = 0
                if (r2 == 0) goto L_0x003f
                com.tencent.weui.base.preference.CheckBoxPreference r0 = (com.tencent.weui.base.preference.CheckBoxPreference) r0
                goto L_0x0040
            L_0x003f:
                r0 = r3
            L_0x0040:
                com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandDebugUI.m103985N7(r6, r0, r1)
                com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI r6 = r5.f246315d
                qw3.b r0 = r6.f250544z
                java.lang.String r2 = "pref_key_enable_three_proc_tasks_dispatch"
                android.preference.Preference r0 = r0.mo124137b(r2)
                boolean r2 = r0 instanceof com.tencent.weui.base.preference.CheckBoxPreference
                if (r2 == 0) goto L_0x0055
                com.tencent.weui.base.preference.CheckBoxPreference r0 = (com.tencent.weui.base.preference.CheckBoxPreference) r0
                goto L_0x0056
            L_0x0055:
                r0 = r3
            L_0x0056:
                com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandDebugUI.m103985N7(r6, r0, r1)
                com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI r6 = r5.f246315d
                qw3.b r0 = r6.f250544z
                java.lang.String r2 = "pref_key_appbrand_runtime_run_in_mm_process"
                android.preference.Preference r0 = r0.mo124137b(r2)
                boolean r2 = r0 instanceof com.tencent.weui.base.preference.CheckBoxPreference
                if (r2 == 0) goto L_0x006b
                r3 = r0
                com.tencent.weui.base.preference.CheckBoxPreference r3 = (com.tencent.weui.base.preference.CheckBoxPreference) r3
            L_0x006b:
                com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandDebugUI.m103985N7(r6, r3, r1)
                goto L_0x0074
            L_0x006f:
                com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI r0 = r5.f246315d
                com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandDebugUI.m103985N7(r0, r6, r1)
            L_0x0074:
                rx3.b0 r6 = rx3.C13598b0.f38549a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandDebugUI.C84370e.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$e0 */
    public static final class C84371e0 extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84371e0 f246316d = new C84371e0();

        public C84371e0() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            C81720v vVar = C81720v.f239836a;
            int i = checkBoxPreference.mo8242b() ? 4 : Integer.MAX_VALUE;
            int i2 = C81720v.f239837b;
            Log.m105924i("MicroMsg.AppBrand.ConsolePrinterAccessible", "set#printLevel, oldValue: " + i2 + ", newValue: " + i);
            if (i2 != i) {
                C81720v.f239837b = i;
                MultiProcessMMKV a = C1510o.f10864a.mo1516a();
                if (a != null) {
                    a.putInt("ConsolePrinterPrintLevel", i);
                }
                Log.m105924i("MicroMsg.AppBrand.ConsolePrinterAccessible", "onPrintLevelChange, oldLevel: " + i2 + ", newLevel: " + i);
                boolean z = true;
                if (!(2 <= i2 && i2 < 6)) {
                    if (2 <= i && i < 6) {
                        vVar.mo114086a();
                    }
                }
                if (!(2 <= i && i < 6)) {
                    if (2 <= i2 && i2 < 6) {
                        Log.m105924i("MicroMsg.AppBrand.ConsolePrinterAccessible", "disable");
                        if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || WeChatEnvironment.hasDebugger()) {
                            int i3 = C81720v.f239837b;
                            if (2 > i3 || i3 >= 6) {
                                z = false;
                            }
                            if (!z) {
                                if (vVar.mo114088c()) {
                                    ((C119157j) C119157j.f356862d).mo183895z(C81724w.f239844d);
                                }
                                if (vVar.mo114088c() || ((Boolean) ((C36570n) C81720v.f239839d).getValue()).booleanValue()) {
                                    C80669j.f236039k = null;
                                }
                            }
                        }
                        Log.m105924i("MicroMsg.AppBrand.ConsolePrinterAccessible", "disable, not need");
                    }
                }
                if (vVar.mo114088c() || ((Boolean) ((C36570n) C81720v.f239839d).getValue()).booleanValue()) {
                    vVar.mo114087b().f239795b = i;
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$e1 */
    public static final class C84372e1 extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84372e1 f246317d = new C84372e1();

        public C84372e1() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            C88266d dVar = C88266d.f255124a;
            dVar.getClass();
            checkBoxPreference.f25005d = ((Boolean) C88266d.f255127d.mo124238b(dVar, C88266d.f255125b[1])).booleanValue();
            checkBoxPreference.mo8243c(8);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$f */
    public static final class C84373f extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84373f f246318d = new C84373f();

        public C84373f() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            checkBoxPreference.f25005d = C84566n2.m104160i();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$f0 */
    public static final class C84374f0 extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84374f0 f246319d = new C84374f0();

        public C84374f0() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            checkBoxPreference.f25005d = C84840f0.f247297a.mo117569a();
            checkBoxPreference.mo8243c(8);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$f1 */
    public static final class C84375f1 extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84375f1 f246320d = new C84375f1();

        public C84375f1() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            C88266d dVar = C88266d.f255124a;
            boolean b = checkBoxPreference.mo8242b();
            dVar.getClass();
            C88266d.f255127d.mo124239c(dVar, C88266d.f255125b[1], Boolean.valueOf(b));
            checkBoxPreference.mo8244e(checkBoxPreference.mo8242b());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$g */
    public static final class C84376g extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ AppBrandDebugUI f246321d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C84376g(AppBrandDebugUI appBrandDebugUI) {
            super(1);
            this.f246321d = appBrandDebugUI;
        }

        /* JADX WARNING: type inference failed for: r0v14, types: [android.preference.Preference] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r5) {
            /*
                r4 = this;
                com.tencent.weui.base.preference.CheckBoxPreference r5 = (com.tencent.weui.base.preference.CheckBoxPreference) r5
                java.lang.String r0 = "it"
                gy3.C87412m.m108594g(r5, r0)
                boolean r0 = r5.mo8242b()
                r1 = 0
                if (r0 == 0) goto L_0x0079
                com.tencent.p014mm.plugin.appbrand.p026ui.C84566n2.m104157f(r1)
                com.tencent.p014mm.plugin.appbrand.p026ui.C84566n2.m104158g(r1)
                com.tencent.p014mm.plugin.appbrand.p026ui.C84566n2.m104154c(r1)
                r0 = 1
                com.tencent.p014mm.plugin.appbrand.p026ui.C84566n2.m104155d(r0)
                com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI r2 = r4.f246321d
                com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandDebugUI.m103985N7(r2, r5, r0)
                com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI r5 = r4.f246321d
                qw3.b r0 = r5.f250544z
                java.lang.String r2 = "pref_key_enable_single_task_dispatch"
                android.preference.Preference r0 = r0.mo124137b(r2)
                boolean r2 = r0 instanceof com.tencent.weui.base.preference.CheckBoxPreference
                r3 = 0
                if (r2 == 0) goto L_0x0033
                com.tencent.weui.base.preference.CheckBoxPreference r0 = (com.tencent.weui.base.preference.CheckBoxPreference) r0
                goto L_0x0034
            L_0x0033:
                r0 = r3
            L_0x0034:
                com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandDebugUI.m103985N7(r5, r0, r1)
                com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI r5 = r4.f246321d
                qw3.b r0 = r5.f250544z
                java.lang.String r2 = "pref_key_enable_three_proc_tasks_dispatch"
                android.preference.Preference r0 = r0.mo124137b(r2)
                boolean r2 = r0 instanceof com.tencent.weui.base.preference.CheckBoxPreference
                if (r2 == 0) goto L_0x0049
                com.tencent.weui.base.preference.CheckBoxPreference r0 = (com.tencent.weui.base.preference.CheckBoxPreference) r0
                goto L_0x004a
            L_0x0049:
                r0 = r3
            L_0x004a:
                com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandDebugUI.m103985N7(r5, r0, r1)
                com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI r5 = r4.f246321d
                qw3.b r0 = r5.f250544z
                java.lang.String r2 = "pref_key_enable_legacy_tasks_dispatch"
                android.preference.Preference r0 = r0.mo124137b(r2)
                boolean r2 = r0 instanceof com.tencent.weui.base.preference.CheckBoxPreference
                if (r2 == 0) goto L_0x005f
                com.tencent.weui.base.preference.CheckBoxPreference r0 = (com.tencent.weui.base.preference.CheckBoxPreference) r0
                goto L_0x0060
            L_0x005f:
                r0 = r3
            L_0x0060:
                com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandDebugUI.m103985N7(r5, r0, r1)
                com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI r5 = r4.f246321d
                qw3.b r0 = r5.f250544z
                java.lang.String r2 = "pref_key_appbrand_runtime_fallback_to_run_in_mm_process_if_no_appbrand_process"
                android.preference.Preference r0 = r0.mo124137b(r2)
                boolean r2 = r0 instanceof com.tencent.weui.base.preference.CheckBoxPreference
                if (r2 == 0) goto L_0x0075
                r3 = r0
                com.tencent.weui.base.preference.CheckBoxPreference r3 = (com.tencent.weui.base.preference.CheckBoxPreference) r3
            L_0x0075:
                com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandDebugUI.m103985N7(r5, r3, r1)
                goto L_0x0081
            L_0x0079:
                com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI r0 = r4.f246321d
                com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandDebugUI.m103985N7(r0, r5, r1)
                com.tencent.p014mm.plugin.appbrand.p026ui.C84566n2.m104155d(r1)
            L_0x0081:
                rx3.b0 r5 = rx3.C13598b0.f38549a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandDebugUI.C84376g.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$g0 */
    public static final class C84377g0 extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84377g0 f246322d = new C84377g0();

        public C84377g0() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            checkBoxPreference.f25005d = C90989n.f261076a.getBoolean("ENABLE_ALL_APP_DEBUG", false);
            checkBoxPreference.mo8243c(8);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$g1 */
    public static final class C84378g1 extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84378g1 f246323d = new C84378g1();

        public C84378g1() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            checkBoxPreference.f25005d = C84499c0.m104088b();
            checkBoxPreference.mo8243c(8);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$h */
    public static final class C84379h extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84379h f246324d = new C84379h();

        public C84379h() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            checkBoxPreference.f25005d = C84566n2.m104152a();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$h0 */
    public static final class C84380h0 extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84380h0 f246325d = new C84380h0();

        public C84380h0() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            C84840f0 f0Var = C84840f0.f247297a;
            boolean b = checkBoxPreference.mo8242b();
            f0Var.getClass();
            C84840f0.f247300d.mo124239c(f0Var, C84840f0.f247298b[0], Boolean.valueOf(b));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$h1 */
    public static final class C84381h1 extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84381h1 f246326d = new C84381h1();

        public C84381h1() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            PluginAppBrand.getProcessSharedPrefs().edit().putBoolean("AppBrandDebugUI.WEAPP_ALL_CONTACT_TRANSPARENT_BACKGROUND_ENABLED", checkBoxPreference.mo8242b()).apply();
            checkBoxPreference.mo8244e(checkBoxPreference.mo8242b());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$i */
    public static final class C84382i extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ AppBrandDebugUI f246327d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C84382i(AppBrandDebugUI appBrandDebugUI) {
            super(1);
            this.f246327d = appBrandDebugUI;
        }

        /* JADX WARNING: type inference failed for: r0v11, types: [android.preference.Preference] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r5) {
            /*
                r4 = this;
                com.tencent.weui.base.preference.CheckBoxPreference r5 = (com.tencent.weui.base.preference.CheckBoxPreference) r5
                java.lang.String r0 = "it"
                gy3.C87412m.m108594g(r5, r0)
                boolean r0 = r5.mo8242b()
                r1 = 0
                if (r0 == 0) goto L_0x0063
                com.tencent.p014mm.plugin.appbrand.p026ui.C84566n2.m104157f(r1)
                com.tencent.p014mm.plugin.appbrand.p026ui.C84566n2.m104158g(r1)
                com.tencent.p014mm.plugin.appbrand.p026ui.C84566n2.m104155d(r1)
                r0 = 1
                com.tencent.p014mm.plugin.appbrand.p026ui.C84566n2.m104154c(r0)
                com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI r2 = r4.f246327d
                com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandDebugUI.m103985N7(r2, r5, r0)
                com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI r5 = r4.f246327d
                qw3.b r0 = r5.f250544z
                java.lang.String r2 = "pref_key_enable_single_task_dispatch"
                android.preference.Preference r0 = r0.mo124137b(r2)
                boolean r2 = r0 instanceof com.tencent.weui.base.preference.CheckBoxPreference
                r3 = 0
                if (r2 == 0) goto L_0x0033
                com.tencent.weui.base.preference.CheckBoxPreference r0 = (com.tencent.weui.base.preference.CheckBoxPreference) r0
                goto L_0x0034
            L_0x0033:
                r0 = r3
            L_0x0034:
                com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandDebugUI.m103985N7(r5, r0, r1)
                com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI r5 = r4.f246327d
                qw3.b r0 = r5.f250544z
                java.lang.String r2 = "pref_key_enable_three_proc_tasks_dispatch"
                android.preference.Preference r0 = r0.mo124137b(r2)
                boolean r2 = r0 instanceof com.tencent.weui.base.preference.CheckBoxPreference
                if (r2 == 0) goto L_0x0049
                com.tencent.weui.base.preference.CheckBoxPreference r0 = (com.tencent.weui.base.preference.CheckBoxPreference) r0
                goto L_0x004a
            L_0x0049:
                r0 = r3
            L_0x004a:
                com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandDebugUI.m103985N7(r5, r0, r1)
                com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI r5 = r4.f246327d
                qw3.b r0 = r5.f250544z
                java.lang.String r2 = "pref_key_appbrand_runtime_run_in_mm_process"
                android.preference.Preference r0 = r0.mo124137b(r2)
                boolean r2 = r0 instanceof com.tencent.weui.base.preference.CheckBoxPreference
                if (r2 == 0) goto L_0x005f
                r3 = r0
                com.tencent.weui.base.preference.CheckBoxPreference r3 = (com.tencent.weui.base.preference.CheckBoxPreference) r3
            L_0x005f:
                com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandDebugUI.m103985N7(r5, r3, r1)
                goto L_0x006b
            L_0x0063:
                com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI r0 = r4.f246327d
                com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandDebugUI.m103985N7(r0, r5, r1)
                com.tencent.p014mm.plugin.appbrand.p026ui.C84566n2.m104154c(r1)
            L_0x006b:
                rx3.b0 r5 = rx3.C13598b0.f38549a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandDebugUI.C84382i.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$i0 */
    public static final class C84383i0 extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84383i0 f246328d = new C84383i0();

        public C84383i0() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            checkBoxPreference.f25005d = C84840f0.f247297a.mo117572d();
            checkBoxPreference.mo8243c(8);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$i1 */
    public static final class C84384i1 implements C80936x {

        /* renamed from: a */
        public final /* synthetic */ String f246329a;

        public C84384i1(String str) {
            this.f246329a = str;
        }

        /* renamed from: a */
        public final void mo112721a() {
            Log.m105924i("MicroMsg.AppBrandDebugUI", "onPostCreate: disconnect:" + this.f246329a);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$j */
    public static final class C84385j extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84385j f246330d = new C84385j();

        public C84385j() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            checkBoxPreference.f25005d = C84566n2.m104163l();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$j0 */
    public static final class C84386j0 extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84386j0 f246331d = new C84386j0();

        public C84386j0() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            C84840f0 f0Var = C84840f0.f247297a;
            boolean b = checkBoxPreference.mo8242b();
            f0Var.getClass();
            C84840f0.f247301e.mo124239c(f0Var, C84840f0.f247298b[1], Boolean.valueOf(b));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$j1 */
    public static final class C84387j1 implements C80937y {

        /* renamed from: a */
        public final /* synthetic */ String f246332a;

        public C84387j1(String str) {
            this.f246332a = str;
        }

        /* renamed from: r0 */
        public final void mo112722r0() {
            Log.m105924i("MicroMsg.AppBrandDebugUI", "onPostCreate: reconnect:" + this.f246332a);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$k */
    public static final class C84388k extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84388k f246333d = new C84388k();

        public C84388k() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            checkBoxPreference.f25005d = !C84327g.m103944a();
            checkBoxPreference.mo8243c(8);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$k0 */
    public static final class C84389k0 extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84389k0 f246334d = new C84389k0();

        public C84389k0() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            checkBoxPreference.f25005d = C84840f0.f247297a.mo117574f();
            checkBoxPreference.mo8243c(8);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$k1 */
    public static final class C84390k1 extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84390k1 f246335d = new C84390k1();

        public C84390k1() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            AppBrandCapsuleFrameLayoutWithHotspot.C84919a aVar = AppBrandCapsuleFrameLayoutWithHotspot.f247509g;
            boolean b = checkBoxPreference.mo8242b();
            aVar.getClass();
            AppBrandCapsuleFrameLayoutWithHotspot.f247510h.mo124239c(aVar, AppBrandCapsuleFrameLayoutWithHotspot.C84919a.f247514a[0], Boolean.valueOf(b));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$l */
    public static final class C84391l extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ AppBrandDebugUI f246336d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C84391l(AppBrandDebugUI appBrandDebugUI) {
            super(1);
            this.f246336d = appBrandDebugUI;
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            if (!checkBoxPreference.mo8242b()) {
                AppBrandDebugUI.m103985N7(this.f246336d, checkBoxPreference, false);
                C84566n2.m104156e(0);
            } else if (!XWebSdk.supportMultiProcess(MMApplicationContext.getContext())) {
                checkBoxPreference.mo8244e(false);
                C76701a.makeText(this.f246336d.getApplicationContext(), (CharSequence) "当前内核不支持多进程", 0).show();
            } else {
                Preference b = this.f246336d.f250544z.mo124137b("pref_key_enable_xweb_multi_process_render_gpu");
                CheckBoxPreference checkBoxPreference2 = b instanceof CheckBoxPreference ? (CheckBoxPreference) b : null;
                C87412m.m108591d(checkBoxPreference2);
                if (checkBoxPreference2.mo8242b()) {
                    C84566n2.m104156e(2);
                } else {
                    C84566n2.m104156e(1);
                }
                AppBrandDebugUI.m103985N7(this.f246336d, checkBoxPreference, true);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$l0 */
    public static final class C84392l0 extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84392l0 f246337d = new C84392l0();

        public C84392l0() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            C84840f0 f0Var = C84840f0.f247297a;
            boolean b = checkBoxPreference.mo8242b();
            f0Var.getClass();
            C84840f0.f247305i.mo124239c(f0Var, C84840f0.f247298b[5], Boolean.valueOf(b));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$l1 */
    public static final class C84393l1 extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84393l1 f246338d = new C84393l1();

        public C84393l1() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            checkBoxPreference.f25005d = C84566n2.m104161j();
            checkBoxPreference.mo8243c(8);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$m */
    public static final class C84394m extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84394m f246339d = new C84394m();

        public C84394m() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            checkBoxPreference.f25005d = C84566n2.m104164m();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$m0 */
    public static final class C84395m0 extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84395m0 f246340d = new C84395m0();

        public C84395m0() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            checkBoxPreference.f25005d = C84840f0.f247297a.mo117573e();
            checkBoxPreference.mo8243c(8);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$m1 */
    public static final class C84396m1 extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ AppBrandDebugUI f246341d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C84396m1(AppBrandDebugUI appBrandDebugUI) {
            super(1);
            this.f246341d = appBrandDebugUI;
        }

        /* JADX WARNING: type inference failed for: r0v11, types: [android.preference.Preference] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r5) {
            /*
                r4 = this;
                com.tencent.weui.base.preference.CheckBoxPreference r5 = (com.tencent.weui.base.preference.CheckBoxPreference) r5
                java.lang.String r0 = "it"
                gy3.C87412m.m108594g(r5, r0)
                boolean r0 = r5.mo8242b()
                r1 = 0
                if (r0 == 0) goto L_0x0060
                r0 = 1
                com.tencent.p014mm.plugin.appbrand.p026ui.C84566n2.m104157f(r0)
                com.tencent.p014mm.plugin.appbrand.p026ui.C84566n2.m104158g(r1)
                com.tencent.p014mm.plugin.appbrand.p026ui.C84566n2.m104155d(r1)
                com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI r2 = r4.f246341d
                com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandDebugUI.m103985N7(r2, r5, r0)
                com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI r5 = r4.f246341d
                qw3.b r0 = r5.f250544z
                java.lang.String r2 = "pref_key_enable_three_proc_tasks_dispatch"
                android.preference.Preference r0 = r0.mo124137b(r2)
                boolean r2 = r0 instanceof com.tencent.weui.base.preference.CheckBoxPreference
                r3 = 0
                if (r2 == 0) goto L_0x0030
                com.tencent.weui.base.preference.CheckBoxPreference r0 = (com.tencent.weui.base.preference.CheckBoxPreference) r0
                goto L_0x0031
            L_0x0030:
                r0 = r3
            L_0x0031:
                com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandDebugUI.m103985N7(r5, r0, r1)
                com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI r5 = r4.f246341d
                qw3.b r0 = r5.f250544z
                java.lang.String r2 = "pref_key_enable_legacy_tasks_dispatch"
                android.preference.Preference r0 = r0.mo124137b(r2)
                boolean r2 = r0 instanceof com.tencent.weui.base.preference.CheckBoxPreference
                if (r2 == 0) goto L_0x0046
                com.tencent.weui.base.preference.CheckBoxPreference r0 = (com.tencent.weui.base.preference.CheckBoxPreference) r0
                goto L_0x0047
            L_0x0046:
                r0 = r3
            L_0x0047:
                com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandDebugUI.m103985N7(r5, r0, r1)
                com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI r5 = r4.f246341d
                qw3.b r0 = r5.f250544z
                java.lang.String r2 = "pref_key_appbrand_runtime_run_in_mm_process"
                android.preference.Preference r0 = r0.mo124137b(r2)
                boolean r2 = r0 instanceof com.tencent.weui.base.preference.CheckBoxPreference
                if (r2 == 0) goto L_0x005c
                r3 = r0
                com.tencent.weui.base.preference.CheckBoxPreference r3 = (com.tencent.weui.base.preference.CheckBoxPreference) r3
            L_0x005c:
                com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandDebugUI.m103985N7(r5, r3, r1)
                goto L_0x0068
            L_0x0060:
                com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI r0 = r4.f246341d
                com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandDebugUI.m103985N7(r0, r5, r1)
                com.tencent.p014mm.plugin.appbrand.p026ui.C84566n2.m104157f(r1)
            L_0x0068:
                rx3.b0 r5 = rx3.C13598b0.f38549a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandDebugUI.C84396m1.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$n */
    public static final class C84397n extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ AppBrandDebugUI f246342d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C84397n(AppBrandDebugUI appBrandDebugUI) {
            super(1);
            this.f246342d = appBrandDebugUI;
        }

        /* JADX WARNING: type inference failed for: r0v4, types: [android.preference.Preference] */
        /* JADX WARNING: type inference failed for: r0v11, types: [android.preference.Preference] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r6) {
            /*
                r5 = this;
                com.tencent.weui.base.preference.CheckBoxPreference r6 = (com.tencent.weui.base.preference.CheckBoxPreference) r6
                java.lang.String r0 = "it"
                gy3.C87412m.m108594g(r6, r0)
                boolean r0 = r6.mo8242b()
                r1 = 1
                r2 = 0
                java.lang.String r3 = "pref_key_enable_xweb_multi_process"
                r4 = 0
                if (r0 == 0) goto L_0x0057
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                boolean r0 = com.tencent.xweb.XWebSdk.supportMultiProcess(r0)
                if (r0 != 0) goto L_0x0031
                r6.mo8244e(r4)
                com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI r6 = r5.f246342d
                android.content.Context r6 = r6.getApplicationContext()
                java.lang.String r0 = "当前内核不支持多进程"
                android.widget.Toast r6 = p910lj.C76701a.makeText((android.content.Context) r6, (java.lang.CharSequence) r0, (int) r4)
                r6.show()
                goto L_0x007b
            L_0x0031:
                com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI r0 = r5.f246342d
                qw3.b r0 = r0.f250544z
                android.preference.Preference r0 = r0.mo124137b(r3)
                boolean r3 = r0 instanceof com.tencent.weui.base.preference.CheckBoxPreference
                if (r3 == 0) goto L_0x0040
                r2 = r0
                com.tencent.weui.base.preference.CheckBoxPreference r2 = (com.tencent.weui.base.preference.CheckBoxPreference) r2
            L_0x0040:
                gy3.C87412m.m108591d(r2)
                boolean r0 = r2.mo8242b()
                if (r0 == 0) goto L_0x004e
                r0 = 2
                com.tencent.p014mm.plugin.appbrand.p026ui.C84566n2.m104156e(r0)
                goto L_0x0051
            L_0x004e:
                com.tencent.p014mm.plugin.appbrand.p026ui.C84566n2.m104156e(r4)
            L_0x0051:
                com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI r0 = r5.f246342d
                com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandDebugUI.m103985N7(r0, r6, r1)
                goto L_0x007b
            L_0x0057:
                com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI r0 = r5.f246342d
                qw3.b r0 = r0.f250544z
                android.preference.Preference r0 = r0.mo124137b(r3)
                boolean r3 = r0 instanceof com.tencent.weui.base.preference.CheckBoxPreference
                if (r3 == 0) goto L_0x0066
                r2 = r0
                com.tencent.weui.base.preference.CheckBoxPreference r2 = (com.tencent.weui.base.preference.CheckBoxPreference) r2
            L_0x0066:
                gy3.C87412m.m108591d(r2)
                boolean r0 = r2.mo8242b()
                if (r0 == 0) goto L_0x0073
                com.tencent.p014mm.plugin.appbrand.p026ui.C84566n2.m104156e(r1)
                goto L_0x0076
            L_0x0073:
                com.tencent.p014mm.plugin.appbrand.p026ui.C84566n2.m104156e(r4)
            L_0x0076:
                com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI r0 = r5.f246342d
                com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandDebugUI.m103985N7(r0, r6, r4)
            L_0x007b:
                rx3.b0 r6 = rx3.C13598b0.f38549a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandDebugUI.C84397n.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$n0 */
    public static final class C84398n0 extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84398n0 f246343d = new C84398n0();

        public C84398n0() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            C84840f0 f0Var = C84840f0.f247297a;
            boolean b = checkBoxPreference.mo8242b();
            f0Var.getClass();
            C84840f0.f247306j.mo124239c(f0Var, C84840f0.f247298b[6], Boolean.valueOf(b));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$n1 */
    public static final class C84399n1 extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84399n1 f246344d = new C84399n1();

        public C84399n1() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            checkBoxPreference.f25005d = C84566n2.m104162k();
            checkBoxPreference.mo8243c(8);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$o */
    public static final class C84400o extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84400o f246345d = new C84400o();

        public C84400o() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            checkBoxPreference.f25005d = C84566n2.m104153b();
            checkBoxPreference.mo8243c(8);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$o0 */
    public static final class C84401o0 extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84401o0 f246346d = new C84401o0();

        public C84401o0() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            checkBoxPreference.f25005d = C84840f0.f247297a.mo117575g();
            checkBoxPreference.mo8243c(8);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$o1 */
    public static final class C84402o1 implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ EditText f246347d;

        public C84402o1(EditText editText) {
            this.f246347d = editText;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            try {
                int parseInt = Integer.parseInt(this.f246347d.getText().toString());
                MultiProcessMMKV a = C1510o.f10864a.mo1516a();
                C87412m.m108591d(a);
                a.putInt("AppBrandPreloadDowngradeSwitcher.MMKV_HARD_CODE_LEVEL_TAG", parseInt);
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$p */
    public static final class C84403p extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84403p f246348d = new C84403p();

        public C84403p() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            boolean b = checkBoxPreference.mo8242b();
            Boolean bool = C84566n2.f246763a;
            MultiProcessMMKV a = C1510o.f10864a.mo1516a();
            if (a != null) {
                a.putBoolean("enable_multi_system_recent_tasks", b);
            }
            checkBoxPreference.mo8244e(checkBoxPreference.mo8242b());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$p0 */
    public static final class C84404p0 extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84404p0 f246349d = new C84404p0();

        public C84404p0() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            C84840f0 f0Var = C84840f0.f247297a;
            boolean b = checkBoxPreference.mo8242b();
            f0Var.getClass();
            C84840f0.f247307k.mo124239c(f0Var, C84840f0.f247298b[7], Boolean.valueOf(b));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$p1 */
    public static final class C84405p1 implements C76879j.C47267l {

        /* renamed from: a */
        public final /* synthetic */ AppBrandDebugUI f246350a;

        public C84405p1(AppBrandDebugUI appBrandDebugUI) {
            this.f246350a = appBrandDebugUI;
        }

        public final boolean onFinish(CharSequence charSequence) {
            PluginAppBrand.getProcessSharedPrefs().edit().putLong("AppBrandDebugUI.PAGE_CONTAINER_NAVIGATION_PUSH_TIMEOUT", Util.getLong(charSequence.toString(), C84499c0.m104087a())).apply();
            AppBrandDebugUI appBrandDebugUI = this.f246350a;
            int i = AppBrandDebugUI.f246301E;
            appBrandDebugUI.mo117046Q7();
            C89854b bVar = this.f246350a.f250544z;
            if (bVar == null) {
                return true;
            }
            bVar.notifyDataSetChanged();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$q */
    public static final class C84406q extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84406q f246351d = new C84406q();

        public C84406q() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            checkBoxPreference.f25005d = C83316f1.f243478a.mo115610d();
            checkBoxPreference.mo8243c(8);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$q0 */
    public static final class C84407q0 extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84407q0 f246352d = new C84407q0();

        public C84407q0() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            checkBoxPreference.f25005d = C84840f0.f247297a.mo117570b();
            checkBoxPreference.mo8243c(8);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$q1 */
    public static final class C84408q1 implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ AppBrandDebugUI f246353d;

        /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$q1$a */
        public static final class C84409a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ AppBrandDebugUI f246354d;

            public C84409a(AppBrandDebugUI appBrandDebugUI) {
                this.f246354d = appBrandDebugUI;
            }

            public final void run() {
                Toast.makeText(this.f246354d, "fail", 0).show();
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$q1$b */
        public static final class C84410b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ AppBrandDebugUI f246355d;

            public C84410b(AppBrandDebugUI appBrandDebugUI) {
                this.f246355d = appBrandDebugUI;
            }

            public final void run() {
                Toast.makeText(this.f246355d, "success", 0).show();
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$q1$c */
        public static final class C84411c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ AppBrandDebugUI f246356d;

            public C84411c(AppBrandDebugUI appBrandDebugUI) {
                this.f246356d = appBrandDebugUI;
            }

            public final void run() {
                Toast.makeText(this.f246356d, "fail", 0).show();
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$q1$d */
        public static final class C84412d<T> implements Comparator {
            public final int compare(T t, T t2) {
                return C65486b.m77169a(((C90160a) t2).f258864e, ((C90160a) t).f258864e);
            }
        }

        public C84408q1(AppBrandDebugUI appBrandDebugUI) {
            this.f246353d = appBrandDebugUI;
        }

        public final void run() {
            Iterator it;
            String str;
            C90165c cVar;
            String str2;
            Object systemService = MMApplicationContext.getContext().getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList<>();
                for (T next : runningAppProcesses) {
                    String str3 = ((ActivityManager.RunningAppProcessInfo) next).processName;
                    C87412m.m108593f(str3, "it.processName");
                    if (C112551y.m153819s(str3, "com.tencent.mm", false)) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
                    String str4 = runningAppProcessInfo.processName;
                    arrayList2.add(new C13604l(str4, new C86009m1("/proc/" + runningAppProcessInfo.pid + "/smaps")));
                }
                AppBrandDebugUI appBrandDebugUI = this.f246353d;
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    C13604l lVar = (C13604l) it4.next();
                    String str5 = (String) lVar.f38555d;
                    C86009m1 m1Var = (C86009m1) lVar.f38556e;
                    if (!m1Var.mo119967g() || !m1Var.mo119961a()) {
                        it = it4;
                        ((C119157j) C119157j.f356862d).mo183895z(new C84409a(appBrandDebugUI));
                    } else {
                        InputStream D = C86013q1.m106422D(m1Var);
                        C87412m.m108593f(D, "openRead(this)");
                        C90165c cVar2 = new C90165c(D);
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        ArrayList<C90160a> b = cVar2.mo124417b();
                        if (b instanceof C87690d.C87691a) {
                            str = ((C87690d.C87691a) b).mo63320l();
                        } else if (b == null || (str = b.toString()) == null) {
                            str = "";
                        }
                        boolean a = C2039g2.m1987a();
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        it = it4;
                        if (elapsedRealtime2 <= 32 || !a) {
                            str2 = str5;
                            cVar = cVar2;
                            Log.m105924i("Luggage.Utils.Profile", "runProfiled:log:" + "MicroMsg.AppBrandDebugUI" + " cost " + elapsedRealtime2 + " ms result:" + str + " isMainThread: " + a + ' ');
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("block main thread and skip ");
                            str2 = str5;
                            cVar = cVar2;
                            sb.append((int) (elapsedRealtime2 / ((long) 16)));
                            sb.append(" frames! runProfiled:log:");
                            sb.append("MicroMsg.AppBrandDebugUI");
                            sb.append(" cost ");
                            sb.append(elapsedRealtime2);
                            sb.append(" ms result:");
                            sb.append(str);
                            sb.append(" isMainThread: ");
                            sb.append(a);
                            sb.append(' ');
                            Log.m105928w("Luggage.Utils.Profile", sb.toString());
                        }
                        C87412m.m108591d(b);
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("===============SMAPS SUMMARY FOR ");
                        String str6 = str2;
                        sb4.append(str6);
                        sb4.append("===============");
                        Log.m105924i("MicroMsg.AppBrandDebugUI", sb4.toString());
                        Log.m105924i("MicroMsg.AppBrandDebugUI", cVar.mo124418c());
                        Log.m105924i("MicroMsg.AppBrandDebugUI", "===============SMAPS GROUP TOP 50 FOR " + str6 + "===============");
                        List<C13604l<String, C90161b>> a2 = cVar.mo124416a();
                        for (C13604l lVar2 : a2.subList(0, Math.min(50, a2.size()))) {
                            Log.m105924i("MicroMsg.AppBrandDebugUI", "\n[+] " + lVar2);
                        }
                        Log.m105924i("MicroMsg.AppBrandDebugUI", "===============SMAPS TOP 50 FOR " + str6 + "===============");
                        if (b.size() > 1) {
                            C77813z.m93909o(b, new C84412d());
                        }
                        List<C90160a> subList = b.subList(0, Math.min(50, b.size()));
                        C87412m.m108593f(subList, "entities.subList(0, minOf(50, entities.size))");
                        for (C90160a aVar : subList) {
                            Log.m105924i("MicroMsg.AppBrandDebugUI", "* " + aVar);
                        }
                    }
                    it4 = it;
                }
                C13598b0 b0Var = C13598b0.f38549a;
                AppBrandDebugUI appBrandDebugUI2 = this.f246353d;
                if (((C119157j) C119157j.f356862d).mo183895z(new C84410b(appBrandDebugUI2)) != null) {
                    return;
                }
            }
            ((C119157j) C119157j.f356862d).mo183895z(new C84411c(this.f246353d));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$r */
    public static final class C84413r extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84413r f246357d = new C84413r();

        public C84413r() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            C83316f1 f1Var = C83316f1.f243478a;
            PluginAppBrand.getProcessSharedPrefs().edit().putBoolean("com.tencent.mm.plugin.appbrand.launching.isForcedOpenWxaAppForTypedDemo", checkBoxPreference.mo8242b()).apply();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$r0 */
    public static final class C84414r0 extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84414r0 f246358d = new C84414r0();

        public C84414r0() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            C90989n.f261076a.putBoolean("ENABLE_ALL_APP_DEBUG", checkBoxPreference.mo8242b()).commit();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$r1 */
    public static final class C84415r1 implements C11182m0 {

        /* renamed from: d */
        public static final C84415r1 f246359d = new C84415r1();

        public final void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.mo107142f(0, "webview");
            e0Var.mo107142f(1, "skyline");
            e0Var.mo107142f(2, "auto");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$s */
    public static final class C84416s extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84416s f246360d = new C84416s();

        public C84416s() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            checkBoxPreference.f25005d = C83316f1.f243478a.mo115609c();
            checkBoxPreference.mo8243c(8);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$s0 */
    public static final class C84417s0 extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84417s0 f246361d = new C84417s0();

        public C84417s0() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            C84840f0 f0Var = C84840f0.f247297a;
            boolean b = checkBoxPreference.mo8242b();
            f0Var.getClass();
            C84840f0.f247302f.mo124239c(f0Var, C84840f0.f247298b[2], Boolean.valueOf(b));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$s1 */
    public static final class C84418s1 implements C11184p0 {

        /* renamed from: d */
        public static final C84418s1 f246362d = new C84418s1();

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (i == 0) {
                C47454d.f127280a.mo72476c(1);
            } else if (i == 1) {
                C47454d.f127280a.mo72476c(2);
            } else if (i == 2) {
                C47454d.f127280a.mo72476c(0);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$t */
    public static final class C84419t extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84419t f246363d = new C84419t();

        public C84419t() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            C83316f1 f1Var = C83316f1.f243478a;
            PluginAppBrand.getProcessSharedPrefs().edit().putBoolean("com.tencent.mm.plugin.appbrand.launching.isForcedCloseDemoCheckForWarmLaunchWxaApp", checkBoxPreference.mo8242b()).apply();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$t0 */
    public static final class C84420t0 extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84420t0 f246364d = new C84420t0();

        public C84420t0() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            C84840f0 f0Var = C84840f0.f247297a;
            f0Var.getClass();
            checkBoxPreference.f25005d = ((Boolean) C84840f0.f247303g.mo124238b(f0Var, C84840f0.f247298b[3])).booleanValue();
            checkBoxPreference.mo8243c(8);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$u */
    public static final class C84421u extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84421u f246365d = new C84421u();

        public C84421u() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            checkBoxPreference.f25005d = C83316f1.f243478a.mo115608b();
            checkBoxPreference.mo8243c(8);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$u0 */
    public static final class C84422u0 extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84422u0 f246366d = new C84422u0();

        public C84422u0() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            C84840f0 f0Var = C84840f0.f247297a;
            boolean b = checkBoxPreference.mo8242b();
            f0Var.getClass();
            C84840f0.f247303g.mo124239c(f0Var, C84840f0.f247298b[3], Boolean.valueOf(b));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$v */
    public static final class C84423v extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84423v f246367d = new C84423v();

        public C84423v() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            C84327g.m103945b(!checkBoxPreference.mo8242b());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$v0 */
    public static final class C84424v0 extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84424v0 f246368d = new C84424v0();

        public C84424v0() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            checkBoxPreference.f25005d = !C84499c0.m104089c() ? false : PluginAppBrand.getProcessSharedPrefs().getBoolean("AppBrandDebugUI.SHOW_DEBUG_HINT_FOR_WXA_APP_LAUNCH_PROCESS", BuildInfo.DEBUG);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$w */
    public static final class C84425w extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84425w f246369d = new C84425w();

        public C84425w() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            C83316f1 f1Var = C83316f1.f243478a;
            PluginAppBrand.getProcessSharedPrefs().edit().putBoolean("com.tencent.mm.plugin.appbrand.launching.isForcedCloseDemoCheckForColdLaunchWxaApp", checkBoxPreference.mo8242b()).apply();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$w0 */
    public static final class C84426w0 extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84426w0 f246370d = new C84426w0();

        public C84426w0() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            PluginAppBrand.getProcessSharedPrefs().edit().putBoolean("AppBrandDebugUI.SHOW_DEBUG_HINT_FOR_WXA_APP_LAUNCH_PROCESS", checkBoxPreference.mo8242b()).apply();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$x */
    public static final class C84427x extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84427x f246371d = new C84427x();

        public C84427x() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            C84701w0 w0Var = C84701w0.f247084a;
            w0Var.getClass();
            checkBoxPreference.f25005d = ((Boolean) C84701w0.f247086c.mo124238b(w0Var, C84701w0.f247085b[0])).booleanValue();
            checkBoxPreference.mo8243c(8);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$x0 */
    public static final class C84428x0 extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84428x0 f246372d = new C84428x0();

        public C84428x0() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            boolean z = false;
            if (C84499c0.m104089c()) {
                SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("libiao", 4);
                C87412m.m108593f(sharedPreferences, "getContext().getSharedPr…ntext.MODE_MULTI_PROCESS)");
                z = sharedPreferences.getBoolean("enable_fake_native_profile_skyline", false);
            }
            checkBoxPreference.f25005d = z;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$y */
    public static final class C84429y extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84429y f246373d = new C84429y();

        public C84429y() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            C84701w0 w0Var = C84701w0.f247084a;
            boolean b = checkBoxPreference.mo8242b();
            w0Var.getClass();
            C84701w0.f247086c.mo124239c(w0Var, C84701w0.f247085b[0], Boolean.valueOf(b));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$y0 */
    public static final class C84430y0 extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84430y0 f246374d = new C84430y0();

        public C84430y0() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            boolean b = checkBoxPreference.mo8242b();
            SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("libiao", 4);
            C87412m.m108593f(sharedPreferences, "getContext().getSharedPr…ntext.MODE_MULTI_PROCESS)");
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean("enable_fake_native_profile_skyline", b);
            edit.commit();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$z */
    public static final class C84431z extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public static final C84431z f246375d = new C84431z();

        public C84431z() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            C84684v.C84685a aVar = C84684v.Companion;
            aVar.getClass();
            checkBoxPreference.f25005d = ((Boolean) C84684v.forceCenterInside$delegate.mo124238b(aVar, C84684v.C84685a.f247050a[0])).booleanValue();
            checkBoxPreference.mo8243c(8);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI$z0 */
    public static final class C84432z0 extends C87413o implements C32226l<CheckBoxPreference, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ AppBrandDebugUI f246376d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C84432z0(AppBrandDebugUI appBrandDebugUI) {
            super(1);
            this.f246376d = appBrandDebugUI;
        }

        public Object invoke(Object obj) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
            C87412m.m108594g(checkBoxPreference, LocaleUtil.ITALIAN);
            C89854b bVar = this.f246376d.f250544z;
            if (!bVar.f258280g.contains("pref_key_prefer_packed_develop_lib")) {
                bVar.f258280g.add("pref_key_prefer_packed_develop_lib");
                bVar.notifyDataSetChanged();
            }
            int i = C81352s2.f238828a;
            checkBoxPreference.f25005d = !MultiProcessMMKV.getMMKV("__appbrand_comm_lib__prefs").getBoolean("disable_develop_lib", false);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: N7 */
    public static final void m103985N7(AppBrandDebugUI appBrandDebugUI, CheckBoxPreference checkBoxPreference, boolean z) {
        appBrandDebugUI.getClass();
        if (checkBoxPreference != null) {
            checkBoxPreference.mo8244e(z);
            checkBoxPreference.setPersistent(false);
            C89854b bVar = appBrandDebugUI.f250544z;
            if (bVar != null) {
                bVar.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: M7 */
    public boolean mo117043M7(C89853a aVar, Preference preference) {
        C88273g1 g1Var = C88273g1.TEST_ONLY;
        LuggageServiceType luggageServiceType = LuggageServiceType.WASERVICE;
        C87412m.m108594g(aVar, "screen");
        C87412m.m108594g(preference, "pref");
        C32226l lVar = this.f246302D.get(preference.getKey());
        if (lVar != null) {
            lVar.invoke(preference);
            return true;
        }
        String key = preference.getKey();
        if (key != null) {
            switch (key.hashCode()) {
                case -1579231740:
                    if (key.equals("pref_key_wxa_page_switch_enter_timeout")) {
                        C76879j.m92720N(this, "输入数字", "", "", -1, new C84405p1(this));
                        break;
                    }
                    break;
                case -12308374:
                    if (key.equals("pref_key_test_remote_process_status")) {
                        for (String str : AppBrandProcessesManager.f246131g.mo116963b()) {
                            Log.m105925i("MicroMsg.AppBrandDebugUI", "onPreferenceTreeClick: process:[%s] isAlive:[%b]", str, Boolean.valueOf(C80907o.m98784g(str)));
                        }
                        break;
                    }
                    break;
                case 30208987:
                    if (key.equals("pref_key_analyze_smaps")) {
                        ((C119157j) C119157j.f356862d).mo183870a(new C84408q1(this));
                        break;
                    }
                    break;
                case 489672198:
                    if (key.equals("pref_key_skyline_render_mode")) {
                        C77407n nVar = new C77407n((Context) this, 1, false);
                        nVar.f225771i = C84415r1.f246359d;
                        nVar.f225782p = C84418s1.f246362d;
                        nVar.mo107573q();
                        break;
                    }
                    break;
                case 811513037:
                    if (key.equals("pref_key_preload_next_plugin")) {
                        AppBrandProcessesManager.f246131g.mo116962a().mo116954S(luggageServiceType, g1Var);
                        C76701a.makeText((Context) this, (CharSequence) "preloading plugin", 0).show();
                        break;
                    }
                    break;
                case 1323416913:
                    if (key.equals("pref_key_test_kill_all")) {
                        AppBrandProcessesManager.f246131g.mo116962a().mo111405r(C80249b.KILL_TYPE_SILENT_IF_INACTIVE);
                        break;
                    }
                    break;
                case 1361184451:
                    if (key.equals("pref_key_preload_downgrade")) {
                        EditText editText = new EditText(this);
                        MultiProcessMMKV a = C1510o.f10864a.mo1516a();
                        int i = -2;
                        if (a != null) {
                            i = a.getInt("AppBrandPreloadDowngradeSwitcher.MMKV_HARD_CODE_LEVEL_TAG", -2);
                        }
                        editText.setText(String.valueOf(i));
                        new AlertDialog.Builder(this).setNegativeButton("Save", new C84402o1(editText)).setView(editText).show();
                        break;
                    }
                    break;
                case 1564999238:
                    if (key.equals("pref_key_preload_next_wxa")) {
                        AppBrandProcessesManager.f246131g.mo116962a().mo116954S(luggageServiceType, g1Var);
                        C76701a.makeText((Context) this, (CharSequence) "preloading", 0).show();
                        break;
                    }
                    break;
            }
        }
        return true;
    }

    /* renamed from: O7 */
    public final void mo117044O7() {
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("appId");
            String str = "";
            if (stringExtra == null) {
                stringExtra = str;
            }
            String obj = C112550d0.m153799i0(stringExtra).toString();
            if (!(obj.length() == 0)) {
                String stringExtra2 = intent.getStringExtra("versionType");
                if (stringExtra2 == null) {
                    stringExtra2 = "0";
                }
                int parseInt = Integer.parseInt(C112550d0.m153799i0(stringExtra2).toString());
                String stringExtra3 = intent.getStringExtra("enterPath");
                if (stringExtra3 != null) {
                    str = stringExtra3;
                }
                String obj2 = C112550d0.m153799i0(str).toString();
                C86299o oVar = new C86299o();
                oVar.f250930b = obj;
                oVar.f250931c = parseInt;
                oVar.f250934f = obj2;
                oVar.f250939k = 1001;
                ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(this, oVar);
                finish();
            }
        }
    }

    /* renamed from: P7 */
    public final <P extends Preference> void mo117045P7(String str, C32226l<? super P, C13598b0> lVar, C32226l<? super P, C13598b0> lVar2) {
        Preference b = this.f250544z.mo124137b(str);
        if (!(b instanceof Preference)) {
            b = null;
        }
        if (b != null) {
            b.setPersistent(false);
            lVar.invoke(b);
            HashMap<String, C32226l<Preference, C13598b0>> hashMap = this.f246302D;
            C87412m.m108592e(lVar2, "null cannot be cast to non-null type kotlin.Function1<android.preference.Preference, kotlin.Unit>");
            C24564k0.m30741e(lVar2, 1);
            C32226l put = hashMap.put(str, lVar2);
        }
    }

    /* renamed from: Q7 */
    public final void mo117046Q7() {
        Preference b = this.f250544z.mo124137b("pref_key_wxa_page_switch_enter_timeout");
        if (b != null) {
            b.setTitle("页面切换 进入超时时间:" + C84499c0.m104087a() + LocaleUtil.MALAY);
        }
    }

    public int getFooterResourceId() {
        return C0966R.C0971layout.f6381da;
    }

    public int getResourceId() {
        return C0966R.xml.f8856f;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo117044O7();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        mo117044O7();
    }

    public void onPostCreate(Bundle bundle) {
        if (!C84499c0.m104089c()) {
            finish();
            return;
        }
        super.onPostCreate(bundle);
        setTitle("小程序 DebugUI");
        mo101259H7(C111105a.m151500b(this, C0966R.color.f2927a));
        mo117045P7("pref_key_enable_preload", C84388k.f246333d, C84423v.f246367d);
        mo117045P7("pref_key_force_open_wxa_app_debug", C84377g0.f246322d, C84414r0.f246358d);
        mo117045P7("pref_key_enable_capsule_hotspot", C84366c1.f246311d, C84390k1.f246335d);
        mo117045P7("pref_key_enable_single_task_dispatch", C84393l1.f246338d, new C84396m1(this));
        mo117045P7("pref_key_enable_three_proc_tasks_dispatch", C84399n1.f246344d, new C84358a(this));
        mo117045P7("pref_key_enable_cronet_skyline", C84361b.f246306d, C84364c.f246309d);
        mo117045P7("pref_key_enable_legacy_tasks_dispatch", C84367d.f246312d, new C84370e(this));
        mo117045P7("pref_key_appbrand_runtime_run_in_mm_process", C84373f.f246318d, new C84376g(this));
        mo117045P7("pref_key_appbrand_runtime_fallback_to_run_in_mm_process_if_no_appbrand_process", C84379h.f246324d, new C84382i(this));
        mo117045P7("pref_key_enable_xweb_multi_process", C84385j.f246330d, new C84391l(this));
        mo117045P7("pref_key_enable_xweb_multi_process_render_gpu", C84394m.f246339d, new C84397n(this));
        mo117045P7("pref_key_appbrand_multi_system_task_enabled", C84400o.f246345d, C84403p.f246348d);
        mo117045P7("pref_key_force_open_wxa_app_for_typed_demo", C84406q.f246351d, C84413r.f246357d);
        mo117045P7("pref_key_close_demo_info_for_wxa_app_warm_launch", C84416s.f246360d, C84419t.f246363d);
        mo117045P7("pref_key_close_demo_info_for_wxa_app_cold_launch", C84421u.f246365d, C84425w.f246369d);
        mo117045P7("pref_key_block_splash", C84427x.f246371d, C84429y.f246373d);
        mo117045P7("pref_key_force_center_inside", C84431z.f246375d, C84359a0.f246304d);
        mo117045P7("pref_key_force_not_center_inside", C84362b0.f246307d, C84365c0.f246310d);
        mo117045P7("pref_key_enable_console_panel", C84368d0.f246313d, C84371e0.f246316d);
        mo117045P7("pref_key_v8_snapshot_app_enable", C84374f0.f246319d, C84380h0.f246325d);
        mo117045P7("pref_key_v8_snapshot_game_enable", C84383i0.f246328d, C84386j0.f246331d);
        mo117045P7("pref_key_v8_snapshot_node_enable", C84389k0.f246334d, C84392l0.f246337d);
        mo117045P7("pref_key_v8_snapshot_node_app_enable", C84395m0.f246340d, C84398n0.f246343d);
        mo117045P7("pref_key_v8_snapshot_node_game_enable", C84401o0.f246346d, C84404p0.f246349d);
        mo117045P7("pref_key_v8_snapshot_disable_pre_conditions", C84407q0.f246352d, C84417s0.f246361d);
        mo117045P7("pref_key_v8_snapshot_enable_not_compress_lib_snapshot", C84420t0.f246364d, C84422u0.f246366d);
        mo117046Q7();
        mo117045P7("pref_key_enable_wxa_launch_process_debug_hint", C84424v0.f246368d, C84426w0.f246370d);
        mo117045P7("pref_key_enable_fake_native_profile_skyline", C84428x0.f246372d, C84430y0.f246374d);
        mo117045P7("pref_key_prefer_packed_develop_lib", new C84432z0(this), new C84360a1(this));
        mo117045P7("pref_key_appbrand_service_debug_enabled", C84363b1.f246308d, C84369d1.f246314d);
        mo117045P7("pref_key_appbrand_service_debug_block_js", C84372e1.f246317d, C84375f1.f246320d);
        mo117045P7("pref_key_weapp_all_contact_transparent_background_enabled", C84378g1.f246323d, C84381h1.f246326d);
        for (String str : AppBrandProcessesManager.f246131g.mo116963b()) {
            C80907o.m98779b(str, new C84384i1(str));
            C80907o.m98780c(str, new C84387j1(str));
        }
    }
}
