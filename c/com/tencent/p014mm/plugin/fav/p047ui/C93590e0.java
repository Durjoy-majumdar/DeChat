package com.tencent.p014mm.plugin.fav.p047ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import mc1.C99830c;
import p525fr.C97951d;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.fav.ui.e0 */
public final class C93590e0 extends C87413o implements C32226l<Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FavFinderFilterUI f270264d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93590e0(FavFinderFilterUI favFinderFilterUI) {
        super(1);
        this.f270264d = favFinderFilterUI;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        if (intValue == 4) {
            FavFinderFilterUI favFinderFilterUI = this.f270264d;
            int i = FavFinderFilterUI.f269710o;
            favFinderFilterUI.mo128272J7().mo139196c3(7, false);
        } else if (intValue == 6) {
            FavFinderFilterUI favFinderFilterUI2 = this.f270264d;
            int i2 = FavFinderFilterUI.f269710o;
            favFinderFilterUI2.mo128272J7().mo139196c3(3, false);
        } else if (intValue == 8) {
            FavFinderFilterUI favFinderFilterUI3 = this.f270264d;
            int i3 = FavFinderFilterUI.f269710o;
            favFinderFilterUI3.mo128271I7().mo139191c3();
            this.f270264d.mo128272J7().mo139196c3(3, false);
        } else if (intValue == 10) {
            Log.m105924i("MicroMsg.FavFinderFilterUI", "[CONTEXT_OPERATE_DELETE_SUCCESS] removeItemsAndRefresh indexs = " + this.f270264d.f269715h);
            if (this.f270264d.f269715h != -1) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(Integer.valueOf(this.f270264d.f269715h));
                C97951d dVar = this.f270264d.f269713f;
                if (dVar != null) {
                    dVar.mo79144w(arrayList);
                    this.f270264d.mo128272J7().mo139196c3(6, false);
                } else {
                    C87412m.m108603p("mGlobalFavFragment");
                    throw null;
                }
            }
        } else if (intValue == 13) {
            FavFinderFilterUI favFinderFilterUI4 = this.f270264d;
            int i4 = FavFinderFilterUI.f269710o;
            List<Integer> e3 = favFinderFilterUI4.mo128270H7().mo139185e3();
            Log.m105924i("MicroMsg.FavFinderFilterUI", "[CONTEXT_OPERATE_BATCH_DELETE_SUCCESS] removeItemsAndRefresh indexs = " + e3);
            C97951d dVar2 = this.f270264d.f269713f;
            if (dVar2 != null) {
                dVar2.mo79144w(e3);
                C99830c H7 = this.f270264d.mo128270H7();
                Log.m105924i("MicroMsg.FavFinderFilterUI", "[clearAllSelectFavItemInfo] clear all select favItemInfos");
                H7.f292530d.clear();
                H7.f292531e.clear();
                this.f270264d.mo128271I7().mo139191c3();
                this.f270264d.mo128272J7().mo139196c3(6, false);
            } else {
                C87412m.m108603p("mGlobalFavFragment");
                throw null;
            }
        } else if (intValue == 15) {
            FavFinderFilterUI favFinderFilterUI5 = this.f270264d;
            int i5 = FavFinderFilterUI.f269710o;
            List<Integer> e35 = favFinderFilterUI5.mo128270H7().mo139185e3();
            StringBuilder sb = new StringBuilder();
            sb.append("[CONTEXT_OPERATE_MORE_STATE_ENTER] enterMultiSelectType selectIndexList size = ");
            ArrayList arrayList2 = (ArrayList) e35;
            sb.append(arrayList2.size());
            Log.m105924i("MicroMsg.FavFinderFilterUI", sb.toString());
            C97951d dVar3 = this.f270264d.f269713f;
            if (dVar3 != null) {
                dVar3.mo79139G(((Number) arrayList2.get(0)).intValue());
            } else {
                C87412m.m108603p("mGlobalFavFragment");
                throw null;
            }
        } else if (intValue == 16) {
            Log.m105924i("MicroMsg.FavFinderFilterUI", "[CONTEXT_OPERATE_MORE_STATE_EXIT] exitMultiSelectType");
            C97951d dVar4 = this.f270264d.f269713f;
            if (dVar4 != null) {
                dVar4.mo79143q();
                C99830c H72 = this.f270264d.mo128270H7();
                Log.m105924i("MicroMsg.FavFinderFilterUI", "[clearAllSelectFavItemInfo] clear all select favItemInfos");
                H72.f292530d.clear();
                H72.f292531e.clear();
            } else {
                C87412m.m108603p("mGlobalFavFragment");
                throw null;
            }
        }
        return C13598b0.f38549a;
    }
}
