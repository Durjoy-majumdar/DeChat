package com.tencent.p014mm.p136ui.contact;

import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C11184p0;
import uo3.C78253a;

/* renamed from: com.tencent.mm.ui.contact.w1 */
public class C74580w1 implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ ModRemarkNameUI f219233d;

    /* renamed from: com.tencent.mm.ui.contact.w1$a */
    public class C74581a implements View.OnCreateContextMenuListener {
        public C74581a() {
        }

        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            contextMenu.add(C74580w1.this.f219233d.getResources().getString(C0966R.string.f7944x1));
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.w1$b */
    public class C74582b implements C11184p0 {
        public C74582b() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (i == 0) {
                ModRemarkNameUI.m88896I7(C74580w1.this.f219233d, 0);
            }
        }
    }

    public C74580w1(ModRemarkNameUI modRemarkNameUI) {
        this.f219233d = modRemarkNameUI;
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/contact/ModRemarkNameUI$13", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        C78253a aVar = new C78253a(this.f219233d.getContext(), view);
        aVar.f229249r = new C74581a();
        aVar.f229251t = new C74582b();
        aVar.mo70679m();
        C117292a.m165362h(false, this, "com/tencent/mm/ui/contact/ModRemarkNameUI$13", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
