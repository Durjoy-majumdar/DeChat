package qk1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cj1.C54785k6;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import er1.C58739j4;
import fj1.C45795b;
import fy3.C32228q;
import gy3.C87412m;
import java.util.ArrayList;
import ok1.C62042e;
import p629ny.C76979h;
import rx3.C13598b0;
import sx3.C64197v;

/* renamed from: qk1.c0 */
public final class C63199c0 extends RecyclerView.C16613e<C63200a> {

    /* renamed from: d */
    public final C45795b f179311d;

    /* renamed from: e */
    public final String f179312e = "FinderLiveAnchorMusicEditAdapter";

    /* renamed from: f */
    public ArrayList<C54785k6> f179313f = new ArrayList<>();

    /* renamed from: g */
    public C54785k6 f179314g;

    /* renamed from: h */
    public C32228q<? super View, ? super Integer, ? super C54785k6, C13598b0> f179315h;

    /* renamed from: qk1.c0$a */
    public final class C63200a extends RecyclerView.C16631z {

        /* renamed from: A */
        public TextView f179316A;

        /* renamed from: B */
        public WeImageView f179317B;

        /* renamed from: C */
        public TextView f179318C;

        /* renamed from: D */
        public final TextView f179319D;

        /* renamed from: z */
        public CheckBox f179320z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63200a(C63199c0 c0Var, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f179320z = (CheckBox) view.findViewById(C0966R.C0970id.mvc);
            this.f179316A = (TextView) view.findViewById(C0966R.C0970id.f359210mw0);
            this.f179317B = (WeImageView) view.findViewById(C0966R.C0970id.mvz);
            this.f179318C = (TextView) view.findViewById(C0966R.C0970id.mvs);
            this.f179319D = (TextView) view.findViewById(C0966R.C0970id.mwa);
        }
    }

    public C63199c0(C45795b bVar) {
        C87412m.m108594g(bVar, "liveData");
        this.f179311d = bVar;
    }

    /* renamed from: F4 */
    public final void mo88112F4(ArrayList<C54785k6> arrayList, String str) {
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
                    sb4.append((C54785k6) next);
                    sb4.append(']');
                    sb.append(sb4.toString());
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            Log.m105924i(this.f179312e, sb.toString());
        }
    }

    public int getItemCount() {
        int size = this.f179313f.size();
        C62042e eVar = C62042e.f176370a;
        String str = this.f179312e;
        eVar.mo86998D1(str, "getItemCount " + size);
        return size;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C63200a aVar = (C63200a) zVar;
        Class cls = C76979h.class;
        C87412m.m108594g(aVar, "holder");
        C54785k6 k6Var = this.f179313f.get(i);
        C87412m.m108593f(k6Var, "dataList[position]");
        C54785k6 k6Var2 = k6Var;
        boolean z = true;
        aVar.f179320z.setChecked(k6Var2.f153569d);
        aVar.f179316A.setText(((C76979h) C86312j.m106911c(cls)).yp0(MMApplicationContext.getContext(), k6Var2.f153566a, aVar.f179316A.getTextSize()));
        aVar.f179318C.setText(((C76979h) C86312j.m106911c(cls)).yp0(MMApplicationContext.getContext(), String.valueOf(k6Var2.f153567b), aVar.f179316A.getTextSize()));
        aVar.f179319D.setText(((C76979h) C86312j.m106911c(cls)).yp0(MMApplicationContext.getContext(), k6Var2.f153573h, aVar.f179316A.getTextSize()));
        if (((C54991o) this.f179311d.mo71262a(C54991o.class)).mo75999e4()) {
            aVar.f179317B.setVisibility(8);
            if (k6Var2.f153567b <= 0) {
                aVar.f179318C.setText("-");
            }
            aVar.f179318C.setVisibility(0);
            CharSequence text = aVar.f179319D.getText();
            if (!(text == null || text.length() == 0)) {
                z = false;
            }
            if (z) {
                aVar.f179319D.setVisibility(8);
            } else {
                aVar.f179319D.setVisibility(0);
            }
        } else {
            aVar.f179318C.setVisibility(8);
            aVar.f179317B.setVisibility(0);
            aVar.f179319D.setVisibility(8);
        }
        aVar.f44854d.setOnClickListener(new C63202d0(this, aVar, i, k6Var2));
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = View.inflate(viewGroup.getContext(), C0966R.C0971layout.csl, (ViewGroup) null);
        C87412m.m108593f(inflate, "itemView");
        return new C63200a(this, inflate);
    }
}
