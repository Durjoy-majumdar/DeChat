package com.tencent.p014mm.vfs;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.FileSystem;
import com.tencent.stubs.logger.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.tencent.mm.vfs.AccessControlFileSystem */
public class AccessControlFileSystem extends AbstractFileSystem {
    public static final Parcelable.Creator<AccessControlFileSystem> CREATOR = new C116184a();

    /* renamed from: h */
    public static final short[] f348692h;

    /* renamed from: i */
    public static final int f348693i;

    /* renamed from: j */
    public static final ThreadLocal<C116186c> f348694j = new ThreadLocal<>();

    /* renamed from: n */
    public static final char[] f348695n = {'-', 'l', 't', 'x'};

    /* renamed from: o */
    public static final byte[] f348696o;

    /* renamed from: e */
    public final FileSystem f348697e;

    /* renamed from: f */
    public final byte[] f348698f;

    /* renamed from: g */
    public final C116330v f348699g;

    /* renamed from: com.tencent.mm.vfs.AccessControlFileSystem$a */
    public class C116184a implements Parcelable.Creator<AccessControlFileSystem> {
        public Object createFromParcel(Parcel parcel) {
            return new AccessControlFileSystem(parcel);
        }

        public Object[] newArray(int i) {
            return new AccessControlFileSystem[i];
        }
    }

    /* renamed from: com.tencent.mm.vfs.AccessControlFileSystem$b */
    public class C116185b extends C116301h2 {

        /* renamed from: f */
        public final byte[] f348700f;

        public C116185b(FileSystem.C85995c cVar, byte[] bArr, Map<String, Object> map) {
            super(cVar, AccessControlFileSystem.this, map);
            this.f348700f = bArr;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
            if (mo177584G(8, r8) != false) goto L_0x001a;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0038 */
        /* renamed from: B */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo177582B(java.lang.String r8, com.tencent.p014mm.vfs.FileSystem.C85995c r9, java.lang.String r10) {
            /*
                r7 = this;
                byte[] r0 = r7.f348700f
                r1 = 8
                byte r0 = r0[r1]
                if (r0 != 0) goto L_0x000d
                boolean r8 = super.mo177582B(r8, r9, r10)
                return r8
            L_0x000d:
                r2 = 0
                r3 = 3
                r4 = 2
                if (r0 == r3) goto L_0x0028
                if (r0 != r4) goto L_0x001a
                boolean r0 = r7.mo177584G(r1, r8)     // Catch:{ d -> 0x0038, IOException -> 0x0032, all -> 0x002f }
                if (r0 == 0) goto L_0x0028
            L_0x001a:
                boolean r6 = super.mo177582B(r8, r9, r10)     // Catch:{ d -> 0x0038, IOException -> 0x0032, all -> 0x002f }
                r1 = 8
                r0 = r7
                r3 = r8
                r4 = r9
                r5 = r10
                r0.mo177586K(r1, r2, r3, r4, r5)
                return r6
            L_0x0028:
                com.tencent.mm.vfs.AccessControlFileSystem$d r0 = new com.tencent.mm.vfs.AccessControlFileSystem$d     // Catch:{ d -> 0x0038, IOException -> 0x0032, all -> 0x002f }
                r1 = 0
                r0.<init>(r1)     // Catch:{ d -> 0x0038, IOException -> 0x0032, all -> 0x002f }
                throw r0     // Catch:{ d -> 0x0038, IOException -> 0x0032, all -> 0x002f }
            L_0x002f:
                r0 = move-exception
                r3 = 0
                goto L_0x0042
            L_0x0032:
                r0 = move-exception
                r2 = 1
                throw r0     // Catch:{ all -> 0x0035 }
            L_0x0035:
                r0 = move-exception
                r3 = 1
                goto L_0x0042
            L_0x0038:
                java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0040 }
                java.lang.String r1 = "Access denied"
                r0.<init>(r1)     // Catch:{ all -> 0x0040 }
                throw r0     // Catch:{ all -> 0x0040 }
            L_0x0040:
                r0 = move-exception
                r3 = 2
            L_0x0042:
                r2 = 8
                r1 = r7
                r4 = r8
                r5 = r9
                r6 = r10
                r1.mo177586K(r2, r3, r4, r5, r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vfs.AccessControlFileSystem.C116185b.mo177582B(java.lang.String, com.tencent.mm.vfs.FileSystem$c, java.lang.String):boolean");
        }

        /* renamed from: D */
        public boolean mo177583D(String str, FileSystem.C85995c cVar, String str2) {
            int i;
            boolean z;
            byte b = this.f348700f[9];
            if (b == 3 || (b == 2 && !mo177584G(9, str))) {
                z = false;
                i = 2;
            } else {
                z = super.mo177583D(str, cVar, str2);
                i = !z;
            }
            if (b != 0) {
                mo177586K(9, i, str, cVar, str2);
            }
            return z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
        /* renamed from: G */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo177584G(int r6, java.lang.String r7) {
            /*
                r5 = this;
                java.lang.ThreadLocal<com.tencent.mm.vfs.AccessControlFileSystem$c> r0 = com.tencent.p014mm.vfs.AccessControlFileSystem.f348694j
                java.lang.Object r0 = r0.get()
                com.tencent.mm.vfs.AccessControlFileSystem$c r0 = (com.tencent.p014mm.vfs.AccessControlFileSystem.C116186c) r0
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x0073
                if (r6 < 0) goto L_0x006f
                short[] r3 = com.tencent.p014mm.vfs.AccessControlFileSystem.f348692h
                r4 = 10
                if (r6 < r4) goto L_0x0015
                goto L_0x006f
            L_0x0015:
                short r6 = r3[r6]
                int r3 = r0.f348702a
                int r3 = r1 << r3
                r6 = r6 & r3
                if (r6 != 0) goto L_0x001f
                goto L_0x006f
            L_0x001f:
                java.lang.String r6 = r0.f348704c
                boolean r6 = r7.startsWith(r6)
                if (r6 != 0) goto L_0x0028
                goto L_0x006f
            L_0x0028:
                int r6 = r7.length()
                java.lang.String r3 = r0.f348704c
                int r3 = r3.length()
                if (r6 == r3) goto L_0x0043
                java.lang.String r6 = r0.f348704c
                int r6 = r6.length()
                char r6 = r7.charAt(r6)
                r7 = 47
                if (r6 == r7) goto L_0x0043
                goto L_0x006f
            L_0x0043:
                com.tencent.mm.vfs.FileSystem$c r6 = r0.f348703b
                boolean r6 = r5.equals(r6)
                if (r6 == 0) goto L_0x004d
            L_0x004b:
                r6 = 1
                goto L_0x0070
            L_0x004d:
                com.tencent.mm.vfs.FileSystem$c r6 = r0.f348703b
                r7 = 0
                java.lang.Iterable r6 = com.tencent.p014mm.vfs.C116299g2.m163846b(r6, r7)
                java.util.Iterator r6 = r6.iterator()
            L_0x0058:
                boolean r7 = r6.hasNext()
                if (r7 == 0) goto L_0x006f
                java.lang.Object r7 = r6.next()
                com.tencent.mm.vfs.FileSystem$c r7 = (com.tencent.p014mm.vfs.FileSystem.C85995c) r7
                boolean r0 = r7 instanceof com.tencent.p014mm.vfs.AccessControlFileSystem.C116185b
                if (r0 == 0) goto L_0x0058
                boolean r7 = r7.equals(r5)
                if (r7 == 0) goto L_0x0058
                goto L_0x004b
            L_0x006f:
                r6 = 0
            L_0x0070:
                if (r6 == 0) goto L_0x0073
                goto L_0x0074
            L_0x0073:
                r1 = 0
            L_0x0074:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vfs.AccessControlFileSystem.C116185b.mo177584G(int, java.lang.String):boolean");
        }

        /* renamed from: H */
        public void mo177585H(int i, int i2, String str) {
            mo177781F(0, "op", Integer.valueOf(i), "result", Integer.valueOf(i2), "path", str);
        }

        /* renamed from: K */
        public void mo177586K(int i, int i2, String str, FileSystem.C85995c cVar, String str2) {
            mo177781F(0, "op", Integer.valueOf(i), "result", Integer.valueOf(i2), "path", str, "targetFS", cVar, "targetPath", str2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
            if (mo177584G(1, r6) != false) goto L_0x0019;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x002f */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.nio.channels.WritableByteChannel mo119932b(java.lang.String r6, boolean r7) {
            /*
                r5 = this;
                byte[] r0 = r5.f348700f
                r1 = 1
                byte r0 = r0[r1]
                if (r0 != 0) goto L_0x000c
                java.nio.channels.WritableByteChannel r6 = super.mo119932b(r6, r7)
                return r6
            L_0x000c:
                r2 = 0
                r3 = 3
                r4 = 2
                if (r0 == r3) goto L_0x0021
                if (r0 != r4) goto L_0x0019
                boolean r0 = r5.mo177584G(r1, r6)     // Catch:{ d -> 0x002f, FileNotFoundException -> 0x002a, all -> 0x0028 }
                if (r0 == 0) goto L_0x0021
            L_0x0019:
                java.nio.channels.WritableByteChannel r7 = super.mo119932b(r6, r7)     // Catch:{ d -> 0x002f, FileNotFoundException -> 0x002a, all -> 0x0028 }
                r5.mo177585H(r1, r2, r6)
                return r7
            L_0x0021:
                com.tencent.mm.vfs.AccessControlFileSystem$d r7 = new com.tencent.mm.vfs.AccessControlFileSystem$d     // Catch:{ d -> 0x002f, FileNotFoundException -> 0x002a, all -> 0x0028 }
                r0 = 0
                r7.<init>(r0)     // Catch:{ d -> 0x002f, FileNotFoundException -> 0x002a, all -> 0x0028 }
                throw r7     // Catch:{ d -> 0x002f, FileNotFoundException -> 0x002a, all -> 0x0028 }
            L_0x0028:
                r7 = move-exception
                goto L_0x0039
            L_0x002a:
                r7 = move-exception
                throw r7     // Catch:{ all -> 0x002c }
            L_0x002c:
                r7 = move-exception
                r2 = 1
                goto L_0x0039
            L_0x002f:
                java.io.FileNotFoundException r7 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0037 }
                java.lang.String r0 = "Access denied"
                r7.<init>(r0)     // Catch:{ all -> 0x0037 }
                throw r7     // Catch:{ all -> 0x0037 }
            L_0x0037:
                r7 = move-exception
                r2 = 2
            L_0x0039:
                r5.mo177585H(r1, r2, r6)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vfs.AccessControlFileSystem.C116185b.mo119932b(java.lang.String, boolean):java.nio.channels.WritableByteChannel");
        }

        /* renamed from: c */
        public boolean mo119933c(String str) {
            boolean z;
            byte b = this.f348700f[3];
            int i = 2;
            if (b == 3 || (b == 2 && !mo177584G(3, str))) {
                z = false;
            } else {
                boolean c = super.mo119933c(str);
                z = c;
                i = !c;
            }
            if (b != 0) {
                mo177585H(3, i, str);
            }
            return z;
        }

        /* renamed from: e */
        public boolean mo119935e(String str, long j) {
            return super.mo119935e(str, j);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C116185b)) {
                return false;
            }
            C116185b bVar = (C116185b) obj;
            return this.f349014e.equals(bVar.f349014e) && Arrays.equals(this.f348700f, bVar.f348700f);
        }

        /* renamed from: g */
        public boolean mo119937g(String str) {
            boolean z;
            byte b = this.f348700f[5];
            int i = 2;
            if (b == 3 || (b == 2 && !mo177584G(5, str))) {
                z = false;
            } else {
                boolean g = super.mo119937g(str);
                z = g;
                i = !g;
            }
            if (b != 0) {
                mo177585H(5, i, str);
            }
            return z;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
            if (mo177584G(0, r5) != false) goto L_0x0018;
         */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.nio.channels.ReadableByteChannel mo119938h(java.lang.String r5) {
            /*
                r4 = this;
                byte[] r0 = r4.f348700f
                r1 = 0
                byte r0 = r0[r1]
                if (r0 != 0) goto L_0x000c
                java.nio.channels.ReadableByteChannel r5 = super.mo119938h(r5)
                return r5
            L_0x000c:
                r2 = 3
                r3 = 2
                if (r0 == r2) goto L_0x0020
                if (r0 != r3) goto L_0x0018
                boolean r0 = r4.mo177584G(r1, r5)     // Catch:{ d -> 0x002d, FileNotFoundException -> 0x002a, all -> 0x0027 }
                if (r0 == 0) goto L_0x0020
            L_0x0018:
                java.nio.channels.ReadableByteChannel r0 = super.mo119938h(r5)     // Catch:{ d -> 0x002d, FileNotFoundException -> 0x002a, all -> 0x0027 }
                r4.mo177585H(r1, r1, r5)
                return r0
            L_0x0020:
                com.tencent.mm.vfs.AccessControlFileSystem$d r0 = new com.tencent.mm.vfs.AccessControlFileSystem$d     // Catch:{ d -> 0x002d, FileNotFoundException -> 0x002a, all -> 0x0027 }
                r2 = 0
                r0.<init>(r2)     // Catch:{ d -> 0x002d, FileNotFoundException -> 0x002a, all -> 0x0027 }
                throw r0     // Catch:{ d -> 0x002d, FileNotFoundException -> 0x002a, all -> 0x0027 }
            L_0x0027:
                r0 = move-exception
                r3 = 0
                goto L_0x0036
            L_0x002a:
                r0 = move-exception
                r3 = 1
                throw r0     // Catch:{ all -> 0x0035 }
            L_0x002d:
                java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0035 }
                java.lang.String r2 = "Access denied"
                r0.<init>(r2)     // Catch:{ all -> 0x0035 }
                throw r0     // Catch:{ all -> 0x0035 }
            L_0x0035:
                r0 = move-exception
            L_0x0036:
                r4.mo177585H(r1, r3, r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vfs.AccessControlFileSystem.C116185b.mo119938h(java.lang.String):java.nio.channels.ReadableByteChannel");
        }

        public int hashCode() {
            int hashCode = C116185b.class.hashCode();
            Object[] objArr = {this.f349014e, this.f348700f};
            Pattern pattern = C116299g2.f349012a;
            return hashCode ^ Arrays.deepHashCode(objArr);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
            if (mo177584G(r0, r6) != false) goto L_0x001e;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0032 */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.os.ParcelFileDescriptor mo119939i(java.lang.String r6, java.lang.String r7) {
            /*
                r5 = this;
                java.lang.String r0 = "w"
                boolean r0 = r7.contains(r0)
                byte[] r1 = r5.f348700f
                byte r1 = r1[r0]
                if (r1 != 0) goto L_0x0011
                android.os.ParcelFileDescriptor r6 = super.mo119939i(r6, r7)
                return r6
            L_0x0011:
                r2 = 0
                r3 = 3
                r4 = 2
                if (r1 == r3) goto L_0x0026
                if (r1 != r4) goto L_0x001e
                boolean r1 = r5.mo177584G(r0, r6)     // Catch:{ d -> 0x0032, FileNotFoundException -> 0x002f }
                if (r1 == 0) goto L_0x0026
            L_0x001e:
                android.os.ParcelFileDescriptor r7 = super.mo119939i(r6, r7)     // Catch:{ d -> 0x0032, FileNotFoundException -> 0x002f }
                r5.mo177585H(r0, r2, r6)
                return r7
            L_0x0026:
                com.tencent.mm.vfs.AccessControlFileSystem$d r7 = new com.tencent.mm.vfs.AccessControlFileSystem$d     // Catch:{ d -> 0x0032, FileNotFoundException -> 0x002f }
                r1 = 0
                r7.<init>(r1)     // Catch:{ d -> 0x0032, FileNotFoundException -> 0x002f }
                throw r7     // Catch:{ d -> 0x0032, FileNotFoundException -> 0x002f }
            L_0x002d:
                r7 = move-exception
                goto L_0x003c
            L_0x002f:
                r7 = move-exception
                r2 = 1
                throw r7     // Catch:{ all -> 0x002d }
            L_0x0032:
                java.io.FileNotFoundException r7 = new java.io.FileNotFoundException     // Catch:{ all -> 0x003a }
                java.lang.String r1 = "Access denied"
                r7.<init>(r1)     // Catch:{ all -> 0x003a }
                throw r7     // Catch:{ all -> 0x003a }
            L_0x003a:
                r7 = move-exception
                r2 = 2
            L_0x003c:
                r5.mo177585H(r0, r2, r6)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vfs.AccessControlFileSystem.C116185b.mo119939i(java.lang.String, java.lang.String):android.os.ParcelFileDescriptor");
        }

        public Iterable<C86001b0> list(String str) {
            Iterable<C86001b0> iterable;
            byte b = this.f348700f[4];
            int i = 2;
            if (b == 3 || (b == 2 && !mo177584G(4, str))) {
                iterable = null;
            } else {
                Iterable<C86001b0> list = super.list(str);
                iterable = list;
                i = list != null ? 0 : 1;
            }
            if (b != 0) {
                mo177585H(4, i, str);
            }
            return iterable;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
            if (mo177584G(1, r6) != false) goto L_0x0019;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x002f */
        /* renamed from: m */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.io.OutputStream mo119941m(java.lang.String r6, boolean r7) {
            /*
                r5 = this;
                byte[] r0 = r5.f348700f
                r1 = 1
                byte r0 = r0[r1]
                if (r0 != 0) goto L_0x000c
                java.io.OutputStream r6 = super.mo119941m(r6, r7)
                return r6
            L_0x000c:
                r2 = 0
                r3 = 3
                r4 = 2
                if (r0 == r3) goto L_0x0021
                if (r0 != r4) goto L_0x0019
                boolean r0 = r5.mo177584G(r1, r6)     // Catch:{ d -> 0x002f, FileNotFoundException -> 0x002a, all -> 0x0028 }
                if (r0 == 0) goto L_0x0021
            L_0x0019:
                java.io.OutputStream r7 = super.mo119941m(r6, r7)     // Catch:{ d -> 0x002f, FileNotFoundException -> 0x002a, all -> 0x0028 }
                r5.mo177585H(r1, r2, r6)
                return r7
            L_0x0021:
                com.tencent.mm.vfs.AccessControlFileSystem$d r7 = new com.tencent.mm.vfs.AccessControlFileSystem$d     // Catch:{ d -> 0x002f, FileNotFoundException -> 0x002a, all -> 0x0028 }
                r0 = 0
                r7.<init>(r0)     // Catch:{ d -> 0x002f, FileNotFoundException -> 0x002a, all -> 0x0028 }
                throw r7     // Catch:{ d -> 0x002f, FileNotFoundException -> 0x002a, all -> 0x0028 }
            L_0x0028:
                r7 = move-exception
                goto L_0x0039
            L_0x002a:
                r7 = move-exception
                throw r7     // Catch:{ all -> 0x002c }
            L_0x002c:
                r7 = move-exception
                r2 = 1
                goto L_0x0039
            L_0x002f:
                java.io.FileNotFoundException r7 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0037 }
                java.lang.String r0 = "Access denied"
                r7.<init>(r0)     // Catch:{ all -> 0x0037 }
                throw r7     // Catch:{ all -> 0x0037 }
            L_0x0037:
                r7 = move-exception
                r2 = 2
            L_0x0039:
                r5.mo177585H(r1, r2, r6)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vfs.AccessControlFileSystem.C116185b.mo119941m(java.lang.String, boolean):java.io.OutputStream");
        }

        /* renamed from: o */
        public boolean mo119942o(String str, boolean z) {
            boolean z2;
            byte b = this.f348700f[3];
            int i = 2;
            if (b == 3 || (b == 2 && !mo177584G(3, str))) {
                z2 = false;
            } else {
                z2 = super.mo119942o(str, z);
                i = !z2;
            }
            if (b != 0) {
                mo177585H(3, i, str);
            }
            return z2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
            if (mo177584G(0, r5) != false) goto L_0x0018;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.io.InputStream openRead(java.lang.String r5) {
            /*
                r4 = this;
                byte[] r0 = r4.f348700f
                r1 = 0
                byte r0 = r0[r1]
                if (r0 != 0) goto L_0x000c
                java.io.InputStream r5 = super.openRead(r5)
                return r5
            L_0x000c:
                r2 = 3
                r3 = 2
                if (r0 == r2) goto L_0x0020
                if (r0 != r3) goto L_0x0018
                boolean r0 = r4.mo177584G(r1, r5)     // Catch:{ d -> 0x002d, FileNotFoundException -> 0x002a, all -> 0x0027 }
                if (r0 == 0) goto L_0x0020
            L_0x0018:
                java.io.InputStream r0 = super.openRead(r5)     // Catch:{ d -> 0x002d, FileNotFoundException -> 0x002a, all -> 0x0027 }
                r4.mo177585H(r1, r1, r5)
                return r0
            L_0x0020:
                com.tencent.mm.vfs.AccessControlFileSystem$d r0 = new com.tencent.mm.vfs.AccessControlFileSystem$d     // Catch:{ d -> 0x002d, FileNotFoundException -> 0x002a, all -> 0x0027 }
                r2 = 0
                r0.<init>(r2)     // Catch:{ d -> 0x002d, FileNotFoundException -> 0x002a, all -> 0x0027 }
                throw r0     // Catch:{ d -> 0x002d, FileNotFoundException -> 0x002a, all -> 0x0027 }
            L_0x0027:
                r0 = move-exception
                r3 = 0
                goto L_0x0036
            L_0x002a:
                r0 = move-exception
                r3 = 1
                throw r0     // Catch:{ all -> 0x0035 }
            L_0x002d:
                java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0035 }
                java.lang.String r2 = "Access denied"
                r0.<init>(r2)     // Catch:{ all -> 0x0035 }
                throw r0     // Catch:{ all -> 0x0035 }
            L_0x0035:
                r0 = move-exception
            L_0x0036:
                r4.mo177585H(r1, r3, r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vfs.AccessControlFileSystem.C116185b.openRead(java.lang.String):java.io.InputStream");
        }

        /* renamed from: q */
        public C86001b0 mo119945q(String str) {
            int i;
            C86001b0 b0Var;
            byte b = this.f348700f[2];
            if (b == 3 || (b == 2 && !mo177584G(2, str))) {
                b0Var = null;
                i = 2;
            } else {
                b0Var = super.mo119945q(str);
                i = b0Var != null ? 0 : 1;
            }
            if (b != 0) {
                mo177585H(2, i, str);
            }
            return b0Var;
        }

        public String toString() {
            return String.format("ac(%s) <- %s", new Object[]{AccessControlFileSystem.m163530b(this.f348700f), this.f349014e});
        }

        /* renamed from: u */
        public FileSystem mo119930u() {
            return AccessControlFileSystem.this;
        }

        /* renamed from: w */
        public String mo119947w(String str, boolean z) {
            int i;
            String str2;
            byte b = this.f348700f[6];
            if (b == 3 || (b == 2 && !mo177584G(6, str))) {
                str2 = null;
                i = 2;
            } else {
                str2 = super.mo119947w(str, z);
                i = str2 != null ? 0 : 1;
            }
            if (b != 0) {
                mo177781F(0, "op", 6, "result", Integer.valueOf(i), "path", str, "forWrite", Boolean.valueOf(z));
            }
            return str2;
        }

        /* renamed from: x */
        public boolean mo119948x(String str) {
            int i;
            boolean z;
            byte b = this.f348700f[2];
            if (b == 3 || (b == 2 && !mo177584G(2, str))) {
                z = false;
                i = 2;
            } else {
                z = super.mo119948x(str);
                i = !z;
            }
            if (b != 0) {
                mo177585H(2, i, str);
            }
            return z;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
            if (mo177584G(7, r9) != false) goto L_0x0019;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0032 */
        /* renamed from: z */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo177589z(java.lang.String r9, com.tencent.p014mm.vfs.FileSystem.C85995c r10, java.lang.String r11, boolean r12) {
            /*
                r8 = this;
                byte[] r0 = r8.f348700f
                r1 = 7
                byte r0 = r0[r1]
                if (r0 != 0) goto L_0x000c
                long r9 = super.mo177589z(r9, r10, r11, r12)
                return r9
            L_0x000c:
                r2 = 0
                r3 = 3
                r4 = 2
                if (r0 == r3) goto L_0x0026
                if (r0 != r4) goto L_0x0019
                boolean r0 = r8.mo177584G(r1, r9)     // Catch:{ d -> 0x0032, IOException -> 0x002f }
                if (r0 == 0) goto L_0x0026
            L_0x0019:
                long r6 = super.mo177589z(r9, r10, r11, r12)     // Catch:{ d -> 0x0032, IOException -> 0x002f }
                r1 = 7
                r0 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r0.mo177586K(r1, r2, r3, r4, r5)
                return r6
            L_0x0026:
                com.tencent.mm.vfs.AccessControlFileSystem$d r12 = new com.tencent.mm.vfs.AccessControlFileSystem$d     // Catch:{ d -> 0x0032, IOException -> 0x002f }
                r0 = 0
                r12.<init>(r0)     // Catch:{ d -> 0x0032, IOException -> 0x002f }
                throw r12     // Catch:{ d -> 0x0032, IOException -> 0x002f }
            L_0x002d:
                r12 = move-exception
                goto L_0x003c
            L_0x002f:
                r12 = move-exception
                r2 = 1
                throw r12     // Catch:{ all -> 0x002d }
            L_0x0032:
                java.io.FileNotFoundException r12 = new java.io.FileNotFoundException     // Catch:{ all -> 0x003a }
                java.lang.String r0 = "Access denied"
                r12.<init>(r0)     // Catch:{ all -> 0x003a }
                throw r12     // Catch:{ all -> 0x003a }
            L_0x003a:
                r12 = move-exception
                r2 = 2
            L_0x003c:
                r1 = 7
                r0 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r0.mo177586K(r1, r2, r3, r4, r5)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vfs.AccessControlFileSystem.C116185b.mo177589z(java.lang.String, com.tencent.mm.vfs.FileSystem$c, java.lang.String, boolean):long");
        }
    }

    /* renamed from: com.tencent.mm.vfs.AccessControlFileSystem$c */
    public static final class C116186c {

        /* renamed from: a */
        public final int f348702a;

        /* renamed from: b */
        public final FileSystem.C85995c f348703b;

        /* renamed from: c */
        public final String f348704c;

        /* renamed from: d */
        public final Throwable f348705d;

        public C116186c(int i, FileSystem.C85995c cVar, String str) {
            if (i < 0 || i >= AccessControlFileSystem.f348693i) {
                throw new IllegalArgumentException("Illegal access token: " + i);
            }
            this.f348702a = i;
            this.f348703b = cVar;
            this.f348704c = str;
            this.f348705d = new Throwable();
        }
    }

    /* renamed from: com.tencent.mm.vfs.AccessControlFileSystem$d */
    public static final class C116187d extends RuntimeException {
        public C116187d(C116184a aVar) {
        }
    }

    static {
        short[] sArr = {1, 2, Short.MAX_VALUE, 8, 16, 32, 584, 130, 258, 520};
        f348692h = sArr;
        int length = sArr.length;
        f348693i = length;
        f348696o = new byte[length];
    }

    public AccessControlFileSystem(FileSystem fileSystem, String str) {
        this.f348697e = fileSystem;
        C116330v vVar = new C116330v(str);
        String a = vVar.mo177821a(Collections.emptyMap());
        if (a != null) {
            byte[] e = m163533e(a);
            this.f348698f = e;
            if (e != null) {
                this.f348699g = null;
                return;
            }
            throw new IllegalArgumentException("Unrecognized access control list: " + a);
        }
        this.f348698f = new byte[f348693i];
        this.f348699g = vVar;
    }

    /* renamed from: b */
    public static String m163530b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(f348693i);
        for (int i = 0; i < f348693i; i++) {
            sb.append(f348695n[bArr[i]]);
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static void m163531c(int i, Uri uri) {
        ThreadLocal<C116186c> threadLocal = f348694j;
        C116186c cVar = threadLocal.get();
        if (cVar == null) {
            C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(uri, (C116281f0.C116288h) null);
            threadLocal.set(new C116186c(i, l.f348991a, l.f348992b));
            return;
        }
        StringWriter stringWriter = new StringWriter(1024);
        cVar.f348705d.printStackTrace(new PrintWriter(stringWriter));
        throw new AssertionError("Acquired token not released:\n" + stringWriter);
    }

    /* renamed from: d */
    public static void m163532d(int i, String str) {
        m163531c(i, C116299g2.m163858n(str));
    }

    /* renamed from: e */
    public static byte[] m163533e(String str) {
        byte[] bArr = new byte[f348693i];
        for (int i = 0; i < Math.min(str.length(), f348693i); i++) {
            char charAt = str.charAt(i);
            if (charAt != '-') {
                if (charAt != 'L') {
                    if (charAt != 'T') {
                        if (charAt != 'X') {
                            if (charAt != 'l') {
                                if (charAt != 't') {
                                    if (charAt != 'x') {
                                        Log.m106497e("VFS.AccessControlFileSystem", "Unrecognized access policy: " + str.charAt(i) + ", from " + str);
                                        return null;
                                    }
                                }
                            }
                        }
                        bArr[i] = 3;
                    }
                    bArr[i] = 2;
                }
                bArr[i] = 1;
            } else {
                bArr[i] = 0;
            }
        }
        return bArr;
    }

    /* renamed from: f */
    public static void m163534f(int i) {
        ThreadLocal<C116186c> threadLocal = f348694j;
        C116186c cVar = threadLocal.get();
        if (cVar == null) {
            throw new AssertionError("Token not acquired.");
        } else if (cVar.f348702a == i) {
            threadLocal.remove();
        } else {
            throw new AssertionError("Previous token access not matched.");
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AccessControlFileSystem)) {
            return false;
        }
        AccessControlFileSystem accessControlFileSystem = (AccessControlFileSystem) obj;
        return this.f348697e.equals(accessControlFileSystem.f348697e) && Arrays.equals(this.f348698f, accessControlFileSystem.f348698f) && C116299g2.m163849e(this.f348699g, accessControlFileSystem.f348699g);
    }

    public int hashCode() {
        int hashCode = AccessControlFileSystem.class.hashCode();
        Object[] objArr = {this.f348697e, this.f348698f, this.f348699g};
        Pattern pattern = C116299g2.f349012a;
        return hashCode ^ Arrays.deepHashCode(objArr);
    }

    public String toString() {
        Object[] objArr = new Object[2];
        objArr[0] = this.f348699g == null ? m163530b(this.f348698f) : "...";
        objArr[1] = this.f348697e;
        return String.format("ac(%s) <- %s", objArr);
    }

    /* renamed from: v */
    public Object mo177578v(Map map) {
        String a;
        byte[] e;
        byte[] bArr = this.f348698f;
        C116330v vVar = this.f348699g;
        if (!(vVar == null || (a = vVar.mo177821a(map)) == null || (e = m163533e(a)) == null)) {
            bArr = e;
        }
        FileSystem.C85995c cVar = (FileSystem.C85995c) this.f348697e.mo177578v(map);
        return (cVar == NullFileSystem.m163697z() || Arrays.equals(bArr, f348696o)) ? cVar : new C116185b(cVar, bArr, map);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C116299g2.m163866v(parcel, AccessControlFileSystem.class, 1);
        parcel.writeParcelable(this.f348697e, i);
        parcel.writeByteArray(this.f348698f);
        C116330v vVar = this.f348699g;
        parcel.writeString(vVar == null ? null : vVar.f349099a);
    }

    public AccessControlFileSystem(Parcel parcel) {
        C116330v vVar;
        C116299g2.m163845a(parcel, AccessControlFileSystem.class, 1);
        FileSystem fileSystem = (FileSystem) parcel.readParcelable(getClass().getClassLoader());
        this.f348697e = fileSystem;
        if (fileSystem != null) {
            byte[] bArr = new byte[f348693i];
            this.f348698f = bArr;
            parcel.readByteArray(bArr);
            String readString = parcel.readString();
            if (readString == null) {
                vVar = null;
            } else {
                vVar = new C116330v(readString);
            }
            this.f348699g = vVar;
            return;
        }
        throw new IllegalArgumentException("Wrong wrapped filesystem.");
    }
}
