package vd3;

import android.graphics.Bitmap;
import com.tencent.p014mm.modelavatar.C68080d;
import com.tencent.p014mm.modelavatar.C68081f;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import p196ln.C10579k;
import vd3.C78391d;
import vd3.C78407r;
import we3.C78592b;

/* renamed from: vd3.h */
public class C78397h extends C78407r implements C10579k.C10580a {

    /* renamed from: s */
    public C78398a f229718s = ((C78398a) this.f229748i);

    /* renamed from: t */
    public int f229719t;

    /* renamed from: vd3.h$a */
    public static class C78398a implements C78407r.C78409b {

        /* renamed from: d */
        public C78407r.C78409b f229720d;

        /* renamed from: e */
        public Bitmap f229721e = null;

        /* renamed from: f */
        public C68080d f229722f = null;

        public C78398a(C78407r.C78409b bVar) {
            this.f229720d = bVar;
        }

        /* renamed from: E0 */
        public void mo10724E0(C78407r rVar) {
            C78407r.C78409b bVar = this.f229720d;
            if (bVar != null) {
                bVar.mo10724E0(rVar);
            }
        }

        /* renamed from: O */
        public Bitmap mo10725O(String str) {
            Bitmap b = mo108345b(str);
            if (b != null && !b.isRecycled()) {
                return b;
            }
            C78407r.C78409b bVar = this.f229720d;
            if (bVar != null) {
                return bVar.mo10725O(str);
            }
            return null;
        }

        /* renamed from: a */
        public final Bitmap mo108344a(Bitmap bitmap) {
            if (bitmap == null || bitmap.isRecycled()) {
                return bitmap;
            }
            C68080d dVar = this.f229722f;
            return dVar != null && (dVar.f195674b > 0.0f ? 1 : (dVar.f195674b == 0.0f ? 0 : -1)) > 0 ? BitmapUtil.getRoundedCornerBitmap(bitmap, false, dVar.f195674b * ((float) bitmap.getWidth())) : bitmap;
        }

        /* renamed from: b */
        public final Bitmap mo108345b(String str) {
            C78592b a;
            C68080d dVar = this.f229722f;
            if (!(dVar != null && dVar.f195674b > 0.0f) || (a = C78592b.C53158a.m59566a()) == null) {
                return null;
            }
            return a.uf0(str + "-" + this.f229722f.f195674b);
        }

        public Bitmap loadBitmap(String str) {
            C78592b a;
            Bitmap b = mo108345b(str);
            if (b != null && !b.isRecycled()) {
                return b;
            }
            C68080d dVar = this.f229722f;
            boolean z = false;
            if (dVar != null) {
                b = C68081f.m80467b(str, false, -1, dVar);
            } else {
                C78407r.C78409b bVar = this.f229720d;
                if (bVar != null) {
                    b = bVar.loadBitmap(str);
                }
            }
            Bitmap a2 = mo108344a(b);
            if (a2 != null) {
                C68080d dVar2 = this.f229722f;
                if (dVar2 != null && dVar2.f195674b > 0.0f) {
                    z = true;
                }
                if (z && (a = C78592b.C53158a.m59566a()) != null) {
                    a.om0(str + "-" + this.f229722f.f195674b, a2);
                }
            }
            return a2;
        }

        public Bitmap ov0(String str, int i, int i2, int i3) {
            C78592b a;
            Bitmap b = mo108345b(str);
            if (b != null && !b.isRecycled()) {
                return b;
            }
            C78407r.C78409b bVar = this.f229720d;
            if (bVar != null) {
                b = bVar.ov0(str, i, i2, i3);
            }
            Bitmap a2 = mo108344a(b);
            if (a2 != null) {
                C68080d dVar = this.f229722f;
                if ((dVar != null && dVar.f195674b > 0.0f) && (a = C78592b.C53158a.m59566a()) != null) {
                    a.om0(str + "-" + this.f229722f.f195674b, a2);
                }
            }
            return a2;
        }

        /* renamed from: qq */
        public Bitmap mo10728qq() {
            Bitmap bitmap = this.f229721e;
            if (bitmap != null && !bitmap.isRecycled()) {
                return this.f229721e;
            }
            C78407r.C78409b bVar = this.f229720d;
            if (bVar != null) {
                return bVar.mo10728qq();
            }
            return null;
        }
    }

    public C78397h(String str) {
        super(new C78398a(C78391d.C78393b.m94671c()), str, false);
    }
}
