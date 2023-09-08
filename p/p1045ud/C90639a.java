package p1045ud;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.RectF;
import com.github.henryye.nativeiv.ImageDecodeConfig;
import com.github.henryye.nativeiv.LegacyBitmap;
import com.github.henryye.nativeiv.bitmap.BitmapType;
import com.github.henryye.nativeiv.bitmap.IBitmap;
import gy3.C87412m;
import java.io.InputStream;
import p1015o6.C89117a;
import p1015o6.C89118b;
import p1015o6.C89122c;
import p1019p6.C89314a;
import p1024q6.C89483b;
import p1024q6.C89484c;
import p1024q6.C89485d;
import p298c6.C23712f;
import p298c6.C23713g;
import p298c6.C23792i;
import p416qd.C89598h;
import p673r6.C89876b;

/* renamed from: ud.a */
public class C90639a extends C89117a {

    /* renamed from: g */
    public final String f260403g = "MB.BitmapDecoderMagicBrushExtension";

    /* renamed from: ud.a$a */
    public static final class C90640a extends C89122c {

        /* renamed from: g */
        public final /* synthetic */ C90639a f260404g;

        /* renamed from: ud.a$a$a */
        public static final class C90641a implements C89483b<Bitmap> {

            /* renamed from: a */
            public final /* synthetic */ C23713g f260405a;

            /* renamed from: b */
            public final /* synthetic */ C90640a f260406b;

            /* renamed from: ud.a$a$a$a */
            public static final class C90642a extends LegacyBitmap {

                /* renamed from: c */
                public final /* synthetic */ C23713g f260407c;

                /* renamed from: d */
                public final /* synthetic */ C90640a f260408d;

                public C90642a(C23713g gVar, C90640a aVar) {
                    this.f260407c = gVar;
                    this.f260408d = aVar;
                }

                /* renamed from: a */
                public Bitmap mo111021a(InputStream inputStream, ImageDecodeConfig imageDecodeConfig, C89484c cVar) {
                    Picture picture;
                    C23713g.C23725d1 d1Var;
                    C23713g.C23758p pVar;
                    int i;
                    C23713g gVar = this.f260407c;
                    if (gVar.f67934a != null) {
                        int i2 = (int) gVar.mo37259a(96.0f).f67943c;
                        C23713g gVar2 = this.f260407c;
                        if (gVar2.f67934a != null) {
                            int i3 = (int) gVar2.mo37259a(96.0f).f67944d;
                            if (cVar != C89484c.CUSTOM || i2 <= 0 || i2 <= 0) {
                                Bitmap a = super.mo111021a(inputStream, imageDecodeConfig, cVar);
                                C87412m.m108593f(a, "{\n                      …                        }");
                                return a;
                            }
                            if (imageDecodeConfig != null) {
                                int i4 = 0;
                                C89598h.f257791a.mo109481d(this.f260408d.f260404g.f260403g, "hy: image config width %d, height %d, scale %f", Integer.valueOf(imageDecodeConfig.mPreferredWidth), Integer.valueOf(imageDecodeConfig.mPreferredHeight), Double.valueOf(imageDecodeConfig.mPreferredScale));
                                int i5 = imageDecodeConfig.mPreferredWidth;
                                if (i5 <= 0 || (i = imageDecodeConfig.mPreferredHeight) <= 0) {
                                    double d = imageDecodeConfig.mPreferredScale;
                                    if (d > 0.0d) {
                                        i4 = (int) (((double) 0) * d);
                                        i = i4;
                                    } else {
                                        i = 0;
                                    }
                                } else {
                                    i4 = i5;
                                }
                                Integer valueOf = Integer.valueOf(i4);
                                Integer valueOf2 = Integer.valueOf(i);
                                if (valueOf.intValue() > 0 && valueOf2.intValue() > 0) {
                                    i2 = valueOf.intValue();
                                    i3 = valueOf2.intValue();
                                }
                            }
                            Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            C23713g gVar3 = this.f260407c;
                            C23713g.C23738f0 f0Var = gVar3.f67934a;
                            C23713g.C23717b bVar = f0Var.f68111p;
                            C23713g.C23758p pVar2 = f0Var.f68047s;
                            if (pVar2 != null && pVar2.f68094e != (d1Var = C23713g.C23725d1.percent) && (pVar = f0Var.f68048t) != null && pVar.f68094e != d1Var) {
                                picture = gVar3.mo37262e((int) Math.ceil((double) pVar2.mo37284a(96.0f)), (int) Math.ceil((double) gVar3.f67934a.f68048t.mo37284a(96.0f)), (C23712f) null);
                            } else if (pVar2 == null || bVar == null) {
                                C23713g.C23758p pVar3 = f0Var.f68048t;
                                if (pVar3 == null || bVar == null) {
                                    picture = gVar3.mo37262e(512, 512, (C23712f) null);
                                } else {
                                    float a2 = pVar3.mo37284a(96.0f);
                                    picture = gVar3.mo37262e((int) Math.ceil((double) ((bVar.f67943c * a2) / bVar.f67944d)), (int) Math.ceil((double) a2), (C23712f) null);
                                }
                            } else {
                                float a3 = pVar2.mo37284a(96.0f);
                                picture = gVar3.mo37262e((int) Math.ceil((double) a3), (int) Math.ceil((double) ((bVar.f67944d * a3) / bVar.f67943c)), (C23712f) null);
                            }
                            canvas.drawPicture(picture, new RectF(0.0f, 0.0f, (float) i2, (float) i3));
                            C87412m.m108593f(createBitmap, "{\n                      …                        }");
                            return createBitmap;
                        }
                        throw new IllegalArgumentException("SVG document is empty");
                    }
                    throw new IllegalArgumentException("SVG document is empty");
                }
            }

            public C90641a(C23713g gVar, C90640a aVar) {
                this.f260405a = gVar;
                this.f260406b = aVar;
            }

            /* renamed from: a */
            public boolean mo111042a(InputStream inputStream, Bitmap.Config config, C89484c cVar) {
                return true;
            }

            /* renamed from: b */
            public IBitmap<Bitmap> mo111043b() {
                return new C90642a(this.f260405a, this.f260406b);
            }

            public void destroy() {
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C90640a(C89118b bVar, C89314a aVar, C90639a aVar2) {
            super(bVar, aVar);
            this.f260404g = aVar2;
        }

        /* renamed from: a */
        public C89485d mo123449a(InputStream inputStream) {
            C89484c cVar = C89484c.UNKNOWN;
            C87412m.m108594g(inputStream, "ins");
            C89485d a = super.mo123449a(inputStream);
            if (a.f257554a == cVar) {
                C89876b.f258326a.mo123906w(this.f260404g.f260403g, "hy: unknown type. judge svg", new Object[0]);
                try {
                    C23713g d = C23713g.m28369d(inputStream);
                    if (d != null) {
                        a.f257554a = C89484c.CUSTOM;
                        this.f256780a = BitmapType.Legacy;
                        mo123450b(new C90641a(d, this));
                    }
                } catch (C23792i e) {
                    C89876b.m112386c(this.f260404g.f260403g, e, "hy: not svg image. return as failed", new Object[0]);
                    a.f257554a = cVar;
                }
            }
            return a;
        }
    }

    /* renamed from: d */
    public C89122c mo123446d(C89118b bVar, C89314a aVar) {
        C87412m.m108594g(bVar, "mgr");
        C87412m.m108594g(aVar, "decodeInfo");
        return new C90640a(bVar, aVar, this);
    }
}
