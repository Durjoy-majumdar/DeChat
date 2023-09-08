package r24;

import androidx.exifinterface.media.ExifInterface;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import q24.C22064a;

/* renamed from: r24.a */
public class C26109a extends C22064a {

    /* renamed from: A */
    public int f72996A;

    /* renamed from: B */
    public int f72997B;

    /* renamed from: C */
    public char f72998C;

    /* renamed from: D */
    public C26110a f72999D;

    /* renamed from: d */
    public int f73000d;

    /* renamed from: e */
    public int f73001e;

    /* renamed from: f */
    public int f73002f;

    /* renamed from: g */
    public boolean f73003g;

    /* renamed from: h */
    public int f73004h;

    /* renamed from: i */
    public int f73005i;

    /* renamed from: j */
    public final C26111b f73006j = new C26111b();

    /* renamed from: n */
    public int f73007n;

    /* renamed from: o */
    public InputStream f73008o;

    /* renamed from: p */
    public int f73009p = -1;

    /* renamed from: q */
    public int f73010q = 1;

    /* renamed from: r */
    public int f73011r;

    /* renamed from: s */
    public int f73012s;

    /* renamed from: t */
    public int f73013t;

    /* renamed from: u */
    public int f73014u;

    /* renamed from: v */
    public int f73015v;

    /* renamed from: w */
    public int f73016w;

    /* renamed from: x */
    public int f73017x;

    /* renamed from: y */
    public int f73018y;

    /* renamed from: z */
    public int f73019z;

    /* renamed from: r24.a$a */
    public static final class C26110a {

        /* renamed from: a */
        public final boolean[] f73020a = new boolean[256];

        /* renamed from: b */
        public final byte[] f73021b = new byte[256];

        /* renamed from: c */
        public final byte[] f73022c = new byte[18002];

        /* renamed from: d */
        public final byte[] f73023d = new byte[18002];

        /* renamed from: e */
        public final int[] f73024e = new int[256];

        /* renamed from: f */
        public final int[][] f73025f;

        /* renamed from: g */
        public final int[][] f73026g;

        /* renamed from: h */
        public final int[][] f73027h;

        /* renamed from: i */
        public final int[] f73028i;

        /* renamed from: j */
        public final int[] f73029j;

        /* renamed from: k */
        public final char[] f73030k;

        /* renamed from: l */
        public final char[][] f73031l;

        /* renamed from: m */
        public final byte[] f73032m;

        /* renamed from: n */
        public int[] f73033n;

        /* renamed from: o */
        public byte[] f73034o;

        public C26110a(int i) {
            Class cls = Integer.TYPE;
            this.f73025f = (int[][]) Array.newInstance(cls, new int[]{6, 258});
            this.f73026g = (int[][]) Array.newInstance(cls, new int[]{6, 258});
            this.f73027h = (int[][]) Array.newInstance(cls, new int[]{6, 258});
            this.f73028i = new int[6];
            this.f73029j = new int[257];
            this.f73030k = new char[256];
            this.f73031l = (char[][]) Array.newInstance(Character.TYPE, new int[]{6, 258});
            this.f73032m = new byte[6];
            this.f73034o = new byte[(i * 100000)];
        }
    }

    public C26109a(InputStream inputStream) {
        this.f73008o = inputStream;
        if (inputStream != null) {
            mo52976d('B', "first");
            mo52976d('Z', "second");
            mo52976d('h', "third");
            int read = this.f73008o.read();
            if (read < 49 || read > 57) {
                throw new IOException("Stream is not BZip2 formatted: illegal blocksize " + ((char) read));
            }
            this.f73002f = read - 48;
            mo52978g();
            mo52980j();
            return;
        }
        throw new IOException("No InputStream");
    }

    /* renamed from: a */
    public final boolean mo52972a() {
        int i = this.f73005i;
        int i2 = this.f73004h;
        if (i < 1) {
            int read = this.f73008o.read();
            if (read >= 0) {
                i2 = (i2 << 8) | read;
                i += 8;
                this.f73004h = i2;
            } else {
                throw new IOException("unexpected end of stream");
            }
        }
        int i3 = i - 1;
        this.f73005i = i3;
        return ((i2 >> i3) & 1) != 0;
    }

    /* renamed from: b */
    public final char mo52973b() {
        return (char) mo52974c(8);
    }

    /* renamed from: c */
    public final int mo52974c(int i) {
        int i2 = this.f73005i;
        int i3 = this.f73004h;
        if (i2 < i) {
            InputStream inputStream = this.f73008o;
            do {
                int read = inputStream.read();
                if (read >= 0) {
                    i3 = (i3 << 8) | read;
                    i2 += 8;
                } else {
                    throw new IOException("unexpected end of stream");
                }
            } while (i2 < i);
            this.f73004h = i3;
        }
        int i4 = i2 - i;
        this.f73005i = i4;
        return ((1 << i) - 1) & (i3 >> i4);
    }

    public void close() {
        InputStream inputStream = this.f73008o;
        if (inputStream != null) {
            try {
                if (inputStream != System.in) {
                    inputStream.close();
                }
            } finally {
                this.f72999D = null;
                this.f73008o = null;
            }
        }
    }

    /* renamed from: d */
    public final void mo52976d(char c, String str) {
        int read = this.f73008o.read();
        if (read != c) {
            throw new IOException("Stream is not BZip2 formatted: expected '" + c + "' as " + str + " byte but got '" + ((char) read) + "'");
        }
    }

    /* renamed from: e */
    public final void mo52977e() {
        int i = ~this.f73006j.f73036a;
        int i2 = this.f73011r;
        if (i2 == i) {
            int i3 = this.f73013t;
            this.f73013t = i ^ ((i3 >>> 31) | (i3 << 1));
            return;
        }
        int i4 = this.f73012s;
        this.f73013t = ((i4 >>> 31) | (i4 << 1)) ^ i2;
        throw new IOException("BZip2 CRC error");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v16, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v17, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v24, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo52978g() {
        /*
            r35 = this;
            r0 = r35
            char r1 = r35.mo52973b()
            char r2 = r35.mo52973b()
            char r3 = r35.mo52973b()
            char r4 = r35.mo52973b()
            char r5 = r35.mo52973b()
            char r6 = r35.mo52973b()
            r7 = 23
            r8 = 8
            r9 = 0
            if (r1 != r7) goto L_0x0060
            r10 = 114(0x72, float:1.6E-43)
            if (r2 != r10) goto L_0x0060
            r10 = 69
            if (r3 != r10) goto L_0x0060
            r10 = 56
            if (r4 != r10) goto L_0x0060
            r10 = 80
            if (r5 != r10) goto L_0x0060
            r10 = 144(0x90, float:2.02E-43)
            if (r6 != r10) goto L_0x0060
            int r1 = r0.mo52974c(r8)
            int r1 = r1 << r8
            int r2 = r0.mo52974c(r8)
            r1 = r1 | r2
            int r1 = r1 << r8
            int r2 = r0.mo52974c(r8)
            r1 = r1 | r2
            int r1 = r1 << r8
            int r2 = r0.mo52974c(r8)
            r1 = r1 | r2
            r0.f73012s = r1
            r0.f73010q = r9
            r2 = 0
            r0.f72999D = r2
            int r2 = r0.f73013t
            if (r1 != r2) goto L_0x0058
            goto L_0x0474
        L_0x0058:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "BZip2 CRC error"
            r1.<init>(r2)
            throw r1
        L_0x0060:
            r10 = 49
            if (r1 != r10) goto L_0x0475
            r1 = 65
            if (r2 != r1) goto L_0x0475
            r1 = 89
            if (r3 != r1) goto L_0x0475
            r2 = 38
            if (r4 != r2) goto L_0x0475
            r2 = 83
            if (r5 != r2) goto L_0x0475
            if (r6 != r1) goto L_0x0475
            int r1 = r0.mo52974c(r8)
            int r1 = r1 << r8
            int r2 = r0.mo52974c(r8)
            r1 = r1 | r2
            int r1 = r1 << r8
            int r2 = r0.mo52974c(r8)
            r1 = r1 | r2
            int r1 = r1 << r8
            int r2 = r0.mo52974c(r8)
            r1 = r1 | r2
            r0.f73011r = r1
            r1 = 1
            int r2 = r0.mo52974c(r1)
            if (r2 != r1) goto L_0x0097
            r2 = 1
            goto L_0x0098
        L_0x0097:
            r2 = 0
        L_0x0098:
            r0.f73003g = r2
            r24.a$a r2 = r0.f72999D
            if (r2 != 0) goto L_0x00a7
            r24.a$a r2 = new r24.a$a
            int r3 = r0.f73002f
            r2.<init>(r3)
            r0.f72999D = r2
        L_0x00a7:
            r2 = 24
            int r2 = r0.mo52974c(r2)
            r0.f73001e = r2
            r24.a$a r2 = r0.f72999D
            boolean[] r3 = r2.f73020a
            byte[] r4 = r2.f73032m
            byte[] r5 = r2.f73022c
            byte[] r6 = r2.f73023d
            r8 = 0
            r11 = 0
        L_0x00bb:
            r12 = 16
            if (r8 >= r12) goto L_0x00cb
            boolean r12 = r35.mo52972a()
            if (r12 == 0) goto L_0x00c8
            int r12 = r1 << r8
            r11 = r11 | r12
        L_0x00c8:
            int r8 = r8 + 1
            goto L_0x00bb
        L_0x00cb:
            r8 = 256(0x100, float:3.59E-43)
            r13 = 256(0x100, float:3.59E-43)
        L_0x00cf:
            r14 = -1
            int r13 = r13 + r14
            if (r13 < 0) goto L_0x00d6
            r3[r13] = r9
            goto L_0x00cf
        L_0x00d6:
            r13 = 0
        L_0x00d7:
            if (r13 >= r12) goto L_0x00f5
            int r15 = r1 << r13
            r15 = r15 & r11
            if (r15 == 0) goto L_0x00f0
            int r15 = r13 << 4
            r10 = 0
        L_0x00e1:
            if (r10 >= r12) goto L_0x00f0
            boolean r16 = r35.mo52972a()
            if (r16 == 0) goto L_0x00ed
            int r16 = r15 + r10
            r3[r16] = r1
        L_0x00ed:
            int r10 = r10 + 1
            goto L_0x00e1
        L_0x00f0:
            int r13 = r13 + 1
            r10 = 49
            goto L_0x00d7
        L_0x00f5:
            r24.a$a r3 = r0.f72999D
            boolean[] r10 = r3.f73020a
            byte[] r3 = r3.f73021b
            r11 = 0
            r13 = 0
        L_0x00fd:
            if (r11 >= r8) goto L_0x010e
            boolean r15 = r10[r11]
            if (r15 == 0) goto L_0x0109
            int r15 = r13 + 1
            byte r8 = (byte) r11
            r3[r13] = r8
            r13 = r15
        L_0x0109:
            int r11 = r11 + 1
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x00fd
        L_0x010e:
            r0.f73007n = r13
            int r13 = r13 + 2
            r3 = 3
            int r3 = r0.mo52974c(r3)
            r8 = 15
            int r8 = r0.mo52974c(r8)
            r10 = 0
        L_0x011e:
            if (r10 >= r8) goto L_0x0130
            r11 = 0
        L_0x0121:
            boolean r15 = r35.mo52972a()
            if (r15 == 0) goto L_0x012a
            int r11 = r11 + 1
            goto L_0x0121
        L_0x012a:
            byte r11 = (byte) r11
            r6[r10] = r11
            int r10 = r10 + 1
            goto L_0x011e
        L_0x0130:
            r10 = r3
        L_0x0131:
            int r10 = r10 + r14
            if (r10 < 0) goto L_0x0138
            byte r11 = (byte) r10
            r4[r10] = r11
            goto L_0x0131
        L_0x0138:
            r10 = 0
        L_0x0139:
            if (r10 >= r8) goto L_0x0153
            byte r11 = r6[r10]
            r11 = r11 & 255(0xff, float:3.57E-43)
            byte r15 = r4[r11]
        L_0x0141:
            if (r11 <= 0) goto L_0x014c
            int r17 = r11 + -1
            byte r18 = r4[r17]
            r4[r11] = r18
            r11 = r17
            goto L_0x0141
        L_0x014c:
            r4[r9] = r15
            r5[r10] = r15
            int r10 = r10 + 1
            goto L_0x0139
        L_0x0153:
            char[][] r2 = r2.f73031l
            r4 = 0
        L_0x0156:
            if (r4 >= r3) goto L_0x017c
            r5 = 5
            int r5 = r0.mo52974c(r5)
            r6 = r2[r4]
            r8 = 0
        L_0x0160:
            if (r8 >= r13) goto L_0x0179
        L_0x0162:
            boolean r10 = r35.mo52972a()
            if (r10 == 0) goto L_0x0173
            boolean r10 = r35.mo52972a()
            if (r10 == 0) goto L_0x0170
            r10 = -1
            goto L_0x0171
        L_0x0170:
            r10 = 1
        L_0x0171:
            int r5 = r5 + r10
            goto L_0x0162
        L_0x0173:
            char r10 = (char) r5
            r6[r8] = r10
            int r8 = r8 + 1
            goto L_0x0160
        L_0x0179:
            int r4 = r4 + 1
            goto L_0x0156
        L_0x017c:
            r24.a$a r2 = r0.f72999D
            char[][] r4 = r2.f73031l
            int[] r5 = r2.f73028i
            int[][] r6 = r2.f73025f
            int[][] r8 = r2.f73026g
            int[][] r2 = r2.f73027h
            r10 = 0
        L_0x0189:
            if (r10 >= r3) goto L_0x0229
            r11 = 32
            r15 = r4[r10]
            r17 = r13
            r12 = 0
        L_0x0192:
            int r17 = r17 + -1
            if (r17 < 0) goto L_0x01a1
            char r7 = r15[r17]
            if (r7 <= r12) goto L_0x019b
            r12 = r7
        L_0x019b:
            if (r7 >= r11) goto L_0x019e
            r11 = r7
        L_0x019e:
            r7 = 23
            goto L_0x0192
        L_0x01a1:
            r7 = r6[r10]
            r15 = r8[r10]
            r17 = r2[r10]
            r20 = r4[r10]
            r1 = r11
            r22 = 0
        L_0x01ac:
            if (r1 > r12) goto L_0x01c3
        L_0x01ae:
            if (r9 >= r13) goto L_0x01be
            char r14 = r20[r9]
            if (r14 != r1) goto L_0x01ba
            int r14 = r22 + 1
            r17[r22] = r9
            r22 = r14
        L_0x01ba:
            int r9 = r9 + 1
            r14 = -1
            goto L_0x01ae
        L_0x01be:
            int r1 = r1 + 1
            r9 = 0
            r14 = -1
            goto L_0x01ac
        L_0x01c3:
            r1 = 23
        L_0x01c5:
            r9 = -1
            int r1 = r1 + r9
            if (r1 <= 0) goto L_0x01cf
            r9 = 0
            r15[r1] = r9
            r7[r1] = r9
            goto L_0x01c5
        L_0x01cf:
            r1 = 0
        L_0x01d0:
            if (r1 >= r13) goto L_0x01df
            char r9 = r20[r1]
            r14 = 1
            int r9 = r9 + r14
            r17 = r15[r9]
            int r17 = r17 + 1
            r15[r9] = r17
            int r1 = r1 + 1
            goto L_0x01d0
        L_0x01df:
            r1 = 0
            r9 = r15[r1]
            r1 = 1
            r14 = 23
        L_0x01e5:
            if (r1 >= r14) goto L_0x01f0
            r17 = r15[r1]
            int r9 = r9 + r17
            r15[r1] = r9
            int r1 = r1 + 1
            goto L_0x01e5
        L_0x01f0:
            r1 = r15[r11]
            r14 = r11
            r9 = 0
        L_0x01f4:
            if (r14 > r12) goto L_0x0208
            int r17 = r14 + 1
            r20 = r15[r17]
            int r1 = r20 - r1
            int r9 = r9 + r1
            int r1 = r9 + -1
            r7[r14] = r1
            r1 = 1
            int r9 = r9 << r1
            r14 = r17
            r1 = r20
            goto L_0x01f4
        L_0x0208:
            r1 = 1
            int r9 = r11 + 1
        L_0x020b:
            if (r9 > r12) goto L_0x021c
            int r14 = r9 + -1
            r14 = r7[r14]
            int r14 = r14 + r1
            int r14 = r14 << r1
            r1 = r15[r9]
            int r14 = r14 - r1
            r15[r9] = r14
            int r9 = r9 + 1
            r1 = 1
            goto L_0x020b
        L_0x021c:
            r5[r10] = r11
            int r10 = r10 + 1
            r1 = 1
            r7 = 23
            r9 = 0
            r12 = 16
            r14 = -1
            goto L_0x0189
        L_0x0229:
            java.io.InputStream r1 = r0.f73008o
            r24.a$a r2 = r0.f72999D
            byte[] r3 = r2.f73034o
            int[] r4 = r2.f73024e
            byte[] r5 = r2.f73022c
            byte[] r6 = r2.f73021b
            char[] r7 = r2.f73030k
            int[] r8 = r2.f73028i
            int[][] r9 = r2.f73025f
            int[][] r10 = r2.f73026g
            int[][] r2 = r2.f73027h
            int r11 = r0.f73002f
            r12 = 100000(0x186a0, float:1.4013E-40)
            int r11 = r11 * r12
            r12 = -1
            r16 = 256(0x100, float:3.59E-43)
        L_0x0249:
            int r13 = r16 + -1
            if (r13 < 0) goto L_0x0257
            char r12 = (char) r13
            r7[r13] = r12
            r12 = 0
            r4[r13] = r12
            r16 = r13
            r12 = -1
            goto L_0x0249
        L_0x0257:
            r12 = 0
            int r13 = r0.f73007n
            r14 = 1
            int r13 = r13 + r14
            java.io.InputStream r14 = r0.f73008o
            r24.a$a r15 = r0.f72999D
            r16 = r1
            byte[] r1 = r15.f73022c
            byte r1 = r1[r12]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int[][] r12 = r15.f73025f
            r12 = r12[r1]
            r17 = r3
            int[] r3 = r15.f73028i
            r3 = r3[r1]
            int r19 = r0.mo52974c(r3)
            r20 = r3
            int r3 = r0.f73005i
            r22 = r3
            int r3 = r0.f73004h
            r24 = r11
            r33 = r6
            r6 = r3
            r3 = r20
            r20 = r33
            r34 = r19
            r19 = r4
            r4 = r22
            r22 = r7
            r7 = r34
        L_0x0291:
            r11 = r12[r3]
            r25 = r12
            java.lang.String r12 = "unexpected end of stream"
            if (r7 <= r11) goto L_0x02bc
            int r3 = r3 + 1
        L_0x029b:
            r11 = 1
            if (r4 >= r11) goto L_0x02b0
            int r11 = r14.read()
            if (r11 < 0) goto L_0x02aa
            int r6 = r6 << 8
            r6 = r6 | r11
            int r4 = r4 + 8
            goto L_0x029b
        L_0x02aa:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r12)
            throw r1
        L_0x02b0:
            int r4 = r4 + -1
            int r7 = r7 << 1
            int r11 = r6 >> r4
            r12 = 1
            r11 = r11 & r12
            r7 = r7 | r11
            r12 = r25
            goto L_0x0291
        L_0x02bc:
            r0.f73005i = r4
            r0.f73004h = r6
            int[][] r11 = r15.f73027h
            r11 = r11[r1]
            int[][] r14 = r15.f73026g
            r1 = r14[r1]
            r1 = r1[r3]
            int r7 = r7 - r1
            r1 = r11[r7]
            r3 = 0
            byte r7 = r5[r3]
            r3 = r7 & 255(0xff, float:3.57E-43)
            r7 = r10[r3]
            r11 = r9[r3]
            r14 = r2[r3]
            r3 = r8[r3]
            r15 = r14
            r25 = 0
            r26 = 49
            r14 = r11
            r11 = -1
        L_0x02e1:
            if (r1 == r13) goto L_0x0466
            r27 = r3
            java.lang.String r3 = "block overrun"
            r28 = r7
            if (r1 == 0) goto L_0x039b
            r7 = 1
            if (r1 != r7) goto L_0x02f0
            goto L_0x039b
        L_0x02f0:
            int r11 = r11 + 1
            r7 = r24
            if (r11 >= r7) goto L_0x0395
            int r3 = r1 + -1
            char r24 = r22[r3]
            r29 = r13
            byte r13 = r20[r24]
            r30 = r14
            r14 = r13 & 255(0xff, float:3.57E-43)
            r31 = r19[r14]
            r21 = 1
            int r31 = r31 + 1
            r19[r14] = r31
            r17[r11] = r13
            r13 = 16
            if (r1 > r13) goto L_0x031e
        L_0x0310:
            if (r3 <= 0) goto L_0x031a
            int r1 = r3 + -1
            char r14 = r22[r1]
            r22[r3] = r14
            r3 = r1
            goto L_0x0310
        L_0x031a:
            r14 = r22
            r1 = 0
            goto L_0x0325
        L_0x031e:
            r14 = r22
            r1 = 0
            r13 = 1
            java.lang.System.arraycopy(r14, r1, r14, r13, r3)
        L_0x0325:
            r14[r1] = r24
            if (r26 != 0) goto L_0x033f
            int r25 = r25 + 1
            byte r1 = r5[r25]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r3 = r10[r1]
            r13 = r9[r1]
            r15 = r2[r1]
            r1 = r8[r1]
            r28 = r3
            r30 = r13
            r26 = 49
            r3 = r1
            goto L_0x0343
        L_0x033f:
            int r26 = r26 + -1
            r3 = r27
        L_0x0343:
            if (r4 >= r3) goto L_0x0357
            int r1 = r16.read()
            if (r1 < 0) goto L_0x0351
            int r6 = r6 << 8
            r6 = r6 | r1
            int r4 = r4 + 8
            goto L_0x0343
        L_0x0351:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r12)
            throw r1
        L_0x0357:
            int r4 = r4 - r3
            int r1 = r6 >> r4
            r13 = 1
            int r21 = r13 << r3
            r22 = -1
            int r21 = r21 + -1
            r1 = r1 & r21
            r22 = r3
        L_0x0365:
            r13 = r30[r22]
            if (r1 <= r13) goto L_0x038c
            int r22 = r22 + 1
        L_0x036b:
            r13 = 1
            if (r4 >= r13) goto L_0x0380
            int r13 = r16.read()
            if (r13 < 0) goto L_0x037a
            int r6 = r6 << 8
            r6 = r6 | r13
            int r4 = r4 + 8
            goto L_0x036b
        L_0x037a:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r12)
            throw r1
        L_0x0380:
            int r4 = r4 + -1
            int r1 = r1 << 1
            int r13 = r6 >> r4
            r21 = 1
            r13 = r13 & 1
            r1 = r1 | r13
            goto L_0x0365
        L_0x038c:
            r13 = r28[r22]
            int r1 = r1 - r13
            r1 = r15[r1]
            r31 = r2
            goto L_0x0452
        L_0x0395:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r3)
            throw r1
        L_0x039b:
            r29 = r13
            r30 = r14
            r14 = r22
            r7 = r24
            r22 = r15
            r13 = -1
            r15 = 1
        L_0x03a7:
            if (r1 != 0) goto L_0x03ad
            int r13 = r13 + r15
            r24 = r4
            goto L_0x03b5
        L_0x03ad:
            r24 = r4
            r4 = 1
            if (r1 != r4) goto L_0x042f
            int r1 = r15 << 1
            int r13 = r13 + r1
        L_0x03b5:
            if (r26 != 0) goto L_0x03ce
            int r25 = r25 + 1
            byte r1 = r5[r25]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r4 = r10[r1]
            r22 = r9[r1]
            r26 = r2[r1]
            r1 = r8[r1]
            r28 = r4
            r30 = r22
            r22 = r26
            r26 = 49
            goto L_0x03d2
        L_0x03ce:
            int r26 = r26 + -1
            r1 = r27
        L_0x03d2:
            r4 = r24
        L_0x03d4:
            if (r4 >= r1) goto L_0x03e9
            int r24 = r16.read()
            if (r24 < 0) goto L_0x03e3
            int r6 = r6 << 8
            r6 = r6 | r24
            int r4 = r4 + 8
            goto L_0x03d4
        L_0x03e3:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r12)
            throw r1
        L_0x03e9:
            int r4 = r4 - r1
            int r24 = r6 >> r4
            r31 = r2
            r2 = 1
            int r21 = r2 << r1
            r23 = -1
            int r21 = r21 + -1
            r21 = r24 & r21
            r24 = r1
            r27 = r24
            r2 = r21
        L_0x03fd:
            r1 = r30[r24]
            if (r2 <= r1) goto L_0x0424
            int r24 = r24 + 1
        L_0x0403:
            r1 = 1
            if (r4 >= r1) goto L_0x0418
            int r1 = r16.read()
            if (r1 < 0) goto L_0x0412
            int r6 = r6 << 8
            r6 = r6 | r1
            int r4 = r4 + 8
            goto L_0x0403
        L_0x0412:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r12)
            throw r1
        L_0x0418:
            int r4 = r4 + -1
            int r1 = r2 << 1
            int r2 = r6 >> r4
            r21 = 1
            r2 = r2 & 1
            r2 = r2 | r1
            goto L_0x03fd
        L_0x0424:
            r1 = r28[r24]
            int r2 = r2 - r1
            r1 = r22[r2]
            int r15 = r15 << 1
            r2 = r31
            goto L_0x03a7
        L_0x042f:
            r31 = r2
            r2 = 0
            char r4 = r14[r2]
            byte r2 = r20[r4]
            r4 = r2 & 255(0xff, float:3.57E-43)
            r15 = r19[r4]
            int r32 = r13 + 1
            int r15 = r15 + r32
            r19[r4] = r15
        L_0x0440:
            int r4 = r13 + -1
            if (r13 < 0) goto L_0x044a
            int r11 = r11 + 1
            r17[r11] = r2
            r13 = r4
            goto L_0x0440
        L_0x044a:
            if (r11 >= r7) goto L_0x0460
            r15 = r22
            r4 = r24
            r3 = r27
        L_0x0452:
            r24 = r7
            r22 = r14
            r7 = r28
            r13 = r29
            r14 = r30
            r2 = r31
            goto L_0x02e1
        L_0x0460:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r3)
            throw r1
        L_0x0466:
            r0.f73000d = r11
            r0.f73005i = r4
            r0.f73004h = r6
            r24.b r1 = r0.f73006j
            r2 = -1
            r1.f73036a = r2
            r1 = 1
            r0.f73010q = r1
        L_0x0474:
            return
        L_0x0475:
            r1 = 0
            r0.f73010q = r1
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "bad block header"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r24.C26109a.mo52978g():void");
    }

    /* renamed from: i */
    public final int mo52979i() {
        int i = this.f73009p;
        switch (this.f73010q) {
            case 0:
                return -1;
            case 1:
                throw new IllegalStateException();
            case 2:
                throw new IllegalStateException();
            case 3:
                if (this.f73015v == this.f73016w) {
                    int i2 = this.f73014u + 1;
                    this.f73014u = i2;
                    if (i2 < 4) {
                        this.f73010q = 2;
                        mo52983n();
                        break;
                    } else {
                        C26110a aVar = this.f72999D;
                        byte[] bArr = aVar.f73034o;
                        int i3 = this.f72997B;
                        char c = (char) (bArr[i3] & ExifInterface.MARKER);
                        this.f72998C = c;
                        this.f72997B = aVar.f73033n[i3];
                        int i4 = this.f73019z;
                        if (i4 == 0) {
                            int i5 = this.f72996A;
                            this.f73019z = C26112c.f73037a[i5] - 1;
                            int i6 = i5 + 1;
                            this.f72996A = i6;
                            if (i6 == 512) {
                                this.f72996A = 0;
                            }
                        } else {
                            this.f73019z = i4 - 1;
                        }
                        this.f73018y = 0;
                        this.f73010q = 4;
                        if (this.f73019z == 1) {
                            this.f72998C = (char) (c ^ 1);
                        }
                        mo52984q();
                        break;
                    }
                } else {
                    this.f73010q = 2;
                    this.f73014u = 1;
                    mo52983n();
                    break;
                }
            case 4:
                mo52984q();
                break;
            case 5:
                throw new IllegalStateException();
            case 6:
                if (this.f73015v == this.f73016w) {
                    int i7 = this.f73014u + 1;
                    this.f73014u = i7;
                    if (i7 < 4) {
                        mo52981k();
                        break;
                    } else {
                        C26110a aVar2 = this.f72999D;
                        byte[] bArr2 = aVar2.f73034o;
                        int i8 = this.f72997B;
                        this.f72998C = (char) (bArr2[i8] & ExifInterface.MARKER);
                        this.f72997B = aVar2.f73033n[i8];
                        this.f73018y = 0;
                        mo52982l();
                        break;
                    }
                } else {
                    this.f73014u = 1;
                    mo52981k();
                    break;
                }
            case 7:
                mo52982l();
                break;
            default:
                throw new IllegalStateException();
        }
        return i;
    }

    /* renamed from: j */
    public final void mo52980j() {
        C26110a aVar = this.f72999D;
        if (aVar != null) {
            int[] iArr = aVar.f73029j;
            int i = this.f73000d + 1;
            int[] iArr2 = aVar.f73033n;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
                aVar.f73033n = iArr2;
            }
            byte[] bArr = aVar.f73034o;
            iArr[0] = 0;
            System.arraycopy(aVar.f73024e, 0, iArr, 1, 256);
            int i2 = iArr[0];
            for (int i3 = 1; i3 <= 256; i3++) {
                i2 += iArr[i3];
                iArr[i3] = i2;
            }
            int i4 = this.f73000d;
            for (int i5 = 0; i5 <= i4; i5++) {
                byte b = bArr[i5] & ExifInterface.MARKER;
                int i6 = iArr[b];
                iArr[b] = i6 + 1;
                iArr2[i6] = i5;
            }
            int i7 = this.f73001e;
            if (i7 < 0 || i7 >= iArr2.length) {
                throw new IOException("stream corrupted");
            }
            this.f72997B = iArr2[i7];
            this.f73014u = 0;
            this.f73017x = 0;
            this.f73015v = 256;
            if (this.f73003g) {
                this.f73019z = 0;
                this.f72996A = 0;
                mo52983n();
                return;
            }
            mo52981k();
        }
    }

    /* renamed from: k */
    public final void mo52981k() {
        int i = this.f73017x;
        if (i <= this.f73000d) {
            this.f73016w = this.f73015v;
            C26110a aVar = this.f72999D;
            byte[] bArr = aVar.f73034o;
            int i2 = this.f72997B;
            byte b = bArr[i2] & ExifInterface.MARKER;
            this.f73015v = b;
            this.f72997B = aVar.f73033n[i2];
            this.f73017x = i + 1;
            this.f73009p = b;
            this.f73010q = 6;
            this.f73006j.mo52987a(b);
            return;
        }
        this.f73010q = 5;
        mo52977e();
        mo52978g();
        mo52980j();
    }

    /* renamed from: l */
    public final void mo52982l() {
        if (this.f73018y < this.f72998C) {
            int i = this.f73015v;
            this.f73009p = i;
            this.f73006j.mo52987a(i);
            this.f73018y++;
            this.f73010q = 7;
            return;
        }
        this.f73017x++;
        this.f73014u = 0;
        mo52981k();
    }

    /* renamed from: n */
    public final void mo52983n() {
        int i = this.f73017x;
        if (i <= this.f73000d) {
            this.f73016w = this.f73015v;
            C26110a aVar = this.f72999D;
            byte[] bArr = aVar.f73034o;
            int i2 = this.f72997B;
            byte b = bArr[i2] & ExifInterface.MARKER;
            this.f72997B = aVar.f73033n[i2];
            int i3 = this.f73019z;
            byte b2 = 0;
            if (i3 == 0) {
                int i4 = this.f72996A;
                this.f73019z = C26112c.f73037a[i4] - 1;
                int i5 = i4 + 1;
                this.f72996A = i5;
                if (i5 == 512) {
                    this.f72996A = 0;
                }
            } else {
                this.f73019z = i3 - 1;
            }
            if (this.f73019z == 1) {
                b2 = 1;
            }
            byte b3 = b ^ b2;
            this.f73015v = b3;
            this.f73017x = i + 1;
            this.f73009p = b3;
            this.f73010q = 3;
            this.f73006j.mo52987a(b3);
            return;
        }
        mo52977e();
        mo52978g();
        mo52980j();
    }

    /* renamed from: q */
    public final void mo52984q() {
        if (this.f73018y < this.f72998C) {
            int i = this.f73015v;
            this.f73009p = i;
            this.f73006j.mo52987a(i);
            this.f73018y++;
            return;
        }
        this.f73010q = 2;
        this.f73017x++;
        this.f73014u = 0;
        mo52983n();
    }

    public int read() {
        if (this.f73008o != null) {
            return mo52979i();
        }
        throw new IOException("stream closed");
    }

    public int read(byte[] bArr, int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("offs(" + i + ") < 0.");
        } else if (i2 >= 0) {
            int i3 = i + i2;
            if (i3 > bArr.length) {
                throw new IndexOutOfBoundsException("offs(" + i + ") + len(" + i2 + ") > dest.length(" + bArr.length + ").");
            } else if (this.f73008o != null) {
                int i4 = i;
                while (i4 < i3) {
                    int i5 = mo52979i();
                    if (i5 < 0) {
                        break;
                    }
                    bArr[i4] = (byte) i5;
                    i4++;
                }
                if (i4 == i) {
                    return -1;
                }
                return i4 - i;
            } else {
                throw new IOException("stream closed");
            }
        } else {
            throw new IndexOutOfBoundsException("len(" + i2 + ") < 0.");
        }
    }
}
