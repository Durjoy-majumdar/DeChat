package p1054vg;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.util.zip.GZIPInputStream;

/* renamed from: vg.d */
public class C90799d {
    /* renamed from: a */
    public static int m113871a(RandomAccessFile randomAccessFile, File file, File file2, int i) {
        RandomAccessFile randomAccessFile2 = randomAccessFile;
        File file3 = file;
        File file4 = file2;
        if (randomAccessFile2 == null || randomAccessFile.length() <= 0) {
            return 3;
        }
        if (file3 == null) {
            return 4;
        }
        if (file4 == null || file2.length() <= 0) {
            return 2;
        }
        int length = (int) file2.length();
        byte[] bArr = new byte[length];
        C90800e.m113872a(new FileInputStream(file4), bArr, 0, length);
        int length2 = (int) randomAccessFile.length();
        if (length2 > 0) {
            if (length > 0) {
                int i2 = (length2 - i) - 2;
                if (i2 > 2) {
                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr, 0, length));
                    dataInputStream.skip(8);
                    long readLong = dataInputStream.readLong();
                    long readLong2 = dataInputStream.readLong();
                    int i3 = length2;
                    int readLong3 = (int) dataInputStream.readLong();
                    dataInputStream.close();
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, 0, length);
                    byteArrayInputStream.skip(32);
                    DataInputStream dataInputStream2 = new DataInputStream(new GZIPInputStream(byteArrayInputStream));
                    ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr, 0, length);
                    int i4 = i2;
                    DataInputStream dataInputStream3 = dataInputStream2;
                    byteArrayInputStream2.skip(readLong + 32);
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream2);
                    ByteArrayInputStream byteArrayInputStream3 = new ByteArrayInputStream(bArr, 0, length);
                    byteArrayInputStream3.skip(readLong2 + readLong + 32);
                    GZIPInputStream gZIPInputStream2 = new GZIPInputStream(byteArrayInputStream3);
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    int[] iArr = new int[3];
                    int i5 = 0;
                    int i6 = 0;
                    while (i5 < readLong3) {
                        for (int i7 = 0; i7 <= 2; i7++) {
                            iArr[i7] = dataInputStream3.readInt();
                        }
                        int i8 = iArr[0];
                        if (i5 + i8 > readLong3) {
                            fileOutputStream.close();
                        } else {
                            byte[] bArr2 = new byte[i8];
                            if (!C90800e.m113872a(gZIPInputStream, bArr2, 0, i8)) {
                                fileOutputStream.close();
                            } else {
                                int i9 = iArr[0];
                                byte[] bArr3 = new byte[i9];
                                if (randomAccessFile2.read(bArr3, 0, i9) < iArr[0]) {
                                    fileOutputStream.close();
                                } else {
                                    int i15 = 0;
                                    while (i15 < iArr[0]) {
                                        int i16 = i6 + i15;
                                        int i17 = i4;
                                        if (i16 == i17) {
                                            bArr3[i15] = 0;
                                            bArr3[i15 + 1] = 0;
                                        }
                                        int i18 = i3;
                                        if (i16 >= 0 && i16 < i18) {
                                            bArr2[i15] = (byte) (bArr2[i15] + bArr3[i15]);
                                        }
                                        i15++;
                                        i4 = i17;
                                        i3 = i18;
                                    }
                                    int i19 = i3;
                                    int i25 = i4;
                                    fileOutputStream.write(bArr2);
                                    int i26 = iArr[0];
                                    int i27 = i5 + i26;
                                    int i28 = i6 + i26;
                                    int i29 = iArr[1];
                                    if (i27 + i29 > readLong3) {
                                        fileOutputStream.close();
                                    } else {
                                        byte[] bArr4 = new byte[i29];
                                        if (!C90800e.m113872a(gZIPInputStream2, bArr4, 0, i29)) {
                                            fileOutputStream.close();
                                        } else {
                                            fileOutputStream.write(bArr4);
                                            fileOutputStream.flush();
                                            i5 = i27 + iArr[1];
                                            i6 = i28 + iArr[2];
                                            randomAccessFile2.seek((long) i6);
                                            i4 = i25;
                                            i3 = i19;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    dataInputStream3.close();
                    gZIPInputStream.close();
                    gZIPInputStream2.close();
                    randomAccessFile.close();
                    fileOutputStream.close();
                    return 1;
                }
            }
            return 2;
        }
        return 3;
    }
}
