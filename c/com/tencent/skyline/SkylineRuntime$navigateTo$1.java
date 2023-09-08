package com.tencent.skyline;

import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo182094d2 = {"com/tencent/skyline/SkylineRuntime$navigateTo$1", "Lcom/tencent/skyline/IBootstrapDoneCallback;", "Lrx3/b0;", "onDone", "skyline_release"}, mo182095k = 1, mo182096mv = {1, 6, 0})
public final class SkylineRuntime$navigateTo$1 implements IBootstrapDoneCallback {
    public final /* synthetic */ IRouteDoneCallback $callback;
    public final /* synthetic */ int $id;
    public final /* synthetic */ PageConfig $pageConfig;
    public final /* synthetic */ int $pageId;
    public final /* synthetic */ SkylineRuntime this$0;

    public SkylineRuntime$navigateTo$1(SkylineRuntime skylineRuntime, int i, int i2, IRouteDoneCallback iRouteDoneCallback, PageConfig pageConfig) {
        this.this$0 = skylineRuntime;
        this.$id = i;
        this.$pageId = i2;
        this.$callback = iRouteDoneCallback;
        this.$pageConfig = pageConfig;
    }

    public void onDone() {
        SkylineRuntime skylineRuntime = this.this$0;
        skylineRuntime.waitForWindowReady(this.$id, new SkylineRuntime$navigateTo$1$onDone$1(skylineRuntime, this.$pageId, this.$callback, this.$pageConfig));
    }
}
