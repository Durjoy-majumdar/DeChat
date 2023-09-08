package com.tencent.p014mm.plugin.vlog.model;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.google.android.gms.gcm.Task;
import com.tencent.p014mm.xeffect.effect.EffectManager;
import com.tencent.p014mm.xeffect.effect.VLogEffectJNI;
import fy3.C32226l;
import gy3.C87412m;
import qr3.C110469c;
import rr3.C110620a;
import rr3.C110623b0;
import rr3.C110632i;
import xp3.C112168e;

/* renamed from: com.tencent.mm.plugin.vlog.model.e */
public final class C106194e implements C112168e {

    /* renamed from: a */
    public final C32226l<Long, Bitmap> f316417a;

    /* renamed from: b */
    public final EffectManager f316418b;

    /* renamed from: c */
    public final C110620a f316419c;

    /* renamed from: d */
    public int f316420d;

    /* renamed from: e */
    public int f316421e;

    /* renamed from: f */
    public int f316422f;

    public C106194e(C32226l<? super Long, Bitmap> lVar, EffectManager effectManager) {
        C87412m.m108594g(lVar, "blendBitmapProvider");
        this.f316417a = lVar;
        this.f316418b = effectManager;
        C110620a aVar = null;
        Object g = effectManager != null ? effectManager.mo154927g(C110632i.BlendEffect) : null;
        this.f316419c = g instanceof C110620a ? (C110620a) g : aVar;
    }

    /* renamed from: a */
    public void mo134637a(long j) {
        C110469c cVar;
        EffectManager effectManager;
        Bitmap invoke = this.f316417a.invoke(Long.valueOf(j));
        boolean z = false;
        if (invoke != null) {
            this.f316421e = invoke.getWidth();
            this.f316422f = invoke.getHeight();
            if (this.f316420d == 0) {
                int[] iArr = new int[1];
                GLES20.glGenTextures(1, iArr, 0);
                GLES20.glBindTexture(3553, iArr[0]);
                GLES20.glBindTexture(3553, 0);
                this.f316420d = iArr[0];
            }
            GLES20.glBindTexture(3553, this.f316420d);
            GLUtils.texImage2D(3553, 0, invoke, 0);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, Task.EXTRAS_LIMIT_BYTES, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 10497.0f);
            GLES20.glTexParameterf(3553, 10243, 10497.0f);
            GLES20.glBindTexture(3553, 0);
            cVar = new C110469c(this.f316420d, this.f316421e, this.f316422f, false, 0);
        } else {
            cVar = null;
        }
        if (cVar != null) {
            C110620a aVar = this.f316419c;
            if (aVar != null && aVar.f330967a == 0) {
                z = true;
            }
            if (z && (effectManager = this.f316418b) != null) {
                effectManager.mo154923c(aVar);
            }
            C110620a aVar2 = this.f316419c;
            if (aVar2 != null) {
                int i = cVar.f330352a;
                int i2 = cVar.f330353b;
                int i3 = cVar.f330354c;
                C110623b0 b0Var = aVar2.f330964d;
                b0Var.getClass();
                VLogEffectJNI.INSTANCE.setEffectTexture$renderlib_release(b0Var.f330966a.f330969c, i, i2, i3);
            }
            C110620a aVar3 = this.f316419c;
            if (aVar3 != null) {
                C110623b0 b0Var2 = aVar3.f330964d;
                b0Var2.getClass();
                VLogEffectJNI.INSTANCE.nSetEffectIsPreMultiplied(b0Var2.f330966a.f330969c, true);
            }
        }
    }

    /* renamed from: d */
    public void mo134638d() {
        int i = this.f316420d;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.f316420d = 0;
        }
    }
}
