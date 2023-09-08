package com.tencent.maas.camerafun;

import com.tencent.maas.instamovie.mediafoundation.DimensionLevel;

public class MJCapturePhotoSettings {
    private final DimensionLevel dimensionLevel;
    private final ImageType imageType;
    private final String outputFilePath;

    public enum ImageType {
        Invalid(0),
        JPEG(1),
        PNG(2);
        
        private final int value;

        private ImageType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public MJCapturePhotoSettings(String str, ImageType imageType2, DimensionLevel dimensionLevel2) {
        this.outputFilePath = str;
        this.imageType = imageType2;
        this.dimensionLevel = dimensionLevel2;
    }

    public DimensionLevel getDimensionLevel() {
        return this.dimensionLevel;
    }

    public int getDimensionLevelValue() {
        return this.dimensionLevel.getId();
    }

    public ImageType getImageType() {
        return this.imageType;
    }

    public int getImageTypeValue() {
        return this.imageType.getValue();
    }

    public String getOutputFilePath() {
        return this.outputFilePath;
    }

    public MJCapturePhotoSettings(String str, ImageType imageType2) {
        this.outputFilePath = str;
        this.imageType = imageType2;
        this.dimensionLevel = DimensionLevel.DIMENSION_LEVEL_1080;
    }
}
