package yz2;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.textstatus.p112ui.StatusAlbumUI;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import gy3.C87412m;
import kg3.C76577a;

/* renamed from: yz2.w */
public final class C53724w extends RecyclerView.C0129l {

    /* renamed from: d */
    public final /* synthetic */ StatusAlbumUI f150837d;

    public C53724w(StatusAlbumUI statusAlbumUI) {
        this.f150837d = statusAlbumUI;
    }

    /* renamed from: f */
    public void mo121f(Rect rect, int i, RecyclerView recyclerView) {
        C87412m.m108594g(rect, "outRect");
        C87412m.m108594g(recyclerView, "parent");
        WxRecyclerView wxRecyclerView = this.f150837d.f116884e;
        if (wxRecyclerView != null) {
            RecyclerView.C16613e adapter = wxRecyclerView.getAdapter();
            if (i == (adapter != null ? adapter.getItemCount() : 1) - 1) {
                rect.bottom = C76577a.m92151b(this.f150837d.getContext(), 16);
            } else {
                rect.bottom = C76577a.m92151b(this.f150837d.getContext(), 8);
            }
        } else {
            C87412m.m108603p("rvSelfHistory");
            throw null;
        }
    }
}
