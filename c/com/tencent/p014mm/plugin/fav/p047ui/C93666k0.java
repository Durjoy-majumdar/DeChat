package com.tencent.p014mm.plugin.fav.p047ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p749xh.C102666r2;
import pb1.C100718j1;
import pb1.C100734q;
import pb1.C100755z;
import pb1.C11883v0;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C13604l;
import rx3.C36568h;
import te3.C64682rk1;
import wc3.C102429k;
import xb1.C102614d;

/* renamed from: com.tencent.mm.plugin.fav.ui.k0 */
public final class C93666k0 {

    /* renamed from: c */
    public static final C93668b f270444c = new C93668b((C8480h) null);

    /* renamed from: d */
    public static final C13601g<C93666k0> f270445d = C36568h.m40986b(C13602i.SYNCHRONIZED, C93667a.f270448d);

    /* renamed from: a */
    public final ArrayList<C100755z> f270446a = new ArrayList<>();

    /* renamed from: b */
    public final ArrayList<Long> f270447b = new ArrayList<>();

    /* renamed from: com.tencent.mm.plugin.fav.ui.k0$a */
    public static final class C93667a extends C87413o implements C32224a<C93666k0> {

        /* renamed from: d */
        public static final C93667a f270448d = new C93667a();

        public C93667a() {
            super(0);
        }

        public Object invoke() {
            return new C93666k0();
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.k0$b */
    public static final class C93668b {
        public C93668b(C8480h hVar) {
        }

        /* renamed from: a */
        public final C93666k0 mo128591a() {
            return C93666k0.f270445d.getValue();
        }
    }

    /* renamed from: a */
    public final boolean mo128588a(int i) {
        if (i < 0) {
            Log.m105920e("MicroMsg.FavFinderStorage", "[checkPosition] position error < 0 , position = " + i);
            return false;
        } else if (i >= this.f270446a.size()) {
            Log.m105920e("MicroMsg.FavFinderStorage", "[checkPosition] position error >= favItemInfos size, position = " + i);
            return false;
        } else if (i < this.f270447b.size()) {
            return true;
        } else {
            Log.m105920e("MicroMsg.FavFinderStorage", "[checkPosition] position error >= favIdList size, position = " + i);
            return false;
        }
    }

    /* renamed from: b */
    public final C100755z mo128589b(int i) {
        if (mo128588a(i)) {
            return this.f270446a.get(i);
        }
        Log.m105920e("MicroMsg.FavFinderStorage", "[get] position invalid return");
        return null;
    }

    /* renamed from: c */
    public final C13604l<Boolean, List<C64682rk1>> mo128590c(int i, int i2) {
        boolean z;
        int size = this.f270447b.size() - 1;
        if (i >= size) {
            Log.m105920e("MicroMsg.FavFinderStorage", "[loadData] lastPosition maybe error, lastPosition = " + i + ", favIdList size = " + this.f270447b.size());
            return new C13604l<>(Boolean.FALSE, new ArrayList(1));
        }
        int i3 = i + 1;
        int i4 = i3 + i2;
        if (i4 >= size) {
            i4 = size + 1;
            z = false;
        } else {
            z = true;
        }
        List<Long> subList = this.f270447b.subList(i3, i4);
        C87412m.m108593f(subList, "mFavIdList.subList(start, end)");
        Log.m105924i("MicroMsg.FavFinderStorage", "[loadData] subIdList start = " + i3 + ", end = " + i4 + ", size = " + subList.size());
        HashMap<Long, ArrayList<String>> hashMap = C100734q.f295126a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        new ArrayList();
        ArrayList arrayList3 = new ArrayList(1);
        arrayList3.add(20);
        ArrayList<C100755z> SE = ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).mo142264SE(subList, arrayList2, (Set<Integer>) null, (C11883v0) null, C102429k.m135145a(arrayList3));
        if (SE != null && SE.size() > 0) {
            arrayList.addAll(SE);
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList4.add((C100755z) ((C102666r2) it.next()));
        }
        Log.m105924i("MicroMsg.FavFinderStorage", "[loadData] favItemInfos size = " + arrayList4.size());
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            C100755z zVar = (C100755z) it4.next();
            Log.m105924i("MicroMsg.FavFinderStorage", "[loadData] favItemInfo.id = " + zVar.field_localId + ", favItemInfo.type = " + zVar.field_type + ", favItemInfo.xml = " + zVar.field_xml);
        }
        if (arrayList4.size() == 0) {
            Log.m105920e("MicroMsg.FavFinderStorage", "[loadData] getSearchListByIds maybe error, idList size = " + this.f270447b.size());
            return new C13604l<>(Boolean.FALSE, new ArrayList(1));
        }
        ArrayList arrayList5 = new ArrayList(arrayList4.size());
        ArrayList arrayList6 = new ArrayList(arrayList4.size());
        int size2 = arrayList4.size();
        for (int i5 = 0; i5 < size2; i5++) {
            C100755z zVar2 = (C100755z) arrayList4.get(i5);
            C64682rk1 rk12 = zVar2.field_favProto.f298614M;
            if (rk12 != null) {
                arrayList5.add(rk12);
                arrayList6.add(zVar2);
            } else {
                Log.m105920e("MicroMsg.FavFinderStorage", "[loadData] finderItem = null, localId = " + zVar2.field_localId + ", remove idList content in " + Thread.currentThread().getName());
                this.f270447b.remove(i5);
            }
        }
        this.f270446a.addAll(arrayList6);
        Log.m105924i("MicroMsg.FavFinderStorage", "[loadData] success favItemInfos size = " + this.f270446a.size() + ", finderObjList = " + arrayList5.size() + ", pageSize = " + i2);
        return new C13604l<>(Boolean.valueOf(z), arrayList5);
    }
}
