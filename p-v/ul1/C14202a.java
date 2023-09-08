package ul1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import fy3.C32227p;
import gy3.C87412m;
import j20.C117292a;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;
import ul1.C14205c;

/* renamed from: ul1.a */
public final class C14202a extends RecyclerView.C16613e<C14203a> {

    /* renamed from: d */
    public List<C14205c.C14206a> f39653d;

    /* renamed from: e */
    public C32227p<? super C14205c.C14206a, ? super Integer, C13598b0> f39654e;

    /* renamed from: ul1.a$a */
    public static final class C14203a extends RecyclerView.C16631z {

        /* renamed from: A */
        public TextView f39655A;

        /* renamed from: B */
        public WeImageView f39656B;

        /* renamed from: z */
        public TextView f39657z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14203a(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f39657z = (TextView) view.findViewById(C0966R.C0970id.g7d);
            this.f39655A = (TextView) view.findViewById(C0966R.C0970id.g7b);
            this.f39656B = (WeImageView) view.findViewById(C0966R.C0970id.g7c);
        }
    }

    public int getItemCount() {
        List<C14205c.C14206a> list = this.f39653d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        List<C14205c.C14206a> list;
        int i2 = i;
        C14203a aVar = (C14203a) zVar;
        C87412m.m108594g(aVar, "holder");
        View view = aVar.f44854d;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar2.mo10233c(0);
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateAdapter$LotteryViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateAdapter$LotteryViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean z = true;
        C13598b0 b0Var = null;
        C14205c.C14206a aVar3 = (!(i2 >= 0 && i2 < getItemCount()) || (list = this.f39653d) == null) ? null : list.get(i2);
        if (aVar3 != null) {
            aVar.f39657z.setText(aVar3.f39672a);
            aVar.f39656B.setVisibility(aVar3.f39676e ? 0 : 8);
            if (aVar3.f39675d) {
                aVar.f44854d.setEnabled(true);
                String str = aVar3.f39673b;
                if (!(str == null || str.length() == 0)) {
                    z = false;
                }
                if (z) {
                    aVar.f39655A.setVisibility(8);
                    aVar.f39655A.setText("");
                } else {
                    aVar.f39655A.setVisibility(0);
                    aVar.f39655A.setText(aVar3.f39673b);
                }
                aVar.f39657z.setTextColor(aVar.f44854d.getContext().getResources().getColor(C0966R.color.f3133gi));
            } else {
                aVar.f44854d.setEnabled(false);
                aVar.f39655A.setVisibility(0);
                aVar.f39657z.setTextColor(aVar.f44854d.getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_5));
                aVar.f39655A.setText(aVar.f44854d.getContext().getResources().getString(C0966R.string.dsy, new Object[]{aVar3.f39672a}));
            }
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            aVar.f44854d.setEnabled(false);
            aVar.f39657z.setText("");
            aVar.f39655A.setText("");
            aVar.f39656B.setVisibility(8);
            View view2 = aVar.f44854d;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateAdapter$LotteryViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateAdapter$LotteryViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        aVar.f44854d.setOnClickListener(new C14204b(this, aVar3, i2));
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = View.inflate(viewGroup.getContext(), C0966R.C0971layout.f359733ai0, (ViewGroup) null);
        C87412m.m108593f(inflate, "itemView");
        return new C14203a(inflate);
    }
}
