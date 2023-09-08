package com.tencent.p014mm.plugin.datareport.monitor.adapter.page;

import a41.C112756b;
import com.tencent.p014mm.plugin.report.service.C115669n;
import java.util.ArrayList;
import java.util.Stack;
import k41.C117389a;

/* renamed from: com.tencent.mm.plugin.datareport.monitor.adapter.page.a */
public class C115379a {

    /* renamed from: a */
    public Stack<C112756b> f345809a = new Stack<>();

    /* renamed from: a */
    public C112756b mo175202a() {
        if (this.f345809a.size() <= 0) {
            return null;
        }
        return this.f345809a.peek();
    }

    /* renamed from: b */
    public void mo175203b(C112756b bVar) {
        if (bVar != null) {
            bVar.f337641i = this.f345809a.size();
            this.f345809a.push(bVar);
            int size = this.f345809a.size();
            if (C117389a.m165527a() && size > C117389a.f351434c) {
                C117389a.f351434c = size;
                ArrayList arrayList = new ArrayList();
                arrayList.add("3");
                arrayList.add(String.valueOf(size));
                C115669n.INSTANCE.mo160137l(24504, arrayList);
            }
        }
    }
}
