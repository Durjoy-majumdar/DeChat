package com.tencent.maas.instamovie;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;

public class MJSegment {
    public static final int TYPE_CLIP = 3;
    public static final int TYPE_STICKER = 2;
    public static final int TYPE_TEXT = 1;
    public WeakReference<MJMovieSession> movieSession;
    public String segmentID;
    public int segmentType;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    public MJSegment(String str, int i, MJMovieSession mJMovieSession) {
        this.segmentID = str;
        this.segmentType = i;
        this.movieSession = new WeakReference<>(mJMovieSession);
    }

    public String getId() {
        return this.segmentID;
    }

    public int getType() {
        return this.segmentType;
    }

    public MJSegment(String str, int i) {
        this.segmentID = str;
        this.segmentType = i;
    }
}
