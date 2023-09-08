package ub2;

import androidx.recyclerview.widget.C54248l;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvCommentView;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import gy3.C87412m;
import java.util.ArrayList;
import sx3.C110818d0;

/* renamed from: ub2.j0 */
public final class C65293j0 extends C54248l.C54250b {

    /* renamed from: a */
    public final /* synthetic */ MusicMvCommentView f187950a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList<MusicMvCommentView.C57091a> f187951b;

    public C65293j0(MusicMvCommentView musicMvCommentView, ArrayList<MusicMvCommentView.C57091a> arrayList) {
        this.f187950a = musicMvCommentView;
        this.f187951b = arrayList;
    }

    /* renamed from: a */
    public boolean mo11465a(int i, int i2) {
        WxRecyclerAdapter<MusicMvCommentView.C57091a> wxRecyclerAdapter = this.f187950a.f163542e;
        if (wxRecyclerAdapter != null) {
            return C87412m.m108589b(C110818d0.m150917O(wxRecyclerAdapter.getData(), i), C110818d0.m150917O(this.f187951b, i2));
        }
        C87412m.m108603p("adapter");
        throw null;
    }

    /* renamed from: b */
    public boolean mo11466b(int i, int i2) {
        WxRecyclerAdapter<MusicMvCommentView.C57091a> wxRecyclerAdapter = this.f187950a.f163542e;
        if (wxRecyclerAdapter != null) {
            return C87412m.m108589b(C110818d0.m150917O(wxRecyclerAdapter.getData(), i), C110818d0.m150917O(this.f187951b, i2));
        }
        C87412m.m108603p("adapter");
        throw null;
    }

    /* renamed from: d */
    public int mo11468d() {
        return this.f187951b.size();
    }

    /* renamed from: e */
    public int mo11469e() {
        WxRecyclerAdapter<MusicMvCommentView.C57091a> wxRecyclerAdapter = this.f187950a.f163542e;
        if (wxRecyclerAdapter != null) {
            return wxRecyclerAdapter.getData().size();
        }
        C87412m.m108603p("adapter");
        throw null;
    }
}
