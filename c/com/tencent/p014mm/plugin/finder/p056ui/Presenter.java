package com.tencent.p014mm.plugin.finder.p056ui;

import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.FinderFeedDetailUIContract$Presenter;
import gy3.C8480h;
import gy3.C87412m;
import jq3.C9500j;

/* renamed from: com.tencent.mm.plugin.finder.ui.Presenter */
public final class Presenter extends FinderFeedDetailUIContract$Presenter {

    /* renamed from: v */
    public String f17202v = "Finder.FinderShareFeedDetailUI";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Presenter(int i, MMActivity mMActivity, boolean z) {
        super(i, mMActivity, z, false, false, 24, (C8480h) null);
        C87412m.m108594g(mMActivity, "context");
    }

    /* renamed from: N */
    public String mo2546N() {
        return this.f17202v;
    }

    /* renamed from: U */
    public C9500j mo2488U() {
        return new Presenter$buildItemCoverts$1(this);
    }
}
