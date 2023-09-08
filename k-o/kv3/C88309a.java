package kv3;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;

/* renamed from: kv3.a */
public class C88309a extends DeflaterOutputStream {

    /* renamed from: v */
    public static final byte[] f255260v = new byte[0];

    /* renamed from: w */
    public static final byte[] f255261w = {0};

    /* renamed from: d */
    public byte[] f255262d = f255260v;

    /* renamed from: e */
    public final HashSet<String> f255263e = new HashSet<>();

    /* renamed from: f */
    public int f255264f = 8;

    /* renamed from: g */
    public int f255265g = -1;

    /* renamed from: h */
    public ByteArrayOutputStream f255266h = new ByteArrayOutputStream();

    /* renamed from: i */
    public ZipEntry f255267i;

    /* renamed from: j */
    public final CRC32 f255268j = new CRC32();

    /* renamed from: n */
    public long f255269n = 0;

    /* renamed from: o */
    public int f255270o = 0;

    /* renamed from: p */
    public int f255271p;

    /* renamed from: q */
    public byte[] f255272q;

    /* renamed from: r */
    public boolean f255273r = false;

    /* renamed from: s */
    public boolean f255274s = false;

    /* renamed from: t */
    public final int f255275t = 4;

    /* renamed from: u */
    public int f255276u = 0;

    public C88309a(OutputStream outputStream) {
        super(outputStream, new Deflater(-1, true));
    }

    /* renamed from: a */
    public void mo122679a() {
        int i;
        if (!this.f255274s) {
            ZipEntry zipEntry = this.f255267i;
            if (zipEntry != null) {
                if (zipEntry.getMethod() == 8) {
                    super.finish();
                }
                if (this.f255267i.getMethod() == 0) {
                    if (this.f255268j.getValue() != this.f255267i.getCrc()) {
                        throw new ZipException("CRC mismatch");
                    } else if (this.f255267i.getSize() != this.f255269n) {
                        throw new ZipException("Size mismatch");
                    }
                }
                int i2 = 30;
                if (this.f255267i.getMethod() != 0) {
                    i2 = 46;
                    mo122681c(this.out, 134695760);
                    this.f255267i.setCrc(this.f255268j.getValue());
                    mo122681c(this.out, this.f255267i.getCrc());
                    this.f255267i.setCompressedSize((long) this.def.getTotalOut());
                    mo122681c(this.out, this.f255267i.getCompressedSize());
                    this.f255267i.setSize((long) this.def.getTotalIn());
                    mo122681c(this.out, this.f255267i.getSize());
                }
                int i3 = this.f255267i.getMethod() == 0 ? 0 : 8;
                mo122681c(this.f255266h, 33639248);
                mo122683d(this.f255266h, 20);
                mo122683d(this.f255266h, 20);
                mo122683d(this.f255266h, i3 | 2048);
                mo122683d(this.f255266h, this.f255267i.getMethod());
                mo122683d(this.f255266h, 0);
                mo122683d(this.f255266h, 33);
                mo122681c(this.f255266h, this.f255268j.getValue());
                if (this.f255267i.getMethod() == 8) {
                    ByteArrayOutputStream byteArrayOutputStream = this.f255266h;
                    long totalOut = (long) this.def.getTotalOut();
                    mo122681c(byteArrayOutputStream, totalOut);
                    i = (int) (((long) i2) + totalOut);
                    mo122681c(this.f255266h, (long) this.def.getTotalIn());
                } else {
                    ByteArrayOutputStream byteArrayOutputStream2 = this.f255266h;
                    long j = this.f255269n;
                    mo122681c(byteArrayOutputStream2, j);
                    i = (int) (((long) i2) + j);
                    mo122681c(this.f255266h, this.f255269n);
                }
                ByteArrayOutputStream byteArrayOutputStream3 = this.f255266h;
                int i4 = this.f255271p;
                mo122683d(byteArrayOutputStream3, i4);
                int i5 = i + i4;
                if (this.f255267i.getExtra() != null) {
                    ByteArrayOutputStream byteArrayOutputStream4 = this.f255266h;
                    int length = this.f255267i.getExtra().length;
                    mo122683d(byteArrayOutputStream4, length);
                    i5 += length;
                } else {
                    mo122683d(this.f255266h, 0);
                }
                String comment = this.f255267i.getComment();
                byte[] bArr = f255260v;
                if (comment != null) {
                    bArr = comment.getBytes(Charset.forName("UTF-8"));
                }
                mo122683d(this.f255266h, bArr.length);
                mo122683d(this.f255266h, 0);
                mo122683d(this.f255266h, 0);
                mo122681c(this.f255266h, 0);
                mo122681c(this.f255266h, (long) this.f255270o);
                this.f255266h.write(this.f255272q);
                this.f255272q = null;
                if (this.f255267i.getExtra() != null) {
                    this.f255266h.write(this.f255267i.getExtra());
                }
                this.f255270o += i5 + this.f255276u;
                this.f255276u = 0;
                if (bArr.length > 0) {
                    this.f255266h.write(bArr);
                }
                this.f255267i = null;
                this.f255268j.reset();
                this.f255269n = 0;
                this.def.reset();
                return;
            }
            return;
        }
        throw new IOException("Stream is closed");
    }

    /* renamed from: b */
    public void mo122680b(ZipEntry zipEntry) {
        int i;
        if (this.f255267i != null) {
            mo122679a();
        }
        int method = zipEntry.getMethod();
        if (method == -1) {
            method = this.f255264f;
        }
        if (method == 0) {
            if (zipEntry.getCompressedSize() == -1) {
                zipEntry.setCompressedSize(zipEntry.getSize());
            } else if (zipEntry.getSize() == -1) {
                zipEntry.setSize(zipEntry.getCompressedSize());
            }
            if (zipEntry.getCrc() == -1) {
                throw new ZipException("STORED entry missing CRC");
            } else if (zipEntry.getSize() == -1) {
                throw new ZipException("STORED entry missing size");
            } else if (zipEntry.getSize() != zipEntry.getCompressedSize()) {
                throw new ZipException("STORED entry size/compressed size mismatch");
            }
        }
        if (this.f255274s) {
            throw new IOException("Stream is closed");
        } else if (this.f255263e.contains(zipEntry.getName())) {
            throw new ZipException("Entry already exists: " + zipEntry.getName());
        } else if (this.f255263e.size() != 65535) {
            byte[] bytes = zipEntry.getName().getBytes(Charset.forName("UTF-8"));
            this.f255272q = bytes;
            int length = bytes.length;
            this.f255271p = length;
            if (length <= 65535) {
                this.def.setLevel(this.f255265g);
                zipEntry.setMethod(method);
                this.f255267i = zipEntry;
                this.f255263e.add(zipEntry.getName());
                int i2 = method == 0 ? 0 : 8;
                mo122681c(this.out, 67324752);
                mo122683d(this.out, 20);
                mo122683d(this.out, i2 | 2048);
                mo122683d(this.out, method);
                if (this.f255267i.getTime() == -1) {
                    this.f255267i.setTime(System.currentTimeMillis());
                }
                mo122683d(this.out, 0);
                mo122683d(this.out, 33);
                if (method == 0) {
                    mo122681c(this.out, this.f255267i.getCrc());
                    mo122681c(this.out, this.f255267i.getSize());
                    mo122681c(this.out, this.f255267i.getSize());
                } else {
                    mo122681c(this.out, 0);
                    mo122681c(this.out, 0);
                    mo122681c(this.out, 0);
                }
                mo122683d(this.out, this.f255271p);
                this.f255276u = (this.f255267i.getMethod() != 0 || (i = this.f255275t) == 0) ? 0 : (i - ((((this.f255270o + 30) + this.f255271p) + (this.f255267i.getExtra() != null ? this.f255267i.getExtra().length : 0)) % i)) % i;
                if (this.f255267i.getExtra() != null) {
                    mo122683d(this.out, this.f255267i.getExtra().length + this.f255276u);
                } else {
                    mo122683d(this.out, this.f255276u);
                }
                this.out.write(this.f255272q);
                if (this.f255267i.getExtra() != null) {
                    this.out.write(this.f255267i.getExtra());
                }
                OutputStream outputStream = this.out;
                int i3 = this.f255276u;
                if (i3 > 0) {
                    while (true) {
                        int i4 = i3 - 1;
                        if (i3 > 0) {
                            outputStream.write(0);
                            i3 = i4;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException("Name too long: " + this.f255271p + " UTF-8 bytes");
            }
        } else {
            throw new ZipException("Too many entries for the zip file format's 16-bit entry count");
        }
    }

    /* renamed from: c */
    public final long mo122681c(OutputStream outputStream, long j) {
        outputStream.write((int) (255 & j));
        outputStream.write(((int) (j >> 8)) & 255);
        outputStream.write(((int) (j >> 16)) & 255);
        outputStream.write(((int) (j >> 24)) & 255);
        return j;
    }

    public void close() {
        if (!this.f255274s) {
            finish();
            this.def.end();
            this.out.close();
            this.out = null;
            this.f255274s = true;
        }
    }

    /* renamed from: d */
    public final int mo122683d(OutputStream outputStream, int i) {
        if (i <= 65535) {
            outputStream.write(i & 255);
            outputStream.write((i >> 8) & 255);
            return i;
        }
        throw new IllegalArgumentException("value " + i + " is too large for type 'short'.");
    }

    public void finish() {
        if (this.f255274s) {
            throw new IOException("Stream is closed");
        } else if (!this.f255273r) {
            if (!this.f255263e.isEmpty()) {
                if (this.f255267i != null) {
                    mo122679a();
                }
                int size = this.f255266h.size();
                mo122681c(this.f255266h, 101010256);
                mo122683d(this.f255266h, 0);
                mo122683d(this.f255266h, 0);
                mo122683d(this.f255266h, this.f255263e.size());
                mo122683d(this.f255266h, this.f255263e.size());
                mo122681c(this.f255266h, (long) size);
                mo122681c(this.f255266h, (long) (this.f255270o + this.f255276u));
                mo122683d(this.f255266h, this.f255262d.length);
                byte[] bArr = this.f255262d;
                if (bArr.length > 0) {
                    this.f255266h.write(bArr);
                }
                this.f255266h.writeTo(this.out);
                this.f255266h = null;
                this.f255273r = true;
                return;
            }
            throw new ZipException("No entries");
        }
    }

    public void write(int i) {
        byte[] bArr = f255261w;
        bArr[0] = (byte) (i & 255);
        write(bArr, 0, 1);
    }

    public void write(byte[] bArr, int i, int i2) {
        int length = bArr.length;
        if ((i | i2) < 0 || i > length || length - i < i2) {
            throw new ArrayIndexOutOfBoundsException("length=" + length + "; regionStart=" + i + "; regionLength=" + i2);
        }
        ZipEntry zipEntry = this.f255267i;
        if (zipEntry != null) {
            if (zipEntry.getMethod() == 0) {
                this.out.write(bArr, i, i2);
            } else {
                super.write(bArr, i, i2);
            }
            this.f255268j.update(bArr, i, i2);
            this.f255269n += (long) i2;
            return;
        }
        throw new ZipException("No active entry");
    }
}
