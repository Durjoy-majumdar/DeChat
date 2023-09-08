package qw1;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: qw1.j */
public class C63341j {
    /* renamed from: a */
    public static String m74673a(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case 3006243:
                if (str.equals("avc1")) {
                    c = 0;
                    break;
                }
                break;
            case 3117788:
                if (str.equals("encv")) {
                    c = 1;
                    break;
                }
                break;
            case 3199032:
                if (str.equals("hev1")) {
                    c = 2;
                    break;
                }
                break;
            case 3214780:
                if (str.equals("hvc1")) {
                    c = 3;
                    break;
                }
                break;
            case 3356560:
                if (str.equals("mp4a")) {
                    c = 4;
                    break;
                }
                break;
            case 3356581:
                if (str.equals("mp4v")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 5:
                return "video/avc";
            case 1:
            case 2:
            case 3:
                return "video/hevc";
            case 4:
                return "audio/mp4a-latm";
            default:
                Log.m105921e("MicroMsg.AlbumAdapter.MIMEUtils", "unsupport type: %s", str);
                return "";
        }
    }
}
