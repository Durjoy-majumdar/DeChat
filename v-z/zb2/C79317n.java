package zb2;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import com.tencent.p014mm.view.recyclerview.WxLinearLayoutManager;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import gy3.C87412m;

/* renamed from: zb2.n */
public final class C79317n {
    /* renamed from: a */
    public static final <T extends C103001d<T>> MvvmList<T> m96015a(WxRecyclerView wxRecyclerView) {
        C87412m.m108594g(wxRecyclerView, "<this>");
        C103009m b = m96016b(wxRecyclerView);
        if (b != null) {
            return b.f303959G;
        }
        return null;
    }

    /* renamed from: b */
    public static final <T extends C103001d<T>> C103009m<T> m96016b(WxRecyclerView wxRecyclerView) {
        C87412m.m108594g(wxRecyclerView, "<this>");
        RecyclerView.C16613e adapter = wxRecyclerView.getAdapter();
        if (adapter instanceof C103009m) {
            return (C103009m) adapter;
        }
        return null;
    }

    /* renamed from: c */
    public static final WxLinearLayoutManager m96017c(WxRecyclerView wxRecyclerView) {
        C87412m.m108594g(wxRecyclerView, "<this>");
        RecyclerView.LayoutManager layoutManager = wxRecyclerView.getLayoutManager();
        if (layoutManager instanceof WxLinearLayoutManager) {
            return (WxLinearLayoutManager) layoutManager;
        }
        return null;
    }
}
