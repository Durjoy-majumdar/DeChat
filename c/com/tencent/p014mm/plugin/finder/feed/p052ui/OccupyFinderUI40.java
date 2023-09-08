package com.tencent.p014mm.plugin.finder.feed.p052ui;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import ak1.C54108o;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.search.FTSEditTextView;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.sdk.coroutines.LifecycleScopeExtKt;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import je1.C46551y0;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import kotlin.ResultKt;
import ok1.C62042e;
import qk1.C12816m2;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C90363p0;
import vf1.C52867a6;
import vf1.C52868b6;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66218h;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lcom/tencent/mm/ui/search/FTSSearchView$e;", "Lcom/tencent/mm/ui/search/FTSEditTextView$l;", "Landroid/view/View;", "view", "Lrx3/b0;", "onClickBackBtn", "onClickClearTextBtn", "onClickCancelBtn", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI40 */
public final class OccupyFinderUI40 extends MMFinderUI implements FTSSearchView.C6995e, FTSEditTextView.C45051l {

    /* renamed from: z */
    public static final /* synthetic */ int f111584z = 0;

    /* renamed from: o */
    public final String f111585o = "Finder_Sensitive_Word_Search_UI";

    /* renamed from: p */
    public final C13601g f111586p = C36568h.m40985a(new C41446h(this));

    /* renamed from: q */
    public final C13601g f111587q = C36568h.m40985a(new C41444f(this));

    /* renamed from: r */
    public final C13601g f111588r = C36568h.m40985a(new C41441d(this));

    /* renamed from: s */
    public final C13601g f111589s = C36568h.m40985a(new C41440c(this));

    /* renamed from: t */
    public LinkedList<String> f111590t = new LinkedList<>();

    /* renamed from: u */
    public String f111591u = "";

    /* renamed from: v */
    public FTSSearchView f111592v;

    /* renamed from: w */
    public final C12816m2 f111593w;

    /* renamed from: x */
    public KeyboardHeightProvider f111594x;

    /* renamed from: y */
    public boolean f111595y;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI40$a */
    public static final class C41438a extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ OccupyFinderUI40 f111596d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41438a(OccupyFinderUI40 occupyFinderUI40) {
            super(1);
            this.f111596d = occupyFinderUI40;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "word");
            OccupyFinderUI40 occupyFinderUI40 = this.f111596d;
            C12816m2 m2Var = occupyFinderUI40.f111593w;
            m2Var.getClass();
            int indexOf = ((ArrayList) m2Var.f36693e).indexOf(str);
            ((ArrayList) m2Var.f36693e).remove(str);
            m2Var.notifyItemRemoved(indexOf);
            C53895h.m60466d(LifecycleScopeExtKt.getLifecycleScope((AppCompatActivity) occupyFinderUI40), (C66212f) null, (C53934p0) null, new C52867a6(occupyFinderUI40, str, (C15601d<? super C52867a6>) null), 3, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI40$b */
    public static final class C41439b<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ OccupyFinderUI40 f111597a;

        /* renamed from: b */
        public final /* synthetic */ C15601d<Boolean> f111598b;

        /* renamed from: c */
        public final /* synthetic */ int f111599c;

        public C41439b(OccupyFinderUI40 occupyFinderUI40, C15601d<? super Boolean> dVar, int i) {
            this.f111597a = occupyFinderUI40;
            this.f111598b = dVar;
            this.f111599c = i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0094, code lost:
            if (r1 == false) goto L_0x0096;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object call(java.lang.Object r12) {
            /*
                r11 = this;
                ob0.b$c r12 = (ob0.C89132b.C89134c) r12
                com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI40 r0 = r11.f111597a
                int r1 = com.tencent.p014mm.plugin.finder.feed.p052ui.OccupyFinderUI40.f111584z
                rx3.g r0 = r0.f111589s
                rx3.n r0 = (rx3.C36570n) r0
                java.lang.Object r0 = r0.getValue()
                java.lang.String r1 = "<get-loadingView>(...)"
                gy3.C87412m.m108593f(r0, r1)
                android.view.View r0 = (android.view.View) r0
                r1 = 4
                k20.a r10 = new k20.a
                r10.<init>()
                java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r10.mo10233c(r1)
                java.lang.Object[] r3 = r10.mo10232b()
                java.lang.String r4 = "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40$doRequest$2$1"
                java.lang.String r5 = "call"
                java.lang.String r6 = "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)V"
                java.lang.String r7 = "android/view/View_EXEC_"
                java.lang.String r8 = "setVisibility"
                java.lang.String r9 = "(I)V"
                r2 = r0
                j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
                r1 = 0
                java.lang.Object r2 = r10.mo10231a(r1)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r0.setVisibility(r2)
                java.lang.String r3 = "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40$doRequest$2$1"
                java.lang.String r4 = "call"
                java.lang.String r5 = "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)V"
                java.lang.String r6 = "android/view/View_EXEC_"
                java.lang.String r7 = "setVisibility"
                java.lang.String r8 = "(I)V"
                r2 = r0
                j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
                r0 = 1
                if (r12 == 0) goto L_0x0061
                int r2 = r12.f256793a
                if (r2 != 0) goto L_0x0061
                r2 = 1
                goto L_0x0062
            L_0x0061:
                r2 = 0
            L_0x0062:
                java.lang.String r3 = "wordList"
                if (r2 == 0) goto L_0x00a8
                int r2 = r12.f256794b
                if (r2 != 0) goto L_0x00a8
                T r12 = r12.f256796d
                te3.j81 r12 = (te3.C49958j81) r12
                java.util.LinkedList<java.lang.String> r12 = r12.f135917d
                com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI40 r2 = r11.f111597a
                int r4 = r11.f111599c
                gy3.C87412m.m108593f(r12, r3)
                r2.f111590t = r12
                r3 = 3
                if (r4 == r3) goto L_0x0096
                qk1.m2 r3 = r2.f111593w
                rx3.g r3 = r3.f36694f
                rx3.n r3 = (rx3.C36570n) r3
                java.lang.Object r3 = r3.getValue()
                uo3.a r3 = (uo3.C78253a) r3
                boolean r3 = r3.mo108270e()
                if (r3 != 0) goto L_0x0093
                boolean r3 = r2.f111595y
                if (r3 == 0) goto L_0x0094
            L_0x0093:
                r1 = 1
            L_0x0094:
                if (r1 != 0) goto L_0x0099
            L_0x0096:
                com.tencent.p014mm.plugin.finder.feed.p052ui.OccupyFinderUI40.m44799N7(r2, r12)
            L_0x0099:
                wx3.d<java.lang.Boolean> r12 = r11.f111598b
                kotlin.Result$Companion r0 = kotlin.Result.Companion
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)
                r12.resumeWith(r0)
                goto L_0x0137
            L_0x00a8:
                com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI40 r2 = r11.f111597a
                java.lang.String r2 = r2.f111585o
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "errType = "
                r4.append(r5)
                int r5 = r12.f256793a
                r4.append(r5)
                java.lang.String r5 = ", errCode = "
                r4.append(r5)
                int r5 = r12.f256794b
                r4.append(r5)
                java.lang.String r5 = ", errMsg = "
                r4.append(r5)
                java.lang.String r5 = r12.f256795c
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                int r5 = p213oh.C11412b.f33577a
                r5 = 0
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r4, r5)
                T r2 = r12.f256796d
                te3.j81 r2 = (te3.C49958j81) r2
                java.util.LinkedList<java.lang.String> r2 = r2.f135917d
                com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI40 r4 = r11.f111597a
                boolean r6 = r2.isEmpty()
                if (r6 == 0) goto L_0x00e9
                java.util.LinkedList<java.lang.String> r2 = r4.f111590t
            L_0x00e9:
                com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI40 r4 = r11.f111597a
                gy3.C87412m.m108593f(r2, r3)
                r4.f111590t = r2
                com.tencent.p014mm.plugin.finder.feed.p052ui.OccupyFinderUI40.m44799N7(r4, r2)
                com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI40 r2 = r11.f111597a
                java.lang.String r3 = "input_method"
                java.lang.Object r3 = r2.getSystemService(r3)
                java.lang.String r4 = "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"
                gy3.C87412m.m108592e(r3, r4)
                android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3
                com.tencent.mm.ui.search.FTSSearchView r2 = r2.f111592v
                if (r2 == 0) goto L_0x013a
                android.os.IBinder r2 = r2.getWindowToken()
                r3.hideSoftInputFromWindow(r2, r1)
                java.lang.String r12 = r12.f256795c
                com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI40 r2 = r11.f111597a
                int r3 = r12.length()
                if (r3 != 0) goto L_0x0118
                r1 = 1
            L_0x0118:
                if (r1 == 0) goto L_0x0125
                android.content.res.Resources r12 = r2.getResources()
                r0 = 2131828762(0x7f11201a, float:1.9290474E38)
                java.lang.String r12 = r12.getString(r0)
            L_0x0125:
                com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI40 r0 = r11.f111597a
                nj3.C76912y0.m92767f(r0, r12)
                wx3.d<java.lang.Boolean> r12 = r11.f111598b
                kotlin.Result$Companion r0 = kotlin.Result.Companion
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)
                r12.resumeWith(r0)
            L_0x0137:
                rx3.b0 r12 = rx3.C13598b0.f38549a
                return r12
            L_0x013a:
                java.lang.String r12 = "searchView"
                gy3.C87412m.m108603p(r12)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.OccupyFinderUI40.C41439b.call(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI40$c */
    public static final class C41440c extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ OccupyFinderUI40 f111600d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41440c(OccupyFinderUI40 occupyFinderUI40) {
            super(0);
            this.f111600d = occupyFinderUI40;
        }

        public Object invoke() {
            return this.f111600d.findViewById(C0966R.C0970id.g3t);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI40$d */
    public static final class C41441d extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ OccupyFinderUI40 f111601d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41441d(OccupyFinderUI40 occupyFinderUI40) {
            super(0);
            this.f111601d = occupyFinderUI40;
        }

        public Object invoke() {
            return this.f111601d.findViewById(C0966R.C0970id.hgr);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI40$e */
    public static final class C41442e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ OccupyFinderUI40 f111602d;

        /* renamed from: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI40$e$a */
        public static final class C41443a implements C7020t0 {

            /* renamed from: d */
            public final /* synthetic */ OccupyFinderUI40 f111603d;

            public C41443a(OccupyFinderUI40 occupyFinderUI40) {
                this.f111603d = occupyFinderUI40;
            }

            /* renamed from: Q1 */
            public final void mo531Q1(int i, boolean z) {
                this.f111603d.f111595y = i > 0;
            }
        }

        public C41442e(OccupyFinderUI40 occupyFinderUI40) {
            this.f111602d = occupyFinderUI40;
        }

        public final void run() {
            OccupyFinderUI40 occupyFinderUI40 = this.f111602d;
            if (occupyFinderUI40.f111594x == null) {
                occupyFinderUI40.f111594x = new KeyboardHeightProvider(occupyFinderUI40);
                OccupyFinderUI40 occupyFinderUI402 = this.f111602d;
                KeyboardHeightProvider keyboardHeightProvider = occupyFinderUI402.f111594x;
                if (keyboardHeightProvider != null) {
                    keyboardHeightProvider.f220015b = new C41443a(occupyFinderUI402);
                }
            }
            KeyboardHeightProvider keyboardHeightProvider2 = this.f111602d.f111594x;
            if (keyboardHeightProvider2 != null) {
                keyboardHeightProvider2.mo104022e();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI40$f */
    public static final class C41444f extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ OccupyFinderUI40 f111604d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41444f(OccupyFinderUI40 occupyFinderUI40) {
            super(0);
            this.f111604d = occupyFinderUI40;
        }

        public Object invoke() {
            return this.f111604d.findViewById(C0966R.C0970id.is8);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI40$search$1", mo125469f = "OccupyFinderUI40.kt", mo125470l = {108}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI40$g */
    public static final class C41445g extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f111605d;

        /* renamed from: e */
        public final /* synthetic */ OccupyFinderUI40 f111606e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41445g(OccupyFinderUI40 occupyFinderUI40, C15601d<? super C41445g> dVar) {
            super(2, dVar);
            this.f111606e = occupyFinderUI40;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C41445g(this.f111606e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C41445g) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f111605d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OccupyFinderUI40 occupyFinderUI40 = this.f111606e;
                this.f111605d = 1;
                int i2 = OccupyFinderUI40.f111584z;
                obj = occupyFinderUI40.mo64537O7(3, new LinkedList(), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (!((Boolean) obj).booleanValue()) {
                OccupyFinderUI40 occupyFinderUI402 = this.f111606e;
                int i3 = OccupyFinderUI40.f111584z;
                View P7 = occupyFinderUI402.mo64538P7();
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(8);
                C117292a.m165358d(P7, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40$search$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                P7.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(P7, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40$search$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                Object value = ((C36570n) this.f111606e.f111587q).getValue();
                C87412m.m108593f(value, "<get-retryView>(...)");
                View view = (View) value;
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40$search$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40$search$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI40$h */
    public static final class C41446h extends C87413o implements C32224a<RecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ OccupyFinderUI40 f111607d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41446h(OccupyFinderUI40 occupyFinderUI40) {
            super(0);
            this.f111607d = occupyFinderUI40;
        }

        public Object invoke() {
            return (RecyclerView) this.f111607d.findViewById(C0966R.C0970id.o0a);
        }
    }

    public OccupyFinderUI40() {
        C12816m2 m2Var = new C12816m2(this);
        m2Var.f36695g = new C41438a(this);
        this.f111593w = m2Var;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.util.LinkedList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.util.LinkedList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.util.LinkedList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: N7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m44799N7(com.tencent.p014mm.plugin.finder.feed.p052ui.OccupyFinderUI40 r19, java.util.LinkedList r20) {
        /*
            r0 = r19
            java.lang.String r1 = r0.f111591u
            boolean r1 = z04.C112551y.m153811k(r1)
            r1 = r1 ^ 1
            r2 = 0
            if (r1 == 0) goto L_0x0031
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r3 = r20.iterator()
        L_0x0016:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0036
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = r0.f111591u
            r7 = 2
            r8 = 0
            boolean r5 = z04.C112550d0.m153803w(r5, r6, r2, r7, r8)
            if (r5 == 0) goto L_0x0016
            r1.add(r4)
            goto L_0x0016
        L_0x0031:
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
        L_0x0036:
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L_0x0083
            android.view.View r3 = r19.mo64538P7()
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r12.mo10233c(r4)
            java.lang.Object[] r5 = r12.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40"
            java.lang.String r7 = "updateList"
            java.lang.String r8 = "(Ljava/util/LinkedList;)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r4 = r3
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r2 = r12.mo10231a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3.setVisibility(r2)
            java.lang.String r5 = "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40"
            java.lang.String r6 = "updateList"
            java.lang.String r7 = "(Ljava/util/LinkedList;)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x00cb
        L_0x0083:
            android.view.View r3 = r19.mo64538P7()
            r4 = 8
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5.mo10233c(r4)
            java.lang.Object[] r12 = r5.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40"
            java.lang.String r14 = "updateList"
            java.lang.String r15 = "(Ljava/util/LinkedList;)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r3
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r2 = r5.mo10231a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3.setVisibility(r2)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40"
            java.lang.String r13 = "updateList"
            java.lang.String r14 = "(Ljava/util/LinkedList;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
        L_0x00cb:
            qk1.m2 r0 = r0.f111593w
            r0.getClass()
            java.util.List<java.lang.String> r2 = r0.f36693e
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.clear()
            java.util.List<java.lang.String> r2 = r0.f36693e
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.addAll(r1)
            r0.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.OccupyFinderUI40.m44799N7(com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI40, java.util.LinkedList):void");
    }

    /* renamed from: D */
    public void mo3000D(boolean z) {
    }

    /* renamed from: O7 */
    public final Object mo64537O7(int i, LinkedList<String> linkedList, C15601d<? super Boolean> dVar) {
        C66218h hVar = new C66218h(C66447b.m78392b(dVar));
        new C46551y0(i, C66785b.f191882e.mo90662O5(), linkedList).mo9225i().mo123420E(new C41439b(this, hVar, i));
        return hVar.mo90314b();
    }

    /* renamed from: P7 */
    public final View mo64538P7() {
        Object value = ((C36570n) this.f111588r).getValue();
        C87412m.m108593f(value, "<get-noResultView>(...)");
        return (View) value;
    }

    /* renamed from: Q7 */
    public final void mo64539Q7(String str) {
        this.f111591u = str;
        Object value = ((C36570n) this.f111587q).getValue();
        C87412m.m108593f(value, "<get-retryView>(...)");
        View view = (View) value;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40", "search", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40", "search", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View P7 = mo64538P7();
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view3 = P7;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40", "search", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        P7.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40", "search", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        Object value2 = ((C36570n) this.f111589s).getValue();
        C87412m.m108593f(value2, "<get-loadingView>(...)");
        View view4 = (View) value2;
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(0);
        C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40", "search", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40", "search", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C53895h.m60466d(LifecycleScopeExtKt.getLifecycleScope((AppCompatActivity) this), (C66212f) null, (C53934p0) null, new C41445g(this, (C15601d<? super C41445g>) null), 3, (Object) null);
    }

    /* renamed from: b3 */
    public void mo3001b3(String str, String str2, List<FTSSearchView.C6996f> list, FTSEditTextView.C45052m mVar) {
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d4i;
    }

    /* renamed from: m7 */
    public void mo3004m7(int i, FTSSearchView.C6996f fVar) {
    }

    public void onClickBackBtn(View view) {
        hideVKB();
        finish();
    }

    public void onClickCancelBtn(View view) {
        hideVKB();
        finish();
    }

    public void onClickClearTextBtn(View view) {
        FTSSearchView fTSSearchView = this.f111592v;
        if (fTSSearchView != null) {
            fTSSearchView.getFtsEditText().mo70336d();
        } else {
            C87412m.m108603p("searchView");
            throw null;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Object value = ((C36570n) this.f111587q).getValue();
        C87412m.m108593f(value, "<get-retryView>(...)");
        ((View) value).setOnClickListener(new C52868b6(this));
        FTSSearchView fTSSearchView = new FTSSearchView((Context) this, false);
        this.f111592v = fTSSearchView;
        C62042e.f176370a.mo87028N1(fTSSearchView.getFtsEditText().getEditText(), (TextView) null, 20, 10, true, (C32224a<C13598b0>) null);
        FTSSearchView fTSSearchView2 = this.f111592v;
        if (fTSSearchView2 != null) {
            fTSSearchView2.setSearchViewListener(this);
            FTSSearchView fTSSearchView3 = this.f111592v;
            if (fTSSearchView3 != null) {
                fTSSearchView3.getFtsEditText().setHint(getString(C0966R.string.a2p));
                FTSSearchView fTSSearchView4 = this.f111592v;
                if (fTSSearchView4 != null) {
                    fTSSearchView4.getFtsEditText().setFtsEditTextListener(this);
                    FTSSearchView fTSSearchView5 = this.f111592v;
                    if (fTSSearchView5 != null) {
                        fTSSearchView5.getFtsEditText().setCanDeleteTag(false);
                        FTSSearchView fTSSearchView6 = this.f111592v;
                        if (fTSSearchView6 != null) {
                            fTSSearchView6.getFtsEditText().mo70338f();
                            ActionBar supportActionBar = getSupportActionBar();
                            C87412m.m108591d(supportActionBar);
                            FTSSearchView fTSSearchView7 = this.f111592v;
                            if (fTSSearchView7 != null) {
                                supportActionBar.mo91114y(fTSSearchView7);
                                FTSSearchView fTSSearchView8 = this.f111592v;
                                if (fTSSearchView8 != null) {
                                    fTSSearchView8.getFtsEditText().mo70355k();
                                    FTSSearchView fTSSearchView9 = this.f111592v;
                                    if (fTSSearchView9 != null) {
                                        fTSSearchView9.getFtsEditText().mo70361q();
                                        Object value2 = ((C36570n) this.f111586p).getValue();
                                        C87412m.m108593f(value2, "<get-wordList>(...)");
                                        ((RecyclerView) value2).setAdapter(this.f111593w);
                                        Object value3 = ((C36570n) this.f111586p).getValue();
                                        C87412m.m108593f(value3, "<get-wordList>(...)");
                                        ((RecyclerView) value3).setLayoutManager(new LinearLayoutManager(this));
                                        return;
                                    }
                                    C87412m.m108603p("searchView");
                                    throw null;
                                }
                                C87412m.m108603p("searchView");
                                throw null;
                            }
                            C87412m.m108603p("searchView");
                            throw null;
                        }
                        C87412m.m108603p("searchView");
                        throw null;
                    }
                    C87412m.m108603p("searchView");
                    throw null;
                }
                C87412m.m108603p("searchView");
                throw null;
            }
            C87412m.m108603p("searchView");
            throw null;
        }
        C87412m.m108603p("searchView");
        throw null;
    }

    public void onResume() {
        super.onResume();
        getWindow().getDecorView().post(new C41442e(this));
    }

    /* renamed from: y */
    public boolean mo3009y() {
        FTSSearchView fTSSearchView = this.f111592v;
        if (fTSSearchView != null) {
            String obj = fTSSearchView.getFtsEditText().getEditText().getText().toString();
            hideVKB();
            mo64539Q7(obj);
            ((C54108o) C86312j.m106911c(C54108o.class)).Rx0("live_sensitive_word_search", "view_clk", C90363p0.m113143b(new C13604l("sensitive_word", obj)));
            return true;
        }
        C87412m.m108603p("searchView");
        throw null;
    }
}
