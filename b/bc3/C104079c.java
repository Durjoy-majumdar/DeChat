package bc3;

import android.opengl.GLES20;

/* renamed from: bc3.c */
public class C104079c {

    /* renamed from: a */
    public C104078b f307847a;

    /* renamed from: b */
    public C104080d f307848b;

    /* renamed from: c */
    public C104077a f307849c;

    /* renamed from: d */
    public int f307850d;

    public C104079c() {
        this.f307850d = 0;
        this.f307847a = new C104078b();
        this.f307848b = new C104080d();
        this.f307849c = new C104077a();
    }

    /* renamed from: a */
    public void mo145682a() {
        C104078b bVar = this.f307847a;
        if (bVar != null) {
            int[] iArr = bVar.f307835e;
            if (iArr[0] != 0) {
                GLES20.glDeleteFramebuffers(1, iArr, 0);
                bVar.f307835e[0] = 0;
            }
            int[] iArr2 = bVar.f307836f;
            if (iArr2[0] != 0) {
                GLES20.glDeleteTextures(1, iArr2, 0);
                bVar.f307836f[0] = 0;
            }
            int i = bVar.f307837g;
            if (i != 0) {
                GLES20.glDeleteProgram(i);
                bVar.f307837g = 0;
            }
            this.f307847a = null;
        }
        C104080d dVar = this.f307848b;
        if (dVar != null) {
            int[] iArr3 = dVar.f307859e;
            if (iArr3[0] != 0) {
                GLES20.glDeleteFramebuffers(1, iArr3, 0);
                dVar.f307859e[0] = 0;
            }
            int[] iArr4 = dVar.f307860f;
            if (iArr4[0] != 0) {
                GLES20.glDeleteTextures(1, iArr4, 0);
                dVar.f307860f[0] = 0;
            }
            int i2 = dVar.f307861g;
            if (i2 != 0) {
                GLES20.glDeleteProgram(i2);
                dVar.f307861g = 0;
            }
            this.f307848b = null;
        }
        C104077a aVar = this.f307849c;
        if (aVar != null) {
            for (int i3 = 0; i3 < 3; i3++) {
                int[] iArr5 = aVar.f307818e;
                if (iArr5[i3] != 0) {
                    GLES20.glDeleteFramebuffers(1, iArr5, i3);
                    aVar.f307818e[i3] = 0;
                }
                int[] iArr6 = aVar.f307819f;
                if (iArr6[i3] != 0) {
                    GLES20.glDeleteTextures(1, iArr6, i3);
                    aVar.f307819f[i3] = 0;
                }
            }
            int i4 = aVar.f307820g;
            if (i4 != 0) {
                GLES20.glDeleteProgram(i4);
                aVar.f307820g = 0;
            }
            this.f307849c = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo145683b(int r13, int r14, int r15, int r16, boolean r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r13
            r6 = r14
            r7 = r15
            int r2 = java.lang.Math.max(r14, r15)
            r3 = 1344(0x540, float:1.883E-42)
            r4 = 1
            r5 = 0
            r8 = 2
            if (r2 <= r3) goto L_0x0012
            if (r17 != 0) goto L_0x0012
            goto L_0x0023
        L_0x0012:
            if (r2 <= r3) goto L_0x0017
            if (r17 == 0) goto L_0x0017
            goto L_0x001b
        L_0x0017:
            r3 = 1280(0x500, float:1.794E-42)
            if (r2 < r3) goto L_0x001d
        L_0x001b:
            r9 = 2
            goto L_0x0024
        L_0x001d:
            r3 = 640(0x280, float:8.97E-43)
            if (r2 < r3) goto L_0x0023
            r9 = 1
            goto L_0x0024
        L_0x0023:
            r9 = 0
        L_0x0024:
            if (r9 == 0) goto L_0x006d
            r2 = 8
            if (r7 < r2) goto L_0x006d
            if (r6 >= r2) goto L_0x002d
            goto L_0x006d
        L_0x002d:
            int r2 = r0.f307850d
            r3 = 4
            if (r2 == r8) goto L_0x003c
            if (r2 != r3) goto L_0x0035
            goto L_0x003c
        L_0x0035:
            bc3.b r2 = r0.f307847a
            int r1 = r2.mo145681d(r13, r14, r15, r5)
            goto L_0x0042
        L_0x003c:
            bc3.b r2 = r0.f307847a
            int r1 = r2.mo145681d(r13, r14, r15, r4)
        L_0x0042:
            r2 = r1
            bc3.a r1 = r0.f307849c
            r1.mo145677d(r2, r14, r15, r9)
            bc3.a r1 = r0.f307849c
            int[] r1 = r1.f307819f
            r5 = r1[r5]
            r4 = r1[r4]
            r10 = r1[r8]
            int r1 = r0.f307850d
            if (r1 == r8) goto L_0x005b
            r11 = 3
            if (r1 == r11) goto L_0x005b
            if (r1 != r3) goto L_0x0060
        L_0x005b:
            if (r9 != r8) goto L_0x0060
            r3 = r4
            r4 = r10
            goto L_0x0061
        L_0x0060:
            r3 = r5
        L_0x0061:
            bc3.d r1 = r0.f307848b
            r5 = r10
            r6 = r14
            r7 = r15
            r8 = r9
            r9 = r16
            int r1 = r1.mo145687d(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x006d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bc3.C104079c.mo145683b(int, int, int, int, boolean):int");
    }

    public C104079c(int i) {
        this.f307850d = i;
        this.f307847a = new C104078b(i);
        this.f307848b = new C104080d(this.f307850d);
        this.f307849c = new C104077a(this.f307850d);
    }
}
