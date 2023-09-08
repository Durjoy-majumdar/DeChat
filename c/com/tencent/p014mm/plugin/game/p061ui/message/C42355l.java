package com.tencent.p014mm.plugin.game.p061ui.message;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import hp3.C87581a;
import java.util.Iterator;
import java.util.List;
import ob0.C89132b;
import vw1.C53007c;
import vw1.C53009d;
import vw1.C53019i;
import xw1.C53453a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.game.ui.message.l */
public class C42355l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ InteractiveMsgMRecycleView f114574d;

    /* renamed from: com.tencent.mm.plugin.game.ui.message.l$a */
    public class C42356a implements C87581a<Object, C89132b.C89134c<C53009d>> {
        public C42356a() {
        }

        public Object call(Object obj) {
            C53007c cVar;
            C89132b.C89134c cVar2 = (C89132b.C89134c) obj;
            Log.m105925i("MicroMsg.InteractiveMsgMRecycleView", "do CgiGetInteractiveMsgContentRequest errtype: %s, errcode: %s", Integer.valueOf(cVar2.f256793a), Integer.valueOf(cVar2.f256794b));
            if (cVar2.f256793a == 0 && cVar2.f256794b == 0 && (cVar = ((C53009d) cVar2.f256796d).f147925d) != null) {
                Iterator<C53019i> it = cVar.f147921d.iterator();
                while (it.hasNext()) {
                    C53019i next = it.next();
                    InteractiveMsgMRecycleView.m46013B1(C42355l.this.f114574d, next.f147990d, next.f147992f, next.f147993g);
                }
            }
            InteractiveMsgMRecycleView interactiveMsgMRecycleView = C42355l.this.f114574d;
            if (interactiveMsgMRecycleView.f114491E1 == null) {
                return null;
            }
            ((C119157j) C119157j.f356862d).mo183876g(new C42357m(interactiveMsgMRecycleView), "InteractiveMsg");
            return null;
        }
    }

    public C42355l(InteractiveMsgMRecycleView interactiveMsgMRecycleView) {
        this.f114574d = interactiveMsgMRecycleView;
    }

    public void run() {
        if (!Util.isNullOrNil((List) this.f114574d.f114496J1)) {
            new C53453a(this.f114574d.f114496J1).mo9225i().mo123062e(new C42356a());
        }
    }
}
