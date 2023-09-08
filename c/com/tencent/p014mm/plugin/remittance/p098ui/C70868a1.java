package com.tencent.p014mm.plugin.remittance.p098ui;

import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C11184p0;
import nj3.C76879j;
import uo3.C78253a;

/* renamed from: com.tencent.mm.plugin.remittance.ui.a1 */
public class C70868a1 implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ TextView f205276d;

    /* renamed from: com.tencent.mm.plugin.remittance.ui.a1$a */
    public class C70869a implements View.OnCreateContextMenuListener {
        public C70869a(C70868a1 a1Var) {
        }

        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            contextMenu.add(view.getContext().getString(C0966R.string.f7936wt));
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.a1$b */
    public class C70870b implements C11184p0 {
        public C70870b() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (i == 0) {
                ClipboardHelper.setText(C70868a1.this.f205276d.getText().toString());
                C76879j.m92729W(C70868a1.this.f205276d.getContext(), C70868a1.this.f205276d.getContext().getString(C0966R.string.f7938wv));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.a1$c */
    public class C70871c implements PopupWindow.OnDismissListener {
        public C70871c(C70868a1 a1Var) {
        }

        public void onDismiss() {
        }
    }

    public C70868a1(RemittanceDetailUI remittanceDetailUI, TextView textView) {
        this.f205276d = textView;
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI$41", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        C78253a aVar = new C78253a(this.f205276d.getContext(), this.f205276d);
        aVar.f229249r = new C70869a(this);
        aVar.f229251t = new C70870b();
        aVar.f229227C = new C70871c(this);
        aVar.mo71743n(0, 0);
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI$41", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
