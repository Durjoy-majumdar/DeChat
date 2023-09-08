package qk1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cj1.C54768h6;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import er1.C58739j4;
import fy3.C32228q;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import ok1.C62042e;
import p629ny.C76979h;
import rx3.C13598b0;
import sx3.C64197v;

/* renamed from: qk1.j */
public final class C63224j extends RecyclerView.C16613e<C63225a> {

    /* renamed from: d */
    public final String f179413d = "FinderLiveAnchorMusicEditAdapter";

    /* renamed from: e */
    public LinkedList<Integer> f179414e = new LinkedList<>();

    /* renamed from: f */
    public ArrayList<C54768h6> f179415f = new ArrayList<>();

    /* renamed from: g */
    public C54768h6 f179416g;

    /* renamed from: h */
    public C54768h6 f179417h = this.f179416g;

    /* renamed from: i */
    public C32228q<? super View, ? super Integer, ? super C54768h6, C13598b0> f179418i;

    /* renamed from: qk1.j$a */
    public final class C63225a extends RecyclerView.C16631z {

        /* renamed from: A */
        public TextView f179419A;

        /* renamed from: B */
        public TextView f179420B;

        /* renamed from: z */
        public CheckBox f179421z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63225a(C63224j jVar, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f179421z = (CheckBox) view.findViewById(C0966R.C0970id.h64);
            this.f179419A = (TextView) view.findViewById(C0966R.C0970id.h6u);
            this.f179420B = (TextView) view.findViewById(C0966R.C0970id.jll);
        }
    }

    /* renamed from: F4 */
    public final void mo88133F4(ArrayList<C54768h6> arrayList, String str) {
        if (C58739j4.f168176a.mo83692U()) {
            StringBuilder sb = new StringBuilder(str + "(MusicList):");
            int i = 0;
            for (T next : arrayList) {
                int i2 = i + 1;
                if (i >= 0) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append('[');
                    sb4.append(i);
                    sb4.append(',');
                    sb4.append((C54768h6) next);
                    sb4.append(']');
                    sb.append(sb4.toString());
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            Log.m105924i(this.f179413d, sb.toString());
        }
    }

    public int getItemCount() {
        int size = this.f179415f.size();
        C62042e eVar = C62042e.f176370a;
        String str = this.f179413d;
        eVar.mo86998D1(str, "getItemCount " + size);
        return size;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C63225a aVar = (C63225a) zVar;
        Class cls = C76979h.class;
        C87412m.m108594g(aVar, "holder");
        C54768h6 h6Var = this.f179415f.get(i);
        C87412m.m108593f(h6Var, "dataList[position]");
        C54768h6 h6Var2 = h6Var;
        CheckBox checkBox = aVar.f179421z;
        boolean z = true;
        if (!h6Var2.f153502e) {
            z = false;
        }
        checkBox.setChecked(z);
        aVar.f179419A.setText(((C76979h) C86312j.m106911c(cls)).yp0(MMApplicationContext.getContext(), h6Var2.f153498a.f144443e, aVar.f179419A.getTextSize()));
        aVar.f179420B.setText(((C76979h) C86312j.m106911c(cls)).yp0(MMApplicationContext.getContext(), h6Var2.f153498a.f144444f, aVar.f179420B.getTextSize()));
        aVar.f44854d.setOnClickListener(new C63229k(this, aVar, i, h6Var2));
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = View.inflate(viewGroup.getContext(), C0966R.C0971layout.aea, (ViewGroup) null);
        C87412m.m108593f(inflate, "itemView");
        return new C63225a(this, inflate);
    }
}
