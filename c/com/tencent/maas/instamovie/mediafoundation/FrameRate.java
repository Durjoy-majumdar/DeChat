package com.tencent.maas.instamovie.mediafoundation;

import com.tencent.maas.model.time.MJTime;

public class FrameRate {
    public static final FrameRate FrameRate120 = fromType(FrameRateType.FRMAERATE_120);
    public static final FrameRate FrameRate15 = fromType(FrameRateType.FRAMERATE_15);
    public static final FrameRate FrameRate23_976 = fromType(FrameRateType.FRAMERATE_23_976);
    public static final FrameRate FrameRate24 = fromType(FrameRateType.FRMAERATE_24);
    public static final FrameRate FrameRate240 = fromType(FrameRateType.FRAMERATE_240);
    public static final FrameRate FrameRate25 = fromType(FrameRateType.FRMAERATE_25);
    public static final FrameRate FrameRate29_97 = fromType(FrameRateType.FRAMERATE_29_97);
    public static final FrameRate FrameRate30 = fromType(FrameRateType.FRAMERATE_30);
    public static final FrameRate FrameRate48 = fromType(FrameRateType.FRAMERATE_48);
    public static final FrameRate FrameRate50 = fromType(FrameRateType.FRAMERATE_50);
    public static final FrameRate FrameRate60 = fromType(FrameRateType.FRAMERATE_60);
    private MJTime frameDuration;
    private float numericValue = Float.NaN;
    private FrameRateType type;

    public enum FrameRateType {
        FRAMERATE_15(0),
        FRAMERATE_23_976(1),
        FRMAERATE_24(2),
        FRMAERATE_25(3),
        FRAMERATE_29_97(4),
        FRAMERATE_30(5),
        FRAMERATE_48(6),
        FRAMERATE_50(7),
        FRAMERATE_60(8),
        FRMAERATE_120(9),
        FRAMERATE_240(10);
        
        private int typeId;

        private FrameRateType(int i) {
            this.typeId = i;
        }

        public int getTypeId() {
            return this.typeId;
        }
    }

    private FrameRate(FrameRateType frameRateType) {
        this.type = frameRateType;
    }

    public static FrameRate fromType(FrameRateType frameRateType) {
        return new FrameRate(frameRateType);
    }

    private float getNumericValue() {
        return this.numericValue;
    }

    private int getTypeId() {
        return this.type.getTypeId();
    }

    public FrameRateType getType() {
        return this.type;
    }
}
