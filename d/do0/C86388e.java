package do0;

import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.plugin.appbrand.utils.C84752i2;
import vk0.C90814f;

/* renamed from: do0.e */
public class C86388e implements C90814f {
    /* renamed from: gq */
    public int[] mo120814gq(C82381f fVar) {
        if (fVar == null) {
            return new int[2];
        }
        if (fVar instanceof C82554k) {
            return C84752i2.m104413a((C82554k) fVar);
        }
        Context context = fVar.getContext();
        Point point = new Point();
        if (context != null) {
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealSize(point);
        }
        return new int[]{point.x, point.y};
    }
}
