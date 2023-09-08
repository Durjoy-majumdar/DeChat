package com.tencent.midas.comm.log.util;

public class APBytesUtil {
    public static byte[] int2bytes(int i) {
        return new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i};
    }
}
