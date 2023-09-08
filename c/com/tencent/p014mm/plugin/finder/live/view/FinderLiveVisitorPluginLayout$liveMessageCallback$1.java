package com.tencent.p014mm.plugin.finder.live.view;

import fy3.C32224a;
import gy3.C87413o;
import hl1.C59954b3;
import hl1.C59988k;
import kotlin.Metadata;
import o40.C61926c;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "invoke", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout$liveMessageCallback$1 */
public final class FinderLiveVisitorPluginLayout$liveMessageCallback$1 extends C87413o implements C32224a<C13598b0> {
    public final /* synthetic */ FinderLiveVisitorPluginLayout this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveVisitorPluginLayout$liveMessageCallback$1(FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout) {
        super(0);
        this.this$0 = finderLiveVisitorPluginLayout;
    }

    public final void invoke() {
        C59988k access$getLivingUIC = this.this$0.getLivingUIC();
        if (access$getLivingUIC != null) {
            C61926c.m72668M(new C59954b3(access$getLivingUIC));
        }
    }
}
