package kc2;

import androidx.exifinterface.media.ExifInterface;
import java.io.Serializable;
import java.util.Arrays;
import nc2.C47222a;

/* renamed from: kc2.a */
public final class C46686a implements Serializable {

    /* renamed from: d */
    public byte[] f125688d;

    public C46686a(byte[] bArr) {
        this.f125688d = (byte[]) bArr.clone();
        mo71937a();
    }

    /* renamed from: a */
    public final void mo71937a() {
        byte[] bArr = this.f125688d;
        if (bArr.length < 4) {
            throw new IllegalArgumentException("apdu must be at least 4 bytes long");
        } else if (bArr.length != 4) {
            byte b = bArr[4] & ExifInterface.MARKER;
            if (bArr.length != 5) {
                if (b != 0) {
                    if (bArr.length != b + 5) {
                        if (bArr.length == b + 6) {
                            byte b2 = bArr[bArr.length - 1];
                            return;
                        }
                        throw new IllegalArgumentException("Invalid APDU: length=" + this.f125688d.length + ", b1=" + b);
                    }
                } else if (bArr.length >= 7) {
                    byte b3 = ((bArr[5] & ExifInterface.MARKER) << 8) | (bArr[6] & ExifInterface.MARKER);
                    if (bArr.length != 7) {
                        if (b3 == 0) {
                            throw new IllegalArgumentException("Invalid APDU: length=" + this.f125688d.length + ", b1=" + b + ", b2||b3=" + b3);
                        } else if (bArr.length != b3 + 7) {
                            if (bArr.length == b3 + 9) {
                                int length = bArr.length - 2;
                                byte b4 = bArr[length];
                                byte b5 = bArr[length + 1];
                                return;
                            }
                            throw new IllegalArgumentException("Invalid APDU: length=" + this.f125688d.length + ", b1=" + b + ", b2||b3=" + b3);
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Invalid APDU: length=" + this.f125688d.length + ", b1=" + b);
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46686a)) {
            return false;
        }
        return Arrays.equals(this.f125688d, ((C46686a) obj).f125688d);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f125688d);
    }

    public String toString() {
        return C47222a.m52527a(this.f125688d);
    }

    public C46686a(String str) {
        this.f125688d = C47222a.m52528b(str);
        mo71937a();
    }
}
