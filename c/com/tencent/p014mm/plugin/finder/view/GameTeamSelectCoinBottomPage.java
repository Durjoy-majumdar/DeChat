package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import jq3.C60896i;
import jq3.C60898l;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import qo3.w$$c;
import tf1.C13914m;

/* renamed from: com.tencent.mm.plugin.finder.view.GameTeamSelectCoinBottomPage */
public final class GameTeamSelectCoinBottomPage extends w$$c {

    /* renamed from: b */
    public final C3987a f17989b;

    /* renamed from: c */
    public View f17990c;

    /* renamed from: d */
    public final ArrayList<C3988b> f17991d = new ArrayList<>();

    /* renamed from: e */
    public WxRecyclerAdapter<C3988b> f17992e;

    /* renamed from: com.tencent.mm.plugin.finder.view.GameTeamSelectCoinBottomPage$a */
    public interface C3987a {
        /* renamed from: a */
        void mo4782a(int i);

        /* renamed from: b */
        void mo4783b();

        /* renamed from: c */
        void mo4784c();
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.GameTeamSelectCoinBottomPage$b */
    public static final class C3988b implements C0740i2 {

        /* renamed from: d */
        public final int f17993d;

        public C3988b(int i) {
            this.f17993d = i;
        }

        /* renamed from: c */
        public int mo75c() {
            return 1;
        }

        /* renamed from: f */
        public int mo76f(C13914m mVar) {
            C87412m.m108594g(mVar, "obj");
            return (!(mVar instanceof C3988b) || this.f17993d != ((C3988b) mVar).f17993d) ? 1 : 0;
        }

        public long getItemId() {
            return (long) this.f17993d;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.GameTeamSelectCoinBottomPage$c */
    public final class C3989c extends C60896i<C3988b> {

        /* renamed from: e */
        public final C32226l<Integer, Boolean> f17994e;

        /* renamed from: f */
        public final /* synthetic */ GameTeamSelectCoinBottomPage f17995f;

        public C3989c(GameTeamSelectCoinBottomPage gameTeamSelectCoinBottomPage, C32226l<? super Integer, Boolean> lVar) {
            C87412m.m108594g(lVar, "isLast");
            this.f17995f = gameTeamSelectCoinBottomPage;
            this.f17994e = lVar;
        }

        /* renamed from: c */
        public int mo43c() {
            return C0966R.C0971layout.agp;
        }

        /* renamed from: e */
        public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
            C3988b bVar = (C3988b) cVar;
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(bVar, "item");
            TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.f358143dm2);
            View D = oVar.mo85812D(C0966R.C0970id.dlz);
            if (i == this.f17995f.f17991d.size() - 1) {
                textView.setTextSize(1, 17.0f);
                textView.setTextColor(textView.getContext().getResources().getColor(C0966R.color.Link_100));
                textView.setText(textView.getContext().getString(C0966R.string.dc6));
            } else {
                textView.setTextSize(1, 20.0f);
                textView.setTextColor(textView.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                textView.setText(String.valueOf(bVar.f17993d));
            }
            if (this.f17994e.invoke(Integer.valueOf(i)).booleanValue()) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view = D;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/GameTeamSelectCoinBottomPage$DataConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/GameTeamSelectCoinBottomPage$Data;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/view/GameTeamSelectCoinBottomPage$DataConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/GameTeamSelectCoinBottomPage$Data;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view2 = D;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/GameTeamSelectCoinBottomPage$DataConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/GameTeamSelectCoinBottomPage$Data;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/GameTeamSelectCoinBottomPage$DataConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/GameTeamSelectCoinBottomPage$Data;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        /* renamed from: f */
        public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(oVar, "holder");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.GameTeamSelectCoinBottomPage$d */
    public static final class C3990d implements C60898l.C9502b<C60905o> {

        /* renamed from: d */
        public final /* synthetic */ GameTeamSelectCoinBottomPage f17996d;

        public C3990d(GameTeamSelectCoinBottomPage gameTeamSelectCoinBottomPage) {
            this.f17996d = gameTeamSelectCoinBottomPage;
        }

        /* renamed from: q */
        public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
            C60905o oVar = (C60905o) zVar;
            C87412m.m108594g(eVar, "adapter");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(oVar, "holder");
            GameTeamSelectCoinBottomPage gameTeamSelectCoinBottomPage = this.f17996d;
            Object obj = oVar.f173503E;
            C87412m.m108593f(obj, "holder.getAssociatedObject()");
            C3988b bVar = (C3988b) obj;
            gameTeamSelectCoinBottomPage.getClass();
            if (i != gameTeamSelectCoinBottomPage.f17991d.size() - 1) {
                gameTeamSelectCoinBottomPage.f17989b.mo4782a(bVar.f17993d);
            } else {
                gameTeamSelectCoinBottomPage.f17989b.mo4783b();
            }
            gameTeamSelectCoinBottomPage.f17991d.size();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.GameTeamSelectCoinBottomPage$e */
    public static final class C3991e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ GameTeamSelectCoinBottomPage f17997d;

        public C3991e(GameTeamSelectCoinBottomPage gameTeamSelectCoinBottomPage) {
            this.f17997d = gameTeamSelectCoinBottomPage;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/GameTeamSelectCoinBottomPage$getView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f17997d.mo12476d();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/GameTeamSelectCoinBottomPage$getView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.GameTeamSelectCoinBottomPage$f */
    public static final class C3992f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ GameTeamSelectCoinBottomPage f17998d;

        public C3992f(GameTeamSelectCoinBottomPage gameTeamSelectCoinBottomPage) {
            this.f17998d = gameTeamSelectCoinBottomPage;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/GameTeamSelectCoinBottomPage$getView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f17998d.f17989b.mo4784c();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/GameTeamSelectCoinBottomPage$getView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public GameTeamSelectCoinBottomPage(C3987a aVar) {
        C87412m.m108594g(aVar, "callback");
        this.f17989b = aVar;
    }

    /* renamed from: a */
    public View mo4781a(Context context) {
        C87412m.m108594g(context, "context");
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.acu, (ViewGroup) null, false);
        WxRecyclerView wxRecyclerView = (WxRecyclerView) inflate.findViewById(C0966R.C0970id.jmi);
        WxRecyclerAdapter<C3988b> wxRecyclerAdapter = new WxRecyclerAdapter<>(new GameTeamSelectCoinBottomPage$getView$1$1(this), this.f17991d, false);
        this.f17992e = wxRecyclerAdapter;
        wxRecyclerView.setAdapter(wxRecyclerAdapter);
        WxRecyclerAdapter<C3988b> wxRecyclerAdapter2 = this.f17992e;
        if (wxRecyclerAdapter2 != null) {
            wxRecyclerAdapter2.f173488o = new C3990d(this);
        }
        wxRecyclerView.setLayoutManager(new LinearLayoutManager(context));
        ((WeImageView) inflate.findViewById(C0966R.C0970id.deb)).setOnClickListener(new C3991e(this));
        ((WeImageView) inflate.findViewById(C0966R.C0970id.dnr)).setOnClickListener(new C3992f(this));
        this.f17990c = inflate;
        return inflate;
    }
}
