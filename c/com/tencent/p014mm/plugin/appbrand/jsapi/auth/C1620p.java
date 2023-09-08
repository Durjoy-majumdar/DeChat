package com.tencent.p014mm.plugin.appbrand.jsapi.auth;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.appbrand.jsapi.auth.entity.MMAuthScopeRiskInfo;
import com.tencent.p014mm.plugin.appbrand.jsapi.auth.entity.MMAuthScopeRiskWxaAppInfo;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandAuthRealNameProxyEmptyUI;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import di0.C86299o;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import k20.C9556a;
import ke3.C88144b;
import kr0.C76630x0;
import qo3.C77398g;
import qo3.C77426q;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.p */
public final class C1620p {

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.p$a */
    public static abstract class C1621a {

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.p$a$a */
        public static final class C1622a extends C1621a {

            /* renamed from: a */
            public static final C1622a f11233a = new C1622a();

            /* renamed from: b */
            public void mo1662b() {
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.p$a$b */
        public static final class C1623b extends C1621a {

            /* renamed from: a */
            public final Context f11234a;

            public C1623b(Context context) {
                C87412m.m108594g(context, "context");
                this.f11234a = context;
            }

            /* renamed from: b */
            public void mo1662b() {
                if (!BuildInfo.DEBUG || (this.f11234a instanceof Activity)) {
                    Context context = this.f11234a;
                    if (context instanceof Activity) {
                        int i = AppBrandAuthRealNameProxyEmptyUI.f11889d;
                        Activity activity = (Activity) context;
                        C87412m.m108594g(activity, "context");
                        Intent intent = new Intent(activity, AppBrandAuthRealNameProxyEmptyUI.class);
                        intent.putExtra("action", "startRealNameVerify");
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent);
                        Activity activity2 = activity;
                        C117292a.m165358d(activity2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/AppBrandAuthRealNameProxyEmptyUI$Companion", "startRealNameVerify", "(Landroid/app/Activity;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        activity.startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(activity2, "com/tencent/mm/plugin/appbrand/ui/AppBrandAuthRealNameProxyEmptyUI$Companion", "startRealNameVerify", "(Landroid/app/Activity;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("context must be Activity".toString());
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.p$a$c */
        public static final class C1624c extends C1621a {

            /* renamed from: a */
            public final Context f11235a;

            /* renamed from: b */
            public final String f11236b;

            public C1624c(Context context, String str) {
                C87412m.m108594g(context, "context");
                C87412m.m108594g(str, "url");
                this.f11235a = context;
                this.f11236b = str;
            }

            /* renamed from: b */
            public void mo1662b() {
                Context context = this.f11235a;
                Intent intent = new Intent();
                intent.putExtra("rawUrl", this.f11236b);
                C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent.putExtra("forceHideShare", true), (Bundle) null);
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.p$a$d */
        public static final class C1625d extends C1621a {

            /* renamed from: a */
            public final Context f11237a;

            /* renamed from: b */
            public final String f11238b;

            /* renamed from: c */
            public final int f11239c;

            /* renamed from: d */
            public final String f11240d;

            /* renamed from: e */
            public final int f11241e;

            /* renamed from: f */
            public final int f11242f;

            public C1625d(Context context, String str, int i, String str2, int i2, int i3) {
                C87412m.m108594g(context, "context");
                C87412m.m108594g(str, "userName");
                C87412m.m108594g(str2, "path");
                this.f11237a = context;
                this.f11238b = str;
                this.f11239c = i;
                this.f11240d = str2;
                this.f11241e = i2;
                this.f11242f = i3;
            }

            /* renamed from: b */
            public void mo1662b() {
                C86299o oVar = new C86299o();
                oVar.f250929a = this.f11238b;
                oVar.f250934f = this.f11240d;
                oVar.f250939k = this.f11241e;
                oVar.f250931c = this.f11239c;
                oVar.f250932d = this.f11242f;
                ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(this.f11237a, oVar);
            }
        }

        /* renamed from: a */
        public static final C1621a m1657a(Context context, MMAuthScopeRiskInfo mMAuthScopeRiskInfo) {
            C1622a aVar;
            C87412m.m108594g(context, "context");
            C87412m.m108594g(mMAuthScopeRiskInfo, "info");
            int i = mMAuthScopeRiskInfo.f11219e;
            if (i != 0) {
                C1623b bVar = i == 1 ? new C1623b(context) : null;
                if (bVar != null) {
                    return bVar;
                }
            }
            int i2 = mMAuthScopeRiskInfo.f11218d;
            if (i2 == 1) {
                return new C1624c(context, "");
            }
            if (i2 == 2) {
                return new C1624c(context, mMAuthScopeRiskInfo.f11223i);
            }
            if (i2 != 3) {
                aVar = C1622a.f11233a;
            } else {
                MMAuthScopeRiskWxaAppInfo mMAuthScopeRiskWxaAppInfo = mMAuthScopeRiskInfo.f11224j;
                if (mMAuthScopeRiskWxaAppInfo != null) {
                    return new C1625d(context, mMAuthScopeRiskWxaAppInfo.f11225d, mMAuthScopeRiskWxaAppInfo.f11229h, mMAuthScopeRiskWxaAppInfo.f11226e, mMAuthScopeRiskWxaAppInfo.f11228g, mMAuthScopeRiskWxaAppInfo.f11227f);
                }
                aVar = C1622a.f11233a;
            }
            return aVar;
        }

        /* renamed from: b */
        public abstract void mo1662b();
    }

    /* renamed from: a */
    public static final void m1656a(Context context, String str, String str2, String str3, C1621a aVar, DialogInterface.OnDismissListener onDismissListener) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "content");
        C87412m.m108594g(str2, "positiveBtnText");
        C87412m.m108594g(str3, "negativeBtnText");
        C87412m.m108594g(aVar, "positivePerformer");
        C77426q qVar = new C77426q(context);
        qVar.mo107595g(str);
        qVar.mo107602n(str2);
        boolean z = false;
        if (str3.length() > 0) {
            qVar.mo107598j(str3);
        }
        qVar.mo107591c(C1618n.f11231a, new C1619o(aVar));
        qVar.mo107593e(onDismissListener);
        qVar.mo107603o();
        qVar.f225839c.mo107529i(-2, str3.length() > 0);
        C77398g gVar = qVar.f225839c;
        if (str2.length() > 0) {
            z = true;
        }
        gVar.mo107529i(-1, z);
    }
}
