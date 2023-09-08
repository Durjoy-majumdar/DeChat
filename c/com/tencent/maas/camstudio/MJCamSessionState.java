package com.tencent.maas.camstudio;

public enum MJCamSessionState {
    Error(-1),
    Initial(0),
    Previewing(1),
    Paused(2),
    Recording(3),
    PhotoExporting(4);
    
    private final int value;

    private MJCamSessionState(int i) {
        this.value = i;
    }

    public static MJCamSessionState fromInt(int i) {
        for (MJCamSessionState mJCamSessionState : values()) {
            if (mJCamSessionState.getValue() == i) {
                return mJCamSessionState;
            }
        }
        return Error;
    }

    public int getValue() {
        return this.value;
    }
}
