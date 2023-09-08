package com.tencent.p014mm.plugin.finder.p056ui;

import android.os.Bundle;
import com.tencent.p014mm.p136ui.component.UIComponent;
import di3.C86312j;
import gy3.C87412m;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import l31.C61212e;
import o31.C11345b;
import o31.C76986a;
import rs1.C13438s3;
import sx3.C22415w0;
import wc1.C15083h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderFollowListUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderFollowListUI */
public final class FinderFollowListUI extends MMFinderUI {
    /* renamed from: I7 */
    public int mo2194I7() {
        return 12;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C22415w0.m26092a(C13438s3.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.FinderFollowListUI).mo86179qs(this, C76986a.Finder);
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(C15083h.class);
    }
}
