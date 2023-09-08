package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import in3.C87773e;
import java.util.Set;
import kf1.C9633b4;
import kotlin.Metadata;
import nj3.C88989a;
import sx3.C22415w0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderH5JumpEmptyUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(7)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderH5JumpEmptyUI */
public final class FinderH5JumpEmptyUI extends MMFinderUI {
    public int getLayoutId() {
        return -1;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C22415w0.m26092a(C9633b4.class);
    }

    public void onCreate(Bundle bundle) {
        setTheme(C0966R.style.f8648pu);
        super.onCreate(bundle);
        C87773e.m109211d(getWindow());
    }
}
