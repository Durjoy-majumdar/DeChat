package com.tencent.p014mm.plugin.offline;

import android.graphics.Bitmap;
import b73.C28273c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.WearActionEvent;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86312j;
import id2.C76313t;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import kd2.C76555c;
import kd2.C76559f;
import p200lx.C76736w;
import p281yz.C79173v;

/* renamed from: com.tencent.mm.plugin.offline.WearOfflineLogic */
public class WearOfflineLogic implements C76313t.C76314b {

    /* renamed from: d */
    public IListener f201760d;

    public WearOfflineLogic() {
        C699431 r0 = new IListener<WearActionEvent>(C40008f.f107254d) {
            {
                this.__eventId = 1141445845;
            }

            public boolean callback(IEvent iEvent) {
                WearActionEvent wearActionEvent = (WearActionEvent) iEvent;
                if ((wearActionEvent instanceof WearActionEvent) && wearActionEvent.f107808d.f107810a == 3) {
                    WearOfflineLogic.this.getClass();
                    Class cls = C76736w.class;
                    Class cls2 = C79173v.class;
                    if (((C28273c) C86312j.m106911c(C28273c.class)).mo55895Jf().mo91349c()) {
                        wearActionEvent.f107809e.f107818e = 5;
                    } else if (((C79173v) C86312j.m106911c(cls2)).Ex0().mo91337s()) {
                        wearActionEvent.f107809e.f107818e = 2;
                    } else if (((C79173v) C86312j.m106911c(cls2)).Ex0().mo91343y()) {
                        wearActionEvent.f107809e.f107818e = 3;
                    } else if (((C79173v) C86312j.m106911c(cls2)).Ex0().mo91341w() && C76559f.m92115k()) {
                        C69952f vx02 = C69963m.wx0().vx0();
                        vx02.getClass();
                        Log.m105925i("MicroMsg.OfflineCodesMgr", "generatetKey scene %s isSnapshot %s stack: %s", 9, 0, Util.getStack().toString());
                        String a = vx02.mo96259a(9, 0, "");
                        Bitmap qj = ((C76736w) C86312j.m106911c(cls)).mo106913qj(MMApplicationContext.getContext(), a, 5, 0);
                        Bitmap qj4 = ((C76736w) C86312j.m106911c(cls)).mo106913qj(MMApplicationContext.getContext(), a, 12, 3);
                        wearActionEvent.f107809e.f107818e = 1;
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        qj.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                        wearActionEvent.f107809e.f107819f = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.reset();
                        qj4.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                        wearActionEvent.f107809e.f107820g = byteArrayOutputStream.toByteArray();
                        wearActionEvent.f107809e.f107821h = C75228t.m90263o0(a);
                        Bankcard a2 = C76555c.f224079a.mo106804a(true);
                        if (a2 != null) {
                            wearActionEvent.f107809e.f107822i = MMApplicationContext.getContext().getString(C0966R.string.lad, new Object[]{a2.field_desc});
                            Log.m105925i("MicroMsg.Wear.WearOfflineLogic", "payway %s", wearActionEvent.f107809e.f107822i);
                        } else {
                            Log.m105924i("MicroMsg.Wear.WearOfflineLogic", "get payway fail");
                        }
                    } else if (((C79173v) C86312j.m106911c(cls2)).Ex0().mo91341w() && !C76559f.m92115k()) {
                        wearActionEvent.f107809e.f107818e = 4;
                    } else if (((C79173v) C86312j.m106911c(cls2)).Ex0().mo91342x()) {
                        wearActionEvent.f107809e.f107818e = 3;
                    }
                }
                return false;
            }
        };
        this.f201760d = r0;
        r0.alive();
        C69963m.wx0().Ax0().mo106555j(this);
    }

    /* renamed from: a */
    public final void mo96257a(int i, String str) {
        WearActionEvent wearActionEvent = new WearActionEvent();
        WearActionEvent.C40182a aVar = wearActionEvent.f107808d;
        aVar.f107812c = i;
        aVar.f107810a = 4;
        aVar.f107813d = str;
        wearActionEvent.publish();
    }

    public boolean onNotify(C76313t.C76317e eVar) {
        int i = eVar.f223559a;
        if (i == 6) {
            C76313t.C76320h hVar = (C76313t.C76320h) eVar;
            List<Orders.Commodity> list = hVar.f223573e.f209542M;
            if (list == null || ((ArrayList) list).size() <= 0) {
                mo96257a(9, MMApplicationContext.getContext().getString(C0966R.string.l_x));
            } else {
                Orders.Commodity commodity = (Orders.Commodity) ((ArrayList) hVar.f223573e.f209542M).get(0);
                mo96257a(0, MMApplicationContext.getContext().getString(C0966R.string.l_z, new Object[]{C75228t.m90258m(commodity.f209601j, commodity.f209608t)}));
            }
        } else if (i == 8) {
            mo96257a(6, MMApplicationContext.getContext().getString(C0966R.string.l_x));
        } else if (i == 5) {
            mo96257a(7, Util.nullAs(((C76313t.C76319g) eVar).f223566g, ""));
        } else if (i == 4) {
            mo96257a(8, MMApplicationContext.getContext().getString(C0966R.string.l_y));
        }
        return false;
    }
}
