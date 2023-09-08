package gs1;

import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.view.FinderPostEditText;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import er1.C58773q5;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;

/* renamed from: gs1.k */
public final class C59694k {

    /* renamed from: a */
    public final MMActivity f170530a;

    /* renamed from: b */
    public final List<C58773q5> f170531b = new ArrayList();

    public C59694k(FinderPostEditText finderPostEditText, MMActivity mMActivity) {
        C87412m.m108594g(finderPostEditText, "descTv");
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f170530a = mMActivity;
    }
}
