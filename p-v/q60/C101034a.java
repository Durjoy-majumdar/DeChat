package q60;

import android.graphics.Bitmap;
import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.io.InputStream;
import k60.C99102f;
import n60.C100075f;
import o40.C61925b;
import r60.C101350i;
import rx3.C13598b0;
import w60.C65941g;
import y60.C102802a;

/* renamed from: q60.a */
public class C101034a extends C101036c {
    /* renamed from: a */
    public C65941g<Bitmap> mo87424a(C101350i<?> iVar, C99102f<?, Bitmap> fVar, C102802a aVar) {
        Bitmap bitmap;
        C87412m.m108594g(iVar, "targetView");
        C87412m.m108594g(fVar, "reaper");
        C87412m.m108594g(aVar, "input");
        InputStream a = aVar.mo142542a();
        C61925b bVar = new C61925b("InputStreamBitmapProducer");
        if (a != null) {
            C100075f fVar2 = fVar.f290573b;
            int i = fVar2.f293168f;
            int i2 = fVar2.f293169g;
            bitmap = (i <= 0 || i2 <= 0) ? BitmapUtil.getBitmapNative(a) : BitmapUtil.decodeStream(a, 0.0f, i2, i);
        } else {
            bitmap = null;
        }
        if (a != null) {
            a.reset();
            int orientationInDegree = Exif.fromStream(a).getOrientationInDegree();
            Log.m105925i(this.f295824a, "read exif rotate degree %d", Integer.valueOf(orientationInDegree));
            bitmap = BitmapUtil.rotate(bitmap, ((float) orientationInDegree) * 1.0f);
        }
        C13598b0 b0Var = C13598b0.f38549a;
        bVar.mo86838a();
        String str = this.f295824a;
        Log.m105924i(str, "InputStreamBitmapProducer decode bitmap done " + bitmap + " from input " + aVar);
        return new C65941g<>(bitmap);
    }
}
