package p334ef;

import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p296bf.C16792a;
import p338ff.C20706a;
import p338ff.C20707b;
import p338ff.C20708c;
import p342gf.C20831a;

/* renamed from: ef.a */
public class C20587a {

    /* renamed from: a */
    public final Set<C20707b> f57965a = new HashSet();

    /* renamed from: b */
    public final Map<C20707b, byte[]> f57966b = new HashMap();

    /* renamed from: c */
    public final Map<C20707b, C20707b> f57967c = new HashMap();

    /* renamed from: d */
    public final Set<C20707b> f57968d = new HashSet();

    /* renamed from: e */
    public C20707b f57969e = null;

    /* renamed from: f */
    public C20707b f57970f = null;

    /* renamed from: g */
    public C20707b f57971g = null;

    /* renamed from: h */
    public C20707b f57972h = null;

    /* renamed from: i */
    public C20707b f57973i = null;

    /* renamed from: j */
    public C20707b f57974j = null;

    /* renamed from: k */
    public C20707b f57975k = null;

    /* renamed from: l */
    public int f57976l = 0;

    /* renamed from: m */
    public C20707b f57977m = null;

    /* renamed from: n */
    public C20706a[] f57978n = null;

    /* renamed from: o */
    public C20706a[] f57979o = null;

    /* renamed from: ef.a$a */
    public class C20588a extends C20596d {

        /* renamed from: ef.a$a$a */
        public class C20589a extends C20594b {
            public C20589a(C20594b bVar) {
                super(bVar);
            }

            /* renamed from: e */
            public void mo32237e(C20707b bVar, int i, C20707b bVar2, byte[] bArr) {
                C20707b bVar3;
                try {
                    if (bVar2.equals(C20587a.this.f57970f)) {
                        C20707b bVar4 = null;
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                        C20706a[] aVarArr = C20587a.this.f57978n;
                        int length = aVarArr.length;
                        int i2 = 0;
                        int i3 = 0;
                        while (true) {
                            if (i2 >= length) {
                                break;
                            }
                            C20706a aVar = aVarArr[i2];
                            C20707b bVar5 = aVar.f58554b;
                            C20708c a = C20708c.m22681a(aVar.f58553a);
                            if (a == null) {
                                throw new IllegalStateException("visit instance failed, lost type def of typeId: " + aVar.f58553a);
                            } else if (C20587a.this.f57971g.equals(bVar5)) {
                                bVar4 = (C20707b) C20831a.m22850f(byteArrayInputStream, a, C20587a.this.f57976l);
                                break;
                            } else {
                                int i4 = C20587a.this.f57976l;
                                int i5 = a.f58560e;
                                if (i5 != 0) {
                                    i4 = i5;
                                }
                                C20831a.m22851g(byteArrayInputStream, (long) i4);
                                i3 += i4;
                                i2++;
                            }
                        }
                        if (bVar4 != null && (bVar3 = (C20707b) ((HashMap) C20587a.this.f57967c).get(bVar4)) != null && !bVar4.equals(bVar3) && !bVar4.equals(C20587a.this.f57977m)) {
                            ByteBuffer wrap = ByteBuffer.wrap(bArr);
                            wrap.position(i3);
                            wrap.put(bVar3.f58556a);
                        }
                    }
                    super.mo32237e(bVar, i, bVar2, bArr);
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }

            /* renamed from: k */
            public void mo32238k(int i, C20707b bVar, int i2, int i3, int i4, byte[] bArr) {
                C20707b bVar2 = (C20707b) ((HashMap) C20587a.this.f57967c).get(bVar);
                if ((bVar2 != null && bVar.equals(bVar2)) || ((HashSet) C20587a.this.f57968d).contains(bVar)) {
                    super.mo32238k(i, bVar, i2, i3, i4, bArr);
                }
            }
        }

        public C20588a(C20597e eVar) {
            super(eVar);
        }

        /* renamed from: c */
        public C20594b mo32236c(int i, int i2, long j) {
            C20596d dVar = this.f57989a;
            return new C20589a(dVar != null ? dVar.mo32236c(i, i2, j) : null);
        }
    }

    /* renamed from: ef.a$b */
    public class C20590b extends C20596d {

        /* renamed from: ef.a$b$a */
        public class C20591a extends C20594b {
            public C20591a(C20594b bVar) {
                super(bVar);
            }

            /* renamed from: c */
            public void mo32242c(C20707b bVar, int i, C20707b bVar2, C20707b bVar3, int i2, C20706a[] aVarArr, C20706a[] aVarArr2) {
                C20707b bVar4;
                C20707b bVar5;
                C20587a aVar = C20587a.this;
                if (aVar.f57978n != null || (bVar5 = aVar.f57970f) == null || !bVar5.equals(bVar)) {
                    C20587a aVar2 = C20587a.this;
                    if (aVar2.f57979o == null && (bVar4 = aVar2.f57974j) != null && bVar4.equals(bVar)) {
                        C20587a.this.f57979o = aVarArr2;
                        return;
                    }
                    return;
                }
                C20587a.this.f57978n = aVarArr2;
            }
        }

        public C20590b() {
            super((C20596d) null);
        }

        /* renamed from: b */
        public void mo32239b(String str, int i, long j) {
            C20587a aVar = C20587a.this;
            aVar.f57976l = i;
            aVar.f57977m = new C20707b(new byte[i]);
        }

        /* renamed from: c */
        public C20594b mo32236c(int i, int i2, long j) {
            return new C20591a((C20594b) null);
        }

        /* renamed from: d */
        public void mo32240d(int i, C20707b bVar, int i2, C20707b bVar2, int i3, long j) {
            C20707b bVar3;
            C20707b bVar4;
            C20587a aVar = C20587a.this;
            if (aVar.f57970f != null || (bVar4 = aVar.f57969e) == null || !bVar4.equals(bVar2)) {
                C20587a aVar2 = C20587a.this;
                if (aVar2.f57974j == null && (bVar3 = aVar2.f57973i) != null && bVar3.equals(bVar2)) {
                    C20587a.this.f57974j = bVar;
                    return;
                }
                return;
            }
            C20587a.this.f57970f = bVar;
        }

        /* renamed from: g */
        public void mo32241g(C20707b bVar, String str, int i, long j) {
            if (C20587a.this.f57969e == null && "android.graphics.Bitmap".equals(str)) {
                C20587a.this.f57969e = bVar;
            } else if (C20587a.this.f57971g == null && "mBuffer".equals(str)) {
                C20587a.this.f57971g = bVar;
            } else if (C20587a.this.f57972h == null && "mRecycled".equals(str)) {
                C20587a.this.f57972h = bVar;
            } else if (C20587a.this.f57973i == null && "java.lang.String".equals(str)) {
                C20587a.this.f57973i = bVar;
            } else if (C20587a.this.f57975k == null && "value".equals(str)) {
                C20587a.this.f57975k = bVar;
            }
        }
    }

    /* renamed from: ef.a$c */
    public class C20592c extends C20596d {

        /* renamed from: ef.a$c$a */
        public class C20593a extends C20594b {
            public C20593a(C20594b bVar) {
                super(bVar);
            }

            /* renamed from: e */
            public void mo32237e(C20707b bVar, int i, C20707b bVar2, byte[] bArr) {
                try {
                    C20707b bVar3 = C20587a.this.f57970f;
                    C20707b bVar4 = null;
                    int i2 = 0;
                    if (bVar3 == null || !bVar3.equals(bVar2)) {
                        C20707b bVar5 = C20587a.this.f57974j;
                        if (bVar5 != null && bVar5.equals(bVar2)) {
                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                            C20706a[] aVarArr = C20587a.this.f57979o;
                            int length = aVarArr.length;
                            while (i2 < length) {
                                C20706a aVar = aVarArr[i2];
                                C20707b bVar6 = aVar.f58554b;
                                C20708c a = C20708c.m22681a(aVar.f58553a);
                                if (a != null) {
                                    if (!C20587a.this.f57975k.equals(bVar6)) {
                                        if (bVar4 != null) {
                                            break;
                                        }
                                        int i3 = C20587a.this.f57976l;
                                        int i4 = a.f58560e;
                                        if (i4 != 0) {
                                            i3 = i4;
                                        }
                                        C20831a.m22851g(byteArrayInputStream, (long) i3);
                                    } else {
                                        bVar4 = (C20707b) C20831a.m22850f(byteArrayInputStream, a, C20587a.this.f57976l);
                                    }
                                    i2++;
                                } else {
                                    throw new IllegalStateException("visit string instance failed, lost type def of typeId: " + aVar.f58553a);
                                }
                            }
                            byteArrayInputStream.close();
                            if (bVar4 != null && !bVar4.equals(C20587a.this.f57977m)) {
                                ((HashSet) C20587a.this.f57968d).add(bVar4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr);
                    C20706a[] aVarArr2 = C20587a.this.f57978n;
                    int length2 = aVarArr2.length;
                    Boolean bool = null;
                    int i5 = 0;
                    while (i5 < length2) {
                        C20706a aVar2 = aVarArr2[i5];
                        C20707b bVar7 = aVar2.f58554b;
                        C20708c a2 = C20708c.m22681a(aVar2.f58553a);
                        if (a2 != null) {
                            if (!C20587a.this.f57971g.equals(bVar7)) {
                                if (!C20587a.this.f57972h.equals(bVar7)) {
                                    if (bVar4 != null && bool != null) {
                                        break;
                                    }
                                    int i6 = C20587a.this.f57976l;
                                    int i7 = a2.f58560e;
                                    if (i7 != 0) {
                                        i6 = i7;
                                    }
                                    C20831a.m22851g(byteArrayInputStream2, (long) i6);
                                } else {
                                    bool = (Boolean) C20831a.m22850f(byteArrayInputStream2, a2, C20587a.this.f57976l);
                                }
                            } else {
                                bVar4 = (C20707b) C20831a.m22850f(byteArrayInputStream2, a2, C20587a.this.f57976l);
                            }
                            i5++;
                        } else {
                            throw new IllegalStateException("visit bmp instance failed, lost type def of typeId: " + aVar2.f58553a);
                        }
                    }
                    byteArrayInputStream2.close();
                    if (bool == null || !bool.booleanValue()) {
                        i2 = 1;
                    }
                    if (bVar4 != null && i2 != 0 && !bVar4.equals(C20587a.this.f57977m)) {
                        ((HashSet) C20587a.this.f57965a).add(bVar4);
                    }
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }

            /* renamed from: k */
            public void mo32238k(int i, C20707b bVar, int i2, int i3, int i4, byte[] bArr) {
                ((HashMap) C20587a.this.f57966b).put(bVar, bArr);
            }
        }

        public C20592c() {
            super((C20596d) null);
        }

        /* renamed from: a */
        public void mo32243a() {
            Set<Map.Entry> entrySet = ((HashMap) C20587a.this.f57966b).entrySet();
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : entrySet) {
                C20707b bVar = (C20707b) entry.getKey();
                byte[] bArr = (byte[]) entry.getValue();
                if (((HashSet) C20587a.this.f57965a).contains(bVar)) {
                    try {
                        MessageDigest instance = MessageDigest.getInstance("MD5");
                        instance.update(bArr);
                        byte[] digest = instance.digest();
                        StringBuilder sb = new StringBuilder();
                        for (byte b : digest) {
                            if (b < 0 || b > 15) {
                                char[] cArr = C16792a.f45355a;
                                sb.append(cArr[15 & (b >> 4)]);
                                sb.append(cArr[b & 15]);
                            } else {
                                sb.append('0');
                                sb.append(C16792a.f45355a[b]);
                            }
                        }
                        String sb4 = sb.toString();
                        C20707b bVar2 = (C20707b) hashMap.get(sb4);
                        if (bVar2 == null) {
                            hashMap.put(sb4, bVar);
                        } else {
                            ((HashMap) C20587a.this.f57967c).put(bVar2, bVar2);
                            ((HashMap) C20587a.this.f57967c).put(bVar, bVar2);
                        }
                    } catch (NoSuchAlgorithmException e) {
                        throw new IllegalStateException(e);
                    }
                }
            }
            ((HashMap) C20587a.this.f57966b).clear();
        }

        /* renamed from: c */
        public C20594b mo32236c(int i, int i2, long j) {
            return new C20593a((C20594b) null);
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x004a */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057 A[SYNTHETIC, Splitter:B:18:0x0057] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005e A[SYNTHETIC, Splitter:B:22:0x005e] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo32235a(java.io.File r5, java.io.File r6) {
        /*
            r4 = this;
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0053 }
            r1.<init>(r5)     // Catch:{ all -> 0x0053 }
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0051 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x0051 }
            r2.<init>(r6)     // Catch:{ all -> 0x0051 }
            r5.<init>(r2)     // Catch:{ all -> 0x0051 }
            ef.c r6 = new ef.c     // Catch:{ all -> 0x004e }
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ all -> 0x004e }
            r0.<init>(r1)     // Catch:{ all -> 0x004e }
            r6.<init>(r0)     // Catch:{ all -> 0x004e }
            ef.a$b r0 = new ef.a$b     // Catch:{ all -> 0x004e }
            r0.<init>()     // Catch:{ all -> 0x004e }
            r6.mo32254a(r0)     // Catch:{ all -> 0x004e }
            java.nio.channels.FileChannel r0 = r1.getChannel()     // Catch:{ all -> 0x004e }
            r2 = 0
            r0.position(r2)     // Catch:{ all -> 0x004e }
            ef.a$c r0 = new ef.a$c     // Catch:{ all -> 0x004e }
            r0.<init>()     // Catch:{ all -> 0x004e }
            r6.mo32254a(r0)     // Catch:{ all -> 0x004e }
            java.nio.channels.FileChannel r0 = r1.getChannel()     // Catch:{ all -> 0x004e }
            r0.position(r2)     // Catch:{ all -> 0x004e }
            ef.a$a r0 = new ef.a$a     // Catch:{ all -> 0x004e }
            ef.e r2 = new ef.e     // Catch:{ all -> 0x004e }
            r2.<init>(r5)     // Catch:{ all -> 0x004e }
            r0.<init>(r2)     // Catch:{ all -> 0x004e }
            r6.mo32254a(r0)     // Catch:{ all -> 0x004e }
            r5.close()     // Catch:{ all -> 0x004a }
        L_0x004a:
            r1.close()     // Catch:{ all -> 0x004d }
        L_0x004d:
            return
        L_0x004e:
            r6 = move-exception
            r0 = r5
            goto L_0x0055
        L_0x0051:
            r6 = move-exception
            goto L_0x0055
        L_0x0053:
            r6 = move-exception
            r1 = r0
        L_0x0055:
            if (r0 == 0) goto L_0x005c
            r0.close()     // Catch:{ all -> 0x005b }
            goto L_0x005c
        L_0x005b:
        L_0x005c:
            if (r1 == 0) goto L_0x0061
            r1.close()     // Catch:{ all -> 0x0061 }
        L_0x0061:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p334ef.C20587a.mo32235a(java.io.File, java.io.File):void");
    }
}
