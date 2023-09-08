package cv3;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import vu3.C90874b;

/* renamed from: cv3.b */
public class C86145b extends C86144a {
    /* renamed from: a */
    public int mo120560a(InputStream inputStream, InputStream inputStream2, File file) {
        int i;
        InputStream inputStream3 = inputStream;
        InputStream inputStream4 = inputStream2;
        File file2 = file;
        if (inputStream3 == null) {
            return 3;
        }
        if (file2 == null) {
            return 4;
        }
        if (inputStream4 == null) {
            return 2;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream3.read(bArr, 0, 8192);
            if (read == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        byte[] bArr2 = new byte[8192];
        while (true) {
            int read2 = inputStream4.read(bArr2, 0, 8192);
            if (read2 == -1) {
                break;
            }
            byteArrayOutputStream2.write(bArr2, 0, read2);
        }
        byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
        int length = byteArray.length;
        int length2 = byteArray2.length;
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(byteArray2, 0, length2));
        dataInputStream.skip(8);
        long readLong = dataInputStream.readLong();
        long readLong2 = dataInputStream.readLong();
        int readLong3 = (int) dataInputStream.readLong();
        dataInputStream.close();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray2, 0, length2);
        int i2 = length;
        byteArrayInputStream.skip(32);
        DataInputStream dataInputStream2 = new DataInputStream(new GZIPInputStream(byteArrayInputStream));
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(byteArray2, 0, length2);
        byteArrayInputStream2.skip(readLong + 32);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream2);
        ByteArrayInputStream byteArrayInputStream3 = new ByteArrayInputStream(byteArray2, 0, length2);
        byteArrayInputStream3.skip(readLong2 + readLong + 32);
        GZIPInputStream gZIPInputStream2 = new GZIPInputStream(byteArrayInputStream3);
        byte[] bArr3 = new byte[readLong3];
        int[] iArr = new int[3];
        int i3 = 0;
        int i4 = 0;
        while (i3 < readLong3) {
            for (int i5 = 0; i5 <= 2; i5++) {
                iArr[i5] = dataInputStream2.readInt();
            }
            int i6 = iArr[0];
            if (i3 + i6 > readLong3) {
                throw new IOException("Corrupt by wrong patch file.");
            } else if (C90874b.m113987a(gZIPInputStream, bArr3, i3, i6)) {
                int i7 = 0;
                while (true) {
                    i = iArr[0];
                    if (i7 >= i) {
                        break;
                    }
                    int i8 = i4 + i7;
                    int i9 = i2;
                    if (i8 >= 0 && i8 < i9) {
                        int i15 = i3 + i7;
                        bArr3[i15] = (byte) (bArr3[i15] + byteArray[i8]);
                    }
                    i7++;
                    i2 = i9;
                }
                int i16 = i2;
                int i17 = i3 + i;
                int i18 = i4 + i;
                int i19 = iArr[1];
                if (i17 + i19 > readLong3) {
                    throw new IOException("Corrupt by wrong patch file.");
                } else if (C90874b.m113987a(gZIPInputStream2, bArr3, i17, i19)) {
                    i3 = i17 + iArr[1];
                    i4 = i18 + iArr[2];
                    i2 = i16;
                } else {
                    throw new IOException("Corrupt by wrong patch file.");
                }
            } else {
                throw new IOException("Corrupt by wrong patch file.");
            }
        }
        dataInputStream2.close();
        gZIPInputStream.close();
        gZIPInputStream2.close();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr3);
            fileOutputStream.close();
            return 1;
        } catch (Throwable th) {
            Throwable th4 = th;
            fileOutputStream.close();
            throw th4;
        }
    }
}
