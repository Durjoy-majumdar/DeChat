package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.os.Bundle;
import androidx.lifecycle.C0120a0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import er1.C58782w0;
import il1.C9118u;
import java.util.Set;
import kj1.C10125e1;
import kotlin.Metadata;
import nj3.C88989a;
import sx3.C110826x0;
import vo3.C90852c;
import wc1.C15094k;
import xk1.C15715a2;
import xk1.C15717b2;
import xk1.C15718c2;
import xk1.C15728e1;
import xk1.C15743j1;
import xk1.C15746k;
import xk1.C15751k1;
import xk1.C15775s1;
import xk1.C15794y1;
import xk1.C15798z1;
import xk1.C66331m;
import xk1.C66338o;
import xk1.C66340p;
import xk1.C66342q0;
import xk1.C66344r;
import xk1.C66355w;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderGameLivePostUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderGameLiveBaseUI;", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(32)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderGameLivePostUI */
public final class FinderGameLivePostUI extends FinderGameLiveBaseUI {

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderGameLivePostUI$a */
    public static final class C2930a<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ FinderGameLivePostUI f14410d;

        public C2930a(FinderGameLivePostUI finderGameLivePostUI) {
            this.f14410d = finderGameLivePostUI;
        }

        public void onChanged(Object obj) {
            C10125e1.C10132d dVar;
            C9118u uVar;
            C15751k1.C15752a aVar = (C15751k1.C15752a) obj;
            int i = aVar.f42478b;
            boolean z = aVar.f42477a;
            C10125e1 e1Var = ((C15715a2) C39818r.f106831a.mo62444c(this.f14410d).mo75002a(C15715a2.class)).f42407i;
            if (e1Var != null && (dVar = e1Var.f30989h) != null && (uVar = dVar.f31037c) != null) {
                uVar.mo9934a(i, z);
            }
        }
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C110826x0.m151017e(C66331m.class, C15746k.class, C15094k.class, C15728e1.class, C15715a2.class, C66342q0.class, C15717b2.class, C15775s1.class, C15798z1.class, C66344r.class, C66338o.class, C66340p.class, C15794y1.class, C66355w.class, C15751k1.class, C15743j1.class, C15718c2.class);
    }

    public void onCreate(Bundle bundle) {
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        setSelfNavigationBarVisible(8);
        getWindow().addFlags(67108864);
        getWindow().clearFlags(67108864);
        getWindow().getDecorView().setSystemUiVisibility(1792);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        getWindow().setFormat(-3);
        getWindow().setSoftInputMode(51);
        C58782w0.f168290a.mo83842a(findViewById(C0966R.C0970id.dvn));
        ((C15751k1) C39818r.f106831a.mo62444c(this).mo75002a(C15751k1.class)).f42476f.observe(this, new C2930a(this));
    }
}
