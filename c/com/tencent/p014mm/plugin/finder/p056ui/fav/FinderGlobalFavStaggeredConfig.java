package com.tencent.p014mm.plugin.finder.p056ui.fav;

import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderStaggeredConfig;
import dq1.C7461a;
import fy3.C32226l;
import fy3.C32229r;
import gy3.C8480h;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9500j;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavStaggeredConfig */
public class FinderGlobalFavStaggeredConfig extends FinderStaggeredConfig {

    /* renamed from: d */
    public final C32229r<C60905o, BaseFinderFeed, Integer, Boolean, C13598b0> f17283d;

    public FinderGlobalFavStaggeredConfig(C32229r<? super C60905o, ? super BaseFinderFeed, ? super Integer, ? super Boolean, C13598b0> rVar) {
        super(-1, (C7461a) null, 2, (C8480h) null);
        this.f17283d = rVar;
    }

    /* renamed from: b */
    public C9500j mo3010b(C32226l<? super Integer, ? extends C60896i<?>> lVar) {
        return new FinderGlobalFavStaggeredConfig$getItemConvertFactory$1(this, lVar);
    }
}
