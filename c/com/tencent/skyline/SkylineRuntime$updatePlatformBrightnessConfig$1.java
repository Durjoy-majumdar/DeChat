package com.tencent.skyline;

import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo182094d2 = {"com/tencent/skyline/SkylineRuntime$updatePlatformBrightnessConfig$1", "Lcom/tencent/skyline/IBootstrapDoneCallback;", "Lrx3/b0;", "onDone", "skyline_release"}, mo182095k = 1, mo182096mv = {1, 6, 0})
public final class SkylineRuntime$updatePlatformBrightnessConfig$1 implements IBootstrapDoneCallback {
    public final /* synthetic */ int $brightness;
    public final /* synthetic */ boolean $enable;
    public final /* synthetic */ SkylineRuntime this$0;

    public SkylineRuntime$updatePlatformBrightnessConfig$1(SkylineRuntime skylineRuntime, int i, boolean z) {
        this.this$0 = skylineRuntime;
        this.$brightness = i;
        this.$enable = z;
    }

    public void onDone() {
        SkylineLog skylineLog = SkylineLog.INSTANCE;
        String access$getTAG$p = this.this$0.TAG;
        skylineLog.mo120226i(access$getTAG$p, this + " navigateBack brightness:" + this.$brightness);
        SkylineRuntime skylineRuntime = this.this$0;
        skylineRuntime.nativeUpdatePlatformBrightnessConfig(skylineRuntime.runtimeDelegatePtr, this.$brightness, this.$enable);
    }
}
