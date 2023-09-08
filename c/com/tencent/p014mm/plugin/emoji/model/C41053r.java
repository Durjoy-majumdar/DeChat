package com.tencent.p014mm.plugin.emoji.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import te3.C101754a80;
import te3.C101824o80;
import te3.C52077y70;
import x51.C102562g;

/* renamed from: com.tencent.mm.plugin.emoji.model.r */
public class C41053r {

    /* renamed from: a */
    public int f110539a;

    /* renamed from: b */
    public List<C102562g> f110540b;

    /* renamed from: c */
    public C52077y70 f110541c;

    /* renamed from: d */
    public List<C52077y70> f110542d;

    /* renamed from: e */
    public List<C101754a80> f110543e;

    /* renamed from: f */
    public List<C101754a80> f110544f;

    /* renamed from: a */
    public void mo64090a() {
        List<C101754a80> list = this.f110544f;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f110544f);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                this.f110540b.add(0, new C102562g((C101754a80) arrayList.get(size)));
                this.f110539a++;
                ((LinkedList) this.f110544f).remove(arrayList.get(size));
            }
        }
    }

    /* renamed from: b */
    public void mo64091b(List<C102562g> list, int i) {
        C102562g gVar;
        C101824o80 o802;
        if (i == 1 || i == -1) {
            this.f110540b = list;
        } else if (i == 2) {
            List<C102562g> list2 = this.f110540b;
            if (list2 == null) {
                this.f110540b = new ArrayList();
            } else {
                int size = list2.size() - 1;
                if (size >= 0 && size < this.f110540b.size() && (gVar = this.f110540b.get(size)) != null && (o802 = gVar.f301983b) != null && !Util.isNullOrNil(o802.f298994d) && gVar.f301983b.f298994d.equals("17")) {
                    this.f110540b.remove(gVar);
                }
            }
            this.f110540b.addAll(list);
        } else {
            Log.m105920e("MicroMsg.emoji.EmotionListModel", "unknow status.");
        }
    }
}
