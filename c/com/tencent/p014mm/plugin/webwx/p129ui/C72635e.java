package com.tencent.p014mm.plugin.webwx.p129ui;

import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import e62.C75554c;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.webwx.ui.e */
public final class C72635e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C72632c f211338d;

    /* renamed from: e */
    public final /* synthetic */ C75554c.C75555b f211339e;

    /* renamed from: com.tencent.mm.plugin.webwx.ui.e$a */
    public static final class C72636a implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ C72632c f211340d;

        public C72636a(C72632c cVar) {
            this.f211340d = cVar;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.mo107140d(0, this.f211340d.f211335z.getResources().getColor(C0966R.color.a_3), this.f211340d.f211335z.getString(C0966R.string.lhj));
        }
    }

    /* renamed from: com.tencent.mm.plugin.webwx.ui.e$b */
    public static final class C72637b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C75554c.C75555b f211341d;

        /* renamed from: e */
        public final /* synthetic */ C72632c f211342e;

        public C72637b(C75554c.C75555b bVar, C72632c cVar) {
            this.f211341d = bVar;
            this.f211342e = cVar;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C87412m.m108594g(menuItem, "menuItem");
            Log.m105924i("MicroMsg.LoginDeviceAdapter", this.f211341d.f182221n + ", close message notify");
            C72632c.m84973y(this.f211342e, this.f211341d);
        }
    }

    public C72635e(C72632c cVar, C75554c.C75555b bVar) {
        this.f211338d = cVar;
        this.f211339e = bVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder$fillContent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C72632c cVar = this.f211338d;
        if (cVar.f211333x0) {
            C77407n nVar = new C77407n(cVar.f211335z, 1, true);
            nVar.mo107568m(this.f211338d.f211335z.getString(C0966R.string.gcn), 17, C76577a.m92151b(this.f211338d.f211335z, 14));
            C72632c cVar2 = this.f211338d;
            nVar.f225771i = new C72636a(cVar2);
            nVar.f225782p = new C72637b(this.f211339e, cVar2);
            nVar.mo107573q();
        } else {
            Log.m105924i("MicroMsg.LoginDeviceAdapter", this.f211339e.f182221n + ", open message notify");
            C72632c.m84973y(this.f211338d, this.f211339e);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder$fillContent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
