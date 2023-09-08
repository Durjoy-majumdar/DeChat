package bh2;

import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32229r;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import rx3.C13598b0;
import w80.C111742d;

/* renamed from: bh2.g */
public final class C104118g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C104114f f308052d;

    public C104118g(C104114f fVar) {
        this.f308052d = fVar;
    }

    public final void run() {
        C32227p<? super Boolean, ? super Buffer, C13598b0> pVar;
        float f;
        float f2;
        C104114f fVar = this.f308052d;
        fVar.f308039E += fVar.f308040F;
        fVar.f308037C.mo145779b();
        C104114f fVar2 = this.f308052d;
        C32226l<? super Long, Bitmap> lVar = fVar2.f308042H;
        Bitmap invoke = lVar != null ? lVar.invoke(Long.valueOf(fVar2.f308039E * ((long) 1000))) : null;
        if (invoke != null) {
            C104136w wVar = this.f308052d.f308037C;
            wVar.getClass();
            GLES20.glUseProgram(wVar.f308129f.f308016a);
            C104135u uVar = wVar.f308129f;
            int i = wVar.f308124a;
            int i2 = wVar.f308125b;
            int width = invoke.getWidth();
            int height = invoke.getHeight();
            uVar.getClass();
            System.currentTimeMillis();
            float f3 = (float) i;
            float f4 = (float) width;
            float f5 = f3 / f4;
            float f6 = (float) i2;
            float f7 = (float) height;
            float f8 = f6 / f7;
            float[] fArr = uVar.f308118c;
            float[] copyOf = Arrays.copyOf(fArr, fArr.length);
            float[] fArr2 = uVar.f308117b;
            float[] copyOf2 = Arrays.copyOf(fArr2, fArr2.length);
            if (f5 < f8) {
                f = f7 * f5;
                f2 = f3;
            } else {
                f2 = f5 > f8 ? f4 * f8 : f3;
                f = f6;
            }
            float f9 = f2 / f3;
            float f15 = 0.0f - f9;
            float f16 = f / f6;
            float f17 = 0.0f - f16;
            copyOf[0] = 0.0f;
            copyOf[1] = 1.0f;
            copyOf[2] = 1.0f;
            copyOf[3] = 1.0f;
            copyOf[4] = 0.0f;
            copyOf[5] = 0.0f;
            copyOf[6] = 1.0f;
            copyOf[7] = 0.0f;
            copyOf2[0] = f15;
            copyOf2[1] = f17;
            copyOf2[3] = f9;
            copyOf2[4] = f17;
            copyOf2[6] = f15;
            copyOf2[7] = f16;
            copyOf2[9] = f9;
            copyOf2[10] = f16;
            FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(copyOf2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            uVar.f308119d = asFloatBuffer;
            asFloatBuffer.put(copyOf2).position(0);
            GLES20.glVertexAttribPointer(0, 3, 5126, false, 0, uVar.f308119d);
            GLES20.glEnableVertexAttribArray(0);
            FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(copyOf.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            uVar.f308120e = asFloatBuffer2;
            asFloatBuffer2.put(copyOf).position(0);
            GLES20.glVertexAttribPointer(1, 2, 5126, false, 0, uVar.f308120e);
            GLES20.glEnableVertexAttribArray(1);
            System.currentTimeMillis();
            GLES20.glActiveTexture(33984);
            int b = wVar.f308129f.mo145760b(invoke, wVar.f308130g, false);
            wVar.f308130g = b;
            C104135u uVar2 = wVar.f308129f;
            uVar2.getClass();
            GLES20.glBindTexture(3553, b);
            GLES20.glUniform1f(uVar2.f308121f, (float) 0);
            C104135u uVar3 = wVar.f308129f;
            GLES20.glUniformMatrix4fv(uVar3.f308122g, 1, false, uVar3.f308123h, 0);
            wVar.f308129f.getClass();
            GLES20.glDrawArrays(5, 0, 4);
        }
        C104114f fVar3 = this.f308052d;
        C104110c cVar = fVar3.f308038D;
        long j = fVar3.f308039E * ((long) 1000000);
        C111742d.C65942b bVar = cVar.f308029d;
        if (bVar != null) {
            EGLExt.eglPresentationTimeANDROID(bVar.f189591a, bVar.f189592b, j);
        }
        C104110c cVar2 = this.f308052d.f308038D;
        cVar2.getClass();
        C111742d.C111743a aVar = C111742d.f334647a;
        C111742d.C65942b bVar2 = cVar2.f308029d;
        aVar.mo163474t(bVar2.f189591a, bVar2.f189592b);
        C104114f fVar4 = this.f308052d;
        C32229r<? super ByteBuffer, ? super Long, ? super MediaCodec.BufferInfo, ? super Boolean, C13598b0> rVar = fVar4.f327874h;
        if (rVar != null) {
            C13598b0 I = rVar.mo162I(null, Long.valueOf(fVar4.f308039E * ((long) 1000)), new MediaCodec.BufferInfo(), Boolean.FALSE);
        }
        C104114f fVar5 = this.f308052d;
        if (!fVar5.f308035A && (pVar = fVar5.f308043I) != null) {
            pVar.invoke(Boolean.TRUE, fVar5.f308044J);
        }
        C104114f fVar6 = this.f308052d;
        if (fVar6.f308039E >= ((long) 15000)) {
            fVar6.f308041G = true;
            C32224a<C13598b0> aVar2 = fVar6.f327875i;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        }
    }
}
