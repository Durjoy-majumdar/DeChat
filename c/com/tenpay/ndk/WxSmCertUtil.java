package com.tenpay.ndk;

public class WxSmCertUtil {
    private static volatile WxSmCertUtil instance;
    private FitScUtil fitScUtil;

    private WxSmCertUtil() {
        this.fitScUtil = null;
        this.fitScUtil = new FitScUtil();
    }

    public static void freeInstance() {
        if (instance != null) {
            instance.release();
            instance = null;
        }
    }

    public static WxSmCertUtil getInstance() {
        if (instance == null) {
            synchronized (WxSmCertUtil.class) {
                if (instance == null) {
                    instance = new WxSmCertUtil();
                }
            }
        }
        return instance;
    }

    private void release() {
        FitScUtil fitScUtil2 = this.fitScUtil;
        if (fitScUtil2 != null) {
            fitScUtil2.release();
            this.fitScUtil = null;
        }
    }

    public byte[] certDecrypt(String str, byte[] bArr) {
        byte[] certDecrypt;
        synchronized (FitScUtil.sm2Lock) {
            certDecrypt = this.fitScUtil.certDecrypt(str, bArr);
        }
        return certDecrypt;
    }

    public byte[] certEncrypt(String str, byte[] bArr) {
        byte[] certEncrypt;
        synchronized (FitScUtil.sm2Lock) {
            certEncrypt = this.fitScUtil.certEncrypt(str, bArr);
        }
        return certEncrypt;
    }

    public byte[] certSign(String str, byte[] bArr, byte[] bArr2) {
        byte[] certSign;
        synchronized (FitScUtil.sm2Lock) {
            certSign = this.fitScUtil.certSign(str, bArr, bArr2);
        }
        return certSign;
    }

    public boolean certVerify(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        boolean certVerify;
        synchronized (FitScUtil.sm2Lock) {
            certVerify = this.fitScUtil.certVerify(str, bArr, bArr2, bArr3);
        }
        return certVerify;
    }

    public boolean clearAllCert() {
        return this.fitScUtil.clearAllCert();
    }

    public boolean clearCert(String str) {
        return this.fitScUtil.clearCert(str);
    }

    public boolean clearToken(String str) {
        return this.fitScUtil.clearToken(str);
    }

    public boolean clearTokenSeed(String str) {
        return this.fitScUtil.clearTokenSeed(str);
    }

    public int getCaCertVersion() {
        return this.fitScUtil.getCaCertVersion();
    }

    public long[] getCertValidTime(String str) {
        long[] certValidTime;
        synchronized (FitScUtil.sm2Lock) {
            certValidTime = this.fitScUtil.getCertValidTime(str);
        }
        return certValidTime;
    }

    public int getLastError() {
        return this.fitScUtil.getLastError();
    }

    public String getToken(String str) {
        String token;
        synchronized (FitScUtil.sm2Lock) {
            token = this.fitScUtil.getToken(str);
        }
        return token;
    }

    public int getTokenCount(String str) {
        return this.fitScUtil.getTokenCount(str);
    }

    public String getTokenHeader(String str) {
        String tokenHeader;
        synchronized (FitScUtil.sm2Lock) {
            tokenHeader = this.fitScUtil.getTokenHeader(str);
        }
        return tokenHeader;
    }

    public byte[] getTokenSeed(String str) {
        byte[] tokenSeed;
        synchronized (FitScUtil.sm2Lock) {
            tokenSeed = this.fitScUtil.getTokenSeed(str);
        }
        return tokenSeed;
    }

    public String getVersion() {
        return this.fitScUtil.getVersion();
    }

    public boolean hasCert(String str) {
        return this.fitScUtil.hasCert(str);
    }

    public boolean importCert(String str, String str2, boolean z) {
        boolean importCert;
        synchronized (FitScUtil.sm2Lock) {
            importCert = this.fitScUtil.importCert(str, str2, z);
        }
        return importCert;
    }

    public boolean init(String str, String str2, String str3, String str4) {
        boolean init;
        synchronized (FitScUtil.sm2Lock) {
            init = this.fitScUtil.init(str, str2, str3, str4);
        }
        return init;
    }

    public String makeCsr(String str, String str2) {
        String makeCsr;
        synchronized (FitScUtil.sm2Lock) {
            makeCsr = this.fitScUtil.makeCsr(str, str2);
        }
        return makeCsr;
    }

    public boolean setToken(String str, String str2) {
        return this.fitScUtil.setToken(str, str2);
    }

    public boolean setTokenSeed(String str, byte[] bArr) {
        return this.fitScUtil.setTokenSeed(str, bArr);
    }

    public boolean updateCaCert(int i, String[] strArr) {
        boolean updateCaCert;
        synchronized (FitScUtil.sm2Lock) {
            updateCaCert = this.fitScUtil.updateCaCert(i, strArr);
        }
        return updateCaCert;
    }
}
