package p813fl;

import androidx.recyclerview.widget.C54248l;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.manager.SmileyPanelManager;
import com.tencent.p014mm.view.manager.SmileyPanelManager$$a;
import com.tencent.p014mm.view.manager.SmileyPanelManager$$g;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import p171il.C98720h0;
import p171il.C98727l;
import p585kl.C76595c;
import p585kl.C99150i;
import rx3.C13598b0;

/* renamed from: fl.m */
public final class C97916m extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C97918n f287229d;

    /* renamed from: e */
    public final /* synthetic */ C97921o f287230e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97916m(C97918n nVar, C97921o oVar) {
        super(0);
        this.f287229d = nVar;
        this.f287230e = oVar;
    }

    public Object invoke() {
        C98720h0 h0Var;
        C97913k0 k0Var = this.f287229d.f287234b;
        C97921o oVar = this.f287230e;
        SmileyPanelManager$$g smileyPanelManager$$g = (SmileyPanelManager$$g) k0Var;
        smileyPanelManager$$g.f285747d.f285727r = oVar;
        Log.m105925i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "onUpdateData: group size %s", Integer.valueOf(((LinkedList) oVar.mo137240d()).size()));
        if (smileyPanelManager$$g.f285747d.f285727r.mo137240d().size() > 0) {
            C97924p0 p0Var = smileyPanelManager$$g.f285747d.f285727r.mo137240d().get(0);
            if (p0Var instanceof C97943y0) {
                smileyPanelManager$$g.f285747d.f285733x = (C97943y0) p0Var;
                C76595c.m92188a().f224192e = smileyPanelManager$$g.f285747d.f285733x.f287280e.f287277d;
            } else {
                smileyPanelManager$$g.f285747d.f285733x = null;
            }
            if (smileyPanelManager$$g.f285747d.f285727r.mo137237a().size() == 1) {
                SmileyPanelManager smileyPanelManager = smileyPanelManager$$g.f285747d;
                if (smileyPanelManager.f285733x != null) {
                    smileyPanelManager.f285722m.setVisibility(8);
                }
            }
            smileyPanelManager$$g.f285747d.f285722m.setVisibility(0);
        }
        SmileyPanelManager smileyPanelManager2 = smileyPanelManager$$g.f285747d;
        C98720h0 h0Var2 = smileyPanelManager2.f285724o;
        List<C97934u0> a = smileyPanelManager2.f285727r.mo137237a();
        h0Var2.getClass();
        C87412m.m108594g(a, "data");
        h0Var2.f289474e.clear();
        h0Var2.f289474e.addAll(a);
        if (h0Var2.f289477h != null) {
            Iterator<C97934u0> it = h0Var2.f289474e.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (C87412m.m108589b(it.next().f287264a.mo137249c(), h0Var2.f289477h)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                i = 0;
            }
            h0Var2.mo138116G4(i);
        }
        Log.m105925i("MicroMsg.emoji.SmileyPanel.SmileyTabAdapter", "update %s, %s", Integer.valueOf(h0Var2.f289474e.size()), Integer.valueOf(a.size()));
        SmileyPanelManager smileyPanelManager3 = smileyPanelManager$$g.f285747d;
        C98727l lVar = smileyPanelManager3.f285716g;
        List<C97924p0<?>> d = smileyPanelManager3.f285727r.mo137240d();
        lVar.getClass();
        C87412m.m108594g(d, "models");
        lVar.f289501j.clear();
        lVar.f289501j.addAll(d);
        C99150i.m129154a().f290717j = smileyPanelManager$$g.f285747d.f285725p.f287215l ? 1 : 0;
        int i2 = 0;
        while (true) {
            if (i2 >= smileyPanelManager$$g.f285747d.f285727r.mo137239c().size()) {
                i2 = 0;
                break;
            } else if (smileyPanelManager$$g.f285747d.f285727r.mo137239c().get(i2).mo137247a(smileyPanelManager$$g.f285747d.f285712c)) {
                break;
            } else {
                i2++;
            }
        }
        if (smileyPanelManager$$g.f285746c) {
            RecyclerView recyclerView = smileyPanelManager$$g.f285747d.f285715f;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i2));
            RecyclerView recyclerView2 = recyclerView;
            C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/view/manager/SmileyPanelManager$2", "onUpdateData", "(Lcom/tencent/mm/emoji/model/panel/IEmojiPanelData;)V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(recyclerView2, "com/tencent/mm/view/manager/SmileyPanelManager$2", "onUpdateData", "(Lcom/tencent/mm/emoji/model/panel/IEmojiPanelData;)V", "Undefined", "scrollToPosition", "(I)V");
            smileyPanelManager$$g.f285747d.mo136457i(i2);
            if (i2 < smileyPanelManager$$g.f285747d.f285727r.mo137240d().size()) {
                smileyPanelManager$$g.f285747d.f285727r.mo137240d().get(i2).mo137253c();
                smileyPanelManager$$g.f285746c = false;
            }
        } else {
            SmileyPanelManager smileyPanelManager4 = smileyPanelManager$$g.f285747d;
            if (smileyPanelManager4.f285727r != null) {
                RecyclerView recyclerView3 = smileyPanelManager4.f285715f;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(Integer.valueOf(i2));
                RecyclerView recyclerView4 = recyclerView3;
                C117292a.m165358d(recyclerView4, aVar2.mo10232b(), "com/tencent/mm/view/manager/SmileyPanelManager", "checkTabSelected", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                recyclerView3.mo17115r1(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView4, "com/tencent/mm/view/manager/SmileyPanelManager", "checkTabSelected", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                if (i2 >= 0 && i2 < smileyPanelManager4.f285727r.mo137239c().size()) {
                    int b = smileyPanelManager4.f285727r.mo137238b(i2);
                    if (!(smileyPanelManager4.f285722m == null || (h0Var = smileyPanelManager4.f285724o) == null)) {
                        h0Var.mo138116G4(b);
                        smileyPanelManager4.f285722m.post(new SmileyPanelManager$$a(smileyPanelManager4, b));
                    }
                    smileyPanelManager4.mo136459k(i2);
                }
            }
        }
        C97918n nVar = this.f287229d;
        C54248l.C54251c cVar = nVar.f287237e;
        if (cVar != null) {
            cVar.mo75045a(new C97912k(nVar));
        }
        C97918n nVar2 = this.f287229d;
        C54248l.C54251c cVar2 = nVar2.f287238f;
        if (cVar2 != null) {
            cVar2.mo75045a(new C97914l(nVar2));
        }
        Log.m105924i("MicroMsg.EmojiPanelData", "updateData: end");
        C97918n nVar3 = this.f287229d;
        nVar3.f287239g = false;
        if (nVar3.f287240h) {
            nVar3.f287240h = false;
            nVar3.mo137246b();
        }
        return C13598b0.f38549a;
    }
}
