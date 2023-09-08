package em3;

import android.util.Pair;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import dm3.C86351b;
import e42.C7596h;
import e42.C86432k;
import fm3.C75776a;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p1048uk.C90685a;
import sx3.C26236u;
import zj3.C79382t;

/* renamed from: em3.e */
public final class C86580e extends C86432k<C86351b> {
    /* renamed from: e */
    public String mo16e() {
        return "getVisibleMsgMetas";
    }

    /* renamed from: l */
    public boolean mo17l() {
        return true;
    }

    /* renamed from: o */
    public C7596h mo62167o(C7596h hVar) {
        C87412m.m108594g(hVar, "data");
        T t = this.f251227a;
        C87412m.m108591d(t);
        C86351b bVar = (C86351b) t;
        Log.m105924i("MicroMsg.MEGetVisibleMsgMetas", "[ME] getVisibleMsgMetas data = " + hVar);
        boolean optBoolean = hVar.optBoolean("needFrame", false);
        C67391b bVar2 = bVar.f251055a;
        List<Pair<C72963f4, C74023i.C74026c>> b = C75776a.m91028b(bVar2, false);
        ArrayList arrayList = new ArrayList();
        if (b != null) {
            ArrayList arrayList2 = (ArrayList) b;
            if (arrayList2.size() > 0) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    C90685a I5 = ((C79382t) bVar2.f193278b.mo102812a(C79382t.class)).mo109367I5();
                    Object obj = pair.first;
                    C87412m.m108593f(obj, "pair.first");
                    List<String> y = I5.mo124821y((C72963f4) obj);
                    if (y.isEmpty()) {
                        y = C26236u.m33719b("");
                    }
                    for (String b2 : y) {
                        C86585j b3 = C86585j.m107403b((C72963f4) pair.first, b2, "", optBoolean, true, bVar2, bVar.f251056b);
                        if (b3 != null) {
                            arrayList.add(b3.mo121027c(true));
                        }
                    }
                }
                HashMap hashMap = new HashMap();
                hashMap.put("msgMetas", arrayList);
                return mo120846k(hashMap);
            }
        }
        Log.m105924i("MicroMsg.MEGetVisibleMsgMetas", "[ME] get visible msg metas, no visible holders found");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("msgMetas", arrayList);
        return mo120846k(hashMap2);
    }
}
