package com.tencent.p014mm.storage;

import fy3.C32226l;
import gy3.C87413o;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import te3.C22501jg;
import te3.C64427hp3;

/* renamed from: com.tencent.mm.storage.a1 */
public final class C57592a1 extends C87413o implements C32226l<C22501jg, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ LinkedList<C64427hp3> f164911d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57592a1(LinkedList<C64427hp3> linkedList) {
        super(1);
        this.f164911d = linkedList;
    }

    public Object invoke(Object obj) {
        boolean z;
        C22501jg jgVar = (C22501jg) obj;
        LinkedList<C64427hp3> linkedList = this.f164911d;
        boolean z2 = false;
        if (!(linkedList instanceof Collection) || !linkedList.isEmpty()) {
            Iterator<T> it = linkedList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C64427hp3) it.next()).f183531e == jgVar.f64019u) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        z2 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return Boolean.valueOf(z2);
    }
}
