package com.tencent.p014mm.plugin.appbrand.launching;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Window;
import com.tencent.luggage.sdk.config.AppBrandInitWindowConfig;
import com.tencent.luggage.sdk.processes.C80260h;
import com.tencent.luggage.sdk.processes.C80264l;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelappbrand.LaunchParamsOptional;
import com.tencent.p014mm.plugin.appbrand.C81895h2;
import com.tencent.p014mm.plugin.appbrand.C84258t;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandWeishiParams;
import com.tencent.p014mm.plugin.appbrand.config.C81661j;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.jsapi.fakenative.OpenBusinessViewUtil;
import com.tencent.p014mm.plugin.appbrand.launching.WeAppOpenUICallbackIPCProxy;
import com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.p014mm.plugin.appbrand.launching.precondition.C83428o;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.report.C68633w;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import com.tencent.xweb.CommandCfg;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.xweb.util.WXWebReporter;
import di0.C86297n;
import di0.C86299o;
import di0.C86300q;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import junit.framework.Assert;
import kb0.C88132b;
import kr0.C76628m0;
import kr0.C76629w0;
import kr0.C76630x0;
import nj3.C76879j;
import org.xwalk.core.XWalkEnvironment;
import p206nj.C117627q;
import qo3.C89779i0;
import rx3.C13598b0;
import wi0.C90973a0;
import wi0.C91003z;
import ym0.C91516n;

@C86522b(dependencies = {PluginAppBrand.class}, onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND})
/* renamed from: com.tencent.mm.plugin.appbrand.launching.h4 */
public final class C83331h4 extends C86301e implements C76630x0 {

    /* renamed from: d */
    public boolean f243508d = false;

    /* renamed from: e */
    public C89779i0 f243509e;

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.h4$a */
    public class C83332a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ String f243510d;

        public C83332a(String str) {
            this.f243510d = str;
        }

        public void onCancel(DialogInterface dialogInterface) {
            Log.m105928w("MicroMsg.WeAppLauncher", "openBusinessViewByWebView, user canceled");
            C83331h4.this.f243508d = true;
            OpenBusinessViewUtil.m101149c(this.f243510d, (String) null, -3);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.h4$b */
    public class C83333b implements OpenBusinessViewUtil.C40463b {

        /* renamed from: a */
        public final /* synthetic */ String f243512a;

        /* renamed from: b */
        public final /* synthetic */ String f243513b;

        /* renamed from: c */
        public final /* synthetic */ String f243514c;

        /* renamed from: d */
        public final /* synthetic */ int f243515d;

        /* renamed from: e */
        public final /* synthetic */ Context f243516e;

        /* renamed from: f */
        public final /* synthetic */ int f243517f;

        public C83333b(String str, String str2, String str3, int i, Context context, int i2) {
            this.f243512a = str;
            this.f243513b = str2;
            this.f243514c = str3;
            this.f243515d = i;
            this.f243516e = context;
            this.f243517f = i2;
        }

        /* renamed from: A */
        public void mo63221A(String str, String str2, boolean z) {
            C83331h4.this.vx0();
            if (!C83331h4.this.f243508d) {
                if (Util.isNullOrNil(str)) {
                    Log.m105920e("MicroMsg.WeAppLauncher", "openBusinessViewByWebView, invalid businessType");
                    OpenBusinessViewUtil.m101149c(this.f243512a, (String) null, -4);
                    return;
                }
                AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
                appBrandStatObject.f245533f = 1055;
                appBrandStatObject.f245534g = C117627q.m165908a(Util.nullAsNil(this.f243513b)) + XVFSFile.PATH_SEPARATOR + this.f243514c + XVFSFile.PATH_SEPARATOR + this.f243515d;
                AppBrandLaunchReferrer appBrandLaunchReferrer = new AppBrandLaunchReferrer();
                appBrandLaunchReferrer.f239397e = this.f243514c;
                appBrandLaunchReferrer.f239396d = 2;
                appBrandLaunchReferrer.f239401i = this.f243513b;
                appBrandLaunchReferrer.f239404o = this.f243512a;
                appBrandLaunchReferrer.f239403n = 5;
                if (AppBrandLaunchProxyUI.m102164N7(this.f243516e, (String) null, str, str2, this.f243517f, -1, appBrandStatObject, appBrandLaunchReferrer, (LaunchParamsOptional) null)) {
                    Log.m105924i("MicroMsg.WeAppLauncher", "openBusinessViewByWebView, launch success");
                    return;
                }
                Log.m105920e("MicroMsg.WeAppLauncher", "openBusinessViewByWebView, launch fail");
                OpenBusinessViewUtil.m101149c(this.f243512a, (String) null, -1);
            }
        }

        /* renamed from: z */
        public void mo63222z(int i, String str) {
            Log.m105921e("MicroMsg.WeAppLauncher", "openBusinessViewByWebView, launch fail, CGI errCode:%d, errMsg:%s", Integer.valueOf(i), str);
            C83331h4.this.vx0();
            OpenBusinessViewUtil.m101149c(this.f243512a, (String) null, -2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.h4$c */
    public class C83334c implements C76630x0.C76631a {

        /* renamed from: a */
        public boolean f243519a = false;

        /* renamed from: b */
        public final /* synthetic */ C76630x0.C76631a f243520b;

        public C83334c(C83331h4 h4Var, C76630x0.C76631a aVar) {
            this.f243520b = aVar;
        }

        /* renamed from: a */
        public void mo106901a() {
            if (!this.f243519a) {
                this.f243519a = true;
                C76630x0.C76631a aVar = this.f243520b;
                if (aVar != null) {
                    aVar.mo106901a();
                }
            }
        }

        /* renamed from: b */
        public void mo106902b() {
            if (!this.f243519a) {
                this.f243519a = true;
                C76630x0.C76631a aVar = this.f243520b;
                if (aVar != null) {
                    aVar.mo106902b();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.h4$d */
    public class C83335d implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C76630x0.C76631a f243521d;

        /* renamed from: e */
        public final /* synthetic */ String f243522e;

        /* renamed from: f */
        public final /* synthetic */ String f243523f;

        public C83335d(C76630x0.C76631a aVar, String str, String str2) {
            this.f243521d = aVar;
            this.f243522e = str;
            this.f243523f = str2;
        }

        public void onCancel(DialogInterface dialogInterface) {
            Log.m105928w("MicroMsg.WeAppLauncher", "openBusinessViewByOpenSdk, user canceled");
            C83331h4.this.f243508d = true;
            this.f243521d.mo106902b();
            OpenBusinessViewUtil.m101147a(this.f243522e, (String) null, this.f243523f, -2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.h4$e */
    public class C83336e implements OpenBusinessViewUtil.C40463b {

        /* renamed from: a */
        public final /* synthetic */ C76630x0.C76631a f243525a;

        /* renamed from: b */
        public final /* synthetic */ String f243526b;

        /* renamed from: c */
        public final /* synthetic */ String f243527c;

        /* renamed from: d */
        public final /* synthetic */ int f243528d;

        public C83336e(C76630x0.C76631a aVar, String str, String str2, int i) {
            this.f243525a = aVar;
            this.f243526b = str;
            this.f243527c = str2;
            this.f243528d = i;
        }

        /* renamed from: A */
        public void mo63221A(String str, String str2, boolean z) {
            C83331h4.this.vx0();
            if (!C83331h4.this.f243508d) {
                if (Util.isNullOrNil(str)) {
                    Log.m105920e("MicroMsg.WeAppLauncher", "openBusinessViewByOpenSdk, invalid businessType");
                    this.f243525a.mo106902b();
                    OpenBusinessViewUtil.m101147a(this.f243526b, (String) null, this.f243527c, -3);
                    return;
                }
                AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
                appBrandStatObject.f245533f = WXWebReporter.WXWEB_IDKEY_FR_WORD_ID;
                appBrandStatObject.f245534g = this.f243526b;
                AppBrandLaunchReferrer appBrandLaunchReferrer = new AppBrandLaunchReferrer();
                appBrandLaunchReferrer.f239397e = this.f243526b;
                appBrandLaunchReferrer.f239396d = 4;
                appBrandLaunchReferrer.f239404o = this.f243527c;
                appBrandLaunchReferrer.f239403n = 5;
                if (AppBrandLaunchProxyUI.m102164N7(MMApplicationContext.getContext(), (String) null, str, str2, this.f243528d, -1, appBrandStatObject, appBrandLaunchReferrer, (LaunchParamsOptional) null)) {
                    Log.m105924i("MicroMsg.WeAppLauncher", "openBusinessViewByOpenSdk, launch success");
                    this.f243525a.mo106901a();
                    return;
                }
                Log.m105920e("MicroMsg.WeAppLauncher", "openBusinessViewByOpenSdk, launch fail");
                this.f243525a.mo106902b();
                OpenBusinessViewUtil.m101147a(this.f243526b, (String) null, this.f243527c, -3);
            }
        }

        /* renamed from: z */
        public void mo63222z(int i, String str) {
            Log.m105921e("MicroMsg.WeAppLauncher", "openBusinessViewByOpenSdk, launch fail, CGI errCode:%d, errMsg:%s", Integer.valueOf(i), str);
            C83331h4.this.vx0();
            this.f243525a.mo106902b();
            OpenBusinessViewUtil.m101147a(this.f243526b, (String) null, this.f243527c, -3);
        }
    }

    /* renamed from: C6 */
    public void mo106885C6(C86300q qVar) {
        if (qVar != null) {
            WeAppOpenUICallbackIPCProxy.C83284b bVar = WeAppOpenUICallbackIPCProxy.C83284b.f243391a;
            C87412m.m108594g(qVar, "uiCallback");
            SparseIntArray sparseIntArray = WeAppOpenUICallbackIPCProxy.C83284b.f243393c;
            synchronized (sparseIntArray) {
                sparseIntArray.put(qVar.hashCode(), 1);
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    /* renamed from: EF */
    public void mo106886EF(Context context, String str, String str2, boolean z, C68070l.C68072b bVar, Bundle bundle) {
        String str3 = str;
        String str4 = str2;
        C68070l.C68072b bVar2 = bVar;
        Bundle bundle2 = bundle;
        AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
        LaunchParamsOptional launchParamsOptional = new LaunchParamsOptional();
        AppBrandLaunchReferrer appBrandLaunchReferrer = new AppBrandLaunchReferrer();
        int i = (bundle2 == null || !bundle2.getBoolean("stat_weishi_from_opensdk", false)) ? 0 : 1;
        if (i != 0) {
            appBrandStatObject.f245533f = 1036;
            appBrandStatObject.f245534g = Util.nullAsNil(bVar2.f195562d) + XVFSFile.PATH_SEPARATOR + Util.nullAsNil(C117627q.m165908a(bVar2.f195586j)) + XVFSFile.PATH_SEPARATOR + Util.nullAsNil(bVar2.f195589j2);
            appBrandStatObject.f245531d = z ? 2 : 1;
            if (z) {
                str4 = String.format("%s:%s", new Object[]{str3, str4});
            }
            appBrandStatObject.f245532e = str4;
            Log.m105925i("MicroMsg.WeAppLauncher", "launchWeishiVideoMiniProgram, from opensdk appmsg, scene:%s", Integer.valueOf(appBrandStatObject.f245533f));
            if (!Util.isNullOrNil(bVar2.f195593k2)) {
                appBrandStatObject.f245534g += ":1";
            } else {
                appBrandStatObject.f245534g += ":0";
            }
            appBrandLaunchReferrer.f239397e = bVar2.f195562d;
            appBrandLaunchReferrer.f239396d = 4;
        } else {
            String str5 = bVar2.f195589j2;
            if (z) {
                appBrandStatObject.f245533f = 1008;
                appBrandStatObject.f245534g = str3 + XVFSFile.PATH_SEPARATOR + str4 + XVFSFile.PATH_SEPARATOR + str5;
            } else {
                appBrandStatObject.f245533f = 1007;
                appBrandStatObject.f245534g = str4 + XVFSFile.PATH_SEPARATOR + str5;
            }
            if (bundle2 != null) {
                appBrandStatObject.f245531d = C68633w.m80874a(appBrandStatObject.f245533f, bundle2);
                appBrandStatObject.f245532e = C68633w.m80875b(appBrandStatObject.f245533f, bundle2);
            }
            Log.m105925i("MicroMsg.WeAppLauncher", "launchWeishiVideoMiniProgram, from chatting appmsg, scene:%s", Integer.valueOf(appBrandStatObject.f245533f));
            appBrandLaunchReferrer.f239397e = bVar2.f195562d;
            appBrandLaunchReferrer.f239396d = 6;
        }
        if (!Util.isNullOrNil(bVar2.f195593k2)) {
            launchParamsOptional.f237918d = str3;
            launchParamsOptional.f237919e = bVar2.f195593k2;
        }
        if (bundle2 != null && C91516n.m114822a(bVar2.f195577g2)) {
            AppBrandWeishiParams appBrandWeishiParams = new AppBrandWeishiParams();
            appBrandWeishiParams.f239420d = i;
            appBrandWeishiParams.f239421e = bundle2.getString("stat_weishi_thumb_url", (String) null);
            appBrandWeishiParams.f239422f = bundle2.getString("stat_weishi_thumb_path", (String) null);
            appBrandWeishiParams.f239423g = bundle2.getString("stat_weishi_msg_img_path", (String) null);
            appBrandWeishiParams.f239424h = bundle2.getString("stat_weishi_app_id", (String) null);
            appBrandWeishiParams.f239425i = bundle2.getString("stat_weishi_app_name", (String) null);
            appBrandWeishiParams.f239426j = bundle2.getString("stat_weishi_source_username", (String) null);
            launchParamsOptional.f237921g = appBrandWeishiParams;
            Log.m105925i("MicroMsg.WeAppLauncher", "launchWeishiVideoMiniProgram, weishi params:%s", appBrandWeishiParams);
        }
        AppBrandLaunchProxyUI.m102164N7(context, bVar2.f195573f2, bVar2.f195577g2, bVar2.f195569e2, bVar2.f195653z2, bVar2.f195467A2, appBrandStatObject, appBrandLaunchReferrer, launchParamsOptional);
    }

    public void Ko0(Context context, String str, String str2, int i, int i2, String str3, AppBrandStatObject appBrandStatObject) {
        AppBrandLaunchProxyUI.m102164N7(context, str, str2, str3, i, i2, appBrandStatObject, (AppBrandLaunchReferrer) null, (LaunchParamsOptional) null);
    }

    public void Kw0(Context context, String str, String str2, String str3, int i, String str4, int i2) {
        String str5 = str2;
        if (!Util.isNullOrNil(str3)) {
            if (Util.isNullOrNil(str3) || Util.isNullOrNil(str2)) {
                Log.m105920e("MicroMsg.WeAppLauncher", "targetAppId %s referrerAppId %s, Null Or Nil");
                return;
            }
            AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
            appBrandStatObject.f245533f = 1055;
            appBrandStatObject.f245534g = C117627q.m165908a(Util.nullAsNil(str)) + XVFSFile.PATH_SEPARATOR + str2 + XVFSFile.PATH_SEPARATOR + i2;
            AppBrandLaunchReferrer appBrandLaunchReferrer = new AppBrandLaunchReferrer();
            appBrandLaunchReferrer.f239397e = str5;
            appBrandLaunchReferrer.f239396d = 2;
            appBrandLaunchReferrer.f239401i = str;
            Assert.assertTrue(!BuildInfo.DEBUG || AppBrandLaunchProxyUI.m102164N7(context, (String) null, str3, str4, i, -1, appBrandStatObject, appBrandLaunchReferrer, (LaunchParamsOptional) null));
        }
    }

    public void La0(Context context, String str, String str2, String str3, int i, C76630x0.C76631a aVar) {
        Context context2 = context;
        Log.m105925i("MicroMsg.WeAppLauncher", "openBusinessViewByOpenSdk isMain[%b]", Boolean.valueOf(MMHandlerThread.isMainThread()));
        C83334c cVar = new C83334c(this, aVar);
        this.f243508d = false;
        C83335d dVar = new C83335d(cVar, str, str2);
        vx0();
        this.f243509e = C76879j.m92723Q(context, context.getString(C0966R.string.a3h), context.getString(C0966R.string.a4d), true, true, dVar);
        OpenBusinessViewUtil.m101152f(1, str2, str3, str, (String) null, new C83336e(cVar, str, str2, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        if (r0 != 1036) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Rg0(android.content.Context r10, java.lang.String r11, java.lang.String r12, int r13, int r14, java.lang.String r15, com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject r16, java.lang.String r17) {
        /*
            r9 = this;
            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer r7 = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer
            r7.<init>()
            r6 = r16
            int r0 = r6.f245533f
            r1 = 1020(0x3fc, float:1.43E-42)
            if (r0 == r1) goto L_0x0034
            r1 = 1043(0x413, float:1.462E-42)
            if (r0 == r1) goto L_0x0034
            r1 = 1055(0x41f, float:1.478E-42)
            if (r0 == r1) goto L_0x0030
            r1 = 1069(0x42d, float:1.498E-42)
            if (r0 == r1) goto L_0x002c
            r1 = 1082(0x43a, float:1.516E-42)
            if (r0 == r1) goto L_0x0034
            r1 = 1102(0x44e, float:1.544E-42)
            if (r0 == r1) goto L_0x0034
            r1 = 1035(0x40b, float:1.45E-42)
            if (r0 == r1) goto L_0x0034
            r1 = 1036(0x40c, float:1.452E-42)
            if (r0 == r1) goto L_0x002c
        L_0x0029:
            r0 = r17
            goto L_0x0038
        L_0x002c:
            r0 = 4
            r7.f239396d = r0
            goto L_0x0029
        L_0x0030:
            r0 = 2
            r7.f239396d = r0
            goto L_0x0029
        L_0x0034:
            r0 = 5
            r7.f239396d = r0
            goto L_0x0029
        L_0x0038:
            r7.f239397e = r0
            r8 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r15
            r4 = r13
            r5 = r14
            r6 = r16
            com.tencent.p014mm.plugin.appbrand.launching.AppBrandLaunchProxyUI.m102164N7(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.launching.C83331h4.Rg0(android.content.Context, java.lang.String, java.lang.String, int, int, java.lang.String, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject, java.lang.String):void");
    }

    /* renamed from: XS */
    public C76628m0 mo106891XS(Context context) {
        return new C81895h2(context);
    }

    public boolean fn0() {
        return CommandCfg.getInstance().getCmdAsBoolean("dis_set_back_ground_color", XWalkEnvironment.MODULE_TOOLS, false);
    }

    public void gm0(Context context, String str, String str2, int i, int i2, String str3, AppBrandStatObject appBrandStatObject, String str4, String str5) {
        AppBrandLaunchReferrer appBrandLaunchReferrer = new AppBrandLaunchReferrer();
        appBrandLaunchReferrer.f239396d = 7;
        appBrandLaunchReferrer.f239397e = str4;
        appBrandLaunchReferrer.f239405p = str5;
        AppBrandLaunchProxyUI.m102164N7(context, str, str2, str3, i, i2, appBrandStatObject, appBrandLaunchReferrer, (LaunchParamsOptional) null);
    }

    /* renamed from: i7 */
    public void mo106894i7(String str, String str2, int i, boolean z) {
        String e = TextUtils.isEmpty(str2) ? C81661j.m100180e(str) : str2;
        Log.m105925i("MicroMsg.WeAppLauncher", "closeWxaApp() identity:[%s | %s]->[%s | %s], versionType:%d, allowBackgroundRunning:%b", str, str2, str, e, Integer.valueOf(i), Boolean.valueOf(z));
        if (!TextUtils.isEmpty(e)) {
            if (!z) {
                AppBrandProcessesManager.m103869I().mo111407t(e, i);
                return;
            }
            AppBrandProcessesManager I = AppBrandProcessesManager.m103869I();
            C87412m.m108594g(e, "appId");
            I.mo111393h(e, i, new C80260h(I));
        }
    }

    public void mo0() {
        Iterator it = ((ArrayList) AppBrandProcessesManager.m103869I().mo111386a()).iterator();
        while (it.hasNext()) {
            C80264l lVar = (C80264l) it.next();
            if (!lVar.f234968d) {
                AppBrandProcessesManager.m103869I().mo111407t(lVar.f234965a, -1);
            }
        }
    }

    /* renamed from: pI */
    public void mo106896pI(Context context, String str, String str2, String str3, String str4, int i, int i2) {
        Context context2 = context;
        this.f243508d = false;
        C83332a aVar = new C83332a(str3);
        vx0();
        this.f243509e = C76879j.m92723Q(context, context2.getString(C0966R.string.a3h), context2.getString(C0966R.string.a4d), true, true, aVar);
        OpenBusinessViewUtil.m101152f(2, str3, str4, str2, str, new C83333b(str3, str, str2, i2, context, i));
    }

    /* renamed from: rj */
    public void mo106897rj(Context context, String str, String str2, boolean z, C68070l.C68072b bVar, Bundle bundle) {
        int i;
        String str3 = str;
        C68070l.C68072b bVar2 = bVar;
        Bundle bundle2 = bundle;
        AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
        if (bundle2 != null && bundle2.getBoolean("stat_kf_guide", false)) {
            Log.m105918d("MicroMsg.WeAppLauncher", "launchByOpenSdkAppMessage kf guide msg");
            appBrandStatObject.f245533f = 1157;
            appBrandStatObject.f245534g = str3;
        } else {
            appBrandStatObject.f245533f = 1036;
            appBrandStatObject.f245534g = Util.nullAsNil(bVar2.f195562d) + XVFSFile.PATH_SEPARATOR + Util.nullAsNil(C117627q.m165908a(Util.nullAsNil(bVar2.f195586j)));
        }
        appBrandStatObject.f245531d = z ? 2 : 1;
        appBrandStatObject.f245532e = z ? String.format("%s:%s", new Object[]{str3, str2}) : str2;
        LaunchParamsOptional launchParamsOptional = new LaunchParamsOptional();
        appBrandStatObject.f245541q = bundle2.getInt("chat_type", -1);
        if (!Util.isNullOrNil(bVar2.f195593k2)) {
            launchParamsOptional.f237918d = str3;
            launchParamsOptional.f237919e = bVar2.f195593k2;
            appBrandStatObject.f245534g += ":1";
        } else {
            appBrandStatObject.f245534g += ":0";
        }
        launchParamsOptional.f237922h = bVar2.f195617q2;
        appBrandStatObject.f245534g += XVFSFile.PATH_SEPARATOR + Util.nullAsNil(bVar2.f195589j2);
        appBrandStatObject.f245534g += XVFSFile.PATH_SEPARATOR + bundle2.getInt("chat_type", -1);
        appBrandStatObject.f245534g += XVFSFile.PATH_SEPARATOR + str3;
        if (appBrandStatObject.f245533f == 1157) {
            appBrandStatObject.f245534g += XVFSFile.PATH_SEPARATOR + Util.nullAsNil(bVar2.f195562d);
        }
        if (appBrandStatObject.f245533f == 1036 && ((i = bundle2.getInt("stat_scene", 0)) == 2 || i == 1)) {
            WxaAttributes N2 = ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106879N2(bVar2.f195573f2);
            appBrandStatObject.f245534g += XVFSFile.PATH_SEPARATOR + (C88132b.m109733d(bVar2, N2) ? 1 : 0) + XVFSFile.PATH_SEPARATOR + (C88132b.m109735e(bVar2, N2) ? 1 : 0);
        }
        AppBrandLaunchReferrer appBrandLaunchReferrer = new AppBrandLaunchReferrer();
        appBrandLaunchReferrer.f239396d = 4;
        appBrandLaunchReferrer.f239397e = bVar2.f195562d;
        if (!z) {
            str3 = "";
        }
        String str4 = str3;
        String str5 = bVar2.f195573f2;
        String str6 = bVar2.f195577g2;
        String str7 = bVar2.f195569e2;
        int i2 = bVar2.f195653z2;
        int i3 = bVar2.f195467A2;
        int i4 = AppBrandLaunchProxyUI.f243123t;
        if (!Util.isNullOrNil(str5) || !Util.isNullOrNil(str6)) {
            ((C83285a) C83428o.f243800a).mo115584d(context, str5, str6, str7, i2, i3, appBrandStatObject, appBrandLaunchReferrer, launchParamsOptional, str4);
        }
    }

    /* renamed from: tv */
    public void mo106898tv(Context context, C86299o oVar) {
        Activity castActivityOrNull;
        Window window;
        C83316f1 f1Var = C83316f1.f243478a;
        try {
            f1Var.mo115607a(oVar);
            C83428o oVar2 = C83428o.f243800a;
            LaunchParcel f = f1Var.mo115612f(oVar);
            if (!(C90973a0.TRANSPARENT != oVar.f250913B || (castActivityOrNull = AndroidContextUtil.castActivityOrNull(context)) == null || (window = castActivityOrNull.getWindow()) == null)) {
                AppBrandInitWindowConfig appBrandInitWindowConfig = f.f243716H;
                if (appBrandInitWindowConfig == null) {
                    appBrandInitWindowConfig = new AppBrandInitWindowConfig(false, 0, (C90973a0) null, (String) null, false, (C91003z) null, (C91003z) null, 127, (C8480h) null);
                }
                f.f243716H = appBrandInitWindowConfig;
                appBrandInitWindowConfig.f234849d = true;
                appBrandInitWindowConfig.f234850e = window.getNavigationBarColor();
            }
            C13598b0 b0Var = C13598b0.f38549a;
            ((C83285a) oVar2).mo115582b(context, f);
        } catch (Exception e) {
            if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED) {
                throw new RuntimeException(e);
            }
            Log.printErrStackTrace("MicroMsg.AppBrand.ExportWxaInstrumentation", e, "", new Object[0]);
        }
    }

    /* renamed from: ud */
    public boolean mo106899ud(String str, int i) {
        return AppBrandProcessesManager.m103869I().mo111385G(str, i);
    }

    public final void vx0() {
        C89779i0 i0Var = this.f243509e;
        if (i0Var != null) {
            i0Var.dismiss();
            this.f243509e = null;
        }
    }

    public void y20(C86299o oVar, C86297n nVar) {
        if (oVar != null) {
            C84258t.f246113a.mo116939a(oVar, nVar);
        }
    }
}
