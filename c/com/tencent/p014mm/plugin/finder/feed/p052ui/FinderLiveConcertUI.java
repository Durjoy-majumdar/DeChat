package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import gy3.C87412m;
import java.util.HashSet;
import kf1.C9765h4;
import kotlin.Metadata;
import nj3.C88989a;
import vo3.C90852c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveConcertUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Landroid/view/View;", "root", "Lrx3/b0;", "adjustStatusbarPadding", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(50)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveConcertUI */
public final class FinderLiveConcertUI extends MMFinderUI {
    public final void adjustStatusbarPadding(View view) {
        if (view != null) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop() + C75044y4.m89994f(view.getContext()), view.getPaddingRight(), view.getPaddingBottom() + C75044y4.m89991c(view.getContext()));
        }
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
        adjustStatusbarPadding(findViewById(C0966R.C0970id.f358129od3));
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(C9765h4.class);
    }
}
