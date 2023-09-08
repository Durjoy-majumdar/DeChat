package com.tencent.p014mm.p136ui.contact;

import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C11184p0;
import uo3.C78253a;

/* renamed from: com.tencent.mm.ui.contact.e0 */
public class C74478e0 implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ ContactRemarkInfoModUI f219002d;

    /* renamed from: com.tencent.mm.ui.contact.e0$a */
    public class C74479a implements View.OnCreateContextMenuListener {
        public C74479a() {
        }

        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            contextMenu.add(C74478e0.this.f219002d.getResources().getString(C0966R.string.f7944x1));
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.e0$b */
    public class C74480b implements C11184p0 {
        public C74480b() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (i == 0) {
                ContactRemarkInfoModUI.m88833K7(C74478e0.this.f219002d, 1);
            }
        }
    }

    public C74478e0(ContactRemarkInfoModUI contactRemarkInfoModUI) {
        this.f219002d = contactRemarkInfoModUI;
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/contact/ContactRemarkInfoModUI$16", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        C78253a aVar = new C78253a(this.f219002d.getContext(), view);
        aVar.f229249r = new C74479a();
        aVar.f229251t = new C74480b();
        aVar.mo70679m();
        C117292a.m165362h(false, this, "com/tencent/mm/ui/contact/ContactRemarkInfoModUI$16", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
