package com.tencent.maas.camerafun;

import com.tencent.maas.instamovie.mediafoundation.DimensionLevel;
import java.util.HashMap;
import java.util.Map;

public class MJAuditCaptureSettings {
    private final DimensionLevel captureDimensionLevel;
    private final double captureFrameInterval;
    private final String outputDirPath;
    private final String outputFilenameBase;
    private final MJAuditCaptureOutputType outputType;

    public enum MJAuditCaptureOutputType {
        None(0),
        JPEGs(1);
        
        private static final Map<Integer, MJAuditCaptureOutputType> intToTypeMap = null;
        private final int value;

        /* access modifiers changed from: public */
        static {
            int i;
            intToTypeMap = new HashMap();
            for (MJAuditCaptureOutputType mJAuditCaptureOutputType : values()) {
                intToTypeMap.put(Integer.valueOf(mJAuditCaptureOutputType.value), mJAuditCaptureOutputType);
            }
        }

        private MJAuditCaptureOutputType(int i) {
            this.value = i;
        }

        public static MJAuditCaptureOutputType fromValue(int i) {
            return i != 0 ? i != 1 ? None : JPEGs : None;
        }

        public int getValue() {
            return this.value;
        }
    }

    public MJAuditCaptureSettings(DimensionLevel dimensionLevel, double d, MJAuditCaptureOutputType mJAuditCaptureOutputType, String str, String str2) {
        this.captureDimensionLevel = dimensionLevel;
        this.captureFrameInterval = d;
        this.outputType = mJAuditCaptureOutputType;
        this.outputDirPath = str;
        this.outputFilenameBase = str2;
    }

    public int getCaptureDimensionLevel() {
        return this.captureDimensionLevel.getId();
    }

    public double getCaptureFrameInterval() {
        return this.captureFrameInterval;
    }

    public String getOutputDirPath() {
        return this.outputDirPath;
    }

    public String getOutputFilenameBase() {
        return this.outputFilenameBase;
    }

    public int getOutputType() {
        return this.outputType.getValue();
    }
}
