package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import in3.C87773e;
import java.util.Set;
import kotlin.Metadata;
import l31.C61212e;
import nj3.C88989a;
import o31.C11345b;
import o31.C76986a;
import sx3.C110826x0;
import wf1.C15162a;
import wf1.C15221m0;
import wf1.C15242u0;
import wf1.C15249x0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLivePostPendingUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(7)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLivePostPendingUI */
public final class FinderLivePostPendingUI extends MMFinderUI {

    /* renamed from: p */
    public static boolean f14540p;

    /* renamed from: o */
    public final String f14541o = "Finder.FinderLivePostPendingUI";

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLivePostPendingUI$a */
    public static final class C2967a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLivePostPendingUI f14542d;

        public C2967a(FinderLivePostPendingUI finderLivePostPendingUI) {
            this.f14542d = finderLivePostPendingUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f14542d.finish();
            return true;
        }
    }

    /* renamed from: J7 */
    public String mo2994J7() {
        return this.f14541o;
    }

    public void finish() {
        super.finish();
        Log.m105924i(this.f14541o, "finish isPendingPost false");
        f14540p = false;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C110826x0.m151017e(C15242u0.class, C15221m0.class, C15249x0.class, C15162a.class);
    }

    public void onCreate(Bundle bundle) {
        setTheme(C0966R.style.f8648pu);
        super.onCreate(bundle);
        C87773e.m109211d(getWindow());
        setBackBtn(new C2967a(this));
        Log.m105924i(this.f14541o, "onCreate isPendingPost true");
        f14540p = true;
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.FinderLivePostPendingUI).mo86179qs(this, C76986a.Finder);
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105924i(this.f14541o, "onDestroy isPendingPost false");
        f14540p = false;
    }
}
