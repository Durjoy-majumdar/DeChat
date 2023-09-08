package com.tencent.maas.instamovie;

public enum MJMovieOutroType {
    Null(0),
    Asset(1),
    TemplateDefault(2);
    
    private final int value;

    private MJMovieOutroType(int i) {
        this.value = i;
    }

    public static MJMovieOutroType fromInt(int i) {
        for (MJMovieOutroType mJMovieOutroType : values()) {
            if (mJMovieOutroType.getValue() == i) {
                return mJMovieOutroType;
            }
        }
        return Null;
    }

    public int getValue() {
        return this.value;
    }
}
