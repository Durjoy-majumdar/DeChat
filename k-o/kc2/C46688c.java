package kc2;

import androidx.exifinterface.media.ExifInterface;
import java.io.Serializable;
import java.util.Arrays;
import nc2.C47222a;

/* renamed from: kc2.c */
public final class C46688c implements Serializable {

    /* renamed from: d */
    public byte[] f125690d;

    public C46688c(byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = (byte[]) bArr.clone();
            if (bArr2.length >= 2) {
                this.f125690d = bArr2;
                return;
            }
            throw new IllegalArgumentException("apdu must be at least 2 bytes long");
        }
        throw new IllegalArgumentException("apdu is null");
    }

    /* renamed from: a */
    public void mo71941a(C46688c cVar) {
        byte[] bArr = this.f125690d;
        int length = bArr.length;
        this.f125690d = Arrays.copyOf(bArr, (bArr.length + cVar.f125690d.length) - 2);
        int i = length - 2;
        byte[] bArr2 = (byte[]) cVar.f125690d.clone();
        int length2 = bArr2.length;
        int i2 = 0;
        while (i2 < length2) {
            this.f125690d[i] = bArr2[i2];
            i2++;
            i++;
        }
    }

    /* renamed from: b */
    public short mo71942b() {
        byte[] bArr = this.f125690d;
        return (short) (bArr[bArr.length - 2] & ExifInterface.MARKER);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46688c)) {
            return false;
        }
        return Arrays.equals(this.f125690d, ((C46688c) obj).f125690d);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f125690d);
    }

    public String toString() {
        return C47222a.m52527a(this.f125690d);
    }
}
