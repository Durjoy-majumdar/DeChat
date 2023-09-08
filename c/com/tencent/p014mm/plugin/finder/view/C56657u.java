package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.service.C3603n1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8794p5;
import nj3.C11184p0;
import nj3.C76912y0;
import te3.C50542nh0;
import te3.C64707sc1;
import up1.C65426w0;

/* renamed from: com.tencent.mm.plugin.finder.view.u */
public final class C56657u implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C56648s f162407d;

    /* renamed from: com.tencent.mm.plugin.finder.view.u$a */
    public static final class C56658a implements C8794p5<C64707sc1> {

        /* renamed from: d */
        public final /* synthetic */ C56648s f162408d;

        public C56658a(C56648s sVar) {
            this.f162408d = sVar;
        }

        /* renamed from: c5 */
        public void mo705c5(Object obj, C50542nh0 nh02) {
            C87412m.m108594g((C64707sc1) obj, "req");
            C87412m.m108594g(nh02, "ret");
            Context context = MMApplicationContext.getContext();
            if (nh02.f138603e == 0) {
                this.f162408d.f162383e.f154492d.mo89532o2().blacklist_flag = 1;
                Log.m105924i("Finder.MenuItemCreateListener", "comment black list succ");
                C76912y0.makeText(context, (CharSequence) context.getResources().getString(C0966R.string.e3x), 0).show();
                return;
            }
            this.f162408d.f162383e.f154492d.mo89532o2().blacklist_flag = 0;
            Log.m105924i("Finder.MenuItemCreateListener", "comment black list failed:" + nh02.f138603e);
            C76912y0.makeText(context, (CharSequence) context.getResources().getString(C0966R.string.e3y), 0).show();
        }
    }

    public C56657u(C56648s sVar) {
        this.f162407d = sVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 3) {
            C3603n1 n1Var = (C3603n1) C86312j.m106911c(C3603n1.class);
            long itemId = this.f162407d.f162383e.getItemId();
            C56648s sVar = this.f162407d;
            C65426w0 w0Var = sVar.f162383e.f154492d;
            long j = w0Var.field_feedId;
            String str = w0Var.field_objectNonceId;
            if (str == null) {
                str = "";
            }
            n1Var.vv0(itemId, j, str, true, new C56658a(sVar));
        }
    }
}
