package bz2;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import mz2.C47148a;
import p773yy.C79168k;
import qy2.C47894a0;
import qy2.C47896n;
import qy2.C47898p;
import su0.C13781a;
import uz2.C52673c1;
import uz2.C52691j0;
import z04.C112551y;

/* renamed from: bz2.a */
public final class C39872a extends C60896i<C47148a> {

    /* renamed from: e */
    public View.OnLongClickListener f106930e;

    public C39872a(View.OnLongClickListener onLongClickListener) {
        C87412m.m108594g(onLongClickListener, "longClickListener");
        this.f106930e = onLongClickListener;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.c8v;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C47148a aVar = (C47148a) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(aVar, "item");
        Log.m105924i("MicroMsg.TextStatus.AlbumItemConvert", "onBindViewHolder");
        Object obj = oVar.f173502D;
        C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.api.IStatusCardView");
        C47896n nVar = (C47896n) obj;
        nVar.getView().setTag(C0966R.C0970id.g6r, aVar);
        nVar.getView().setOnLongClickListener(this.f106930e);
        nVar.getView().setTag(C0966R.C0970id.ke6, Integer.valueOf(i));
        nVar.getView().setTag(C0966R.C0970id.ke4, aVar.f126664d);
        if (nVar instanceof C47898p) {
            C52691j0 j0Var = new C52691j0();
            C52673c1 c1Var = aVar.f126664d;
            j0Var.f147145d = c1Var.f147070g + c1Var.f147072i;
            String a = C13781a.m13082a();
            C87412m.m108593f(a, "username()");
            ((C47898p) nVar).mo72646a(a, aVar.f126665e, j0Var);
        }
        String str = aVar.f126666f;
        boolean z2 = true;
        if (!(str == null || C112551y.m153811k(str))) {
            TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.kyu);
            textView.setVisibility(0);
            textView.setText(aVar.f126666f);
        } else {
            ((TextView) oVar.mo85812D(C0966R.C0970id.kyu)).setVisibility(8);
        }
        String str2 = aVar.f126667g;
        if (str2 != null && !C112551y.m153811k(str2)) {
            z2 = false;
        }
        if (!z2) {
            TextView textView2 = (TextView) oVar.mo85812D(C0966R.C0970id.kx4);
            textView2.setVisibility(0);
            textView2.setText(aVar.f126667g);
            return;
        }
        ((TextView) oVar.mo85812D(C0966R.C0970id.kx4)).setVisibility(8);
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        Log.m105924i("MicroMsg.TextStatus.AlbumItemConvert", "onCreateViewHolder");
        View view = oVar.f44854d;
        C87412m.m108592e(view, "null cannot be cast to non-null type android.widget.LinearLayout");
        C47894a0 a0Var = new C47894a0();
        a0Var.f128516d |= 4;
        a0Var.mo72637c(true);
        a0Var.f128517e = true;
        a0Var.f128519g = 6;
        a0Var.f128516d = (a0Var.f128516d & -4097) | 2048;
        C47896n Kw = ((C79168k) C86312j.m106911c(C79168k.class)).mo74113Kw(recyclerView.getContext(), a0Var);
        ((LinearLayout) view).addView(Kw.getView());
        oVar.f173502D = Kw;
        ViewGroup.LayoutParams layoutParams = Kw.getView().getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((LinearLayout.LayoutParams) layoutParams).width = -1;
    }
}
