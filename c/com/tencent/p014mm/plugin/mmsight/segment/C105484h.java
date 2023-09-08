package com.tencent.p014mm.plugin.mmsight.segment;

import com.tencent.p014mm.plugin.report.service.C115669n;

/* renamed from: com.tencent.mm.plugin.mmsight.segment.h */
public class C105484h {
    /* renamed from: a */
    public static void m141674a(int i) {
        C115669n nVar = C115669n.INSTANCE;
        nVar.idkeyStat(440, 169, 1, false);
        if (i == 1) {
            nVar.idkeyStat(440, 170, 1, false);
        } else if (i == 2) {
            nVar.idkeyStat(440, 171, 1, false);
        } else if (i == 3) {
            nVar.idkeyStat(440, 172, 1, false);
        }
    }

    /* renamed from: b */
    public static void m141675b(int i, long j) {
        if (i == 1) {
            C115669n nVar = C115669n.INSTANCE;
            nVar.idkeyStat(440, 150, 1, false);
            nVar.idkeyStat(440, 151, j, false);
        } else if (i == 2) {
            C115669n nVar2 = C115669n.INSTANCE;
            nVar2.idkeyStat(440, 155, 1, false);
            nVar2.idkeyStat(440, 156, j, false);
        } else if (i == 3) {
            C115669n nVar3 = C115669n.INSTANCE;
            nVar3.idkeyStat(440, 159, 1, false);
            nVar3.idkeyStat(440, 160, j, false);
        }
    }
}
