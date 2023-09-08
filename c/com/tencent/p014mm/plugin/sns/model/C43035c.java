package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import java.util.LinkedList;
import java.util.Map;
import ob0.C11385n;
import ob0.C117747y;
import p011cm.C28611c;
import p011cm.C39989b;
import p239sv.C77792p;
import sj0.C90202a;
import te3.mq4;

/* renamed from: com.tencent.mm.plugin.sns.model.c */
public class C43035c {
    /* renamed from: a */
    public static C117747y m46669a(String str, C11385n nVar, int i) {
        SnsMethodCalculate.markStartTimeMs("getAddBrandScene", "com.tencent.mm.plugin.sns.model.AddBrandLogic");
        SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.model.AddBrandLogic");
        C86709a0.m107524d().mo123455a(30, nVar);
        C86709a0.m107524d().mo123455a(C90202a.CTRL_INDEX, nVar);
        SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.model.AddBrandLogic");
        if (C72996z1.m85843n5(str)) {
            C117747y yVar = (C117747y) ((C77792p) C86312j.m106911c(C77792p.class)).B90(str, "");
            SnsMethodCalculate.markEndTimeMs("getAddBrandScene", "com.tencent.mm.plugin.sns.model.AddBrandLogic");
            return yVar;
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(79);
        LinkedList linkedList2 = new LinkedList();
        linkedList2.add(str);
        C28611c Zm0 = ((C39989b) C86312j.m106911c(C39989b.class)).Zm0(1, linkedList2, linkedList, new LinkedList(), "", "", (Map<String, Integer>) null, "", (String) null);
        mq4 mq4 = new mq4();
        if (i == 182) {
            mq4.f138158d = 2;
        } else {
            mq4.f138158d = 1;
        }
        Zm0.mo56092a1(mq4);
        C117747y yVar2 = (C117747y) Zm0;
        SnsMethodCalculate.markEndTimeMs("getAddBrandScene", "com.tencent.mm.plugin.sns.model.AddBrandLogic");
        return yVar2;
    }

    /* renamed from: b */
    public static void m46670b(C11385n nVar) {
        SnsMethodCalculate.markStartTimeMs("onStop", "com.tencent.mm.plugin.sns.model.AddBrandLogic");
        C86709a0.m107524d().mo123470p(30, nVar);
        C86709a0.m107524d().mo123470p(C90202a.CTRL_INDEX, nVar);
        SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.model.AddBrandLogic");
    }
}
