package ig2;

import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.readerapp.p092ui.ReaderAppUI;
import ke3.C88144b;
import nj3.C76874e0;
import nj3.C76891l0;

/* renamed from: ig2.c */
public class C76358c implements C76891l0 {

    /* renamed from: a */
    public final /* synthetic */ boolean f223627a;

    /* renamed from: b */
    public final /* synthetic */ ReaderAppUI f223628b;

    public C76358c(ReaderAppUI readerAppUI, boolean z) {
        this.f223628b = readerAppUI;
        this.f223627a = z;
    }

    /* renamed from: a */
    public void mo71744a(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        int intValue = ((Integer) view.getTag()).intValue();
        e0Var.clear();
        ReaderAppUI readerAppUI = this.f223628b;
        if (20 == readerAppUI.f203393h) {
            if (this.f223627a) {
                e0Var.mo107136c(intValue, 0, 1, readerAppUI.getResources().getString(C0966R.string.hrq), C0966R.raw.icons_filled_share);
            }
            C88144b.m109788f("favorite");
            e0Var.mo107136c(intValue, 1, 2, this.f223628b.getResources().getString(C0966R.string.f361137hk2), C0966R.raw.icons_filled_favorites);
            this.f223628b.f203398p = ((Integer) view.getTag(C0966R.C0970id.idn)).intValue();
        }
        e0Var.mo107136c(intValue, 2, 3, this.f223628b.getResources().getString(C0966R.string.hrp), C0966R.raw.icons_filled_delete);
    }
}
