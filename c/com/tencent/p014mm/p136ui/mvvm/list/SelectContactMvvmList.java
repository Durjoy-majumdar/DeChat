package com.tencent.p014mm.p136ui.mvvm.list;

import ac2.C39534d;
import ac2.C53998c;
import ac2.C54000f;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import om3.C77020b;
import sx3.C110818d0;
import sx3.C36907w;
import sx3.C64197v;
import sx3.C77813z;
import zb2.C53769h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\u0012$\u0010\u0006\u001a \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, mo182094d2 = {"Lcom/tencent/mm/ui/mvvm/list/SelectContactMvvmList;", "Lcom/tencent/mm/plugin/mvvmlist/MvvmList;", "Lom3/b;", "Lac2/f;", "Lac2/c;", "Lac2/d;", "dataSource", "Lzb2/h;", "config", "Landroidx/lifecycle/s;", "lifecycleOwner", "<init>", "(Lac2/f;Lzb2/h;Landroidx/lifecycle/s;)V", "ui-selectcontact_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.mvvm.list.SelectContactMvvmList */
public final class SelectContactMvvmList extends MvvmList<C77020b> {

    /* renamed from: x */
    public final ArrayList<String> f219927x = new ArrayList<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectContactMvvmList(C54000f<C77020b, C53998c<C77020b>, C39534d<C77020b>> fVar, C53769h hVar, C0125s sVar) {
        super(fVar, hVar, sVar, (LifecycleScope) null, (List) null, 24, (C8480h) null);
        C87412m.m108594g(fVar, "dataSource");
        C87412m.m108594g(hVar, "config");
        C87412m.m108594g(sVar, "lifecycleOwner");
    }

    /* renamed from: b */
    public String mo5660b() {
        return "MicroMsg.SelectContactLiveList";
    }

    /* renamed from: d */
    public List<C77020b> mo5661d(List<C77020b> list) {
        C87412m.m108594g(list, "snapshotList");
        C77813z.m93908n(list);
        this.f219927x.clear();
        this.f219927x.add("🔍");
        String str = "";
        int i = 0;
        for (T next : list) {
            int i2 = i + 1;
            if (i >= 0) {
                C77020b bVar = (C77020b) next;
                int i3 = bVar.f225006e;
                if (i3 == 30 || i3 == 20) {
                    String str2 = bVar.f225013o;
                    if (!C87412m.m108589b(str2, str)) {
                        bVar.f225012n = true;
                        this.f219927x.add(str2);
                        str = str2;
                    } else {
                        bVar.f225012n = false;
                    }
                }
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        int i4 = 0;
        for (T next2 : list) {
            int i5 = i4 + 1;
            if (i4 >= 0) {
                C77020b bVar2 = (C77020b) next2;
                C77020b bVar3 = (C77020b) C110818d0.m150917O(list, i5);
                if (bVar3 != null && bVar3.f225012n) {
                    C77020b bVar4 = (C77020b) C110818d0.m150917O(list, i4);
                    if (bVar4 != null) {
                        bVar4.f225015q = false;
                    }
                } else {
                    C77020b bVar5 = (C77020b) C110818d0.m150917O(list, i4);
                    if (bVar5 != null) {
                        bVar5.f225015q = i4 != list.size() - 1;
                    }
                }
                i4 = i5;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        for (C77020b a : list) {
            arrayList.add((C77020b) a.mo90777Ow());
        }
        return arrayList;
    }
}
