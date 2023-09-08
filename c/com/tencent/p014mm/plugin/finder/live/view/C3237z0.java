package com.tencent.p014mm.plugin.finder.live.view;

import fy3.C32226l;
import gy3.C87413o;
import java.util.List;
import sx3.C110818d0;

/* renamed from: com.tencent.mm.plugin.finder.live.view.z0 */
public final class C3237z0 extends C87413o implements C32226l<String, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveMultiNoticeView f15365d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3237z0(FinderLiveMultiNoticeView finderLiveMultiNoticeView) {
        super(1);
        this.f15365d = finderLiveMultiNoticeView;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        List<String> list = this.f15365d.f15288h;
        return Boolean.valueOf(list != null ? C110818d0.m150903D(list, str) : false);
    }
}
