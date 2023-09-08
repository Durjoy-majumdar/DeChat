package com.tencent.liteav.videoproducer.capture;

import com.tencent.liteav.videoproducer.capture.CaptureSourceInterface;
import java.util.Locale;
import java.util.Objects;

public class CameraCaptureParams extends CaptureSourceInterface.CaptureParams {

    /* renamed from: a */
    public Boolean f47179a = null;

    public CameraCaptureParams() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CameraCaptureParams)) {
            return false;
        }
        CameraCaptureParams cameraCaptureParams = (CameraCaptureParams) obj;
        return super.equals(cameraCaptureParams) && Objects.equals(this.f47179a, cameraCaptureParams.f47179a);
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "%s, frontCamera: %b", new Object[]{super.toString(), this.f47179a});
    }

    public CameraCaptureParams(CameraCaptureParams cameraCaptureParams) {
        super(cameraCaptureParams);
        this.f47179a = cameraCaptureParams.f47179a;
    }
}
