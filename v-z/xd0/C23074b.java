package xd0;

import com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import rd0.C22226d;
import yd0.C23296g;

/* renamed from: xd0.b */
public final class C23074b {

    /* renamed from: a */
    public final C23073a f66288a;

    public C23074b(C23073a aVar) {
        this.f66288a = aVar;
    }

    /* renamed from: a */
    public final void mo36479a(String str, List<SubscribeMsgTmpItem> list, boolean z, boolean z2, boolean z3) {
        String str2 = str;
        C87412m.m108594g(str, "bizUsername");
        C87412m.m108594g(list, "toSaveList");
        C23073a aVar = this.f66288a;
        if (aVar != null) {
            C23084k.f66311a.mo36492b(aVar, new C23296g(str, list, z, z2, z3, aVar, (C22226d) null, 64, (C8480h) null));
        }
    }
}
