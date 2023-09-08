package uc1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import ei3.C86522b;
import er1.C7888v2;
import fy3.C32226l;
import gy3.C87412m;
import ht1.C60151b;
import ht1.C60186m4;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p749xh.C66261f3;
import rx3.C13598b0;
import sx3.C36907w;
import te3.C64350ew2;
import te3.C64378fw2;
import te3.C64623p81;
import te3.C64628pk1;
import te3.C64682rk1;

@C86522b
/* renamed from: uc1.s */
public final class C65324s extends C86301e implements C60186m4 {
    /* renamed from: DC */
    public C68070l.C68072b mo85185DC(C64682rk1 rk12) {
        C87412m.m108594g(rk12, "finderShareObject");
        return C7888v2.f26513a.mo9008f(rk12);
    }

    /* renamed from: PP */
    public C68070l.C68072b mo85186PP(FinderObject finderObject) {
        C87412m.m108594g(finderObject, C66261f3.COL_FINDEROBJECT);
        FinderItem a = FinderItem.Companion.mo79056a(finderObject, 1);
        C7888v2.C7889a aVar = C7888v2.f26513a;
        C64623p81 finderLive = a.getFinderLive();
        aVar.getClass();
        C87412m.m108594g(finderLive, "finderLiveShareObject");
        C68070l.C68072b bVar = new C68070l.C68072b();
        C60151b bVar2 = new C60151b();
        bVar2.f171698b = finderLive;
        bVar.mo93545f(bVar2);
        bVar.f195582i = 63;
        bVar.f195570f = MMApplicationContext.getContext().getString(C0966R.string.ge7);
        bVar.f195586j = MMApplicationContext.getContext().getString(C0966R.string.ge8);
        return bVar;
    }

    /* renamed from: Yk */
    public int mo85187Yk() {
        return 1001;
    }

    /* renamed from: lR */
    public void mo85188lR(AppCompatActivity appCompatActivity, FinderObject finderObject, Bundle bundle, int i, C32226l<? super List<String>, C13598b0> lVar) {
        C87412m.m108594g(appCompatActivity, "context");
        C87412m.m108594g(finderObject, C66261f3.COL_FINDEROBJECT);
        C7888v2.f26513a.mo9020s(appCompatActivity, FinderItem.Companion.mo79056a(finderObject, 1), bundle, i, lVar);
    }

    /* renamed from: yN */
    public C68070l.C68072b mo85189yN(C64378fw2 fw22) {
        C87412m.m108594g(fw22, "megaObject");
        C7888v2.C7889a aVar = C7888v2.f26513a;
        aVar.getClass();
        Log.m105924i(C7888v2.C7889a.f26515b, "getFinderShareObject from megaVideo");
        C64682rk1 rk12 = new C64682rk1();
        rk12.f185183d = fw22.f183241d;
        rk12.f185191o = fw22.f183248n;
        rk12.f185185f = fw22.f183243f;
        rk12.f185184e = fw22.f183242e;
        rk12.f185187h = fw22.f183245h;
        rk12.f185186g = fw22.f183244g;
        rk12.f185193q = fw22.f183249o;
        rk12.f185194r = fw22.f183250p;
        rk12.f185188i = 11111;
        rk12.f185189j = fw22.f183247j.size();
        LinkedList<C64628pk1> linkedList = rk12.f185190n;
        LinkedList<C64350ew2> linkedList2 = fw22.f183247j;
        C87412m.m108593f(linkedList2, "megaObject.mediaList");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList2, 10));
        for (C64350ew2 ew22 : linkedList2) {
            C64628pk1 pk12 = new C64628pk1();
            pk12.f184826d = 4;
            pk12.f184827e = ew22.f183039d;
            pk12.f184828f = ew22.f183040e;
            pk12.f184832j = ew22.f183043h;
            pk12.f184829g = ew22.f183041f;
            pk12.f184830h = ew22.f183042g;
            pk12.f184831i = ew22.f183044i;
            arrayList.add(pk12);
        }
        linkedList.addAll(arrayList);
        return aVar.mo9008f(rk12);
    }
}
