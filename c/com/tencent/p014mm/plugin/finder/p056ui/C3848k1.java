package com.tencent.p014mm.plugin.finder.p056ui;

import android.content.Intent;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.ui.k1 */
public final class C3848k1 extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLivePostHelperUI f17385d;

    /* renamed from: e */
    public final /* synthetic */ String f17386e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3848k1(FinderLivePostHelperUI finderLivePostHelperUI, String str) {
        super(1);
        this.f17385d = finderLivePostHelperUI;
        this.f17386e = str;
    }

    public Object invoke(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            FinderLivePostHelperUI.m3882O7(this.f17385d, this.f17386e, 10000);
        } else {
            this.f17385d.setResult(-1, new Intent());
            FinderLivePostHelperUI finderLivePostHelperUI = this.f17385d;
            finderLivePostHelperUI.finish();
            finderLivePostHelperUI.overridePendingTransition(0, 0);
        }
        return C13598b0.f38549a;
    }
}
