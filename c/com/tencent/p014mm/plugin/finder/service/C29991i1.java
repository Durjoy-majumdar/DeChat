package com.tencent.p014mm.plugin.finder.service;

import android.database.Cursor;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MStorage;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import fy3.C32224a;
import gy3.C87413o;
import ht1.C60197r4;
import java.util.ArrayList;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import up1.C37552n0;
import up1.C37553o0;

@C86522b
/* renamed from: com.tencent.mm.plugin.finder.service.i1 */
public final class C29991i1 extends C86301e implements C60197r4 {

    /* renamed from: d */
    public final C13601g f81188d = C36568h.m40985a(C29992a.f81189d);

    /* renamed from: com.tencent.mm.plugin.finder.service.i1$a */
    public static final class C29992a extends C87413o implements C32224a<C37553o0> {

        /* renamed from: d */
        public static final C29992a f81189d = new C29992a();

        public C29992a() {
            super(0);
        }

        public Object invoke() {
            return ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Px0();
        }
    }

    /* renamed from: g */
    public void mo57051g(MStorage.IOnStorageChange iOnStorageChange) {
        if (iOnStorageChange != null) {
            ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Px0().remove(iOnStorageChange);
        }
    }

    /* renamed from: i */
    public void mo57052i(MStorage.IOnStorageChange iOnStorageChange) {
        if (iOnStorageChange != null) {
            ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Px0().add(iOnStorageChange);
        }
    }

    public void ix0(C60197r4.C33072a aVar) {
        ArrayList arrayList = new ArrayList();
        C37553o0 o0Var = (C37553o0) ((C36570n) this.f81188d).getValue();
        o0Var.getClass();
        ArrayList<C37552n0> arrayList2 = new ArrayList<>();
        Cursor rawQuery = o0Var.f99610d.rawQuery("select * from FinderSnsKeyWordsJumpConfig", (String[]) null);
        if (rawQuery != null) {
            while (rawQuery.moveToNext()) {
                C37552n0 n0Var = new C37552n0();
                n0Var.convertFrom(rawQuery);
                arrayList2.add(n0Var);
            }
            rawQuery.close();
        }
        Log.m105924i("Finder.FinderSnsKeyWordsStorage", "getAllData size:" + arrayList2.size());
        for (C37552n0 n0Var2 : arrayList2) {
            C60197r4.C33073b bVar = new C60197r4.C33073b(n0Var2.field_localId);
            bVar.f89797b = n0Var2.field_startTime;
            bVar.f89798c = n0Var2.field_endTime;
            bVar.f89799d = n0Var2.field_keyWord;
            bVar.f89800e = n0Var2.field_passByInfo;
            arrayList.add(bVar);
        }
        Log.m105924i("FinderSnsKeyWordsService", "dataList " + arrayList + ", size:" + arrayList.size());
        if (aVar != null) {
            aVar.onDone(arrayList);
        }
    }
}
