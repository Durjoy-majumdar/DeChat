package sm0;

import com.tenpay.tsm.TSMCryptoSM2Desc;
import com.tenpay.tsm.TSMCryptoSM4Desc;
import com.tenpay.tsm.TSMException;
import com.tenpay.tsm.TSMStorage;
import com.tenpay.tsm.TSMTypes;
import gy3.C8480h;
import gy3.C87412m;
import rx3.C13598b0;
import sm0.C26165b;

/* renamed from: sm0.r */
public final class C27667r implements C26165b {

    /* renamed from: i */
    public static final Object f76602i = new Object();

    /* renamed from: d */
    public final String f76603d;

    /* renamed from: e */
    public final String f76604e;

    /* renamed from: f */
    public final String f76605f;

    /* renamed from: g */
    public final C26165b.C26167b f76606g = new C27669b(this);

    /* renamed from: h */
    public final C26165b.C26166a f76607h = new C27668a(this);

    /* renamed from: sm0.r$a */
    public static final class C27668a implements C26165b.C26166a {

        /* renamed from: a */
        public final C27667r f76608a;

        public C27668a(C27667r rVar) {
            C87412m.m108594g(rVar, "smStorageImpl");
            this.f76608a = rVar;
        }

        /* renamed from: a */
        public boolean mo53083a(String str, byte[] bArr, String str2, byte[] bArr2, TSMTypes.SM2SignFormat sM2SignFormat) {
            boolean verify;
            C87412m.m108594g(str, "desc");
            C87412m.m108594g(bArr, "msg");
            C87412m.m108594g(str2, "id");
            C87412m.m108594g(bArr2, "sig");
            C87412m.m108594g(sM2SignFormat, "signFormat");
            C27667r rVar = this.f76608a;
            synchronized (C27667r.f76602i) {
                TSMStorage.init(rVar.f76603d, rVar.f76604e, rVar.f76605f);
                verify = TSMCryptoSM2Desc.verify(str, bArr, str2, bArr2, sM2SignFormat);
            }
            return verify;
        }

        /* renamed from: b */
        public byte[] mo53084b(String str, byte[] bArr, String str2, TSMTypes.SM2SignFormat sM2SignFormat) {
            byte[] sign;
            C87412m.m108594g(str, "desc");
            C87412m.m108594g(bArr, "msg");
            C87412m.m108594g(str2, "id");
            C87412m.m108594g(sM2SignFormat, "signFormat");
            C27667r rVar = this.f76608a;
            synchronized (C27667r.f76602i) {
                TSMStorage.init(rVar.f76603d, rVar.f76604e, rVar.f76605f);
                sign = TSMCryptoSM2Desc.sign(str, bArr, str2, sM2SignFormat);
            }
            C87412m.m108593f(sign, "smStorageImpl.invoke {\n …id, signFormat)\n        }");
            return sign;
        }

        /* renamed from: c */
        public byte[] mo53085c(String str, byte[] bArr, TSMTypes.SM2CipherFormat sM2CipherFormat) {
            byte[] decrypt;
            C87412m.m108594g(str, "desc");
            C87412m.m108594g(bArr, "cipher");
            C87412m.m108594g(sM2CipherFormat, "cipherFormat");
            C27667r rVar = this.f76608a;
            synchronized (C27667r.f76602i) {
                TSMStorage.init(rVar.f76603d, rVar.f76604e, rVar.f76605f);
                decrypt = TSMCryptoSM2Desc.decrypt(str, bArr, sM2CipherFormat);
            }
            C87412m.m108593f(decrypt, "smStorageImpl.invoke {\n …, cipherFormat)\n        }");
            return decrypt;
        }

        /* renamed from: d */
        public byte[] mo53086d(String str, byte[] bArr, TSMTypes.SM2CipherFormat sM2CipherFormat) {
            byte[] encrypt;
            C87412m.m108594g(str, "desc");
            C87412m.m108594g(bArr, "plain");
            C87412m.m108594g(sM2CipherFormat, "cipherFormat");
            C27667r rVar = this.f76608a;
            synchronized (C27667r.f76602i) {
                TSMStorage.init(rVar.f76603d, rVar.f76604e, rVar.f76605f);
                encrypt = TSMCryptoSM2Desc.encrypt(str, bArr, sM2CipherFormat);
            }
            C87412m.m108593f(encrypt, "smStorageImpl.invoke {\n …, cipherFormat)\n        }");
            return encrypt;
        }
    }

    /* renamed from: sm0.r$b */
    public static final class C27669b implements C26165b.C26167b {

        /* renamed from: a */
        public final C27667r f76609a;

        public C27669b(C27667r rVar) {
            C87412m.m108594g(rVar, "smStorageImpl");
            this.f76609a = rVar;
        }

        /* renamed from: a */
        public byte[] mo53087a(String str, byte[] bArr, byte[] bArr2) {
            byte[] CTRDecrypt;
            C87412m.m108594g(str, "desc");
            C87412m.m108594g(bArr, "cipher");
            C87412m.m108594g(bArr2, "iv");
            C27667r rVar = this.f76609a;
            synchronized (C27667r.f76602i) {
                TSMStorage.init(rVar.f76603d, rVar.f76604e, rVar.f76605f);
                CTRDecrypt = TSMCryptoSM4Desc.CTRDecrypt(str, bArr, bArr2);
            }
            C87412m.m108593f(CTRDecrypt, "smStorageImpl.invoke {\n …sc, cipher, iv)\n        }");
            return CTRDecrypt;
        }

        /* renamed from: b */
        public byte[][] mo53088b(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
            byte[][] GCMEncrypt;
            C87412m.m108594g(str, "desc");
            C87412m.m108594g(bArr, "plain");
            C87412m.m108594g(bArr2, "iv");
            C87412m.m108594g(bArr3, "aad");
            C27667r rVar = this.f76609a;
            synchronized (C27667r.f76602i) {
                TSMStorage.init(rVar.f76603d, rVar.f76604e, rVar.f76605f);
                GCMEncrypt = TSMCryptoSM4Desc.GCMEncrypt(str, bArr, bArr2, bArr3);
            }
            C87412m.m108593f(GCMEncrypt, "smStorageImpl.invoke {\n …plain, iv, aad)\n        }");
            return GCMEncrypt;
        }

        /* renamed from: c */
        public byte[] mo53089c(String str, byte[] bArr) {
            byte[] ECBDecrypt;
            C87412m.m108594g(str, "desc");
            C87412m.m108594g(bArr, "cipher");
            C27667r rVar = this.f76609a;
            synchronized (C27667r.f76602i) {
                TSMStorage.init(rVar.f76603d, rVar.f76604e, rVar.f76605f);
                ECBDecrypt = TSMCryptoSM4Desc.ECBDecrypt(str, bArr);
            }
            C87412m.m108593f(ECBDecrypt, "smStorageImpl.invoke {\n …t(desc, cipher)\n        }");
            return ECBDecrypt;
        }

        /* renamed from: d */
        public byte[] mo53090d(String str, byte[] bArr, byte[] bArr2) {
            byte[] CTREncrypt;
            C87412m.m108594g(str, "desc");
            C87412m.m108594g(bArr, "plain");
            C87412m.m108594g(bArr2, "iv");
            C27667r rVar = this.f76609a;
            synchronized (C27667r.f76602i) {
                TSMStorage.init(rVar.f76603d, rVar.f76604e, rVar.f76605f);
                CTREncrypt = TSMCryptoSM4Desc.CTREncrypt(str, bArr, bArr2);
            }
            C87412m.m108593f(CTREncrypt, "smStorageImpl.invoke {\n …esc, plain, iv)\n        }");
            return CTREncrypt;
        }

        /* renamed from: e */
        public byte[] mo53091e(String str, byte[] bArr) {
            byte[] ECBEncrypt;
            C87412m.m108594g(str, "desc");
            C87412m.m108594g(bArr, "plain");
            C27667r rVar = this.f76609a;
            synchronized (C27667r.f76602i) {
                TSMStorage.init(rVar.f76603d, rVar.f76604e, rVar.f76605f);
                ECBEncrypt = TSMCryptoSM4Desc.ECBEncrypt(str, bArr);
            }
            C87412m.m108593f(ECBEncrypt, "smStorageImpl.invoke {\n …pt(desc, plain)\n        }");
            return ECBEncrypt;
        }

        /* renamed from: f */
        public byte[] mo53092f(String str, byte[] bArr, byte[] bArr2) {
            byte[] CBCDecrypt;
            C87412m.m108594g(str, "desc");
            C87412m.m108594g(bArr, "cipher");
            C87412m.m108594g(bArr2, "iv");
            C27667r rVar = this.f76609a;
            synchronized (C27667r.f76602i) {
                TSMStorage.init(rVar.f76603d, rVar.f76604e, rVar.f76605f);
                CBCDecrypt = TSMCryptoSM4Desc.CBCDecrypt(str, bArr, bArr2);
            }
            C87412m.m108593f(CBCDecrypt, "smStorageImpl.invoke {\n …sc, cipher, iv)\n        }");
            return CBCDecrypt;
        }

        /* renamed from: g */
        public byte[] mo53093g(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
            byte[] GCMDecrypt;
            C87412m.m108594g(str, "desc");
            C87412m.m108594g(bArr, "cipher");
            C87412m.m108594g(bArr2, "tag");
            C87412m.m108594g(bArr3, "iv");
            C87412m.m108594g(bArr4, "aad");
            C27667r rVar = this.f76609a;
            synchronized (C27667r.f76602i) {
                TSMStorage.init(rVar.f76603d, rVar.f76604e, rVar.f76605f);
                GCMDecrypt = TSMCryptoSM4Desc.GCMDecrypt(str, bArr, bArr2, bArr3, bArr4);
            }
            C87412m.m108593f(GCMDecrypt, "smStorageImpl.invoke {\n …, tag, iv, aad)\n        }");
            return GCMDecrypt;
        }

        /* renamed from: h */
        public byte[] mo53094h(String str, byte[] bArr, byte[] bArr2) {
            byte[] CBCEncrypt;
            C87412m.m108594g(str, "desc");
            C87412m.m108594g(bArr, "plain");
            C87412m.m108594g(bArr2, "iv");
            C27667r rVar = this.f76609a;
            synchronized (C27667r.f76602i) {
                TSMStorage.init(rVar.f76603d, rVar.f76604e, rVar.f76605f);
                CBCEncrypt = TSMCryptoSM4Desc.CBCEncrypt(str, bArr, bArr2);
            }
            C87412m.m108593f(CBCEncrypt, "smStorageImpl.invoke {\n …esc, plain, iv)\n        }");
            return CBCEncrypt;
        }
    }

    public C27667r(String str, String str2, String str3, C8480h hVar) {
        this.f76603d = str;
        this.f76604e = str2;
        this.f76605f = str3;
    }

    /* renamed from: B */
    public void mo53064B(String str, String str2, TSMTypes.TSMStorageSM2KeyFormat tSMStorageSM2KeyFormat) {
        C87412m.m108594g(str, "desc");
        C87412m.m108594g(str2, "priKey");
        C87412m.m108594g(tSMStorageSM2KeyFormat, "keyFormat");
        synchronized (f76602i) {
            TSMStorage.init(this.f76603d, this.f76604e, this.f76605f);
            TSMStorage.updateSM2PriKey(str, str2, tSMStorageSM2KeyFormat);
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: D */
    public boolean mo53065D(String str) {
        boolean checkSM2PriKey;
        C87412m.m108594g(str, "desc");
        synchronized (f76602i) {
            TSMStorage.init(this.f76603d, this.f76604e, this.f76605f);
            checkSM2PriKey = TSMStorage.checkSM2PriKey(str);
        }
        return checkSM2PriKey;
    }

    /* renamed from: E */
    public String[] mo53066E(String str, TSMTypes.TSMStorageSM2KeyFormat tSMStorageSM2KeyFormat) {
        String[] exportSM2PriKey;
        C87412m.m108594g(str, "desc");
        C87412m.m108594g(tSMStorageSM2KeyFormat, "keyFormat");
        synchronized (f76602i) {
            TSMStorage.init(this.f76603d, this.f76604e, this.f76605f);
            exportSM2PriKey = TSMStorage.exportSM2PriKey(str, tSMStorageSM2KeyFormat);
            if (exportSM2PriKey == null) {
                throw new TSMException(TSMException.ERR_KV_FILE_NOT_FOUND);
            }
        }
        return exportSM2PriKey;
    }

    /* renamed from: F */
    public void mo53067F(String str) {
        C87412m.m108594g(str, "desc");
        synchronized (f76602i) {
            TSMStorage.init(this.f76603d, this.f76604e, this.f76605f);
            TSMStorage.deleteSM4Key(str);
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: G */
    public void mo53068G(String str) {
        C87412m.m108594g(str, "desc");
        synchronized (f76602i) {
            TSMStorage.init(this.f76603d, this.f76604e, this.f76605f);
            TSMStorage.deleteSM2PriKey(str);
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: I */
    public void mo53069I(String str, String str2, TSMTypes.TSMStorageSM2KeyFormat tSMStorageSM2KeyFormat) {
        C87412m.m108594g(str, "desc");
        C87412m.m108594g(str2, "priKey");
        C87412m.m108594g(tSMStorageSM2KeyFormat, "keyFormat");
        synchronized (f76602i) {
            TSMStorage.init(this.f76603d, this.f76604e, this.f76605f);
            TSMStorage.importSM2PriKey(str, str2, tSMStorageSM2KeyFormat);
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: K */
    public void mo53070K(String str) {
        C87412m.m108594g(str, "desc");
        synchronized (f76602i) {
            TSMStorage.init(this.f76603d, this.f76604e, this.f76605f);
            TSMStorage.deleteSM2PubKey(str);
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: L */
    public byte[] mo53071L(String str) {
        byte[] exportSM4Key;
        C87412m.m108594g(str, "desc");
        synchronized (f76602i) {
            TSMStorage.init(this.f76603d, this.f76604e, this.f76605f);
            exportSM4Key = TSMStorage.exportSM4Key(str);
            if (exportSM4Key == null) {
                throw new TSMException(TSMException.ERR_KV_FILE_NOT_FOUND);
            }
        }
        return exportSM4Key;
    }

    /* renamed from: N */
    public String mo53072N(String str, TSMTypes.TSMStorageSM2KeyFormat tSMStorageSM2KeyFormat) {
        String exportSM2PubKey;
        C87412m.m108594g(str, "desc");
        C87412m.m108594g(tSMStorageSM2KeyFormat, "keyFormat");
        synchronized (f76602i) {
            TSMStorage.init(this.f76603d, this.f76604e, this.f76605f);
            exportSM2PubKey = TSMStorage.exportSM2PubKey(str, tSMStorageSM2KeyFormat);
            if (exportSM2PubKey == null) {
                throw new TSMException(TSMException.ERR_KV_FILE_NOT_FOUND);
            }
        }
        return exportSM2PubKey;
    }

    /* renamed from: R */
    public void mo53073R(String str, String str2, TSMTypes.TSMStorageSM2KeyFormat tSMStorageSM2KeyFormat) {
        C87412m.m108594g(str, "desc");
        C87412m.m108594g(str2, "pubKey");
        C87412m.m108594g(tSMStorageSM2KeyFormat, "keyFormat");
        synchronized (f76602i) {
            TSMStorage.init(this.f76603d, this.f76604e, this.f76605f);
            TSMStorage.importSM2PubKey(str, str2, tSMStorageSM2KeyFormat);
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: U */
    public boolean mo53074U(String str) {
        boolean checkSM2PubKey;
        C87412m.m108594g(str, "desc");
        synchronized (f76602i) {
            TSMStorage.init(this.f76603d, this.f76604e, this.f76605f);
            checkSM2PubKey = TSMStorage.checkSM2PubKey(str);
        }
        return checkSM2PubKey;
    }

    /* renamed from: X */
    public void mo53075X(String str) {
        C87412m.m108594g(str, "desc");
        synchronized (f76602i) {
            TSMStorage.init(this.f76603d, this.f76604e, this.f76605f);
            TSMStorage.generateSM2KeyPair(str);
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: Y */
    public C26165b.C26167b mo53076Y() {
        return this.f76606g;
    }

    /* renamed from: Z */
    public C26165b.C26166a mo53077Z() {
        return this.f76607h;
    }

    /* renamed from: g */
    public boolean mo53078g(String str) {
        boolean checkSM4Key;
        C87412m.m108594g(str, "desc");
        synchronized (f76602i) {
            TSMStorage.init(this.f76603d, this.f76604e, this.f76605f);
            checkSM4Key = TSMStorage.checkSM4Key(str);
        }
        return checkSM4Key;
    }

    /* renamed from: m */
    public void mo53079m(String str, byte[] bArr) {
        C87412m.m108594g(str, "desc");
        C87412m.m108594g(bArr, "key");
        synchronized (f76602i) {
            TSMStorage.init(this.f76603d, this.f76604e, this.f76605f);
            TSMStorage.importSM4Key(str, bArr);
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: p */
    public void mo53080p(String str) {
        C87412m.m108594g(str, "desc");
        synchronized (f76602i) {
            TSMStorage.init(this.f76603d, this.f76604e, this.f76605f);
            TSMStorage.generateSM4Key(str);
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: r */
    public void mo53081r(String str, String str2, TSMTypes.TSMStorageSM2KeyFormat tSMStorageSM2KeyFormat) {
        C87412m.m108594g(str, "desc");
        C87412m.m108594g(str2, "pubKey");
        C87412m.m108594g(tSMStorageSM2KeyFormat, "keyFormat");
        synchronized (f76602i) {
            TSMStorage.init(this.f76603d, this.f76604e, this.f76605f);
            TSMStorage.updateSM2PubKey(str, str2, tSMStorageSM2KeyFormat);
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: z */
    public void mo53082z(String str, byte[] bArr) {
        C87412m.m108594g(str, "desc");
        C87412m.m108594g(bArr, "key");
        synchronized (f76602i) {
            TSMStorage.init(this.f76603d, this.f76604e, this.f76605f);
            TSMStorage.updateSM4Key(str, bArr);
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }
}
