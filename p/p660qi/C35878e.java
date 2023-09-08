package p660qi;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import g62.C75875l;
import java.util.ArrayList;
import java.util.Iterator;
import p203mi.C34572d0;
import p644pi.C77089d;
import p684si.C36674e;

/* renamed from: qi.e */
public class C35878e implements C75875l.C32329c {
    /* renamed from: w5 */
    public void mo55728w5(C75875l lVar, C75875l.C45886e eVar) {
        ArrayList<C72963f4> arrayList;
        boolean z;
        boolean z2;
        Class cls = C77089d.class;
        if (lVar != null && eVar != null && "delete".equals(eVar.f123845b) && (arrayList = eVar.f123846c) != null) {
            Iterator<C72963f4> it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C34572d0.m40390a(it.next())) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                C36674e jo = ((C77089d) C86312j.m106911c(cls)).xx0().mo60800jo(eVar.f123844a);
                if (jo == null || jo.field_queryState == 0) {
                    z2 = false;
                } else {
                    jo.field_queryState = 0;
                    z2 = ((C77089d) C86312j.m106911c(cls)).xx0().update(jo, new String[0]);
                }
                Object[] objArr = new Object[3];
                objArr[0] = Util.nullAs(eVar.f123844a, "");
                objArr[1] = jo == null ? "null" : "not_null";
                objArr[2] = Boolean.valueOf(z2);
                Log.m105925i("ChatroomUIMsgListener", "onNotifyChange roomName:%s groupTools:%s result:%s", objArr);
                return;
            }
            Log.m105918d("ChatroomUIMsgListener", "no need reset");
        }
    }
}
