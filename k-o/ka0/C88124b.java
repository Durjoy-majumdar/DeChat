package ka0;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: ka0.b */
public class C88124b {
    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static int m109722a(File file, File file2, File file3, int i) {
        int i2;
        File file4 = file;
        File file5 = file2;
        File file6 = file3;
        if (file4 == null || file.length() <= 0) {
            return 3;
        }
        if (file5 == null) {
            return 4;
        }
        if (file6 == null || file3.length() <= 0) {
            return 2;
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file4));
        int length = (int) file3.length();
        byte[] bArr = new byte[length];
        FileInputStream fileInputStream = new FileInputStream(file6);
        try {
            C88123a.m109721c(fileInputStream, bArr, 0, length);
            fileInputStream.close();
            int length2 = (int) file.length();
            byte[] bArr2 = new byte[length2];
            C88123a.m109721c(bufferedInputStream, bArr2, 0, length2);
            bufferedInputStream.close();
            if (length < 32) {
                throw new IOException("Header.len < 32");
            } else if (bArr[0] == 66 && bArr[1] == 83 && bArr[2] == 68 && bArr[3] == 73 && bArr[4] == 70 && bArr[5] == 70 && bArr[6] == 52 && bArr[7] == 48) {
                long a = C88123a.m109719a(bArr, 8);
                long a2 = C88123a.m109719a(bArr, 16);
                long a3 = C88123a.m109719a(bArr, 24);
                if (a < 0 || a2 < 0 || a3 < 0) {
                    throw new IOException("Invalid header lengths");
                }
                InputStream b = C88123a.m109720b(bArr, 32, a);
                long j = a + 32;
                InputStream b2 = C88123a.m109720b(bArr, j, a2);
                InputStream b3 = C88123a.m109720b(bArr, j + a2, -1);
                int[] iArr = new int[3];
                byte[] bArr3 = new byte[8];
                byte[] bArr4 = new byte[((int) a3)];
                int i3 = 0;
                int i4 = 0;
                while (((long) i3) < a3) {
                    int i5 = 0;
                    while (i5 <= 2) {
                        long j2 = 0;
                        while (j2 < 8) {
                            int[] iArr2 = iArr;
                            int read = b.read(bArr3, (int) (j2 + 0), (int) (8 - j2));
                            if (read != -1) {
                                j2 += (long) read;
                                File file7 = file2;
                                iArr = iArr2;
                            } else {
                                throw new IOException("Bzip2 EOF");
                            }
                        }
                        int[] iArr3 = iArr;
                        iArr3[i5] = (int) C88123a.m109719a(bArr3, 0);
                        i5++;
                        File file8 = file2;
                        iArr = iArr3;
                    }
                    int[] iArr4 = iArr;
                    int i6 = iArr4[0];
                    int i7 = i6;
                    if (((long) (i3 + i6)) <= a3) {
                        byte[] bArr5 = bArr4;
                        if (C88123a.m109721c(b2, bArr5, i3, i7)) {
                            int i8 = 0;
                            while (true) {
                                i2 = iArr4[0];
                                if (i8 >= i2) {
                                    break;
                                }
                                int i9 = i4 + i8;
                                if (i9 >= 0 && i9 < length2) {
                                    int i15 = i3 + i8;
                                    bArr5[i15] = (byte) (bArr5[i15] + bArr2[i9]);
                                }
                                i8++;
                            }
                            int i16 = i3 + i2;
                            int i17 = i4 + i2;
                            int i18 = iArr4[1];
                            String str = "Corrupt by wrong patch file.";
                            if (((long) (i16 + i18)) > a3) {
                                throw new IOException(str);
                            } else if (C88123a.m109721c(b3, bArr5, i16, i18)) {
                                i3 = i16 + iArr4[1];
                                i4 = i17 + iArr4[2];
                                bArr4 = bArr5;
                                iArr = iArr4;
                                File file9 = file2;
                            } else {
                                throw new IOException(str);
                            }
                        } else {
                            throw new IOException("Corrupt by wrong patch file.");
                        }
                    } else {
                        throw new IOException("Corrupt by wrong patch file.");
                    }
                }
                byte[] bArr6 = bArr4;
                b.close();
                b2.close();
                b3.close();
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    fileOutputStream.write(bArr6);
                    fileOutputStream.close();
                    return 1;
                } catch (Throwable th) {
                    Throwable th4 = th;
                    fileOutputStream.close();
                    throw th4;
                }
            } else {
                throw new IOException("Invalid header signature");
            }
        } catch (Throwable th5) {
            Throwable th6 = th5;
            fileInputStream.close();
            throw th6;
        }
    }
}
