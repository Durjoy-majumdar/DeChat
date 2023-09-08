package by0;

import android.view.View;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C19623o0;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import te3.C22499hb0;
import te3.re4;

/* renamed from: by0.d */
public final class C16829d extends C87413o implements C32227p<C19623o0, View, Float> {

    /* renamed from: d */
    public static final C16829d f45470d = new C16829d();

    public C16829d() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        float f;
        re4 re4;
        C22499hb0 hb02;
        C19623o0 o0Var = (C19623o0) obj;
        View view = (View) obj2;
        C87412m.m108594g(view, "view");
        if (C16825a.f45449f == null) {
            C16825a.f45449f = new int[2];
        }
        view.getLocationInWindow(C16825a.f45449f);
        int[] iArr = C16825a.f45449f;
        C87412m.m108591d(iArr);
        float f2 = (float) iArr[1];
        int[] iArr2 = C16825a.f45448e;
        C87412m.m108591d(iArr2);
        float f3 = (float) iArr2[0];
        int[] iArr3 = C16825a.f45448e;
        C87412m.m108591d(iArr3);
        float f4 = (float) iArr3[1];
        if (f2 > f4) {
            Log.m105924i("MicroMsg.MPVideoPreviewMgr", "checkPosition inHotPercent exceed upper edge");
            return Float.valueOf(0.0f);
        } else if (((float) C18508z2.f51414N) + f2 < f3) {
            Log.m105924i("MicroMsg.MPVideoPreviewMgr", "checkPosition inHotPercent exceed lower edge");
            return Float.valueOf(0.0f);
        } else {
            int[] iArr4 = C16825a.f45448e;
            C87412m.m108591d(iArr4);
            if (f2 < ((float) iArr4[0])) {
                float f5 = (float) C18508z2.f51414N;
                f = ((f2 + f5) - f3) / f5;
            } else {
                float f6 = (float) C18508z2.f51414N;
                f = f6 + f2 > f4 ? (f4 - f2) / f6 : 1.0f;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("checkPosition inHotPercent percent = ");
            sb.append(f);
            sb.append("  ");
            String str = (o0Var == null || (re4 = o0Var.f55530o1) == null || (hb02 = re4.f64523o) == null) ? null : hb02.f63902d;
            if (str == null) {
                str = "";
            }
            sb.append(str);
            Log.m105924i("MicroMsg.MPVideoPreviewMgr", sb.toString());
            return Float.valueOf(f);
        }
    }
}
