package hd0;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import uf0.C102014a;
import uf0.C102015b;
import uf0.C102016c;

/* renamed from: hd0.a */
public class C98384a {
    /* renamed from: a */
    public static void m127689a(C98408n0 n0Var, int i) {
        int i2;
        long j;
        C98408n0 n0Var2 = n0Var;
        if (n0Var2 == null) {
            Log.m105928w("MicroMsg.AtomStatUtil", "report moov location, but video info is null.");
            return;
        }
        long currentTicks = Util.currentTicks();
        String q = C98398h0.Bx0().mo137728q(n0Var.mo137700d());
        long j2 = 0;
        if (C102016c.m134339a(q)) {
            C102015b bVar = new C102015b();
            long a = bVar.mo141510a(q);
            C102014a aVar = bVar.f300399c;
            if (aVar != null) {
                j2 = aVar.f300396d;
            }
            j = j2;
            j2 = a;
            i2 = 1;
        } else {
            Log.m105924i("MicroMsg.AtomStatUtil", "download video finish, but it is not mp4 file.");
            j = 0;
            i2 = 0;
        }
        String str = n0Var2.f288556c + ";" + C98408n0.m127710c(n0Var.mo137705i()) + ";" + ((long) n0Var2.f288559f) + ";" + i2 + ";" + j2 + ";" + j + ";" + i;
        Log.m105918d("MicroMsg.AtomStatUtil", "report moov content : " + str + " cost time: " + Util.ticksToNow(currentTicks));
        C115669n.INSTANCE.mo160131h(11098, 8000, str);
    }
}
