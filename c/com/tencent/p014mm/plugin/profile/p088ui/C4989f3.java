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

/* renamed from: com.tencent.mm.plugin.profile.ui.f3 */
public class C4989f3 implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ SayHiWithSnsPermissionUI3 f20281d;

    /* renamed from: com.tencent.mm.plugin.profile.ui.f3$a */
    public class C4990a implements C11182m0 {
        public C4990a() {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.mo107140d(0, C4989f3.this.f20281d.getResources().getColor(C0966R.color.f2966ao), C4989f3.this.f20281d.getResources().getString(C0966R.string.f8052bl));
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.f3$b */
    public class C4991b implements C11184p0 {
        public C4991b() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (menuItem.getItemId() == 0) {
                SayHiWithSnsPermissionUI3.m82799H7(C4989f3.this.f20281d, 3, 0);
                SayHiWithSnsPermissionUI3.m82800I7(C4989f3.this.f20281d, "");
                C4989f3.this.f20281d.f202933g.setVisibility(8);
            }
        }
    }

    public C4989f3(SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3) {
        this.f20281d = sayHiWithSnsPermissionUI3;
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$26", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        C77407n nVar = new C77407n((Context) this.f20281d.getContext(), 1, true);
        nVar.mo107568m(this.f20281d.getContext().getString(C0966R.string.f8177sc), 17, 0);
        nVar.f225771i = new C4990a();
        nVar.f225782p = new C4991b();
        nVar.mo107573q();
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$26", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
