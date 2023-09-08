package com.tencent.p014mm.p136ui.chatting;

import ck3.C67398g;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.chatting.h0 */
public class C73716h0 extends C67398g {

    /* renamed from: d */
    public final /* synthetic */ BaseChattingUIFragment f216459d;

    public C73716h0(BaseChattingUIFragment baseChattingUIFragment) {
        this.f216459d = baseChattingUIFragment;
    }

    /* renamed from: a */
    public void mo91597a() {
        Log.m105918d("MicroMsg.BaseChattingUIFragment", "fallback for SwipeBack");
        BaseChattingUIFragment baseChattingUIFragment = this.f216459d;
        int i = BaseChattingUIFragment.f215217t;
        baseChattingUIFragment.mo102023N(512);
        this.f216459d.mo102034f0();
    }
}
