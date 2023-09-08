package com.tencent.maas.model;

public class MJMusicOptions {
    private MJMusicInfo musicInfo;
    private SourceType sourceType;

    public enum SourceType {
        None(0),
        TemplateBuiltin(1),
        Recommendation(2);
        
        private final int value;

        private SourceType(int i) {
            this.value = i;
        }

        public static SourceType fromInt(int i) {
            for (SourceType sourceType : values()) {
                if (sourceType.getValue() == i) {
                    return sourceType;
                }
            }
            return None;
        }

        public int getValue() {
            return this.value;
        }
    }

    private MJMusicOptions(MJMusicInfo mJMusicInfo, int i) {
        this.sourceType = SourceType.fromInt(i);
        this.musicInfo = mJMusicInfo;
    }

    public MJMusicInfo getMusicInfo() {
        return this.musicInfo;
    }

    public SourceType getSourceType() {
        return this.sourceType;
    }
}
