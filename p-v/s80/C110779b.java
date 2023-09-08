package s80;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import p80.C110194c;
import u80.C111139a;
import u80.C111140b;

/* renamed from: s80.b */
public class C110779b extends C110777a {

    /* renamed from: t */
    public final String f331400t = "MicroMsg.MixRenderer";

    /* renamed from: u */
    public Rect f331401u;

    public C110779b(int i, int i2, int i3, int i4, int i5, int i6) {
        super(i, i2, i3, i4, i5, i6);
    }

    /* renamed from: f */
    public C111139a mo157952f() {
        C111140b bVar = new C111140b(this.f331376a, this.f331377b, this.f331378c, this.f331379d, this.f331380e, this.f331381f);
        bVar.f332761p = this.f331401u;
        return bVar;
    }

    /* renamed from: g */
    public C110194c mo157953g() {
        C111139a aVar = this.f331382g;
        if (aVar != null) {
            return aVar.f332754i;
        }
        return null;
    }

    /* renamed from: p */
    public void mo157957p() {
        SurfaceTexture surfaceTexture = this.f331384i;
        if (surfaceTexture != null) {
            surfaceTexture.updateTexImage();
        }
        C110194c cVar = this.f331385j;
        int i = cVar != null ? cVar.f329652e : -1;
        this.f331388m = i;
        C111139a aVar = this.f331382g;
        if (aVar != null) {
            aVar.mo159578p(i);
        }
        super.mo157957p();
    }

    /* renamed from: v */
    public final void mo162337v(Bitmap bitmap, Bitmap bitmap2) {
        float f;
        float f2;
        float f3;
        Bitmap bitmap3 = bitmap;
        Bitmap bitmap4 = bitmap2;
        if (bitmap3 != null) {
            C111139a aVar = this.f331382g;
            if (aVar instanceof C111140b) {
                C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.media.render.proc.GLTextureRenderProcBlend");
                C111140b.m151568v((C111140b) aVar, bitmap3, false, 2, (Object) null);
            } else {
                Log.m105920e(this.f331400t, "setBlendBitmap data don't match textureRender ");
            }
        }
        if (bitmap4 != null) {
            C111139a aVar2 = this.f331382g;
            if (aVar2 instanceof C111140b) {
                C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.media.render.proc.GLTextureRenderProcBlend");
                ((C111140b) aVar2).f332776F = bitmap4;
            } else {
                Log.m105920e(this.f331400t, "setBlurBgBitmap data don't match textureRender ");
            }
            if (this.f331382g instanceof C111140b) {
                float f4 = (float) this.f331378c;
                float f5 = (float) this.f331376a;
                float f6 = f4 / f5;
                float f7 = (float) this.f331379d;
                float f8 = (float) this.f331377b;
                float f9 = f7 / f8;
                if (f9 < f6) {
                    float f15 = f5 * f9;
                    f3 = (f4 - f15) / 2.0f;
                    f2 = f15 + f3;
                    f = 0.0f;
                } else {
                    float f16 = f8 * f6;
                    float f17 = (f7 - f16) / 2.0f;
                    f = f17;
                    f7 = f17 + f16;
                    f2 = f4;
                    f3 = 0.0f;
                }
                String str = this.f331400t;
                Log.m105924i(str, "calcCenterLocation drawWidth:" + this.f331378c + " drawHeight:" + this.f331379d + " textureWidth:" + this.f331376a + " textureHeight:" + this.f331377b + " top:" + f7 + " bottom:" + f + " left:" + f3 + " right:" + f2);
                C111139a aVar3 = this.f331382g;
                C87412m.m108592e(aVar3, "null cannot be cast to non-null type com.tencent.mm.media.render.proc.GLTextureRenderProcBlend");
                float[] fArr = ((C111140b) aVar3).f332778H;
                fArr[0] = f7;
                fArr[1] = f;
                fArr[2] = f3;
                fArr[3] = f2;
            } else {
                Log.m105920e(this.f331400t, "calcCenterLocation data don't match textureRender ");
            }
            if (this.f331382g instanceof C111140b) {
                float f18 = (float) this.f331378c;
                float f19 = (float) this.f331376a;
                float f25 = f18 / f19;
                float f26 = (float) this.f331379d;
                float f27 = (float) this.f331377b;
                float f28 = f26 / f27;
                float[] fArr2 = new float[8];
                if (f25 < f28) {
                    float f29 = f27 * f25;
                    float f35 = ((f26 - f29) / f29) / 2.0f;
                    float f36 = ((float) 1) + f35;
                    float f37 = ((float) 0) - f35;
                    fArr2[0] = 0.0f;
                    fArr2[1] = f36;
                    fArr2[2] = 1.0f;
                    fArr2[3] = f36;
                    fArr2[4] = 0.0f;
                    fArr2[5] = f37;
                    fArr2[6] = 1.0f;
                    fArr2[7] = f37;
                    String str2 = this.f331400t;
                    Log.m105924i(str2, "calcBlurBgTextureCoord :[" + 0.0f + ", " + f36 + " \n " + 1.0f + ", " + f36 + " \n " + 0.0f + ", " + f37 + " \n " + 1.0f + ", " + f37 + ']');
                } else {
                    float f38 = f19 * f28;
                    float f39 = ((f18 - f38) / f38) / 2.0f;
                    float f44 = 0.0f - f39;
                    float f45 = f39 + 1.0f;
                    fArr2[0] = f44;
                    fArr2[1] = 1.0f;
                    fArr2[2] = f45;
                    fArr2[3] = 1.0f;
                    fArr2[4] = f44;
                    fArr2[5] = 0.0f;
                    fArr2[6] = f45;
                    fArr2[7] = 0.0f;
                }
                C111139a aVar4 = this.f331382g;
                C87412m.m108592e(aVar4, "null cannot be cast to non-null type com.tencent.mm.media.render.proc.GLTextureRenderProcBlend");
                C111140b bVar = (C111140b) aVar4;
                bVar.f332794X.position(0);
                bVar.f332794X.put(fArr2);
                bVar.f332794X.position(0);
            } else {
                Log.m105920e(this.f331400t, "calcBlurBgTextureCoord data don't match textureRender ");
            }
        }
        mo157957p();
    }
}
