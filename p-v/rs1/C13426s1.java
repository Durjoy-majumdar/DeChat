package rs1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53934p0;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import bo1.C54511w;
import bo1.C54512y;
import c14.C54614c;
import c14.C54624g;
import c14.C54625h;
import c14.C54629k;
import cm1.C0740i2;
import com.google.android.gms.common.stats.LoggingConstants;
import com.tencent.p014mm.autogen.events.FinderEnhanceActionEvent;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.p056ui.FinderShareFeedRelUI;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import eo1.C58638b;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.atomic.AtomicBoolean;
import ke1.C9590j;
import kotlin.ResultKt;
import o40.C61926c;
import os1.C11749q;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C77813z;
import te3.C49712hj1;
import te3.db4;
import up1.C37521f;
import ux3.C65486b;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: rs1.s1 */
public final class C13426s1 extends UIComponent {

    /* renamed from: t */
    public static final ConcurrentSkipListSet<Long> f38005t = new ConcurrentSkipListSet<>();

    /* renamed from: d */
    public final ConcurrentSkipListSet<Long> f38006d = new ConcurrentSkipListSet<>();

    /* renamed from: e */
    public final LinkedList<db4> f38007e = new LinkedList<>();

    /* renamed from: f */
    public final C9590j f38008f = new C9590j();

    /* renamed from: g */
    public boolean f38009g = true;

    /* renamed from: h */
    public BaseFeedLoader<C0740i2> f38010h;

    /* renamed from: i */
    public RecyclerView f38011i;

    /* renamed from: j */
    public final C13601g f38012j = C36568h.m40985a(C13430e.f38037d);

    /* renamed from: n */
    public final C13601g f38013n = C36568h.m40985a(C13431f.f38038d);

    /* renamed from: o */
    public volatile String f38014o = "";

    /* renamed from: p */
    public int f38015p;

    /* renamed from: q */
    public long f38016q;

    /* renamed from: r */
    public AtomicBoolean f38017r;

    /* renamed from: s */
    public boolean f38018s;

    /* renamed from: rs1.s1$a */
    public static final class C13427a {

        /* renamed from: a */
        public final long f38019a;

        /* renamed from: b */
        public long f38020b;

        /* renamed from: c */
        public long f38021c;

        /* renamed from: d */
        public long f38022d;

        /* renamed from: e */
        public long f38023e;

        /* renamed from: f */
        public long f38024f;

        /* renamed from: g */
        public long f38025g;

        /* renamed from: h */
        public long f38026h;

        /* renamed from: i */
        public int f38027i;

        public C13427a(long j) {
            this.f38019a = j;
        }

        /* renamed from: a */
        public final void mo12824a(int i) {
            C37521f.f99374d.getClass();
            if (C37521f.f99275R5.mo60266n().intValue() == 1) {
                FinderEnhanceActionEvent finderEnhanceActionEvent = new FinderEnhanceActionEvent();
                FinderEnhanceActionEvent.C1045a aVar = finderEnhanceActionEvent.f9193d;
                aVar.f9195b = i;
                aVar.f9194a = this.f38019a;
                aVar.f9196c = this.f38025g - this.f38020b;
                aVar.f9197d = this.f38022d - this.f38021c;
                aVar.f9198e = this.f38024f - this.f38023e;
                aVar.f9199f = this.f38027i;
                finderEnhanceActionEvent.publish();
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13427a) && this.f38019a == ((C13427a) obj).f38019a;
        }

        public int hashCode() {
            long j = this.f38019a;
            return (int) (j ^ (j >>> 32));
        }

        public String toString() {
            return "{allCost=" + (this.f38025g - this.f38020b) + "ms, cgi=" + (this.f38022d - this.f38021c) + "ms, preload=" + (this.f38024f - this.f38023e) + "ms, ui=" + (this.f38025g - this.f38026h) + "ms}";
        }
    }

    /* renamed from: rs1.s1$b */
    public enum C13428b {
        LIKE(1),
        FORWARD(2),
        SWITCH_FEED(3),
        LONG_CLICK_AVATAR(4),
        STAR(5),
        UNSTAR(6),
        DEFAULT(0);
        

        /* renamed from: d */
        public final int f38036d;

        /* access modifiers changed from: public */
        C13428b(int i) {
            this.f38036d = i;
        }
    }

    /* renamed from: rs1.s1$d */
    public static final class C13429d<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C65486b.m77169a(Long.valueOf(((db4) t2).f182692w), Long.valueOf(((db4) t).f182692w));
        }
    }

    /* renamed from: rs1.s1$e */
    public static final class C13430e extends C87413o implements C32224a<C58638b> {

        /* renamed from: d */
        public static final C13430e f38037d = new C13430e();

        public C13430e() {
            super(0);
        }

        public Object invoke() {
            return new C58638b(((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Hx0(), "Finder.EnhanceFeedUIC");
        }
    }

    /* renamed from: rs1.s1$f */
    public static final class C13431f extends C87413o implements C32224a<C11749q> {

        /* renamed from: d */
        public static final C13431f f38038d = new C13431f();

        public C13431f() {
            super(0);
        }

        public Object invoke() {
            return (C11749q) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11749q.class);
        }
    }

    /* renamed from: rs1.s1$c */
    public final class C13432c implements C54511w {

        /* renamed from: a */
        public final C54625h<C13604l<Boolean, String>> f38039a = C54629k.m61479a(0, (C54624g) null, (C32226l) null, 7, (Object) null);

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.viewmodel.component.FinderEnhanceFeedUIC$PreloadCallback$onFailure$1", mo125469f = "FinderEnhanceFeedUIC.kt", mo125470l = {612}, mo125471m = "invokeSuspend")
        /* renamed from: rs1.s1$c$a */
        public static final class C13433a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f38041d;

            /* renamed from: e */
            public final /* synthetic */ C13432c f38042e;

            /* renamed from: f */
            public final /* synthetic */ String f38043f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13433a(C13432c cVar, String str, C15601d<? super C13433a> dVar) {
                super(2, dVar);
                this.f38042e = cVar;
                this.f38043f = str;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C13433a(this.f38042e, this.f38043f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C13433a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f38041d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C54625h<C13604l<Boolean, String>> hVar = this.f38042e.f38039a;
                    C13604l lVar = new C13604l(Boolean.FALSE, this.f38043f);
                    this.f38041d = 1;
                    if (((C54614c) hVar).mo75536o(lVar, this) == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C13598b0.f38549a;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.viewmodel.component.FinderEnhanceFeedUIC$PreloadCallback$onFormatChange$1", mo125469f = "FinderEnhanceFeedUIC.kt", mo125470l = {624}, mo125471m = "invokeSuspend")
        /* renamed from: rs1.s1$c$b */
        public static final class C13434b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f38044d;

            /* renamed from: e */
            public final /* synthetic */ C13432c f38045e;

            /* renamed from: f */
            public final /* synthetic */ String f38046f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13434b(C13432c cVar, String str, C15601d<? super C13434b> dVar) {
                super(2, dVar);
                this.f38045e = cVar;
                this.f38046f = str;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C13434b(this.f38045e, this.f38046f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C13434b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f38044d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C54625h<C13604l<Boolean, String>> hVar = this.f38045e.f38039a;
                    C13604l lVar = new C13604l(Boolean.FALSE, this.f38046f);
                    this.f38044d = 1;
                    if (((C54614c) hVar).mo75536o(lVar, this) == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C13598b0.f38549a;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.viewmodel.component.FinderEnhanceFeedUIC$PreloadCallback$onReject$1", mo125469f = "FinderEnhanceFeedUIC.kt", mo125470l = {630}, mo125471m = "invokeSuspend")
        /* renamed from: rs1.s1$c$c */
        public static final class C13435c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f38047d;

            /* renamed from: e */
            public final /* synthetic */ C13432c f38048e;

            /* renamed from: f */
            public final /* synthetic */ String f38049f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13435c(C13432c cVar, String str, C15601d<? super C13435c> dVar) {
                super(2, dVar);
                this.f38048e = cVar;
                this.f38049f = str;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C13435c(this.f38048e, this.f38049f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C13435c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f38047d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C54625h<C13604l<Boolean, String>> hVar = this.f38048e.f38039a;
                    C13604l lVar = new C13604l(Boolean.FALSE, this.f38049f);
                    this.f38047d = 1;
                    if (((C54614c) hVar).mo75536o(lVar, this) == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C13598b0.f38549a;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.viewmodel.component.FinderEnhanceFeedUIC$PreloadCallback$onSuccessfully$1", mo125469f = "FinderEnhanceFeedUIC.kt", mo125470l = {606}, mo125471m = "invokeSuspend")
        /* renamed from: rs1.s1$c$d */
        public static final class C13436d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f38050d;

            /* renamed from: e */
            public final /* synthetic */ C13432c f38051e;

            /* renamed from: f */
            public final /* synthetic */ String f38052f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13436d(C13432c cVar, String str, C15601d<? super C13436d> dVar) {
                super(2, dVar);
                this.f38051e = cVar;
                this.f38052f = str;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C13436d(this.f38051e, this.f38052f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C13436d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f38050d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C54625h<C13604l<Boolean, String>> hVar = this.f38051e.f38039a;
                    C13604l lVar = new C13604l(Boolean.TRUE, this.f38052f);
                    this.f38050d = 1;
                    if (((C54614c) hVar).mo75536o(lVar, this) == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C13598b0.f38549a;
            }
        }

        public C13432c() {
        }

        /* renamed from: a */
        public void mo12829a(String str, C54512y yVar) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(yVar, "task");
            C53895h.m60466d(C13426s1.this.getLifecycleScope(), (C66212f) null, (C53934p0) null, new C13435c(this, str, (C15601d<? super C13435c>) null), 3, (Object) null);
        }

        /* renamed from: b */
        public void mo12830b(String str, int i, int i2, String str2, String str3, C54512y yVar) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(str2, "fileFormat");
            C87412m.m108594g(str3, "codingFormat");
            C87412m.m108594g(yVar, "task");
        }

        /* renamed from: c */
        public void mo12831c(String str, int i, long j) {
            C87412m.m108594g(str, "mediaId");
        }

        /* renamed from: d */
        public void mo12832d(String str, String str2, C54512y yVar) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(str2, "msg");
            C87412m.m108594g(yVar, "task");
            C53895h.m60466d(C13426s1.this.getLifecycleScope(), (C66212f) null, (C53934p0) null, new C13433a(this, str, (C15601d<? super C13433a>) null), 3, (Object) null);
        }

        /* renamed from: e */
        public void mo12833e(String str) {
            C87412m.m108594g(str, "mediaId");
            C53895h.m60466d(C13426s1.this.getLifecycleScope(), (C66212f) null, (C53934p0) null, new C13434b(this, str, (C15601d<? super C13434b>) null), 3, (Object) null);
        }

        /* renamed from: f */
        public void mo12834f(String str, boolean z, int i, C54512y yVar, long j) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(yVar, "task");
            C53895h.m60466d(C13426s1.this.getLifecycleScope(), (C66212f) null, (C53934p0) null, new C13436d(this, str, (C15601d<? super C13436d>) null), 3, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13426s1(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
        f38005t.clear();
        this.f38015p = -1;
        this.f38017r = new AtomicBoolean(false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0106 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x010a A[EDGE_INSN: B:136:0x010a->B:58:0x010a ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ff A[LOOP:0: B:45:0x00d2->B:56:0x00ff, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: c3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m12737c3(rs1.C13426s1 r18, int r19, com.tencent.p014mm.protocal.protobuf.FinderObject r20, java.util.List r21, boolean r22, wx3.C15601d r23) {
        /*
            r0 = r18
            r1 = r23
            r18.getClass()
            boolean r2 = r1 instanceof rs1.C13451t1
            if (r2 == 0) goto L_0x001a
            r2 = r1
            rs1.t1 r2 = (rs1.C13451t1) r2
            int r3 = r2.f38132n
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001a
            int r3 = r3 - r4
            r2.f38132n = r3
            goto L_0x001f
        L_0x001a:
            rs1.t1 r2 = new rs1.t1
            r2.<init>(r0, r1)
        L_0x001f:
            java.lang.Object r1 = r2.f38130i
            xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
            int r4 = r2.f38132n
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x004b
            if (r4 != r6) goto L_0x0043
            boolean r0 = r2.f38129h
            int r3 = r2.f38128g
            java.lang.Object r4 = r2.f38127f
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r7 = r2.f38126e
            com.tencent.mm.protocal.protobuf.FinderObject r7 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r7
            java.lang.Object r2 = r2.f38125d
            rs1.s1 r2 = (rs1.C13426s1) r2
            kotlin.ResultKt.throwOnFailure(r1)
            r8 = r0
            r0 = r2
            r2 = r1
            r1 = r7
            goto L_0x0079
        L_0x0043:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004b:
            kotlin.ResultKt.throwOnFailure(r1)
            r2.f38125d = r0
            r1 = r20
            r2.f38126e = r1
            r4 = r21
            r2.f38127f = r4
            r7 = r19
            r2.f38128g = r7
            r8 = r22
            r2.f38129h = r8
            r2.f38132n = r6
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
            a14.h0 r10 = a14.C53872d1.f151117a
            a14.k2 r10 = f14.C58901s.f168555a
            rs1.u1 r11 = new rs1.u1
            r11.<init>(r0, r9, r5)
            java.lang.Object r2 = a14.C53895h.m60469g(r10, r11, r2)
            if (r2 != r3) goto L_0x0078
            goto L_0x02b5
        L_0x0078:
            r3 = r7
        L_0x0079:
            java.util.List r2 = (java.util.List) r2
            androidx.recyclerview.widget.RecyclerView r7 = r0.f38011i
            if (r7 == 0) goto L_0x0084
            androidx.recyclerview.widget.RecyclerView$LayoutManager r7 = r7.getLayoutManager()
            goto L_0x0085
        L_0x0084:
            r7 = r5
        L_0x0085:
            boolean r9 = r7 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r9 == 0) goto L_0x008c
            androidx.recyclerview.widget.LinearLayoutManager r7 = (androidx.recyclerview.widget.LinearLayoutManager) r7
            goto L_0x008d
        L_0x008c:
            r7 = r5
        L_0x008d:
            r9 = -1
            if (r7 == 0) goto L_0x0095
            int r7 = r7.mo16959E()
            goto L_0x0096
        L_0x0095:
            r7 = -1
        L_0x0096:
            androidx.recyclerview.widget.RecyclerView r10 = r0.f38011i
            if (r10 == 0) goto L_0x009f
            androidx.recyclerview.widget.RecyclerView$LayoutManager r10 = r10.getLayoutManager()
            goto L_0x00a0
        L_0x009f:
            r10 = r5
        L_0x00a0:
            boolean r11 = r10 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r11 == 0) goto L_0x00a7
            androidx.recyclerview.widget.LinearLayoutManager r10 = (androidx.recyclerview.widget.LinearLayoutManager) r10
            goto L_0x00a8
        L_0x00a7:
            r10 = r5
        L_0x00a8:
            if (r10 == 0) goto L_0x00af
            int r10 = r10.mo16957C()
            goto L_0x00b0
        L_0x00af:
            r10 = -1
        L_0x00b0:
            r11 = 0
            if (r7 == r9) goto L_0x00bf
            java.lang.Object r13 = r2.get(r7)
            cm1.i2 r13 = (cm1.C0740i2) r13
            long r13 = r13.getItemId()
            goto L_0x00c0
        L_0x00bf:
            r13 = r11
        L_0x00c0:
            if (r10 == r9) goto L_0x00cc
            java.lang.Object r10 = r2.get(r10)
            cm1.i2 r10 = (cm1.C0740i2) r10
            long r11 = r10.getItemId()
        L_0x00cc:
            java.util.Iterator r10 = r4.iterator()
            r16 = 0
        L_0x00d2:
            boolean r17 = r10.hasNext()
            if (r17 == 0) goto L_0x0106
            java.lang.Object r17 = r10.next()
            r5 = r17
            com.tencent.mm.protocal.protobuf.FinderObject r5 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r5
            os1.q r15 = r0.mo12821g3()
            r19 = r7
            long r6 = r5.f164794id
            boolean r6 = r15.mo11614e3(r3, r6)
            if (r6 != 0) goto L_0x00fb
            long r5 = r5.f164794id
            int r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r7 == 0) goto L_0x00fb
            int r7 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r7 != 0) goto L_0x00f9
            goto L_0x00fb
        L_0x00f9:
            r5 = 0
            goto L_0x00fc
        L_0x00fb:
            r5 = 1
        L_0x00fc:
            if (r5 == 0) goto L_0x00ff
            goto L_0x010a
        L_0x00ff:
            int r16 = r16 + 1
            r7 = r19
            r5 = 0
            r6 = 1
            goto L_0x00d2
        L_0x0106:
            r19 = r7
            r16 = -1
        L_0x010a:
            java.lang.String r5 = "Finder.EnhanceFeedUIC"
            if (r16 < 0) goto L_0x012d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "[calValidPosition] failure!  pendingList contains has read feed. requestObj="
            r2.append(r3)
            java.lang.String r0 = r0.mo12823j3(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r9)
            goto L_0x02b5
        L_0x012d:
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<cm1.i2> r6 = r0.f38010h
            if (r6 == 0) goto L_0x0139
            java.lang.Class<cm1.i2> r7 = cm1.C0740i2.class
            java.util.List r6 = r6.getListOfType(r7)
            if (r6 != 0) goto L_0x013b
        L_0x0139:
            sx3.f0 r6 = sx3.C64186f0.f181907d
        L_0x013b:
            if (r8 != 0) goto L_0x01a6
            java.util.Iterator r4 = r4.iterator()
            r7 = 0
        L_0x0142:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L_0x0184
            java.lang.Object r10 = r4.next()
            com.tencent.mm.protocal.protobuf.FinderObject r10 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r10
            java.util.Iterator r11 = r6.iterator()
        L_0x0152:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0178
            java.lang.Object r12 = r11.next()
            r13 = r12
            cm1.i2 r13 = (cm1.C0740i2) r13
            long r13 = r13.getItemId()
            r20 = r11
            r21 = r12
            long r11 = r10.f164794id
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 != 0) goto L_0x016f
            r11 = 1
            goto L_0x0170
        L_0x016f:
            r11 = 0
        L_0x0170:
            if (r11 == 0) goto L_0x0175
            r12 = r21
            goto L_0x0179
        L_0x0175:
            r11 = r20
            goto L_0x0152
        L_0x0178:
            r12 = 0
        L_0x0179:
            if (r12 == 0) goto L_0x017d
            r10 = 1
            goto L_0x017e
        L_0x017d:
            r10 = 0
        L_0x017e:
            if (r10 == 0) goto L_0x0181
            goto L_0x0185
        L_0x0181:
            int r7 = r7 + 1
            goto L_0x0142
        L_0x0184:
            r7 = -1
        L_0x0185:
            if (r7 < 0) goto L_0x01a6
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "[calValidPosition] failure! insert mode pendingList contains current loader feed. requestObj="
            r2.append(r3)
            java.lang.String r0 = r0.mo12823j3(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r9)
            goto L_0x02b5
        L_0x01a6:
            java.util.Iterator r4 = r2.iterator()
            r6 = 0
        L_0x01ab:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x01ca
            java.lang.Object r7 = r4.next()
            cm1.i2 r7 = (cm1.C0740i2) r7
            long r10 = r7.getItemId()
            long r12 = r1.f164794id
            int r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r7 != 0) goto L_0x01c3
            r7 = 1
            goto L_0x01c4
        L_0x01c3:
            r7 = 0
        L_0x01c4:
            if (r7 == 0) goto L_0x01c7
            goto L_0x01cb
        L_0x01c7:
            int r6 = r6 + 1
            goto L_0x01ab
        L_0x01ca:
            r6 = -1
        L_0x01cb:
            int r4 = r2.size()
            java.util.ListIterator r4 = r2.listIterator(r4)
        L_0x01d3:
            boolean r7 = r4.hasPrevious()
            if (r7 == 0) goto L_0x01f2
            java.lang.Object r7 = r4.previous()
            cm1.i2 r7 = (cm1.C0740i2) r7
            os1.q r10 = r0.mo12821g3()
            long r11 = r7.getItemId()
            boolean r7 = r10.mo11614e3(r3, r11)
            if (r7 == 0) goto L_0x01d3
            int r4 = r4.nextIndex()
            goto L_0x01f3
        L_0x01f2:
            r4 = -1
        L_0x01f3:
            if (r8 != 0) goto L_0x022a
            int r7 = r6 + 1
            int r10 = sx3.C64197v.m75536e(r2)
            if (r7 > r10) goto L_0x022a
        L_0x01fd:
            java.lang.Object r11 = sx3.C110818d0.m150917O(r2, r7)
            cm1.i2 r11 = (cm1.C0740i2) r11
            if (r11 != 0) goto L_0x0206
            goto L_0x0224
        L_0x0206:
            os1.q r12 = r0.mo12821g3()
            long r13 = r11.getItemId()
            boolean r11 = r12.mo11614e3(r3, r13)
            if (r11 != 0) goto L_0x0224
            r11 = 1
            int r7 = r7 - r11
            if (r7 >= 0) goto L_0x0219
            r7 = 0
        L_0x0219:
            int r2 = sx3.C64197v.m75536e(r2)
            int r2 = r2 - r11
            if (r7 <= r2) goto L_0x0221
            r7 = r2
        L_0x0221:
            r2 = r19
            goto L_0x022e
        L_0x0224:
            r11 = 1
            if (r7 == r10) goto L_0x022b
            int r7 = r7 + 1
            goto L_0x01fd
        L_0x022a:
            r11 = 1
        L_0x022b:
            r2 = r19
            r7 = -1
        L_0x022e:
            if (r2 == r9) goto L_0x0233
            if (r6 == r9) goto L_0x0233
            goto L_0x0234
        L_0x0233:
            r11 = 0
        L_0x0234:
            r3 = 32
            java.lang.String r10 = " requestObj="
            java.lang.String r12 = " nextUnreadPos="
            java.lang.String r13 = " lastReadPos="
            java.lang.String r14 = " lastVisiblePos="
            if (r11 != 0) goto L_0x0279
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = "[calValidPosition] failure! requestPos="
            r8.append(r11)
            r8.append(r6)
            r8.append(r14)
            r8.append(r2)
            r8.append(r13)
            r8.append(r4)
            r8.append(r12)
            r8.append(r7)
            r8.append(r10)
            java.lang.String r0 = r0.mo12823j3(r1)
            r8.append(r0)
            r8.append(r3)
            java.lang.String r0 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r9)
            goto L_0x02b5
        L_0x0279:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "[calValidPosition] requestPos="
            r9.append(r11)
            r9.append(r6)
            r9.append(r14)
            r9.append(r2)
            r9.append(r13)
            r9.append(r4)
            r9.append(r12)
            r9.append(r7)
            r9.append(r10)
            java.lang.String r0 = r0.mo12823j3(r1)
            r9.append(r0)
            r9.append(r3)
            java.lang.String r0 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            if (r8 == 0) goto L_0x02af
            goto L_0x02b0
        L_0x02af:
            r4 = r7
        L_0x02b0:
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r4)
        L_0x02b5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C13426s1.m12737c3(rs1.s1, int, com.tencent.mm.protocal.protobuf.FinderObject, java.util.List, boolean, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: d3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m12738d3(rs1.C13426s1 r21, te3.C49712hj1 r22, int r23, com.tencent.p014mm.protocal.protobuf.FinderObject r24, wx3.C15601d r25) {
        /*
            r0 = r21
            r1 = r24
            r2 = r25
            r21.getClass()
            boolean r3 = r2 instanceof rs1.C13538y1
            if (r3 == 0) goto L_0x001c
            r3 = r2
            rs1.y1 r3 = (rs1.C13538y1) r3
            int r4 = r3.f38387h
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001c
            int r4 = r4 - r5
            r3.f38387h = r4
            goto L_0x0021
        L_0x001c:
            rs1.y1 r3 = new rs1.y1
            r3.<init>(r0, r2)
        L_0x0021:
            java.lang.Object r2 = r3.f38385f
            xx3.a r4 = xx3.C15911a.COROUTINE_SUSPENDED
            int r5 = r3.f38387h
            r6 = 1
            if (r5 == 0) goto L_0x0043
            if (r5 != r6) goto L_0x003b
            java.lang.Object r0 = r3.f38384e
            rs1.s1$c r0 = (rs1.C13426s1.C13432c) r0
            java.lang.Object r1 = r3.f38383d
            rs1.s1 r1 = (rs1.C13426s1) r1
            kotlin.ResultKt.throwOnFailure(r2)
            r7 = r0
            r0 = r1
            goto L_0x00d8
        L_0x003b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0043:
            kotlin.ResultKt.throwOnFailure(r2)
            if (r1 == 0) goto L_0x00ec
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r2 = r1.objectDesc
            r5 = 0
            if (r2 == 0) goto L_0x0054
            int r2 = r2.mediaType
            r7 = 4
            if (r2 != r7) goto L_0x0054
            r2 = 1
            goto L_0x0055
        L_0x0054:
            r2 = 0
        L_0x0055:
            if (r2 == 0) goto L_0x0059
            r2 = r1
            goto L_0x005a
        L_0x0059:
            r2 = 0
        L_0x005a:
            if (r2 == 0) goto L_0x00ec
            com.tencent.mm.plugin.finder.storage.FinderItem$a r2 = com.tencent.p014mm.plugin.finder.storage.FinderItem.Companion
            r7 = r23
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r2.mo79056a(r1, r7)
            cm1.j0 r2 = new cm1.j0
            r2.<init>(r1)
            rx3.l r7 = new rx3.l
            com.tencent.mm.plugin.finder.storage.FinderItem r8 = r2.mo3513o()
            java.util.LinkedList r8 = r8.getMediaList()
            r7.<init>(r2, r8)
            java.util.List r2 = sx3.C26236u.m33719b(r7)
            rs1.s1$c r7 = new rs1.s1$c
            r7.<init>()
            rx3.g r8 = r0.f38012j
            rx3.n r8 = (rx3.C36570n) r8
            java.lang.Object r8 = r8.getValue()
            eo1.b r8 = (eo1.C58638b) r8
            java.util.concurrent.ConcurrentLinkedQueue<bo1.w> r8 = r8.f167880i
            r8.add(r7)
            rx3.g r8 = r0.f38012j
            rx3.n r8 = (rx3.C36570n) r8
            java.lang.Object r8 = r8.getValue()
            eo1.b r8 = (eo1.C58638b) r8
            e03.b r14 = new e03.b
            r10 = 1
            r11 = -1
            r9 = r22
            int r12 = r9.f134675i
            r13 = 1
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 112(0x70, float:1.57E-43)
            r20 = 0
            r9 = r14
            r6 = r14
            r14 = r15
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r9.<init>(r10, r11, r12, r13, r14, r16, r17, r18, r19)
            com.tencent.mm.plugin.finder.storage.FeedData$a r9 = com.tencent.p014mm.plugin.finder.storage.FeedData.Companion
            com.tencent.mm.plugin.finder.storage.FeedData r1 = r9.mo78884b(r1)
            java.util.List r2 = sx3.C110818d0.m150900B0(r2)
            r8.mo83526h(r6, r1, r2, r5)
            c14.h<rx3.l<java.lang.Boolean, java.lang.String>> r1 = r7.f38039a
            r3.f38383d = r0
            r3.f38384e = r7
            r2 = 1
            r3.f38387h = r2
            c14.a r1 = (c14.C54602a) r1
            java.lang.Object r2 = r1.mo75514g(r3)
            if (r2 != r4) goto L_0x00d8
            goto L_0x00ee
        L_0x00d8:
            rx3.l r2 = (rx3.C13604l) r2
            rx3.g r0 = r0.f38012j
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            eo1.b r0 = (eo1.C58638b) r0
            java.util.concurrent.ConcurrentLinkedQueue<bo1.w> r0 = r0.f167880i
            r0.remove(r7)
            A r4 = r2.f38555d
            goto L_0x00ee
        L_0x00ec:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
        L_0x00ee:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C13426s1.m12738d3(rs1.s1, te3.hj1, int, com.tencent.mm.protocal.protobuf.FinderObject, wx3.d):java.lang.Object");
    }

    /* renamed from: e3 */
    public static final Object m12739e3(C13426s1 s1Var, int i, C49712hj1 hj12, List list, C15601d dVar) {
        if (s1Var.getContext() instanceof FinderShareFeedRelUI) {
            return C13598b0.f38549a;
        }
        Object g = C53895h.m60469g(C53872d1.f151119c, new C13561z1(s1Var, i, list, hj12, (C15601d<? super C13561z1>) null), dVar);
        return g == C15911a.COROUTINE_SUSPENDED ? g : C13598b0.f38549a;
    }

    /* renamed from: f3 */
    public final void mo12820f3(List<? extends db4> list) {
        C87412m.m108594g(list, LoggingConstants.LOG_FILE_PREFIX);
        if (!list.isEmpty()) {
            synchronized (this.f38007e) {
                LinkedList<db4> linkedList = this.f38007e;
                if (linkedList.size() > 1) {
                    C77813z.m93909o(linkedList, new C13429d());
                }
                if (list.size() > 5) {
                    list = list.subList(0, 5);
                }
                for (int size = (list.size() + this.f38007e.size()) - 5; size > 0; size--) {
                    if (!this.f38007e.isEmpty()) {
                        this.f38007e.removeFirst();
                    }
                }
                this.f38007e.addAll(list);
            }
        }
    }

    /* renamed from: g3 */
    public final C11749q mo12821g3() {
        return (C11749q) this.f38013n.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02b6, code lost:
        if (r15.f26357c != false) goto L_0x02c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02bf, code lost:
        if (r15.f26356b != false) goto L_0x02c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01c0, code lost:
        if (r15.f26359e != false) goto L_0x01fa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02ca  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0369  */
    /* JADX WARNING: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008b  */
    /* renamed from: i3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12822i3(int r21, ef1.C7637b r22, te3.C49712hj1 r23, fy3.C32224a<? extends rx3.C13604l<? extends com.tencent.p014mm.plugin.finder.storage.FinderItem, ? extends te3.db4>> r24) {
        /*
            r20 = this;
            r11 = r20
            r4 = r21
            r0 = r22
            rs1.s1$b r1 = rs1.C13426s1.C13428b.STAR
            rs1.s1$b r2 = rs1.C13426s1.C13428b.UNSTAR
            rs1.s1$b r3 = rs1.C13426s1.C13428b.LONG_CLICK_AVATAR
            rs1.s1$b r5 = rs1.C13426s1.C13428b.DEFAULT
            java.lang.String r6 = "event"
            gy3.C87412m.m108594g(r0, r6)
            java.lang.String r6 = "contextObj"
            r7 = r23
            gy3.C87412m.m108594g(r7, r6)
            java.lang.String r6 = "generateStats"
            r8 = r24
            gy3.C87412m.m108594g(r8, r6)
            boolean r6 = r11.f38009g
            if (r6 != 0) goto L_0x0026
            return
        L_0x0026:
            boolean r6 = r0 instanceof df1.C7322a.C7323a
            r9 = 2
            r10 = 3
            r12 = 1
            if (r6 == 0) goto L_0x0056
            df1.a$a r0 = (df1.C7322a.C7323a) r0
            int r0 = r0.f25435b
            r6 = 21
            if (r0 != r6) goto L_0x0037
            r12 = r3
            goto L_0x0089
        L_0x0037:
            r6 = 7
            if (r0 != r6) goto L_0x003d
            rs1.s1$b r0 = rs1.C13426s1.C13428b.LIKE
            goto L_0x0086
        L_0x003d:
            if (r0 != r12) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            if (r0 != r9) goto L_0x0044
        L_0x0042:
            r6 = 1
            goto L_0x0045
        L_0x0044:
            r6 = 0
        L_0x0045:
            if (r6 == 0) goto L_0x004a
            rs1.s1$b r0 = rs1.C13426s1.C13428b.FORWARD
            goto L_0x0086
        L_0x004a:
            r6 = 10
            if (r0 != r6) goto L_0x0050
            r12 = r1
            goto L_0x0089
        L_0x0050:
            r6 = 11
            if (r0 != r6) goto L_0x0088
            r12 = r2
            goto L_0x0089
        L_0x0056:
            boolean r6 = r0 instanceof ef1.C7645n
            if (r6 == 0) goto L_0x0088
            ef1.n r0 = (ef1.C7645n) r0
            long r14 = r0.f25958i
            r11.f38016q = r14
            int r6 = r0.f25951b
            if (r6 == 0) goto L_0x006e
            if (r6 == r9) goto L_0x006e
            if (r6 == r12) goto L_0x006e
            r9 = 8
            if (r6 == r9) goto L_0x006e
            if (r6 != r10) goto L_0x0088
        L_0x006e:
            long r12 = r0.f25964l
            int r17 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r17 == 0) goto L_0x0088
            int r12 = r11.f38015p
            int r0 = r0.f25959j
            if (r12 >= r0) goto L_0x0088
            r11.f38015p = r0
            boolean r0 = r11.f38018s
            if (r0 == 0) goto L_0x0084
            r0 = 0
            r11.f38018s = r0
            goto L_0x0088
        L_0x0084:
            rs1.s1$b r0 = rs1.C13426s1.C13428b.SWITCH_FEED
        L_0x0086:
            r12 = r0
            goto L_0x0089
        L_0x0088:
            r12 = r5
        L_0x0089:
            if (r12 == r5) goto L_0x03c6
            java.lang.String r0 = r11.f38014o
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0095
            r0 = 1
            goto L_0x0096
        L_0x0095:
            r0 = 0
        L_0x0096:
            java.lang.String r5 = " requestObj="
            java.lang.String r13 = "Finder.EnhanceFeedUIC"
            if (r0 == 0) goto L_0x010e
            if (r12 != r2) goto L_0x00ef
            java.lang.Object r0 = r24.invoke()
            rx3.l r0 = (rx3.C13604l) r0
            A r1 = r0.f38555d
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r1
            B r0 = r0.f38556e
            te3.db4 r0 = (te3.db4) r0
            if (r1 != 0) goto L_0x00af
            goto L_0x00ee
        L_0x00af:
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r1.getFeedObject()
            java.lang.String r0 = r11.mo12823j3(r0)
            java.lang.String r2 = r11.f38014o
            boolean r0 = gy3.C87412m.m108589b(r0, r2)
            if (r0 == 0) goto L_0x00cc
            ke1.j r0 = r11.f38008f
            u60.m r0 = r0.f29829a
            r0.mo89360c()
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.f38017r
            r2 = 1
            r0.set(r2)
        L_0x00cc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "[cancelRunningStarEnhance] type="
            r0.append(r2)
            r0.append(r12)
            r0.append(r5)
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            java.lang.String r1 = r11.mo12823j3(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
        L_0x00ee:
            return
        L_0x00ef:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[onDispatch] just return. isRunningTag="
            r0.append(r1)
            java.lang.String r1 = r11.f38014o
            r0.append(r1)
            java.lang.String r1 = " eventType="
            r0.append(r1)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r0)
            return
        L_0x010e:
            java.lang.Object r0 = r24.invoke()
            rx3.l r0 = (rx3.C13604l) r0
            A r2 = r0.f38555d
            r14 = r2
            com.tencent.mm.plugin.finder.storage.FinderItem r14 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r14
            B r0 = r0.f38556e
            r2 = r0
            te3.db4 r2 = (te3.db4) r2
            long r6 = r2.f182692w
            r17 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r0 < 0) goto L_0x03ab
            java.lang.String r0 = "[onEventHappen] tabType="
            java.lang.String r7 = " type="
            if (r14 != 0) goto L_0x014b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r4)
            r1.append(r7)
            r1.append(r12)
            java.lang.String r0 = " feed is null."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
            goto L_0x03c6
        L_0x014b:
            up1.f r6 = up1.C37521f.f99374d
            r6.getClass()
            pe1.c<java.lang.Integer> r6 = up1.C37521f.f99284S5
            java.lang.Object r6 = r6.mo60266n()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r8 = 1
            if (r6 != r8) goto L_0x0161
            r8 = 1
            goto L_0x0162
        L_0x0161:
            r8 = 0
        L_0x0162:
            er1.k0 r15 = r14.getPosTriggerConfig()
            if (r15 != 0) goto L_0x0171
            java.lang.String r10 = "checkEnable posTriggerConfig == null, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r10)
        L_0x016d:
            r24 = r8
            goto L_0x02c4
        L_0x0171:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "checkEnable enableSwitchFeed="
            r6.append(r9)
            boolean r9 = r15.f26358d
            r6.append(r9)
            java.lang.String r9 = " enableLike="
            r6.append(r9)
            boolean r9 = r15.f26356b
            r6.append(r9)
            java.lang.String r9 = " enableForward="
            r6.append(r9)
            boolean r9 = r15.f26357c
            r6.append(r9)
            java.lang.String r9 = " enableStar="
            r6.append(r9)
            boolean r9 = r15.f26359e
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r6)
            android.app.Activity r6 = r20.getContext()
            boolean r6 = r6 instanceof com.tencent.p014mm.plugin.finder.p056ui.FinderShareFeedRelUI
            if (r6 == 0) goto L_0x01c3
            if (r12 != r1) goto L_0x016d
            pe1.c<java.lang.Integer> r6 = up1.C37521f.f99542v8
            java.lang.Object r6 = r6.mo60266n()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r9 = 1
            if (r6 != r9) goto L_0x016d
            boolean r6 = r15.f26359e
            if (r6 == 0) goto L_0x016d
            goto L_0x01fa
        L_0x01c3:
            r9 = 1
            int r6 = r12.ordinal()
            r10 = 4
            if (r6 == 0) goto L_0x02b9
            if (r6 == r9) goto L_0x02b0
            r9 = 2
            if (r6 == r9) goto L_0x01fe
            r9 = 3
            if (r6 == r9) goto L_0x01ea
            if (r6 == r10) goto L_0x01d6
            goto L_0x016d
        L_0x01d6:
            pe1.c<java.lang.Integer> r6 = up1.C37521f.f99542v8
            java.lang.Object r6 = r6.mo60266n()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r9 = 1
            if (r6 != r9) goto L_0x016d
            boolean r9 = r15.f26359e
            if (r9 == 0) goto L_0x016d
            goto L_0x01fa
        L_0x01ea:
            if (r4 != r10) goto L_0x016d
            pe1.c<java.lang.Integer> r9 = up1.C37521f.f99250O6
            java.lang.Object r9 = r9.mo60266n()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r9 <= 0) goto L_0x016d
        L_0x01fa:
            r24 = r8
            goto L_0x02c1
        L_0x01fe:
            if (r4 != r10) goto L_0x016d
            boolean r9 = r15.f26358d
            if (r9 == 0) goto L_0x016d
            java.util.LinkedList<er1.h0> r9 = r15.f26360f
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x020f:
            boolean r15 = r9.hasNext()
            if (r15 == 0) goto L_0x022e
            java.lang.Object r15 = r9.next()
            r6 = r15
            er1.h0 r6 = (er1.C7806h0) r6
            int r6 = r6.f26324a
            r24 = r8
            r8 = 3
            if (r6 != r8) goto L_0x0225
            r6 = 1
            goto L_0x0226
        L_0x0225:
            r6 = 0
        L_0x0226:
            if (r6 == 0) goto L_0x022b
            r10.add(r15)
        L_0x022b:
            r8 = r24
            goto L_0x020f
        L_0x022e:
            r24 = r8
            boolean r6 = r10.isEmpty()
            java.util.Iterator r8 = r10.iterator()
        L_0x0238:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x02ad
            java.lang.Object r9 = r8.next()
            er1.h0 r9 = (er1.C7806h0) r9
            te3.i93 r10 = r2.f182679g
            if (r10 == 0) goto L_0x024b
            int r10 = r10.f183650e
            goto L_0x024c
        L_0x024b:
            r10 = 0
        L_0x024c:
            te3.op4 r15 = r2.f182678f
            if (r15 == 0) goto L_0x0255
            int r15 = r15.f184688e
            r18 = r6
            goto L_0x0258
        L_0x0255:
            r18 = r6
            r15 = 0
        L_0x0258:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r19 = r8
            java.lang.String r8 = "[checkEnable] requestObj="
            r6.append(r8)
            com.tencent.mm.protocal.protobuf.FinderObject r8 = r14.getFeedObject()
            java.lang.String r8 = r11.mo12823j3(r8)
            r6.append(r8)
            java.lang.String r8 = " maxVidPlay="
            r6.append(r8)
            r6.append(r10)
            r8 = 40
            r6.append(r8)
            int r8 = r9.f26325b
            r6.append(r8)
            java.lang.String r8 = "), stayTime="
            r6.append(r8)
            r6.append(r15)
            r8 = 40
            r6.append(r8)
            int r8 = r9.f26326c
            r6.append(r8)
            r8 = 41
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r6)
            int r6 = r9.f26325b
            if (r10 < r6) goto L_0x02a8
            int r6 = r9.f26326c
            if (r15 < r6) goto L_0x02a8
            goto L_0x02c1
        L_0x02a8:
            r6 = r18
            r8 = r19
            goto L_0x0238
        L_0x02ad:
            r18 = r6
            goto L_0x02c6
        L_0x02b0:
            r24 = r8
            if (r4 != r10) goto L_0x02c4
            boolean r6 = r15.f26357c
            if (r6 == 0) goto L_0x02c4
            goto L_0x02c1
        L_0x02b9:
            r24 = r8
            if (r4 != r10) goto L_0x02c4
            boolean r6 = r15.f26356b
            if (r6 == 0) goto L_0x02c4
        L_0x02c1:
            r18 = 1
            goto L_0x02c6
        L_0x02c4:
            r18 = 0
        L_0x02c6:
            if (r18 != 0) goto L_0x02ca
            r9 = 1
            goto L_0x02db
        L_0x02ca:
            if (r12 == r3) goto L_0x02dd
            java.util.concurrent.ConcurrentSkipListSet<java.lang.Long> r3 = r11.f38006d
            long r8 = r14.field_id
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            boolean r3 = r3.contains(r6)
            if (r3 == 0) goto L_0x02dd
            r9 = 2
        L_0x02db:
            r3 = 0
            goto L_0x02e0
        L_0x02dd:
            r3 = r24
            r9 = 0
        L_0x02e0:
            if (r12 == r1) goto L_0x02e4
            r6 = 1
            goto L_0x02e5
        L_0x02e4:
            r6 = 0
        L_0x02e5:
            rs1.s1$a r8 = new rs1.s1$a
            r1 = r9
            long r9 = r14.getId()
            r8.<init>(r9)
            long r9 = android.os.SystemClock.uptimeMillis()
            r8.f38020b = r9
            r9 = 1
            r8.mo12824a(r9)
            er1.k0 r9 = r14.getPosTriggerConfig()
            com.tencent.mm.protocal.protobuf.FinderObject r10 = r14.getFeedObject()
            java.lang.String r15 = " posTriggerConfig="
            if (r3 == 0) goto L_0x0369
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r4)
            r1.append(r7)
            r1.append(r12)
            r1.append(r5)
            java.lang.String r0 = r11.mo12823j3(r10)
            r1.append(r0)
            r1.append(r15)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            if (r6 != 0) goto L_0x0335
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.f38017r
            r1 = 0
            r0.set(r1)
        L_0x0335:
            java.lang.String r0 = r11.mo12823j3(r10)
            r11.f38014o = r0
            r13 = 0
            r15 = 0
            rs1.w1 r16 = new rs1.w1
            r17 = 0
            r0 = r16
            r1 = r2
            r2 = r20
            r3 = r6
            r4 = r21
            r5 = r8
            r6 = r12
            r7 = r23
            r8 = r10
            r9 = r14
            r10 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r4 = 3
            r5 = 0
            r0 = r20
            r1 = r13
            r2 = r15
            r3 = r16
            a14.z1 r0 = bl3.C0317e.launch$default(r0, r1, r2, r3, r4, r5)
            rs1.x1 r1 = new rs1.x1
            r1.<init>(r11)
            r0.mo74515E(r1)
            goto L_0x03c6
        L_0x0369:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "[onEventHappen] disableReason="
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = " tabType="
            r0.append(r1)
            r0.append(r4)
            r0.append(r7)
            r0.append(r12)
            r0.append(r5)
            java.lang.String r1 = r11.mo12823j3(r10)
            r0.append(r1)
            r0.append(r15)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r0)
            r0 = -100
            r8.mo12824a(r0)
            long r0 = android.os.SystemClock.uptimeMillis()
            r8.f38025g = r0
            r0 = 6
            r8.mo12824a(r0)
            goto L_0x03c6
        L_0x03ab:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[onDispatch] exposesTime="
            r0.append(r1)
            long r1 = r2.f182692w
            r0.append(r1)
            java.lang.String r1 = "ms is too short."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r0)
        L_0x03c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C13426s1.mo12822i3(int, ef1.b, te3.hj1, fy3.a):void");
    }

    /* renamed from: j3 */
    public final String mo12823j3(FinderObject finderObject) {
        return C61926c.m72691p(finderObject.f164794id) + '#' + finderObject.nickname;
    }

    public void onCleared() {
        super.onCleared();
        ((C58638b) ((C36570n) this.f38012j).getValue()).mo83523e();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13426s1(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        f38005t.clear();
        this.f38015p = -1;
        this.f38017r = new AtomicBoolean(false);
    }
}
