package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.os.Bundle;
import com.tencent.p014mm.autogen.events.FinderGamePostEvent;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import fj1.C45795b;
import fy3.C32230s;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.feed.ui.m */
public final class C55843m extends C87413o implements C32230s<Boolean, Integer, Integer, String, Bundle, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveCountDownUI f159053d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55843m(FinderLiveCountDownUI finderLiveCountDownUI) {
        super(5);
        this.f159053d = finderLiveCountDownUI;
    }

    /* renamed from: D */
    public Object mo237D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        ((Number) obj2).intValue();
        ((Number) obj3).intValue();
        String str = (String) obj4;
        Bundle bundle = (Bundle) obj5;
        if (booleanValue) {
            FinderLiveService.f159376d.mo77634h(true, 0);
        } else {
            FinderLiveCountDownUI finderLiveCountDownUI = this.f159053d;
            int i = FinderLiveCountDownUI.f158983o;
            finderLiveCountDownUI.getClass();
            FinderLiveService finderLiveService = FinderLiveService.f159376d;
            finderLiveService.mo77613P((C45795b) null);
            C45795b.f123697j.mo58474a((C45795b) null);
            finderLiveService.mo77612O((LiveRoomControllerStore) null);
            finderLiveService.mo77634h(false, 2);
        }
        FinderLiveCountDownUI finderLiveCountDownUI2 = this.f159053d;
        int i2 = FinderLiveCountDownUI.f158983o;
        finderLiveCountDownUI2.getClass();
        FinderGamePostEvent finderGamePostEvent = new FinderGamePostEvent();
        FinderGamePostEvent.C55125a aVar = finderGamePostEvent.f154773d;
        aVar.f154774a = true;
        aVar.f154775b = true;
        finderGamePostEvent.publish();
        this.f159053d.finish();
        return C13598b0.f38549a;
    }
}
