package com.tencent.p014mm.plugin.profile.p088ui;

import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C11184p0;
import uo3.C78253a;

/* renamed from: com.tencent.mm.plugin.profile.ui.c */
public class C70255c implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ AddDescriptionUI f203008d;

    /* renamed from: com.tencent.mm.plugin.profile.ui.c$a */
    public class C70256a implements View.OnCreateContextMenuListener {
        public C70256a() {
        }

        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            contextMenu.add(C70255c.this.f203008d.getResources().getString(C0966R.string.f7944x1));
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.c$b */
    public class C70257b implements C11184p0 {
        public C70257b() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (i == 0) {
                AddDescriptionUI.m82636H7(C70255c.this.f203008d, 2);
            }
        }
    }

    public C70255c(AddDescriptionUI addDescriptionUI) {
        this.f203008d = addDescriptionUI;
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/AddDescriptionUI$12", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        C78253a aVar = new C78253a(this.f203008d.getContext(), view);
        aVar.f229249r = new C70256a();
        aVar.f229251t = new C70257b();
        aVar.mo70679m();
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/profile/ui/AddDescriptionUI$12", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
