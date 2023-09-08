package dz2;

import android.text.SpannableString;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import kg3.C76577a;
import p196ln.C76705f;
import p629ny.C76979h;
import p773yy.C79168k;
import pz2.C47728c;
import qy2.C63347a;

/* renamed from: dz2.i */
public final class C45507i extends C60896i<C47728c> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.c9s;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C47728c cVar2 = (C47728c) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(cVar2, "item");
        C72996z1 N2 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69664N2(cVar2.f128237d.f147301d);
        if (N2 != null && N2.mo62927s3()) {
            TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.kxw);
            SpannableString op02 = ((C76979h) C86312j.m106911c(C76979h.class)).op0(oVar.f173499A, N2.mo62898f(), C76577a.m92157h(oVar.f173499A, C0966R.dimen.f3927j7));
            C87412m.m108593f(op02, "getService(ISpannableSer….R.dimen.NormalTextSize))");
            CharSequence Fe = ((C79168k) C86312j.m106911c(C79168k.class)).mo74108Fe((TextView) oVar.mo85812D(C0966R.C0970id.kxb), N2.getUsername(), op02, C63347a.C47892c.CONVERSATION_LIST, (float) C76577a.m92157h(oVar.f173499A, C0966R.dimen.f3927j7));
            C87412m.m108593f(Fe, "getService(ITextStatusSe…ormalTextSize).toFloat())");
            ((TextView) oVar.mo85812D(C0966R.C0970id.kxb)).setText(Fe);
            textView.setText(oVar.f173499A.getString(cVar2.f128237d.f147303f == 1 ? C0966R.string.jzh : C0966R.string.k1m));
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z((ImageView) oVar.mo85812D(C0966R.C0970id.fcc), N2.getUsername());
            oVar.f44854d.setOnClickListener(new C45506h(N2, oVar));
        }
        ((TextView) oVar.mo85812D(C0966R.C0970id.kyj)).setText(C72715f.m85112e(oVar.f173499A, ((long) cVar2.f128237d.f147302e) * 1000, true));
        ((ImageView) oVar.mo85812D(C0966R.C0970id.fdc)).setVisibility(4);
        ((TextView) oVar.mo85812D(C0966R.C0970id.h2q)).setVisibility(4);
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
