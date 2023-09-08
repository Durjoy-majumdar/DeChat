package com.tenpay.tsm;

public class TSMTypes {

    public enum SM2CipherFormat {
        kSM2CipherC1C3C2ASN1Encode,
        kSM2CipherC1C3C2Raw,
        kSM2CipherC1C2C3ASN1Encode,
        kSM2CipherC1C2C3Raw,
        kSM2Cipher04C1C3C2Raw,
        kSM2Cipher04C1C2C3Raw
    }

    public enum SM2SignFormat {
        kSM2SignRSASN1Encode,
        kSM2SignRSRaw
    }

    public enum TSMStorageSM2KeyFormat {
        kTSMStorageSM2KeyFormatHEX,
        kTSMStorageSM2KeyFormatPEM
    }
}
