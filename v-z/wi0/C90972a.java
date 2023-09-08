package wi0;

import com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: wi0.a */
public enum C90972a {
    ShareToFriend(1),
    CopyShortLink(2),
    SecFlagForSinglePageMode(3),
    ShowTradeComplaint(4);
    

    /* renamed from: d */
    public int f261045d;

    /* access modifiers changed from: public */
    C90972a(int i) {
        this.f261045d = i;
    }

    /* renamed from: b */
    public static int m114132b(C90972a aVar, AppBrandSysConfigWC appBrandSysConfigWC, byte b, int i, Object obj) {
        int i2;
        if (obj == null) {
            boolean z = false;
            if ((i & 2) != 0) {
                b = 0;
            }
            aVar.getClass();
            C87412m.m108594g(appBrandSysConfigWC, "config");
            byte[] bArr = appBrandSysConfigWC.f239412a1;
            if (!(bArr == null) && bArr.length - 1 >= (i2 = aVar.f261045d)) {
                byte b2 = bArr[i2];
                if (b2 >= 0 && b2 < 4) {
                    z = true;
                }
                if (z) {
                    b = b2;
                }
            }
            Log.m105924i("MicroMsg.ActionSheetControlIndex", "getControlByte for " + aVar.name() + " [" + b + ']');
            return b;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getControlByte");
    }

    /* renamed from: a */
    public final int mo125052a(AppBrandSysConfigWC appBrandSysConfigWC) {
        C87412m.m108594g(appBrandSysConfigWC, "config");
        return m114132b(this, appBrandSysConfigWC, 0, 2, (Object) null);
    }
}
