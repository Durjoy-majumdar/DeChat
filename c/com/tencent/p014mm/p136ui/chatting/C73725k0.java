package com.tencent.p014mm.p136ui.chatting;

import ck3.C67398g;
import com.tencent.p014mm.hardcoder.C40318k;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.chatting.k0 */
public class C73725k0 extends C67398g {

    /* renamed from: d */
    public final /* synthetic */ BaseChattingUIFragment f216472d;

    public C73725k0(BaseChattingUIFragment baseChattingUIFragment) {
        this.f216472d = baseChattingUIFragment;
    }

    /* renamed from: a */
    public void mo91597a() {
        this.f216472d.f215221g.mo70046g5();
        BaseChattingUIFragment baseChattingUIFragment = this.f216472d;
        baseChattingUIFragment.getClass();
        C40318k.m43492a().stopPerformance(C40318k.m43492a().getHcEnterChattingEnable(), baseChattingUIFragment.f215229r);
        baseChattingUIFragment.f215229r = 0;
        BaseChattingUIFragment baseChattingUIFragment2 = this.f216472d;
        Log.m105925i("MicroMsg.BaseChattingUIFragment", "[onEnterEnd] activity:%s isPreLoaded:%b", baseChattingUIFragment2.f215219e, Boolean.valueOf(baseChattingUIFragment2.f215223i));
    }
}
