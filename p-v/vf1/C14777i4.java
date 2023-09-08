package vf1;

import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderPoiFeedUI;
import nj3.C11184p0;

/* renamed from: vf1.i4 */
public final class C14777i4 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ FinderPoiFeedUI f40759d;

    public C14777i4(FinderPoiFeedUI finderPoiFeedUI) {
        this.f40759d = finderPoiFeedUI;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: te3.hj1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: te3.hj1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: te3.hj1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: te3.hj1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: te3.hj1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: te3.hj1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: te3.hj1} */
    /* JADX WARNING: type inference failed for: r7v3, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r7v6, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMMMenuItemSelected(android.view.MenuItem r21, int r22) {
        /*
            r20 = this;
            r0 = r20
            java.lang.Class<dp1.y0> r1 = dp1.C58417y0.class
            com.tencent.mm.plugin.finder.feed.ui.FinderPoiFeedUI r2 = r0.f40759d
            int r3 = com.tencent.p014mm.plugin.finder.feed.p052ui.FinderPoiFeedUI.f14655t
            com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader r2 = r2.mo3075N7()
            te3.m74 r5 = r2.f13766e
            com.tencent.mm.plugin.finder.feed.ui.FinderPoiFeedUI r2 = r0.f40759d
            kf1.l6 r2 = r2.mo3078Q7()
            java.lang.String r6 = r2.f30411w
            int r2 = r21.getItemId()
            java.lang.String r3 = "getService(FinderReportLogic::class.java)"
            r4 = 0
            r7 = 0
            switch(r2) {
                case 10002: goto L_0x0116;
                case 10003: goto L_0x009c;
                case 10004: goto L_0x0047;
                case 10005: goto L_0x0023;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x018d
        L_0x0023:
            com.tencent.mm.plugin.finder.feed.ui.FinderPoiFeedUI r1 = r0.f40759d
            com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader r2 = r1.mo3075N7()
            te3.we3 r2 = r2.f13767f
            if (r2 == 0) goto L_0x018d
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r2 = r2.f144002j
            java.lang.String r4 = "rawUrl"
            r3.putExtra(r4, r2)
            androidx.appcompat.app.AppCompatActivity r1 = r1.getContext()
            java.lang.String r2 = "webview"
            java.lang.String r4 = ".ui.tools.WebViewUI"
            ke3.C88144b.m109791i(r1, r2, r4, r3, r7)
            goto L_0x018d
        L_0x0047:
            com.tencent.mm.plugin.finder.feed.ui.FinderPoiFeedUI r2 = r0.f40759d
            r2.getClass()
            com.tencent.mm.plugin.finder.view.t3 r3 = new com.tencent.mm.plugin.finder.view.t3
            r3.<init>(r2)
            com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader r2 = r2.mo3075N7()
            te3.we3 r2 = r2.f13767f
            r3.setPoiPrepare(r2)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "click_option"
            java.lang.String r5 = "channelclaim"
            r2.put(r3, r5)
            di3.d r1 = di3.C86312j.m106911c(r1)
            dp1.y0 r1 = (dp1.C58417y0) r1
            r3 = 1
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "kvJson.toString()"
            gy3.C87412m.m108593f(r2, r5)
            java.lang.String r5 = ","
            java.lang.String r6 = ";"
            java.lang.String r2 = z04.C112551y.m153814n(r2, r5, r6, r4)
            rs1.s8$a r4 = rs1.C13442s8.f38060Q0
            com.tencent.mm.plugin.finder.feed.ui.FinderPoiFeedUI r5 = r0.f40759d
            androidx.appcompat.app.AppCompatActivity r5 = r5.getContext()
            java.lang.String r6 = "context"
            gy3.C87412m.m108593f(r5, r6)
            rs1.s8 r4 = r4.mo12873f(r5)
            if (r4 == 0) goto L_0x0095
            te3.hj1 r7 = r4.mo12861q3()
        L_0x0095:
            java.lang.String r4 = "poi_detail_panel"
            r1.Cx0(r3, r4, r2, r7)
            goto L_0x018d
        L_0x009c:
            if (r5 != 0) goto L_0x00ac
            com.tencent.mm.plugin.finder.feed.ui.FinderPoiFeedUI r1 = r0.f40759d
            r2 = 2131829839(0x7f11244f, float:1.9292658E38)
            android.widget.Toast r1 = nj3.C76912y0.makeText((android.content.Context) r1, (int) r2, (int) r4)
            r1.show()
            goto L_0x018d
        L_0x00ac:
            di3.d r1 = di3.C86312j.m106911c(r1)
            gy3.C87412m.m108593f(r1, r3)
            r8 = r1
            dp1.y0 r8 = (dp1.C58417y0) r8
            com.tencent.mm.plugin.finder.feed.ui.FinderPoiFeedUI$a r9 = com.tencent.p014mm.plugin.finder.feed.p052ui.FinderPoiFeedUI.C3005a.ACTION_SHARE_TO_TIMELINE
            com.tencent.mm.plugin.finder.feed.ui.FinderPoiFeedUI r1 = r0.f40759d
            kf1.l6 r1 = r1.mo3078Q7()
            long r10 = r1.f30413y
            rs1.s8$a r1 = rs1.C13442s8.f38060Q0
            com.tencent.mm.plugin.finder.feed.ui.FinderPoiFeedUI r2 = r0.f40759d
            rs1.s8 r1 = r1.mo12873f(r2)
            if (r1 == 0) goto L_0x00d0
            te3.hj1 r1 = r1.mo12861q3()
            r12 = r1
            goto L_0x00d1
        L_0x00d0:
            r12 = r7
        L_0x00d1:
            com.tencent.mm.plugin.finder.feed.ui.FinderPoiFeedUI r1 = r0.f40759d
            com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader r1 = r1.mo3075N7()
            te3.m74 r1 = r1.f13766e
            if (r1 == 0) goto L_0x00dd
            java.lang.String r7 = r1.f184224i
        L_0x00dd:
            r13 = r7
            com.tencent.mm.plugin.finder.feed.ui.FinderPoiFeedUI r1 = r0.f40759d
            kf1.l6 r1 = r1.mo3078Q7()
            java.lang.String r14 = r1.f30414z
            com.tencent.mm.plugin.finder.feed.ui.FinderPoiFeedUI r1 = r0.f40759d
            java.lang.String r15 = r1.mo3077P7()
            r16 = 0
            r18 = 64
            r19 = 0
            dp1.C58417y0.Dy0(r8, r9, r10, r12, r13, r14, r15, r16, r18, r19)
            er1.v2$a r3 = er1.C7888v2.f26513a
            com.tencent.mm.plugin.finder.feed.ui.FinderPoiFeedUI r4 = r0.f40759d
            kf1.l6 r1 = r4.mo3078Q7()
            java.lang.String r7 = r1.mo10396d1()
            com.tencent.mm.plugin.finder.feed.ui.FinderPoiFeedUI r1 = r0.f40759d
            kf1.l6 r1 = r1.mo3078Q7()
            java.lang.String r8 = r1.f30404C
            com.tencent.mm.plugin.finder.feed.ui.FinderPoiFeedUI r1 = r0.f40759d
            kf1.l6 r1 = r1.mo3078Q7()
            int r9 = r1.f30405D
            r3.mo9019r(r4, r5, r6, r7, r8, r9)
            goto L_0x018d
        L_0x0116:
            if (r5 != 0) goto L_0x0125
            com.tencent.mm.plugin.finder.feed.ui.FinderPoiFeedUI r1 = r0.f40759d
            r2 = 2131829838(0x7f11244e, float:1.9292656E38)
            android.widget.Toast r1 = nj3.C76912y0.makeText((android.content.Context) r1, (int) r2, (int) r4)
            r1.show()
            goto L_0x018d
        L_0x0125:
            di3.d r1 = di3.C86312j.m106911c(r1)
            gy3.C87412m.m108593f(r1, r3)
            r8 = r1
            dp1.y0 r8 = (dp1.C58417y0) r8
            com.tencent.mm.plugin.finder.feed.ui.FinderPoiFeedUI$a r9 = com.tencent.p014mm.plugin.finder.feed.p052ui.FinderPoiFeedUI.C3005a.ACTION_SHARE_TO_CHAT
            com.tencent.mm.plugin.finder.feed.ui.FinderPoiFeedUI r1 = r0.f40759d
            kf1.l6 r1 = r1.mo3078Q7()
            long r10 = r1.f30413y
            rs1.s8$a r1 = rs1.C13442s8.f38060Q0
            com.tencent.mm.plugin.finder.feed.ui.FinderPoiFeedUI r2 = r0.f40759d
            rs1.s8 r1 = r1.mo12873f(r2)
            if (r1 == 0) goto L_0x0149
            te3.hj1 r1 = r1.mo12861q3()
            r12 = r1
            goto L_0x014a
        L_0x0149:
            r12 = r7
        L_0x014a:
            com.tencent.mm.plugin.finder.feed.ui.FinderPoiFeedUI r1 = r0.f40759d
            com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader r1 = r1.mo3075N7()
            te3.m74 r1 = r1.f13766e
            if (r1 == 0) goto L_0x0156
            java.lang.String r7 = r1.f184224i
        L_0x0156:
            r13 = r7
            com.tencent.mm.plugin.finder.feed.ui.FinderPoiFeedUI r1 = r0.f40759d
            kf1.l6 r1 = r1.mo3078Q7()
            java.lang.String r14 = r1.f30414z
            com.tencent.mm.plugin.finder.feed.ui.FinderPoiFeedUI r1 = r0.f40759d
            java.lang.String r15 = r1.mo3077P7()
            r16 = 0
            r18 = 64
            r19 = 0
            dp1.C58417y0.Dy0(r8, r9, r10, r12, r13, r14, r15, r16, r18, r19)
            er1.v2$a r3 = er1.C7888v2.f26513a
            com.tencent.mm.plugin.finder.feed.ui.FinderPoiFeedUI r4 = r0.f40759d
            kf1.l6 r1 = r4.mo3078Q7()
            java.lang.String r7 = r1.mo10396d1()
            com.tencent.mm.plugin.finder.feed.ui.FinderPoiFeedUI r1 = r0.f40759d
            kf1.l6 r1 = r1.mo3078Q7()
            java.lang.String r8 = r1.f30404C
            com.tencent.mm.plugin.finder.feed.ui.FinderPoiFeedUI r1 = r0.f40759d
            kf1.l6 r1 = r1.mo3078Q7()
            int r9 = r1.f30405D
            r3.mo9018q(r4, r5, r6, r7, r8, r9)
        L_0x018d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vf1.C14777i4.onMMMenuItemSelected(android.view.MenuItem, int):void");
    }
}
