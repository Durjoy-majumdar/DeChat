package p226rg;

import com.tencent.p014mm.C0966R;
import ke3.C88144b;
import nj3.C11182m0;
import nj3.C76874e0;
import rx3.C36570n;

/* renamed from: rg.g */
public final class C12995g implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C63417i f37053d;

    public C12995g(C63417i iVar) {
        this.f37053d = iVar;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.clear();
        e0Var.mo107146h(0, this.f37053d.getString(C0966R.string.i4e), C0966R.raw.icons_filled_share, this.f37053d.getActivity().getResources().getColor(C0966R.color.f2939n));
        if (((Number) ((C36570n) this.f37053d.f179904d).getValue()).intValue() != 5) {
            C88144b.m109788f("favorite");
            e0Var.mo107146h(2, this.f37053d.getString(C0966R.string.f361137hk2), C0966R.raw.bottomsheet_icon_fav, 0);
        }
    }
}
