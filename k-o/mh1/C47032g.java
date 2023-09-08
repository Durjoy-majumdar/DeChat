package mh1;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bl1.C39775b;
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
import p629ny.C76979h;
import rx3.C36570n;
import vg1.C52891f;
import wk1.C15460p;

/* renamed from: mh1.g */
public final class C47032g extends C60896i<C39775b> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cor;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C39775b bVar = (C39775b) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(bVar, "item");
        LiveNeat7extView liveNeat7extView = (LiveNeat7extView) oVar.mo85812D(C0966R.C0970id.mao);
        C52891f fVar = C52891f.f147704a;
        C87412m.m108593f(liveNeat7extView, "contentTv");
        fVar.mo73662l(liveNeat7extView);
        Context context = oVar.f173499A;
        C75375u uVar = new C75375u(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(context, context.getString(C0966R.string.dge, new Object[]{bVar.getContent()})));
        uVar.mo105705b((C15460p) ((C36570n) C52891f.f147708e).getValue(), 0, ((String) ((C36570n) C52891f.f147707d).getValue()).length() + 0, 33);
        liveNeat7extView.mo104279b(uVar);
        fVar.mo73663m(oVar, bVar, (Integer) null);
        oVar.mo85812D(C0966R.C0970id.man).setBackground(MMApplicationContext.getContext().getResources().getDrawable(C0966R.C0969drawable.f5166yy));
        oVar.mo85812D(C0966R.C0970id.man).setOnTouchListener((View.OnTouchListener) null);
        oVar.mo85812D(C0966R.C0970id.iox).setOnClickListener((View.OnClickListener) null);
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
