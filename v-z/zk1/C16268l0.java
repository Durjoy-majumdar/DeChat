package zk1;

import a14.C0000n0;
import a14.C53934p0;
import android.view.MenuItem;
import bl3.C0317e;
import fy3.C32227p;
import nj3.C11184p0;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: zk1.l0 */
public final class C16268l0 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C16260i0 f43555d;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLivePostBtnUIC$showLiveBottomSheet$2$1", mo125469f = "FinderLivePostBtnUIC.kt", mo125470l = {175}, mo125471m = "invokeSuspend")
    /* renamed from: zk1.l0$a */
    public static final class C16269a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f43556d;

        /* renamed from: e */
        public int f43557e;

        /* renamed from: f */
        public final /* synthetic */ C16260i0 f43558f;

        /* renamed from: g */
        public final /* synthetic */ MenuItem f43559g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16269a(C16260i0 i0Var, MenuItem menuItem, C15601d<? super C16269a> dVar) {
            super(2, dVar);
            this.f43558f = i0Var;
            this.f43559g = menuItem;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C16269a(this.f43558f, this.f43559g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C16269a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0065  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r31) {
            /*
                r30 = this;
                r0 = r30
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f43557e
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x001e
                if (r2 != r3) goto L_0x0016
                java.lang.Object r1 = r0.f43556d
                er1.i5 r1 = (er1.C7813i5) r1
                kotlin.ResultKt.throwOnFailure(r31)
                r5 = r31
                goto L_0x005b
            L_0x0016:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x001e:
                kotlin.ResultKt.throwOnFailure(r31)
                er1.i5$a r5 = er1.C7813i5.f26336f
                zk1.i0 r2 = r0.f43558f
                androidx.appcompat.app.AppCompatActivity r6 = r2.getActivity()
                zk1.i0 r2 = r0.f43558f
                androidx.appcompat.app.AppCompatActivity r2 = r2.getActivity()
                android.content.res.Resources r2 = r2.getResources()
                r7 = 2131830090(0x7f11254a, float:1.9293168E38)
                java.lang.String r7 = r2.getString(r7)
                r8 = 500(0x1f4, double:2.47E-321)
                r10 = 0
                r11 = 8
                r12 = 0
                er1.i5 r2 = er1.C7813i5.C7814a.m7953a(r5, r6, r7, r8, r10, r11, r12)
                r2.begin()
                zk1.i0 r5 = r0.f43558f
                a14.u0<mk1.h$a> r5 = r5.f43546p
                if (r5 == 0) goto L_0x005f
                r0.f43556d = r2
                r0.f43557e = r3
                a14.v0 r5 = (a14.C53957v0) r5
                java.lang.Object r5 = r5.mo74549z(r0)
                if (r5 != r1) goto L_0x005a
                return r1
            L_0x005a:
                r1 = r2
            L_0x005b:
                mk1.h$a r5 = (mk1.C10906h.C10907a) r5
                r2 = r1
                goto L_0x0060
            L_0x005f:
                r5 = r4
            L_0x0060:
                r2.mo8913b()
                if (r5 == 0) goto L_0x035d
                zk1.i0 r1 = r0.f43558f
                android.view.MenuItem r2 = r0.f43559g
                int r2 = r2.getItemId()
                ak1.f0$b0 r6 = ak1.C54067f0.C0050b0.LIVE_ENTER_CRAETE_BOOK_PAGE
                ak1.f0$e r7 = ak1.C54067f0.C0053e.PROFILE
                ak1.f0$b0 r8 = ak1.C54067f0.C0050b0.LIVE_CHECK_NOTICE
                java.lang.Class<tf0.p1> r9 = tf0.C64916p1.class
                java.lang.Class<ht1.d3> r10 = ht1.C8761d3.class
                java.lang.Class<tf0.o1> r11 = tf0.C13883o1.class
                java.lang.Class<ak1.o> r12 = ak1.C54108o.class
                int r13 = r1.f43538e
                if (r2 != r13) goto L_0x00e2
                java.lang.Class<ht1.j5> r2 = ht1.C8777j5.class
                di3.d r2 = di3.C86312j.m106911c(r2)
                java.lang.String r3 = "getService(IHellLiveReport::class.java)"
                gy3.C87412m.m108593f(r2, r3)
                r13 = r2
                ht1.j5 r13 = (ht1.C8777j5) r13
                r14 = 4
                bl3.r r2 = bl3.C39818r.f106831a
                androidx.appcompat.app.AppCompatActivity r3 = r1.getActivity()
                bl3.r$a r3 = r2.mo62444c(r3)
                bl3.c r3 = r3.mo62447c(r10)
                ht1.d3 r3 = (ht1.C8761d3) r3
                int r15 = r3.mo9589n1()
                androidx.appcompat.app.AppCompatActivity r3 = r1.getActivity()
                bl3.r$a r2 = r2.mo62444c(r3)
                bl3.c r2 = r2.mo62447c(r10)
                ht1.d3 r2 = (ht1.C8761d3) r2
                long r16 = r2.mo9585G()
                r18 = 0
                r19 = 8
                r20 = 0
                ht1.C8777j5.C8778a.m8601b(r13, r14, r15, r16, r18, r19, r20)
                di3.d r2 = di3.C86312j.m106911c(r12)
                java.lang.String r3 = "getService(HellLiveReport::class.java)"
                gy3.C87412m.m108593f(r2, r3)
                r6 = r2
                ht1.j5 r6 = (ht1.C8777j5) r6
                r7 = 14
                r10 = 0
                r11 = 4
                r12 = 0
                java.lang.String r9 = ""
                ht1.C8777j5.C8778a.m8600a(r6, r7, r9, r10, r11, r12)
                r7 = 0
                r8 = 0
                zk1.h0 r9 = new zk1.h0
                r9.<init>(r1, r5, r4)
                r10 = 3
                r11 = 0
                r6 = r1
                bl3.C0317e.launchUI$default(r6, r7, r8, r9, r10, r11)
                goto L_0x0356
            L_0x00e2:
                int r10 = r1.f43540g
                java.lang.String r13 = "getService(IFinderCommon…atureService::class.java)"
                java.lang.String r14 = "KEY_FINDER_SELF_FLAG"
                java.lang.String r15 = "finder_username"
                java.lang.String r4 = ""
                if (r2 != r10) goto L_0x0163
                java.lang.Class<tf0.q1> r2 = tf0.C13887q1.class
                di3.d r2 = di3.C86312j.m106911c(r2)
                tf0.q1 r2 = (tf0.C13887q1) r2
                int r2 = r2.mo13348kt()
                fy3.a<rx3.b0> r6 = r1.f43544n
                if (r6 == 0) goto L_0x0104
                if (r2 <= r3) goto L_0x0104
                r6.invoke()
                goto L_0x014b
            L_0x0104:
                android.content.Intent r6 = new android.content.Intent
                r6.<init>()
                zc1.b r7 = zc1.C66785b.f191882e
                java.lang.String r7 = r7.mo90662O5()
                r6.putExtra(r15, r7)
                r6.putExtra(r14, r3)
                if (r2 <= r3) goto L_0x011c
                java.lang.String r2 = "KEY_FINDER_PROFILE_UI_AFTER_SHOW_NOTICE_LIST"
                r6.putExtra(r2, r3)
            L_0x011c:
                di3.d r2 = di3.C86312j.m106911c(r9)
                gy3.C87412m.m108593f(r2, r13)
                r16 = r2
                tf0.p1 r16 = (tf0.C64916p1) r16
                androidx.appcompat.app.AppCompatActivity r17 = r1.getActivity()
                r19 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 0
                r25 = 124(0x7c, float:1.74E-43)
                r26 = 0
                r18 = r6
                tf0.C64916p1.C64917a.m76443j(r16, r17, r18, r19, r21, r22, r23, r24, r25, r26)
                di3.d r2 = di3.C86312j.m106911c(r11)
                tf0.o1 r2 = (tf0.C13883o1) r2
                androidx.appcompat.app.AppCompatActivity r3 = r1.getActivity()
                r2.mo13272V1(r3, r6)
            L_0x014b:
                di3.d r2 = di3.C86312j.m106911c(r12)
                ak1.o r2 = (ak1.C54108o) r2
                te3.cj0 r3 = r5.f32543c
                if (r3 == 0) goto L_0x015d
                te3.d51 r3 = r3.f131755e
                if (r3 == 0) goto L_0x015d
                java.lang.String r3 = r3.f132121g
                if (r3 != 0) goto L_0x015e
            L_0x015d:
                r3 = r4
            L_0x015e:
                r2.mo9608aH(r8, r4, r3)
                goto L_0x0356
            L_0x0163:
                int r10 = r1.f43539f
                if (r2 != r10) goto L_0x0356
                te3.cj0 r2 = r5.f32543c
                di3.d r5 = di3.C86312j.m106911c(r12)
                ak1.o r5 = (ak1.C54108o) r5
                r5.getClass()
                ak1.f0 r5 = ak1.C54108o.f151869h
                androidx.appcompat.app.AppCompatActivity r10 = r1.getActivity()
                boolean r10 = r10 instanceof ht1.C8775i4
                if (r10 == 0) goto L_0x017d
                goto L_0x018f
            L_0x017d:
                androidx.fragment.app.Fragment r10 = r1.getFragment()
                boolean r10 = r10 instanceof bg1.C0278a
                if (r10 != 0) goto L_0x018d
                androidx.appcompat.app.AppCompatActivity r10 = r1.getActivity()
                boolean r10 = r10 instanceof bg1.C0278a
                if (r10 == 0) goto L_0x018f
            L_0x018d:
                ak1.f0$e r7 = ak1.C54067f0.C0053e.PROFILE_RIGHT_CORNER
            L_0x018f:
                r5.getClass()
                r5.f151464j0 = r7
                di3.d r5 = di3.C86312j.m106911c(r12)
                ak1.o r5 = (ak1.C54108o) r5
                ak1.f0$b0 r7 = ak1.C54067f0.C0050b0.LIVE_SELF_PAGE_CLICK_BOOK_ITEM
                if (r2 == 0) goto L_0x01a6
                te3.d51 r10 = r2.f131755e
                if (r10 == 0) goto L_0x01a6
                java.lang.String r10 = r10.f132121g
                if (r10 != 0) goto L_0x01a7
            L_0x01a6:
                r10 = r4
            L_0x01a7:
                r5.mo9608aH(r7, r4, r10)
                if (r2 == 0) goto L_0x034f
                te3.ke1 r5 = r1.f43542i
                if (r5 == 0) goto L_0x01e1
                java.util.LinkedList<te3.zg3> r5 = r5.f136709z
                if (r5 == 0) goto L_0x01e1
                java.util.Iterator r5 = r5.iterator()
            L_0x01b8:
                boolean r7 = r5.hasNext()
                if (r7 == 0) goto L_0x01dc
                java.lang.Object r7 = r5.next()
                r10 = r7
                te3.zg3 r10 = (te3.C52261zg3) r10
                com.tencent.mm.protocal.protobuf.FinderContact r10 = r10.f145918e
                if (r10 == 0) goto L_0x01cc
                java.lang.String r10 = r10.username
                goto L_0x01cd
            L_0x01cc:
                r10 = 0
            L_0x01cd:
                zc1.b r17 = zc1.C66785b.f191882e
                java.lang.String r3 = r17.mo90662O5()
                boolean r3 = gy3.C87412m.m108589b(r10, r3)
                if (r3 == 0) goto L_0x01da
                goto L_0x01dd
            L_0x01da:
                r3 = 1
                goto L_0x01b8
            L_0x01dc:
                r7 = 0
            L_0x01dd:
                r3 = r7
                te3.zg3 r3 = (te3.C52261zg3) r3
                goto L_0x01e2
            L_0x01e1:
                r3 = 0
            L_0x01e2:
                pe1.c<java.lang.Integer> r5 = gg1.C32444a.f86128b2
                java.lang.Object r5 = r5.mo60266n()
                java.lang.Number r5 = (java.lang.Number) r5
                int r5 = r5.intValue()
                java.lang.String r7 = "KEY_FINDER_LIVE_NOTICE_IS_FROM_PROFILE"
                r10 = 1
                if (r5 != r10) goto L_0x0267
                if (r3 == 0) goto L_0x0253
                com.tencent.mm.protocal.protobuf.FinderContact r5 = r3.f145918e
                if (r5 == 0) goto L_0x0253
                te3.e51 r3 = r3.f145935y
                if (r3 == 0) goto L_0x0200
                int r3 = r3.f132699f
                goto L_0x0201
            L_0x0200:
                r3 = 0
            L_0x0201:
                r8 = 100
                if (r3 < r8) goto L_0x0207
                r3 = 1
                goto L_0x0208
            L_0x0207:
                r3 = 0
            L_0x0208:
                android.content.Intent r8 = new android.content.Intent
                r8.<init>()
                androidx.fragment.app.Fragment r9 = r1.getFragment()
                boolean r9 = r9 instanceof bg1.C0278a
                if (r9 != 0) goto L_0x0220
                androidx.appcompat.app.AppCompatActivity r9 = r1.getActivity()
                boolean r9 = r9 instanceof bg1.C0278a
                if (r9 == 0) goto L_0x021e
                goto L_0x0220
            L_0x021e:
                r9 = 0
                goto L_0x0221
            L_0x0220:
                r9 = 1
            L_0x0221:
                r8.putExtra(r7, r9)
                di3.d r7 = di3.C86312j.m106911c(r11)
                r17 = r7
                tf0.o1 r17 = (tf0.C13883o1) r17
                androidx.appcompat.app.AppCompatActivity r7 = r1.getActivity()
                r21 = 100
                r9 = 1
                r22 = r3 ^ 1
                zc1.b r3 = zc1.C66785b.f191882e
                r10 = 0
                r11 = 0
                bd1.b r3 = zc1.C66783a.C66784a.m78800c(r3, r10, r9, r11)
                if (r3 == 0) goto L_0x0248
                te3.dr2 r3 = r3.mo75251m2()
                te3.jp1 r3 = r3.f132486C
                r23 = r3
                goto L_0x024a
            L_0x0248:
                r23 = 0
            L_0x024a:
                r18 = r7
                r19 = r8
                r20 = r5
                r17.mo13289tu(r18, r19, r20, r21, r22, r23)
            L_0x0253:
                di3.d r3 = di3.C86312j.m106911c(r12)
                ak1.o r3 = (ak1.C54108o) r3
                te3.d51 r2 = r2.f131755e
                if (r2 == 0) goto L_0x0261
                java.lang.String r2 = r2.f132121g
                if (r2 != 0) goto L_0x0262
            L_0x0261:
                r2 = r4
            L_0x0262:
                r3.mo9608aH(r6, r4, r2)
                goto L_0x0356
            L_0x0267:
                te3.d51 r5 = r2.f131755e
                if (r5 == 0) goto L_0x02f9
                java.lang.String r5 = r5.f132122h
                if (r5 == 0) goto L_0x0278
                int r5 = r5.length()
                if (r5 != 0) goto L_0x0276
                goto L_0x0278
            L_0x0276:
                r5 = 0
                goto L_0x0279
            L_0x0278:
                r5 = 1
            L_0x0279:
                if (r5 == 0) goto L_0x027d
                goto L_0x02f9
            L_0x027d:
                androidx.appcompat.app.AppCompatActivity r3 = r1.getActivity()
                boolean r3 = r3 instanceof bg1.C0278a
                if (r3 == 0) goto L_0x029e
                androidx.appcompat.app.AppCompatActivity r2 = r1.getActivity()
                androidx.appcompat.app.AppCompatActivity r3 = r1.getActivity()
                r4 = 2131829661(0x7f11239d, float:1.9292297E38)
                java.lang.String r3 = r3.getString(r4)
                r4 = 0
                android.widget.Toast r2 = nj3.C76912y0.makeText((android.content.Context) r2, (java.lang.CharSequence) r3, (int) r4)
                r2.show()
                goto L_0x0356
            L_0x029e:
                java.lang.String r3 = r1.f43537d
                java.lang.String r5 = "goto live notice"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
                android.content.Intent r3 = new android.content.Intent
                r3.<init>()
                zc1.b r5 = zc1.C66785b.f191882e
                java.lang.String r5 = r5.mo90662O5()
                r3.putExtra(r15, r5)
                r5 = 1
                r3.putExtra(r14, r5)
                di3.d r5 = di3.C86312j.m106911c(r9)
                gy3.C87412m.m108593f(r5, r13)
                r19 = r5
                tf0.p1 r19 = (tf0.C64916p1) r19
                androidx.appcompat.app.AppCompatActivity r20 = r1.getActivity()
                r22 = 0
                r24 = 0
                r25 = 0
                r26 = 0
                r27 = 0
                r28 = 124(0x7c, float:1.74E-43)
                r29 = 0
                r21 = r3
                tf0.C64916p1.C64917a.m76443j(r19, r20, r21, r22, r24, r25, r26, r27, r28, r29)
                di3.d r5 = di3.C86312j.m106911c(r11)
                tf0.o1 r5 = (tf0.C13883o1) r5
                androidx.appcompat.app.AppCompatActivity r6 = r1.getActivity()
                r5.mo13272V1(r6, r3)
                di3.d r3 = di3.C86312j.m106911c(r12)
                ak1.o r3 = (ak1.C54108o) r3
                te3.d51 r2 = r2.f131755e
                if (r2 == 0) goto L_0x02f4
                java.lang.String r2 = r2.f132121g
                if (r2 != 0) goto L_0x02f5
            L_0x02f4:
                r2 = r4
            L_0x02f5:
                r3.mo9608aH(r8, r4, r2)
                goto L_0x0356
            L_0x02f9:
                if (r3 == 0) goto L_0x033c
                com.tencent.mm.protocal.protobuf.FinderContact r3 = r3.f145918e
                if (r3 == 0) goto L_0x033c
                android.content.Intent r15 = new android.content.Intent
                r15.<init>()
                androidx.appcompat.app.AppCompatActivity r5 = r1.getActivity()
                boolean r5 = r5 instanceof bg1.C0278a
                r15.putExtra(r7, r5)
                di3.d r5 = di3.C86312j.m106911c(r11)
                java.lang.String r7 = "getService(IActivityRouter::class.java)"
                gy3.C87412m.m108593f(r5, r7)
                r13 = r5
                tf0.o1 r13 = (tf0.C13883o1) r13
                androidx.appcompat.app.AppCompatActivity r14 = r1.getActivity()
                r17 = 100
                zc1.b r5 = zc1.C66785b.f191882e
                r7 = 0
                r8 = 1
                r9 = 0
                bd1.b r5 = zc1.C66783a.C66784a.m78800c(r5, r7, r8, r9)
                if (r5 == 0) goto L_0x0333
                te3.dr2 r5 = r5.mo75251m2()
                te3.jp1 r5 = r5.f132486C
                r19 = r5
                goto L_0x0335
            L_0x0333:
                r19 = r9
            L_0x0335:
                r18 = 1
                r16 = r3
                r13.mo13289tu(r14, r15, r16, r17, r18, r19)
            L_0x033c:
                di3.d r3 = di3.C86312j.m106911c(r12)
                ak1.o r3 = (ak1.C54108o) r3
                te3.d51 r2 = r2.f131755e
                if (r2 == 0) goto L_0x034a
                java.lang.String r2 = r2.f132121g
                if (r2 != 0) goto L_0x034b
            L_0x034a:
                r2 = r4
            L_0x034b:
                r3.mo9608aH(r6, r4, r2)
                goto L_0x0356
            L_0x034f:
                java.lang.String r2 = r1.f43537d
                java.lang.String r3 = "handleLiveMenuItemSelected resp is null, ignore"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r3)
            L_0x0356:
                qo3.n r1 = r1.f43541h
                if (r1 == 0) goto L_0x035d
                r1.mo107572p()
            L_0x035d:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: zk1.C16268l0.C16269a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C16268l0(C16260i0 i0Var) {
        this.f43555d = i0Var;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C16260i0 i0Var = this.f43555d;
        C0317e.launchUI$default(i0Var, (C66212f) null, (C53934p0) null, new C16269a(i0Var, menuItem, (C15601d<? super C16269a>) null), 3, (Object) null);
    }
}
