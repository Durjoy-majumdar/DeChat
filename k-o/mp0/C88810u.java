package mp0;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.C84072q1;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import lp0.C88620b;

/* renamed from: mp0.u */
public final class C88810u implements C88620b<C83928t1> {
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x021c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo115970a(android.content.Context r17, com.tencent.p014mm.plugin.appbrand.page.C83780d1 r18, java.lang.String r19) {
        /*
            r16 = this;
            r0 = r17
            r1 = r18
            com.tencent.mm.plugin.appbrand.page.t1 r1 = (com.tencent.p014mm.plugin.appbrand.page.C83928t1) r1
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r2 = r1.getRuntime()
            com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC r2 = r2.mo113213o1()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "!PKG_INFO!\n"
            r3.<init>(r4)
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r4 = r1.mo114272k()
            com.tencent.mm.plugin.appbrand.appcache.IPkgInfo r4 = r4.mo113379c()
            java.lang.String r5 = "\n[lib.src    ] "
            r3.append(r5)
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r5 = r1.mo114272k()
            boolean r5 = r5 instanceof com.tencent.p014mm.plugin.appbrand.appcache.AssetReader
            if (r5 == 0) goto L_0x0043
            java.lang.Boolean r5 = com.tencent.p014mm.plugin.appbrand.appcache.C81352s2.f238831d
            if (r5 != 0) goto L_0x0032
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            com.tencent.p014mm.plugin.appbrand.appcache.C81352s2.f238831d = r5
        L_0x0032:
            java.lang.Boolean r5 = com.tencent.p014mm.plugin.appbrand.appcache.C81352s2.f238831d
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x003d
            java.lang.String r5 = "local(force)"
            goto L_0x003f
        L_0x003d:
            java.lang.String r5 = "local"
        L_0x003f:
            r3.append(r5)
            goto L_0x0048
        L_0x0043:
            java.lang.String r5 = "network"
            r3.append(r5)
        L_0x0048:
            java.lang.String r5 = "\n[lib.ver_cli] "
            r3.append(r5)
            int r5 = r4.pkgVersion()
            r3.append(r5)
            java.lang.String r5 = "\n[lib.ver_sdk] "
            r3.append(r5)
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r5 = r1.mo114272k()
            java.lang.String r5 = r5.mo113367M()
            r3.append(r5)
            long r4 = r4.lastModified()
            r6 = 0
            java.lang.String r8 = "  "
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 <= 0) goto L_0x0080
            r3.append(r8)
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r4 = r9.toSeconds(r4)
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.formatUnixTime(r4)
            r3.append(r4)
        L_0x0080:
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r4 = r2.f261072r
            r5 = 10
            r3.append(r5)
            java.lang.String r9 = "\n[app.version] "
            r3.append(r9)
            int r9 = r4.pkgVersion
            r3.append(r9)
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r9 = r2.f261072r
            int r9 = r9.f238585d
            if (r9 == 0) goto L_0x00a4
            r3.append(r8)
            long r8 = r4.f238586e
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.formatUnixTime(r8)
            r3.append(r8)
            goto L_0x00b8
        L_0x00a4:
            r3.append(r8)
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r9 = r4.lastModified()
            long r8 = r8.toSeconds(r9)
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.formatUnixTime(r8)
            r3.append(r8)
        L_0x00b8:
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo> r8 = r4.f238588g
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r8)
            r9 = 1
            r8 = r8 ^ r9
            java.lang.String r10 = "\n[app.module ] "
            r3.append(r10)
            java.lang.String r10 = java.lang.String.valueOf(r8)
            r3.append(r10)
            r10 = 0
            if (r8 == 0) goto L_0x00f9
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r8 = r1.getRuntime()
            op0.a r8 = r8.f238115M
            op0.l r8 = (op0.C89269l) r8
            java.lang.String r11 = r1.mo116162Q0()
            com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo r8 = r8.mo123582h(r11)
            java.util.Locale r11 = java.util.Locale.US
            java.lang.Object[] r12 = new java.lang.Object[r9]
            java.lang.String r13 = r8.name
            r12[r10] = r13
            java.lang.String r13 = "(%s)"
            java.lang.String r11 = java.lang.String.format(r11, r13, r12)
            r3.append(r11)
            boolean r8 = r8.independent
            if (r8 == 0) goto L_0x00f9
            java.lang.String r8 = "(independent)"
            r3.append(r8)
        L_0x00f9:
            boolean r8 = com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWCAccessible.m99327c(r1)
            java.lang.String r11 = "\n[app.pkg_enc_version] "
            java.lang.String r12 = "MERGE"
            java.lang.String r13 = "LEGACY"
            java.lang.String r14 = "\n[app.pkg_reader_impl] "
            java.lang.String r15 = "\n[app.separated_plugins] "
            java.lang.String r5 = "<this>"
            r6 = 0
            if (r8 != 0) goto L_0x01cf
            java.lang.String r7 = "\n[app.page.url] "
            r3.append(r7)
            java.lang.String r7 = r1.mo116162Q0()
            r3.append(r7)
            java.lang.String r7 = "\n[app.lazy_code_loading] "
            r3.append(r7)
            java.lang.Class<com.tencent.mm.plugin.appbrand.page.c1> r7 = com.tencent.p014mm.plugin.appbrand.page.C83773c1.class
            com.tencent.mm.plugin.appbrand.jsapi.m r7 = r1.mo109671p(r7)
            com.tencent.mm.plugin.appbrand.page.c1 r7 = (com.tencent.p014mm.plugin.appbrand.page.C83773c1) r7
            boolean r7 = r7.mo116114a()
            r3.append(r7)
            r3.append(r15)
            com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap r4 = r4.f238590i
            if (r4 == 0) goto L_0x0142
            android.util.ArrayMap<com.tencent.mm.plugin.appbrand.appcache.r3, java.util.List<com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo>> r4 = r4.f238594d
            int r4 = r4.size()
            if (r4 > 0) goto L_0x013d
            r4 = 1
            goto L_0x013e
        L_0x013d:
            r4 = 0
        L_0x013e:
            if (r4 != 0) goto L_0x0142
            r4 = 1
            goto L_0x0143
        L_0x0142:
            r4 = 0
        L_0x0143:
            r3.append(r4)
            r3.append(r14)
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r4 = r1.getRuntime()
            gy3.C87412m.m108594g(r4, r5)
            com.tencent.mm.plugin.appbrand.appcache.p0 r4 = com.tencent.p014mm.plugin.appbrand.appcache.C81247g3.m99555k(r4, r10)
            boolean r5 = r4 instanceof com.tencent.p014mm.plugin.appbrand.appcache.C81247g3
            if (r5 == 0) goto L_0x015b
            com.tencent.mm.plugin.appbrand.appcache.g3 r4 = (com.tencent.p014mm.plugin.appbrand.appcache.C81247g3) r4
            goto L_0x015c
        L_0x015b:
            r4 = r6
        L_0x015c:
            if (r4 == 0) goto L_0x0161
            com.tencent.mm.plugin.appbrand.appcache.o0 r4 = r4.f238649a
            goto L_0x0162
        L_0x0161:
            r4 = r6
        L_0x0162:
            boolean r5 = r4 instanceof com.tencent.p014mm.plugin.appbrand.appcache.C81364t3
            if (r5 == 0) goto L_0x0169
            com.tencent.mm.plugin.appbrand.appcache.t3 r4 = (com.tencent.p014mm.plugin.appbrand.appcache.C81364t3) r4
            goto L_0x016a
        L_0x0169:
            r4 = r6
        L_0x016a:
            if (r4 == 0) goto L_0x016d
            goto L_0x016e
        L_0x016d:
            r12 = r13
        L_0x016e:
            r3.append(r12)
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r4 = r1.getRuntime()
            com.tencent.mm.plugin.appbrand.appcache.p0 r4 = com.tencent.p014mm.plugin.appbrand.appcache.C81247g3.m99555k(r4, r10)
            java.lang.String r5 = r1.mo116162Q0()
            com.tencent.mm.plugin.appbrand.appcache.WxaPkg r4 = r4.mo113498b(r5)
            if (r4 == 0) goto L_0x018e
            r3.append(r11)
            int r4 = r4.mo113436j()
            r3.append(r4)
            goto L_0x019e
        L_0x018e:
            java.lang.Object[] r4 = new java.lang.Object[r9]
            java.lang.String r5 = r1.mo116162Q0()
            r4[r10] = r5
            java.lang.String r5 = "MicroMsg.SecondaryMenuDelegate_ShowPkgInfo"
            java.lang.String r7 = "performItemClick try append pkg_enc_version but get NULL pkg with url:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r5, r7, r4)
        L_0x019e:
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r2 = r2.f261072r
            int r2 = r2.f238585d
            boolean r2 = com.tencent.p014mm.plugin.appbrand.appcache.C81289m.C81290a.m99664b(r2)
            if (r2 == 0) goto L_0x0228
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r2 = r1.getRuntime()
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r2 = r2.mo113210l1()
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r2 = r2.f234804H
            long r4 = r2.f239449B
            r7 = 0
            int r2 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x0228
            java.lang.String r2 = "\n[app.template_id] "
            r3.append(r2)
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r2 = r1.getRuntime()
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r2 = r2.mo113210l1()
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r2 = r2.f234804H
            long r4 = r2.f239449B
            r3.append(r4)
            goto L_0x0228
        L_0x01cf:
            r3.append(r15)
            com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap r2 = r4.f238590i
            if (r2 == 0) goto L_0x01e5
            android.util.ArrayMap<com.tencent.mm.plugin.appbrand.appcache.r3, java.util.List<com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo>> r2 = r2.f238594d
            int r2 = r2.size()
            if (r2 > 0) goto L_0x01e0
            r2 = 1
            goto L_0x01e1
        L_0x01e0:
            r2 = 0
        L_0x01e1:
            if (r2 != 0) goto L_0x01e5
            r2 = 1
            goto L_0x01e6
        L_0x01e5:
            r2 = 0
        L_0x01e6:
            r3.append(r2)
            r3.append(r14)
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r2 = r1.getRuntime()
            gy3.C87412m.m108594g(r2, r5)
            com.tencent.mm.plugin.appbrand.appcache.p0 r2 = com.tencent.p014mm.plugin.appbrand.appcache.C81247g3.m99555k(r2, r10)
            boolean r5 = r2 instanceof com.tencent.p014mm.plugin.appbrand.appcache.C81247g3
            if (r5 == 0) goto L_0x01fe
            com.tencent.mm.plugin.appbrand.appcache.g3 r2 = (com.tencent.p014mm.plugin.appbrand.appcache.C81247g3) r2
            goto L_0x01ff
        L_0x01fe:
            r2 = r6
        L_0x01ff:
            if (r2 == 0) goto L_0x0204
            com.tencent.mm.plugin.appbrand.appcache.o0 r2 = r2.f238649a
            goto L_0x0205
        L_0x0204:
            r2 = r6
        L_0x0205:
            boolean r5 = r2 instanceof com.tencent.p014mm.plugin.appbrand.appcache.C81364t3
            if (r5 == 0) goto L_0x020c
            com.tencent.mm.plugin.appbrand.appcache.t3 r2 = (com.tencent.p014mm.plugin.appbrand.appcache.C81364t3) r2
            goto L_0x020d
        L_0x020c:
            r2 = r6
        L_0x020d:
            if (r2 == 0) goto L_0x0210
            goto L_0x0211
        L_0x0210:
            r12 = r13
        L_0x0211:
            r3.append(r12)
            java.lang.String r2 = r4.pkgPath
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
            if (r2 == 0) goto L_0x0228
            r3.append(r11)
            java.lang.String r2 = r4.pkgPath
            int r2 = com.tencent.p014mm.plugin.appbrand.appcache.WxaPkg.m99509d(r2)
            r3.append(r2)
        L_0x0228:
            java.lang.String r2 = "\n[app.preload_type] "
            r3.append(r2)
            java.lang.String r2 = r1.getAppId()
            com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime r2 = com.tencent.p014mm.plugin.appbrand.report.quality.C84185b.m103770c(r2, r9)
            long r4 = r2.mo116871a()
            r3.append(r4)
            r2 = 10
            r3.append(r2)
            java.lang.String r2 = "\n[js_runtime] "
            r3.append(r2)
            kr0.e r2 = r1.mo116160O0()
            com.tencent.mm.plugin.appbrand.jsruntime.i r2 = r2.getJsRuntime()
            com.tencent.mm.plugin.appbrand.report.m r4 = com.tencent.p014mm.plugin.appbrand.report.C84136m.m103674a(r2)
            java.lang.String r4 = r4.name()
            boolean r2 = r2 instanceof com.tencent.p014mm.plugin.appbrand.debugger.C81745v
            if (r2 == 0) goto L_0x026b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            java.lang.String r4 = "(remote_debug)"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
        L_0x026b:
            r3.append(r4)
            java.lang.String r2 = "\n[v8.version] "
            r3.append(r2)
            java.lang.String r2 = com.eclipsesource.mmv8.C80135V8.getV8Version()
            r3.append(r2)
            java.lang.String r2 = "\n[v8.lite] "
            r3.append(r2)
            java.lang.String r2 = com.eclipsesource.mmv8.C80135V8.getFlags()
            java.lang.String r4 = "--lite-mode"
            boolean r2 = r2.contains(r4)
            r3.append(r2)
            boolean r2 = com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWCAccessible.m99327c(r1)
            if (r2 != 0) goto L_0x02e3
            boolean r2 = r1.mo116168W0()
            if (r2 == 0) goto L_0x029e
            java.lang.String r2 = "\n[renderer] skyline"
            r3.append(r2)
            goto L_0x02e3
        L_0x029e:
            java.lang.String r2 = "\n[renderer] webview"
            r3.append(r2)
            java.lang.String r2 = "\n[webview] "
            r3.append(r2)
            com.tencent.mm.plugin.appbrand.report.b0 r2 = com.tencent.p014mm.plugin.appbrand.report.C84106b0.m103652a(r6)
            r3.append(r2)
            java.lang.String r2 = "\n[webview.version] "
            r3.append(r2)
            com.tencent.mm.plugin.appbrand.page.j2 r2 = r1.mo116525M1()
            java.lang.String r2 = r2.getVersionInfo()
            r3.append(r2)
            r2 = 10
            r3.append(r2)
            java.lang.String r4 = "\n[nTrans.webview] "
            r3.append(r4)
            boolean r4 = com.tencent.p014mm.plugin.appbrand.jsruntime.C83155d0.m102047e(r1)
            r3.append(r4)
            java.lang.String r4 = "\n[nTrans.service] "
            r3.append(r4)
            kr0.e r4 = r1.mo116160O0()
            boolean r4 = com.tencent.p014mm.plugin.appbrand.jsruntime.C83155d0.m102046d(r4)
            r3.append(r4)
            r3.append(r2)
        L_0x02e3:
            java.lang.String r2 = "\n\n[system.font_scale] "
            r3.append(r2)
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()
            r5 = 4
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r4, r5)
            r4 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r5 = "text_size_scale_key"
            float r2 = r2.getFloat(r5, r4)
            r3.append(r2)
            java.lang.String r2 = "\n"
            r3.append(r2)
            java.lang.String r2 = "\n[is_use_nativebuffer] "
            r3.append(r2)
            nj0.i r2 = nj0.C88969i.f256559c
            java.lang.Object r2 = r2.mo123353e()
            java.lang.String r2 = (java.lang.String) r2
            r3.append(r2)
            kr0.e r2 = r1.mo116160O0()
            boolean r4 = r2 instanceof p284zb.C91635f
            if (r4 == 0) goto L_0x031f
            goto L_0x0320
        L_0x031f:
            r2 = r6
        L_0x0320:
            if (r2 == 0) goto L_0x032b
            java.lang.Class<eb.e> r4 = p958eb.C86474e.class
            java.lang.Object r2 = r2.mo125517G0(r4)
            eb.e r2 = (p958eb.C86474e) r2
            goto L_0x032c
        L_0x032b:
            r2 = r6
        L_0x032c:
            if (r2 != 0) goto L_0x0330
            goto L_0x03bd
        L_0x0330:
            java.lang.String r4 = "\n[renderer] "
            com.tencent.magicbrush.a r2 = r2.mo120910U()
            if (r2 != 0) goto L_0x0343
            r3.append(r4)
            java.lang.String r2 = "unknown"
            r3.append(r2)
            goto L_0x03bd
        L_0x0343:
            r3.append(r4)
            java.lang.String r5 = "mbruntime"
            r3.append(r5)
            r3.append(r4)
            java.lang.String r5 = "commandbuffer "
            r3.append(r5)
            com.tencent.magicbrush.MBRuntime$MBParams r5 = r2.f235053b
            boolean r5 = r5.use_command_buffer
            r3.append(r5)
            r3.append(r4)
            java.lang.String r5 = "cmd pool "
            r3.append(r5)
            com.tencent.magicbrush.MBRuntime$MBParams r5 = r2.f235053b
            int r5 = r5.cmd_pool_type
            r3.append(r5)
            r3.append(r4)
            java.lang.String r5 = "antialias "
            r3.append(r5)
            com.tencent.magicbrush.MBRuntime$MBParams r2 = r2.f235053b
            boolean r2 = r2.allow_antialias_
            if (r2 == 0) goto L_0x037a
            java.lang.String r2 = "allowed"
            goto L_0x037c
        L_0x037a:
            java.lang.String r2 = "disallowed"
        L_0x037c:
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = "surface "
            r3.append(r2)
            nj0.w r2 = nj0.C88983w.f256575c
            java.lang.Object r2 = r2.mo123353e()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x039a
            java.lang.String r2 = "surfacetexture"
            goto L_0x039c
        L_0x039a:
            java.lang.String r2 = "legacysurface"
        L_0x039c:
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = "jsengine "
            r3.append(r2)
            nj0.v r2 = nj0.C88982v.f256574c
            java.lang.Object r2 = r2.mo123353e()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x03b8
            java.lang.String r2 = "node"
            goto L_0x03ba
        L_0x03b8:
            java.lang.String r2 = "j2v8"
        L_0x03ba:
            r3.append(r2)
        L_0x03bd:
            java.lang.String r2 = "\n[isolate_context] "
            r3.append(r2)
            kr0.e r1 = r1.mo116160O0()
            boolean r1 = r1.mo122650O0()
            r3.append(r1)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r0)
            r1.setText(r3)
            r2 = 19
            r1.setGravity(r2)
            r2 = 1092616192(0x41200000, float:10.0)
            r1.setTextSize(r9, r2)
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r3 = -1
            r4 = -2
            r2.<init>(r3, r4)
            r1.setLayoutParams(r2)
            android.content.res.Resources r2 = r17.getResources()
            r3 = 2131101252(0x7f060644, float:1.7814908E38)
            int r2 = r2.getColor(r3)
            r1.setTextColor(r2)
            android.graphics.Typeface r2 = android.graphics.Typeface.MONOSPACE
            r1.setTypeface(r2)
            android.content.res.Resources r2 = r17.getResources()
            r3 = 2131165553(0x7f070171, float:1.7945326E38)
            int r2 = r2.getDimensionPixelSize(r3)
            r1.setPadding(r2, r2, r2, r2)
            android.text.method.MovementMethod r2 = android.text.method.ScrollingMovementMethod.getInstance()
            r1.setMovementMethod(r2)
            qo3.g r0 = nj3.C76879j.m92746q(r0, r6, r1, r6)
            r0.setCanceledOnTouchOutside(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mp0.C88810u.mo115970a(android.content.Context, com.tencent.mm.plugin.appbrand.page.d1, java.lang.String):void");
    }

    /* renamed from: b */
    public String mo115971b(Context context, C83780d1 d1Var, String str) {
        C83928t1 t1Var = (C83928t1) d1Var;
        return context.getString(C0966R.string.f7877uq);
    }

    /* renamed from: c */
    public boolean mo115972c(Context context, C83780d1 d1Var, String str) {
        C83928t1 t1Var = (C83928t1) d1Var;
        return BuildInfo.DEBUG || WeChatEnvironment.hasDebugger() || BuildInfo.IS_FLAVOR_RED || C84072q1.m103586a(str).f245471o;
    }
}
