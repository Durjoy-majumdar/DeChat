package com.tencent.midas.comm.log.processor;

import com.tencent.midas.comm.log.util.APBytesUtil;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public class APLogEncryptor {
    private static String ENCRYPT_KEY = "}VjZtoJF;dE+7iJs";
    private static final byte MAGIC_END = 0;
    private static final byte MAGIC_START = 2;
    private static byte PROTOCOL_VERSION = 1;
    private static byte[] header = new byte[7];
    private Cipher encryptCipher = null;

    private static byte[] assembleHeader(int i) {
        System.arraycopy(APBytesUtil.int2bytes(i), 0, header, 3, 4);
        return header;
    }

    public static APLogEncryptor create() {
        APLogEncryptor aPLogEncryptor = new APLogEncryptor();
        aPLogEncryptor.init();
        return aPLogEncryptor;
    }

    private void init() {
        try {
            byte[] bArr = header;
            bArr[0] = 2;
            bArr[1] = PROTOCOL_VERSION;
            SecretKeySpec secretKeySpec = new SecretKeySpec(ENCRYPT_KEY.getBytes(), "AES");
            Cipher instance = Cipher.getInstance("AES/ECB/NoPadding");
            this.encryptCipher = instance;
            instance.init(1, secretKeySpec);
        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException unused) {
        }
    }

    public static void setEncryptKey(String str) {
        ENCRYPT_KEY = str;
    }

    public static void setProtocolVersion(byte b) {
        PROTOCOL_VERSION = b;
    }

    public void close() {
        this.encryptCipher = null;
    }

    public byte[] encrypt(byte[] bArr) {
        int length = bArr.length;
        int i = length % 16;
        if (i != 0) {
            try {
                byte[] bArr2 = new byte[((16 - i) + length)];
                System.arraycopy(bArr, 0, bArr2, 0, length);
                bArr = bArr2;
            } catch (BadPaddingException | IllegalBlockSizeException unused) {
            }
        }
        bArr = this.encryptCipher.doFinal(bArr);
        byte[] assembleHeader = assembleHeader(length);
        int length2 = assembleHeader.length + bArr.length + 1;
        byte[] bArr3 = new byte[length2];
        System.arraycopy(assembleHeader, 0, bArr3, 0, assembleHeader.length);
        System.arraycopy(bArr, 0, bArr3, assembleHeader.length, bArr.length);
        bArr3[length2 - 1] = 0;
        return bArr3;
    }
}
