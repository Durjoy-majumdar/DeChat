package sb2;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvSongInfoUIC;
import hb2.C59822f;

/* renamed from: sb2.d1 */
public final class C63755d1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ViewGroup f180725d;

    /* renamed from: e */
    public final /* synthetic */ C59822f f180726e;

    /* renamed from: f */
    public final /* synthetic */ C63756e f180727f;

    /* renamed from: g */
    public final /* synthetic */ MusicMvSongInfoUIC f180728g;

    public C63755d1(ViewGroup viewGroup, C59822f fVar, C63756e eVar, MusicMvSongInfoUIC musicMvSongInfoUIC) {
        this.f180725d = viewGroup;
        this.f180726e = fVar;
        this.f180727f = eVar;
        this.f180728g = musicMvSongInfoUIC;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x00a5, code lost:
        if ((r0.f143269f == 1) == false) goto L_0x0169;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r26) {
        /*
            r25 = this;
            r6 = r25
            java.lang.Class<te3.w23> r7 = te3.C64793w23.class
            java.lang.Class<ox.b> r8 = p640ox.C77049b.class
            java.lang.Class<sb2.e> r9 = sb2.C63756e.class
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r26
            r0.add(r1)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC$update$3"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            r4 = r25
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            bl3.r r0 = bl3.C39818r.f106831a
            android.view.ViewGroup r1 = r6.f180725d
            android.content.Context r1 = r1.getContext()
            java.lang.String r2 = "parent.context"
            gy3.C87412m.m108593f(r1, r2)
            bl3.r$a r1 = r0.mo62443b(r1)
            androidx.lifecycle.i0 r1 = r1.mo75002a(r9)
            sb2.e r1 = (sb2.C63756e) r1
            te3.kb1 r12 = r1.f180744i
            hb2.q r10 = hb2.C59833q.f170832a
            android.view.ViewGroup r1 = r6.f180725d
            android.content.Context r11 = r1.getContext()
            gy3.C87412m.m108593f(r11, r2)
            hb2.f r13 = r6.f180726e
            r14 = 7
            r15 = 1
            r16 = 2
            r17 = 0
            sb2.e r1 = r6.f180727f
            int r18 = r1.mo88571e3()
            sb2.e r1 = r6.f180727f
            int r19 = r1.mo88569c3()
            sb2.e r1 = r6.f180727f
            java.lang.String r20 = r1.mo88570d3()
            sb2.e r1 = r6.f180727f
            int r1 = r1.f180736H
            r22 = 64
            r23 = 0
            r21 = r1
            hb2.C59833q.m69726g(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            android.view.ViewGroup r1 = r6.f180725d
            android.content.Context r1 = r1.getContext()
            gy3.C87412m.m108593f(r1, r2)
            bl3.r$a r0 = r0.mo62443b(r1)
            androidx.lifecycle.i0 r0 = r0.mo75002a(r9)
            sb2.e r0 = (sb2.C63756e) r0
            te3.v23 r0 = r0.f180756x
            java.lang.String r1 = "MicroMsg.Mv.MusicMvSongInfoUIC"
            java.lang.String r2 = "(Landroid/view/View;)V"
            java.lang.String r3 = "onClick"
            java.lang.String r4 = "android/view/View$OnClickListener"
            java.lang.String r5 = "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC$update$3"
            if (r0 == 0) goto L_0x0169
            java.lang.String r9 = r0.f143267d
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            r10 = 1
            if (r9 != 0) goto L_0x00a9
            int r9 = r0.f143269f
            if (r9 != r10) goto L_0x00a4
            r9 = 1
            goto L_0x00a5
        L_0x00a4:
            r9 = 0
        L_0x00a5:
            if (r9 != 0) goto L_0x00a9
            goto L_0x0169
        L_0x00a9:
            long r11 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC r9 = r6.f180728g
            long r13 = r9.f163377j
            long r13 = r11 - r13
            r15 = 2000(0x7d0, double:9.88E-321)
            int r9 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r9 >= 0) goto L_0x00c2
            java.lang.String r0 = "don't click again in 2s"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            j20.C117292a.m165361g(r6, r5, r4, r3, r2)
            return
        L_0x00c2:
            di3.d r1 = di3.C86312j.m106911c(r8)
            ox.b r1 = (p640ox.C77049b) r1
            com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC r9 = r6.f180728g
            android.app.Activity r9 = r9.getContext()
            r13 = 7
            pe3.a r1 = r1.Wi0(r9, r13, r7)
            te3.w23 r1 = (te3.C64793w23) r1
            if (r1 == 0) goto L_0x00df
            int r1 = r1.f186049w
            int r1 = r1 + r10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x00e0
        L_0x00df:
            r1 = 0
        L_0x00e0:
            di3.d r8 = di3.C86312j.m106911c(r8)
            ox.b r8 = (p640ox.C77049b) r8
            com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC r9 = r6.f180728g
            android.app.Activity r9 = r9.getContext()
            pe3.a r7 = r8.Wi0(r9, r13, r7)
            te3.w23 r7 = (te3.C64793w23) r7
            if (r7 != 0) goto L_0x00f5
            goto L_0x00fb
        L_0x00f5:
            int r1 = r1.intValue()
            r7.f186049w = r1
        L_0x00fb:
            com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC r1 = r6.f180728g
            r1.f163377j = r11
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r7 = r0.f143267d
            java.lang.String r8 = "finder_username"
            r1.putExtra(r8, r7)
            java.lang.String r7 = "KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE"
            r1.putExtra(r7, r10)
            r7 = 27
            java.lang.String r8 = "key_enter_profile_type"
            r1.putExtra(r8, r7)
            java.lang.String r7 = "key_not_request_focus"
            r1.putExtra(r7, r10)
            java.lang.String r7 = "key_hide_float_ball"
            r1.putExtra(r7, r10)
            r7 = 5
            java.lang.String r8 = "key_enter_profile_tab"
            r1.putExtra(r8, r7)
            rs1.s8$a r13 = rs1.C13442s8.f38060Q0
            com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC r7 = r6.f180728g
            android.app.Activity r14 = r7.getContext()
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 27
            r21 = 0
            r22 = 0
            r23 = 128(0x80, float:1.794E-43)
            r24 = 0
            r15 = r1
            rs1.C13442s8.C13443a.m12791e(r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24)
            java.lang.String r0 = r0.f143267d
            zc1.b r7 = zc1.C66785b.f191882e
            java.lang.String r7 = r7.mo90662O5()
            boolean r0 = gy3.C87412m.m108589b(r0, r7)
            java.lang.String r7 = "KEY_FINDER_SELF_FLAG"
            r1.putExtra(r7, r0)
            java.lang.Class<ht1.t1> r0 = ht1.C60200t1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ht1.t1 r0 = (ht1.C60200t1) r0
            com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC r7 = r6.f180728g
            android.app.Activity r7 = r7.getContext()
            r0.mo76819V1(r7, r1)
            j20.C117292a.m165361g(r6, r5, r4, r3, r2)
            return
        L_0x0169:
            java.lang.String r0 = "click do nothing, data is error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            j20.C117292a.m165361g(r6, r5, r4, r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sb2.C63755d1.onClick(android.view.View):void");
    }
}
