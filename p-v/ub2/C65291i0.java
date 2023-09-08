package ub2;

import androidx.recyclerview.widget.C54258u;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvCommentView;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import gy3.C87412m;
import java.util.ArrayList;

/* renamed from: ub2.i0 */
public final class C65291i0 implements C54258u {

    /* renamed from: a */
    public final /* synthetic */ MusicMvCommentView f187947a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList<MusicMvCommentView.C57091a> f187948b;

    public C65291i0(MusicMvCommentView musicMvCommentView, ArrayList<MusicMvCommentView.C57091a> arrayList) {
        this.f187947a = musicMvCommentView;
        this.f187948b = arrayList;
    }

    /* renamed from: a */
    public void mo2860a(int i, int i2) {
        WxRecyclerAdapter<MusicMvCommentView.C57091a> wxRecyclerAdapter = this.f187947a.f163542e;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.getData().clear();
            WxRecyclerAdapter<MusicMvCommentView.C57091a> wxRecyclerAdapter2 = this.f187947a.f163542e;
            if (wxRecyclerAdapter2 != null) {
                wxRecyclerAdapter2.getData().addAll(this.f187948b);
                WxRecyclerAdapter<MusicMvCommentView.C57091a> wxRecyclerAdapter3 = this.f187947a.f163542e;
                if (wxRecyclerAdapter3 != null) {
                    wxRecyclerAdapter3.notifyItemRangeRemoved(i, i2);
                } else {
                    C87412m.m108603p("adapter");
                    throw null;
                }
            } else {
                C87412m.m108603p("adapter");
                throw null;
            }
        } else {
            C87412m.m108603p("adapter");
            throw null;
        }
    }

    /* renamed from: b */
    public void mo2861b(int i, int i2) {
        WxRecyclerAdapter<MusicMvCommentView.C57091a> wxRecyclerAdapter = this.f187947a.f163542e;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.getData().clear();
            WxRecyclerAdapter<MusicMvCommentView.C57091a> wxRecyclerAdapter2 = this.f187947a.f163542e;
            if (wxRecyclerAdapter2 != null) {
                wxRecyclerAdapter2.getData().addAll(this.f187948b);
                WxRecyclerAdapter<MusicMvCommentView.C57091a> wxRecyclerAdapter3 = this.f187947a.f163542e;
                if (wxRecyclerAdapter3 != null) {
                    wxRecyclerAdapter3.notifyItemRangeInserted(i, i2);
                } else {
                    C87412m.m108603p("adapter");
                    throw null;
                }
            } else {
                C87412m.m108603p("adapter");
                throw null;
            }
        } else {
            C87412m.m108603p("adapter");
            throw null;
        }
    }

    /* renamed from: c */
    public void mo2862c(int i, int i2, Object obj) {
        WxRecyclerAdapter<MusicMvCommentView.C57091a> wxRecyclerAdapter = this.f187947a.f163542e;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.getData().clear();
            WxRecyclerAdapter<MusicMvCommentView.C57091a> wxRecyclerAdapter2 = this.f187947a.f163542e;
            if (wxRecyclerAdapter2 != null) {
                wxRecyclerAdapter2.getData().addAll(this.f187948b);
                WxRecyclerAdapter<MusicMvCommentView.C57091a> wxRecyclerAdapter3 = this.f187947a.f163542e;
                if (wxRecyclerAdapter3 != null) {
                    wxRecyclerAdapter3.notifyItemRangeChanged(i, i2);
                } else {
                    C87412m.m108603p("adapter");
                    throw null;
                }
            } else {
                C87412m.m108603p("adapter");
                throw null;
            }
        } else {
            C87412m.m108603p("adapter");
            throw null;
        }
    }

    /* renamed from: d */
    public void mo2863d(int i, int i2) {
        WxRecyclerAdapter<MusicMvCommentView.C57091a> wxRecyclerAdapter = this.f187947a.f163542e;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.notifyItemMoved(i, i2);
        } else {
            C87412m.m108603p("adapter");
            throw null;
        }
    }
}
