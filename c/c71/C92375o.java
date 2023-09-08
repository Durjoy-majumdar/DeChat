package c71;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import com.tencent.p014mm.sdk.platformtools.Log;
import ei2.C58605a;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j71.C108587c;
import j71.C108591i;
import javax.microedition.khronos.opengles.GL10;
import rx3.C13598b0;
import yh2.C102868n;

/* renamed from: c71.o */
public final class C92375o extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C92379t f264336d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92375o(C92379t tVar) {
        super(0);
        this.f264336d = tVar;
    }

    public Object invoke() {
        C58605a a;
        C92379t tVar = this.f264336d;
        int i = tVar.f264350j + 1;
        tVar.f264350j = i;
        C108587c cVar = tVar.f264349i;
        if (cVar != null) {
            C102868n nVar = tVar.f264351k;
            if (nVar != null) {
                Log.m105924i(nVar.f303656b, "after syncMixNextFrame, framePass " + i + ", videoPassFrame:" + nVar.f303660f + ", targetPassFrame:" + nVar.f303664j + ", emojiPassDuration: " + nVar.f303662h);
                int i2 = i - 1;
                if (i2 > 0 && nVar.f303660f < i2) {
                    nVar.f303660f = i2;
                }
                nVar.f303668n = nVar.f303667m * ((float) nVar.f303664j);
                while (nVar.f303668n >= nVar.f303662h && (a = nVar.f303655a.mo126334a()) != null) {
                    long j = a.f167793b;
                    if (j <= 0) {
                        break;
                    }
                    nVar.f303662h += (float) j;
                    nVar.f303661g = a.f167792a;
                }
                Bitmap bitmap = nVar.f303661g;
                float f = nVar.f303666l * ((float) nVar.f303660f);
                float f2 = nVar.f303667m;
                int i3 = nVar.f303664j;
                boolean z = f < f2 * ((float) i3);
                if (z) {
                    Log.m105924i(nVar.f303656b, "syncMixNextFrame, skip frame");
                } else {
                    nVar.f303664j = i3 + 1;
                    Log.m105924i(nVar.f303656b, "syncMixNextFrame pass frame: " + nVar.f303664j);
                }
                nVar.f303660f++;
                C92374n nVar2 = new C92374n(tVar);
                Log.m105924i("MicroMsg.EmojiCaptureEGLPixelBuffer", "mixVideoAndEmojiFrame, skip: " + Boolean.valueOf(z));
                Boolean valueOf = Boolean.valueOf(z);
                Boolean bool = Boolean.FALSE;
                if (C87412m.m108589b(valueOf, bool)) {
                    C108591i iVar = cVar.f325060i;
                    if (iVar != null) {
                        iVar.f325084e = bitmap;
                        GL10 gl10 = cVar.f325059h;
                        if (gl10 != null) {
                            iVar.onDrawFrame(gl10);
                            nVar2.invoke(bool);
                        } else {
                            C87412m.m108603p("gl");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("renderer");
                        throw null;
                    }
                } else {
                    C108591i iVar2 = cVar.f325060i;
                    if (iVar2 != null) {
                        SurfaceTexture surfaceTexture = iVar2.f325086g;
                        if (surfaceTexture != null) {
                            surfaceTexture.updateTexImage();
                            nVar2.invoke(Boolean.TRUE);
                        } else {
                            C87412m.m108603p("videoDecodeSurfaceTexture");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("renderer");
                        throw null;
                    }
                }
                return C13598b0.f38549a;
            }
            C87412m.m108603p("syncMgr");
            throw null;
        }
        C87412m.m108603p("mixPixelBuffer");
        throw null;
    }
}
