package p380r7;

import android.net.Uri;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p300c8.C79946g;
import p300c8.C79949i;
import p300c8.C79950j;
import p333e8.C20528a;

/* renamed from: r7.a */
public final class C89882a implements C79946g {

    /* renamed from: a */
    public final C79946g f258327a;

    /* renamed from: b */
    public final byte[] f258328b;

    /* renamed from: c */
    public final byte[] f258329c;

    /* renamed from: d */
    public CipherInputStream f258330d;

    public C89882a(C79946g gVar, byte[] bArr, byte[] bArr2) {
        this.f258327a = gVar;
        this.f258328b = bArr;
        this.f258329c = bArr2;
    }

    /* renamed from: b */
    public long mo110126b(C79950j jVar) {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                instance.init(2, new SecretKeySpec(this.f258328b, "AES"), new IvParameterSpec(this.f258329c));
                this.f258330d = new CipherInputStream(new C79949i(this.f258327a, jVar), instance);
                return -1;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: c */
    public int mo110127c(byte[] bArr, int i, int i2) {
        C20528a.m22240d(this.f258330d != null);
        int read = this.f258330d.read(bArr, i, i2);
        if (read < 0) {
            return -1;
        }
        return read;
    }

    public void close() {
        this.f258330d = null;
        this.f258327a.close();
    }

    public Uri getUri() {
        return this.f258327a.getUri();
    }
}
