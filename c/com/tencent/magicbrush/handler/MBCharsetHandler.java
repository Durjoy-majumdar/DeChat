package com.tencent.magicbrush.handler;

import java.io.UnsupportedEncodingException;
import p416qd.C89598h;

public class MBCharsetHandler {
    private static final String TAG = "MicroMsg.MBCharsetHandler";

    public static String decode(byte[] bArr, String str) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            return new String(bArr, str);
        } catch (UnsupportedEncodingException e) {
            C89598h.m112044a(TAG, "UnsupportedDecoding [%s] [%s]", str, e);
            return null;
        }
    }

    public static byte[] encode(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes(str2);
        } catch (UnsupportedEncodingException e) {
            C89598h.m112044a(TAG, "MBCharsetHandler encode failed. [%s]", e);
            return null;
        }
    }
}
