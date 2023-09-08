package com.tencent.p014mm.p136ui.contact.address;

import ac2.C39534d;
import ac2.C53998c;
import ac2.C54000f;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import fl3.C59252d;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import sx3.C36907w;
import sx3.C77813z;
import zb2.C53769h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\u0012$\u0010\u0006\u001a \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, mo182094d2 = {"Lcom/tencent/mm/ui/contact/address/AddressLiveList;", "Lcom/tencent/mm/plugin/mvvmlist/MvvmList;", "Lfl3/d;", "Lac2/f;", "Lac2/c;", "Lac2/d;", "dataSource", "Lzb2/h;", "config", "Landroidx/lifecycle/s;", "lifecycleOwner", "<init>", "(Lac2/f;Lzb2/h;Landroidx/lifecycle/s;)V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.contact.address.AddressLiveList */
public final class AddressLiveList extends MvvmList<C59252d> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressLiveList(C54000f<C59252d, C53998c<C59252d>, C39534d<C59252d>> fVar, C53769h hVar, C0125s sVar) {
        super(fVar, hVar, sVar, (LifecycleScope) null, (List) null, 24, (C8480h) null);
        C87412m.m108594g(fVar, "dataSource");
        C87412m.m108594g(hVar, "config");
        C87412m.m108594g(sVar, "lifecycleOwner");
    }

    /* renamed from: b */
    public String mo5660b() {
        return "MicroMsg.Mvvm.AddressLiveList";
    }

    /* renamed from: d */
    public List<C59252d> mo5661d(List<C59252d> list) {
        C87412m.m108594g(list, "snapshotList");
        C77813z.m93908n(list);
        String str = "";
        for (C59252d dVar : list) {
            int i = dVar.f169417e;
            if (i == 2 || i == 1) {
                String str2 = dVar.f169420h;
                if (!C87412m.m108589b(str2, str)) {
                    dVar.f169419g = true;
                    str = str2;
                } else {
                    dVar.f169419g = false;
                }
            } else {
                dVar.f169419g = false;
            }
        }
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        for (C59252d a : list) {
            arrayList.add((C59252d) a.mo90777Ow());
        }
        return arrayList;
    }
}
