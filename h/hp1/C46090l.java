package hp1;

import com.tencent.p014mm.autogen.events.FinderAddUserToBlackListEvent;
import com.tencent.p014mm.plugin.finder.search.FinderFansSearchUI;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import rx3.C13598b0;
import te3.C50275lk0;
import te3.C50542nh0;
import te3.C64707sc1;
import z04.C112551y;

/* renamed from: hp1.l */
public final class C46090l extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C50542nh0 f124246d;

    /* renamed from: e */
    public final /* synthetic */ FinderFansSearchUI f124247e;

    /* renamed from: f */
    public final /* synthetic */ C64707sc1 f124248f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46090l(C50542nh0 nh02, FinderFansSearchUI finderFansSearchUI, C64707sc1 sc12) {
        super(0);
        this.f124246d = nh02;
        this.f124247e = finderFansSearchUI;
        this.f124248f = sc12;
    }

    public Object invoke() {
        C50275lk0 lk02;
        if (this.f124246d.f138603e == 0) {
            ArrayList<C50275lk0> arrayList = this.f124247e.f111714s;
            C64707sc1 sc12 = this.f124248f;
            Iterator<C50275lk0> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    lk02 = null;
                    break;
                }
                lk02 = it.next();
                if (C112551y.m153810j(lk02.f137478f, sc12.f185408h, false, 2, (Object) null)) {
                    break;
                }
            }
            C50275lk0 lk03 = lk02;
            if (lk03 != null) {
                FinderFansSearchUI finderFansSearchUI = this.f124247e;
                C64707sc1 sc13 = this.f124248f;
                C50542nh0 nh02 = this.f124246d;
                finderFansSearchUI.f111714s.remove(lk03);
                FinderFansSearchUI.C41484b bVar = finderFansSearchUI.f111715t;
                if (bVar != null) {
                    bVar.notifyDataSetChanged();
                    FinderAddUserToBlackListEvent finderAddUserToBlackListEvent = new FinderAddUserToBlackListEvent();
                    FinderAddUserToBlackListEvent.C40098a aVar = finderAddUserToBlackListEvent.f107526d;
                    aVar.f107527a = sc13.f185408h;
                    aVar.f107528b = nh02.f138603e;
                    finderAddUserToBlackListEvent.publish();
                } else {
                    C87412m.m108603p("adapter");
                    throw null;
                }
            }
        }
        return C13598b0.f38549a;
    }
}
