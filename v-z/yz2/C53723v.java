package yz2;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.textstatus.p112ui.StatusAlbumUI;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import gy3.C87412m;
import jq3.C60906r;
import jq3.C60907t;
import jq3.C9493c;
import vz2.C78501d;

/* renamed from: yz2.v */
public final class C53723v implements C60907t {

    /* renamed from: a */
    public final /* synthetic */ WxRecyclerAdapter<C9493c> f150835a;

    /* renamed from: b */
    public final /* synthetic */ StatusAlbumUI f150836b;

    public C53723v(WxRecyclerAdapter<C9493c> wxRecyclerAdapter, StatusAlbumUI statusAlbumUI) {
        this.f150835a = wxRecyclerAdapter;
        this.f150836b = statusAlbumUI;
    }

    /* renamed from: a */
    public void mo2587a(RecyclerView recyclerView, C60906r rVar) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(rVar, "data");
        if (rVar.f173509e >= this.f150835a.getItemCount() - 1 && !this.f150836b.f116887h) {
            C78501d.m94805g(C78501d.f229945a, 14, (String) null, (String) null, 0, (String) null, 0, 62, (Object) null);
            this.f150836b.f116887h = true;
        }
    }
}
