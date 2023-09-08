package com.tencent.p014mm.plugin.multitalk.p078ui.widget;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C24565l;
import o40.C61926c;
import rx3.C13598b0;
import v82.C111482o1;

/* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.d */
public final /* synthetic */ class C105914d extends C24565l implements C32226l<Integer, C13598b0> {
    public C105914d(Object obj) {
        super(1, obj, ScreenCastBigView.class, "showOriDialog", "showOriDialog(I)V", 0);
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        ScreenCastBigView screenCastBigView = (ScreenCastBigView) this.receiver;
        int i = ScreenCastBigView.f315007j;
        screenCastBigView.getClass();
        Log.m105924i("MicroMsg.MT.ScreenCastBigView", "showOriDialog: " + intValue);
        if (screenCastBigView.f315012h != null) {
            Log.m105924i("MicroMsg.MT.ScreenCastBigView", "showOriDialog: already have showing view");
        } else {
            boolean z = false;
            if (1 <= intValue && intValue < 6) {
                if (intValue == 1 || intValue == 3) {
                    z = true;
                }
                if (z != screenCastBigView.f315013i) {
                    screenCastBigView.f315013i = z;
                    C61926c.m72668M(new C111482o1(screenCastBigView));
                }
            }
        }
        return C13598b0.f38549a;
    }
}
