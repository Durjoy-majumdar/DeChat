package do1;

import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore;

/* renamed from: do1.d */
public final class C58336d<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ FinderStreamTabPreloadCore f167022d;

    public C58336d(FinderStreamTabPreloadCore finderStreamTabPreloadCore) {
        this.f167022d = finderStreamTabPreloadCore;
    }

    public void onChanged(Object obj) {
        C55718s0 s0Var;
        C2479n0.C2480a aVar = (C2479n0.C2480a) obj;
        if (aVar.f12908a && (s0Var = aVar.f12910c) != null) {
            this.f167022d.mo78462l3(s0Var, true);
        }
    }
}
