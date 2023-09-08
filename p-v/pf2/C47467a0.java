package pf2;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import fx0.C45821d;
import gc0.C20828a;
import gy3.C87412m;
import hc0.C20937c;
import kg3.C76577a;
import kw0.C46746a;
import nf2.C47240a;
import p629ny.C76979h;
import sf0.C77702q0;
import te3.C49699hg;
import te3.C50117ke;
import te3.C50249le;

/* renamed from: pf2.a0 */
public final class C47467a0 extends C47466a {

    /* renamed from: B */
    public final Context f127317B;

    /* renamed from: C */
    public final MMNeat7extView f127318C;

    /* renamed from: D */
    public final TextView f127319D;

    /* renamed from: E */
    public final ImageView f127320E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47467a0(View view, C47240a aVar, C50117ke keVar) {
        super(view, aVar, keVar);
        C87412m.m108594g(view, "itemView");
        C87412m.m108594g(aVar, "outAdapter");
        C87412m.m108594g(keVar, "baseInfo");
        this.f127317B = view.getContext();
        this.f127318C = (MMNeat7extView) view.findViewById(C0966R.C0970id.f6202cs);
        this.f127319D = (TextView) view.findViewById(C0966R.C0970id.lzh);
        this.f127320E = (ImageView) view.findViewById(C0966R.C0970id.lze);
    }

    /* renamed from: y */
    public void mo72488y(C47472c cVar, int i) {
        C87412m.m108594g(cVar, "dataModel");
        C49699hg hgVar = cVar.f127337c;
        C50249le leVar = cVar.f127336b;
        C47478f fVar = C47478f.f127353a;
        Context context = this.f127317B;
        C87412m.m108593f(context, "mContext");
        C47240a aVar = this.f127316z;
        View view = this.f44854d;
        C87412m.m108593f(view, "itemView");
        fVar.mo72496d(context, aVar, view, hgVar, leVar, this.f127315A, i);
        View view2 = this.f44854d;
        C87412m.m108593f(view2, "itemView");
        fVar.mo72493a(view2, i);
        Context context2 = this.f127317B;
        C87412m.m108593f(context2, "mContext");
        MMNeat7extView mMNeat7extView = this.f127318C;
        C87412m.m108593f(mMNeat7extView, "leftTextTv");
        String str = leVar.f137336d;
        C87412m.m108593f(str, "detailInfo.Title");
        boolean z = leVar.f137325I == 1;
        String str2 = leVar.f137340h;
        if (!Util.isNullOrNil(str)) {
            SpannableString T1 = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(mMNeat7extView.getContext(), str);
            C45821d dVar = C45821d.f123719a;
            C87412m.m108593f(T1, "textSpan");
            dVar.mo71288f(T1, mMNeat7extView, z, str2, 5);
        } else {
            mMNeat7extView.mo104279b(context2.getString(C0966R.string.aos));
        }
        if (C77702q0.m93719b(leVar.f137317A)) {
            this.f127319D.setVisibility(8);
        } else {
            this.f127319D.setVisibility(0);
            this.f127319D.setText(leVar.f137317A);
        }
        String str3 = C77702q0.m93719b(leVar.f137343n) ? leVar.f137342j : leVar.f137343n;
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59361q = C0966R.C0969drawable.f4586h2;
        bVar.f59347c = true;
        C20828a.m22825b().mo32519h(str3, this.f127320E, bVar.mo32666a());
        C46746a.m52038k(C46746a.f125826a, this.f127320E, (float) C76577a.m92151b(this.f127317B, 2), false, false, 12, (Object) null);
    }
}
