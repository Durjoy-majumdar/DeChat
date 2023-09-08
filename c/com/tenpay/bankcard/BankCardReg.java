package com.tenpay.bankcard;

import com.tencent.bankcardrecog.BankCardInfo;
import com.tencent.bankcardrecog.BankCardRecog;
import com.tenpay.ndk.Encrypt;

public class BankCardReg {
    private static final String TAG = "MyTag";

    public static String getBankCardSegmentNumber(String str, int i, int[] iArr) {
        LogUtil.m90287d(TAG, "getBankCardSegmentNumber");
        LogUtil.m90287d(TAG, "cardNum=" + str);
        Encrypt encrypt = new Encrypt();
        String desedeDecode = encrypt.desedeDecode(str, encrypt.getRandomKey());
        LogUtil.m90287d(TAG, "cardNum=" + desedeDecode);
        String bankCardSegmentNumber = BankCardRecog.getBankCardSegmentNumber(desedeDecode, i, iArr);
        LogUtil.m90287d(TAG, bankCardSegmentNumber);
        return encrypt.desedeEncode(bankCardSegmentNumber, encrypt.getRandomKey());
    }

    public static int recognizeBankCardGetVersion() {
        return BankCardRecog.recognizeBankCardGetVersion();
    }

    public static int recognizeBankCardInit(int i, int i2, boolean z) {
        return BankCardRecog.recognizeBankCardInit(i, i2, z);
    }

    public static int recognizeBankCardProcess(byte[] bArr, BankCardInfo bankCardInfo, boolean[] zArr) {
        return BankCardRecog.recognizeBankCardProcess(bArr, bankCardInfo, zArr);
    }

    public static int recognizeBankCardRelease() {
        return BankCardRecog.recognizeBankCardRelease();
    }
}
