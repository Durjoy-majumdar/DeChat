package com.tencent.p014mm.plugin.finder.live.view;

import al1.C27915k;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import dj1.C45393v;
import fy3.C32224a;
import gy3.C87412m;
import java.util.HashMap;
import java.util.LinkedList;
import o40.C61926c;
import rx3.C13598b0;
import te3.C49479fw0;
import te3.C49765hx0;

/* renamed from: com.tencent.mm.plugin.finder.live.view.t */
public final class C41477t implements C45393v.C45394a {

    /* renamed from: a */
    public final /* synthetic */ C56081l f111696a;

    /* renamed from: b */
    public final /* synthetic */ C32224a<C13598b0> f111697b;

    public C41477t(C56081l lVar, C32224a<C13598b0> aVar) {
        this.f111696a = lVar;
        this.f111697b = aVar;
    }

    /* renamed from: a */
    public void mo64565a(int i, int i2, String str, C49479fw0 fw02) {
        LinkedList<C49765hx0> linkedList;
        C87412m.m108594g(fw02, "resp");
        if (i == 0 && i2 == 0 && (linkedList = fw02.f133714d) != null) {
            C56081l lVar = this.f111696a;
            C32224a<C13598b0> aVar = this.f111697b;
            for (C49765hx0 hx02 : linkedList) {
                FinderContact finderContact = hx02.f134919d;
                if (finderContact != null) {
                    String str2 = finderContact.username;
                    int i3 = 0;
                    if (!(str2 == null || str2.length() == 0)) {
                        if (hx02.f134924i != null) {
                            i3 = 3;
                        } else if (C61926c.m72696u(hx02.f134923h, 4)) {
                            i3 = 1;
                        } else if (finderContact.followFlag == 1) {
                            i3 = 2;
                        }
                        HashMap<String, C27915k> hashMap = lVar.f159941z;
                        String str3 = finderContact.username;
                        if (str3 == null) {
                            str3 = "";
                        }
                        hashMap.put(str3, new C27915k(i3, hx02.f134924i));
                        if (aVar != null) {
                            aVar.invoke();
                        }
                    }
                }
            }
        }
    }
}
