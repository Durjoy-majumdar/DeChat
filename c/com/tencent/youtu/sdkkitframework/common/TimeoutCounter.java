package com.tencent.youtu.sdkkitframework.common;

import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.framework.YtFSM;
import java.util.HashMap;

public class TimeoutCounter {
    private static final String TAG = "TimeoutCounter";
    private long elaspeTimeMs = 0;
    private String name;
    private boolean needShowTimer = true;
    private boolean needTimer = false;
    /* access modifiers changed from: private */
    public long targetTimeoutMs = 0;

    public TimeoutCounter(String str) {
        this.name = str;
    }

    public void cancel() {
        String str = TAG;
        YtLogger.m106580i(str, this.name + " cancel");
        this.needTimer = false;
    }

    public boolean checkTimeout() {
        return this.needTimer && this.targetTimeoutMs > 0 && System.currentTimeMillis() - this.elaspeTimeMs > this.targetTimeoutMs;
    }

    public void init(long j, boolean z) {
        this.targetTimeoutMs = j;
        this.needShowTimer = z;
        String str = TAG;
        YtLogger.m106580i(str, this.name + " init with " + this.targetTimeoutMs);
    }

    public boolean isRunning() {
        return this.needTimer && this.targetTimeoutMs > 0;
    }

    public void reset() {
        String str = TAG;
        YtLogger.m106580i(str, this.name + " reset");
        this.needTimer = true;
        if (this.targetTimeoutMs > 0 && this.needShowTimer) {
            YtFSM.getInstance().sendFSMEvent(new HashMap<String, Object>() {
                {
                    put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.TIMEOUT_COUNTDOWN_BEGIN);
                    put(StateEvent.Name.COUNTDOWN_TIME, Long.valueOf(TimeoutCounter.this.targetTimeoutMs));
                }
            });
        }
        this.elaspeTimeMs = System.currentTimeMillis();
    }

    public void start() {
        reset();
    }
}
