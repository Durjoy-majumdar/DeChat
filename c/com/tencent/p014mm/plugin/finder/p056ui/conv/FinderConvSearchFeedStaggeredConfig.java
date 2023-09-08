package com.tencent.p014mm.plugin.finder.p056ui.conv;

import com.tencent.p014mm.plugin.finder.storage.FinderStaggeredConfig;
import dq1.C7461a;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import jq3.C60896i;
import jq3.C9500j;

/* renamed from: com.tencent.mm.plugin.finder.ui.conv.FinderConvSearchFeedStaggeredConfig */
public class FinderConvSearchFeedStaggeredConfig extends FinderStaggeredConfig {

    /* renamed from: d */
    public final C32224a<String> f17253d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderConvSearchFeedStaggeredConfig(C32224a<String> aVar) {
        super(-1, (C7461a) null, 2, (C8480h) null);
        C87412m.m108594g(aVar, "getCurrQuery");
        this.f17253d = aVar;
    }

    /* renamed from: b */
    public C9500j mo3010b(C32226l<? super Integer, ? extends C60896i<?>> lVar) {
        return new FinderConvSearchFeedStaggeredConfig$getItemConvertFactory$1(this, lVar);
    }
}
