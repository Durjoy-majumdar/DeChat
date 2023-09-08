package ve1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import rx3.C13598b0;

/* renamed from: ve1.d8 */
public final class C14495d8 extends C60896i<C9493c> {

    /* renamed from: e */
    public final C32224a<C13598b0> f40183e;

    /* renamed from: ve1.d8$a */
    public static final class C14496a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C14495d8 f40184d;

        public C14496a(C14495d8 d8Var) {
            this.f40184d = d8Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderShowMoreFooterConvert$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32224a<C13598b0> aVar = this.f40184d.f40183e;
            if (aVar != null) {
                aVar.invoke();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderShowMoreFooterConvert$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C14495d8(C32224a<C13598b0> aVar) {
        this.f40183e = aVar;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.apt;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List<Object> list) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(cVar, "item");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        oVar.f44854d.setOnClickListener(new C14496a(this));
    }
}
