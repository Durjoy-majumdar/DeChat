package p333e8;

import android.text.TextUtils;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;

/* renamed from: e8.j */
public final class C20536j {
    /* renamed from: a */
    public static String m22249a(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.startsWith("avc1") || trim.startsWith("avc3")) {
            return "video/avc";
        }
        if (trim.startsWith("hev1") || trim.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (trim.startsWith("vp9") || trim.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (trim.startsWith("vp8") || trim.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (trim.startsWith("mp4a")) {
            return "audio/mp4a-latm";
        }
        if (trim.startsWith("ac-3") || trim.startsWith("dac3")) {
            return MimeTypes.AUDIO_AC3;
        }
        if (trim.startsWith("ec-3") || trim.startsWith("dec3")) {
            return MimeTypes.AUDIO_E_AC3;
        }
        if (trim.startsWith("dtsc") || trim.startsWith("dtse")) {
            return MimeTypes.AUDIO_DTS;
        }
        if (trim.startsWith("dtsh") || trim.startsWith("dtsl")) {
            return MimeTypes.AUDIO_DTS_HD;
        }
        if (trim.startsWith("opus")) {
            return MimeTypes.AUDIO_OPUS;
        }
        if (trim.startsWith("vorbis")) {
            return MimeTypes.AUDIO_VORBIS;
        }
        return null;
    }

    /* renamed from: b */
    public static String m22250b(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        throw new IllegalArgumentException("Invalid mime type: " + str);
    }

    /* renamed from: c */
    public static int m22251c(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m22252d(str)) {
            return 1;
        }
        if (m22253e(str)) {
            return 2;
        }
        if (MimeTypes.BASE_TYPE_TEXT.equals(m22250b(str)) || MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str) || MimeTypes.APPLICATION_MP4CEA608.equals(str) || MimeTypes.APPLICATION_SUBRIP.equals(str) || MimeTypes.APPLICATION_TTML.equals(str) || MimeTypes.APPLICATION_TX3G.equals(str) || MimeTypes.APPLICATION_MP4VTT.equals(str) || MimeTypes.APPLICATION_RAWCC.equals(str) || MimeTypes.APPLICATION_VOBSUB.equals(str) || MimeTypes.APPLICATION_PGS.equals(str) || MimeTypes.APPLICATION_DVBSUBS.equals(str)) {
            return 3;
        }
        return (MimeTypes.APPLICATION_ID3.equals(str) || MimeTypes.APPLICATION_EMSG.equals(str) || MimeTypes.APPLICATION_SCTE35.equals(str) || MimeTypes.APPLICATION_CAMERA_MOTION.equals(str)) ? 4 : -1;
    }

    /* renamed from: d */
    public static boolean m22252d(String str) {
        return "audio".equals(m22250b(str));
    }

    /* renamed from: e */
    public static boolean m22253e(String str) {
        return "video".equals(m22250b(str));
    }
}
