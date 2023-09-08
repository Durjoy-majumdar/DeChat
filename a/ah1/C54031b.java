package ah1;

import cl1.C54991o;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fj1.C45795b;
import gy3.C87412m;
import java.util.LinkedList;
import te3.C64674r41;
import tf0.C64918r1;
import yg1.C66640h;

/* renamed from: ah1.b */
public final class C54031b extends C66640h {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54031b(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* renamed from: d */
    public void mo74693d(LinkedList<C64674r41> linkedList) {
        C87412m.m108594g(linkedList, "msgList");
        Class cls = C54991o.class;
        int i = 0;
        for (C64674r41 r412 : linkedList) {
            int i2 = r412.f185127g;
            if (i2 == 10007) {
                ((C54991o) this.f191616a.mo71262a(cls)).f154366t = false;
                ((C54991o) this.f191616a.mo71262a(cls)).f154374v = r412.f185126f;
            } else if (i2 == 10008) {
                ((C54991o) this.f191616a.mo71262a(cls)).f154366t = true;
                ((C54991o) this.f191616a.mo71262a(cls)).f154374v = null;
            }
            i = i2;
        }
        if (i == 10007) {
            ((C64918r1) C86312j.m106911c(C64918r1.class)).mo89056iQ();
        }
        Log.m105924i("MMFinder.LiveMsgSlice", "updateLiveMsg commentType:" + i);
    }

    /* renamed from: f */
    public int[] mo74694f() {
        return new int[]{10008, CdnLogic.kMediaTypeFavoriteBigFile};
    }
}
