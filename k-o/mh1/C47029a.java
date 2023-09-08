package mh1;

import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bl1.C39773a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.view.LiveNeat7extView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import de3.C75375u;
import di3.C86312j;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import ok1.C62042e;
import p629ny.C76979h;
import rx3.C36570n;
import vg1.C52891f;

/* renamed from: mh1.a */
public final class C47029a extends C60896i<C39773a> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cor;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C39773a aVar = (C39773a) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(aVar, "item");
        C52891f fVar = C52891f.f147704a;
        if (!fVar.mo73655e(oVar, aVar, i, i2, z, list)) {
            if (C62042e.f176370a.mo87105p(aVar)) {
                oVar.mo85812D(C0966R.C0970id.man).setBackground(MMApplicationContext.getContext().getResources().getDrawable(C0966R.C0969drawable.f5139xz));
            } else {
                oVar.mo85812D(C0966R.C0970id.man).setBackground(MMApplicationContext.getContext().getResources().getDrawable(C0966R.C0969drawable.f5166yy));
            }
            LiveNeat7extView liveNeat7extView = (LiveNeat7extView) oVar.mo85812D(C0966R.C0970id.mao);
            C87412m.m108593f(liveNeat7extView, "contentTv");
            fVar.mo73662l(liveNeat7extView);
            Context context = oVar.f173499A;
            C87412m.m108593f(context, "holder.context");
            String c = fVar.mo73653c(context, liveNeat7extView, aVar);
            String str = aVar.f106730i;
            if (str != null) {
                C75375u uVar = new C75375u(((C76979h) C86312j.m106911c(C76979h.class)).yp0(oVar.f173499A, fVar.mo73651a(c, str), 0.0f));
                uVar.mo105705b((ForegroundColorSpan) ((C36570n) C52891f.f147706c).getValue(), 1, c.length() + 1, 33);
                liveNeat7extView.mo104279b(uVar);
                fVar.mo73654d(liveNeat7extView, aVar.mo62408b(), 0, 1, fVar.mo73652b(), uVar);
                fVar.mo73663m(oVar, aVar, (Integer) null);
                View D = oVar.mo85812D(C0966R.C0970id.man);
                C87412m.m108593f(D, "holder.getView(R.id.box_comment_container)");
                fVar.mo73660j(oVar, false, aVar, D);
                fVar.mo73661k(oVar, aVar);
                return;
            }
            C87412m.m108603p("msgContent");
            throw null;
        }
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
