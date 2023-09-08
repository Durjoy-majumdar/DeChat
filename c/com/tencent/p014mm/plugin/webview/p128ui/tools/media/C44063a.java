package com.tencent.p014mm.plugin.webview.p128ui.tools.media;

import com.tencent.p014mm.plugin.report.service.C115669n;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.a */
public final class C44063a {

    /* renamed from: a */
    public static final C44063a f119401a = new C44063a();

    /* renamed from: a */
    public final void mo68697a(int i, int i2, int i3) {
        int i4 = 5;
        int i5 = 3;
        if (i != 1) {
            int i6 = 4;
            if (i == 2) {
                C115669n nVar = C115669n.INSTANCE;
                Object[] objArr = new Object[2];
                if (i2 == 1) {
                    i6 = 12;
                } else if (i2 != 3) {
                    i6 = 8;
                }
                objArr[0] = Integer.valueOf(i6);
                objArr[1] = Integer.valueOf(i3);
                nVar.mo160131h(18589, objArr);
            } else if (i != 4) {
                C115669n nVar2 = C115669n.INSTANCE;
                Object[] objArr2 = new Object[2];
                if (i2 == 1) {
                    i4 = 13;
                } else if (i2 == 2) {
                    i4 = 25;
                } else if (i2 != 3) {
                    i4 = i2 != 5 ? 9 : 21;
                }
                objArr2[0] = Integer.valueOf(i4);
                objArr2[1] = Integer.valueOf(i3);
                nVar2.mo160131h(18589, objArr2);
            } else {
                C115669n nVar3 = C115669n.INSTANCE;
                Object[] objArr3 = new Object[2];
                objArr3[0] = Integer.valueOf(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 5 ? 18 : 20 : 17 : 24 : 22);
                objArr3[1] = Integer.valueOf(i3);
                nVar3.mo160131h(18589, objArr3);
            }
        } else {
            C115669n nVar4 = C115669n.INSTANCE;
            Object[] objArr4 = new Object[2];
            if (i2 == 1) {
                i5 = 11;
            } else if (i2 == 2) {
                i5 = 23;
            } else if (i2 != 3) {
                i5 = i2 != 5 ? 7 : 19;
            }
            objArr4[0] = Integer.valueOf(i5);
            objArr4[1] = Integer.valueOf(i3);
            nVar4.mo160131h(18589, objArr4);
        }
    }
}
