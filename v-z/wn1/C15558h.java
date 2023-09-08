package wn1;

import android.graphics.Point;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import rx3.C36568h;
import tn1.C14057l;

/* renamed from: wn1.h */
public final class C15558h extends C60896i<C14057l> {

    /* renamed from: wn1.h$a */
    public static final class C15559a extends C87413o implements C32224a<Point> {

        /* renamed from: d */
        public static final C15559a f42159d = new C15559a();

        public C15559a() {
            super(0);
        }

        public Object invoke() {
            return C75044y4.m89990b(MMApplicationContext.getContext());
        }
    }

    public C15558h() {
        C36568h.m40985a(C15559a.f42159d);
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.aix;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        String str;
        C14057l lVar = (C14057l) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(lVar, "item");
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.hor);
        StringBuilder sb = new StringBuilder();
        sb.append(lVar.f39433e);
        if (lVar.f39434f > 0) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(' ');
            sb4.append(lVar.f39434f);
            str = sb4.toString();
        } else {
            str = "";
        }
        sb.append(str);
        textView.setText(sb.toString());
        View D = oVar.mo85812D(C0966R.C0970id.hoq);
        if (lVar.f39435g) {
            if (D != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view = D;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/order/ui/OrderTabConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/order/data/OrderTabFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/order/ui/OrderTabConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/order/data/OrderTabFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            textView.setTextColor(oVar.f173499A.getResources().getColor(C0966R.color.FG_0));
        } else {
            if (D != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view2 = D;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/order/ui/OrderTabConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/order/data/OrderTabFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/order/ui/OrderTabConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/order/data/OrderTabFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            textView.setTextColor(oVar.f173499A.getResources().getColor(C0966R.color.FG_1));
        }
        textView.post(new C15557g(D, textView));
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
