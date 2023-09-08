package vp3;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.google.android.gms.gcm.Task;
import com.tencent.tav.decoder.RenderContext;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87413o;
import rx3.C13598b0;
import vp3.C111601n;
import yp3.C112478a;

/* renamed from: vp3.o */
public final class C111607o extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C111601n f334094d;

    /* renamed from: e */
    public final /* synthetic */ Bitmap f334095e;

    /* renamed from: f */
    public final /* synthetic */ String f334096f;

    /* renamed from: g */
    public final /* synthetic */ C111601n.C111604c f334097g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111607o(C111601n nVar, Bitmap bitmap, String str, C111601n.C111604c cVar) {
        super(0);
        this.f334094d = nVar;
        this.f334095e = bitmap;
        this.f334096f = str;
        this.f334097g = cVar;
    }

    public Object invoke() {
        int createTexture = RenderContext.createTexture(3553);
        String str = this.f334094d.f334078t;
        C112478a.m153625c(str, "newBitmapInputTexture id:" + createTexture, new Object[0]);
        GLES20.glBindTexture(3553, createTexture);
        GLUtils.texImage2D(3553, 0, this.f334095e, 0);
        float f = (float) 9729;
        GLES20.glTexParameterf(3553, 10241, f);
        GLES20.glTexParameterf(3553, Task.EXTRAS_LIMIT_BYTES, f);
        float f2 = (float) 10497;
        GLES20.glTexParameterf(3553, 10242, f2);
        GLES20.glTexParameterf(3553, 10243, f2);
        GLES20.glBindTexture(3553, 0);
        this.f334094d.f334079u.add(new C111601n.C111602a(this.f334096f, new C111601n.C111603b(createTexture, false, this.f334095e.getWidth(), this.f334095e.getHeight(), 0, (SurfaceTexture) null, 48, (C8480h) null), this.f334097g));
        return C13598b0.f38549a;
    }
}
