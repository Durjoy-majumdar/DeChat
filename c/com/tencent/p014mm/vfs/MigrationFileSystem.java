package com.tencent.p014mm.vfs;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.vfs.FileSystem;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.tencent.mm.vfs.MigrationFileSystem */
public class MigrationFileSystem extends AbstractFileSystem {
    public static final Parcelable.Creator<MigrationFileSystem> CREATOR = new C116221a();

    /* renamed from: e */
    public final FileSystem f348771e;

    /* renamed from: f */
    public final C116335w f348772f;

    /* renamed from: g */
    public final C116330v f348773g;

    /* renamed from: h */
    public final C116330v f348774h;

    /* renamed from: i */
    public final C116330v f348775i;

    /* renamed from: j */
    public final C116330v f348776j;

    /* renamed from: com.tencent.mm.vfs.MigrationFileSystem$a */
    public class C116221a implements Parcelable.Creator<MigrationFileSystem> {
        public Object createFromParcel(Parcel parcel) {
            return new MigrationFileSystem(parcel);
        }

        public Object[] newArray(int i) {
            return new MigrationFileSystem[i];
        }
    }

    /* renamed from: com.tencent.mm.vfs.MigrationFileSystem$b */
    public class C116222b extends C116309m {

        /* renamed from: e */
        public final List<FileSystem.C85995c> f348777e;

        /* renamed from: f */
        public final boolean f348778f;

        /* renamed from: g */
        public final boolean f348779g;

        public C116222b(List<FileSystem.C85995c> list, boolean z, boolean z2, Map<String, Object> map) {
            super(MigrationFileSystem.this, map);
            this.f348777e = list;
            this.f348778f = z;
            this.f348779g = z2;
        }

        /* renamed from: G */
        public List<FileSystem.C85995c> mo119926G() {
            return this.f348777e;
        }

        /* renamed from: H */
        public FileSystem.C85995c mo119927H(String str, int i) {
            if (i == 1 || i == 3) {
                for (FileSystem.C85995c next : this.f348777e) {
                    if (next.mo119948x(str)) {
                        return next;
                    }
                }
            }
            return this.f348777e.get(0);
        }

        /* JADX WARNING: Removed duplicated region for block: B:124:0x02ac  */
        /* JADX WARNING: Removed duplicated region for block: B:125:0x02b0  */
        /* JADX WARNING: Removed duplicated region for block: B:135:0x01b4 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x0169 A[SYNTHETIC, Splitter:B:84:0x0169] */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x019b A[Catch:{ Exception -> 0x01e4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x01a8 A[Catch:{ Exception -> 0x01e4 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo119928a(android.os.CancellationSignal r47) {
            /*
                r46 = this;
                r1 = r46
                java.lang.String r2 = "sizeCopied"
                java.lang.String r3 = "filesFailed"
                boolean r0 = r1.f348778f
                if (r0 == 0) goto L_0x030b
                java.util.List<com.tencent.mm.vfs.FileSystem$c> r0 = r1.f348777e
                r4 = 0
                java.lang.Object r0 = r0.get(r4)
                com.tencent.mm.vfs.FileSystem$c r5 = com.tencent.p014mm.vfs.NullFileSystem.m163697z()
                if (r0 == r5) goto L_0x030b
                java.lang.String r5 = "filesMoved"
                java.lang.String r6 = "filesCopied"
                java.lang.String r7 = "destOverride"
                java.lang.String r8 = "dirsDeleted"
                java.lang.String r9 = "dirsCreated"
                java.lang.String r10 = "dirsMoved"
                java.lang.String r11 = "destination"
                java.util.List<com.tencent.mm.vfs.FileSystem$c> r12 = r1.f348777e
                r16 = 17
                r17 = 16
                r18 = 15
                r19 = 14
                r20 = 13
                r21 = 12
                r22 = 11
                r23 = 10
                r24 = 8
                r25 = 7
                r28 = 4
                r15 = 2
                java.lang.Object r0 = r12.get(r4)     // Catch:{ Exception -> 0x028c }
                r13 = r0
                com.tencent.mm.vfs.FileSystem$c r13 = (com.tencent.p014mm.vfs.FileSystem.C85995c) r13     // Catch:{ Exception -> 0x028c }
                java.util.HashSet r14 = new java.util.HashSet     // Catch:{ Exception -> 0x028c }
                r14.<init>()     // Catch:{ Exception -> 0x028c }
                r47.throwIfCanceled()     // Catch:{ Exception -> 0x028c }
                java.lang.Object[] r0 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x028c }
                r0[r4] = r11     // Catch:{ Exception -> 0x028c }
                r15 = 1
                r0[r15] = r13     // Catch:{ Exception -> 0x028c }
                r1.mo177781F(r15, r0)     // Catch:{ Exception -> 0x028c }
                int r15 = r12.size()     // Catch:{ Exception -> 0x028c }
                r4 = 1
                r26 = 0
                r30 = 0
                r31 = 0
                r32 = 0
                r33 = 0
                r34 = 0
                r35 = 0
                r36 = 0
            L_0x006c:
                if (r4 >= r15) goto L_0x0229
                r47.throwIfCanceled()     // Catch:{ Exception -> 0x0219 }
                java.lang.Object r0 = r12.get(r4)     // Catch:{ Exception -> 0x0219 }
                r37 = r15
                r15 = r0
                com.tencent.mm.vfs.FileSystem$c r15 = (com.tencent.p014mm.vfs.FileSystem.C85995c) r15     // Catch:{ Exception -> 0x0219 }
                r39 = r2
                r38 = r12
                r12 = 1
                boolean[] r2 = new boolean[r12]     // Catch:{ Exception -> 0x0210 }
                java.lang.String r0 = ""
                com.tencent.mm.vfs.n0 r12 = new com.tencent.mm.vfs.n0     // Catch:{ Exception -> 0x0210 }
                r12.<init>(r1, r2, r13, r15)     // Catch:{ Exception -> 0x0210 }
                r40 = r3
                r3 = 0
                java.lang.Iterable r0 = com.tencent.p014mm.vfs.C116299g2.m163860p(r15, r0, r3, r12)     // Catch:{ Exception -> 0x0202 }
                if (r0 != 0) goto L_0x009a
                r41 = r5
                r2 = r6
                r44 = r7
                r45 = r14
                goto L_0x01e8
            L_0x009a:
                int r3 = r15.mo119936f()     // Catch:{ Exception -> 0x0202 }
                r12 = 9
                r3 = r3 & r12
                if (r3 != r12) goto L_0x00a9
                java.util.TreeSet r3 = new java.util.TreeSet     // Catch:{ Exception -> 0x0202 }
                r3.<init>()     // Catch:{ Exception -> 0x0202 }
                goto L_0x00aa
            L_0x00a9:
                r3 = 0
            L_0x00aa:
                qp3.a r0 = (qp3.C118196a) r0     // Catch:{ Exception -> 0x0202 }
                java.util.Iterator r12 = r0.iterator()     // Catch:{ Exception -> 0x0202 }
                r41 = r5
                r5 = r34
            L_0x00b4:
                r0 = r12
                qp3.b r0 = (qp3.C118197b) r0     // Catch:{ Exception -> 0x01fb }
                boolean r34 = r0.hasNext()     // Catch:{ Exception -> 0x01fb }
                if (r34 == 0) goto L_0x01bf
                java.lang.Object r0 = r0.next()     // Catch:{ Exception -> 0x01fb }
                r42 = r12
                r12 = r0
                com.tencent.mm.vfs.b0 r12 = (com.tencent.p014mm.vfs.C86001b0) r12     // Catch:{ Exception -> 0x01fb }
                r47.throwIfCanceled()     // Catch:{ Exception -> 0x01fb }
                boolean r0 = r12.f250476f     // Catch:{ Exception -> 0x01fb }
                if (r0 == 0) goto L_0x00fa
                r29 = 0
                boolean r0 = r2[r29]     // Catch:{ Exception -> 0x00f8 }
                if (r0 == 0) goto L_0x00db
                java.lang.String r0 = r12.f250471a     // Catch:{ Exception -> 0x00f8 }
                r14.add(r0)     // Catch:{ Exception -> 0x00f8 }
                int r30 = r30 + 1
                goto L_0x00f1
            L_0x00db:
                java.lang.String r0 = r12.f250471a     // Catch:{ Exception -> 0x00f8 }
                boolean r0 = r14.add(r0)     // Catch:{ Exception -> 0x00f8 }
                if (r0 == 0) goto L_0x00ea
                java.lang.String r0 = r12.f250471a     // Catch:{ Exception -> 0x00f8 }
                r13.mo119937g(r0)     // Catch:{ Exception -> 0x00f8 }
                int r31 = r31 + 1
            L_0x00ea:
                if (r3 == 0) goto L_0x00f1
                java.lang.String r0 = r12.f250471a     // Catch:{ Exception -> 0x00f8 }
                r3.add(r0)     // Catch:{ Exception -> 0x00f8 }
            L_0x00f1:
                r43 = r2
            L_0x00f3:
                r2 = r6
                r44 = r7
                goto L_0x015c
            L_0x00f8:
                r0 = move-exception
                goto L_0x0128
            L_0x00fa:
                java.lang.String r0 = r12.f250471a     // Catch:{ Exception -> 0x01fb }
                r43 = r2
                java.lang.String r2 = com.tencent.p014mm.vfs.C116299g2.m163852h(r0)     // Catch:{ Exception -> 0x01fb }
                if (r2 == 0) goto L_0x0114
                boolean r0 = r14.add(r2)     // Catch:{ Exception -> 0x00f8 }
                if (r0 == 0) goto L_0x010f
                r13.mo119937g(r2)     // Catch:{ Exception -> 0x00f8 }
                int r31 = r31 + 1
            L_0x010f:
                if (r3 == 0) goto L_0x0114
                r3.add(r2)     // Catch:{ Exception -> 0x00f8 }
            L_0x0114:
                java.lang.String r0 = r12.f250471a     // Catch:{ Exception -> 0x01fb }
                boolean r0 = r13.mo119948x(r0)     // Catch:{ Exception -> 0x01fb }
                if (r0 == 0) goto L_0x012f
                boolean r0 = r1.f348779g     // Catch:{ Exception -> 0x00f8 }
                if (r0 != 0) goto L_0x00f3
                java.lang.String r0 = r12.f250471a     // Catch:{ Exception -> 0x00f8 }
                r15.mo119933c(r0)     // Catch:{ Exception -> 0x00f8 }
                int r33 = r33 + 1
                goto L_0x00f3
            L_0x0128:
                r2 = r6
                r44 = r7
                r14 = r26
                goto L_0x020c
            L_0x012f:
                java.lang.String r0 = r12.f250471a     // Catch:{ IOException -> 0x015f }
                boolean r0 = r13.mo119946t(r0, r15, r0)     // Catch:{ IOException -> 0x015f }
                if (r0 == 0) goto L_0x013a
                int r36 = r36 + 1
                goto L_0x00f3
            L_0x013a:
                boolean r0 = r1.f348779g     // Catch:{ IOException -> 0x015f }
                if (r0 != 0) goto L_0x00f3
                java.lang.String r0 = r12.f250471a     // Catch:{ IOException -> 0x015f }
                r34 = r2
                r2 = 0
                r13.mo119934d(r0, r15, r0, r2)     // Catch:{ IOException -> 0x0157 }
                java.lang.String r0 = r12.f250471a     // Catch:{ IOException -> 0x0157 }
                r15.mo119933c(r0)     // Catch:{ IOException -> 0x0157 }
                int r35 = r35 + 1
                r2 = r6
                r44 = r7
                long r6 = r12.f250474d     // Catch:{ IOException -> 0x0155 }
                long r26 = r26 + r6
                goto L_0x015c
            L_0x0155:
                r0 = move-exception
                goto L_0x0163
            L_0x0157:
                r0 = move-exception
            L_0x0158:
                r2 = r6
                r44 = r7
                goto L_0x0163
            L_0x015c:
                r45 = r14
                goto L_0x01b4
            L_0x015f:
                r0 = move-exception
                r34 = r2
                goto L_0x0158
            L_0x0163:
                java.lang.String r6 = "VFS.MigrationFileSystem"
                r7 = 100
                if (r5 >= r7) goto L_0x019b
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e4 }
                r7.<init>()     // Catch:{ Exception -> 0x01e4 }
                r45 = r14
                java.lang.String r14 = "Migrate failed: "
                r7.append(r14)     // Catch:{ Exception -> 0x01e4 }
                java.lang.String r12 = r12.f250471a     // Catch:{ Exception -> 0x01e4 }
                r7.append(r12)     // Catch:{ Exception -> 0x01e4 }
                java.lang.String r12 = ": "
                r7.append(r12)     // Catch:{ Exception -> 0x01e4 }
                java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x01e4 }
                r7.append(r0)     // Catch:{ Exception -> 0x01e4 }
                java.lang.String r0 = "["
                r7.append(r0)     // Catch:{ Exception -> 0x01e4 }
                r7.append(r1)     // Catch:{ Exception -> 0x01e4 }
                java.lang.String r0 = "]"
                r7.append(r0)     // Catch:{ Exception -> 0x01e4 }
                java.lang.String r0 = r7.toString()     // Catch:{ Exception -> 0x01e4 }
                com.tencent.stubs.logger.Log.m106497e(r6, r0)     // Catch:{ Exception -> 0x01e4 }
                goto L_0x01a4
            L_0x019b:
                r45 = r14
                if (r5 != r7) goto L_0x01a4
                java.lang.String r0 = "No more migration error printing."
                com.tencent.stubs.logger.Log.m106497e(r6, r0)     // Catch:{ Exception -> 0x01e4 }
            L_0x01a4:
                int r5 = r5 + 1
                if (r3 == 0) goto L_0x01b4
                r0 = r34
            L_0x01aa:
                if (r0 == 0) goto L_0x01b4
                r3.remove(r0)     // Catch:{ Exception -> 0x01e4 }
                java.lang.String r0 = com.tencent.p014mm.vfs.C116299g2.m163852h(r0)     // Catch:{ Exception -> 0x01e4 }
                goto L_0x01aa
            L_0x01b4:
                r6 = r2
                r12 = r42
                r2 = r43
                r7 = r44
                r14 = r45
                goto L_0x00b4
            L_0x01bf:
                r2 = r6
                r44 = r7
                r45 = r14
                if (r3 == 0) goto L_0x01e6
                java.util.NavigableSet r0 = r3.descendingSet()     // Catch:{ Exception -> 0x01e4 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x01e4 }
            L_0x01ce:
                boolean r3 = r0.hasNext()     // Catch:{ Exception -> 0x01e4 }
                if (r3 == 0) goto L_0x01e6
                java.lang.Object r3 = r0.next()     // Catch:{ Exception -> 0x01e4 }
                java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x01e4 }
                r47.throwIfCanceled()     // Catch:{ Exception -> 0x01e4 }
                r6 = 0
                r15.mo119942o(r3, r6)     // Catch:{ Exception -> 0x01e4 }
                int r32 = r32 + 1
                goto L_0x01ce
            L_0x01e4:
                r0 = move-exception
                goto L_0x01ff
            L_0x01e6:
                r34 = r5
            L_0x01e8:
                int r4 = r4 + 1
                r6 = r2
                r15 = r37
                r12 = r38
                r2 = r39
                r3 = r40
                r5 = r41
                r7 = r44
                r14 = r45
                goto L_0x006c
            L_0x01fb:
                r0 = move-exception
                r2 = r6
                r44 = r7
            L_0x01ff:
                r34 = r5
                goto L_0x0225
            L_0x0202:
                r0 = move-exception
                r41 = r5
                r2 = r6
                r44 = r7
                r14 = r26
                r5 = r34
            L_0x020c:
                r34 = r5
                goto L_0x02a8
            L_0x0210:
                r0 = move-exception
                r40 = r3
                r41 = r5
                r2 = r6
                r44 = r7
                goto L_0x0225
            L_0x0219:
                r0 = move-exception
                r39 = r2
                r40 = r3
                r41 = r5
                r2 = r6
                r44 = r7
                r38 = r12
            L_0x0225:
                r14 = r26
                goto L_0x02a8
            L_0x0229:
                r39 = r2
                r40 = r3
                r41 = r5
                r2 = r6
                r44 = r7
                r38 = r12
                r3 = 18
                java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x028a }
                r3 = 0
                r0[r3] = r11     // Catch:{ Exception -> 0x028a }
                r3 = 1
                r0[r3] = r13     // Catch:{ Exception -> 0x028a }
                r3 = 2
                r0[r3] = r10     // Catch:{ Exception -> 0x028a }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r30)     // Catch:{ Exception -> 0x028a }
                r4 = 3
                r0[r4] = r3     // Catch:{ Exception -> 0x028a }
                r0[r28] = r9     // Catch:{ Exception -> 0x028a }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r31)     // Catch:{ Exception -> 0x028a }
                r4 = 5
                r0[r4] = r3     // Catch:{ Exception -> 0x028a }
                r3 = 6
                r0[r3] = r8     // Catch:{ Exception -> 0x028a }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r32)     // Catch:{ Exception -> 0x028a }
                r0[r25] = r3     // Catch:{ Exception -> 0x028a }
                r0[r24] = r44     // Catch:{ Exception -> 0x028a }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r33)     // Catch:{ Exception -> 0x028a }
                r4 = 9
                r0[r4] = r3     // Catch:{ Exception -> 0x028a }
                r0[r23] = r2     // Catch:{ Exception -> 0x028a }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r35)     // Catch:{ Exception -> 0x028a }
                r0[r22] = r3     // Catch:{ Exception -> 0x028a }
                r0[r21] = r41     // Catch:{ Exception -> 0x028a }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r36)     // Catch:{ Exception -> 0x028a }
                r0[r20] = r3     // Catch:{ Exception -> 0x028a }
                r0[r19] = r40     // Catch:{ Exception -> 0x028a }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r34)     // Catch:{ Exception -> 0x028a }
                r0[r18] = r3     // Catch:{ Exception -> 0x028a }
                r0[r17] = r39     // Catch:{ Exception -> 0x028a }
                java.lang.Long r3 = java.lang.Long.valueOf(r26)     // Catch:{ Exception -> 0x028a }
                r0[r16] = r3     // Catch:{ Exception -> 0x028a }
                r3 = 3
                r1.mo177781F(r3, r0)     // Catch:{ Exception -> 0x028a }
                goto L_0x030b
            L_0x028a:
                r0 = move-exception
                goto L_0x0225
            L_0x028c:
                r0 = move-exception
                r39 = r2
                r40 = r3
                r41 = r5
                r2 = r6
                r44 = r7
                r38 = r12
                r14 = 0
                r30 = 0
                r31 = 0
                r32 = 0
                r33 = 0
                r34 = 0
                r35 = 0
                r36 = 0
            L_0x02a8:
                boolean r3 = r0 instanceof android.os.OperationCanceledException
                if (r3 == 0) goto L_0x02b0
                r3 = 18
                r4 = 4
                goto L_0x02b3
            L_0x02b0:
                r3 = 18
                r4 = 5
            L_0x02b3:
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r5 = 0
                r3[r5] = r11
                r6 = r38
                java.lang.Object r5 = r6.get(r5)
                r6 = 1
                r3[r6] = r5
                r5 = 2
                r3[r5] = r10
                java.lang.Integer r5 = java.lang.Integer.valueOf(r30)
                r6 = 3
                r3[r6] = r5
                r3[r28] = r9
                java.lang.Integer r5 = java.lang.Integer.valueOf(r31)
                r6 = 5
                r3[r6] = r5
                r5 = 6
                r3[r5] = r8
                java.lang.Integer r5 = java.lang.Integer.valueOf(r32)
                r3[r25] = r5
                r3[r24] = r44
                java.lang.Integer r5 = java.lang.Integer.valueOf(r33)
                r6 = 9
                r3[r6] = r5
                r3[r23] = r2
                java.lang.Integer r2 = java.lang.Integer.valueOf(r35)
                r3[r22] = r2
                r3[r21] = r41
                java.lang.Integer r2 = java.lang.Integer.valueOf(r36)
                r3[r20] = r2
                r3[r19] = r40
                java.lang.Integer r2 = java.lang.Integer.valueOf(r34)
                r3[r18] = r2
                r3[r17] = r39
                java.lang.Long r2 = java.lang.Long.valueOf(r14)
                r3[r16] = r2
                r1.mo177781F(r4, r3)
                throw r0
            L_0x030b:
                super.mo119928a(r47)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vfs.MigrationFileSystem.C116222b.mo119928a(android.os.CancellationSignal):void");
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C116222b)) {
                return false;
            }
            C116222b bVar = (C116222b) obj;
            return this.f348777e.equals(bVar.f348777e) && this.f348778f == bVar.f348778f && this.f348779g == bVar.f348779g;
        }

        /* renamed from: h */
        public ReadableByteChannel mo119938h(String str) {
            FileNotFoundException fileNotFoundException = null;
            for (FileSystem.C85995c h : this.f348777e) {
                try {
                    return h.mo119938h(str);
                } catch (FileNotFoundException e) {
                    if (fileNotFoundException == null) {
                        fileNotFoundException = e;
                    }
                }
            }
            if (fileNotFoundException == null) {
                fileNotFoundException = new FileNotFoundException(str + " not found on any file systems.");
            }
            throw fileNotFoundException;
        }

        public int hashCode() {
            int hashCode = C116222b.class.hashCode();
            Object[] objArr = {this.f348777e, Boolean.valueOf(this.f348778f), Boolean.valueOf(this.f348779g)};
            Pattern pattern = C116299g2.f349012a;
            return hashCode ^ Arrays.deepHashCode(objArr);
        }

        public InputStream openRead(String str) {
            FileNotFoundException fileNotFoundException = null;
            for (FileSystem.C85995c openRead : this.f348777e) {
                try {
                    return openRead.openRead(str);
                } catch (FileNotFoundException e) {
                    if (fileNotFoundException == null) {
                        fileNotFoundException = e;
                    }
                }
            }
            if (fileNotFoundException == null) {
                fileNotFoundException = new FileNotFoundException(str + " not found on any file systems.");
            }
            throw fileNotFoundException;
        }

        /* renamed from: q */
        public C86001b0 mo119945q(String str) {
            for (FileSystem.C85995c q : this.f348777e) {
                C86001b0 q2 = q.mo119945q(str);
                if (q2 != null) {
                    return q2;
                }
            }
            return null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(512);
            sb.append("migrate(");
            sb.append(this.f348778f ? 'P' : '-');
            sb.append(") ");
            sb.append(this.f348777e.get(0));
            List<FileSystem.C85995c> list = this.f348777e;
            for (FileSystem.C85995c append : list.subList(1, list.size())) {
                sb.append("\n  <- ");
                sb.append(append);
            }
            return sb.toString();
        }

        /* renamed from: u */
        public FileSystem mo119930u() {
            return MigrationFileSystem.this;
        }

        /* renamed from: x */
        public boolean mo119948x(String str) {
            for (FileSystem.C85995c x : this.f348777e) {
                if (x.mo119948x(str)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MigrationFileSystem(boolean r3, boolean r4, com.tencent.p014mm.vfs.FileSystem r5, java.lang.Object... r6) {
        /*
            r2 = this;
            java.lang.String r0 = ""
            r1 = 0
            if (r3 == 0) goto L_0x0007
            r3 = r0
            goto L_0x0008
        L_0x0007:
            r3 = r1
        L_0x0008:
            if (r4 == 0) goto L_0x000b
            goto L_0x000c
        L_0x000b:
            r0 = r1
        L_0x000c:
            r2.<init>((java.lang.String) r3, (java.lang.String) r0, (com.tencent.p014mm.vfs.FileSystem) r5, (java.lang.Object[]) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vfs.MigrationFileSystem.<init>(boolean, boolean, com.tencent.mm.vfs.FileSystem, java.lang.Object[]):void");
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MigrationFileSystem)) {
            return false;
        }
        MigrationFileSystem migrationFileSystem = (MigrationFileSystem) obj;
        return this.f348771e.equals(migrationFileSystem.f348771e) && this.f348772f.equals(migrationFileSystem.f348772f) && this.f348773g.equals(migrationFileSystem.f348773g) && this.f348774h.equals(migrationFileSystem.f348774h) && this.f348775i.equals(migrationFileSystem.f348775i) && this.f348776j.equals(migrationFileSystem.f348776j);
    }

    public int hashCode() {
        int hashCode = MigrationFileSystem.class.hashCode();
        Object[] objArr = {this.f348771e, this.f348772f, this.f348773g, this.f348774h, this.f348775i, this.f348776j};
        Pattern pattern = C116299g2.f349012a;
        return hashCode ^ Arrays.deepHashCode(objArr);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(512);
        sb.append("migrate(...) ");
        sb.append(this.f348771e);
        for (Object append : this.f348772f.f349111a) {
            sb.append(10);
            sb.append("  <- ");
            sb.append(append);
        }
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0055, code lost:
        if (r0.exists() != false) goto L_0x0057;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo177578v(java.util.Map r15) {
        /*
            r14 = this;
            com.tencent.mm.vfs.v r0 = r14.f348773g
            java.lang.String r0 = r0.mo177821a(r15)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000c
            r6 = 1
            goto L_0x000d
        L_0x000c:
            r6 = 0
        L_0x000d:
            com.tencent.mm.vfs.v r0 = r14.f348774h
            java.lang.String r0 = r0.mo177821a(r15)
            if (r0 == 0) goto L_0x0017
            r0 = 1
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            com.tencent.mm.vfs.v r3 = r14.f348775i
            java.lang.String r3 = r3.mo177821a(r15)
            if (r3 == 0) goto L_0x0022
            r3 = 1
            goto L_0x0023
        L_0x0022:
            r3 = 0
        L_0x0023:
            com.tencent.mm.vfs.v r4 = r14.f348776j
            java.lang.String r4 = r4.mo177821a(r15)
            if (r4 == 0) goto L_0x002d
            r7 = 1
            goto L_0x002e
        L_0x002d:
            r7 = 0
        L_0x002e:
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            com.tencent.mm.vfs.FileSystem r5 = r14.f348771e
            java.lang.Object r5 = r5.mo177578v(r15)
            com.tencent.mm.vfs.FileSystem$c r5 = (com.tencent.p014mm.vfs.FileSystem.C85995c) r5
            r4.add(r5)
            boolean r8 = r5 instanceof com.tencent.p014mm.vfs.NativeFileSystem.C116228g
            r9 = 0
            if (r8 == 0) goto L_0x0057
            r8 = r5
            com.tencent.mm.vfs.NativeFileSystem$g r8 = (com.tencent.p014mm.vfs.NativeFileSystem.C116228g) r8
            java.lang.String r8 = r8.f348790e
            if (r8 == 0) goto L_0x0057
            if (r0 == 0) goto L_0x0057
            java.io.File r0 = new java.io.File
            r0.<init>(r8)
            boolean r8 = r0.exists()
            if (r8 == 0) goto L_0x0058
        L_0x0057:
            r0 = r9
        L_0x0058:
            com.tencent.mm.vfs.w r8 = r14.f348772f
            java.util.List r8 = r8.mo177834a(r15)
            java.util.Iterator r8 = r8.iterator()
        L_0x0062:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x00f4
            java.lang.Object r10 = r8.next()
            com.tencent.mm.vfs.FileSystem$c r10 = (com.tencent.p014mm.vfs.FileSystem.C85995c) r10
            com.tencent.mm.vfs.FileSystem$c r11 = com.tencent.p014mm.vfs.NullFileSystem.m163697z()
            if (r10 == r11) goto L_0x0062
            boolean r11 = r10.equals(r5)
            if (r11 == 0) goto L_0x007b
            goto L_0x0062
        L_0x007b:
            int r11 = r10.mo119936f()
            r11 = r11 & 2
            if (r11 == 0) goto L_0x00ef
            java.util.regex.Pattern r11 = com.tencent.p014mm.vfs.C116299g2.f349012a
            r11 = r10
        L_0x0086:
            boolean r12 = r11 instanceof com.tencent.p014mm.vfs.FileSystem.C85994b
            if (r12 == 0) goto L_0x009f
            com.tencent.mm.vfs.FileSystem$b r11 = (com.tencent.p014mm.vfs.FileSystem.C85994b) r11
            java.util.List r11 = r11.mo119931j()
            int r12 = r11.size()
            if (r12 == r1) goto L_0x0098
            r11 = r9
            goto L_0x009f
        L_0x0098:
            java.lang.Object r11 = r11.get(r2)
            com.tencent.mm.vfs.FileSystem$c r11 = (com.tencent.p014mm.vfs.FileSystem.C85995c) r11
            goto L_0x0086
        L_0x009f:
            boolean r12 = r11 instanceof com.tencent.p014mm.vfs.NativeFileSystem.C116228g
            if (r12 == 0) goto L_0x00ea
            com.tencent.mm.vfs.NativeFileSystem$g r11 = (com.tencent.p014mm.vfs.NativeFileSystem.C116228g) r11
            java.lang.String r11 = r11.f348790e
            if (r11 == 0) goto L_0x0062
            java.io.File r12 = new java.io.File
            r12.<init>(r11)
            boolean r11 = r12.isDirectory()
            if (r11 == 0) goto L_0x00e1
            if (r0 == 0) goto L_0x00e1
            boolean r13 = r12.renameTo(r0)
            if (r13 == 0) goto L_0x00e1
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "Fast moved '"
            r11.append(r13)
            r11.append(r12)
            java.lang.String r12 = "' -> '"
            r11.append(r12)
            r11.append(r0)
            java.lang.String r0 = "'"
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            java.lang.String r11 = "VFS.MigrationFileSystem"
            com.tencent.stubs.logger.Log.m106505i(r11, r0)
            r0 = r9
            r11 = 0
        L_0x00e1:
            if (r11 != 0) goto L_0x00e5
            if (r3 == 0) goto L_0x0062
        L_0x00e5:
            r4.add(r10)
            goto L_0x0062
        L_0x00ea:
            r4.add(r10)
            goto L_0x0062
        L_0x00ef:
            r4.add(r10)
            goto L_0x0062
        L_0x00f4:
            com.tencent.mm.vfs.MigrationFileSystem$b r0 = new com.tencent.mm.vfs.MigrationFileSystem$b
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r4)
            r3 = r0
            r4 = r14
            r8 = r15
            r3.<init>(r5, r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vfs.MigrationFileSystem.mo177578v(java.util.Map):java.lang.Object");
    }

    public void writeToParcel(Parcel parcel, int i) {
        C116299g2.m163866v(parcel, MigrationFileSystem.class, 7);
        parcel.writeParcelable(this.f348771e, i);
        this.f348772f.mo177835b(parcel);
        parcel.writeString(this.f348773g.f349099a);
        parcel.writeString(this.f348774h.f349099a);
        parcel.writeString(this.f348775i.f349099a);
        parcel.writeString(this.f348776j.f349099a);
    }

    public MigrationFileSystem(String str, String str2, FileSystem fileSystem, Object... objArr) {
        this(str, str2, (String) null, (String) null, fileSystem, objArr);
    }

    public MigrationFileSystem(String str, String str2, String str3, String str4, FileSystem fileSystem, Object... objArr) {
        if (fileSystem != null) {
            this.f348773g = new C116330v(str);
            this.f348774h = new C116330v(str2);
            this.f348775i = new C116330v(str3);
            this.f348776j = new C116330v(str4);
            this.f348771e = fileSystem;
            this.f348772f = new C116335w(objArr);
            return;
        }
        throw new IllegalArgumentException("destination == null");
    }

    public MigrationFileSystem(Parcel parcel) {
        C116299g2.m163845a(parcel, MigrationFileSystem.class, 7);
        this.f348771e = (FileSystem) parcel.readParcelable(getClass().getClassLoader());
        this.f348772f = new C116335w(parcel);
        this.f348773g = new C116330v(parcel.readString());
        this.f348774h = new C116330v(parcel.readString());
        this.f348775i = new C116330v(parcel.readString());
        this.f348776j = new C116330v(parcel.readString());
    }
}
