package com.tencent.p014mm.plugin.appbrand.p026ui;

import as0.C39634b;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import te3.C50911q40;
import te3.g65;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.s */
public class C40554s implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ AppBrandAuthorizeUI f108938d;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.s$a */
    public class C40555a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ g65 f108939d;

        public C40555a(g65 g65) {
            this.f108939d = g65;
        }

        public void run() {
            C40554s.this.f108938d.f49753V.clear();
            C40554s.this.f108938d.f49753V.addAll(this.f108939d.f133897d);
            C40554s.this.f108938d.f49761j.mo72529n("preference_key_voip_device_list", false);
            ArrayList<C50911q40> arrayList = C39634b.f106396a;
            LinkedList<C50911q40> linkedList = C40554s.this.f108938d.f49753V;
            C87412m.m108594g(linkedList, "list");
            ArrayList<C50911q40> arrayList2 = C39634b.f106396a;
            arrayList2.clear();
            arrayList2.addAll(linkedList);
            Iterator<C50911q40> it = C40554s.this.f108938d.f49753V.iterator();
            while (it.hasNext()) {
                C50911q40 next = it.next();
                Log.m105925i("MicroMsg.AppBrandAuthorizeUI", "model_id:%s, name:%s, sn:%s, status:%d", next.f140123d, next.f140125f, next.f140124e, Integer.valueOf(next.f140126g));
            }
        }
    }

    public C40554s(AppBrandAuthorizeUI appBrandAuthorizeUI) {
        this.f108938d = appBrandAuthorizeUI;
    }

    /* renamed from: a */
    public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        Log.m105925i("MicroMsg.AppBrandAuthorizeUI", "WxaGetVoipDeviceListResp errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i == 0 && i2 == 0) {
            g65 g65 = (g65) cVar.f127056b.f127083a;
            if (g65 == null) {
                Log.m105920e("MicroMsg.AppBrandAuthorizeUI", "WxaGetVoipDeviceListResp failed, response is null!");
            } else {
                Log.m105921e("MicroMsg.AppBrandAuthorizeUI", "WxaGetVoipDeviceListResp success device_list size:%d", Integer.valueOf(g65.f133897d.size()));
                LinkedList<C50911q40> linkedList = g65.f133897d;
                if (linkedList != null && linkedList.size() > 0) {
                    this.f108938d.runOnUiThread(new C40555a(g65));
                }
            }
        }
        return 0;
    }
}
