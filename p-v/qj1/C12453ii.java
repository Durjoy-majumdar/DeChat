package qj1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53896h0;
import a14.C53934p0;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.lifecycle.C0120a0;
import bi1.C0280a;
import bi1.C0281b;
import bi1.C0287e;
import bi1.C0288f;
import cl1.C0691u1;
import cl1.C0700z;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import di1.C7333c;
import di3.C86312j;
import f14.C58901s;
import fg1.C8022a;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8802s1;
import ig1.C8916d;
import it1.C60625c;
import java.util.LinkedList;
import je1.C46523h2;
import kotlin.ResultKt;
import ml1.C10929b;
import ml1.C10930c;
import nj3.C76912y0;
import nk1.C11207i;
import nl1.C11217a;
import ob0.C47350c;
import ob0.C89132b;
import ok1.C62042e;
import ol1.C11476b;
import ol1.C11486h;
import ol1.C11490j;
import p749xh.C38596k3;
import pe3.C89349b;
import q40.C12040d;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C48648a11;
import te3.C49712hj1;
import te3.C50767p11;
import te3.C51280sp2;
import te3.C51503u71;
import te3.C52194z01;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;
import zc1.C66785b;

/* renamed from: qj1.ii */
public final class C12453ii extends C62660c implements C10930c, C10929b {

    /* renamed from: p */
    public final C58124b f35836p;

    /* renamed from: q */
    public final C13601g f35837q;

    /* renamed from: r */
    public final C13601g f35838r;

    /* renamed from: s */
    public final C13601g f35839s;

    /* renamed from: t */
    public boolean f35840t;

    /* renamed from: qj1.ii$b */
    public static final class C12454b extends C87413o implements C32224a<C11476b> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f35841d;

        /* renamed from: e */
        public final /* synthetic */ C12453ii f35842e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12454b(ViewGroup viewGroup, C12453ii iiVar) {
            super(0);
            this.f35841d = viewGroup;
            this.f35842e = iiVar;
        }

        public Object invoke() {
            Context context = this.f35841d.getContext();
            C87412m.m108593f(context, "root.context");
            C12453ii iiVar = this.f35842e;
            return new C11476b(context, iiVar, iiVar, iiVar);
        }
    }

    /* renamed from: qj1.ii$c */
    public static final class C12455c extends C87413o implements C32224a<C11486h> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f35843d;

        /* renamed from: e */
        public final /* synthetic */ C12453ii f35844e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12455c(ViewGroup viewGroup, C12453ii iiVar) {
            super(0);
            this.f35843d = viewGroup;
            this.f35844e = iiVar;
        }

        public Object invoke() {
            Context context = this.f35843d.getContext();
            C87412m.m108593f(context, "root.context");
            C12453ii iiVar = this.f35844e;
            C11486h hVar = new C11486h(context, iiVar, iiVar, iiVar);
            C8022a aVar = hVar.f28309g;
            aVar.f26707c.setBackgroundDrawable(aVar.f26705a.getResources().getDrawable(C0966R.C0969drawable.abn));
            aVar.f26713i.setTextColor(aVar.f26705a.getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
            aVar.f26714j.setTextColor(aVar.f26705a.getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
            aVar.f26715k.setTextColor(aVar.f26705a.getResources().getColor(C0966R.color.BW_100_Alpha_0_5));
            aVar.f26710f.setBackground(aVar.f26705a.getResources().getDrawable(C0966R.C0969drawable.f357183a14));
            aVar.f26711g.setIconColor(aVar.f26705a.getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
            return hVar;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveWishPanelPlugin$createRewardWishList$1", mo125469f = "FinderLiveWishPanelPlugin.kt", mo125470l = {236, 358, 365}, mo125471m = "invokeSuspend")
    /* renamed from: qj1.ii$d */
    public static final class C12456d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f35845d;

        /* renamed from: e */
        public int f35846e;

        /* renamed from: f */
        public final /* synthetic */ C12453ii f35847f;

        /* renamed from: g */
        public final /* synthetic */ LinkedList<C11217a> f35848g;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveWishPanelPlugin$createRewardWishList$1$invokeSuspend$$inlined$fail$default$1", mo125469f = "FinderLiveWishPanelPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: qj1.ii$d$a */
        public static final class C12457a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C0287e f35849d;

            /* renamed from: e */
            public final /* synthetic */ C12453ii f35850e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C12457a(C0287e eVar, C15601d dVar, C12453ii iiVar) {
                super(2, dVar);
                this.f35849d = eVar;
                this.f35850e = iiVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C12457a(this.f35849d, dVar, this.f35850e);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C12457a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                C12040d dVar = ((C0280a) ((C0281b) this.f35849d).f843b).f841a;
                if (dVar != null) {
                    Context context = this.f35850e.f166287d.getContext();
                    C76912y0.m92768g(context, "操作失败: " + dVar.f35058f);
                    Log.m105924i("FinderLiveWishPanelPlug", "createRewardWishList error: " + dVar.f35058f + " msg: " + dVar.f35059g);
                }
                return C13598b0.f38549a;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveWishPanelPlugin$createRewardWishList$1$invokeSuspend$$inlined$success$default$1", mo125469f = "FinderLiveWishPanelPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: qj1.ii$d$b */
        public static final class C12458b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C0287e f35851d;

            /* renamed from: e */
            public final /* synthetic */ C12453ii f35852e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C12458b(C0287e eVar, C15601d dVar, C12453ii iiVar) {
                super(2, dVar);
                this.f35851d = eVar;
                this.f35852e = iiVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C12458b(this.f35851d, dVar, this.f35852e);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C12458b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                C48648a11 a112 = (C48648a11) ((C0288f) this.f35851d).f855b;
                C76912y0.m92768g(this.f35852e.f166287d.getContext(), "已完成");
                C7333c<C51503u71> cVar = ((C0691u1) this.f35852e.mo87696x0(C0691u1.class)).f1637f;
                C51503u71 u712 = new C51503u71();
                u712.f142641d = true;
                cVar.postValue(u712);
                this.f35852e.mo12125b1().mo9763a();
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12456d(C12453ii iiVar, LinkedList<C11217a> linkedList, C15601d<? super C12456d> dVar) {
            super(2, dVar);
            this.f35847f = iiVar;
            this.f35848g = linkedList;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C12456d(this.f35847f, this.f35848g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C12456d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x010d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Class<cl1.u> r0 = cl1.C55001u.class
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r12.f35846e
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L_0x0031
                if (r2 == r5) goto L_0x002c
                if (r2 == r4) goto L_0x0023
                if (r2 != r3) goto L_0x001b
                java.lang.Object r0 = r12.f35845d
                bi1.e r0 = (bi1.C0287e) r0
                kotlin.ResultKt.throwOnFailure(r13)
                goto L_0x0125
            L_0x001b:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x0023:
                java.lang.Object r0 = r12.f35845d
                bi1.e r0 = (bi1.C0287e) r0
                kotlin.ResultKt.throwOnFailure(r13)
                goto L_0x0107
            L_0x002c:
                kotlin.ResultKt.throwOnFailure(r13)
                goto L_0x00e6
            L_0x0031:
                kotlin.ResultKt.throwOnFailure(r13)
                te3.lx0 r13 = new te3.lx0
                r13.<init>()
                qj1.ii r2 = r12.f35847f
                java.util.LinkedList<nl1.a> r7 = r12.f35848g
                je1.h2 r8 = je1.C46523h2.f125330a
                r9 = 11423(0x2c9f, float:1.6007E-41)
                te3.ig0 r8 = r8.mo71859a(r9)
                r13.f137685d = r8
                zc1.b r8 = zc1.C66785b.f191882e
                java.lang.String r8 = r8.mo90662O5()
                r13.f137686e = r8
                androidx.lifecycle.i0 r8 = r2.mo87696x0(r0)
                cl1.u r8 = (cl1.C55001u) r8
                long r10 = r8.f154416j
                r13.f137688g = r10
                fj1.b$a r8 = fj1.C45795b.f123697j
                fj1.b r8 = fj1.C45795b.f123698n
                if (r8 == 0) goto L_0x0068
                androidx.lifecycle.i0 r8 = r8.mo71262a(r0)
                cl1.u r8 = (cl1.C55001u) r8
                byte[] r8 = r8.f154417n
                goto L_0x0069
            L_0x0068:
                r8 = r6
            L_0x0069:
                pe3.b r8 = pe3.C89349b.m111674a(r8)
                r13.f137687f = r8
                androidx.lifecycle.i0 r0 = r2.mo87696x0(r0)
                cl1.u r0 = (cl1.C55001u) r0
                te3.c21 r0 = r0.f154420q
                long r10 = r0.f182392d
                r13.f137689h = r10
                java.util.ArrayList r0 = new java.util.ArrayList
                r2 = 10
                int r2 = sx3.C36907w.m41090l(r7, r2)
                r0.<init>(r2)
                java.util.Iterator r2 = r7.iterator()
            L_0x008a:
                boolean r7 = r2.hasNext()
                if (r7 == 0) goto L_0x00ab
                java.lang.Object r7 = r2.next()
                nl1.a r7 = (nl1.C11217a) r7
                te3.sp2 r8 = new te3.sp2
                r8.<init>()
                te3.p11 r10 = r7.f33072a
                r8.f141663d = r10
                long r10 = r7.f33073b
                r8.f141664e = r10
                long r10 = r7.f33074c
                r8.f141665f = r10
                r0.add(r8)
                goto L_0x008a
            L_0x00ab:
                java.util.LinkedList r2 = new java.util.LinkedList
                r2.<init>(r0)
                r13.f137690i = r2
                ob0.c$b r0 = new ob0.c$b
                r0.<init>()
                r0.f127069d = r9
                java.lang.String r2 = "/cgi-bin/micromsg-bin/finderlivecreaterewardwishlist"
                r0.f127068c = r2
                r0.f127066a = r13
                te3.a11 r13 = new te3.a11
                r13.<init>()
                r0.f127067b = r13
                ob0.c r13 = r0.mo72403a()
                java.lang.Class<ht1.s1> r0 = ht1.C8802s1.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                ht1.s1 r0 = (ht1.C8802s1) r0
                ob0.b r0 = r0.mo9632ui()
                r0.mo123453j(r13)
                a14.h0 r13 = a14.C53872d1.f151117a
                a14.k2 r13 = f14.C58901s.f168555a
                r12.f35846e = r5
                java.lang.Object r13 = bi1.C0283d.m243a(r0, r13, r12)
                if (r13 != r1) goto L_0x00e6
                return r1
            L_0x00e6:
                r0 = r13
                bi1.e r0 = (bi1.C0287e) r0
                qj1.ii r13 = r12.f35847f
                boolean r2 = r0 instanceof bi1.C0288f
                if (r2 == 0) goto L_0x0107
                wx3.f r2 = r0.f854a
                if (r2 != 0) goto L_0x00f7
                wx3.f r2 = r12.getContext()
            L_0x00f7:
                qj1.ii$d$b r5 = new qj1.ii$d$b
                r5.<init>(r0, r6, r13)
                r12.f35845d = r0
                r12.f35846e = r4
                java.lang.Object r13 = a14.C53895h.m60469g(r2, r5, r12)
                if (r13 != r1) goto L_0x0107
                return r1
            L_0x0107:
                qj1.ii r13 = r12.f35847f
                boolean r2 = r0 instanceof bi1.C0281b
                if (r2 == 0) goto L_0x0125
                wx3.f r2 = r0.f854a
                if (r2 != 0) goto L_0x0115
                wx3.f r2 = r12.getContext()
            L_0x0115:
                qj1.ii$d$a r4 = new qj1.ii$d$a
                r4.<init>(r0, r6, r13)
                r12.f35845d = r0
                r12.f35846e = r3
                java.lang.Object r13 = a14.C53895h.m60469g(r2, r4, r12)
                if (r13 != r1) goto L_0x0125
                return r1
            L_0x0125:
                rx3.b0 r13 = rx3.C13598b0.f38549a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: qj1.C12453ii.C12456d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveWishPanelPlugin$deleteRewardWishList$1", mo125469f = "FinderLiveWishPanelPlugin.kt", mo125470l = {257, 354, 361}, mo125471m = "invokeSuspend")
    /* renamed from: qj1.ii$e */
    public static final class C12459e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f35853d;

        /* renamed from: e */
        public int f35854e;

        /* renamed from: f */
        public final /* synthetic */ C12453ii f35855f;

        /* renamed from: g */
        public final /* synthetic */ boolean f35856g;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveWishPanelPlugin$deleteRewardWishList$1$invokeSuspend$$inlined$fail$default$1", mo125469f = "FinderLiveWishPanelPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: qj1.ii$e$a */
        public static final class C12460a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C0287e f35857d;

            /* renamed from: e */
            public final /* synthetic */ boolean f35858e;

            /* renamed from: f */
            public final /* synthetic */ C12453ii f35859f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C12460a(C0287e eVar, C15601d dVar, boolean z, C12453ii iiVar) {
                super(2, dVar);
                this.f35857d = eVar;
                this.f35858e = z;
                this.f35859f = iiVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C12460a(this.f35857d, dVar, this.f35858e, this.f35859f);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C12460a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                C12040d dVar = ((C0280a) ((C0281b) this.f35857d).f843b).f841a;
                if (dVar != null) {
                    if (this.f35858e) {
                        Context context = this.f35859f.f166287d.getContext();
                        C76912y0.m92768g(context, "操作失败: " + dVar.f35058f);
                    }
                    Log.m105924i("FinderLiveWishPanelPlug", "deleteRewardWishList error: " + dVar.f35058f + " msg: " + dVar.f35059g);
                }
                return C13598b0.f38549a;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveWishPanelPlugin$deleteRewardWishList$1$invokeSuspend$$inlined$success$default$1", mo125469f = "FinderLiveWishPanelPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: qj1.ii$e$b */
        public static final class C12461b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C0287e f35860d;

            /* renamed from: e */
            public final /* synthetic */ boolean f35861e;

            /* renamed from: f */
            public final /* synthetic */ C12453ii f35862f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C12461b(C0287e eVar, C15601d dVar, boolean z, C12453ii iiVar) {
                super(2, dVar);
                this.f35860d = eVar;
                this.f35861e = z;
                this.f35862f = iiVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C12461b(this.f35860d, dVar, this.f35861e, this.f35862f);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C12461b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                C48648a11 a112 = (C48648a11) ((C0288f) this.f35860d).f855b;
                if (this.f35861e) {
                    C76912y0.m92768g(this.f35862f.f166287d.getContext(), "已删除");
                }
                C7333c<C51503u71> cVar = ((C0691u1) this.f35862f.mo87696x0(C0691u1.class)).f1637f;
                C51503u71 u712 = new C51503u71();
                u712.f142641d = false;
                cVar.postValue(u712);
                this.f35862f.mo12125b1().mo11452v();
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12459e(C12453ii iiVar, boolean z, C15601d<? super C12459e> dVar) {
            super(2, dVar);
            this.f35855f = iiVar;
            this.f35856g = z;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C12459e(this.f35855f, this.f35856g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C12459e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x00d8  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Class<cl1.u> r0 = cl1.C55001u.class
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r11.f35854e
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L_0x0031
                if (r2 == r5) goto L_0x002c
                if (r2 == r4) goto L_0x0023
                if (r2 != r3) goto L_0x001b
                java.lang.Object r0 = r11.f35853d
                bi1.e r0 = (bi1.C0287e) r0
                kotlin.ResultKt.throwOnFailure(r12)
                goto L_0x00f0
            L_0x001b:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x0023:
                java.lang.Object r0 = r11.f35853d
                bi1.e r0 = (bi1.C0287e) r0
                kotlin.ResultKt.throwOnFailure(r12)
                goto L_0x00d0
            L_0x002c:
                kotlin.ResultKt.throwOnFailure(r12)
                goto L_0x00ad
            L_0x0031:
                kotlin.ResultKt.throwOnFailure(r12)
                te3.ox0 r12 = new te3.ox0
                r12.<init>()
                qj1.ii r2 = r11.f35855f
                je1.h2 r7 = je1.C46523h2.f125330a
                r8 = 8321(0x2081, float:1.166E-41)
                te3.ig0 r7 = r7.mo71859a(r8)
                r12.f139416d = r7
                zc1.b r7 = zc1.C66785b.f191882e
                java.lang.String r7 = r7.mo90662O5()
                r12.f139417e = r7
                androidx.lifecycle.i0 r7 = r2.mo87696x0(r0)
                cl1.u r7 = (cl1.C55001u) r7
                long r9 = r7.f154416j
                r12.f139419g = r9
                fj1.b$a r7 = fj1.C45795b.f123697j
                fj1.b r7 = fj1.C45795b.f123698n
                if (r7 == 0) goto L_0x0066
                androidx.lifecycle.i0 r7 = r7.mo71262a(r0)
                cl1.u r7 = (cl1.C55001u) r7
                byte[] r7 = r7.f154417n
                goto L_0x0067
            L_0x0066:
                r7 = r6
            L_0x0067:
                pe3.b r7 = pe3.C89349b.m111674a(r7)
                r12.f139418f = r7
                androidx.lifecycle.i0 r0 = r2.mo87696x0(r0)
                cl1.u r0 = (cl1.C55001u) r0
                te3.c21 r0 = r0.f154420q
                long r9 = r0.f182392d
                r12.f139420h = r9
                ob0.c$b r0 = new ob0.c$b
                r0.<init>()
                r0.f127069d = r8
                java.lang.String r2 = "/cgi-bin/micromsg-bin/finderlivedeleterewardwishlist"
                r0.f127068c = r2
                r0.f127066a = r12
                te3.a11 r12 = new te3.a11
                r12.<init>()
                r0.f127067b = r12
                ob0.c r12 = r0.mo72403a()
                java.lang.Class<ht1.s1> r0 = ht1.C8802s1.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                ht1.s1 r0 = (ht1.C8802s1) r0
                ob0.b r0 = r0.mo9632ui()
                r0.mo123453j(r12)
                a14.h0 r12 = a14.C53872d1.f151117a
                a14.k2 r12 = f14.C58901s.f168555a
                r11.f35854e = r5
                java.lang.Object r12 = bi1.C0283d.m243a(r0, r12, r11)
                if (r12 != r1) goto L_0x00ad
                return r1
            L_0x00ad:
                r0 = r12
                bi1.e r0 = (bi1.C0287e) r0
                boolean r12 = r11.f35856g
                qj1.ii r2 = r11.f35855f
                boolean r5 = r0 instanceof bi1.C0288f
                if (r5 == 0) goto L_0x00d0
                wx3.f r5 = r0.f854a
                if (r5 != 0) goto L_0x00c0
                wx3.f r5 = r11.getContext()
            L_0x00c0:
                qj1.ii$e$b r7 = new qj1.ii$e$b
                r7.<init>(r0, r6, r12, r2)
                r11.f35853d = r0
                r11.f35854e = r4
                java.lang.Object r12 = a14.C53895h.m60469g(r5, r7, r11)
                if (r12 != r1) goto L_0x00d0
                return r1
            L_0x00d0:
                boolean r12 = r11.f35856g
                qj1.ii r2 = r11.f35855f
                boolean r4 = r0 instanceof bi1.C0281b
                if (r4 == 0) goto L_0x00f0
                wx3.f r4 = r0.f854a
                if (r4 != 0) goto L_0x00e0
                wx3.f r4 = r11.getContext()
            L_0x00e0:
                qj1.ii$e$a r5 = new qj1.ii$e$a
                r5.<init>(r0, r6, r12, r2)
                r11.f35853d = r0
                r11.f35854e = r3
                java.lang.Object r12 = a14.C53895h.m60469g(r4, r5, r11)
                if (r12 != r1) goto L_0x00f0
                return r1
            L_0x00f0:
                rx3.b0 r12 = rx3.C13598b0.f38549a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: qj1.C12453ii.C12459e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: qj1.ii$f */
    public static final class C12462f extends C87413o implements C32224a<C11490j> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f35863d;

        /* renamed from: e */
        public final /* synthetic */ C12453ii f35864e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12462f(ViewGroup viewGroup, C12453ii iiVar) {
            super(0);
            this.f35863d = viewGroup;
            this.f35864e = iiVar;
        }

        public Object invoke() {
            Context context = this.f35863d.getContext();
            C87412m.m108593f(context, "root.context");
            C12453ii iiVar = this.f35864e;
            return new C11490j(context, iiVar, iiVar, iiVar);
        }
    }

    /* renamed from: qj1.ii$g */
    public static final class C12463g<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C12453ii f35865d;

        public C12463g(C12453ii iiVar) {
            this.f35865d = iiVar;
        }

        public void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C12453ii iiVar = this.f35865d;
            C53896h0 h0Var = C53872d1.f151117a;
            C11207i.m11072h(iiVar, C58901s.f168555a, (C53934p0) null, new C12529mi(iiVar, (C15601d<? super C12529mi>) null), 2, (Object) null);
        }
    }

    /* renamed from: qj1.ii$h */
    public static final class C12464h<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C12453ii f35866d;

        public C12464h(C12453ii iiVar) {
            this.f35866d = iiVar;
        }

        public void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (C62042e.f176370a.mo87027N0()) {
                this.f35866d.mo12125b1().mo3431p();
            }
        }
    }

    /* renamed from: qj1.ii$i */
    public static final class C12465i<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C12453ii f35867d;

        public C12465i(C12453ii iiVar) {
            this.f35867d = iiVar;
        }

        public void onChanged(Object obj) {
            C38596k3 k3Var = (C38596k3) obj;
            if (k3Var != null) {
                C12453ii iiVar = this.f35867d;
                Log.m105924i("FinderLiveWishPanelPlug", "panelGiftSelect: " + k3Var);
                C11490j b1 = iiVar.mo12125b1();
                String str = k3Var.field_rewardProductId;
                C87412m.m108593f(str, "it.field_rewardProductId");
                b1.getClass();
                if (b1.f33769p.containsKey(str)) {
                    C76912y0.m92767f(iiVar.f166287d.getContext(), iiVar.f166287d.getContext().getResources().getString(C0966R.string.fyv));
                } else {
                    iiVar.mo12125b1().mo11445q().postValue(new C11217a(((C8916d) k3Var).mo9725p2(), 10, 0));
                }
            }
        }
    }

    /* renamed from: qj1.ii$j */
    public static final class C12466j<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C12453ii f35868d;

        public C12466j(C12453ii iiVar) {
            this.f35868d = iiVar;
        }

        public void onChanged(Object obj) {
            C0691u1.C0693b bVar = (C0691u1.C0693b) obj;
            Log.m105924i("FinderLiveWishPanelPlug", "wishService onChange: " + bVar);
            if (bVar instanceof C0691u1.C0692a) {
                this.f35868d.mo11124X(false);
            }
        }
    }

    /* renamed from: qj1.ii$a */
    public /* synthetic */ class C12467a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35869a;

        static {
            int[] iArr = new int[C58124b.C58125b.values().length];
            C58124b.C58125b bVar = C58124b.C58125b.UNKNOWN;
            iArr[7] = 1;
            f35869a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12453ii(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f35836p = bVar;
        this.f35837q = C36568h.m40985a(new C12462f(viewGroup, this));
        this.f35838r = C36568h.m40985a(new C12454b(viewGroup, this));
        this.f35839s = C36568h.m40985a(new C12455c(viewGroup, this));
        if (!C62042e.f176370a.mo87073d1(mo87684A0())) {
            FinderLiveService.f159376d.getClass();
            if (!(FinderLiveService.f159379g instanceof FinderLiveVisitorPluginLayout)) {
                mo12126c1();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: Z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m12015Z0(qj1.C12453ii r12, wx3.C15601d r13) {
        /*
            r12.getClass()
            boolean r0 = r13 instanceof qj1.C12489ki
            if (r0 == 0) goto L_0x0016
            r0 = r13
            qj1.ki r0 = (qj1.C12489ki) r0
            int r1 = r0.f35921g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f35921g = r1
            goto L_0x001b
        L_0x0016:
            qj1.ki r0 = new qj1.ki
            r0.<init>(r12, r13)
        L_0x001b:
            java.lang.Object r13 = r0.f35919e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f35921g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r12 = r0.f35918d
            bi1.e r12 = (bi1.C0287e) r12
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x008b
        L_0x0031:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0039:
            java.lang.Object r12 = r0.f35918d
            qj1.ii r12 = (qj1.C12453ii) r12
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x006c
        L_0x0041:
            kotlin.ResultKt.throwOnFailure(r13)
            it1.c r13 = r12.mo12124a1()
            android.view.ViewGroup r2 = r12.f166287d
            android.content.Context r6 = r2.getContext()
            java.lang.String r2 = "root.context"
            gy3.C87412m.m108593f(r6, r2)
            r7 = 0
            r8 = 0
            r10 = 6
            r11 = 0
            r5 = r13
            it1.C60625c.m70894l(r5, r6, r7, r8, r10, r11)
            a14.h0 r2 = a14.C53872d1.f151117a
            a14.k2 r2 = f14.C58901s.f168555a
            r0.f35918d = r12
            r0.f35921g = r4
            java.lang.Object r13 = bi1.C0283d.m243a(r13, r2, r0)
            if (r13 != r1) goto L_0x006c
            goto L_0x008d
        L_0x006c:
            bi1.e r13 = (bi1.C0287e) r13
            boolean r2 = r13 instanceof bi1.C0288f
            if (r2 == 0) goto L_0x008b
            wx3.f r2 = r13.f854a
            if (r2 != 0) goto L_0x007a
            wx3.f r2 = r0.getContext()
        L_0x007a:
            qj1.ji r4 = new qj1.ji
            r5 = 0
            r4.<init>(r13, r5, r12)
            r0.f35918d = r13
            r0.f35921g = r3
            java.lang.Object r12 = a14.C53895h.m60469g(r2, r4, r0)
            if (r12 != r1) goto L_0x008b
            goto L_0x008d
        L_0x008b:
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x008d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C12453ii.m12015Z0(qj1.ii, wx3.d):java.lang.Object");
    }

    /* renamed from: D */
    public boolean mo11126D() {
        C51503u71 value = ((C0691u1) mo87696x0(C0691u1.class)).f1637f.getValue();
        return value != null && value.f142641d;
    }

    /* renamed from: K */
    public void mo11127K() {
        mo12125b1().mo11452v();
        ((C0700z) mo87696x0(C0700z.class)).mo665c3().postValue(Boolean.TRUE);
    }

    /* renamed from: N0 */
    public void mo12123N0(float f) {
    }

    /* renamed from: W */
    public void mo11128W() {
        mo12125b1().mo11452v();
        C11490j b1 = mo12125b1();
        C48648a11 a112 = (C48648a11) ((C11476b) ((C36570n) this.f35838r).getValue()).mo11445q().getValue();
        LinkedList<C51280sp2> linkedList = a112 != null ? a112.f130203d : null;
        if (linkedList != null) {
            b1.getClass();
            for (C51280sp2 sp22 : linkedList) {
                C50767p11 p112 = sp22.f141663d;
                if (p112 != null) {
                    b1.mo11449s(new C11217a(p112, sp22.f141664e, sp22.f141665f));
                    b1.mo11453w();
                }
            }
        }
        b1.mo11450t();
        mo12125b1().mo3431p();
    }

    /* renamed from: X */
    public void mo11124X(boolean z) {
        C11207i.m11072h(this, C53872d1.f151119c, (C53934p0) null, new C12459e(this, z, (C15601d<? super C12459e>) null), 2, (Object) null);
    }

    /* renamed from: a */
    public void mo11129a(String str, String str2) {
        C87412m.m108594g(str, "giftId");
        C87412m.m108594g(str2, "wishId");
        boolean I3 = ((C54991o) mo87696x0(C54991o.class)).mo75963I3();
        C51503u71 value = ((C0691u1) mo87696x0(C0691u1.class)).f1637f.getValue();
        boolean z = value != null ? value.f142641d : false;
        Log.m105924i("FinderLiveWishPanelPlug", "sendGift enableGiftSwitch: " + I3 + " isEnableWish: " + z);
        if (!I3) {
            C76912y0.m92767f(this.f166287d.getContext(), this.f166287d.getContext().getResources().getString(C0966R.string.fp8));
        } else if (!z) {
            C76912y0.m92767f(this.f166287d.getContext(), this.f166287d.getContext().getResources().getString(C0966R.string.fp9));
        } else {
            C58124b.C7172a.m7372a(this.f35836p, C58124b.C58125b.LIVE_EVENT_INIT_GIFT_PANEL, (Bundle) null, 2, (Object) null);
            ((C0700z) mo87696x0(C0700z.class)).f1663o.postValue(new C0700z.C0701a(str, str2));
        }
    }

    /* renamed from: a1 */
    public final C60625c<C48648a11> mo12124a1() {
        Class cls = C54991o.class;
        Class cls2 = C55001u.class;
        C52194z01 z012 = new C52194z01();
        z012.f145611d = C46523h2.f125330a.mo71859a(10069);
        z012.f145612e = C66785b.f191882e.mo90662O5();
        z012.f145614g = ((C55001u) mo87696x0(cls2)).f154416j;
        C45795b.C32059a aVar = C45795b.f123697j;
        C45795b bVar = C45795b.f123698n;
        z012.f145613f = C89349b.m111674a(bVar != null ? ((C55001u) bVar.mo71262a(cls2)).f154417n : null);
        z012.f145615h = ((C55001u) mo87696x0(cls2)).f154420q.f182392d;
        z012.f145616i = ((C54991o) mo87696x0(cls)).f154190D ? 3 : ((C54991o) mo87696x0(cls)).mo75991Z3() ? 1 : 2;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 10069;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/finderlivegetrewardwishlist";
        bVar2.f127066a = z012;
        bVar2.f127067b = new C48648a11();
        C47350c a = bVar2.mo72403a();
        C89132b ui = ((C8802s1) C86312j.m106911c(C8802s1.class)).mo9632ui();
        ui.mo123453j(a);
        return (C60625c) ui;
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: b1 */
    public final C11490j mo12125b1() {
        return (C11490j) ((C36570n) this.f35837q).getValue();
    }

    /* renamed from: c1 */
    public final void mo12126c1() {
        Class cls = C0700z.class;
        Class cls2 = C0691u1.class;
        if (!this.f35840t) {
            this.f35840t = true;
            ((C0691u1) mo87696x0(cls2)).mo658c3().observe(this, new C12463g(this));
            C0700z zVar = (C0700z) mo87696x0(cls);
            (((C54991o) zVar.f107146d.mo71262a(C54991o.class)).f154305d3 ? zVar.f1659h : zVar.f1660i).observe(this, new C12464h(this));
            ((C0700z) mo87696x0(cls)).f1661j.observe(this, new C12465i(this));
            ((C0691u1) mo87696x0(cls2)).f1640i.observe(this, new C12466j(this));
        }
    }

    /* renamed from: g */
    public void mo10792g(int i) {
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* renamed from: n */
    public void mo11125n(LinkedList<C11217a> linkedList) {
        C87412m.m108594g(linkedList, "wishList");
        Log.m105924i("FinderLiveWishPanelPlug", "createRewardWishList: " + mo11126D());
        C51503u71 value = ((C0691u1) mo87696x0(C0691u1.class)).f1637f.getValue();
        boolean z = true;
        if (value != null && value.f142643f < value.f142642e) {
            z = false;
        }
        if (!z) {
            C11207i.m11072h(this, C53872d1.f151119c, (C53934p0) null, new C12561ni(this, linkedList, (C15601d<? super C12561ni>) null), 2, (Object) null);
            return;
        }
        C11207i.m11072h(this, C53872d1.f151119c, (C53934p0) null, new C12456d(this, linkedList, (C15601d<? super C12456d>) null), 2, (Object) null);
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        if (C12467a.f35869a[bVar.ordinal()] == 1) {
            mo12126c1();
        }
    }

    /* renamed from: v */
    public void mo11130v() {
        mo12125b1().mo9763a();
        ((C0700z) mo87696x0(C0700z.class)).mo665c3().postValue(Boolean.TRUE);
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        this.f35840t = false;
    }
}
