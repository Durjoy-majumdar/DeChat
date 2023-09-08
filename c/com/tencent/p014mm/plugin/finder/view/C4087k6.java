package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.finder.view.C4220y4;
import com.tencent.p014mm.plugin.finder.view.GameTeamSelectCoinBottomPage;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.Iterator;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import p629ny.C76979h;
import rx3.C13598b0;
import te3.C50868ps1;
import te3.C51560uk2;
import tf1.C13914m;

/* renamed from: com.tencent.mm.plugin.finder.view.k6 */
public final class C4087k6 extends C4220y4<C51560uk2> implements GameTeamSelectCoinBottomPage.C3987a {

    /* renamed from: d */
    public final C32227p<C51560uk2, Integer, C13598b0> f18221d;

    /* renamed from: e */
    public final GameTeamSelectCoinBottomPage f18222e = new GameTeamSelectCoinBottomPage(this);

    /* renamed from: f */
    public final C4108m6 f18223f = new C4108m6(this);

    /* renamed from: g */
    public final C4080j6 f18224g = new C4080j6();

    /* renamed from: com.tencent.mm.plugin.finder.view.k6$a */
    public static final class C4088a extends C60896i<C4220y4.C4221a<C51560uk2>> {

        /* renamed from: e */
        public final C32226l<Integer, Boolean> f18225e;

        public C4088a(C32226l<? super Integer, Boolean> lVar) {
            C87412m.m108594g(lVar, "isLast");
            this.f18225e = lVar;
        }

        /* renamed from: c */
        public int mo43c() {
            return C0966R.C0971layout.agq;
        }

        /* renamed from: e */
        public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
            int i3;
            C60905o oVar2 = oVar;
            C4220y4.C4221a aVar = (C4220y4.C4221a) cVar;
            C87412m.m108594g(oVar2, "holder");
            C87412m.m108594g(aVar, "item");
            TextView textView = (TextView) oVar2.mo85812D(C0966R.C0970id.f358143dm2);
            View D = oVar2.mo85812D(C0966R.C0970id.f358142dm1);
            View D2 = oVar2.mo85812D(C0966R.C0970id.dlz);
            TextView textView2 = (TextView) oVar2.mo85812D(C0966R.C0970id.f358141dm0);
            String str = ((C51560uk2) aVar.f18526d).f142913d;
            if (str == null) {
                str = "";
            }
            textView.setText(str);
            C51560uk2 uk22 = (C51560uk2) aVar.f18526d;
            if (uk22.f142914e != 7 || !aVar.f18527e) {
                i3 = 8;
                textView2.setVisibility(8);
                if (aVar.f18527e) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar2.mo10233c(0);
                    C117292a.m165358d(D, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/GameTeamConditionBottomSheet$GameTeamConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/FinderSingleSelectBottomSheet$ConditionData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    D.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(D, "com/tencent/mm/plugin/finder/view/GameTeamConditionBottomSheet$GameTeamConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/FinderSingleSelectBottomSheet$ConditionData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar3.mo10233c(8);
                    C117292a.m165358d(D, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/view/GameTeamConditionBottomSheet$GameTeamConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/FinderSingleSelectBottomSheet$ConditionData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    D.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(D, "com/tencent/mm/plugin/finder/view/GameTeamConditionBottomSheet$GameTeamConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/FinderSingleSelectBottomSheet$ConditionData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                C50868ps1 ps12 = uk22.f142915f;
                int i4 = ps12 != null ? ps12.f139936e : 0;
                Log.m105924i("MicroMsg.GameTeamConditionBottomSheet", "current setting value: " + i4);
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar4.mo10233c(8);
                C117292a.m165358d(D, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/view/GameTeamConditionBottomSheet$GameTeamConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/FinderSingleSelectBottomSheet$ConditionData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(D, "com/tencent/mm/plugin/finder/view/GameTeamConditionBottomSheet$GameTeamConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/FinderSingleSelectBottomSheet$ConditionData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView2.setVisibility(0);
                Context context = oVar2.f173499A;
                String valueOf = String.valueOf(i4);
                Context context2 = oVar2.f173499A;
                Drawable e = C74933u4.m89768e(context2, C0966R.raw.coin_icon, context2.getResources().getColor(C0966R.color.Link_100));
                e.setBounds(0, 0, C76577a.m92155f(oVar2.f173499A, C0966R.dimen.f3736cp), C76577a.m92155f(oVar2.f173499A, C0966R.dimen.f3736cp));
                C13598b0 b0Var = C13598b0.f38549a;
                textView2.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107054PB(context, valueOf, e, true));
                i3 = 8;
            }
            if (((C51560uk2) aVar.f18526d).f142914e == 1) {
                textView.setTextColor(oVar2.f173499A.getResources().getColor(C0966R.color.f3401rl));
            } else {
                textView.setTextColor(oVar2.f173499A.getResources().getColor(C0966R.color.FG_0));
            }
            if (this.f18225e.invoke(Integer.valueOf(i)).booleanValue()) {
                C9556a aVar5 = new C9556a();
                aVar5.mo10233c(0);
                View view = D2;
                C117292a.m165358d(view, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/view/GameTeamConditionBottomSheet$GameTeamConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/FinderSingleSelectBottomSheet$ConditionData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D2.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/view/GameTeamConditionBottomSheet$GameTeamConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/FinderSingleSelectBottomSheet$ConditionData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(Integer.valueOf(i3));
            View view2 = D2;
            C117292a.m165358d(view2, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/view/GameTeamConditionBottomSheet$GameTeamConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/FinderSingleSelectBottomSheet$ConditionData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D2.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/GameTeamConditionBottomSheet$GameTeamConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/FinderSingleSelectBottomSheet$ConditionData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        /* renamed from: f */
        public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(oVar, "holder");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.k6$b */
    public static final class C4089b extends C4220y4.C4221a<C51560uk2> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4089b(C51560uk2 uk22) {
            super(uk22, false, 2, (C8480h) null);
            C87412m.m108594g(uk22, FirebaseAnalytics.C113379b.SOURCE);
        }

        /* renamed from: c */
        public int mo75c() {
            return 1;
        }

        /* renamed from: f */
        public int mo76f(C13914m mVar) {
            C87412m.m108594g(mVar, "obj");
            return (!(mVar instanceof C4089b) || ((C51560uk2) this.f18526d).f142914e != ((C51560uk2) ((C4089b) mVar).f18526d).f142914e) ? 1 : 0;
        }

        public long getItemId() {
            return (long) ((C51560uk2) this.f18526d).f142914e;
        }
    }

    public C4087k6(C32227p<? super C51560uk2, ? super Integer, C13598b0> pVar) {
        C87412m.m108594g(pVar, "selectListener");
        this.f18221d = pVar;
    }

    /* renamed from: a */
    public void mo4782a(int i) {
        T t;
        boolean z;
        Log.m105924i("MicroMsg.GameTeamConditionBottomSheet", "selectValue " + i);
        Iterator<T> it = this.f18525c.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C51560uk2) ((C4220y4.C4221a) t).f18526d).f142914e == 7) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C4220y4.C4221a aVar = (C4220y4.C4221a) t;
        if (aVar != null) {
            this.f18221d.invoke(aVar.f18526d, Integer.valueOf(i));
        }
        mo5090e().mo5085n();
    }

    /* renamed from: b */
    public void mo4783b() {
        mo5090e().mo12468h(this.f18223f);
    }

    /* renamed from: c */
    public void mo4784c() {
        mo5090e().mo12468h(this.f18224g);
    }
}
