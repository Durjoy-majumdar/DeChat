package at3;

import android.content.Context;
import bt3.C113206a;
import ft3.C116896h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: at3.f */
public class C113074f {

    /* renamed from: c */
    public static final C116896h<C113074f> f338470c = new C113075a();

    /* renamed from: a */
    public Context f338471a;

    /* renamed from: b */
    public boolean f338472b = false;

    /* renamed from: at3.f$a */
    public class C113075a extends C116896h<C113074f> {
        /* renamed from: a */
        public Object mo165606a() {
            return new C113074f();
        }
    }

    /* renamed from: at3.f$b */
    public static class C113076b {

        /* renamed from: a */
        public C113206a f338473a;

        /* renamed from: b */
        public List<String> f338474b;

        public C113076b(C113075a aVar) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0 = new byte[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r3 == null) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0159, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x015a, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x015b, code lost:
        if (r3 != null) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0160, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0029 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final bt3.C113206a mo165604a(java.lang.String r18) {
        /*
            r17 = this;
            java.io.File r0 = new java.io.File
            r1 = r18
            r0.<init>(r1)
            r1 = 0
            r2 = 0
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0028 }
            java.lang.String r4 = "r"
            r3.<init>(r0, r4)     // Catch:{ all -> 0x0028 }
            long r4 = r3.length()     // Catch:{ all -> 0x0029 }
            int r0 = (int) r4     // Catch:{ all -> 0x0029 }
            long r6 = (long) r0     // Catch:{ all -> 0x0029 }
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x0020
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0029 }
            r3.readFully(r0)     // Catch:{ all -> 0x0029 }
            goto L_0x002d
        L_0x0020:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0029 }
            java.lang.String r4 = ""
            r0.<init>(r4)     // Catch:{ all -> 0x0029 }
            throw r0     // Catch:{ all -> 0x0029 }
        L_0x0028:
            r3 = r1
        L_0x0029:
            byte[] r0 = new byte[r2]     // Catch:{ all -> 0x0159 }
            if (r3 == 0) goto L_0x0030
        L_0x002d:
            r3.close()     // Catch:{ IOException -> 0x0030 }
        L_0x0030:
            byte[] r3 = ft3.C116891b.m164880d()
            if (r3 == 0) goto L_0x004a
            int r4 = r3.length
            r5 = 16
            if (r4 <= r5) goto L_0x004a
            java.lang.String r4 = "MD5"
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r4)     // Catch:{ NoSuchAlgorithmException -> 0x0049 }
            r4.update(r3)     // Catch:{ NoSuchAlgorithmException -> 0x0049 }
            byte[] r3 = r4.digest()     // Catch:{ NoSuchAlgorithmException -> 0x0049 }
            goto L_0x004a
        L_0x0049:
            r3 = r1
        L_0x004a:
            r4 = -1
            if (r3 == 0) goto L_0x00ed
            int r5 = r0.length
            if (r5 != 0) goto L_0x0052
            goto L_0x00ed
        L_0x0052:
            int r5 = r0.length
            r6 = 4
            int r5 = r5 % r6
            if (r5 != 0) goto L_0x00ec
            int r5 = r0.length
            r7 = 8
            if (r5 >= r7) goto L_0x005e
            goto L_0x00ec
        L_0x005e:
            int r5 = r0.length
            int r5 = r5 >>> 2
            int[] r7 = new int[r5]
            ft3.C116891b.m164879c(r0, r7)
            int r0 = r3.length
            int r0 = r0 % r6
            if (r0 != 0) goto L_0x006e
            int r0 = r3.length
            int r0 = r0 >>> 2
            goto L_0x0073
        L_0x006e:
            int r0 = r3.length
            int r0 = r0 >>> 2
            int r0 = r0 + 1
        L_0x0073:
            if (r0 >= r6) goto L_0x0076
            goto L_0x0077
        L_0x0076:
            r6 = r0
        L_0x0077:
            int[] r0 = new int[r6]
            r8 = 0
        L_0x007a:
            if (r8 >= r6) goto L_0x0081
            r0[r8] = r2
            int r8 = r8 + 1
            goto L_0x007a
        L_0x0081:
            ft3.C116891b.m164879c(r3, r0)
            int r5 = r5 + r4
            r3 = r7[r5]
            r3 = r7[r2]
            r6 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            r8 = 52
            int r9 = r5 + 1
            int r8 = r8 / r9
            int r8 = r8 + 6
            int r8 = r8 * r6
        L_0x0095:
            if (r8 == 0) goto L_0x00dd
            int r9 = r8 >>> 2
            r9 = r9 & 3
            r10 = r5
        L_0x009c:
            if (r10 <= 0) goto L_0x00bf
            int r11 = r10 + -1
            r12 = r7[r11]
            r13 = r7[r10]
            int r14 = r12 >>> 5
            int r15 = r3 << 2
            r14 = r14 ^ r15
            int r15 = r3 >>> 3
            int r16 = r12 << 4
            r15 = r15 ^ r16
            int r14 = r14 + r15
            r3 = r3 ^ r8
            r15 = r10 & 3
            r15 = r15 ^ r9
            r15 = r0[r15]
            r12 = r12 ^ r15
            int r3 = r3 + r12
            r3 = r3 ^ r14
            int r3 = r13 - r3
            r7[r10] = r3
            r10 = r11
            goto L_0x009c
        L_0x00bf:
            r11 = r7[r5]
            r12 = r7[r2]
            int r13 = r11 >>> 5
            int r14 = r3 << 2
            r13 = r13 ^ r14
            int r14 = r3 >>> 3
            int r15 = r11 << 4
            r14 = r14 ^ r15
            int r13 = r13 + r14
            r3 = r3 ^ r8
            r10 = r10 & 3
            r9 = r9 ^ r10
            r9 = r0[r9]
            r9 = r9 ^ r11
            int r3 = r3 + r9
            r3 = r3 ^ r13
            int r3 = r12 - r3
            r7[r2] = r3
            int r8 = r8 - r6
            goto L_0x0095
        L_0x00dd:
            r0 = r7[r5]
            if (r0 < 0) goto L_0x00ec
            int r2 = r5 << 2
            if (r0 <= r2) goto L_0x00e6
            goto L_0x00ec
        L_0x00e6:
            byte[] r0 = new byte[r0]
            ft3.C116891b.m164877a(r7, r5, r0)
            goto L_0x00ed
        L_0x00ec:
            r0 = r1
        L_0x00ed:
            if (r0 != 0) goto L_0x00f0
            return r1
        L_0x00f0:
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r0)
            java.util.zip.InflaterInputStream r3 = new java.util.zip.InflaterInputStream
            r3.<init>(r2)
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream
            r5.<init>()
        L_0x00ff:
            int r0 = r3.read()     // Catch:{ Exception -> 0x011b }
            if (r0 == r4) goto L_0x0109
            r5.write(r0)     // Catch:{ Exception -> 0x011b }
            goto L_0x00ff
        L_0x0109:
            byte[] r0 = r5.toByteArray()     // Catch:{ Exception -> 0x011b }
            r2.close()     // Catch:{ IOException -> 0x0117 }
            r3.close()     // Catch:{ IOException -> 0x0117 }
            r5.close()     // Catch:{ IOException -> 0x0117 }
            goto L_0x013e
        L_0x0117:
            goto L_0x013e
        L_0x0119:
            r0 = move-exception
            goto L_0x014f
        L_0x011b:
            r0 = move-exception
            java.lang.String r4 = "CompressUtil"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0119 }
            r6.<init>()     // Catch:{ all -> 0x0119 }
            java.lang.String r7 = "inflater(), exception: "
            r6.append(r7)     // Catch:{ all -> 0x0119 }
            r6.append(r0)     // Catch:{ all -> 0x0119 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0119 }
            ft3.C116895f.m164892d(r4, r0)     // Catch:{ all -> 0x0119 }
            r2.close()     // Catch:{ IOException -> 0x013c }
            r3.close()     // Catch:{ IOException -> 0x013c }
            r5.close()     // Catch:{ IOException -> 0x013c }
            goto L_0x013d
        L_0x013c:
        L_0x013d:
            r0 = r1
        L_0x013e:
            if (r0 != 0) goto L_0x0141
            return r1
        L_0x0141:
            bt3.a r1 = new bt3.a
            r1.<init>()
            com.qq.taf.jce.JceInputStream r2 = new com.qq.taf.jce.JceInputStream
            r2.<init>((byte[]) r0)
            r1.readFrom(r2)
            return r1
        L_0x014f:
            r2.close()     // Catch:{ IOException -> 0x0158 }
            r3.close()     // Catch:{ IOException -> 0x0158 }
            r5.close()     // Catch:{ IOException -> 0x0158 }
        L_0x0158:
            throw r0
        L_0x0159:
            r0 = move-exception
            r1 = r0
            if (r3 == 0) goto L_0x0160
            r3.close()     // Catch:{ IOException -> 0x0160 }
        L_0x0160:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: at3.C113074f.mo165604a(java.lang.String):bt3.a");
    }

    /* renamed from: b */
    public final C113076b mo165605b(Map<String, C113206a> map, int i) {
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        C113206a aVar = null;
        for (String next : map.keySet()) {
            C113206a aVar2 = map.get(next);
            if (aVar2 != null && aVar2.f338722j == i) {
                arrayList.add(next);
                if (aVar == null) {
                    aVar = aVar2;
                } else {
                    aVar.f338718f.addAll(aVar2.f338718f);
                }
            }
        }
        if (aVar == null) {
            return null;
        }
        C113076b bVar = new C113076b((C113075a) null);
        bVar.f338473a = aVar;
        bVar.f338474b = arrayList;
        return bVar;
    }
}
