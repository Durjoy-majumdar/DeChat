package sp3;

import android.graphics.Bitmap;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87413o;
import rx3.C13598b0;
import yp3.C112478a;

/* renamed from: sp3.m */
public final class C64145m extends C87413o implements C32227p<Long, Bitmap, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32226l f181855d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64145m(C32226l lVar) {
        super(2);
        this.f181855d = lVar;
    }

    public Object invoke(Object obj, Object obj2) {
        long longValue = ((Number) obj).longValue();
        Bitmap bitmap = (Bitmap) obj2;
        StringBuilder sb = new StringBuilder();
        sb.append("getThumbBitmap result, timeMs:");
        sb.append(longValue);
        sb.append(", bitmap:");
        sb.append(bitmap);
        sb.append(", size:[");
        Integer num = null;
        sb.append(bitmap != null ? Integer.valueOf(bitmap.getWidth()) : null);
        sb.append(", ");
        if (bitmap != null) {
            num = Integer.valueOf(bitmap.getHeight());
        }
        sb.append(num);
        sb.append(']');
        C112478a.m153625c("VideoComposition", sb.toString(), new Object[0]);
        this.f181855d.invoke(bitmap);
        return C13598b0.f38549a;
    }
}
