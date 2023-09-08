package com.tencent.p014mm.plugin.finder.storage;

import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import fy3.C32226l;
import gy3.C87412m;
import jq3.C60896i;
import jq3.C9500j;
import ps1.C12003a;
import up1.C14353j0;

/* renamed from: com.tencent.mm.plugin.finder.storage.FinderAtFeedManagerLayoutConfig */
public final class FinderAtFeedManagerLayoutConfig extends C14353j0 {

    /* renamed from: e */
    public final boolean f16704e;

    /* renamed from: f */
    public final String f16705f;

    /* renamed from: g */
    public final C12003a f16706g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderAtFeedManagerLayoutConfig(int i, BaseFinderFeedLoader baseFinderFeedLoader, boolean z, String str, C12003a aVar) {
        super(i, baseFinderFeedLoader, z, str);
        C87412m.m108594g(str, "username");
        C87412m.m108594g(aVar, "atFeedState");
        this.f16704e = z;
        this.f16705f = str;
        this.f16706g = aVar;
    }

    /* renamed from: b */
    public C9500j mo3010b(C32226l<? super Integer, ? extends C60896i<?>> lVar) {
        return new FinderAtFeedManagerLayoutConfig$getItemConvertFactory$1(this, lVar);
    }
}
