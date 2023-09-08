package uf0;

/* renamed from: uf0.g */
public class C102018g extends C102014a {

    /* renamed from: A */
    public static final int f300402A = C102016c.m134342d("vide");

    /* renamed from: B */
    public static final int f300403B = C102016c.m134342d("soun");

    /* renamed from: w */
    public long f300404w = 0;

    /* renamed from: x */
    public long f300405x = 0;

    /* renamed from: y */
    public long f300406y = 0;

    /* renamed from: z */
    public long f300407z = 0;

    static {
        C102016c.m134342d("hint");
    }

    public C102018g(int i, long j, int i2, long j2) {
        super(i, j, i2, j2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo141513b(java.io.RandomAccessFile r17, byte[] r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            int r3 = r17.read(r18)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x000e:
            r9 = 8
            if (r3 < r9) goto L_0x00e4
            int r10 = uf0.C102016c.m134343e(r2, r4)
            r11 = 4
            int r12 = uf0.C102016c.m134343e(r2, r11)
            int r13 = uf0.C102014a.f300384n
            java.lang.String r14 = "MicroMsg.MdiaAtom"
            r15 = -1
            if (r12 != r13) goto L_0x008d
            byte[] r5 = new byte[r11]
            int r12 = r1.read(r5)
            if (r12 >= r11) goto L_0x002c
            r8 = r14
            goto L_0x0080
        L_0x002c:
            int r12 = r12 + 0
            byte r13 = r5[r4]
            if (r13 != 0) goto L_0x0055
            long r4 = (long) r9
            boolean r4 = uf0.C102016c.m134346h(r1, r4)
            if (r4 != 0) goto L_0x003a
        L_0x0039:
            goto L_0x0052
        L_0x003a:
            int r12 = r12 + 8
            int r4 = r17.read(r18)
            if (r4 >= r9) goto L_0x0043
            goto L_0x0039
        L_0x0043:
            int r12 = r12 + r4
            r4 = 0
            long r8 = uf0.C102016c.m134345g(r2, r4)
            r0.f300404w = r8
            long r4 = uf0.C102016c.m134345g(r2, r11)
            r0.f300405x = r4
            r15 = r12
        L_0x0052:
            r8 = r14
        L_0x0053:
            r4 = 0
            goto L_0x0080
        L_0x0055:
            r4 = 16
            r8 = r14
            long r13 = (long) r4
            boolean r4 = uf0.C102016c.m134346h(r1, r13)
            if (r4 != 0) goto L_0x0060
        L_0x005f:
            goto L_0x0053
        L_0x0060:
            int r12 = r12 + 16
            int r4 = r1.read(r5)
            if (r4 >= r11) goto L_0x0069
            goto L_0x005f
        L_0x0069:
            int r12 = r12 + r4
            r4 = 0
            long r13 = uf0.C102016c.m134345g(r5, r4)
            r0.f300404w = r13
            int r5 = r17.read(r18)
            if (r5 >= r9) goto L_0x0078
            goto L_0x0080
        L_0x0078:
            int r12 = r12 + r5
            long r13 = uf0.C102016c.m134344f(r2, r4)
            r0.f300405x = r13
            r15 = r12
        L_0x0080:
            if (r15 > 0) goto L_0x0088
            java.lang.String r1 = "handle mdhd atom error."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r1)
            return r4
        L_0x0088:
            int r10 = r10 - r3
            int r10 = r10 - r15
            long r3 = (long) r10
            r5 = 1
            goto L_0x00cc
        L_0x008d:
            r8 = r14
            int r4 = uf0.C102014a.f300385o
            if (r12 != r4) goto L_0x00b9
            long r13 = (long) r9
            boolean r6 = uf0.C102016c.m134346h(r1, r13)
            if (r6 != 0) goto L_0x009b
            r4 = 0
            goto L_0x00ac
        L_0x009b:
            r4 = 0
            int r6 = r1.read(r2, r4, r11)
            if (r6 >= r11) goto L_0x00a3
            goto L_0x00ac
        L_0x00a3:
            int r9 = uf0.C102016c.m134343e(r2, r4)
            long r11 = (long) r9
            r0.f300406y = r11
            int r15 = r6 + 8
        L_0x00ac:
            if (r15 > 0) goto L_0x00b4
            java.lang.String r1 = "handle hdlr atom error."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r1)
            return r4
        L_0x00b4:
            int r10 = r10 - r3
            int r10 = r10 - r15
            long r3 = (long) r10
            r6 = 1
            goto L_0x00cc
        L_0x00b9:
            int r4 = uf0.C102014a.f300380j
            if (r12 != r4) goto L_0x00c9
            long r7 = r17.getFilePointer()
            long r11 = (long) r3
            long r7 = r7 - r11
            r0.f300407z = r7
            int r10 = r10 - r3
            long r3 = (long) r10
            r7 = 1
            goto L_0x00cc
        L_0x00c9:
            int r10 = r10 + -8
            long r3 = (long) r10
        L_0x00cc:
            if (r5 == 0) goto L_0x00d3
            if (r6 == 0) goto L_0x00d3
            if (r7 == 0) goto L_0x00d3
            goto L_0x00e4
        L_0x00d3:
            boolean r3 = uf0.C102016c.m134346h(r1, r3)
            if (r3 != 0) goto L_0x00db
            r3 = 0
            return r3
        L_0x00db:
            r3 = 0
            int r4 = r17.read(r18)
            r3 = r4
            r4 = 0
            goto L_0x000e
        L_0x00e4:
            r3 = 0
            if (r5 == 0) goto L_0x00ed
            if (r6 == 0) goto L_0x00ed
            if (r7 == 0) goto L_0x00ed
            r4 = 1
            goto L_0x00ee
        L_0x00ed:
            r4 = 0
        L_0x00ee:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: uf0.C102018g.mo141513b(java.io.RandomAccessFile, byte[]):boolean");
    }
}
