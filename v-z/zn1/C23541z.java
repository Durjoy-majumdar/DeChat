package zn1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53884f2;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53959v2;
import a14.C53973z1;
import android.app.Activity;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kotlin.ResultKt;
import pe3.C89349b;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: zn1.z */
public final class C23541z {

    /* renamed from: a */
    public final Activity f67507a;

    /* renamed from: b */
    public final ArrayList<C16313c> f67508b = new ArrayList<>();

    /* renamed from: c */
    public C23538d0 f67509c;

    /* renamed from: d */
    public WxRecyclerAdapter<?> f67510d;

    /* renamed from: e */
    public final C0000n0 f67511e = C53930o0.m60554a(((C53884f2) C53959v2.m60598a((C53973z1) null, 1, (Object) null)).plus(C53872d1.f151119c));

    /* renamed from: f */
    public String f67512f;

    /* renamed from: g */
    public volatile C89349b f67513g;

    /* renamed from: h */
    public volatile boolean f67514h;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.playlist.FinderPlayListPresenter$requestInit$1", mo125469f = "FinderPlayListPresenter.kt", mo125470l = {122, 133, 149}, mo125471m = "invokeSuspend")
    /* renamed from: zn1.z$a */
    public static final class C23542a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f67515d;

        /* renamed from: e */
        public int f67516e;

        /* renamed from: f */
        public final /* synthetic */ C23541z f67517f;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.playlist.FinderPlayListPresenter$requestInit$1$1$1", mo125469f = "FinderPlayListPresenter.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: zn1.z$a$a */
        public static final class C23543a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C23541z f67518d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C23543a(C23541z zVar, C15601d<? super C23543a> dVar) {
                super(2, dVar);
                this.f67518d = zVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C23543a(this.f67518d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C23543a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                C23538d0 d0Var = this.f67518d.f67509c;
                if (d0Var != null) {
                    d0Var.mo36999e();
                    if (this.f67518d.f67508b.isEmpty()) {
                        C23538d0 d0Var2 = this.f67518d.f67509c;
                        if (d0Var2 != null) {
                            d0Var2.mo36995a().setVisibility(0);
                            View view = d0Var2.f67500f;
                            if (view != null) {
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(8);
                                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/playlist/FinderPlayListViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                View view2 = d0Var2.f67501g;
                                if (view2 != null) {
                                    C9556a aVar2 = new C9556a();
                                    aVar2.mo10233c(0);
                                    View view3 = view2;
                                    C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                    C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/playlist/FinderPlayListViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    View c = d0Var2.mo36997c();
                                    C9556a aVar3 = new C9556a();
                                    aVar3.mo10233c(8);
                                    View view4 = c;
                                    C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    c.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                                    C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/playlist/FinderPlayListViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                } else {
                                    C87412m.m108603p("nothingView");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("loadingView");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("viewCallback");
                            throw null;
                        }
                    } else {
                        C23538d0 d0Var3 = this.f67518d.f67509c;
                        if (d0Var3 != null) {
                            View view5 = d0Var3.f67501g;
                            if (view5 != null) {
                                C9556a aVar4 = new C9556a();
                                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                                aVar4.mo10233c(8);
                                View view6 = view5;
                                C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListViewCallback", "hideAllTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                                C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/playlist/FinderPlayListViewCallback", "hideAllTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                View c2 = d0Var3.mo36997c();
                                C9556a aVar5 = new C9556a();
                                aVar5.mo10233c(8);
                                View view7 = c2;
                                C117292a.m165358d(view7, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListViewCallback", "hideAllTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                c2.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                                C117292a.m165359e(view7, "com/tencent/mm/plugin/finder/playlist/FinderPlayListViewCallback", "hideAllTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                d0Var3.mo36995a().setVisibility(8);
                                WxRecyclerAdapter<?> wxRecyclerAdapter = this.f67518d.f67510d;
                                if (wxRecyclerAdapter != null) {
                                    wxRecyclerAdapter.notifyDataSetChanged();
                                    if (!this.f67518d.f67514h) {
                                        C23538d0 d0Var4 = this.f67518d.f67509c;
                                        if (d0Var4 != null) {
                                            d0Var4.mo36998d().mo26605m();
                                        } else {
                                            C87412m.m108603p("viewCallback");
                                            throw null;
                                        }
                                    }
                                } else {
                                    C87412m.m108603p("adapter");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("nothingView");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("viewCallback");
                            throw null;
                        }
                    }
                    return C13598b0.f38549a;
                }
                C87412m.m108603p("viewCallback");
                throw null;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.playlist.FinderPlayListPresenter$requestInit$1$2$1", mo125469f = "FinderPlayListPresenter.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: zn1.z$a$b */
        public static final class C23544b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C23541z f67519d;

            /* renamed from: zn1.z$a$b$a */
            public static final class C23545a extends C87413o implements C32224a<C13598b0> {

                /* renamed from: d */
                public final /* synthetic */ C23541z f67520d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C23545a(C23541z zVar) {
                    super(0);
                    this.f67520d = zVar;
                }

                public Object invoke() {
                    C23538d0 d0Var = this.f67520d.f67509c;
                    if (d0Var != null) {
                        d0Var.mo37000f();
                        this.f67520d.mo37001b();
                        return C13598b0.f38549a;
                    }
                    C87412m.m108603p("viewCallback");
                    throw null;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C23544b(C23541z zVar, C15601d<? super C23544b> dVar) {
                super(2, dVar);
                this.f67519d = zVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C23544b(this.f67519d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C23544b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                C23538d0 d0Var = this.f67519d.f67509c;
                if (d0Var != null) {
                    d0Var.mo36999e();
                    C23541z zVar = this.f67519d;
                    C23538d0 d0Var2 = zVar.f67509c;
                    if (d0Var2 != null) {
                        C23545a aVar = new C23545a(zVar);
                        d0Var2.mo36995a().setVisibility(0);
                        View view = d0Var2.f67500f;
                        if (view != null) {
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar2.mo10233c(8);
                            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListViewCallback", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/playlist/FinderPlayListViewCallback", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            View view2 = d0Var2.f67501g;
                            if (view2 != null) {
                                C9556a aVar3 = new C9556a();
                                aVar3.mo10233c(8);
                                View view3 = view2;
                                C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListViewCallback", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/playlist/FinderPlayListViewCallback", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                View c = d0Var2.mo36997c();
                                C9556a aVar4 = new C9556a();
                                aVar4.mo10233c(0);
                                View view4 = c;
                                C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListViewCallback", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                c.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/playlist/FinderPlayListViewCallback", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                d0Var2.mo36997c().setOnClickListener(new C16314c0(aVar));
                                return C13598b0.f38549a;
                            }
                            C87412m.m108603p("nothingView");
                            throw null;
                        }
                        C87412m.m108603p("loadingView");
                        throw null;
                    }
                    C87412m.m108603p("viewCallback");
                    throw null;
                }
                C87412m.m108603p("viewCallback");
                throw null;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23542a(C23541z zVar, C15601d<? super C23542a> dVar) {
            super(2, dVar);
            this.f67517f = zVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C23542a(this.f67517f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C23542a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x00ea  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r11.f67516e
                java.lang.String r2 = "Finder.FinderPlayListPresenter"
                r3 = 0
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L_0x0030
                if (r1 == r6) goto L_0x0026
                if (r1 == r5) goto L_0x001f
                if (r1 != r4) goto L_0x0017
                kotlin.ResultKt.throwOnFailure(r12)
                goto L_0x012e
            L_0x0017:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x001f:
                java.lang.Object r1 = r11.f67515d
                kotlin.ResultKt.throwOnFailure(r12)
                goto L_0x00e2
            L_0x0026:
                kotlin.ResultKt.throwOnFailure(r12)
                kotlin.Result r12 = (kotlin.Result) r12
                java.lang.Object r12 = r12.m168123unboximpl()
                goto L_0x003e
            L_0x0030:
                kotlin.ResultKt.throwOnFailure(r12)
                zn1.z r12 = r11.f67517f
                r11.f67516e = r6
                java.lang.Object r12 = zn1.C23541z.m28105a(r12, r11)
                if (r12 != r0) goto L_0x003e
                return r0
            L_0x003e:
                r1 = r12
                zn1.z r12 = r11.f67517f
                boolean r7 = kotlin.Result.m168121isSuccessimpl(r1)
                if (r7 == 0) goto L_0x00e2
                r7 = r1
                te3.hm0 r7 = (te3.C49723hm0) r7
                pe3.b r8 = r7.f134726g
                r12.f67513g = r8
                int r8 = r7.f134725f
                if (r8 != r6) goto L_0x0053
                goto L_0x0054
            L_0x0053:
                r6 = 0
            L_0x0054:
                r12.f67514h = r6
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "set continueFlag "
                r8.append(r9)
                r8.append(r6)
                java.lang.String r6 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r6)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r8 = "request CgiFinderGetCollectionList success, data: "
                r6.append(r8)
                java.util.LinkedList<te3.rh0> r8 = r7.f134723d
                int r8 = r8.size()
                r6.append(r8)
                java.lang.String r8 = ", lastBuffer: "
                r6.append(r8)
                pe3.b r8 = r12.f67513g
                r6.append(r8)
                java.lang.String r8 = ", continueFlage: "
                r6.append(r8)
                boolean r8 = r12.f67514h
                r6.append(r8)
                java.lang.String r6 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r6)
                java.util.LinkedList<te3.rh0> r6 = r7.f134723d
                java.lang.String r7 = "resp.collection_info"
                gy3.C87412m.m108593f(r6, r7)
                java.util.ArrayList r7 = new java.util.ArrayList
                r8 = 10
                int r8 = sx3.C36907w.m41090l(r6, r8)
                r7.<init>(r8)
                java.util.Iterator r6 = r6.iterator()
            L_0x00af:
                boolean r8 = r6.hasNext()
                if (r8 == 0) goto L_0x00c9
                java.lang.Object r8 = r6.next()
                te3.rh0 r8 = (te3.C51108rh0) r8
                zn1.c r9 = new zn1.c
                java.lang.String r10 = "info"
                gy3.C87412m.m108593f(r8, r10)
                r9.<init>(r8)
                r7.add(r9)
                goto L_0x00af
            L_0x00c9:
                java.util.ArrayList<zn1.c> r6 = r12.f67508b
                r6.addAll(r7)
                a14.h0 r6 = a14.C53872d1.f151117a
                a14.k2 r6 = f14.C58901s.f168555a
                zn1.z$a$a r7 = new zn1.z$a$a
                r7.<init>(r12, r3)
                r11.f67515d = r1
                r11.f67516e = r5
                java.lang.Object r12 = a14.C53895h.m60469g(r6, r7, r11)
                if (r12 != r0) goto L_0x00e2
                return r0
            L_0x00e2:
                zn1.z r12 = r11.f67517f
                java.lang.Throwable r5 = kotlin.Result.m168117exceptionOrNullimpl(r1)
                if (r5 == 0) goto L_0x012e
                boolean r6 = r5 instanceof q40.C12040d
                if (r6 == 0) goto L_0x011a
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "request CgiFinderGetTopicFeed fail, errType="
                r6.append(r7)
                q40.d r5 = (q40.C12040d) r5
                int r7 = r5.f35057e
                r6.append(r7)
                java.lang.String r7 = " errCode="
                r6.append(r7)
                int r7 = r5.f35058f
                r6.append(r7)
                java.lang.String r7 = " fail:"
                r6.append(r7)
                java.lang.String r5 = r5.f35059g
                r6.append(r5)
                java.lang.String r5 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r5)
            L_0x011a:
                a14.h0 r2 = a14.C53872d1.f151117a
                a14.k2 r2 = f14.C58901s.f168555a
                zn1.z$a$b r5 = new zn1.z$a$b
                r5.<init>(r12, r3)
                r11.f67515d = r1
                r11.f67516e = r4
                java.lang.Object r12 = a14.C53895h.m60469g(r2, r5, r11)
                if (r12 != r0) goto L_0x012e
                return r0
            L_0x012e:
                rx3.b0 r12 = rx3.C13598b0.f38549a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: zn1.C23541z.C23542a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C23541z(Activity activity) {
        C87412m.m108594g(activity, "context");
        this.f67507a = activity;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m28105a(zn1.C23541z r8, wx3.C15601d r9) {
        /*
            r8.getClass()
            boolean r0 = r9 instanceof zn1.C23539w
            if (r0 == 0) goto L_0x0016
            r0 = r9
            zn1.w r0 = (zn1.C23539w) r0
            int r1 = r0.f67505f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f67505f = r1
            goto L_0x001b
        L_0x0016:
            zn1.w r0 = new zn1.w
            r0.<init>(r8, r9)
        L_0x001b:
            r5 = r0
            java.lang.Object r9 = r5.f67503d
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r5.f67505f
            r2 = 1
            if (r1 == 0) goto L_0x0033
            if (r1 != r2) goto L_0x002b
            kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ all -> 0x0067 }
            goto L_0x0060
        L_0x002b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlin.Result$Companion r9 = kotlin.Result.Companion     // Catch:{ all -> 0x0067 }
            je1.a0 r1 = new je1.a0     // Catch:{ all -> 0x0067 }
            java.lang.String r9 = r8.f67512f     // Catch:{ all -> 0x0067 }
            pe3.b r3 = r8.f67513g     // Catch:{ all -> 0x0067 }
            rs1.s8$a r4 = rs1.C13442s8.f38060Q0     // Catch:{ all -> 0x0067 }
            android.app.Activity r8 = r8.f67507a     // Catch:{ all -> 0x0067 }
            rs1.s8 r8 = r4.mo12873f(r8)     // Catch:{ all -> 0x0067 }
            if (r8 == 0) goto L_0x004d
            te3.hj1 r8 = r8.mo12861q3()     // Catch:{ all -> 0x0067 }
            goto L_0x004e
        L_0x004d:
            r8 = 0
        L_0x004e:
            r1.<init>(r9, r3, r8)     // Catch:{ all -> 0x0067 }
            r8 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            r5.f67505f = r2     // Catch:{ all -> 0x0067 }
            r2 = r8
            java.lang.Object r9 = q40.C89456b.m111831a(r1, r2, r4, r5, r6, r7)     // Catch:{ all -> 0x0067 }
            if (r9 != r0) goto L_0x0060
            goto L_0x0073
        L_0x0060:
            te3.hm0 r9 = (te3.C49723hm0) r9     // Catch:{ all -> 0x0067 }
            java.lang.Object r8 = kotlin.Result.m168114constructorimpl(r9)     // Catch:{ all -> 0x0067 }
            goto L_0x0072
        L_0x0067:
            r8 = move-exception
            kotlin.Result$Companion r9 = kotlin.Result.Companion
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
            java.lang.Object r8 = kotlin.Result.m168114constructorimpl(r8)
        L_0x0072:
            r0 = r8
        L_0x0073:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zn1.C23541z.m28105a(zn1.z, wx3.d):java.lang.Object");
    }

    /* renamed from: b */
    public final void mo37001b() {
        C23538d0 d0Var = this.f67509c;
        if (d0Var != null) {
            d0Var.mo37000f();
            Log.m105924i("Finder.FinderPlayListPresenter", "requestInit CgiFinderGetTopicFeed");
            C53895h.m60466d(this.f67511e, (C66212f) null, (C53934p0) null, new C23542a(this, (C15601d<? super C23542a>) null), 3, (Object) null);
            return;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }
}
