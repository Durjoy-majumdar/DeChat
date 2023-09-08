package lu0;

import com.tencent.p014mm.sdk.platformtools.Log;
import in0.C87759c;
import in0.C87760d;
import so0.C90268a;

/* renamed from: lu0.b */
public final class C88649b extends C90268a {
    /* renamed from: a */
    public C87759c mo123086a(int i, int i2) {
        C87759c cVar;
        if (-10000 >= i) {
            int i3 = i - 10000;
            if (i3 != -10001) {
                if (i3 != 1200) {
                    if (i3 != 1300) {
                        if (i3 != 1210) {
                            if (i3 != 1211) {
                                if (i3 != 1220) {
                                    if (i3 != 1221) {
                                        if (i3 != 1230) {
                                            if (i3 != 1231) {
                                                switch (i3) {
                                                    case 1100:
                                                    case 1102:
                                                    case 1103:
                                                        cVar = C87759c.EXTRACT;
                                                        break;
                                                    case 1101:
                                                        cVar = C87759c.NETWORK;
                                                        break;
                                                    default:
                                                        cVar = C87759c.OTHER;
                                                        break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        cVar = C87759c.DECODE_NOT_SUPPORT;
                    } else {
                        cVar = C87759c.RENDER;
                    }
                }
                cVar = C87759c.DECODE;
            } else {
                cVar = C87759c.ILLEGAL;
            }
        } else {
            cVar = super.mo123086a(i, i2);
        }
        Log.m105924i("MicroMsg.SameLayer.AppBrandVideoProfileReport", "fromErrorInfo, errorWhat: " + i + ", errorExtra: " + i2 + ", errorType: " + cVar);
        return cVar;
    }

    /* renamed from: b */
    public boolean mo123087b(C87760d dVar) {
        return dVar != null && 3 == dVar.getPlayerType();
    }
}
