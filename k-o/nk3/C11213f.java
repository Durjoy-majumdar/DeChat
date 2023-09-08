package nk3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: nk3.f */
public final class C11213f extends RecyclerView.C16613e<C11211c> {

    /* renamed from: d */
    public final ArrayList<String> f33068d;

    /* renamed from: e */
    public final C32226l<View, C13598b0> f33069e;

    /* renamed from: nk3.f$a */
    public static final class C11214a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C32226l f33070d;

        public C11214a(C32226l lVar) {
            this.f33070d = lVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/search/multi/adapter/FTSMultiEduGirdAdapter$sam$android_view_View_OnClickListener$0", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f33070d.invoke(view);
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/search/multi/adapter/FTSMultiEduGirdAdapter$sam$android_view_View_OnClickListener$0", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C11213f(ArrayList<String> arrayList, C32226l<? super View, C13598b0> lVar) {
        C87412m.m108594g(arrayList, "titles");
        C87412m.m108594g(lVar, "clickCallback");
        this.f33068d = arrayList;
        this.f33069e = lVar;
    }

    public int getItemCount() {
        return this.f33068d.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C11211c cVar = (C11211c) zVar;
        C87412m.m108594g(cVar, "holder");
        cVar.f33066z.setTag(Integer.valueOf(i));
        cVar.f33066z.setText(this.f33068d.get(i));
        cVar.f33066z.setOnClickListener(new C11214a(this.f33069e));
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.at5, (ViewGroup) null);
        C87412m.m108593f(inflate, "from(parent.context).inf…ts_grid_title_item, null)");
        return new C11211c(inflate);
    }
}
