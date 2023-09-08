package com.tencent.maas.camerafun;

public enum MJCamFunSessionState {
    Error(-1),
    Initial(0),
    Starting(1),
    Previewing(2),
    Switching(3),
    Recording(4),
    Teardowning(5);
    
    private final int value;

    private MJCamFunSessionState(int i) {
        this.value = i;
    }

    public static MJCamFunSessionState fromInt(int i) {
        for (MJCamFunSessionState mJCamFunSessionState : values()) {
            if (mJCamFunSessionState.getValue() == i) {
                return mJCamFunSessionState;
            }
        }
        return Error;
    }

    public int getValue() {
        return this.value;
    }
}
