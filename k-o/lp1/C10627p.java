package lp1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import dp1.C7434f1;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import lp1.C10628q;
import p749xh.C66261f3;

/* renamed from: lp1.p */
public final class C10627p implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C10628q.C10629a f32027d;

    /* renamed from: e */
    public final /* synthetic */ int f32028e;

    /* renamed from: f */
    public final /* synthetic */ C10628q f32029f;

    /* renamed from: g */
    public final /* synthetic */ FinderObject f32030g;

    public C10627p(C10628q.C10629a aVar, int i, C10628q qVar, FinderObject finderObject) {
        this.f32027d = aVar;
        this.f32028e = i;
        this.f32029f = qVar;
        this.f32030g = finderObject;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/share/FinderShareSideGuideUIC$RvAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C10628q.C10629a aVar = this.f32027d;
        aVar.f32038f = this.f32028e;
        aVar.notifyDataSetChanged();
        C10628q qVar = this.f32029f;
        int i = this.f32028e;
        FinderObject finderObject = this.f32030g;
        qVar.getClass();
        C87412m.m108594g(finderObject, C66261f3.COL_FINDEROBJECT);
        RecyclerView recyclerView = qVar.f31972f;
        if (recyclerView != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(Integer.valueOf(i));
            RecyclerView recyclerView2 = recyclerView;
            C117292a.m165358d(recyclerView2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/share/FinderShareSideGuideUIC", "onClickSideItem", "(ILcom/tencent/mm/protocal/protobuf/FinderObject;)V", "Undefined", "smoothScrollToPosition", "(I)V");
            recyclerView.mo17149t1(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/finder/share/FinderShareSideGuideUIC", "onClickSideItem", "(ILcom/tencent/mm/protocal/protobuf/FinderObject;)V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
        C7434f1.f25625a.mo8576b(qVar.getActivity(), 4, "right");
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/share/FinderShareSideGuideUIC$RvAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
