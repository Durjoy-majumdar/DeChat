package com.tencent.p014mm.plugin.finder.service;

import com.tencent.p014mm.plugin.finder.p056ui.conv.FinderConvSearchFeedFragment;
import com.tencent.p014mm.plugin.finder.p056ui.fav.FinderGlobalFavFeedFragment;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import p525fr.C59311b;
import p525fr.C59312c;
import p525fr.C97951d;

@C86522b
/* renamed from: com.tencent.mm.plugin.finder.service.p0 */
public final class C56293p0 extends C86301e implements C59312c {
    public C97951d Ou0() {
        return new FinderGlobalFavFeedFragment();
    }

    /* renamed from: dq */
    public C59311b mo78739dq(String str) {
        C87412m.m108594g(str, "conversation");
        return new FinderConvSearchFeedFragment(str);
    }
}
