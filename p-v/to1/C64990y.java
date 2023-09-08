package to1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import fy3.C32227p;
import gc0.C20828a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;
import te3.pr4;

/* renamed from: to1.y */
public final class C64990y extends RecyclerView.C16613e<C64962b0> {

    /* renamed from: d */
    public final ArrayList<pr4> f187113d = new ArrayList<>();

    /* renamed from: e */
    public C32227p<? super View, ? super Integer, C13598b0> f187114e = C37221a.f98519d;

    /* renamed from: to1.y$a */
    public static final class C37221a extends C87413o implements C32227p<View, Integer, C13598b0> {

        /* renamed from: d */
        public static final C37221a f98519d = new C37221a();

        public C37221a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C87412m.m108594g((View) obj, "<anonymous parameter 0>");
            return C13598b0.f38549a;
        }
    }

    public int getItemCount() {
        return this.f187113d.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C64962b0 b0Var = (C64962b0) zVar;
        C87412m.m108594g(b0Var, "holder");
        pr4 pr4 = this.f187113d.get(i);
        C87412m.m108593f(pr4, "templates[position]");
        pr4 pr42 = pr4;
        C37220x xVar = new C37220x(this, i);
        View view = b0Var.f187047B;
        int i2 = C87412m.m108589b(pr42.f139919d, "empty") ? 4 : 0;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i2));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/record/plugin/TemplateHolder", "loadItem", "(Lcom/tencent/mm/protocal/protobuf/VideoTemplate;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/record/plugin/TemplateHolder", "loadItem", "(Lcom/tencent/mm/protocal/protobuf/VideoTemplate;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C20828a.m22825b().mo32524m(pr42.f139922g.f143763g, b0Var.f187048z, new C64991z(b0Var));
        if (!C87412m.m108589b(pr42.f139919d, "loading")) {
            b0Var.f44854d.setOnClickListener(new C14060a0(xVar));
        } else {
            b0Var.f187046A.setVisibility(0);
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.cm4, viewGroup, false);
        C87412m.m108593f(inflate, "view");
        return new C64962b0(inflate);
    }
}
