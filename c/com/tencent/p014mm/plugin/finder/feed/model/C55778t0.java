package com.tencent.p014mm.plugin.finder.feed.model;

import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import ef1.C7637b;
import fy3.C32227p;
import java.util.LinkedList;

/* renamed from: com.tencent.mm.plugin.finder.feed.model.t0 */
public interface C55778t0<Id> {
    /* renamed from: b */
    void mo77365b(long j);

    /* renamed from: i */
    C55779u0 mo77366i(Id id, int i);

    /* renamed from: j */
    void mo77367j(C32227p<? super Integer, ? super Integer, ? extends LinkedList<C0740i2>> pVar, RecyclerView recyclerView, int i);

    void onDetach();

    /* renamed from: p */
    void mo77371p(C7637b bVar, LinkedList<C0740i2> linkedList);

    /* renamed from: q */
    void mo77372q(C7637b bVar);

    /* renamed from: r */
    void mo77373r(Id id, int i);
}
