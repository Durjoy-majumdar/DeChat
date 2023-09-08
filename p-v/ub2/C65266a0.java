package ub2;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvCommentView;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: ub2.a0 */
public final class C65266a0 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ MusicMvCommentView f187888d;

    /* renamed from: e */
    public final /* synthetic */ boolean f187889e;

    public C65266a0(MusicMvCommentView musicMvCommentView, boolean z) {
        this.f187888d = musicMvCommentView;
        this.f187889e = z;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        if (e0Var.mo107176v()) {
            e0Var.mo107144g(1, this.f187888d.getContext().getString(C0966R.string.h2j), 0);
            if (!this.f187889e) {
                e0Var.mo107144g(2, this.f187888d.getContext().getString(C0966R.string.h2l), 0);
            }
        }
    }
}
