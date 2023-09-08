package com.tencent.p014mm.vfs;

import android.os.CancellationSignal;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.system.ErrnoException;
import android.system.Os;
import android.system.StructStat;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.FileSystem;
import com.tencent.stubs.logger.Log;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import qp3.C118196a;
import qp3.C118204f;

/* renamed from: com.tencent.mm.vfs.RefCountedFileSystem */
public class RefCountedFileSystem extends AbstractFileSystem {
    public static final Parcelable.Creator<RefCountedFileSystem> CREATOR = new C116243a();

    /* renamed from: e */
    public final FileSystem f348827e;

    /* renamed from: com.tencent.mm.vfs.RefCountedFileSystem$a */
    public class C116243a implements Parcelable.Creator<RefCountedFileSystem> {
        public Object createFromParcel(Parcel parcel) {
            return new RefCountedFileSystem(parcel);
        }

        public Object[] newArray(int i) {
            return new RefCountedFileSystem[i];
        }
    }

    /* renamed from: com.tencent.mm.vfs.RefCountedFileSystem$b */
    public static class C116244b {

        /* renamed from: a */
        public ArrayList<RandomAccessFile> f348828a;

        /* renamed from: b */
        public final FileLock f348829b;

        /* renamed from: c */
        public int f348830c;

        public C116244b(RandomAccessFile randomAccessFile, boolean z) {
            this.f348830c = z ? -1 : 1;
            this.f348829b = randomAccessFile.getChannel().lock(0, MAlarmHandler.NEXT_FIRE_INTERVAL, !z);
        }
    }

    /* renamed from: com.tencent.mm.vfs.RefCountedFileSystem$c */
    public class C116245c extends C116264a implements FileSystem.C85994b {

        /* renamed from: e */
        public final FileSystem.C85995c f348831e;

        /* renamed from: f */
        public boolean f348832f = false;

        /* renamed from: com.tencent.mm.vfs.RefCountedFileSystem$c$a */
        public class C116246a implements C118204f.C118205a<C86001b0, C86001b0> {
            public C116246a(C116245c cVar) {
            }

            /* renamed from: f */
            public Object mo105957f(Object obj) {
                C86001b0 b0Var = (C86001b0) obj;
                if (".ref".equals(b0Var.f250472b)) {
                    return null;
                }
                return b0Var;
            }
        }

        /* renamed from: com.tencent.mm.vfs.RefCountedFileSystem$c$b */
        public class C116247b implements C118204f.C118205a<C86001b0, C86001b0> {
            public C116247b() {
            }

            /* renamed from: f */
            public Object mo105957f(Object obj) {
                C86001b0 b0Var = (C86001b0) obj;
                String str = b0Var.f250472b;
                if (str.charAt(str.length() - 1) != 8982) {
                    C116245c cVar = C116245c.this;
                    cVar.getClass();
                    return new C86001b0(cVar, b0Var.f250471a, b0Var.f250472b, b0Var.f250473c, b0Var.f250474d, b0Var.f250475e, b0Var.f250476f);
                }
                C116245c cVar2 = C116245c.this;
                String str2 = b0Var.f250471a;
                return cVar2.mo177741H(str2.substring(0, str2.length() - 1), b0Var);
            }
        }

        public C116245c(FileSystem.C85995c cVar) {
            this.f348831e = cVar;
            if ((cVar.mo119936f() & 2) == 0) {
                throw new IllegalArgumentException("The wrapped filesystem must have CAP_DIRECT_ACCESS.");
            }
        }

        /* renamed from: B */
        public boolean mo177582B(String str, FileSystem.C85995c cVar, String str2) {
            if (mo177742K(str2) == null) {
                if (!this.f348831e.mo119946t(str, cVar, str2)) {
                    return false;
                }
                mo177743M(str);
                return true;
            } else if (cVar != this) {
                return false;
            } else {
                mo177743M(str);
                mo177740G(str2, str);
                this.f348831e.mo119933c(str);
                return mo177743M(str2);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:66:0x0170 A[SYNTHETIC, Splitter:B:66:0x0170] */
        /* renamed from: G */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo177740G(java.lang.String r17, java.lang.String r18) {
            /*
                r16 = this;
                r1 = r16
                r2 = r17
                r3 = r18
                com.tencent.mm.vfs.FileSystem$c r0 = r1.f348831e
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r2)
                r5 = 8982(0x2316, float:1.2586E-41)
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                r6 = 1
                java.lang.String r0 = r0.mo119947w(r4, r6)
                com.tencent.mm.vfs.FileSystem$c r4 = r1.f348831e
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r3)
                r7.append(r5)
                java.lang.String r7 = r7.toString()
                java.lang.String r4 = r4.mo119947w(r7, r6)
                if (r0 == 0) goto L_0x01be
                if (r4 == 0) goto L_0x01be
                boolean r7 = r1.f348832f
                if (r7 != 0) goto L_0x004b
                com.tencent.mm.vfs.FileSystem$c r7 = r1.f348831e
                java.lang.String r8 = ".ref/d/"
                r7.mo119937g(r8)
                com.tencent.mm.vfs.FileSystem$c r7 = r1.f348831e
                java.lang.String r8 = ".ref/c/"
                r7.mo119937g(r8)
                r1.f348832f = r6
            L_0x004b:
                r7 = 0
                r9 = 0
                com.tencent.mm.vfs.RefCountedFileSystem$d r10 = new com.tencent.mm.vfs.RefCountedFileSystem$d     // Catch:{ IOException -> 0x016b, all -> 0x0167 }
                r10.<init>(r0, r6)     // Catch:{ IOException -> 0x016b, all -> 0x0167 }
                java.io.RandomAccessFile r0 = r10.f348836d     // Catch:{ IOException -> 0x0161, all -> 0x015f }
                long r11 = r0.length()     // Catch:{ IOException -> 0x0161, all -> 0x015f }
                java.lang.String r0 = "Cannot resolve realPath: "
                r13 = 0
                int r14 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
                if (r14 != 0) goto L_0x00f5
                com.tencent.mm.vfs.FileSystem$c r11 = r1.f348831e     // Catch:{ IOException -> 0x0161, all -> 0x015f }
                java.io.InputStream r11 = r11.openRead(r2)     // Catch:{ IOException -> 0x0161, all -> 0x015f }
                com.tencent.p014mm.vfs.C116299g2.m163847c(r11)     // Catch:{ IOException -> 0x0161, all -> 0x015f }
                java.util.UUID r11 = java.util.UUID.randomUUID()     // Catch:{ IOException -> 0x0161, all -> 0x015f }
                java.lang.String r11 = r11.toString()     // Catch:{ IOException -> 0x0161, all -> 0x015f }
                java.lang.String r12 = com.tencent.p014mm.vfs.RefCountedFileSystem.m163728b(r11)     // Catch:{ IOException -> 0x0161, all -> 0x015f }
                com.tencent.mm.vfs.FileSystem$c r14 = r1.f348831e     // Catch:{ IOException -> 0x0161, all -> 0x015f }
                java.lang.String r15 = com.tencent.p014mm.vfs.RefCountedFileSystem.m163730d(r11)     // Catch:{ IOException -> 0x0161, all -> 0x015f }
                java.lang.String r14 = r14.mo119947w(r15, r6)     // Catch:{ IOException -> 0x0161, all -> 0x015f }
                if (r14 == 0) goto L_0x00dc
                com.tencent.mm.vfs.RefCountedFileSystem$e r15 = new com.tencent.mm.vfs.RefCountedFileSystem$e     // Catch:{ IOException -> 0x0161, all -> 0x015f }
                r15.<init>(r14)     // Catch:{ IOException -> 0x0161, all -> 0x015f }
                r15.mo177748a(r6)     // Catch:{ IOException -> 0x0144 }
                java.io.RandomAccessFile r0 = r10.f348836d     // Catch:{ IOException -> 0x0144 }
                byte[] r14 = r11.getBytes()     // Catch:{ IOException -> 0x0144 }
                r0.write(r14)     // Catch:{ IOException -> 0x0144 }
                com.tencent.mm.vfs.FileSystem$c r0 = r1.f348831e     // Catch:{ IOException -> 0x0144 }
                boolean r0 = r0.mo119946t(r12, r0, r2)     // Catch:{ IOException -> 0x0144 }
                if (r0 != 0) goto L_0x0120
                com.tencent.mm.vfs.FileSystem$c r0 = r1.f348831e     // Catch:{ IOException -> 0x0144 }
                com.tencent.mm.vfs.b0 r0 = r0.mo119945q(r2)     // Catch:{ IOException -> 0x0144 }
                if (r0 == 0) goto L_0x00c5
                boolean r14 = r0.f250476f     // Catch:{ IOException -> 0x0144 }
                if (r14 != 0) goto L_0x00c5
                com.tencent.mm.vfs.FileSystem$c r14 = r1.f348831e     // Catch:{ IOException -> 0x0144 }
                long r13 = r14.mo119934d(r12, r14, r2, r13)     // Catch:{ IOException -> 0x0144 }
                long r7 = r0.f250473c     // Catch:{ IOException -> 0x0144 }
                int r0 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
                if (r0 != 0) goto L_0x00b8
                com.tencent.mm.vfs.FileSystem$c r0 = r1.f348831e     // Catch:{ IOException -> 0x0144 }
                r0.mo119933c(r2)     // Catch:{ IOException -> 0x0144 }
                goto L_0x0120
            L_0x00b8:
                com.tencent.mm.vfs.FileSystem$c r0 = r1.f348831e     // Catch:{ IOException -> 0x0144 }
                r0.mo119933c(r12)     // Catch:{ IOException -> 0x0144 }
                java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0144 }
                java.lang.String r4 = "Truncated copy"
                r0.<init>(r4)     // Catch:{ IOException -> 0x0144 }
                throw r0     // Catch:{ IOException -> 0x0144 }
            L_0x00c5:
                java.io.IOException r4 = new java.io.IOException     // Catch:{ IOException -> 0x0144 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0144 }
                r6.<init>()     // Catch:{ IOException -> 0x0144 }
                java.lang.String r7 = "Invalid entry: "
                r6.append(r7)     // Catch:{ IOException -> 0x0144 }
                r6.append(r0)     // Catch:{ IOException -> 0x0144 }
                java.lang.String r0 = r6.toString()     // Catch:{ IOException -> 0x0144 }
                r4.<init>(r0)     // Catch:{ IOException -> 0x0144 }
                throw r4     // Catch:{ IOException -> 0x0144 }
            L_0x00dc:
                java.io.IOException r4 = new java.io.IOException     // Catch:{ IOException -> 0x0161, all -> 0x015f }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0161, all -> 0x015f }
                r6.<init>()     // Catch:{ IOException -> 0x0161, all -> 0x015f }
                r6.append(r0)     // Catch:{ IOException -> 0x0161, all -> 0x015f }
                java.lang.String r0 = com.tencent.p014mm.vfs.RefCountedFileSystem.m163730d(r11)     // Catch:{ IOException -> 0x0161, all -> 0x015f }
                r6.append(r0)     // Catch:{ IOException -> 0x0161, all -> 0x015f }
                java.lang.String r0 = r6.toString()     // Catch:{ IOException -> 0x0161, all -> 0x015f }
                r4.<init>(r0)     // Catch:{ IOException -> 0x0161, all -> 0x015f }
                throw r4     // Catch:{ IOException -> 0x0161, all -> 0x015f }
            L_0x00f5:
                r7 = 64
                byte[] r8 = new byte[r7]     // Catch:{ IOException -> 0x0161, all -> 0x015f }
                r11 = 0
            L_0x00fa:
                if (r11 >= r7) goto L_0x0109
                java.io.RandomAccessFile r12 = r10.f348836d     // Catch:{ IOException -> 0x0161, all -> 0x015f }
                int r14 = 64 - r11
                int r12 = r12.read(r8, r11, r14)     // Catch:{ IOException -> 0x0161, all -> 0x015f }
                r14 = -1
                if (r12 == r14) goto L_0x0109
                int r11 = r11 + r12
                goto L_0x00fa
            L_0x0109:
                java.lang.String r7 = new java.lang.String     // Catch:{ IOException -> 0x0161, all -> 0x015f }
                r7.<init>(r8, r13, r11)     // Catch:{ IOException -> 0x0161, all -> 0x015f }
                com.tencent.mm.vfs.FileSystem$c r8 = r1.f348831e     // Catch:{ IOException -> 0x0161, all -> 0x015f }
                java.lang.String r11 = com.tencent.p014mm.vfs.RefCountedFileSystem.m163730d(r7)     // Catch:{ IOException -> 0x0161, all -> 0x015f }
                java.lang.String r8 = r8.mo119947w(r11, r6)     // Catch:{ IOException -> 0x0161, all -> 0x015f }
                if (r8 == 0) goto L_0x0146
                com.tencent.mm.vfs.RefCountedFileSystem$e r15 = new com.tencent.mm.vfs.RefCountedFileSystem$e     // Catch:{ IOException -> 0x0161, all -> 0x015f }
                r15.<init>(r8)     // Catch:{ IOException -> 0x0161, all -> 0x015f }
                r11 = r7
            L_0x0120:
                r15.mo177748a(r6)     // Catch:{ IOException -> 0x0144 }
                com.tencent.mm.vfs.RefCountedFileSystem$d r7 = new com.tencent.mm.vfs.RefCountedFileSystem$d     // Catch:{ IOException -> 0x0144 }
                r7.<init>(r4, r6)     // Catch:{ IOException -> 0x0144 }
                java.io.RandomAccessFile r0 = r7.f348836d     // Catch:{ IOException -> 0x013d, all -> 0x013b }
                byte[] r4 = r11.getBytes()     // Catch:{ IOException -> 0x013d, all -> 0x013b }
                r0.write(r4)     // Catch:{ IOException -> 0x013d, all -> 0x013b }
                com.tencent.p014mm.vfs.C116299g2.m163847c(r7)
                com.tencent.p014mm.vfs.C116299g2.m163847c(r15)
                com.tencent.p014mm.vfs.C116299g2.m163847c(r10)
                return
            L_0x013b:
                r0 = move-exception
                goto L_0x013f
            L_0x013d:
                r0 = move-exception
                goto L_0x0142
            L_0x013f:
                r9 = r7
                goto L_0x01b4
            L_0x0142:
                r9 = r7
                goto L_0x016e
            L_0x0144:
                r0 = move-exception
                goto L_0x016e
            L_0x0146:
                java.io.IOException r4 = new java.io.IOException     // Catch:{ IOException -> 0x0161, all -> 0x015f }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0161, all -> 0x015f }
                r6.<init>()     // Catch:{ IOException -> 0x0161, all -> 0x015f }
                r6.append(r0)     // Catch:{ IOException -> 0x0161, all -> 0x015f }
                java.lang.String r0 = com.tencent.p014mm.vfs.RefCountedFileSystem.m163730d(r7)     // Catch:{ IOException -> 0x0161, all -> 0x015f }
                r6.append(r0)     // Catch:{ IOException -> 0x0161, all -> 0x015f }
                java.lang.String r0 = r6.toString()     // Catch:{ IOException -> 0x0161, all -> 0x015f }
                r4.<init>(r0)     // Catch:{ IOException -> 0x0161, all -> 0x015f }
                throw r4     // Catch:{ IOException -> 0x0161, all -> 0x015f }
            L_0x015f:
                r0 = move-exception
                goto L_0x0163
            L_0x0161:
                r0 = move-exception
                goto L_0x0165
            L_0x0163:
                r15 = r9
                goto L_0x01b4
            L_0x0165:
                r15 = r9
                goto L_0x016e
            L_0x0167:
                r0 = move-exception
                r10 = r9
                r15 = r10
                goto L_0x01b4
            L_0x016b:
                r0 = move-exception
                r10 = r9
                r15 = r10
            L_0x016e:
                if (r9 == 0) goto L_0x0190
                java.io.RandomAccessFile r4 = r9.f348836d     // Catch:{ all -> 0x01b3 }
                long r6 = r4.length()     // Catch:{ all -> 0x01b3 }
                r11 = 0
                int r4 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r4 != 0) goto L_0x0190
                com.tencent.mm.vfs.FileSystem$c r4 = r1.f348831e     // Catch:{ all -> 0x01b3 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b3 }
                r6.<init>()     // Catch:{ all -> 0x01b3 }
                r6.append(r3)     // Catch:{ all -> 0x01b3 }
                r6.append(r5)     // Catch:{ all -> 0x01b3 }
                java.lang.String r3 = r6.toString()     // Catch:{ all -> 0x01b3 }
                r4.mo119933c(r3)     // Catch:{ all -> 0x01b3 }
            L_0x0190:
                if (r10 == 0) goto L_0x01b2
                java.io.RandomAccessFile r3 = r10.f348836d     // Catch:{ all -> 0x01b3 }
                long r3 = r3.length()     // Catch:{ all -> 0x01b3 }
                r6 = 0
                int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r8 != 0) goto L_0x01b2
                com.tencent.mm.vfs.FileSystem$c r3 = r1.f348831e     // Catch:{ all -> 0x01b3 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b3 }
                r4.<init>()     // Catch:{ all -> 0x01b3 }
                r4.append(r2)     // Catch:{ all -> 0x01b3 }
                r4.append(r5)     // Catch:{ all -> 0x01b3 }
                java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x01b3 }
                r3.mo119933c(r2)     // Catch:{ all -> 0x01b3 }
            L_0x01b2:
                throw r0     // Catch:{ all -> 0x01b3 }
            L_0x01b3:
                r0 = move-exception
            L_0x01b4:
                com.tencent.p014mm.vfs.C116299g2.m163847c(r9)
                com.tencent.p014mm.vfs.C116299g2.m163847c(r15)
                com.tencent.p014mm.vfs.C116299g2.m163847c(r10)
                throw r0
            L_0x01be:
                java.io.IOException r0 = new java.io.IOException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Real path cannot be resolved: "
                r4.append(r5)
                r4.append(r2)
                java.lang.String r2 = ", "
                r4.append(r2)
                r4.append(r3)
                java.lang.String r2 = r4.toString()
                r0.<init>(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vfs.RefCountedFileSystem.C116245c.mo177740G(java.lang.String, java.lang.String):void");
        }

        /* renamed from: H */
        public final C86001b0 mo177741H(String str, C86001b0 b0Var) {
            C86001b0 q;
            int i;
            C86001b0 b0Var2 = b0Var;
            String K = mo177742K(str);
            if (K == null || K.isEmpty() || (q = this.f348831e.mo119945q(RefCountedFileSystem.m163728b(K))) == null) {
                return null;
            }
            C86001b0 q2 = this.f348831e.mo119945q(RefCountedFileSystem.m163730d(K));
            if (q2 != null) {
                long j = q2.f250473c;
                if (j != 0) {
                    i = (int) j;
                    String str2 = b0Var2.f250472b;
                    String substring = str2.substring(0, str2.length() - 1);
                    long j2 = q.f250473c;
                    long j3 = b0Var2.f250474d;
                    long j4 = q.f250475e;
                    boolean z = q.f250476f;
                    return new C116326t0(this, str, substring, j2, ((q.f250474d + 4096) / ((long) i)) + j3, j4, z, K, i);
                }
            }
            i = 1;
            String str22 = b0Var2.f250472b;
            String substring2 = str22.substring(0, str22.length() - 1);
            long j25 = q.f250473c;
            long j35 = b0Var2.f250474d;
            long j44 = q.f250475e;
            boolean z2 = q.f250476f;
            return new C116326t0(this, str, substring2, j25, ((q.f250474d + 4096) / ((long) i)) + j35, j44, z2, K, i);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.String} */
        /* JADX WARNING: type inference failed for: r1v2 */
        /* JADX WARNING: type inference failed for: r1v3, types: [java.io.Closeable] */
        /* JADX WARNING: type inference failed for: r1v4 */
        /* JADX WARNING: type inference failed for: r1v6 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: K */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String mo177742K(java.lang.String r9) {
            /*
                r8 = this;
                com.tencent.mm.vfs.FileSystem$c r0 = r8.f348831e
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r9)
                r2 = 8982(0x2316, float:1.2586E-41)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r2 = 1
                java.lang.String r0 = r0.mo119947w(r1, r2)
                r1 = 0
                if (r0 != 0) goto L_0x001c
                return r1
            L_0x001c:
                com.tencent.mm.vfs.RefCountedFileSystem$d r2 = new com.tencent.mm.vfs.RefCountedFileSystem$d     // Catch:{ FileNotFoundException -> 0x0068, IOException -> 0x0046, all -> 0x0044 }
                r3 = 0
                r2.<init>(r0, r3)     // Catch:{ FileNotFoundException -> 0x0068, IOException -> 0x0046, all -> 0x0044 }
                r0 = 64
                byte[] r4 = new byte[r0]     // Catch:{ FileNotFoundException -> 0x0069, IOException -> 0x0042 }
                r5 = 0
            L_0x0027:
                if (r5 >= r0) goto L_0x0036
                java.io.RandomAccessFile r6 = r2.f348836d     // Catch:{ FileNotFoundException -> 0x0069, IOException -> 0x0042 }
                int r7 = 64 - r5
                int r6 = r6.read(r4, r5, r7)     // Catch:{ FileNotFoundException -> 0x0069, IOException -> 0x0042 }
                r7 = -1
                if (r6 == r7) goto L_0x0036
                int r5 = r5 + r6
                goto L_0x0027
            L_0x0036:
                if (r5 <= 0) goto L_0x003e
                java.lang.String r0 = new java.lang.String     // Catch:{ FileNotFoundException -> 0x0069, IOException -> 0x0042 }
                r0.<init>(r4, r3, r5)     // Catch:{ FileNotFoundException -> 0x0069, IOException -> 0x0042 }
                r1 = r0
            L_0x003e:
                com.tencent.p014mm.vfs.C116299g2.m163847c(r2)
                return r1
            L_0x0042:
                r0 = move-exception
                goto L_0x0048
            L_0x0044:
                r9 = move-exception
                goto L_0x0064
            L_0x0046:
                r0 = move-exception
                r2 = r1
            L_0x0048:
                java.lang.String r3 = "VFS.RefCountedFileSystem"
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0062 }
                r4.<init>()     // Catch:{ all -> 0x0062 }
                java.lang.String r5 = "Cannot read link file: "
                r4.append(r5)     // Catch:{ all -> 0x0062 }
                r4.append(r9)     // Catch:{ all -> 0x0062 }
                java.lang.String r9 = r4.toString()     // Catch:{ all -> 0x0062 }
                com.tencent.stubs.logger.Log.m106515w((java.lang.String) r3, (java.lang.Throwable) r0, (java.lang.String) r9)     // Catch:{ all -> 0x0062 }
                com.tencent.p014mm.vfs.C116299g2.m163847c(r2)
                return r1
            L_0x0062:
                r9 = move-exception
                r1 = r2
            L_0x0064:
                com.tencent.p014mm.vfs.C116299g2.m163847c(r1)
                throw r9
            L_0x0068:
                r2 = r1
            L_0x0069:
                com.tencent.p014mm.vfs.C116299g2.m163847c(r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vfs.RefCountedFileSystem.C116245c.mo177742K(java.lang.String):java.lang.String");
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x0050  */
        /* renamed from: M */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo177743M(java.lang.String r7) {
            /*
                r6 = this;
                java.lang.String r0 = r6.mo177742K(r7)
                r1 = 0
                if (r0 != 0) goto L_0x0008
                return r1
            L_0x0008:
                com.tencent.mm.vfs.FileSystem$c r2 = r6.f348831e
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r7)
                r7 = 8982(0x2316, float:1.2586E-41)
                r3.append(r7)
                java.lang.String r7 = r3.toString()
                boolean r7 = r2.mo119933c(r7)
                if (r7 != 0) goto L_0x0022
                return r1
            L_0x0022:
                java.lang.String r7 = com.tencent.p014mm.vfs.RefCountedFileSystem.m163730d(r0)
                com.tencent.mm.vfs.FileSystem$c r2 = r6.f348831e
                r3 = 1
                java.lang.String r2 = r2.mo119947w(r7, r3)
                if (r2 == 0) goto L_0x005e
                r4 = 0
                com.tencent.mm.vfs.RefCountedFileSystem$e r5 = new com.tencent.mm.vfs.RefCountedFileSystem$e     // Catch:{ IOException -> 0x004b, all -> 0x0046 }
                r5.<init>(r2)     // Catch:{ IOException -> 0x004b, all -> 0x0046 }
                r2 = -1
                int r2 = r5.mo177748a(r2)     // Catch:{ IOException -> 0x0044, all -> 0x0041 }
                if (r2 != 0) goto L_0x003d
                r1 = 1
            L_0x003d:
                com.tencent.p014mm.vfs.C116299g2.m163847c(r5)
                goto L_0x004e
            L_0x0041:
                r7 = move-exception
                r4 = r5
                goto L_0x0047
            L_0x0044:
                r4 = r5
                goto L_0x004b
            L_0x0046:
                r7 = move-exception
            L_0x0047:
                com.tencent.p014mm.vfs.C116299g2.m163847c(r4)
                throw r7
            L_0x004b:
                com.tencent.p014mm.vfs.C116299g2.m163847c(r4)
            L_0x004e:
                if (r1 == 0) goto L_0x005e
                com.tencent.mm.vfs.FileSystem$c r1 = r6.f348831e
                r1.mo119933c(r7)
                com.tencent.mm.vfs.FileSystem$c r7 = r6.f348831e
                java.lang.String r0 = com.tencent.p014mm.vfs.RefCountedFileSystem.m163728b(r0)
                r7.mo119933c(r0)
            L_0x005e:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vfs.RefCountedFileSystem.C116245c.mo177743M(java.lang.String):boolean");
        }

        /* renamed from: a */
        public void mo119928a(CancellationSignal cancellationSignal) {
            this.f348831e.mo119928a(cancellationSignal);
        }

        /* renamed from: b */
        public WritableByteChannel mo119932b(String str, boolean z) {
            if (RefCountedFileSystem.m163729c(str)) {
                throw new FileNotFoundException("Internal path referenced: " + str);
            } else if (!z || mo177742K(str) == null) {
                WritableByteChannel b = this.f348831e.mo119932b(str, z);
                if (!z) {
                    mo177743M(str);
                }
                return b;
            } else {
                throw new RuntimeException("Appending a reference counting file is not supported!");
            }
        }

        /* renamed from: c */
        public boolean mo119933c(String str) {
            if (RefCountedFileSystem.m163729c(str)) {
                return false;
            }
            return this.f348831e.mo119933c(str) | mo177743M(str);
        }

        /* renamed from: e */
        public boolean mo119935e(String str, long j) {
            boolean z = false;
            if (RefCountedFileSystem.m163729c(str)) {
                return false;
            }
            String K = mo177742K(str);
            if (K != null) {
                z = this.f348831e.mo119935e(RefCountedFileSystem.m163728b(K), j);
            }
            return this.f348831e.mo119935e(str, j) | z;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C116245c) && this.f348831e.equals(((C116245c) obj).f348831e);
        }

        /* renamed from: f */
        public int mo119936f() {
            return this.f348831e.mo119936f();
        }

        /* renamed from: g */
        public boolean mo119937g(String str) {
            if (RefCountedFileSystem.m163729c(str)) {
                return false;
            }
            return this.f348831e.mo119937g(str);
        }

        /* renamed from: h */
        public ReadableByteChannel mo119938h(String str) {
            try {
                return this.f348831e.mo119938h(str);
            } catch (FileNotFoundException e) {
                String K = mo177742K(str);
                if (K != null) {
                    return this.f348831e.mo119938h(RefCountedFileSystem.m163728b(K));
                }
                throw e;
            }
        }

        public int hashCode() {
            return RefCountedFileSystem.class.hashCode() ^ this.f348831e.hashCode();
        }

        /* renamed from: i */
        public ParcelFileDescriptor mo119939i(String str, String str2) {
            if (!RefCountedFileSystem.m163729c(str) || !str2.contains("w")) {
                str2.getClass();
                char c = 65535;
                switch (str2.hashCode()) {
                    case 114:
                        if (str2.equals("r")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 3653:
                        if (str2.equals("rw")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3786:
                        if (str2.equals("wa")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        try {
                            return this.f348831e.mo119939i(str, str2);
                        } catch (FileNotFoundException e) {
                            String K = mo177742K(str);
                            if (K != null) {
                                return this.f348831e.mo119939i(RefCountedFileSystem.m163728b(K), str2);
                            }
                            throw e;
                        }
                    case 1:
                    case 2:
                        if (mo177742K(str) == null) {
                            return this.f348831e.mo119939i(str, str2);
                        }
                        throw new RuntimeException("Appending a reference counting file is not supported!");
                    default:
                        ParcelFileDescriptor i = this.f348831e.mo119939i(str, str2);
                        mo177743M(str);
                        return i;
                }
            } else {
                throw new FileNotFoundException("Internal path referenced: " + str);
            }
        }

        /* renamed from: j */
        public List<FileSystem.C85995c> mo119931j() {
            return Collections.singletonList(this.f348831e);
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x003d  */
        /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Iterable<com.tencent.p014mm.vfs.C86001b0> list(java.lang.String r5) {
            /*
                r4 = this;
                r0 = 1
                java.lang.String r5 = com.tencent.p014mm.vfs.C116299g2.m163855k(r5, r0, r0)
                boolean r0 = com.tencent.p014mm.vfs.RefCountedFileSystem.m163729c(r5)
                r1 = 0
                if (r0 == 0) goto L_0x000d
                return r1
            L_0x000d:
                boolean r0 = r5.isEmpty()
                r2 = 0
                if (r0 == 0) goto L_0x002a
                com.tencent.mm.vfs.FileSystem$c r5 = r4.f348831e
                java.lang.String r0 = ""
                java.lang.Iterable r5 = r5.list(r0)
                if (r5 != 0) goto L_0x001f
                goto L_0x0032
            L_0x001f:
                qp3.f r0 = new qp3.f
                com.tencent.mm.vfs.RefCountedFileSystem$c$a r3 = new com.tencent.mm.vfs.RefCountedFileSystem$c$a
                r3.<init>(r4)
                r0.<init>(r5, r3, r2)
                goto L_0x003a
            L_0x002a:
                java.lang.String r0 = ".ref"
                boolean r0 = r0.equals(r5)
                if (r0 == 0) goto L_0x0034
            L_0x0032:
                r0 = r1
                goto L_0x003a
            L_0x0034:
                com.tencent.mm.vfs.FileSystem$c r0 = r4.f348831e
                java.lang.Iterable r0 = r0.list(r5)
            L_0x003a:
                if (r0 != 0) goto L_0x003d
                goto L_0x0047
            L_0x003d:
                qp3.f r1 = new qp3.f
                com.tencent.mm.vfs.RefCountedFileSystem$c$b r5 = new com.tencent.mm.vfs.RefCountedFileSystem$c$b
                r5.<init>()
                r1.<init>(r0, r5, r2)
            L_0x0047:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vfs.RefCountedFileSystem.C116245c.list(java.lang.String):java.lang.Iterable");
        }

        /* renamed from: m */
        public OutputStream mo119941m(String str, boolean z) {
            if (RefCountedFileSystem.m163729c(str)) {
                throw new FileNotFoundException("Internal path referenced: " + str);
            } else if (!z || mo177742K(str) == null) {
                OutputStream m = this.f348831e.mo119941m(str, z);
                mo177743M(str);
                return m;
            } else {
                throw new RuntimeException("Appending a reference counting file is not supported!");
            }
        }

        /* renamed from: o */
        public boolean mo119942o(String str, boolean z) {
            boolean z2;
            if (RefCountedFileSystem.m163729c(str)) {
                return false;
            }
            if (!z) {
                return this.f348831e.mo119942o(str, false);
            }
            Iterable<C86001b0> p = C116299g2.m163860p(this, str, true, (C116299g2.C86006b<C86001b0>) null);
            if (p != null) {
                Iterator it = ((C118196a) p).iterator();
                z2 = true;
                while (it.hasNext()) {
                    z2 &= ((C86001b0) it.next()).mo119955b(false);
                }
            } else {
                z2 = true;
            }
            return this.f348831e.mo119942o(str, false) && z2;
        }

        public InputStream openRead(String str) {
            try {
                return this.f348831e.openRead(str);
            } catch (FileNotFoundException e) {
                String K = mo177742K(str);
                if (K != null) {
                    return this.f348831e.openRead(RefCountedFileSystem.m163728b(K));
                }
                throw e;
            }
        }

        /* renamed from: p */
        public FileSystem.C116215a mo119944p(String str) {
            return this.f348831e.mo119944p(str);
        }

        /* renamed from: q */
        public C86001b0 mo119945q(String str) {
            C86001b0 q = this.f348831e.mo119945q(str);
            if (q != null) {
                return new C86001b0(this, q.f250471a, q.f250472b, q.f250473c, q.f250474d, q.f250475e, q.f250476f);
            }
            FileSystem.C85995c cVar = this.f348831e;
            C86001b0 q2 = cVar.mo119945q(str + 8982);
            if (q2 == null) {
                return null;
            }
            return mo177741H(str, q2);
        }

        public String toString() {
            return "refCount <- " + this.f348831e;
        }

        /* renamed from: u */
        public FileSystem mo119930u() {
            return RefCountedFileSystem.this;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
            r3 = mo177742K(r3);
         */
        /* renamed from: w */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String mo119947w(java.lang.String r3, boolean r4) {
            /*
                r2 = this;
                com.tencent.mm.vfs.FileSystem$c r0 = r2.f348831e
                java.lang.String r0 = r0.mo119947w(r3, r4)
                com.tencent.mm.vfs.FileSystem$c r1 = r2.f348831e
                boolean r1 = r1.mo119948x(r3)
                if (r1 == 0) goto L_0x000f
                return r0
            L_0x000f:
                java.lang.String r3 = r2.mo177742K(r3)
                if (r3 == 0) goto L_0x0020
                com.tencent.mm.vfs.FileSystem$c r0 = r2.f348831e
                java.lang.String r3 = com.tencent.p014mm.vfs.RefCountedFileSystem.m163728b(r3)
                java.lang.String r3 = r0.mo119947w(r3, r4)
                return r3
            L_0x0020:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vfs.RefCountedFileSystem.C116245c.mo119947w(java.lang.String, boolean):java.lang.String");
        }

        /* renamed from: x */
        public boolean mo119948x(String str) {
            if (!this.f348831e.mo119948x(str)) {
                FileSystem.C85995c cVar = this.f348831e;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(8982);
                return cVar.mo119948x(sb.toString());
            }
        }

        /* renamed from: z */
        public long mo177589z(String str, FileSystem.C85995c cVar, String str2, boolean z) {
            C86001b0 q;
            if (z && cVar == this && (q = mo119945q(str2)) != null && !q.f250476f && q.f250473c > 16384) {
                try {
                    mo177743M(str);
                    mo177740G(str2, str);
                    if (this.f348831e.mo119948x(str)) {
                        if (!this.f348831e.mo119933c(str)) {
                            throw new IOException("Cannot delete old plain file: " + str);
                        }
                    }
                    return q.f250473c;
                } catch (IOException e) {
                    Log.m106515w("VFS.RefCountedFileSystem", (Throwable) e, "Cannot create link, fallback to plain copy.");
                }
            }
            long d = this.f348831e.mo119934d(str, cVar, str2, z);
            mo177743M(str);
            return d;
        }
    }

    /* renamed from: com.tencent.mm.vfs.RefCountedFileSystem$d */
    public static class C116248d implements Closeable {

        /* renamed from: h */
        public static final HashMap<C106837a, C116244b> f348835h = new HashMap<>();

        /* renamed from: d */
        public final RandomAccessFile f348836d;

        /* renamed from: e */
        public final C106837a f348837e;

        /* renamed from: f */
        public final boolean f348838f;

        /* renamed from: g */
        public boolean f348839g;

        /* renamed from: com.tencent.mm.vfs.RefCountedFileSystem$d$a */
        public static class C106837a {

            /* renamed from: a */
            public final long f319827a;

            /* renamed from: b */
            public final long f319828b;

            public C106837a(long j, long j2) {
                this.f319827a = j;
                this.f319828b = j2;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof C106837a)) {
                    return false;
                }
                C106837a aVar = (C106837a) obj;
                return aVar.f319827a == this.f319827a && aVar.f319828b == this.f319828b;
            }

            public int hashCode() {
                long j = this.f319827a;
                int i = (int) (j ^ (j >>> 32));
                long j2 = this.f319828b;
                return ((int) (j2 ^ (j2 >>> 32))) ^ i;
            }
        }

        public C116248d(String str, boolean z) {
            int i;
            RandomAccessFile randomAccessFile = new RandomAccessFile(str, z ? "rw" : "r");
            this.f348838f = z;
            try {
                StructStat fstat = Os.fstat(randomAccessFile.getFD());
                C106837a aVar = new C106837a(fstat.st_dev, fstat.st_ino);
                synchronized (f348835h) {
                    while (true) {
                        HashMap<C106837a, C116244b> hashMap = f348835h;
                        C116244b bVar = hashMap.get(aVar);
                        if (bVar != null) {
                            if (!z && (i = bVar.f348830c) > 0) {
                                bVar.f348830c = i + 1;
                                break;
                            }
                            try {
                                hashMap.wait();
                            } catch (InterruptedException e) {
                                throw new IOException(e);
                            }
                        } else {
                            hashMap.put(aVar, new C116244b(randomAccessFile, z));
                            break;
                        }
                    }
                }
                this.f348836d = randomAccessFile;
                this.f348837e = aVar;
                this.f348839g = true;
            } catch (ErrnoException e2) {
                throw new IOException(e2);
            }
        }

        public void close() {
            if (this.f348839g) {
                HashMap<C106837a, C116244b> hashMap = f348835h;
                synchronized (hashMap) {
                    C116244b bVar = hashMap.get(this.f348837e);
                    if (bVar == null) {
                        this.f348836d.close();
                    } else {
                        if (!this.f348838f) {
                            int i = bVar.f348830c - 1;
                            bVar.f348830c = i;
                            if (i != 0) {
                                if (bVar.f348828a == null) {
                                    bVar.f348828a = new ArrayList<>(4);
                                }
                                bVar.f348828a.add(this.f348836d);
                            }
                        }
                        FileLock fileLock = bVar.f348829b;
                        if (fileLock != null) {
                            fileLock.release();
                        }
                        ArrayList<RandomAccessFile> arrayList = bVar.f348828a;
                        if (arrayList != null) {
                            Iterator<RandomAccessFile> it = arrayList.iterator();
                            while (it.hasNext()) {
                                it.next().close();
                            }
                        }
                        this.f348836d.close();
                        HashMap<C106837a, C116244b> hashMap2 = f348835h;
                        hashMap2.remove(this.f348837e);
                        hashMap2.notifyAll();
                    }
                }
                this.f348839g = false;
            }
        }

        public void finalize() {
            close();
        }
    }

    /* renamed from: com.tencent.mm.vfs.RefCountedFileSystem$e */
    public static final class C116249e extends C116248d {
        public C116249e(String str) {
            super(str, true);
        }

        /* renamed from: a */
        public int mo177748a(int i) {
            long max = Math.max(this.f348836d.length() + ((long) i), 0);
            this.f348836d.setLength(max);
            return (int) max;
        }
    }

    public RefCountedFileSystem(FileSystem fileSystem) {
        this.f348827e = fileSystem;
    }

    /* renamed from: b */
    public static String m163728b(String str) {
        return ".ref/d/" + str;
    }

    /* renamed from: c */
    public static boolean m163729c(String str) {
        if (!str.startsWith(".ref")) {
            return false;
        }
        if (str.length() != 4 && str.charAt(4) != '/') {
            return false;
        }
        Log.m106513w("VFS.RefCountedFileSystem", "Internal path referenced, something shall be wrong: " + str);
        return true;
    }

    /* renamed from: d */
    public static String m163730d(String str) {
        return ".ref/c/" + str;
    }

    public boolean equals(Object obj) {
        return (obj instanceof RefCountedFileSystem) && this.f348827e.equals(((RefCountedFileSystem) obj).f348827e);
    }

    public int hashCode() {
        return RefCountedFileSystem.class.hashCode() ^ this.f348827e.hashCode();
    }

    public String toString() {
        return "refCount <- " + this.f348827e;
    }

    /* renamed from: v */
    public Object mo177578v(Map map) {
        FileSystem.C85995c cVar = (FileSystem.C85995c) this.f348827e.mo177578v(map);
        return cVar == NullFileSystem.m163697z() ? cVar : new C116245c(cVar);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C116299g2.m163866v(parcel, RefCountedFileSystem.class, 1);
        parcel.writeParcelable(this.f348827e, i);
    }

    public RefCountedFileSystem(Parcel parcel) {
        C116299g2.m163845a(parcel, RefCountedFileSystem.class, 1);
        FileSystem fileSystem = (FileSystem) parcel.readParcelable(getClass().getClassLoader());
        this.f348827e = fileSystem;
        if (fileSystem == null) {
            throw new IllegalArgumentException("Wrong wrapped filesystem.");
        }
    }
}
