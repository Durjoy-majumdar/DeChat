package com.tencent.matrix.batterycanary.stats.p1183ui;

import com.tencent.matrix.batterycanary.stats.BatteryRecord;
import com.tencent.matrix.batterycanary.stats.C114559a;
import com.tencent.matrix.batterycanary.stats.C114572i;
import com.tencent.matrix.batterycanary.stats.p1183ui.BatteryStatsAdapter;
import com.tencent.matrix.batterycanary.stats.p1183ui.C114595c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p1196he.C117079a;
import p981ie.C87705i;

/* renamed from: com.tencent.matrix.batterycanary.stats.ui.b */
public class C114594b implements C87705i<C114572i> {

    /* renamed from: a */
    public final /* synthetic */ int f343426a;

    /* renamed from: b */
    public final /* synthetic */ C114595c f343427b;

    public C114594b(C114595c cVar, int i) {
        this.f343427b = cVar;
        this.f343426a = i;
    }

    public void accept(Object obj) {
        List<BatteryRecord> list;
        C114572i iVar = (C114572i) obj;
        int i = this.f343426a;
        String str = this.f343427b.f343432e;
        if (iVar.f343366d != null) {
            list = ((C114559a.C114560a) iVar.f343366d).mo173738c(C114559a.C114560a.m161173a(i), str);
        } else {
            list = Collections.emptyList();
        }
        C114595c.C114596a aVar = this.f343427b.f343433f;
        if (aVar != null) {
            list = aVar.mo173757a(list);
        }
        String a = C114559a.C114560a.m161173a(this.f343426a);
        C114595c cVar = this.f343427b;
        cVar.getClass();
        ArrayList arrayList = new ArrayList(list.size() + 1);
        if (list.isEmpty()) {
            BatteryStatsAdapter.Item.C114580b bVar = new BatteryStatsAdapter.Item.C114580b();
            bVar.f343390d = "NO DATA";
            arrayList.add(0, bVar);
        } else {
            for (BatteryRecord c : list) {
                arrayList.add(0, cVar.mo173756c(c));
            }
        }
        BatteryStatsAdapter.Item.C114579a aVar2 = new BatteryStatsAdapter.Item.C114579a();
        aVar2.f343389d = a;
        arrayList.add(0, aVar2);
        if (Math.abs(cVar.f343431d) >= cVar.f343429b) {
            BatteryStatsAdapter.Item.C114579a aVar3 = new BatteryStatsAdapter.Item.C114579a();
            aVar3.f343389d = "END";
            arrayList.add(aVar3);
            BatteryStatsAdapter.Item.C114580b bVar2 = new BatteryStatsAdapter.Item.C114580b();
            bVar2.f343390d = "Only keep last " + cVar.f343429b + " days' data";
            arrayList.add(bVar2);
        }
        cVar.f343430c.post(new C117079a(cVar, arrayList));
    }
}
