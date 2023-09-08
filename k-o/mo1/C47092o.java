package mo1;

import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileDraftUIC;

/* renamed from: mo1.o */
public final class C47092o implements View.OnCreateContextMenuListener {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileDraftUIC f126538d;

    public C47092o(FinderProfileDraftUIC finderProfileDraftUIC) {
        this.f126538d = finderProfileDraftUIC;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1001, 0, this.f126538d.getString(C0966R.string.d6d));
    }
}
