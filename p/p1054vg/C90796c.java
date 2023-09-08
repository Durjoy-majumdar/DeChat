package p1054vg;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Properties;
import java.util.zip.ZipException;

/* renamed from: vg.c */
public final class C90796c {

    /* renamed from: a */
    public static final C90803j f260736a = new C90803j(84298576);

    /* renamed from: b */
    public static final C90803j f260737b = new C90803j(50613072);

    /* renamed from: c */
    public static int f260738c = 0;

    /* renamed from: d */
    public static final C90803j f260739d = new C90803j(101010256);

    /* renamed from: vg.c$b */
    public static class C90798b {

        /* renamed from: a */
        public Properties f260740a = new Properties();

        /* renamed from: b */
        public byte[] f260741b;

        public C90798b(C90797a aVar) {
        }

        /* renamed from: a */
        public void mo124915a(byte[] bArr) {
            if (bArr != null && bArr.length != 0) {
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                C90803j jVar = C90796c.f260736a;
                jVar.mo124918a();
                byte[] bArr2 = new byte[4];
                wrap.get(bArr2);
                PrintStream printStream = System.out;
                printStream.println("securityPart: " + new C90803j(bArr2).f260747d);
                if (!jVar.equals(new C90803j(bArr2))) {
                    C90803j jVar2 = C90796c.f260737b;
                    if (jVar2.equals(new C90803j(bArr2))) {
                        jVar2.mo124918a();
                        if (bArr.length - 4 <= 2) {
                            System.err.println("data.length - oriMarkLength <= 2");
                            return;
                        }
                        byte[] bArr3 = new byte[2];
                        wrap.get(bArr3);
                        int i = ((bArr3[1] << 8) & 65280) + (bArr3[0] & ExifInterface.MARKER);
                        if ((bArr.length - 4) - 2 < i) {
                            System.err.println("data.length - oriMarkLength - 2 < len");
                            System.err.println("exit");
                            return;
                        }
                        byte[] bArr4 = new byte[i];
                        this.f260741b = bArr4;
                        wrap.get(bArr4);
                        return;
                    }
                    throw new ProtocolException("unknow protocl [" + Arrays.toString(bArr) + "]");
                } else if (bArr.length - 4 <= 2) {
                    System.err.println("data.length - securityMarkLength <= 2");
                } else {
                    byte[] bArr5 = new byte[2];
                    wrap.get(bArr5);
                    int i2 = ((bArr5[1] << 8) & 65280) + (bArr5[0] & ExifInterface.MARKER);
                    if ((bArr.length - 4) - 2 < i2) {
                        System.err.println("data.length - securityMarkLength - 2 < len");
                        System.err.println("exit");
                        return;
                    }
                    byte[] bArr6 = new byte[i2];
                    wrap.get(bArr6);
                    this.f260740a.load(new ByteArrayInputStream(bArr6));
                    int length = ((bArr.length - 4) - i2) - 2;
                    if (length > 0) {
                        C90803j jVar3 = C90796c.f260737b;
                        jVar3.mo124918a();
                        byte[] bArr7 = new byte[4];
                        wrap.get(bArr7);
                        if (jVar3.equals(new C90803j(bArr7))) {
                            int i3 = length - 4;
                            if (i3 <= 2) {
                                System.err.println("data.length - oriMarkLength <= 2");
                                return;
                            }
                            byte[] bArr8 = new byte[2];
                            wrap.get(bArr8);
                            int i4 = ((bArr8[1] << 8) & 65280) + (bArr8[0] & ExifInterface.MARKER);
                            if (i3 - 2 < i4) {
                                System.err.println("data.length - oriMarkLength - 2 < len");
                                System.err.println("exit");
                                return;
                            }
                            byte[] bArr9 = new byte[i4];
                            this.f260741b = bArr9;
                            wrap.get(bArr9);
                        }
                    }
                }
            }
        }

        /* renamed from: b */
        public byte[] mo124916b() {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (this.f260740a.size() > 0) {
                byteArrayOutputStream.write(new byte[]{(byte) ((int) (84298576 & 255)), (byte) ((int) ((84298576 & 65280) >> 8)), (byte) ((int) ((84298576 & 16711680) >> 16)), (byte) ((int) ((84298576 & 4278190080L) >> 24))});
                String str = "";
                for (Object next : this.f260740a.keySet()) {
                    str = str + next + "=" + this.f260740a.getProperty((String) next) + APLogFileUtil.SEPARATOR_LINE;
                }
                byte[] bytes = str.getBytes();
                int length = bytes.length;
                byteArrayOutputStream.write(new byte[]{(byte) (length & 255), (byte) ((length & 65280) >> 8)});
                byteArrayOutputStream.write(bytes);
            }
            byte[] bArr = this.f260741b;
            if (bArr != null && bArr.length > 0) {
                byteArrayOutputStream.write(new byte[]{(byte) ((int) (50613072 & 255)), (byte) ((int) ((50613072 & 65280) >> 8)), (byte) ((int) ((50613072 & 16711680) >> 16)), (byte) ((int) ((50613072 & 4278190080L) >> 24))});
                int length2 = this.f260741b.length;
                byteArrayOutputStream.write(new byte[]{(byte) (length2 & 255), (byte) ((length2 & 65280) >> 8)});
                byteArrayOutputStream.write(this.f260741b);
            }
            return byteArrayOutputStream.toByteArray();
        }
    }

    /* renamed from: a */
    public static byte[] m113865a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        C90803j jVar = f260736a;
        jVar.mo124918a();
        byte[] bArr2 = new byte[4];
        wrap.get(bArr2);
        if (jVar.equals(new C90803j(bArr2))) {
            return bArr;
        }
        C90803j jVar2 = f260737b;
        if (jVar2.equals(new C90803j(bArr2))) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(jVar2.mo124918a());
        int length = bArr.length;
        byteArrayOutputStream.write(new byte[]{(byte) (length & 255), (byte) ((length & 65280) >> 8)});
        byteArrayOutputStream.write(bArr);
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m113866b(java.io.File r5) {
        /*
            java.lang.String r0 = "exit getSecurityCode"
            java.io.PrintStream r1 = java.lang.System.err
            java.lang.String r2 = "enter getSecurityCode"
            r1.println(r2)
            r1 = 0
            if (r5 != 0) goto L_0x000d
            return r1
        L_0x000d:
            java.io.PrintStream r2 = java.lang.System.err
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "apkFile filename:"
            r3.append(r4)
            java.lang.String r4 = r5.getName()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.println(r3)
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0068 }
            java.lang.String r3 = "r"
            r2.<init>(r5, r3)     // Catch:{ all -> 0x0068 }
            byte[] r5 = m113867c(r2)     // Catch:{ all -> 0x0065 }
            if (r5 != 0) goto L_0x004c
            java.io.PrintStream r5 = java.lang.System.err     // Catch:{ all -> 0x0065 }
            java.lang.String r3 = "null == readComment"
            r5.println(r3)     // Catch:{ all -> 0x0065 }
            java.io.PrintStream r5 = java.lang.System.err     // Catch:{ all -> 0x0065 }
            java.lang.String r3 = "exit"
            r5.println(r3)     // Catch:{ all -> 0x0065 }
            r2.close()
            java.io.PrintStream r5 = java.lang.System.err
            r5.println(r0)
            return r1
        L_0x004c:
            vg.c$b r3 = new vg.c$b     // Catch:{ all -> 0x0065 }
            r3.<init>(r1)     // Catch:{ all -> 0x0065 }
            r3.mo124915a(r5)     // Catch:{ all -> 0x0065 }
            java.util.Properties r5 = r3.f260740a     // Catch:{ all -> 0x0065 }
            java.lang.String r1 = "apkSecurityCode"
            java.lang.String r5 = r5.getProperty(r1)     // Catch:{ all -> 0x0065 }
            r2.close()
            java.io.PrintStream r1 = java.lang.System.err
            r1.println(r0)
            return r5
        L_0x0065:
            r5 = move-exception
            r1 = r2
            goto L_0x0069
        L_0x0068:
            r5 = move-exception
        L_0x0069:
            if (r1 == 0) goto L_0x006e
            r1.close()
        L_0x006e:
            java.io.PrintStream r1 = java.lang.System.err
            r1.println(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p1054vg.C90796c.m113866b(java.io.File):java.lang.String");
    }

    /* renamed from: c */
    public static byte[] m113867c(RandomAccessFile randomAccessFile) {
        boolean z;
        long length = randomAccessFile.length() - 22;
        randomAccessFile.seek(length);
        byte[] a = f260739d.mo124918a();
        int read = randomAccessFile.read();
        while (true) {
            if (read != -1) {
                if (read == a[0] && randomAccessFile.read() == a[1] && randomAccessFile.read() == a[2] && randomAccessFile.read() == a[3]) {
                    z = true;
                    break;
                }
                length--;
                randomAccessFile.seek(length);
                read = randomAccessFile.read();
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            long j = length + 16 + 4;
            randomAccessFile.seek(j);
            if (((long) f260738c) != j) {
                f260738c = (int) j;
            }
            byte[] bArr = new byte[2];
            randomAccessFile.readFully(bArr);
            PrintStream printStream = System.err;
            StringBuilder sb = new StringBuilder();
            sb.append("readComment:length bytes data = ");
            StringBuilder sb4 = new StringBuilder();
            for (int i = 0; i < 2; i++) {
                sb4.append(bArr[i]);
                sb4.append(",");
            }
            sb.append(sb4.toString());
            printStream.println(sb.toString());
            int i2 = ((bArr[1] << 8) & 65280) + (bArr[0] & ExifInterface.MARKER);
            if (i2 == 0) {
                return null;
            }
            byte[] bArr2 = new byte[i2];
            randomAccessFile.read(bArr2);
            return bArr2;
        }
        System.err.println("archive is not a ZIP archive");
        throw new ZipException("archive is not a ZIP archive");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0078  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m113868d(java.io.File r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "exit writeSecurityCode"
            r1 = 0
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0075 }
            java.lang.String r3 = "rw"
            r2.<init>(r6, r3)     // Catch:{ all -> 0x0075 }
            byte[] r6 = m113867c(r2)     // Catch:{ all -> 0x0072 }
            byte[] r6 = m113865a(r6)     // Catch:{ all -> 0x0072 }
            vg.c$b r3 = new vg.c$b     // Catch:{ all -> 0x0072 }
            r3.<init>(r1)     // Catch:{ all -> 0x0072 }
            r3.mo124915a(r6)     // Catch:{ all -> 0x0072 }
            java.util.Properties r6 = r3.f260740a     // Catch:{ all -> 0x0072 }
            java.lang.String r1 = "apkSecurityCode"
            r6.setProperty(r1, r7)     // Catch:{ all -> 0x0072 }
            byte[] r6 = r3.mo124916b()     // Catch:{ all -> 0x0072 }
            int r7 = f260738c     // Catch:{ all -> 0x0072 }
            long r3 = (long) r7     // Catch:{ all -> 0x0072 }
            r2.seek(r3)     // Catch:{ all -> 0x0072 }
            int r7 = r6.length     // Catch:{ all -> 0x0072 }
            r1 = 2
            byte[] r3 = new byte[r1]     // Catch:{ all -> 0x0072 }
            r4 = r7 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4     // Catch:{ all -> 0x0072 }
            r5 = 0
            r3[r5] = r4     // Catch:{ all -> 0x0072 }
            r4 = 65280(0xff00, float:9.1477E-41)
            r7 = r7 & r4
            int r7 = r7 >> 8
            byte r7 = (byte) r7     // Catch:{ all -> 0x0072 }
            r4 = 1
            r3[r4] = r7     // Catch:{ all -> 0x0072 }
            r2.write(r3)     // Catch:{ all -> 0x0072 }
            r2.write(r6)     // Catch:{ all -> 0x0072 }
            int r7 = f260738c     // Catch:{ all -> 0x0072 }
            int r6 = r6.length     // Catch:{ all -> 0x0072 }
            int r7 = r7 + r6
            int r7 = r7 + r1
            long r6 = (long) r7     // Catch:{ all -> 0x0072 }
            r2.setLength(r6)     // Catch:{ all -> 0x0072 }
            java.io.PrintStream r6 = java.lang.System.err     // Catch:{ all -> 0x0072 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0072 }
            r7.<init>()     // Catch:{ all -> 0x0072 }
            java.lang.String r1 = "file length is = "
            r7.append(r1)     // Catch:{ all -> 0x0072 }
            long r3 = r2.length()     // Catch:{ all -> 0x0072 }
            r7.append(r3)     // Catch:{ all -> 0x0072 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0072 }
            r6.println(r7)     // Catch:{ all -> 0x0072 }
            r2.close()
            java.io.PrintStream r6 = java.lang.System.err
            r6.println(r0)
            return
        L_0x0072:
            r6 = move-exception
            r1 = r2
            goto L_0x0076
        L_0x0075:
            r6 = move-exception
        L_0x0076:
            if (r1 == 0) goto L_0x007b
            r1.close()
        L_0x007b:
            java.io.PrintStream r7 = java.lang.System.err
            r7.println(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p1054vg.C90796c.m113868d(java.io.File, java.lang.String):void");
    }
}
