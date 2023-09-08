package com.tencent.p014mm.plugin.finder.nearby.newlivesquare.livescroll;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import fh1.C59062p2;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.finder.nearby.newlivesquare.livescroll.LiveScrollSquareUIC */
public final class LiveScrollSquareUIC extends UIComponent {

    /* renamed from: d */
    public final LiveScrollSquareUIC$liveScrollSquareEventListener$1 f15755d = new LiveScrollSquareUIC$liveScrollSquareEventListener$1(this, C40008f.f107254d);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveScrollSquareUIC(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f15755d.alive();
    }

    public void onDestroy() {
        C59062p2 p2Var;
        super.onDestroy();
        FinderLiveService.f159376d.getClass();
        LiveRoomControllerStore liveRoomControllerStore = FinderLiveService.f159349B;
        if (!(liveRoomControllerStore == null || (p2Var = (C59062p2) liveRoomControllerStore.controller(C59062p2.class)) == null)) {
            p2Var.mo84279n3("onExitSquare");
        }
        this.f15755d.dead();
    }
}
