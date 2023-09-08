package rs1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8477a0;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60169f4;
import ht1.C60172g4;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import pe3.C89349b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C64414h71;
import up1.C37521f;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: rs1.v2 */
public final class C63654v2 extends UIComponent {

    /* renamed from: d */
    public C64414h71 f180454d;

    /* renamed from: e */
    public C89349b f180455e;

    /* renamed from: f */
    public long f180456f = System.currentTimeMillis();

    /* renamed from: g */
    public C53973z1 f180457g;

    /* renamed from: h */
    public boolean f180458h = true;

    /* renamed from: i */
    public final C13601g f180459i = C36568h.m40985a(new C63655a(this));

    /* renamed from: j */
    public final C13601g f180460j = C36568h.m40985a(C36480b.f97060d);

    /* renamed from: n */
    public int f180461n = -1;

    /* renamed from: o */
    public int f180462o = -1;

    /* renamed from: p */
    public final C13601g f180463p = C36568h.m40985a(new C63656c(this));

    /* renamed from: rs1.v2$b */
    public static final class C36480b extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C36480b f97060d = new C36480b();

        public C36480b() {
            super(0);
        }

        public Object invoke() {
            C37521f.f99374d.getClass();
            return C37521f.f99333Y0.mo60266n();
        }
    }

    /* renamed from: rs1.v2$a */
    public static final class C63655a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C63654v2 f180464d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63655a(C63654v2 v2Var) {
            super(0);
            this.f180464d = v2Var;
        }

        public Object invoke() {
            int i;
            if (!this.f180464d.isBelongFragment() || !(this.f180464d.getFragment() instanceof FinderHomeTabFragment)) {
                i = ((C60172g4) C39818r.f106831a.mo62444c(this.f180464d.getActivity()).mo62447c(C60172g4.class)).mo12864t3();
            } else {
                Fragment fragment = this.f180464d.getFragment();
                C87412m.m108592e(fragment, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment");
                i = ((C60169f4) C86312j.m106911c(C60169f4.class)).mo83328dc(((FinderHomeTabFragment) fragment).f17334o);
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: rs1.v2$c */
    public static final class C63656c extends C87413o implements C32224a<RecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ C63654v2 f180465d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63656c(C63654v2 v2Var) {
            super(0);
            this.f180465d = v2Var;
        }

        public Object invoke() {
            RefreshLoadMoreLayout d3;
            View rootView = this.f180465d.getRootView();
            ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
            if (viewGroup == null || (d3 = this.f180465d.mo88476d3(viewGroup)) == null) {
                return null;
            }
            return d3.getRecyclerView();
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedSafeCheckUIC$startNextSafeCheck$1", mo125469f = "FinderFeedSafeCheckUIC.kt", mo125470l = {172, 174}, mo125471m = "invokeSuspend")
    /* renamed from: rs1.v2$d */
    public static final class C63657d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f180466d;

        /* renamed from: e */
        public int f180467e;

        /* renamed from: f */
        public /* synthetic */ Object f180468f;

        /* renamed from: g */
        public final /* synthetic */ C63654v2 f180469g;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedSafeCheckUIC$startNextSafeCheck$1$1", mo125469f = "FinderFeedSafeCheckUIC.kt", mo125470l = {175}, mo125471m = "invokeSuspend")
        /* renamed from: rs1.v2$d$a */
        public static final class C63658a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public Object f180470d;

            /* renamed from: e */
            public int f180471e;

            /* renamed from: f */
            public final /* synthetic */ C8477a0 f180472f;

            /* renamed from: g */
            public final /* synthetic */ C63654v2 f180473g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C63658a(C8477a0 a0Var, C63654v2 v2Var, C15601d<? super C63658a> dVar) {
                super(2, dVar);
                this.f180472f = a0Var;
                this.f180473g = v2Var;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C63658a(this.f180472f, this.f180473g, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C63658a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C8477a0 a0Var;
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f180471e;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C8477a0 a0Var2 = this.f180472f;
                    C63654v2 v2Var = this.f180473g;
                    this.f180470d = a0Var2;
                    this.f180471e = 1;
                    Object c3 = C63654v2.m74972c3(v2Var, this);
                    if (c3 == aVar) {
                        return aVar;
                    }
                    a0Var = a0Var2;
                    obj = c3;
                } else if (i == 1) {
                    a0Var = (C8477a0) this.f180470d;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0Var.f27482d = ((Boolean) obj).booleanValue();
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63657d(C63654v2 v2Var, C15601d<? super C63657d> dVar) {
            super(2, dVar);
            this.f180469g = v2Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C63657d dVar2 = new C63657d(this.f180469g, dVar);
            dVar2.f180468f = obj;
            return dVar2;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C63657d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00c2 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00fc  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r14.f180467e
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L_0x002f
                if (r1 == r4) goto L_0x0021
                if (r1 != r2) goto L_0x0019
                java.lang.Object r1 = r14.f180466d
                gy3.a0 r1 = (gy3.C8477a0) r1
                java.lang.Object r5 = r14.f180468f
                a14.n0 r5 = (a14.C0000n0) r5
                kotlin.ResultKt.throwOnFailure(r15)
                goto L_0x003e
            L_0x0019:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L_0x0021:
                java.lang.Object r1 = r14.f180466d
                gy3.a0 r1 = (gy3.C8477a0) r1
                java.lang.Object r5 = r14.f180468f
                a14.n0 r5 = (a14.C0000n0) r5
                kotlin.ResultKt.throwOnFailure(r15)
                r15 = r14
                goto L_0x00a5
            L_0x002f:
                kotlin.ResultKt.throwOnFailure(r15)
                java.lang.Object r15 = r14.f180468f
                a14.n0 r15 = (a14.C0000n0) r15
                gy3.a0 r1 = new gy3.a0
                r1.<init>()
                r1.f27482d = r4
                r5 = r15
            L_0x003e:
                r15 = r14
            L_0x003f:
                boolean r6 = r1.f27482d
                if (r6 == 0) goto L_0x00fc
                boolean r6 = a14.C53930o0.m60560g(r5)
                if (r6 == 0) goto L_0x00fc
                rs1.v2 r6 = r15.f180469g
                int r6 = r6.mo88478f3()
                java.lang.String r7 = "FinderFeedSafeCheckUIC"
                if (r6 <= 0) goto L_0x00c3
                rs1.v2 r6 = r15.f180469g
                int r6 = r6.mo88479g3()
                if (r6 > 0) goto L_0x005c
                goto L_0x00c3
            L_0x005c:
                rs1.v2 r6 = r15.f180469g
                int r6 = r6.mo88478f3()
                int r6 = r6 * 1000
                long r8 = (long) r6
                long r10 = java.lang.System.currentTimeMillis()
                rs1.v2 r6 = r15.f180469g
                long r12 = r6.f180456f
                long r10 = r10 - r12
                long r8 = r8 - r10
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r10 = "startNextSafeCheck: delay="
                r6.append(r10)
                r6.append(r8)
                java.lang.String r10 = ", intervalSec="
                r6.append(r10)
                rs1.v2 r10 = r15.f180469g
                int r10 = r10.mo88478f3()
                r6.append(r10)
                java.lang.String r6 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
                r6 = 0
                int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r10 <= 0) goto L_0x00a5
                r15.f180468f = r5
                r15.f180466d = r1
                r15.f180467e = r4
                java.lang.Object r6 = a14.C53965x0.m60607b(r8, r15)
                if (r6 != r0) goto L_0x00a5
                return r0
            L_0x00a5:
                rs1.v2 r6 = r15.f180469g
                a14.n0 r6 = r6.getMainScope()
                wx3.f r6 = r6.getCoroutineContext()
                rs1.v2$d$a r7 = new rs1.v2$d$a
                rs1.v2 r8 = r15.f180469g
                r7.<init>(r1, r8, r3)
                r15.f180468f = r5
                r15.f180466d = r1
                r15.f180467e = r2
                java.lang.Object r6 = a14.C53895h.m60469g(r6, r7, r15)
                if (r6 != r0) goto L_0x003f
                return r0
            L_0x00c3:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "startNextSafeCheck: not support feed safe check 2, intervalSce="
                r0.append(r1)
                rs1.v2 r1 = r15.f180469g
                int r1 = r1.mo88478f3()
                r0.append(r1)
                java.lang.String r1 = ", lastFeedCount="
                r0.append(r1)
                rs1.v2 r1 = r15.f180469g
                int r1 = r1.mo88479g3()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)
                rs1.v2 r0 = r15.f180469g
                a14.z1 r0 = r0.f180457g
                if (r0 == 0) goto L_0x00f5
                a14.C53973z1.C53974a.m60623a(r0, r3, r4, r3)
            L_0x00f5:
                rs1.v2 r15 = r15.f180469g
                r15.f180457g = r3
                rx3.b0 r15 = rx3.C13598b0.f38549a
                return r15
            L_0x00fc:
                rx3.b0 r15 = rx3.C13598b0.f38549a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: rs1.C63654v2.C63657d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63654v2(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: com.tencent.mm.plugin.finder.view.w6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: com.tencent.mm.view.recyclerview.WxRecyclerAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: com.tencent.mm.view.recyclerview.WxRecyclerAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: com.tencent.mm.view.recyclerview.WxRecyclerAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: com.tencent.mm.view.recyclerview.WxRecyclerAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: com.tencent.mm.view.recyclerview.WxRecyclerAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: com.tencent.mm.view.recyclerview.WxRecyclerAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: com.tencent.mm.view.recyclerview.WxRecyclerAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: com.tencent.mm.view.recyclerview.WxRecyclerAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: com.tencent.mm.plugin.finder.view.w6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: com.tencent.mm.plugin.finder.view.w6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: com.tencent.mm.view.recyclerview.WxRecyclerAdapter} */
    /* JADX WARNING: type inference failed for: r0v10, types: [int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0397 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x03d1  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m74972c3(rs1.C63654v2 r23, wx3.C15601d r24) {
        /*
            r0 = r23
            r1 = r24
            r23.getClass()
            boolean r2 = r1 instanceof rs1.C63670y2
            if (r2 == 0) goto L_0x001a
            r2 = r1
            rs1.y2 r2 = (rs1.C63670y2) r2
            int r3 = r2.f180499j
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001a
            int r3 = r3 - r4
            r2.f180499j = r3
            goto L_0x001f
        L_0x001a:
            rs1.y2 r2 = new rs1.y2
            r2.<init>(r0, r1)
        L_0x001f:
            java.lang.Object r1 = r2.f180497h
            xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
            int r4 = r2.f180499j
            r6 = 3
            r7 = 2
            r9 = 1
            if (r4 == 0) goto L_0x0069
            if (r4 == r9) goto L_0x004e
            if (r4 == r7) goto L_0x0041
            if (r4 != r6) goto L_0x0039
            java.lang.Object r0 = r2.f180493d
            bi1.e r0 = (bi1.C0287e) r0
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x03ef
        L_0x0039:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0041:
            java.lang.Object r0 = r2.f180494e
            bi1.e r0 = (bi1.C0287e) r0
            java.lang.Object r4 = r2.f180493d
            rs1.v2 r4 = (rs1.C63654v2) r4
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x03c8
        L_0x004e:
            int r0 = r2.f180496g
            java.lang.Object r4 = r2.f180495f
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r10 = r2.f180494e
            androidx.recyclerview.widget.RecyclerView$e r10 = (androidx.recyclerview.widget.RecyclerView.C16613e) r10
            java.lang.Object r11 = r2.f180493d
            rs1.v2 r11 = (rs1.C63654v2) r11
            kotlin.ResultKt.throwOnFailure(r1)
            r19 = r4
            r18 = r10
            r5 = 1
            r4 = r1
            r1 = r0
            r0 = r11
            goto L_0x0389
        L_0x0069:
            kotlin.ResultKt.throwOnFailure(r1)
            te3.h71 r1 = r0.f180454d
            if (r1 == 0) goto L_0x0072
            r1 = 1
            goto L_0x0073
        L_0x0072:
            r1 = 0
        L_0x0073:
            if (r1 == 0) goto L_0x008e
            rx3.g r4 = r0.f180463p
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            if (r4 == 0) goto L_0x0086
            androidx.recyclerview.widget.RecyclerView$e r4 = r4.getAdapter()
            goto L_0x0087
        L_0x0086:
            r4 = 0
        L_0x0087:
            boolean r10 = r4 instanceof com.tencent.p014mm.plugin.finder.view.C4202w6
            if (r10 == 0) goto L_0x00a8
            com.tencent.mm.plugin.finder.view.w6 r4 = (com.tencent.p014mm.plugin.finder.view.C4202w6) r4
            goto L_0x00a6
        L_0x008e:
            rx3.g r4 = r0.f180463p
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            if (r4 == 0) goto L_0x009f
            androidx.recyclerview.widget.RecyclerView$e r4 = r4.getAdapter()
            goto L_0x00a0
        L_0x009f:
            r4 = 0
        L_0x00a0:
            boolean r10 = r4 instanceof com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter
            if (r10 == 0) goto L_0x00a8
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r4 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r4
        L_0x00a6:
            r10 = r4
            goto L_0x00a9
        L_0x00a8:
            r10 = 0
        L_0x00a9:
            java.lang.String r4 = ", lastFeedCount="
            java.lang.String r11 = "FinderFeedSafeCheckUIC"
            if (r10 != 0) goto L_0x00e8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "startCheck: adapter is null, recyclerView="
            r1.append(r2)
            rx3.g r2 = r0.f180463p
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            r1.append(r2)
            java.lang.String r2 = ", intervalSce="
            r1.append(r2)
            int r2 = r23.mo88478f3()
            r1.append(r2)
            r1.append(r4)
            int r0 = r23.mo88479g3()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            goto L_0x03f1
        L_0x00e8:
            if (r1 == 0) goto L_0x010c
            r12 = r10
            com.tencent.mm.plugin.finder.view.w6 r12 = (com.tencent.p014mm.plugin.finder.view.C4202w6) r12
            java.util.List r12 = r12.getData()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r12 = r12.iterator()
        L_0x00fa:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L_0x012e
            java.lang.Object r14 = r12.next()
            boolean r15 = r14 instanceof al1.C54127h
            if (r15 == 0) goto L_0x00fa
            r13.add(r14)
            goto L_0x00fa
        L_0x010c:
            r12 = r10
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r12 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r12
            java.util.List r12 = r12.getData()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r12 = r12.iterator()
        L_0x011c:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L_0x012e
            java.lang.Object r14 = r12.next()
            boolean r15 = r14 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r15 == 0) goto L_0x011c
            r13.add(r14)
            goto L_0x011c
        L_0x012e:
            boolean r12 = r13.isEmpty()
            java.lang.String r14 = ", isLiveFlow="
            if (r12 == 0) goto L_0x0169
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "startCheck: feedList is empty, intervalSce="
            r2.append(r3)
            int r3 = r23.mo88478f3()
            r2.append(r3)
            r2.append(r4)
            int r3 = r23.mo88479g3()
            r2.append(r3)
            r2.append(r14)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r1)
            long r1 = java.lang.System.currentTimeMillis()
            r0.f180456f = r1
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            goto L_0x03f1
        L_0x0169:
            int r12 = r13.size()
            int r15 = r23.mo88479g3()
            if (r12 > r15) goto L_0x0175
            r12 = r13
            goto L_0x017f
        L_0x0175:
            int r15 = r23.mo88479g3()
            int r15 = r12 - r15
            java.util.List r12 = r13.subList(r15, r12)
        L_0x017f:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r5 = 10
            if (r1 == 0) goto L_0x0254
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r16 = r12.iterator()
        L_0x0196:
            boolean r17 = r16.hasNext()
            java.lang.String r7 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.viewmodel.data.FinderLiveData"
            if (r17 == 0) goto L_0x01b4
            java.lang.Object r8 = r16.next()
            r9 = r8
            tf1.m r9 = (tf1.C13914m) r9
            gy3.C87412m.m108592e(r9, r7)
            al1.h r9 = (al1.C54127h) r9
            boolean r7 = r9.f151982i
            if (r7 == 0) goto L_0x01b1
            r6.add(r8)
        L_0x01b1:
            r7 = 2
            r9 = 1
            goto L_0x0196
        L_0x01b4:
            java.util.ArrayList r8 = new java.util.ArrayList
            int r9 = sx3.C36907w.m41090l(r6, r5)
            r8.<init>(r9)
            java.util.Iterator r6 = r6.iterator()
        L_0x01c1:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x01e5
            java.lang.Object r9 = r6.next()
            tf1.m r9 = (tf1.C13914m) r9
            gy3.C87412m.m108592e(r9, r7)
            al1.h r9 = (al1.C54127h) r9
            com.tencent.mm.live.api.LiveConfig r9 = r9.f151977d
            r17 = r6
            long r5 = r9.f157075s
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r5)
            r8.add(r9)
            r6 = r17
            r5 = 10
            goto L_0x01c1
        L_0x01e5:
            r13.addAll(r8)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r12.iterator()
        L_0x01f1:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0220
            java.lang.Object r8 = r6.next()
            r9 = r8
            tf1.m r9 = (tf1.C13914m) r9
            gy3.C87412m.m108592e(r9, r7)
            al1.h r9 = (al1.C54127h) r9
            com.tencent.mm.live.api.LiveConfig r9 = r9.f151977d
            r21 = r10
            long r9 = r9.f157075s
            r17 = r6
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r9)
            boolean r6 = r13.contains(r6)
            r9 = 1
            r6 = r6 ^ r9
            if (r6 == 0) goto L_0x021b
            r5.add(r8)
        L_0x021b:
            r6 = r17
            r10 = r21
            goto L_0x01f1
        L_0x0220:
            r21 = r10
            java.util.ArrayList r6 = new java.util.ArrayList
            r8 = 10
            int r8 = sx3.C36907w.m41090l(r5, r8)
            r6.<init>(r8)
            java.util.Iterator r5 = r5.iterator()
        L_0x0231:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x024f
            java.lang.Object r8 = r5.next()
            tf1.m r8 = (tf1.C13914m) r8
            gy3.C87412m.m108592e(r8, r7)
            al1.h r8 = (al1.C54127h) r8
            com.tencent.mm.live.api.LiveConfig r8 = r8.f151977d
            long r8 = r8.f157075s
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r8)
            r6.add(r10)
            goto L_0x0231
        L_0x024f:
            r15.addAll(r6)
            goto L_0x0311
        L_0x0254:
            r21 = r10
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r12.iterator()
        L_0x025f:
            boolean r7 = r6.hasNext()
            java.lang.String r8 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed"
            if (r7 == 0) goto L_0x027d
            java.lang.Object r7 = r6.next()
            r9 = r7
            tf1.m r9 = (tf1.C13914m) r9
            gy3.C87412m.m108592e(r9, r8)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r9 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r9
            boolean r8 = r9.mo3515p()
            if (r8 == 0) goto L_0x025f
            r5.add(r7)
            goto L_0x025f
        L_0x027d:
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r9 = sx3.C36907w.m41090l(r5, r7)
            r6.<init>(r9)
            java.util.Iterator r5 = r5.iterator()
        L_0x028c:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x02aa
            java.lang.Object r7 = r5.next()
            tf1.m r7 = (tf1.C13914m) r7
            gy3.C87412m.m108592e(r7, r8)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r7 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r7
            long r9 = r7.getItemId()
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r9)
            r6.add(r7)
            goto L_0x028c
        L_0x02aa:
            r13.addAll(r6)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r12.iterator()
        L_0x02b6:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x02e1
            java.lang.Object r7 = r6.next()
            r9 = r7
            tf1.m r9 = (tf1.C13914m) r9
            gy3.C87412m.m108592e(r9, r8)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r9 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r9
            long r9 = r9.getItemId()
            r17 = r6
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r9)
            boolean r6 = r13.contains(r6)
            r9 = 1
            r6 = r6 ^ r9
            if (r6 == 0) goto L_0x02de
            r5.add(r7)
        L_0x02de:
            r6 = r17
            goto L_0x02b6
        L_0x02e1:
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = sx3.C36907w.m41090l(r5, r7)
            r6.<init>(r7)
            java.util.Iterator r5 = r5.iterator()
        L_0x02f0:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x030e
            java.lang.Object r7 = r5.next()
            tf1.m r7 = (tf1.C13914m) r7
            gy3.C87412m.m108592e(r7, r8)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r7 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r7
            long r9 = r7.getItemId()
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r9)
            r6.add(r7)
            goto L_0x02f0
        L_0x030e:
            r15.addAll(r6)
        L_0x0311:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "startCheck: hasReadSize="
            r5.append(r6)
            int r6 = r13.size()
            r5.append(r6)
            java.lang.String r6 = ", unreadSize="
            r5.append(r6)
            int r6 = r15.size()
            r5.append(r6)
            r5.append(r4)
            int r4 = r23.mo88479g3()
            r5.append(r4)
            r5.append(r14)
            r5.append(r1)
            java.lang.String r4 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r4)
            rs1.d r4 = new rs1.d
            bl3.r r5 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r6 = r23.getActivity()
            bl3.r$a r5 = r5.mo62444c(r6)
            java.lang.Class<ht1.g4> r6 = ht1.C60172g4.class
            bl3.c r5 = r5.mo62447c(r6)
            ht1.g4 r5 = (ht1.C60172g4) r5
            te3.hj1 r18 = r5.mo12861q3()
            pe3.b r5 = r0.f180455e
            te3.h71 r6 = r0.f180454d
            r7 = r15
            r15 = r4
            r16 = r7
            r17 = r13
            r19 = r5
            r20 = r6
            r15.<init>(r16, r17, r18, r19, r20)
            r2.f180493d = r0
            r8 = r21
            r2.f180494e = r8
            r2.f180495f = r12
            r2.f180496g = r1
            r5 = 1
            r2.f180499j = r5
            r6 = 0
            java.lang.Object r4 = bi1.C0283d.m245c(r4, r6, r2, r5, r6)
            if (r4 != r3) goto L_0x0385
            goto L_0x03f1
        L_0x0385:
            r18 = r8
            r19 = r12
        L_0x0389:
            bi1.e r4 = (bi1.C0287e) r4
            a14.n0 r6 = r0.getMainScope()
            wx3.f r6 = r6.getCoroutineContext()
            boolean r7 = r4 instanceof bi1.C0288f
            if (r7 == 0) goto L_0x03cd
            if (r6 != 0) goto L_0x03a1
            wx3.f r6 = r4.f854a
            if (r6 != 0) goto L_0x03a1
            wx3.f r6 = r2.getContext()
        L_0x03a1:
            rs1.x2 r7 = new rs1.x2
            r15 = 0
            if (r1 == 0) goto L_0x03a9
            r17 = 1
            goto L_0x03ab
        L_0x03a9:
            r17 = 0
        L_0x03ab:
            r13 = r7
            r14 = r4
            r16 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r2.f180493d = r0
            r2.f180494e = r4
            r1 = 0
            r2.f180495f = r1
            r1 = 2
            r2.f180499j = r1
            java.lang.Object r1 = a14.C53895h.m60469g(r6, r7, r2)
            if (r1 != r3) goto L_0x03c3
            goto L_0x03f1
        L_0x03c3:
            r22 = r4
            r4 = r0
            r0 = r22
        L_0x03c8:
            r22 = r4
            r4 = r0
            r0 = r22
        L_0x03cd:
            boolean r1 = r4 instanceof bi1.C0281b
            if (r1 == 0) goto L_0x03ef
            wx3.f r1 = r4.f854a
            if (r1 != 0) goto L_0x03d9
            wx3.f r1 = r2.getContext()
        L_0x03d9:
            rs1.w2 r5 = new rs1.w2
            r6 = 0
            r5.<init>(r4, r6, r0)
            r2.f180493d = r4
            r2.f180494e = r6
            r2.f180495f = r6
            r0 = 3
            r2.f180499j = r0
            java.lang.Object r0 = a14.C53895h.m60469g(r1, r5, r2)
            if (r0 != r3) goto L_0x03ef
            goto L_0x03f1
        L_0x03ef:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
        L_0x03f1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C63654v2.m74972c3(rs1.v2, wx3.d):java.lang.Object");
    }

    /* renamed from: d3 */
    public final RefreshLoadMoreLayout mo88476d3(ViewGroup viewGroup) {
        RefreshLoadMoreLayout d3;
        int childCount = viewGroup.getChildCount();
        int i = 0;
        while (true) {
            ViewGroup viewGroup2 = null;
            if (i >= childCount) {
                return null;
            }
            KeyEvent.Callback childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                if (childAt instanceof RefreshLoadMoreLayout) {
                    return (RefreshLoadMoreLayout) childAt;
                }
                if (childAt instanceof ViewGroup) {
                    viewGroup2 = (ViewGroup) childAt;
                }
                if (!(viewGroup2 == null || (d3 = mo88476d3(viewGroup2)) == null)) {
                    return d3;
                }
            }
            i++;
        }
    }

    /* renamed from: e3 */
    public final int mo88477e3() {
        return ((Number) this.f180459i.getValue()).intValue();
    }

    /* renamed from: f3 */
    public final int mo88478f3() {
        if (((Number) ((C36570n) this.f180460j).getValue()).intValue() > 0) {
            return ((Number) ((C36570n) this.f180460j).getValue()).intValue();
        }
        int i = this.f180461n;
        return i == -1 ? C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_FEED_SAFE_CHECK_INTERVAL_SEC_INT_SYNC, 0) : i;
    }

    /* renamed from: g3 */
    public final int mo88479g3() {
        int i = this.f180462o;
        return i == -1 ? C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_FEED_SAFE_CHECK_LAST_COUNT_INT_SYNC, 0) : i;
    }

    /* renamed from: i3 */
    public final void mo88480i3() {
        boolean z = true;
        if (mo88478f3() <= 0 || mo88479g3() <= 0) {
            Log.m105928w("FinderFeedSafeCheckUIC", "startNextSafeCheck: not support feed safe check 1, intervalSce=" + mo88478f3() + ", lastFeedCount=" + mo88479g3());
            C53973z1 z1Var = this.f180457g;
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            this.f180457g = null;
            return;
        }
        C53973z1 z1Var2 = this.f180457g;
        if (z1Var2 == null || !z1Var2.mo74466a()) {
            z = false;
        }
        if (!z) {
            this.f180457g = C53895h.m60466d(getLifecycleScope(), (C66212f) null, (C53934p0) null, new C63657d(this, (C15601d<? super C63657d>) null), 3, (Object) null);
        }
    }

    public void onPause() {
        Log.m105924i("FinderFeedSafeCheckUIC", "onPause: activity=" + getActivity().getClass().getSimpleName() + ", commentScene=" + mo88477e3());
        C53973z1 z1Var = this.f180457g;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f180457g = null;
    }

    public void onResume() {
        Log.m105924i("FinderFeedSafeCheckUIC", "onResume: activity=" + getActivity().getClass().getSimpleName() + ", commentScene=" + mo88477e3() + ", isUserVisibleFocused=" + isUserVisibleFocused());
        if (isUserVisibleFocused()) {
            mo88480i3();
        }
    }

    public void onUserVisibleFocused() {
        super.onUserVisibleFocused();
        Log.m105924i("FinderFeedSafeCheckUIC", "onUserVisibleFocused: activity=" + getActivity().getClass().getSimpleName() + ", commentScene=" + mo88477e3() + ", isFirstUserVisibleFocus=" + this.f180458h);
        if (this.f180458h) {
            this.f180456f = System.currentTimeMillis();
            this.f180458h = false;
        }
        mo88480i3();
    }

    public void onUserVisibleUnFocused() {
        super.onUserVisibleUnFocused();
        Log.m105924i("FinderFeedSafeCheckUIC", "onUserVisibleUnFocused: activity=" + getActivity().getClass().getSimpleName() + ", commentScene=" + mo88477e3());
        C53973z1 z1Var = this.f180457g;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f180457g = null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63654v2(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
