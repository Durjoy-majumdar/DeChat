package rp3;

import android.opengl.GLES20;
import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import com.google.android.gms.gcm.Task;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: rp3.g */
public class C110608g extends C110604c {

    /* renamed from: A */
    public boolean f330901A = false;

    /* renamed from: B */
    public boolean f330902B = false;

    /* renamed from: C */
    public FloatBuffer f330903C;

    /* renamed from: D */
    public FloatBuffer f330904D;

    /* renamed from: k */
    public C110606e f330905k;

    /* renamed from: l */
    public C110607f f330906l;

    /* renamed from: m */
    public C110604c f330907m;

    /* renamed from: n */
    public C110604c f330908n;

    /* renamed from: o */
    public List<C110604c> f330909o = new ArrayList();

    /* renamed from: p */
    public List<C110604c> f330910p;

    /* renamed from: q */
    public int[] f330911q;

    /* renamed from: r */
    public int[] f330912r;

    /* renamed from: s */
    public int[] f330913s;

    /* renamed from: t */
    public int f330914t;

    /* renamed from: u */
    public final FloatBuffer f330915u;

    /* renamed from: v */
    public ByteBuffer f330916v;

    /* renamed from: w */
    public int f330917w = 0;

    /* renamed from: x */
    public int f330918x = 0;

    /* renamed from: y */
    public int f330919y;

    /* renamed from: z */
    public int f330920z;

    public C110608g(boolean z) {
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f330903C = asFloatBuffer;
        asFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        this.f330903C.position(0);
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f330904D = asFloatBuffer2;
        asFloatBuffer2.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        this.f330904D.position(0);
        float[] b = C110617n.m150612b(C110614k.NORMAL, false, true);
        FloatBuffer asFloatBuffer3 = ByteBuffer.allocateDirect(b.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f330915u = asFloatBuffer3;
        asFloatBuffer3.put(b).position(0);
        this.f330905k = new C110606e();
        this.f330906l = new C110607f();
        this.f330907m = new C110604c();
        if (z) {
            this.f330908n = new C110604c();
        }
        this.f330901A = z;
        this.f330909o.add(this.f330905k);
        this.f330909o.add(this.f330906l);
        this.f330909o.add(this.f330907m);
        if (z) {
            this.f330909o.add(this.f330908n);
        }
        mo162176p();
    }

    /* renamed from: c */
    public void mo162162c() {
        mo162172l();
        Iterator it = ((ArrayList) this.f330909o).iterator();
        while (it.hasNext()) {
            ((C110604c) it.next()).mo162160a();
        }
        this.f330918x = 0;
        this.f330917w = 0;
    }

    /* renamed from: d */
    public void mo162163d(int i, int i2, int i3, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        int[] iArr;
        mo162169j();
        if (this.f330883j && (iArr = this.f330911q) != null && this.f330913s != null && this.f330910p != null) {
            try {
                GLES20.glBindFramebuffer(36160, iArr[0]);
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                this.f330905k.mo162163d(i, this.f330913s[1], i, this.f330903C, this.f330904D);
                GLES20.glBindFramebuffer(36160, 0);
                if (this.f330901A) {
                    GLES20.glBindFramebuffer(36160, this.f330911q[1]);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    C110607f fVar = this.f330906l;
                    int[] iArr2 = this.f330913s;
                    fVar.mo162163d(i, iArr2[1], iArr2[0], this.f330903C, this.f330915u);
                    mo162173m();
                    GLES20.glBindFramebuffer(36160, 0);
                    this.f330908n.mo162163d(this.f330913s[1], i, i, floatBuffer, floatBuffer2);
                } else {
                    GLES20.glBindFramebuffer(36160, this.f330912r[0]);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    C110607f fVar2 = this.f330906l;
                    int[] iArr3 = this.f330913s;
                    fVar2.mo162163d(i, iArr3[1], iArr3[0], this.f330903C, this.f330904D);
                    GLES20.glBindFramebuffer(36160, 0);
                }
                GLES20.glBindFramebuffer(36160, this.f330911q[1]);
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                C110604c cVar = this.f330907m;
                int i4 = this.f330914t;
                cVar.mo162163d(i4, i4, i4, this.f330903C, this.f330904D);
                GLES20.glBindFramebuffer(36160, 0);
            } catch (Exception | IndexOutOfBoundsException unused) {
            }
        }
    }

    /* renamed from: g */
    public void mo162166g() {
        super.mo162166g();
        Iterator it = ((ArrayList) this.f330909o).iterator();
        while (it.hasNext()) {
            ((C110604c) it.next()).mo162161b();
        }
    }

    /* renamed from: h */
    public void mo162167h(int i, int i2) {
        int i3;
        int i4 = i;
        int i5 = i2;
        if (i4 > 0 && i5 > 0) {
            if (this.f330917w != i4 || this.f330918x != i5 || this.f330902B) {
                this.f330917w = i4;
                this.f330918x = i5;
                C110606e eVar = this.f330905k;
                eVar.mo162168i(new C110603b(eVar, eVar.f330898t, (float) i4));
                eVar.mo162168i(new C110603b(eVar, eVar.f330899u, (float) i5));
                int i6 = this.f330917w;
                int i7 = this.f330918x;
                this.f330881h = i6;
                this.f330882i = i7;
                if (this.f330911q != null) {
                    mo162172l();
                }
                int[] iArr = this.f330913s;
                if (iArr != null) {
                    GLES20.glDeleteTextures(iArr.length, iArr, 0);
                    this.f330913s = null;
                }
                int size = ((ArrayList) this.f330909o).size();
                for (int i8 = 0; i8 < size; i8++) {
                    if (i8 < size - 1) {
                        ((C110604c) ((ArrayList) this.f330909o).get(i8)).mo162167h(this.f330917w, this.f330918x);
                    } else if (this.f330901A) {
                        ((C110604c) ((ArrayList) this.f330909o).get(i8)).mo162167h(this.f330919y, this.f330920z);
                    } else {
                        ((C110604c) ((ArrayList) this.f330909o).get(i8)).mo162167h(this.f330917w, this.f330918x);
                    }
                }
                List<C110604c> list = this.f330910p;
                if (list != null && ((ArrayList) list).size() > 0) {
                    int i9 = 1;
                    int size2 = ((ArrayList) this.f330910p).size() - 1;
                    this.f330911q = new int[size2];
                    this.f330913s = new int[size2];
                    int i15 = 0;
                    while (i15 < size2) {
                        GLES20.glGenFramebuffers(i9, this.f330911q, i15);
                        GLES20.glBindFramebuffer(36160, this.f330911q[i15]);
                        GLES20.glGenTextures(i9, this.f330913s, i15);
                        GLES20.glBindTexture(3553, this.f330913s[i15]);
                        GLES20.glTexImage2D(3553, 0, NativeBitmapStruct.GLFormat.GL_RGBA, this.f330917w, this.f330918x, 0, NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, (Buffer) null);
                        GLES20.glTexParameterf(3553, Task.EXTRAS_LIMIT_BYTES, 9729.0f);
                        GLES20.glTexParameterf(3553, 10241, 9729.0f);
                        GLES20.glTexParameterf(3553, 10242, 33071.0f);
                        GLES20.glTexParameterf(3553, 10243, 33071.0f);
                        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f330913s[i15], 0);
                        GLES20.glBindTexture(3553, 0);
                        GLES20.glBindFramebuffer(36160, 0);
                        i15++;
                        i9 = 1;
                    }
                    if (!this.f330901A) {
                        mo162171k();
                    }
                    int i16 = this.f330917w;
                    int i17 = this.f330918x;
                    int size3 = ((ArrayList) this.f330910p).size();
                    int i18 = 0;
                    while (i18 < size3 - 1) {
                        if (this.f330913s[i18] == -1) {
                            GLES20.glBindFramebuffer(36160, this.f330911q[i18]);
                            GLES20.glGenTextures(1, this.f330913s, i18);
                            GLES20.glBindTexture(3553, this.f330913s[i18]);
                            i3 = i18;
                            GLES20.glTexImage2D(3553, 0, NativeBitmapStruct.GLFormat.GL_RGBA, i16, i17, 0, NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, (Buffer) null);
                            GLES20.glTexParameterf(3553, Task.EXTRAS_LIMIT_BYTES, 9729.0f);
                            GLES20.glTexParameterf(3553, 10241, 9729.0f);
                            GLES20.glTexParameterf(3553, 10242, 33071.0f);
                            GLES20.glTexParameterf(3553, 10243, 33071.0f);
                            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f330913s[i3], 0);
                            GLES20.glBindTexture(3553, 0);
                            GLES20.glBindFramebuffer(36160, 0);
                        } else {
                            i3 = i18;
                        }
                        i18 = i3 + 1;
                    }
                    if (!this.f330901A && this.f330912r[0] == -1) {
                        mo162171k();
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public void mo162171k() {
        if (!this.f330901A) {
            int[] iArr = this.f330912r;
            if (iArr != null) {
                GLES20.glDeleteFramebuffers(iArr.length, iArr, 0);
                this.f330912r = null;
            }
            if (this.f330912r == null) {
                int[] iArr2 = new int[1];
                this.f330912r = iArr2;
                GLES20.glGenFramebuffers(1, iArr2, 0);
            }
            GLES20.glBindFramebuffer(36160, this.f330912r[0]);
            GLES20.glBindTexture(3553, this.f330914t);
            GLES20.glTexImage2D(3553, 0, NativeBitmapStruct.GLFormat.GL_RGBA, this.f330917w, this.f330918x, 0, NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, (Buffer) null);
            GLES20.glTexParameterf(3553, Task.EXTRAS_LIMIT_BYTES, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f330914t, 0);
            GLES20.glBindTexture(3553, 0);
            GLES20.glBindFramebuffer(36160, 0);
        }
    }

    /* renamed from: l */
    public final void mo162172l() {
        int[] iArr = this.f330913s;
        if (iArr != null) {
            GLES20.glDeleteTextures(iArr.length, iArr, 0);
            this.f330913s = null;
        }
        int[] iArr2 = this.f330911q;
        if (iArr2 != null) {
            GLES20.glDeleteFramebuffers(iArr2.length, iArr2, 0);
            this.f330911q = null;
        }
        int[] iArr3 = this.f330912r;
        if (iArr3 != null) {
            GLES20.glDeleteFramebuffers(iArr3.length, iArr3, 0);
            this.f330912r = null;
        }
    }

    /* renamed from: m */
    public final void mo162173m() {
        ByteBuffer byteBuffer = this.f330916v;
        if (byteBuffer == null || byteBuffer.capacity() < this.f330918x * this.f330917w * 4) {
            this.f330916v = ByteBuffer.allocateDirect(this.f330918x * this.f330917w * 4).order(ByteOrder.nativeOrder());
        }
        this.f330916v.position(0);
        GLES20.glReadPixels(0, 0, this.f330917w, this.f330918x, NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, this.f330916v);
        this.f330916v.position(0);
        this.f330916v.array();
        GLES20.glBindFramebuffer(36160, 0);
    }

    /* renamed from: n */
    public void mo162174n(int i, float[] fArr, float[] fArr2) {
        for (int i2 = 0; i2 < 8; i2++) {
            fArr2[i2] = fArr[i2];
        }
        if (i == 1) {
            float f = fArr2[0];
            float f2 = fArr2[1];
            fArr2[0] = fArr2[4];
            fArr2[1] = fArr2[5];
            fArr2[4] = fArr2[6];
            fArr2[5] = fArr2[7];
            fArr2[6] = fArr2[2];
            fArr2[7] = fArr2[3];
            fArr2[2] = f;
            fArr2[3] = f2;
        } else if (i == 2) {
            float f3 = fArr2[0];
            fArr2[0] = fArr2[6];
            fArr2[6] = f3;
            float f4 = fArr2[1];
            fArr2[1] = fArr2[7];
            fArr2[7] = f4;
            float f5 = fArr2[2];
            fArr2[2] = fArr2[4];
            fArr2[4] = f5;
            float f6 = fArr2[3];
            fArr2[3] = fArr2[5];
            fArr2[5] = f6;
        } else if (i == 3) {
            float f7 = fArr2[0];
            float f8 = fArr2[1];
            fArr2[0] = fArr2[2];
            fArr2[1] = fArr2[3];
            fArr2[2] = fArr2[6];
            fArr2[3] = fArr2[7];
            fArr2[6] = fArr2[4];
            fArr2[7] = fArr2[5];
            fArr2[4] = f7;
            fArr2[5] = f8;
        }
    }

    /* renamed from: o */
    public void mo162175o(boolean z) {
        this.f330901A = z;
        if (this.f330908n == null) {
            C110604c cVar = new C110604c();
            this.f330908n = cVar;
            ((ArrayList) this.f330909o).add(cVar);
            this.f330902B = true;
            mo162176p();
            this.f330908n.mo162161b();
            mo162167h(this.f330917w, this.f330918x);
        }
        this.f330902B = false;
    }

    /* renamed from: p */
    public void mo162176p() {
        if (this.f330909o != null) {
            List<C110604c> list = this.f330910p;
            if (list == null) {
                this.f330910p = new ArrayList();
            } else {
                list.clear();
            }
            for (C110604c next : this.f330909o) {
                if (next instanceof C110605d) {
                    C110605d dVar = (C110605d) next;
                    dVar.mo162170k();
                    List<C110604c> list2 = dVar.f330887l;
                    if (list2 != null && !((ArrayList) list2).isEmpty()) {
                        this.f330910p.addAll(list2);
                    }
                } else {
                    this.f330910p.add(next);
                }
            }
        }
    }
}
