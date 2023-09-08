package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.C80173r;
import java.io.File;
import java.io.FileInputStream;

/* renamed from: com.facebook.soloader.i */
public final class C80154i extends C80173r {

    /* renamed from: com.facebook.soloader.i$b */
    public final class C80156b extends C80173r.C80180g {

        /* renamed from: d */
        public final C80158c[] f234666d;

        /* renamed from: com.facebook.soloader.i$b$a */
        public final class C80157a extends C80173r.C80178e {

            /* renamed from: d */
            public int f234667d;

            public C80157a(C80155a aVar) {
            }

            /* renamed from: a */
            public boolean mo110977a() {
                return this.f234667d < C80156b.this.f234666d.length;
            }

            /* renamed from: b */
            public C80173r.C80177d mo110978b() {
                C80158c[] cVarArr = C80156b.this.f234666d;
                int i = this.f234667d;
                this.f234667d = i + 1;
                C80158c cVar = cVarArr[i];
                FileInputStream fileInputStream = new FileInputStream(cVar.f234669f);
                try {
                    return new C80173r.C80179f(cVar, fileInputStream);
                } catch (Throwable th) {
                    fileInputStream.close();
                    throw th;
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
            r7.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00eb, code lost:
            r9.close();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C80156b(com.facebook.soloader.C80154i r17, com.facebook.soloader.C80173r r18) {
            /*
                r16 = this;
                r16.<init>()
                r0 = r17
                android.content.Context r0 = r0.f234699c
                java.io.File r1 = new java.io.File
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "/data/local/tmp/exopackage/"
                r2.append(r3)
                java.lang.String r0 = r0.getPackageName()
                r2.append(r0)
                java.lang.String r0 = "/native-libs/"
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
                r2.<init>()
                int r3 = android.os.Build.VERSION.SDK_INT
                r4 = 23
                if (r3 < r4) goto L_0x003b
                java.lang.String[] r3 = com.facebook.soloader.SysUtil.C80144a.m97443a()
                goto L_0x003f
            L_0x003b:
                java.lang.String[] r3 = com.facebook.soloader.SysUtil.LollipopSysdeps.getSupportedAbis()
            L_0x003f:
                int r4 = r3.length
                r5 = 0
                r6 = 0
            L_0x0042:
                if (r6 >= r4) goto L_0x0110
                r7 = r3[r6]
                java.io.File r8 = new java.io.File
                r8.<init>(r1, r7)
                boolean r9 = r8.isDirectory()
                if (r9 != 0) goto L_0x0053
                goto L_0x00ee
            L_0x0053:
                r2.add(r7)
                java.io.File r7 = new java.io.File
                java.lang.String r9 = "metadata.txt"
                r7.<init>(r8, r9)
                boolean r9 = r7.isFile()
                if (r9 != 0) goto L_0x0065
                goto L_0x00ee
            L_0x0065:
                java.io.FileReader r9 = new java.io.FileReader
                r9.<init>(r7)
                java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ all -> 0x0101 }
                r7.<init>(r9)     // Catch:{ all -> 0x0101 }
            L_0x006f:
                java.lang.String r10 = r7.readLine()     // Catch:{ all -> 0x00f2 }
                if (r10 == 0) goto L_0x00e8
                int r11 = r10.length()     // Catch:{ all -> 0x00f2 }
                if (r11 != 0) goto L_0x007c
                goto L_0x006f
            L_0x007c:
                r11 = 32
                int r11 = r10.indexOf(r11)     // Catch:{ all -> 0x00f2 }
                r12 = -1
                if (r11 == r12) goto L_0x00cc
                java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f2 }
                r12.<init>()     // Catch:{ all -> 0x00f2 }
                java.lang.String r13 = r10.substring(r5, r11)     // Catch:{ all -> 0x00f2 }
                r12.append(r13)     // Catch:{ all -> 0x00f2 }
                java.lang.String r13 = ".so"
                r12.append(r13)     // Catch:{ all -> 0x00f2 }
                java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x00f2 }
                int r13 = r0.size()     // Catch:{ all -> 0x00f2 }
                r14 = 0
            L_0x009f:
                if (r14 >= r13) goto L_0x00b4
                java.lang.Object r15 = r0.get(r14)     // Catch:{ all -> 0x00f2 }
                com.facebook.soloader.i$c r15 = (com.facebook.soloader.C80154i.C80158c) r15     // Catch:{ all -> 0x00f2 }
                java.lang.String r15 = r15.f234708d     // Catch:{ all -> 0x00f2 }
                boolean r15 = r15.equals(r12)     // Catch:{ all -> 0x00f2 }
                if (r15 == 0) goto L_0x00b1
                r13 = 1
                goto L_0x00b5
            L_0x00b1:
                int r14 = r14 + 1
                goto L_0x009f
            L_0x00b4:
                r13 = 0
            L_0x00b5:
                if (r13 == 0) goto L_0x00b8
                goto L_0x006f
            L_0x00b8:
                int r11 = r11 + 1
                java.lang.String r10 = r10.substring(r11)     // Catch:{ all -> 0x00f2 }
                com.facebook.soloader.i$c r11 = new com.facebook.soloader.i$c     // Catch:{ all -> 0x00f2 }
                java.io.File r13 = new java.io.File     // Catch:{ all -> 0x00f2 }
                r13.<init>(r8, r10)     // Catch:{ all -> 0x00f2 }
                r11.<init>(r12, r10, r13)     // Catch:{ all -> 0x00f2 }
                r0.add(r11)     // Catch:{ all -> 0x00f2 }
                goto L_0x006f
            L_0x00cc:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x00f2 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f2 }
                r1.<init>()     // Catch:{ all -> 0x00f2 }
                java.lang.String r2 = "illegal line in exopackage metadata: ["
                r1.append(r2)     // Catch:{ all -> 0x00f2 }
                r1.append(r10)     // Catch:{ all -> 0x00f2 }
                java.lang.String r2 = "]"
                r1.append(r2)     // Catch:{ all -> 0x00f2 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00f2 }
                r0.<init>(r1)     // Catch:{ all -> 0x00f2 }
                throw r0     // Catch:{ all -> 0x00f2 }
            L_0x00e8:
                r7.close()     // Catch:{ all -> 0x0101 }
                r9.close()
            L_0x00ee:
                int r6 = r6 + 1
                goto L_0x0042
            L_0x00f2:
                r0 = move-exception
                r1 = r0
                throw r1     // Catch:{ all -> 0x00f5 }
            L_0x00f5:
                r0 = move-exception
                r2 = r0
                r7.close()     // Catch:{ all -> 0x00fb }
                goto L_0x0100
            L_0x00fb:
                r0 = move-exception
                r3 = r0
                r1.addSuppressed(r3)     // Catch:{ all -> 0x0101 }
            L_0x0100:
                throw r2     // Catch:{ all -> 0x0101 }
            L_0x0101:
                r0 = move-exception
                r1 = r0
                throw r1     // Catch:{ all -> 0x0104 }
            L_0x0104:
                r0 = move-exception
                r2 = r0
                r9.close()     // Catch:{ all -> 0x010a }
                goto L_0x010f
            L_0x010a:
                r0 = move-exception
                r3 = r0
                r1.addSuppressed(r3)
            L_0x010f:
                throw r2
            L_0x0110:
                int r1 = r2.size()
                java.lang.String[] r1 = new java.lang.String[r1]
                java.lang.Object[] r1 = r2.toArray(r1)
                java.lang.String[] r1 = (java.lang.String[]) r1
                r18.getClass()
                int r1 = r0.size()
                com.facebook.soloader.i$c[] r1 = new com.facebook.soloader.C80154i.C80158c[r1]
                java.lang.Object[] r0 = r0.toArray(r1)
                com.facebook.soloader.i$c[] r0 = (com.facebook.soloader.C80154i.C80158c[]) r0
                r1 = r16
                r1.f234666d = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C80154i.C80156b.<init>(com.facebook.soloader.i, com.facebook.soloader.r):void");
        }

        /* renamed from: a */
        public C80173r.C80176c mo110975a() {
            return new C80173r.C80176c(this.f234666d);
        }

        /* renamed from: b */
        public C80173r.C80178e mo110976b() {
            return new C80157a((C80155a) null);
        }
    }

    /* renamed from: com.facebook.soloader.i$c */
    public static final class C80158c extends C80173r.C80175b {

        /* renamed from: f */
        public final File f234669f;

        public C80158c(String str, String str2, File file) {
            super(str, str2);
            this.f234669f = file;
        }
    }

    public C80154i(Context context, String str) {
        super(context, str);
    }

    /* renamed from: k */
    public C80173r.C80180g mo110958k() {
        return new C80156b(this, this);
    }
}
