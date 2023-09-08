package com.tencent.p014mm.plugin.recharge.p093ui;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import f40.C86709a0;
import java.util.List;
import jg2.C76415b;
import kg2.C76574a;
import kg2.C76575b;
import kg2.C76576f;
import wc3.C15131b;

/* renamed from: com.tencent.mm.plugin.recharge.ui.j */
public class C70465j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f203656d;

    /* renamed from: e */
    public final /* synthetic */ C70467k f203657e;

    /* renamed from: com.tencent.mm.plugin.recharge.ui.j$a */
    public class C70466a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C76574a f203658d;

        public C70466a(C76574a aVar) {
            this.f203658d = aVar;
        }

        public void run() {
            C70465j.this.f203657e.f203660a.f203527J.mo106950b(this.f203658d);
            C70465j jVar = C70465j.this;
            PhoneRechargeUI phoneRechargeUI = jVar.f203657e.f203660a;
            String str = jVar.f203656d;
            phoneRechargeUI.getClass();
            Log.m105925i("MicroMsg.PhoneRechargeUI", "do scene: %s", str);
            C86709a0.m107524d().mo123460f(new C76576f(str, 0));
        }
    }

    public C70465j(C70467k kVar, String str) {
        this.f203657e = kVar;
        this.f203656d = str;
    }

    public void run() {
        C76574a aVar;
        long currentTimeMillis = System.currentTimeMillis();
        PhoneRechargeUI phoneRechargeUI = this.f203657e.f203660a;
        String str = this.f203656d;
        int i = PhoneRechargeUI.f203517Q;
        phoneRechargeUI.getClass();
        Log.m105925i("MicroMsg.PhoneRechargeUI", "handle phone number: %s", str);
        C76574a yx02 = C76415b.yx0();
        if (yx02 == null || !str.equals(yx02.f224103a)) {
            List<String[]> list = phoneRechargeUI.f203530M;
            if (list == null || list.isEmpty()) {
                phoneRechargeUI.f203530M = C15131b.m14241e(phoneRechargeUI.getContext());
            }
            List<String[]> list2 = phoneRechargeUI.f203530M;
            if (list2 == null || list2.isEmpty()) {
                List<C76574a> xx02 = C76415b.wx0().xx0();
                if (xx02.isEmpty()) {
                    yx02 = new C76574a(str, "", 0);
                    yx02.f224107e = C76574a.f224101f;
                    Log.m105924i("MicroMsg.PhoneRechargeUI", "empty history");
                } else {
                    for (C76574a next : xx02) {
                        if (next.f224103a.equals(str)) {
                            aVar = new C76574a(str, next.f224104b, next.f224105c, 2);
                            aVar.f224107e = C76574a.f224101f;
                            Log.m105924i("MicroMsg.PhoneRechargeUI", "find in history");
                        }
                    }
                    yx02 = new C76574a(str, phoneRechargeUI.getString(C0966R.string.l6y), 0);
                    yx02.f224107e = C76574a.f224101f;
                    Log.m105924i("MicroMsg.PhoneRechargeUI", "not find in history");
                }
            } else {
                for (String[] next2 : phoneRechargeUI.f203530M) {
                    String a = C76575b.m92141a(next2[2]);
                    if (str.equals(a)) {
                        aVar = new C76574a(a, next2[1], 1);
                        aVar.f224107e = C76574a.f224101f;
                        Log.m105924i("MicroMsg.PhoneRechargeUI", "find in address number");
                    }
                }
                yx02 = new C76574a(str, "", 1);
                yx02.f224107e = C76574a.f224101f;
                Log.m105924i("MicroMsg.PhoneRechargeUI", "not in address");
            }
            yx02 = aVar;
            break;
        }
        Log.m105924i("MicroMsg.PhoneRechargeUI", "find bind mobile");
        Log.m105919d("MicroMsg.PhoneRechargeUI", "handle cost: %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        MMHandlerThread.postToMainThread(new C70466a(yx02));
    }
}
