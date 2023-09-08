package com.tencent.p014mm.plugin.ringtone.widget.p803at;

import ac2.C39534d;
import ac2.C53997b;
import ac2.C53998c;
import ac2.C54000f;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.plugin.mvvmlist.MMSearchLiveList;
import fk2.C59134f;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import sx3.C36907w;
import sx3.C77813z;
import zb2.C53769h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BQ\u0012$\u0010\u0007\u001a \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, mo182094d2 = {"Lcom/tencent/mm/plugin/ringtone/widget/at/RingtoneAtSomeoneLiveList;", "Lcom/tencent/mm/plugin/mvvmlist/MMSearchLiveList;", "Lfk2/f;", "", "Lac2/f;", "Lac2/c;", "Lac2/d;", "dataSource", "Lac2/b;", "searchDataSource", "Lzb2/h;", "config", "Landroidx/lifecycle/s;", "lifecycleOwner", "<init>", "(Lac2/f;Lac2/b;Lzb2/h;Landroidx/lifecycle/s;)V", "plugin-ringtone_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.ringtone.widget.at.RingtoneAtSomeoneLiveList */
public final class RingtoneAtSomeoneLiveList extends MMSearchLiveList<C59134f, String> {

    /* renamed from: z */
    public final ArrayList<String> f164181z = new ArrayList<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RingtoneAtSomeoneLiveList(C54000f<C59134f, C53998c<C59134f>, C39534d<C59134f>> fVar, C53997b<C59134f, String> bVar, C53769h hVar, C0125s sVar) {
        super(fVar, bVar, hVar, sVar);
        C87412m.m108594g(fVar, "dataSource");
        C87412m.m108594g(bVar, "searchDataSource");
        C87412m.m108594g(hVar, "config");
        C87412m.m108594g(sVar, "lifecycleOwner");
    }

    /* renamed from: b */
    public String mo5660b() {
        return "MicroMsg.Mvvm.AtSomeoneLiveList";
    }

    /* renamed from: d */
    public List<C59134f> mo5661d(List<C59134f> list) {
        C87412m.m108594g(list, "snapshotList");
        C77813z.m93908n(list);
        this.f164181z.clear();
        this.f164181z.add("🔍");
        String str = "";
        for (C59134f fVar : list) {
            if (fVar.f169133f != 2) {
                fVar.f169135h = false;
            } else if (!C87412m.m108589b(fVar.f169137j, str)) {
                fVar.f169135h = true;
                str = fVar.f169137j;
                this.f164181z.add(str);
            } else {
                fVar.f169135h = false;
            }
        }
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        for (C59134f a : list) {
            arrayList.add((C59134f) a.mo90777Ow());
        }
        return arrayList;
    }
}
