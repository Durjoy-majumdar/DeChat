package e40;

import android.util.Base64;
import com.tencent.wxmm.v2encoder;

/* renamed from: e40.a */
public class C86423a {
    /* renamed from: a */
    public static float m107089a(String str) {
        byte[] decode = Base64.decode(str, 2);
        return Float.intBitsToFloat((decode[0] << 24) + (decode[1] << v2encoder.enumCODEC_vcodec2) + (decode[2] << 8) + decode[3]);
    }
}
