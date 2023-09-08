package com.tencent.p014mm.plugin.luckymoney.sns;

import com.tencent.p014mm.plugin.luckymoney.flux.BaseStore;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import t32.C22436b;
import x32.C22992c;
import x32.C78764a;

/* renamed from: com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareStore */
public class SnsLuckyMoneyPrepareStore extends BaseStore implements C11385n {
    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C78764a) {
            if (i == 0 && i2 == 0) {
                String str2 = ((C78764a) yVar).f230499h;
                int i3 = C22992c.f66061a;
                C22436b bVar = C22436b.f63563b;
                for (int i4 = 0; i4 < ((LinkedList) bVar.f63564a).size(); i4++) {
                    ((C22436b.C22437a) ((LinkedList) bVar.f63564a).get(i4)).mo35587a("x32.c", false, (String) null);
                }
                return;
            }
            int i5 = C22992c.f66061a;
            C22436b bVar2 = C22436b.f63563b;
            for (int i6 = 0; i6 < ((LinkedList) bVar2.f63564a).size(); i6++) {
                ((C22436b.C22437a) ((LinkedList) bVar2.f63564a).get(i6)).mo35587a("x32.c", true, str);
            }
        }
    }
}
