package vs1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import rx3.C13598b0;
import te3.C51215sa1;

/* renamed from: vs1.l */
public final class C14997l extends RecyclerView.C16613e<C14998a> {

    /* renamed from: d */
    public final ArrayList<C51215sa1> f41109d = new ArrayList<>();

    /* renamed from: e */
    public C32226l<? super C51215sa1, C13598b0> f41110e;

    /* renamed from: vs1.l$a */
    public final class C14998a extends RecyclerView.C16631z {

        /* renamed from: A */
        public final TextView f41111A;

        /* renamed from: z */
        public final TextView f41112z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14998a(C14997l lVar, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f41112z = (TextView) view.findViewById(C0966R.C0970id.nhg);
            this.f41111A = (TextView) view.findViewById(C0966R.C0970id.nhy);
        }
    }

    public int getItemCount() {
        return this.f41109d.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C14998a aVar = (C14998a) zVar;
        C87412m.m108594g(aVar, "holder");
        aVar.f41112z.setText(C72715f.m85114g(aVar.f44854d.getContext().getString(C0966R.string.msi), ((long) this.f41109d.get(i).f141394j) * ((long) 1000)));
        aVar.f41111A.setText(this.f41109d.get(i).f141389e);
        CharSequence text = aVar.f41111A.getText();
        if (text == null || text.length() == 0) {
            aVar.f41111A.setText(aVar.f44854d.getContext().getResources().getString(C0966R.string.msg, new Object[]{this.f41109d.get(i).f141400s}));
        }
        aVar.f44854d.setOnClickListener(new C14999m(this, i));
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f359763d01, viewGroup, false);
        C87412m.m108593f(inflate, "itemView");
        return new C14998a(this, inflate);
    }
}
