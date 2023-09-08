package com.tencent.p014mm.p136ui.contact;

import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C11184p0;
import uo3.C78253a;

/* renamed from: com.tencent.mm.ui.contact.x1 */
public class C74586x1 implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ ModRemarkNameUI f219244d;

    /* renamed from: com.tencent.mm.ui.contact.x1$a */
    public class C74587a implements View.OnCreateContextMenuListener {
        public C74587a() {
        }

        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            contextMenu.add(C74586x1.this.f219244d.getResources().getString(C0966R.string.f7944x1));
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.x1$b */
    public class C74588b implements C11184p0 {
        public C74588b() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (i == 0) {
                ModRemarkNameUI.m88896I7(C74586x1.this.f219244d, 1);
            }
        }
    }

    public C74586x1(ModRemarkNameUI modRemarkNameUI) {
        this.f219244d = modRemarkNameUI;
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/contact/ModRemarkNameUI$14", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        C78253a aVar = new C78253a(this.f219244d.getContext(), view);
        aVar.f229249r = new C74587a();
        aVar.f229251t = new C74588b();
        aVar.mo70679m();
        C117292a.m165362h(false, this, "com/tencent/mm/ui/contact/ModRemarkNameUI$14", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
