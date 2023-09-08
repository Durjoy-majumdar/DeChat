package qp1;

import android.app.Activity;
import com.tencent.p014mm.plugin.finder.shopping.presenter.FinderLiveShoppingManagerPresenter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import sp1.C64100l0;

/* renamed from: qp1.h */
public final class C63313h {

    /* renamed from: a */
    public final Activity f179650a;

    /* renamed from: b */
    public final FinderLiveShoppingManagerPresenter f179651b;

    /* renamed from: c */
    public C64100l0 f179652c;

    public C63313h(Activity activity, FinderLiveShoppingManagerPresenter finderLiveShoppingManagerPresenter) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(finderLiveShoppingManagerPresenter, "presenter");
        this.f179650a = activity;
        this.f179651b = finderLiveShoppingManagerPresenter;
    }
}
