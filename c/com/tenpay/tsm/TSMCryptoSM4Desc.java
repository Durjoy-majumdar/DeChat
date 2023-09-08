package com.tenpay.tsm;

import com.tenpay.utils.SMUtilsV2;

public class TSMCryptoSM4Desc {
    public static byte[] CBCDecrypt(String str, byte[] bArr, byte[] bArr2) {
        byte[][] bArr3 = new byte[1][];
        int TSMCryptoDescSM4CBCDecrypt = SMUtilsV2.TSMCryptoDescSM4CBCDecrypt(str, bArr, bArr2, bArr3);
        if (TSMCryptoDescSM4CBCDecrypt == 0) {
            return bArr3[0];
        }
        throw new TSMException(TSMCryptoDescSM4CBCDecrypt);
    }

    public static byte[] CBCEncrypt(String str, byte[] bArr, byte[] bArr2) {
        byte[][] bArr3 = new byte[1][];
        int TSMCryptoDescSM4CBCEncrypt = SMUtilsV2.TSMCryptoDescSM4CBCEncrypt(str, bArr, bArr2, bArr3);
        if (TSMCryptoDescSM4CBCEncrypt == 0) {
            return bArr3[0];
        }
        throw new TSMException(TSMCryptoDescSM4CBCEncrypt);
    }

    public static byte[] CTRDecrypt(String str, byte[] bArr, byte[] bArr2) {
        byte[][] bArr3 = new byte[1][];
        int TSMCryptoDescSM4CTRDecrypt = SMUtilsV2.TSMCryptoDescSM4CTRDecrypt(str, bArr, bArr2, bArr3);
        if (TSMCryptoDescSM4CTRDecrypt == 0) {
            return bArr3[0];
        }
        throw new TSMException(TSMCryptoDescSM4CTRDecrypt);
    }

    public static byte[] CTREncrypt(String str, byte[] bArr, byte[] bArr2) {
        byte[][] bArr3 = new byte[1][];
        int TSMCryptoDescSM4CTREncrypt = SMUtilsV2.TSMCryptoDescSM4CTREncrypt(str, bArr, bArr2, bArr3);
        if (TSMCryptoDescSM4CTREncrypt == 0) {
            return bArr3[0];
        }
        throw new TSMException(TSMCryptoDescSM4CTREncrypt);
    }

    public static byte[] ECBDecrypt(String str, byte[] bArr) {
        byte[][] bArr2 = new byte[1][];
        int TSMCryptoDescSM4ECBDecrypt = SMUtilsV2.TSMCryptoDescSM4ECBDecrypt(str, bArr, bArr2);
        if (TSMCryptoDescSM4ECBDecrypt == 0) {
            return bArr2[0];
        }
        throw new TSMException(TSMCryptoDescSM4ECBDecrypt);
    }

    public static byte[] ECBEncrypt(String str, byte[] bArr) {
        byte[][] bArr2 = new byte[1][];
        int TSMCryptoDescSM4ECBEncrypt = SMUtilsV2.TSMCryptoDescSM4ECBEncrypt(str, bArr, bArr2);
        if (TSMCryptoDescSM4ECBEncrypt == 0) {
            return bArr2[0];
        }
        throw new TSMException(TSMCryptoDescSM4ECBEncrypt);
    }

    public static byte[] GCMDecrypt(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        byte[][] bArr5 = new byte[1][];
        int TSMCryptoDescSM4GCMDecrypt = SMUtilsV2.TSMCryptoDescSM4GCMDecrypt(str, bArr, bArr2, bArr3, bArr4, bArr5);
        if (TSMCryptoDescSM4GCMDecrypt == 0) {
            return bArr5[0];
        }
        throw new TSMException(TSMCryptoDescSM4GCMDecrypt);
    }

    public static byte[][] GCMEncrypt(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[][] bArr4 = new byte[1][];
        byte[][] bArr5 = new byte[1][];
        int TSMCryptoDescSM4GCMEncrypt = SMUtilsV2.TSMCryptoDescSM4GCMEncrypt(str, bArr, bArr2, bArr3, bArr4, bArr5);
        if (TSMCryptoDescSM4GCMEncrypt == 0) {
            return new byte[][]{bArr4[0], bArr5[0]};
        }
        throw new TSMException(TSMCryptoDescSM4GCMEncrypt);
    }
}
