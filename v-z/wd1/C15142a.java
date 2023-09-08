package wd1;

import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.activity.poi.fragment.FinderPoiTabFragment;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import dp1.C58417y0;
import er1.C58784w3;
import gy3.C87412m;
import java.util.List;
import md1.C10779c;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import org.json.JSONObject;
import qo3.C77407n;
import rs1.C13442s8;
import sx3.C110818d0;
import te3.C48713ah1;
import te3.C51824we3;
import te3.C64689rq2;
import te3.m74;
import xd1.C15665p;
import xd1.C15669q;
import z04.C112551y;

/* renamed from: wd1.a */
public final class C15142a extends C10779c {

    /* renamed from: f */
    public final C48713ah1 f41268f;

    /* renamed from: wd1.a$a */
    public static final class C15143a implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ C15142a f41269d;

        /* renamed from: e */
        public final /* synthetic */ m74 f41270e;

        public C15143a(C15142a aVar, m74 m74) {
            this.f41269d = aVar;
            this.f41270e = m74;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            boolean z;
            String str;
            boolean z2;
            String str2;
            C51824we3 we32;
            if (e0Var.mo107176v()) {
                String string = this.f41269d.f32250d.getString(C0966R.string.f360098a33);
                C87412m.m108593f(string, "activity.getString(com.t…ring.app_share_to_weixin)");
                String string2 = this.f41269d.f32250d.getString(C0966R.string.epb);
                C87412m.m108593f(string2, "activity.getString(com.t…ng.finder_share_timeline)");
                String string3 = this.f41269d.f32250d.getString(C0966R.string.eh8);
                C87412m.m108593f(string3, "activity.getString(R.string.finder_poi_claim)");
                String string4 = this.f41269d.f32250d.getString(C0966R.string.ehp);
                C87412m.m108593f(string4, "activity.getString(R.string.finder_poi_report_err)");
                if (this.f41270e == null) {
                    C58784w3 w3Var = C58784w3.f168295a;
                    String Y = w3Var.mo83911Y("", C0966R.string.eo6);
                    str = w3Var.mo83911Y("", C0966R.string.eo7);
                    str2 = Y;
                    z2 = true;
                    z = true;
                } else {
                    str2 = string;
                    str = string2;
                    z2 = false;
                    z = false;
                }
                C76874e0 e0Var2 = e0Var;
                e0Var2.mo107150j(10002, str2, C0966R.raw.finder_icons_filled_share, this.f41269d.f32250d.getResources().getColor(C0966R.color.f2939n), z2);
                e0Var2.mo107150j(10003, str, C0966R.raw.bottomsheet_icon_moment, 0, z);
                C48713ah1 ah12 = this.f41269d.f41268f;
                if (ah12 != null && (we32 = ah12.f130521o) != null) {
                    if (we32.f143996d == 1) {
                        e0Var.mo107142f(10005, string3);
                    }
                    if (we32.f143997e == 1) {
                        e0Var.mo107142f(10006, string4);
                    }
                }
            }
        }
    }

    /* renamed from: wd1.a$b */
    public static final class C15144b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C15142a f41271d;

        /* renamed from: e */
        public final /* synthetic */ m74 f41272e;

        public C15144b(C15142a aVar, m74 m74) {
            this.f41271d = aVar;
            this.f41272e = m74;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
            r5 = (r5 = (r5 = r3.f130516g).f145743d).f140264d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onMMMenuItemSelected(android.view.MenuItem r27, int r28) {
            /*
                r26 = this;
                r0 = r26
                java.lang.Class<dp1.y0> r1 = dp1.C58417y0.class
                wd1.a r2 = r0.f41271d
                te3.ah1 r3 = r2.f41268f
                r4 = 0
                if (r3 == 0) goto L_0x001a
                te3.z74 r5 = r3.f130516g
                if (r5 == 0) goto L_0x001a
                te3.qe3 r5 = r5.f145743d
                if (r5 == 0) goto L_0x001a
                te3.je3 r5 = r5.f140264d
                if (r5 == 0) goto L_0x001a
                java.lang.String r5 = r5.f136053e
                goto L_0x001b
            L_0x001a:
                r5 = r4
            L_0x001b:
                java.lang.String r6 = ""
                if (r5 != 0) goto L_0x0021
                r12 = r6
                goto L_0x0022
            L_0x0021:
                r12 = r5
            L_0x0022:
                if (r3 == 0) goto L_0x0033
                te3.z74 r5 = r3.f130516g
                if (r5 == 0) goto L_0x0033
                te3.qe3 r5 = r5.f145743d
                if (r5 == 0) goto L_0x0033
                te3.je3 r5 = r5.f140264d
                if (r5 == 0) goto L_0x0033
                java.lang.String r5 = r5.f136057i
                goto L_0x0034
            L_0x0033:
                r5 = r4
            L_0x0034:
                if (r5 != 0) goto L_0x0038
                r10 = r6
                goto L_0x0039
            L_0x0038:
                r10 = r5
            L_0x0039:
                r5 = 0
                if (r3 == 0) goto L_0x0040
                int r3 = r3.f130520n
                r13 = r3
                goto L_0x0041
            L_0x0040:
                r13 = 0
            L_0x0041:
                if (r13 <= 0) goto L_0x0046
                r6 = 1
                goto L_0x0048
            L_0x0046:
                r6 = 0
            L_0x0048:
                r16 = r6
                bl3.r r3 = bl3.C39818r.f106831a
                androidx.appcompat.app.AppCompatActivity r2 = r2.f32250d
                bl3.r$a r2 = r3.mo62444c(r2)
                java.lang.Class<xd1.c> r3 = xd1.C15644c.class
                androidx.lifecycle.i0 r2 = r2.mo75002a(r3)
                xd1.c r2 = (xd1.C15644c) r2
                java.lang.String r2 = r2.f42294j
                int r3 = r27.getItemId()
                java.lang.String r6 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
                java.lang.String r7 = "getService(FinderReportLogic::class.java)"
                java.lang.String r8 = "key_sns_feed_id"
                switch(r3) {
                    case 10002: goto L_0x014e;
                    case 10003: goto L_0x00df;
                    case 10004: goto L_0x0069;
                    case 10005: goto L_0x008d;
                    case 10006: goto L_0x006b;
                    default: goto L_0x0069;
                }
            L_0x0069:
                goto L_0x01bb
            L_0x006b:
                wd1.a r1 = r0.f41271d
                te3.ah1 r2 = r1.f41268f
                if (r2 == 0) goto L_0x01bb
                te3.we3 r2 = r2.f130521o
                if (r2 == 0) goto L_0x01bb
                android.content.Intent r3 = new android.content.Intent
                r3.<init>()
                java.lang.String r2 = r2.f144002j
                java.lang.String r5 = "rawUrl"
                r3.putExtra(r5, r2)
                androidx.appcompat.app.AppCompatActivity r1 = r1.f32250d
                java.lang.String r2 = "webview"
                java.lang.String r5 = ".ui.tools.WebViewUI"
                ke3.C88144b.m109791i(r1, r2, r5, r3, r4)
                goto L_0x01bb
            L_0x008d:
                wd1.a r2 = r0.f41271d
                r2.getClass()
                com.tencent.mm.plugin.finder.view.t3 r3 = new com.tencent.mm.plugin.finder.view.t3
                androidx.appcompat.app.AppCompatActivity r6 = r2.f32250d
                r3.<init>(r6)
                te3.ah1 r2 = r2.f41268f
                if (r2 == 0) goto L_0x00a0
                te3.we3 r2 = r2.f130521o
                goto L_0x00a1
            L_0x00a0:
                r2 = r4
            L_0x00a1:
                r3.setPoiPrepare(r2)
                org.json.JSONObject r2 = new org.json.JSONObject
                r2.<init>()
                java.lang.String r3 = "click_option"
                java.lang.String r6 = "channelclaim"
                r2.put(r3, r6)
                di3.d r1 = di3.C86312j.m106911c(r1)
                dp1.y0 r1 = (dp1.C58417y0) r1
                r3 = 1
                java.lang.String r2 = r2.toString()
                java.lang.String r6 = "kvJson.toString()"
                gy3.C87412m.m108593f(r2, r6)
                java.lang.String r6 = ","
                java.lang.String r7 = ";"
                java.lang.String r2 = z04.C112551y.m153814n(r2, r6, r7, r5)
                rs1.s8$a r5 = rs1.C13442s8.f38060Q0
                wd1.a r6 = r0.f41271d
                androidx.appcompat.app.AppCompatActivity r6 = r6.f32250d
                rs1.s8 r5 = r5.mo12873f(r6)
                if (r5 == 0) goto L_0x00d8
                te3.hj1 r4 = r5.mo12861q3()
            L_0x00d8:
                java.lang.String r5 = "poi_detail_panel"
                r1.Cx0(r3, r5, r2, r4)
                goto L_0x01bb
            L_0x00df:
                te3.m74 r3 = r0.f41272e
                if (r3 != 0) goto L_0x00f3
                wd1.a r1 = r0.f41271d
                androidx.appcompat.app.AppCompatActivity r1 = r1.f32250d
                r2 = 2131829839(0x7f11244f, float:1.9292658E38)
                android.widget.Toast r1 = nj3.C76912y0.makeText((android.content.Context) r1, (int) r2, (int) r5)
                r1.show()
                goto L_0x01bb
            L_0x00f3:
                di3.d r1 = di3.C86312j.m106911c(r1)
                gy3.C87412m.m108593f(r1, r7)
                r14 = r1
                dp1.y0 r14 = (dp1.C58417y0) r14
                com.tencent.mm.plugin.finder.feed.ui.FinderPoiFeedUI$a r15 = com.tencent.p014mm.plugin.finder.feed.p052ui.FinderPoiFeedUI.C3005a.ACTION_SHARE_TO_TIMELINE
                rs1.s8$a r1 = rs1.C13442s8.f38060Q0
                wd1.a r3 = r0.f41271d
                androidx.appcompat.app.AppCompatActivity r3 = r3.f32250d
                rs1.s8 r1 = r1.mo12873f(r3)
                if (r1 == 0) goto L_0x010f
                te3.hj1 r4 = r1.mo12861q3()
            L_0x010f:
                r18 = r4
                te3.m74 r1 = r0.f41272e
                java.lang.String r1 = r1.f184224i
                wd1.a r3 = r0.f41271d
                androidx.appcompat.app.AppCompatActivity r3 = r3.f32250d
                android.content.Intent r3 = r3.getIntent()
                java.lang.String r3 = r3.getStringExtra(r8)
                if (r3 != 0) goto L_0x0127
                java.lang.String r3 = eb0.C75592q0.m90789s()
            L_0x0127:
                r21 = r3
                r22 = 0
                r24 = 64
                r25 = 0
                r19 = r1
                r20 = r2
                dp1.C58417y0.Dy0(r14, r15, r16, r18, r19, r20, r21, r22, r24, r25)
                er1.v2$a r7 = er1.C7888v2.f26513a
                wd1.a r1 = r0.f41271d
                androidx.appcompat.app.AppCompatActivity r1 = r1.f32250d
                gy3.C87412m.m108592e(r1, r6)
                r8 = r1
                com.tencent.mm.ui.MMActivity r8 = (com.tencent.p014mm.p136ui.MMActivity) r8
                te3.m74 r9 = r0.f41272e
                wd1.a r1 = r0.f41271d
                java.lang.String r11 = r1.mo14100k()
                r7.mo9019r(r8, r9, r10, r11, r12, r13)
                goto L_0x01bb
            L_0x014e:
                te3.m74 r3 = r0.f41272e
                if (r3 != 0) goto L_0x0161
                wd1.a r1 = r0.f41271d
                androidx.appcompat.app.AppCompatActivity r1 = r1.f32250d
                r2 = 2131829838(0x7f11244e, float:1.9292656E38)
                android.widget.Toast r1 = nj3.C76912y0.makeText((android.content.Context) r1, (int) r2, (int) r5)
                r1.show()
                goto L_0x01bb
            L_0x0161:
                di3.d r1 = di3.C86312j.m106911c(r1)
                gy3.C87412m.m108593f(r1, r7)
                r14 = r1
                dp1.y0 r14 = (dp1.C58417y0) r14
                com.tencent.mm.plugin.finder.feed.ui.FinderPoiFeedUI$a r15 = com.tencent.p014mm.plugin.finder.feed.p052ui.FinderPoiFeedUI.C3005a.ACTION_SHARE_TO_CHAT
                rs1.s8$a r1 = rs1.C13442s8.f38060Q0
                wd1.a r3 = r0.f41271d
                androidx.appcompat.app.AppCompatActivity r3 = r3.f32250d
                rs1.s8 r1 = r1.mo12873f(r3)
                if (r1 == 0) goto L_0x017d
                te3.hj1 r4 = r1.mo12861q3()
            L_0x017d:
                r18 = r4
                te3.m74 r1 = r0.f41272e
                java.lang.String r1 = r1.f184224i
                wd1.a r3 = r0.f41271d
                androidx.appcompat.app.AppCompatActivity r3 = r3.f32250d
                android.content.Intent r3 = r3.getIntent()
                java.lang.String r3 = r3.getStringExtra(r8)
                if (r3 != 0) goto L_0x0195
                java.lang.String r3 = eb0.C75592q0.m90789s()
            L_0x0195:
                r21 = r3
                r22 = 0
                r24 = 64
                r25 = 0
                r19 = r1
                r20 = r2
                dp1.C58417y0.Dy0(r14, r15, r16, r18, r19, r20, r21, r22, r24, r25)
                er1.v2$a r7 = er1.C7888v2.f26513a
                wd1.a r1 = r0.f41271d
                androidx.appcompat.app.AppCompatActivity r1 = r1.f32250d
                gy3.C87412m.m108592e(r1, r6)
                r8 = r1
                com.tencent.mm.ui.MMActivity r8 = (com.tencent.p014mm.p136ui.MMActivity) r8
                te3.m74 r9 = r0.f41272e
                wd1.a r1 = r0.f41271d
                java.lang.String r11 = r1.mo14100k()
                r7.mo9018q(r8, r9, r10, r11, r12, r13)
            L_0x01bb:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wd1.C15142a.C15144b.onMMMenuItemSelected(android.view.MenuItem, int):void");
        }
    }

    /* renamed from: wd1.a$c */
    public static final class C15145c implements C77407n.C47880p {

        /* renamed from: a */
        public final /* synthetic */ C15142a f41273a;

        public C15145c(C15142a aVar) {
            this.f41273a = aVar;
        }

        public final void onDismiss() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click_option", "cancel");
            C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "kvJson.toString()");
            String n = C112551y.m153814n(jSONObject2, ",", ";", false);
            C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f41273a.f32250d);
            y0Var.Cx0(1, "poi_detail_panel", n, f != null ? f.mo12861q3() : null);
        }
    }

    /* renamed from: wd1.a$d */
    public static final class C15146d implements C77407n.C77419q {

        /* renamed from: a */
        public final /* synthetic */ C15142a f41274a;

        public C15146d(C15142a aVar) {
            this.f41274a = aVar;
        }

        public final void onShow() {
            C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
            C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f41274a.f32250d);
            y0Var.Cx0(0, "poi_detail_panel", "", f != null ? f.mo12861q3() : null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15142a(C48713ah1 ah12, AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f41268f = ah12;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11018i() {
        /*
            r6 = this;
            te3.m74 r0 = new te3.m74
            r0.<init>()
            androidx.appcompat.app.AppCompatActivity r1 = r6.f32250d
            android.content.Intent r1 = r1.getIntent()
            r2 = 0
            if (r1 == 0) goto L_0x0015
            java.lang.String r3 = "key_location"
            byte[] r1 = r1.getByteArrayExtra(r3)
            goto L_0x0016
        L_0x0015:
            r1 = r2
        L_0x0016:
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L_0x001c
        L_0x001a:
            r0 = r2
            goto L_0x002e
        L_0x001c:
            r0.parseFrom(r1)     // Catch:{ Exception -> 0x0020 }
            goto L_0x002e
        L_0x0020:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r0
            java.lang.String r0 = "safeParser"
            java.lang.String r5 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r0, r5, r1)
            goto L_0x001a
        L_0x002e:
            qo3.n r1 = r6.f32251e
            if (r1 != 0) goto L_0x0057
            qo3.n r1 = new qo3.n
            androidx.appcompat.app.AppCompatActivity r2 = r6.f32250d
            r1.<init>((android.content.Context) r2, (int) r4, (boolean) r3)
            r6.f32251e = r1
            wd1.a$a r2 = new wd1.a$a
            r2.<init>(r6, r0)
            r1.f225771i = r2
            wd1.a$b r2 = new wd1.a$b
            r2.<init>(r6, r0)
            r1.f225782p = r2
            wd1.a$c r0 = new wd1.a$c
            r0.<init>(r6)
            r1.f225761d = r0
            wd1.a$d r0 = new wd1.a$d
            r0.<init>(r6)
            r1.f225763e = r0
        L_0x0057:
            qo3.n r0 = r6.f32251e
            if (r0 == 0) goto L_0x005e
            r0.mo107573q()
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wd1.C15142a.mo11018i():void");
    }

    /* renamed from: k */
    public final String mo14100k() {
        C64689rq2 rq22;
        C39818r rVar = C39818r.f106831a;
        FinderPoiTabFragment finderPoiTabFragment = ((C15669q) rVar.mo62444c(this.f32250d).mo75002a(C15669q.class)).f42347B;
        List<E> listOfType = finderPoiTabFragment != null ? ((C15665p) rVar.mo62445d(finderPoiTabFragment).mo75002a(C15665p.class)).mo14410e3().getListOfType(BaseFinderFeed.class) : null;
        if ((listOfType == null || listOfType.isEmpty()) || (rq22 = (C64689rq2) C110818d0.m150917O(((BaseFinderFeed) listOfType.get(0)).mo3513o().getMediaList(), 0)) == null) {
            return "";
        }
        if (Util.isNullOrNil(rq22.f185288z)) {
            return String.valueOf(rq22.f185267e);
        }
        return rq22.f185267e + rq22.f185288z;
    }
}
