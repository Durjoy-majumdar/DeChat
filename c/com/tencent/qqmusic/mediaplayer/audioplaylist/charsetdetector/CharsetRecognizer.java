package com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector;

abstract class CharsetRecognizer {
    public String getLanguage() {
        return null;
    }

    public abstract String getName();

    public abstract CharsetMatch match(CharsetDetector charsetDetector);
}
