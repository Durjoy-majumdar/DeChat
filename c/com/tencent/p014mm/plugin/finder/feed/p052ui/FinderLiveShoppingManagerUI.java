package com.tencent.p014mm.plugin.finder.feed.p052ui;

import a14.C0000n0;
import a14.C53930o0;
import android.os.Bundle;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.plugin.finder.shopping.presenter.FinderLiveShoppingManagerPresenter;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashSet;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import nj3.C88989a;
import tp1.C64994a;
import vo3.C90852c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveShoppingManagerUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(32)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveShoppingManagerUI */
public final class FinderLiveShoppingManagerUI extends MMFinderUI {

    /* renamed from: o */
    public C0000n0 f159014o = C53930o0.m60555b();

    public void onBackPressed() {
        Log.m105924i("FinderLiveShoppingManagerUI", "onBackPressed");
        FinderLiveShoppingManagerPresenter finderLiveShoppingManagerPresenter = ((C64994a) C39818r.f106831a.mo62444c(this).mo75002a(C64994a.class)).f187118d;
        if (finderLiveShoppingManagerPresenter != null) {
            finderLiveShoppingManagerPresenter.mo78779b(2);
        }
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        this.mController.mo177105z0(getResources().getColor(C0966R.color.f2975b6));
    }

    public void onDestroy() {
        super.onDestroy();
        C53930o0.m60558e(this.f159014o, (CancellationException) null, 1, (Object) null);
    }

    public void onSwipeBack() {
        Log.m105924i("FinderLiveShoppingManagerUI", "onSwipeBack");
        FinderLiveShoppingManagerPresenter finderLiveShoppingManagerPresenter = ((C64994a) C39818r.f106831a.mo62444c(this).mo75002a(C64994a.class)).f187118d;
        if (finderLiveShoppingManagerPresenter != null) {
            finderLiveShoppingManagerPresenter.mo78779b(1);
        }
        super.onSwipeBack();
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(C64994a.class);
    }
}
