package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import eb0.C97625j3;
import kd0.C76540g;
import kd0.C76551y;
import kd0.C76552z;
import nj3.C11184p0;
import nj3.C76879j;

/* renamed from: com.tencent.mm.ui.chatting.m4 */
public class C73757m4 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C72963f4 f216512d;

    /* renamed from: e */
    public final /* synthetic */ Context f216513e;

    public C73757m4(C72963f4 f4Var, Context context) {
        this.f216512d = f4Var;
        this.f216513e = context;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        String str = menuItem.getTitle() + "";
        if (Util.isNullOrNil(this.f216512d.mo108765s2())) {
            Log.m105920e("MicroMsg.LongClickBrandServiceHelper", "Transfer fileName erro: fileName null");
            return;
        }
        C76551y o = C76552z.m92077o(this.f216512d.mo108765s2());
        String u = C76552z.m92083u(str, this.f216512d.mo108765s2(), o == null ? 0 : o.f224061l);
        Log.m105925i("MicroMsg.LongClickBrandServiceHelper", "connector click[voice]: to[%s] filePath[%s]", str, u);
        C97625j3.m125815e().mo123460f(new C76540g(u, 1));
        C115669n.INSTANCE.mo160131h(10424, 34, 2, str);
        Context context = this.f216513e;
        C76879j.m92726T(context, context.getString(C0966R.string.a2o));
    }
}
