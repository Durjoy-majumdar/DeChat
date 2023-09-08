package com.tencent.p014mm.plugin.lite.logic;

import com.tencent.liteapp.storage.WxaLiteAppInfo;
import com.tencent.p014mm.plugin.lite.api.C115477b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import oa1.C117731d;

/* renamed from: com.tencent.mm.plugin.lite.logic.d */
public class C115482d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C30144f f346221d;

    public C115482d(C30144f fVar) {
        this.f346221d = fVar;
    }

    public void run() {
        this.f346221d.getClass();
        if (!C117731d.m166007c().mo182444f("clicfg_liteapp_disable_update", "0", false, true).equalsIgnoreCase("1")) {
            boolean equalsIgnoreCase = C117731d.m166007c().mo182444f("clicfg_liteapp_use_batch_update", "1", false, true).equalsIgnoreCase("1");
            C115492q.m162360g().mo175465b();
            HashSet hashSet = new HashSet();
            String[] strArr = {"wxalite2ceddca8b296458a527661862c5664b2", "wxalite7b438b4916cd2a37426d5538ac2d3807", "wxalitecd3434f9a28b4db218f4730961d39d55", "wxalite1af500fa066e5b60505c414cd42cacbc"};
            for (int i = 0; i < 4; i++) {
                String str = strArr[i];
                if (!hashSet.contains(str) && C115492q.m162360g().mo175474l(str, false)) {
                    if (!equalsIgnoreCase) {
                        C115492q.m162360g().mo175466c(str, false, 3, 60000, (C115477b) null);
                    } else {
                        hashSet.add(str);
                    }
                }
            }
            List<WxaLiteAppInfo> k = C115492q.m162360g().mo175473k();
            if (k != null && !k.isEmpty()) {
                for (WxaLiteAppInfo next : k) {
                    hashSet.add(next.f339290d);
                    if (!equalsIgnoreCase) {
                        C115492q.m162360g().mo175466c(next.f339290d, false, 3, 6000, (C115477b) null);
                    } else if (hashSet.size() == 50) {
                        C115492q.m162360g().mo175467d(new ArrayList(hashSet), true, 60000, (C115477b) null);
                        hashSet.clear();
                    }
                }
            }
            if (equalsIgnoreCase) {
                C115492q.m162360g().mo175467d(new ArrayList(hashSet), true, 60000, (C115477b) null);
            }
        }
    }
}
