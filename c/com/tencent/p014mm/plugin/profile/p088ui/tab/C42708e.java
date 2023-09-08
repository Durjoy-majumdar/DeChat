package com.tencent.p014mm.plugin.profile.p088ui.tab;

import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8477a0;
import j20.C117292a;
import java.util.ArrayList;
import kf2.C46723f;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.profile.ui.tab.e */
public final class C42708e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C8477a0 f115660d;

    /* renamed from: e */
    public final /* synthetic */ C42713g f115661e;

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.e$a */
    public static final class C42709a implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ C42713g f115662d;

        public C42709a(C42713g gVar) {
            this.f115662d = gVar;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            if (e0Var.mo107176v()) {
                e0Var.mo107140d(4, this.f115662d.f115679m.getResources().getColor(C0966R.color.f2966ao), this.f115662d.f115679m.getResources().getString(C0966R.string.e08));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.e$b */
    public static final class C42710b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C42713g f115663d;

        public C42710b(C42713g gVar) {
            this.f115663d = gVar;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (menuItem.getItemId() == 4) {
                C42713g gVar = this.f115663d;
                C46723f.m52020b(gVar.f115668b.f131707d.f140834d, 1703, gVar.f115670d, gVar.f115667a.getIntent());
                C42713g.m46405a(this.f115663d, false);
            }
        }
    }

    public C42708e(C8477a0 a0Var, C42713g gVar) {
        this.f115660d = a0Var;
        this.f115661e = gVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogic$initSubscribeBtnLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f115660d.f27482d = this.f115661e.f115677k.getVisibility() == 0;
        Log.m105924i("ContactBizHeaderLiveNoticeLogic", "btn clicked, cur status = " + this.f115660d.f27482d);
        if (this.f115660d.f27482d) {
            Log.m105924i("ContactBizHeaderLiveNoticeLogic", "btn clicked, try to cancel!");
            C77407n nVar = new C77407n(this.f115661e.f115679m, 1, true);
            C42713g gVar = this.f115661e;
            nVar.f225771i = new C42709a(gVar);
            nVar.f225782p = new C42710b(gVar);
            nVar.mo107573q();
        } else {
            C42713g gVar2 = this.f115661e;
            C46723f.m52020b(gVar2.f115668b.f131707d.f140834d, 1702, gVar2.f115670d, gVar2.f115667a.getIntent());
            Log.m105924i("ContactBizHeaderLiveNoticeLogic", "btn clicked, try to reserve!");
            C42713g.m46405a(this.f115661e, true);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogic$initSubscribeBtnLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
