package com.tencent.p014mm.plugin.appbrand.page;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.protocal.protobuf.AppCommentModule;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di0.C86299o;
import di3.C86312j;
import jp3.C46566c;
import jp3.C9486a;
import kr0.C76630x0;
import lb0.C88394b;

/* renamed from: com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader */
public class AppBrandMenuHeader extends LinearLayout {

    /* renamed from: q */
    public static final /* synthetic */ int f244378q = 0;

    /* renamed from: d */
    public final C46566c<? extends C9486a> f244379d = new C46566c<>();

    /* renamed from: e */
    public View f244380e;

    /* renamed from: f */
    public LinearLayout f244381f;

    /* renamed from: g */
    public TextView f244382g;

    /* renamed from: h */
    public ImageView f244383h;

    /* renamed from: i */
    public TextView f244384i;

    /* renamed from: j */
    public ImageView f244385j;

    /* renamed from: n */
    public TextView f244386n;

    /* renamed from: o */
    public TextView f244387o;

    /* renamed from: p */
    public LinearLayout f244388p;

    public AppBrandMenuHeader(Context context) {
        super(context);
        this.f244380e = LayoutInflater.from(context).inflate(C0966R.C0971layout.f6424eh, this);
    }

    /* renamed from: a */
    public static void m102779a(AppBrandMenuHeader appBrandMenuHeader, String str, AppCommentModule appCommentModule) {
        appBrandMenuHeader.f244388p.setVisibility(0);
        ((LinearLayout.LayoutParams) appBrandMenuHeader.f244381f.getLayoutParams()).bottomMargin = 0;
        if (!TextUtils.isEmpty(appCommentModule.name_text)) {
            appBrandMenuHeader.f244382g.setText(appCommentModule.name_text);
            appBrandMenuHeader.mo116015b(true);
        } else {
            String str2 = C88394b.f255384g;
            C88394b.C88418q.f255427a.mo122796o(new C83867p(appBrandMenuHeader), C85875k4.m106211z() ? appCommentModule.name_img_url_black : appCommentModule.name_img_url, (C88394b.C88408j) null);
        }
        if (Util.isNullOrNil(appCommentModule.score_str)) {
            appBrandMenuHeader.mo116015b(true);
            appBrandMenuHeader.f244382g.setText(appCommentModule.no_score_text);
            if (Util.isNullOrNil(appCommentModule.recommend)) {
                appBrandMenuHeader.f244382g.setTextColor(MMApplicationContext.getContext().getColor(C0966R.color.f3288ma));
            }
        } else {
            appBrandMenuHeader.f244384i.setVisibility(0);
            appBrandMenuHeader.f244384i.setText(appCommentModule.score_str);
        }
        if (Util.isNullOrNil(appCommentModule.recommend)) {
            appBrandMenuHeader.f244385j.setVisibility(0);
        } else {
            appBrandMenuHeader.f244385j.setVisibility(8);
            appBrandMenuHeader.f244386n.setVisibility(0);
            appBrandMenuHeader.f244386n.setText(appCommentModule.recommend);
            appBrandMenuHeader.f244386n.post(new C83883q(appBrandMenuHeader, appCommentModule.more_text, appCommentModule.more_appid, appCommentModule.more_path, appCommentModule.more_query, str));
        }
        appBrandMenuHeader.f244388p.setOnClickListener(new AppBrandMenuHeader$$b(appBrandMenuHeader, appCommentModule, str));
    }

    /* renamed from: b */
    public final void mo116015b(boolean z) {
        if (z) {
            this.f244382g.setVisibility(0);
            this.f244383h.setVisibility(8);
            return;
        }
        this.f244382g.setVisibility(8);
        this.f244383h.setVisibility(0);
    }

    /* renamed from: c */
    public final void mo116016c(String str, String str2, String str3) {
        if (!Util.isNullOrNil(str)) {
            C86299o oVar = new C86299o();
            oVar.f250930b = str;
            oVar.f250931c = 0;
            oVar.f250934f = str2 + "?" + str3;
            oVar.f250939k = 1246;
            oVar.f250935g = true;
            ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(getContext(), oVar);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f244379d.dead();
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x02c9  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setPage(com.tencent.p014mm.plugin.appbrand.page.C83928t1 r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            java.lang.Class<h81.h> r2 = h81.C32735h.class
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r3 = r25.getRuntime()
            android.view.View r4 = r0.f244380e
            r5 = 2131305900(0x7f0925ac, float:1.8229984E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r0.f244381f = r4
            android.view.View r4 = r0.f244380e
            r5 = 2131306160(0x7f0926b0, float:1.8230511E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            android.view.View r5 = r0.f244380e
            r6 = 2131309954(0x7f093582, float:1.8238206E38)
            android.view.View r5 = r5.findViewById(r6)
            android.widget.TextView r5 = (android.widget.TextView) r5
            android.text.TextPaint r6 = r5.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106191k0(r6)
            android.view.View r6 = r0.f244380e
            r7 = 2131300727(0x7f091177, float:1.8219492E38)
            android.view.View r6 = r6.findViewById(r7)
            android.widget.TextView r6 = (android.widget.TextView) r6
            android.view.View r7 = r0.f244380e
            r8 = 2131310654(0x7f09383e, float:1.8239626E38)
            android.view.View r7 = r7.findViewById(r8)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            android.view.View r8 = r0.f244380e
            r9 = 2131315595(0x7f094b8b, float:1.8249648E38)
            android.view.View r8 = r8.findViewById(r9)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            android.view.View r9 = r0.f244380e
            r10 = 2131304953(0x7f0921f9, float:1.8228063E38)
            android.view.View r9 = r9.findViewById(r10)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            android.view.View r10 = r0.f244380e
            r11 = 2131310486(0x7f093796, float:1.8239285E38)
            android.view.View r10 = r10.findViewById(r11)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r11 = r25.getRuntime()
            com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC r11 = r11.mo113213o1()
            int r11 = r11.f239414c1
            r12 = 3
            boolean r11 = p1031sb.C90159e.m112822a(r11, r12)
            r13 = 8
            r14 = 1
            r15 = 0
            if (r11 == 0) goto L_0x009c
            di3.d r11 = di3.C86312j.m106911c(r2)
            h81.h r11 = (h81.C32735h) r11
            h81.h$b r12 = h81.C32735h.C32738b.wxapp_flagship_store
            int r11 = r11.mo58779Qe(r12, r15)
            if (r11 != r14) goto L_0x009c
            r9.setVisibility(r15)
            r10.setVisibility(r13)
            r8.setVisibility(r13)
            com.tencent.p014mm.plugin.appbrand.p026ui.C84704w4.m104354a(r9)
            goto L_0x011c
        L_0x009c:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r11 = r25.getRuntime()
            com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC r11 = r11.mo113213o1()
            int r11 = r11.f239413b1
            r12 = 3
            boolean r11 = p1031sb.C90159e.m112823b(r11, r12)
            if (r11 == 0) goto L_0x00ea
            di3.d r11 = di3.C86312j.m106911c(r2)
            h81.h r11 = (h81.C32735h) r11
            h81.h$c r12 = h81.C32735h.C32737c.relievedbuy
            int r11 = r11.mo58779Qe(r12, r15)
            if (r11 != r14) goto L_0x00ea
            r8.setVisibility(r15)
            r10.setVisibility(r13)
            r9.setVisibility(r13)
            r9 = 2131235772(0x7f0813bc, float:1.8087747E38)
            java.lang.String r10 = "MicroMsg.WxaRelievedBuyIconApply"
            java.lang.String r11 = "applyGreenIcon"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig r10 = com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.m100099b()
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$RelievedBuySetting r10 = r10.f239299W
            java.lang.String r10 = r10.f239341d
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig r11 = com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.m100099b()
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$RelievedBuySetting r11 = r11.f239299W
            int r11 = r11.f239342e
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig r12 = com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.m100099b()
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$RelievedBuySetting r12 = r12.f239299W
            int r12 = r12.f239343f
            com.tencent.p014mm.plugin.appbrand.p026ui.C84711y4.m104368b(r8, r9, r10, r11, r12)
            goto L_0x011c
        L_0x00ea:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r11 = r25.getRuntime()
            com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC r11 = r11.mo113213o1()
            int r11 = r11.f239415d1
            if (r11 == 0) goto L_0x00f8
            r11 = 1
            goto L_0x00f9
        L_0x00f8:
            r11 = 0
        L_0x00f9:
            if (r11 == 0) goto L_0x0113
            di3.d r11 = di3.C86312j.m106911c(r2)
            h81.h r11 = (h81.C32735h) r11
            h81.h$c r12 = h81.C32735h.C32737c.clicfg_appbrand_show_official_flag
            int r11 = r11.mo58779Qe(r12, r15)
            if (r11 != r14) goto L_0x0113
            r10.setVisibility(r15)
            r9.setVisibility(r13)
            r8.setVisibility(r13)
            goto L_0x011c
        L_0x0113:
            r9.setVisibility(r13)
            r8.setVisibility(r13)
            r10.setVisibility(r13)
        L_0x011c:
            android.view.View r8 = r0.f244380e
            r9 = 2131314344(0x7f0946a8, float:1.824711E38)
            android.view.View r8 = r8.findViewById(r9)
            android.view.View r9 = r0.f244380e
            r10 = 2131314339(0x7f0946a3, float:1.82471E38)
            android.view.View r9 = r9.findViewById(r10)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            android.view.View r10 = r0.f244380e
            r11 = 2131314335(0x7f09469f, float:1.8247092E38)
            android.view.View r10 = r10.findViewById(r11)
            android.widget.TextView r10 = (android.widget.TextView) r10
            android.view.View r11 = r0.f244380e
            r12 = 2131309959(0x7f093587, float:1.8238217E38)
            android.view.View r11 = r11.findViewById(r12)
            if (r3 == 0) goto L_0x0162
            java.util.HashMap<com.tencent.mm.plugin.appbrand.AppBrandRuntime, com.tencent.mm.plugin.appbrand.page.r> r12 = com.tencent.p014mm.plugin.appbrand.page.C83897r.f244954d
            boolean r12 = r3.mo113064k0()
            if (r12 == 0) goto L_0x014f
            goto L_0x0162
        L_0x014f:
            java.util.HashMap<com.tencent.mm.plugin.appbrand.AppBrandRuntime, com.tencent.mm.plugin.appbrand.page.r> r12 = com.tencent.p014mm.plugin.appbrand.page.C83897r.f244954d
            java.lang.Object r16 = r12.get(r3)
            com.tencent.mm.plugin.appbrand.page.r r16 = (com.tencent.p014mm.plugin.appbrand.page.C83897r) r16
            if (r16 != 0) goto L_0x0164
            com.tencent.mm.plugin.appbrand.page.r r13 = new com.tencent.mm.plugin.appbrand.page.r
            r13.<init>(r3)
            r12.put(r3, r13)
            goto L_0x0166
        L_0x0162:
            com.tencent.mm.plugin.appbrand.page.r r16 = com.tencent.p014mm.plugin.appbrand.page.C83897r.f244955e
        L_0x0164:
            r13 = r16
        L_0x0166:
            java.lang.Runnable r3 = r13.mo116480c(r1)
            java.lang.String r12 = lb0.C88394b.f255384g
            lb0.b r12 = lb0.C88394b.C88418q.f255427a
            java.lang.String r14 = r13.mo116481d()
            android.graphics.drawable.Drawable r15 = lb0.C88393a.m110230a()
            lb0.k r1 = new lb0.k
            r1.<init>()
            r12.mo122786b(r4, r14, r15, r1)
            com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader$$a r1 = new com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader$$a
            r1.<init>(r3)
            di3.d r2 = di3.C86312j.m106911c(r2)
            h81.h r2 = (h81.C32735h) r2
            h81.h$c r3 = h81.C32735h.C32737c.clicfg_appbrand_fake_native_profile
            r12 = 0
            int r2 = r2.mo58779Qe(r3, r12)
            r3 = 1
            if (r2 != r3) goto L_0x0195
            r2 = 1
            goto L_0x0196
        L_0x0195:
            r2 = 0
        L_0x0196:
            r3 = 0
            if (r2 != 0) goto L_0x019a
            goto L_0x01ad
        L_0x019a:
            java.lang.Class<kr0.c1> r2 = kr0.C88262c1.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            kr0.c1 r2 = (kr0.C88262c1) r2
            r12 = 15
            java.lang.String r14 = "wx27a2b9eea2cf1a62"
            java.lang.String r15 = "pages/index/index.html"
            r2.mo113581Re(r3, r14, r15, r12)
        L_0x01ad:
            r4.setOnClickListener(r1)
            r11.setOnClickListener(r1)
            android.view.View r1 = r0.f244380e
            r2 = 2131315591(0x7f094b87, float:1.824964E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f244382g = r1
            android.view.View r1 = r0.f244380e
            r2 = 2131315590(0x7f094b86, float:1.8249638E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.f244383h = r1
            android.view.View r1 = r0.f244380e
            r2 = 2131315592(0x7f094b88, float:1.8249642E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f244384i = r1
            android.view.View r1 = r0.f244380e
            r2 = 2131315589(0x7f094b85, float:1.8249636E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.f244385j = r1
            android.view.View r1 = r0.f244380e
            r2 = 2131302261(0x7f091775, float:1.8222603E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f244386n = r1
            android.view.View r1 = r0.f244380e
            r2 = 2131312784(0x7f094090, float:1.8243946E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f244387o = r1
            android.view.View r1 = r0.f244380e
            r2 = 2131315588(0x7f094b84, float:1.8249633E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.f244388p = r1
            com.tencent.mm.plugin.appbrand.page.o r1 = new com.tencent.mm.plugin.appbrand.page.o
            r1.<init>(r0, r13)
            jp3.c<? extends jp3.a> r2 = r0.f244379d
            zt3.t r4 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.appbrand.page.t r11 = new com.tencent.mm.plugin.appbrand.page.t
            r11.<init>(r13, r1)
            zt3.j r4 = (zt3.C119157j) r4
            r4.mo183895z(r11)
            te3.o62 r4 = new te3.o62
            r4.<init>()
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r11 = r13.f244956a
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r11 = r11.mo113036W()
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r11 = (com.tencent.luggage.sdk.config.AppBrandInitConfigLU) r11
            java.lang.String r11 = r11.f234839s
            r4.f138980d = r11
            ob0.c$b r12 = new ob0.c$b
            r12.<init>()
            r14 = 2921(0xb69, float:4.093E-42)
            r12.f127069d = r14
            java.lang.String r14 = "/cgi-bin/mmbiz-bin/wxabusiness/getprofileinfo"
            r12.f127068c = r14
            r12.f127066a = r4
            com.tencent.mm.protocal.protobuf.GetProfileInfoResponse r4 = new com.tencent.mm.protocal.protobuf.GetProfileInfoResponse
            r4.<init>()
            r12.f127067b = r4
            ob0.c r4 = r12.mo72403a()
            java.lang.Class<com.tencent.mm.ipcinvoker.wx_extension.j> r12 = com.tencent.p014mm.ipcinvoker.wx_extension.C40324j.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            com.tencent.mm.ipcinvoker.wx_extension.j r12 = (com.tencent.p014mm.ipcinvoker.wx_extension.C40324j) r12
            com.tencent.mm.plugin.appbrand.page.u r14 = new com.tencent.mm.plugin.appbrand.page.u
            r14.<init>(r13, r11, r1)
            r12.mo63013cp(r4, r14, r2)
            android.text.TextPaint r1 = r5.getPaint()
            r2 = 1
            r1.setFakeBoldText(r2)
            java.lang.String r1 = r13.mo116478a()
            r5.setText(r1)
            java.lang.String r1 = r13.mo116479b()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 == 0) goto L_0x027f
            boolean r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r2 != 0) goto L_0x027f
            boolean r2 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            if (r2 == 0) goto L_0x02ad
        L_0x027f:
            boolean r2 = r25.mo116168W0()
            if (r2 == 0) goto L_0x02ad
            boolean r2 = r25.mo116168W0()
            if (r2 == 0) goto L_0x028f
            java.lang.String r2 = "skyline"
            goto L_0x0292
        L_0x028f:
            java.lang.String r2 = "webview"
        L_0x0292:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r1 = 1
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r1 = 0
            r5[r1] = r2
            java.lang.String r1 = "(%s)"
            java.lang.String r1 = java.lang.String.format(r1, r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
        L_0x02ad:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 == 0) goto L_0x02ba
            r2 = 8
            r6.setVisibility(r2)
            r1 = 0
            goto L_0x02c3
        L_0x02ba:
            r2 = 8
            r6.setText(r1)
            r1 = 0
            r6.setVisibility(r1)
        L_0x02c3:
            boolean r4 = r13.mo116482e()
            if (r4 == 0) goto L_0x02cd
            r7.setVisibility(r1)
            goto L_0x02d0
        L_0x02cd:
            r7.setVisibility(r2)
        L_0x02d0:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r1 = r25.getRuntime()
            qq0.a r1 = qq0.C89790a.C89791a.m112271a(r1)
            int r1 = r1.mo124074c()
            com.tencent.mm.plugin.appbrand.page.r$f r1 = r13.mo116483f(r1)
            if (r1 != 0) goto L_0x0329
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r1.mo10233c(r4)
            java.lang.Object[] r17 = r1.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader"
            java.lang.String r19 = "setPage"
            java.lang.String r20 = "(Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r8
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r8.setVisibility(r1)
            java.lang.String r17 = "com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader"
            java.lang.String r18 = "setPage"
            java.lang.String r19 = "(Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            r2 = r25
            goto L_0x0387
        L_0x0329:
            int r2 = r1.f244964a
            r8.setBackgroundResource(r2)
            int r2 = r1.f244965b
            r9.setImageResource(r2)
            java.lang.String r1 = r1.f244966c
            r10.setText(r1)
            com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader$$c r1 = new com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader$$c
            r2 = r25
            r1.<init>(r0, r13, r2)
            r8.setOnClickListener(r1)
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r1.mo10233c(r5)
            java.lang.Object[] r17 = r1.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader"
            java.lang.String r19 = "setPage"
            java.lang.String r20 = "(Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r8
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r4 = 0
            java.lang.Object r1 = r1.mo10231a(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r8.setVisibility(r1)
            java.lang.String r17 = "com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader"
            java.lang.String r18 = "setPage"
            java.lang.String r19 = "(Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
        L_0x0387:
            android.content.Context r1 = r24.getContext()
            java.util.Map<java.lang.String, java.lang.Class<? extends com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI>> r4 = ai0.C79553f.f233288a
            boolean r1 = r1 instanceof com.tencent.p014mm.plugin.appbrand.p025ad.p945ui.AppBrandAdUI
            if (r1 != 0) goto L_0x048c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r4 = r25.getRuntime()
            ak0.a$a r5 = ak0.C79584a.f233382a
            java.lang.String r6 = "host"
            gy3.C87412m.m108594g(r4, r6)
            boolean r5 = r5.mo109700c(r4)
            if (r5 == 0) goto L_0x03b2
            com.tencent.mm.plugin.appbrand.e3 r4 = r4.f238142e
            if (r4 != 0) goto L_0x03ac
            goto L_0x03b2
        L_0x03ac:
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r3 = r4.getActiveRuntime()
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r3 = (com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC) r3
        L_0x03b2:
            if (r3 == 0) goto L_0x03dc
            com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader$$h$a r4 = new com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader$$h$a
            android.view.View r5 = r0.f244380e
            android.content.Context r5 = r5.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131821866(0x7f11052a, float:1.9276487E38)
            java.lang.String r5 = r5.getString(r6)
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r6 = r3.mo113210l1()
            java.lang.String r6 = r6.f239363e
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
            com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader$$d r7 = new com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader$$d
            r7.<init>(r0, r2, r3)
            r4.<init>(r5, r6, r7)
            r1.add(r4)
        L_0x03dc:
            java.lang.String r3 = r25.getAppId()
            ai0.d r3 = ai0.C79570o.m96622b(r3)
            boolean r3 = r3.f233268b
            if (r3 == 0) goto L_0x03fa
            java.lang.String r3 = r25.getAppId()
            ai0.d r3 = ai0.C79570o.m96622b(r3)
            java.lang.String r3 = r3.f233270d
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x03fa
            r12 = 1
            goto L_0x03fb
        L_0x03fa:
            r12 = 0
        L_0x03fb:
            if (r12 == 0) goto L_0x043b
            com.tencent.mm.plugin.appbrand.ad.jsapi.d r3 = new com.tencent.mm.plugin.appbrand.ad.jsapi.d
            r3.<init>()
            java.lang.String r4 = "menu"
            r3.f238382i = r4
            r3.f238383j = r4
            kr0.e r4 = r25.mo116160O0()
            r3.mo113279s(r4)
            com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader$$h$a r3 = new com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader$$h$a
            android.view.View r4 = r0.f244380e
            android.content.Context r4 = r4.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131821865(0x7f110529, float:1.9276485E38)
            java.lang.String r4 = r4.getString(r5)
            java.lang.String r5 = r25.getAppId()
            ai0.d r5 = ai0.C79570o.m96622b(r5)
            java.lang.String r5 = r5.f233270d
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader$$e r6 = new com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader$$e
            r6.<init>(r0, r2)
            r3.<init>(r4, r5, r6)
            r1.add(r3)
        L_0x043b:
            android.view.View r3 = r0.f244380e
            r4 = 2131313228(0x7f09424c, float:1.8244847E38)
            android.view.View r3 = r3.findViewById(r4)
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            int r4 = r1.size()
            if (r4 <= 0) goto L_0x0487
            android.widget.LinearLayout r4 = r0.f244388p
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r4 = (android.widget.FrameLayout.LayoutParams) r4
            r5 = 0
            r4.bottomMargin = r5
            android.widget.LinearLayout r6 = r0.f244388p
            r6.setLayoutParams(r4)
            android.widget.LinearLayout r4 = r0.f244381f
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r4 = (android.widget.LinearLayout.LayoutParams) r4
            r4.bottomMargin = r5
            r3.setVisibility(r5)
            com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader$$f r4 = new com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader$$f
            r4.<init>(r0, r1)
            r3.mo17085h0(r4)
            com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader$$h r4 = new com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader$$h
            r4.<init>(r1)
            r3.setAdapter(r4)
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r25.getContext()
            r4 = 1
            r1.<init>(r2, r4, r5)
            r3.setLayoutManager(r1)
            goto L_0x048c
        L_0x0487:
            r1 = 8
            r3.setVisibility(r1)
        L_0x048c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.page.AppBrandMenuHeader.setPage(com.tencent.mm.plugin.appbrand.page.t1):void");
    }

    public AppBrandMenuHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f244380e = LayoutInflater.from(context).inflate(C0966R.C0971layout.f6424eh, this);
    }
}
