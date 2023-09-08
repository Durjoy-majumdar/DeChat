package p389v7;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import p333e8.C20528a;
import p333e8.C20540l;
import p333e8.C20551y;

/* renamed from: v7.b */
public final class C22717b {

    /* renamed from: h */
    public static final byte[] f65301h = {0, 7, 8, 15};

    /* renamed from: i */
    public static final byte[] f65302i = {0, 119, -120, -1};

    /* renamed from: j */
    public static final byte[] f65303j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a */
    public final Paint f65304a;

    /* renamed from: b */
    public final Paint f65305b;

    /* renamed from: c */
    public final Canvas f65306c = new Canvas();

    /* renamed from: d */
    public final C22719b f65307d = new C22719b(719, 575, 0, 719, 0, 575);

    /* renamed from: e */
    public final C22718a f65308e = new C22718a(0, new int[]{0, -1, -16777216, -8421505}, m26605a(), m26606b());

    /* renamed from: f */
    public final C22725h f65309f;

    /* renamed from: g */
    public Bitmap f65310g;

    /* renamed from: v7.b$a */
    public static final class C22718a {

        /* renamed from: a */
        public final int f65311a;

        /* renamed from: b */
        public final int[] f65312b;

        /* renamed from: c */
        public final int[] f65313c;

        /* renamed from: d */
        public final int[] f65314d;

        public C22718a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f65311a = i;
            this.f65312b = iArr;
            this.f65313c = iArr2;
            this.f65314d = iArr3;
        }
    }

    /* renamed from: v7.b$b */
    public static final class C22719b {

        /* renamed from: a */
        public final int f65315a;

        /* renamed from: b */
        public final int f65316b;

        /* renamed from: c */
        public final int f65317c;

        /* renamed from: d */
        public final int f65318d;

        /* renamed from: e */
        public final int f65319e;

        /* renamed from: f */
        public final int f65320f;

        public C22719b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f65315a = i;
            this.f65316b = i2;
            this.f65317c = i3;
            this.f65318d = i4;
            this.f65319e = i5;
            this.f65320f = i6;
        }
    }

    /* renamed from: v7.b$c */
    public static final class C22720c {

        /* renamed from: a */
        public final int f65321a;

        /* renamed from: b */
        public final boolean f65322b;

        /* renamed from: c */
        public final byte[] f65323c;

        /* renamed from: d */
        public final byte[] f65324d;

        public C22720c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.f65321a = i;
            this.f65322b = z;
            this.f65323c = bArr;
            this.f65324d = bArr2;
        }
    }

    /* renamed from: v7.b$d */
    public static final class C22721d {

        /* renamed from: a */
        public final int f65325a;

        /* renamed from: b */
        public final int f65326b;

        /* renamed from: c */
        public final SparseArray<C22722e> f65327c;

        public C22721d(int i, int i2, int i3, SparseArray<C22722e> sparseArray) {
            this.f65325a = i2;
            this.f65326b = i3;
            this.f65327c = sparseArray;
        }
    }

    /* renamed from: v7.b$e */
    public static final class C22722e {

        /* renamed from: a */
        public final int f65328a;

        /* renamed from: b */
        public final int f65329b;

        public C22722e(int i, int i2) {
            this.f65328a = i;
            this.f65329b = i2;
        }
    }

    /* renamed from: v7.b$f */
    public static final class C22723f {

        /* renamed from: a */
        public final int f65330a;

        /* renamed from: b */
        public final boolean f65331b;

        /* renamed from: c */
        public final int f65332c;

        /* renamed from: d */
        public final int f65333d;

        /* renamed from: e */
        public final int f65334e;

        /* renamed from: f */
        public final int f65335f;

        /* renamed from: g */
        public final int f65336g;

        /* renamed from: h */
        public final int f65337h;

        /* renamed from: i */
        public final int f65338i;

        /* renamed from: j */
        public final SparseArray<C22724g> f65339j;

        public C22723f(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SparseArray<C22724g> sparseArray) {
            this.f65330a = i;
            this.f65331b = z;
            this.f65332c = i2;
            this.f65333d = i3;
            this.f65334e = i5;
            this.f65335f = i6;
            this.f65336g = i7;
            this.f65337h = i8;
            this.f65338i = i9;
            this.f65339j = sparseArray;
        }
    }

    /* renamed from: v7.b$g */
    public static final class C22724g {

        /* renamed from: a */
        public final int f65340a;

        /* renamed from: b */
        public final int f65341b;

        public C22724g(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f65340a = i3;
            this.f65341b = i4;
        }
    }

    /* renamed from: v7.b$h */
    public static final class C22725h {

        /* renamed from: a */
        public final int f65342a;

        /* renamed from: b */
        public final int f65343b;

        /* renamed from: c */
        public final SparseArray<C22723f> f65344c = new SparseArray<>();

        /* renamed from: d */
        public final SparseArray<C22718a> f65345d = new SparseArray<>();

        /* renamed from: e */
        public final SparseArray<C22720c> f65346e = new SparseArray<>();

        /* renamed from: f */
        public final SparseArray<C22718a> f65347f = new SparseArray<>();

        /* renamed from: g */
        public final SparseArray<C22720c> f65348g = new SparseArray<>();

        /* renamed from: h */
        public C22719b f65349h;

        /* renamed from: i */
        public C22721d f65350i;

        public C22725h(int i, int i2) {
            this.f65342a = i;
            this.f65343b = i2;
        }
    }

    public C22717b(int i, int i2) {
        Paint paint = new Paint();
        this.f65304a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect((PathEffect) null);
        Paint paint2 = new Paint();
        this.f65305b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect((PathEffect) null);
        this.f65309f = new C22725h(i, i2);
    }

    /* renamed from: a */
    public static int[] m26605a() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = m26607c(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                int i2 = 127;
                int i3 = (i & 1) != 0 ? 127 : 0;
                int i4 = (i & 2) != 0 ? 127 : 0;
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = m26607c(255, i3, i4, i2);
            }
        }
        return iArr;
    }

    /* renamed from: b */
    public static int[] m26606b() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            int i2 = 255;
            if (i < 8) {
                int i3 = (i & 1) != 0 ? 255 : 0;
                int i4 = (i & 2) != 0 ? 255 : 0;
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = m26607c(63, i3, i4, i2);
            } else {
                int i5 = i & 136;
                int i6 = 170;
                int i7 = 85;
                if (i5 == 0) {
                    int i8 = ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0);
                    int i9 = ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0);
                    if ((i & 4) == 0) {
                        i7 = 0;
                    }
                    if ((i & 64) == 0) {
                        i6 = 0;
                    }
                    iArr[i] = m26607c(255, i8, i9, i7 + i6);
                } else if (i5 != 8) {
                    int i15 = 43;
                    if (i5 == 128) {
                        int i16 = ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0);
                        int i17 = ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0);
                        if ((i & 4) == 0) {
                            i15 = 0;
                        }
                        int i18 = i15 + 127;
                        if ((i & 64) == 0) {
                            i7 = 0;
                        }
                        iArr[i] = m26607c(255, i16, i17, i18 + i7);
                    } else if (i5 == 136) {
                        int i19 = ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0);
                        int i25 = ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0);
                        if ((i & 4) == 0) {
                            i15 = 0;
                        }
                        if ((i & 64) == 0) {
                            i7 = 0;
                        }
                        iArr[i] = m26607c(255, i19, i25, i15 + i7);
                    }
                } else {
                    int i26 = ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0);
                    int i27 = ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0);
                    if ((i & 4) == 0) {
                        i7 = 0;
                    }
                    if ((i & 64) == 0) {
                        i6 = 0;
                    }
                    iArr[i] = m26607c(127, i26, i27, i7 + i6);
                }
            }
        }
        return iArr;
    }

    /* renamed from: c */
    public static int m26607c(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: byte} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r5v16, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r5v5, types: [byte] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01b7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01ed A[LOOP:3: B:83:0x015b->B:116:0x01ed, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0128 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01da A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ff A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x013b A[LOOP:2: B:33:0x0096->B:70:0x013b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0162  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m26608d(byte[] r22, int[] r23, int r24, int r25, int r26, android.graphics.Paint r27, android.graphics.Canvas r28) {
        /*
            r0 = r22
            r1 = r24
            r8 = r27
            e8.l r9 = new e8.l
            int r2 = r0.length
            r9.<init>(r0, r2)
            r2 = r25
            r10 = r26
            r11 = 0
            r12 = 0
        L_0x0012:
            int r3 = r9.mo32085b()
            if (r3 == 0) goto L_0x0228
            r13 = 8
            int r3 = r9.mo32087d(r13)
            r4 = 240(0xf0, float:3.36E-43)
            if (r3 == r4) goto L_0x0222
            r14 = 3
            r15 = 4
            r7 = 2
            r6 = 1
            r5 = 0
            switch(r3) {
                case 16: goto L_0x0141;
                case 17: goto L_0x008a;
                case 18: goto L_0x002f;
                default: goto L_0x002a;
            }
        L_0x002a:
            r4 = 0
            switch(r3) {
                case 32: goto L_0x0212;
                case 33: goto L_0x0202;
                case 34: goto L_0x01f1;
                default: goto L_0x002e;
            }
        L_0x002e:
            goto L_0x0012
        L_0x002f:
            r14 = r2
            r2 = 0
        L_0x0031:
            int r3 = r9.mo32087d(r13)
            if (r3 == 0) goto L_0x003b
            r15 = r2
            r16 = 1
            goto L_0x005e
        L_0x003b:
            boolean r3 = r9.mo32086c()
            r4 = 7
            if (r3 != 0) goto L_0x0052
            int r3 = r9.mo32087d(r4)
            if (r3 == 0) goto L_0x004d
            r15 = r2
            r16 = r3
            r3 = 0
            goto L_0x005e
        L_0x004d:
            r3 = 0
            r15 = 1
            r16 = 0
            goto L_0x005e
        L_0x0052:
            int r3 = r9.mo32087d(r4)
            int r4 = r9.mo32087d(r13)
            r15 = r2
            r16 = r3
            r3 = r4
        L_0x005e:
            if (r16 == 0) goto L_0x007f
            if (r8 == 0) goto L_0x007f
            r2 = r23[r3]
            r8.setColor(r2)
            float r3 = (float) r14
            float r4 = (float) r10
            int r2 = r14 + r16
            float r7 = (float) r2
            int r2 = r10 + 1
            float r2 = (float) r2
            r17 = r2
            r2 = r28
            r0 = 0
            r5 = r7
            r7 = 1
            r6 = r17
            r0 = 1
            r7 = r27
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L_0x0080
        L_0x007f:
            r0 = 1
        L_0x0080:
            int r14 = r14 + r16
            if (r15 == 0) goto L_0x0086
            r2 = r14
            goto L_0x0012
        L_0x0086:
            r2 = r15
            r5 = 0
            r6 = 1
            goto L_0x0031
        L_0x008a:
            r0 = 1
            if (r1 != r14) goto L_0x0092
            byte[] r3 = f65303j
            r16 = r3
            goto L_0x0094
        L_0x0092:
            r16 = 0
        L_0x0094:
            r6 = r2
            r2 = 0
        L_0x0096:
            int r3 = r9.mo32087d(r15)
            if (r3 == 0) goto L_0x009e
            r5 = r3
            goto L_0x00f9
        L_0x009e:
            boolean r3 = r9.mo32086c()
            if (r3 != 0) goto L_0x00b4
            int r3 = r9.mo32087d(r14)
            if (r3 == 0) goto L_0x00b2
            int r3 = r3 + 2
            r18 = r2
            r19 = r3
            r5 = 0
            goto L_0x00fd
        L_0x00b2:
            r2 = 1
            goto L_0x00d1
        L_0x00b4:
            boolean r3 = r9.mo32086c()
            if (r3 != 0) goto L_0x00c5
            int r3 = r9.mo32087d(r7)
            int r3 = r3 + r15
            int r4 = r9.mo32087d(r15)
        L_0x00c3:
            r5 = r4
            goto L_0x00ed
        L_0x00c5:
            int r3 = r9.mo32087d(r7)
            if (r3 == 0) goto L_0x00f8
            if (r3 == r0) goto L_0x00f2
            if (r3 == r7) goto L_0x00e2
            if (r3 == r14) goto L_0x00d7
        L_0x00d1:
            r18 = r2
            r5 = 0
            r19 = 0
            goto L_0x00fd
        L_0x00d7:
            int r3 = r9.mo32087d(r13)
            int r3 = r3 + 25
            int r4 = r9.mo32087d(r15)
            goto L_0x00c3
        L_0x00e2:
            int r3 = r9.mo32087d(r15)
            int r3 = r3 + 9
            int r4 = r9.mo32087d(r15)
            goto L_0x00c3
        L_0x00ed:
            r18 = r2
            r19 = r3
            goto L_0x00fd
        L_0x00f2:
            r18 = r2
            r5 = 0
            r19 = 2
            goto L_0x00fd
        L_0x00f8:
            r5 = 0
        L_0x00f9:
            r18 = r2
            r19 = 1
        L_0x00fd:
            if (r19 == 0) goto L_0x0121
            if (r8 == 0) goto L_0x0121
            if (r16 == 0) goto L_0x0105
            byte r5 = r16[r5]
        L_0x0105:
            r2 = r23[r5]
            r8.setColor(r2)
            float r3 = (float) r6
            float r4 = (float) r10
            int r2 = r6 + r19
            float r5 = (float) r2
            int r2 = r10 + 1
            float r2 = (float) r2
            r20 = r2
            r2 = r28
            r21 = r6
            r6 = r20
            r15 = 2
            r7 = r27
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L_0x0124
        L_0x0121:
            r21 = r6
            r15 = 2
        L_0x0124:
            int r6 = r21 + r19
            if (r18 == 0) goto L_0x013b
            int r2 = r9.f57807c
            if (r2 != 0) goto L_0x012d
            goto L_0x0138
        L_0x012d:
            r2 = 0
            r9.f57807c = r2
            int r2 = r9.f57806b
            int r2 = r2 + r0
            r9.f57806b = r2
            r9.mo32084a()
        L_0x0138:
            r2 = r6
            goto L_0x0012
        L_0x013b:
            r2 = r18
            r7 = 2
            r15 = 4
            goto L_0x0096
        L_0x0141:
            r0 = 1
            r15 = 2
            if (r1 != r14) goto L_0x014c
            if (r11 != 0) goto L_0x014a
            byte[] r3 = f65302i
            goto L_0x0154
        L_0x014a:
            r3 = r11
            goto L_0x0154
        L_0x014c:
            if (r1 != r15) goto L_0x0157
            if (r12 != 0) goto L_0x0153
            byte[] r3 = f65301h
            goto L_0x0154
        L_0x0153:
            r3 = r12
        L_0x0154:
            r16 = r3
            goto L_0x0159
        L_0x0157:
            r16 = 0
        L_0x0159:
            r7 = r2
            r6 = 0
        L_0x015b:
            int r5 = r9.mo32087d(r15)
            if (r5 == 0) goto L_0x0162
            goto L_0x0179
        L_0x0162:
            boolean r2 = r9.mo32086c()
            if (r2 == 0) goto L_0x0172
            int r2 = r9.mo32087d(r14)
            int r2 = r2 + r14
            int r3 = r9.mo32087d(r15)
            goto L_0x0195
        L_0x0172:
            boolean r2 = r9.mo32086c()
            if (r2 == 0) goto L_0x017e
            r5 = 0
        L_0x0179:
            r18 = r6
            r19 = 1
            goto L_0x01b5
        L_0x017e:
            int r2 = r9.mo32087d(r15)
            if (r2 == 0) goto L_0x01af
            if (r2 == r0) goto L_0x01a9
            if (r2 == r15) goto L_0x0197
            if (r2 == r14) goto L_0x018b
            goto L_0x01b0
        L_0x018b:
            int r2 = r9.mo32087d(r13)
            int r2 = r2 + 29
            int r3 = r9.mo32087d(r15)
        L_0x0195:
            r5 = r3
            goto L_0x01a4
        L_0x0197:
            r2 = 4
            int r3 = r9.mo32087d(r2)
            int r3 = r3 + 12
            int r2 = r9.mo32087d(r15)
            r5 = r2
            r2 = r3
        L_0x01a4:
            r19 = r2
            r18 = r6
            goto L_0x01b5
        L_0x01a9:
            r18 = r6
            r5 = 0
            r19 = 2
            goto L_0x01b5
        L_0x01af:
            r6 = 1
        L_0x01b0:
            r18 = r6
            r5 = 0
            r19 = 0
        L_0x01b5:
            if (r19 == 0) goto L_0x01d4
            if (r8 == 0) goto L_0x01d4
            if (r16 == 0) goto L_0x01bd
            byte r5 = r16[r5]
        L_0x01bd:
            r2 = r23[r5]
            r8.setColor(r2)
            float r3 = (float) r7
            float r4 = (float) r10
            int r2 = r7 + r19
            float r5 = (float) r2
            int r2 = r10 + 1
            float r6 = (float) r2
            r2 = r28
            r20 = r7
            r7 = r27
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L_0x01d6
        L_0x01d4:
            r20 = r7
        L_0x01d6:
            int r7 = r20 + r19
            if (r18 == 0) goto L_0x01ed
            int r2 = r9.f57807c
            if (r2 != 0) goto L_0x01df
            goto L_0x01ea
        L_0x01df:
            r4 = 0
            r9.f57807c = r4
            int r2 = r9.f57806b
            int r2 = r2 + r0
            r9.f57806b = r2
            r9.mo32084a()
        L_0x01ea:
            r2 = r7
            goto L_0x0012
        L_0x01ed:
            r6 = r18
            goto L_0x015b
        L_0x01f1:
            r0 = 16
            byte[] r11 = new byte[r0]
            r5 = 0
        L_0x01f6:
            if (r5 >= r0) goto L_0x0012
            int r3 = r9.mo32087d(r13)
            byte r3 = (byte) r3
            r11[r5] = r3
            int r5 = r5 + 1
            goto L_0x01f6
        L_0x0202:
            r0 = 4
            byte[] r11 = new byte[r0]
            r5 = 0
        L_0x0206:
            if (r5 >= r0) goto L_0x0012
            int r3 = r9.mo32087d(r13)
            byte r3 = (byte) r3
            r11[r5] = r3
            int r5 = r5 + 1
            goto L_0x0206
        L_0x0212:
            r0 = 4
            byte[] r12 = new byte[r0]
            r5 = 0
        L_0x0216:
            if (r5 >= r0) goto L_0x0012
            int r3 = r9.mo32087d(r0)
            byte r3 = (byte) r3
            r12[r5] = r3
            int r5 = r5 + 1
            goto L_0x0216
        L_0x0222:
            int r10 = r10 + 2
            r2 = r25
            goto L_0x0012
        L_0x0228:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p389v7.C22717b.m26608d(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    /* renamed from: e */
    public static C22718a m26609e(C20540l lVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        C20540l lVar2 = lVar;
        int i6 = 8;
        int d = lVar2.mo32087d(8);
        lVar2.mo32089f(8);
        int i7 = i - 2;
        int i8 = 4;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] a = m26605a();
        int[] b = m26606b();
        while (i7 > 0) {
            int d2 = lVar2.mo32087d(i6);
            int d3 = lVar2.mo32087d(i6);
            int i9 = i7 - 2;
            int[] iArr2 = (d3 & 128) != 0 ? iArr : (d3 & 64) != 0 ? a : b;
            if ((d3 & 1) != 0) {
                i5 = lVar2.mo32087d(i6);
                i4 = lVar2.mo32087d(i6);
                i3 = lVar2.mo32087d(i6);
                i2 = lVar2.mo32087d(i6);
                i7 = i9 - 4;
            } else {
                i7 = i9 - 2;
                i4 = lVar2.mo32087d(i8) << i8;
                i2 = lVar2.mo32087d(2) << 6;
                i5 = lVar2.mo32087d(6) << 2;
                i3 = lVar2.mo32087d(i8) << i8;
            }
            if (i5 == 0) {
                i4 = 0;
                i3 = 0;
                i2 = 255;
            }
            int i15 = d;
            double d4 = (double) i5;
            double d5 = (double) (i4 - 128);
            double d6 = (double) (i3 - 128);
            int i16 = C20551y.f57835a;
            iArr2[d2] = m26607c((byte) (255 - (i2 & 255)), Math.max(0, Math.min((int) (d4 + (1.402d * d5)), 255)), Math.max(0, Math.min((int) ((d4 - (0.34414d * d6)) - (d5 * 0.71414d)), 255)), Math.max(0, Math.min((int) (d4 + (d6 * 1.772d)), 255)));
            iArr = iArr;
            d = i15;
            i6 = 8;
            i8 = 4;
        }
        return new C22718a(d, iArr, a, b);
    }

    /* renamed from: f */
    public static C22720c m26610f(C20540l lVar) {
        byte[] bArr;
        int d = lVar.mo32087d(16);
        lVar.mo32089f(4);
        int d2 = lVar.mo32087d(2);
        boolean c = lVar.mo32086c();
        boolean z = true;
        lVar.mo32089f(1);
        byte[] bArr2 = null;
        if (d2 == 1) {
            lVar.mo32089f(lVar.mo32087d(8) * 16);
        } else if (d2 == 0) {
            int d3 = lVar.mo32087d(16);
            int d4 = lVar.mo32087d(16);
            if (d3 > 0) {
                bArr2 = new byte[d3];
                C20528a.m22240d(lVar.f57807c == 0);
                System.arraycopy(lVar.f57805a, lVar.f57806b, bArr2, 0, d3);
                lVar.f57806b += d3;
                lVar.mo32084a();
            }
            if (d4 > 0) {
                bArr = new byte[d4];
                if (lVar.f57807c != 0) {
                    z = false;
                }
                C20528a.m22240d(z);
                System.arraycopy(lVar.f57805a, lVar.f57806b, bArr, 0, d4);
                lVar.f57806b += d4;
                lVar.mo32084a();
                return new C22720c(d, c, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new C22720c(d, c, bArr2, bArr);
    }
}
