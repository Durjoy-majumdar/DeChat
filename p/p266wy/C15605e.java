package p266wy;

import com.tencent.p014mm.contact.C40294d;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C45628s0;
import eb0.C75592q0;
import f62.C31924c1;
import java.util.Map;
import ky2.C10432i;
import ky2.C10438n;
import my2.C11097d;
import my2.C11098e;
import ob0.C35136m;
import rx3.C36570n;
import zt3.C119157j;

/* renamed from: wy.e */
public class C15605e implements C31924c1 {

    /* renamed from: wy.e$a */
    public class C15606a implements Runnable {
        public C15606a(C15605e eVar) {
        }

        public void run() {
            ((C10432i) C86312j.m106911c(C10432i.class)).I40();
        }
    }

    /* renamed from: o */
    public void mo8730o(String str, Map<String, String> map, C35136m.C35137a aVar) {
        String str2 = map.get(".sysmsg.teenagermodebecomeguardian.guardianusername");
        String str3 = map.get(".sysmsg.teenagermodebecomeguardian.wardusername");
        long j = Util.getLong(map.get(".sysmsg.teenagermodebecomeguardian.becomeguardiantime"), (long) C31543z5.m39455e());
        C10438n nVar = new C10438n();
        nVar.field_guardianUserName = str2;
        nVar.field_wardUserName = str3;
        nVar.field_ticket = map.get(".sysmsg.teenagermodebecomeguardian.ticket");
        nVar.field_time = j * 1000;
        C11098e eVar = C11098e.f32878a;
        ((C11097d) ((C36570n) C11098e.f32881d).getValue()).replace(nVar);
        if (C75592q0.m90789s().equalsIgnoreCase(str3)) {
            C72996z1 k = C45628s0.m50782k(str2);
            int type = k.getType();
            IAutoDBItem.MAutoDBInfo mAutoDBInfo = C40294d.f108318T1;
            k.setType(type | 1073741824);
            C45628s0.m50763a0(k);
        } else if (C75592q0.m90789s().equalsIgnoreCase(str2)) {
            C72996z1 k2 = C45628s0.m50782k(str3);
            int type2 = k2.getType();
            IAutoDBItem.MAutoDBInfo mAutoDBInfo2 = C40294d.f108318T1;
            k2.setType(type2 | 536870912);
            C45628s0.m50763a0(k2);
        }
        ((C119157j) C119157j.f356862d).mo183875f(new C15606a(this));
    }
}
