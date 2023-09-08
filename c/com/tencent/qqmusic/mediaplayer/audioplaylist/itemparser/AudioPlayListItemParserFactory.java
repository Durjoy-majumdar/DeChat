package com.tencent.qqmusic.mediaplayer.audioplaylist.itemparser;

public class AudioPlayListItemParserFactory {
    public static AudioPlayListItemParser createParser(String str) {
        if (str.startsWith("http") || !str.endsWith(".cue")) {
            return null;
        }
        return new CueItemParser(str);
    }
}
