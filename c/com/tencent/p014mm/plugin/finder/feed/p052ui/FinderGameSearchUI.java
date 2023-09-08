package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import er1.C58782w0;
import java.util.Set;
import kotlin.Metadata;
import nj3.C88989a;
import sx3.C110826x0;
import xk1.C66350u0;
import xk1.C66352v0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderGameSearchUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderGameLiveBaseUI;", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(32)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderGameSearchUI */
public final class FinderGameSearchUI extends FinderGameLiveBaseUI {
    public int getCustomBounceId() {
        return C0966R.C0970id.ivb;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C110826x0.m151017e(C66352v0.class, C66350u0.class);
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
        C58782w0.f168290a.mo83842a(findViewById(C0966R.C0970id.dl8));
    }
}
