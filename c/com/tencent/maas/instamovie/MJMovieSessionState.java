package com.tencent.maas.instamovie;

public enum MJMovieSessionState {
    Error(-1),
    Initial(0),
    InitialCreating(1),
    Ready(2),
    Recreating(3),
    Exporting(4),
    Playing(5),
    Teardowning(6);
    
    private final int value;

    private MJMovieSessionState(int i) {
        this.value = i;
    }

    public static MJMovieSessionState fromInt(int i) {
        for (MJMovieSessionState mJMovieSessionState : values()) {
            if (mJMovieSessionState.getValue() == i) {
                return mJMovieSessionState;
            }
        }
        return Error;
    }

    public int getValue() {
        return this.value;
    }
}
