package com.tencent.p014mm.plugin.webview.model;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.webview.model.C85523o0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import cr0.C86127t;
import di3.C86312j;
import gt0.C76063l;
import gt0.C87330d0;
import gt0.C87347g;
import gt0.C87362k;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import nj3.C76879j;
import ob0.C47350c;
import pe3.C47465a;
import te3.C50781p43;
import te3.C64601o43;
import te3.C90437rw3;
import yq0.C91566l;

/* renamed from: com.tencent.mm.plugin.webview.model.t0 */
public final class C85541t0 {

    /* renamed from: a */
    public static final C85541t0 f249286a = new C85541t0();

    /* renamed from: b */
    public static final String f249287b = "MicroMsg.OauthMultiAccountMgr";

    /* renamed from: c */
    public static C85544b f249288c;

    /* renamed from: d */
    public static int f249289d;

    /* renamed from: e */
    public static WeakReference<C85523o0.C85537c> f249290e;

    /* renamed from: com.tencent.mm.plugin.webview.model.t0$a */
    public static final class C85542a {

        /* renamed from: a */
        public final Context f249291a;

        /* renamed from: b */
        public final C87362k f249292b;

        /* renamed from: c */
        public final C87347g f249293c;

        /* renamed from: d */
        public C85544b f249294d;

        /* renamed from: e */
        public C90437rw3 f249295e;

        /* renamed from: f */
        public final ArrayList<C87330d0.C87331a> f249296f = new ArrayList<>();

        /* renamed from: g */
        public boolean f249297g;

        /* renamed from: h */
        public int f249298h;

        /* renamed from: i */
        public int f249299i;

        /* renamed from: j */
        public String f249300j = "";

        /* renamed from: k */
        public String f249301k = "";

        /* renamed from: com.tencent.mm.plugin.webview.model.t0$a$a */
        public static final class C85543a implements C91566l.C91570c {

            /* renamed from: a */
            public final /* synthetic */ C85542a f249302a;

            public C85543a(C85542a aVar) {
                this.f249302a = aVar;
            }

            /* renamed from: a */
            public void mo114536a(int i, ArrayList<String> arrayList, int i2, boolean z) {
                C85544b bVar;
                C87412m.m108594g(arrayList, "select");
                if (i == 1) {
                    C85541t0.f249286a.getClass();
                    String str = C85541t0.f249287b;
                    Log.m105924i(str, "[OauthDialog.revnListener] ACCEPT, scope = " + arrayList.get(0));
                    if (!Util.isNullOrNil((List) arrayList) && (bVar = this.f249302a.f249294d) != null) {
                        String str2 = arrayList.get(0);
                        C87412m.m108593f(str2, "select.get(0)");
                        bVar.f249310h.add(str2);
                    }
                    C85544b bVar2 = this.f249302a.f249294d;
                    if (bVar2 != null) {
                        bVar2.mo118934c();
                        return;
                    }
                    return;
                }
                C85541t0.f249286a.getClass();
                String str3 = C85541t0.f249287b;
                Log.m105924i(str3, "[OauthDialog.revnListener] REJECT, scope = " + arrayList.get(0));
                C85544b bVar3 = this.f249302a.f249294d;
                if (bVar3 != null) {
                    bVar3.mo118934c();
                }
            }
        }

        public C85542a(Context context, C87362k kVar) {
            C87412m.m108594g(context, "context");
            C87412m.m108594g(kVar, "container");
            this.f249291a = context;
            this.f249292b = kVar;
            C85543a aVar = new C85543a(this);
            C86127t tVar = new C86127t();
            tVar.mo120546A(tVar.f250648d);
            this.f249293c = new C87347g(context, tVar, aVar);
        }

        /* renamed from: a */
        public final void mo118931a(C90437rw3 rw32, C87347g gVar, List<C87330d0.C87331a> list, boolean z, int i) {
            gVar.setSelectListItem(list);
            if (z || i <= list.size()) {
                if (!z) {
                    gVar.setFunctionButtonText(this.f249291a.getResources().getString(C0966R.string.lid));
                    gVar.setFunctionButtonTextColor(this.f249291a.getResources().getColor(C0966R.color.BW_0_Alpha_0_3));
                } else {
                    gVar.setFunctionButtonText("");
                }
                gVar.setFunctionButtonOnClickListener((View.OnClickListener) null);
                return;
            }
            gVar.setFunctionButtonText(this.f249291a.getResources().getString(C0966R.string.lid));
            gVar.setFunctionButtonTextColor(this.f249291a.getResources().getColor(C0966R.color.a1d));
            gVar.setFunctionButtonOnClickListener(new C85539s0(this));
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.model.t0$b */
    public static final class C85544b {

        /* renamed from: a */
        public final WeakReference<Context> f249303a;

        /* renamed from: b */
        public final String f249304b;

        /* renamed from: c */
        public LinkedList<C90437rw3> f249305c = new LinkedList<>();

        /* renamed from: d */
        public int f249306d;

        /* renamed from: e */
        public Bundle f249307e;

        /* renamed from: f */
        public C85542a f249308f;

        /* renamed from: g */
        public C87362k f249309g;

        /* renamed from: h */
        public final ArrayList<String> f249310h;

        /* renamed from: i */
        public int f249311i;

        /* renamed from: com.tencent.mm.plugin.webview.model.t0$b$a */
        public static final class C85545a implements C40324j.C40326a {

            /* renamed from: a */
            public final /* synthetic */ C85544b f249312a;

            /* renamed from: com.tencent.mm.plugin.webview.model.t0$b$a$a */
            public static final class C85546a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ int f249313d;

                /* renamed from: e */
                public final /* synthetic */ int f249314e;

                /* renamed from: f */
                public final /* synthetic */ C47350c f249315f;

                /* renamed from: g */
                public final /* synthetic */ C85544b f249316g;

                /* renamed from: h */
                public final /* synthetic */ String f249317h;

                /* renamed from: com.tencent.mm.plugin.webview.model.t0$b$a$a$a */
                public static final class C85547a implements DialogInterface.OnClickListener {

                    /* renamed from: d */
                    public static final C85547a f249318d = new C85547a();

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C85541t0.m105566a(C85541t0.f249286a);
                    }
                }

                public C85546a(int i, int i2, C47350c cVar, C85544b bVar, String str) {
                    this.f249313d = i;
                    this.f249314e = i2;
                    this.f249315f = cVar;
                    this.f249316g = bVar;
                    this.f249317h = str;
                }

                public final void run() {
                    if (this.f249313d == 0 && this.f249314e == 0) {
                        C47465a aVar = this.f249315f.f127056b.f127083a;
                        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.OauthAuthorizeConfirmResp");
                        C50781p43 p432 = (C50781p43) aVar;
                        if (!Util.isNullOrNil(p432.f139579d)) {
                            C85541t0 t0Var = C85541t0.f249286a;
                            String str = p432.f139579d;
                            C87412m.m108593f(str, "rsp.redirect_url");
                            C85541t0.m105567b(t0Var, str);
                            return;
                        }
                        C85541t0.m105568c();
                        return;
                    }
                    try {
                        C76879j.m92749t(this.f249316g.f249303a.get(), this.f249317h, MMApplicationContext.getContext().getString(C0966R.string.lie), C85547a.f249318d);
                    } catch (Exception e) {
                        C85541t0.f249286a.getClass();
                        String str2 = C85541t0.f249287b;
                        Log.m105920e(str2, "showAlert ex " + e.getMessage());
                    }
                }
            }

            public C85545a(C85544b bVar) {
                this.f249312a = bVar;
            }

            /* renamed from: a */
            public final void mo288a(int i, int i2, String str, C47350c cVar) {
                MMHandlerThread.postToMainThread(new C85546a(i, i2, cVar, this.f249312a, str));
            }
        }

        public C85544b(WeakReference<Context> weakReference, WeakReference<Dialog> weakReference2, String str) {
            Window window;
            Dialog dialog;
            C87412m.m108594g(weakReference, "context");
            this.f249303a = weakReference;
            this.f249304b = str;
            Context context = weakReference.get();
            C87412m.m108591d(context);
            ViewGroup viewGroup = null;
            this.f249309g = new C87362k(context, (C76063l) null);
            this.f249310h = new ArrayList<>();
            if (weakReference2 == null || (dialog = weakReference2.get()) == null || (window = dialog.getWindow()) == null) {
                Context context2 = weakReference.get();
                C87412m.m108592e(context2, "null cannot be cast to non-null type android.app.Activity");
                window = ((Activity) context2).getWindow();
            }
            KeyEvent.Callback decorView = window.getDecorView();
            if (decorView != null) {
                viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : viewGroup;
                if (viewGroup != null) {
                    viewGroup.addView(this.f249309g);
                }
            }
        }

        /* renamed from: a */
        public final void mo118932a(int i) {
            String string;
            C64601o43 o432 = new C64601o43();
            Bundle bundle = this.f249307e;
            String str = "";
            if (!(bundle == null || (string = bundle.getString("oauth_url", str)) == null)) {
                str = string;
            }
            o432.f184614d = str;
            o432.f184615e = i;
            o432.f184616f.addAll(this.f249310h);
            o432.f184617g = this.f249311i;
            o432.f184618h = this.f249304b;
            C85541t0.f249286a.getClass();
            String str2 = C85541t0.f249287b;
            Log.m105918d(str2, "[OauthQueue.sendReq] scope = " + o432.f184616f + ", avatarId = " + this.f249311i + ", url = " + o432.f184618h);
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127066a = o432;
            bVar.f127067b = new C50781p43();
            bVar.f127068c = "/cgi-bin/mmbiz-bin/oauth_authorize_confirm";
            bVar.f127069d = 1373;
            bVar.f127070e = 0;
            bVar.f127071f = 0;
            ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(bVar.mo72403a(), new C85545a(this));
        }

        /* renamed from: b */
        public final void mo118933b(int i) {
            this.f249311i = i;
            C85541t0.f249286a.getClass();
            String str = C85541t0.f249287b;
            Log.m105926v(str, "[QauthQueue] selectAvatartId = " + i);
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00c4  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo118934c() {
            /*
                r21 = this;
                r0 = r21
                com.tencent.mm.plugin.webview.model.t0$a r1 = r0.f249308f
                r2 = 0
                if (r1 == 0) goto L_0x001c
                if (r1 == 0) goto L_0x000c
                gt0.g r3 = r1.f249293c
                goto L_0x000d
            L_0x000c:
                r3 = r2
            L_0x000d:
                if (r3 == 0) goto L_0x001c
                gt0.k r3 = r0.f249309g
                if (r3 == 0) goto L_0x001c
                if (r1 == 0) goto L_0x0018
                gt0.g r1 = r1.f249293c
                goto L_0x0019
            L_0x0018:
                r1 = r2
            L_0x0019:
                r3.mo121777a(r1)
            L_0x001c:
                java.util.LinkedList<te3.rw3> r1 = r0.f249305c
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r1)
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L_0x0034
                com.tencent.mm.plugin.webview.model.t0 r1 = com.tencent.p014mm.plugin.webview.model.C85541t0.f249286a
                r1.getClass()
                java.lang.String r1 = com.tencent.p014mm.plugin.webview.model.C85541t0.f249287b
                java.lang.String r5 = "[OauthQueue.checkEnd] scopeList null"
                com.tencent.p014mm.sdk.platformtools.Log.m105926v(r1, r5)
            L_0x0032:
                r1 = 1
                goto L_0x004c
            L_0x0034:
                int r1 = r0.f249306d
                java.util.LinkedList<te3.rw3> r5 = r0.f249305c
                int r5 = r5.size()
                if (r1 < r5) goto L_0x004b
                com.tencent.mm.plugin.webview.model.t0 r1 = com.tencent.p014mm.plugin.webview.model.C85541t0.f249286a
                r1.getClass()
                java.lang.String r1 = com.tencent.p014mm.plugin.webview.model.C85541t0.f249287b
                java.lang.String r5 = "[OauthQueue.checkEnd] curIndex end"
                com.tencent.p014mm.sdk.platformtools.Log.m105926v(r1, r5)
                goto L_0x0032
            L_0x004b:
                r1 = 0
            L_0x004c:
                java.lang.String r5 = "oauth_url"
                java.lang.String r6 = ""
                r7 = 2
                if (r1 == 0) goto L_0x00c4
                android.os.Bundle r1 = r0.f249307e
                if (r1 == 0) goto L_0x005b
                java.lang.String r2 = r1.getString(r5, r6)
            L_0x005b:
                java.lang.String r1 = com.tencent.p014mm.plugin.webview.model.C85523o0.C85524b.m105555d(r2)
                java.util.ArrayList<java.lang.String> r2 = r0.f249310h
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r2)
                if (r2 == 0) goto L_0x00a9
                com.tencent.mm.plugin.webview.model.t0 r2 = com.tencent.p014mm.plugin.webview.model.C85541t0.f249286a
                r2.getClass()
                java.lang.String r2 = com.tencent.p014mm.plugin.webview.model.C85541t0.f249287b
                java.lang.String r4 = "[OauthQueue.sendResult] allowScope empty"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
                ea3.b r4 = ea3.C7608b.INSTANCE
                if (r1 != 0) goto L_0x0079
                r9 = r6
                goto L_0x007a
            L_0x0079:
                r9 = r1
            L_0x007a:
                long r10 = com.tencent.p014mm.plugin.webview.model.C85523o0.C85524b.f249235a
                r12 = 0
                r13 = 1
                r14 = 0
                r15 = 1
                r16 = 0
                r8 = r4
                r8.mo8744a(r9, r10, r12, r13, r14, r15, r16)
                long r5 = java.lang.System.currentTimeMillis()
                long r8 = com.tencent.p014mm.plugin.webview.model.C85523o0.C85524b.f249236b
                long r5 = r5 - r8
                int r1 = (int) r5
                r4.mo8745b(r7, r1, r3)
                java.lang.String r1 = "[OauthQueue.reject] reject"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
                r0.mo118932a(r7)
                java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.model.o0$c> r1 = com.tencent.p014mm.plugin.webview.model.C85541t0.f249290e
                if (r1 == 0) goto L_0x00c3
                java.lang.Object r1 = r1.get()
                com.tencent.mm.plugin.webview.model.o0$c r1 = (com.tencent.p014mm.plugin.webview.model.C85523o0.C85537c) r1
                if (r1 == 0) goto L_0x00c3
                r1.goBack()
                goto L_0x00c3
            L_0x00a9:
                java.lang.Class<rs.b> r2 = p229rs.C13102b.class
                di3.d r2 = di3.C86312j.m106911c(r2)
                rs.b r2 = (p229rs.C13102b) r2
                java.lang.ref.WeakReference<android.content.Context> r3 = r0.f249303a
                java.lang.Object r3 = r3.get()
                android.content.Context r3 = (android.content.Context) r3
                com.tencent.mm.model.gdpr.a r4 = com.tencent.p014mm.model.gdpr.C1289a.OPENSDK
                com.tencent.mm.plugin.webview.model.y0 r5 = new com.tencent.mm.plugin.webview.model.y0
                r5.<init>(r1, r0)
                r2.mo12480mY(r3, r4, r1, r5)
            L_0x00c3:
                return
            L_0x00c4:
                com.tencent.mm.plugin.webview.model.t0$a r1 = new com.tencent.mm.plugin.webview.model.t0$a
                java.lang.ref.WeakReference<android.content.Context> r8 = r0.f249303a
                java.lang.Object r8 = r8.get()
                gy3.C87412m.m108591d(r8)
                android.content.Context r8 = (android.content.Context) r8
                gt0.k r9 = r0.f249309g
                gy3.C87412m.m108591d(r9)
                r1.<init>(r8, r9)
                r1.f249294d = r0
                android.os.Bundle r8 = r0.f249307e
                gy3.C87412m.m108591d(r8)
                java.util.LinkedList<te3.rw3> r9 = r0.f249305c
                int r10 = r0.f249306d
                java.lang.Object r9 = r9.get(r10)
                java.lang.String r10 = "scopeList[curIndex]"
                gy3.C87412m.m108593f(r9, r10)
                r12 = r9
                te3.rw3 r12 = (te3.C90437rw3) r12
                r1.f249295e = r12
                gt0.g r9 = r1.f249293c
                r9.mo121757e(r7)
                gt0.g r7 = r1.f249293c
                android.content.Context r9 = r7.getContext()
                java.lang.Object[] r10 = new java.lang.Object[r4]
                java.lang.String r11 = "appname"
                java.lang.String r13 = r8.getString(r11, r6)
                r10[r3] = r13
                r13 = 2131832249(0x7f112db9, float:1.9297546E38)
                java.lang.String r9 = r9.getString(r13, r10)
                r7.setAppBrandName(r9)
                java.lang.String r9 = r12.f259823e
                r7.setRequestDesc(r9)
                r7.setApplyWording(r6)
                java.lang.String r9 = r12.f259827i
                boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
                if (r9 != 0) goto L_0x0127
                java.lang.String r9 = r12.f259827i
                r7.setSimpleDetailDesc(r9)
            L_0x0127:
                android.content.Context r9 = r7.getContext()
                android.content.res.Resources r9 = r9.getResources()
                r10 = 2131832299(0x7f112deb, float:1.9297648E38)
                java.lang.String r9 = r9.getString(r10)
                r7.setNegativeButtonText(r9)
                android.content.Context r9 = r7.getContext()
                android.content.res.Resources r9 = r9.getResources()
                r10 = 2131832234(0x7f112daa, float:1.9297516E38)
                java.lang.String r9 = r9.getString(r10)
                r7.setPositiveButtonText(r9)
                java.lang.String r9 = "appicon_url"
                java.lang.String r9 = r8.getString(r9, r6)
                r7.setIconUrl(r9)
                com.tencent.mm.plugin.webview.model.t0 r7 = com.tencent.p014mm.plugin.webview.model.C85541t0.f249286a
                java.lang.String r9 = "avatar_list"
                java.io.Serializable r9 = r8.getSerializable(r9)
                java.lang.String r10 = "null cannot be cast to non-null type java.util.ArrayList<kotlin.ByteArray>"
                gy3.C87412m.m108592e(r9, r10)
                java.util.ArrayList r9 = (java.util.ArrayList) r9
                r7.getClass()
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r9)
                if (r10 == 0) goto L_0x0172
                goto L_0x0198
            L_0x0172:
                java.util.Iterator r9 = r9.iterator()
            L_0x0176:
                boolean r10 = r9.hasNext()
                if (r10 == 0) goto L_0x0198
                java.lang.Object r10 = r9.next()
                byte[] r10 = (byte[]) r10
                te3.s43 r13 = new te3.s43     // Catch:{ IOException -> 0x018e }
                r13.<init>()     // Catch:{ IOException -> 0x018e }
                r13.parseFrom(r10)     // Catch:{ IOException -> 0x018e }
                r7.add(r13)     // Catch:{ IOException -> 0x018e }
                goto L_0x0176
            L_0x018e:
                java.lang.String r9 = com.tencent.p014mm.plugin.webview.model.C85541t0.f249287b
                java.lang.String r10 = "bytesListToAvatarList: exception"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r10)
                r7.clear()
            L_0x0198:
                java.lang.String r9 = "default_avatar_id"
                int r9 = r8.getInt(r9)
                java.lang.String r10 = "is_ban_modify_avatar"
                boolean r10 = r8.getBoolean(r10)
                r1.f249297g = r10
                java.lang.String r10 = "create_avatar_title"
                java.lang.String r10 = r8.getString(r10, r6)
                java.lang.String r13 = "resp.getString(Constants…_CREATE_AVATAR_TITLE, \"\")"
                gy3.C87412m.m108593f(r10, r13)
                r1.f249301k = r10
                java.lang.String r10 = "avatar_limit"
                int r10 = r8.getInt(r10)
                r1.f249298h = r10
                r1.f249299i = r3
                java.lang.String r5 = r8.getString(r5, r6)
                java.lang.String r5 = com.tencent.p014mm.plugin.webview.model.C85523o0.C85524b.m105555d(r5)
                java.lang.String r10 = "parseAppId(resp.getStrin…ZE_RESULT_OAUTH_URL, \"\"))"
                gy3.C87412m.m108593f(r5, r10)
                r1.f249300j = r5
                java.lang.String r5 = r12.f259822d
                java.lang.String r10 = "snsapi_userinfo"
                boolean r5 = gy3.C87412m.m108589b(r5, r10)
                java.lang.String r10 = "scope.Scope"
                if (r5 == 0) goto L_0x0293
                r1.f249299i = r9
                com.tencent.mm.plugin.webview.model.t0$b r5 = r1.f249294d
                if (r5 != 0) goto L_0x01e3
                goto L_0x01e6
            L_0x01e3:
                r5.mo118933b(r9)
            L_0x01e6:
                gt0.g r5 = r1.f249293c
                com.tencent.mm.plugin.webview.model.u0 r6 = new com.tencent.mm.plugin.webview.model.u0
                r6.<init>(r1)
                r5.setItemCheckedListener(r6)
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r7)
                if (r5 != 0) goto L_0x026a
                java.util.ArrayList<gt0.d0$a> r2 = r1.f249296f
                r2.clear()
                java.util.ArrayList<gt0.d0$a> r2 = r1.f249296f
                java.lang.String r5 = r12.f259822d
                gy3.C87412m.m108593f(r5, r10)
                java.util.ArrayList r6 = new java.util.ArrayList
                r8 = 10
                int r8 = sx3.C36907w.m41090l(r7, r8)
                r6.<init>(r8)
                java.util.Iterator r7 = r7.iterator()
            L_0x0211:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto L_0x0248
                java.lang.Object r8 = r7.next()
                te3.s43 r8 = (te3.C90438s43) r8
                gt0.d0$a r10 = new gt0.d0$a
                r14 = 0
                java.lang.String r15 = r8.f259830e
                java.lang.String r11 = r8.f259832g
                int r13 = r8.f259829d
                if (r9 != r13) goto L_0x022b
                r18 = 1
                goto L_0x022d
            L_0x022b:
                r18 = 0
            L_0x022d:
                java.lang.String r13 = r8.f259831f
                java.lang.String r3 = "it.avatarurl"
                gy3.C87412m.m108593f(r13, r3)
                int r3 = r8.f259829d
                r8 = r13
                r13 = r10
                r16 = r11
                r17 = r5
                r19 = r8
                r20 = r3
                r13.<init>((int) r14, (java.lang.String) r15, (java.lang.String) r16, (java.lang.String) r17, (boolean) r18, (java.lang.String) r19, (int) r20)
                r6.add(r10)
                r3 = 0
                goto L_0x0211
            L_0x0248:
                r2.addAll(r6)
                gt0.g r8 = r1.f249293c
                java.util.ArrayList<gt0.d0$a> r9 = r1.f249296f
                boolean r10 = r1.f249297g
                int r11 = r1.f249298h
                r6 = r1
                r7 = r12
                r6.mo118931a(r7, r8, r9, r10, r11)
                gt0.g r2 = r1.f249293c
                com.tencent.mm.plugin.webview.model.v0 r3 = new com.tencent.mm.plugin.webview.model.v0
                r3.<init>(r1, r12)
                r2.setOnListItemLongClickListener(r3)
                gt0.k r2 = r1.f249292b
                gt0.g r3 = r1.f249293c
                r2.mo121778b(r3)
                goto L_0x02c9
            L_0x026a:
                r1.f249299i = r9
                com.tencent.mm.plugin.webview.model.t0$b r3 = r1.f249294d
                if (r3 != 0) goto L_0x0271
                goto L_0x0274
            L_0x0271:
                r3.mo118933b(r9)
            L_0x0274:
                com.tencent.mm.plugin.webview.model.t0 r3 = com.tencent.p014mm.plugin.webview.model.C85541t0.f249286a
                r3.getClass()
                java.lang.String r3 = com.tencent.p014mm.plugin.webview.model.C85541t0.f249287b
                java.lang.String r5 = "[OauthDialog.showDialog] avatarList null"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
                java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getApplicationId()
                com.tencent.mm.plugin.webview.model.w0<InputType, ResultType> r5 = com.tencent.p014mm.plugin.webview.model.C6064w0.f22362d
                java.lang.Class r5 = r5.getClass()
                com.tencent.mm.plugin.webview.model.x0 r6 = new com.tencent.mm.plugin.webview.model.x0
                r6.<init>(r1, r12)
                com.tencent.p014mm.ipcinvoker.C80907o.m98781d(r3, r2, r5, r6)
                goto L_0x02c9
            L_0x0293:
                com.tencent.mm.plugin.webview.model.t0 r2 = com.tencent.p014mm.plugin.webview.model.C85541t0.f249286a
                r2.getClass()
                java.lang.String r2 = com.tencent.p014mm.plugin.webview.model.C85541t0.f249287b
                java.lang.String r3 = "[OauthDialog.showDialog] non snsapi_userinfo"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
                gt0.g r2 = r1.f249293c
                android.content.Context r3 = r1.f249291a
                r5 = 2131832247(0x7f112db7, float:1.9297542E38)
                java.lang.Object[] r7 = new java.lang.Object[r4]
                java.lang.String r6 = r8.getString(r11, r6)
                r8 = 0
                r7[r8] = r6
                java.lang.String r3 = r3.getString(r5, r7)
                r2.setAppBrandName(r3)
                gt0.g r2 = r1.f249293c
                java.lang.String r3 = r12.f259822d
                gy3.C87412m.m108593f(r3, r10)
                r2.getClass()
                r2.f253162z = r3
                gt0.k r2 = r1.f249292b
                gt0.g r3 = r1.f249293c
                r2.mo121778b(r3)
            L_0x02c9:
                r0.f249308f = r1
                int r1 = r0.f249306d
                int r1 = r1 + r4
                r0.f249306d = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.model.C85541t0.C85544b.mo118934c():void");
        }
    }

    /* renamed from: a */
    public static final void m105566a(C85541t0 t0Var) {
        C85523o0.C85537c cVar;
        t0Var.getClass();
        WeakReference<C85523o0.C85537c> weakReference = f249290e;
        if (!(weakReference == null || weakReference.get() == null)) {
            Log.m105924i(f249287b, "[goBackWebview]");
            WeakReference<C85523o0.C85537c> weakReference2 = f249290e;
            if (!(weakReference2 == null || (cVar = weakReference2.get()) == null)) {
                cVar.goBack();
            }
        }
        m105568c();
    }

    /* renamed from: b */
    public static final void m105567b(C85541t0 t0Var, String str) {
        C85523o0.C85537c cVar;
        t0Var.getClass();
        WeakReference<C85523o0.C85537c> weakReference = f249290e;
        if (!(weakReference == null || weakReference.get() == null)) {
            String str2 = f249287b;
            Log.m105924i(str2, "[goRedirectWebview] redirectUrl = " + str);
            WeakReference<C85523o0.C85537c> weakReference2 = f249290e;
            if (!(weakReference2 == null || (cVar = weakReference2.get()) == null)) {
                cVar.mo67839b(str, 9);
            }
        }
        m105568c();
    }

    /* renamed from: c */
    public static final void m105568c() {
        C85542a aVar;
        C87362k kVar;
        C87362k kVar2;
        C85544b bVar = f249288c;
        if (!(bVar == null || (kVar2 = bVar.f249309g) == null)) {
            kVar2.mo121783f();
            bVar.f249309g = null;
            bVar.f249308f = null;
        }
        C85544b bVar2 = f249288c;
        if (!(bVar2 == null || (aVar = bVar2.f249308f) == null)) {
            aVar.f249292b.mo121777a(aVar.f249293c);
            C85544b bVar3 = aVar.f249294d;
            if (!(bVar3 == null || (kVar = bVar3.f249309g) == null)) {
                kVar.mo121783f();
                bVar3.f249309g = null;
                bVar3.f249308f = null;
            }
            aVar.f249294d = null;
        }
        f249288c = null;
        f249290e = null;
    }
}
