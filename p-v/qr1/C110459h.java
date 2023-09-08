package qr1;

import android.opengl.GLES20;
import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.xeffect.VLogDirector;
import fy3.C32224a;
import gy3.C87413o;
import java.nio.Buffer;
import p80.C110194c;
import rx3.C13598b0;

/* renamed from: qr1.h */
public final class C110459h extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C110461j f330313d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110459h(C110461j jVar) {
        super(0);
        this.f330313d = jVar;
    }

    public Object invoke() {
        this.f330313d.f330325k = new VLogDirector();
        this.f330313d.f330325k.mo154915c();
        C110461j jVar = this.f330313d;
        jVar.f330325k.mo154919g(0, 0, jVar.f330315a, jVar.f330316b);
        C110461j jVar2 = this.f330313d;
        jVar2.f330325k.mo154919g(0, 0, jVar2.f330315a, jVar2.f330316b);
        C110461j jVar3 = this.f330313d;
        VLogDirector vLogDirector = jVar3.f330325k;
        int i = jVar3.f330315a;
        int i2 = jVar3.f330316b;
        vLogDirector.f319982c = i;
        vLogDirector.f319983d = i2;
        C110194c cVar = new C110194c(true, 15);
        C110461j jVar4 = this.f330313d;
        GLES20.glBindTexture(3553, cVar.f329652e);
        GLES20.glTexImage2D(3553, 0, NativeBitmapStruct.GLFormat.GL_RGBA, jVar4.f330315a, jVar4.f330316b, 0, NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, (Buffer) null);
        GLES20.glBindTexture(3553, 0);
        jVar3.f330327m = cVar;
        String str = this.f330313d.f330317c;
        Log.m105924i(str, "initVLogDirector finished size:[" + this.f330313d.f330315a + ',' + this.f330313d.f330316b + ']');
        return C13598b0.f38549a;
    }
}
