package ve1;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import cm1.C0717c0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import rx3.C13598b0;

/* renamed from: ve1.i3 */
public final class C14542i3 extends C60896i<C0717c0> {

    /* renamed from: e */
    public final C32226l<View, C13598b0> f40302e;

    /* renamed from: f */
    public View f40303f;

    /* renamed from: ve1.i3$a */
    public static final class C14543a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C14542i3 f40304d;

        public C14543a(C14542i3 i3Var) {
            this.f40304d = i3Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedSameCityLiveConvert$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32226l<View, C13598b0> lVar = this.f40304d.f40302e;
            C87412m.m108593f(view, LocaleUtil.ITALIAN);
            lVar.invoke(view);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedSameCityLiveConvert$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C14542i3(C32226l<? super View, C13598b0> lVar) {
        C87412m.m108594g(lVar, "onClickMoreView");
        this.f40302e = lVar;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.f6246k;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g((C0717c0) cVar, "item");
        ViewGroup.LayoutParams layoutParams = oVar.f44854d.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).f44911i = true;
        }
        this.f40303f = oVar.f44854d;
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        ViewGroup.LayoutParams layoutParams = oVar.f44854d.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).f44911i = true;
        }
        oVar.f44854d.findViewById(C0966R.C0970id.gzs).setOnClickListener(new C14543a(this));
    }
}
