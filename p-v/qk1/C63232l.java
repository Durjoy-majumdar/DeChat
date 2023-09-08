package qk1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cj1.C54768h6;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import gy3.C87412m;
import java.util.ArrayList;
import p629ny.C76979h;
import wg1.C66075s0;

/* renamed from: qk1.l */
public final class C63232l extends RecyclerView.C16613e<C63233a> {

    /* renamed from: d */
    public final C66075s0 f179439d;

    /* renamed from: e */
    public ArrayList<C54768h6> f179440e = new ArrayList<>();

    /* renamed from: qk1.l$a */
    public final class C63233a extends RecyclerView.C16631z {

        /* renamed from: A */
        public TextView f179441A;

        /* renamed from: z */
        public TextView f179442z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63233a(C63232l lVar, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f179442z = (TextView) view.findViewById(C0966R.C0970id.h5z);
            this.f179441A = (TextView) view.findViewById(C0966R.C0970id.cua);
        }
    }

    public C63232l(C66075s0 s0Var) {
        C87412m.m108594g(s0Var, "presenter");
        this.f179439d = s0Var;
    }

    /* renamed from: F4 */
    public final void mo88139F4(TextView textView, boolean z) {
        if (z) {
            textView.setText(MMApplicationContext.getContext().getResources().getString(C0966R.string.dfw));
            textView.setEnabled(false);
            return;
        }
        textView.setText(MMApplicationContext.getContext().getResources().getString(C0966R.string.dg4));
        textView.setEnabled(true);
    }

    public int getItemCount() {
        return this.f179440e.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C63233a aVar = (C63233a) zVar;
        Class cls = C76979h.class;
        C87412m.m108594g(aVar, "holder");
        C54768h6 h6Var = this.f179440e.get(i);
        C87412m.m108593f(h6Var, "dataList[position]");
        C54768h6 h6Var2 = h6Var;
        String str = h6Var2.f153498a.f144444f;
        boolean z = false;
        aVar.f179442z.setText(!(str == null || str.length() == 0) ? ((C76979h) C86312j.m106911c(cls)).yp0(MMApplicationContext.getContext(), aVar.f44854d.getContext().getResources().getString(C0966R.string.dfr, new Object[]{h6Var2.f153498a.f144443e, str}), aVar.f179442z.getTextSize()) : ((C76979h) C86312j.m106911c(cls)).yp0(MMApplicationContext.getContext(), h6Var2.f153498a.f144443e, aVar.f179442z.getTextSize()));
        TextView textView = aVar.f179441A;
        C87412m.m108593f(textView, "holder.musicFavTips");
        if (h6Var2.f153500c == 51) {
            z = true;
        }
        mo88139F4(textView, z);
        aVar.f179441A.setOnClickListener(new C63236m(this, aVar, h6Var2));
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = View.inflate(viewGroup.getContext(), C0966R.C0971layout.aei, (ViewGroup) null);
        C87412m.m108593f(inflate, "itemView");
        return new C63233a(this, inflate);
    }
}
