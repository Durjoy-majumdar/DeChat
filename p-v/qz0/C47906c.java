package qz0;

import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import dz0.C20483c;
import dz0.C45497b;
import hz0.C46153l0;
import java.util.ArrayList;

/* renamed from: qz0.c */
public class C47906c implements C45497b {

    /* renamed from: a */
    public C47905b f128527a;

    public C47906c(C47905b bVar) {
        this.f128527a = bVar;
    }

    public C20483c getItem(int i) {
        C47905b bVar = this.f128527a;
        if (bVar != null) {
            return (ShareCardInfo) bVar.getItem(i);
        }
        return null;
    }

    public void onCreate() {
        if (this.f128527a != null) {
            C46153l0.Gx0().add(this.f128527a);
        }
    }

    public void onDestroy() {
        if (this.f128527a != null) {
            C46153l0.Gx0().remove(this.f128527a);
            C47905b bVar = this.f128527a;
            ((C47912j) bVar.f128523p).release();
            bVar.f128523p = null;
            bVar.mo5580b();
            int i = (int) (bVar.f128526s - bVar.f128525r);
            ArrayList arrayList = new ArrayList();
            IDKey iDKey = new IDKey();
            iDKey.SetID(281);
            iDKey.SetKey(24);
            iDKey.SetValue(1);
            IDKey iDKey2 = new IDKey();
            iDKey2.SetID(281);
            iDKey2.SetKey(25);
            iDKey2.SetValue((long) i);
            arrayList.add(iDKey);
            arrayList.add(iDKey2);
            C115669n.INSTANCE.mo160124a(arrayList, true);
            this.f128527a = null;
        }
    }

    public void onNotify() {
        C47905b bVar = this.f128527a;
        if (bVar != null) {
            bVar.mo7991f();
        }
    }
}
