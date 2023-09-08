package com.tencent.p014mm.plugin.label.p067ui.searchContact;

import ac2.C39534d;
import ac2.C53998c;
import ac2.C54000f;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import f22.C58909a;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import sx3.C36907w;
import zb2.C53769h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\u0012$\u0010\u0006\u001a \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, mo182094d2 = {"Lcom/tencent/mm/plugin/label/ui/searchContact/ContactDataItemList;", "Lcom/tencent/mm/plugin/mvvmlist/MvvmList;", "Lf22/a;", "Lac2/f;", "Lac2/c;", "Lac2/d;", "dataSource", "Lzb2/h;", "config", "Landroidx/lifecycle/s;", "lifecycleOwner", "<init>", "(Lac2/f;Lzb2/h;Landroidx/lifecycle/s;)V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.label.ui.searchContact.ContactDataItemList */
public final class ContactDataItemList extends MvvmList<C58909a> {

    /* renamed from: x */
    public List<String> f19778x = new ArrayList();

    /* renamed from: y */
    public ArrayList<C58909a> f19779y = new ArrayList<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactDataItemList(C54000f<C58909a, C53998c<C58909a>, C39534d<C58909a>> fVar, C53769h hVar, C0125s sVar) {
        super(fVar, hVar, sVar, (LifecycleScope) null, (List) null, 24, (C8480h) null);
        C87412m.m108594g(fVar, "dataSource");
        C87412m.m108594g(hVar, "config");
        C87412m.m108594g(sVar, "lifecycleOwner");
        new ArrayList();
    }

    /* renamed from: b */
    public String mo5660b() {
        return "MicroMsg.Mvvm.ContactDataItemList";
    }

    /* renamed from: d */
    public List<C58909a> mo5661d(List<C58909a> list) {
        C87412m.m108594g(list, "snapshotList");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        for (C58909a a : list) {
            arrayList.add((C58909a) a.mo90777Ow());
        }
        return arrayList;
    }
}
