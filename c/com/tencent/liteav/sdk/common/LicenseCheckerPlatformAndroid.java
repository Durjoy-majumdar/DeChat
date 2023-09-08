package com.tencent.liteav.sdk.common;

import android.util.Base64;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

@JNINamespace("liteav::license")
public class LicenseCheckerPlatformAndroid {
    private static final String ALGORITHM_AES = "AES";
    private static final String ALGORITHM_AES_CBC_PKCS5PADDING = "AES/CBC/PKCS5Padding";
    private static final String ALGORITHM_RSA = "RSA";
    private static final String ALGORITHM_SHA256WITH_RSA = "SHA256WithRSA";
    private static final String TAG = "LicenseCheckerPlatformAndroid";

    public static String decryptLicense(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length == 0 || bArr3 == null || bArr3.length == 0) {
            Log.m97549w(TAG, "decryptLicense: invalid parameter.", new Object[0]);
            return "";
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, ALGORITHM_AES);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        try {
            Cipher instance = Cipher.getInstance(ALGORITHM_AES_CBC_PKCS5PADDING);
            instance.init(2, secretKeySpec, ivParameterSpec);
            return new String(instance.doFinal(Base64.decode(bArr, 0)));
        } catch (Exception unused) {
            return "";
        }
    }

    public static String getPackageFile(String str) {
        InputStream inputStream = null;
        try {
            inputStream = ContextUtils.getApplicationContext().getAssets().open(str);
            byte[] bArr = new byte[inputStream.available()];
            if (inputStream.read(bArr) <= 0) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
                return "";
            }
            inputStream.close();
            String str2 = new String(bArr);
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
            return str2;
        } catch (IOException e) {
            Log.m97549w(TAG, "read asset file failed.", e);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            return "";
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    public static boolean verifyLicense(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length == 0 || bArr3 == null || bArr3.length == 0) {
            Log.m97549w(TAG, "verifyLicense: invalid parameter.", new Object[0]);
            return false;
        }
        try {
            PublicKey generatePublic = KeyFactory.getInstance(ALGORITHM_RSA).generatePublic(new X509EncodedKeySpec(Base64.decode(bArr3, 0)));
            Signature instance = Signature.getInstance(ALGORITHM_SHA256WITH_RSA);
            instance.initVerify(generatePublic);
            instance.update(Base64.decode(bArr, 0));
            return instance.verify(Base64.decode(bArr2, 0));
        } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException unused) {
            return false;
        }
    }
}
