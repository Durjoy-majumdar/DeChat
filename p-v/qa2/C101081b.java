package qa2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import com.tencent.xweb.util.WXWebReporter;

/* renamed from: qa2.b */
public class C101081b {
    /* renamed from: a */
    public static int m132448a(String str) {
        if (MimeTypes.AUDIO_AMR_NB.equalsIgnoreCase(str)) {
            return 1;
        }
        if (MimeTypes.AUDIO_AMR_WB.equalsIgnoreCase(str)) {
            return 2;
        }
        if (MimeTypes.AUDIO_MPEG.equalsIgnoreCase(str) || "audio/mp3".equalsIgnoreCase(str)) {
            return 3;
        }
        if ("audio/mp4a-latm".equalsIgnoreCase(str) || str.startsWith(MimeTypes.AUDIO_MP4)) {
            return 4;
        }
        if ("audio/qcelp".equalsIgnoreCase(str)) {
            return 5;
        }
        if (MimeTypes.AUDIO_VORBIS.equalsIgnoreCase(str)) {
            return 6;
        }
        if (MimeTypes.AUDIO_OPUS.equalsIgnoreCase(str)) {
            return 7;
        }
        if (MimeTypes.AUDIO_ALAW.equalsIgnoreCase(str)) {
            return 8;
        }
        if (MimeTypes.AUDIO_MLAW.equalsIgnoreCase(str)) {
            return 9;
        }
        if (MimeTypes.AUDIO_RAW.equalsIgnoreCase(str)) {
            return 10;
        }
        if (MimeTypes.AUDIO_FLAC.equalsIgnoreCase(str)) {
            return 11;
        }
        if (MimeTypes.AUDIO_MSGSM.equalsIgnoreCase(str)) {
            return 12;
        }
        if (MimeTypes.AUDIO_AC3.equalsIgnoreCase(str)) {
            return 13;
        }
        if (MimeTypes.AUDIO_E_AC3.equalsIgnoreCase(str)) {
            return 14;
        }
        if ("audio/x-ms-wma".equalsIgnoreCase(str)) {
            return 15;
        }
        if ("audio/x-wav".equalsIgnoreCase(str)) {
            return 16;
        }
        return ("audio/x-ape".equalsIgnoreCase(str) || "application/x-ape".equalsIgnoreCase(str)) ? 17 : 0;
    }

    /* renamed from: b */
    public static int m132449b(int i) {
        Log.m105924i("MicroMsg.Music.MusicPlayIdKeyReport", "getMusicPlayerErrIdKey, errCode:" + i);
        switch (i) {
            case 700:
                return 45;
            case 701:
                return 48;
            case 702:
                return 39;
            case 703:
                return 40;
            case 704:
                return 41;
            case 705:
                return 42;
            case 706:
                return 43;
            case 707:
                return 44;
            default:
                return WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_USE_DOWNLOAD;
        }
    }

    /* renamed from: c */
    public static int m132450c(int i) {
        Log.m105924i("MicroMsg.Music.MusicPlayIdKeyReport", "getQQMusicPlayerErrIdKey, errCode:" + i);
        if (i == 66) {
            return 23;
        }
        if (i == 67) {
            return 24;
        }
        if (i == 69) {
            return 25;
        }
        if (i == 70) {
            return 36;
        }
        if (i == 74) {
            return 26;
        }
        if (i == 80) {
            return 27;
        }
        if (i == 101) {
            return 28;
        }
        if (i == 102) {
            return 29;
        }
        if (i == 700) {
            return 37;
        }
        if (i == 701) {
            return 38;
        }
        switch (i) {
            case 53:
                return 17;
            case 54:
                return 18;
            case 55:
                return 19;
            default:
                switch (i) {
                    case 62:
                        return 20;
                    case 63:
                        return 21;
                    case 64:
                        return 22;
                    default:
                        switch (i) {
                            case 500:
                                return 31;
                            case 501:
                                return 32;
                            case 502:
                                return 33;
                            case 503:
                                return 34;
                            case 504:
                                return 35;
                            default:
                                return 30;
                        }
                }
        }
    }
}
