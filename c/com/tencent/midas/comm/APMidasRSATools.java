package com.tencent.midas.comm;

import android.util.Base64;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;

public class APMidasRSATools {
    private final String DEFAULT_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAy+ZF2XdZ6RwK/lAtyC7h\rLA4KaURXrD7gEGcx+t/l8KKLTLfR3j4vOHXHXjixipSXicyJcDH74rfO7ISnFkWQ\r+kVmB5kfhdrq5z6D/h/q7ko7MdU9SUlfZfAxwnS4VJY4xWoFWG9ZAoh5ZHJcloDU\rol0qYTUX/yWNiHkoUtnU+SP+ZJjODpqcYuVdLxlA0YelafeBc3SCeuEcPH9lIiRZ\rw0I91wQvPq7gM7/6qnMEdzm7nJdCIni83INl2bh3gW5UBwFBpNrI/fZkgDA4aVGV\rpplEP9bChkCpq2e1T9gw0ODuEVmgVaSvdwHLMYcGn+nYjWDYy16b6ImdkubF8q5l\rhwIDAQAB\r";
    private RSAPublicKey publicKey;

    private byte charToByte(char c) {
        return (byte) "0123456789ABCDEF".indexOf(c);
    }

    private byte[] decrypt(RSAPublicKey rSAPublicKey, byte[] bArr) {
        if (rSAPublicKey != null) {
            try {
                Cipher instance = Cipher.getInstance("RSA");
                instance.init(2, rSAPublicKey);
                return instance.doFinal(bArr);
            } catch (NoSuchAlgorithmException unused) {
                throw new Exception("没有这样的解密算法");
            } catch (InvalidKeyException unused2) {
                throw new Exception("密钥无效，请检查确认");
            } catch (IllegalBlockSizeException unused3) {
                throw new Exception("密文长度无效或者过长");
            } catch (BadPaddingException unused4) {
                throw new Exception("密文数据已损坏");
            } catch (Exception e) {
                APLog.m161214i("APMidasRSATools exception", e.toString());
                throw new Exception("其他错误");
            }
        } else {
            throw new Exception("解密私钥为空, 请设置");
        }
    }

    private byte[] getByte(String str) {
        return hexStringToBytes(str);
    }

    private byte[] hexStringToBytes(String str) {
        if (str == null || str.equals("")) {
            return null;
        }
        String upperCase = str.toUpperCase();
        int length = upperCase.length() / 2;
        char[] charArray = upperCase.toCharArray();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (charToByte(charArray[i2 + 1]) | (charToByte(charArray[i2]) << 4));
        }
        return bArr;
    }

    private void loadPublicKey(String str) {
        try {
            this.publicKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
        } catch (Exception unused) {
        }
    }

    public String deCodeKey(String str) {
        try {
            loadPublicKey("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAy+ZF2XdZ6RwK/lAtyC7h\rLA4KaURXrD7gEGcx+t/l8KKLTLfR3j4vOHXHXjixipSXicyJcDH74rfO7ISnFkWQ\r+kVmB5kfhdrq5z6D/h/q7ko7MdU9SUlfZfAxwnS4VJY4xWoFWG9ZAoh5ZHJcloDU\rol0qYTUX/yWNiHkoUtnU+SP+ZJjODpqcYuVdLxlA0YelafeBc3SCeuEcPH9lIiRZ\rw0I91wQvPq7gM7/6qnMEdzm7nJdCIni83INl2bh3gW5UBwFBpNrI/fZkgDA4aVGV\rpplEP9bChkCpq2e1T9gw0ODuEVmgVaSvdwHLMYcGn+nYjWDYy16b6ImdkubF8q5l\rhwIDAQAB\r");
            return new String(decrypt(this.publicKey, getByte(str)));
        } catch (Exception unused) {
            return "";
        }
    }
}
