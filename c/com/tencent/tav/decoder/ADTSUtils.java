package com.tencent.tav.decoder;

import java.nio.ByteBuffer;

public class ADTSUtils {
    public static ByteBuffer getADTSCodecSpecificData(int i, int i2, int i3) {
        int freqIndex = getFreqIndex(i2);
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.put(0, (byte) ((i << 3) | (freqIndex >> 1)));
        allocate.put(1, (byte) (((freqIndex << 7) & 128) | (i3 << 3)));
        allocate.flip();
        return allocate;
    }

    public static int getFreqIndex(int i) {
        switch (i) {
            case 7350:
                return 12;
            case 8000:
                return 11;
            case 11025:
                return 10;
            case 12000:
                return 9;
            case 22050:
                return 7;
            case 24000:
                return 6;
            case 32000:
                return 5;
            case 44100:
                return 4;
            case 48000:
                return 3;
            case 64000:
                return 2;
            case 88200:
                return 1;
            case 96000:
                return 0;
            default:
                return 8;
        }
    }
}
