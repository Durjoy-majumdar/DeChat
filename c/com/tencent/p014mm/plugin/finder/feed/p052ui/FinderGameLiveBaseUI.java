package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.os.Bundle;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.plugin.finder.utils.FinderGameEventListener;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderGameLiveBaseUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderGameLiveBaseUI */
public abstract class FinderGameLiveBaseUI extends MMFinderUI {

    /* renamed from: o */
    public FinderGameEventListener f14407o;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FinderGameEventListener finderGameEventListener = new FinderGameEventListener(new WeakReference(this));
        this.f14407o = finderGameEventListener;
        finderGameEventListener.alive();
    }

    public void onDestroy() {
        super.onDestroy();
        FinderGameEventListener finderGameEventListener = this.f14407o;
        if (finderGameEventListener != null) {
            finderGameEventListener.dead();
        } else {
            C87412m.m108603p("gameEventListener");
            throw null;
        }
    }
}
