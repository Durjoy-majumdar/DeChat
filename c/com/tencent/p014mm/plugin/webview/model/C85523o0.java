package com.tencent.p014mm.plugin.webview.model;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.MutableContextWrapper;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.model.gdpr.C1289a;
import com.tencent.p014mm.model.gdpr.C1290b;
import com.tencent.p014mm.plugin.webview.model.C85541t0;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C85590k1;
import com.tencent.p014mm.plugin.webview.stub.C43791l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import ea3.C7608b;
import gy3.C87412m;
import h81.C32735h;
import java.io.IOException;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ji3.C9457a;
import nj3.C76879j;
import ob0.C47350c;
import p229rs.C13102b;
import pe3.C47465a;
import sx3.C64197v;
import te3.C50781p43;
import te3.C64601o43;
import te3.C90437rw3;
import te3.C90442v43;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.webview.model.o0 */
public final class C85523o0 {

    /* renamed from: a */
    public static String[] f249233a;

    /* renamed from: b */
    public static boolean f249234b;

    /* renamed from: com.tencent.mm.plugin.webview.model.o0$a */
    public interface C43723a {
        void remove(int i);
    }

    /* renamed from: com.tencent.mm.plugin.webview.model.o0$b */
    public static final class C85524b {

        /* renamed from: a */
        public static long f249235a = 0;

        /* renamed from: b */
        public static long f249236b = 0;

        /* renamed from: c */
        public static int f249237c = -1;

        /* renamed from: com.tencent.mm.plugin.webview.model.o0$b$a */
        public class C85525a implements C40324j.C40326a {

            /* renamed from: a */
            public final /* synthetic */ C43791l f249238a;

            /* renamed from: b */
            public final /* synthetic */ C43723a f249239b;

            /* renamed from: c */
            public final /* synthetic */ boolean f249240c;

            /* renamed from: d */
            public final /* synthetic */ Context f249241d;

            /* renamed from: e */
            public final /* synthetic */ C85537c f249242e;

            public C85525a(C43791l lVar, C43723a aVar, boolean z, Context context, C85537c cVar) {
                this.f249238a = lVar;
                this.f249239b = aVar;
                this.f249240c = z;
                this.f249241d = context;
                this.f249242e = cVar;
            }

            /* renamed from: a */
            public void mo288a(int i, int i2, String str, C47350c cVar) {
                C47465a aVar;
                Log.m105925i("MicroMsg.OauthAuthorizeLogic", "onSceneEnd doOauthAuthorizeConfirm errType = %d, errCode = %d ,errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
                if (this.f249238a != null && this.f249239b != null && this.f249240c) {
                    Bundle bundle = new Bundle();
                    if (i != 0 || i2 != 0 || cVar == null || (aVar = cVar.f127056b.f127083a) == null || !(aVar instanceof C50781p43)) {
                        C85524b.m105553b(false, str, bundle, this.f249241d, this.f249242e, this.f249239b);
                        return;
                    }
                    bundle.putString("redirect_url", ((C50781p43) aVar).f139579d);
                    C85524b.m105553b(true, str, bundle, this.f249241d, this.f249242e, this.f249239b);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.model.o0$b$b */
        public class C85526b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Context f249243d;

            /* renamed from: e */
            public final /* synthetic */ String f249244e;

            /* renamed from: f */
            public final /* synthetic */ C85537c f249245f;

            /* renamed from: com.tencent.mm.plugin.webview.model.o0$b$b$a */
            public class C85527a implements DialogInterface.OnClickListener {
                public C85527a() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    C85526b.this.f249245f.goBack();
                }
            }

            public C85526b(Context context, String str, C85537c cVar) {
                this.f249243d = context;
                this.f249244e = str;
                this.f249245f = cVar;
            }

            public void run() {
                Context context = this.f249243d;
                if (context != null && (context instanceof Activity) && !((Activity) context).isFinishing()) {
                    C76879j.m92749t(this.f249243d, this.f249244e, MMApplicationContext.getContext().getString(C0966R.string.lie), new C85527a());
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.model.o0$b$c */
        public class C85528c implements C1290b {

            /* renamed from: a */
            public final /* synthetic */ C85537c f249247a;

            /* renamed from: b */
            public final /* synthetic */ String f249248b;

            /* renamed from: c */
            public final /* synthetic */ int f249249c;

            /* renamed from: d */
            public final /* synthetic */ String f249250d;

            /* renamed from: com.tencent.mm.plugin.webview.model.o0$b$c$a */
            public class C85529a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ int f249251d;

                public C85529a(int i) {
                    this.f249251d = i;
                }

                public void run() {
                    C7608b bVar = C7608b.INSTANCE;
                    String str = "";
                    if (this.f249251d == 1) {
                        C85528c.this.f249247a.goBack();
                        C85528c cVar = C85528c.this;
                        String str2 = cVar.f249248b;
                        if (str2 != null) {
                            str = str2;
                        }
                        bVar.mo8744a(str, C85524b.f249235a, 0, 1, 0, 0, cVar.f249249c);
                    } else {
                        C85528c cVar2 = C85528c.this;
                        cVar2.f249247a.mo67839b(cVar2.f249250d, 9);
                        C85528c cVar3 = C85528c.this;
                        String str3 = cVar3.f249248b;
                        if (str3 != null) {
                            str = str3;
                        }
                        bVar.mo8744a(str, C85524b.f249235a, 1, 1, 0, 0, cVar3.f249249c);
                    }
                    bVar.mo8745b(1, (int) (System.currentTimeMillis() - C85524b.f249235a), C85528c.this.f249249c);
                }
            }

            public C85528c(C85537c cVar, String str, int i, String str2) {
                this.f249247a = cVar;
                this.f249248b = str;
                this.f249249c = i;
                this.f249250d = str2;
            }

            /* renamed from: a */
            public void mo1216a(int i) {
                Log.m105925i("MicroMsg.OauthAuthorizeLogic", " MPGdprPolicyUtil.checkPolicy onPermissionReturn:%d", Integer.valueOf(i));
                C9457a.m9138b(true, new C85529a(i));
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.model.o0$b$d */
        public class C85530d implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C85537c f249253d;

            /* renamed from: e */
            public final /* synthetic */ String f249254e;

            /* renamed from: f */
            public final /* synthetic */ String f249255f;

            public C85530d(C85537c cVar, String str, String str2) {
                this.f249253d = cVar;
                this.f249254e = str;
                this.f249255f = str2;
            }

            public void run() {
                this.f249253d.mo67840c(this.f249254e, this.f249255f);
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.model.o0$b$e */
        public class C85531e implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Context f249256d;

            /* renamed from: e */
            public final /* synthetic */ Bundle f249257e;

            /* renamed from: f */
            public final /* synthetic */ int f249258f;

            /* renamed from: g */
            public final /* synthetic */ C85537c f249259g;

            /* renamed from: h */
            public final /* synthetic */ Dialog f249260h;

            public C85531e(Context context, Bundle bundle, int i, C85537c cVar, Dialog dialog) {
                this.f249256d = context;
                this.f249257e = bundle;
                this.f249258f = i;
                this.f249259g = cVar;
                this.f249260h = dialog;
            }

            public void run() {
                Context context = this.f249256d;
                Bundle bundle = this.f249257e;
                int i = this.f249258f;
                C85537c cVar = this.f249259g;
                Dialog dialog = this.f249260h;
                C85541t0 t0Var = C85541t0.f249286a;
                C87412m.m108594g(context, "ct");
                C87412m.m108594g(bundle, "resp");
                C87412m.m108594g(cVar, "webviewDelegate");
                if (context instanceof MutableContextWrapper) {
                    context = ((MutableContextWrapper) context).getBaseContext();
                    C87412m.m108593f(context, "ct as MutableContextWrapper).baseContext");
                }
                if (!(context instanceof Activity)) {
                    Log.m105926v(C85541t0.f249287b, "[showDialogQueue] context !is Activity");
                    return;
                }
                if (!(C85541t0.f249289d == i || C85541t0.f249288c == null)) {
                    Log.m105926v(C85541t0.f249287b, "[showDialogQueue] destroy last oauthQueue");
                    C85541t0.m105568c();
                }
                C85541t0.f249289d = i;
                if (C85541t0.f249288c == null) {
                    C85541t0.f249288c = new C85541t0.C85544b(new WeakReference(context), dialog != null ? new WeakReference(dialog) : null, cVar.getCurrentUrl());
                }
                C85541t0.C85544b bVar = C85541t0.f249288c;
                C87412m.m108591d(bVar);
                int i2 = 0;
                if (bVar.f249307e == null) {
                    C85541t0.f249290e = new WeakReference<>(cVar);
                    C85541t0.C85544b bVar2 = C85541t0.f249288c;
                    if (bVar2 != null) {
                        bVar2.f249307e = bundle;
                        Serializable serializable = bundle.getSerializable("scope_list");
                        C87412m.m108592e(serializable, "null cannot be cast to non-null type java.util.ArrayList<kotlin.ByteArray>");
                        LinkedList<C90437rw3> a = C85523o0.m105550a((ArrayList) serializable);
                        bVar2.f249305c = a;
                        C85541t0.f249286a.getClass();
                        if (!Util.isNullOrNil((List) a) && a.size() != 1) {
                            Iterator<T> it = a.iterator();
                            int i3 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                T next = it.next();
                                int i4 = i3 + 1;
                                if (i3 < 0) {
                                    C64197v.m75542k();
                                    throw null;
                                } else if (C87412m.m108589b(((C90437rw3) next).f259822d, "snsapi_userinfo")) {
                                    i2 = i3;
                                    break;
                                } else {
                                    i3 = i4;
                                }
                            }
                            if (i2 > 0) {
                                a.addFirst(a.remove(i2));
                            }
                        }
                        bVar2.mo118934c();
                        return;
                    }
                    return;
                }
                Log.m105924i(C85541t0.f249287b, "[showDialogQueue] repeat call");
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.model.o0$b$f */
        public class C85532f implements C85590k1.C85591a {

            /* renamed from: a */
            public final /* synthetic */ Context f249261a;

            /* renamed from: b */
            public final /* synthetic */ String f249262b;

            /* renamed from: c */
            public final /* synthetic */ C85537c f249263c;

            /* renamed from: d */
            public final /* synthetic */ int f249264d;

            /* renamed from: e */
            public final /* synthetic */ Bundle f249265e;

            /* renamed from: f */
            public final /* synthetic */ C43791l f249266f;

            /* renamed from: g */
            public final /* synthetic */ C43723a f249267g;

            /* renamed from: h */
            public final /* synthetic */ int f249268h;

            /* renamed from: com.tencent.mm.plugin.webview.model.o0$b$f$a */
            public class C85533a implements C1290b {

                /* renamed from: a */
                public final /* synthetic */ Bundle f249269a;

                /* renamed from: com.tencent.mm.plugin.webview.model.o0$b$f$a$a */
                public class C85534a implements Runnable {

                    /* renamed from: d */
                    public final /* synthetic */ int f249271d;

                    public C85534a(int i) {
                        this.f249271d = i;
                    }

                    public void run() {
                        C7608b bVar = C7608b.INSTANCE;
                        String str = "";
                        if (this.f249271d == 1) {
                            C85532f.this.f249263c.goBack();
                            C85532f fVar = C85532f.this;
                            String str2 = fVar.f249262b;
                            if (str2 != null) {
                                str = str2;
                            }
                            bVar.mo8744a(str, C85524b.f249235a, 0, 1, 0, 1, fVar.f249264d);
                        } else {
                            C85532f fVar2 = C85532f.this;
                            String str3 = fVar2.f249262b;
                            if (str3 != null) {
                                str = str3;
                            }
                            bVar.mo8744a(str, C85524b.f249235a, 1, 1, 0, 1, fVar2.f249264d);
                            C85533a aVar = C85533a.this;
                            C85532f fVar3 = C85532f.this;
                            Bundle bundle = fVar3.f249265e;
                            Bundle bundle2 = aVar.f249269a;
                            C85537c cVar = fVar3.f249263c;
                            C43791l lVar = fVar3.f249266f;
                            C43723a aVar2 = fVar3.f249267g;
                            int i = fVar3.f249268h;
                            Context context = fVar3.f249261a;
                            Log.m105924i("MicroMsg.OauthAuthorizeLogic", "doAcceptLogic");
                            if (bundle.getBoolean("is_call_server_when_confirm")) {
                                C85524b.m105552a(lVar, bundle.getString("oauth_url"), 1, (ArrayList) bundle2.getSerializable("key_scope"), aVar2, true, i, cVar, context);
                            } else {
                                String string = bundle.getString("redirect_url");
                                cVar.mo67839b(string, 9);
                                Log.m105925i("MicroMsg.OauthAuthorizeLogic", "doAcceptLogic redirectUrl: %s", string);
                            }
                        }
                        bVar.mo8745b(2, (int) (System.currentTimeMillis() - C85524b.f249236b), C85532f.this.f249264d);
                    }
                }

                public C85533a(Bundle bundle) {
                    this.f249269a = bundle;
                }

                /* renamed from: a */
                public void mo1216a(int i) {
                    Log.m105925i("MicroMsg.OauthAuthorizeLogic", " MPGdprPolicyUtil.checkPolicy onPermissionReturn:%d", Integer.valueOf(i));
                    C9457a.m9138b(true, new C85534a(i));
                }
            }

            public C85532f(Context context, String str, C85537c cVar, int i, Bundle bundle, C43791l lVar, C43723a aVar, int i2) {
                this.f249261a = context;
                this.f249262b = str;
                this.f249263c = cVar;
                this.f249264d = i;
                this.f249265e = bundle;
                this.f249266f = lVar;
                this.f249267g = aVar;
                this.f249268h = i2;
            }

            /* renamed from: a */
            public void mo67901a(int i, Bundle bundle) {
                int i2 = i;
                Bundle bundle2 = bundle;
                Log.m105925i("MicroMsg.OauthAuthorizeLogic", "WebAuthorizeDialog#onRevMsg resultCode %d", Integer.valueOf(i));
                if (i2 == 1) {
                    ((C13102b) C86312j.m106911c(C13102b.class)).mo12480mY(this.f249261a, C1289a.OPENSDK, this.f249262b, new C85533a(bundle2));
                } else if (i2 == 2 || i2 == 3) {
                    Bundle bundle3 = this.f249265e;
                    C85537c cVar = this.f249263c;
                    C43791l lVar = this.f249266f;
                    C43723a aVar = this.f249267g;
                    int i3 = this.f249268h;
                    Context context = this.f249261a;
                    Log.m105924i("MicroMsg.OauthAuthorizeLogic", "doRejectLogic");
                    C85524b.m105552a(lVar, bundle3.getString("oauth_url"), 2, bundle2 == null ? new ArrayList() : (ArrayList) bundle2.getSerializable("key_scope"), aVar, false, i3, cVar, context);
                    cVar.goBack();
                    C7608b bVar = C7608b.INSTANCE;
                    String str = this.f249262b;
                    if (str == null) {
                        str = "";
                    }
                    bVar.mo8744a(str, C85524b.f249235a, 0, 1, 0, 1, this.f249264d);
                    bVar.mo8745b(2, (int) (System.currentTimeMillis() - C85524b.f249236b), this.f249264d);
                } else {
                    this.f249263c.goBack();
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.model.o0$b$g */
        public class C85535g implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Context f249273d;

            /* renamed from: e */
            public final /* synthetic */ String f249274e;

            /* renamed from: f */
            public final /* synthetic */ C85537c f249275f;

            /* renamed from: com.tencent.mm.plugin.webview.model.o0$b$g$a */
            public class C85536a implements DialogInterface.OnClickListener {
                public C85536a() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    C85535g.this.f249275f.goBack();
                }
            }

            public C85535g(Context context, String str, C85537c cVar) {
                this.f249273d = context;
                this.f249274e = str;
                this.f249275f = cVar;
            }

            public void run() {
                C76879j.m92749t(this.f249273d, this.f249274e, MMApplicationContext.getContext().getString(C0966R.string.lie), new C85536a());
            }
        }

        /* renamed from: a */
        public static void m105552a(C43791l lVar, String str, int i, ArrayList<String> arrayList, C43723a aVar, boolean z, int i2, C85537c cVar, Context context) {
            if (lVar == null) {
                Log.m105920e("MicroMsg.OauthAuthorizeLogic", "doOauthAuthorizeConfirm invoker null");
                return;
            }
            f249236b = System.currentTimeMillis();
            C64601o43 o432 = new C64601o43();
            o432.f184614d = str;
            o432.f184615e = i;
            o432.f184616f = new LinkedList<>(arrayList);
            o432.f184618h = cVar.getCurrentUrl();
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127066a = o432;
            bVar.f127067b = new C50781p43();
            bVar.f127068c = "/cgi-bin/mmbiz-bin/oauth_authorize_confirm";
            bVar.f127069d = 1373;
            bVar.f127070e = 0;
            bVar.f127071f = 0;
            ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(bVar.mo72403a(), new C85525a(lVar, aVar, z, context, cVar));
        }

        /* renamed from: b */
        public static void m105553b(boolean z, String str, Bundle bundle, Context context, C85537c cVar, C43723a aVar) {
            Log.m105925i("MicroMsg.OauthAuthorizeLogic", "onOauthAuthorizeConfirmSceneEnd suc: %b", Boolean.valueOf(z));
            if (context != null && !((WebViewUI) context).isFinishing()) {
                aVar.remove(1373);
                if (!z) {
                    ((C119157j) C119157j.f356862d).mo183895z(new C85535g(context, str, cVar));
                } else if (bundle == null) {
                    Log.m105920e("MicroMsg.OauthAuthorizeLogic", "onOauthAuthorizeConfirmSceneEnd resp null");
                } else {
                    String string = bundle.getString("redirect_url");
                    if (Util.isNullOrNil(string)) {
                        Log.m105920e("MicroMsg.OauthAuthorizeLogic", "onOauthAuthorizeConfirmSceneEnd redirect null");
                        return;
                    }
                    cVar.mo67839b(string, 9);
                    Log.m105925i("MicroMsg.OauthAuthorizeLogic", "onOauthAuthorizeConfirmSceneEnd redirectUrl: %s", string);
                }
            }
        }

        /* renamed from: c */
        public static void m105554c(boolean z, String str, Bundle bundle, Context context, C43791l lVar, C85537c cVar, C43723a aVar, int i, int i2, Dialog dialog) {
            Bundle bundle2 = bundle;
            Context context2 = context;
            C85537c cVar2 = cVar;
            int i3 = i2;
            C7608b bVar = C7608b.INSTANCE;
            if (context2 instanceof MutableContextWrapper) {
                context2 = ((MutableContextWrapper) context2).getBaseContext();
            }
            Context context3 = context2;
            boolean z2 = bundle2.getBoolean("is_tourist_oauth");
            String string = bundle2.getString("tourist_banner_wording");
            String string2 = bundle2.getString("redirect_url");
            String d = m105555d(bundle2.getString("oauth_url"));
            Log.m105925i("MicroMsg.OauthAuthorizeLogic", "onOauthAuthorizeSceneEnd suc: %b, isTouristOauth:%b, appID:%s", Boolean.valueOf(z), Boolean.valueOf(z2), d);
            if (!z) {
                cVar.mo67838a();
                ((C119157j) C119157j.f356862d).mo183895z(new C85526b(context3, str, cVar2));
                bVar.mo8744a(d == null ? "" : d, f249235a, 2, 1, 0, 0, i2);
                bVar.mo8745b(1, (int) (System.currentTimeMillis() - f249235a), i3);
                return;
            }
            boolean z3 = bundle2.getBoolean("is_recent_has_auth");
            boolean z4 = bundle2.getBoolean("is_silence_auth");
            if (z3 || z4) {
                cVar.mo67838a();
                if (Util.isNullOrNil(string2)) {
                    Log.m105920e("MicroMsg.OauthAuthorizeLogic", "onOauthAuthorizeSceneEnd redirect null");
                    return;
                }
                Log.m105925i("MicroMsg.OauthAuthorizeLogic", "onOauthAuthorizeSceneEnd isRecentHasAuth:%b isSilenceAuth:%b redirectUrl:%s", Boolean.valueOf(z3), Boolean.valueOf(z4), string2);
                ((C13102b) C86312j.m106911c(C13102b.class)).mo12480mY(context3, C1289a.OPENSDK, d, new C85528c(cVar2, d, i3, string2));
            } else if (!cVar.mo67842e() || !z2 || Util.isNullOrNil(string2)) {
                cVar.mo67838a();
                boolean z5 = bundle2.getBoolean("is_use_new_page", false);
                int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_open_native_oauth_new, 1);
                Log.m105925i("MicroMsg.OauthAuthorizeLogic", "isUseNewPage = %b, open= %d", Boolean.valueOf(z5), Integer.valueOf(Qe));
                if (!z5 || 1 != Qe) {
                    C85532f fVar = new C85532f(context3, d, cVar, i2, bundle, lVar, aVar, i);
                    if (!(context3 instanceof WebViewUI) || !((WebViewUI) context3).isFinishing()) {
                        ((C119157j) C119157j.f356862d).mo183895z(new C43726r0(context3, C85523o0.m105550a((ArrayList) bundle2.getSerializable("scope_list")), bundle2.getString("appname"), bundle2.getString("appicon_url"), fVar));
                    } else {
                        Log.m105924i("MicroMsg.OauthAuthorizeLogic", "showWebAuthorizeDialog isFinishing");
                    }
                } else {
                    ((C119157j) C119157j.f356862d).mo183895z(new C85531e(context3, bundle, i, cVar, dialog));
                }
                bVar.mo8745b(1, (int) (System.currentTimeMillis() - f249235a), i3);
            } else {
                ((C119157j) C119157j.f356862d).mo183895z(new C85530d(cVar2, string2, string));
            }
        }

        /* renamed from: d */
        public static String m105555d(String str) {
            if (Util.isNullOrNil(str)) {
                return null;
            }
            try {
                String queryParameter = Uri.parse(str).getQueryParameter("appid");
                if (!Util.isNullOrNil(queryParameter)) {
                    return queryParameter;
                }
                Log.m105925i("MicroMsg.OauthAuthorizeLogic", "parseAppId try case not sensitive, oauthUrl:%s", str);
                return Uri.parse(str.toLowerCase()).getQueryParameter("appid");
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.model.o0$c */
    public interface C85537c {
        /* renamed from: a */
        void mo67838a();

        /* renamed from: b */
        void mo67839b(String str, int i);

        /* renamed from: c */
        void mo67840c(String str, String str2);

        /* renamed from: d */
        void mo67841d(DialogInterface.OnCancelListener onCancelListener);

        /* renamed from: e */
        boolean mo67842e();

        String getCurrentUrl();

        void goBack();
    }

    /* renamed from: a */
    public static LinkedList<C90437rw3> m105550a(ArrayList<byte[]> arrayList) {
        LinkedList<C90437rw3> linkedList = new LinkedList<>();
        if (arrayList != null && !arrayList.isEmpty()) {
            int i = 0;
            while (i < arrayList.size()) {
                try {
                    C90442v43 v432 = new C90442v43();
                    v432.parseFrom(arrayList.get(i));
                    C90437rw3 rw32 = new C90437rw3();
                    rw32.f259824f = v432.f259864f;
                    rw32.f259823e = v432.f259863e;
                    rw32.f259822d = v432.f259862d;
                    rw32.f259825g = v432.f259865g;
                    rw32.f259827i = v432.f259866h;
                    linkedList.add(rw32);
                    i++;
                } catch (IOException e) {
                    Log.m105929w("MicroMsg.OauthAuthorizeLogic", "bytesListToBytesListScopeInfoList: i:%d, exp:%s", Integer.valueOf(i), e.getLocalizedMessage());
                    linkedList.clear();
                }
            }
        }
        return linkedList;
    }

    /* renamed from: b */
    public static String m105551b() {
        String Y60 = ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_native_oauth_host_for_h5, "");
        Log.m105925i("MicroMsg.OauthAuthorizeLogic", "getOauthHostPaths %s", Y60);
        return Y60;
    }
}
