package mo1;

import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.view.TouchableLayout;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C11184p0;
import p823sg.C101614i;
import uo3.C78253a;

/* renamed from: mo1.q0 */
public final class C11042q0 implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileHeaderUIC f32790d;

    /* renamed from: mo1.q0$a */
    public static final class C11043a implements View.OnCreateContextMenuListener {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f32791d;

        public C11043a(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            this.f32791d = finderProfileHeaderUIC;
        }

        public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            contextMenu.add(0, 0, 0, this.f32791d.getContext().getString(C0966R.string.f7936wt));
        }
    }

    /* renamed from: mo1.q0$b */
    public static final class C11044b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f32792d;

        public C11044b(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            this.f32792d = finderProfileHeaderUIC;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (i == 0) {
                FinderProfileHeaderUIC finderProfileHeaderUIC = this.f32792d;
                C101614i<String, FinderProfileHeaderUIC.C3463b> iVar = FinderProfileHeaderUIC.f16192h1;
                ClipboardHelper.setText(finderProfileHeaderUIC.mo3835o3().getText());
            }
        }
    }

    public C11042q0(FinderProfileHeaderUIC finderProfileHeaderUIC) {
        this.f32790d = finderProfileHeaderUIC;
    }

    public final boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleUserDesc$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        C78253a aVar = new C78253a(this.f32790d.getContext(), view);
        FinderProfileHeaderUIC finderProfileHeaderUIC = this.f32790d;
        aVar.f229249r = new C11043a(finderProfileHeaderUIC);
        aVar.f229251t = new C11044b(finderProfileHeaderUIC);
        int i = TouchableLayout.f24959d;
        boolean n = aVar.mo71743n(TouchableLayout.f24959d, TouchableLayout.f24960e);
        C117292a.m165362h(n, this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleUserDesc$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return n;
    }
}
