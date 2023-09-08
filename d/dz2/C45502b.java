package dz2;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import gc0.C20828a;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import kg3.C76577a;
import m02.C46940b;
import p196ln.C76705f;
import p629ny.C76979h;
import p773yy.C79168k;
import pz2.C47726a;
import qy2.C63347a;

/* renamed from: dz2.b */
public final class C45502b extends C60896i<C47726a> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.c9c;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C47726a aVar = (C47726a) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(aVar, "item");
        C72996z1 K30 = ((C46940b) C86312j.m106911c(C46940b.class)).K30(aVar.f128235d.f147190f, 1);
        if (K30 == null || !K30.mo62927s3()) {
            ((TextView) oVar.mo85812D(C0966R.C0970id.kxb)).setText(aVar.f128235d.f147188d);
            C20828a.m22825b().mo32518g(aVar.f128235d.f147189e, (ImageView) oVar.mo85812D(C0966R.C0970id.fcc));
            oVar.f44854d.setOnClickListener((View.OnClickListener) null);
        } else {
            SpannableString op02 = ((C76979h) C86312j.m106911c(C76979h.class)).op0(oVar.f173499A, K30.mo62898f(), C76577a.m92157h(oVar.f173499A, C0966R.dimen.f3927j7));
            C87412m.m108593f(op02, "getService(ISpannableSer….R.dimen.NormalTextSize))");
            CharSequence Fe = ((C79168k) C86312j.m106911c(C79168k.class)).mo74108Fe((TextView) oVar.mo85812D(C0966R.C0970id.kxb), K30.getUsername(), op02, C63347a.C47892c.CONVERSATION_LIST, (float) C76577a.m92157h(oVar.f173499A, C0966R.dimen.f3927j7));
            C87412m.m108593f(Fe, "getService(ITextStatusSe…ormalTextSize).toFloat())");
            ((TextView) oVar.mo85812D(C0966R.C0970id.kxb)).setText(Fe);
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z((ImageView) oVar.mo85812D(C0966R.C0970id.fcc), K30.getUsername());
            oVar.f44854d.setOnClickListener(new C45501a(K30, oVar));
        }
        Drawable drawable = MMApplicationContext.getContext().getResources().getDrawable(C0966R.raw.icons_outlined_like);
        C74933u4.m89769f(drawable, MMApplicationContext.getContext().getResources().getColor(C0966R.color.f3133gi));
        ((ImageView) oVar.mo85812D(C0966R.C0970id.f67)).setImageDrawable(drawable);
        ((TextView) oVar.mo85812D(C0966R.C0970id.kyj)).setText(C72715f.m85112e(oVar.f173499A, ((long) aVar.f128235d.f147192h) * 1000, true));
        ((TextView) oVar.mo85812D(C0966R.C0970id.h2q)).setVisibility(4);
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
