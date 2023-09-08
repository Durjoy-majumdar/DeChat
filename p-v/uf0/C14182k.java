package uf0;

import com.tencent.p014mm.sdk.platformtools.Log;
import kj2.C117407d;
import rx3.C13605o;

/* renamed from: uf0.k */
public final class C14182k {

    /* renamed from: a */
    public static final C14182k f39627a = new C14182k();

    /* renamed from: a */
    public final void mo13569a(boolean z, long j, int i) {
        C13605o oVar;
        boolean z2 = z;
        long j2 = j;
        int i2 = i;
        Log.m105924i("MicroMsg.Mp4ParserStat", "markParseCost, useLazy:" + z2 + ", cost:" + j2 + ", timetTableLength:" + i2);
        if (j2 >= 0 && i2 >= 0) {
            if (z2) {
                C117407d dVar = C117407d.INSTANCE;
                dVar.mo182089r(1290, 8, j);
                dVar.mo182089r(1290, 9, 1);
            } else {
                C117407d dVar2 = C117407d.INSTANCE;
                dVar2.mo182089r(1290, 3, j);
                dVar2.mo182089r(1290, 4, 1);
            }
            boolean z3 = true;
            if (i2 >= 0 && i2 < 31) {
                oVar = z2 ? new C13605o(13, 22, 23) : new C13605o(13, 47, 48);
            } else {
                if (31 <= i2 && i2 < 61) {
                    oVar = z2 ? new C13605o(14, 26, 27) : new C13605o(14, 51, 52);
                } else {
                    if (61 <= i2 && i2 < 121) {
                        oVar = z2 ? new C13605o(15, 30, 31) : new C13605o(15, 55, 56);
                    } else {
                        if (121 <= i2 && i2 < 181) {
                            oVar = z2 ? new C13605o(16, 34, 35) : new C13605o(16, 59, 60);
                        } else {
                            if (181 > i2 || i2 >= 241) {
                                z3 = false;
                            }
                            oVar = z3 ? z2 ? new C13605o(17, 38, 39) : new C13605o(17, 63, 64) : z2 ? new C13605o(18, 43, 44) : new C13605o(18, 67, 68);
                        }
                    }
                }
            }
            int intValue = ((Number) oVar.f38557d).intValue();
            int intValue2 = ((Number) oVar.f38558e).intValue();
            int intValue3 = ((Number) oVar.f38559f).intValue();
            C117407d dVar3 = C117407d.INSTANCE;
            dVar3.mo182089r(1290, (long) intValue, 1);
            dVar3.mo182089r(1290, (long) intValue2, j);
            dVar3.mo182089r(1290, (long) intValue3, 1);
        }
    }
}
