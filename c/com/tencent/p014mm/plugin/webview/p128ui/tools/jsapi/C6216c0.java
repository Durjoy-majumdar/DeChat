package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.p014mm.autogen.events.Launch3RdAppEvent;
import com.tencent.p014mm.opensdk.constants.Build;
import com.tencent.p014mm.opensdk.modelmsg.WXAppExtendObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.MsgHandler$$r0;
import com.tencent.p014mm.pluginsdk.model.app.C6647c;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.List;
import java.util.Map;
import ji3.C9457a;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import p763ym.C79138l;
import p823sg.C90193h;
import t83.C13851h1;
import te3.C50000jj2;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.c0 */
public class C6216c0 implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ boolean f22928d;

    /* renamed from: e */
    public final /* synthetic */ C13851h1 f22929e;

    /* renamed from: f */
    public final /* synthetic */ String f22930f;

    /* renamed from: g */
    public final /* synthetic */ String f22931g;

    /* renamed from: h */
    public final /* synthetic */ Bundle f22932h;

    /* renamed from: i */
    public final /* synthetic */ String f22933i;

    /* renamed from: j */
    public final /* synthetic */ String f22934j;

    /* renamed from: n */
    public final /* synthetic */ String f22935n;

    /* renamed from: o */
    public final /* synthetic */ String f22936o;

    /* renamed from: p */
    public final /* synthetic */ String f22937p;

    /* renamed from: q */
    public final /* synthetic */ MsgHandler f22938q;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.c0$a */
    public class C6217a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f22939d;

        /* renamed from: e */
        public final /* synthetic */ int f22940e;

        /* renamed from: f */
        public final /* synthetic */ C47350c f22941f;

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.c0$a$a */
        public class C6218a implements MsgHandler$$r0.C6193a {
            public C6218a() {
            }

            /* renamed from: a */
            public void mo7284a(boolean z, boolean z2, boolean z3) {
                Log.m105925i("MicroMsg.MsgHandler", "onLaunchAppCallback(launchRet : %s, launchSuccess : %s)", Boolean.valueOf(z), Boolean.valueOf(z2));
                if (z2) {
                    C6216c0 c0Var = C6216c0.this;
                    MsgHandler msgHandler = c0Var.f22938q;
                    MsgHandler.m6146O3(msgHandler, c0Var.f22928d, msgHandler.f22704n, 1);
                } else if (z3) {
                    C6216c0 c0Var2 = C6216c0.this;
                    MsgHandler msgHandler2 = c0Var2.f22938q;
                    MsgHandler.m6146O3(msgHandler2, c0Var2.f22928d, msgHandler2.f22704n, 2);
                } else {
                    C6216c0 c0Var3 = C6216c0.this;
                    MsgHandler msgHandler3 = c0Var3.f22938q;
                    MsgHandler.m6146O3(msgHandler3, c0Var3.f22928d, msgHandler3.f22704n, 3);
                }
                if (!Util.isNullOrNil(C6216c0.this.f22930f)) {
                    if (z2) {
                        C6216c0 c0Var4 = C6216c0.this;
                        c0Var4.f22938q.mo7210k5(c0Var4.f22929e, "launchApplication:ok", (Map<String, Object>) null);
                    } else if (z3) {
                        C6216c0 c0Var5 = C6216c0.this;
                        c0Var5.f22938q.mo7210k5(c0Var5.f22929e, "launchApplication:cancel", (Map<String, Object>) null);
                    } else {
                        C6216c0 c0Var6 = C6216c0.this;
                        c0Var6.f22938q.mo7210k5(c0Var6.f22929e, "launchApplication:fail", (Map<String, Object>) null);
                    }
                } else if (z) {
                    C6216c0 c0Var7 = C6216c0.this;
                    c0Var7.f22938q.mo7210k5(c0Var7.f22929e, "launchApplication:ok", (Map<String, Object>) null);
                } else {
                    C6216c0 c0Var8 = C6216c0.this;
                    c0Var8.f22938q.mo7210k5(c0Var8.f22929e, "launchApplication:fail", (Map<String, Object>) null);
                }
            }
        }

        public C6217a(int i, int i2, C47350c cVar) {
            this.f22939d = i;
            this.f22940e = i2;
            this.f22941f = cVar;
        }

        public void run() {
            MsgHandler$$r0 msgHandler$$r0;
            Class cls = C79138l.class;
            if (this.f22939d == 0 && this.f22940e == 0) {
                C50000jj2 jj22 = (C50000jj2) this.f22941f.f127056b.f127083a;
                Log.m105925i("MicroMsg.MsgHandler", "launchApplication check result(showType : %d, errCode : %d)", Integer.valueOf(jj22.f136156f), Integer.valueOf(jj22.f136155e));
                if (jj22.f136155e != 0) {
                    C6216c0 c0Var = C6216c0.this;
                    MsgHandler msgHandler = c0Var.f22938q;
                    MsgHandler.m6146O3(msgHandler, c0Var.f22928d, msgHandler.f22704n, 3);
                }
                int i = jj22.f136155e;
                if (i == 0) {
                    Context context = C6216c0.this.f22938q.f22697d;
                    if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
                        MsgHandler$$r0 msgHandler$$r02 = new MsgHandler$$r0(new C6218a());
                        if (!Util.isNullOrNil(C6216c0.this.f22931g)) {
                            Log.m105924i("MicroMsg.MsgHandler", "launchApplication: handle schemeUrl");
                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(C6216c0.this.f22931g));
                            intent.addFlags(268435456);
                            List<ResolveInfo> queryIntentActivities = Util.queryIntentActivities(C6216c0.this.f22938q.f22697d, intent);
                            if ((queryIntentActivities == null || queryIntentActivities.isEmpty()) && !Util.isAffectedByPackageVisibility(MMApplicationContext.getContext())) {
                                ((C79138l) C86312j.m106911c(cls)).q70(C6216c0.this.f22932h);
                            } else {
                                Log.m105924i("MicroMsg.MsgHandler", "launchApplication: handle schemeUrl: list is avaliable");
                                String str = (!TextUtils.isEmpty(intent.getPackage()) || queryIntentActivities == null || queryIntentActivities.size() != 1) ? intent.getPackage() : ((C79138l) C86312j.m106911c(cls)).mo74017uF(queryIntentActivities.get(0));
                                if (!Util.nullAsNil(MMApplicationContext.getPackageName()).equals(str)) {
                                    Log.m105925i("MicroMsg.MsgHandler", "launchApplication: handle schemeUrl: launchAppByWeChat, pkg is %s", str);
                                    C6216c0 c0Var2 = C6216c0.this;
                                    msgHandler$$r02.mo7259b(((C79138l) C86312j.m106911c(cls)).mo73999QH(c0Var2.f22938q.f22697d, intent, (String) null, jj22.f136156f, msgHandler$$r02, c0Var2.f22932h));
                                    return;
                                }
                            }
                        }
                        if (!Util.isNullOrNil(C6216c0.this.f22933i) && !Util.isNullOrNil(C6216c0.this.f22934j)) {
                            Log.m105924i("MicroMsg.MsgHandler", "launchApplication: handle pkg");
                            C6216c0 c0Var3 = C6216c0.this;
                            Signature[] a = C6647c.m6936a(c0Var3.f22938q.f22697d, c0Var3.f22933i);
                            if (!(a == null || a[0] == null)) {
                                Log.m105924i("MicroMsg.MsgHandler", "launchApplication: handle pkg: pkgSigns is avaliable");
                                String f = C90193h.m112878f(a[0].toByteArray());
                                if (f == null || !f.equalsIgnoreCase(C6216c0.this.f22934j)) {
                                    Log.m105924i("MicroMsg.MsgHandler", "launchApplication signature not match");
                                } else {
                                    try {
                                        Intent launchIntentForPackage = MMApplicationContext.getContext().getPackageManager().getLaunchIntentForPackage(C6216c0.this.f22933i);
                                        if (launchIntentForPackage != null) {
                                            Log.m105924i("MicroMsg.MsgHandler", "launchApplication: handle pkg: launchAppByWeChat");
                                            Bundle bundle = new Bundle();
                                            C72688j0.m85023i(bundle, C6216c0.this.f22935n);
                                            launchIntentForPackage.putExtras(bundle);
                                            launchIntentForPackage.addFlags(268435456);
                                            C6216c0 c0Var4 = C6216c0.this;
                                            msgHandler$$r02.mo7259b(((C79138l) C86312j.m106911c(cls)).Dm0(c0Var4.f22938q.f22697d, launchIntentForPackage, (String) null, msgHandler$$r02, c0Var4.f22932h));
                                            return;
                                        }
                                    } catch (Exception e) {
                                        Log.m105921e("MicroMsg.MsgHandler", "launchApplication getLaunchIntentForPackage, %s", e.getMessage());
                                    }
                                }
                            }
                        }
                        WXAppExtendObject wXAppExtendObject = new WXAppExtendObject();
                        wXAppExtendObject.extInfo = C6216c0.this.f22936o;
                        WXMediaMessage wXMediaMessage = new WXMediaMessage(wXAppExtendObject);
                        wXMediaMessage.sdkVer = Build.SDK_INT;
                        wXMediaMessage.messageExt = C6216c0.this.f22936o;
                        Launch3RdAppEvent launch3RdAppEvent = new Launch3RdAppEvent();
                        Launch3RdAppEvent.C1089a aVar = launch3RdAppEvent.f9317d;
                        aVar.f9319a = wXMediaMessage;
                        C6216c0 c0Var5 = C6216c0.this;
                        aVar.f9320b = c0Var5.f22937p;
                        aVar.f9321c = jj22.f136156f;
                        aVar.f9322d = c0Var5.f22938q.f22697d;
                        aVar.f9324f = c0Var5.f22932h;
                        aVar.f9323e = msgHandler$$r02;
                        launch3RdAppEvent.publish();
                        boolean z = launch3RdAppEvent.f9318e.f9325a;
                        Object[] objArr = new Object[1];
                        objArr[0] = z ? "1" : "0";
                        Log.m105925i("MicroMsg.MsgHandler", "launchApplication: handle in EventCenter, r = %s", objArr);
                        if (!z && !Util.isNullOrNil(C6216c0.this.f22937p) && !Util.isNullOrNil(C6216c0.this.f22935n)) {
                            String str2 = C6216c0.this.f22937p + "://" + C6216c0.this.f22935n;
                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                            Log.m105925i("MicroMsg.MsgHandler", "launchApplication by opensdk failed, try to launch by scheme(%s).", str2);
                            intent2.addFlags(268435456);
                            List<ResolveInfo> queryIntentActivities2 = Util.queryIntentActivities(C6216c0.this.f22938q.f22697d, intent2);
                            if ((queryIntentActivities2 != null && !queryIntentActivities2.isEmpty()) || Util.isAffectedByPackageVisibility(MMApplicationContext.getContext())) {
                                Log.m105924i("MicroMsg.MsgHandler", "launchApplication: handle in EventCenter: list is avaliable");
                                String str3 = (!TextUtils.isEmpty(intent2.getPackage()) || queryIntentActivities2 == null || queryIntentActivities2.size() != 1) ? intent2.getPackage() : ((C79138l) C86312j.m106911c(cls)).mo74017uF(queryIntentActivities2.get(0));
                                if (!Util.nullAsNil(MMApplicationContext.getPackageName()).equals(str3)) {
                                    Log.m105925i("MicroMsg.MsgHandler", "launchApplication: handle in EventCenter: launchAppByWeChat, pkg is %s", str3);
                                    msgHandler$$r02.f22854d = false;
                                    msgHandler$$r02.f22852b = false;
                                    msgHandler$$r02.f22855e = false;
                                    msgHandler$$r02.f22851a = false;
                                    C6216c0 c0Var6 = C6216c0.this;
                                    msgHandler$$r0 = msgHandler$$r02;
                                    z = ((C79138l) C86312j.m106911c(cls)).Dm0(c0Var6.f22938q.f22697d, intent2, (String) null, msgHandler$$r02, c0Var6.f22932h);
                                    msgHandler$$r0.mo7259b(z);
                                    return;
                                }
                            }
                        }
                        msgHandler$$r0 = msgHandler$$r02;
                        msgHandler$$r0.mo7259b(z);
                        return;
                    }
                    C6216c0 c0Var7 = C6216c0.this;
                    MsgHandler msgHandler2 = c0Var7.f22938q;
                    MsgHandler.m6146O3(msgHandler2, c0Var7.f22928d, msgHandler2.f22704n, 2);
                    C6216c0 c0Var8 = C6216c0.this;
                    c0Var8.f22938q.mo7210k5(c0Var8.f22929e, "launchApplication:fail_cancel", (Map<String, Object>) null);
                    Log.m105924i("MicroMsg.MsgHandler", "launchApplication activity finished");
                } else if (i == 2) {
                    C6216c0 c0Var9 = C6216c0.this;
                    c0Var9.f22938q.mo7210k5(c0Var9.f22929e, "launchApplication:fail_check fail forbidden scene", (Map<String, Object>) null);
                } else if (i != 3) {
                    C6216c0 c0Var10 = C6216c0.this;
                    c0Var10.f22938q.mo7210k5(c0Var10.f22929e, "launchApplication:fail_check fail", (Map<String, Object>) null);
                } else {
                    C6216c0 c0Var11 = C6216c0.this;
                    c0Var11.f22938q.mo7210k5(c0Var11.f22929e, "launchApplication:fail", (Map<String, Object>) null);
                }
            } else {
                C6216c0 c0Var12 = C6216c0.this;
                MsgHandler msgHandler3 = c0Var12.f22938q;
                MsgHandler.m6146O3(msgHandler3, c0Var12.f22928d, msgHandler3.f22704n, 3);
                C6216c0 c0Var13 = C6216c0.this;
                c0Var13.f22938q.mo7210k5(c0Var13.f22929e, "launchApplication:fail_check fail", (Map<String, Object>) null);
            }
        }
    }

    public C6216c0(MsgHandler msgHandler, boolean z, C13851h1 h1Var, String str, String str2, Bundle bundle, String str3, String str4, String str5, String str6, String str7) {
        this.f22938q = msgHandler;
        this.f22928d = z;
        this.f22929e = h1Var;
        this.f22930f = str;
        this.f22931g = str2;
        this.f22932h = bundle;
        this.f22933i = str3;
        this.f22934j = str4;
        this.f22935n = str5;
        this.f22936o = str6;
        this.f22937p = str7;
    }

    /* renamed from: a */
    public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        Log.m105925i("MicroMsg.MsgHandler", "launchApplication check result errType:%d errCode:%d msg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
        C9457a.m9137a(new C6217a(i, i2, cVar));
        return 0;
    }
}
