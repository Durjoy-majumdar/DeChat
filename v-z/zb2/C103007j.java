package zb2;

import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import com.tencent.p014mm.sdk.event.pending.IPendingEvent;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import zb2.C103001d;

/* renamed from: zb2.j */
public final class C103007j<T extends C103001d<T>> implements IPendingEvent {

    /* renamed from: a */
    public List<? extends T> f303953a;

    /* renamed from: b */
    public final int f303954b;

    /* renamed from: c */
    public List<C102999b> f303955c;

    /* renamed from: d */
    public List<? extends MvvmList.C94267d> f303956d;

    /* renamed from: e */
    public int f303957e;

    public C103007j(List<? extends T> list, int i, List<C102999b> list2, List<? extends MvvmList.C94267d> list3, int i2) {
        C87412m.m108594g(list, "latestList");
        C87412m.m108594g(list2, "diffActionList");
        C87412m.m108594g(list3, "submitTypeList");
        this.f303953a = list;
        this.f303954b = i;
        this.f303955c = list2;
        this.f303956d = list3;
        this.f303957e = i2;
    }

    public String getKey() {
        return "MvvmListPendingData";
    }

    public IPendingEvent mergeEvent(IPendingEvent iPendingEvent) {
        C87412m.m108594g(iPendingEvent, "newEvent");
        C103007j jVar = (C103007j) iPendingEvent;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f303956d);
        arrayList.addAll(jVar.f303956d);
        return new C103007j(jVar.f303953a, jVar.f303954b, jVar.f303955c, arrayList, this.f303957e + 1);
    }
}
