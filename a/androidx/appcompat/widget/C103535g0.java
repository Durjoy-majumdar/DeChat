package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.view.menu.C103452g;
import androidx.appcompat.widget.Toolbar;

/* renamed from: androidx.appcompat.widget.g0 */
public class C103535g0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Toolbar f305738d;

    public C103535g0(Toolbar toolbar) {
        this.f305738d = toolbar;
    }

    public void onClick(View view) {
        Toolbar.C103514c cVar = this.f305738d.f305651R;
        C103452g gVar = cVar == null ? null : cVar.f305682e;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }
}
