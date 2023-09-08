package com.tencent.p014mm.plugin.finder.feed.p052ui;

import com.tencent.p014mm.plugin.finder.storage.FinderStaggeredConfig;
import com.tencent.p014mm.plugin.finder.storage.FinderStaggeredConfig$getItemConvertFactory$1;
import dq1.C7461a;
import fy3.C32226l;
import gy3.C8480h;
import jq3.C60896i;
import jq3.C9500j;

/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderInteractionSearchUIContract$ViewCallback$config$1 */
public final class FinderInteractionSearchUIContract$ViewCallback$config$1 extends FinderStaggeredConfig {

    /* renamed from: d */
    public final /* synthetic */ FinderInteractionSearchUIContract$ViewCallback f14465d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderInteractionSearchUIContract$ViewCallback$config$1(FinderInteractionSearchUIContract$ViewCallback finderInteractionSearchUIContract$ViewCallback) {
        super(0, (C7461a) null, 3, (C8480h) null);
        this.f14465d = finderInteractionSearchUIContract$ViewCallback;
    }

    /* renamed from: b */
    public C9500j mo3010b(C32226l<? super Integer, ? extends C60896i<?>> lVar) {
        return new C2948xebad5f88(this.f14465d, this, new FinderStaggeredConfig$getItemConvertFactory$1(this, lVar));
    }
}
