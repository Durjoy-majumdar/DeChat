package com.tencent.p014mm.plugin.finder.profile;

import android.os.Bundle;
import ao1.C0145d1;
import bg1.C0278a;
import bl3.C0324s;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderReportFragment;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileTabUIC;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC;
import gy3.C24560g0;
import gy3.C87412m;
import ht1.C8761d3;
import java.util.Set;
import kotlin.Metadata;
import mo1.C10943a;
import mo1.C11025q;
import mo1.C11057v;
import rs1.C13222f;
import sx3.C110826x0;
import ts1.C14078c;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/profile/FinderProfileUIFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderReportFragment;", "Lbg1/a;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.profile.FinderProfileUIFragment */
public final class FinderProfileUIFragment extends FinderReportFragment implements C0278a {

    /* renamed from: j */
    public final Set<Class<? extends UIComponent>> f16120j = C110826x0.m151017e(FinderProfileTabUIC.class, C10943a.class, FinderProfileHeaderUIC.class, C11025q.class, C0324s.m265a(C24560g0.m30725a(C8761d3.class)), C11057v.class, C13222f.class, C0145d1.class, C14078c.class, FinderProfileUiStyleUIC.class);

    /* renamed from: L */
    public Set<Class<? extends UIComponent>> mo2201L() {
        return this.f16120j;
    }

    /* renamed from: S */
    public int mo3771S() {
        Bundle arguments = getArguments();
        Boolean bool = null;
        String string = arguments != null ? arguments.getString("finder_username") : null;
        C87412m.m108591d(string);
        Bundle arguments2 = getArguments();
        boolean z = false;
        if (arguments2 != null) {
            bool = Boolean.valueOf(arguments2.getBoolean("KEY_FINDER_SELF_FLAG", false));
        }
        C87412m.m108591d(bool);
        boolean booleanValue = bool.booleanValue();
        if (C87412m.m108589b(string, C66785b.f191882e.mo90662O5()) && booleanValue) {
            z = true;
        }
        return z ? 33 : 32;
    }

    /* renamed from: T */
    public int mo3772T() {
        return 3;
    }
}
