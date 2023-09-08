package com.tencent.thumbplayer.datatransport;

public class TPProxyEnumUtils {
    private static final String TAG = "TPThumbPlayer[TPProxyEnumUtils.java]";

    public static int dlType2Inner(int i) {
        if (i == 202) {
            return 202;
        }
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            case 12:
                return 16;
            default:
                throw new IllegalArgumentException("event is invalid: " + i);
        }
    }

    public static int eventID2Inner(int i) {
        int i2 = 3;
        if (i != 3) {
            i2 = 4;
            if (i != 4) {
                i2 = 5;
                if (i != 5) {
                    i2 = 6;
                    if (i != 6) {
                        switch (i) {
                            case 13:
                                return 13;
                            case 14:
                                return 14;
                            case 15:
                                return 15;
                            case 16:
                                return 16;
                            case 17:
                                return 17;
                            case 18:
                                return 18;
                            case 19:
                                return 19;
                            case 20:
                                return 20;
                            case 21:
                                return 21;
                            default:
                                throw new IllegalArgumentException("event is invalid : " + i);
                        }
                    }
                }
            }
        }
        return i2;
    }
}
