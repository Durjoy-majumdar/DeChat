package com.tencent.p014mm.plugin.game.model;

import com.tencent.wechat.aff.ting.TingClientProto;
import java.util.Iterator;
import java.util.LinkedList;
import pe3.C47465a;
import py1.C47589h;
import py1.C47620l2;
import uy1.C52644e;

/* renamed from: com.tencent.mm.plugin.game.model.g0 */
public class C42058g0 extends C42056f0 {

    /* renamed from: a */
    public C47620l2 f113315a;

    /* renamed from: b */
    public LinkedList<C42039b> f113316b;

    /* renamed from: c */
    public int f113317c = 0;

    /* renamed from: d */
    public int f113318d = 0;

    public C42058g0(C47465a aVar, int i, int i2) {
        int i3;
        if (aVar == null) {
            this.f113315a = new C47620l2();
            return;
        }
        this.f113315a = (C47620l2) aVar;
        this.f113317c = i;
        this.f113318d = i2;
        LinkedList<C42039b> linkedList = new LinkedList<>();
        LinkedList<C47589h> linkedList2 = this.f113315a.f127852d;
        if (linkedList2 != null) {
            int i4 = this.f113318d + 1;
            Iterator<C47589h> it = linkedList2.iterator();
            while (it.hasNext()) {
                C42039b a = C42056f0.m45762a(it.next());
                if (a != null) {
                    int i5 = this.f113317c;
                    if (i5 != 1) {
                        if (i5 == 2) {
                            a.f113254G1 = 15;
                            a.f113255H1 = 1501;
                            i3 = i4 + 1;
                            a.f113256I1 = i4;
                        }
                        linkedList.add(a);
                    } else {
                        a.f113254G1 = 16;
                        a.f113255H1 = TingClientProto.TingScene.TingScene_FinderLiteAppSinger_VALUE;
                        i3 = i4 + 1;
                        a.f113256I1 = i4;
                    }
                    i4 = i3;
                    linkedList.add(a);
                }
            }
        }
        this.f113316b = linkedList;
        C52644e.m59022c(linkedList);
    }
}
