package xk1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import p749xh.C66276va;
import xk1.C66320l1;
import zp3.C23555k;
import zp3.C23564m;

/* renamed from: xk1.n1 */
public final class C66337n1 extends RecyclerView.C16613e<C66320l1.C66321a> {

    /* renamed from: d */
    public final /* synthetic */ C66320l1 f190963d;

    public C66337n1(C66320l1 l1Var) {
        this.f190963d = l1Var;
    }

    public int getItemCount() {
        return this.f190963d.f190924p.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C66320l1.C66321a aVar = (C66320l1.C66321a) zVar;
        C87412m.m108594g(aVar, "holder");
        C66276va vaVar = this.f190963d.f190924p.get(i);
        C87412m.m108593f(vaVar, "curDataList[position]");
        C66276va vaVar2 = vaVar;
        aVar.f44854d.setTag(Integer.valueOf(i));
        aVar.f190929z.setText(vaVar2.field_notify.f184466d);
        C66320l1 l1Var = this.f190963d;
        if (l1Var.f190922n == 0) {
            C66320l1.m78231c3(l1Var, aVar);
            View view = aVar.f44854d;
            C87412m.m108593f(view, "holder.itemView");
            C23564m.m28138h(view, (C23555k.C23562d) null);
            return;
        }
        l1Var.mo90437l3(aVar);
        View view2 = aVar.f44854d;
        C87412m.m108593f(view2, "holder.itemView");
        C23564m.m28138h(view2, new C66335m1(this.f190963d, vaVar2));
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f190963d.getContext()).inflate(C0966R.C0971layout.d86, viewGroup, false);
        inflate.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        return new C66320l1.C66321a(this.f190963d, inflate);
    }
}
