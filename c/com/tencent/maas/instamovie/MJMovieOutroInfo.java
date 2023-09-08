package com.tencent.maas.instamovie;

public class MJMovieOutroInfo {
    private MJMovieOutroType outroType;

    public MJMovieOutroInfo(MJMovieOutroType mJMovieOutroType) {
        this.outroType = mJMovieOutroType;
    }

    public int getOutroType() {
        return this.outroType.getValue();
    }
}
