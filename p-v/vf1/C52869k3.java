package vf1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLivePostSelectContactUI;
import hp3.C87581a;
import nj3.C76912y0;
import ob0.C89132b;
import rx3.C13598b0;

/* renamed from: vf1.k3 */
public final class C52869k3<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ FinderLivePostSelectContactUI f147668a;

    public C52869k3(FinderLivePostSelectContactUI finderLivePostSelectContactUI) {
        this.f147668a = finderLivePostSelectContactUI;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            this.f147668a.finish();
            FinderLivePostSelectContactUI finderLivePostSelectContactUI = this.f147668a;
            int i = FinderLivePostSelectContactUI.f111537J;
            finderLivePostSelectContactUI.mo64522g8();
            this.f147668a.mo103379N7().notifyDataSetChanged();
        } else {
            this.f147668a.enableOptionMenu(1, true);
            C76912y0.m92767f(this.f147668a.getContext(), this.f147668a.getContext().getResources().getString(C0966R.string.n2i));
        }
        return C13598b0.f38549a;
    }
}
