package fl3;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C31543z5;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import p196ln.C76705f;
import p773yy.C79168k;
import qy2.C63347a;

/* renamed from: fl3.c */
public final class C59250c extends C60896i<C59252d> {

    /* renamed from: fl3.c$a */
    public final class C59251a extends C60905o {

        /* renamed from: G */
        public final TextView f169409G;

        /* renamed from: H */
        public final TextView f169410H;

        /* renamed from: I */
        public final ImageView f169411I;

        /* renamed from: J */
        public final TextView f169412J;

        /* renamed from: K */
        public final RelativeLayout f169413K;

        /* renamed from: L */
        public final RelativeLayout f169414L;

        /* renamed from: M */
        public final View f169415M;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59251a(C59250c cVar, View view) {
            super(view);
            C87412m.m108594g(view, "view");
            this.f169409G = (TextView) view.findViewById(C0966R.C0970id.bqq);
            TextView textView = (TextView) view.findViewById(C0966R.C0970id.hg4);
            this.f169410H = textView;
            this.f169411I = (ImageView) view.findViewById(C0966R.C0970id.a27);
            this.f169412J = (TextView) view.findViewById(C0966R.C0970id.f358886hn3);
            this.f169413K = (RelativeLayout) view.findViewById(C0966R.C0970id.bqy);
            this.f169414L = (RelativeLayout) view.findViewById(C0966R.C0970id.bqp);
            this.f169415M = view.findViewById(C0966R.C0970id.f358858hg2);
            if (textView.getPaint() != null) {
                C85875k4.m106189j0(textView.getPaint(), 0.1f);
            }
        }
    }

    /* renamed from: a */
    public View mo13760a(RecyclerView recyclerView) {
        C87412m.m108594g(recyclerView, "recyclerView");
        return LayoutInflater.from(recyclerView.getContext()).inflate(C0966R.C0971layout.f6365y4, recyclerView, false);
    }

    /* renamed from: b */
    public C60905o mo25318b(RecyclerView recyclerView, View view) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(view, "convertView");
        return new C59251a(this, view);
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C59252d dVar = (C59252d) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(dVar, "item");
        long c = C31543z5.m39453c();
        C59251a aVar = (C59251a) oVar;
        if (!dVar.f169421i) {
            aVar.f169413K.setBackground(C74942w4.m89785b(aVar.f173499A, C0966R.attr.f2868u6));
        } else {
            aVar.f169413K.setBackground((Drawable) null);
        }
        if (dVar.f169419g) {
            aVar.f169414L.setVisibility(0);
            aVar.f169409G.setText(dVar.f169420h);
            aVar.f169409G.setVisibility(0);
        } else {
            aVar.f169414L.setVisibility(8);
            aVar.f169409G.setVisibility(8);
        }
        ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(aVar.f169411I, dVar.f169416d.getUsername());
        if (C72996z1.m85843n5(dVar.f169416d.getUsername())) {
            aVar.f169412J.setText(dVar.f169424o);
            aVar.f169412J.setVisibility(0);
        } else {
            aVar.f169412J.setVisibility(8);
        }
        aVar.f169410H.setText(dVar.f169423n);
        ((C79168k) C86312j.m106911c(C79168k.class)).mo74130ns(aVar.f169410H, dVar.f169416d.getUsername(), C63347a.C47892c.CONTACT_LIST, C63347a.C47893d.OUTLINED);
        Log.m105924i("MicroMsg.Mvvm.AddressItemConvert", "onBindViewHolder " + (C31543z5.m39453c() - c));
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
