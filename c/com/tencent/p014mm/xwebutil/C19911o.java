package com.tencent.p014mm.xwebutil;

import com.tencent.matrix.lifecycle.C80401d;
import com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.XWebSdk;
import org.xwalk.core.XWalkEnvironment;
import zt3.C119157j;

/* renamed from: com.tencent.mm.xwebutil.o */
public class C19911o {

    /* renamed from: a */
    public static C80401d f56756a;

    /* renamed from: com.tencent.mm.xwebutil.o$a */
    public class C19912a extends C80401d {

        /* renamed from: b */
        public final /* synthetic */ int f56757b;

        /* renamed from: com.tencent.mm.xwebutil.o$a$a */
        public class C19913a implements Runnable {
            public C19913a(C19912a aVar) {
            }

            public void run() {
                if (AppDeepBackgroundOwner.INSTANCE.isBackground()) {
                    Log.m105924i("XWeb.MM.XWebUtil", "onEnterBackground, do force kill child process");
                    XWebSdk.forceKillRenderProcess();
                    XWebSdk.forceKillGpuProcess();
                }
            }
        }

        public C19912a(int i) {
            this.f56757b = i;
        }

        /* renamed from: a */
        public void mo17850a() {
            Log.m105924i("XWeb.MM.XWebUtil", "onEnterBackground, try force kill child process in " + this.f56757b + LocaleUtil.MALAY);
            C119157j jVar = (C119157j) C119157j.f356862d;
            jVar.getClass();
            jVar.mo183889t(new C19913a(this), (long) this.f56757b, (String) null);
        }

        /* renamed from: b */
        public void mo17851b() {
            Log.m105924i("XWeb.MM.XWebUtil", "onExitBackground");
        }
    }

    /* renamed from: a */
    public static void m21656a() {
        boolean configValueAsBoolean = XWebSdk.getConfigValueAsBoolean("disable_kill_child_process_in_deep_background", XWalkEnvironment.MODULE_TOOLS, false);
        int configValueAsInt = XWebSdk.getConfigValueAsInt("timeout_kill_child_process_in_deep_background", XWalkEnvironment.MODULE_TOOLS, 30000);
        Log.m105925i("XWeb.MM.XWebUtil", "initLifecycleCallback, configValue:%s, configTimeout:%s", Boolean.valueOf(configValueAsBoolean), Integer.valueOf(configValueAsInt));
        if (!configValueAsBoolean && f56756a == null) {
            f56756a = new C19912a(configValueAsInt);
            AppDeepBackgroundOwner.INSTANCE.addLifecycleCallback(f56756a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x02c9  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0364  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m21657b() {
        /*
            com.tencent.xweb.WebDebugCfg r0 = com.tencent.xweb.WebDebugCfg.getInst()
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r0.load(r1)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0036
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r0 != 0) goto L_0x0036
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
            if (r0 != 0) goto L_0x0036
            boolean r0 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.isCoolassistEnv()
            if (r0 == 0) goto L_0x0020
            goto L_0x0036
        L_0x0020:
            com.tencent.xweb.WebDebugCfg r0 = com.tencent.xweb.WebDebugCfg.getInst()
            r0.setEnableLocalDebug(r2)
            com.tencent.xweb.WebDebugCfg r0 = com.tencent.xweb.WebDebugCfg.getInst()
            r0.setEnableCheckStorage(r2)
            com.tencent.xweb.WebDebugCfg r0 = com.tencent.xweb.WebDebugCfg.getInst()
            r0.setEnableCheckThread(r2)
            goto L_0x004b
        L_0x0036:
            com.tencent.xweb.WebDebugCfg r0 = com.tencent.xweb.WebDebugCfg.getInst()
            r0.setEnableLocalDebug(r1)
            com.tencent.xweb.WebDebugCfg r0 = com.tencent.xweb.WebDebugCfg.getInst()
            r0.setEnableCheckStorage(r1)
            com.tencent.xweb.WebDebugCfg r0 = com.tencent.xweb.WebDebugCfg.getInst()
            r0.setEnableCheckThread(r1)
        L_0x004b:
            java.lang.String r0 = ""
            java.lang.String r3 = "XWeb.MM.XWebUtil"
            java.lang.Class<h81.h> r4 = h81.C32735h.class
            r5 = 3
            r6 = 2
            di3.d r7 = di3.C86312j.m106911c(r4)     // Catch:{ all -> 0x0189 }
            if (r7 != 0) goto L_0x0060
            java.lang.String r0 = "checkAbTestConfigs, IExptService is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)     // Catch:{ all -> 0x0189 }
            goto L_0x019f
        L_0x0060:
            di3.d r7 = di3.C86312j.m106911c(r4)     // Catch:{ all -> 0x0189 }
            h81.h r7 = (h81.C32735h) r7     // Catch:{ all -> 0x0189 }
            h81.h$c r8 = h81.C32735h.C32737c.clicfg_xweb_debug_check_value     // Catch:{ all -> 0x0189 }
            int r7 = r7.mo58779Qe(r8, r2)     // Catch:{ all -> 0x0189 }
            java.lang.String r8 = "checkAbTestConfigs, clicfg_xweb_debug_check_value:%s"
            java.lang.Object[] r9 = new java.lang.Object[r1]     // Catch:{ all -> 0x0189 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0189 }
            r9[r2] = r10     // Catch:{ all -> 0x0189 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r8, r9)     // Catch:{ all -> 0x0189 }
            if (r7 == r1) goto L_0x007d
            goto L_0x019f
        L_0x007d:
            di3.d r7 = di3.C86312j.m106911c(r4)     // Catch:{ all -> 0x0189 }
            h81.h r7 = (h81.C32735h) r7     // Catch:{ all -> 0x0189 }
            h81.h$c r8 = h81.C32735h.C32737c.clicfg_xweb_turnon_local_debug     // Catch:{ all -> 0x0189 }
            int r7 = r7.mo58779Qe(r8, r2)     // Catch:{ all -> 0x0189 }
            if (r7 != r1) goto L_0x0097
            java.lang.String r7 = "checkAbTestConfigs, turnonDebugMode is true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)     // Catch:{ all -> 0x0189 }
            com.tencent.xweb.WebDebugCfg r7 = com.tencent.xweb.WebDebugCfg.getInst()     // Catch:{ all -> 0x0189 }
            r7.setEnableLocalDebug(r1)     // Catch:{ all -> 0x0189 }
        L_0x0097:
            di3.d r7 = di3.C86312j.m106911c(r4)     // Catch:{ all -> 0x0103 }
            h81.h r7 = (h81.C32735h) r7     // Catch:{ all -> 0x0103 }
            h81.h$c r8 = h81.C32735h.C32737c.clicfg_xweb_mm_webtype     // Catch:{ all -> 0x0103 }
            int r7 = r7.mo58779Qe(r8, r2)     // Catch:{ all -> 0x0103 }
            di3.d r8 = di3.C86312j.m106911c(r4)     // Catch:{ all -> 0x0103 }
            h81.h r8 = (h81.C32735h) r8     // Catch:{ all -> 0x0103 }
            h81.h$c r9 = h81.C32735h.C32737c.clicfg_xweb_tools_webtype     // Catch:{ all -> 0x0103 }
            int r8 = r8.mo58779Qe(r9, r2)     // Catch:{ all -> 0x0103 }
            di3.d r9 = di3.C86312j.m106911c(r4)     // Catch:{ all -> 0x0103 }
            h81.h r9 = (h81.C32735h) r9     // Catch:{ all -> 0x0103 }
            h81.h$c r10 = h81.C32735h.C32737c.clicfg_xweb_appbrand_webtype     // Catch:{ all -> 0x0103 }
            int r9 = r9.mo58779Qe(r10, r2)     // Catch:{ all -> 0x0103 }
            java.lang.String r10 = "checkAbTestConfigs, moduleToolsType:%s; moduleAppbrandType:%s; moduleMMType:%s"
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ all -> 0x0103 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0103 }
            r11[r2] = r12     // Catch:{ all -> 0x0103 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0103 }
            r11[r1] = r12     // Catch:{ all -> 0x0103 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0103 }
            r11[r6] = r12     // Catch:{ all -> 0x0103 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r10, r11)     // Catch:{ all -> 0x0103 }
            com.tencent.xweb.WebDebugCfg r10 = com.tencent.xweb.WebDebugCfg.getInst()     // Catch:{ all -> 0x0103 }
            java.lang.String r11 = "mm"
            com.tencent.xweb.WebView$WebViewKind[] r12 = com.tencent.xweb.WebView.WebViewKind.values()     // Catch:{ all -> 0x0103 }
            r7 = r12[r7]     // Catch:{ all -> 0x0103 }
            r10.setABTestWebViewKind(r11, r7)     // Catch:{ all -> 0x0103 }
            com.tencent.xweb.WebDebugCfg r7 = com.tencent.xweb.WebDebugCfg.getInst()     // Catch:{ all -> 0x0103 }
            java.lang.String r10 = "tools"
            com.tencent.xweb.WebView$WebViewKind[] r11 = com.tencent.xweb.WebView.WebViewKind.values()     // Catch:{ all -> 0x0103 }
            r8 = r11[r8]     // Catch:{ all -> 0x0103 }
            r7.setABTestWebViewKind(r10, r8)     // Catch:{ all -> 0x0103 }
            com.tencent.xweb.WebDebugCfg r7 = com.tencent.xweb.WebDebugCfg.getInst()     // Catch:{ all -> 0x0103 }
            java.lang.String r8 = "appbrand"
            com.tencent.xweb.WebView$WebViewKind[] r10 = com.tencent.xweb.WebView.WebViewKind.values()     // Catch:{ all -> 0x0103 }
            r9 = r10[r9]     // Catch:{ all -> 0x0103 }
            r7.setABTestWebViewKind(r8, r9)     // Catch:{ all -> 0x0103 }
            goto L_0x0119
        L_0x0103:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "xweb abtest set webview kind error:"
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r7)
        L_0x0119:
            di3.d r7 = di3.C86312j.m106911c(r4)     // Catch:{ all -> 0x0172 }
            h81.h r7 = (h81.C32735h) r7     // Catch:{ all -> 0x0172 }
            h81.h$c r8 = h81.C32735h.C32737c.clicfg_xweb_test_url     // Catch:{ all -> 0x0172 }
            java.lang.String r7 = r7.Y60(r8, r0)     // Catch:{ all -> 0x0172 }
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0172 }
            if (r8 != 0) goto L_0x0145
            di3.d r8 = di3.C86312j.m106911c(r4)     // Catch:{ all -> 0x0172 }
            h81.h r8 = (h81.C32735h) r8     // Catch:{ all -> 0x0172 }
            h81.h$c r9 = h81.C32735h.C32737c.clicfg_xweb_test_url_enddate     // Catch:{ all -> 0x0172 }
            java.lang.String r8 = r8.Y60(r9, r0)     // Catch:{ all -> 0x0172 }
            java.lang.String r9 = "checkAbTestConfigs, base config url:%s, date:%s"
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ all -> 0x0172 }
            r10[r2] = r7     // Catch:{ all -> 0x0172 }
            r10[r1] = r8     // Catch:{ all -> 0x0172 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r9, r10)     // Catch:{ all -> 0x0172 }
            com.tencent.xweb.XWebSdk.setTempBaseConfigUrl(r7, r8)     // Catch:{ all -> 0x0172 }
        L_0x0145:
            di3.d r7 = di3.C86312j.m106911c(r4)     // Catch:{ all -> 0x0172 }
            h81.h r7 = (h81.C32735h) r7     // Catch:{ all -> 0x0172 }
            h81.h$c r8 = h81.C32735h.C32737c.clicfg_xweb_test_plugin_url     // Catch:{ all -> 0x0172 }
            java.lang.String r7 = r7.Y60(r8, r0)     // Catch:{ all -> 0x0172 }
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0172 }
            if (r8 != 0) goto L_0x019f
            di3.d r4 = di3.C86312j.m106911c(r4)     // Catch:{ all -> 0x0172 }
            h81.h r4 = (h81.C32735h) r4     // Catch:{ all -> 0x0172 }
            h81.h$c r8 = h81.C32735h.C32737c.clicfg_xweb_test_plugin_url_enddate     // Catch:{ all -> 0x0172 }
            java.lang.String r0 = r4.Y60(r8, r0)     // Catch:{ all -> 0x0172 }
            java.lang.String r4 = "checkAbTestConfigs, plugin config url:%s, date:%s"
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ all -> 0x0172 }
            r8[r2] = r7     // Catch:{ all -> 0x0172 }
            r8[r1] = r0     // Catch:{ all -> 0x0172 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r8)     // Catch:{ all -> 0x0172 }
            com.tencent.xweb.XWebSdk.setTempPluginConfigUrl(r7, r0)     // Catch:{ all -> 0x0172 }
            goto L_0x019f
        L_0x0172:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "xweb abtest set config url error:"
            r4.append(r7)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            goto L_0x019f
        L_0x0189:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "xweb abtest set local debug error:"
            r4.append(r7)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
        L_0x019f:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            r3 = 3600000(0x36ee80, float:5.044674E-39)
            r7 = 3600000(0x36ee80, double:1.7786363E-317)
            if (r0 != 0) goto L_0x01cd
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
            if (r0 == 0) goto L_0x01ae
            goto L_0x01cd
        L_0x01ae:
            boolean r0 = qe3.C89625d.f257845k
            if (r0 == 0) goto L_0x01b9
            com.tencent.xweb.XWebSdk.setBaseConfigUpdatePeriod(r7)
            com.tencent.xweb.XWebSdk.setPluginConfigUpdatePeriod(r3)
            goto L_0x01dd
        L_0x01b9:
            boolean r0 = qe3.C89625d.f257844j
            if (r0 == 0) goto L_0x01dd
            java.lang.String r0 = ""
            com.tencent.xweb.XWebSdk.setTempBaseConfigUrl(r0, r0)
            r4 = 0
            com.tencent.xweb.XWebSdk.setTempPluginConfigUrl(r4, r0)
            com.tencent.xweb.XWebSdk.setBaseConfigUpdatePeriod(r7)
            com.tencent.xweb.XWebSdk.setPluginConfigUpdatePeriod(r3)
            goto L_0x01dd
        L_0x01cd:
            java.lang.String r0 = "https://dldir1v6.qq.com/weixin/android/wxweb/updateConfig_test.xml"
            com.tencent.xweb.XWebSdk.setTempBaseConfigUrl(r0)
            java.lang.String r0 = "https://dldir1v6.qq.com/weixin/android/wxweb/plugin/pluginUpdateConfig_exp.xml"
            com.tencent.xweb.XWebSdk.setTempPluginConfigUrl(r0)
            com.tencent.xweb.XWebSdk.setBaseConfigUpdatePeriod(r7)
            com.tencent.xweb.XWebSdk.setPluginConfigUpdatePeriod(r3)
        L_0x01dd:
            android.os.Bundle r0 = com.tencent.xweb.XWebSdk.getXWebInitConfigBundle()
            monitor-enter(r0)
            java.lang.String r3 = "clientVersion"
            int r4 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION_INT     // Catch:{ all -> 0x03c9 }
            r0.putInt(r3, r4)     // Catch:{ all -> 0x03c9 }
            java.lang.String r3 = "isGPVersion"
            boolean r4 = m21658c()     // Catch:{ all -> 0x03c9 }
            r0.putBoolean(r3, r4)     // Catch:{ all -> 0x03c9 }
            java.lang.String r3 = "processName"
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getProcessName()     // Catch:{ all -> 0x03c9 }
            r0.putString(r3, r4)     // Catch:{ all -> 0x03c9 }
            java.lang.String r3 = "is64bitAbi"
            boolean r4 = p156gj.C87203t.m108279o()     // Catch:{ all -> 0x03c9 }
            r0.putBoolean(r3, r4)     // Catch:{ all -> 0x03c9 }
            java.lang.String r3 = "deviceModel"
            java.lang.String r4 = p156gj.C87203t.m108275k()     // Catch:{ all -> 0x03c9 }
            r0.putString(r3, r4)     // Catch:{ all -> 0x03c9 }
            java.lang.String r3 = "packageName"
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getApplicationId()     // Catch:{ all -> 0x03c9 }
            r0.putString(r3, r4)     // Catch:{ all -> 0x03c9 }
            java.lang.String r3 = "XWeb.MM.XWebUtil"
            java.lang.String r4 = "initXWebInitConfigs, clientVersion:%s, gpVersion:%s, processName:%s, is64Abi:%s, model:%s, package:%s"
            r7 = 6
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x03c9 }
            int r8 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION_INT     // Catch:{ all -> 0x03c9 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x03c9 }
            r7[r2] = r8     // Catch:{ all -> 0x03c9 }
            boolean r8 = m21658c()     // Catch:{ all -> 0x03c9 }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x03c9 }
            r7[r1] = r8     // Catch:{ all -> 0x03c9 }
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getProcessName()     // Catch:{ all -> 0x03c9 }
            r7[r6] = r8     // Catch:{ all -> 0x03c9 }
            boolean r8 = p156gj.C87203t.m108279o()     // Catch:{ all -> 0x03c9 }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x03c9 }
            r7[r5] = r8     // Catch:{ all -> 0x03c9 }
            r5 = 4
            java.lang.String r8 = p156gj.C87203t.m108275k()     // Catch:{ all -> 0x03c9 }
            r7[r5] = r8     // Catch:{ all -> 0x03c9 }
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getApplicationId()     // Catch:{ all -> 0x03c9 }
            r8 = 5
            r7[r8] = r5     // Catch:{ all -> 0x03c9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r7)     // Catch:{ all -> 0x03c9 }
            monitor-exit(r0)     // Catch:{ all -> 0x03c9 }
            android.os.Bundle r3 = com.tencent.xweb.XWebSdk.getExtendBundle()
            monitor-enter(r3)
            java.lang.String r0 = "hasLogin"
            boolean r4 = ke3.C88144b.m109787f()     // Catch:{ all -> 0x03c6 }
            r3.putBoolean(r0, r4)     // Catch:{ all -> 0x03c6 }
            java.lang.String r0 = "XWeb.MM.XWebUtil"
            java.lang.String r4 = "initXWebExtendConfigs, hasLogin:%s"
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ all -> 0x03c6 }
            boolean r7 = ke3.C88144b.m109787f()     // Catch:{ all -> 0x03c6 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x03c6 }
            r5[r2] = r7     // Catch:{ all -> 0x03c6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r4, r5)     // Catch:{ all -> 0x03c6 }
            monitor-exit(r3)     // Catch:{ all -> 0x03c6 }
            com.tencent.xweb.XWebSdk.setUsingCustomContext(r1)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()
            java.util.Locale r0 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.transLanguageToLocale(r0)
            com.tencent.xweb.XWebSdk.setLocale(r0)
            com.tencent.xweb.LibraryLoader$ILibraryLoader r0 = com.tencent.p014mm.xwebutil.C86027m.f250519e
            com.tencent.xweb.XWebSdk.setLibraryLoader(r0)
            com.tencent.xweb.util.WebViewExtensionListener r0 = com.tencent.p014mm.xwebutil.C86027m.f250517c
            com.tencent.xweb.XWebSdk.setWebViewExtensionListener(r0)
            com.tencent.p014mm.xwebutil.C30877q.m39256a()
            boolean r0 = m21658c()
            if (r0 == 0) goto L_0x029c
            com.tencent.xweb.XWebSdk.setForbidDownloadCode(r1)
            java.lang.String r0 = "GP_USER"
            com.tencent.xweb.XWebSdk.appendAppInfo(r0)
        L_0x029c:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_BLUE
            if (r0 == 0) goto L_0x02a1
            goto L_0x02c4
        L_0x02a1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "XWebMMConfig."
            r0.append(r3)
            int r3 = f40.C86718e.m107549h()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r0, r6)
            if (r0 == 0) goto L_0x02c6
            java.lang.String r3 = "MP_DEVELOPER"
            boolean r0 = r0.decodeBool(r3)
            if (r0 == 0) goto L_0x02c6
        L_0x02c4:
            r0 = 1
            goto L_0x02c7
        L_0x02c6:
            r0 = 0
        L_0x02c7:
            if (r0 == 0) goto L_0x02ce
            java.lang.String r0 = "MP_DEVELOPER"
            com.tencent.xweb.XWebSdk.appendAppInfo(r0)
        L_0x02ce:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r0 == 0) goto L_0x02dd
            boolean r0 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r0 == 0) goto L_0x02dd
            com.tencent.xweb.XWebSdk.setWaitForXWeb(r1)
        L_0x02dd:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r0 == 0) goto L_0x033c
            java.lang.Class<lc3.b> r0 = lc3.C10485b.class
            boolean r3 = f40.C86709a0.m107522a()
            if (r3 != 0) goto L_0x02ec
            goto L_0x033c
        L_0x02ec:
            f40.e r3 = f40.C86709a0.m107523b()
            int r3 = r3.mo121110g()
            boolean r3 = com.tencent.xweb.XWebSdk.setGrayValueByUserId(r3)
            k40.a r4 = f40.C86709a0.m107533q(r0)
            lc3.b r4 = (lc3.C10485b) r4
            pj.f r4 = r4.vh0()
            if (r4 == 0) goto L_0x031a
            k40.a r0 = f40.C86709a0.m107533q(r0)
            lc3.b r0 = (lc3.C10485b) r0
            pj.f r0 = r0.vh0()
            r4 = -1
            java.lang.String r5 = "WebKernelMode"
            int r0 = r0.mo107404b(r5, r4)
            boolean r0 = com.tencent.xweb.XWebSdk.setIpType(r0)
            goto L_0x031b
        L_0x031a:
            r0 = 0
        L_0x031b:
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            r4[r2] = r5
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            r4[r1] = r5
            java.lang.String r5 = "XWeb.MM.XWebUtil"
            java.lang.String r7 = "updateStrategyCheck, hasChangedGrayValue:%s, hasChangedIPType:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r7, r4)
            if (r3 != 0) goto L_0x0335
            if (r0 == 0) goto L_0x033c
        L_0x0335:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            com.tencent.p014mm.pluginsdk.model.C44595p1.m49048a(r0, r8)
        L_0x033c:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            com.tencent.xweb.XWebEnvironmentConfig$XWebEnvironmentConfigBuilder r3 = new com.tencent.xweb.XWebEnvironmentConfig$XWebEnvironmentConfigBuilder
            r3.<init>()
            com.tencent.xweb.util.IXWebLogClient r4 = com.tencent.p014mm.xwebutil.C86027m.f250515a
            com.tencent.xweb.XWebEnvironmentConfig$XWebEnvironmentConfigBuilder r3 = r3.setLogInterface(r4)
            com.tencent.xweb.WebViewReporterInterface r4 = com.tencent.p014mm.xwebutil.C86027m.f250516b
            com.tencent.xweb.XWebEnvironmentConfig$XWebEnvironmentConfigBuilder r3 = r3.setReporterInterface(r4)
            com.tencent.xweb.ISharedPreferenceProvider r4 = com.tencent.p014mm.xwebutil.C86027m.f250518d
            com.tencent.xweb.XWebEnvironmentConfig$XWebEnvironmentConfigBuilder r3 = r3.setSharedPreferenceProvider(r4)
            com.tencent.xweb.XWebEnvironmentConfig r3 = r3.createXWebEnvironmentConfig()
            com.tencent.xweb.XWebSdk.initXWebEnvironment(r0, r3)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r0 == 0) goto L_0x03c5
            com.tencent.xweb.XWebSdk$WebViewModeForMM r0 = com.tencent.xweb.XWebSdk.getWebViewModeCommandForMM()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "postInitXWebEnvironment, webviewMode:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "XWeb.MM.XWebUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            com.tencent.xweb.XWebSdk$WebViewModeForMM r3 = com.tencent.xweb.XWebSdk.WebViewModeForMM.NOT_IN_MM
            if (r0 != r3) goto L_0x0386
            com.tencent.xweb.XWebSdk.setMultiProcessType(r2)
            goto L_0x03c5
        L_0x0386:
            com.tencent.xweb.XWebSdk$WebViewModeForMM r3 = com.tencent.xweb.XWebSdk.WebViewModeForMM.DISABLE_MULTI_PROCESS
            if (r0 != r3) goto L_0x038e
            com.tencent.xweb.XWebSdk.setMultiProcessType(r2)
            goto L_0x03c5
        L_0x038e:
            com.tencent.xweb.XWebSdk$WebViewModeForMM r3 = com.tencent.xweb.XWebSdk.WebViewModeForMM.RENDER_SANDBOX
            if (r0 != r3) goto L_0x039c
            com.tencent.xweb.XWebSdk.setMultiProcessType(r1)
            com.tencent.xweb.XWebSdk.setEnableSandbox(r1)
            m21656a()
            goto L_0x03c5
        L_0x039c:
            com.tencent.xweb.XWebSdk$WebViewModeForMM r3 = com.tencent.xweb.XWebSdk.WebViewModeForMM.RENDER_UNSANDBOX
            if (r0 != r3) goto L_0x03aa
            com.tencent.xweb.XWebSdk.setMultiProcessType(r1)
            com.tencent.xweb.XWebSdk.setEnableSandbox(r2)
            m21656a()
            goto L_0x03c5
        L_0x03aa:
            com.tencent.xweb.XWebSdk$WebViewModeForMM r3 = com.tencent.xweb.XWebSdk.WebViewModeForMM.GPU_RENDER_SANDBOX
            if (r0 != r3) goto L_0x03b8
            com.tencent.xweb.XWebSdk.setMultiProcessType(r6)
            com.tencent.xweb.XWebSdk.setEnableSandbox(r1)
            m21656a()
            goto L_0x03c5
        L_0x03b8:
            com.tencent.xweb.XWebSdk$WebViewModeForMM r1 = com.tencent.xweb.XWebSdk.WebViewModeForMM.GPU_RENDER_UNSANDBOX
            if (r0 != r1) goto L_0x03c5
            com.tencent.xweb.XWebSdk.setMultiProcessType(r6)
            com.tencent.xweb.XWebSdk.setEnableSandbox(r2)
            m21656a()
        L_0x03c5:
            return
        L_0x03c6:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x03c6 }
            throw r0
        L_0x03c9:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x03c9 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.xwebutil.C19911o.m21657b():void");
    }

    /* renamed from: c */
    public static boolean m21658c() {
        if (!XWebSdk.getBuildConfigNeedTurnOffDynamicCode() || !XWebSdk.getBuildConfigShouldEmbedXWebCore()) {
            boolean isGPVersion = ChannelUtil.isGPVersion();
            Log.m105924i("XWeb.MM.XWebUtil", "isGPVersion, get from channel util:" + isGPVersion);
            return isGPVersion;
        }
        Log.m105924i("XWeb.MM.XWebUtil", "isGPVersion, get from build info: true");
        return true;
    }
}
