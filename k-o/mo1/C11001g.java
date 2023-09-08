package mo1;

import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import gg1.C32444a;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: mo1.g */
public final class C11001g implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C10943a f32714d;

    public C11001g(C10943a aVar) {
        this.f32714d = aVar;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        if (e0Var.mo107176v()) {
            e0Var.mo107125a(10012, C0966R.string.eib);
            if (((FinderProfileHeaderUIC) C39818r.f106831a.mo62444c(this.f32714d.getActivity()).mo75002a(FinderProfileHeaderUIC.class)).f16229b1) {
                C32444a aVar = C32444a.f86121a;
                if (C32444a.f86039B2.mo60266n().intValue() == 1 || !C85875k4.m106210y()) {
                    e0Var.mo107125a(10013, C0966R.string.eku);
                } else {
                    Log.m105924i("Finder.SelfProfileActionBarUIC", "doShowPostBottomSheet pad can't create live!");
                }
            }
        }
    }
}
