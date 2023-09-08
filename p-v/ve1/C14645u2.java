package ve1;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0793y;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import di3.C86312j;
import eb0.C75592q0;
import er1.C58784w3;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import hi3.C87515a;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import p629ny.C76979h;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import rx3.C13598b0;
import tl3.C78039a;
import up1.C27696y;

/* renamed from: ve1.u2 */
public final class C14645u2 extends C60896i<C0793y> {

    /* renamed from: e */
    public final boolean f40515e;

    /* renamed from: f */
    public final C32224a<Boolean> f40516f;

    /* renamed from: g */
    public final C32226l<Boolean, C13598b0> f40517g;

    /* renamed from: h */
    public final C32224a<C13598b0> f40518h;

    /* renamed from: ve1.u2$a */
    public static final class C14646a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C14645u2 f40519d;

        /* renamed from: e */
        public final /* synthetic */ C0793y f40520e;

        /* renamed from: f */
        public final /* synthetic */ C60905o f40521f;

        public C14646a(C14645u2 u2Var, C0793y yVar, C60905o oVar) {
            this.f40519d = u2Var;
            this.f40520e = yVar;
            this.f40521f = oVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert$refresh$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f40519d.f40517g.invoke(Boolean.FALSE);
            this.f40519d.mo13843j(this.f40520e, this.f40521f);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert$refresh$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ve1.u2$b */
    public static final class C14647b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C14645u2 f40522d;

        /* renamed from: e */
        public final /* synthetic */ C0793y f40523e;

        /* renamed from: f */
        public final /* synthetic */ C60905o f40524f;

        public C14647b(C14645u2 u2Var, C0793y yVar, C60905o oVar) {
            this.f40522d = u2Var;
            this.f40523e = yVar;
            this.f40524f = oVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert$refresh$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f40522d.f40517g.invoke(Boolean.TRUE);
            this.f40522d.mo13843j(this.f40523e, this.f40524f);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert$refresh$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C14645u2(boolean z, C32224a<Boolean> aVar, C32226l<? super Boolean, C13598b0> lVar, C32224a<C13598b0> aVar2) {
        C87412m.m108594g(aVar, "isSelfLike");
        C87412m.m108594g(lVar, "selfLikeClick");
        C87412m.m108594g(aVar2, "onRefresh");
        this.f40515e = z;
        this.f40516f = aVar;
        this.f40517g = lVar;
        this.f40518h = aVar2;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.ape;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C0793y yVar = (C0793y) cVar;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(yVar, "item");
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.dac);
        C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
        Context context = oVar.f173499A;
        String str = yVar.f1851d.f138724d;
        if (str == null) {
            str = "";
        }
        textView.setText(hVar.mo107057T1(context, str));
        WeImageView weImageView = (WeImageView) oVar.mo85812D(C0966R.C0970id.n5d);
        Resources resources = oVar.f173499A.getResources();
        Integer c0 = C58784w3.m68436c0(C58784w3.f168295a, 1, false, 2, (Object) null);
        weImageView.setImageDrawable(C87515a.m108835e(resources, c0 != null ? c0.intValue() : C0966R.raw.icon_outlined_awesome, 0.0f));
        weImageView.setIconColor(oVar.f173499A.getResources().getColor(C0966R.color.f3459zq));
        ImageView imageView = (ImageView) oVar.mo85812D(C0966R.C0970id.da8);
        if (C87412m.m108589b(yVar.f1851d.f138729i, C75592q0.m90789s())) {
            C78039a.m94189a(imageView, C75592q0.m90789s());
        } else {
            C39818r rVar = C39818r.f106831a;
            C60979d<C100810g0> K1 = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11865K1();
            C62345f fVar = new C62345f(yVar.f1851d.f138725e, (C27696y) null, 2, (C8480h) null);
            C87412m.m108593f(imageView, "avatarIv");
            K1.mo85957c(fVar, imageView, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.WX_AVATAR));
        }
        TextView textView2 = (TextView) oVar.mo85812D(C0966R.C0970id.mn8);
        if (textView2 != null) {
            textView2.setText(oVar.f173499A.getString(C0966R.string.lom));
        }
        mo13843j(yVar, oVar);
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }

    /* renamed from: j */
    public final void mo13843j(C0793y yVar, C60905o oVar) {
        C0793y yVar2 = yVar;
        C60905o oVar2 = oVar;
        int i = 8;
        if (!this.f40515e || !C87412m.m108589b(yVar2.f1851d.f138729i, C75592q0.m90789s())) {
            View D = oVar2.mo85812D(C0966R.C0970id.hps);
            if (D != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view = D;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View D2 = oVar2.mo85812D(C0966R.C0970id.jak);
            if (D2 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view2 = D2;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View D3 = oVar2.mo85812D(C0966R.C0970id.fny);
            if (D3 != null) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(0);
                View view3 = D3;
                C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View D4 = oVar2.mo85812D(C0966R.C0970id.lu5);
            if (D4 != null) {
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar4.mo10233c(8);
                View view4 = D4;
                C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View D5 = oVar2.mo85812D(C0966R.C0970id.d88);
            if (D5 != null) {
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                aVar5.mo10233c(8);
                View view5 = D5;
                C117292a.m165358d(view5, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D5.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else if (this.f40516f.invoke().booleanValue()) {
            View D6 = oVar2.mo85812D(C0966R.C0970id.hps);
            if (D6 != null) {
                C9556a aVar6 = new C9556a();
                ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
                aVar6.mo10233c(8);
                View view6 = D6;
                C117292a.m165358d(view6, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D6.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View D7 = oVar2.mo85812D(C0966R.C0970id.jak);
            if (D7 != null) {
                C9556a aVar7 = new C9556a();
                ThreadLocal<C9556a> threadLocal7 = C60958c.f173611a;
                aVar7.mo10233c(0);
                View view7 = D7;
                C117292a.m165358d(view7, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D7.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                C117292a.m165359e(view7, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View D8 = oVar2.mo85812D(C0966R.C0970id.fny);
            if (D8 != null) {
                C9556a aVar8 = new C9556a();
                ThreadLocal<C9556a> threadLocal8 = C60958c.f173611a;
                aVar8.mo10233c(0);
                View view8 = D8;
                C117292a.m165358d(view8, aVar8.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D8.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View D9 = oVar2.mo85812D(C0966R.C0970id.lu5);
            if (D9 != null) {
                C9556a aVar9 = new C9556a();
                ThreadLocal<C9556a> threadLocal9 = C60958c.f173611a;
                aVar9.mo10233c(8);
                View view9 = D9;
                C117292a.m165358d(view9, aVar9.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D9.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                C117292a.m165359e(view9, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View D10 = oVar2.mo85812D(C0966R.C0970id.d88);
            if (D10 != null) {
                D10.setOnClickListener(new C14646a(this, yVar2, oVar2));
            }
        } else {
            View D11 = oVar2.mo85812D(C0966R.C0970id.fny);
            if (D11 != null) {
                C9556a aVar10 = new C9556a();
                ThreadLocal<C9556a> threadLocal10 = C60958c.f173611a;
                aVar10.mo10233c(8);
                View view10 = D11;
                C117292a.m165358d(view10, aVar10.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D11.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
                C117292a.m165359e(view10, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View D12 = oVar2.mo85812D(C0966R.C0970id.lu5);
            if (D12 != null) {
                C9556a aVar11 = new C9556a();
                ThreadLocal<C9556a> threadLocal11 = C60958c.f173611a;
                aVar11.mo10233c(0);
                View view11 = D12;
                C117292a.m165358d(view11, aVar11.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D12.setVisibility(((Integer) aVar11.mo10231a(0)).intValue());
                C117292a.m165359e(view11, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View D13 = oVar2.mo85812D(C0966R.C0970id.lu5);
            if (D13 != null) {
                D13.setOnClickListener(new C14647b(this, yVar2, oVar2));
            }
            this.f40518h.invoke();
        }
        View D14 = oVar2.mo85812D(C0966R.C0970id.nts);
        if (yVar2.f1851d.f138733p == 1) {
            i = 0;
        }
        C9556a aVar12 = new C9556a();
        ThreadLocal<C9556a> threadLocal12 = C60958c.f173611a;
        aVar12.mo10233c(Integer.valueOf(i));
        View view12 = D14;
        C117292a.m165358d(view12, aVar12.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D14.setVisibility(((Integer) aVar12.mo10231a(0)).intValue());
        C117292a.m165359e(view12, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
