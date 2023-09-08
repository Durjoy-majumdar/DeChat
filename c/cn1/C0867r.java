package cn1;

import an1.C0092e;
import an1.C0093f;
import an1.C0099l;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58784w3;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import sx3.C110818d0;
import sx3.C13798c0;
import sx3.C26236u;
import sx3.C64175a0;
import te3.C52231z81;
import wp1.C15585f;
import xm1.C15829e0;
import zm1.C16299c;

/* renamed from: cn1.r */
public final class C0867r extends C15829e0.C15830a.C15831a {

    /* renamed from: a */
    public final /* synthetic */ C0093f f2059a;

    /* renamed from: b */
    public final /* synthetic */ C16299c f2060b;

    /* renamed from: c */
    public final /* synthetic */ C0859p f2061c;

    public C0867r(C0093f fVar, C16299c cVar, C0859p pVar) {
        this.f2059a = fVar;
        this.f2060b = cVar;
        this.f2061c = pVar;
    }

    /* renamed from: d */
    public void mo763d(int i, List<? extends C52231z81> list) {
        C87412m.m108594g(list, "cards");
        C0093f fVar = this.f2059a;
        if (i == fVar.f530d.f130377d) {
            ArrayList<C0740i2> arrayList = fVar.f531e;
            C16299c cVar = this.f2060b;
            C87412m.m108594g(arrayList, "feeds");
            C87412m.m108594g(cVar, "adapter");
            C0740i2 i2Var = (C0740i2) C110818d0.m150925W(arrayList);
            if (i2Var != null && (i2Var instanceof C0099l)) {
                C64175a0.m75516x(arrayList);
                cVar.notifyItemRemoved(arrayList.size());
            }
            this.f2059a.f530d.f130381h.addAll(list);
            C0859p pVar = this.f2061c;
            C16299c cVar2 = this.f2060b;
            C0093f fVar2 = this.f2059a;
            for (C52231z81 z812 : list) {
                FinderObject finderObject = z812.f145756f;
                if (finderObject != null) {
                    FinderItem finderItem = (FinderItem) C110818d0.m150916N(C15585f.f42211a.mo14343f(C26236u.m33719b(finderObject), C58784w3.f168295a.mo83887M1(0), pVar.f2040i));
                    if (finderItem != null) {
                        fVar2.f531e.add(new C0092e(finderItem));
                        Log.m105924i("Finder.HeadLivingListConvert", "#caller.append " + finderItem.getNickName());
                    }
                    cVar2.notifyItemInserted(fVar2.f531e.size() - 1);
                }
            }
            C0093f fVar3 = this.f2059a;
            ArrayList<C0740i2> arrayList2 = fVar3.f531e;
            C16299c cVar3 = this.f2060b;
            int i2 = fVar3.f530d.f130382i;
            C87412m.m108594g(arrayList2, "feeds");
            C87412m.m108594g(cVar3, "adapter");
            if (i2 > 0 && !(!C13798c0.m13102z(arrayList2, C0099l.class).isEmpty())) {
                arrayList2.add(new C0099l());
                cVar3.notifyItemInserted(arrayList2.size() - 1);
            }
        }
    }
}
