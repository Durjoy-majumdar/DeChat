package com.tencent.p014mm.plugin.finder.live.view;

import android.os.Bundle;
import d60.C58124b;
import fy3.C32224a;
import gy3.C87413o;
import kotlin.Metadata;
import o40.C61926c;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "invoke", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout$activate$1 */
public final class FinderLiveVisitorPluginLayout$activate$1 extends C87413o implements C32224a<C13598b0> {
    public final /* synthetic */ FinderLiveVisitorPluginLayout this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveVisitorPluginLayout$activate$1(FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout) {
        super(0);
        this.this$0 = finderLiveVisitorPluginLayout;
    }

    public final void invoke() {
        final FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = this.this$0;
        C61926c.m72668M(new C32224a<C13598b0>() {
            public final void invoke() {
                C58124b.C7172a.m7372a(finderLiveVisitorPluginLayout, C58124b.C58125b.LIVE_HAS_FINISHED, (Bundle) null, 2, (Object) null);
            }
        });
    }
}
