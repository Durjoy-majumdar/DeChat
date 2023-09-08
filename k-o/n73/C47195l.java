package n73;

import com.tencent.p014mm.plugin.wear.model.C43457b;
import com.tencent.p014mm.plugin.wear.model.C43462g;
import com.tencent.p014mm.plugin.wear.model.C43464h;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C45628s0;
import eb0.C97625j3;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import l73.C46836a;
import p818oi.C47380a;
import tc0.C77885p;
import te3.f15;

/* renamed from: n73.l */
public class C47195l extends C47188b {
    /* renamed from: a */
    public List<Integer> mo11243a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(11011);
        arrayList.add(11010);
        return arrayList;
    }

    /* renamed from: b */
    public byte[] mo11244b(int i, byte[] bArr) {
        if (i != 11010) {
            if (i == 11011) {
                String str = "";
                try {
                    str = new String(bArr, "utf8");
                } catch (UnsupportedEncodingException unused) {
                }
                C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(str);
                if (C72996z1.m85820U5(str)) {
                    C72996z1 z1Var2 = C97625j3.m125812b().mo105907v().get(str);
                    z1Var2.mo62861K3(0);
                    C97625j3.m125812b().mo105907v().mo69719p3(str, z1Var2);
                    ((C77885p) C97625j3.m125812b().mo105876B()).mo107993q(new C47380a(str, 0));
                } else {
                    C45628s0.m50779i0(z1Var, true);
                }
                C46836a.m52129b(4, 0);
            }
            return null;
        }
        f15 f15 = new f15();
        try {
            f15.parseFrom(bArr);
        } catch (IOException unused2) {
        }
        C43464h yx02 = C43457b.yx0();
        String str2 = f15.f133244d;
        int i2 = f15.f133245e;
        synchronized (yx02) {
            if (yx02.f117487a.containsKey(str2)) {
                C43462g gVar = yx02.f117487a.get(str2);
                gVar.f117480e = C43462g.C43463a.IGNORE;
                gVar.f117479d = i2;
                Log.m105925i("MicroMsg.Wear.WearNotificationMap", "Update ignore success, notification=%s", gVar);
            }
        }
        return null;
    }
}
