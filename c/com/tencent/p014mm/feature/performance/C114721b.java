package com.tencent.p014mm.feature.performance;

import android.text.TextUtils;
import android.util.SparseArray;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import java.util.LinkedList;
import java.util.List;
import p1177ce.C113287a;
import p212oe.C117750b;
import p212oe.C117762j;
import p212oe.b$$f;
import p269xe.C118872b;
import p269xe.C91178c;
import p269xe.C91179e;
import p757xv.C118903j;
import p757xv.C118904l;
import p757xv.C38851s;
import p757xv.C91346k;
import p933be.C113159b;

@C86522b
/* renamed from: com.tencent.mm.feature.performance.b */
public class C114721b extends C86301e implements C38851s, C91346k, C118903j, C118904l {
    /* renamed from: Ja */
    public void mo125329Ja(C91346k.C91347a aVar) {
        List<C91346k.C91347a> list = C117762j.f352163a;
        synchronized (list) {
            ((LinkedList) list).add(aVar);
        }
    }

    /* renamed from: Jj */
    public boolean mo174294Jj() {
        return false;
    }

    /* renamed from: QL */
    public boolean mo125330QL() {
        return C117762j.f352167e;
    }

    public void So0(int i, C113159b.C113163c cVar) {
        if (b$$f.m166058c()) {
            C113287a b = C113287a.m155094b(cVar.mo165676a());
            if (b.f338975m) {
                long j = 1;
                long max = Math.max(1, cVar.mo165676a() / 60000);
                int c = b.mo165839c();
                int d = b.mo165840d();
                String f = C118872b.m167609f();
                Log.m105924i("Matrix.battery.BatteryReporter", "#statResUpdateInfo");
                SparseArray<Integer> sparseArray = C91179e.C91181b.f261436a;
                long j2 = (long) i;
                if (cVar.mo165679d()) {
                    j = 0;
                }
                C91179e.C91181b.m114437a(0, 5, f, "", c, d, "bgResUpdate", j2, "bg", j, "duringMin", max, b.f338971i, "", (long) b.f338964b, (long) b.f338967e, (long) b.f338972j, "");
            }
        }
    }

    /* renamed from: XK */
    public void mo174296XK(int i, String str, long j) {
        int i2 = i;
        List<String> list = C91179e.C91181b.C91182a.f261437a;
        if (j > C117750b.m166045c() && i2 > 0) {
            C113287a b = C113287a.m155094b(j);
            if (b.f338975m) {
                long max = Math.max(1, j / 60000);
                int c = b.mo165839c();
                int d = b.mo165840d();
                long j2 = ((long) i2) / max;
                if (j2 > 2) {
                    String f = C118872b.m167609f();
                    String str2 = b.f338971i;
                    String c2 = C91178c.m114430c(str);
                    if (!TextUtils.isEmpty(b.f338973k) && ("background".equals(b.f338971i) || "bg".equals(b.f338971i))) {
                        str2 = "bg-" + b.f338973k;
                    }
                    String str3 = str2;
                    Log.m105924i("Matrix.battery.BatteryReporter", "#reportTmsLocationException");
                    SparseArray<Integer> sparseArray = C91179e.C91181b.f261436a;
                    C91179e.C91181b.m114437a(1, 5, f, "", c, d, "avgTmsLocationErr", j2, "", 0, "duringMin", max, str3, str, (long) b.f338964b, (long) b.f338967e, (long) b.f338972j, c2);
                }
            }
        }
    }

    /* renamed from: bO */
    public void mo76561bO(int i) {
        C91179e.C91180a.m114434a((long) i);
    }

    /* renamed from: e2 */
    public boolean mo76562e2(int i) {
        return C117750b.m166053k(i);
    }
}
