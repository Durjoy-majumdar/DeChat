package rs1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.search.FTSEditTextView;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.recyclerview.WxLinearLayoutManager;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.p014mm.view.refreshLayout.WxRefreshLayout;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import ek2.C58623i;
import ek2.C7734g;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import h81.C59774i;
import hp1.C46091u0;
import hp1.C60055x0;
import hp1.C8703w0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import jq3.C33631s;
import jq3.C60905o;
import jq3.C60907t;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kj2.C117407d;
import kotlin.ResultKt;
import p145dx.C58449n;
import p145dx.C58455v;
import p145dx.C58457w;
import pj2.C62323d;
import qq3.C63318b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import vp1.C65838f;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: rs1.rb */
public final class C63625rb extends UIComponent implements FTSSearchView.C6995e, FTSEditTextView.C45051l {

    /* renamed from: d */
    public final String f180396d = "MicroMsg.RingtoneSearchMainUIC";

    /* renamed from: e */
    public final C13601g f180397e = C36568h.m40985a(new C63632g(this));

    /* renamed from: f */
    public final C13601g f180398f = C36568h.m40985a(new C63636j(this));

    /* renamed from: g */
    public final C13601g f180399g = C36568h.m40985a(new C63627b(this));

    /* renamed from: h */
    public final C13601g f180400h = C36568h.m40985a(new C63626a(this));

    /* renamed from: i */
    public final C13601g f180401i;

    /* renamed from: j */
    public C60055x0 f180402j;

    /* renamed from: n */
    public C46091u0 f180403n;

    /* renamed from: o */
    public WxRecyclerAdapter<C62323d> f180404o;

    /* renamed from: p */
    public WxLinearLayoutManager f180405p;

    /* renamed from: q */
    public final C58623i f180406q;

    /* renamed from: r */
    public boolean f180407r;

    /* renamed from: s */
    public int f180408s;

    /* renamed from: t */
    public final int f180409t;

    /* renamed from: u */
    public final C63633h f180410u;

    /* renamed from: rs1.rb$a */
    public static final class C63626a extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C63625rb f180411d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63626a(C63625rb rbVar) {
            super(0);
            this.f180411d = rbVar;
        }

        public Object invoke() {
            return this.f180411d.findViewById(C0966R.C0970id.g3e);
        }
    }

    /* renamed from: rs1.rb$b */
    public static final class C63627b extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C63625rb f180412d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63627b(C63625rb rbVar) {
            super(0);
            this.f180412d = rbVar;
        }

        public Object invoke() {
            return this.f180412d.findViewById(C0966R.C0970id.hgp);
        }
    }

    /* renamed from: rs1.rb$c */
    public static final class C63628c implements C63318b {

        /* renamed from: a */
        public final /* synthetic */ C63625rb f180413a;

        public C63628c(C63625rb rbVar) {
            this.f180413a = rbVar;
        }

        /* renamed from: a */
        public void mo3374a(boolean z) {
        }

        public void onLoadMore() {
            this.f180413a.f180407r = true;
            ((C58457w) C86312j.m106911c(C58457w.class)).mo82793VA(this.f180413a.getActivity()).mo75826K(false);
        }
    }

    /* renamed from: rs1.rb$d */
    public static final class C63629d extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ C63625rb f180414d;

        public C63629d(C63625rb rbVar) {
            this.f180414d = rbVar;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC$onCreateAfter$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 1) {
                ((C58457w) C86312j.m106911c(C58457w.class)).mo82784Bt(this.f180414d.getActivity()).mo80831e2().postValue(Boolean.TRUE);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC$onCreateAfter$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC$onCreateAfter$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            super.onScrolled(recyclerView, i, i2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC$onCreateAfter$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: rs1.rb$e */
    public static final class C63630e implements C58623i.C58624a {

        /* renamed from: a */
        public final /* synthetic */ C63625rb f180415a;

        public C63630e(C63625rb rbVar) {
            this.f180415a = rbVar;
        }

        public void onPageSelected(int i) {
            C63625rb rbVar = this.f180415a;
            int i2 = rbVar.f180408s;
            if (i2 != i) {
                WxRecyclerAdapter<C62323d> wxRecyclerAdapter = rbVar.f180404o;
                if (wxRecyclerAdapter != null) {
                    wxRecyclerAdapter.notifyItemChanged(i2, Boolean.FALSE);
                }
                WxRecyclerAdapter<C62323d> wxRecyclerAdapter2 = this.f180415a.f180404o;
                if (wxRecyclerAdapter2 != null) {
                    wxRecyclerAdapter2.notifyItemChanged(i, Boolean.TRUE);
                }
            }
            this.f180415a.f180408s = i;
        }
    }

    /* renamed from: rs1.rb$f */
    public static final class C63631f extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ C63625rb f180416d;

        public C63631f(C63625rb rbVar) {
            this.f180416d = rbVar;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC$onCreateAfter$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            super.onScrollStateChanged(recyclerView, i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC$onCreateAfter$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC$onCreateAfter$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            int childCount = recyclerView.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = recyclerView.getChildAt(i3);
                RecyclerView.C16631z P0 = recyclerView.mo17031P0(childAt);
                C87412m.m108592e(P0, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.SimpleViewHolder");
                int top = childAt.getTop();
                C63625rb rbVar = this.f180416d;
                double min = Math.min(((double) Math.abs((top - rbVar.f180406q.f167846f) - rbVar.f180409t)) / ((double) childAt.getHeight()), 1.0d) * 0.5d;
                View D = ((C60905o) P0).mo85812D(C0966R.C0970id.o3f);
                if (D != null) {
                    D.setBackground(new ColorDrawable(Color.argb((int) (min * ((double) 255)), 0, 0, 0)));
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC$onCreateAfter$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: rs1.rb$g */
    public static final class C63632g extends C87413o implements C32224a<WxRefreshLayout> {

        /* renamed from: d */
        public final /* synthetic */ C63625rb f180417d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63632g(C63625rb rbVar) {
            super(0);
            this.f180417d = rbVar;
        }

        public Object invoke() {
            return (WxRefreshLayout) this.f180417d.findViewById(C0966R.C0970id.ivb);
        }
    }

    /* renamed from: rs1.rb$h */
    public static final class C63633h implements C60907t {

        /* renamed from: a */
        public final /* synthetic */ C63625rb f180418a;

        /* renamed from: b */
        public final /* synthetic */ AppCompatActivity f180419b;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.viewmodel.component.RingtoneSearchMainUIC$scrollListener$1$onScrollStatsChanged$1", mo125469f = "RingtoneSearchMainUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: rs1.rb$h$a */
        public static final class C63634a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ LinkedList<C33631s> f180420d;

            /* renamed from: e */
            public final /* synthetic */ AppCompatActivity f180421e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C63634a(LinkedList<C33631s> linkedList, AppCompatActivity appCompatActivity, C15601d<? super C63634a> dVar) {
                super(2, dVar);
                this.f180420d = linkedList;
                this.f180421e = appCompatActivity;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C63634a(this.f180420d, this.f180421e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C63634a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                LinkedList<C33631s> linkedList = this.f180420d;
                AppCompatActivity appCompatActivity = this.f180421e;
                for (C33631s sVar : linkedList) {
                    C58455v mh = ((C58457w) C86312j.m106911c(C58457w.class)).mo82796mh(appCompatActivity);
                    int i = sVar.f91022c;
                    C9493c cVar = sVar.f91020a;
                    C58455v.C58456a.m67861a(mh, 1, i, cVar instanceof C62323d ? (C62323d) cVar : null, 0, 8, (Object) null);
                }
                return C13598b0.f38549a;
            }
        }

        public C63633h(C63625rb rbVar, AppCompatActivity appCompatActivity) {
            this.f180418a = rbVar;
            this.f180419b = appCompatActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x001b, code lost:
            r0 = r0.getData();
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo2587a(androidx.recyclerview.widget.RecyclerView r7, jq3.C60906r r8) {
            /*
                r6 = this;
                java.lang.String r0 = "recyclerView"
                gy3.C87412m.m108594g(r7, r0)
                java.lang.String r7 = "data"
                gy3.C87412m.m108594g(r8, r7)
                rs1.rb r7 = r6.f180418a
                java.lang.String r7 = r7.f180396d
                java.lang.String r0 = "onScrollStatsChanged"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
                int r7 = r8.f173509e
                rs1.rb r0 = r6.f180418a
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.d> r0 = r0.f180404o
                if (r0 == 0) goto L_0x0026
                java.util.List r0 = r0.getData()
                if (r0 == 0) goto L_0x0026
                int r0 = r0.size()
                goto L_0x0027
            L_0x0026:
                r0 = 0
            L_0x0027:
                rs1.rb r1 = r6.f180418a
                boolean r2 = r1.f180407r
                if (r2 != 0) goto L_0x0043
                r2 = -1
                if (r7 == r2) goto L_0x0043
                int r7 = r0 - r7
                r2 = 10
                if (r7 > r2) goto L_0x0043
                if (r0 <= 0) goto L_0x0043
                com.tencent.mm.view.refreshLayout.WxRefreshLayout r7 = r1.mo88467e3()
                qq3.b r7 = r7.f56672p
                if (r7 == 0) goto L_0x0043
                r7.onLoadMore()
            L_0x0043:
                java.util.LinkedList<jq3.s> r7 = r8.f173513i
                boolean r8 = r7.isEmpty()
                r8 = r8 ^ 1
                if (r8 == 0) goto L_0x0062
                rs1.rb r8 = r6.f180418a
                a14.n0 r0 = r8.getLifecycleScope()
                r1 = 0
                r2 = 0
                rs1.rb$h$a r3 = new rs1.rb$h$a
                androidx.appcompat.app.AppCompatActivity r8 = r6.f180419b
                r4 = 0
                r3.<init>(r7, r8, r4)
                r4 = 3
                r5 = 0
                a14.C53895h.m60466d(r0, r1, r2, r3, r4, r5)
            L_0x0062:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rs1.C63625rb.C63633h.mo2587a(androidx.recyclerview.widget.RecyclerView, jq3.r):void");
        }
    }

    /* renamed from: rs1.rb$i */
    public static final class C63635i extends C87413o implements C32224a<FTSSearchView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f180422d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63635i(AppCompatActivity appCompatActivity) {
            super(0);
            this.f180422d = appCompatActivity;
        }

        public Object invoke() {
            return new FTSSearchView((Context) this.f180422d, false);
        }
    }

    /* renamed from: rs1.rb$j */
    public static final class C63636j extends C87413o implements C32224a<WxRecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ C63625rb f180423d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63636j(C63625rb rbVar) {
            super(0);
            this.f180423d = rbVar;
        }

        public Object invoke() {
            return (WxRecyclerView) this.f180423d.findViewById(C0966R.C0970id.f359105iv2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63625rb(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f180401i = C36568h.m40985a(new C63635i(appCompatActivity));
        this.f180405p = new WxLinearLayoutManager(appCompatActivity, 1, false);
        this.f180406q = new C58623i(0);
        this.f180408s = -1;
        this.f180409t = C76577a.m92157h(appCompatActivity, C0966R.dimen.f3766df);
        this.f180410u = new C63633h(this, appCompatActivity);
    }

    /* renamed from: D */
    public void mo3000D(boolean z) {
        if (z) {
            String str = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb() + ',' + 1;
            Log.m105924i("Finder.FinderSearchReportLogic", "report19184 " + str);
            C117407d.INSTANCE.kvStat(19184, str);
        }
    }

    /* renamed from: b3 */
    public void mo3001b3(String str, String str2, List<FTSSearchView.C6996f> list, FTSEditTextView.C45052m mVar) {
        String str3;
        List<C62323d> data;
        Class cls = C58457w.class;
        if (str == null || (str3 = C112550d0.m153799i0(str).toString()) == null) {
            str3 = "";
        }
        if (Util.isNullOrNil(str3)) {
            View c3 = mo88465c3();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(c3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(c3, "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View d3 = mo88466d3();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view = d3;
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            d3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ((C58457w) C86312j.m106911c(cls)).mo82793VA(getActivity()).mo75829l();
        ((C58457w) C86312j.m106911c(cls)).Pp0(getActivity()).mo75823T2();
        WxRecyclerAdapter<C62323d> wxRecyclerAdapter = this.f180404o;
        if (!(wxRecyclerAdapter == null || (data = wxRecyclerAdapter.getData()) == null)) {
            data.clear();
        }
        WxRecyclerAdapter<C62323d> wxRecyclerAdapter2 = this.f180404o;
        if (wxRecyclerAdapter2 != null) {
            wxRecyclerAdapter2.notifyDataSetChanged();
        }
        C46091u0 u0Var = this.f180403n;
        if (u0Var != null) {
            u0Var.mo71528b(str3);
        } else {
            C87412m.m108603p("historyLogic");
            throw null;
        }
    }

    /* renamed from: c3 */
    public final View mo88465c3() {
        Object value = ((C36570n) this.f180400h).getValue();
        C87412m.m108593f(value, "<get-loadingView>(...)");
        return (View) value;
    }

    /* renamed from: d3 */
    public final View mo88466d3() {
        Object value = ((C36570n) this.f180399g).getValue();
        C87412m.m108593f(value, "<get-noResultView>(...)");
        return (View) value;
    }

    /* renamed from: e3 */
    public final WxRefreshLayout mo88467e3() {
        Object value = ((C36570n) this.f180397e).getValue();
        C87412m.m108593f(value, "<get-rlLayout>(...)");
        return (WxRefreshLayout) value;
    }

    /* renamed from: f3 */
    public final FTSSearchView mo88468f3() {
        return (FTSSearchView) ((C36570n) this.f180401i).getValue();
    }

    /* renamed from: g3 */
    public final WxRecyclerView mo88469g3() {
        Object value = ((C36570n) this.f180398f).getValue();
        C87412m.m108593f(value, "<get-sortView>(...)");
        return (WxRecyclerView) value;
    }

    /* renamed from: i3 */
    public final void mo88470i3(String str) {
        Class cls = C58457w.class;
        boolean z = true;
        Log.m105925i(this.f180396d, "search biz, key word : %s", str);
        if (!(str == null || str.length() == 0)) {
            if (str != null && !C112551y.m153811k(str)) {
                z = false;
            }
            if (!z) {
                ((C58457w) C86312j.m106911c(cls)).mo82796mh(getActivity()).mo75840g1(str);
                ((C58457w) C86312j.m106911c(cls)).mo82793VA(getActivity()).mo75827Q0(str);
            }
        }
    }

    /* renamed from: m7 */
    public void mo3004m7(int i, FTSSearchView.C6996f fVar) {
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 6) {
            getActivity().setResult(6, getIntent());
            getActivity().finish();
        }
    }

    public void onClickBackBtn(View view) {
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((MMActivity) activity).hideVKB();
        getActivity().finish();
    }

    public void onClickClearTextBtn(View view) {
        List<C62323d> data;
        Class cls = C58457w.class;
        Log.m105924i(this.f180396d, "onClickClearText");
        ((C58457w) C86312j.m106911c(cls)).mo82793VA(getActivity()).mo75829l();
        ((C58457w) C86312j.m106911c(cls)).Pp0(getActivity()).mo75823T2();
        WxRecyclerAdapter<C62323d> wxRecyclerAdapter = this.f180404o;
        if (!(wxRecyclerAdapter == null || (data = wxRecyclerAdapter.getData()) == null)) {
            data.clear();
        }
        WxRecyclerAdapter<C62323d> wxRecyclerAdapter2 = this.f180404o;
        if (wxRecyclerAdapter2 != null) {
            wxRecyclerAdapter2.notifyDataSetChanged();
        }
        mo88468f3().getFtsEditText().mo70355k();
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((MMActivity) activity).showVKB();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C58457w) C86312j.m106911c(C58457w.class)).mo82796mh(getActivity()).mo75842x1(2);
    }

    public void onCreateAfter(Bundle bundle) {
        Class cls = C58457w.class;
        super.onCreateAfter(bundle);
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        this.f180403n = new C46091u0((MMActivity) activity, false, new C63585nb(this));
        mo88468f3().setSearchViewListener(this);
        mo88468f3().getFtsEditText().setHint(getString(C0966R.string.a2p));
        mo88468f3().getFtsEditText().setFtsEditTextListener(this);
        mo88468f3().getFtsEditText().setCanDeleteTag(false);
        mo88468f3().getFtsEditText().mo70338f();
        WeImageView weImageView = (WeImageView) mo88468f3().findViewById(C0966R.C0970id.f357484a32);
        if (weImageView != null) {
            weImageView.setVisibility(0);
            weImageView.setOnClickListener(new C63610ob(this));
        }
        AppCompatActivity activity2 = getActivity();
        C87412m.m108592e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        FTSEditTextView ftsEditText = mo88468f3().getFtsEditText();
        C87412m.m108593f(ftsEditText, "searchView.ftsEditText");
        C60055x0 x0Var = new C60055x0((MMActivity) activity2, ftsEditText, 16, 3, false, false, new C63615pb(this));
        this.f180402j = x0Var;
        x0Var.f171401t = new C63620qb(this);
        mo88467e3().setOnSimpleAction(new C63628c(this));
        mo88469g3().mo17043c(new C63629d(this));
        this.f180405p.f44685q = true;
        mo88469g3().setLayoutManager(this.f180405p);
        mo88469g3().setItemViewCacheSize(0);
        WxRecyclerAdapter<C62323d> a = C58449n.C58450a.m67851a(((C58457w) C86312j.m106911c(cls)).mo82784Bt(getActivity()), false, 1, (Object) null);
        this.f180404o = a;
        if (a != null) {
            a.f165737C = this.f180410u;
        }
        mo88469g3().setAdapter(this.f180404o);
        if (((C58457w) C86312j.m106911c(cls)).mo82784Bt(getActivity()).mo80828T()) {
            C58623i iVar = this.f180406q;
            iVar.f167848h = new C63630e(this);
            iVar.mo75025b(mo88469g3());
            mo88469g3().mo17043c(new C63631f(this));
        } else {
            mo88469g3().mo17085h0(new C7734g(getActivity()));
        }
        C53895h.m60466d(getMainScope(), (C66212f) null, (C53934p0) null, new C63572mb(this, (C15601d<? super C63572mb>) null), 3, (Object) null);
        mo88468f3().getFtsEditText().requestFocus();
    }

    public void onDestroy() {
        C8703w0 w0Var = C8703w0.f27927a;
        C8703w0.f27930d.clear();
        C46091u0 u0Var = this.f180403n;
        if (u0Var != null) {
            u0Var.mo71527a();
            C65838f.f189333a.mo89882c();
            AppCompatActivity activity = getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((MMActivity) activity).hideVKB();
            mo88469g3().setAdapter((RecyclerView.C16613e<?>) null);
            super.onDestroy();
            return;
        }
        C87412m.m108603p("historyLogic");
        throw null;
    }

    public void onPause() {
        super.onPause();
        C60055x0 x0Var = this.f180402j;
        if (x0Var != null) {
            C86709a0.m107524d().mo123470p(6200, x0Var);
        } else {
            C87412m.m108603p("searchSuggestionManager");
            throw null;
        }
    }

    public void onResume() {
        super.onResume();
        C60055x0 x0Var = this.f180402j;
        if (x0Var != null) {
            C86709a0.m107524d().mo123455a(6200, x0Var);
        } else {
            C87412m.m108603p("searchSuggestionManager");
            throw null;
        }
    }

    /* renamed from: y */
    public boolean mo3009y() {
        String str;
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((MMActivity) activity).hideVKB();
        String totalQuery = mo88468f3().getFtsEditText().getTotalQuery();
        if (totalQuery == null || (str = C112550d0.m153799i0(totalQuery).toString()) == null) {
            str = "";
        }
        if (Util.isNullOrNil(str)) {
            return true;
        }
        mo88470i3(str);
        C46091u0 u0Var = this.f180403n;
        if (u0Var != null) {
            u0Var.mo71529c(str);
            C60055x0 x0Var = this.f180402j;
            if (x0Var != null) {
                x0Var.mo84916b();
                C117407d.INSTANCE.idkeyStat(1265, 6, 1, false);
                return false;
            }
            C87412m.m108603p("searchSuggestionManager");
            throw null;
        }
        C87412m.m108603p("historyLogic");
        throw null;
    }
}
