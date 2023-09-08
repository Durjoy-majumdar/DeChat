package vu3;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.util.zip.GZIPInputStream;

/* renamed from: vu3.a */
public class C90873a {
    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static int m113986a(RandomAccessFile randomAccessFile, File file, File file2, int i) {
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
        FileInputStream fileInputStream = new FileInputStream(file4);
        try {
            C90874b.m113987a(fileInputStream, bArr, 0, length);
            fileInputStream.close();
            int length2 = (int) randomAccessFile.length();
            if (length2 <= 0) {
                return 3;
            }
            if (length > 0) {
                DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr, 0, length));
                dataInputStream.skip(8);
                long readLong = dataInputStream.readLong();
                long readLong2 = dataInputStream.readLong();
                int readLong3 = (int) dataInputStream.readLong();
                dataInputStream.close();
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, 0, length);
                byteArrayInputStream.skip(32);
                DataInputStream dataInputStream2 = new DataInputStream(new GZIPInputStream(byteArrayInputStream));
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr, 0, length);
                int i2 = length2;
                int i3 = readLong3;
                byteArrayInputStream2.skip(readLong + 32);
                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream2);
                ByteArrayInputStream byteArrayInputStream3 = new ByteArrayInputStream(bArr, 0, length);
                byteArrayInputStream3.skip(readLong2 + readLong + 32);
                GZIPInputStream gZIPInputStream2 = new GZIPInputStream(byteArrayInputStream3);
                FileOutputStream fileOutputStream = new FileOutputStream(file3);
                try {
                    int[] iArr = new int[3];
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < i3) {
                        for (int i6 = 0; i6 <= 2; i6++) {
                            iArr[i6] = dataInputStream2.readInt();
                        }
                        int i7 = iArr[0];
                        if (i4 + i7 > i3) {
                            fileOutputStream.close();
                        } else {
                            byte[] bArr2 = new byte[i7];
                            if (!C90874b.m113987a(gZIPInputStream, bArr2, 0, i7)) {
                                fileOutputStream.close();
                            } else {
                                int i8 = iArr[0];
                                byte[] bArr3 = new byte[i8];
                                if (randomAccessFile2.read(bArr3, 0, i8) < iArr[0]) {
                                    fileOutputStream.close();
                                } else {
                                    int i9 = 0;
                                    while (i9 < iArr[0]) {
                                        int i15 = i5 + i9;
                                        int i16 = i2;
                                        if (i15 >= 0 && i15 < i16) {
                                            bArr2[i9] = (byte) (bArr2[i9] + bArr3[i9]);
                                        }
                                        i9++;
                                        i2 = i16;
                                    }
                                    int i17 = i2;
                                    fileOutputStream.write(bArr2);
                                    int i18 = iArr[0];
                                    int i19 = i4 + i18;
                                    int i25 = i5 + i18;
                                    int i26 = iArr[1];
                                    if (i19 + i26 > i3) {
                                        fileOutputStream.close();
                                    } else {
                                        byte[] bArr4 = new byte[i26];
                                        if (!C90874b.m113987a(gZIPInputStream2, bArr4, 0, i26)) {
                                            fileOutputStream.close();
                                        } else {
                                            fileOutputStream.write(bArr4);
                                            fileOutputStream.flush();
                                            i4 = i19 + iArr[1];
                                            i5 = i25 + iArr[2];
                                            randomAccessFile2.seek((long) i5);
                                            i2 = i17;
                                        }
                                    }
                                }
                            }
                        }
                        randomAccessFile.close();
                        fileOutputStream.close();
                    }
                    dataInputStream2.close();
                    gZIPInputStream.close();
                    gZIPInputStream2.close();
                    randomAccessFile.close();
                    fileOutputStream.close();
                    return 1;
                } catch (Throwable th) {
                    randomAccessFile.close();
                    fileOutputStream.close();
                    throw th;
                }
            }
            return 2;
        } catch (Throwable th4) {
            Throwable th5 = th4;
            fileInputStream.close();
            throw th5;
        }
    }
}
