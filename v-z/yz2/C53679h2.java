package yz2;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusHistoryUI;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import gy3.C87412m;
import jq3.C60906r;
import jq3.C60907t;
import jq3.C9493c;
import vz2.C78501d;

/* renamed from: yz2.h2 */
public final class C53679h2 implements C60907t {

    /* renamed from: a */
    public final /* synthetic */ WxRecyclerAdapter<C9493c> f150756a;

    /* renamed from: b */
    public final /* synthetic */ TextStatusHistoryUI f150757b;

    public C53679h2(WxRecyclerAdapter<C9493c> wxRecyclerAdapter, TextStatusHistoryUI textStatusHistoryUI) {
        this.f150756a = wxRecyclerAdapter;
        this.f150757b = textStatusHistoryUI;
    }

    /* renamed from: a */
    public void mo2587a(RecyclerView recyclerView, C60906r rVar) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(rVar, "data");
        if (rVar.f173509e >= this.f150756a.getItemCount() - 1 && !this.f150757b.f116928h) {
            C78501d.m94805g(C78501d.f229945a, 14, (String) null, (String) null, 0, (String) null, 0, 62, (Object) null);
            this.f150757b.f116928h = true;
        }
    }
}
