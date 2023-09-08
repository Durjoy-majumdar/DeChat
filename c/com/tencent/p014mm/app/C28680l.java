package com.tencent.p014mm.app;

import android.content.Context;
import bp3.C28361q;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.support.feature_service.ServiceNotFoundException;
import di3.C31195h;
import di3.C7335d;
import di3.C86301e;
import ei3.C31607a;
import java.util.ArrayList;
import java.util.List;
import p261wl.C38166b;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.app.l */
public class C28680l extends C31195h {

    /* renamed from: e */
    public static final C28361q<C28680l> f78663e = new C28681a();

    /* renamed from: d */
    public final Context f78664d = MMApplicationContext.getContext();

    /* renamed from: com.tencent.mm.app.l$a */
    public class C28681a extends C28361q<C28680l> {
        public Object create() {
            return new C28680l();
        }
    }

    /* renamed from: a */
    public List<C38174i<C86301e>> mo56271a(C31607a aVar) {
        C38166b.C38167a aVar2 = (C38166b.C38167a) C38166b.m41759f(C86301e.class);
        ArrayList arrayList = new ArrayList();
        C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar2, aVar2.f100837d.all().iterator());
        while (bVar.hasNext()) {
            C38174i iVar = (C38174i) bVar.next();
            if (iVar.hasKey(aVar)) {
                arrayList.add(iVar);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public <T extends C7335d> T mo56272b(Class<T> cls) {
        C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(cls);
        ArrayList arrayList = new ArrayList();
        C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
        while (bVar.hasNext()) {
            arrayList.add((C38174i) bVar.next());
        }
        if (arrayList.isEmpty()) {
            throw new ServiceNotFoundException("No FeatureService with api class '" + cls.getName() + "' register on current process.");
        } else if (arrayList.size() <= 1) {
            return (C7335d) ((C38174i) arrayList.get(0)).get();
        } else {
            throw new ServiceNotFoundException("More than one FeatureService implement '" + cls.getName() + "' on current process: " + arrayList);
        }
    }
}
