package com.tencent.liteav.videoconsumer.decoder;

import com.tencent.liteav.base.annotations.JNINamespace;
import java.nio.ByteBuffer;
import java.util.Objects;

@JNINamespace("liteav::video")
public class SpsInfo {
    public Integer colourPrimaries = null;
    public int height = 0;
    public Integer matrixCoefficients = null;
    public Integer transferCharacteristics = null;
    public Integer videoFormat = null;
    public Integer videoFullRangeFlag = null;
    public int width = 0;

    public static native SpsInfo nativeDecodeSps(boolean z, ByteBuffer byteBuffer);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpsInfo)) {
            return false;
        }
        SpsInfo spsInfo = (SpsInfo) obj;
        return spsInfo.width == this.width && spsInfo.height == this.height && Objects.equals(this.videoFormat, spsInfo.videoFormat) && Objects.equals(this.videoFullRangeFlag, spsInfo.videoFullRangeFlag) && Objects.equals(this.colourPrimaries, spsInfo.colourPrimaries) && Objects.equals(this.transferCharacteristics, spsInfo.transferCharacteristics) && Objects.equals(this.matrixCoefficients, spsInfo.matrixCoefficients);
    }

    public void set(SpsInfo spsInfo) {
        if (spsInfo == null) {
            spsInfo = new SpsInfo();
        }
        this.width = spsInfo.width;
        this.height = spsInfo.height;
        this.videoFormat = spsInfo.videoFormat;
        this.videoFullRangeFlag = spsInfo.videoFullRangeFlag;
        this.colourPrimaries = spsInfo.colourPrimaries;
        this.transferCharacteristics = spsInfo.transferCharacteristics;
        this.matrixCoefficients = spsInfo.matrixCoefficients;
    }

    public void setColourPrimaries(int i) {
        this.colourPrimaries = Integer.valueOf(i);
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setMatrixCoefficients(int i) {
        this.matrixCoefficients = Integer.valueOf(i);
    }

    public void setTransferCharacteristics(int i) {
        this.transferCharacteristics = Integer.valueOf(i);
    }

    public void setVideoFormat(int i) {
        this.videoFormat = Integer.valueOf(i);
    }

    public void setVideoFullRangeFlag(int i) {
        this.videoFullRangeFlag = Integer.valueOf(i);
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public String toString() {
        return "SpsInfo(" + ("width=" + this.width + ",height=" + this.height + ",videoFormat=" + this.videoFormat + ",videoFullRangeFlag=" + this.videoFullRangeFlag + ",colourPrimaries=" + this.colourPrimaries + ",transferCharacteristics=" + this.transferCharacteristics + ",matrixCoefficients=" + this.matrixCoefficients) + ")";
    }
}
