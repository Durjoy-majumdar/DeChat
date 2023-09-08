package com.tencent.p014mm.platformtools;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.wxmm.v2encoder;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* renamed from: com.tencent.mm.platformtools.SpellMap */
public class SpellMap {
    static {
        new HashMap();
    }

    /* renamed from: a */
    public static String m80581a(char c) {
        byte b;
        if (c <= 128) {
            b = c;
        } else {
            try {
                byte[] bytes = String.valueOf(c).getBytes("GBK");
                if (bytes != null && bytes.length <= 2 && bytes.length > 0) {
                    if (bytes.length == 1) {
                        b = bytes[0];
                    } else if (bytes.length == 2) {
                        b = ((bytes[0] + 256) << 16) + bytes[1] + 256;
                    }
                }
            } catch (UnsupportedEncodingException unused) {
            }
            b = 0;
        }
        if (b < 65536) {
            return "" + c;
        }
        int i = b >> v2encoder.enumCODEC_vcodec2;
        byte b2 = b & ExifInterface.MARKER;
        String spellGetJni = (i < 129 || i > 253 || b2 < 63 || b2 > 254) ? null : spellGetJni(i - 129, b2 - 63);
        if (spellGetJni == null) {
            return null;
        }
        String[] split = spellGetJni.split(",");
        return (split == null || split.length < 2) ? spellGetJni : split[0];
    }

    public static native String spellGetJni(int i, int i2);
}
