package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.profile.ui.s2 */
public class C5012s2 implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ SayHiWithSnsPermissionUI f20324d;

    /* renamed from: com.tencent.mm.plugin.profile.ui.s2$a */
    public class C5013a implements C11182m0 {
        public C5013a() {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.mo107140d(0, C5012s2.this.f20324d.getResources().getColor(C0966R.color.f2966ao), C5012s2.this.f20324d.getResources().getString(C0966R.string.f8052bl));
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.s2$b */
    public class C5014b implements C11184p0 {
        public C5014b() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (menuItem.getItemId() == 0) {
                SayHiWithSnsPermissionUI.m82750H7(C5012s2.this.f20324d, 3, 0);
                SayHiWithSnsPermissionUI.m82751I7(C5012s2.this.f20324d, "");
                C5012s2.this.f20324d.f202752g.setVisibility(8);
            }
        }
    }

    public C5012s2(SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI) {
        this.f20324d = sayHiWithSnsPermissionUI;
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$24", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        C77407n nVar = new C77407n((Context) this.f20324d.getContext(), 1, true);
        nVar.mo107568m(this.f20324d.getContext().getString(C0966R.string.f8177sc), 17, 0);
        nVar.f225771i = new C5013a();
        nVar.f225782p = new C5014b();
        nVar.mo107573q();
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$24", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
