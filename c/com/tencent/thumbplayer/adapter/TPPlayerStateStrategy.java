package com.tencent.thumbplayer.adapter;

import com.tencent.thumbplayer.api.TPPlayerState;

public class TPPlayerStateStrategy {
    public static final int API_GET_BUFFERED = 15;
    public static final int API_GET_DEMUXER_OFFSET = 19;
    public static final int API_GET_DURATION = 11;
    public static final int API_GET_POSITION = 12;
    public static final int API_GET_STATUS = 14;
    public static final int API_GET_VIDEO_SIZE = 13;
    public static final int API_PAUSE = 6;
    public static final int API_PREPARE = 1;
    public static final int API_RELEASE = 16;
    public static final int API_RESET = 8;
    public static final int API_SEEK = 9;
    public static final int API_SELECT_PROGRAM = 18;
    public static final int API_SET_DATASOURCE = 2;
    public static final int API_SET_PARAMS = 3;
    public static final int API_SET_SURFACE = 4;
    public static final int API_START = 5;
    public static final int API_STOP = 7;
    public static final int API_SWITCH_DEF = 17;
    public static final int CB_ON_COMPLETE = 2;
    public static final int CB_ON_DATA_OUTPUT = 7;
    public static final int CB_ON_ERROR = 4;
    public static final int CB_ON_INFO = 3;
    public static final int CB_ON_PREPARED = 1;
    public static final int CB_ON_SEEK_COMPLETE = 5;
    public static final int CB_ON_VIDEO_SIZE_CHANGE = 6;
    private TPPlayerState mState;

    public TPPlayerStateStrategy(TPPlayerState tPPlayerState) {
        this.mState = tPPlayerState;
    }

    private static boolean validCallGetBufferPercent(TPPlayerState tPPlayerState) {
        return tPPlayerState.mo28465is(4) || tPPlayerState.mo28465is(5) || tPPlayerState.mo28465is(6) || tPPlayerState.mo28465is(8) || tPPlayerState.mo28465is(9) || tPPlayerState.mo28465is(7);
    }

    private static boolean validCallGetDemuxerOffset(TPPlayerState tPPlayerState) {
        return tPPlayerState.mo28465is(1) || tPPlayerState.mo28465is(2) || tPPlayerState.mo28465is(3) || tPPlayerState.mo28465is(4) || tPPlayerState.mo28465is(5) || tPPlayerState.mo28465is(6) || tPPlayerState.mo28465is(8) || tPPlayerState.mo28465is(9) || tPPlayerState.mo28465is(7);
    }

    private static boolean validCallGetDuration(TPPlayerState tPPlayerState) {
        return tPPlayerState.mo28465is(4) || tPPlayerState.mo28465is(5) || tPPlayerState.mo28465is(6) || tPPlayerState.mo28465is(8) || tPPlayerState.mo28465is(9) || tPPlayerState.mo28465is(7);
    }

    private static boolean validCallGetPosition(TPPlayerState tPPlayerState) {
        return tPPlayerState.mo28465is(1) || tPPlayerState.mo28465is(2) || tPPlayerState.mo28465is(3) || tPPlayerState.mo28465is(4) || tPPlayerState.mo28465is(5) || tPPlayerState.mo28465is(6) || tPPlayerState.mo28465is(8) || tPPlayerState.mo28465is(9) || tPPlayerState.mo28465is(7);
    }

    private static boolean validCallGetStatus(TPPlayerState tPPlayerState) {
        return tPPlayerState.mo28465is(1) || tPPlayerState.mo28465is(2) || tPPlayerState.mo28465is(3) || tPPlayerState.mo28465is(4) || tPPlayerState.mo28465is(5) || tPPlayerState.mo28465is(6) || tPPlayerState.mo28465is(8) || tPPlayerState.mo28465is(9) || tPPlayerState.mo28465is(7);
    }

    private static boolean validCallGetVideoSize(TPPlayerState tPPlayerState) {
        return tPPlayerState.mo28465is(1) || tPPlayerState.mo28465is(2) || tPPlayerState.mo28465is(3) || tPPlayerState.mo28465is(4) || tPPlayerState.mo28465is(5) || tPPlayerState.mo28465is(6) || tPPlayerState.mo28465is(8) || tPPlayerState.mo28465is(9) || tPPlayerState.mo28465is(7);
    }

    private static boolean validCallPause(TPPlayerState tPPlayerState) {
        return tPPlayerState.mo28465is(5) || tPPlayerState.mo28465is(6);
    }

    private static boolean validCallPrepare(TPPlayerState tPPlayerState) {
        return tPPlayerState.mo28465is(2) || tPPlayerState.mo28465is(8) || tPPlayerState.mo28465is(9);
    }

    private static boolean validCallRelease(TPPlayerState tPPlayerState) {
        return tPPlayerState.mo28465is(1) || tPPlayerState.mo28465is(2) || tPPlayerState.mo28465is(3) || tPPlayerState.mo28465is(4) || tPPlayerState.mo28465is(5) || tPPlayerState.mo28465is(6) || tPPlayerState.mo28465is(8) || tPPlayerState.mo28465is(9) || tPPlayerState.mo28465is(7) || tPPlayerState.mo28465is(10);
    }

    private static boolean validCallReset(TPPlayerState tPPlayerState) {
        return tPPlayerState.mo28465is(1) || tPPlayerState.mo28465is(2) || tPPlayerState.mo28465is(3) || tPPlayerState.mo28465is(4) || tPPlayerState.mo28465is(5) || tPPlayerState.mo28465is(6) || tPPlayerState.mo28465is(8) || tPPlayerState.mo28465is(9) || tPPlayerState.mo28465is(7) || tPPlayerState.mo28465is(10);
    }

    private static boolean validCallSeek(TPPlayerState tPPlayerState) {
        return tPPlayerState.mo28465is(4) || tPPlayerState.mo28465is(5) || tPPlayerState.mo28465is(6) || tPPlayerState.mo28465is(7);
    }

    private static boolean validCallSelectProgram(TPPlayerState tPPlayerState) {
        return tPPlayerState.mo28465is(4) || tPPlayerState.mo28465is(5) || tPPlayerState.mo28465is(8) || tPPlayerState.mo28465is(9) || tPPlayerState.mo28465is(6) || tPPlayerState.mo28465is(7);
    }

    private static boolean validCallSetDataSource(TPPlayerState tPPlayerState) {
        return tPPlayerState.mo28465is(1);
    }

    private static boolean validCallSetParams(TPPlayerState tPPlayerState) {
        return tPPlayerState.mo28465is(1) || tPPlayerState.mo28465is(2) || tPPlayerState.mo28465is(3) || tPPlayerState.mo28465is(4) || tPPlayerState.mo28465is(5) || tPPlayerState.mo28465is(6) || tPPlayerState.mo28465is(7) || tPPlayerState.mo28465is(8) || tPPlayerState.mo28465is(9);
    }

    private static boolean validCallSetSurface(TPPlayerState tPPlayerState) {
        return true;
    }

    private static boolean validCallStart(TPPlayerState tPPlayerState) {
        return tPPlayerState.mo28465is(4) || tPPlayerState.mo28465is(5) || tPPlayerState.mo28465is(6) || tPPlayerState.mo28465is(7);
    }

    private static boolean validCallStop(TPPlayerState tPPlayerState) {
        return tPPlayerState.mo28465is(3) || tPPlayerState.mo28465is(4) || tPPlayerState.mo28465is(5) || tPPlayerState.mo28465is(8) || tPPlayerState.mo28465is(9) || tPPlayerState.mo28465is(6) || tPPlayerState.mo28465is(7);
    }

    private static boolean validCallSwitchDef(TPPlayerState tPPlayerState) {
        return tPPlayerState.mo28465is(4) || tPPlayerState.mo28465is(5) || tPPlayerState.mo28465is(6) || tPPlayerState.mo28465is(7);
    }

    private static boolean validCallbackOnComplete(TPPlayerState tPPlayerState) {
        return tPPlayerState.mo28465is(4) || tPPlayerState.mo28465is(5) || tPPlayerState.mo28465is(6);
    }

    private static boolean validCallbackOnDataOutput(TPPlayerState tPPlayerState) {
        return tPPlayerState.mo28465is(3) || tPPlayerState.mo28465is(4) || tPPlayerState.mo28465is(5) || tPPlayerState.mo28465is(6) || tPPlayerState.mo28465is(7) || tPPlayerState.mo28465is(8);
    }

    private static boolean validCallbackOnError(TPPlayerState tPPlayerState) {
        return tPPlayerState.mo28465is(2) || tPPlayerState.mo28465is(3) || tPPlayerState.mo28465is(4) || tPPlayerState.mo28465is(5) || tPPlayerState.mo28465is(6);
    }

    private static boolean validCallbackOnInfo(TPPlayerState tPPlayerState) {
        return tPPlayerState.mo28465is(3) || tPPlayerState.mo28465is(4) || tPPlayerState.mo28465is(5) || tPPlayerState.mo28465is(6);
    }

    private static boolean validCallbackOnPrepared(TPPlayerState tPPlayerState) {
        return tPPlayerState.mo28465is(3);
    }

    private static boolean validCallbackOnSeekComplete(TPPlayerState tPPlayerState) {
        return tPPlayerState.mo28465is(4) || tPPlayerState.mo28465is(5) || tPPlayerState.mo28465is(6);
    }

    private static boolean validCallbackOnSizeChange(TPPlayerState tPPlayerState) {
        return tPPlayerState.mo28465is(3) || tPPlayerState.mo28465is(4) || tPPlayerState.mo28465is(5) || tPPlayerState.mo28465is(6);
    }

    public final boolean validStateCall(int i) {
        if (i == 1) {
            return validCallPrepare(this.mState);
        }
        if (i == 2) {
            return validCallSetDataSource(this.mState);
        }
        if (i == 3) {
            return validCallSetParams(this.mState);
        }
        if (i == 4) {
            return validCallSetSurface(this.mState);
        }
        if (i == 5) {
            return validCallStart(this.mState);
        }
        if (i == 6) {
            return validCallPause(this.mState);
        }
        if (i == 7) {
            return validCallStop(this.mState);
        }
        if (i == 8) {
            return validCallReset(this.mState);
        }
        if (i == 9) {
            return validCallSeek(this.mState);
        }
        if (i == 11) {
            return validCallGetDuration(this.mState);
        }
        if (i == 12) {
            return validCallGetPosition(this.mState);
        }
        if (i == 13) {
            return validCallGetVideoSize(this.mState);
        }
        if (i == 14) {
            return validCallGetStatus(this.mState);
        }
        if (i == 15) {
            return validCallGetBufferPercent(this.mState);
        }
        if (i == 16) {
            return validCallRelease(this.mState);
        }
        if (i == 17) {
            return validCallSwitchDef(this.mState);
        }
        if (i == 18) {
            return validCallSelectProgram(this.mState);
        }
        if (i == 19) {
            return validCallGetDemuxerOffset(this.mState);
        }
        return false;
    }

    public final boolean validStateCallback(int i) {
        if (i == 1) {
            return validCallbackOnPrepared(this.mState);
        }
        if (i == 2) {
            return validCallbackOnComplete(this.mState);
        }
        if (i == 3) {
            return validCallbackOnInfo(this.mState);
        }
        if (i == 4) {
            return validCallbackOnError(this.mState);
        }
        if (i == 5) {
            return validCallbackOnSeekComplete(this.mState);
        }
        if (i == 6) {
            return validCallbackOnSizeChange(this.mState);
        }
        if (i == 7) {
            return validCallbackOnDataOutput(this.mState);
        }
        return false;
    }
}
