package com.tencent.p014mm.plugin.finder.profile.uic;

import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileTabUIC;
import java.util.Set;
import kotlin.Metadata;
import rs1.C63599o1;
import sx3.C22415w0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/profile/uic/FinderProfileEmojiFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "Lcom/tencent/mm/plugin/finder/profile/uic/FinderProfileTabUIC$a;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileEmojiFragment */
public final class FinderProfileEmojiFragment extends FinderHomeTabFragment implements FinderProfileTabUIC.C56223a {
    public FinderProfileEmojiFragment() {
        this.f17334o = 112;
    }

    /* renamed from: L */
    public Set<Class<? extends UIComponent>> mo2201L() {
        return C22415w0.m26092a(C63599o1.class);
    }

    /* renamed from: e */
    public void mo3765e(boolean z) {
        C63599o1 o1Var = (C63599o1) C39818r.f106831a.mo62445d(this).mo62449e(C63599o1.class);
        if (o1Var == null) {
            return;
        }
        if (z) {
            o1Var.mo88457d3().f191592a.setBackgroundResource(C0966R.color.ahf);
        } else {
            o1Var.mo88457d3().f191592a.setBackgroundResource(C0966R.color.f2932f);
        }
    }
}
