package com.tencent.p014mm.p136ui.contact;

import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C11184p0;
import uo3.C78253a;

/* renamed from: com.tencent.mm.ui.contact.f0 */
public class C74486f0 implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ ContactRemarkInfoModUI f219031d;

    /* renamed from: com.tencent.mm.ui.contact.f0$a */
    public class C74487a implements View.OnCreateContextMenuListener {
        public C74487a() {
        }

        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            contextMenu.add(C74486f0.this.f219031d.getResources().getString(C0966R.string.f7944x1));
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.f0$b */
    public class C74488b implements C11184p0 {
        public C74488b() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (i == 0) {
                ContactRemarkInfoModUI.m88833K7(C74486f0.this.f219031d, 2);
            }
        }
    }

    public C74486f0(ContactRemarkInfoModUI contactRemarkInfoModUI) {
        this.f219031d = contactRemarkInfoModUI;
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/contact/ContactRemarkInfoModUI$17", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        C78253a aVar = new C78253a(this.f219031d.getContext(), view);
        aVar.f229249r = new C74487a();
        aVar.f229251t = new C74488b();
        aVar.mo70679m();
        C117292a.m165362h(false, this, "com/tencent/mm/ui/contact/ContactRemarkInfoModUI$17", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
