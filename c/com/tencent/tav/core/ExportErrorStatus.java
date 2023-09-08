package com.tencent.tav.core;

import com.tencent.tav.core.parallel.info.PipelineIndicatorInfo;
import com.tencent.tav.coremedia.CMSampleState;

public class ExportErrorStatus {
    public static final int APPEND_BUFFER = -110;
    public static final int APPEND_VIDEO_SAMPLE_MAKE_CURRENT = -111;
    public static final int APPEND_VIDEO_SAMPLE_SWAP_BUFFERS = -113;
    public static final int AUDIO_CONFIGURE = -104;
    public static final int AUDIO_DECODER = -202;
    public static final int AUDIO_DECODE_FRAME = -212;
    public static final int AUDIO_FRAME_HANDLE_TIMEOUT = -204;
    public static final int ENCODER_NOT_READY_TIME_OUT = -130;
    public static final int END_WRITE_AUDIO_SAMPLE = -124;
    public static final int END_WRITE_VIDEO_SAMPLE = -123;
    public static final int ERROR_CODE_AUDIO_EXPORTING = -15;
    public static final int ERROR_CODE_VIDEO_EXPORTING = -14;
    public static final int ERROR_FINISHING = -10;
    public static final int EXPORT_CANCEL = -11;
    public static final int EXPORT_SUCCESS = 0;
    public static final int RENDER_SAMPLE_BUFFER = -112;
    public static final int START_AUDIO_ENCODER = -102;
    public static final int START_VIDEO_ENCODER = -101;
    public static final int VIDEO_CONFIGURE = -103;
    public static final int VIDEO_DECODER = -201;
    public static final int VIDEO_DECODE_FRAME = -211;
    public static final int VIDEO_FRAME_HANDLE_TIMEOUT = -203;
    public static final int VIDEO_MUXER_ERROR = -205;
    public static final int WRITE_AUDIO_SAMPLE = -122;
    public static final int WRITE_VIDEO_SAMPLE = -121;
    public int code;
    public PipelineIndicatorInfo indicatorInfo;
    public String msg;
    public Throwable throwable;

    public ExportErrorStatus(int i) {
        this(i, (Throwable) null);
    }

    private static int getErrCode(CMSampleState cMSampleState) {
        int exportCode = cMSampleState.getExportCode();
        return exportCode == 0 ? (int) cMSampleState.getStateCode() : exportCode;
    }

    public static boolean hardwareError(int i) {
        return i == -101 || i == -102 || i == -103 || i == -104;
    }

    public String toString() {
        return "ExportErrorStatus{code=" + this.code + ", throwable=" + this.throwable + ", msg='" + this.msg + '\'' + ", indicatorInfo=" + this.indicatorInfo + '}';
    }

    public ExportErrorStatus(int i, Throwable th, String str, PipelineIndicatorInfo pipelineIndicatorInfo) {
        this(i, th, str);
        this.indicatorInfo = pipelineIndicatorInfo;
    }

    public ExportErrorStatus(int i, Throwable th) {
        this(i, th, (String) null);
    }

    public ExportErrorStatus(int i, Throwable th, String str) {
        this.code = i;
        this.throwable = th;
        this.msg = str;
    }

    public ExportErrorStatus(CMSampleState cMSampleState) {
        this(getErrCode(cMSampleState), cMSampleState.getThrowable(), cMSampleState.getMsg());
    }
}
