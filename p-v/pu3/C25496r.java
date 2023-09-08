package pu3;

import androidx.exifinterface.media.ExifInterface;
import java.io.UTFDataFormatException;
import ru3.C26116a;

/* renamed from: pu3.r */
public final class C25496r {
    /* renamed from: a */
    public static String m32921a(C26116a aVar, char[] cArr) {
        int i;
        int i2 = 0;
        while (true) {
            char readByte = (char) (aVar.readByte() & ExifInterface.MARKER);
            if (readByte == 0) {
                return new String(cArr, 0, i2);
            }
            cArr[i2] = readByte;
            if (readByte < 128) {
                i2++;
            } else {
                if ((readByte & 224) == 192) {
                    byte readByte2 = aVar.readByte() & ExifInterface.MARKER;
                    if ((readByte2 & 192) == 128) {
                        i = i2 + 1;
                        cArr[i2] = (char) (((readByte & 31) << 6) | (readByte2 & 63));
                    } else {
                        throw new UTFDataFormatException("bad second byte");
                    }
                } else if ((readByte & 240) == 224) {
                    byte readByte3 = aVar.readByte() & ExifInterface.MARKER;
                    byte readByte4 = aVar.readByte() & ExifInterface.MARKER;
                    if ((readByte3 & 192) == 128 && (readByte4 & 192) == 128) {
                        i = i2 + 1;
                        cArr[i2] = (char) (((readByte & 15) << 12) | ((readByte3 & 63) << 6) | (readByte4 & 63));
                    }
                } else {
                    throw new UTFDataFormatException("bad byte");
                }
                i2 = i;
            }
        }
        throw new UTFDataFormatException("bad second or third byte");
    }
}
