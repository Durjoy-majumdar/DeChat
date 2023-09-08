package rp3;

import android.opengl.GLES20;
import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import com.google.android.gms.gcm.Task;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: rp3.d */
public class C110605d extends C110604c {

    /* renamed from: r */
    public static final float[] f330884r = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: s */
    public static final float[] f330885s = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* renamed from: k */
    public List<C110604c> f330886k;

    /* renamed from: l */
    public List<C110604c> f330887l;

    /* renamed from: m */
    public int[] f330888m;

    /* renamed from: n */
    public int[] f330889n;

    /* renamed from: o */
    public final FloatBuffer f330890o;

    /* renamed from: p */
    public final FloatBuffer f330891p;

    /* renamed from: q */
    public final FloatBuffer f330892q;

    public C110605d() {
        this.f330886k = null;
        this.f330886k = new ArrayList();
        float[] fArr = f330884r;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f330890o = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        float[] fArr2 = f330885s;
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f330891p = asFloatBuffer2;
        asFloatBuffer2.put(fArr2).position(0);
        float[] b = C110617n.m150612b(C110614k.NORMAL, false, true);
        FloatBuffer asFloatBuffer3 = ByteBuffer.allocateDirect(b.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f330892q = asFloatBuffer3;
        asFloatBuffer3.put(b).position(0);
    }

    /* renamed from: c */
    public void mo162162c() {
        int[] iArr = this.f330889n;
        if (iArr != null) {
            GLES20.glDeleteTextures(iArr.length, iArr, 0);
            this.f330889n = null;
        }
        int[] iArr2 = this.f330888m;
        if (iArr2 != null) {
            GLES20.glDeleteFramebuffers(iArr2.length, iArr2, 0);
            this.f330888m = null;
        }
        for (C110604c a : this.f330886k) {
            a.mo162160a();
        }
    }

    /* renamed from: d */
    public void mo162163d(int i, int i2, int i3, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        List<C110604c> list;
        mo162169j();
        if (this.f330883j && this.f330888m != null && this.f330889n != null && (list = this.f330887l) != null) {
            int size = ((ArrayList) list).size();
            int i4 = i;
            int i5 = 0;
            while (i5 < size) {
                C110604c cVar = (C110604c) ((ArrayList) this.f330887l).get(i5);
                int i6 = size - 1;
                boolean z = i5 < i6;
                if (z) {
                    GLES20.glBindFramebuffer(36160, this.f330888m[i5]);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if (i5 == 0) {
                    cVar.mo162163d(i4, i, i, floatBuffer, floatBuffer2);
                } else if (i5 == i6) {
                    cVar.mo162163d(i4, i, i, this.f330890o, size % 2 == 0 ? this.f330892q : this.f330891p);
                } else {
                    cVar.mo162163d(i4, i, i, this.f330890o, this.f330891p);
                }
                if (z) {
                    GLES20.glBindFramebuffer(36160, 0);
                    i4 = this.f330889n[i5];
                }
                i5++;
            }
        }
    }

    /* renamed from: g */
    public void mo162166g() {
        super.mo162166g();
        for (C110604c b : this.f330886k) {
            b.mo162161b();
        }
    }

    /* renamed from: h */
    public void mo162167h(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        this.f330881h = i3;
        this.f330882i = i4;
        if (this.f330888m != null) {
            int[] iArr = this.f330889n;
            if (iArr != null) {
                GLES20.glDeleteTextures(iArr.length, iArr, 0);
                this.f330889n = null;
            }
            int[] iArr2 = this.f330888m;
            if (iArr2 != null) {
                GLES20.glDeleteFramebuffers(iArr2.length, iArr2, 0);
                this.f330888m = null;
            }
        }
        int size = this.f330886k.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f330886k.get(i5).mo162167h(i3, i4);
        }
        List<C110604c> list = this.f330887l;
        if (list != null && ((ArrayList) list).size() > 0) {
            int size2 = ((ArrayList) this.f330887l).size() - 1;
            this.f330888m = new int[size2];
            this.f330889n = new int[size2];
            for (int i6 = 0; i6 < size2; i6++) {
                GLES20.glGenFramebuffers(1, this.f330888m, i6);
                GLES20.glGenTextures(1, this.f330889n, i6);
                GLES20.glBindTexture(3553, this.f330889n[i6]);
                GLES20.glTexImage2D(3553, 0, NativeBitmapStruct.GLFormat.GL_RGBA, i, i2, 0, NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, (Buffer) null);
                GLES20.glTexParameterf(3553, Task.EXTRAS_LIMIT_BYTES, 9729.0f);
                GLES20.glTexParameterf(3553, 10241, 9729.0f);
                GLES20.glTexParameterf(3553, 10242, 33071.0f);
                GLES20.glTexParameterf(3553, 10243, 33071.0f);
                GLES20.glBindFramebuffer(36160, this.f330888m[i6]);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f330889n[i6], 0);
                GLES20.glBindTexture(3553, 0);
                GLES20.glBindFramebuffer(36160, 0);
            }
        }
    }

    /* renamed from: k */
    public void mo162170k() {
        if (this.f330886k != null) {
            List<C110604c> list = this.f330887l;
            if (list == null) {
                this.f330887l = new ArrayList();
            } else {
                list.clear();
            }
            for (C110604c next : this.f330886k) {
                if (next instanceof C110605d) {
                    C110605d dVar = (C110605d) next;
                    dVar.mo162170k();
                    List<C110604c> list2 = dVar.f330887l;
                    if (list2 != null && !list2.isEmpty()) {
                        this.f330887l.addAll(list2);
                    }
                } else {
                    this.f330887l.add(next);
                }
            }
        }
    }
}
