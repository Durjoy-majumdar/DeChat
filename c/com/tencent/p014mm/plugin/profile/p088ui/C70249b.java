package com.tencent.p014mm.plugin.profile.p088ui;

import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C11184p0;
import uo3.C78253a;

/* renamed from: com.tencent.mm.plugin.profile.ui.b */
public class C70249b implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ AddDescriptionUI f203001d;

    /* renamed from: com.tencent.mm.plugin.profile.ui.b$a */
    public class C70250a implements View.OnCreateContextMenuListener {
        public C70250a() {
        }

        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            contextMenu.add(C70249b.this.f203001d.getResources().getString(C0966R.string.f7944x1));
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.b$b */
    public class C70251b implements C11184p0 {
        public C70251b() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (i == 0) {
                AddDescriptionUI.m82636H7(C70249b.this.f203001d, 1);
            }
        }
    }

    public C70249b(AddDescriptionUI addDescriptionUI) {
        this.f203001d = addDescriptionUI;
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/AddDescriptionUI$11", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        C78253a aVar = new C78253a(this.f203001d.getContext(), view);
        aVar.f229249r = new C70250a();
        aVar.f229251t = new C70251b();
        aVar.mo70679m();
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/profile/ui/AddDescriptionUI$11", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
