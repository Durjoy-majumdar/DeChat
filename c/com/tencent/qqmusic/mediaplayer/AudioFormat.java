package com.tencent.qqmusic.mediaplayer;

public class AudioFormat {
    private static final String EXTENSION_AAC = "aac";
    private static final String EXTENSION_AMR = "amr";
    private static final String EXTENSION_APE = "ape";
    private static final String EXTENSION_FLAC = "flac";
    private static final String EXTENSION_M4A = "m4a";
    private static final String EXTENSION_MP3 = "mp3";
    private static final String EXTENSION_MP4 = "mp4";
    private static final String EXTENSION_OGG = "ogg";
    private static final String EXTENSION_WAV = "wav";
    private static final String EXTENSION_WMA = "wma";
    private static final int VALUE_AAC = 11;
    private static final int VALUE_AMR = 6;
    private static final int VALUE_APE = 5;
    private static final int VALUE_FLAC = 2;
    private static final int VALUE_M4A = 3;
    private static final int VALUE_MP3 = 9;
    private static final int VALUE_MP4 = 10;
    private static final int VALUE_OGG = 4;
    private static final int VALUE_UNSUPPORT = 1;
    private static final int VALUE_WAV = 8;
    private static final int VALUE_WMA = 7;

    public enum AudioType {
        UNSUPPORT(1, "Unknown"),
        MP3(9, "mp3"),
        OGG(4, AudioFormat.EXTENSION_OGG),
        M4A(3, "m4a"),
        FLAC(2, AudioFormat.EXTENSION_FLAC),
        APE(5, AudioFormat.EXTENSION_APE),
        WAV(8, "wav"),
        WMA(7, AudioFormat.EXTENSION_WMA),
        AMR(6, AudioFormat.EXTENSION_AMR),
        MP4(10, AudioFormat.EXTENSION_MP4),
        AAC(11, "aac");
        
        private String extension;
        /* access modifiers changed from: private */
        public int value;

        private AudioType(int i, String str) {
            this.value = i;
            this.extension = str;
        }

        public String getExtension() {
            return this.extension;
        }

        public int getValue() {
            return this.value;
        }
    }

    public static AudioType getAudioType(int i) {
        for (AudioType audioType : AudioType.values()) {
            if (audioType.value == i) {
                return audioType;
            }
        }
        return AudioType.UNSUPPORT;
    }

    public static boolean isAudioType(AudioType audioType) {
        return audioType != null && !AudioType.UNSUPPORT.equals(audioType);
    }
}
