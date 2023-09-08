package com.tencent.p014mm.p136ui.chatting;

import ck3.C67398g;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.chatting.j0 */
public class C73723j0 extends C67398g {

    /* renamed from: d */
    public final /* synthetic */ BaseChattingUIFragment f216471d;

    public C73723j0(BaseChattingUIFragment baseChattingUIFragment) {
        this.f216471d = baseChattingUIFragment;
    }

    /* renamed from: a */
    public void mo91597a() {
        BaseChattingUIFragment baseChattingUIFragment = this.f216471d;
        Log.m105925i("MicroMsg.BaseChattingUIFragment", "[doStop] activity:%s isPreLoaded:%b", baseChattingUIFragment.f215219e, Boolean.valueOf(baseChattingUIFragment.f215223i));
        this.f216471d.f215220f.f193298v = true;
    }
}
