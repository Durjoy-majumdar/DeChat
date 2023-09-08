package com.tencent.p014mm.p136ui.contact;

import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C11184p0;
import uo3.C78253a;

/* renamed from: com.tencent.mm.ui.contact.y1 */
public class C74596y1 implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ ModRemarkNameUI f219258d;

    /* renamed from: com.tencent.mm.ui.contact.y1$a */
    public class C74597a implements View.OnCreateContextMenuListener {
        public C74597a() {
        }

        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            contextMenu.add(C74596y1.this.f219258d.getResources().getString(C0966R.string.f7944x1));
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.y1$b */
    public class C74598b implements C11184p0 {
        public C74598b() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (i == 0) {
                ModRemarkNameUI.m88896I7(C74596y1.this.f219258d, 2);
            }
        }
    }

    public C74596y1(ModRemarkNameUI modRemarkNameUI) {
        this.f219258d = modRemarkNameUI;
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/contact/ModRemarkNameUI$15", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        C78253a aVar = new C78253a(this.f219258d.getContext(), view);
        aVar.f229249r = new C74597a();
        aVar.f229251t = new C74598b();
        aVar.mo70679m();
        C117292a.m165362h(false, this, "com/tencent/mm/ui/contact/ModRemarkNameUI$15", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
