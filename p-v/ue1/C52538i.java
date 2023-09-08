package ue1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.p056ui.FinderBaseConversationFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import dj3.C45405a;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60208v1;
import java.util.regex.Pattern;
import o40.C61926c;
import p739wi.C78597c;
import rx3.C13598b0;
import ue1.C52530g;

/* renamed from: ue1.i */
public final class C52538i implements C52530g.C52531a {

    /* renamed from: a */
    public final FinderBaseConversationFragment f146743a;

    /* renamed from: b */
    public final C32226l<C45405a, C13598b0> f146744b;

    /* renamed from: ue1.i$a */
    public static final class C52539a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C52539a f146745d = new C52539a();

        public C52539a() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return "[field_senderUserName] is empty";
        }
    }

    /* renamed from: ue1.i$b */
    public static final class C52540b implements C78597c.C78598b {

        /* renamed from: d */
        public final /* synthetic */ C52528f f146746d;

        /* renamed from: e */
        public final /* synthetic */ View f146747e;

        /* renamed from: f */
        public final /* synthetic */ C52538i f146748f;

        public C52540b(C52528f fVar, View view, C52538i iVar) {
            this.f146746d = fVar;
            this.f146747e = view;
            this.f146748f = iVar;
        }

        /* renamed from: J5 */
        public boolean mo72924J5() {
            Log.m105924i("Finder.ConversationOnClickListener", "onChattingUIExit");
            C45405a aVar = new C45405a(this.f146747e);
            Pattern pattern = C61926c.f176038a;
            MMHandlerThread.postToMainThreadDelayed(aVar, 0);
            FinderBaseConversationFragment finderBaseConversationFragment = this.f146748f.f146743a;
            if (!(finderBaseConversationFragment instanceof FinderBaseConversationFragment)) {
                return false;
            }
            finderBaseConversationFragment.mo64586j0();
            return false;
        }

        /* renamed from: h3 */
        public void mo72925h3() {
            Log.m105924i("Finder.ConversationOnClickListener", "onChattingUIEnter");
            C60208v1 v1Var = (C60208v1) C86312j.m106911c(C60208v1.class);
            C72996z1 z1Var = this.f146746d.f146720Y0;
            v1Var.mo78707VB(z1Var != null ? z1Var.getUsername() : null, Boolean.TRUE);
        }
    }

    public C52538i(FinderBaseConversationFragment finderBaseConversationFragment, C32226l<? super C45405a, C13598b0> lVar) {
        C87412m.m108594g(finderBaseConversationFragment, "fragment");
        this.f146743a = finderBaseConversationFragment;
        this.f146744b = lVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:75:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x02c2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo73481a(android.view.View r27, int r28, ue1.C52528f r29) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r29
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r3 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            java.lang.Class<dp1.y0> r4 = dp1.C58417y0.class
            java.lang.Class<er1.b> r5 = er1.C58684b.class
            java.lang.String r6 = "view"
            gy3.C87412m.m108594g(r1, r6)
            java.lang.String r6 = "conv"
            gy3.C87412m.m108594g(r2, r6)
            r6 = 1
            r1.setSelected(r6)
            java.lang.String r7 = r2.field_sessionId
            java.lang.String r8 = "findersayhisessionholder"
            boolean r7 = gy3.C87412m.m108589b(r7, r8)
            r8 = 2
            r9 = 0
            r11 = 268435456(0x10000000, float:2.5243549E-29)
            java.lang.String r12 = "KEY_TALKER_SCENE"
            java.lang.String r13 = "KEY_TALKER_TYPE"
            java.lang.String r14 = "view.context"
            java.lang.String r15 = "getService(ActivityRouter::class.java)"
            java.lang.String r10 = "conv.field_sessionId"
            if (r7 == 0) goto L_0x0125
            di3.d r4 = di3.C86312j.m106911c(r5)
            gy3.C87412m.m108593f(r4, r15)
            er1.b r4 = (er1.C58684b) r4
            android.content.Context r4 = r27.getContext()
            gy3.C87412m.m108593f(r4, r14)
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            r5.putExtra(r13, r8)
            r5.putExtra(r12, r8)
            r7 = 67108864(0x4000000, float:1.5046328E-36)
            r5.addFlags(r7)
            boolean r7 = r4 instanceof android.app.Activity
            if (r7 != 0) goto L_0x005a
            r12 = r5
            goto L_0x005b
        L_0x005a:
            r12 = 0
        L_0x005b:
            if (r12 == 0) goto L_0x0060
            r12.addFlags(r11)
        L_0x0060:
            rs1.s8$a r11 = rs1.C13442s8.f38060Q0
            r11.mo12871c(r4, r5)
            java.lang.Class<com.tencent.mm.plugin.finder.ui.FinderConversationXXUI> r11 = com.tencent.p014mm.plugin.finder.p056ui.FinderConversationXXUI.class
            r5.setClass(r4, r11)
            if (r7 == 0) goto L_0x0095
            r12 = r4
            android.app.Activity r12 = (android.app.Activity) r12
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.mo10233c(r6)
            r4.mo10233c(r5)
            java.lang.Object[] r13 = r4.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/finder/utils/ActivityRouter"
            java.lang.String r15 = "enterFinderHelloConversationUI"
            java.lang.String r16 = "(Landroid/content/Context;Landroid/content/Intent;)V"
            java.lang.String r17 = "android/app/Activity"
            java.lang.String r18 = "startActivityForResult"
            java.lang.String r19 = "(Landroid/content/Intent;I)V"
            j20.C117292a.m165364j(r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x00cb
        L_0x0095:
            k20.a r6 = new k20.a
            r6.<init>()
            r6.mo10233c(r5)
            java.lang.Object[] r16 = r6.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/finder/utils/ActivityRouter"
            java.lang.String r18 = "enterFinderHelloConversationUI"
            java.lang.String r19 = "(Landroid/content/Context;Landroid/content/Intent;)V"
            java.lang.String r20 = "Undefined"
            java.lang.String r21 = "startActivity"
            java.lang.String r22 = "(Landroid/content/Intent;)V"
            r15 = r4
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r5 = r6.mo10231a(r9)
            android.content.Intent r5 = (android.content.Intent) r5
            r4.startActivity(r5)
            java.lang.String r16 = "com/tencent/mm/plugin/finder/utils/ActivityRouter"
            java.lang.String r17 = "enterFinderHelloConversationUI"
            java.lang.String r18 = "(Landroid/content/Context;Landroid/content/Intent;)V"
            java.lang.String r19 = "Undefined"
            java.lang.String r20 = "startActivity"
            java.lang.String r21 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
        L_0x00cb:
            fy3.l<dj3.a, rx3.b0> r4 = r0.f146744b
            if (r4 == 0) goto L_0x00d7
            dj3.a r5 = new dj3.a
            r5.<init>(r1)
            r4.invoke(r5)
        L_0x00d7:
            di3.d r1 = di3.C86312j.m106911c(r3)
            com.tencent.mm.plugin.FinderCommonFeatureService r1 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r1
            up1.j r1 = r1.mo76776L4()
            java.lang.String r3 = r2.field_sessionId
            gy3.C87412m.m108593f(r3, r10)
            r1.mo71566K(r3)
            dp1.h r1 = dp1.C58363h.f167137a
            java.lang.String r1 = r2.field_sessionId
            gy3.C87412m.m108593f(r1, r10)
            dp1.e2 r2 = dp1.C58363h.f167139c
            boolean r3 = r2.f122957a
            if (r3 == 0) goto L_0x00fd
            if (r3 != 0) goto L_0x00f9
            goto L_0x010a
        L_0x00f9:
            r2.mo70924b(r1, r8)
            goto L_0x010a
        L_0x00fd:
            dp1.e2 r3 = dp1.C58363h.f167138b
            r3.getClass()
            boolean r4 = r3.f122957a
            if (r4 != 0) goto L_0x0107
            goto L_0x010a
        L_0x0107:
            r3.mo70924b(r1, r8)
        L_0x010a:
            dp1.e2 r1 = dp1.C58363h.f167138b
            dp1.h$a r1 = r1.f122958b
            long r3 = r1.f122966a
            r5 = 1
            java.lang.String r7 = ""
            r2.mo70925c(r3, r5, r7)
            dp1.h$c r1 = dp1.C58363h.f167141e
            r1.getClass()
            long r1 = eb0.C31543z5.m39453c()
            java.lang.String.valueOf(r1)
            goto L_0x02c1
        L_0x0125:
            java.lang.String r7 = r2.field_sessionId
            java.lang.String r8 = "finderaliassessionholder"
            boolean r7 = gy3.C87412m.m108589b(r7, r8)
            if (r7 == 0) goto L_0x01b7
            di3.d r4 = di3.C86312j.m106911c(r5)
            gy3.C87412m.m108593f(r4, r15)
            er1.b r4 = (er1.C58684b) r4
            android.content.Context r4 = r27.getContext()
            gy3.C87412m.m108593f(r4, r14)
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            r7 = 3
            r5.putExtra(r13, r7)
            r5.putExtra(r12, r6)
            boolean r6 = r4 instanceof android.app.Activity
            if (r6 != 0) goto L_0x0151
            r6 = r5
            goto L_0x0152
        L_0x0151:
            r6 = 0
        L_0x0152:
            if (r6 == 0) goto L_0x0157
            r6.addFlags(r11)
        L_0x0157:
            rs1.s8$a r6 = rs1.C13442s8.f38060Q0
            r6.mo12871c(r4, r5)
            java.lang.Class<com.tencent.mm.plugin.finder.feed.ui.FinderConvAliasUI> r6 = com.tencent.p014mm.plugin.finder.feed.p052ui.FinderConvAliasUI.class
            r5.setClass(r4, r6)
            k20.a r6 = new k20.a
            r6.<init>()
            r6.mo10233c(r5)
            java.lang.Object[] r16 = r6.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/finder/utils/ActivityRouter"
            java.lang.String r18 = "enterFinderAliasConversationUI"
            java.lang.String r19 = "(Landroid/content/Context;Landroid/content/Intent;)V"
            java.lang.String r20 = "Undefined"
            java.lang.String r21 = "startActivity"
            java.lang.String r22 = "(Landroid/content/Intent;)V"
            r15 = r4
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r5 = r6.mo10231a(r9)
            android.content.Intent r5 = (android.content.Intent) r5
            r4.startActivity(r5)
            java.lang.String r16 = "com/tencent/mm/plugin/finder/utils/ActivityRouter"
            java.lang.String r17 = "enterFinderAliasConversationUI"
            java.lang.String r18 = "(Landroid/content/Context;Landroid/content/Intent;)V"
            java.lang.String r19 = "Undefined"
            java.lang.String r20 = "startActivity"
            java.lang.String r21 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            fy3.l<dj3.a, rx3.b0> r4 = r0.f146744b
            if (r4 == 0) goto L_0x01a3
            dj3.a r5 = new dj3.a
            r5.<init>(r1)
            r4.invoke(r5)
        L_0x01a3:
            di3.d r1 = di3.C86312j.m106911c(r3)
            com.tencent.mm.plugin.FinderCommonFeatureService r1 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r1
            up1.j r1 = r1.mo76776L4()
            java.lang.String r2 = r2.field_sessionId
            gy3.C87412m.m108593f(r2, r10)
            r1.mo71566K(r2)
            goto L_0x02c1
        L_0x01b7:
            java.lang.String r3 = r2.field_sessionId
            java.lang.String r7 = "finder_system_message"
            boolean r3 = gy3.C87412m.m108589b(r3, r7)
            if (r3 == 0) goto L_0x0259
            zc1.b r2 = zc1.C66785b.f191882e
            r3 = 0
            bd1.b r2 = zc1.C66783a.C66784a.m78800c(r2, r9, r6, r3)
            if (r2 == 0) goto L_0x01cc
            int r9 = r2.field_systemMsgCount
        L_0x01cc:
            di3.d r2 = di3.C86312j.m106911c(r4)
            dp1.y0 r2 = (dp1.C58417y0) r2
            r7 = 2
            r2.Yx0(r9, r7)
            fy3.l<dj3.a, rx3.b0> r2 = r0.f146744b
            if (r2 == 0) goto L_0x01e3
            dj3.a r3 = new dj3.a
            r3.<init>(r1)
            r2.invoke(r3)
        L_0x01e3:
            com.tencent.mm.plugin.finder.ui.FinderBaseConversationFragment r1 = r0.f146743a
            androidx.fragment.app.FragmentActivity r1 = r1.getActivity()
            if (r1 == 0) goto L_0x01f5
            di3.d r2 = di3.C86312j.m106911c(r5)
            er1.b r2 = (er1.C58684b) r2
            r3 = 0
            r2.Ix0(r1, r3)
        L_0x01f5:
            if (r9 <= 0) goto L_0x0237
            di3.d r1 = di3.C86312j.m106911c(r4)
            java.lang.String r2 = "getService(FinderReportLogic::class.java)"
            gy3.C87412m.m108593f(r1, r2)
            r10 = r1
            dp1.y0 r10 = (dp1.C58417y0) r10
            r12 = 4
            r13 = 2
            r14 = 5
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            com.tencent.mm.plugin.finder.ui.FinderBaseConversationFragment r1 = r0.f146743a
            androidx.fragment.app.FragmentActivity r1 = r1.getActivity()
            if (r1 == 0) goto L_0x0226
            rs1.s8$a r2 = rs1.C13442s8.f38060Q0
            rs1.s8 r1 = r2.mo12873f(r1)
            if (r1 == 0) goto L_0x0222
            te3.hj1 r1 = r1.mo12861q3()
            goto L_0x0223
        L_0x0222:
            r1 = 0
        L_0x0223:
            r21 = r1
            goto L_0x0228
        L_0x0226:
            r21 = 0
        L_0x0228:
            r22 = 0
            r23 = 0
            r24 = 3520(0xdc0, float:4.933E-42)
            r25 = 0
            java.lang.String r11 = "11"
            r16 = r9
            dp1.C58417y0.Nx0(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21, r22, r23, r24, r25)
        L_0x0237:
            com.tencent.mm.plugin.finder.ui.FinderBaseConversationFragment r1 = r0.f146743a
            androidx.fragment.app.FragmentActivity r1 = r1.getActivity()
            if (r1 == 0) goto L_0x024d
            android.content.Intent r1 = r1.getIntent()
            if (r1 == 0) goto L_0x024d
            java.lang.String r2 = "key_context_id"
            java.lang.String r1 = r1.getStringExtra(r2)
            if (r1 != 0) goto L_0x024f
        L_0x024d:
            java.lang.String r1 = ""
        L_0x024f:
            di3.d r2 = di3.C86312j.m106911c(r4)
            dp1.y0 r2 = (dp1.C58417y0) r2
            r2.Uy0(r1, r6)
            goto L_0x02c1
        L_0x0259:
            java.lang.String r3 = r2.field_senderUserName
            ft1.a r17 = ft1.C59319a.f169618b
            if (r3 == 0) goto L_0x026d
            int r4 = r3.length()
            if (r4 <= 0) goto L_0x0267
            r4 = 1
            goto L_0x0268
        L_0x0267:
            r4 = 0
        L_0x0268:
            if (r4 != r6) goto L_0x026d
            r19 = 1
            goto L_0x026f
        L_0x026d:
            r19 = 0
        L_0x026f:
            r20 = 0
            r21 = 0
            r22 = 0
            ue1.i$a r23 = ue1.C52538i.C52539a.f146745d
            r24 = 28
            r25 = 0
            java.lang.String r18 = "FinderConversationClickListener"
            o40.C11348f.C11349a.m11178b(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            com.tencent.mm.plugin.finder.ui.FinderBaseConversationFragment r4 = r0.f146743a
            wi.d r4 = r4.f108298t
            if (r4 == 0) goto L_0x02c2
            wi.c r4 = r4.f230225d
            if (r4 == 0) goto L_0x0297
            java.lang.String r5 = r2.field_sessionId
            ue1.i$b r6 = new ue1.i$b
            r6.<init>(r2, r1, r0)
            yj3.a r4 = (yj3.C79123a) r4
            r1 = 0
            r4.mo109074k(r5, r3, r1, r6)
        L_0x0297:
            dp1.h r1 = dp1.C58363h.f167137a
            java.lang.String r1 = r2.field_sessionId
            gy3.C87412m.m108593f(r1, r10)
            dp1.e2 r3 = dp1.C58363h.f167139c
            boolean r4 = r3.f122957a
            if (r4 == 0) goto L_0x02ac
            if (r4 != 0) goto L_0x02a7
            goto L_0x02ba
        L_0x02a7:
            r4 = 2
            r3.mo70924b(r1, r4)
            goto L_0x02ba
        L_0x02ac:
            r4 = 2
            dp1.e2 r3 = dp1.C58363h.f167138b
            r3.getClass()
            boolean r5 = r3.f122957a
            if (r5 != 0) goto L_0x02b7
            goto L_0x02ba
        L_0x02b7:
            r3.mo70924b(r1, r4)
        L_0x02ba:
            dp1.h$d r1 = dp1.C58363h.f167142f
            int r2 = r2.field_unReadCount
            long r2 = (long) r2
            r1.f167153g = r2
        L_0x02c1:
            return
        L_0x02c2:
            java.lang.String r1 = "readyChattingUIC"
            gy3.C87412m.m108603p(r1)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ue1.C52538i.mo73481a(android.view.View, int, ue1.f):void");
    }
}
