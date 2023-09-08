package com.tencent.skyline;

import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/skyline/SkylineRuntime$navigateTo$1$onDone$1", "Lcom/tencent/skyline/IWindowReadyCallback;", "", "id", "Lrx3/b0;", "onWindowReady", "skyline_release"}, mo182095k = 1, mo182096mv = {1, 6, 0})
public final class SkylineRuntime$navigateTo$1$onDone$1 implements IWindowReadyCallback {
    public final /* synthetic */ IRouteDoneCallback $callback;
    public final /* synthetic */ PageConfig $pageConfig;
    public final /* synthetic */ int $pageId;
    public final /* synthetic */ SkylineRuntime this$0;

    public SkylineRuntime$navigateTo$1$onDone$1(SkylineRuntime skylineRuntime, int i, IRouteDoneCallback iRouteDoneCallback, PageConfig pageConfig) {
        this.this$0 = skylineRuntime;
        this.$pageId = i;
        this.$callback = iRouteDoneCallback;
        this.$pageConfig = pageConfig;
    }

    public void onWindowReady(int i) {
        SkylineLog skylineLog = SkylineLog.INSTANCE;
        String access$getTAG$p = this.this$0.TAG;
        skylineLog.mo120226i(access$getTAG$p, this + " navigateTo id:" + i + " pageId:" + this.$pageId);
        int andIncrement = this.this$0.taskId.getAndIncrement();
        this.this$0.routeDoneCallbacks.put(Integer.valueOf(andIncrement), this.$callback);
        SkylineRuntime skylineRuntime = this.this$0;
        skylineRuntime.nativeNavigateTo(skylineRuntime.runtimeDelegatePtr, i, this.$pageId, andIncrement, this.$pageConfig);
    }
}
