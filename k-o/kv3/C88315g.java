package kv3;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteOrder;
import java.util.LinkedHashMap;
import java.util.zip.ZipException;

/* renamed from: kv3.g */
public class C88315g implements Closeable {

    /* renamed from: d */
    public final String f255294d;

    /* renamed from: e */
    public final LinkedHashMap<String, C88314f> f255295e = new LinkedHashMap<>();

    /* renamed from: f */
    public File f255296f;

    /* renamed from: g */
    public RandomAccessFile f255297g;

    /* renamed from: h */
    public String f255298h;

    public C88315g(File file, int i) {
        String path = file.getPath();
        this.f255294d = path;
        if (i == 1 || i == 5) {
            if ((i & 4) != 0) {
                this.f255296f = file;
                file.deleteOnExit();
            } else {
                this.f255296f = null;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f255297g = randomAccessFile;
            long length = randomAccessFile.length() - 22;
            long j = 0;
            if (length >= 0) {
                this.f255297g.seek(0);
                if (((long) Integer.reverseBytes(this.f255297g.readInt())) == 67324752) {
                    long j2 = length - 65536;
                    j = j2 >= 0 ? j2 : j;
                    do {
                        this.f255297g.seek(length);
                        if (((long) Integer.reverseBytes(this.f255297g.readInt())) == 101010256) {
                            byte[] bArr = new byte[18];
                            this.f255297g.readFully(bArr);
                            C88311c cVar = new C88311c(bArr, 0, 18, ByteOrder.LITTLE_ENDIAN);
                            short b = cVar.mo122688b() & 65535;
                            short b2 = cVar.mo122688b() & 65535;
                            short b3 = cVar.mo122688b() & 65535;
                            short b4 = cVar.mo122688b() & 65535;
                            cVar.f255280d += 4;
                            long a = ((long) cVar.mo122687a()) & Util.MAX_32BIT_VALUE;
                            int b5 = 65535 & cVar.mo122688b();
                            if (b3 == b4 && b == 0 && b2 == 0) {
                                if (b5 > 0) {
                                    byte[] bArr2 = new byte[b5];
                                    this.f255297g.readFully(bArr2);
                                    this.f255298h = new String(bArr2, 0, b5, C88312d.f255281a);
                                }
                                BufferedInputStream bufferedInputStream = new BufferedInputStream(new C88316a(this.f255297g, a), 4096);
                                byte[] bArr3 = new byte[46];
                                int i2 = 0;
                                while (i2 < b3) {
                                    C88314f fVar = new C88314f(bArr3, bufferedInputStream, C88312d.f255281a, false);
                                    if (fVar.f255292p < a) {
                                        String str = fVar.f255283d;
                                        if (this.f255295e.put(str, fVar) == null) {
                                            i2++;
                                        } else {
                                            throw new ZipException("Duplicate entry name: " + str);
                                        }
                                    } else {
                                        throw new ZipException("Local file header offset is after central directory");
                                    }
                                }
                                return;
                            }
                            throw new ZipException("Spanned archives not supported");
                        }
                        length--;
                    } while (length >= j);
                    throw new ZipException("End Of Central Directory signature not found");
                }
                throw new ZipException("Not a zip archive");
            }
            throw new ZipException("File too short to be a zip file: " + this.f255297g.length());
        }
        throw new IllegalArgumentException("Bad mode: " + i);
    }

    /* renamed from: d */
    public static void m110085d(String str, long j, String str2, long j2, String str3, int i) {
        String hexString = Integer.toHexString(i);
        throw new ZipException("file name:" + str + ", file size" + j + ", entry name:" + str2 + ", entry localHeaderRelOffset:" + j2 + ", " + str3 + " signature not found; was " + hexString);
    }

    /* renamed from: a */
    public final void mo122695a() {
        if (this.f255297g == null) {
            throw new IllegalStateException("Zip file closed");
        }
    }

    /* renamed from: b */
    public C88314f mo122696b(String str) {
        mo122695a();
        if (str != null) {
            C88314f fVar = this.f255295e.get(str);
            if (fVar != null) {
                return fVar;
            }
            LinkedHashMap<String, C88314f> linkedHashMap = this.f255295e;
            return linkedHashMap.get(str + "/");
        }
        throw new NullPointerException("entryName == null");
    }

    /* renamed from: c */
    public InputStream mo122697c(C88314f fVar) {
        C88316a aVar;
        C88314f b = mo122696b(fVar.f255283d);
        if (b == null) {
            return null;
        }
        RandomAccessFile randomAccessFile = this.f255297g;
        synchronized (randomAccessFile) {
            aVar = new C88316a(randomAccessFile, b.f255292p);
            DataInputStream dataInputStream = new DataInputStream(aVar);
            int reverseBytes = Integer.reverseBytes(dataInputStream.readInt());
            if (((long) reverseBytes) == 67324752) {
                dataInputStream.skipBytes(2);
                short reverseBytes2 = Short.reverseBytes(dataInputStream.readShort()) & 65535;
                if ((reverseBytes2 & 1) == 0) {
                    dataInputStream.skipBytes(18);
                    dataInputStream.close();
                    aVar.skip((long) ((Short.reverseBytes(dataInputStream.readShort()) & 65535) + (65535 & Short.reverseBytes(dataInputStream.readShort()))));
                    if (b.f255288i == 0) {
                        aVar.f255300e = aVar.f255301f + b.f255287h;
                    } else {
                        aVar.f255300e = aVar.f255301f + b.f255286g;
                    }
                } else {
                    throw new ZipException("Invalid General Purpose Bit Flag: " + reverseBytes2);
                }
            } else {
                m110085d(this.f255294d, randomAccessFile.length(), b.f255283d, b.f255292p, "Local File Header", reverseBytes);
                throw null;
            }
        }
        return aVar;
    }

    public void close() {
        RandomAccessFile randomAccessFile = this.f255297g;
        if (randomAccessFile != null) {
            synchronized (randomAccessFile) {
                this.f255297g = null;
                randomAccessFile.close();
            }
            File file = this.f255296f;
            if (file != null) {
                file.delete();
                this.f255296f = null;
            }
        }
    }

    /* renamed from: kv3.g$a */
    public static class C88316a extends InputStream {

        /* renamed from: d */
        public final RandomAccessFile f255299d;

        /* renamed from: e */
        public long f255300e;

        /* renamed from: f */
        public long f255301f;

        public C88316a(RandomAccessFile randomAccessFile, long j) {
            long length = randomAccessFile.length();
            this.f255299d = randomAccessFile;
            this.f255301f = j;
            this.f255300e = length;
        }

        public int available() {
            return this.f255301f < this.f255300e ? 1 : 0;
        }

        public int read() {
            int i = C88313e.f255282a;
            byte[] bArr = new byte[1];
            if (read(bArr, 0, 1) != -1) {
                return bArr[0] & ExifInterface.MARKER;
            }
            return -1;
        }

        public long skip(long j) {
            long j2 = this.f255300e;
            long j3 = this.f255301f;
            if (j > j2 - j3) {
                j = j2 - j3;
            }
            this.f255301f = j3 + j;
            return j;
        }

        public int read(byte[] bArr, int i, int i2) {
            synchronized (this.f255299d) {
                long j = this.f255300e;
                long j2 = this.f255301f;
                long j3 = j - j2;
                if (((long) i2) > j3) {
                    i2 = (int) j3;
                }
                this.f255299d.seek(j2);
                int read = this.f255299d.read(bArr, i, i2);
                if (read <= 0) {
                    return -1;
                }
                this.f255301f += (long) read;
                return read;
            }
        }
    }
}
