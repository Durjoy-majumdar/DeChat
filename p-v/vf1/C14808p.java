package vf1;

import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderCreateAccountStarterActivity;
import com.tencent.p014mm.plugin.finder.view.C4191v0;

/* renamed from: vf1.p */
public final class C14808p implements C4191v0.C4192a {

    /* renamed from: a */
    public final /* synthetic */ FinderCreateAccountStarterActivity f40796a;

    public C14808p(FinderCreateAccountStarterActivity finderCreateAccountStarterActivity) {
        this.f40796a = finderCreateAccountStarterActivity;
    }

    public final void onDismiss() {
        FinderCreateAccountStarterActivity finderCreateAccountStarterActivity = this.f40796a;
        if (!finderCreateAccountStarterActivity.f14266u) {
            FinderCreateAccountStarterActivity.m2730N7(finderCreateAccountStarterActivity, 2);
        }
        FinderCreateAccountStarterActivity finderCreateAccountStarterActivity2 = this.f40796a;
        finderCreateAccountStarterActivity2.f14265t = null;
        if (!finderCreateAccountStarterActivity2.isFinishing()) {
            this.f40796a.finish();
        }
    }
}
