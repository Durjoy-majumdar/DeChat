package p512ex;

import com.tencent.p014mm.roomsdk.model.factory.C72941b;
import com.tencent.p014mm.roomsdk.model.factory.C72944d;
import com.tencent.p014mm.roomsdk.model.factory.C72946e;
import com.tencent.p014mm.roomsdk.model.factory.RoomOpLogCallbackFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import mg3.C47024a;
import ng3.C47258b;
import og3.C35167b;
import og3.C47377d;
import og3.C77007c;
import p261wl.C38166b;
import p261wl.C38174i;
import p530fx.C45818b;
import p530fx.C45819c;
import p530fx.C45820d;
import p530fx.C75818e;

@C86522b
/* renamed from: ex.b */
public class C45694b extends C86301e implements C45819c {
    /* renamed from: SH */
    public C45820d mo71190SH(boolean z) {
        return new RoomOpLogCallbackFactory(z);
    }

    public C47024a bl0(int i) {
        return new C72946e(i);
    }

    /* renamed from: mK */
    public C77007c mo71192mK(String str) {
        C47258b bVar = C47258b.f126868b;
        int indexOf = str.indexOf("@");
        if (indexOf < 0) {
            Log.m105921e("MicroMsg.RoomServiceFactory", "get NotNullChatRoom %s", str);
            return new C47377d();
        }
        String substring = str.substring(indexOf);
        C47258b bVar2 = C47258b.f126868b;
        C77007c cVar = bVar2.f126869a.containsKey(substring) ? bVar2.f126869a.get(substring) : null;
        if (cVar == null) {
            C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C35167b.class);
            C38166b.C38167a.C38169b bVar3 = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
            while (bVar3.hasNext()) {
                C38174i iVar = (C38174i) bVar3.next();
                if (iVar.hasKey(substring)) {
                    cVar = ((C35167b) iVar.get()).get();
                }
            }
        }
        C77007c cVar2 = cVar;
        return cVar2 == null ? new C47377d() : cVar2;
    }

    /* renamed from: qd */
    public C75818e mo71193qd(boolean z) {
        return new C72944d(z);
    }

    public C45818b wc0(boolean z) {
        return new C72941b(z);
    }
}
