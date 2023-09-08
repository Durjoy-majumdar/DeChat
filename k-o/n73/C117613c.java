package n73;

import a70.C112760b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.File;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: n73.c */
public class C117613c extends C47188b {

    /* renamed from: a */
    public byte[] f351839a;

    /* renamed from: b */
    public byte[] f351840b;

    /* renamed from: c */
    public byte[] f351841c;

    /* renamed from: a */
    public List<Integer> mo11243a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(10001);
        arrayList.add(10002);
        return arrayList;
    }

    /* renamed from: b */
    public byte[] mo11244b(int i, byte[] bArr) {
        boolean z = false;
        if (i == 10001) {
            Log.m105924i("MicroMsg.Wear.HttpAuthServer", "request public key");
            if (this.f351840b == null || this.f351839a == null || this.f351841c == null) {
                Log.m105924i("MicroMsg.Wear.HttpAuthServer", "try to reload all key");
                try {
                    mo182333g();
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.Wear.HttpAuthServer", e, "loadAllKey", new Object[0]);
                }
            }
            Object[] objArr = new Object[3];
            objArr[0] = Boolean.valueOf(this.f351840b != null);
            objArr[1] = Boolean.valueOf(this.f351839a != null);
            if (this.f351841c != null) {
                z = true;
            }
            objArr[2] = Boolean.valueOf(z);
            Log.m105925i("MicroMsg.Wear.HttpAuthServer", "publicKey %s privateKey %s sessionKey %s", objArr);
            return this.f351840b;
        } else if (i != 10002) {
            return null;
        } else {
            try {
                PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(this.f351839a);
                KeyFactory instance = KeyFactory.getInstance("RSA");
                PrivateKey generatePrivate = instance.generatePrivate(pKCS8EncodedKeySpec);
                Cipher instance2 = Cipher.getInstance(instance.getAlgorithm());
                instance2.init(2, generatePrivate);
                byte[] doFinal = instance2.doFinal(bArr);
                byte[] bArr2 = this.f351841c;
                SecretKeySpec secretKeySpec = new SecretKeySpec(doFinal, "AES");
                Cipher instance3 = Cipher.getInstance("AES/ECB/PKCS5Padding");
                instance3.init(1, secretKeySpec);
                byte[] doFinal2 = instance3.doFinal(bArr2);
                Log.m105925i("MicroMsg.Wear.HttpAuthServer", "funid %d, randomKey=%s", Integer.valueOf(i), MD5Util.getMD5String(doFinal));
                return doFinal2;
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.Wear.HttpAuthServer", e2, "sessionKey resp error", new Object[0]);
                return null;
            }
        }
    }

    /* renamed from: f */
    public byte[] mo182332f() {
        if (this.f351840b == null || this.f351839a == null || this.f351841c == null) {
            Log.m105924i("MicroMsg.Wear.HttpAuthServer", "try to reload all key");
            boolean z = false;
            try {
                mo182333g();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Wear.HttpAuthServer", e, "loadAllKey", new Object[0]);
            }
            Object[] objArr = new Object[3];
            objArr[0] = Boolean.valueOf(this.f351840b != null);
            objArr[1] = Boolean.valueOf(this.f351839a != null);
            if (this.f351841c != null) {
                z = true;
            }
            objArr[2] = Boolean.valueOf(z);
            Log.m105925i("MicroMsg.Wear.HttpAuthServer", "publicKey %s privateKey %s sessionKey %s", objArr);
        }
        return this.f351841c;
    }

    /* renamed from: g */
    public void mo182333g() {
        byte[] bArr;
        File file = new File(C112760b.m154231g(), "wear/key");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, "private.key");
        File file3 = new File(file, "public.key");
        File file4 = new File(file, "session.key");
        if (!file2.exists() || !file3.exists() || !file4.exists()) {
            Log.m105924i("MicroMsg.Wear.HttpAuthServer", "recreate keys");
            file2.delete();
            file3.delete();
            file4.delete();
            KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA");
            instance.initialize(1024);
            KeyPair generateKeyPair = instance.generateKeyPair();
            HashMap hashMap = new HashMap(2);
            hashMap.put("RSAPublicKey", (RSAPublicKey) generateKeyPair.getPublic());
            hashMap.put("RSAPrivateKey", (RSAPrivateKey) generateKeyPair.getPrivate());
            this.f351840b = ((RSAPublicKey) hashMap.get("RSAPublicKey")).getEncoded();
            this.f351839a = ((RSAPrivateKey) hashMap.get("RSAPrivateKey")).getEncoded();
            try {
                KeyGenerator instance2 = KeyGenerator.getInstance("AES");
                instance2.init(128);
                bArr = instance2.generateKey().getEncoded();
            } catch (NoSuchAlgorithmException unused) {
                bArr = null;
            }
            this.f351841c = bArr;
            String absolutePath = file2.getAbsolutePath();
            byte[] bArr2 = this.f351839a;
            C86013q1.m106438T(absolutePath, bArr2, 0, bArr2.length);
            String absolutePath2 = file3.getAbsolutePath();
            byte[] bArr3 = this.f351840b;
            C86013q1.m106438T(absolutePath2, bArr3, 0, bArr3.length);
            String absolutePath3 = file4.getAbsolutePath();
            byte[] bArr4 = this.f351841c;
            C86013q1.m106438T(absolutePath3, bArr4, 0, bArr4.length);
        } else {
            Log.m105924i("MicroMsg.Wear.HttpAuthServer", "use old keys");
            this.f351840b = C86013q1.m106433O(file3.getAbsolutePath(), 0, Integer.MAX_VALUE);
            this.f351839a = C86013q1.m106433O(file2.getAbsolutePath(), 0, Integer.MAX_VALUE);
            this.f351841c = C86013q1.m106433O(file4.getAbsolutePath(), 0, Integer.MAX_VALUE);
        }
        Log.m105925i("MicroMsg.Wear.HttpAuthServer", "publicKey=%s privateKey=%s sessionKey=%s", MD5Util.getMD5String(this.f351840b), MD5Util.getMD5String(this.f351839a), MD5Util.getMD5String(this.f351841c));
    }
}
