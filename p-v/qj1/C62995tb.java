package qj1;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.xeffect.effect.VLogEffectJNI;
import iy3.C60641c;
import r60.C101350i;
import rr3.C110634k;
import t60.C64207e;
import vp3.C65849b;
import x60.C102564a;

/* renamed from: qj1.tb */
public final class C62995tb<T, R> implements C64207e {

    /* renamed from: a */
    public final /* synthetic */ C62938qb f178744a;

    public C62995tb(C62938qb qbVar) {
        this.f178744a = qbVar;
    }

    /* renamed from: a */
    public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        String str = this.f178744a.f178592q;
        Log.m105924i(str, "fillMusicPanel resource:" + bitmap);
        if (bitmap != null) {
            C62938qb qbVar = this.f178744a;
            C65849b bVar = new C65849b();
            bVar.mo89891b(bitmap);
            int width = bitmap.getWidth();
            int b = C60641c.m70921b(((float) width) * ((((float) qbVar.f178593r.getHeight()) * 1.0f) / ((float) qbVar.f178593r.getWidth())));
            bVar.f189363b = width;
            bVar.f189364c = b;
            C110634k d = bVar.f189366e.f334033b.mo154924d();
            long j = d.f330969c;
            if (j != 0) {
                VLogEffectJNI.INSTANCE.nSetGradientBlurEffectBlurBottom(j, false);
            }
            d.mo162191d(30.0f);
            long j2 = d.f330969c;
            if (j2 != 0) {
                VLogEffectJNI.INSTANCE.nSetGradientBlurEffectBlurMaskRatio(j2, 1.0f);
            }
            bVar.mo89890a(new C62975sb(qbVar));
        }
    }
}
