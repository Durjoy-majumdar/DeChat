package com.tencent.skyline;

import com.tencent.skyline.SkylineLogic;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo182094d2 = {"com/tencent/skyline/SkylineLogic$initAsync$1", "Ljava/lang/Runnable;", "Lrx3/b0;", "run", "skyline_release"}, mo182095k = 1, mo182096mv = {1, 6, 0})
public final class SkylineLogic$initAsync$1 implements Runnable {
    public final /* synthetic */ SkylineLogic.InitDoneCallback $callback;

    public SkylineLogic$initAsync$1(SkylineLogic.InitDoneCallback initDoneCallback) {
        this.$callback = initDoneCallback;
    }

    public void run() {
        this.$callback.onDone();
    }
}
