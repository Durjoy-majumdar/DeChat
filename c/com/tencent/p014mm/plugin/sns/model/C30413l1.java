package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import os2.C100398c0;
import os2.C35295p;

/* renamed from: com.tencent.mm.plugin.sns.model.l1 */
public class C30413l1 implements C35295p {

    /* renamed from: a */
    public HashMap<String, C100398c0> f82026a = new HashMap<>();

    /* renamed from: a */
    public static void m39073a(C30413l1 l1Var, int i) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.model.SnsExtCache");
        l1Var.getClass();
        SnsMethodCalculate.markStartTimeMs("pushImp", "com.tencent.mm.plugin.sns.model.SnsExtCache");
        HashMap<String, C100398c0> hashMap = l1Var.f82026a;
        if (hashMap == null || hashMap.size() == 0) {
            Log.m105924i("MicroMsg.SnsExtCache", "nothing need to pushto snsext");
            SnsMethodCalculate.markEndTimeMs("pushImp", "com.tencent.mm.plugin.sns.model.SnsExtCache");
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            boolean z = false;
            long j = 0;
            if (C94866e1.Bx0() != null) {
                j = C94866e1.Bx0().beginTransaction(Thread.currentThread().getId());
                z = true;
            }
            Log.m105918d("MicroMsg.SnsExtCache", "writeNums " + i + " " + j);
            LinkedList linkedList = new LinkedList();
            for (String add : l1Var.f82026a.keySet()) {
                linkedList.add(add);
                if (linkedList.size() >= i) {
                    break;
                }
            }
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (l1Var.f82026a.containsKey(str) && !C94866e1.qy0()) {
                    C94866e1.Xx0().mo139774DN(l1Var.f82026a.get(str));
                    l1Var.f82026a.remove(str);
                }
            }
            if (z) {
                C94866e1.Bx0().endTransaction(j);
            }
            Log.m105918d("MicroMsg.SnsExtCache", "wirtes times : " + (System.currentTimeMillis() - currentTimeMillis));
            SnsMethodCalculate.markEndTimeMs("pushImp", "com.tencent.mm.plugin.sns.model.SnsExtCache");
        }
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.model.SnsExtCache");
    }
}
