package com.tenpay.tsm;

import com.tenpay.tsm.TSMTypes;
import com.tenpay.utils.SMUtilsV2;

public class TSMCryptoSM2Desc {
    public static byte[] decrypt(String str, byte[] bArr, TSMTypes.SM2CipherFormat sM2CipherFormat) {
        byte[][] bArr2 = new byte[1][];
        int TSMCryptoDescSM2Decrypt = SMUtilsV2.TSMCryptoDescSM2Decrypt(str, bArr, sM2CipherFormat.ordinal(), bArr2);
        if (TSMCryptoDescSM2Decrypt == 0) {
            return bArr2[0];
        }
        throw new TSMException(TSMCryptoDescSM2Decrypt);
    }

    public static byte[] encrypt(String str, byte[] bArr, TSMTypes.SM2CipherFormat sM2CipherFormat) {
        byte[][] bArr2 = new byte[1][];
        int TSMCryptoDescSM2Encrypt = SMUtilsV2.TSMCryptoDescSM2Encrypt(str, bArr, sM2CipherFormat.ordinal(), bArr2);
        if (TSMCryptoDescSM2Encrypt == 0) {
            return bArr2[0];
        }
        throw new TSMException(TSMCryptoDescSM2Encrypt);
    }

    public static byte[] sign(String str, byte[] bArr, String str2, TSMTypes.SM2SignFormat sM2SignFormat) {
        byte[][] bArr2 = new byte[1][];
        int TSMCryptoDescSM2Sign = SMUtilsV2.TSMCryptoDescSM2Sign(str, bArr, str2, sM2SignFormat.ordinal(), bArr2);
        if (TSMCryptoDescSM2Sign == 0) {
            return bArr2[0];
        }
        throw new TSMException(TSMCryptoDescSM2Sign);
    }

    public static boolean verify(String str, byte[] bArr, String str2, byte[] bArr2, TSMTypes.SM2SignFormat sM2SignFormat) {
        int TSMCryptoDescSM2Verify = SMUtilsV2.TSMCryptoDescSM2Verify(str, bArr, str2, bArr2, sM2SignFormat.ordinal());
        if (-51003 == TSMCryptoDescSM2Verify) {
            return false;
        }
        if (TSMCryptoDescSM2Verify == 0) {
            return true;
        }
        throw new TSMException(TSMCryptoDescSM2Verify);
    }
}
