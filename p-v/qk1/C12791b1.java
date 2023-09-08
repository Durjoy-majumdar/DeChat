package qk1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import ht1.C60200t1;
import java.util.LinkedList;
import k60.C60979d;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import te3.C52215z41;
import up1.C27696y;

/* renamed from: qk1.b1 */
public final class C12791b1 extends RecyclerView.C16613e<C12792a> {

    /* renamed from: d */
    public LinkedList<C52215z41> f36613d = new LinkedList<>();

    /* renamed from: qk1.b1$a */
    public final class C12792a extends RecyclerView.C16631z {

        /* renamed from: A */
        public final ImageView f36614A;

        /* renamed from: B */
        public final TextView f36615B;

        /* renamed from: z */
        public final TextView f36616z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12792a(C12791b1 b1Var, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f36616z = (TextView) view.findViewById(C0966R.C0970id.f358136n04);
            this.f36614A = (ImageView) view.findViewById(C0966R.C0970id.f358135n03);
            this.f36615B = (TextView) view.findViewById(C0966R.C0970id.f358134n02);
        }
    }

    public int getItemCount() {
        return this.f36613d.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C12792a aVar = (C12792a) zVar;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(aVar, "holder");
        C52215z41 z412 = this.f36613d.get(i);
        C87412m.m108593f(z412, "dataList[position]");
        C52215z41 z413 = z412;
        int i2 = 0;
        aVar.f36616z.setText(aVar.f44854d.getContext().getString(C0966R.string.mfs, new Object[]{Integer.valueOf(z413.f145689g)}));
        TextView textView = aVar.f36616z;
        if (i >= 1 && this.f36613d.get(i - 1).f145689g == z413.f145689g) {
            i2 = 4;
        }
        textView.setVisibility(i2);
        aVar.f36615B.setText(z413.f145687e);
        C39818r rVar = C39818r.f106831a;
        C60979d<C100810g0> f2 = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11871f2();
        C11984n0 n0Var = new C11984n0(z413.f145688f, C27696y.THUMB_IMAGE);
        ImageView imageView = aVar.f36614A;
        C87412m.m108593f(imageView, "holder.rightIv");
        f2.mo85957c(n0Var, imageView, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.DEFAULT));
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.cv7, viewGroup, false);
        C87412m.m108593f(inflate, "from(parent.context).inf…o_item_ui, parent, false)");
        return new C12792a(this, inflate);
    }
}
