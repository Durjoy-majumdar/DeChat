package vf1;

import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderGameSelectUI;
import jq3.C60898l;
import jq3.C60905o;

/* renamed from: vf1.j0 */
public final class C65706j0 implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ FinderGameSelectUI f189052d;

    public C65706j0(FinderGameSelectUI finderGameSelectUI) {
        this.f189052d = finderGameSelectUI;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0038, code lost:
        r0 = (r0 = r0.f181276d).f140523e;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo734q(androidx.recyclerview.widget.RecyclerView.C16613e r10, android.view.View r11, int r12, androidx.recyclerview.widget.RecyclerView.C16631z r13) {
        /*
            r9 = this;
            jq3.o r13 = (jq3.C60905o) r13
            java.lang.String r0 = "adapter"
            gy3.C87412m.m108594g(r10, r0)
            java.lang.String r10 = "view"
            gy3.C87412m.m108594g(r11, r10)
            java.lang.String r10 = "holder"
            gy3.C87412m.m108594g(r13, r10)
            com.tencent.mm.plugin.finder.feed.ui.FinderGameSelectUI r10 = r9.f189052d
            java.lang.String r11 = r10.f158921p
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "selectPosition "
            r13.append(r0)
            r13.append(r12)
            java.lang.String r0 = ", game:"
            r13.append(r0)
            java.util.ArrayList<sk1.d> r0 = r10.f158922q
            java.lang.Object r0 = sx3.C110818d0.m150917O(r0, r12)
            sk1.d r0 = (sk1.C63950d) r0
            r1 = 0
            if (r0 == 0) goto L_0x003f
            te3.qs1 r0 = r0.f181276d
            if (r0 == 0) goto L_0x003f
            te3.kr1 r0 = r0.f140523e
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = r0.f137002e
            goto L_0x0040
        L_0x003f:
            r0 = r1
        L_0x0040:
            r13.append(r0)
            java.lang.String r0 = ", "
            r13.append(r0)
            java.util.ArrayList<sk1.d> r0 = r10.f158922q
            java.lang.Object r0 = sx3.C110818d0.m150917O(r0, r12)
            sk1.d r0 = (sk1.C63950d) r0
            if (r0 == 0) goto L_0x005d
            te3.qs1 r0 = r0.f181276d
            if (r0 == 0) goto L_0x005d
            te3.kr1 r0 = r0.f140523e
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = r0.f137001d
            goto L_0x005e
        L_0x005d:
            r0 = r1
        L_0x005e:
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r13)
            java.lang.String r11 = ""
            r13 = 1
            r0 = 0
            if (r12 < 0) goto L_0x00ea
            java.util.ArrayList<sk1.d> r2 = r10.f158922q
            int r2 = r2.size()
            if (r12 >= r2) goto L_0x00ea
            java.util.ArrayList<sk1.d> r2 = r10.f158922q
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L_0x007d:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0091
            java.lang.Object r4 = r2.next()
            sk1.d r4 = (sk1.C63950d) r4
            boolean r4 = r4.f181277e
            if (r4 == 0) goto L_0x008e
            goto L_0x0092
        L_0x008e:
            int r3 = r3 + 1
            goto L_0x007d
        L_0x0091:
            r3 = -1
        L_0x0092:
            if (r3 == r12) goto L_0x00ea
            sk1.d r2 = r10.f158923r
            if (r2 != 0) goto L_0x0099
            goto L_0x009b
        L_0x0099:
            r2.f181277e = r0
        L_0x009b:
            java.util.ArrayList<sk1.d> r2 = r10.f158922q
            java.lang.Object r2 = r2.get(r12)
            sk1.d r2 = (sk1.C63950d) r2
            r10.f158923r = r2
            if (r2 != 0) goto L_0x00a8
            goto L_0x00aa
        L_0x00a8:
            r2.f181277e = r13
        L_0x00aa:
            com.tencent.mm.view.recyclerview.WxRecyclerView r2 = r10.mo77415P7()
            androidx.recyclerview.widget.RecyclerView$e r2 = r2.getAdapter()
            if (r2 == 0) goto L_0x00bb
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r2.notifyItemChanged(r12, r4)
        L_0x00bb:
            com.tencent.mm.view.recyclerview.WxRecyclerView r12 = r10.mo77415P7()
            androidx.recyclerview.widget.RecyclerView$e r12 = r12.getAdapter()
            if (r12 == 0) goto L_0x00cc
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r12.notifyItemChanged(r3, r2)
        L_0x00cc:
            f40.o r12 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r12 = r12.mo121142i()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_LIVE_GAME_SELECT_APPID_STRING_SYNC
            sk1.d r10 = r10.f158923r
            if (r10 == 0) goto L_0x00e6
            te3.qs1 r10 = r10.f181276d
            if (r10 == 0) goto L_0x00e6
            te3.kr1 r10 = r10.f140523e
            if (r10 == 0) goto L_0x00e6
            java.lang.String r10 = r10.f137001d
            if (r10 != 0) goto L_0x00e7
        L_0x00e6:
            r10 = r11
        L_0x00e7:
            r12.mo119677K(r2, r10)
        L_0x00ea:
            com.tencent.mm.plugin.finder.feed.ui.FinderGameSelectUI r10 = r9.f189052d
            sk1.d r12 = r10.f158923r
            if (r12 == 0) goto L_0x00fe
            te3.qs1 r2 = r12.f181276d
            if (r2 == 0) goto L_0x00fe
            te3.kr1 r2 = r2.f140523e
            if (r2 == 0) goto L_0x00fe
            int r2 = r2.f137014t
            if (r2 != r13) goto L_0x00fe
            r2 = 1
            goto L_0x00ff
        L_0x00fe:
            r2 = 0
        L_0x00ff:
            r3 = 2
            if (r2 == 0) goto L_0x0112
            er1.u0 r2 = er1.C58777u0.f168283a
            te3.qs1 r4 = r12.f181276d
            te3.kr1 r4 = r4.f140523e
            if (r4 == 0) goto L_0x010d
            java.lang.String r4 = r4.f137001d
            goto L_0x010e
        L_0x010d:
            r4 = r1
        L_0x010e:
            r2.mo83838g(r3, r4)
            goto L_0x0120
        L_0x0112:
            er1.u0 r2 = er1.C58777u0.f168283a
            long r4 = er1.C58777u0.f168284b
            r6 = 18
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0120
            r4 = 3
            r2.mo83833b(r4)
        L_0x0120:
            java.lang.String r2 = r10.f158921p
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Finder_Game_Select_Hardcode :"
            r4.append(r5)
            up1.f r5 = up1.C37521f.f99374d
            r5.getClass()
            pe1.c<java.lang.Integer> r5 = up1.C37521f.f99358b1
            java.lang.Object r6 = r5.mo60266n()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            java.lang.Object r2 = r5.mo60266n()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            if (r2 == r13) goto L_0x0166
            if (r2 == r3) goto L_0x0156
            goto L_0x0175
        L_0x0156:
            if (r12 == 0) goto L_0x015f
            te3.qs1 r2 = r12.f181276d
            if (r2 == 0) goto L_0x015f
            te3.jp4 r2 = r2.f140522d
            goto L_0x0160
        L_0x015f:
            r2 = r1
        L_0x0160:
            if (r2 != 0) goto L_0x0163
            goto L_0x0175
        L_0x0163:
            r2.f136247f = r13
            goto L_0x0175
        L_0x0166:
            if (r12 == 0) goto L_0x016f
            te3.qs1 r2 = r12.f181276d
            if (r2 == 0) goto L_0x016f
            te3.jp4 r2 = r2.f140522d
            goto L_0x0170
        L_0x016f:
            r2 = r1
        L_0x0170:
            if (r2 != 0) goto L_0x0173
            goto L_0x0175
        L_0x0173:
            r2.f136246e = r13
        L_0x0175:
            if (r12 == 0) goto L_0x0219
            te3.qs1 r2 = r12.f181276d
            te3.kr1 r2 = r2.f140523e
            if (r2 == 0) goto L_0x017f
            java.lang.String r1 = r2.f137001d
        L_0x017f:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0219
            te3.qs1 r1 = r12.f181276d
            te3.kr1 r2 = r1.f140523e
            if (r2 != 0) goto L_0x018d
            goto L_0x0219
        L_0x018d:
            te3.jp4 r1 = r1.f140522d
            if (r1 == 0) goto L_0x0197
            int r2 = r1.f136246e
            if (r2 != r13) goto L_0x0197
            r2 = 1
            goto L_0x0198
        L_0x0197:
            r2 = 0
        L_0x0198:
            if (r2 != 0) goto L_0x01d7
            if (r1 == 0) goto L_0x01a2
            int r2 = r1.f136247f
            if (r2 != r13) goto L_0x01a2
            r2 = 1
            goto L_0x01a3
        L_0x01a2:
            r2 = 0
        L_0x01a3:
            if (r2 == 0) goto L_0x01a6
            goto L_0x01d7
        L_0x01a6:
            qg1.r r13 = new qg1.r
            te3.qs1 r1 = r12.f181276d
            te3.kr1 r1 = r1.f140523e
            if (r1 == 0) goto L_0x01b4
            java.lang.String r1 = r1.f137001d
            if (r1 != 0) goto L_0x01b3
            goto L_0x01b4
        L_0x01b3:
            r11 = r1
        L_0x01b4:
            r13.<init>(r11, r0, r0)
            android.content.res.Resources r11 = r10.getResources()
            r0 = 2131830090(0x7f11254a, float:1.9293168E38)
            java.lang.String r11 = r11.getString(r0)
            r0 = 500(0x1f4, double:2.47E-321)
            r13.mo85582k(r10, r11, r0)
            nr3.e r11 = r13.mo9225i()
            r11.mo11397F(r10)
            vf1.p0 r13 = new vf1.p0
            r13.<init>(r10, r12)
            r11.mo123420E(r13)
            goto L_0x0227
        L_0x01d7:
            if (r1 == 0) goto L_0x01de
            int r11 = r1.f136246e
            if (r11 != r13) goto L_0x01de
            goto L_0x01df
        L_0x01de:
            r13 = 0
        L_0x01df:
            if (r13 == 0) goto L_0x01ed
            androidx.appcompat.app.AppCompatActivity r11 = r10.getContext()
            r12 = 2131839948(0x7f114bcc, float:1.9313162E38)
            java.lang.String r11 = r11.getString(r12)
            goto L_0x01f8
        L_0x01ed:
            androidx.appcompat.app.AppCompatActivity r11 = r10.getContext()
            r12 = 2131839949(0x7f114bcd, float:1.9313164E38)
            java.lang.String r11 = r11.getString(r12)
        L_0x01f8:
            r1 = r11
            java.lang.String r11 = "if (game.gameInfo.user_s…ct_failed2)\n            }"
            gy3.C87412m.m108593f(r1, r11)
            androidx.appcompat.app.AppCompatActivity r0 = r10.getContext()
            androidx.appcompat.app.AppCompatActivity r10 = r10.getContext()
            r11 = 2131821617(0x7f110431, float:1.9275982E38)
            java.lang.String r3 = r10.getString(r11)
            vf1.n0 r5 = vf1.C37730n0.f99940d
            vf1.o0 r6 = vf1.C37732o0.f99942d
            java.lang.String r2 = ""
            java.lang.String r4 = ""
            nj3.C76879j.m92707A(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0227
        L_0x0219:
            androidx.appcompat.app.AppCompatActivity r10 = r10.getContext()
            r11 = 2131827500(0x7f111b2c, float:1.9287914E38)
            android.widget.Toast r10 = nj3.C76912y0.makeText((android.content.Context) r10, (int) r11, (int) r0)
            r10.show()
        L_0x0227:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vf1.C65706j0.mo734q(androidx.recyclerview.widget.RecyclerView$e, android.view.View, int, androidx.recyclerview.widget.RecyclerView$z):void");
    }
}
