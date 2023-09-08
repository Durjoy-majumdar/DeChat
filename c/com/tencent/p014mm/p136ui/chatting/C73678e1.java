package com.tencent.p014mm.p136ui.chatting;

import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C80995a;
import com.tencent.p014mm.message.C92721n;
import com.tencent.p014mm.message.OnAppBrandAppMessageRetransmitEvent;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import gw0.C76073b;
import java.util.LinkedList;
import java.util.List;
import kb0.C76529i;
import kb0.C9576e;
import lb0.C88394b;
import p823sg.C101611g;
import s90.C77629i;
import s90.C77630j;

/* renamed from: com.tencent.mm.ui.chatting.e1 */
public class C73678e1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List f216330d;

    public C73678e1(List list) {
        this.f216330d = list;
    }

    public void run() {
        LinkedList<C77630j> linkedList;
        C68070l.C68072b u;
        List<C72963f4> list = this.f216330d;
        if (!Util.isNullOrNil((List) list)) {
            for (C72963f4 f4Var : list) {
                if (!(!f4Var.mo101020w3() || (u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null)) == null || u.mo93555w(C80995a.class) == null)) {
                    OnAppBrandAppMessageRetransmitEvent onAppBrandAppMessageRetransmitEvent = new OnAppBrandAppMessageRetransmitEvent();
                    onAppBrandAppMessageRetransmitEvent.f195352d = u;
                    onAppBrandAppMessageRetransmitEvent.publish();
                }
                if (f4Var.mo100967F3() && (linkedList = ((C76073b) C86312j.m106911c(C76073b.class)).mo94597JZ(f4Var.getMsgId(), f4Var.getContent()).f226295i) != null) {
                    for (C77630j next : linkedList) {
                        if (!Util.isNullOrNil(next.f226341w)) {
                            String str = next.f226336r;
                            C101611g<Long, C77629i> gVar = C92721n.f266840a;
                            if (C9576e.m9260a(str)) {
                                String str2 = C88394b.f255384g;
                                C88394b.C88418q.f255427a.mo122797p(new C73683f1(next), next.f226341w, (C88394b.C88408j) null, ((C76529i) C86312j.m106911c(C76529i.class)).Ij0(112, 90));
                            }
                        }
                    }
                }
            }
        }
    }
}
