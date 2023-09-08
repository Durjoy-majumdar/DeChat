package kf1;

import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.C0966R;

/* renamed from: kf1.z6 */
public final class C46719z6 implements View.OnCreateContextMenuListener {

    /* renamed from: d */
    public final /* synthetic */ C46697b7 f125770d;

    public C46719z6(C46697b7 b7Var) {
        this.f125770d = b7Var;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 10002, 0, this.f125770d.f125715d.getString(C0966R.string.eh_));
    }
}
