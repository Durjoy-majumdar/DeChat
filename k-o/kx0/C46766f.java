package kx0;

import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import nj3.C76874e0;

/* renamed from: kx0.f */
public final class C46766f implements View.OnCreateContextMenuListener {

    /* renamed from: d */
    public final /* synthetic */ C46754a f125871d;

    public C46766f(C46754a aVar) {
        this.f125871d = aVar;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C87412m.m108592e(contextMenu, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenu");
        C76874e0 e0Var = (C76874e0) contextMenu;
        contextMenu.add(0, 1, 0, this.f125871d.getContext().getString(C0966R.string.ddq));
    }
}
