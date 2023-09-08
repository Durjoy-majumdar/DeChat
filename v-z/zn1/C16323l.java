package zn1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53884f2;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53959v2;
import a14.C53973z1;
import android.content.Context;
import android.view.View;
import cm1.C0720c3;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.playlist.FinderPlayListDrawer;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.ResultKt;
import o40.C61926c;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C50124kf1;
import te3.C51108rh0;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: zn1.l */
public final class C16323l {

    /* renamed from: a */
    public final Context f43642a;

    /* renamed from: b */
    public final C16341v f43643b = new C16341v();

    /* renamed from: c */
    public FinderItem f43644c;

    /* renamed from: d */
    public FinderPlayListDrawer f43645d;

    /* renamed from: e */
    public C16322k f43646e;

    /* renamed from: f */
    public WxRecyclerAdapter<?> f43647f;

    /* renamed from: g */
    public final C0000n0 f43648g = C53930o0.m60554a(((C53884f2) C53959v2.m60598a((C53973z1) null, 1, (Object) null)).plus(C53872d1.f151119c));

    /* renamed from: h */
    public volatile C89349b f43649h;

    /* renamed from: i */
    public volatile boolean f43650i = true;

    /* renamed from: j */
    public boolean f43651j;

    /* renamed from: k */
    public boolean f43652k = true;

    /* renamed from: l */
    public int f43653l = -1;

    /* renamed from: m */
    public final C16324a f43654m = new C16324a(this);

    /* renamed from: zn1.l$a */
    public static final class C16324a extends RefreshLoadMoreLayout.C57879a {

        /* renamed from: a */
        public final /* synthetic */ C16323l f43655a;

        public C16324a(C16323l lVar) {
            this.f43655a = lVar;
        }

        /* renamed from: b */
        public void mo2561b(int i) {
            C16323l.m15172b(this.f43655a, true);
        }

        /* renamed from: c */
        public void mo2562c(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            this.f43655a.mo14811c();
        }

        /* renamed from: d */
        public void mo3680d(int i) {
            C16323l.m15172b(this.f43655a, false);
        }

        /* renamed from: e */
        public void mo3681e(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            this.f43655a.mo14811c();
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawerPresenter$requestFirstData$1", mo125469f = "FinderPlayListDrawerPresenter.kt", mo125470l = {210, 229, 244}, mo125471m = "invokeSuspend")
    /* renamed from: zn1.l$b */
    public static final class C16325b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f43656d;

        /* renamed from: e */
        public int f43657e;

        /* renamed from: f */
        public final /* synthetic */ C16323l f43658f;

        /* renamed from: g */
        public final /* synthetic */ C0720c3 f43659g;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawerPresenter$requestFirstData$1$1$1", mo125469f = "FinderPlayListDrawerPresenter.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: zn1.l$b$a */
        public static final class C16326a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C16323l f43660d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C16326a(C16323l lVar, C15601d<? super C16326a> dVar) {
                super(2, dVar);
                this.f43660d = lVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C16326a(this.f43660d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C16326a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                C16322k kVar = this.f43660d.f43646e;
                if (kVar != null) {
                    kVar.mo14809k();
                    if (this.f43660d.f43643b.f43693a.isEmpty()) {
                        C16322k kVar2 = this.f43660d.f43646e;
                        if (kVar2 != null) {
                            kVar2.mo14804c().setVisibility(0);
                            View view = kVar2.f43637o;
                            if (view != null) {
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(8);
                                View view2 = view;
                                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                View d = kVar2.mo14805d();
                                C9556a aVar2 = new C9556a();
                                aVar2.mo10233c(0);
                                View view3 = d;
                                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                d.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                View i = kVar2.mo14807i();
                                C9556a aVar3 = new C9556a();
                                aVar3.mo10233c(8);
                                View view4 = i;
                                C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                i.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            } else {
                                C87412m.m108603p("loadingView");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("viewCallBack");
                            throw null;
                        }
                    } else {
                        C16322k kVar3 = this.f43660d.f43646e;
                        if (kVar3 != null) {
                            View d2 = kVar3.mo14805d();
                            C9556a aVar4 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar4.mo10233c(8);
                            C117292a.m165358d(d2, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "hideAllTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            d2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                            C117292a.m165359e(d2, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "hideAllTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            View i2 = kVar3.mo14807i();
                            C9556a aVar5 = new C9556a();
                            aVar5.mo10233c(8);
                            View view5 = i2;
                            C117292a.m165358d(view5, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "hideAllTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            i2.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                            C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "hideAllTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            kVar3.mo14804c().setVisibility(8);
                            WxRecyclerAdapter<?> wxRecyclerAdapter = this.f43660d.f43647f;
                            if (wxRecyclerAdapter != null) {
                                wxRecyclerAdapter.notifyDataSetChanged();
                                C16322k kVar4 = this.f43660d.f43646e;
                                if (kVar4 != null) {
                                    C61926c.m72666K(200, new C16316e(kVar4));
                                    this.f43660d.mo14811c();
                                } else {
                                    C87412m.m108603p("viewCallBack");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("adapter");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("viewCallBack");
                            throw null;
                        }
                    }
                    return C13598b0.f38549a;
                }
                C87412m.m108603p("viewCallBack");
                throw null;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawerPresenter$requestFirstData$1$2$1", mo125469f = "FinderPlayListDrawerPresenter.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: zn1.l$b$b */
        public static final class C16327b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C16323l f43661d;

            /* renamed from: zn1.l$b$b$a */
            public static final class C16328a extends C87413o implements C32224a<C13598b0> {

                /* renamed from: d */
                public final /* synthetic */ C16323l f43662d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C16328a(C16323l lVar) {
                    super(0);
                    this.f43662d = lVar;
                }

                public Object invoke() {
                    C16322k kVar = this.f43662d.f43646e;
                    if (kVar != null) {
                        kVar.mo14810l();
                        this.f43662d.mo14815g();
                        return C13598b0.f38549a;
                    }
                    C87412m.m108603p("viewCallBack");
                    throw null;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C16327b(C16323l lVar, C15601d<? super C16327b> dVar) {
                super(2, dVar);
                this.f43661d = lVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C16327b(this.f43661d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C16327b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                C16322k kVar = this.f43661d.f43646e;
                if (kVar != null) {
                    kVar.mo14809k();
                    C16323l lVar = this.f43661d;
                    C16322k kVar2 = lVar.f43646e;
                    if (kVar2 != null) {
                        C16328a aVar = new C16328a(lVar);
                        kVar2.mo14804c().setVisibility(0);
                        View view = kVar2.f43637o;
                        if (view != null) {
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar2.mo10233c(8);
                            View view2 = view;
                            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            View d = kVar2.mo14805d();
                            C9556a aVar3 = new C9556a();
                            aVar3.mo10233c(8);
                            View view3 = d;
                            C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            d.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            View i = kVar2.mo14807i();
                            C9556a aVar4 = new C9556a();
                            aVar4.mo10233c(0);
                            View view4 = i;
                            C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            i.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            kVar2.mo14807i().setOnClickListener(new C16321j(aVar));
                            return C13598b0.f38549a;
                        }
                        C87412m.m108603p("loadingView");
                        throw null;
                    }
                    C87412m.m108603p("viewCallBack");
                    throw null;
                }
                C87412m.m108603p("viewCallBack");
                throw null;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16325b(C16323l lVar, C0720c3 c3Var, C15601d<? super C16325b> dVar) {
            super(2, dVar);
            this.f43658f = lVar;
            this.f43659g = c3Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C16325b(this.f43658f, this.f43659g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C16325b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:34:0x0117  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f43657e
                r3 = 0
                r4 = 3
                r5 = 2
                java.lang.String r6 = "Finder.FinderPlayListDrawerPresenter"
                r7 = 1
                if (r2 == 0) goto L_0x0034
                if (r2 == r7) goto L_0x0028
                if (r2 == r5) goto L_0x0021
                if (r2 != r4) goto L_0x0019
                kotlin.ResultKt.throwOnFailure(r18)
                goto L_0x015b
            L_0x0019:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0021:
                java.lang.Object r2 = r0.f43656d
                kotlin.ResultKt.throwOnFailure(r18)
                goto L_0x010f
            L_0x0028:
                kotlin.ResultKt.throwOnFailure(r18)
                r2 = r18
                kotlin.Result r2 = (kotlin.Result) r2
                java.lang.Object r2 = r2.m168123unboximpl()
                goto L_0x0049
            L_0x0034:
                kotlin.ResultKt.throwOnFailure(r18)
                java.lang.String r2 = "request CgiFinderGetTopicFeed"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
                zn1.l r2 = r0.f43658f
                cm1.c3 r8 = r0.f43659g
                r0.f43657e = r7
                java.lang.Object r2 = zn1.C16323l.m15171a(r2, r8, r0)
                if (r2 != r1) goto L_0x0049
                return r1
            L_0x0049:
                zn1.l r8 = r0.f43658f
                boolean r9 = kotlin.Result.m168121isSuccessimpl(r2)
                if (r9 == 0) goto L_0x010f
                r9 = r2
                te3.xp0 r9 = (te3.C52002xp0) r9
                pe3.b r10 = r9.f144786e
                r8.f43649h = r10
                int r10 = r9.f144795q
                r11 = 0
                if (r10 != r7) goto L_0x005f
                r10 = 1
                goto L_0x0060
            L_0x005f:
                r10 = 0
            L_0x0060:
                r8.mo14816h(r10)
                int r10 = r9.f144794p
                if (r10 != r7) goto L_0x0068
                r11 = 1
            L_0x0068:
                r8.mo14817i(r11)
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "request CgiFinderGetTopicFeed success, data: "
                r10.append(r11)
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r11 = r9.f144785d
                int r11 = r11.size()
                r10.append(r11)
                java.lang.String r11 = "lastBuffer: "
                r10.append(r11)
                pe3.b r11 = r8.f43649h
                r10.append(r11)
                java.lang.String r11 = ", downContinue: "
                r10.append(r11)
                boolean r11 = r8.f43652k
                r10.append(r11)
                java.lang.String r11 = ", upContinue: "
                r10.append(r11)
                boolean r11 = r8.f43651j
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r10)
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r9 = r9.f144785d
                java.lang.String r10 = "resp.`object`"
                gy3.C87412m.m108593f(r9, r10)
                java.util.ArrayList r10 = new java.util.ArrayList
                r11 = 10
                int r11 = sx3.C36907w.m41090l(r9, r11)
                r10.<init>(r11)
                java.util.Iterator r9 = r9.iterator()
            L_0x00b9:
                boolean r11 = r9.hasNext()
                if (r11 == 0) goto L_0x00f4
                java.lang.Object r11 = r9.next()
                com.tencent.mm.protocal.protobuf.FinderObject r11 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r11
                com.tencent.mm.plugin.finder.storage.FinderItem$a r12 = com.tencent.p014mm.plugin.finder.storage.FinderItem.Companion
                java.lang.String r13 = "feed"
                gy3.C87412m.m108593f(r11, r13)
                r13 = 64
                com.tencent.mm.plugin.finder.storage.FinderItem r11 = r12.mo79056a(r11, r13)
                zn1.u r12 = new zn1.u
                r12.<init>(r11)
                com.tencent.mm.plugin.finder.storage.FinderItem r11 = r8.mo14813e()
                r11.getId()
                long r13 = r12.getItemId()
                com.tencent.mm.plugin.finder.storage.FinderItem r11 = r8.mo14813e()
                long r15 = r11.getId()
                int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r11 != 0) goto L_0x00f0
                r12.f43691d = r7
            L_0x00f0:
                r10.add(r12)
                goto L_0x00b9
            L_0x00f4:
                zn1.v r7 = r8.f43643b
                java.util.ArrayList<zn1.u> r7 = r7.f43693a
                r7.addAll(r10)
                a14.h0 r7 = a14.C53872d1.f151117a
                a14.k2 r7 = f14.C58901s.f168555a
                zn1.l$b$a r9 = new zn1.l$b$a
                r9.<init>(r8, r3)
                r0.f43656d = r2
                r0.f43657e = r5
                java.lang.Object r5 = a14.C53895h.m60469g(r7, r9, r0)
                if (r5 != r1) goto L_0x010f
                return r1
            L_0x010f:
                zn1.l r5 = r0.f43658f
                java.lang.Throwable r7 = kotlin.Result.m168117exceptionOrNullimpl(r2)
                if (r7 == 0) goto L_0x015b
                boolean r8 = r7 instanceof q40.C12040d
                if (r8 == 0) goto L_0x0147
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "request CgiFinderGetTopicFeed fail, errType="
                r8.append(r9)
                q40.d r7 = (q40.C12040d) r7
                int r9 = r7.f35057e
                r8.append(r9)
                java.lang.String r9 = " errCode="
                r8.append(r9)
                int r9 = r7.f35058f
                r8.append(r9)
                java.lang.String r9 = " fail:"
                r8.append(r9)
                java.lang.String r7 = r7.f35059g
                r8.append(r7)
                java.lang.String r7 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r7)
            L_0x0147:
                a14.h0 r6 = a14.C53872d1.f151117a
                a14.k2 r6 = f14.C58901s.f168555a
                zn1.l$b$b r7 = new zn1.l$b$b
                r7.<init>(r5, r3)
                r0.f43656d = r2
                r0.f43657e = r4
                java.lang.Object r2 = a14.C53895h.m60469g(r6, r7, r0)
                if (r2 != r1) goto L_0x015b
                return r1
            L_0x015b:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: zn1.C16323l.C16325b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C16323l(Context context) {
        C87412m.m108594g(context, "context");
        this.f43642a = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m15171a(zn1.C16323l r8, cm1.C0720c3 r9, wx3.C15601d r10) {
        /*
            r8.getClass()
            boolean r0 = r10 instanceof zn1.C16329m
            if (r0 == 0) goto L_0x0016
            r0 = r10
            zn1.m r0 = (zn1.C16329m) r0
            int r1 = r0.f43665f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f43665f = r1
            goto L_0x001b
        L_0x0016:
            zn1.m r0 = new zn1.m
            r0.<init>(r8, r10)
        L_0x001b:
            r5 = r0
            java.lang.Object r10 = r5.f43663d
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r5.f43665f
            r2 = 1
            if (r1 == 0) goto L_0x0033
            if (r1 != r2) goto L_0x002b
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ all -> 0x0063 }
            goto L_0x005c
        L_0x002b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlin.Result$Companion r10 = kotlin.Result.Companion     // Catch:{ all -> 0x0063 }
            je1.q0 r1 = new je1.q0     // Catch:{ all -> 0x0063 }
            rs1.s8$a r10 = rs1.C13442s8.f38060Q0     // Catch:{ all -> 0x0063 }
            android.content.Context r8 = r8.f43642a     // Catch:{ all -> 0x0063 }
            rs1.s8 r8 = r10.mo12873f(r8)     // Catch:{ all -> 0x0063 }
            if (r8 == 0) goto L_0x0049
            te3.hj1 r8 = r8.mo12861q3()     // Catch:{ all -> 0x0063 }
            goto L_0x004a
        L_0x0049:
            r8 = 0
        L_0x004a:
            r1.<init>(r9, r8)     // Catch:{ all -> 0x0063 }
            r8 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            r5.f43665f = r2     // Catch:{ all -> 0x0063 }
            r2 = r8
            java.lang.Object r10 = q40.C89456b.m111831a(r1, r2, r4, r5, r6, r7)     // Catch:{ all -> 0x0063 }
            if (r10 != r0) goto L_0x005c
            goto L_0x006f
        L_0x005c:
            te3.xp0 r10 = (te3.C52002xp0) r10     // Catch:{ all -> 0x0063 }
            java.lang.Object r8 = kotlin.Result.m168114constructorimpl(r10)     // Catch:{ all -> 0x0063 }
            goto L_0x006e
        L_0x0063:
            r8 = move-exception
            kotlin.Result$Companion r9 = kotlin.Result.Companion
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
            java.lang.Object r8 = kotlin.Result.m168114constructorimpl(r8)
        L_0x006e:
            r0 = r8
        L_0x006f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zn1.C16323l.m15171a(zn1.l, cm1.c3, wx3.d):java.lang.Object");
    }

    /* renamed from: b */
    public static final void m15172b(C16323l lVar, boolean z) {
        C51108rh0 rh02;
        lVar.getClass();
        C0720c3 c3Var = new C0720c3((C89349b) null, 0, 0, 0, 0, 31, (C8480h) null);
        c3Var.f1727a = lVar.f43649h;
        c3Var.f1728b = 16;
        c3Var.f1729c = lVar.mo14813e().getId();
        C50124kf1 kf12 = lVar.mo14813e().getFeedObject().object_extend;
        if (!(kf12 == null || (rh02 = kf12.f136745d) == null)) {
            c3Var.f1730d = rh02.f140917d;
        }
        c3Var.f1731e = z ? 1 : 0;
        C53895h.m60466d(lVar.f43648g, (C66212f) null, (C53934p0) null, new C16331o(z, lVar, c3Var, (C15601d<? super C16331o>) null), 3, (Object) null);
    }

    /* renamed from: c */
    public final void mo14811c() {
        if (!this.f43652k) {
            C16322k kVar = this.f43646e;
            if (kVar != null) {
                RefreshLoadMoreLayout.m66896C(kVar.mo14808j(), (RefreshLoadMoreLayout.C7080c) null, 1, (Object) null);
                C16322k kVar2 = this.f43646e;
                if (kVar2 != null) {
                    View loadMoreFooter = kVar2.mo14808j().getLoadMoreFooter();
                    View findViewById = loadMoreFooter != null ? loadMoreFooter.findViewById(C0966R.C0970id.mtc) : null;
                    if (findViewById != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(8);
                        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerPresenter", "checkLoadMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerPresenter", "checkLoadMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                } else {
                    C87412m.m108603p("viewCallBack");
                    throw null;
                }
            } else {
                C87412m.m108603p("viewCallBack");
                throw null;
            }
        }
        if (this.f43651j) {
            C16322k kVar3 = this.f43646e;
            if (kVar3 != null) {
                kVar3.mo14802a(true);
            } else {
                C87412m.m108603p("viewCallBack");
                throw null;
            }
        } else {
            C16322k kVar4 = this.f43646e;
            if (kVar4 != null) {
                kVar4.mo14802a(false);
            } else {
                C87412m.m108603p("viewCallBack");
                throw null;
            }
        }
    }

    /* renamed from: d */
    public final void mo14812d(boolean z, int i) {
        RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(0);
        cVar.f24951f = z ? this.f43652k : this.f43651j;
        cVar.f24953h = i;
        if (i > 0) {
            cVar.f24952g = false;
        }
        if (z) {
            C16322k kVar = this.f43646e;
            if (kVar != null) {
                kVar.mo14808j().onPreFinishLoadMoreSmooth(cVar);
            } else {
                C87412m.m108603p("viewCallBack");
                throw null;
            }
        } else {
            C16322k kVar2 = this.f43646e;
            if (kVar2 != null) {
                kVar2.mo14808j().mo82443I(cVar);
            } else {
                C87412m.m108603p("viewCallBack");
                throw null;
            }
        }
    }

    /* renamed from: e */
    public final FinderItem mo14813e() {
        FinderItem finderItem = this.f43644c;
        if (finderItem != null) {
            return finderItem;
        }
        C87412m.m108603p("feedObj");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        r4 = (r4 = (r4 = r4.getFeedObject()).object_extend).f136745d;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14814f() {
        /*
            r14 = this;
            boolean r0 = r14.f43650i
            if (r0 == 0) goto L_0x000c
            java.lang.String r0 = "Finder.FinderPlayListDrawerPresenter"
            java.lang.String r1 = "onDetach: can not detach, because it is not attached"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            return
        L_0x000c:
            zn1.v r0 = r14.f43643b
            pe3.b r1 = r14.f43649h
            boolean r2 = r14.f43651j
            boolean r3 = r14.f43652k
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r0.f43695c
            r5 = 0
            if (r4 == 0) goto L_0x002b
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.getFeedObject()
            if (r4 == 0) goto L_0x002b
            te3.kf1 r4 = r4.object_extend
            if (r4 == 0) goto L_0x002b
            te3.rh0 r4 = r4.f136745d
            if (r4 == 0) goto L_0x002b
            long r7 = r4.f140917d
            goto L_0x002c
        L_0x002b:
            r7 = r5
        L_0x002c:
            java.lang.String r4 = "Finder.FinderPlayListLoader"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "onDetach id: "
            r9.append(r10)
            r9.append(r7)
            java.lang.String r10 = ", size:"
            r9.append(r10)
            java.util.ArrayList<zn1.u> r10 = r0.f43693a
            int r10 = r10.size()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r9)
            java.util.ArrayList<zn1.u> r4 = r0.f43693a
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x00ae
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x00ae
            zn1.a r4 = zn1.C16309a.f43609a
            java.util.ArrayList<zn1.u> r9 = r0.f43693a
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = 10
            int r11 = sx3.C36907w.m41090l(r9, r11)
            r10.<init>(r11)
            java.util.Iterator r9 = r9.iterator()
        L_0x006f:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x007f
            java.lang.Object r11 = r9.next()
            zn1.u r11 = (zn1.C16340u) r11
            r10.add(r11)
            goto L_0x006f
        L_0x007f:
            monitor-enter(r4)
            zn1.a r9 = zn1.C16309a.f43609a     // Catch:{ all -> 0x00ab }
            monitor-enter(r9)     // Catch:{ all -> 0x00ab }
            java.util.Map<zn1.a$a, java.util.List<zn1.u>> r11 = zn1.C16309a.f43610b     // Catch:{ all -> 0x00a8 }
            zn1.a$a r12 = new zn1.a$a     // Catch:{ all -> 0x00a8 }
            r12.<init>(r7)     // Catch:{ all -> 0x00a8 }
            r11.remove(r12)     // Catch:{ all -> 0x00a8 }
            java.util.Map<zn1.a$a, zn1.a$b> r12 = zn1.C16309a.f43611c     // Catch:{ all -> 0x00a8 }
            zn1.a$a r13 = new zn1.a$a     // Catch:{ all -> 0x00a8 }
            r13.<init>(r7)     // Catch:{ all -> 0x00a8 }
            java.lang.Object r12 = r12.remove(r13)     // Catch:{ all -> 0x00a8 }
            zn1.a$b r12 = (zn1.C16309a.C16311b) r12     // Catch:{ all -> 0x00a8 }
            monitor-exit(r9)     // Catch:{ all -> 0x00ab }
            zn1.a$a r9 = new zn1.a$a     // Catch:{ all -> 0x00ab }
            r9.<init>(r7)     // Catch:{ all -> 0x00ab }
            java.lang.Object r9 = r11.put(r9, r10)     // Catch:{ all -> 0x00ab }
            java.util.List r9 = (java.util.List) r9     // Catch:{ all -> 0x00ab }
            monitor-exit(r4)
            goto L_0x00ae
        L_0x00a8:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00ab }
            throw r0     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x00ae:
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x00cc
            zn1.a r4 = zn1.C16309a.f43609a
            monitor-enter(r4)
            java.util.Map<zn1.a$a, zn1.a$b> r5 = zn1.C16309a.f43611c     // Catch:{ all -> 0x00c9 }
            zn1.a$a r6 = new zn1.a$a     // Catch:{ all -> 0x00c9 }
            r6.<init>(r7)     // Catch:{ all -> 0x00c9 }
            zn1.a$b r7 = new zn1.a$b     // Catch:{ all -> 0x00c9 }
            r7.<init>(r1, r2, r3)     // Catch:{ all -> 0x00c9 }
            java.lang.Object r1 = r5.put(r6, r7)     // Catch:{ all -> 0x00c9 }
            zn1.a$b r1 = (zn1.C16309a.C16311b) r1     // Catch:{ all -> 0x00c9 }
            monitor-exit(r4)
            goto L_0x00cc
        L_0x00c9:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x00cc:
            java.util.ArrayList<zn1.u> r0 = r0.f43693a
            r0.clear()
            r0 = 0
            r14.f43649h = r0
            r0 = 1
            r14.f43650i = r0
            r1 = 0
            r14.mo14817i(r1)
            r14.mo14816h(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zn1.C16323l.mo14814f():void");
    }

    /* renamed from: g */
    public final void mo14815g() {
        C51108rh0 rh02;
        C16322k kVar = this.f43646e;
        if (kVar != null) {
            kVar.mo14810l();
            C0720c3 c3Var = new C0720c3((C89349b) null, 0, 0, 0, 0, 31, (C8480h) null);
            c3Var.f1728b = 16;
            c3Var.f1729c = mo14813e().getId();
            C50124kf1 kf12 = mo14813e().getFeedObject().object_extend;
            if (!(kf12 == null || (rh02 = kf12.f136745d) == null)) {
                c3Var.f1730d = rh02.f140917d;
            }
            C53895h.m60466d(this.f43648g, (C66212f) null, (C53934p0) null, new C16325b(this, c3Var, (C15601d<? super C16325b>) null), 3, (Object) null);
            return;
        }
        C87412m.m108603p("viewCallBack");
        throw null;
    }

    /* renamed from: h */
    public final void mo14816h(boolean z) {
        this.f43652k = z;
        Log.m105924i("Finder.FinderPlayListDrawerPresenter", "set downContinue " + z);
    }

    /* renamed from: i */
    public final void mo14817i(boolean z) {
        this.f43651j = z;
        Log.m105924i("Finder.FinderPlayListDrawerPresenter", "set upContinue " + z);
    }
}
