package gr1;

import android.graphics.Bitmap;
import android.view.View;
import fy3.C32224a;
import fy3.C32226l;
import rx3.C13598b0;

/* renamed from: gr1.m2 */
public interface C59664m2 {
    /* renamed from: a */
    void mo84652a(C32224a<C13598b0> aVar, C32224a<C13598b0> aVar2, C32226l<? super Long, C13598b0> lVar);

    void destroy();

    Bitmap getBitmap();

    long getCurrentPositionMs();

    View getView();

    void seekTo(long j);
}
