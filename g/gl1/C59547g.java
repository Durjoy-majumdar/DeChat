package gl1;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin;
import dh1.C58266c;
import gy3.C87412m;
import ok1.C62042e;
import vk1.C65761b;

/* renamed from: gl1.g */
public final class C59547g extends C58266c {

    /* renamed from: j */
    public final String f170180j = "FinderLiveSecondaryEndUIC";

    /* renamed from: n */
    public FinderLiveAnchorAfterPlugin f170181n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59547g(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, "context");
    }

    /* renamed from: i */
    public void mo83045i(C65761b bVar) {
        C87412m.m108594g(bVar, "baseRouter");
        super.mo83045i(bVar);
        C65761b bVar2 = this.f166842f;
        if (bVar2 != null) {
            View findViewById = bVar2.findViewById(C0966R.C0970id.dan);
            C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…ive_anchor_after_ui_root)");
            FinderLiveAnchorAfterPlugin finderLiveAnchorAfterPlugin = new FinderLiveAnchorAfterPlugin((ViewGroup) findViewById, bVar2);
            this.f170181n = finderLiveAnchorAfterPlugin;
            finderLiveAnchorAfterPlugin.mo10792g(8);
        }
    }

    /* renamed from: j */
    public final void mo84601j() {
        Class cls = C54991o.class;
        if (((C54991o) mo83051g(cls)).mo75997d4()) {
            C62042e.m72809u1(C62042e.f176370a, ((C55001u) mo83051g(C55001u.class)).f154420q.f182392d, ((C54991o) mo83051g(cls)).f154345o, 2, 0, 8, (Object) null);
        }
    }
}
