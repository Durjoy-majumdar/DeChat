package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import qo3.C77389a;
import qo3.C77398g;
import te3.C77986qf3;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.o1 */
public class C71649o1 {

    /* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.o1$a */
    public class C71650a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C77986qf3 f207653d;

        /* renamed from: e */
        public final /* synthetic */ Context f207654e;

        public C71650a(C77986qf3 qf32, Context context) {
            this.f207653d = qf32;
            this.f207654e = context;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105925i("MicroMsg.LqtUtil", "click item, type: %s", Integer.valueOf(this.f207653d.f228120e));
            C77986qf3 qf32 = this.f207653d;
            int i2 = qf32.f228120e;
            if (i2 != 1) {
                if (i2 == 2) {
                    C75228t.m90219L(this.f207654e, qf32.f228121f, true);
                } else if (i2 == 3) {
                    C75228t.m90224Q(qf32.f228122g, qf32.f228123h, 0, 1061);
                }
            }
        }
    }

    /* renamed from: a */
    public static String m84126a(int i) {
        Context context = MMApplicationContext.getContext();
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : context.getString(C0966R.string.kxq) : context.getString(C0966R.string.kxp) : context.getString(C0966R.string.kxs) : context.getString(C0966R.string.kxr) : context.getString(C0966R.string.ky9);
    }

    /* renamed from: b */
    public static void m84127b(Context context, C77986qf3 qf32) {
        if (qf32 != null) {
            C77389a aVar = new C77389a();
            aVar.f225660q = qf32.f228119d;
            if (!Util.isNullOrNil(qf32.f228124i)) {
                aVar.f225664u = qf32.f228124i;
            }
            if (!Util.isNullOrNil(qf32.f228125j)) {
                aVar.f225663t = qf32.f228125j;
            }
            aVar.f225668y = false;
            aVar.f225620C = new C71650a(qf32, context);
            aVar.f225641X = true;
            C77398g gVar = new C77398g(context, C0966R.style.a66);
            gVar.mo107525e(aVar);
            gVar.show();
        }
    }
}
