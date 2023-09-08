package gs1;

import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.view.FinderPostEditText;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: gs1.i */
public final class C59693i {

    /* renamed from: a */
    public C59694k f170527a;

    /* renamed from: b */
    public C59692c f170528b = new C59692c();

    /* renamed from: c */
    public C59691a f170529c = new C59691a();

    public C59693i(FinderPostEditText finderPostEditText, MMActivity mMActivity) {
        C87412m.m108594g(finderPostEditText, "descTv");
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f170527a = new C59694k(finderPostEditText, mMActivity);
    }

    /* renamed from: a */
    public final C59692c mo84676a() {
        C59692c cVar = this.f170528b;
        if (cVar != null) {
            return cVar;
        }
        C87412m.m108603p("atManager");
        throw null;
    }
}
