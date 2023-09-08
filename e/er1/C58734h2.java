package er1;

import android.graphics.Bitmap;
import r60.C101350i;
import t60.C64207e;
import te3.C64287ci1;
import x60.C102564a;

/* renamed from: er1.h2 */
public final class C58734h2<T, R> implements C64207e {

    /* renamed from: a */
    public final /* synthetic */ C64287ci1 f168171a;

    public C58734h2(C64287ci1 ci12) {
        this.f168171a = ci12;
    }

    /* renamed from: a */
    public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap.getHeight() != 0) {
            this.f168171a.f182490D = ((float) bitmap.getWidth()) / ((float) bitmap.getHeight());
        }
    }
}
