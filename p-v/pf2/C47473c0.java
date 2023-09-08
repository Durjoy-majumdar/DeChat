package pf2;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import gc0.C20828a;
import gy3.C87412m;
import hc0.C20937c;
import kg3.C76577a;
import kw0.C46746a;
import nf2.C47240a;
import sf0.C77702q0;
import te3.C49699hg;
import te3.C50117ke;
import te3.C50249le;

/* renamed from: pf2.c0 */
public final class C47473c0 extends C47466a {

    /* renamed from: B */
    public final Context f127338B;

    /* renamed from: C */
    public final TextView f127339C;

    /* renamed from: D */
    public final TextView f127340D;

    /* renamed from: E */
    public final ImageView f127341E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47473c0(View view, C47240a aVar, C50117ke keVar) {
        super(view, aVar, keVar);
        C87412m.m108594g(view, "itemView");
        C87412m.m108594g(aVar, "outAdapter");
        C87412m.m108594g(keVar, "baseInfo");
        this.f127338B = view.getContext();
        this.f127339C = (TextView) view.findViewById(C0966R.C0970id.lzi);
        this.f127340D = (TextView) view.findViewById(C0966R.C0970id.lzh);
        this.f127341E = (ImageView) view.findViewById(C0966R.C0970id.lze);
    }

    /* renamed from: y */
    public void mo72488y(C47472c cVar, int i) {
        C87412m.m108594g(cVar, "dataModel");
        C49699hg hgVar = cVar.f127337c;
        C50249le leVar = cVar.f127336b;
        C47478f fVar = C47478f.f127353a;
        Context context = this.f127338B;
        C87412m.m108593f(context, "mContext");
        C47240a aVar = this.f127316z;
        View view = this.f44854d;
        C87412m.m108593f(view, "itemView");
        fVar.mo72496d(context, aVar, view, hgVar, leVar, this.f127315A, i);
        View view2 = this.f44854d;
        C87412m.m108593f(view2, "itemView");
        fVar.mo72493a(view2, i);
        this.f127339C.setText(leVar.f137336d);
        if (C77702q0.m93719b(leVar.f137317A)) {
            this.f127340D.setVisibility(8);
        } else {
            this.f127340D.setVisibility(0);
            this.f127340D.setText(leVar.f137317A);
        }
        String str = C77702q0.m93719b(leVar.f137343n) ? leVar.f137342j : leVar.f137343n;
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59361q = C0966R.C0969drawable.f4586h2;
        bVar.f59347c = true;
        C20828a.m22825b().mo32519h(str, this.f127341E, bVar.mo32666a());
        C46746a.m52038k(C46746a.f125826a, this.f127341E, (float) C76577a.m92151b(this.f127338B, 2), false, false, 12, (Object) null);
    }
}
