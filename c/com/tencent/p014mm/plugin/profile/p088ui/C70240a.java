package com.tencent.p014mm.plugin.profile.p088ui;

import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C11184p0;
import uo3.C78253a;

/* renamed from: com.tencent.mm.plugin.profile.ui.a */
public class C70240a implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ AddDescriptionUI f202983d;

    /* renamed from: com.tencent.mm.plugin.profile.ui.a$a */
    public class C70241a implements View.OnCreateContextMenuListener {
        public C70241a() {
        }

        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            contextMenu.add(C70240a.this.f202983d.getResources().getString(C0966R.string.f7944x1));
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.a$b */
    public class C70242b implements C11184p0 {
        public C70242b() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (i == 0) {
                AddDescriptionUI.m82636H7(C70240a.this.f202983d, 0);
            }
        }
    }

    public C70240a(AddDescriptionUI addDescriptionUI) {
        this.f202983d = addDescriptionUI;
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/AddDescriptionUI$10", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        C78253a aVar = new C78253a(this.f202983d.getContext(), view);
        aVar.f229249r = new C70241a();
        aVar.f229251t = new C70242b();
        aVar.mo70679m();
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/profile/ui/AddDescriptionUI$10", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
