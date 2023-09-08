package iy1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.game.luggage.p801ui.circle.PostCommentDialogUI;
import nj3.C11182m0;
import nj3.C76874e0;
import p385u2.C111105a;

/* renamed from: iy1.n */
public final class C46387n implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ PostCommentDialogUI f124983d;

    /* renamed from: e */
    public final /* synthetic */ String f124984e;

    public C46387n(PostCommentDialogUI postCommentDialogUI, String str) {
        this.f124983d = postCommentDialogUI;
        this.f124984e = str;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.mo107140d(1001, C111105a.m151500b(this.f124983d, C0966R.color.a_0), this.f124984e);
    }
}
