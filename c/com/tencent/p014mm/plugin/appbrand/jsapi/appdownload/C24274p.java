package com.tencent.p014mm.plugin.appbrand.jsapi.appdownload;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiLaunchApplicationForNative;
import com.tencent.p014mm.pluginsdk.model.app.C6647c;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.HashSet;
import java.util.List;
import ji3.C9457a;
import ob0.C47350c;
import p763ym.C79138l;
import p823sg.C90193h;
import te3.C50000jj2;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.p */
public class C24274p implements C40324j.C40326a {

    /* renamed from: a */
    public final /* synthetic */ C81925i2 f69686a;

    /* renamed from: b */
    public final /* synthetic */ int f69687b;

    /* renamed from: c */
    public final /* synthetic */ String f69688c;

    /* renamed from: d */
    public final /* synthetic */ Bundle f69689d;

    /* renamed from: e */
    public final /* synthetic */ String f69690e;

    /* renamed from: f */
    public final /* synthetic */ String f69691f;

    /* renamed from: g */
    public final /* synthetic */ String f69692g;

    /* renamed from: h */
    public final /* synthetic */ String f69693h;

    /* renamed from: i */
    public final /* synthetic */ String f69694i;

    /* renamed from: j */
    public final /* synthetic */ JsApiLaunchApplicationForNative f69695j;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.p$a */
    public class C24275a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f69696d;

        /* renamed from: e */
        public final /* synthetic */ int f69697e;

        /* renamed from: f */
        public final /* synthetic */ C47350c f69698f;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.p$a$a */
        public class C24276a implements JsApiLaunchApplicationForNative.C1596a.C1597a {
            public C24276a() {
            }

            /* renamed from: a */
            public void mo1637a(boolean z, boolean z2) {
                Log.m105925i("MicroMsg.JsApiLaunchApplicationForNative", "onLaunchAppCallback(launchRet : %s, launchSuccess : %s)", Boolean.valueOf(z), Boolean.valueOf(z2));
                if (z) {
                    C24274p pVar = C24274p.this;
                    pVar.f69686a.mo109647a(pVar.f69687b, pVar.f69695j.mo115109j("ok"));
                    return;
                }
                C24274p pVar2 = C24274p.this;
                pVar2.f69686a.mo109647a(pVar2.f69687b, pVar2.f69695j.mo115109j("fail:scheme launch fail"));
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.p$a$b */
        public class C24277b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Intent f69701d;

            /* renamed from: e */
            public final /* synthetic */ C50000jj2 f69702e;

            /* renamed from: f */
            public final /* synthetic */ JsApiLaunchApplicationForNative.C1596a f69703f;

            public C24277b(Intent intent, C50000jj2 jj22, JsApiLaunchApplicationForNative.C1596a aVar) {
                this.f69701d = intent;
                this.f69702e = jj22;
                this.f69703f = aVar;
            }

            public void run() {
                this.f69703f.mo1640b(((C79138l) C86312j.m106911c(C79138l.class)).mo73999QH(C24274p.this.f69686a.getContext(), this.f69701d, (String) null, this.f69702e.f136156f, this.f69703f, C24274p.this.f69689d));
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.p$a$c */
        public class C24278c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ JsApiLaunchApplicationForNative.LaunchApplicationTask f69705d;

            public C24278c(JsApiLaunchApplicationForNative.LaunchApplicationTask launchApplicationTask) {
                this.f69705d = launchApplicationTask;
            }

            public void run() {
                Log.m105925i("MicroMsg.JsApiLaunchApplicationForNative", "callback task.success:%b", Boolean.valueOf(this.f69705d.f11159r));
                JsApiLaunchApplicationForNative.LaunchApplicationTask launchApplicationTask = this.f69705d;
                launchApplicationTask.getClass();
                ((HashSet) AppBrandProxyTransparentUIProcessTask.f49238i).remove(launchApplicationTask);
                if (!this.f69705d.f11159r) {
                    C24274p pVar = C24274p.this;
                    pVar.f69686a.mo109647a(pVar.f69687b, pVar.f69695j.mo115109j("fail:sdk launch fail"));
                    return;
                }
                C24274p pVar2 = C24274p.this;
                pVar2.f69686a.mo109647a(pVar2.f69687b, pVar2.f69695j.mo115109j("ok"));
            }
        }

        public C24275a(int i, int i2, C47350c cVar) {
            this.f69696d = i;
            this.f69697e = i2;
            this.f69698f = cVar;
        }

        public void run() {
            Signature[] a;
            Signature signature;
            Class cls = C79138l.class;
            if (this.f69696d == 0 && this.f69697e == 0) {
                C50000jj2 jj22 = (C50000jj2) this.f69698f.f127056b.f127083a;
                int i = jj22.f136155e;
                if (i == 0) {
                    JsApiLaunchApplicationForNative.C1596a aVar = new JsApiLaunchApplicationForNative.C1596a(new C24276a());
                    Log.m105925i("MicroMsg.JsApiLaunchApplicationForNative", "launchApplication check result(showType : %d, errCode : %d)", Integer.valueOf(jj22.f136156f), Integer.valueOf(jj22.f136155e));
                    if (!Util.isNullOrNil(C24274p.this.f69688c)) {
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(C24274p.this.f69688c));
                        intent.addFlags(268435456);
                        List<ResolveInfo> queryIntentActivities = Util.queryIntentActivities(C24274p.this.f69686a.getContext(), intent);
                        if ((queryIntentActivities != null && !queryIntentActivities.isEmpty()) || Util.isAffectedByPackageVisibility(MMApplicationContext.getContext())) {
                            if (!Util.nullAsNil(MMApplicationContext.getPackageName()).equals((!TextUtils.isEmpty(intent.getPackage()) || queryIntentActivities == null || queryIntentActivities.size() != 1) ? intent.getPackage() : ((C79138l) C86312j.m106911c(cls)).mo74017uF(queryIntentActivities.get(0)))) {
                                MMHandlerThread.postToMainThread(new C24277b(intent, jj22, aVar));
                                return;
                            }
                        }
                    }
                    if (!Util.isNullOrNil(C24274p.this.f69690e) && !Util.isNullOrNil(C24274p.this.f69691f) && (a = C6647c.m6936a(C24274p.this.f69686a.mo114344o0(), C24274p.this.f69690e)) != null && (signature = a[0]) != null) {
                        String f = C90193h.m112878f(signature.toByteArray());
                        if (f == null || !f.equalsIgnoreCase(C24274p.this.f69691f)) {
                            Log.m105924i("MicroMsg.JsApiLaunchApplicationForNative", "launchApplication signature not match");
                        } else {
                            try {
                                Intent launchIntentForPackage = MMApplicationContext.getContext().getPackageManager().getLaunchIntentForPackage(C24274p.this.f69690e);
                                if (launchIntentForPackage != null) {
                                    Bundle bundle = new Bundle();
                                    C72688j0.m85023i(bundle, C24274p.this.f69692g);
                                    launchIntentForPackage.putExtras(bundle);
                                    launchIntentForPackage.addFlags(268435456);
                                    aVar.mo1640b(((C79138l) C86312j.m106911c(cls)).Dm0(C24274p.this.f69686a.mo114344o0(), launchIntentForPackage, (String) null, aVar, C24274p.this.f69689d));
                                    return;
                                }
                            } catch (Exception e) {
                                Log.m105921e("MicroMsg.JsApiLaunchApplicationForNative", "launchApplication getLaunchIntentForPackage, %s", e.getMessage());
                            }
                        }
                    }
                    JsApiLaunchApplicationForNative.LaunchApplicationTask launchApplicationTask = new JsApiLaunchApplicationForNative.LaunchApplicationTask(C24274p.this.f69686a.getRuntime().mo113026R());
                    C24274p pVar = C24274p.this;
                    launchApplicationTask.f11155n = pVar.f69693h;
                    launchApplicationTask.f11156o = pVar.f69692g;
                    launchApplicationTask.f11157p = pVar.f69694i;
                    launchApplicationTask.f11158q = pVar.f69689d;
                    launchApplicationTask.f11154j = jj22.f136156f;
                    launchApplicationTask.f11160s = new C24278c(launchApplicationTask);
                    ((HashSet) AppBrandProxyTransparentUIProcessTask.f49238i).add(launchApplicationTask);
                    launchApplicationTask.mo22082a();
                } else if (i != 2) {
                    C24274p pVar2 = C24274p.this;
                    pVar2.f69686a.mo109647a(pVar2.f69687b, pVar2.f69695j.mo115109j("fail:check fail 1"));
                } else {
                    C24274p pVar3 = C24274p.this;
                    pVar3.f69686a.mo109647a(pVar3.f69687b, pVar3.f69695j.mo115109j("fail:check fail forbidden scene 2"));
                }
            } else {
                C24274p pVar4 = C24274p.this;
                pVar4.f69686a.mo109647a(pVar4.f69687b, pVar4.f69695j.mo115109j("fail:check fail"));
            }
        }
    }

    public C24274p(JsApiLaunchApplicationForNative jsApiLaunchApplicationForNative, C81925i2 i2Var, int i, String str, Bundle bundle, String str2, String str3, String str4, String str5, String str6) {
        this.f69695j = jsApiLaunchApplicationForNative;
        this.f69686a = i2Var;
        this.f69687b = i;
        this.f69688c = str;
        this.f69689d = bundle;
        this.f69690e = str2;
        this.f69691f = str3;
        this.f69692g = str4;
        this.f69693h = str5;
        this.f69694i = str6;
    }

    /* renamed from: a */
    public void mo288a(int i, int i2, String str, C47350c cVar) {
        Log.m105925i("MicroMsg.JsApiLaunchApplicationForNative", "on RunCgi callback errType:%d errCode:%d msg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
        C9457a.m9137a(new C24275a(i, i2, cVar));
    }
}
