package com.tencent.p014mm.plugin.finder.live.view;

import android.os.Bundle;
import d60.C58124b;
import fy3.C32226l;
import gy3.C87413o;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo182094d2 = {"", "interrupted", "Lrx3/b0;", "invoke", "(Z)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout$activate$4 */
public final class FinderLiveVisitorPluginLayout$activate$4 extends C87413o implements C32226l<Boolean, C13598b0> {
    public final /* synthetic */ FinderLiveVisitorPluginLayout this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveVisitorPluginLayout$activate$4(FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout) {
        super(1);
        this.this$0 = finderLiveVisitorPluginLayout;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return C13598b0.f38549a;
    }

    public final void invoke(boolean z) {
        Bundle bundle = new Bundle();
        FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = this.this$0;
        bundle.putInt("PARAM_LIVE_ANCHOR_STATUS_EXCEPTION_SECNE", 2);
        if (z) {
            finderLiveVisitorPluginLayout.statusChange(C58124b.C58125b.LIVE_EVENT_ANCHOR_STATUS_EXCEPTION, bundle);
        } else {
            finderLiveVisitorPluginLayout.statusChange(C58124b.C58125b.LIVE_EVENT_ANCHOR_STATUS_RECOVERY, bundle);
        }
    }
}
