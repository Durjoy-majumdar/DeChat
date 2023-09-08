package gp0;

import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.plugin.report.service.C115669n;
import hr0.C87583a;
import java.util.ArrayList;

/* renamed from: gp0.a */
public class C87284a implements C87583a {

    /* renamed from: a */
    public final long[] f253020a = {1088};

    /* renamed from: a */
    public void mo121687a(ArrayList<IDKey> arrayList, boolean z) {
        C115669n.INSTANCE.mo160124a(arrayList, z);
    }

    /* renamed from: e */
    public void mo121688e(long j, long j2) {
        mo121689f(j, j2, 1);
    }

    /* renamed from: f */
    public void mo121689f(long j, long j2, long j3) {
        C115669n.INSTANCE.mo175913w(j, j2, j3);
    }

    public void idkeyStat(long j, long j2, long j3, boolean z) {
        C115669n.INSTANCE.idkeyStat(j, j2, j3, z);
        long[] jArr = this.f253020a;
        int length = jArr.length;
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (jArr[i] == j) {
                z2 = true;
                break;
            } else {
                i++;
            }
        }
        if (z2) {
            C84240s.m103844j((String) null, 0, 0, j, j2, j3);
        }
    }
}
