package n73;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.report.service.C5138r;
import com.tencent.p014mm.plugin.wear.model.C43457b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import te3.s05;
import te3.t05;

/* renamed from: n73.i */
public class C47192i extends C47188b {
    /* renamed from: a */
    public List<Integer> mo11243a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(11000);
        arrayList.add(11003);
        arrayList.add(11035);
        return arrayList;
    }

    /* renamed from: b */
    public byte[] mo11244b(int i, byte[] bArr) {
        String str = "";
        int i2 = 0;
        if (i == 11000) {
            String str2 = new String(bArr);
            try {
                str = C86013q1.m106432N(str2);
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.Wear.HttpLogServer", e, "handleData", new Object[0]);
            }
            String[] split = str.split("​​");
            ArrayList arrayList = new ArrayList();
            while (i2 < split.length) {
                arrayList.add(split[i2]);
                if (i2 % 50 == 9) {
                    C115669n nVar = C115669n.INSTANCE;
                    nVar.getClass();
                    nVar.mo175908r("WearCrash", new C5138r(nVar, arrayList));
                    arrayList.clear();
                }
                i2++;
            }
            if (arrayList.size() > 0) {
                C115669n nVar2 = C115669n.INSTANCE;
                nVar2.getClass();
                nVar2.mo175908r("WearCrash", new C5138r(nVar2, arrayList));
                arrayList.clear();
            }
            C86013q1.m106447h(str2);
            return null;
        } else if (i == 11003) {
            String str3 = new String(bArr);
            try {
                str = C86013q1.m106432N(str3);
            } catch (IOException e2) {
                Log.printErrStackTrace("MicroMsg.Wear.HttpLogServer", e2, "handleData", new Object[0]);
            }
            String[] split2 = str.split("​​");
            int length = split2.length;
            while (i2 < length) {
                Log.m105924i("MicroMsg.Wear.LOG", split2[i2]);
                i2++;
            }
            C86013q1.m106447h(str3);
            return null;
        } else if (i != 11035) {
            return null;
        } else {
            s05 s05 = new s05();
            try {
                s05.parseFrom(bArr);
            } catch (IOException unused) {
            }
            t05 t05 = C43457b.xx0().f347577c.f126742a;
            if (t05 == null) {
                return null;
            }
            Log.m105927v("MicroMsg.Wear.HttpLogServer", "report kv id=%d %s %s %s %s data=%s", Integer.valueOf(s05.f141258d), t05.f141887e, t05.f141886d, Integer.valueOf(t05.f141895p), t05.f141888f, s05.f141259e);
            C115669n.INSTANCE.mo160131h(s05.f141258d, t05.f141887e, t05.f141886d, Integer.valueOf(t05.f141895p), t05.f141888f, s05.f141259e);
            return null;
        }
    }
}
