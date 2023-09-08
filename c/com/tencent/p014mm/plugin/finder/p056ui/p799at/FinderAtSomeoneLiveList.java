package com.tencent.p014mm.plugin.finder.p056ui.p799at;

import ac2.C39534d;
import ac2.C53997b;
import ac2.C53998c;
import ac2.C54000f;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.plugin.mvvmlist.MMSearchLiveList;
import com.tencent.p014mm.sdk.platformtools.Util;
import cq1.C57974g;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import sx3.C36907w;
import sx3.C77813z;
import zb2.C53769h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BQ\u0012$\u0010\u0007\u001a \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/at/FinderAtSomeoneLiveList;", "Lcom/tencent/mm/plugin/mvvmlist/MMSearchLiveList;", "Lcq1/g;", "", "Lac2/f;", "Lac2/c;", "Lac2/d;", "dataSource", "Lac2/b;", "searchDataSource", "Lzb2/h;", "config", "Landroidx/lifecycle/s;", "lifecycleOwner", "<init>", "(Lac2/f;Lac2/b;Lzb2/h;Landroidx/lifecycle/s;)V", "plugin-finder-base_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.at.FinderAtSomeoneLiveList */
public final class FinderAtSomeoneLiveList extends MMSearchLiveList<C57974g, String> {

    /* renamed from: z */
    public final ArrayList<String> f161183z = new ArrayList<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderAtSomeoneLiveList(C54000f<C57974g, C53998c<C57974g>, C39534d<C57974g>> fVar, C53997b<C57974g, String> bVar, C53769h hVar, C0125s sVar) {
        super(fVar, bVar, hVar, sVar);
        C87412m.m108594g(fVar, "dataSource");
        C87412m.m108594g(bVar, "searchDataSource");
        C87412m.m108594g(hVar, "config");
        C87412m.m108594g(sVar, "lifecycleOwner");
    }

    /* renamed from: b */
    public String mo5660b() {
        return "MicroMsg.Mvvm.MvvmList";
    }

    /* renamed from: d */
    public List<C57974g> mo5661d(List<C57974g> list) {
        C87412m.m108594g(list, "snapshotList");
        C77813z.m93908n(list);
        this.f161183z.clear();
        this.f161183z.add("🔍");
        String str = "";
        for (C57974g gVar : list) {
            int i = gVar.f165886f;
            if (i == 1) {
                if (!C87412m.m108589b(gVar.f165891n, str)) {
                    gVar.f165889i = true;
                    str = gVar.f165891n;
                    this.f161183z.add(str);
                } else {
                    gVar.f165889i = false;
                }
            } else if (i != 0) {
                gVar.f165889i = false;
            } else if (Util.isNullOrNil(gVar.f165891n) || C87412m.m108589b(gVar.f165891n, str)) {
                gVar.f165889i = false;
            } else {
                gVar.f165889i = true;
                str = gVar.f165891n;
            }
        }
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        for (C57974g a : list) {
            arrayList.add((C57974g) a.mo90777Ow());
        }
        return arrayList;
    }
}
