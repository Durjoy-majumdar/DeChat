package ve1;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import cm1.C0738i;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderHotSearchUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import di3.C86312j;
import er1.C58684b;
import gy3.C8477a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k20.C9556a;
import kj2.C117407d;
import nj3.C76879j;
import ot1.C11767a;
import rs1.C13442s8;
import up1.C37521f;
import zc1.C66785b;

/* renamed from: ve1.j3 */
public final class C14548j3 extends C60896i<C0738i> {

    /* renamed from: e */
    public final Rect f40321e = new Rect();

    /* renamed from: f */
    public final C14550b f40322f = new C14550b(this);

    /* renamed from: g */
    public View f40323g;

    /* renamed from: ve1.j3$a */
    public static final class C14549a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RecyclerView f40324d;

        public C14549a(RecyclerView recyclerView) {
            this.f40324d = recyclerView;
        }

        public final void onClick(View view) {
            Class cls = C58684b.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedSearchConvert$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            Context context = this.f40324d.getContext();
            C87412m.m108593f(context, "recyclerView.context");
            C13442s8.C13443a.m12791e(aVar, context, intent, 0, (String) null, 0, 0, false, 0, 252, (Object) null);
            C37521f.f99374d.getClass();
            if (C37521f.f99502r4.mo60266n().intValue() == 1) {
                Context context2 = this.f40324d.getContext();
                C87412m.m108593f(context2, "recyclerView.context");
                ((C58684b) C86312j.m106911c(cls)).getClass();
                C11767a aVar2 = C11767a.f34453a;
                if (aVar2.mo11660b("search") != 0) {
                    C76879j.m92754y(context2, aVar2.mo11661c("search"), "", context2.getString(C0966R.string.lkg), (DialogInterface.OnClickListener) null);
                } else {
                    C117407d.INSTANCE.idkeyStat(1265, 0, 1, false);
                    intent.setClass(context2, FinderHotSearchUI.class);
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(intent);
                    Context context3 = context2;
                    C117292a.m165358d(context3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderHotSearchUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context2.startActivity((Intent) aVar3.mo10231a(0));
                    C117292a.m165359e(context3, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderHotSearchUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            } else {
                boolean z = C66785b.f191882e.mo90662O5().length() > 0;
                C115669n nVar = C115669n.INSTANCE;
                Object[] objArr = new Object[3];
                objArr[0] = 2;
                objArr[1] = Integer.valueOf(z ? 1 : 2);
                objArr[2] = 2;
                nVar.mo160131h(20971, objArr);
                Context context4 = this.f40324d.getContext();
                C87412m.m108593f(context4, "recyclerView.context");
                ((C58684b) C86312j.m106911c(cls)).Rx0(context4, intent);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedSearchConvert$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ve1.j3$b */
    public static final class C14550b extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ C14548j3 f40325d;

        /* renamed from: ve1.j3$b$a */
        public static final class C14551a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C14548j3 f40326d;

            /* renamed from: e */
            public final /* synthetic */ C8477a0 f40327e;

            public C14551a(C14548j3 j3Var, C8477a0 a0Var) {
                this.f40326d = j3Var;
                this.f40327e = a0Var;
            }

            public final void run() {
                C14548j3 j3Var = this.f40326d;
                View view = j3Var.f40323g;
                if (view != null) {
                    C8477a0 a0Var = this.f40327e;
                    if (a0Var.f27482d || !view.getGlobalVisibleRect(j3Var.f40321e) || j3Var.f40321e.height() < view.getHeight() || view.getHeight() <= 0) {
                        a0Var.f27482d = false;
                        return;
                    }
                    boolean z = C66785b.f191882e.mo90662O5().length() > 0;
                    C115669n nVar = C115669n.INSTANCE;
                    Object[] objArr = new Object[3];
                    objArr[0] = 1;
                    objArr[1] = Integer.valueOf(z ? 1 : 2);
                    objArr[2] = 2;
                    nVar.mo160131h(20971, objArr);
                    a0Var.f27482d = true;
                }
            }
        }

        public C14550b(C14548j3 j3Var) {
            this.f40325d = j3Var;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedSearchConvert$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            C8477a0 a0Var = new C8477a0();
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                recyclerView.post(new C14551a(this.f40325d, a0Var));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedSearchConvert$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedSearchConvert$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            super.onScrolled(recyclerView, i, i2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedSearchConvert$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.f6247l;
    }

    /* renamed from: d */
    public void mo2292d(RecyclerView recyclerView, WxRecyclerAdapter<?> wxRecyclerAdapter) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(wxRecyclerAdapter, "adapter");
        super.mo2292d(recyclerView, wxRecyclerAdapter);
        recyclerView.mo17098m1(this.f40322f);
        recyclerView.mo17043c(this.f40322f);
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g((C0738i) cVar, "item");
        ViewGroup.LayoutParams layoutParams = oVar.f44854d.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).f44911i = true;
        }
        this.f40323g = oVar.f44854d;
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        ViewGroup.LayoutParams layoutParams = oVar.f44854d.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).f44911i = true;
        }
        oVar.f44854d.setOnClickListener(new C14549a(recyclerView));
    }
}
