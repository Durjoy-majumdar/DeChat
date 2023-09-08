package com.tencent.p014mm.xeffect;

import android.graphics.Rect;
import android.opengl.GLES20;
import android.opengl.GLES31;
import com.tencent.p014mm.xeffect.effect.EffectManager;
import java.util.Iterator;
import java.util.List;
import qr3.C110469c;
import qr3.C36070f;

/* renamed from: com.tencent.mm.xeffect.VLogDirector */
public class VLogDirector {

    /* renamed from: a */
    public long f319980a;

    /* renamed from: b */
    public long f319981b;

    /* renamed from: c */
    public int f319982c;

    /* renamed from: d */
    public int f319983d;

    /* renamed from: e */
    public long f319984e = 0;

    static {
        C36070f.m40901a("xlabeffect");
        C36070f.m40901a("pag");
    }

    private static native int nAddInputTexture(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i15, int i16, int i17, long j2, long j3, long j4, boolean z, boolean z2);

    private static native void nDestroy(long j);

    private static native long nInit();

    private static native int nRender(long j, int i, int i2, int i3, long j2);

    private static native void nSetEffectManager(long j, long j2);

    private static native int nSetOutputTexCropRet(long j, int i, int i2, int i3, int i4);

    private static native int nSetRenderArea(long j, int i, int i2, int i3, int i4);

    /* renamed from: a */
    public final void mo154913a() {
        if (Thread.currentThread().getId() != this.f319981b) {
            XEffectLog.f319986a.mo143271e("VLogDirector", "Thread error", new Object[0]);
        }
    }

    /* renamed from: b */
    public void mo154914b() {
        mo154913a();
        long j = this.f319980a;
        if (j != 0) {
            nDestroy(j);
            this.f319980a = 0;
            this.f319984e = 0;
        }
    }

    /* renamed from: c */
    public void mo154915c() {
        this.f319981b = Thread.currentThread().getId();
        boolean z = C36070f.f96151a;
        if (C36070f.f96151a) {
            this.f319980a = nInit();
        } else {
            this.f319980a = 0;
        }
    }

    /* renamed from: d */
    public void mo154916d(List<C110469c> list, int i, long j) {
        mo154913a();
        if (this.f319980a != 0) {
            Iterator<C110469c> it = list.iterator();
            while (true) {
                boolean z = true;
                if (!it.hasNext()) {
                    break;
                }
                C110469c next = it.next();
                if (next == null) {
                    XEffectLog.f319986a.mo143271e("VLogDirector", "input is null", new Object[0]);
                    z = false;
                }
                if (z) {
                    LayoutInfo layoutInfo = next.f330360i;
                    layoutInfo.nUpdate(layoutInfo.f319975a, layoutInfo.f319976b, layoutInfo.f319977c, layoutInfo.f319978d, 0.0f, layoutInfo.f319979e);
                    LayoutInfo layoutInfo2 = next.f330361j;
                    layoutInfo2.nUpdate(layoutInfo2.f319975a, layoutInfo2.f319976b, layoutInfo2.f319977c, layoutInfo2.f319978d, 0.0f, layoutInfo2.f319979e);
                    InputAnimation inputAnimation = next.f330362k;
                    inputAnimation.nUpdate(inputAnimation.f319972a, inputAnimation.f319973b, inputAnimation.f319974c, 0);
                    long j2 = this.f319980a;
                    int i2 = next.f330352a;
                    int i3 = next.f330353b;
                    int i4 = next.f330354c;
                    int i5 = next.f330355d;
                    Rect rect = next.f330359h;
                    int i6 = rect.bottom;
                    Rect rect2 = next.f330358g;
                    nAddInputTexture(j2, i2, i3, i4, i5, rect.left, rect.top, rect.right, i6, rect2.left, rect2.top, rect2.right, rect2.bottom, next.f330360i.f319975a, next.f330361j.f319975a, next.f330362k.f319972a, next.f330356e, next.f330357f);
                }
            }
            if (this.f319982c <= 0 || this.f319983d <= 0) {
                int[] iArr = new int[2];
                GLES20.glBindTexture(3553, i);
                GLES31.glGetTexLevelParameteriv(3553, 0, 4096, iArr, 0);
                GLES31.glGetTexLevelParameteriv(3553, 0, 4097, iArr, 1);
                this.f319982c = iArr[0];
                this.f319983d = iArr[1];
            } else {
                int i7 = i;
            }
            XEffectLog.f319986a.mo143270d("VLogDirector", "render output size, width:%d, height:%d", Integer.valueOf(this.f319982c), Integer.valueOf(this.f319983d));
            nRender(this.f319980a, i, this.f319982c, this.f319983d, j);
        }
    }

    /* renamed from: e */
    public void mo154917e(EffectManager effectManager) {
        if (effectManager != null) {
            long j = effectManager.f319989a;
            if (j != 0 && j != this.f319984e) {
                nSetEffectManager(this.f319980a, j);
                this.f319984e = effectManager.f319989a;
            }
        }
    }

    /* renamed from: f */
    public void mo154918f(int i, int i2, int i3, int i4) {
        mo154913a();
        long j = this.f319980a;
        if (j != 0) {
            nSetOutputTexCropRet(j, i, i2, i3, i4);
        }
    }

    /* renamed from: g */
    public void mo154919g(int i, int i2, int i3, int i4) {
        mo154913a();
        long j = this.f319980a;
        if (j != 0) {
            nSetRenderArea(j, i, i2, i3, i4);
        }
    }
}
