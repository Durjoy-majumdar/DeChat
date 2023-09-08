package cn1;

import an1.C0099l;
import an1.C0103p;
import cm1.C0740i2;
import cn1.C0827e1;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import pm1.C62381d;
import sx3.C110818d0;
import sx3.C13798c0;
import sx3.C64175a0;
import sx3.C64197v;
import te3.C48682a91;
import te3.C52231z81;
import xm1.C15827d0;
import xm1.C15829e0;
import zm1.C16304h;

/* renamed from: cn1.h1 */
public final class C0841h1 extends C15829e0.C15830a.C15831a {

    /* renamed from: a */
    public final /* synthetic */ C0103p f1983a;

    /* renamed from: b */
    public final /* synthetic */ C16304h f1984b;

    /* renamed from: c */
    public final /* synthetic */ C0827e1 f1985c;

    /* renamed from: d */
    public final /* synthetic */ C0827e1.C0829b f1986d;

    /* renamed from: e */
    public final /* synthetic */ WxRecyclerView f1987e;

    public C0841h1(C0103p pVar, C16304h hVar, C0827e1 e1Var, C0827e1.C0829b bVar, WxRecyclerView wxRecyclerView) {
        this.f1983a = pVar;
        this.f1984b = hVar;
        this.f1985c = e1Var;
        this.f1986d = bVar;
        this.f1987e = wxRecyclerView;
    }

    /* renamed from: a */
    public void mo760a(long j) {
        int i = 0;
        int i2 = -1;
        for (T next : this.f1983a.f546e) {
            int i3 = i + 1;
            if (i >= 0) {
                C0740i2 i2Var = (C0740i2) next;
                if ((i2Var instanceof BaseFinderFeed) && ((BaseFinderFeed) i2Var).mo3513o().getFeedObject().f164794id == j) {
                    i2 = i;
                }
                i = i3;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        if (i2 != -1) {
            this.f1983a.f546e.remove(i2);
            this.f1984b.notifyItemRemoved(i2);
        }
    }

    /* renamed from: b */
    public void mo761b(int i, long j) {
        LinkedList<C52231z81> linkedList;
        C48682a91 a912 = this.f1983a.f545d;
        if (a912.f130377d == i && (linkedList = a912.f130381h) != null) {
            WxRecyclerView wxRecyclerView = this.f1987e;
            int i2 = 0;
            for (T next : linkedList) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    FinderObject finderObject = ((C52231z81) next).f145756f;
                    if (finderObject != null && finderObject.f164794id == j) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(Integer.valueOf(i2));
                        C117292a.m165358d(wxRecyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/SpecialColumnListConvert$onBindViewHolder$5", "scrollToLiveIdPosition", "(IJ)V", "Undefined", "smoothScrollToPosition", "(I)V");
                        wxRecyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(wxRecyclerView, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/SpecialColumnListConvert$onBindViewHolder$5", "scrollToLiveIdPosition", "(IJ)V", "Undefined", "smoothScrollToPosition", "(I)V");
                    }
                    i2 = i3;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo762c(C0740i2 i2Var) {
        C87412m.m108594g(i2Var, "whichContainer");
        if (!(i2Var instanceof C0103p) || ((C0103p) i2Var).f545d.f130377d != this.f1983a.f545d.f130377d) {
            Log.m105924i("Finder.SpecialColumnListConvert", "caller.checkPlayer isn't me! turn off check");
            C62381d dVar = this.f1986d.f1955d;
            if (dVar != null) {
                dVar.mo87447z(false);
                return;
            }
            return;
        }
        Log.m105924i("Finder.SpecialColumnListConvert", "caller.checkPlayer is me! turn on check");
        C62381d dVar2 = this.f1986d.f1955d;
        if (dVar2 != null) {
            dVar2.mo87447z(true);
        }
    }

    /* renamed from: d */
    public void mo763d(int i, List<? extends C52231z81> list) {
        C87412m.m108594g(list, "cards");
        C0103p pVar = this.f1983a;
        if (i == pVar.f545d.f130377d) {
            ArrayList<C0740i2> arrayList = pVar.f546e;
            C16304h hVar = this.f1984b;
            C87412m.m108594g(arrayList, "feeds");
            C87412m.m108594g(hVar, "adapter");
            C0740i2 i2Var = (C0740i2) C110818d0.m150925W(arrayList);
            if (i2Var != null && (i2Var instanceof C0099l)) {
                C64175a0.m75516x(arrayList);
                hVar.notifyItemRemoved(arrayList.size());
            }
            this.f1983a.f545d.f130381h.addAll(list);
            C0103p pVar2 = this.f1983a;
            C0827e1 e1Var = this.f1985c;
            C16304h hVar2 = this.f1984b;
            for (C52231z81 a : list) {
                if (C15827d0.f42635a.mo14506a(pVar2.f546e, a, pVar2, e1Var.f1948i)) {
                    hVar2.notifyItemInserted(pVar2.f546e.size() - 1);
                }
            }
            C0103p pVar3 = this.f1983a;
            ArrayList<C0740i2> arrayList2 = pVar3.f546e;
            C16304h hVar3 = this.f1984b;
            int i2 = pVar3.f545d.f130382i;
            C87412m.m108594g(arrayList2, "feeds");
            C87412m.m108594g(hVar3, "adapter");
            if (i2 > 0 && !(!C13798c0.m13102z(arrayList2, C0099l.class).isEmpty())) {
                arrayList2.add(new C0099l());
                hVar3.notifyItemInserted(arrayList2.size() - 1);
            }
        }
    }

    /* renamed from: e */
    public void mo764e() {
        C62381d dVar = this.f1986d.f1955d;
        if (dVar != null) {
            dVar.mo87432k();
        }
    }
}
